package com.service.mi.common.apdu;

/* JADX INFO: loaded from: classes6.dex */
public class Capdu {
    private String capdu;
    private String expSw;
    private String index;

    public Capdu(String str, String str2, String str3) {
        this.index = str;
        this.capdu = str2;
        this.expSw = str3;
    }

    public String getCapdu() {
        return this.capdu;
    }

    public String getExpSw() {
        return this.expSw;
    }

    public String getIndex() {
        return this.index;
    }

    public void setCapdu(String str) {
        this.capdu = str;
    }

    public void setExpSw(String str) {
        this.expSw = str;
    }

    public void setIndex(String str) {
        this.index = str;
    }

    public Capdu() {
    }
}
