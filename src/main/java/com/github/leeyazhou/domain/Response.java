package com.github.leeyazhou.domain;

public class Response extends DTO {

	private static final long serialVersionUID = 1L;

	private int code = 200;

	private String message = "OK";

	public boolean isSuccess() {
		return code == 200;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static Response buildSuccess() {
		Response response = new Response();
		return response;
	}

	public static Response buildFailure(int code, String message) {
		Response response = new Response();
		response.setCode(code);
		response.setMessage(message);
		return response;
	}

}