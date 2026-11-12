package com.service.mi.common.apdu;

/* JADX INFO: loaded from: classes6.dex */
public class Rapdu {
    private String index;
    private String rapdu;
    private String sw;

    public Rapdu(String str, String str2, String str3) {
        this.index = str;
        this.rapdu = str2;
        this.sw = str3;
    }

    public String getIndex() {
        return this.index;
    }

    public String getRapdu() {
        return this.rapdu;
    }

    public String getSw() {
        return this.sw;
    }

    public void setIndex(String str) {
        this.index = str;
    }

    public void setRapdu(String str) {
        this.rapdu = str;
    }

    public void setSw(String str) {
        this.sw = str;
    }

    public Rapdu() {
    }
}
