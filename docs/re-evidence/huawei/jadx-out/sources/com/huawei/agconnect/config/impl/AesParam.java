package com.huawei.agconnect.config.impl;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class AesParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4935c;
    private final String d;
    private final String e;
    private final int f;
    private int g;

    public boolean h() {
        return (TextUtils.isEmpty(this.f4933a) || TextUtils.isEmpty(this.f4934b) || TextUtils.isEmpty(this.f4935c) || TextUtils.isEmpty(this.d) || this.f4933a.length() != this.f4934b.length() || this.f4934b.length() != this.f4935c.length() || this.f4935c.length() != this.g * 2 || this.f < 0 || TextUtils.isEmpty(this.e)) ? false : true;
    }

    public String g() {
        return this.d;
    }

    public int f() {
        return this.g;
    }

    public String e() {
        return this.f4935c;
    }

    public String d() {
        return this.f4934b;
    }

    public String c() {
        return this.f4933a;
    }

    public int b() {
        return this.f;
    }

    public String a() {
        return this.e;
    }

    public AesParam(String str, String str2, String str3, String str4, String str5, int i) {
        this.g = 0;
        this.f4933a = str;
        this.f4934b = str2;
        this.f4935c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        if (str != null) {
            this.g = str.length() / 2;
        }
    }
}
