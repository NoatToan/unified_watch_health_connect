package com.xmlywind.windad;

/* JADX INFO: loaded from: classes22.dex */
public class WindAdOptions {
    private String a;
    private String b;
    private boolean c;

    public WindAdOptions(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public String getAppId() {
        return this.a;
    }

    public String getAppKey() {
        return this.b;
    }

    public boolean getUseMediation() {
        return this.c;
    }
}
