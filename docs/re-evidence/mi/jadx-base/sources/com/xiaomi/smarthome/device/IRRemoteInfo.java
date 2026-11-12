package com.xiaomi.smarthome.device;

/* JADX INFO: loaded from: classes10.dex */
public class IRRemoteInfo {
    public String mAction;
    public String mId;
    public String mName;
    public int mType;

    public IRRemoteInfo() {
    }

    public String toString() {
        return IRRemoteInfo.class.getSimpleName() + ":mId=" + this.mId + ",mName=" + this.mName + ",mType=" + this.mType + ",mAction=" + this.mAction;
    }

    public IRRemoteInfo(String str, String str2, int i, String str3) {
        this.mId = str;
        this.mName = str2;
        this.mType = i;
        this.mAction = str3;
    }
}
