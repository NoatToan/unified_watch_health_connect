package com.huawei.hms.support.api.entity.safetydetect.base;

import com.huawei.hms.core.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes34.dex */
public class BaseResp {

    @Packed
    private String errorReason;

    @Packed
    private int rtnCode;

    public String toString() {
        return "rtnCode=" + getRtnCode() + "|errorReason=" + getErrorReason();
    }

    public void setRtnCode(int i) {
        this.rtnCode = i;
    }

    public void setErrorReason(String str) {
        this.errorReason = str;
    }

    public int getRtnCode() {
        return this.rtnCode;
    }

    public String getErrorReason() {
        return this.errorReason;
    }
}
