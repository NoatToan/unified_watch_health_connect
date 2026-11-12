package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

/* JADX INFO: loaded from: classes22.dex */
public class DomainInfo {
    public String newHost;
    public String originHost;
    public String url;

    public DomainInfo(String str, String str2, String str3) {
        this.url = null;
        this.originHost = "";
        this.newHost = "";
        this.url = str;
        this.originHost = str2;
        this.newHost = str3;
    }

    public String toString() {
        return "DomainInfo{url='" + this.url + "', originHost='" + this.originHost + "', newHost='" + this.newHost + "'}";
    }
}
