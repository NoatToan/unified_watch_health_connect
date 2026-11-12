package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class TagLogRequestBean extends BaseRequestBean {
    private byte[] ciphertext;
    private String mDescription;
    private int mRespCode;

    public void setRespCode(int i) {
        this.mRespCode = i;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setCiphertext(byte[] bArr) {
        this.ciphertext = (byte[]) bArr.clone();
    }

    public int getRespCode() {
        return this.mRespCode;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public byte[] getCiphertext() {
        byte[] bArr = this.ciphertext;
        return bArr == null ? new byte[0] : (byte[]) bArr.clone();
    }
}
