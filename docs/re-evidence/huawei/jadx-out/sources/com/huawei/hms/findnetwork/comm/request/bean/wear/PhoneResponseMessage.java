package com.huawei.hms.findnetwork.comm.request.bean.wear;

/* JADX INFO: loaded from: classes33.dex */
public class PhoneResponseMessage implements WearResponse {
    private String fid;
    private String message;
    private String phonePubKey;

    public void setPhonePubKey(String str) {
        this.phonePubKey = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setFid(String str) {
        this.fid = str;
    }

    public String getPhonePubKey() {
        return this.phonePubKey;
    }

    public String getMessage() {
        return this.message;
    }

    public String getFid() {
        return this.fid;
    }
}
