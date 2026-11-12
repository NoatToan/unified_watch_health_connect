package com.huawei.watchface.mvp.model.datatype;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFaceSignatureBean {
    private Object result;

    @SerializedName("resultcode")
    private String resultCode;

    @SerializedName("resultinfo")
    private String resultInfo;

    public Object getResult() {
        return this.result;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public String getResultInfo() {
        return this.resultInfo;
    }

    public void setResult(Object obj) {
        this.result = obj;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setResultInfo(String str) {
        this.resultInfo = str;
    }
}
