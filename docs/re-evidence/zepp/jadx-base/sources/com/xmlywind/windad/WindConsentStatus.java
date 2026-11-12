package com.xmlywind.windad;

/* JADX INFO: loaded from: classes22.dex */
public enum WindConsentStatus {
    UNKNOWN("0"),
    ACCEPT("1"),
    DENIED("2");

    private String a;

    WindConsentStatus(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }
}
