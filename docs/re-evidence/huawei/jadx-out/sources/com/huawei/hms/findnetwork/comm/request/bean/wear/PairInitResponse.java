package com.huawei.hms.findnetwork.comm.request.bean.wear;

/* JADX INFO: loaded from: classes33.dex */
public class PairInitResponse implements WearResponse {
    private String nonce;

    public void setNonce(String str) {
        this.nonce = str;
    }

    public String getNonce() {
        return this.nonce;
    }

    public PairInitResponse(String str) {
        this.nonce = str;
    }
}
