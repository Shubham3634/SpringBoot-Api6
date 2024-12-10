package com.Tka.Api7.SpringBoot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tka")
public class Controller {

	Country ct = new Country(101, "Dubai");

	@PutMapping("/xyz")
	public ResponseEntity<String> updateCountry(@RequestBody Country ctr) {

		System.out.println("Input data:");
		System.out.println("Cid:" + ctr.getCid());
		System.out.println("Country Name:" + ctr.getCname());

		if (ctr.getCid() == ct.getCid()) {
			ct.setCname(ctr.getCname());
			System.out.println("Updated data");
			System.out.println("CID:" + ct.getCid());
			System.out.println("Country name:" + ct.getCname());

		} else {
			return new ResponseEntity<>("Country id not found", HttpStatus.NOT_FOUND);

		}

		return new ResponseEntity<>("Country Updated Succesfully", HttpStatus.OK);
	}

}
