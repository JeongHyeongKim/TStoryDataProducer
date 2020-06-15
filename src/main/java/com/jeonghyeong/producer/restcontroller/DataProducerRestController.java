package com.jeonghyeong.producer.restcontroller;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jeonghyeong.producer.service.DataProducerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DataProducerRestController {



	@Autowired
	DataProducerService dataProducer;



	/*
	 * method : GET
	 * parameter : Click Log created by TStroy
	 * purpose : insert data to kafka broker.
	 * return : http status code
	 */
	@RequestMapping(path="/data", method=RequestMethod.GET )
	public ResponseEntity<String> getData(@RequestBody HashMap<String, JSONObject> map){

		JSONObject object = map.get("data");

		dataProducer.produceData(object);



		return new ResponseEntity<String>("asdf", HttpStatus.OK);

	}




	/*
	 * method : GET
	 * parameter : none
	 * return : server metadata and kafka information
	 * purpose : to get service is available
	 */
	@RequestMapping(path="/status", method=RequestMethod.GET)
	public ResponseEntity<String> checkStatus(){



		return null;

	}

}
