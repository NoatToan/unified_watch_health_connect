package com.service.mi.wallet.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class IssuerMobileApp implements Serializable {
    private String action;
    private String extraTextValue;
    private String packageName;

    public String getAction() {
        return this.action;
    }

    public String getExtraTextValue() {
        return this.extraTextValue;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setExtraTextValue(String str) {
        this.extraTextValue = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }
}
