package org.bouncycastle.pqc.crypto.xmss;

import defpackage.bsr;
import defpackage.cl1;
import defpackage.fsr;
import defpackage.vj1;
import defpackage.zgh;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends cl1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bsr f29520b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final BDS g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bsr f29521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f29522b = 0;
        public byte[] c = null;
        public byte[] d = null;
        public byte[] e = null;
        public byte[] f = null;
        public BDS g = null;
        public byte[] h = null;
        public bsr i = null;

        public b(bsr bsrVar) {
            this.f29521a = bsrVar;
        }

        public h j() {
            return new h(this);
        }

        public b k(BDS bds) {
            this.g = bds;
            return this;
        }

        public b l(int i) {
            this.f29522b = i;
            return this;
        }

        public b m(byte[] bArr) {
            this.e = fsr.c(bArr);
            return this;
        }

        public b n(byte[] bArr) {
            this.f = fsr.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.d = fsr.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.c = fsr.c(bArr);
            return this;
        }
    }

    public h(b bVar) {
        BDS bds;
        super(true);
        bsr bsrVar = bVar.f29521a;
        this.f29520b = bsrVar;
        if (bsrVar == null) {
            throw new NullPointerException("params == null");
        }
        int iC = bsrVar.c();
        byte[] bArr = bVar.h;
        if (bArr == null) {
            byte[] bArr2 = bVar.c;
            if (bArr2 == null) {
                this.c = new byte[iC];
            } else {
                if (bArr2.length != iC) {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                this.c = bArr2;
            }
            byte[] bArr3 = bVar.d;
            if (bArr3 == null) {
                this.d = new byte[iC];
            } else {
                if (bArr3.length != iC) {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                this.d = bArr3;
            }
            byte[] bArr4 = bVar.e;
            if (bArr4 == null) {
                this.e = new byte[iC];
            } else {
                if (bArr4.length != iC) {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                this.e = bArr4;
            }
            byte[] bArr5 = bVar.f;
            if (bArr5 == null) {
                this.f = new byte[iC];
            } else {
                if (bArr5.length != iC) {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                this.f = bArr5;
            }
            BDS bds2 = bVar.g;
            if (bds2 != null) {
                this.g = bds2;
                return;
            }
            bds = (bVar.f29522b >= (1 << bsrVar.d()) + (-2) || bArr4 == null || bArr2 == null) ? new BDS(bsrVar, bVar.f29522b) : new BDS(bsrVar, bArr4, bArr2, (d) new d.b().l(), bVar.f29522b);
        } else {
            if (bVar.i == null) {
                throw new NullPointerException("xmss == null");
            }
            int iD = bsrVar.d();
            int iA = zgh.a(bArr, 0);
            if (!fsr.l(iD, iA)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.c = fsr.g(bArr, 4, iC);
            int i = 4 + iC;
            this.d = fsr.g(bArr, i, iC);
            int i2 = i + iC;
            this.e = fsr.g(bArr, i2, iC);
            int i3 = i2 + iC;
            this.f = fsr.g(bArr, i3, iC);
            int i4 = i3 + iC;
            try {
                bds = (BDS) fsr.f(fsr.g(bArr, i4, bArr.length - i4));
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                bds = null;
            }
            bds.setXMSS(bVar.i);
            bds.validate();
            if (bds.getIndex() != iA) {
                throw new IllegalStateException("serialized BDS has wrong index");
            }
        }
        this.g = bds;
    }

    public bsr b() {
        return this.f29520b;
    }

    public byte[] c() {
        int iC = this.f29520b.c();
        byte[] bArr = new byte[iC + 4 + iC + iC + iC];
        zgh.d(this.g.getIndex(), bArr, 0);
        fsr.e(bArr, this.c, 4);
        int i = 4 + iC;
        fsr.e(bArr, this.d, i);
        int i2 = i + iC;
        fsr.e(bArr, this.e, i2);
        fsr.e(bArr, this.f, i2 + iC);
        try {
            return vj1.j(bArr, fsr.o(this.g));
        } catch (IOException e) {
            throw new RuntimeException("error serializing bds state: " + e.getMessage());
        }
    }
}
