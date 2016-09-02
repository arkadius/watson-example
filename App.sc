#!/usr/local/bin/amm

import $ivy.`com.ibm.watson.developer_cloud:java-sdk:3.3.0`
import $file.ApiKey
import ApiKey._

import com.ibm.watson.developer_cloud.alchemy.v1._
import com.ibm.watson.developer_cloud.alchemy.v1.model._
import collection.convert.wrapAsJava._

val service = new AlchemyLanguage()
service.setApiKey(apiKey)
val params = Map[String, AnyRef](
  AlchemyLanguage.TEXT -> "Janusz Korwin-Mikke massacred the lefty"
)

val sentiment = service.getSentiment(params).execute()
println("Sentiment: " + sentiment)
val entities = service.getEntities(params).execute()
println("Entities: " + entities)
val relations = service.getTypedRelations(params).execute()
println("Relations: " + relations)
