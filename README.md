# KG_Surport_System
This is a knowledge graph based publications search and recommendation system
## 6-4：添加了工作进度

## 6-10：考虑基于安卓开发此程序

## 6-25: 基本的查询和推荐功能已经实现；我在这里开放部分sparql语句。此代码仓库已经包括了构建基于DBpedia的安卓客户端的必要的组件，但是我将继续开发这款软件，同时目前不准备开源，还请老师谅解。（但是需要实现的功能代码我会发布在仓库中）
# 具体的软件目前可以实现的功能可以查看连接中的视频（我会在今天下午晚点放出）

## 以下为查询语句

词条语句查询了label为 Titanic 的实体
PREFIX dbo: <http://dbpedia.org/ontology/>
PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX dct: <http://purl.org/dc/terms/>
PREFIX foaf: <http://xmlns.com/foaf/0.1/>
SELECT DISTINCT ?dbp ?type ?title ?d_abstract ?define
WHERE {
?dbp rdf:type ?type;
foaf:name ?name;
dbo:abstract ?d_abstract;
rdfs:label ?title.
FILTER regex(?title ,"Titanic")
FILTER (?type=dbo:Film || ?type=dbo:MusicalWork||?type=dbo:Agent)
OPTIONAL{FILTER(lang(?name)='zh')}
OPTIONAL{?dbp <http://purl.org/linguistics/gold/hypernym> ?define}.
FILTER (lang(?d_abstract) = 'zh'&&lang(?title)='zh').
} LIMIT 30


## 以下为推荐语句


