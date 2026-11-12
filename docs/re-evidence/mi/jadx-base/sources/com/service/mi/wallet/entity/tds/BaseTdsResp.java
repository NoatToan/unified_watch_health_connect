package com.service.mi.wallet.entity.tds;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class BaseTdsResp {

    @SerializedName("errorDescription")
    private String msg;
    private String responseHost;

    @SerializedName("errorCode")
    private String resultCode;

    public BaseTdsResp(String str, String str2) {
        this.resultCode = str;
        this.msg = str2;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getResponseHost() {
        return this.responseHost;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setResponseHost(String str) {
        this.responseHost = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }
}
