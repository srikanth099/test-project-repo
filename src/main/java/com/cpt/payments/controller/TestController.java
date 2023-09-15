package com.cpt.payments.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cpt.payments.pojo.AddRequest;
import com.cpt.payments.pojo.AddResponce;

@RestController
@RequestMapping("/controller")
public class TestController {

	@GetMapping("/hai")
	public String sayHello() {
		return "Hello Developer";
	}

	@GetMapping("/addGet")
	public int addGet(@RequestParam(value = "num1") int val1, @RequestParam(value = "num2") int val2) {
		System.out.println("Calling addGet val1:" + val1 + "val2:" + val2);
		int res = val1 + val2;
		System.out.println("Add res:" + res);
		return res;
	}

	@PostMapping("/addPost")
	public int addPost(@RequestParam(value = "num1") int val1, @RequestParam(value = "num2") int val2) {
		System.out.println("calling Post add Method val1:" + val1 + "val2:" + val2);
		int result = val1 + val2;
		System.out.println("Add res:" + result);
		return result;

	}

	@PostMapping("/postJSON")
	@ResponseBody
	public AddResponce postJSON(@RequestBody AddRequest request) {
		System.out.println("calling PostJSON :: request1:" + request);
		int result = request.getNum1() * request.getNum2();

		AddResponce responce = new AddResponce();
		responce.setResValue(result);
		System.out.println("Multiplication Responce:" + responce);
		return responce;
	}

	@GetMapping("/imHappy")
	public String imHappy() {
		return null;
	}

	@GetMapping("/checkVC")
	public String checkVC() {
		return "sucussfully Version Control Done";
	}

}
