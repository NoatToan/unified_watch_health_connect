package f4;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import p005kotlin.Unit;
import p1.u0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f21.g0 f68773a = new f21.g0(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3.m<f> f68774b = new z3.m<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f68775c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f68776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f68777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f68778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y<g0> f68779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static List<? extends e23.p<? super Set<? extends Object>, ? super f, Unit>> f68780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static List<? extends e23.l<Object, Unit>> f68781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final androidx.compose.runtime.snapshots.a f68782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final z3.b f68783k;

    static {
        j.f68751e.getClass();
        j jVar = j.f68752f;
        f68776d = jVar;
        long j8 = 1;
        f68777e = j8 + j8;
        f68778f = new h();
        f68779g = new y<>();
        p13.j0 j0Var = p13.j0.f134944a;
        f68780h = j0Var;
        f68781i = j0Var;
        long j14 = f68777e;
        f68777e = j8 + j14;
        androidx.compose.runtime.snapshots.a aVar = new androidx.compose.runtime.snapshots.a(j14, jVar);
        f68776d = f68776d.e(aVar.f68737b);
        f68782j = aVar;
        f68783k = new z3.b(0);
    }

    public static final HashMap a(long j8, a aVar, j jVar) {
        long[] jArr;
        j jVar2;
        long[] jArr2;
        int i14;
        int i15;
        i0 i0VarR;
        u0<g0> u0VarX = aVar.x();
        if (u0VarX != null) {
            long f68737b = aVar.getF68737b();
            j jVarD = aVar.getF68736a().e(f68737b).d(aVar.f68712k);
            Object[] objArr = u0VarX.f134733b;
            long[] jArr3 = u0VarX.f134732a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i16 = 0;
                HashMap map = null;
                while (true) {
                    long j14 = jArr3[i16];
                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8;
                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j14 & 255) < 128) {
                                g0 g0Var = (g0) objArr[(i16 << 3) + i19];
                                i0 i0VarM = g0Var.m();
                                jArr2 = jArr3;
                                i14 = i17;
                                i15 = i19;
                                i0 i0VarR2 = r(i0VarM, j8, jVar);
                                if (i0VarR2 != null && (i0VarR = r(i0VarM, f68737b, jVarD)) != null && !i0VarR2.equals(i0VarR)) {
                                    i0 i0VarR3 = r(i0VarM, f68737b, aVar.getF68736a());
                                    if (i0VarR3 == null) {
                                        q();
                                        throw null;
                                    }
                                    i0 i0VarO = g0Var.o(i0VarR, i0VarR2, i0VarR3);
                                    if (i0VarO == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(i0VarR2, i0VarO);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i14 = i17;
                                i15 = i19;
                            }
                            j14 >>= i14;
                            i19 = i15 + 1;
                            i17 = i14;
                            jArr3 = jArr2;
                            jVarD = jVarD;
                        }
                        jArr = jArr3;
                        jVar2 = jVarD;
                        if (i18 != i17) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        jVar2 = jVarD;
                    }
                    if (i16 == length) {
                        return map;
                    }
                    i16++;
                    jArr3 = jArr;
                    jVarD = jVar2;
                }
            }
        }
        return null;
    }

    public static final void b(f fVar) {
        long j8;
        if (f68776d.c(fVar.getF68737b())) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb3.append(fVar.getF68737b());
        sb3.append(", disposed=");
        sb3.append(fVar.f68738c);
        sb3.append(", applied=");
        a aVar = fVar instanceof a ? (a) fVar : null;
        sb3.append(aVar != null ? Boolean.valueOf(aVar.f68715n) : "read-only");
        sb3.append(", lowestPin=");
        synchronized (f68775c) {
            h hVar = f68778f;
            j8 = hVar.f68742a > 0 ? hVar.f68743b[0] : -1L;
        }
        sb3.append(j8);
        throw new IllegalStateException(sb3.toString().toString());
    }

    public static final j c(j jVar, long j8, long j14) {
        while (p005kotlin.jvm.internal.s.i(j8, j14) < 0) {
            jVar = jVar.e(j8);
            j8 += (long) 1;
        }
        return jVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0092 A[Catch: all -> 0x0088, LOOP:1: B:30:0x0058->B:42:0x0092, LOOP_END, TryCatch #1 {all -> 0x0088, blocks: (B:25:0x0049, B:27:0x004e, B:30:0x0058, B:32:0x0068, B:34:0x0074, B:36:0x007d, B:39:0x008a, B:42:0x0092, B:43:0x0095), top: B:52:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0095 A[EDGE_INSN: B:58:0x0095->B:43:0x0095 BREAK  A[LOOP:1: B:30:0x0058->B:42:0x0092], SYNTHETIC] */
    public static final <T> T d(e23.l<? super j, ? extends T> lVar) {
        u0<g0> u0Var;
        T t7;
        androidx.compose.runtime.snapshots.a aVar = f68782j;
        synchronized (f68775c) {
            try {
                u0Var = aVar.f68710i;
                if (u0Var != null) {
                    f68783k.addAndGet(1);
                }
                t7 = (T) u(aVar, lVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (u0Var != null) {
            try {
                List<? extends e23.p<? super Set<? extends Object>, ? super f, Unit>> list = f68780h;
                q3.e eVar = new q3.e(u0Var);
                int i14 = g4.f.f75739a;
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    list.get(i15).invoke(eVar, aVar);
                }
                f68783k.addAndGet(-1);
            } catch (Throwable th4) {
                f68783k.addAndGet(-1);
                throw th4;
            }
        }
        synchronized (f68775c) {
            try {
                e();
                if (u0Var != null) {
                    Object[] objArr = u0Var.f134733b;
                    long[] jArr = u0Var.f134732a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j8 = jArr[i16];
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i16 != length) {
                                    break;
                                    break;
                                }
                                i16++;
                            } else {
                                int i17 = 8 - ((~(i16 - length)) >>> 31);
                                for (int i18 = 0; i18 < i17; i18++) {
                                    if ((255 & j8) < 128) {
                                        p((g0) objArr[(i16 << 3) + i18]);
                                    }
                                    j8 >>= 8;
                                }
                                if (i17 != 8) {
                                    break;
                                }
                                if (i16 != length) {
                                    break;
                                }
                                i16++;
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return t7;
    }

    public static final void e() {
        y<g0> yVar = f68779g;
        int i14 = yVar.f68839a;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i15 >= i14) {
                break;
            }
            z3.r<g0> rVar = yVar.f68841c[i15];
            g0 g0Var = rVar != null ? rVar.get() : null;
            if (g0Var != null && o(g0Var)) {
                if (i16 != i15) {
                    yVar.f68841c[i16] = rVar;
                    int[] iArr = yVar.f68840b;
                    iArr[i16] = iArr[i15];
                }
                i16++;
            }
            i15++;
        }
        for (int i17 = i16; i17 < i14; i17++) {
            yVar.f68841c[i17] = null;
            yVar.f68840b[i17] = 0;
        }
        if (i16 != i14) {
            yVar.f68839a = i16;
        }
    }

    public static final f f(f fVar, e23.l<Object, Unit> lVar, boolean z14) {
        boolean z15 = fVar instanceof a;
        if (z15 || fVar == null) {
            return new m0(z15 ? (a) fVar : null, lVar, null, false, z14);
        }
        return new n0(fVar, lVar, false, z14);
    }

    public static final <T extends i0> T g(T t7) {
        T t14;
        f.f68735e.getClass();
        f fVarI = i();
        T t15 = (T) r(t7, fVarI.getF68737b(), fVarI.getF68736a());
        if (t15 != null) {
            return t15;
        }
        synchronized (f68775c) {
            f fVarI2 = i();
            t14 = (T) r(t7, fVarI2.getF68737b(), fVarI2.getF68736a());
        }
        if (t14 != null) {
            return t14;
        }
        q();
        throw null;
    }

    public static final <T extends i0> T h(T t7, f fVar) {
        T t14;
        T t15 = (T) r(t7, fVar.getF68737b(), fVar.getF68736a());
        if (t15 != null) {
            return t15;
        }
        synchronized (f68775c) {
            t14 = (T) r(t7, fVar.getF68737b(), fVar.getF68736a());
        }
        if (t14 != null) {
            return t14;
        }
        q();
        throw null;
    }

    public static final f i() {
        f fVarA = f68774b.a();
        return fVarA == null ? f68782j : fVarA;
    }

    public static final e23.l j(e23.l lVar, boolean z14, e23.l lVar2) {
        if (!z14) {
            lVar2 = null;
        }
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new k(lVar, lVar2, 0);
    }

    public static final e23.l<Object, Unit> k(e23.l<Object, Unit> lVar, e23.l<Object, Unit> lVar2) {
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new k(lVar, lVar2, 1);
    }

    public static final <T extends i0> T l(T t7, g0 g0Var) {
        long j8 = f68777e;
        h hVar = f68778f;
        if (hVar.f68742a > 0) {
            j8 = hVar.f68743b[0];
        }
        long j14 = j8 - ((long) 1);
        j.f68751e.getClass();
        j jVar = j.f68752f;
        T t14 = null;
        i0 i0Var = null;
        for (i0 i0VarM = g0Var.m(); i0VarM != null; i0VarM = i0VarM.f68750b) {
            long j15 = i0VarM.f68749a;
            if (j15 != 0) {
                if (j15 != 0 && p005kotlin.jvm.internal.s.i(j15, j14) <= 0 && !jVar.c(j15)) {
                    if (i0Var != null) {
                        if (p005kotlin.jvm.internal.s.i(i0VarM.f68749a, i0Var.f68749a) >= 0) {
                            t14 = (T) i0Var;
                            break;
                        }
                        break;
                    }
                    i0Var = i0VarM;
                }
            }
            t14 = (T) i0VarM;
            break;
        }
        if (t14 != null) {
            t14.f68749a = Long.MAX_VALUE;
            return t14;
        }
        T t15 = (T) t7.c(Long.MAX_VALUE);
        t15.f68750b = g0Var.m();
        g0Var.q(t15);
        return t15;
    }

    public static final void m(f fVar, g0 g0Var) {
        fVar.t(fVar.getF68709h() + 1);
        e23.l<Object, Unit> lVarI = fVar.i();
        if (lVarI != null) {
            lVarI.invoke(g0Var);
        }
    }

    public static final i0 n(i0 i0Var, h0 h0Var, f fVar, i0 i0Var2) {
        i0 i0VarL;
        if (fVar.f()) {
            fVar.n(h0Var);
        }
        long f68737b = fVar.getF68737b();
        if (i0Var2.f68749a == f68737b) {
            return i0Var2;
        }
        synchronized (f68775c) {
            i0VarL = l(i0Var, h0Var);
        }
        i0VarL.f68749a = f68737b;
        if (i0Var2.f68749a != 1) {
            fVar.n(h0Var);
        }
        return i0VarL;
    }

    public static final boolean o(g0 g0Var) {
        i0 i0Var;
        long j8 = f68777e;
        h hVar = f68778f;
        if (hVar.f68742a > 0) {
            j8 = hVar.f68743b[0];
        }
        i0 i0Var2 = null;
        i0 i0VarM = null;
        int i14 = 0;
        for (i0 i0VarM2 = g0Var.m(); i0VarM2 != null; i0VarM2 = i0VarM2.f68750b) {
            long j14 = i0VarM2.f68749a;
            if (j14 != 0) {
                if (p005kotlin.jvm.internal.s.i(j14, j8) >= 0) {
                    i14++;
                } else if (i0Var2 == null) {
                    i14++;
                    i0Var2 = i0VarM2;
                } else {
                    if (p005kotlin.jvm.internal.s.i(i0VarM2.f68749a, i0Var2.f68749a) < 0) {
                        i0Var = i0Var2;
                        i0Var2 = i0VarM2;
                    } else {
                        i0Var = i0VarM2;
                    }
                    if (i0VarM == null) {
                        i0VarM = g0Var.m();
                        i0 i0Var3 = i0VarM;
                        while (true) {
                            if (i0VarM == null) {
                                i0VarM = i0Var3;
                                break;
                            }
                            if (p005kotlin.jvm.internal.s.i(i0VarM.f68749a, j8) >= 0) {
                                break;
                            }
                            if (p005kotlin.jvm.internal.s.i(i0Var3.f68749a, i0VarM.f68749a) < 0) {
                                i0Var3 = i0VarM;
                            }
                            i0VarM = i0VarM.f68750b;
                        }
                    }
                    i0Var2.f68749a = 0L;
                    i0Var2.a(i0VarM);
                    i0Var2 = i0Var;
                }
            }
        }
        return i14 > 1;
    }

    public static final void p(g0 g0Var) {
        if (o(g0Var)) {
            y<g0> yVar = f68779g;
            int i14 = yVar.f68839a;
            int iIdentityHashCode = System.identityHashCode(g0Var);
            int i15 = -1;
            if (i14 > 0) {
                int i16 = yVar.f68839a - 1;
                int i17 = 0;
                while (true) {
                    if (i17 > i16) {
                        i15 = -(i17 + 1);
                        break;
                    }
                    int i18 = (i17 + i16) >>> 1;
                    int i19 = yVar.f68840b[i18];
                    if (i19 < iIdentityHashCode) {
                        i17 = i18 + 1;
                    } else if (i19 > iIdentityHashCode) {
                        i16 = i18 - 1;
                    } else {
                        z3.r<g0> rVar = yVar.f68841c[i18];
                        if (g0Var == (rVar != null ? rVar.get() : null)) {
                            i15 = i18;
                            break;
                        }
                        int i24 = i18 - 1;
                        while (true) {
                            if (-1 >= i24 || yVar.f68840b[i24] != iIdentityHashCode) {
                                i18++;
                                int i25 = yVar.f68839a;
                                while (true) {
                                    if (i18 >= i25) {
                                        i15 = -(yVar.f68839a + 1);
                                        break;
                                    }
                                    if (yVar.f68840b[i18] != iIdentityHashCode) {
                                        i15 = -(i18 + 1);
                                        break;
                                    }
                                    z3.r<g0> rVar2 = yVar.f68841c[i18];
                                    if ((rVar2 != null ? rVar2.get() : null) == g0Var) {
                                        i15 = i18;
                                        break;
                                    }
                                    i18++;
                                }
                            } else {
                                z3.r<g0> rVar3 = yVar.f68841c[i24];
                                if ((rVar3 != null ? rVar3.get() : null) == g0Var) {
                                    i15 = i24;
                                    break;
                                }
                                i24--;
                            }
                        }
                    }
                }
                if (i15 >= 0) {
                    return;
                }
            }
            int i26 = -(i15 + 1);
            z3.r<g0>[] rVarArr = yVar.f68841c;
            int length = rVarArr.length;
            if (i14 == length) {
                int i27 = length * 2;
                z3.r<T>[] rVarArr2 = new z3.r[i27];
                int[] iArr = new int[i27];
                int i28 = i26 + 1;
                System.arraycopy(rVarArr, i26, rVarArr2, i28, i14 - i26);
                System.arraycopy(yVar.f68841c, 0, rVarArr2, 0, i26);
                p13.s.d(i28, i26, i14, yVar.f68840b, iArr);
                p13.s.i(0, i26, 6, yVar.f68840b, iArr);
                yVar.f68841c = rVarArr2;
                yVar.f68840b = iArr;
            } else {
                int i29 = i26 + 1;
                System.arraycopy(rVarArr, i26, rVarArr, i29, i14 - i26);
                int[] iArr2 = yVar.f68840b;
                p13.s.d(i29, i26, i14, iArr2, iArr2);
            }
            yVar.f68841c[i26] = new z3.r<>(g0Var);
            yVar.f68840b[i26] = iIdentityHashCode;
            yVar.f68839a++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final <T extends i0> T r(T t7, long j8, j jVar) {
        T t14 = null;
        while (t7 != null) {
            long j14 = t7.f68749a;
            if (j14 != 0 && p005kotlin.jvm.internal.s.i(j14, j8) <= 0 && !jVar.c(j14) && (t14 == null || p005kotlin.jvm.internal.s.i(t14.f68749a, t7.f68749a) < 0)) {
                t14 = t7;
            }
            t7 = (T) t7.f68750b;
        }
        if (t14 != null) {
            return t14;
        }
        return null;
    }

    public static final <T extends i0> T s(T t7, g0 g0Var) {
        T t14;
        f.f68735e.getClass();
        f fVarI = i();
        e23.l<Object, Unit> lVarE = fVarI.getF68799i();
        if (lVarE != null) {
            lVarE.invoke(g0Var);
        }
        T t15 = (T) r(t7, fVarI.getF68737b(), fVarI.getF68736a());
        if (t15 != null) {
            return t15;
        }
        synchronized (f68775c) {
            f fVarI2 = i();
            i0 i0VarM = g0Var.m();
            i0VarM.getClass();
            t14 = (T) r(i0VarM, fVarI2.getF68737b(), fVarI2.getF68736a());
            if (t14 == null) {
                q();
                throw null;
            }
        }
        return t14;
    }

    public static final void t(int i14) {
        h hVar = f68778f;
        int i15 = hVar.f68745d[i14];
        hVar.b(i15, hVar.f68742a - 1);
        hVar.f68742a--;
        long[] jArr = hVar.f68743b;
        long j8 = jArr[i15];
        int i16 = i15;
        while (i16 > 0) {
            int i17 = ((i16 + 1) >> 1) - 1;
            if (p005kotlin.jvm.internal.s.i(jArr[i17], j8) <= 0) {
                break;
            }
            hVar.b(i17, i16);
            i16 = i17;
        }
        long[] jArr2 = hVar.f68743b;
        int i18 = hVar.f68742a >> 1;
        while (i15 < i18) {
            int i19 = (i15 + 1) << 1;
            int i24 = i19 - 1;
            if (i19 < hVar.f68742a && p005kotlin.jvm.internal.s.i(jArr2[i19], jArr2[i24]) < 0) {
                if (p005kotlin.jvm.internal.s.i(jArr2[i19], jArr2[i15]) >= 0) {
                    break;
                }
                hVar.b(i19, i15);
                i15 = i19;
            } else {
                if (p005kotlin.jvm.internal.s.i(jArr2[i24], jArr2[i15]) >= 0) {
                    break;
                }
                hVar.b(i24, i15);
                i15 = i24;
            }
        }
        hVar.f68745d[i14] = hVar.f68746e;
        hVar.f68746e = i14;
    }

    public static final <T> T u(androidx.compose.runtime.snapshots.a aVar, e23.l<? super j, ? extends T> lVar) {
        long j8 = aVar.f68737b;
        T tInvoke = lVar.invoke(f68776d.b(j8));
        long j14 = f68777e;
        f68777e = ((long) 1) + j14;
        j jVarB = f68776d.b(j8);
        f68776d = jVarB;
        aVar.f68737b = j14;
        aVar.f68736a = jVarB;
        aVar.f68709h = 0;
        aVar.f68710i = null;
        aVar.o();
        f68776d = f68776d.e(j14);
        return tInvoke;
    }

    public static final <T extends i0> T v(T t7, g0 g0Var, f fVar) {
        T t14;
        if (fVar.f()) {
            fVar.n(g0Var);
        }
        long f68737b = fVar.getF68737b();
        T t15 = (T) r(t7, f68737b, fVar.getF68736a());
        if (t15 == null) {
            q();
            throw null;
        }
        if (t15.f68749a == fVar.getF68737b()) {
            return t15;
        }
        synchronized (f68775c) {
            t14 = (T) r(g0Var.m(), f68737b, fVar.getF68736a());
            if (t14 == null) {
                q();
                throw null;
            }
            if (t14.f68749a != f68737b) {
                i0 i0VarL = l(t14, g0Var);
                i0VarL.a(t14);
                i0VarL.f68749a = fVar.getF68737b();
                t14 = (T) i0VarL;
            }
        }
        if (t15.f68749a != 1) {
            fVar.n(g0Var);
        }
        return t14;
    }
}
