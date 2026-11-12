package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class LongPubHashKey {
    private int pj;
    private String pubKeyHash;

    public void setPubKeyHash(String str) {
        this.pubKeyHash = str;
    }

    public void setPj(int i) {
        this.pj = i;
    }

    public String getPubKeyHash() {
        return this.pubKeyHash;
    }

    public int getPj() {
        return this.pj;
    }

    public LongPubHashKey(String str, int i) {
        this.pubKeyHash = str;
        this.pj = i;
    }
}
