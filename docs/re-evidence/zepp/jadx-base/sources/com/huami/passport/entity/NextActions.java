package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;

/* JADX INFO: loaded from: classes12.dex */
public class NextActions {

    @SerializedName("href")
    private String href;

    @SerializedName("method")
    private String method;

    @SerializedName(Configs.Params.REL)
    private String rel;

    public String getHref() {
        return this.href;
    }

    public String getMethod() {
        return this.method;
    }

    public String getRel() {
        return this.rel;
    }

    public void setHref(String str) {
        this.href = str;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRel(String str) {
        this.rel = str;
    }
}
