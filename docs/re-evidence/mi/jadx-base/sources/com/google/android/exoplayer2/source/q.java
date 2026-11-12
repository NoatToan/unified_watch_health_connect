package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import defpackage.okh;
import defpackage.q61;
import defpackage.r61;
import defpackage.s45;
import defpackage.snp;
import defpackage.wlq;
import defpackage.zm5;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r61 f8200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8201b;
    public final okh c;
    public a d;
    public a e;
    public a f;
    public long g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8203b;
        public boolean c;
        public q61 d;
        public a e;

        public a(long j, int i) {
            this.f8202a = j;
            this.f8203b = j + ((long) i);
        }

        public a a() {
            this.d = null;
            a aVar = this.e;
            this.e = null;
            return aVar;
        }

        public void b(q61 q61Var, a aVar) {
            this.d = q61Var;
            this.e = aVar;
            this.c = true;
        }

        public int c(long j) {
            return ((int) (j - this.f8202a)) + this.d.f31155b;
        }
    }

    public q(r61 r61Var) {
        this.f8200a = r61Var;
        int iE = r61Var.e();
        this.f8201b = iE;
        this.c = new okh(32);
        a aVar = new a(0L, iE);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    public static a d(a aVar, long j) {
        while (j >= aVar.f8203b) {
            aVar = aVar.e;
        }
        return aVar;
    }

    public static a i(a aVar, long j, ByteBuffer byteBuffer, int i) {
        a aVarD = d(aVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (aVarD.f8203b - j));
            byteBuffer.put(aVarD.d.f31154a, aVarD.c(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == aVarD.f8203b) {
                aVarD = aVarD.e;
            }
        }
        return aVarD;
    }

    public static a j(a aVar, long j, byte[] bArr, int i) {
        a aVarD = d(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (aVarD.f8203b - j));
            System.arraycopy(aVarD.d.f31154a, aVarD.c(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == aVarD.f8203b) {
                aVarD = aVarD.e;
            }
        }
        return aVarD;
    }

    public static a k(a aVar, DecoderInputBuffer decoderInputBuffer, r.b bVar, okh okhVar) {
        long j = bVar.f8209b;
        int iJ = 1;
        okhVar.L(1);
        a aVarJ = j(aVar, j, okhVar.d(), 1);
        long j2 = j + 1;
        byte b2 = okhVar.d()[0];
        boolean z = (b2 & 128) != 0;
        int i = b2 & 127;
        s45 s45Var = decoderInputBuffer.f7867b;
        byte[] bArr = s45Var.f33261a;
        if (bArr == null) {
            s45Var.f33261a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j2, s45Var.f33261a, i);
        long j3 = j2 + ((long) i);
        if (z) {
            okhVar.L(2);
            aVarJ2 = j(aVarJ2, j3, okhVar.d(), 2);
            j3 += 2;
            iJ = okhVar.J();
        }
        int i2 = iJ;
        int[] iArr = s45Var.d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = s45Var.e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            okhVar.L(i3);
            aVarJ2 = j(aVarJ2, j3, okhVar.d(), i3);
            j3 += (long) i3;
            okhVar.P(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = okhVar.J();
                iArr4[i4] = okhVar.H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f8208a - ((int) (j3 - bVar.f8209b));
        }
        snp.a aVar2 = (snp.a) wlq.j(bVar.c);
        s45Var.c(i2, iArr2, iArr4, aVar2.f33824b, s45Var.f33261a, aVar2.f33823a, aVar2.c, aVar2.d);
        long j4 = bVar.f8209b;
        int i5 = (int) (j3 - j4);
        bVar.f8209b = j4 + ((long) i5);
        bVar.f8208a -= i5;
        return aVarJ2;
    }

    public static a l(a aVar, DecoderInputBuffer decoderInputBuffer, r.b bVar, okh okhVar) {
        if (decoderInputBuffer.w()) {
            aVar = k(aVar, decoderInputBuffer, bVar, okhVar);
        }
        if (!decoderInputBuffer.l()) {
            decoderInputBuffer.s(bVar.f8208a);
            return i(aVar, bVar.f8209b, decoderInputBuffer.c, bVar.f8208a);
        }
        okhVar.L(4);
        a aVarJ = j(aVar, bVar.f8209b, okhVar.d(), 4);
        int iH = okhVar.H();
        bVar.f8209b += 4;
        bVar.f8208a -= 4;
        decoderInputBuffer.s(iH);
        a aVarI = i(aVarJ, bVar.f8209b, decoderInputBuffer.c, iH);
        bVar.f8209b += (long) iH;
        int i = bVar.f8208a - iH;
        bVar.f8208a = i;
        decoderInputBuffer.y(i);
        return i(aVarI, bVar.f8209b, decoderInputBuffer.f, bVar.f8208a);
    }

    public final void a(a aVar) {
        if (aVar.c) {
            a aVar2 = this.f;
            boolean z = aVar2.c;
            int i = (z ? 1 : 0) + (((int) (aVar2.f8202a - aVar.f8202a)) / this.f8201b);
            q61[] q61VarArr = new q61[i];
            for (int i2 = 0; i2 < i; i2++) {
                q61VarArr[i2] = aVar.d;
                aVar = aVar.a();
            }
            this.f8200a.c(q61VarArr);
        }
    }

    public void b(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.d;
            if (j < aVar.f8203b) {
                break;
            }
            this.f8200a.a(aVar.d);
            this.d = this.d.a();
        }
        if (this.e.f8202a < aVar.f8202a) {
            this.e = aVar;
        }
    }

    public void c(long j) {
        this.g = j;
        if (j != 0) {
            a aVar = this.d;
            if (j != aVar.f8202a) {
                while (this.g > aVar.f8203b) {
                    aVar = aVar.e;
                }
                a aVar2 = aVar.e;
                a(aVar2);
                a aVar3 = new a(aVar.f8203b, this.f8201b);
                aVar.e = aVar3;
                if (this.g == aVar.f8203b) {
                    aVar = aVar3;
                }
                this.f = aVar;
                if (this.e == aVar2) {
                    this.e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.d);
        a aVar4 = new a(this.g, this.f8201b);
        this.d = aVar4;
        this.e = aVar4;
        this.f = aVar4;
    }

    public long e() {
        return this.g;
    }

    public void f(DecoderInputBuffer decoderInputBuffer, r.b bVar) {
        l(this.e, decoderInputBuffer, bVar, this.c);
    }

    public final void g(int i) {
        long j = this.g + ((long) i);
        this.g = j;
        a aVar = this.f;
        if (j == aVar.f8203b) {
            this.f = aVar.e;
        }
    }

    public final int h(int i) {
        a aVar = this.f;
        if (!aVar.c) {
            aVar.b(this.f8200a.d(), new a(this.f.f8203b, this.f8201b));
        }
        return Math.min(i, (int) (this.f.f8203b - this.g));
    }

    public void m(DecoderInputBuffer decoderInputBuffer, r.b bVar) {
        this.e = l(this.e, decoderInputBuffer, bVar, this.c);
    }

    public void n() {
        a(this.d);
        a aVar = new a(0L, this.f8201b);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
        this.g = 0L;
        this.f8200a.b();
    }

    public void o() {
        this.e = this.d;
    }

    public int p(zm5 zm5Var, int i, boolean z) throws IOException {
        int iH = h(i);
        a aVar = this.f;
        int i2 = zm5Var.read(aVar.d.f31154a, aVar.c(this.g), iH);
        if (i2 != -1) {
            g(i2);
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(okh okhVar, int i) {
        while (i > 0) {
            int iH = h(i);
            a aVar = this.f;
            okhVar.j(aVar.d.f31154a, aVar.c(this.g), iH);
            i -= iH;
            g(iH);
        }
    }
}
