package com.alipay.security.mobile.module.http.model;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5941k = "";

    public int a() {
        if (this.f5939a) {
            return com.alipay.security.mobile.module.a.a.d(this.c) ? 2 : 1;
        }
        return "APPKEY_ERROR".equals(this.f5940b) ? 3 : 2;
    }

    public boolean b() {
        return "1".equals(this.e);
    }

    public String c() {
        String str = this.f;
        return str == null ? "0" : str;
    }
}
