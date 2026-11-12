package p3;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0004B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp3/r;", "Lp3/c0;", "Lp3/b3;", "Lp3/q2;", "", "Lp3/d2;", "Lp3/p;", "parent", "Lp3/c;", "applier", "<init>", "(Lp3/p;Lp3/c;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements c0, b3, q2, d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f135229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<?> f135230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<Object> f135231c = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f135232d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1.v0 f135233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s3.i f135234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p1.t0<Object, Object> f135235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p1.u0<p2> f135236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p1.u0<p2> f135237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p1.t0<Object, Object> f135238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t3.a f135239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t3.a f135240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p1.t0<Object, Object> f135241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p1.t0<Object, Object> f135242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f135243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e3 f135244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g2 f135245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r f135246r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f135247t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y f135248v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z3.l f135249w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o0 f135250x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f135251y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e23.p<? super m, ? super Integer, Unit> f135252z;

    public r(p pVar, c<?> cVar) {
        this.f135229a = pVar;
        this.f135230b = cVar;
        p1.v0 v0Var = new p1.v0(new p1.u0(0, 1, null));
        this.f135233e = v0Var;
        int i14 = l.f135147a;
        s3.i iVar = new s3.i();
        if (pVar.e()) {
            iVar.f156358k = new p1.i0<>(0, 1, null);
        }
        if (pVar.getF135205c()) {
            iVar.d();
        }
        this.f135234f = iVar;
        this.f135235g = p1.g1.b();
        this.f135236h = new p1.u0<>(0, 1, null);
        this.f135237i = new p1.u0<>(0, 1, null);
        this.f135238j = p1.g1.b();
        t3.a aVar = new t3.a();
        this.f135239k = aVar;
        t3.a aVar2 = new t3.a();
        this.f135240l = aVar2;
        this.f135241m = p1.g1.b();
        this.f135242n = p1.g1.b();
        y yVar = new y(null, false, pVar, 3, null);
        this.f135248v = yVar;
        this.f135249w = new z3.l();
        o0 o0Var = new o0(cVar, pVar, s3.k.e(iVar), v0Var, aVar, aVar2, yVar, this);
        pVar.s(o0Var);
        this.f135250x = o0Var;
        h.f135102a.getClass();
        this.f135252z = h.f135103b;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0144 A[EDGE_INSN: B:164:0x0144->B:82:0x0144 BREAK  A[LOOP:2: B:150:0x00f7->B:80:0x013a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x013a A[Catch: all -> 0x012a, LOOP:2: B:150:0x00f7->B:80:0x013a, LOOP_END, TryCatch #6 {all -> 0x012a, blocks: (B:64:0x00f7, B:66:0x0106, B:68:0x0110, B:70:0x0116, B:72:0x0126, B:76:0x012f, B:82:0x0144, B:90:0x0166, B:93:0x0179, B:80:0x013a, B:85:0x014e, B:99:0x0197, B:101:0x01a3), top: B:150:0x00f7 }] */
    public final void A(t3.a aVar) throws Throwable {
        c<?> cVar;
        z3.l lVar;
        z3.l lVar2;
        long[] jArr;
        int i14;
        long[] jArr2;
        z3.l lVar3;
        long j8;
        char c14;
        long j14;
        int i15;
        boolean zB;
        long j15;
        t3.a aVar2 = this.f135240l;
        o0 o0Var = this.f135250x;
        g4.i iVarT = o0Var.T();
        z3.l lVar4 = this.f135249w;
        lVar4.g(this.f135233e, iVarT);
        try {
            if (aVar.f162078a.c()) {
                try {
                    if (aVar2.f162078a.c() && this.f135245q == null) {
                        lVar4.b();
                    }
                    return;
                } finally {
                    lVar4.a();
                }
            }
            g2 g2Var = this.f135245q;
            if (g2Var == null || (cVar = g2Var.f135099l) == null) {
                cVar = this.f135230b;
            }
            String str = p005kotlin.jvm.internal.s.g(cVar, g2Var != null ? g2Var.f135099l : null) ? "Compose:recordChanges" : "Compose:applyChanges";
            try {
                z3.q.f202125a.getClass();
                Trace.beginSection(str);
                try {
                    g2 g2Var2 = this.f135245q;
                    if (g2Var2 == null || (lVar = g2Var2.f135098k) == null) {
                        lVar = lVar4;
                    }
                    cVar.onBeginChanges();
                    s3.i iVar = this.f135234f;
                    g4.i iVarT2 = o0Var.T();
                    s3.l lVarH = s3.k.e(iVar).h();
                    int i16 = 0;
                    try {
                        aVar.c(cVar, lVarH, lVar, iVarT2);
                        Unit unit = Unit.INSTANCE;
                        lVarH.e(true);
                        cVar.onEndChanges();
                        Trace.endSection();
                        lVar4.c();
                        lVar4.d();
                        if (this.f135243o) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f135243o = false;
                                p1.t0<Object, Object> t0Var = this.f135235g;
                                long[] jArr3 = t0Var.f134720a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i17 = 0;
                                    while (true) {
                                        long j16 = jArr3[i17];
                                        char c15 = 7;
                                        long j17 = -9187201950435737472L;
                                        if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i18 = 8;
                                            int i19 = 8 - ((~(i17 - length)) >>> 31);
                                            int i24 = i16;
                                            while (i24 < i19) {
                                                if ((j16 & 255) < 128) {
                                                    c14 = c15;
                                                    int i25 = (i17 << 3) + i24;
                                                    j14 = j17;
                                                    Object obj = t0Var.f134721b[i25];
                                                    Object obj2 = t0Var.f134722c[i25];
                                                    if (obj2 instanceof p1.u0) {
                                                        p1.u0 u0Var = (p1.u0) obj2;
                                                        Object[] objArr = u0Var.f134733b;
                                                        long[] jArr4 = u0Var.f134732a;
                                                        int i26 = i18;
                                                        int length2 = jArr4.length - 2;
                                                        i14 = i24;
                                                        jArr2 = jArr3;
                                                        lVar3 = lVar4;
                                                        if (length2 >= 0) {
                                                            int i27 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j18 = jArr4[i27];
                                                                    j8 = j16;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j18) << c14) & j18 & j14) == j14) {
                                                                        if (i27 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i27++;
                                                                        jArr4 = jArr5;
                                                                        j16 = j8;
                                                                        i26 = 8;
                                                                    } else {
                                                                        int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                                                        for (int i29 = 0; i29 < i28; i29++) {
                                                                            if ((j18 & 255) < 128) {
                                                                                j15 = j18;
                                                                                int i30 = (i27 << 3) + i29;
                                                                                if (!((p2) objArr[i30]).b()) {
                                                                                    u0Var.m(i30);
                                                                                }
                                                                            } else {
                                                                                j15 = j18;
                                                                            }
                                                                            j18 = j15 >> i26;
                                                                        }
                                                                        if (i28 != i26) {
                                                                            break;
                                                                        }
                                                                        if (i27 != length2) {
                                                                            break;
                                                                        }
                                                                        i27++;
                                                                        jArr4 = jArr5;
                                                                        j16 = j8;
                                                                        i26 = 8;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    z3.q.f202125a.getClass();
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j8 = j16;
                                                        }
                                                        zB = u0Var.b();
                                                    } else {
                                                        i14 = i24;
                                                        jArr2 = jArr3;
                                                        lVar3 = lVar4;
                                                        j8 = j16;
                                                        obj2.getClass();
                                                        zB = !((p2) obj2).b();
                                                    }
                                                    if (zB) {
                                                        t0Var.l(i25);
                                                    }
                                                    i15 = 8;
                                                } else {
                                                    i14 = i24;
                                                    jArr2 = jArr3;
                                                    lVar3 = lVar4;
                                                    j8 = j16;
                                                    c14 = c15;
                                                    j14 = j17;
                                                    i15 = i18;
                                                }
                                                j16 = j8 >> i15;
                                                i24 = i14 + 1;
                                                i18 = i15;
                                                c15 = c14;
                                                j17 = j14;
                                                lVar4 = lVar3;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            lVar2 = lVar4;
                                            if (i19 != i18) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            lVar2 = lVar4;
                                        }
                                        if (i17 == length) {
                                            break;
                                        }
                                        i17++;
                                        lVar4 = lVar2;
                                        jArr3 = jArr;
                                        i16 = 0;
                                    }
                                } else {
                                    lVar2 = lVar4;
                                }
                                B();
                                Unit unit2 = Unit.INSTANCE;
                                z3.q.f202125a.getClass();
                                Trace.endSection();
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } else {
                            lVar2 = lVar4;
                        }
                        try {
                            if (aVar2.f162078a.c() && this.f135245q == null) {
                                lVar2.b();
                            }
                            return;
                        } finally {
                            lVar2.a();
                        }
                    } catch (Throwable th5) {
                        try {
                            lVarH.e(false);
                            throw th5;
                        } catch (Throwable th6) {
                            th = th6;
                            z3.q.f202125a.getClass();
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
        }
        try {
            if (aVar2.f162078a.c() && this.f135245q == null) {
                lVar4.b();
            }
            throw th;
        } finally {
            lVar4.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[LOOP:2: B:16:0x005a->B:30:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b0 A[EDGE_INSN: B:83:0x00b0->B:32:0x00b0 BREAK  A[LOOP:2: B:16:0x005a->B:30:0x00a1], SYNTHETIC] */
    public final void B() {
        char c14;
        long j8;
        long j14;
        long j15;
        long[] jArr;
        long[] jArr2;
        int i14;
        long j16;
        char c15;
        long j17;
        long j18;
        int i15;
        boolean zB;
        int i16;
        long j19;
        p1.t0<Object, Object> t0Var = this.f135238j;
        long[] jArr3 = t0Var.f134720a;
        int length = jArr3.length - 2;
        char c16 = 7;
        long j24 = -9187201950435737472L;
        int i17 = 8;
        if (length >= 0) {
            int i18 = 0;
            long j25 = 128;
            while (true) {
                long j26 = jArr3[i18];
                j14 = 255;
                if ((((~j26) << c16) & j26 & j24) != j24) {
                    int i19 = 8 - ((~(i18 - length)) >>> 31);
                    int i24 = 0;
                    while (i24 < i19) {
                        if ((j26 & 255) < j25) {
                            c15 = c16;
                            int i25 = (i18 << 3) + i24;
                            j17 = j24;
                            Object obj = t0Var.f134721b[i25];
                            Object obj2 = t0Var.f134722c[i25];
                            boolean z14 = obj2 instanceof p1.u0;
                            p1.t0<Object, Object> t0Var2 = this.f135235g;
                            if (z14) {
                                p1.u0 u0Var = (p1.u0) obj2;
                                Object[] objArr = u0Var.f134733b;
                                long[] jArr4 = u0Var.f134732a;
                                j18 = j25;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j16 = j26;
                                    int i26 = i17;
                                    int i27 = 0;
                                    while (true) {
                                        long j27 = jArr4[i27];
                                        jArr2 = jArr3;
                                        i14 = length;
                                        if ((((~j27) << c15) & j27 & j17) == j17) {
                                            if (i27 != length2) {
                                                break;
                                                break;
                                            }
                                            i27++;
                                            jArr3 = jArr2;
                                            length = i14;
                                            i26 = 8;
                                        } else {
                                            int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                            int i29 = 0;
                                            while (i29 < i28) {
                                                if ((j27 & 255) < j18) {
                                                    i16 = i29;
                                                    int i30 = (i27 << 3) + i16;
                                                    j19 = j27;
                                                    if (!t0Var2.b((e0) objArr[i30])) {
                                                        u0Var.m(i30);
                                                    }
                                                } else {
                                                    i16 = i29;
                                                    j19 = j27;
                                                }
                                                j27 = j19 >> i26;
                                                i29 = i16 + 1;
                                            }
                                            if (i28 != i26) {
                                                break;
                                            }
                                            if (i27 != length2) {
                                                break;
                                            }
                                            i27++;
                                            jArr3 = jArr2;
                                            length = i14;
                                            i26 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i14 = length;
                                    j16 = j26;
                                }
                                zB = u0Var.b();
                            } else {
                                jArr2 = jArr3;
                                i14 = length;
                                j16 = j26;
                                j18 = j25;
                                obj2.getClass();
                                zB = !t0Var2.b((e0) obj2);
                            }
                            if (zB) {
                                t0Var.l(i25);
                            }
                            i15 = 8;
                        } else {
                            jArr2 = jArr3;
                            i14 = length;
                            j16 = j26;
                            c15 = c16;
                            j17 = j24;
                            j18 = j25;
                            i15 = i17;
                        }
                        j26 = j16 >> i15;
                        i24++;
                        i17 = i15;
                        c16 = c15;
                        j24 = j17;
                        j25 = j18;
                        jArr3 = jArr2;
                        length = i14;
                    }
                    jArr = jArr3;
                    int i34 = length;
                    c14 = c16;
                    j8 = j24;
                    j15 = j25;
                    if (i19 != i17) {
                        break;
                    } else {
                        length = i34;
                    }
                } else {
                    jArr = jArr3;
                    c14 = c16;
                    j8 = j24;
                    j15 = j25;
                }
                if (i18 == length) {
                    break;
                }
                i18++;
                c16 = c14;
                j24 = j8;
                j25 = j15;
                jArr3 = jArr;
                i17 = 8;
            }
        } else {
            c14 = 7;
            j8 = -9187201950435737472L;
            j14 = 255;
            j15 = 128;
        }
        p1.u0<p2> u0Var2 = this.f135237i;
        if (!u0Var2.c()) {
            return;
        }
        Object[] objArr2 = u0Var2.f134733b;
        long[] jArr5 = u0Var2.f134732a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i35 = 0;
        while (true) {
            long j28 = jArr5[i35];
            if ((((~j28) << c14) & j28 & j8) != j8) {
                int i36 = 8 - ((~(i35 - length3)) >>> 31);
                for (int i37 = 0; i37 < i36; i37++) {
                    if ((j28 & j14) < j15) {
                        int i38 = (i35 << 3) + i37;
                        if (!(((p2) objArr2[i38]).f135222g != null)) {
                            u0Var2.m(i38);
                        }
                    }
                    j28 >>= 8;
                }
                if (i36 != 8) {
                    return;
                }
            }
            if (i35 == length3) {
                return;
            } else {
                i35++;
            }
        }
    }

    public final boolean C() {
        boolean z14;
        synchronized (this.f135232d) {
            z14 = true;
            if (this.f135251y != 1) {
                z14 = false;
            }
            if (z14) {
                this.f135251y = 0;
            }
        }
        return z14;
    }

    public final g2 D(boolean z14, e23.p pVar) {
        if (this.f135245q != null) {
            j2.b("A pausable composition is in progress");
        }
        g2 g2Var = new g2(this, this.f135229a, this.f135250x, this.f135233e, pVar, z14, this.f135230b, this.f135232d);
        this.f135245q = g2Var;
        return g2Var;
    }

    public final void E() {
        Object obj = s.f135268a;
        AtomicReference<Object> atomicReference = this.f135231c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                n.b("pending composition has not been applied");
                o2.c.f();
                return;
            }
            if (andSet instanceof Set) {
                z((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                n.b("corrupt pendingModifications drain: " + atomicReference);
                o2.c.f();
                return;
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                z(set, true);
            }
        }
    }

    public final void F() {
        AtomicReference<Object> atomicReference = this.f135231c;
        Object andSet = atomicReference.getAndSet(null);
        if (p005kotlin.jvm.internal.s.g(andSet, s.f135268a)) {
            return;
        }
        if (andSet instanceof Set) {
            z((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                z(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.f135245q == null) {
                n.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            n.b("corrupt pendingModifications drain: " + atomicReference);
            o2.c.f();
        }
    }

    public final void G() {
        p13.l0 l0Var = p13.l0.f134950a;
        AtomicReference<Object> atomicReference = this.f135231c;
        Object andSet = atomicReference.getAndSet(l0Var);
        if (p005kotlin.jvm.internal.s.g(andSet, s.f135268a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            z((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            n.b("corrupt pendingModifications drain: " + atomicReference);
            o2.c.f();
            return;
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            z(set, false);
        }
    }

    public final void H() {
        String str;
        int i14 = this.f135251y;
        if (i14 != 0) {
            if (i14 == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i14 != 2) {
                str = i14 != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            j2.b(str);
        }
        if (this.f135245q == null) {
            return;
        }
        j2.b("A pausable composition is in progress");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf A[Catch: all -> 0x0042, LOOP:0: B:48:0x0088->B:60:0x00bf, LOOP_END, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0066, B:40:0x006c, B:41:0x0072, B:43:0x0078, B:45:0x007c, B:48:0x0088, B:50:0x0098, B:52:0x00a4, B:54:0x00ad, B:57:0x00b7, B:60:0x00bf, B:61:0x00c2, B:64:0x00c7), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7 A[Catch: all -> 0x0042, EDGE_INSN: B:64:0x00c7->B:65:0x00cc BREAK  A[LOOP:0: B:48:0x0088->B:60:0x00bf], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0066, B:40:0x006c, B:41:0x0072, B:43:0x0078, B:45:0x007c, B:48:0x0088, B:50:0x0098, B:52:0x00a4, B:54:0x00ad, B:57:0x00b7, B:60:0x00bf, B:61:0x00c2, B:64:0x00c7), top: B:77:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c7 A[SYNTHETIC] */
    public final x0 I(p2 p2Var, b bVar, Object obj) {
        synchronized (this.f135232d) {
            try {
                r rVar = this.f135246r;
                r rVar2 = null;
                if (rVar != null) {
                    s3.i iVar = this.f135234f;
                    int i14 = this.f135247t;
                    if (iVar.f156354g) {
                        n.a("Writer is active");
                    }
                    if (i14 < 0 || i14 >= iVar.f156349b) {
                        n.a("Invalid group index");
                    }
                    s3.b bVarF = oc.b.f(bVar);
                    if (iVar.i(bVarF)) {
                        int iA = s3.k.a(i14, iVar.f156348a) + i14;
                        int i15 = bVarF.f156318a;
                        if (i14 > i15 || i15 >= iA) {
                            rVar = null;
                        }
                    } else {
                        rVar = null;
                    }
                    rVar2 = rVar;
                }
                if (rVar2 == null) {
                    o0 o0Var = this.f135250x;
                    if (o0Var.G && o0Var.K0(p2Var, obj)) {
                        return x0.IMMINENT;
                    }
                    if (obj != null) {
                        boolean z14 = obj instanceof e0;
                        p1.t0<Object, Object> t0Var = this.f135242n;
                        if (z14) {
                            Object objD = t0Var.d(p2Var);
                            if (objD == null) {
                                q3.f.a(this.f135242n, p2Var, obj);
                                break;
                            }
                            if (objD instanceof p1.u0) {
                                p1.u0 u0Var = (p1.u0) objD;
                                Object[] objArr = u0Var.f134733b;
                                long[] jArr = u0Var.f134732a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    q3.f.a(this.f135242n, p2Var, obj);
                                    break;
                                }
                                int i16 = 0;
                                loop0: while (true) {
                                    long j8 = jArr[i16];
                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((255 & j8) < 128 && objArr[(i16 << 3) + i18] == d3.f135065a) {
                                                break loop0;
                                            }
                                            j8 >>= 8;
                                        }
                                        if (i17 == 8) {
                                            if (i16 == length) {
                                                i16++;
                                            }
                                        }
                                        q3.f.a(this.f135242n, p2Var, obj);
                                        break;
                                    }
                                    if (i16 == length) {
                                        q3.f.a(this.f135242n, p2Var, obj);
                                        break;
                                    }
                                    i16++;
                                }
                            } else {
                                if (objD != d3.f135065a) {
                                    q3.f.a(this.f135242n, p2Var, obj);
                                    break;
                                }
                            }
                        } else {
                            t0Var.m(p2Var, d3.f135065a);
                        }
                    } else {
                        this.f135242n.m(p2Var, d3.f135065a);
                    }
                }
                if (rVar2 != null) {
                    return rVar2.I(p2Var, bVar, obj);
                }
                this.f135229a.n(this);
                return this.f135250x.G ? x0.DEFERRED : x0.SCHEDULED;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void J(Object obj) {
        Object objD = this.f135235g.d(obj);
        if (objD == null) {
            return;
        }
        boolean z14 = objD instanceof p1.u0;
        p1.t0<Object, Object> t0Var = this.f135241m;
        if (!z14) {
            p2 p2Var = (p2) objD;
            if (p2Var.c(obj) == x0.IMMINENT) {
                q3.f.a(t0Var, obj, p2Var);
                return;
            }
            return;
        }
        p1.u0 u0Var = (p1.u0) objD;
        Object[] objArr = u0Var.f134733b;
        long[] jArr = u0Var.f134732a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j8 = jArr[i14];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j8) < 128) {
                        p2 p2Var2 = (p2) objArr[(i14 << 3) + i16];
                        if (p2Var2.c(obj) == x0.IMMINENT) {
                            q3.f.a(t0Var, obj, p2Var2);
                        }
                    }
                    j8 >>= 8;
                }
                if (i15 != 8) {
                    return;
                }
            }
            if (i14 == length) {
                return;
            } else {
                i14++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2 A[LOOP:0: B:30:0x007b->B:45:0x00d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00da A[EDGE_INSN: B:52:0x00da->B:46:0x00da BREAK  A[LOOP:0: B:30:0x007b->B:45:0x00d2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // p3.c0, p3.q2
    public final void a(Object obj) {
        p2 p2VarN0;
        int i14;
        boolean z14;
        o0 o0Var = this.f135250x;
        if (o0Var.B <= 0 && (p2VarN0 = o0Var.n0()) != null) {
            int i15 = p2VarN0.f135217b | 1;
            p2VarN0.f135217b = i15;
            if ((i15 & 32) == 0) {
                p1.p0<Object> p0Var = p2VarN0.f135221f;
                if (p0Var == null) {
                    p0Var = new p1.p0<>(0, 1, null);
                    p2VarN0.f135221f = p0Var;
                }
                int i16 = p2VarN0.f135220e;
                int iE = p0Var.e(obj);
                if (iE < 0) {
                    iE = ~iE;
                    i14 = -1;
                } else {
                    i14 = p0Var.f134875c[iE];
                }
                p0Var.f134874b[iE] = obj;
                p0Var.f134875c[iE] = i16;
                if (i14 == p2VarN0.f135220e) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            this.f135248v.a();
            if (z14) {
                return;
            }
            if (obj instanceof f4.h0) {
                int i17 = f4.d.f68726b;
                ((f4.h0) obj).C(1);
            }
            q3.f.a(this.f135235g, obj, p2VarN0);
            if (obj instanceof e0) {
                e0<?> e0Var = (e0) obj;
                d0.a aVarR = e0Var.r();
                p1.t0<Object, Object> t0Var = this.f135238j;
                q3.f.c(t0Var, obj);
                p1.y0<f4.g0> y0Var = aVarR.f135062e;
                Object[] objArr = y0Var.f134874b;
                long[] jArr = y0Var.f134873a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j8 = jArr[i18];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i18 != length) {
                                break;
                                break;
                            }
                            i18++;
                        } else {
                            int i19 = 8;
                            int i24 = 8 - ((~(i18 - length)) >>> 31);
                            int i25 = 0;
                            while (i25 < i24) {
                                if ((j8 & 255) < 128) {
                                    f4.g0 g0Var = (f4.g0) objArr[(i18 << 3) + i25];
                                    if (g0Var instanceof f4.h0) {
                                        int i26 = f4.d.f68726b;
                                        ((f4.h0) g0Var).C(1);
                                    }
                                    q3.f.a(t0Var, g0Var, obj);
                                }
                                j8 >>= i19;
                                i25++;
                                i19 = i19;
                            }
                            if (i24 != i19) {
                                break;
                            } else if (i18 != length) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                Object obj2 = aVarR.f135063f;
                p1.t0<e0<?>, Object> t0Var2 = p2VarN0.f135222g;
                if (t0Var2 == null) {
                    t0Var2 = new p1.t0<>(0, 1, null);
                    p2VarN0.f135222g = t0Var2;
                }
                t0Var2.m(e0Var, obj2);
            }
        }
    }

    @Override // p3.o
    public final boolean b() {
        return this.f135251y == 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.c0
    public final void c(ArrayList arrayList) {
        p1.v0 v0Var = this.f135233e;
        o0 o0Var = this.f135250x;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (!p005kotlin.jvm.internal.s.g(((j1) ((o13.p) arrayList.get(i14)).f128594a).f135125c, this)) {
                n.a("Check failed");
                break;
            }
        }
        try {
            o0Var.q0(arrayList);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th3) {
            try {
                if (!v0Var.f134746a.b()) {
                    z3.l lVar = this.f135249w;
                    try {
                        lVar.g(v0Var, o0Var.T());
                        lVar.b();
                    } finally {
                        lVar.a();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                x();
                throw th4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.c0
    public final void d(q3.e eVar) {
        Object obj;
        while (true) {
            Object obj2 = this.f135231c.get();
            if (obj2 == null || obj2.equals(s.f135268a)) {
                obj = eVar;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, eVar};
            } else {
                if (!(obj2 instanceof Object[])) {
                    androidx.core.view.j.x(this.f135231c, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = eVar;
                obj = objArrCopyOf;
            }
            AtomicReference<Object> atomicReference = this.f135231c;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f135232d) {
                            F();
                            Unit unit = Unit.INSTANCE;
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    @Override // p3.b3
    public final void deactivate() {
        synchronized (this.f135232d) {
            try {
                if (this.f135245q != null) {
                    j2.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z14 = this.f135234f.f156349b == 0;
                if (!z14 || !this.f135233e.f134746a.b()) {
                    z3.q.f202125a.getClass();
                    Trace.beginSection("Compose:deactivate");
                    try {
                        z3.l lVar = this.f135249w;
                        try {
                            lVar.g(this.f135233e, this.f135250x.T());
                            if (!z14) {
                                this.f135230b.onBeginChanges();
                                s3.i iVar = this.f135234f;
                                z3.l lVar2 = this.f135249w;
                                s3.l lVarH = iVar.h();
                                try {
                                    lVarH.n(lVarH.f156382t, new oo0.f(8, lVar2, lVarH));
                                    Unit unit = Unit.INSTANCE;
                                    lVarH.e(true);
                                    this.f135230b.onEndChanges();
                                    lVar.c();
                                } catch (Throwable th3) {
                                    lVarH.e(false);
                                    throw th3;
                                }
                            }
                            lVar.b();
                            lVar.a();
                            Unit unit2 = Unit.INSTANCE;
                            Trace.endSection();
                        } catch (Throwable th4) {
                            lVar.a();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        z3.q.f202125a.getClass();
                        Trace.endSection();
                        throw th5;
                    }
                }
                this.f135235g.g();
                this.f135238j.g();
                this.f135242n.g();
                this.f135239k.a();
                this.f135240l.a();
                o0 o0Var = this.f135250x;
                o0Var.F.clear();
                o0Var.f135195t.clear();
                o0Var.f135181f.a();
                o0Var.f135198w = null;
                this.f135251y = 1;
                Unit unit3 = Unit.INSTANCE;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    @Override // p3.o
    public final void dispose() {
        synchronized (this.f135232d) {
            try {
                if (this.f135250x.G) {
                    j2.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f135251y != 3) {
                    this.f135251y = 3;
                    h.f135102a.getClass();
                    this.f135252z = h.f135104c;
                    t3.a aVar = this.f135250x.M;
                    if (aVar != null) {
                        A(aVar);
                    }
                    boolean z14 = this.f135234f.f156349b == 0;
                    if (!z14 || !this.f135233e.f134746a.b()) {
                        z3.l lVar = this.f135249w;
                        try {
                            lVar.g(this.f135233e, this.f135250x.T());
                            if (!z14) {
                                this.f135230b.onBeginChanges();
                                s3.i iVar = this.f135234f;
                                z3.l lVar2 = this.f135249w;
                                s3.l lVarH = iVar.h();
                                try {
                                    x1 x1Var = n.f135158a;
                                    lVarH.n(lVarH.f156382t, new ov1.q(lVar2, 4));
                                    lVarH.J();
                                    Unit unit = Unit.INSTANCE;
                                    lVarH.e(true);
                                    this.f135230b.clear();
                                    this.f135230b.onEndChanges();
                                    lVar.c();
                                } catch (Throwable th3) {
                                    lVarH.e(false);
                                    throw th3;
                                }
                            }
                            lVar.b();
                            lVar.a();
                        } catch (Throwable th4) {
                            lVar.a();
                            throw th4;
                        }
                    }
                    this.f135250x.d0();
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th5) {
                throw th5;
            }
        }
        this.f135229a.y(this);
    }

    @Override // p3.q2
    public final void e() {
        this.f135243o = true;
        this.f135248v.a();
    }

    @Override // p3.c0
    public final boolean f() {
        synchronized (this.f135232d) {
            g2 g2Var = this.f135245q;
            boolean z14 = false;
            if (g2Var != null && (g2Var.f135095h.get() != h2.Recomposing || g2Var.f135096i != z3.k.a())) {
                AtomicReference<h2> atomicReference = g2Var.f135095h;
                h2 h2Var = h2.ApplyPending;
                h2 h2Var2 = h2.RecomposePending;
                while (!atomicReference.compareAndSet(h2Var, h2Var2) && atomicReference.get() == h2Var) {
                }
                g2Var.f135099l.f135370a.d(9);
                return false;
            }
            E();
            try {
                p1.t0<Object, Object> t0Var = this.f135242n;
                this.f135242n = p1.g1.b();
                try {
                    o0 o0Var = this.f135250x;
                    e3 e3Var = this.f135244p;
                    g gVar = o0Var.f135181f;
                    if (!gVar.b()) {
                        n.a("Expected applyChanges() to have been called");
                    }
                    if (t0Var.f134724e > 0 || !o0Var.f135195t.isEmpty()) {
                        o0Var.Q = e3Var;
                        try {
                            o0Var.e0(t0Var, null);
                            o0Var.Q = null;
                            z14 = !gVar.b();
                        } catch (Throwable th3) {
                            o0Var.Q = null;
                            throw th3;
                        }
                    }
                    if (!z14) {
                        F();
                    }
                    return z14;
                } catch (Throwable th4) {
                    this.f135242n = t0Var;
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    if (!this.f135233e.f134746a.b()) {
                        z3.l lVar = this.f135249w;
                        try {
                            lVar.g(this.f135233e, this.f135250x.T());
                            lVar.b();
                        } finally {
                            lVar.a();
                        }
                    }
                    throw th5;
                } catch (Throwable th6) {
                    x();
                    throw th6;
                }
            }
        }
    }

    @Override // p3.c0
    public final e3 g(e3 e3Var) {
        e3 e3Var2 = this.f135244p;
        this.f135244p = e3Var;
        return e3Var2;
    }

    @Override // p3.c0
    public final void h(oe.j jVar) {
        o0 o0Var = this.f135250x;
        if (o0Var.G) {
            n.a("Preparing a composition while composing is not supported");
        }
        o0Var.G = true;
        try {
            jVar.invoke();
        } finally {
            o0Var.G = false;
        }
    }

    @Override // p3.c0
    public final void i() {
        synchronized (this.f135232d) {
            try {
                A(this.f135239k);
                F();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                try {
                    if (!this.f135233e.f134746a.b()) {
                        z3.l lVar = this.f135249w;
                        try {
                            lVar.g(this.f135233e, this.f135250x.T());
                            lVar.b();
                        } finally {
                            lVar.a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    x();
                    throw th4;
                }
            }
        }
    }

    @Override // p3.c0
    public final void invalidateAll() {
        for (Object obj : this.f135234f.f156350c) {
            o2 o2Var = obj instanceof o2 ? (o2) obj : null;
            if (o2Var != null) {
                o2Var.invalidate();
            }
        }
    }

    @Override // p3.c0
    public final void j(e23.p<? super m, ? super Integer, Unit> pVar) {
        try {
            synchronized (this.f135232d) {
                E();
                p1.t0<Object, Object> t0Var = this.f135242n;
                this.f135242n = p1.g1.b();
                try {
                    o0 o0Var = this.f135250x;
                    e3 e3Var = this.f135244p;
                    if (!o0Var.f135181f.b()) {
                        n.a("Expected applyChanges() to have been called");
                    }
                    o0Var.Q = e3Var;
                    try {
                        o0Var.e0(t0Var, pVar);
                        o0Var.Q = null;
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        o0Var.Q = null;
                        throw th3;
                    }
                } catch (Throwable th4) {
                    this.f135242n = t0Var;
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                if (!this.f135233e.f134746a.b()) {
                    z3.l lVar = this.f135249w;
                    try {
                        lVar.g(this.f135233e, this.f135250x.T());
                        lVar.b();
                    } finally {
                        lVar.a();
                    }
                }
                throw th5;
            } catch (Throwable th6) {
                x();
                throw th6;
            }
        }
    }

    @Override // p3.c0
    public final <R> R k(c0 c0Var, int i14, e23.a<? extends R> aVar) {
        if (c0Var == null || c0Var.equals(this) || i14 < 0) {
            return aVar.invoke();
        }
        this.f135246r = (r) c0Var;
        this.f135247t = i14;
        try {
            return aVar.invoke();
        } finally {
            this.f135246r = null;
            this.f135247t = 0;
        }
    }

    @Override // p3.d2
    public final g2 l(e23.p pVar) {
        C();
        H();
        return D(true, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    @Override // p3.c0
    public final boolean m(Set<? extends Object> set) {
        boolean z14 = set instanceof q3.e;
        p1.t0<Object, Object> t0Var = this.f135238j;
        p1.t0<Object, Object> t0Var2 = this.f135235g;
        if (z14) {
            p1.h1<T> h1Var = ((q3.e) set).f142365a;
            Object[] objArr = h1Var.f134733b;
            long[] jArr = h1Var.f134732a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                loop0: while (true) {
                    long j8 = jArr[i14];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((255 & j8) < 128) {
                                Object obj = objArr[(i14 << 3) + i16];
                                if (t0Var2.b(obj) || t0Var.b(obj)) {
                                    break loop0;
                                }
                            }
                            j8 >>= 8;
                        }
                        if (i15 == 8) {
                            if (i14 != length) {
                                i14++;
                            }
                        }
                    } else if (i14 != length) {
                        i14++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (t0Var2.b(obj2) || t0Var.b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p3.c0
    public final void n() {
        synchronized (this.f135232d) {
            try {
                this.f135250x.f135198w = null;
                if (!this.f135233e.f134746a.b()) {
                    z3.l lVar = this.f135249w;
                    try {
                        lVar.g(this.f135233e, this.f135250x.T());
                        lVar.b();
                        lVar.a();
                    } catch (Throwable th3) {
                        lVar.a();
                        throw th3;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th4) {
                try {
                    if (!this.f135233e.f134746a.b()) {
                        z3.l lVar2 = this.f135249w;
                        try {
                            lVar2.g(this.f135233e, this.f135250x.T());
                            lVar2.b();
                        } finally {
                            lVar2.a();
                        }
                    }
                    throw th4;
                } catch (Throwable th5) {
                    x();
                    throw th5;
                }
            }
        }
    }

    @Override // p3.c0
    public final void o() {
        synchronized (this.f135232d) {
            try {
                if (!this.f135240l.b()) {
                    A(this.f135240l);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                try {
                    if (!this.f135233e.f134746a.b()) {
                        z3.l lVar = this.f135249w;
                        try {
                            lVar.g(this.f135233e, this.f135250x.T());
                            lVar.b();
                        } finally {
                            lVar.a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    x();
                    throw th4;
                }
            }
        }
    }

    @Override // p3.b3
    public final void p(e23.p<? super m, ? super Integer, Unit> pVar) {
        C();
        H();
        o0 o0Var = this.f135250x;
        o0Var.X();
        this.f135252z = pVar;
        this.f135229a.a(this, pVar);
        o0Var.S();
    }

    @Override // p3.d2
    public final g2 q(e23.p pVar) {
        return D(C(), pVar);
    }

    @Override // p3.o
    public final void r(e23.p<? super m, ? super Integer, Unit> pVar) {
        boolean zC = C();
        H();
        p pVar2 = this.f135229a;
        if (!zC) {
            this.f135252z = pVar;
            pVar2.a(this, pVar);
            return;
        }
        o0 o0Var = this.f135250x;
        o0Var.X();
        this.f135252z = pVar;
        pVar2.a(this, pVar);
        o0Var.S();
    }

    @Override // p3.q2
    public final x0 s(p2 p2Var, Object obj) {
        r rVar;
        int i14 = p2Var.f135217b;
        if ((i14 & 2) != 0) {
            p2Var.f135217b = i14 | 4;
        }
        s3.b bVar = p2Var.f135218c;
        if (bVar == null || !bVar.getValid()) {
            return x0.IGNORED;
        }
        s3.i iVar = this.f135234f;
        iVar.getClass();
        s3.b bVar2 = p2Var.f135218c;
        if (bVar2 != null && iVar.i(oc.b.f(bVar2))) {
            if (p2Var.f135219d == null) {
                return x0.IGNORED;
            }
            x0 x0VarI = I(p2Var, bVar, obj);
            if (x0VarI != x0.IGNORED) {
                this.f135248v.a();
            }
            return x0VarI;
        }
        synchronized (this.f135232d) {
            rVar = this.f135246r;
        }
        if (rVar != null) {
            o0 o0Var = rVar.f135250x;
            if (o0Var.G && o0Var.K0(p2Var, obj)) {
                return x0.IMMINENT;
            }
        }
        return x0.IGNORED;
    }

    @Override // p3.c0
    public final void t(i1 i1Var) {
        z3.l lVar = this.f135249w;
        try {
            lVar.g(this.f135233e, this.f135250x.T());
            i1Var.f135114a.a(lVar);
            lVar.c();
        } finally {
            lVar.a();
        }
    }

    @Override // p3.c0
    public final boolean u() {
        return this.f135250x.G;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c, B:25:0x0061), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    @Override // p3.c0
    public final void v(Object obj) {
        synchronized (this.f135232d) {
            try {
                J(obj);
                Object objD = this.f135238j.d(obj);
                if (objD != null) {
                    if (objD instanceof p1.u0) {
                        p1.u0 u0Var = (p1.u0) objD;
                        Object[] objArr = u0Var.f134733b;
                        long[] jArr = u0Var.f134732a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j8 = jArr[i14];
                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i14 != length) {
                                        break;
                                        break;
                                    }
                                    i14++;
                                } else {
                                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        if ((255 & j8) < 128) {
                                            J((e0) objArr[(i14 << 3) + i16]);
                                        }
                                        j8 >>= 8;
                                    }
                                    if (i15 != 8) {
                                        break;
                                    } else if (i14 != length) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                    } else {
                        J((e0) objD);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p3.o
    public final boolean w() {
        boolean z14;
        synchronized (this.f135232d) {
            z14 = this.f135242n.f134724e > 0;
        }
        return z14;
    }

    @Override // p3.c0
    public final void x() {
        this.f135231c.set(null);
        this.f135239k.a();
        this.f135240l.a();
        p1.v0 v0Var = this.f135233e;
        if (v0Var.f134746a.b()) {
            return;
        }
        z3.l lVar = this.f135249w;
        try {
            lVar.g(v0Var, this.f135250x.T());
            lVar.b();
        } finally {
            lVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    public final void y(Object obj, boolean z14) {
        int i14;
        Object objD = this.f135235g.d(obj);
        if (objD == null) {
            return;
        }
        boolean z15 = objD instanceof p1.u0;
        p1.u0<p2> u0Var = this.f135236h;
        p1.u0<p2> u0Var2 = this.f135237i;
        p1.t0<Object, Object> t0Var = this.f135241m;
        if (!z15) {
            p2 p2Var = (p2) objD;
            if (q3.f.b(t0Var, obj, p2Var) || p2Var.c(obj) == x0.IGNORED) {
                return;
            }
            if (p2Var.f135222g == null || z14) {
                u0Var.d(p2Var);
                return;
            } else {
                u0Var2.d(p2Var);
                return;
            }
        }
        p1.u0 u0Var3 = (p1.u0) objD;
        Object[] objArr = u0Var3.f134733b;
        long[] jArr = u0Var3.f134732a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j8 = jArr[i15];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((255 & j8) < 128) {
                        p2 p2Var2 = (p2) objArr[(i15 << 3) + i18];
                        if (q3.f.b(t0Var, obj, p2Var2)) {
                            i14 = i16;
                        } else {
                            i14 = i16;
                            if (p2Var2.c(obj) != x0.IGNORED) {
                                if (p2Var2.f135222g == null || z14) {
                                    u0Var.d(p2Var2);
                                } else {
                                    u0Var2.d(p2Var2);
                                }
                            }
                        }
                    } else {
                        i14 = i16;
                    }
                    j8 >>= i14;
                    i18++;
                    i16 = i14;
                }
                if (i17 != i16) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x023c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x023e A[LOOP:6: B:96:0x01ea->B:113:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x024b A[EDGE_INSN: B:206:0x024b->B:115:0x024b BREAK  A[LOOP:6: B:96:0x01ea->B:113:0x023e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0196 A[EDGE_INSN: B:221:0x0196->B:77:0x0196 BREAK  A[LOOP:13: B:64:0x015a->B:75:0x018e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x018e A[LOOP:13: B:64:0x015a->B:75:0x018e, LOOP_END] */
    public final void z(Set<? extends Object> set, boolean z14) {
        long j8;
        long j14;
        long j15;
        char c14;
        long[] jArr;
        long[] jArr2;
        long j16;
        boolean zA;
        long[] jArr3;
        long j17;
        long[] jArr4;
        long[] jArr5;
        int i14;
        long j18;
        boolean zB;
        int i15;
        long j19;
        long[] jArr6;
        long[] jArr7;
        char c15;
        long j24;
        int i16;
        int i17;
        boolean z15 = set instanceof q3.e;
        p1.t0<Object, Object> t0Var = this.f135238j;
        Object obj = null;
        int i18 = 8;
        if (z15) {
            p1.h1<T> h1Var = ((q3.e) set).f142365a;
            Object[] objArr = h1Var.f134733b;
            long[] jArr8 = h1Var.f134732a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i19 = 0;
                j8 = 128;
                j14 = 255;
                while (true) {
                    long j25 = jArr8[i19];
                    char c16 = 7;
                    j15 = -9187201950435737472L;
                    if ((((~j25) << 7) & j25 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i24 = 8 - ((~(i19 - length)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j25 & 255) < 128) {
                                Object obj2 = objArr[(i19 << 3) + i25];
                                c15 = c16;
                                if (obj2 instanceof p2) {
                                    ((p2) obj2).c(obj);
                                    jArr7 = jArr8;
                                    j24 = j25;
                                    i16 = length;
                                } else {
                                    y(obj2, z14);
                                    Object objD = t0Var.d(obj2);
                                    if (objD == null) {
                                        jArr7 = jArr8;
                                        j24 = j25;
                                        i16 = length;
                                    } else if (objD instanceof p1.u0) {
                                        p1.u0 u0Var = (p1.u0) objD;
                                        Object[] objArr2 = u0Var.f134733b;
                                        long[] jArr9 = u0Var.f134732a;
                                        int length2 = jArr9.length - 2;
                                        if (length2 >= 0) {
                                            int i26 = i18;
                                            i16 = length;
                                            int i27 = 0;
                                            while (true) {
                                                long j26 = jArr9[i27];
                                                j24 = j25;
                                                long[] jArr10 = jArr9;
                                                if ((((~j26) << c15) & j26 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                                    int i29 = 0;
                                                    while (i29 < i28) {
                                                        if ((j26 & 255) < 128) {
                                                            y((e0) objArr2[(i27 << 3) + i29], z14);
                                                        }
                                                        j26 >>= i26;
                                                        i29++;
                                                        jArr8 = jArr8;
                                                    }
                                                    jArr7 = jArr8;
                                                    if (i28 != i26) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr7 = jArr8;
                                                }
                                                if (i27 == length2) {
                                                    break;
                                                }
                                                i27++;
                                                jArr9 = jArr10;
                                                j25 = j24;
                                                jArr8 = jArr7;
                                                i26 = 8;
                                            }
                                        } else {
                                            jArr7 = jArr8;
                                            j24 = j25;
                                            i16 = length;
                                        }
                                    } else {
                                        jArr7 = jArr8;
                                        j24 = j25;
                                        i16 = length;
                                        y((e0) objD, z14);
                                    }
                                    Unit unit = Unit.INSTANCE;
                                }
                                i17 = 8;
                            } else {
                                jArr7 = jArr8;
                                c15 = c16;
                                j24 = j25;
                                i16 = length;
                                i17 = i18;
                            }
                            j25 = j24 >> i17;
                            i25++;
                            length = i16;
                            i18 = i17;
                            c16 = c15;
                            jArr8 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr8;
                        c14 = c16;
                        int i30 = length;
                        if (i24 != i18) {
                            break;
                        } else {
                            length = i30;
                        }
                    } else {
                        jArr6 = jArr8;
                        c14 = 7;
                    }
                    if (i19 == length) {
                        break;
                    }
                    i19++;
                    jArr8 = jArr6;
                    obj = null;
                    i18 = 8;
                }
            } else {
                j8 = 128;
                j14 = 255;
                j15 = -9187201950435737472L;
                c14 = 7;
            }
        } else {
            j8 = 128;
            j14 = 255;
            j15 = -9187201950435737472L;
            c14 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof p2) {
                    ((p2) obj3).c(null);
                } else {
                    y(obj3, z14);
                    Object objD2 = t0Var.d(obj3);
                    if (objD2 != null) {
                        if (objD2 instanceof p1.u0) {
                            p1.u0 u0Var2 = (p1.u0) objD2;
                            Object[] objArr3 = u0Var2.f134733b;
                            long[] jArr11 = u0Var2.f134732a;
                            int length3 = jArr11.length - 2;
                            if (length3 >= 0) {
                                int i34 = 0;
                                while (true) {
                                    long j27 = jArr11[i34];
                                    if ((((~j27) << 7) & j27 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i34 != length3) {
                                            break;
                                            break;
                                        }
                                        i34++;
                                    } else {
                                        int i35 = 8 - ((~(i34 - length3)) >>> 31);
                                        for (int i36 = 0; i36 < i35; i36++) {
                                            if ((j27 & 255) < 128) {
                                                y((e0) objArr3[(i34 << 3) + i36], z14);
                                            }
                                            j27 >>= 8;
                                        }
                                        if (i35 != 8) {
                                            break;
                                        } else if (i34 != length3) {
                                            break;
                                        } else {
                                            i34++;
                                        }
                                    }
                                }
                            }
                        } else {
                            y((e0) objD2, z14);
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        p1.t0<Object, Object> t0Var2 = this.f135235g;
        p1.u0<p2> u0Var3 = this.f135236h;
        if (z14) {
            p1.u0<p2> u0Var4 = this.f135237i;
            if (u0Var4.c()) {
                long[] jArr12 = t0Var2.f134720a;
                int length4 = jArr12.length - 2;
                if (length4 >= 0) {
                    int i37 = 0;
                    while (true) {
                        long j28 = jArr12[i37];
                        if ((((~j28) << c14) & j28 & j15) != j15) {
                            int i38 = 8 - ((~(i37 - length4)) >>> 31);
                            int i39 = 0;
                            while (i39 < i38) {
                                if ((j28 & j14) < j8) {
                                    int i44 = (i37 << 3) + i39;
                                    Object obj4 = t0Var2.f134721b[i44];
                                    Object obj5 = t0Var2.f134722c[i44];
                                    if (obj5 instanceof p1.u0) {
                                        p1.u0 u0Var5 = (p1.u0) obj5;
                                        Object[] objArr4 = u0Var5.f134733b;
                                        long[] jArr13 = u0Var5.f134732a;
                                        int length5 = jArr13.length - 2;
                                        if (length5 >= 0) {
                                            j18 = j28;
                                            int i45 = 0;
                                            while (true) {
                                                long j29 = jArr13[i45];
                                                jArr5 = jArr12;
                                                i14 = length4;
                                                if ((((~j29) << c14) & j29 & j15) != j15) {
                                                    int i46 = 8 - ((~(i45 - length5)) >>> 31);
                                                    for (int i47 = 0; i47 < i46; i47 = i15 + 1) {
                                                        if ((j29 & j14) < j8) {
                                                            i15 = i47;
                                                            int i48 = (i45 << 3) + i15;
                                                            j19 = j29;
                                                            p2 p2Var = (p2) objArr4[i48];
                                                            if (u0Var4.a(p2Var) || u0Var3.a(p2Var)) {
                                                                u0Var5.m(i48);
                                                            }
                                                        } else {
                                                            i15 = i47;
                                                            j19 = j29;
                                                        }
                                                        j29 = j19 >> 8;
                                                    }
                                                    if (i46 != 8) {
                                                        break;
                                                    }
                                                    if (i45 != length5) {
                                                        break;
                                                    }
                                                    i45++;
                                                    length4 = i14;
                                                    jArr12 = jArr5;
                                                } else if (i45 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i45++;
                                                    length4 = i14;
                                                    jArr12 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr12;
                                            i14 = length4;
                                            j18 = j28;
                                        }
                                        zB = u0Var5.b();
                                    } else {
                                        jArr5 = jArr12;
                                        i14 = length4;
                                        j18 = j28;
                                        obj5.getClass();
                                        p2 p2Var2 = (p2) obj5;
                                        zB = u0Var4.a(p2Var2) || u0Var3.a(p2Var2);
                                    }
                                    if (zB) {
                                        t0Var2.l(i44);
                                    }
                                } else {
                                    jArr5 = jArr12;
                                    i14 = length4;
                                    j18 = j28;
                                }
                                j28 = j18 >> 8;
                                i39++;
                                length4 = i14;
                                jArr12 = jArr5;
                            }
                            jArr4 = jArr12;
                            int i49 = length4;
                            if (i38 != 8) {
                                break;
                            } else {
                                length4 = i49;
                            }
                        } else {
                            jArr4 = jArr12;
                        }
                        if (i37 == length4) {
                            break;
                        }
                        i37++;
                        jArr12 = jArr4;
                    }
                }
                u0Var4.e();
                B();
                return;
            }
        }
        if (u0Var3.c()) {
            long[] jArr14 = t0Var2.f134720a;
            int length6 = jArr14.length - 2;
            if (length6 >= 0) {
                int i54 = 0;
                while (true) {
                    long j34 = jArr14[i54];
                    if ((((~j34) << c14) & j34 & j15) != j15) {
                        int i55 = 8 - ((~(i54 - length6)) >>> 31);
                        int i56 = 0;
                        while (i56 < i55) {
                            if ((j34 & j14) < j8) {
                                int i57 = (i54 << 3) + i56;
                                Object obj6 = t0Var2.f134721b[i57];
                                Object obj7 = t0Var2.f134722c[i57];
                                if (obj7 instanceof p1.u0) {
                                    p1.u0 u0Var6 = (p1.u0) obj7;
                                    Object[] objArr5 = u0Var6.f134733b;
                                    long[] jArr15 = u0Var6.f134732a;
                                    int length7 = jArr15.length - 2;
                                    if (length7 >= 0) {
                                        j16 = j34;
                                        int i58 = 0;
                                        while (true) {
                                            long j35 = jArr15[i58];
                                            Object[] objArr6 = objArr5;
                                            long[] jArr16 = jArr15;
                                            if ((((~j35) << c14) & j35 & j15) != j15) {
                                                int i59 = 8 - ((~(i58 - length7)) >>> 31);
                                                int i64 = 0;
                                                while (i64 < i59) {
                                                    if ((j35 & j14) < j8) {
                                                        jArr3 = jArr14;
                                                        int i65 = (i58 << 3) + i64;
                                                        j17 = j35;
                                                        if (u0Var3.a((p2) objArr6[i65])) {
                                                            u0Var6.m(i65);
                                                        }
                                                    } else {
                                                        jArr3 = jArr14;
                                                        j17 = j35;
                                                    }
                                                    i64++;
                                                    jArr14 = jArr3;
                                                    j35 = j17 >> 8;
                                                }
                                                jArr2 = jArr14;
                                                if (i59 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr14;
                                            }
                                            if (i58 == length7) {
                                                break;
                                            }
                                            i58++;
                                            objArr5 = objArr6;
                                            jArr15 = jArr16;
                                            jArr14 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr14;
                                        j16 = j34;
                                    }
                                    zA = u0Var6.b();
                                } else {
                                    jArr2 = jArr14;
                                    j16 = j34;
                                    obj7.getClass();
                                    zA = u0Var3.a((p2) obj7);
                                }
                                if (zA) {
                                    t0Var2.l(i57);
                                }
                            } else {
                                jArr2 = jArr14;
                                j16 = j34;
                            }
                            i56++;
                            j34 = j16 >> 8;
                            jArr14 = jArr2;
                        }
                        jArr = jArr14;
                        if (i55 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr14;
                    }
                    if (i54 == length6) {
                        break;
                    }
                    i54++;
                    jArr14 = jArr;
                }
            }
            B();
            u0Var3.e();
        }
    }
}
