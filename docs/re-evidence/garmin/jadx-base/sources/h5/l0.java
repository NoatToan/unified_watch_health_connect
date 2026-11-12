package h5;

import f5.n2;
import java.util.Arrays;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lh5/l0;", "Lf5/v1;", "Lh5/u0;", "Lh5/y0;", "<init>", "()V", "c", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l0 extends f5.v1 implements u0, y0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f81859o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f81860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e23.l<? super f5.e2, Unit> f81861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t1 f81862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f81863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f81864j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f81865k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f5.w0 f81866l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x1 f81867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p1.t0<f5.c2, p1.u0<h2<e0>>> f81868n;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/t1;", "result", "", "invoke", "(Lh5/t1;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<t1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f81869a = new a();

        public a() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:23:0x005f A[LOOP:0: B:13:0x0028->B:23:0x005f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x0062 A[EDGE_INSN: B:29:0x0062->B:24:0x0062 BREAK  A[LOOP:0: B:13:0x0028->B:23:0x005f], SYNTHETIC] */
        @Override // e23.l
        public final Unit invoke(t1 t1Var) {
            t1 t1Var2 = t1Var;
            if (t1Var2.X0()) {
                l0 l0Var = t1Var2.f81999b;
                if (!l0Var.f81865k) {
                    e23.l<f5.e2, Unit> lVarR = t1Var2.f81998a.r();
                    p1.t0<f5.c2, p1.u0<h2<e0>>> t0Var = l0Var.f81868n;
                    if (lVarR != null) {
                        g6.k.f76003b.getClass();
                        long j8 = g6.k.f76004c;
                        g6.m.f76012b.getClass();
                        l0Var.J0(t1Var2, j8, 0L);
                        l0Var.f81861g = lVarR;
                    } else if (t0Var != null) {
                        Object[] objArr = t0Var.f134722c;
                        long[] jArr = t0Var.f134720a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j14 = jArr[i14];
                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i14 != length) {
                                        break;
                                        break;
                                    }
                                    i14++;
                                } else {
                                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                                    for (int i16 = 0; i16 < i15; i16++) {
                                        if ((255 & j14) < 128) {
                                            l0Var.b1((p1.u0) objArr[(i14 << 3) + i16]);
                                        }
                                        j14 >>= 8;
                                    }
                                    if (i15 != 8) {
                                        break;
                                    }
                                    if (i14 != length) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                        }
                        t0Var.g();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/l0$c;", "Lf5/e2;", "<init>", "(Lh5/l0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class c implements f5.e2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f81870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f81871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f81872c;

        public c() {
            g6.k.f76003b.getClass();
            this.f81871b = g6.k.f76004c;
            g6.m.f76012b.getClass();
            this.f81872c = 0L;
        }

        @Override // f5.e2
        public final void V(f5.c2 c2Var, float f14) {
            l0 l0Var = l0.this;
            x1 x1Var = l0Var.f81867m;
            if (x1Var == null) {
                x1Var = new x1();
                l0Var.f81867m = x1Var;
            }
            int iM = p13.u.M(x1Var.f82015b, c2Var);
            if (iM >= 0) {
                float[] fArr = x1Var.f82016c;
                if (fArr[iM] != f14) {
                    fArr[iM] = f14;
                    x1Var.f82017d[iM] = 1;
                    return;
                } else {
                    byte[] bArr = x1Var.f82017d;
                    if (bArr[iM] == 2) {
                        bArr[iM] = 0;
                        return;
                    }
                    return;
                }
            }
            int i14 = x1Var.f82014a;
            f5.c2[] c2VarArr = x1Var.f82015b;
            if (i14 == c2VarArr.length) {
                int i15 = i14 * 2;
                x1Var.f82015b = (f5.c2[]) Arrays.copyOf(c2VarArr, i15);
                x1Var.f82016c = Arrays.copyOf(x1Var.f82016c, i15);
                x1Var.f82017d = Arrays.copyOf(x1Var.f82017d, i15);
            }
            x1Var.f82015b[i14] = c2Var;
            x1Var.f82017d[i14] = 3;
            x1Var.f82016c[i14] = f14;
            x1Var.f82014a++;
        }

        @Override // f5.e2
        public final f5.c0 Y0() {
            this.f81870a = true;
            l0 l0Var = l0.this;
            f5.c0 c0VarY0 = l0Var.Y0();
            long j8 = this.f81871b;
            g6.k.f76003b.getClass();
            if (g6.k.c(j8, g6.k.f76004c)) {
                this.f81871b = jg.b.N(f5.d0.f(c0VarY0));
                this.f81872c = c0VarY0.a();
            }
            l0Var.getF81711p().T.b();
            return c0VarY0;
        }

        @Override // g6.c
        /* JADX INFO: renamed from: getDensity */
        public final float getF75991a() {
            return l0.this.getF75991a();
        }

        @Override // g6.i
        /* JADX INFO: renamed from: r0 */
        public final float getF75992b() {
            return l0.this.getF75992b();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f81875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f81876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t1 f81877d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j8, long j14, t1 t1Var) {
            super(0);
            this.f81875b = j8;
            this.f81876c = j14;
            this.f81877d = t1Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            a aVar = l0.f81859o;
            l0 l0Var = l0.this;
            l0Var.V0().f81870a = false;
            l0Var.V0().f81871b = this.f81875b;
            l0Var.V0().f81872c = this.f81876c;
            e23.l<f5.e2, Unit> lVarR = this.f81877d.f81998a.r();
            if (lVarR != null) {
                lVarR.invoke(l0Var.V0());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h5/l0$e", "Lf5/a1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements f5.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f81878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f81879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map<f5.a, Integer> f81880c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<f5.e2, Unit> f81881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<f5.v1.a, Unit> f81882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l0 f81883f;

        /* JADX WARN: Multi-variable type inference failed */
        public e(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super f5.e2, Unit> lVar, e23.l<? super f5.v1.a, Unit> lVar2, l0 l0Var) {
            this.f81878a = i14;
            this.f81879b = i15;
            this.f81880c = map;
            this.f81881d = lVar;
            this.f81882e = lVar2;
            this.f81883f = l0Var;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getHeight, reason: from getter */
        public final int getF68889b() {
            return this.f81879b;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getWidth, reason: from getter */
        public final int getF68888a() {
            return this.f81878a;
        }

        @Override // f5.a1
        public final Map<f5.a, Integer> p() {
            return this.f81880c;
        }

        @Override // f5.a1
        public final void q() {
            this.f81882e.invoke(this.f81883f.f81866l);
        }

        @Override // f5.a1
        public final e23.l<f5.e2, Unit> r() {
            return this.f81881d;
        }
    }

    static {
        new b(null);
        f81859o = a.f81869a;
    }

    public l0() {
        f5.w1.a aVar = f5.w1.f69151a;
        this.f81866l = new f5.w0(this);
    }

    public static void a1(c1 c1Var) {
        g0 g0Var;
        c1 c1Var2 = c1Var.f81714t;
        e0 e0Var = c1Var.f81711p;
        if (!p005kotlin.jvm.internal.s.g(c1Var2 != null ? c1Var2.f81711p : null, e0Var)) {
            e0Var.T.f81853p.A.g();
            return;
        }
        h5.b bVarD0 = e0Var.T.f81853p.d0();
        if (bVarD0 == null || (g0Var = ((r0) bVarD0).A) == null) {
            return;
        }
        g0Var.g();
    }

    @Override // f5.c1
    public final int E(f5.a aVar) {
        int iI0;
        long j8;
        if (!P0() || (iI0 = I0(aVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z14 = aVar instanceof n2;
        long j14 = this.f69148e;
        if (z14) {
            g6.k.a aVar2 = g6.k.f76003b;
            j8 = j14 >> 32;
        } else {
            g6.k.a aVar3 = g6.k.f76003b;
            j8 = j14 & 4294967295L;
        }
        return iI0 + ((int) j8);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x009f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void G0(e0 e0Var, f5.c2 c2Var) {
        char c14;
        long j8;
        long j14;
        long j15;
        int i14;
        int i15;
        long[] jArr;
        long[] jArr2;
        long j16;
        int i16;
        char c15;
        long j17;
        int i17;
        int i18;
        int i19;
        boolean z14;
        p1.t0<f5.c2, p1.u0<h2<e0>>> t0Var = this.f81868n;
        char c16 = 7;
        long j18 = -9187201950435737472L;
        int i24 = 8;
        if (t0Var != null) {
            Object[] objArr = t0Var.f134722c;
            long[] jArr3 = t0Var.f134720a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i25 = 0;
                j14 = 128;
                while (true) {
                    long j19 = jArr3[i25];
                    j15 = 255;
                    if ((((~j19) << c16) & j19 & j18) != j18) {
                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                        int i27 = 0;
                        while (i27 < i26) {
                            if ((j19 & 255) < 128) {
                                c15 = c16;
                                p1.u0 u0Var = (p1.u0) objArr[(i25 << 3) + i27];
                                j17 = j18;
                                Object[] objArr2 = u0Var.f134733b;
                                long[] jArr4 = u0Var.f134732a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i28 = i24;
                                    int i29 = 0;
                                    while (true) {
                                        int i30 = length2;
                                        long j24 = jArr4[i29];
                                        jArr2 = jArr3;
                                        j16 = j19;
                                        if ((((~j24) << c15) & j24 & j17) != j17) {
                                            int i34 = 8 - ((~(i29 - i30)) >>> 31);
                                            int i35 = 0;
                                            while (i35 < i34) {
                                                if ((j24 & 255) < 128) {
                                                    int i36 = (i29 << 3) + i35;
                                                    e0 e0Var2 = (e0) ((h2) objArr2[i36]).get();
                                                    i18 = i35;
                                                    if (e0Var2 != null) {
                                                        boolean zIsAttached = e0Var2.isAttached();
                                                        i19 = i27;
                                                        z14 = zIsAttached;
                                                        if (!z14) {
                                                            u0Var.m(i36);
                                                        }
                                                    } else {
                                                        i19 = i27;
                                                    }
                                                    if (!z14) {
                                                        u0Var.m(i36);
                                                    }
                                                } else {
                                                    i18 = i35;
                                                    i19 = i27;
                                                }
                                                j24 >>= i28;
                                                i35 = i18 + 1;
                                                i27 = i19;
                                            }
                                            i16 = i27;
                                            if (i34 != i28) {
                                                break;
                                            }
                                        } else {
                                            i16 = i27;
                                        }
                                        length2 = i30;
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        jArr3 = jArr2;
                                        j19 = j16;
                                        i27 = i16;
                                        i28 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j16 = j19;
                                    i16 = i27;
                                }
                                i17 = 8;
                            } else {
                                jArr2 = jArr3;
                                j16 = j19;
                                i16 = i27;
                                c15 = c16;
                                j17 = j18;
                                i17 = i24;
                            }
                            i24 = i17;
                            j19 = j16 >> i17;
                            c16 = c15;
                            j18 = j17;
                            i27 = i16 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c14 = c16;
                        j8 = j18;
                        if (i26 != i24) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c14 = c16;
                        j8 = j18;
                    }
                    if (i25 == length) {
                        break;
                    }
                    i25++;
                    c16 = c14;
                    j18 = j8;
                    jArr3 = jArr;
                    i24 = 8;
                }
            } else {
                c14 = 7;
                j8 = -9187201950435737472L;
                j14 = 128;
                j15 = 255;
            }
        } else {
            c14 = 7;
            j8 = -9187201950435737472L;
            j14 = 128;
            j15 = 255;
        }
        p1.t0<f5.c2, p1.u0<h2<e0>>> t0Var2 = this.f81868n;
        if (t0Var2 != null) {
            long[] jArr5 = t0Var2.f134720a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i37 = 0;
                while (true) {
                    long j25 = jArr5[i37];
                    if ((((~j25) << c14) & j25 & j8) != j8) {
                        int i38 = 8 - ((~(i37 - length3)) >>> 31);
                        for (int i39 = 0; i39 < i38; i39++) {
                            if ((j25 & j15) < j14) {
                                int i44 = (i37 << 3) + i39;
                                if (((p1.u0) t0Var2.f134722c[i44]).b()) {
                                    t0Var2.l(i44);
                                }
                            }
                            j25 >>= 8;
                        }
                        if (i38 != 8) {
                            break;
                        }
                    }
                    if (i37 == length3) {
                        break;
                    } else {
                        i37++;
                    }
                }
            }
        }
        p1.t0<f5.c2, p1.u0<h2<e0>>> t0Var3 = this.f81868n;
        p005kotlin.jvm.internal.j jVar = null;
        if (t0Var3 == null) {
            i14 = 0;
            i15 = 1;
            t0Var3 = new p1.t0<>(i14, i15, jVar);
            this.f81868n = t0Var3;
        } else {
            i14 = 0;
            i15 = 1;
        }
        p1.u0<h2<e0>> u0VarD = t0Var3.d(c2Var);
        if (u0VarD == null) {
            u0VarD = new p1.u0<>(i14, i15, null);
            t0Var3.m(c2Var, u0VarD);
        }
        u0VarD.j(new h2<>(e0Var));
    }

    public abstract int I0(f5.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void J0(t1 t1Var, long j8, long j14) {
        boolean z14;
        char c14;
        long j15;
        long j16;
        long j17;
        e0 e0Var;
        boolean z15;
        int i14;
        char c15;
        long j18;
        r1 snapshotObserver;
        p1.t0<f5.c2, p1.u0<h2<e0>>> t0Var = this.f81868n;
        x1 x1Var = this.f81867m;
        if (x1Var == null) {
            x1Var = new x1();
            this.f81867m = x1Var;
        }
        x1 x1Var2 = x1Var;
        o1 o1Var = getF81711p().f81774n;
        if (o1Var != null && (snapshotObserver = o1Var.getSnapshotObserver()) != null) {
            snapshotObserver.f81981a.d(t1Var, f81859o, new d(j8, j14, t1Var));
        }
        boolean zT1 = t1();
        p1.u0<h2<e0>> u0Var = x1Var2.f82018e;
        p1.u0<f5.c2> u0Var2 = x1Var2.f82019f;
        int i15 = x1Var2.f82014a;
        for (int i16 = 0; i16 < i15; i16++) {
            byte b14 = x1Var2.f82017d[i16];
            if (b14 == 3) {
                f5.c2 c2Var = x1Var2.f82015b[i16];
                c2Var.getClass();
                u0Var2.j(c2Var);
            } else if (b14 != 0 && t0Var != null) {
                f5.c2 c2Var2 = x1Var2.f82015b[i16];
                c2Var2.getClass();
                p1.u0<h2<e0>> u0VarK = t0Var.k(c2Var2);
                if (u0VarK != null) {
                    u0Var.k(u0VarK);
                }
            }
        }
        int i17 = x1Var2.f82014a;
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            byte[] bArr = x1Var2.f82017d;
            if (bArr[i19] == 2) {
                i18++;
            } else if (i18 > 0) {
                f5.c2[] c2VarArr = x1Var2.f82015b;
                c2VarArr[i19 - i18] = c2VarArr[i19];
            }
            bArr[i19] = 2;
        }
        int i24 = x1Var2.f82014a;
        for (int i25 = i24 - i18; i25 < i24; i25++) {
            x1Var2.f82015b[i25] = null;
        }
        x1Var2.f82014a -= i18;
        l0 l0VarS0 = S0();
        Object[] objArr = u0Var2.f134733b;
        long[] jArr = u0Var2.f134732a;
        int length = jArr.length - 2;
        char c16 = 7;
        long j19 = -9187201950435737472L;
        int i26 = 8;
        if (length >= 0) {
            j16 = 128;
            int i27 = 0;
            while (true) {
                long j24 = jArr[i27];
                j17 = 255;
                if ((((~j24) << c16) & j24 & j19) != j19) {
                    int i28 = 8 - ((~(i27 - length)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j24 & 255) < 128) {
                            c15 = c16;
                            f5.c2 c2Var3 = (f5.c2) objArr[(i27 << 3) + i29];
                            j18 = j19;
                            l0 l0Var = l0VarS0 == null ? this : l0VarS0;
                            i14 = i26;
                            l0 l0Var2 = l0Var;
                            while (true) {
                                x1 x1Var3 = l0Var2.f81867m;
                                if (x1Var3 != null) {
                                    z15 = zT1;
                                    if (p13.u.z(x1Var3.f82015b, c2Var3)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z15 = zT1;
                                l0 l0VarS1 = l0Var2.S0();
                                if (l0VarS1 == null) {
                                    break;
                                }
                                l0Var2 = l0VarS1;
                                zT1 = z15;
                            }
                            p1.t0<f5.c2, p1.u0<h2<e0>>> t0Var2 = l0Var2.f81868n;
                            p1.u0<h2<e0>> u0VarK2 = t0Var2 != null ? t0Var2.k(c2Var3) : null;
                            if (u0VarK2 != null) {
                                l0Var.b1(u0VarK2);
                            }
                        } else {
                            z15 = zT1;
                            i14 = i26;
                            c15 = c16;
                            j18 = j19;
                        }
                        j24 >>= i14;
                        i29++;
                        c16 = c15;
                        j19 = j18;
                        i26 = i14;
                        zT1 = z15;
                    }
                    z14 = zT1;
                    c14 = c16;
                    j15 = j19;
                    if (i28 != i26) {
                        break;
                    }
                } else {
                    z14 = zT1;
                    c14 = c16;
                    j15 = j19;
                }
                if (i27 == length) {
                    break;
                }
                i27++;
                c16 = c14;
                j19 = j15;
                zT1 = z14;
                i26 = 8;
            }
        } else {
            z14 = zT1;
            c14 = 7;
            j15 = -9187201950435737472L;
            j16 = 128;
            j17 = 255;
        }
        u0Var2.e();
        Object[] objArr2 = u0Var.f134733b;
        long[] jArr2 = u0Var.f134732a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i30 = 0;
            while (true) {
                long j25 = jArr2[i30];
                if ((((~j25) << c14) & j25 & j15) != j15) {
                    int i34 = 8 - ((~(i30 - length2)) >>> 31);
                    for (int i35 = 0; i35 < i34; i35++) {
                        if ((j25 & j17) < j16 && (e0Var = (e0) ((h2) objArr2[(i30 << 3) + i35]).get()) != null) {
                            if (z14) {
                                e0Var.g0(false);
                            } else {
                                e0Var.i0(false);
                            }
                        }
                        j25 >>= 8;
                    }
                    if (i34 != 8) {
                        break;
                    }
                }
                if (i30 == length2) {
                    break;
                } else {
                    i30++;
                }
            }
        }
        u0Var.e();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[LOOP:0: B:11:0x001c->B:21:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0056 A[EDGE_INSN: B:48:0x0056->B:22:0x0056 BREAK  A[LOOP:0: B:11:0x001c->B:21:0x0053], SYNTHETIC] */
    public final void N0(f5.a1 a1Var) {
        long j8;
        long j14;
        p1.t0<f5.c2, p1.u0<h2<e0>>> t0Var = this.f81868n;
        if (!this.f81865k) {
            e23.l<f5.e2, Unit> lVarR = a1Var.r();
            if (lVarR != null) {
                boolean z14 = this.f81861g != lVarR;
                g6.k.f76003b.getClass();
                long j15 = g6.k.f76004c;
                g6.m.f76012b.getClass();
                if (z14 || !V0().f81870a) {
                    j8 = j15;
                    j14 = 0;
                } else {
                    f5.c0 c0VarY0 = Y0();
                    long jN = jg.b.N(f5.d0.f(c0VarY0));
                    long jA = c0VarY0.a();
                    j8 = jN;
                    j14 = jA;
                    z14 = (g6.k.c(jN, V0().f81871b) && g6.m.c(jA, V0().f81872c)) ? false : true;
                }
                if (z14) {
                    t1 t1Var = this.f81862h;
                    if (t1Var != null) {
                        t1Var.f81998a = a1Var;
                    } else {
                        t1Var = new t1(a1Var, this);
                        this.f81862h = t1Var;
                    }
                    J0(t1Var, j8, j14);
                    this.f81861g = a1Var.r();
                }
            } else if (t0Var != null) {
                Object[] objArr = t0Var.f134722c;
                long[] jArr = t0Var.f134720a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j16 = jArr[i14];
                        if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i14 != length) {
                                break;
                                break;
                            }
                            i14++;
                        } else {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((255 & j16) < 128) {
                                    b1((p1.u0) objArr[(i14 << 3) + i16]);
                                }
                                j16 >>= 8;
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
                t0Var.g();
            }
        }
    }

    public abstract l0 O0();

    @Override // f5.b1
    public final f5.a1 P(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super f5.e2, Unit> lVar, e23.l<? super f5.v1.a, Unit> lVar2) {
        if (!((i14 & (-16777216)) == 0 && ((-16777216) & i15) == 0)) {
            e5.a.b("Size(" + i14 + " x " + i15 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new e(i14, i15, map, lVar, lVar2, this);
    }

    public abstract boolean P0();

    public abstract f5.a1 Q0();

    public abstract l0 S0();

    /* JADX INFO: renamed from: U0 */
    public abstract long getF81890q();

    public final c V0() {
        c cVar = this.f81860f;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f81860f = cVar2;
        return cVar2;
    }

    public abstract f5.c0 Y0();

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(p1.u0<h2<e0>> u0Var) {
        e0 e0Var;
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
                    if ((255 & j8) < 128 && (e0Var = (e0) ((h2) objArr[(i14 << 3) + i16]).get()) != null) {
                        if (t1()) {
                            e0Var.g0(false);
                        } else {
                            e0Var.i0(false);
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

    public abstract void f1();

    /* JADX INFO: renamed from: j1 */
    public abstract e0 getF81711p();

    @Override // h5.y0
    public final void r(boolean z14) {
        l0 l0VarS0 = S0();
        e0 e0VarJ1 = l0VarS0 != null ? l0VarS0.getF81711p() : null;
        if (p005kotlin.jvm.internal.s.g(e0VarJ1, getF81711p())) {
            this.f81863i = z14;
            return;
        }
        if ((e0VarJ1 != null ? e0VarJ1.T.f81841d : null) != e0.e.LayingOut) {
            if ((e0VarJ1 != null ? e0VarJ1.T.f81841d : null) != e0.e.LookaheadLayingOut) {
                return;
            }
        }
        this.f81863i = z14;
    }

    @Override // f5.x
    public boolean t1() {
        return false;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh5/l0$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Lh5/t1;", "", "onCommitAffectingRuler", "Le23/l;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
