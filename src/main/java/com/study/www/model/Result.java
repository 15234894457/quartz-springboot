package com.study.www.model;

import lombok.Data;

/**
 * @Description: : 返回对象
 * @date :Create in  2018/2/24- 17:25
 * @Version: V1.0
 * @Modified By:
 **/
@Data
public class Result {
    /**
     *结果 true:false
     */
    private boolean result;
    /**
     * 信息
     */
    private String msg;
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}



}
