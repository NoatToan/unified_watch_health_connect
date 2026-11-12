package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f9g implements il8, arl {
    public static final nl8 y = new nl8() { // from class: e9g
        @Override // defpackage.nl8
        public final il8[] c() {
            return f9g.r();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f17558b;
    public final okh c;
    public final okh d;
    public final okh e;
    public final ArrayDeque<zl1.a> f;
    public final erl g;
    public final List<Metadata.Entry> h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17559k;
    public int l;
    public okh m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kl8 f17560r;
    public a[] s;
    public long[][] t;
    public int u;
    public long v;
    public int w;
    public MotionPhotoMetadata x;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rkp f17561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wnp f17562b;
        public final snp c;
        public int d;

        public a(rkp rkpVar, wnp wnpVar, snp snpVar) {
            this.f17561a = rkpVar;
            this.f17562b = wnpVar;
            this.c = snpVar;
        }
    }

    public f9g() {
        this(0);
    }

    public static boolean D(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    public static boolean E(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    public static int l(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static long[][] m(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].f17562b.f38181b];
            jArr2[i] = aVarArr[i].f17562b.f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            wnp wnpVar = aVarArr[i3].f17562b;
            j += (long) wnpVar.d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = wnpVar.f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    public static int o(wnp wnpVar, long j) {
        int iA = wnpVar.a(j);
        return iA == -1 ? wnpVar.b(j) : iA;
    }

    public static /* synthetic */ rkp q(rkp rkpVar) {
        return rkpVar;
    }

    public static /* synthetic */ il8[] r() {
        return new il8[]{new f9g()};
    }

    public static long s(wnp wnpVar, long j, long j2) {
        int iO = o(wnpVar, j);
        return iO == -1 ? j2 : Math.min(wnpVar.c[iO], j2);
    }

    public static int w(okh okhVar) {
        okhVar.P(8);
        int iL = l(okhVar.n());
        if (iL != 0) {
            return iL;
        }
        okhVar.Q(4);
        while (okhVar.a() > 0) {
            int iL2 = l(okhVar.n());
            if (iL2 != 0) {
                return iL2;
            }
        }
        return 0;
    }

    public final boolean A(jl8 jl8Var, r4i r4iVar) throws IOException {
        boolean z;
        long j = this.f17559k - ((long) this.l);
        long position = jl8Var.getPosition() + j;
        okh okhVar = this.m;
        if (okhVar == null) {
            if (j < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                jl8Var.p((int) j);
            } else {
                r4iVar.f32179a = jl8Var.getPosition() + j;
                z = true;
            }
            u(position);
            return (z || this.i == 2) ? false : true;
        }
        jl8Var.readFully(okhVar.d(), this.l, (int) j);
        if (this.j == 1718909296) {
            this.w = w(okhVar);
        } else if (!this.f.isEmpty()) {
            this.f.peek().e(new zl1.b(this.j, okhVar));
        }
        z = false;
        u(position);
        if (z) {
        }
    }

    public final int B(jl8 jl8Var, r4i r4iVar) throws IOException {
        long position = jl8Var.getPosition();
        if (this.n == -1) {
            int iP = p(position);
            this.n = iP;
            if (iP == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) wlq.j(this.s))[this.n];
        snp snpVar = aVar.c;
        int i = aVar.d;
        wnp wnpVar = aVar.f17562b;
        long j = wnpVar.c[i];
        int i2 = wnpVar.d[i];
        long j2 = (j - position) + ((long) this.o);
        if (j2 < 0 || j2 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            r4iVar.f32179a = j;
            return 1;
        }
        if (aVar.f17561a.g == 1) {
            j2 += 8;
            i2 -= 8;
        }
        jl8Var.p((int) j2);
        rkp rkpVar = aVar.f17561a;
        if (rkpVar.j == 0) {
            if ("audio/ac4".equals(rkpVar.f.l)) {
                if (this.p == 0) {
                    i20.a(i2, this.d);
                    snpVar.d(this.d, 7);
                    this.p += 7;
                }
                i2 += 7;
            }
            while (true) {
                int i3 = this.p;
                if (i3 >= i2) {
                    break;
                }
                int iC = snpVar.c(jl8Var, i2 - i3, false);
                this.o += iC;
                this.p += iC;
                this.q -= iC;
            }
        } else {
            byte[] bArrD = this.c.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i4 = aVar.f17561a.j;
            int i5 = 4 - i4;
            while (this.p < i2) {
                int i6 = this.q;
                if (i6 == 0) {
                    jl8Var.readFully(bArrD, i5, i4);
                    this.o += i4;
                    this.c.P(0);
                    int iN = this.c.n();
                    if (iN < 0) {
                        throw new ParserException("Invalid NAL length");
                    }
                    this.q = iN;
                    this.f17558b.P(0);
                    snpVar.d(this.f17558b, 4);
                    this.p += 4;
                    i2 += i5;
                } else {
                    int iC2 = snpVar.c(jl8Var, i6, false);
                    this.o += iC2;
                    this.p += iC2;
                    this.q -= iC2;
                }
            }
        }
        int i7 = i2;
        wnp wnpVar2 = aVar.f17562b;
        snpVar.e(wnpVar2.f[i], wnpVar2.g[i], i7, 0, null);
        aVar.d++;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        return 0;
    }

    public final int C(jl8 jl8Var, r4i r4iVar) throws IOException {
        int iC = this.g.c(jl8Var, r4iVar, this.h);
        if (iC == 1 && r4iVar.f32179a == 0) {
            n();
        }
        return iC;
    }

    public final void F(long j) {
        for (a aVar : this.s) {
            wnp wnpVar = aVar.f17562b;
            int iA = wnpVar.a(j);
            if (iA == -1) {
                iA = wnpVar.b(j);
            }
            aVar.d = iA;
        }
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        this.f.clear();
        this.l = 0;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        if (j != 0) {
            if (this.s != null) {
                F(j2);
            }
        } else if (this.i != 3) {
            n();
        } else {
            this.g.g();
            this.h.clear();
        }
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.f17560r = kl8Var;
    }

    @Override // defpackage.arl
    public arl.a d(long j) {
        long j2;
        long jS;
        long j3;
        long j4;
        int iB;
        if (((a[]) rk1.e(this.s)).length == 0) {
            return new arl.a(crl.c);
        }
        int i = this.u;
        if (i != -1) {
            wnp wnpVar = this.s[i].f17562b;
            int iO = o(wnpVar, j);
            if (iO == -1) {
                return new arl.a(crl.c);
            }
            long j5 = wnpVar.f[iO];
            j2 = wnpVar.c[iO];
            if (j5 >= j || iO >= wnpVar.f38181b - 1 || (iB = wnpVar.b(j)) == -1 || iB == iO) {
                j4 = -1;
                j3 = -9223372036854775807L;
            } else {
                j3 = wnpVar.f[iB];
                j4 = wnpVar.c[iB];
            }
            jS = j4;
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            jS = -1;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.s;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (i2 != this.u) {
                wnp wnpVar2 = aVarArr[i2].f17562b;
                long jS2 = s(wnpVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    jS = s(wnpVar2, j3, jS);
                }
                j2 = jS2;
            }
            i2++;
        }
        crl crlVar = new crl(j, j2);
        return j3 == -9223372036854775807L ? new arl.a(crlVar) : new arl.a(crlVar, new crl(j3, jS));
    }

    @Override // defpackage.arl
    public boolean e() {
        return true;
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        while (true) {
            int i = this.i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return B(jl8Var, r4iVar);
                    }
                    if (i == 3) {
                        return C(jl8Var, r4iVar);
                    }
                    throw new IllegalStateException();
                }
                if (A(jl8Var, r4iVar)) {
                    return 1;
                }
            } else if (!z(jl8Var)) {
                return -1;
            }
        }
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        return s3n.d(jl8Var, (this.f17557a & 2) != 0);
    }

    @Override // defpackage.arl
    public long i() {
        return this.v;
    }

    public final void n() {
        this.i = 0;
        this.l = 0;
    }

    public final int p(long j) {
        int i = -1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < ((a[]) wlq.j(this.s)).length; i3++) {
            a aVar = this.s[i3];
            int i4 = aVar.d;
            wnp wnpVar = aVar.f17562b;
            if (i4 != wnpVar.f38181b) {
                long j5 = wnpVar.c[i4];
                long j6 = ((long[][]) wlq.j(this.t))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    @Override // defpackage.il8
    public void release() {
    }

    public final void t(jl8 jl8Var) throws IOException {
        this.d.L(8);
        jl8Var.i(this.d.d(), 0, 8);
        am1.d(this.d);
        jl8Var.p(this.d.e());
        jl8Var.l();
    }

    public final void u(long j) throws ParserException {
        while (!this.f.isEmpty() && this.f.peek().f41415b == j) {
            zl1.a aVarPop = this.f.pop();
            if (aVarPop.f41414a == 1836019574) {
                x(aVarPop);
                this.f.clear();
                this.i = 2;
            } else if (!this.f.isEmpty()) {
                this.f.peek().d(aVarPop);
            }
        }
        if (this.i != 2) {
            n();
        }
    }

    public final void v() {
        if (this.w != 2 || (this.f17557a & 2) == 0) {
            return;
        }
        kl8 kl8Var = (kl8) rk1.e(this.f17560r);
        kl8Var.d(0, 4).b(new Format.b().X(this.x == null ? null : new Metadata(this.x)).E());
        kl8Var.m();
        kl8Var.k(new arl.b(-9223372036854775807L));
    }

    public final void x(zl1.a aVar) throws ParserException {
        Metadata metadata;
        Metadata metadata2;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.w == 1;
        hxa hxaVar = new hxa();
        zl1.b bVarG = aVar.g(1969517665);
        if (bVarG != null) {
            Pair<Metadata, Metadata> pairA = am1.A(bVarG);
            Metadata metadata3 = (Metadata) pairA.first;
            Metadata metadata4 = (Metadata) pairA.second;
            if (metadata3 != null) {
                hxaVar.c(metadata3);
            }
            metadata = metadata4;
            metadata2 = metadata3;
        } else {
            metadata = null;
            metadata2 = null;
        }
        zl1.a aVarF = aVar.f(1835365473);
        Metadata metadataM = aVarF != null ? am1.m(aVarF) : null;
        List<wnp> listZ = am1.z(aVar, hxaVar, -9223372036854775807L, null, (this.f17557a & 1) != 0, z, new dua() { // from class: d9g
            @Override // defpackage.dua
            public final Object apply(Object obj) {
                return f9g.q((rkp) obj);
            }
        });
        kl8 kl8Var = (kl8) rk1.e(this.f17560r);
        int i2 = 0;
        int size = -1;
        long j = -9223372036854775807L;
        for (int size2 = listZ.size(); i2 < size2; size2 = size2) {
            wnp wnpVar = listZ.get(i2);
            if (wnpVar.f38181b == 0) {
                arrayList = arrayList2;
            } else {
                rkp rkpVar = wnpVar.f38180a;
                int i3 = size;
                arrayList = arrayList2;
                long j2 = rkpVar.e;
                if (j2 == -9223372036854775807L) {
                    j2 = wnpVar.h;
                }
                long jMax = Math.max(j, j2);
                a aVar2 = new a(rkpVar, wnpVar, kl8Var.d(i2, rkpVar.f32646b));
                int i4 = wnpVar.e + 30;
                Format.b bVarA = rkpVar.f.a();
                bVarA.W(i4);
                if (rkpVar.f32646b == 2 && j2 > 0 && (i = wnpVar.f38181b) > 1) {
                    bVarA.P(i / (j2 / 1000000.0f));
                }
                utf.k(rkpVar.f32646b, hxaVar, bVarA);
                int i5 = rkpVar.f32646b;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata;
                metadataArr[1] = this.h.isEmpty() ? null : new Metadata(this.h);
                utf.l(i5, metadata2, metadataM, bVarA, metadataArr);
                aVar2.c.b(bVarA.E());
                size = (rkpVar.f32646b == 2 && i3 == -1) ? arrayList.size() : i3;
                arrayList.add(aVar2);
                j = jMax;
            }
            i2++;
            arrayList2 = arrayList;
            listZ = listZ;
        }
        this.u = size;
        this.v = j;
        a[] aVarArr = (a[]) arrayList2.toArray(new a[0]);
        this.s = aVarArr;
        this.t = m(aVarArr);
        kl8Var.m();
        kl8Var.k(this);
    }

    public final void y(long j) {
        if (this.j == 1836086884) {
            int i = this.l;
            this.x = new MotionPhotoMetadata(0L, j, -9223372036854775807L, j + ((long) i), this.f17559k - ((long) i));
        }
    }

    public final boolean z(jl8 jl8Var) throws IOException {
        zl1.a aVarPeek;
        if (this.l == 0) {
            if (!jl8Var.e(this.e.d(), 0, 8, true)) {
                v();
                return false;
            }
            this.l = 8;
            this.e.P(0);
            this.f17559k = this.e.F();
            this.j = this.e.n();
        }
        long j = this.f17559k;
        if (j == 1) {
            jl8Var.readFully(this.e.d(), 8, 8);
            this.l += 8;
            this.f17559k = this.e.I();
        } else if (j == 0) {
            long length = jl8Var.getLength();
            if (length == -1 && (aVarPeek = this.f.peek()) != null) {
                length = aVarPeek.f41415b;
            }
            if (length != -1) {
                this.f17559k = (length - jl8Var.getPosition()) + ((long) this.l);
            }
        }
        if (this.f17559k < this.l) {
            throw new ParserException("Atom size less than header length (unsupported).");
        }
        if (D(this.j)) {
            long position = jl8Var.getPosition();
            long j2 = this.f17559k;
            int i = this.l;
            long j3 = (position + j2) - ((long) i);
            if (j2 != i && this.j == 1835365473) {
                t(jl8Var);
            }
            this.f.push(new zl1.a(this.j, j3));
            if (this.f17559k == this.l) {
                u(j3);
            } else {
                n();
            }
        } else if (E(this.j)) {
            rk1.g(this.l == 8);
            rk1.g(this.f17559k <= 2147483647L);
            okh okhVar = new okh((int) this.f17559k);
            System.arraycopy(this.e.d(), 0, okhVar.d(), 0, 8);
            this.m = okhVar;
            this.i = 1;
        } else {
            y(jl8Var.getPosition() - ((long) this.l));
            this.m = null;
            this.i = 1;
        }
        return true;
    }

    public f9g(int i) {
        this.f17557a = i;
        this.i = (i & 4) != 0 ? 3 : 0;
        this.g = new erl();
        this.h = new ArrayList();
        this.e = new okh(16);
        this.f = new ArrayDeque<>();
        this.f17558b = new okh(kgg.f23821a);
        this.c = new okh(4);
        this.d = new okh();
        this.n = -1;
    }
}
