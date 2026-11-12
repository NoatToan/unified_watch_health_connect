package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class Message implements Serializable {

    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String errorMsg;

    public int getCode() {
        return this.code;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }
}
