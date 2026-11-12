package com.alipay.android.phone.mrpc.core;

/* JADX INFO: loaded from: classes4.dex */
public class p extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2007c;
    private String d;
    private long e;
    private long f;
    private String g;
    private HttpUrlHeader h;

    public void b(long j) {
        this.f = j;
    }

    public void a(String str) {
        this.g = str;
    }

    public void a(long j) {
        this.e = j;
    }

    public HttpUrlHeader a() {
        return this.h;
    }

    public p(HttpUrlHeader httpUrlHeader, int i, String str, byte[] bArr) {
        this.h = httpUrlHeader;
        this.f2007c = i;
        this.d = str;
        this.f2014a = bArr;
    }
}
