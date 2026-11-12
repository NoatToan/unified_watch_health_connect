package com.huawei.hms.findnetwork.comm.request.bean.wear;

/* JADX INFO: loaded from: classes33.dex */
public class PublicKeyResponse implements WearResponse {
    private String publicKey;
    private String srcTranId;

    public void setSrcTranId(String str) {
        this.srcTranId = str;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public String getSrcTranId() {
        return this.srcTranId;
    }

    public String getPublicKey() {
        return this.publicKey;
    }
}
