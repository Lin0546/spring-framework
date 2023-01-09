package org.springframework.demo.service.impl;

import org.springframework.demo.service.MessageService;

/**
 * @description TODO
 * @classname MessageServiceImpl
 * @date 2023/1/9 11:31
 * @author: Ivan
 */
public class MessageServiceImpl implements MessageService {

	@Override
	public String getMessage() {
		return "hello world";
	}
}
