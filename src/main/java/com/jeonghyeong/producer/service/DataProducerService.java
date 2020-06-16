package com.jeonghyeong.producer.service;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;


@Service
public class DataProducerService {






	public String produceData(JSONObject jsonObject) {



	}

	private Properties getProducerProperties() {

		Properties configs = new Properties();
        configs.put("bootstrap.servers", "");
        configs.put("acks", "all");
        configs.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        configs.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");


	}

}

/*
 * kafkaResult = producer.KafkaMsg(kafkaServerIP, kafkaKeySerializer,
 * kafkaValueSerializer, kafkaAck, kafkaMaxRequest, kafkaSendBuffer,
 * kafkaBufferMemory, s3Result, kafkaTopic)
 */