package com.huawei.hms.support.api.entity.safetydetect;

/* JADX INFO: loaded from: classes34.dex */
public class SysIntegrityRequest {
    private String alg;
    private String appId;
    private byte[] nonce;

    public void setNonce(byte[] bArr) {
        this.nonce = bArr == null ? null : (byte[]) bArr.clone();
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAlg(String str) {
        this.alg = str;
    }

    public byte[] getNonce() {
        byte[] bArr = this.nonce;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAlg() {
        return this.alg;
    }
}
