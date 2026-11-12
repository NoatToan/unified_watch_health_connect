package defpackage;

import java.io.IOException;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;

/* JADX INFO: loaded from: classes3.dex */
public final class yrr extends cl1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wrr f40474b;
    public final long c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final BDSStateMap h;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wrr f40475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f40476b = 0;
        public byte[] c = null;
        public byte[] d = null;
        public byte[] e = null;
        public byte[] f = null;
        public BDSStateMap g = null;
        public byte[] h = null;
        public bsr i = null;

        public b(wrr wrrVar) {
            this.f40475a = wrrVar;
        }

        public yrr j() {
            return new yrr(this);
        }

        public b k(BDSStateMap bDSStateMap) {
            this.g = bDSStateMap;
            return this;
        }

        public b l(long j) {
            this.f40476b = j;
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

    public yrr(b bVar) {
        BDSStateMap bDSStateMap;
        super(true);
        wrr wrrVar = bVar.f40475a;
        this.f40474b = wrrVar;
        if (wrrVar == null) {
            throw new NullPointerException("params == null");
        }
        int iB = wrrVar.b();
        byte[] bArr = bVar.h;
        if (bArr == null) {
            this.c = bVar.f40476b;
            byte[] bArr2 = bVar.c;
            if (bArr2 == null) {
                this.d = new byte[iB];
            } else {
                if (bArr2.length != iB) {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
                this.d = bArr2;
            }
            byte[] bArr3 = bVar.d;
            if (bArr3 == null) {
                this.e = new byte[iB];
            } else {
                if (bArr3.length != iB) {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
                this.e = bArr3;
            }
            byte[] bArr4 = bVar.e;
            if (bArr4 == null) {
                this.f = new byte[iB];
            } else {
                if (bArr4.length != iB) {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
                this.f = bArr4;
            }
            byte[] bArr5 = bVar.f;
            if (bArr5 == null) {
                this.g = new byte[iB];
            } else {
                if (bArr5.length != iB) {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
                this.g = bArr5;
            }
            bDSStateMap = bVar.g;
            if (bDSStateMap == null) {
                if (!fsr.l(wrrVar.c(), bVar.f40476b) || bArr4 == null || bArr2 == null) {
                    this.h = new BDSStateMap();
                    return;
                }
                bDSStateMap = new BDSStateMap(wrrVar, bVar.f40476b, bArr4, bArr2);
            }
        } else {
            if (bVar.i == null) {
                throw new NullPointerException("xmss == null");
            }
            int iC = wrrVar.c();
            int i = (iC + 7) / 8;
            long jA = fsr.a(bArr, 0, i);
            this.c = jA;
            if (!fsr.l(iC, jA)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.d = fsr.g(bArr, i, iB);
            int i2 = i + iB;
            this.e = fsr.g(bArr, i2, iB);
            int i3 = i2 + iB;
            this.f = fsr.g(bArr, i3, iB);
            int i4 = i3 + iB;
            this.g = fsr.g(bArr, i4, iB);
            int i5 = i4 + iB;
            try {
                bDSStateMap = (BDSStateMap) fsr.f(fsr.g(bArr, i5, bArr.length - i5));
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                bDSStateMap = null;
            }
            bDSStateMap.setXMSS(bVar.i);
        }
        this.h = bDSStateMap;
    }

    public wrr b() {
        return this.f40474b;
    }

    public byte[] c() {
        int iB = this.f40474b.b();
        int iC = (this.f40474b.c() + 7) / 8;
        byte[] bArr = new byte[iC + iB + iB + iB + iB];
        fsr.e(bArr, fsr.p(this.c, iC), 0);
        fsr.e(bArr, this.d, iC);
        int i = iC + iB;
        fsr.e(bArr, this.e, i);
        int i2 = i + iB;
        fsr.e(bArr, this.f, i2);
        fsr.e(bArr, this.g, i2 + iB);
        try {
            return vj1.j(bArr, fsr.o(this.h));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("error serializing bds state");
        }
    }
}
