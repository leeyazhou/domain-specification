package com.github.leeyazhou.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * 操作消息提醒
 * 
 * @author bytesgo
 */
public class Result extends Response {
	private static final long serialVersionUID = 1L;
	private Object data;

	/**
	 * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
	 */
	public Result() {
		this(0, null);
	}

	public Result(Object data) {
		this(0, null, data);
	}

	/**
	 * 初始化一个新创建的 AjaxResult 对象
	 * 
	 * @param code 状态码
	 * @param msg  返回内容
	 */
	public Result(int code, String msg) {
		this(code, msg, null);
	}

	/**
	 * 初始化一个新创建的 AjaxResult 对象
	 * 
	 * @param code 状态码
	 * @param msg  返回内容
	 * @param data 数据对象
	 */
	public Result(int code, String msg, Object data) {
		setCode(code);
		if (msg == null || msg.length() == 0) {
			msg = "操作成功";
		}
		setMessage(msg);
		setData(data);
	}

	public Result setData(Object data) {
		this.data = data;
		return this;
	}

	public Object getData() {
		return data;
	}

	@SuppressWarnings("unchecked")
	public Object add(String key, Object value) {
		if (this.data == null) {
			this.data = new HashMap<String, Object>();
		}
		return ((Map<String, Object>) data).put(key, value);
	}

	/**
	 * 返回成功消息
	 * 
	 * @return 成功消息
	 */
	public static Result success() {
		return new Result();
	}

	/**
	 * 返回成功数据
	 * 
	 * @return 成功消息
	 */
	public static Result success(Object data) {
		return new Result().setData(data);
	}

	/**
	 * 返回成功消息
	 * 
	 * @param msg 返回内容
	 * @return 成功消息
	 */
	public static Result success(String msg) {
		Result ret = new Result();
		ret.setMessage(msg);
		return ret;
	}

	/**
	 * 返回成功消息
	 * 
	 * @param msg  返回内容
	 * @param data 数据对象
	 * @return 成功消息
	 */
	public static Result success(String msg, Object data) {
		Result result = new Result();
		result.setMessage(msg);
		result.setData(data);
		return result;
	}

	/**
	 * 返回错误消息
	 * 
	 * @return
	 */
	public static Result error() {
		Result result = new Result();
		result.setCode(500);
		result.setMessage("操作失败");
		return result;
	}

	/**
	 * 返回错误消息
	 * 
	 * @param msg 返回内容
	 * @return 警告消息
	 */
	public static Result error(String msg) {
		Result result = error();
		result.setMessage(msg);
		return result;
	}

	/**
	 * 返回错误消息
	 * 
	 * @param msg  返回内容
	 * @param data 数据对象
	 * @return 警告消息
	 */
	public static Result error(String msg, Object data) {
		Result result = error();
		result.setMessage(msg);
		result.setData(data);
		return result;
	}

	/**
	 * 返回错误消息
	 * 
	 * @param code 状态码
	 * @param msg  返回内容
	 * @return 警告消息
	 */
	public static Result error(int code, String msg) {
		Result result = new Result();
		result.setCode(code);
		result.setMessage(msg);
		return result;
	}
}
