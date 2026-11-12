package com.huami.account.service.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class SubArea implements Serializable {
    private String a;
    private String b;
    private String c;

    public SubArea(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public String getKey() {
        return this.a;
    }

    public String getName() {
        return this.c;
    }

    public String getValue() {
        return this.b;
    }

    public String toString() {
        return "UsState: key=" + this.a + ";value=" + this.b + ";name=" + this.c + ";";
    }
}
