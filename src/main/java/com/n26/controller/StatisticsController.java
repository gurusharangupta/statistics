package com.n26.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.n26.model.Transaction;

@RestController
@RequestMapping("/api")
public class StatisticsController {

	@RequestMapping(value = "/transactions", method = RequestMethod.POST)
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public @ResponseBody String onTransaction(@RequestBody Transaction transaction) {

		return null;

	}

}
