package com.xiaomi.hm.health.model.app_upgrade;

/* JADX INFO: loaded from: classes21.dex */
public class WebResponse<T> {
    private static final int RESULT_SUCCESS = 1;
    private int code;
    private String correlation_id;
    private T data;
    private String message;

    public int getCode() {
        return this.code;
    }

    public String getCorrelationId() {
        return this.correlation_id;
    }

    public T getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isSuccess() {
        return this.code == 1;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setCorrelationId(String str) {
        this.correlation_id = str;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
