package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lp3/d0;", "T", "Lf4/h0;", "Lp3/e0;", "Lkotlin/Function0;", "calculation", "Lp3/p3;", "policy", "<init>", "(Le23/a;Lp3/p3;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0<T> extends f4.h0 implements e0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<T> f135055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3<T> f135056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a<T> f135057d = new a<>(f4.l.i().getF68737b());

    /* JADX WARN: Multi-variable type inference failed */
    public d0(e23.a<? extends T> aVar, p3<T> p3Var) {
        this.f135055b = aVar;
        this.f135056c = p3Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00a4 A[EDGE_INSN: B:101:0x00a4->B:31:0x00a4 BREAK  A[LOOP:1: B:16:0x004a->B:30:0x009e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[Catch: all -> 0x0039, LOOP:1: B:16:0x004a->B:30:0x009e, LOOP_END, TryCatch #3 {all -> 0x0039, blocks: (B:8:0x0024, B:10:0x0030, B:13:0x003c, B:16:0x004a, B:18:0x005d, B:20:0x0068, B:22:0x0072, B:24:0x008a, B:26:0x0090, B:30:0x009e, B:31:0x00a4), top: B:96:0x0024 }] */
    public final a<T> D(a<T> aVar, f4.f fVar, boolean z14, e23.a<? extends T> aVar2) {
        a<T> aVar3;
        p3<T> p3Var;
        int i14;
        int i15 = 0;
        if (aVar.d(this, fVar)) {
            if (z14) {
                q3.c cVarE = p0.e();
                T[] tArr = cVarE.f142356a;
                int i16 = cVarE.f142358c;
                for (int i17 = 0; i17 < i16; i17++) {
                    ((f0) tArr[i17]).start();
                }
                try {
                    p1.y0<f4.g0> y0Var = aVar.f135062e;
                    z3.m<z3.g> mVar = q3.f135227a;
                    z3.g gVarA = mVar.a();
                    if (gVarA == null) {
                        gVarA = new z3.g(0);
                        mVar.b(gVarA);
                    }
                    int i18 = gVarA.f202099a;
                    Object[] objArr = y0Var.f134874b;
                    int[] iArr = y0Var.f134875c;
                    long[] jArr = y0Var.f134873a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i19 = 0;
                        while (true) {
                            long j8 = jArr[i19];
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i19 != length) {
                                    break;
                                    break;
                                }
                                i19++;
                                i15 = 0;
                            } else {
                                int i24 = 8;
                                int i25 = 8 - ((~(i19 - length)) >>> 31);
                                while (i15 < i25) {
                                    if ((j8 & 255) < 128) {
                                        int i26 = (i19 << 3) + i15;
                                        i14 = i24;
                                        f4.g0 g0Var = (f4.g0) objArr[i26];
                                        gVarA.f202099a = i18 + iArr[i26];
                                        e23.l<Object, Unit> lVarE = fVar.e();
                                        if (lVarE != null) {
                                            lVarE.invoke(g0Var);
                                        }
                                    } else {
                                        i14 = i24;
                                    }
                                    j8 >>= i14;
                                    i15++;
                                    i24 = i14;
                                }
                                if (i25 != i24) {
                                    break;
                                }
                                if (i19 != length) {
                                    break;
                                }
                                i19++;
                                i15 = 0;
                            }
                        }
                    }
                    gVarA.f202099a = i18;
                    Unit unit = Unit.INSTANCE;
                } finally {
                    T[] tArr2 = cVarE.f142356a;
                    int i27 = cVarE.f142358c;
                    for (int i28 = 0; i28 < i27; i28++) {
                        ((f0) tArr2[i28]).a();
                    }
                }
            }
            return aVar;
        }
        p1.p0 p0Var = new p1.p0(0, 1, null);
        z3.m<z3.g> mVar2 = q3.f135227a;
        z3.g gVarA2 = mVar2.a();
        if (gVarA2 == null) {
            gVarA2 = new z3.g(0);
            mVar2.b(gVarA2);
        }
        int i29 = gVarA2.f202099a;
        q3.c cVarE2 = p0.e();
        T[] tArr3 = cVarE2.f142356a;
        int i30 = cVarE2.f142358c;
        for (int i34 = 0; i34 < i30; i34++) {
            ((f0) tArr3[i34]).start();
        }
        try {
            gVarA2.f202099a = i29 + 1;
            f4.f.a aVar4 = f4.f.f68735e;
            cw1.k0 k0Var = new cw1.k0(this, gVarA2, p0Var, i29, 7);
            aVar4.getClass();
            Object objC = f4.f.a.c(k0Var, aVar2);
            gVarA2.f202099a = i29;
            T[] tArr4 = cVarE2.f142356a;
            int i35 = cVarE2.f142358c;
            for (int i36 = 0; i36 < i35; i36++) {
                ((f0) tArr4[i36]).a();
            }
            Object obj = f4.l.f68775c;
            synchronized (obj) {
                try {
                    f4.f.f68735e.getClass();
                    f4.f fVarI = f4.l.i();
                    Object obj2 = aVar.f135063f;
                    a.f135058h.getClass();
                    if (obj2 == a.f135059i || (p3Var = this.f135056c) == null || !p3Var.a((T) objC, (T) aVar.f135063f)) {
                        a<T> aVar5 = this.f135057d;
                        synchronized (obj) {
                            f4.i0 i0VarL = f4.l.l(aVar5, this);
                            i0VarL.a(aVar5);
                            i0VarL.f68749a = fVarI.getF68737b();
                            aVar3 = (a) i0VarL;
                            aVar3.f135062e = p0Var;
                            aVar3.f135064g = aVar3.e(this, fVarI);
                            aVar3.f135063f = objC;
                        }
                        return aVar3;
                    }
                    aVar.f135062e = p0Var;
                    aVar.f135064g = aVar.e(this, fVarI);
                    aVar3 = aVar;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            z3.g gVarA3 = q3.f135227a.a();
            if (gVarA3 == null || gVarA3.f202099a != 0) {
                return aVar3;
            }
            f4.l.i().m();
            synchronized (obj) {
                f4.f fVarI2 = f4.l.i();
                aVar3.f135060c = fVarI2.getF68737b();
                aVar3.f135061d = fVarI2.h();
                Unit unit2 = Unit.INSTANCE;
                return aVar3;
            }
        } catch (Throwable th4) {
            T[] tArr5 = cVarE2.f142356a;
            int i37 = cVarE2.f142358c;
            for (int i38 = 0; i38 < i37; i38++) {
                ((f0) tArr5[i38]).a();
            }
            throw th4;
        }
    }

    @Override // p3.e0
    public final p3<T> b() {
        return this.f135056c;
    }

    @Override // p3.x3
    /* JADX INFO: renamed from: getValue */
    public final T getF182175a() {
        f4.f.f68735e.getClass();
        e23.l<Object, Unit> lVarE = f4.l.i().e();
        if (lVarE != null) {
            lVarE.invoke(this);
        }
        f4.f fVarI = f4.l.i();
        return (T) D((a) f4.l.h(this.f135057d, fVarI), fVarI, true, this.f135055b).f135063f;
    }

    @Override // f4.g0
    public final f4.i0 m() {
        return this.f135057d;
    }

    @Override // f4.g0
    public final void q(f4.i0 i0Var) {
        i0Var.getClass();
        this.f135057d = (a) i0Var;
    }

    @Override // p3.e0
    public final a r() {
        f4.f.f68735e.getClass();
        f4.f fVarI = f4.l.i();
        return D((a) f4.l.h(this.f135057d, fVarI), fVarI, false, this.f135055b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DerivedState(value=");
        a aVar = (a) f4.l.g(this.f135057d);
        f4.f.f68735e.getClass();
        sb3.append(aVar.d(this, f4.l.i()) ? String.valueOf(aVar.f135063f) : "<Not calculated>");
        sb3.append(")@");
        sb3.append(hashCode());
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\tB\u0013\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lp3/d0$a;", "T", "Lf4/i0;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> extends f4.i0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C2564a f135058h = new C2564a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Object f135059i = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f135060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f135061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public p1.y0<f4.g0> f135062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f135063f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f135064g;

        public a(long j8) {
            super(j8);
            p1.p0<Object> p0Var = p1.z0.f134882a;
            p0Var.getClass();
            this.f135062e = p0Var;
            this.f135063f = f135059i;
        }

        @Override // f4.i0
        public final void a(f4.i0 i0Var) {
            i0Var.getClass();
            a aVar = (a) i0Var;
            this.f135062e = aVar.f135062e;
            this.f135063f = aVar.f135063f;
            this.f135064g = aVar.f135064g;
        }

        @Override // f4.i0
        public final f4.i0 b() {
            return new a(f4.l.i().getF68737b());
        }

        @Override // f4.i0
        public final f4.i0 c(long j8) {
            return new a(j8);
        }

        public final boolean d(d0 d0Var, f4.f fVar) {
            boolean z14;
            boolean z15;
            Object obj = f4.l.f68775c;
            synchronized (obj) {
                z14 = true;
                z15 = (this.f135060c == fVar.getF68737b() && this.f135061d == fVar.h()) ? false : true;
            }
            if (this.f135063f == f135059i || (z15 && this.f135064g != e(d0Var, fVar))) {
                z14 = false;
            }
            if (!z14 || !z15) {
                return z14;
            }
            synchronized (obj) {
                this.f135060c = fVar.getF68737b();
                this.f135061d = fVar.h();
                Unit unit = Unit.INSTANCE;
            }
            return z14;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00d9 A[DONT_INVERT, PHI: r10
          0x00d9: PHI (r10v14 int) = (r10v13 int), (r10v15 int) binds: [B:30:0x00aa, B:40:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:42:0x00db A[Catch: all -> 0x00cd, LOOP:3: B:29:0x009c->B:42:0x00db, LOOP_END, TryCatch #1 {all -> 0x00cd, blocks: (B:12:0x0024, B:15:0x0031, B:17:0x0040, B:19:0x004e, B:21:0x0058, B:49:0x0119, B:24:0x0075, B:26:0x0079, B:29:0x009c, B:31:0x00ac, B:33:0x00b6, B:35:0x00bc, B:38:0x00d0, B:46:0x00fb, B:42:0x00db, B:45:0x00eb, B:55:0x013e, B:59:0x0151), top: B:75:0x0024 }] */
        /* JADX WARN: Code duplicated, block: B:62:0x015a A[DONT_GENERATE, LOOP:5: B:61:0x0158->B:62:0x015a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:83:0x00e8 A[EDGE_INSN: B:83:0x00e8->B:44:0x00e8 BREAK  A[LOOP:3: B:29:0x009c->B:42:0x00db], SYNTHETIC] */
        public final int e(d0 d0Var, f4.f fVar) {
            p1.y0<f4.g0> y0Var;
            int iIdentityHashCode;
            long[] jArr;
            int i14;
            Object[] objArr;
            int[] iArr;
            int[] iArr2;
            long j8;
            int i15;
            f4.i0 i0VarH;
            a<T> aVar;
            synchronized (f4.l.f68775c) {
                y0Var = this.f135062e;
            }
            int i16 = 7;
            if (y0Var.f134877e == 0) {
                return 7;
            }
            q3.c cVarE = p0.e();
            T[] tArr = cVarE.f142356a;
            int i17 = cVarE.f142358c;
            for (int i18 = 0; i18 < i17; i18++) {
                ((f0) tArr[i18]).start();
            }
            try {
                Object[] objArr2 = y0Var.f134874b;
                int[] iArr3 = y0Var.f134875c;
                long[] jArr2 = y0Var.f134873a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    iIdentityHashCode = 7;
                    int i19 = 0;
                    while (true) {
                        long j14 = jArr2[i19];
                        long j15 = -9187201950435737472L;
                        if ((((~j14) << i16) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i24 = 8;
                            int i25 = 8 - ((~(i19 - length)) >>> 31);
                            i14 = i16;
                            int i26 = 0;
                            while (i26 < i25) {
                                if ((j14 & 255) < 128) {
                                    int i27 = (i19 << 3) + i26;
                                    j8 = j15;
                                    int i28 = i24;
                                    f4.g0 g0Var = (f4.g0) objArr2[i27];
                                    if (iArr3[i27] != 1) {
                                        jArr2 = jArr2;
                                        i26 = i26;
                                        objArr2 = objArr2;
                                        iArr2 = iArr3;
                                    } else {
                                        if (g0Var instanceof d0) {
                                            d0 d0Var2 = (d0) g0Var;
                                            a<T> aVarD = d0Var2.D((a) f4.l.h(d0Var2.f135057d, fVar), fVar, false, d0Var2.f135055b);
                                            p1.y0<f4.g0> y0Var2 = aVarD.f135062e;
                                            Object[] objArr3 = y0Var2.f134874b;
                                            long[] jArr3 = y0Var2.f134873a;
                                            int length2 = jArr3.length - 2;
                                            if (length2 >= 0) {
                                                int i29 = 0;
                                                while (true) {
                                                    long j16 = jArr3[i29];
                                                    iArr2 = iArr3;
                                                    aVar = aVarD;
                                                    if ((((~j16) << i14) & j16 & j8) == j8) {
                                                        if (i29 != length2) {
                                                            break;
                                                            break;
                                                        }
                                                        i29++;
                                                        iArr3 = iArr2;
                                                        aVarD = aVar;
                                                        i28 = 8;
                                                    } else {
                                                        int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                                        for (int i34 = 0; i34 < i30; i34++) {
                                                            if ((j16 & 255) < 128) {
                                                                iIdentityHashCode = (iIdentityHashCode * 31) + System.identityHashCode((f4.g0) objArr3[(i29 << 3) + i34]);
                                                            }
                                                            j16 >>= i28;
                                                        }
                                                        if (i30 != i28) {
                                                            break;
                                                        }
                                                        if (i29 != length2) {
                                                            break;
                                                        }
                                                        i29++;
                                                        iArr3 = iArr2;
                                                        aVarD = aVar;
                                                        i28 = 8;
                                                    }
                                                }
                                            } else {
                                                iArr2 = iArr3;
                                                aVar = aVarD;
                                            }
                                            i0VarH = aVar;
                                        } else {
                                            iArr2 = iArr3;
                                            i0VarH = f4.l.h(g0Var.m(), fVar);
                                        }
                                        iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(i0VarH)) * 31) + Long.hashCode(i0VarH.f68749a);
                                    }
                                    i15 = 8;
                                } else {
                                    jArr2 = jArr2;
                                    i26 = i26;
                                    objArr2 = objArr2;
                                    iArr2 = iArr3;
                                    j8 = j15;
                                    i15 = i24;
                                }
                                j14 >>= i15;
                                i24 = i15;
                                jArr2 = jArr2;
                                j15 = j8;
                                objArr2 = objArr2;
                                iArr3 = iArr2;
                                i26++;
                            }
                            jArr = jArr2;
                            objArr = objArr2;
                            iArr = iArr3;
                            if (i25 != i24) {
                                break;
                            }
                        } else {
                            jArr = jArr2;
                            i14 = i16;
                            objArr = objArr2;
                            iArr = iArr3;
                        }
                        if (i19 != length) {
                            i19++;
                            i16 = i14;
                            jArr2 = jArr;
                            objArr2 = objArr;
                            iArr3 = iArr;
                        } else {
                            i16 = iIdentityHashCode;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    return iIdentityHashCode;
                }
                iIdentityHashCode = i16;
                Unit unit2 = Unit.INSTANCE;
                return iIdentityHashCode;
            } finally {
                T[] tArr2 = cVarE.f142356a;
                int i35 = cVarE.f142358c;
                for (int i36 = 0; i36 < i35; i36++) {
                    ((f0) tArr2[i36]).a();
                }
            }
        }

        /* JADX INFO: renamed from: p3.d0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp3/d0$a$a;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C2564a {
            public /* synthetic */ C2564a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C2564a() {
            }
        }
    }
}
