package com.huawei.datatype;

import defpackage.lst;

/* JADX INFO: loaded from: classes4.dex */
public class PayApduInfo {
    private String mApdu;
    private int mChannelId;
    private int mReqId;

    public int getReqid() {
        return ((Integer) lst.d(Integer.valueOf(this.mReqId))).intValue();
    }

    public void setReqid(int i) {
        this.mReqId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public String getApdu() {
        return (String) lst.d(this.mApdu);
    }

    public void setApdu(String str) {
        this.mApdu = (String) lst.d(str);
    }

    public int getChannelId() {
        return ((Integer) lst.d(Integer.valueOf(this.mChannelId))).intValue();
    }

    public void setChannelId(int i) {
        this.mChannelId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }
}
