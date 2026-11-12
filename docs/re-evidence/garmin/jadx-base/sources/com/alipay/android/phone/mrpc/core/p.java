package com.alipay.android.phone.mrpc.core;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f28318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f28319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HttpUrlHeader f28321h;

    public p(HttpUrlHeader httpUrlHeader, int i14, String str, byte[] bArr) {
        this.f28321h = httpUrlHeader;
        this.f28316c = i14;
        this.f28317d = str;
        this.f28342a = bArr;
    }

    public final HttpUrlHeader a() {
        return this.f28321h;
    }

    public final void b(long j8) {
        this.f28319f = j8;
    }

    public final void a(long j8) {
        this.f28318e = j8;
    }

    public final void a(String str) {
        this.f28320g = str;
    }
}
