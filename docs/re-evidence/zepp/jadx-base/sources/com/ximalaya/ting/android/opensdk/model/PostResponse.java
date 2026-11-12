package com.ximalaya.ting.android.opensdk.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;

/* JADX INFO: loaded from: classes22.dex */
public class PostResponse extends XimalayaResponse {

    @SerializedName(QQLogin.KEY_RESULT)
    private int code;

    @SerializedName("msg")
    private String message;

    @SerializedName("data")
    private String response;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getResponse() {
        return this.response;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setResponse(String str) {
        this.response = str;
    }

    public String toString() {
        return "PostResponse [response=" + this.response + ", message=" + this.message + ", code=" + this.code + "]";
    }
}
