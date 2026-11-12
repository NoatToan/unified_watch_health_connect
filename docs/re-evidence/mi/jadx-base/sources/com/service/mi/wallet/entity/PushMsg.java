package com.service.mi.wallet.entity;

/* JADX INFO: loaded from: classes6.dex */
public class PushMsg {
    private int msgType;
    private String reasonCode;
    private String tdsRegistrationUrl;
    private String tdsUrl;
    private int tokenStatus;
    private String tokenUniqueReference;

    public int getMsgType() {
        return this.msgType;
    }

    public String getReasonCode() {
        return this.reasonCode;
    }

    public String getTdsRegistrationUrl() {
        return this.tdsRegistrationUrl;
    }

    public String getTdsUrl() {
        return this.tdsUrl;
    }

    public int getTokenStatus() {
        return this.tokenStatus;
    }

    public String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setReasonCode(String str) {
        this.reasonCode = str;
    }

    public void setTdsRegistrationUrl(String str) {
        this.tdsRegistrationUrl = str;
    }

    public void setTdsUrl(String str) {
        this.tdsUrl = str;
    }

    public void setTokenStatus(int i) {
        this.tokenStatus = i;
    }

    public void setTokenUniqueReference(String str) {
        this.tokenUniqueReference = str;
    }
}
