package com.xiaomi.push;

import defpackage.h4t;
import defpackage.n2t;
import defpackage.p2t;
import defpackage.r2t;
import defpackage.t3t;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class kd extends jt {
    public static int o = 10000;
    public static int p = 10000;
    public static int q = 10000;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f14160r = 10485760;
    public static int s = 104857600;

    public static class a extends jt.a {
        public a() {
            super(false, true);
        }

        @Override // com.xiaomi.push.jt.a, com.xiaomi.push.jz
        public r2t a(h4t h4tVar) {
            kd kdVar = new kd(h4tVar, ((jt.a) this).f416a, this.f14156b);
            int i = ((jt.a) this).f14155a;
            if (i != 0) {
                kdVar.L(i);
            }
            return kdVar;
        }

        public a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }
    }

    public kd(h4t h4tVar, boolean z, boolean z2) {
        super(h4tVar, z, z2);
    }

    @Override // com.xiaomi.push.jt, defpackage.r2t
    public String e() throws jr {
        int iC = c();
        if (iC > f14160r) {
            throw new jy(3, "Thrift string size " + iC + " out of range!");
        }
        if (this.f32126a.f() < iC) {
            return K(iC);
        }
        try {
            String str = new String(this.f32126a.e(), this.f32126a.a(), iC, "UTF-8");
            this.f32126a.c(iC);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new jr("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.jt, defpackage.r2t
    public ByteBuffer f() throws jr {
        int iC = c();
        if (iC > s) {
            throw new jy(3, "Thrift binary size " + iC + " out of range!");
        }
        M(iC);
        if (this.f32126a.f() >= iC) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.f32126a.e(), this.f32126a.a(), iC);
            this.f32126a.c(iC);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iC];
        this.f32126a.g(bArr, 0, iC);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.xiaomi.push.jt, defpackage.r2t
    public n2t h() throws jr {
        byte bA = a();
        int iC = c();
        if (iC <= p) {
            return new n2t(bA, iC);
        }
        throw new jy(3, "Thrift list size " + iC + " out of range!");
    }

    @Override // com.xiaomi.push.jt, defpackage.r2t
    public p2t i() throws jr {
        byte bA = a();
        byte bA2 = a();
        int iC = c();
        if (iC <= o) {
            return new p2t(bA, bA2, iC);
        }
        throw new jy(3, "Thrift map size " + iC + " out of range!");
    }

    @Override // com.xiaomi.push.jt, defpackage.r2t
    public t3t j() throws jr {
        byte bA = a();
        int iC = c();
        if (iC <= q) {
            return new t3t(bA, iC);
        }
        throw new jy(3, "Thrift set size " + iC + " out of range!");
    }
}
