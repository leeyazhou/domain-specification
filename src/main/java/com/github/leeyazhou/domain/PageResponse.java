package com.github.leeyazhou.domain;

import java.util.Collection;

public class PageResponse<T> extends MultiResponse<T> {
	private static final long serialVersionUID = 1L;

	private Long total;

	public void setTotal(Long total) {
		this.total = total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public Long getTotal() {
		return total;
	}

	public static PageResponse<?> buildSuccess() {
		PageResponse<?> response = new PageResponse<>();
		return response;
	}

	public static PageResponse<?> buildFailure(int code, String message) {
		PageResponse<?> response = new PageResponse<>();
		response.setCode(code);
		response.setMessage(message);
		return response;
	}

	public static <T> MultiResponse<T> of(Collection<T> data) {
		MultiResponse<T> response = new MultiResponse<>();
		response.setData(data);
		return response;
	}
}