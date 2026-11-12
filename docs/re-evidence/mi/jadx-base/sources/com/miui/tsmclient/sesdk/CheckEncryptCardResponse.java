package com.miui.tsmclient.sesdk;

/* JADX INFO: loaded from: classes6.dex */
public class CheckEncryptCardResponse {
    private boolean isEncryptCardSupported;
    private boolean isExist;
    private boolean isExistCloudCard;
    private boolean isServiceAvailable;
    private String mCloudCardCid;
    private String mErrorInfo;

    public String getCloudCardCid() {
        return this.mCloudCardCid;
    }

    public String getErrorInfo() {
        return this.mErrorInfo;
    }

    public boolean isEncryptCardSupported() {
        return this.isEncryptCardSupported;
    }

    public boolean isExist() {
        return this.isExist;
    }

    public boolean isExistCloudCard() {
        return this.isExistCloudCard;
    }

    public boolean isServiceAvailable() {
        return this.isServiceAvailable;
    }

    public void setCloudCardCid(String str) {
        this.mCloudCardCid = str;
    }

    public void setEncryptCardSupported(boolean z) {
        this.isEncryptCardSupported = z;
    }

    public void setErrorInfo(String str) {
        this.mErrorInfo = str;
    }

    public void setExist(boolean z) {
        this.isExist = z;
    }

    public void setExistCloudCard(boolean z) {
        this.isExistCloudCard = z;
    }

    public void setServiceAvailable(boolean z) {
        this.isServiceAvailable = z;
    }
}
