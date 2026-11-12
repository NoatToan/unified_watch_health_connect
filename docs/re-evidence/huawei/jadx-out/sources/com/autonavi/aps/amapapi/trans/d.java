package com.autonavi.aps.amapapi.trans;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.ix;
import com.amap.api.col.p0003sl.ku;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ku {
    Map<String, String> h;
    String i;
    String j;
    byte[] k;
    byte[] l;
    boolean m;
    String n;
    Map<String, String> o;
    boolean p;
    private String q;

    public final void b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            if (bArr != null) {
                try {
                    byteArrayOutputStream.write(a(bArr));
                    byteArrayOutputStream.write(bArr);
                } catch (Throwable th) {
                    th = th;
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
            this.l = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = null;
        }
    }

    @Override // com.amap.api.col.p0003sl.ku, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        return this.o;
    }

    public final void a(Map<String, String> map) {
        this.o = map;
    }

    public final void a(String str) {
        this.n = str;
    }

    @Override // com.amap.api.col.p0003sl.ku
    public final boolean f() {
        return this.m;
    }

    public final void a(boolean z) {
        this.m = z;
    }

    public final void c(byte[] bArr) {
        this.k = bArr;
    }

    public final void b(String str) {
        this.i = str;
    }

    public final void c(String str) {
        this.j = str;
    }

    public final void b(Map<String, String> map) {
        this.h = map;
    }

    public d(Context context, ix ixVar) {
        super(context, ixVar);
        this.h = null;
        this.q = "";
        this.i = "";
        this.j = "";
        this.k = null;
        this.l = null;
        this.m = false;
        this.n = null;
        this.o = null;
        this.p = false;
    }

    @Override // com.amap.api.col.p0003sl.ku
    public final byte[] c() {
        return this.k;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final Map<String, String> getRequestHead() {
        return this.h;
    }

    @Override // com.amap.api.col.p0003sl.ku
    public final byte[] d() {
        return this.l;
    }

    @Override // com.amap.api.col.p0003sl.ku
    public final String g() {
        return this.n;
    }

    public final void b(boolean z) {
        this.p = z;
    }

    @Override // com.amap.api.col.p0003sl.ku
    public final boolean h() {
        return this.p;
    }

    public final void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.q = str;
        } else {
            this.q = "";
        }
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPDNSName() {
        return this.q;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return this.i;
    }

    @Override // com.amap.api.col.p0003sl.is, com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return this.j;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getSDKName() {
        return "loc";
    }
}
