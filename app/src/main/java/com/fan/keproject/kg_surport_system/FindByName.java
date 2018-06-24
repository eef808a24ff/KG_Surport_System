package com.fan.keproject.kg_surport_system;

import android.util.Log;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSet;


public class FindByName {

    static ResultSet resultSet;
    QueryExecution exec;
//    static boolean flag=true;

    public ResultSet findMovie(String queryString) {
//        flag=false;
        Log.e("query", queryString);
        Query query = QueryFactory.create(queryString);
        exec = QueryExecutionFactory.sparqlService("http://dbpedia.org/sparql", query);
        ResultSet resultSet = exec.execSelect();
//        closeExec();
        return resultSet;
    }
//    public boolean isExecClosed(){
//        return flag;
//    }

//    public void closeExec(){
//        exec.close();
//        flag=true;
//        Log.e("exec","shutdown");
//    }

    public void run(final String queryString) {
        new Thread() {
            @Override
            public void run() {
                Log.e("Thread4", "new");
                resultSet = findMovie(queryString);
                finish.finishRequest();
            }
        }.start();
        Log.e("Thread3", "dead");
    }

    public static onFinishRequestListener finish;

    interface onFinishRequestListener {
        void finishRequest();
    }

    public static void setOnFinishRequestListener(onFinishRequestListener finishIt) {
        finish = finishIt;
    }

    ;
}