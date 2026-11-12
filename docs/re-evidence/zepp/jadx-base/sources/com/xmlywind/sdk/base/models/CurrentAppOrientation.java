package com.xmlywind.sdk.base.models;

/* JADX INFO: loaded from: classes22.dex */
public class CurrentAppOrientation {
    private final String a;
    private final boolean b;

    public CurrentAppOrientation(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public String toString() {
        return "\"appOrientation\"={\"orientation\"=\"" + this.a + "\", \"locked\"=" + this.b + '}';
    }
}
