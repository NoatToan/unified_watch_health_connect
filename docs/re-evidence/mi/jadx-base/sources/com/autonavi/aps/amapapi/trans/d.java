package com.autonavi.aps.amapapi.trans;

import android.content.Context;
import android.text.TextUtils;
import defpackage.o0t;
import defpackage.t4t;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends t4t {
    Map<String, String> h;
    String i;
    String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    byte[] f6893k;
    byte[] l;
    boolean m;
    String n;
    Map<String, String> o;
    boolean p;
    private String q;

    public d(Context context, o0t o0tVar) {
        super(context, o0tVar);
        this.h = null;
        this.q = "";
        this.i = "";
        this.j = "";
        this.f6893k = null;
        this.l = null;
        this.m = false;
        this.n = null;
        this.o = null;
        this.p = false;
    }

    public final void a(Map<String, String> map) {
        this.o = map;
    }

    public final void b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            if (bArr != null) {
                try {
                    byteArrayOutputStream2.write(t4t.a(bArr));
                    byteArrayOutputStream2.write(bArr);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        th.printStackTrace();
                        if (byteArrayOutputStream != null) {
                            try {
                                return;
                            } catch (IOException e) {
                                return;
                            }
                        }
                        return;
                    } finally {
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                }
            }
            this.l = byteArrayOutputStream2.toByteArray();
            try {
                byteArrayOutputStream2.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void c(byte[] bArr) {
        this.f6893k = bArr;
    }

    @Override // defpackage.t4t
    public final byte[] d() {
        return this.l;
    }

    @Override // defpackage.t4t
    public final boolean f() {
        return this.m;
    }

    @Override // defpackage.t4t
    public final String g() {
        return this.n;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPDNSName() {
        return this.q;
    }

    @Override // defpackage.l0t, com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return this.j;
    }

    @Override // defpackage.t4t, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return this.o;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        return this.h;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getSDKName() {
        return "loc";
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return this.i;
    }

    @Override // defpackage.t4t
    public final boolean h() {
        return this.p;
    }

    public final void a(String str) {
        this.n = str;
    }

    public final void c(String str) {
        this.j = str;
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            this.q = "";
        } else {
            this.q = str;
        }
    }

    public final void a(boolean z) {
        this.m = z;
    }

    @Override // defpackage.t4t
    public final byte[] c() {
        return this.f6893k;
    }

    public final void b(String str) {
        this.i = str;
    }

    public final void b(Map<String, String> map) {
        this.h = map;
    }

    public final void b(boolean z) {
        this.p = z;
    }
}
