package org.bouncycastle.pqc.crypto.xmss;

import defpackage.d1e;
import defpackage.fsr;
import defpackage.g3r;
import defpackage.h3r;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3r f29514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1e f29515b;
    public byte[] c;
    public byte[] d;

    public e(g3r g3rVar) {
        if (g3rVar == null) {
            throw new NullPointerException("params == null");
        }
        this.f29514a = g3rVar;
        int iB = g3rVar.b();
        this.f29515b = new d1e(g3rVar.a(), iB);
        this.c = new byte[iB];
        this.d = new byte[iB];
    }

    public final byte[] a(byte[] bArr, int i, int i2, d dVar) {
        int iB = this.f29514a.b();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        }
        if (bArr.length != iB) {
            throw new IllegalArgumentException("startHash needs to be " + iB + "bytes");
        }
        if (dVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (dVar.d() == null) {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
        int i3 = i + i2;
        if (i3 > this.f29514a.d() - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i2 == 0) {
            return bArr;
        }
        byte[] bArrA = a(bArr, i, i2 - 1, dVar);
        d dVar2 = (d) new d.b().g(dVar.b()).h(dVar.c()).p(dVar.g()).n(dVar.e()).o(i3 - 1).f(0).l();
        byte[] bArrC = this.f29515b.c(this.d, dVar2.d());
        byte[] bArrC2 = this.f29515b.c(this.d, ((d) new d.b().g(dVar2.b()).h(dVar2.c()).p(dVar2.g()).n(dVar2.e()).o(dVar2.f()).f(1).l()).d());
        byte[] bArr2 = new byte[iB];
        for (int i4 = 0; i4 < iB; i4++) {
            bArr2[i4] = (byte) (bArrA[i4] ^ bArrC2[i4]);
        }
        return this.f29515b.a(bArrC, bArr2);
    }

    public final byte[] b(int i) {
        if (i < 0 || i >= this.f29514a.c()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return this.f29515b.c(this.c, fsr.p(i, 32));
    }

    public d1e c() {
        return this.f29515b;
    }

    public g3r d() {
        return this.f29514a;
    }

    public h3r e(d dVar) {
        if (dVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        byte[][] bArr = new byte[this.f29514a.c()][];
        for (int i = 0; i < this.f29514a.c(); i++) {
            dVar = (d) new d.b().g(dVar.b()).h(dVar.c()).p(dVar.g()).n(i).o(dVar.f()).f(dVar.a()).l();
            bArr[i] = a(b(i), 0, this.f29514a.d() - 1, dVar);
        }
        return new h3r(this.f29514a, bArr);
    }

    public byte[] f() {
        return fsr.c(this.d);
    }

    public byte[] g(byte[] bArr, d dVar) {
        return this.f29515b.c(bArr, ((d) new d.b().g(dVar.b()).h(dVar.c()).p(dVar.g()).l()).d());
    }

    public void h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("secretKeySeed == null");
        }
        if (bArr.length != this.f29514a.b()) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != this.f29514a.b()) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.c = bArr;
        this.d = bArr2;
    }
}
