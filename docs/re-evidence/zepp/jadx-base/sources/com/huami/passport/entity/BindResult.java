package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes12.dex */
public class BindResult extends Entity {

    @SerializedName("data")
    private BindAccount data;

    public BindAccount getData() {
        return this.data;
    }

    public void setData(BindAccount bindAccount) {
        this.data = bindAccount;
    }

    public String toString() {
        return "BindResult{result=" + getResult() + " data=" + this.data + " errorCode=" + getErrorCode() + '}';
    }
}
