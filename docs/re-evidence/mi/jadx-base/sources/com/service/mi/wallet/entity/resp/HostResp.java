package com.service.mi.wallet.entity.resp;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class HostResp {
    private String countries;
    private String deviceModel;
    private String host;
    private String id;
    private boolean isdefault;
    private String prefix;

    public String getCountries() {
        return this.countries;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getHost() {
        return this.host;
    }

    public String getId() {
        return this.id;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public boolean isIsdefault() {
        return this.isdefault;
    }

    public void setCountries(String str) {
        this.countries = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIsdefault(boolean z) {
        this.isdefault = z;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public String toString() {
        return "HostResp{isdefault=" + this.isdefault + ", prefix='" + this.prefix + "', host='" + this.host + "', deviceModel='" + this.deviceModel + "', id='" + this.id + "', countries='" + this.countries + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
