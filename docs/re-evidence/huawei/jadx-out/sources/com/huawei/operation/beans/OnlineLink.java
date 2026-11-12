package com.huawei.operation.beans;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes41.dex */
public class OnlineLink {

    @SerializedName("countryCode")
    private String countryCode;

    @SerializedName("lang")
    private String lang;

    @SerializedName("openSystemWeb")
    private boolean openSystemWeb;

    @SerializedName("url")
    private String url;

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public boolean isOpenSystemWeb() {
        return this.openSystemWeb;
    }

    public void setOpenSystemWeb(boolean z) {
        this.openSystemWeb = z;
    }
}
