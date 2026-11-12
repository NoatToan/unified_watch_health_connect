package com.huami.account.event;

/* JADX INFO: loaded from: classes4.dex */
public class EventRegionUpdate {
    private String a;
    private String b;

    public EventRegionUpdate(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String getCountryCode() {
        return this.a;
    }

    public String getStateCode() {
        return this.b;
    }
}
