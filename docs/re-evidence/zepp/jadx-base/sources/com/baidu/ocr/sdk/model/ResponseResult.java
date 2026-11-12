package com.baidu.ocr.sdk.model;

/* JADX INFO: loaded from: classes2.dex */
public class ResponseResult {
    public static final int DIRECTION_UNSPECIFIED = -1;
    private String jsonRes;
    private long logId;

    public String getJsonRes() {
        return this.jsonRes;
    }

    public long getLogId() {
        return this.logId;
    }

    public void setJsonRes(String str) {
        this.jsonRes = str;
    }

    public void setLogId(long j) {
        this.logId = j;
    }
}
