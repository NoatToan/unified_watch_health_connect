package com.huami.reddot.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes12.dex */
public class RedDotItem {

    @SerializedName("type")
    private String a;

    @SerializedName("isUpdate")
    private int b;

    public String getType() {
        return this.a;
    }

    public int getUpdate() {
        return this.b;
    }

    public boolean isNeedUpdate() {
        return this.b == 1;
    }

    public void setType(String str) {
        this.a = str;
    }

    public void setUpdate(int i) {
        this.b = i;
    }
}
