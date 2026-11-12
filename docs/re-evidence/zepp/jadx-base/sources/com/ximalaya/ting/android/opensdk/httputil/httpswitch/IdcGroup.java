package com.ximalaya.ting.android.opensdk.httputil.httpswitch;

/* JADX INFO: loaded from: classes22.dex */
public class IdcGroup {
    public String backupDomain;
    public String domain;
    public String idcName;
    public int weight;

    public IdcGroup(String str, String str2) {
        this.domain = str;
        this.idcName = str2;
    }

    public String toString() {
        return "IdcGroup{domain='" + this.domain + "', backupDomain='" + this.backupDomain + "', weight=" + this.weight + ", idcName='" + this.idcName + "'}";
    }
}
