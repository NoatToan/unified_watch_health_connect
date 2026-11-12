package com.huawei.datatype;

import defpackage.lst;

/* JADX INFO: loaded from: classes4.dex */
public class PayOpenChannelInfo {
    private String apdu = "";
    private int channelId;

    public String getApdu() {
        return (String) lst.d(this.apdu);
    }

    public void setApdu(String str) {
        this.apdu = (String) lst.d(str);
    }

    public int getChannelId() {
        return ((Integer) lst.d(Integer.valueOf(this.channelId))).intValue();
    }

    public void setChannelId(int i) {
        this.channelId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }
}
