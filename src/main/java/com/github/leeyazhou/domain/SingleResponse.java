package com.github.leeyazhou.domain;

public class SingleResponse<T> extends Response {
	private static final long serialVersionUID = 1L;
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public static SingleResponse<?> buildSuccess() {
		SingleResponse<?> response = new SingleResponse<>();
		return response;
	}

	public static SingleResponse<?> buildFailure(int code, String message) {
		SingleResponse<?> response = new SingleResponse<>();
		response.setCode(code);
		response.setMessage(message);
		return response;
	}

	public static <T> SingleResponse<T> of(T data) {
		SingleResponse<T> response = new SingleResponse<>();
		response.setData(data);
		return response;
	}

}