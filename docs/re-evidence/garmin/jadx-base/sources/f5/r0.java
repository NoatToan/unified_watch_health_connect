package f5;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf5/r0;", "Lh5/e0$f;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 extends h5.e0.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f69080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<k2, g6.a, a1> f69081c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/r0$a", "Lf5/a1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a1 f69082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0 f69083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f69084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a1 f69085d;

        public a(a1 a1Var, q0 q0Var, int i14, a1 a1Var2) {
            this.f69083b = q0Var;
            this.f69084c = i14;
            this.f69085d = a1Var2;
            this.f69082a = a1Var;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getHeight */
        public final int getF68912b() {
            return this.f69082a.getF68912b();
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getWidth */
        public final int getF68911a() {
            return this.f69082a.getF68911a();
        }

        @Override // f5.a1
        public final Map<f5.a, Integer> p() {
            return this.f69082a.p();
        }

        /* JADX WARN: Code duplicated, block: B:25:0x007e A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:26:0x0080 A[LOOP:0: B:5:0x0019->B:26:0x0080, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:30:0x0085 A[EDGE_INSN: B:30:0x0085->B:27:0x0085 BREAK  A[LOOP:0: B:5:0x0019->B:26:0x0080], SYNTHETIC] */
        @Override // f5.a1
        public final void q() {
            int i14;
            int i15 = this.f69084c;
            q0 q0Var = this.f69083b;
            q0Var.f69027e = i15;
            this.f69085d.q();
            q3.c<Object> cVar = q0Var.f69035m;
            p1.t0<Object, j2.b> t0Var = q0Var.f69034l;
            long[] jArr = t0Var.f134720a;
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
                        int i17 = 8;
                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((255 & j8) < 128) {
                                int i24 = (i16 << 3) + i19;
                                Object obj = t0Var.f134721b[i24];
                                j2.b bVar = (j2.b) t0Var.f134722c[i24];
                                int i25 = cVar.i(obj);
                                i14 = i17;
                                if (i25 < 0 || i25 >= q0Var.f69027e) {
                                    if (i25 >= 0) {
                                        Object obj2 = i2.f68962b;
                                        Object[] objArr = cVar.f142356a;
                                        Object obj3 = objArr[i25];
                                        objArr[i25] = obj2;
                                    }
                                    if (q0Var.f69032j.a(obj)) {
                                        bVar.dispose();
                                    }
                                    t0Var.l(i24);
                                }
                            } else {
                                i14 = i17;
                            }
                            j8 >>= i14;
                            i19++;
                            i17 = i14;
                        }
                        if (i18 != i17) {
                            break;
                        } else if (i16 != length) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
            }
            q0Var.g(q0Var.f69026d);
        }

        @Override // f5.a1
        public final e23.l<e2, Unit> r() {
            return this.f69082a.r();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/r0$b", "Lf5/a1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a1 f69086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0 f69087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f69088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a1 f69089d;

        public b(a1 a1Var, q0 q0Var, int i14, a1 a1Var2) {
            this.f69087b = q0Var;
            this.f69088c = i14;
            this.f69089d = a1Var2;
            this.f69086a = a1Var;
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getHeight */
        public final int getF68912b() {
            return this.f69086a.getF68912b();
        }

        @Override // f5.a1
        /* JADX INFO: renamed from: getWidth */
        public final int getF68911a() {
            return this.f69086a.getF68911a();
        }

        @Override // f5.a1
        public final Map<f5.a, Integer> p() {
            return this.f69086a.p();
        }

        @Override // f5.a1
        public final void q() {
            int i14 = this.f69088c;
            q0 q0Var = this.f69087b;
            q0Var.f69026d = i14;
            this.f69089d.q();
            if (q0Var.f69023a.f81767h == null) {
                q0Var.g(q0Var.f69026d);
            }
        }

        @Override // f5.a1
        public final e23.l<e2, Unit> r() {
            return this.f69086a.r();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r0(q0 q0Var, e23.p<? super k2, ? super g6.a, ? extends a1> pVar, String str) {
        super(str);
        this.f69080b = q0Var;
        this.f69081c = pVar;
    }

    @Override // f5.z0
    public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
        q0 q0Var = this.f69080b;
        q0Var.f69030h.f69049a = b1Var.getF68910b();
        q0.c cVar = q0Var.f69030h;
        cVar.f69050b = b1Var.getF94881a();
        cVar.f69051c = b1Var.getF94882b();
        boolean zT1 = b1Var.t1();
        e23.p<k2, g6.a, a1> pVar = this.f69081c;
        if (zT1 || q0Var.f69023a.f81767h == null) {
            q0Var.f69026d = 0;
            a1 a1VarInvoke = pVar.invoke(cVar, g6.a.a(j8));
            return new b(a1VarInvoke, q0Var, q0Var.f69026d, a1VarInvoke);
        }
        q0Var.f69027e = 0;
        a1 a1VarInvoke2 = pVar.invoke(q0Var.f69031i, g6.a.a(j8));
        return new a(a1VarInvoke2, q0Var, q0Var.f69027e, a1VarInvoke2);
    }
}
