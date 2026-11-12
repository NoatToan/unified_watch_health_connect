package com.huami.passport.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class SingInfo implements Serializable {
    private String keyHash;
    private String pubKey;
    private String signName;
    private String signNumber;
    private String subjectDN;

    public String getKeyHash() {
        return this.keyHash;
    }

    public String getPubKey() {
        return this.pubKey;
    }

    public String getSignName() {
        return this.signName;
    }

    public String getSignNumber() {
        return this.signNumber;
    }

    public String getSubjectDN() {
        return this.subjectDN;
    }

    public void setKeyHash(String str) {
        this.keyHash = str;
    }

    public void setPubKey(String str) {
        this.pubKey = str;
    }

    public void setSignName(String str) {
        this.signName = str;
    }

    public void setSignNumber(String str) {
        this.signNumber = str;
    }

    public void setSubjectDN(String str) {
        this.subjectDN = str;
    }

    public String toString() {
        return "{signName='" + this.signName + "', pubKey='" + this.pubKey + "', signNumber='" + this.signNumber + "', subjectDN='" + this.subjectDN + "', keyHash='" + this.keyHash + "'}";
    }
}
