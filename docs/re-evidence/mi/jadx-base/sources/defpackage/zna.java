package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public class zna implements il8 {
    public static final nl8 I = new nl8() { // from class: xna
        @Override // defpackage.nl8
        public final il8[] c() {
            return zna.m();
        }
    };
    public static final byte[] J = {-94, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final Format K = new Format.b().e0("application/x-emsg").E();
    public int A;
    public int B;
    public int C;
    public boolean D;
    public kl8 E;
    public snp[] F;
    public snp[] G;
    public boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rkp f41478b;
    public final List<Format> c;
    public final SparseArray<b> d;
    public final okh e;
    public final okh f;
    public final okh g;
    public final byte[] h;
    public final okh i;
    public final rfp j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ud8 f41479k;
    public final okh l;
    public final ArrayDeque<zl1.a> m;
    public final ArrayDeque<a> n;
    public final snp o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f41480r;
    public int s;
    public okh t;
    public long u;
    public int v;
    public long w;
    public long x;
    public long y;
    public b z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f41481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41482b;

        public a(long j, int i) {
            this.f41481a = j;
            this.f41482b = i;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final snp f41483a;
        public wnp d;
        public uw5 e;
        public int f;
        public int g;
        public int h;
        public int i;
        public boolean l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final vmp f41484b = new vmp();
        public final okh c = new okh();
        public final okh j = new okh(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final okh f41485k = new okh();

        public b(snp snpVar, wnp wnpVar, uw5 uw5Var) {
            this.f41483a = snpVar;
            this.d = wnpVar;
            this.e = uw5Var;
            j(wnpVar, uw5Var);
        }

        public int c() {
            int i;
            if (this.l) {
                i = this.f41484b.l[this.f] ? 1 : 0;
            } else {
                i = this.d.g[this.f];
            }
            return g() != null ? i | 1073741824 : i;
        }

        public long d() {
            return !this.l ? this.d.c[this.f] : this.f41484b.g[this.h];
        }

        public long e() {
            return !this.l ? this.d.f[this.f] : this.f41484b.c(this.f);
        }

        public int f() {
            return !this.l ? this.d.d[this.f] : this.f41484b.i[this.f];
        }

        public smp g() {
            if (!this.l) {
                return null;
            }
            int i = ((uw5) wlq.j(this.f41484b.f37036a)).f36206a;
            smp smpVarA = this.f41484b.o;
            if (smpVarA == null) {
                smpVarA = this.d.f38180a.a(i);
            }
            if (smpVarA == null || !smpVarA.f33794a) {
                return null;
            }
            return smpVarA;
        }

        public boolean h() {
            this.f++;
            if (!this.l) {
                return false;
            }
            int i = this.g + 1;
            this.g = i;
            int[] iArr = this.f41484b.h;
            int i2 = this.h;
            if (i != iArr[i2]) {
                return true;
            }
            this.h = i2 + 1;
            this.g = 0;
            return false;
        }

        public int i(int i, int i2) {
            okh okhVar;
            smp smpVarG = g();
            if (smpVarG == null) {
                return 0;
            }
            int length = smpVarG.d;
            if (length != 0) {
                okhVar = this.f41484b.p;
            } else {
                byte[] bArr = (byte[]) wlq.j(smpVarG.e);
                this.f41485k.N(bArr, bArr.length);
                okh okhVar2 = this.f41485k;
                length = bArr.length;
                okhVar = okhVar2;
            }
            boolean zG = this.f41484b.g(this.f);
            boolean z = zG || i2 != 0;
            this.j.d()[0] = (byte) ((z ? 128 : 0) | length);
            this.j.P(0);
            this.f41483a.a(this.j, 1, 1);
            this.f41483a.a(okhVar, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zG) {
                this.c.L(8);
                byte[] bArrD = this.c.d();
                bArrD[0] = 0;
                bArrD[1] = 1;
                bArrD[2] = (byte) ((i2 >> 8) & 255);
                bArrD[3] = (byte) (i2 & 255);
                bArrD[4] = (byte) ((i >> 24) & 255);
                bArrD[5] = (byte) ((i >> 16) & 255);
                bArrD[6] = (byte) ((i >> 8) & 255);
                bArrD[7] = (byte) (i & 255);
                this.f41483a.a(this.c, 8, 1);
                return length + 9;
            }
            okh okhVar3 = this.f41484b.p;
            int iJ = okhVar3.J();
            okhVar3.Q(-2);
            int i3 = (iJ * 6) + 2;
            if (i2 != 0) {
                this.c.L(i3);
                byte[] bArrD2 = this.c.d();
                okhVar3.j(bArrD2, 0, i3);
                int i4 = (((bArrD2[2] & 255) << 8) | (bArrD2[3] & 255)) + i2;
                bArrD2[2] = (byte) ((i4 >> 8) & 255);
                bArrD2[3] = (byte) (i4 & 255);
                okhVar3 = this.c;
            }
            this.f41483a.a(okhVar3, i3, 1);
            return length + 1 + i3;
        }

        public void j(wnp wnpVar, uw5 uw5Var) {
            this.d = wnpVar;
            this.e = uw5Var;
            this.f41483a.b(wnpVar.f38180a.f);
            k();
        }

        public void k() {
            this.f41484b.f();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.l = false;
        }

        public void l(long j) {
            int i = this.f;
            while (true) {
                vmp vmpVar = this.f41484b;
                if (i >= vmpVar.f || vmpVar.c(i) >= j) {
                    return;
                }
                if (this.f41484b.l[i]) {
                    this.i = i;
                }
                i++;
            }
        }

        public void m() {
            smp smpVarG = g();
            if (smpVarG == null) {
                return;
            }
            okh okhVar = this.f41484b.p;
            int i = smpVarG.d;
            if (i != 0) {
                okhVar.Q(i);
            }
            if (this.f41484b.g(this.f)) {
                okhVar.Q(okhVar.J() * 6);
            }
        }

        public void n(DrmInitData drmInitData) {
            smp smpVarA = this.d.f38180a.a(((uw5) wlq.j(this.f41484b.f37036a)).f36206a);
            this.f41483a.b(this.d.f38180a.f.a().L(drmInitData.d(smpVarA != null ? smpVarA.f33795b : null)).E());
        }
    }

    public zna() {
        this(0);
    }

    public static void A(okh okhVar, vmp vmpVar) throws ParserException {
        z(okhVar, 0, vmpVar);
    }

    public static Pair<Long, fw3> B(okh okhVar, long j) throws ParserException {
        long jI;
        long jI2;
        okhVar.P(8);
        int iC = zl1.c(okhVar.n());
        okhVar.Q(4);
        long jF = okhVar.F();
        if (iC == 0) {
            jI = okhVar.F();
            jI2 = okhVar.F();
        } else {
            jI = okhVar.I();
            jI2 = okhVar.I();
        }
        long j2 = jI;
        long j3 = j + jI2;
        long jH0 = wlq.H0(j2, FolmeCore.NANOS_TO_MS, jF);
        okhVar.Q(2);
        int iJ = okhVar.J();
        int[] iArr = new int[iJ];
        long[] jArr = new long[iJ];
        long[] jArr2 = new long[iJ];
        long[] jArr3 = new long[iJ];
        long j4 = jH0;
        int i = 0;
        long j5 = j2;
        while (i < iJ) {
            int iN = okhVar.n();
            if ((iN & Integer.MIN_VALUE) != 0) {
                throw new ParserException("Unhandled indirect reference");
            }
            long jF2 = okhVar.F();
            iArr[i] = iN & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            long j6 = j5 + jF2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i2 = iJ;
            int[] iArr2 = iArr;
            long jH1 = wlq.H0(j6, FolmeCore.NANOS_TO_MS, jF);
            jArr4[i] = jH1 - jArr5[i];
            okhVar.Q(4);
            j3 += (long) iArr2[i];
            i++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iJ = i2;
            j5 = j6;
            j4 = jH1;
        }
        return Pair.create(Long.valueOf(jH0), new fw3(iArr, jArr, jArr2, jArr3));
    }

    public static long C(okh okhVar) {
        okhVar.P(8);
        return zl1.c(okhVar.n()) == 1 ? okhVar.I() : okhVar.F();
    }

    public static b D(okh okhVar, SparseArray<b> sparseArray) {
        okhVar.P(8);
        int iB = zl1.b(okhVar.n());
        b bVarK = k(sparseArray, okhVar.n());
        if (bVarK == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jI = okhVar.I();
            vmp vmpVar = bVarK.f41484b;
            vmpVar.c = jI;
            vmpVar.d = jI;
        }
        uw5 uw5Var = bVarK.e;
        bVarK.f41484b.f37036a = new uw5((iB & 2) != 0 ? okhVar.n() - 1 : uw5Var.f36206a, (iB & 8) != 0 ? okhVar.n() : uw5Var.f36207b, (iB & 16) != 0 ? okhVar.n() : uw5Var.c, (iB & 32) != 0 ? okhVar.n() : uw5Var.d);
        return bVarK;
    }

    public static void E(zl1.a aVar, SparseArray<b> sparseArray, int i, byte[] bArr) throws ParserException {
        b bVarD = D(((zl1.b) rk1.e(aVar.g(1952868452))).f41416b, sparseArray);
        if (bVarD == null) {
            return;
        }
        vmp vmpVar = bVarD.f41484b;
        long j = vmpVar.f37039r;
        boolean z = vmpVar.s;
        bVarD.k();
        bVarD.l = true;
        zl1.b bVarG = aVar.g(1952867444);
        if (bVarG == null || (i & 2) != 0) {
            vmpVar.f37039r = j;
            vmpVar.s = z;
        } else {
            vmpVar.f37039r = C(bVarG.f41416b);
            vmpVar.s = true;
        }
        H(aVar, bVarD, i);
        smp smpVarA = bVarD.d.f38180a.a(((uw5) rk1.e(vmpVar.f37036a)).f36206a);
        zl1.b bVarG2 = aVar.g(1935763834);
        if (bVarG2 != null) {
            x((smp) rk1.e(smpVarA), bVarG2.f41416b, vmpVar);
        }
        zl1.b bVarG3 = aVar.g(1935763823);
        if (bVarG3 != null) {
            w(bVarG3.f41416b, vmpVar);
        }
        zl1.b bVarG4 = aVar.g(1936027235);
        if (bVarG4 != null) {
            A(bVarG4.f41416b, vmpVar);
        }
        y(aVar, smpVarA != null ? smpVarA.f33795b : null, vmpVar);
        int size = aVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            zl1.b bVar = aVar.c.get(i2);
            if (bVar.f41414a == 1970628964) {
                I(bVar.f41416b, vmpVar, bArr);
            }
        }
    }

    public static Pair<Integer, uw5> F(okh okhVar) {
        okhVar.P(12);
        return Pair.create(Integer.valueOf(okhVar.n()), new uw5(okhVar.n() - 1, okhVar.n(), okhVar.n(), okhVar.n()));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x012d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    public static int G(b bVar, int i, int i2, okh okhVar, int i3) throws ParserException {
        long j;
        long jH0;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        boolean[] zArr;
        boolean z;
        int i4;
        long j2;
        long j3;
        long j4;
        int i5;
        int iN;
        int iN2;
        int iN3;
        boolean z2;
        long jH1;
        boolean z3;
        b bVar2 = bVar;
        okhVar.P(8);
        int iB = zl1.b(okhVar.n());
        rkp rkpVar = bVar2.d.f38180a;
        vmp vmpVar = bVar2.f41484b;
        uw5 uw5Var = (uw5) wlq.j(vmpVar.f37036a);
        vmpVar.h[i] = okhVar.H();
        long[] jArr2 = vmpVar.g;
        long j5 = vmpVar.c;
        jArr2[i] = j5;
        if ((iB & 1) != 0) {
            jArr2[i] = j5 + ((long) okhVar.n());
        }
        boolean z4 = (iB & 4) != 0;
        int iN4 = uw5Var.d;
        if (z4) {
            iN4 = okhVar.n();
        }
        boolean z5 = (iB & 256) != 0;
        boolean z6 = (iB & 512) != 0;
        boolean z7 = (iB & 1024) != 0;
        boolean z8 = (iB & 2048) != 0;
        long[] jArr3 = rkpVar.h;
        if (jArr3 != null && jArr3.length == 1) {
            j = 0;
            if (jArr3[0] == 0) {
                jH0 = wlq.H0(((long[]) wlq.j(rkpVar.i))[0], FolmeCore.NANOS_TO_MS, rkpVar.c);
            }
            iArr = vmpVar.i;
            iArr2 = vmpVar.j;
            jArr = vmpVar.f37038k;
            zArr = vmpVar.l;
            int i6 = iN4;
            if (rkpVar.f32646b == 2 || (i2 & 1) == 0) {
                z = false;
            } else {
                z = true;
            }
            i4 = i3 + vmpVar.h[i];
            boolean z9 = z;
            j2 = rkpVar.c;
            j3 = jH0;
            j4 = vmpVar.f37039r;
            i5 = i3;
            while (i5 < i4) {
                if (z5) {
                    iN = okhVar.n();
                } else {
                    iN = uw5Var.f36207b;
                }
                int iD = d(iN);
                if (z6) {
                    iN2 = okhVar.n();
                } else {
                    iN2 = uw5Var.c;
                }
                int iD2 = d(iN2);
                if (z7) {
                    iN3 = okhVar.n();
                } else if (i5 == 0 || !z4) {
                    iN3 = uw5Var.d;
                } else {
                    iN3 = i6;
                }
                if (z8) {
                    iArr2[i5] = (int) ((((long) okhVar.n()) * FolmeCore.NANOS_TO_MS) / j2);
                    z2 = false;
                } else {
                    z2 = false;
                    iArr2[i5] = 0;
                }
                jH1 = wlq.H0(j4, FolmeCore.NANOS_TO_MS, j2) - j3;
                jArr[i5] = jH1;
                if (!vmpVar.s) {
                    jArr[i5] = jH1 + bVar2.d.h;
                }
                iArr[i5] = iD2;
                if (((iN3 >> 16) & 1) == 0 || (z9 && i5 != 0)) {
                    z3 = z2;
                } else {
                    z3 = true;
                }
                zArr[i5] = z3;
                j4 += (long) iD;
                i5++;
                bVar2 = bVar;
                z5 = z5;
                j2 = j2;
                z4 = z4;
                z8 = z8;
                z6 = z6;
                z7 = z7;
            }
            vmpVar.f37039r = j4;
            return i4;
        }
        j = 0;
        jH0 = j;
        iArr = vmpVar.i;
        iArr2 = vmpVar.j;
        jArr = vmpVar.f37038k;
        zArr = vmpVar.l;
        int i7 = iN4;
        if (rkpVar.f32646b == 2) {
            z = false;
        } else {
            z = false;
        }
        i4 = i3 + vmpVar.h[i];
        boolean z10 = z;
        j2 = rkpVar.c;
        j3 = jH0;
        j4 = vmpVar.f37039r;
        i5 = i3;
        while (i5 < i4) {
            if (z5) {
                iN = okhVar.n();
            } else {
                iN = uw5Var.f36207b;
            }
            int iD3 = d(iN);
            if (z6) {
                iN2 = okhVar.n();
            } else {
                iN2 = uw5Var.c;
            }
            int iD4 = d(iN2);
            if (z7) {
                iN3 = okhVar.n();
            } else if (i5 == 0) {
                iN3 = uw5Var.d;
            } else {
                iN3 = uw5Var.d;
            }
            if (z8) {
                iArr2[i5] = (int) ((((long) okhVar.n()) * FolmeCore.NANOS_TO_MS) / j2);
                z2 = false;
            } else {
                z2 = false;
                iArr2[i5] = 0;
            }
            jH1 = wlq.H0(j4, FolmeCore.NANOS_TO_MS, j2) - j3;
            jArr[i5] = jH1;
            if (!vmpVar.s) {
                jArr[i5] = jH1 + bVar2.d.h;
            }
            iArr[i5] = iD4;
            if (((iN3 >> 16) & 1) == 0) {
                z3 = z2;
            } else {
                z3 = z2;
            }
            zArr[i5] = z3;
            j4 += (long) iD3;
            i5++;
            bVar2 = bVar;
            z5 = z5;
            j2 = j2;
            z4 = z4;
            z8 = z8;
            z6 = z6;
            z7 = z7;
        }
        vmpVar.f37039r = j4;
        return i4;
    }

    public static void H(zl1.a aVar, b bVar, int i) throws ParserException {
        List<zl1.b> list = aVar.c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            zl1.b bVar2 = list.get(i4);
            if (bVar2.f41414a == 1953658222) {
                okh okhVar = bVar2.f41416b;
                okhVar.P(12);
                int iH = okhVar.H();
                if (iH > 0) {
                    i3 += iH;
                    i2++;
                }
            }
        }
        bVar.h = 0;
        bVar.g = 0;
        bVar.f = 0;
        bVar.f41484b.e(i2, i3);
        int i5 = 0;
        int iG = 0;
        for (int i6 = 0; i6 < size; i6++) {
            zl1.b bVar3 = list.get(i6);
            if (bVar3.f41414a == 1953658222) {
                iG = G(bVar, i5, i, bVar3.f41416b, iG);
                i5++;
            }
        }
    }

    public static void I(okh okhVar, vmp vmpVar, byte[] bArr) throws ParserException {
        okhVar.P(8);
        okhVar.j(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            z(okhVar, 16, vmpVar);
        }
    }

    private void J(long j) throws ParserException {
        while (!this.m.isEmpty() && this.m.peek().f41415b == j) {
            o(this.m.pop());
        }
        e();
    }

    private boolean K(jl8 jl8Var) throws IOException {
        if (this.s == 0) {
            if (!jl8Var.e(this.l.d(), 0, 8, true)) {
                return false;
            }
            this.s = 8;
            this.l.P(0);
            this.f41480r = this.l.F();
            this.q = this.l.n();
        }
        long j = this.f41480r;
        if (j == 1) {
            jl8Var.readFully(this.l.d(), 8, 8);
            this.s += 8;
            this.f41480r = this.l.I();
        } else if (j == 0) {
            long length = jl8Var.getLength();
            if (length == -1 && !this.m.isEmpty()) {
                length = this.m.peek().f41415b;
            }
            if (length != -1) {
                this.f41480r = (length - jl8Var.getPosition()) + ((long) this.s);
            }
        }
        if (this.f41480r < this.s) {
            throw new ParserException("Atom size less than header length (unsupported).");
        }
        long position = jl8Var.getPosition() - ((long) this.s);
        int i = this.q;
        if ((i == 1836019558 || i == 1835295092) && !this.H) {
            this.E.k(new arl.b(this.x, position));
            this.H = true;
        }
        if (this.q == 1836019558) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                vmp vmpVar = this.d.valueAt(i2).f41484b;
                vmpVar.f37037b = position;
                vmpVar.d = position;
                vmpVar.c = position;
            }
        }
        int i3 = this.q;
        if (i3 == 1835295092) {
            this.z = null;
            this.u = position + this.f41480r;
            this.p = 2;
            return true;
        }
        if (O(i3)) {
            long position2 = (jl8Var.getPosition() + this.f41480r) - 8;
            this.m.push(new zl1.a(this.q, position2));
            if (this.f41480r == this.s) {
                J(position2);
            } else {
                e();
            }
        } else if (P(this.q)) {
            if (this.s != 8) {
                throw new ParserException("Leaf atom defines extended atom size (unsupported).");
            }
            long j2 = this.f41480r;
            if (j2 > 2147483647L) {
                throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
            }
            okh okhVar = new okh((int) j2);
            System.arraycopy(this.l.d(), 0, okhVar.d(), 0, 8);
            this.t = okhVar;
            this.p = 1;
        } else {
            if (this.f41480r > 2147483647L) {
                throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.t = null;
            this.p = 1;
        }
        return true;
    }

    private static boolean O(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    private static boolean P(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    public static int d(int i) throws ParserException {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw new ParserException(sb.toString());
    }

    private void e() {
        this.p = 0;
        this.s = 0;
    }

    public static DrmInitData i(List<zl1.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zl1.b bVar = list.get(i);
            if (bVar.f41414a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrD = bVar.f41416b.d();
                UUID uuidF = nei.f(bArrD);
                if (uuidF == null) {
                    toe.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidF, "video/mp4", bArrD));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    public static b j(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            b bVarValueAt = sparseArray.valueAt(i);
            if ((bVarValueAt.l || bVarValueAt.f != bVarValueAt.d.f38181b) && (!bVarValueAt.l || bVarValueAt.h != bVarValueAt.f41484b.e)) {
                long jD = bVarValueAt.d();
                if (jD < j) {
                    bVar = bVarValueAt;
                    j = jD;
                }
            }
        }
        return bVar;
    }

    public static b k(SparseArray<b> sparseArray, int i) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : sparseArray.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ il8[] m() {
        return new il8[]{new zna()};
    }

    public static long u(okh okhVar) {
        okhVar.P(8);
        return zl1.c(okhVar.n()) == 0 ? okhVar.F() : okhVar.I();
    }

    public static void v(zl1.a aVar, SparseArray<b> sparseArray, int i, byte[] bArr) throws ParserException {
        int size = aVar.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            zl1.a aVar2 = aVar.d.get(i2);
            if (aVar2.f41414a == 1953653094) {
                E(aVar2, sparseArray, i, bArr);
            }
        }
    }

    public static void w(okh okhVar, vmp vmpVar) throws ParserException {
        okhVar.P(8);
        int iN = okhVar.n();
        if ((zl1.b(iN) & 1) == 1) {
            okhVar.Q(8);
        }
        int iH = okhVar.H();
        if (iH == 1) {
            vmpVar.d += zl1.c(iN) == 0 ? okhVar.F() : okhVar.I();
        } else {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Unexpected saio entry count: ");
            sb.append(iH);
            throw new ParserException(sb.toString());
        }
    }

    public static void x(smp smpVar, okh okhVar, vmp vmpVar) throws ParserException {
        int i;
        int i2 = smpVar.d;
        okhVar.P(8);
        if ((zl1.b(okhVar.n()) & 1) == 1) {
            okhVar.Q(8);
        }
        int iD = okhVar.D();
        int iH = okhVar.H();
        if (iH > vmpVar.f) {
            int i3 = vmpVar.f;
            StringBuilder sb = new StringBuilder(78);
            sb.append("Saiz sample count ");
            sb.append(iH);
            sb.append(" is greater than fragment sample count");
            sb.append(i3);
            throw new ParserException(sb.toString());
        }
        if (iD == 0) {
            boolean[] zArr = vmpVar.n;
            i = 0;
            for (int i4 = 0; i4 < iH; i4++) {
                int iD2 = okhVar.D();
                i += iD2;
                zArr[i4] = iD2 > i2;
            }
        } else {
            i = iD * iH;
            Arrays.fill(vmpVar.n, 0, iH, iD > i2);
        }
        Arrays.fill(vmpVar.n, iH, vmpVar.f, false);
        if (i > 0) {
            vmpVar.d(i);
        }
    }

    public static void y(zl1.a aVar, String str, vmp vmpVar) throws ParserException {
        byte[] bArr = null;
        okh okhVar = null;
        okh okhVar2 = null;
        for (int i = 0; i < aVar.c.size(); i++) {
            zl1.b bVar = aVar.c.get(i);
            okh okhVar3 = bVar.f41416b;
            int i2 = bVar.f41414a;
            if (i2 == 1935828848) {
                okhVar3.P(12);
                if (okhVar3.n() == 1936025959) {
                    okhVar = okhVar3;
                }
            } else if (i2 == 1936158820) {
                okhVar3.P(12);
                if (okhVar3.n() == 1936025959) {
                    okhVar2 = okhVar3;
                }
            }
        }
        if (okhVar == null || okhVar2 == null) {
            return;
        }
        okhVar.P(8);
        int iC = zl1.c(okhVar.n());
        okhVar.Q(4);
        if (iC == 1) {
            okhVar.Q(4);
        }
        if (okhVar.n() != 1) {
            throw new ParserException("Entry count in sbgp != 1 (unsupported).");
        }
        okhVar2.P(8);
        int iC2 = zl1.c(okhVar2.n());
        okhVar2.Q(4);
        if (iC2 == 1) {
            if (okhVar2.F() == 0) {
                throw new ParserException("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC2 >= 2) {
            okhVar2.Q(4);
        }
        if (okhVar2.F() != 1) {
            throw new ParserException("Entry count in sgpd != 1 (unsupported).");
        }
        okhVar2.Q(1);
        int iD = okhVar2.D();
        int i3 = (iD & 240) >> 4;
        int i4 = iD & 15;
        boolean z = okhVar2.D() == 1;
        if (z) {
            int iD2 = okhVar2.D();
            byte[] bArr2 = new byte[16];
            okhVar2.j(bArr2, 0, 16);
            if (iD2 == 0) {
                int iD3 = okhVar2.D();
                bArr = new byte[iD3];
                okhVar2.j(bArr, 0, iD3);
            }
            vmpVar.m = true;
            vmpVar.o = new smp(z, str, iD2, bArr2, i3, i4, bArr);
        }
    }

    public static void z(okh okhVar, int i, vmp vmpVar) throws ParserException {
        okhVar.P(i + 8);
        int iB = zl1.b(okhVar.n());
        if ((iB & 1) != 0) {
            throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iB & 2) != 0;
        int iH = okhVar.H();
        if (iH == 0) {
            Arrays.fill(vmpVar.n, 0, vmpVar.f, false);
            return;
        }
        if (iH == vmpVar.f) {
            Arrays.fill(vmpVar.n, 0, iH, z);
            vmpVar.d(okhVar.a());
            vmpVar.b(okhVar);
        } else {
            int i2 = vmpVar.f;
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(iH);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw new ParserException(sb.toString());
        }
    }

    public final void L(jl8 jl8Var) throws IOException {
        int i = ((int) this.f41480r) - this.s;
        okh okhVar = this.t;
        if (okhVar != null) {
            jl8Var.readFully(okhVar.d(), 8, i);
            q(new zl1.b(this.q, okhVar), jl8Var.getPosition());
        } else {
            jl8Var.p(i);
        }
        J(jl8Var.getPosition());
    }

    public final void M(jl8 jl8Var) throws IOException {
        int size = this.d.size();
        b bVarValueAt = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            vmp vmpVar = this.d.valueAt(i).f41484b;
            if (vmpVar.q) {
                long j2 = vmpVar.d;
                if (j2 < j) {
                    bVarValueAt = this.d.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVarValueAt == null) {
            this.p = 3;
            return;
        }
        int position = (int) (j - jl8Var.getPosition());
        if (position < 0) {
            throw new ParserException("Offset to encryption data was negative.");
        }
        jl8Var.p(position);
        bVarValueAt.f41484b.a(jl8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean N(jl8 jl8Var) throws IOException {
        int iC;
        b bVarJ = this.z;
        if (bVarJ == null) {
            bVarJ = j(this.d);
            if (bVarJ == null) {
                int position = (int) (this.u - jl8Var.getPosition());
                if (position < 0) {
                    throw new ParserException("Offset to end of mdat was negative.");
                }
                jl8Var.p(position);
                e();
                return false;
            }
            int iD = (int) (bVarJ.d() - jl8Var.getPosition());
            if (iD < 0) {
                toe.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iD = 0;
            }
            jl8Var.p(iD);
            this.z = bVarJ;
        }
        int i = 4;
        int i2 = 1;
        if (this.p == 3) {
            int iF = bVarJ.f();
            this.A = iF;
            if (bVarJ.f < bVarJ.i) {
                jl8Var.p(iF);
                bVarJ.m();
                if (!bVarJ.h()) {
                    this.z = null;
                }
                this.p = 3;
                return true;
            }
            if (bVarJ.d.f38180a.g == 1) {
                this.A = iF - 8;
                jl8Var.p(8);
            }
            if ("audio/ac4".equals(bVarJ.d.f38180a.f.l)) {
                this.B = bVarJ.i(this.A, 7);
                i20.a(this.A, this.i);
                bVarJ.f41483a.d(this.i, 7);
                this.B += 7;
            } else {
                this.B = bVarJ.i(this.A, 0);
            }
            this.A += this.B;
            this.p = 4;
            this.C = 0;
        }
        rkp rkpVar = bVarJ.d.f38180a;
        snp snpVar = bVarJ.f41483a;
        long jE = bVarJ.e();
        rfp rfpVar = this.j;
        if (rfpVar != null) {
            jE = rfpVar.a(jE);
        }
        long j = jE;
        if (rkpVar.j == 0) {
            while (true) {
                int i3 = this.B;
                int i4 = this.A;
                if (i3 >= i4) {
                    break;
                }
                this.B += snpVar.c(jl8Var, i4 - i3, false);
            }
        } else {
            byte[] bArrD = this.f.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i5 = rkpVar.j;
            int i6 = i5 + 1;
            int i7 = 4 - i5;
            while (this.B < this.A) {
                int i8 = this.C;
                if (i8 == 0) {
                    jl8Var.readFully(bArrD, i7, i6);
                    this.f.P(0);
                    int iN = this.f.n();
                    if (iN < i2) {
                        throw new ParserException("Invalid NAL length");
                    }
                    this.C = iN - 1;
                    this.e.P(0);
                    snpVar.d(this.e, i);
                    snpVar.d(this.f, i2);
                    this.D = (this.G.length <= 0 || !kgg.g(rkpVar.f.l, bArrD[i])) ? 0 : i2;
                    this.B += 5;
                    this.A += i7;
                } else {
                    if (this.D) {
                        this.g.L(i8);
                        jl8Var.readFully(this.g.d(), 0, this.C);
                        snpVar.d(this.g, this.C);
                        iC = this.C;
                        int iK = kgg.k(this.g.d(), this.g.f());
                        this.g.P("video/hevc".equals(rkpVar.f.l) ? 1 : 0);
                        this.g.O(iK);
                        hs3.a(j, this.g, this.G);
                    } else {
                        iC = snpVar.c(jl8Var, i8, false);
                    }
                    this.B += iC;
                    this.C -= iC;
                    i = 4;
                    i2 = 1;
                }
            }
        }
        int iC2 = bVarJ.c();
        smp smpVarG = bVarJ.g();
        snpVar.e(j, iC2, this.A, 0, smpVarG != null ? smpVarG.c : null);
        t(j);
        if (!bVarJ.h()) {
            this.z = null;
        }
        this.p = 3;
        return true;
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.d.valueAt(i).k();
        }
        this.n.clear();
        this.v = 0;
        this.w = j2;
        this.m.clear();
        e();
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.E = kl8Var;
        e();
        l();
        rkp rkpVar = this.f41478b;
        if (rkpVar != null) {
            this.d.put(0, new b(kl8Var.d(0, rkpVar.f32646b), new wnp(this.f41478b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new uw5(0, 0, 0, 0)));
            this.E.m();
        }
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        while (true) {
            int i = this.p;
            if (i != 0) {
                if (i == 1) {
                    L(jl8Var);
                } else if (i == 2) {
                    M(jl8Var);
                } else if (N(jl8Var)) {
                    return 0;
                }
            } else if (!K(jl8Var)) {
                return -1;
            }
        }
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        return s3n.b(jl8Var);
    }

    public final uw5 h(SparseArray<uw5> sparseArray, int i) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (uw5) rk1.e(sparseArray.get(i));
    }

    public final void l() {
        int i;
        snp[] snpVarArr = new snp[2];
        this.F = snpVarArr;
        snp snpVar = this.o;
        int i2 = 0;
        if (snpVar != null) {
            snpVarArr[0] = snpVar;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f41477a & 4) != 0) {
            snpVarArr[i] = this.E.d(100, 5);
            i3 = 101;
            i++;
        }
        snp[] snpVarArr2 = (snp[]) wlq.A0(this.F, i);
        this.F = snpVarArr2;
        for (snp snpVar2 : snpVarArr2) {
            snpVar2.b(K);
        }
        this.G = new snp[this.c.size()];
        while (i2 < this.G.length) {
            snp snpVarD = this.E.d(i3, 3);
            snpVarD.b(this.c.get(i2));
            this.G[i2] = snpVarD;
            i2++;
            i3++;
        }
    }

    public rkp n(rkp rkpVar) {
        return rkpVar;
    }

    public final void o(zl1.a aVar) throws ParserException {
        int i = aVar.f41414a;
        if (i == 1836019574) {
            s(aVar);
        } else if (i == 1836019558) {
            r(aVar);
        } else {
            if (this.m.isEmpty()) {
                return;
            }
            this.m.peek().d(aVar);
        }
    }

    public final void p(okh okhVar) {
        long jH0;
        String str;
        long jH1;
        String str2;
        long jF;
        long jA;
        if (this.F.length == 0) {
            return;
        }
        okhVar.P(8);
        int iC = zl1.c(okhVar.n());
        if (iC == 0) {
            String str3 = (String) rk1.e(okhVar.x());
            String str4 = (String) rk1.e(okhVar.x());
            long jF2 = okhVar.F();
            jH0 = wlq.H0(okhVar.F(), FolmeCore.NANOS_TO_MS, jF2);
            long j = this.y;
            long j2 = j != -9223372036854775807L ? j + jH0 : -9223372036854775807L;
            str = str3;
            jH1 = wlq.H0(okhVar.F(), 1000L, jF2);
            str2 = str4;
            jF = okhVar.F();
            jA = j2;
        } else {
            if (iC != 1) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Skipping unsupported emsg version: ");
                sb.append(iC);
                toe.h("FragmentedMp4Extractor", sb.toString());
                return;
            }
            long jF3 = okhVar.F();
            jA = wlq.H0(okhVar.I(), FolmeCore.NANOS_TO_MS, jF3);
            long jH2 = wlq.H0(okhVar.F(), 1000L, jF3);
            long jF4 = okhVar.F();
            str = (String) rk1.e(okhVar.x());
            jH1 = jH2;
            jF = jF4;
            str2 = (String) rk1.e(okhVar.x());
            jH0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[okhVar.a()];
        okhVar.j(bArr, 0, okhVar.a());
        okh okhVar2 = new okh(this.f41479k.a(new EventMessage(str, str2, jH1, jF, bArr)));
        int iA = okhVar2.a();
        for (snp snpVar : this.F) {
            okhVar2.P(0);
            snpVar.d(okhVar2, iA);
        }
        if (jA == -9223372036854775807L) {
            this.n.addLast(new a(jH0, iA));
            this.v += iA;
            return;
        }
        rfp rfpVar = this.j;
        if (rfpVar != null) {
            jA = rfpVar.a(jA);
        }
        for (snp snpVar2 : this.F) {
            snpVar2.e(jA, 1, iA, 0, null);
        }
    }

    public final void q(zl1.b bVar, long j) throws ParserException {
        if (!this.m.isEmpty()) {
            this.m.peek().e(bVar);
            return;
        }
        int i = bVar.f41414a;
        if (i != 1936286840) {
            if (i == 1701671783) {
                p(bVar.f41416b);
            }
        } else {
            Pair<Long, fw3> pairB = B(bVar.f41416b, j);
            this.y = ((Long) pairB.first).longValue();
            this.E.k((arl) pairB.second);
            this.H = true;
        }
    }

    public final void r(zl1.a aVar) throws ParserException {
        v(aVar, this.d, this.f41477a, this.h);
        DrmInitData drmInitDataI = i(aVar.c);
        if (drmInitDataI != null) {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                this.d.valueAt(i).n(drmInitDataI);
            }
        }
        if (this.w != -9223372036854775807L) {
            int size2 = this.d.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.d.valueAt(i2).l(this.w);
            }
            this.w = -9223372036854775807L;
        }
    }

    @Override // defpackage.il8
    public void release() {
    }

    public final void s(zl1.a aVar) throws ParserException {
        int i = 0;
        rk1.h(this.f41478b == null, "Unexpected moov box.");
        DrmInitData drmInitDataI = i(aVar.c);
        zl1.a aVar2 = (zl1.a) rk1.e(aVar.f(1836475768));
        SparseArray<uw5> sparseArray = new SparseArray<>();
        int size = aVar2.c.size();
        long jU = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            zl1.b bVar = aVar2.c.get(i2);
            int i3 = bVar.f41414a;
            if (i3 == 1953654136) {
                Pair<Integer, uw5> pairF = F(bVar.f41416b);
                sparseArray.put(((Integer) pairF.first).intValue(), (uw5) pairF.second);
            } else if (i3 == 1835362404) {
                jU = u(bVar.f41416b);
            }
        }
        List<wnp> listZ = am1.z(aVar, new hxa(), jU, drmInitDataI, (this.f41477a & 16) != 0, false, new dua() { // from class: yna
            @Override // defpackage.dua
            public final Object apply(Object obj) {
                return this.f40343a.n((rkp) obj);
            }
        });
        int size2 = listZ.size();
        if (this.d.size() != 0) {
            rk1.g(this.d.size() == size2);
            while (i < size2) {
                wnp wnpVar = listZ.get(i);
                rkp rkpVar = wnpVar.f38180a;
                this.d.get(rkpVar.f32645a).j(wnpVar, h(sparseArray, rkpVar.f32645a));
                i++;
            }
            return;
        }
        while (i < size2) {
            wnp wnpVar2 = listZ.get(i);
            rkp rkpVar2 = wnpVar2.f38180a;
            this.d.put(rkpVar2.f32645a, new b(this.E.d(i, rkpVar2.f32646b), wnpVar2, h(sparseArray, rkpVar2.f32645a)));
            this.x = Math.max(this.x, rkpVar2.e);
            i++;
        }
        this.E.m();
    }

    public final void t(long j) {
        while (!this.n.isEmpty()) {
            a aVarRemoveFirst = this.n.removeFirst();
            this.v -= aVarRemoveFirst.f41482b;
            long jA = aVarRemoveFirst.f41481a + j;
            rfp rfpVar = this.j;
            if (rfpVar != null) {
                jA = rfpVar.a(jA);
            }
            for (snp snpVar : this.F) {
                snpVar.e(jA, 1, aVarRemoveFirst.f41482b, this.v, null);
            }
        }
    }

    public zna(int i) {
        this(i, null);
    }

    public zna(int i, rfp rfpVar) {
        this(i, rfpVar, null, Collections.emptyList());
    }

    public zna(int i, rfp rfpVar, rkp rkpVar, List<Format> list) {
        this(i, rfpVar, rkpVar, list, null);
    }

    public zna(int i, rfp rfpVar, rkp rkpVar) {
        this(i, rfpVar, rkpVar, Collections.emptyList());
    }

    public zna(int i, rfp rfpVar, rkp rkpVar, List<Format> list, snp snpVar) {
        this.f41477a = i;
        this.j = rfpVar;
        this.f41478b = rkpVar;
        this.c = Collections.unmodifiableList(list);
        this.o = snpVar;
        this.f41479k = new ud8();
        this.l = new okh(16);
        this.e = new okh(kgg.f23821a);
        this.f = new okh(5);
        this.g = new okh();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new okh(bArr);
        this.m = new ArrayDeque<>();
        this.n = new ArrayDeque<>();
        this.d = new SparseArray<>();
        this.x = -9223372036854775807L;
        this.w = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.E = kl8.s3;
        this.F = new snp[0];
        this.G = new snp[0];
    }
}
