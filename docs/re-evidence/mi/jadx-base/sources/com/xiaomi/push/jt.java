package com.xiaomi.push;

import defpackage.h4t;
import defpackage.l2t;
import defpackage.n2t;
import defpackage.p2t;
import defpackage.r2t;
import defpackage.t3t;
import defpackage.v3t;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class jt extends r2t {
    public static final v3t n = new v3t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14153b;
    public boolean c;
    public int d;
    public boolean e;
    public byte[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f14154k;
    public byte[] l;
    public byte[] m;

    public static class a implements jz {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f14155a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        protected boolean f416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected boolean f14156b;

        public a() {
            this(false, true);
        }

        @Override // com.xiaomi.push.jz
        public r2t a(h4t h4tVar) {
            jt jtVar = new jt(h4tVar, this.f416a, this.f14156b);
            int i = this.f14155a;
            if (i != 0) {
                jtVar.L(i);
            }
            return jtVar;
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f416a = z;
            this.f14156b = z2;
            this.f14155a = i;
        }
    }

    public jt(h4t h4tVar, boolean z, boolean z2) {
        super(h4tVar);
        this.e = false;
        this.f = new byte[1];
        this.g = new byte[2];
        this.h = new byte[4];
        this.i = new byte[8];
        this.j = new byte[1];
        this.f14154k = new byte[2];
        this.l = new byte[4];
        this.m = new byte[8];
        this.f14153b = z;
        this.c = z2;
    }

    @Override // defpackage.r2t
    public void A() {
        n((byte) 0);
    }

    @Override // defpackage.r2t
    public void B() {
    }

    @Override // defpackage.r2t
    public void C() {
    }

    @Override // defpackage.r2t
    public void D() {
    }

    @Override // defpackage.r2t
    public void E() {
    }

    @Override // defpackage.r2t
    public void F() {
    }

    @Override // defpackage.r2t
    public void G() {
    }

    @Override // defpackage.r2t
    public void H() {
    }

    public final int J(byte[] bArr, int i, int i2) throws jr {
        M(i2);
        return this.f32126a.g(bArr, i, i2);
    }

    public String K(int i) throws jr {
        try {
            M(i);
            byte[] bArr = new byte[i];
            this.f32126a.g(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new jr("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public void L(int i) {
        this.d = i;
        this.e = true;
    }

    public void M(int i) throws jr {
        if (i < 0) {
            throw new jr("Negative length: " + i);
        }
        if (this.e) {
            int i2 = this.d - i;
            this.d = i2;
            if (i2 >= 0) {
                return;
            }
            throw new jr("Message length exceeded: " + i);
        }
    }

    @Override // defpackage.r2t
    public byte a() throws jr {
        if (this.f32126a.f() < 1) {
            J(this.j, 0, 1);
            return this.j[0];
        }
        byte b2 = this.f32126a.e()[this.f32126a.a()];
        this.f32126a.c(1);
        return b2;
    }

    @Override // defpackage.r2t
    public double b() {
        return Double.longBitsToDouble(d());
    }

    @Override // defpackage.r2t
    public int c() throws jr {
        int iA;
        byte[] bArrE = this.l;
        if (this.f32126a.f() >= 4) {
            bArrE = this.f32126a.e();
            iA = this.f32126a.a();
            this.f32126a.c(4);
        } else {
            J(this.l, 0, 4);
            iA = 0;
        }
        return (bArrE[iA + 3] & 255) | ((bArrE[iA] & 255) << 24) | ((bArrE[iA + 1] & 255) << 16) | ((bArrE[iA + 2] & 255) << 8);
    }

    @Override // defpackage.r2t
    public long d() throws jr {
        int iA;
        byte[] bArrE = this.m;
        if (this.f32126a.f() >= 8) {
            bArrE = this.f32126a.e();
            iA = this.f32126a.a();
            this.f32126a.c(8);
        } else {
            J(this.m, 0, 8);
            iA = 0;
        }
        return ((long) (bArrE[iA + 7] & 255)) | (((long) (bArrE[iA] & 255)) << 56) | (((long) (bArrE[iA + 1] & 255)) << 48) | (((long) (bArrE[iA + 2] & 255)) << 40) | (((long) (bArrE[iA + 3] & 255)) << 32) | (((long) (bArrE[iA + 4] & 255)) << 24) | (((long) (bArrE[iA + 5] & 255)) << 16) | (((long) (bArrE[iA + 6] & 255)) << 8);
    }

    @Override // defpackage.r2t
    public String e() throws jr {
        int iC = c();
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

    @Override // defpackage.r2t
    public ByteBuffer f() throws jr {
        int iC = c();
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

    @Override // defpackage.r2t
    public l2t g() throws jr {
        byte bA = a();
        return new l2t("", bA, bA == 0 ? (short) 0 : l());
    }

    @Override // defpackage.r2t
    public n2t h() {
        return new n2t(a(), c());
    }

    @Override // defpackage.r2t
    public p2t i() {
        return new p2t(a(), a(), c());
    }

    @Override // defpackage.r2t
    public t3t j() {
        return new t3t(a(), c());
    }

    @Override // defpackage.r2t
    public v3t k() {
        return n;
    }

    @Override // defpackage.r2t
    public short l() throws jr {
        int iA;
        byte[] bArrE = this.f14154k;
        if (this.f32126a.f() >= 2) {
            bArrE = this.f32126a.e();
            iA = this.f32126a.a();
            this.f32126a.c(2);
        } else {
            J(this.f14154k, 0, 2);
            iA = 0;
        }
        return (short) ((bArrE[iA + 1] & 255) | ((bArrE[iA] & 255) << 8));
    }

    @Override // defpackage.r2t
    public void m() {
    }

    @Override // defpackage.r2t
    public void n(byte b2) {
        byte[] bArr = this.f;
        bArr[0] = b2;
        this.f32126a.d(bArr, 0, 1);
    }

    @Override // defpackage.r2t
    public void o(int i) {
        byte[] bArr = this.h;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.f32126a.d(bArr, 0, 4);
    }

    @Override // defpackage.r2t
    public void p(long j) {
        byte[] bArr = this.i;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.f32126a.d(bArr, 0, 8);
    }

    @Override // defpackage.r2t
    public void q(String str) throws jr {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            o(bytes.length);
            this.f32126a.d(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new jr("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // defpackage.r2t
    public void r(ByteBuffer byteBuffer) {
        int iLimit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        o(iLimit);
        this.f32126a.d(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iLimit);
    }

    @Override // defpackage.r2t
    public void s(l2t l2tVar) {
        n(l2tVar.f24589b);
        w(l2tVar.c);
    }

    @Override // defpackage.r2t
    public void t(n2t n2tVar) {
        n(n2tVar.f27495a);
        o(n2tVar.f27496b);
    }

    @Override // defpackage.r2t
    public void u(p2t p2tVar) {
        n(p2tVar.f29949a);
        n(p2tVar.f29950b);
        o(p2tVar.c);
    }

    @Override // defpackage.r2t
    public void v(v3t v3tVar) {
    }

    @Override // defpackage.r2t
    public void w(short s) {
        byte[] bArr = this.g;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.f32126a.d(bArr, 0, 2);
    }

    @Override // defpackage.r2t
    public void x(boolean z) {
        n(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.r2t
    public boolean y() {
        return a() == 1;
    }

    @Override // defpackage.r2t
    public void z() {
    }
}
