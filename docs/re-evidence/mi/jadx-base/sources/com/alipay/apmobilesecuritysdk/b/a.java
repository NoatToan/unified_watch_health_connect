package com.alipay.apmobilesecuritysdk.b;

import com.alipay.security.mobile.module.http.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f5770b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5771a = 0;

    public static a a() {
        return f5770b;
    }

    public final int b() {
        return this.f5771a;
    }

    public final String c() {
        String strB = d.b();
        if (com.alipay.security.mobile.module.a.a.g(strB)) {
            return strB;
        }
        int i = this.f5771a;
        if (i == 1) {
            return "http://mobilegw.stable.alipay.net/mgw.htm";
        }
        if (i != 3) {
            return i != 4 ? "https://mobilegw.alipay.com/mgw.htm" : "http://mobilegw.aaa.alipay.net/mgw.htm";
        }
        return "http://mobilegw-1-64.test.alipay.net/mgw.htm";
    }

    public final void a(int i) {
        this.f5771a = i;
    }
}
