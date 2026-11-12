package androidx.media3.exoplayer;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ja.a f8983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fa.i f8984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0.a f8985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExoPlayer.c f8989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f0 f8990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f0 f8991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f0 f8992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f0 f8993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f8995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f8996p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.d0.b f8981a = new androidx.media3.common.d0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.d0.c f8982b = new androidx.media3.common.d0.c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f8997q = new ArrayList();

    public h0(ja.a aVar, fa.i iVar, f0.a aVar2, ExoPlayer.c cVar) {
        this.f8983c = aVar;
        this.f8984d = iVar;
        this.f8985e = aVar2;
        this.f8989i = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[LOOP:0: B:3:0x0013->B:28:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x006d A[EDGE_INSN: B:40:0x006d->B:29:0x006d BREAK  A[LOOP:0: B:3:0x0013->B:28:0x0062], SYNTHETIC] */
    public static androidx.media3.exoplayer.source.j.b q(androidx.media3.common.d0 d0Var, Object obj, long j8, long j14, androidx.media3.common.d0.c cVar, androidx.media3.common.d0.b bVar) {
        d0Var.g(obj, bVar);
        d0Var.n(bVar.f8189c, cVar);
        int iB = d0Var.b(obj);
        Object obj2 = obj;
        while (true) {
            int i14 = bVar.f8193g.f8156b;
            if (i14 == 0) {
                break;
            }
            if ((i14 == 1 && bVar.g(0)) || !bVar.h(bVar.f8193g.f8159e)) {
                break;
            }
            long j15 = 0;
            if (bVar.c(0L) != -1) {
                break;
            }
            if (bVar.f8190d == 0) {
                if (iB <= cVar.f8210o) {
                    break;
                    break;
                }
                d0Var.f(iB, bVar, true);
                obj2 = bVar.f8188b;
                obj2.getClass();
                iB++;
            } else {
                int i15 = i14 - (bVar.g(i14 + (-1)) ? 2 : 1);
                for (int i16 = 0; i16 <= i15; i16++) {
                    j15 += bVar.f8193g.a(i16).f8168h;
                }
                if (bVar.f8190d > j15) {
                    break;
                }
                if (iB <= cVar.f8210o) {
                    break;
                }
                d0Var.f(iB, bVar, true);
                obj2 = bVar.f8188b;
                obj2.getClass();
                iB++;
            }
        }
        d0Var.g(obj2, bVar);
        int iC = bVar.c(j8);
        return iC == -1 ? new androidx.media3.exoplayer.source.j.b(obj2, j14, bVar.b(j8)) : new androidx.media3.exoplayer.source.j.b(obj2, iC, bVar.f(iC), j14);
    }

    public final f0 a() {
        f0 f0Var = this.f8990j;
        if (f0Var == null) {
            return null;
        }
        if (f0Var == this.f8991k) {
            this.f8991k = f0Var.f8951n;
        }
        f0Var.i();
        int i14 = this.f8994n - 1;
        this.f8994n = i14;
        if (i14 == 0) {
            this.f8992l = null;
            f0 f0Var2 = this.f8990j;
            this.f8995o = f0Var2.f8939b;
            this.f8996p = f0Var2.f8945h.f8967a.f9522d;
        }
        this.f8990j = this.f8990j.f8951n;
        m();
        return this.f8990j;
    }

    public final void b() {
        if (this.f8994n == 0) {
            return;
        }
        f0 f0Var = this.f8990j;
        fa.a.f(f0Var);
        this.f8995o = f0Var.f8939b;
        this.f8996p = f0Var.f8945h.f8967a.f9522d;
        while (f0Var != null) {
            f0Var.i();
            f0Var = f0Var.f8951n;
        }
        this.f8990j = null;
        this.f8992l = null;
        this.f8991k = null;
        this.f8994n = 0;
        m();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d8  */
    public final g0 c(androidx.media3.common.d0 d0Var, f0 f0Var, long j8) {
        Object obj;
        long j14;
        long j15;
        long j16;
        g0 g0Var = f0Var.f8945h;
        androidx.media3.exoplayer.source.j.b bVar = g0Var.f8967a;
        long j17 = g0Var.f8969c;
        int iD = d0Var.d(d0Var.b(bVar.f9519a), this.f8981a, this.f8982b, this.f8987g, this.f8988h);
        if (iD == -1) {
            return null;
        }
        androidx.media3.common.d0.b bVar2 = this.f8981a;
        int i14 = d0Var.f(iD, bVar2, true).f8189c;
        Object obj2 = bVar2.f8188b;
        obj2.getClass();
        long j18 = bVar.f9522d;
        long j19 = 0;
        if (d0Var.m(i14, this.f8982b, 0L).f8209n == iD) {
            Pair<Object, Long> pairJ = d0Var.j(this.f8982b, this.f8981a, i14, C.TIME_UNSET, Math.max(0L, j8));
            if (pairJ == null) {
                return null;
            }
            Object obj3 = pairJ.first;
            long jLongValue = ((Long) pairJ.second).longValue();
            f0 f0Var2 = f0Var.f8951n;
            if (f0Var2 == null || !f0Var2.f8939b.equals(obj3)) {
                long jS = s(obj3);
                if (jS == -1) {
                    jS = this.f8986f;
                    this.f8986f = 1 + jS;
                }
                j18 = jS;
            } else {
                j18 = f0Var2.f8945h.f8967a.f9522d;
            }
            obj = obj3;
            j14 = jLongValue;
            j19 = -9223372036854775807L;
        } else {
            obj = obj2;
            j14 = 0;
        }
        androidx.media3.exoplayer.source.j.b bVarQ = q(d0Var, obj, j14, j18, this.f8982b, this.f8981a);
        if (j19 == C.TIME_UNSET || j17 == C.TIME_UNSET) {
            j15 = j14;
            j16 = j19;
        } else {
            int i15 = d0Var.g(bVar.f9519a, bVar2).f8193g.f8156b;
            int i16 = bVar2.f8193g.f8159e;
            boolean z14 = i15 > 0 && bVar2.h(i16) && (i15 > 1 || bVar2.d(i16) != Long.MIN_VALUE);
            if (bVarQ.b() && z14) {
                j15 = j14;
                j16 = j17;
            } else {
                if (z14) {
                    j15 = j17;
                } else {
                    j15 = j14;
                }
                j16 = j19;
            }
        }
        return e(d0Var, bVarQ, j16, j15);
    }

    public final g0 d(androidx.media3.common.d0 d0Var, f0 f0Var, long j8) {
        androidx.media3.common.d0 d0Var2;
        g0 g0Var = f0Var.f8945h;
        long j14 = (f0Var.f8954q + g0Var.f8971e) - j8;
        if (g0Var.f8973g) {
            return c(d0Var, f0Var, j14);
        }
        androidx.media3.exoplayer.source.j.b bVar = g0Var.f8967a;
        Object obj = bVar.f9519a;
        int i14 = bVar.f9523e;
        androidx.media3.common.d0.b bVar2 = this.f8981a;
        d0Var.g(obj, bVar2);
        if (!bVar.b()) {
            if (i14 != -1 && bVar2.g(i14)) {
                return c(d0Var, f0Var, j14);
            }
            int iF = bVar2.f(i14);
            boolean z14 = bVar2.h(i14) && bVar2.e(i14, iF) == 3;
            if (iF != bVar2.f8193g.a(i14).f8162b && !z14) {
                return f(d0Var, bVar.f9519a, bVar.f9523e, iF, g0Var.f8971e, bVar.f9522d);
            }
            d0Var.g(obj, bVar2);
            long jD = bVar2.d(i14);
            return g(d0Var, bVar.f9519a, jD == Long.MIN_VALUE ? bVar2.f8190d : bVar2.f8193g.a(i14).f8168h + jD, g0Var.f8971e, bVar.f9522d);
        }
        int i15 = bVar.f9520b;
        int i16 = bVar2.f8193g.a(i15).f8162b;
        if (i16 == -1) {
            return null;
        }
        int iA = bVar2.f8193g.a(i15).a(bVar.f9521c);
        if (iA < i16) {
            return f(d0Var, bVar.f9519a, i15, iA, g0Var.f8969c, bVar.f9522d);
        }
        long jLongValue = g0Var.f8969c;
        if (jLongValue == C.TIME_UNSET) {
            Pair<Object, Long> pairJ = d0Var.j(this.f8982b, bVar2, bVar2.f8189c, C.TIME_UNSET, Math.max(0L, j14));
            d0Var2 = d0Var;
            if (pairJ == null) {
                return null;
            }
            jLongValue = ((Long) pairJ.second).longValue();
        } else {
            d0Var2 = d0Var;
        }
        int i17 = bVar.f9520b;
        d0Var2.g(obj, bVar2);
        long jD2 = bVar2.d(i17);
        return g(d0Var, bVar.f9519a, Math.max(jD2 == Long.MIN_VALUE ? bVar2.f8190d : bVar2.f8193g.a(i17).f8168h + jD2, jLongValue), g0Var.f8969c, bVar.f9522d);
    }

    public final g0 e(androidx.media3.common.d0 d0Var, androidx.media3.exoplayer.source.j.b bVar, long j8, long j14) {
        d0Var.g(bVar.f9519a, this.f8981a);
        boolean zB = bVar.b();
        Object obj = bVar.f9519a;
        return zB ? f(d0Var, obj, bVar.f9520b, bVar.f9521c, j8, bVar.f9522d) : g(d0Var, obj, j14, j8, bVar.f9522d);
    }

    public final g0 f(androidx.media3.common.d0 d0Var, Object obj, int i14, int i15, long j8, long j14) {
        androidx.media3.exoplayer.source.j.b bVar = new androidx.media3.exoplayer.source.j.b(obj, i14, i15, j14);
        Object obj2 = bVar.f9519a;
        androidx.media3.common.d0.b bVar2 = this.f8981a;
        androidx.media3.common.d0.b bVarG = d0Var.g(obj2, bVar2);
        int i16 = bVar.f9521c;
        int i17 = bVar.f9520b;
        long jA = bVarG.a(i17, i16);
        long jMax = i15 == bVar2.f(i14) ? bVar2.f8193g.f8157c : 0L;
        boolean zH = bVar2.h(i17);
        if (jA != C.TIME_UNSET && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new g0(bVar, jMax, j8, C.TIME_UNSET, jA, zH, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c3  */
    public final g0 g(androidx.media3.common.d0 d0Var, Object obj, long j8, long j14, long j15) {
        boolean z14;
        boolean z15;
        long j16;
        long jD;
        long j17;
        long jMax = j8;
        androidx.media3.common.d0.b bVar = this.f8981a;
        d0Var.g(obj, bVar);
        int iB = bVar.b(jMax);
        boolean z16 = iB != -1 && bVar.g(iB);
        if (iB == -1) {
            androidx.media3.common.b bVar2 = bVar.f8193g;
            if (bVar2.f8156b <= 0 || !bVar.h(bVar2.f8159e)) {
                z15 = false;
            } else {
                z15 = true;
            }
        } else if (bVar.h(iB) && bVar.d(iB) == bVar.f8190d) {
            androidx.media3.common.b.C0118b c0118bA = bVar.f8193g.a(iB);
            int i14 = c0118bA.f8162b;
            if (i14 == -1) {
                z14 = true;
                break;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= i14) {
                    z14 = false;
                    break;
                }
                int i16 = c0118bA.f8166f[i15];
                if (i16 == 0 || i16 == 1) {
                    z14 = true;
                    break;
                }
                i15++;
            }
            if (z14) {
                z15 = false;
            } else {
                z15 = true;
                iB = -1;
            }
        } else {
            z15 = false;
        }
        androidx.media3.exoplayer.source.j.b bVar3 = new androidx.media3.exoplayer.source.j.b(obj, j15, iB);
        boolean z17 = !bVar3.b() && bVar3.f9523e == -1;
        boolean zK = k(d0Var, bVar3);
        boolean zJ = j(d0Var, bVar3, z17);
        boolean z18 = (iB == -1 || !bVar.h(iB) || z16) ? false : true;
        if (iB == -1 || z16) {
            if (z15) {
                jD = bVar.f8190d;
            } else {
                j16 = -9223372036854775807L;
            }
            if (j16 != C.TIME_UNSET || j16 == Long.MIN_VALUE) {
                j17 = bVar.f8190d;
            } else {
                j17 = j16;
            }
            if (j17 != C.TIME_UNSET && jMax >= j17) {
                jMax = Math.max(0L, j17 - ((long) ((zJ && z15) ? 0 : 1)));
            }
            return new g0(bVar3, jMax, j14, j16, j17, z18, z17, zK, zJ);
        }
        jD = bVar.d(iB);
        j16 = jD;
        if (j16 != C.TIME_UNSET) {
            j17 = bVar.f8190d;
        } else {
            j17 = bVar.f8190d;
        }
        if (j17 != C.TIME_UNSET) {
            jMax = Math.max(0L, j17 - ((long) ((zJ && z15) ? 0 : 1)));
        }
        return new g0(bVar3, jMax, j14, j16, j17, z18, z17, zK, zJ);
    }

    public final g0 h(androidx.media3.common.d0 d0Var, g0 g0Var) {
        long jA;
        boolean zH;
        androidx.media3.exoplayer.source.j.b bVar = g0Var.f8967a;
        boolean zB = bVar.b();
        int i14 = bVar.f9523e;
        boolean z14 = !zB && i14 == -1;
        int i15 = bVar.f9520b;
        boolean zK = k(d0Var, bVar);
        boolean zJ = j(d0Var, bVar, z14);
        Object obj = bVar.f9519a;
        androidx.media3.common.d0.b bVar2 = this.f8981a;
        d0Var.g(obj, bVar2);
        long jD = (bVar.b() || i14 == -1) ? -9223372036854775807L : bVar2.d(i14);
        if (bVar.b()) {
            jA = bVar2.a(i15, bVar.f9521c);
        } else {
            jA = (jD == C.TIME_UNSET || jD == Long.MIN_VALUE) ? bVar2.f8190d : jD;
        }
        if (bVar.b()) {
            zH = bVar2.h(i15);
        } else {
            zH = i14 != -1 && bVar2.h(i14);
        }
        return new g0(bVar, g0Var.f8968b, g0Var.f8969c, jD, jA, zH, z14, zK, zJ);
    }

    public final void i(androidx.media3.common.d0 d0Var) {
        f0 f0Var;
        g0 g0VarG;
        h0 h0Var = this;
        if (h0Var.f8989i.f8661a == C.TIME_UNSET || (f0Var = h0Var.f8992l) == null) {
            if (h0Var.f8997q.isEmpty()) {
                return;
            }
            h0Var.n(new ArrayList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = f0Var.f8945h.f8967a.f9519a;
        androidx.media3.common.d0.b bVar = h0Var.f8981a;
        int iE = d0Var.e(d0Var.g(obj, bVar).f8189c, h0Var.f8987g, h0Var.f8988h);
        Pair<Object, Long> pairJ = iE != -1 ? d0Var.j(h0Var.f8982b, h0Var.f8981a, iE, C.TIME_UNSET, 0L) : null;
        if (pairJ != null && !d0Var.m(d0Var.g(pairJ.first, bVar).f8189c, h0Var.f8982b, 0L).a()) {
            long jS = h0Var.s(pairJ.first);
            if (jS == -1) {
                jS = h0Var.f8986f;
                h0Var.f8986f = 1 + jS;
            }
            long j8 = jS;
            Object obj2 = pairJ.first;
            long jLongValue = ((Long) pairJ.second).longValue();
            androidx.media3.exoplayer.source.j.b bVarQ = q(d0Var, obj2, jLongValue, j8, h0Var.f8982b, h0Var.f8981a);
            boolean zB = bVarQ.b();
            Object obj3 = bVarQ.f9519a;
            if (zB) {
                g0VarG = h0Var.f(d0Var, obj3, bVarQ.f9520b, bVarQ.f9521c, jLongValue, bVarQ.f9522d);
                h0Var = this;
            } else {
                h0Var = this;
                g0VarG = h0Var.g(d0Var, obj3, jLongValue, C.TIME_UNSET, bVarQ.f9522d);
            }
            f0 f0VarP = h0Var.p(g0VarG);
            if (f0VarP == null) {
                long j14 = (f0Var.f8954q + f0Var.f8945h.f8971e) - g0VarG.f8968b;
                z zVar = (z) ((a73.j) h0Var.f8985e).f1851b;
                f0VarP = new f0(zVar.f9887c, j14, zVar.f9889e, zVar.f9891g.getAllocator(), zVar.f9906w, g0VarG, zVar.f9890f, zVar.T0.f8661a);
            }
            arrayList.add(f0VarP);
        }
        h0Var.n(arrayList);
    }

    public final boolean j(androidx.media3.common.d0 d0Var, androidx.media3.exoplayer.source.j.b bVar, boolean z14) {
        int iB = d0Var.b(bVar.f9519a);
        if (!d0Var.m(d0Var.f(iB, this.f8981a, false).f8189c, this.f8982b, 0L).f8204i) {
            if (d0Var.d(iB, this.f8981a, this.f8982b, this.f8987g, this.f8988h) == -1 && z14) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(androidx.media3.common.d0 d0Var, androidx.media3.exoplayer.source.j.b bVar) {
        boolean z14 = !bVar.b() && bVar.f9523e == -1;
        Object obj = bVar.f9519a;
        if (z14) {
            if (d0Var.m(d0Var.g(obj, this.f8981a).f8189c, this.f8982b, 0L).f8210o == d0Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void l() {
        f0 f0Var = this.f8993m;
        if (f0Var == null || f0Var.h()) {
            this.f8993m = null;
            for (int i14 = 0; i14 < this.f8997q.size(); i14++) {
                f0 f0Var2 = (f0) this.f8997q.get(i14);
                if (!f0Var2.h()) {
                    this.f8993m = f0Var2;
                    return;
                }
            }
        }
    }

    public final void m() {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (f0 f0Var = this.f8990j; f0Var != null; f0Var = f0Var.f8951n) {
            builder.add(f0Var.f8945h.f8967a);
        }
        f0 f0Var2 = this.f8991k;
        this.f8984d.post(new a8.d(this, 7, builder, f0Var2 == null ? null : f0Var2.f8945h.f8967a));
    }

    public final void n(ArrayList arrayList) {
        for (int i14 = 0; i14 < this.f8997q.size(); i14++) {
            ((f0) this.f8997q.get(i14)).i();
        }
        this.f8997q = arrayList;
        this.f8993m = null;
        l();
    }

    public final boolean o(f0 f0Var) {
        fa.a.f(f0Var);
        boolean z14 = false;
        if (f0Var.equals(this.f8992l)) {
            return false;
        }
        this.f8992l = f0Var;
        while (true) {
            f0Var = f0Var.f8951n;
            if (f0Var == null) {
                break;
            }
            if (f0Var == this.f8991k) {
                this.f8991k = this.f8990j;
                z14 = true;
            }
            f0Var.i();
            this.f8994n--;
        }
        f0 f0Var2 = this.f8992l;
        f0Var2.getClass();
        if (f0Var2.f8951n != null) {
            f0Var2.b();
            f0Var2.f8951n = null;
            f0Var2.c();
        }
        m();
        return z14;
    }

    public final f0 p(g0 g0Var) {
        for (int i14 = 0; i14 < this.f8997q.size(); i14++) {
            g0 g0Var2 = ((f0) this.f8997q.get(i14)).f8945h;
            long j8 = g0Var2.f8971e;
            long j14 = g0Var.f8971e;
            if ((j8 == C.TIME_UNSET || j8 == j14) && g0Var2.f8968b == g0Var.f8968b && g0Var2.f8967a.equals(g0Var.f8967a)) {
                return (f0) this.f8997q.remove(i14);
            }
        }
        return null;
    }

    public final androidx.media3.exoplayer.source.j.b r(androidx.media3.common.d0 d0Var, Object obj, long j8) {
        long jS;
        int iB;
        Object obj2 = obj;
        androidx.media3.common.d0.b bVar = this.f8981a;
        int i14 = d0Var.g(obj2, bVar).f8189c;
        Object obj3 = this.f8995o;
        if (obj3 == null || (iB = d0Var.b(obj3)) == -1 || d0Var.f(iB, bVar, false).f8189c != i14) {
            f0 f0Var = this.f8990j;
            while (true) {
                if (f0Var == null) {
                    f0 f0Var2 = this.f8990j;
                    while (true) {
                        if (f0Var2 == null) {
                            jS = s(obj2);
                            if (jS != -1) {
                                break;
                            }
                            jS = this.f8986f;
                            this.f8986f = 1 + jS;
                            if (this.f8990j != null) {
                                break;
                            }
                            this.f8995o = obj2;
                            this.f8996p = jS;
                            break;
                        }
                        int iB2 = d0Var.b(f0Var2.f8939b);
                        if (iB2 != -1 && d0Var.f(iB2, bVar, false).f8189c == i14) {
                            jS = f0Var2.f8945h.f8967a.f9522d;
                            break;
                        }
                        f0Var2 = f0Var2.f8951n;
                    }
                } else {
                    if (f0Var.f8939b.equals(obj2)) {
                        jS = f0Var.f8945h.f8967a.f9522d;
                        break;
                    }
                    f0Var = f0Var.f8951n;
                }
            }
        } else {
            jS = this.f8996p;
        }
        d0Var.g(obj2, bVar);
        int i15 = bVar.f8189c;
        androidx.media3.common.d0.c cVar = this.f8982b;
        d0Var.n(i15, cVar);
        boolean z14 = false;
        for (int iB3 = d0Var.b(obj); iB3 >= cVar.f8209n; iB3--) {
            d0Var.f(iB3, bVar, true);
            boolean z15 = bVar.f8193g.f8156b > 0;
            z14 |= z15;
            if (bVar.c(bVar.f8190d) != -1) {
                obj2 = bVar.f8188b;
                obj2.getClass();
            }
            if (z14 && (!z15 || bVar.f8190d != 0)) {
                break;
            }
        }
        return q(d0Var, obj2, j8, jS, this.f8982b, this.f8981a);
    }

    public final long s(Object obj) {
        for (int i14 = 0; i14 < this.f8997q.size(); i14++) {
            f0 f0Var = (f0) this.f8997q.get(i14);
            if (f0Var.f8939b.equals(obj)) {
                return f0Var.f8945h.f8967a.f9522d;
            }
        }
        return -1L;
    }

    public final boolean t(androidx.media3.common.d0 d0Var) {
        androidx.media3.common.d0 d0Var2;
        f0 f0Var;
        f0 f0Var2 = this.f8990j;
        if (f0Var2 == null) {
            return true;
        }
        int iB = d0Var.b(f0Var2.f8939b);
        while (true) {
            d0Var2 = d0Var;
            iB = d0Var2.d(iB, this.f8981a, this.f8982b, this.f8987g, this.f8988h);
            while (true) {
                f0Var = f0Var2.f8951n;
                if (f0Var == null || f0Var2.f8945h.f8973g) {
                    break;
                }
                f0Var2 = f0Var;
            }
            if (iB == -1 || f0Var == null || d0Var2.b(f0Var.f8939b) != iB) {
                break;
            }
            f0Var2 = f0Var;
            d0Var = d0Var2;
        }
        boolean zO = o(f0Var2);
        f0Var2.f8945h = h(d0Var2, f0Var2.f8945h);
        return !zO;
    }

    public final boolean u(androidx.media3.common.d0 d0Var, long j8, long j14) {
        boolean zO;
        g0 g0VarH;
        f0 f0Var = this.f8990j;
        f0 f0Var2 = null;
        while (f0Var != null) {
            g0 g0Var = f0Var.f8945h;
            if (f0Var2 != null) {
                g0 g0VarD = d(d0Var, f0Var2, j8);
                if (g0VarD == null) {
                    zO = o(f0Var2);
                } else if (g0Var.f8968b == g0VarD.f8968b && g0Var.f8967a.equals(g0VarD.f8967a)) {
                    g0VarH = g0VarD;
                } else {
                    zO = o(f0Var2);
                }
                return !zO;
            }
            g0VarH = h(d0Var, g0Var);
            long j15 = g0VarH.f8971e;
            f0Var.f8945h = g0VarH.a(g0Var.f8969c);
            long j16 = g0Var.f8971e;
            if (j16 == C.TIME_UNSET || j16 == j15) {
                f0Var2 = f0Var;
                f0Var = f0Var.f8951n;
            } else {
                f0Var.k();
                boolean z14 = f0Var == this.f8991k && !f0Var.f8945h.f8972f && (j14 == Long.MIN_VALUE || j14 >= ((j15 > C.TIME_UNSET ? 1 : (j15 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : f0Var.f8954q + j15));
                if (o(f0Var) || z14) {
                    return false;
                }
            }
        }
        return true;
    }
}
