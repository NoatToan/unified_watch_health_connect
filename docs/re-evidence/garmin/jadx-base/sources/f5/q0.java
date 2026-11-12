package f5;

import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.z4;
import p005kotlin.KotlinNothingValueException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lf5/q0;", "Lp3/i;", "Lh5/e0;", "root", "Lf5/l2;", "slotReusePolicy", "<init>", "(Lh5/e0;Lf5/l2;)V", "b", "c", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0 implements p3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h5.e0 f69023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p3.p f69024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l2 f69025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f69026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69027e;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f69036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f69037o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p1.t0<h5.e0, b> f69028f = p1.g1.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p1.t0<Object, h5.e0> f69029g = p1.g1.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f69030h = new c();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f69031i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p1.t0<Object, h5.e0> f69032j = p1.g1.b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l2.a f69033k = new l2.a(null, 1, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1.t0<Object, j2.b> f69034l = p1.g1.b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q3.c<Object> f69035m = new q3.c<>(new Object[16], 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f69038p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lf5/q0$a;", "Lf5/k2;", "Lf5/b1;", "<init>", "(Lf5/q0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements k2, b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f69039a;

        public a() {
            this.f69039a = q0.this.f69030h;
        }

        @Override // g6.c
        public final long A(long j8) {
            return this.f69039a.A(j8);
        }

        @Override // g6.c
        public final long D(float f14) {
            return this.f69039a.D(f14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // f5.k2
        public final List F0(e23.p pVar, Object obj) {
            q0 q0Var = q0.this;
            p1.t0<Object, h5.e0> t0Var = q0Var.f69029g;
            h5.e0 e0Var = q0Var.f69023a;
            h5.e0 e0VarD = t0Var.d(obj);
            if (e0VarD != null && ((q3.c.a) e0Var.E()).f142359a.i((T) e0VarD) < q0Var.f69026d) {
                return e0VarD.C();
            }
            p1.t0<Object, j2.b> t0Var2 = q0Var.f69034l;
            p1.t0<Object, h5.e0> t0Var3 = q0Var.f69029g;
            p1.t0<Object, h5.e0> t0Var4 = q0Var.f69032j;
            q3.c<Object> cVar = q0Var.f69035m;
            if (cVar.f142358c < q0Var.f69027e) {
                e5.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
            }
            h5.e0 e0VarD2 = t0Var3.d(obj);
            int i14 = cVar.f142358c;
            int i15 = q0Var.f69027e;
            if (i14 == i15) {
                cVar.b(obj);
            } else {
                Object[] objArr = cVar.f142356a;
                Object obj2 = objArr[i15];
                objArr[i15] = obj;
            }
            q0Var.f69027e++;
            boolean zA = t0Var4.a(obj);
            if (zA || e0VarD2 != null) {
                if (!zA && e0VarD2 != null) {
                    q0Var.j(((q3.c.a) e0Var.E()).f142359a.i((T) e0VarD2), ((q3.c.a) e0Var.E()).f142359a.f142358c);
                    q0Var.f69037o++;
                    t0Var3.k(obj);
                    t0Var4.m(obj, e0VarD2);
                    t0Var2.m(obj, q0Var.f(obj));
                    if (e0Var.isAttached()) {
                        q0Var.h();
                    }
                }
                h5.e0 e0VarD3 = t0Var4.d(obj);
                b bVarD = e0VarD3 != null ? q0Var.f69028f.d(e0VarD3) : null;
                if (bVarD != null && bVarD.f69044d) {
                    q0Var.n(e0VarD3, obj, false, pVar);
                }
                if ((bVarD != null ? bVarD.f69046f : null) != null) {
                    q0Var.c(bVarD, true);
                }
            } else {
                q0Var.l(obj, pVar, false);
                t0Var2.m(obj, q0Var.f(obj));
            }
            h5.e0 e0VarD4 = t0Var4.d(obj);
            if (e0VarD4 == null) {
                return p13.j0.f134944a;
            }
            List<h5.r0> listG0 = e0VarD4.T.f81853p.G0();
            q3.c.a aVar = (q3.c.a) listG0;
            int i16 = aVar.f142359a.f142358c;
            for (int i17 = 0; i17 < i16; i17++) {
                ((h5.r0) aVar.get(i17)).f81955f.f81839b = true;
            }
            return listG0;
        }

        @Override // g6.i
        public final float H0(long j8) {
            return this.f69039a.H0(j8);
        }

        @Override // f5.b1
        public final a1 H1(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super v1.a, Unit> lVar) {
            return this.f69039a.P(i14, i15, map, null, lVar);
        }

        @Override // f5.b1
        public final a1 P(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super e2, Unit> lVar, e23.l<? super v1.a, Unit> lVar2) {
            return this.f69039a.P(i14, i15, map, lVar, lVar2);
        }

        @Override // g6.i
        public final long Y(float f14) {
            return this.f69039a.Y(f14);
        }

        @Override // g6.c
        public final float c1(int i14) {
            return this.f69039a.c1(i14);
        }

        @Override // g6.c
        public final float d1(float f14) {
            return this.f69039a.d1(f14);
        }

        @Override // g6.c
        public final int f0(float f14) {
            return this.f69039a.f0(f14);
        }

        @Override // g6.c
        public final float g0(long j8) {
            return this.f69039a.g0(j8);
        }

        @Override // g6.c
        /* JADX INFO: renamed from: getDensity */
        public final float getF75991a() {
            return this.f69039a.f69050b;
        }

        @Override // f5.x
        /* JADX INFO: renamed from: getLayoutDirection */
        public final g6.o getF68910b() {
            return this.f69039a.f69049a;
        }

        @Override // g6.c
        public final long k1(long j8) {
            return this.f69039a.k1(j8);
        }

        @Override // g6.i
        /* JADX INFO: renamed from: r0 */
        public final float getF75992b() {
            return this.f69039a.f69051c;
        }

        @Override // g6.c
        public final float s0(float f14) {
            return this.f69039a.getF75991a() * f14;
        }

        @Override // f5.x
        public final boolean t1() {
            return this.f69039a.t1();
        }

        @Override // g6.c
        public final int v0(long j8) {
            return this.f69039a.v0(j8);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf5/q0$c;", "Lf5/k2;", "<init>", "(Lf5/q0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class c implements k2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g6.o f69049a = g6.o.Rtl;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f69050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f69051c;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/q0$c$a", "Lf5/a1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements a1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f69053a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f69054b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Map<f5.a, Integer> f69055c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e23.l<e2, Unit> f69056d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f69057e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ q0 f69058f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ e23.l<v1.a, Unit> f69059g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super e2, Unit> lVar, c cVar, q0 q0Var, e23.l<? super v1.a, Unit> lVar2) {
                this.f69053a = i14;
                this.f69054b = i15;
                this.f69055c = map;
                this.f69056d = lVar;
                this.f69057e = cVar;
                this.f69058f = q0Var;
                this.f69059g = lVar2;
            }

            @Override // f5.a1
            /* JADX INFO: renamed from: getHeight, reason: from getter */
            public final int getF81749c() {
                return this.f69054b;
            }

            @Override // f5.a1
            /* JADX INFO: renamed from: getWidth, reason: from getter */
            public final int getF81748b() {
                return this.f69053a;
            }

            @Override // f5.a1
            public final Map<f5.a, Integer> p() {
                return this.f69055c;
            }

            @Override // f5.a1
            public final void q() {
                h5.w.b bVar;
                boolean zT1 = this.f69057e.t1();
                e23.l<v1.a, Unit> lVar = this.f69059g;
                q0 q0Var = this.f69058f;
                if (!zT1 || (bVar = q0Var.f69023a.P.f81682c.V0) == null) {
                    lVar.invoke(q0Var.f69023a.P.f81682c.f81866l);
                } else {
                    lVar.invoke(bVar.f81866l);
                }
            }

            @Override // f5.a1
            public final e23.l<e2, Unit> r() {
                return this.f69056d;
            }
        }

        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // f5.k2
        public final List F0(e23.p pVar, Object obj) {
            q0 q0Var = q0.this;
            q0Var.h();
            h5.e0 e0Var = q0Var.f69023a;
            h5.e0.e eVar = e0Var.T.f81841d;
            h5.e0.e eVar2 = h5.e0.e.Measuring;
            if (eVar != eVar2 && eVar != h5.e0.e.LayingOut && eVar != h5.e0.e.LookaheadMeasuring && eVar != h5.e0.e.LookaheadLayingOut) {
                e5.a.b("subcompose can only be used inside the measure or layout blocks");
            }
            p1.t0<Object, h5.e0> t0Var = q0Var.f69029g;
            h5.e0 e0VarD = t0Var.d(obj);
            if (e0VarD == null) {
                e0VarD = q0Var.f69032j.k(obj);
                if (e0VarD != null) {
                    q0Var.f69028f.d(e0VarD);
                    if (q0Var.f69037o <= 0) {
                        e5.a.b("Check failed.");
                    }
                    q0Var.f69037o--;
                } else {
                    e0VarD = q0Var.o(obj);
                    if (e0VarD == null) {
                        int i14 = q0Var.f69026d;
                        h5.e0 e0Var2 = new h5.e0(true, 0, 2, null);
                        e0Var.f81777q = true;
                        e0Var.Q(i14, e0Var2);
                        Unit unit = Unit.INSTANCE;
                        e0Var.f81777q = false;
                        e0VarD = e0Var2;
                    }
                }
                t0Var.m(obj, e0VarD);
            }
            h5.e0 e0Var3 = e0VarD;
            if (p13.h0.e0(q0Var.f69026d, e0Var.E()) != e0Var3) {
                int i15 = ((q3.c.a) e0Var.E()).f142359a.i((T) e0Var3);
                if (i15 < q0Var.f69026d) {
                    e5.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                }
                int i16 = q0Var.f69026d;
                if (i16 != i15) {
                    q0Var.j(i15, i16);
                }
            }
            q0Var.f69026d++;
            q0Var.n(e0Var3, obj, false, pVar);
            return (eVar == eVar2 || eVar == h5.e0.e.LayingOut) ? e0Var3.C() : e0Var3.x();
        }

        @Override // f5.b1
        public final a1 P(int i14, int i15, Map<f5.a, Integer> map, e23.l<? super e2, Unit> lVar, e23.l<? super v1.a, Unit> lVar2) {
            if (!((i14 & (-16777216)) == 0 && ((-16777216) & i15) == 0)) {
                e5.a.b("Size(" + i14 + " x " + i15 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(i14, i15, map, lVar, this, q0.this, lVar2);
        }

        @Override // g6.c
        /* JADX INFO: renamed from: getDensity, reason: from getter */
        public final float getF75991a() {
            return this.f69050b;
        }

        @Override // f5.x
        /* JADX INFO: renamed from: getLayoutDirection, reason: from getter */
        public final g6.o getF68910b() {
            return this.f69049a;
        }

        @Override // g6.i
        /* JADX INFO: renamed from: r0, reason: from getter */
        public final float getF75992b() {
            return this.f69051c;
        }

        @Override // f5.x
        public final boolean t1() {
            h5.e0.e eVar = q0.this.f69023a.T.f81841d;
            return eVar == h5.e0.e.LookaheadLayingOut || eVar == h5.e0.e.LookaheadMeasuring;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/q0$d", "Lf5/j2$b;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements j2.b {
        @Override // f5.j2.b
        public final void dispose() {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/q0$e", "Lf5/j2$b;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements j2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p1.j0 f69060a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f69062c;

        public e(Object obj) {
            this.f69062c = obj;
            int[] iArr = p1.q.f134798a;
            this.f69060a = new p1.j0(0, 1, null);
        }

        @Override // f5.j2.b
        public final int b() {
            h5.e0 e0VarD = q0.this.f69032j.d(this.f69062c);
            if (e0VarD != null) {
                return ((q3.c.a) e0VarD.D()).f142359a.f142358c;
            }
            return 0;
        }

        @Override // f5.j2.b
        public final long c(int i14) {
            h5.e0 e0VarD = q0.this.f69032j.d(this.f69062c);
            if (e0VarD != null && e0VarD.isAttached()) {
                int i15 = ((q3.c.a) e0VarD.D()).f142359a.f142358c;
                if (i14 < 0 || i14 >= i15) {
                    e5.a.d("Index (" + i14 + ") is out of bound of [0, " + i15 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
                }
                if (this.f69060a.a(i14)) {
                    long j8 = (((long) ((h5.e0) ((q3.c.a) e0VarD.D()).get(i14)).T.f81853p.f69144a) << 32) | (((long) ((h5.e0) ((q3.c.a) e0VarD.D()).get(i14)).T.f81853p.f69145b) & 4294967295L);
                    g6.m.a aVar = g6.m.f76012b;
                    return j8;
                }
            }
            g6.m.f76012b.getClass();
            return 0L;
        }

        @Override // f5.j2.b
        public final void d(int i14, long j8) {
            q0 q0Var = q0.this;
            h5.e0 e0VarD = q0Var.f69032j.d(this.f69062c);
            if (e0VarD == null || !e0VarD.isAttached()) {
                return;
            }
            int i15 = ((q3.c.a) e0VarD.D()).f142359a.f142358c;
            if (i14 < 0 || i14 >= i15) {
                e5.a.d("Index (" + i14 + ") is out of bound of [0, " + i15 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
            if (e0VarD.g()) {
                e5.a.a("Pre-measure called on node that is not placed");
            }
            h5.e0 e0Var = q0Var.f69023a;
            e0Var.f81777q = true;
            h5.i0.a(e0VarD).q((h5.e0) ((q3.c.a) e0VarD.D()).get(i14), j8);
            Unit unit = Unit.INSTANCE;
            e0Var.f81777q = false;
            this.f69060a.b(i14);
        }

        @Override // f5.j2.b
        public final void dispose() {
            q0.b(q0.this, this.f69062c);
        }

        @Override // f5.j2.b
        public final void e(c2.s0 s0Var) {
            h5.a1 a1Var;
            h5.e0 e0VarD = q0.this.f69032j.d(this.f69062c);
            h4.r.c cVar = (e0VarD == null || (a1Var = e0VarD.P) == null) ? null : a1Var.f81685f;
            if (cVar == null || !cVar.getIsAttached()) {
                return;
            }
            gl1.d.j0(cVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", s0Var);
        }
    }

    public q0(h5.e0 e0Var, l2 l2Var) {
        this.f69023a = e0Var;
        this.f69025c = l2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void b(q0 q0Var, Object obj) {
        h5.e0 e0Var = q0Var.f69023a;
        q0Var.h();
        h5.e0 e0VarK = q0Var.f69032j.k(obj);
        if (e0VarK != null) {
            if (q0Var.f69037o <= 0) {
                e5.a.b("No pre-composed items to dispose");
            }
            int i14 = ((q3.c.a) e0Var.E()).f142359a.i((T) e0VarK);
            if (i14 < ((q3.c.a) e0Var.E()).f142359a.f142358c - q0Var.f69037o) {
                e5.a.b("Item is not in pre-composed item range");
            }
            q0Var.f69036n++;
            q0Var.f69037o--;
            b bVarD = q0Var.f69028f.d(e0VarK);
            if (bVarD != null) {
                d(bVarD);
            }
            int i15 = (((q3.c.a) e0Var.E()).f142359a.f142358c - q0Var.f69037o) - q0Var.f69036n;
            q0Var.j(i14, i15);
            q0Var.g(i15);
        }
        if (q0Var.f69035m.h(obj)) {
            h5.e0.j0(q0Var.f69023a, true, 6);
        }
    }

    public static void d(b bVar) {
        p3.f2 f2Var = bVar.f69046f;
        if (f2Var != null) {
            f2Var.cancel();
            bVar.f69046f = null;
            b3 b3Var = bVar.f69043c;
            if (b3Var != null) {
                b3Var.dispose();
            }
            bVar.f69043c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // p3.i
    public final void a() {
        b3 b3Var;
        h5.e0 e0Var = this.f69023a;
        e0Var.f81777q = true;
        p1.t0<h5.e0, b> t0Var = this.f69028f;
        Object[] objArr = t0Var.f134722c;
        long[] jArr = t0Var.f134720a;
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
                        if ((255 & j8) < 128 && (b3Var = ((b) objArr[(i14 << 3) + i16]).f69043c) != null) {
                            b3Var.dispose();
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
        e0Var.d0();
        Unit unit = Unit.INSTANCE;
        e0Var.f81777q = false;
        t0Var.g();
        this.f69029g.g();
        this.f69037o = 0;
        this.f69036n = 0;
        this.f69032j.g();
        h();
    }

    public final void c(b bVar, boolean z14) {
        p3.f2 f2Var = bVar.f69046f;
        if (f2Var != null) {
            f4.f.f68735e.getClass();
            f4.f fVarA = f4.f.a.a();
            e23.l<Object, Unit> lVarE = fVarA != null ? fVarA.getF68733f() : null;
            f4.f fVarB = f4.f.a.b(fVarA);
            try {
                h5.e0 e0Var = this.f69023a;
                e0Var.f81777q = true;
                if (z14) {
                    while (!f2Var.isComplete()) {
                        try {
                            f2Var.a(new ds.e0(24));
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                f2Var.apply();
                bVar.f69046f = null;
                Unit unit = Unit.INSTANCE;
                e0Var.f81777q = false;
                f4.f.a.e(fVarA, fVarB, lVarE);
            } catch (Throwable th4) {
                f4.f.a.e(fVarA, fVarB, lVarE);
                throw th4;
            }
        }
    }

    @Override // p3.i
    public final void e() {
        i(false);
    }

    public final j2.b f(Object obj) {
        return !this.f69023a.isAttached() ? new d() : new e(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(int i14) {
        boolean z14;
        boolean z15;
        boolean z16 = false;
        this.f69036n = 0;
        h5.e0 e0Var = this.f69023a;
        List<h5.e0> listE = e0Var.E();
        q3.c.a aVar = (q3.c.a) listE;
        boolean z17 = true;
        int i15 = (aVar.f142359a.f142358c - this.f69037o) - 1;
        if (i14 <= i15) {
            l2.a aVar2 = this.f69033k;
            aVar2.clear();
            p1.r0<Object> r0Var = aVar2.f69005a;
            p1.t0<h5.e0, b> t0Var = this.f69028f;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    b bVarD = t0Var.d((h5.e0) aVar.get(i16));
                    bVarD.getClass();
                    r0Var.b(bVarD.f69041a);
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f69025c.a(aVar2);
            f4.f.f68735e.getClass();
            f4.f fVarA = f4.f.a.a();
            e23.l<Object, Unit> lVarE = fVarA != null ? fVarA.getF68733f() : null;
            f4.f fVarB = f4.f.a.b(fVarA);
            boolean z18 = false;
            while (i15 >= i14) {
                try {
                    h5.e0 e0Var2 = (h5.e0) ((q3.c.a) listE).get(i15);
                    b bVarD2 = t0Var.d(e0Var2);
                    bVarD2.getClass();
                    b bVar = bVarD2;
                    Object obj = bVar.f69041a;
                    if (r0Var.a(obj)) {
                        boolean z19 = z17;
                        this.f69036n++;
                        if (((Boolean) bVar.f69047g.getF182175a()).booleanValue()) {
                            h5.j0 j0Var = e0Var2.T;
                            h5.r0 r0Var2 = j0Var.f81853p;
                            h5.e0.g gVar = h5.e0.g.NotUsed;
                            r0Var2.f81962l = gVar;
                            h5.n0 n0Var = j0Var.f81854q;
                            if (n0Var != null) {
                                n0Var.f81902j = gVar;
                            }
                            m(bVar, false);
                            if (bVar.f69048h) {
                                z14 = z19;
                                z18 = z14;
                            } else {
                                z14 = z19;
                            }
                            z15 = false;
                        } else {
                            z15 = z16;
                            z14 = z19;
                        }
                    } else {
                        e0Var.f81777q = z17;
                        t0Var.k(e0Var2);
                        b3 b3Var = bVar.f69043c;
                        if (b3Var != null) {
                            b3Var.dispose();
                        }
                        z14 = true;
                        e0Var.e0(i15, 1);
                        Unit unit = Unit.INSTANCE;
                        z15 = false;
                        e0Var.f81777q = false;
                    }
                    this.f69029g.k(obj);
                    i15--;
                    boolean z24 = z15;
                    z17 = z14;
                    z16 = z24;
                } catch (Throwable th3) {
                    f4.f.a.e(fVarA, fVarB, lVarE);
                    throw th3;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            f4.f.a.e(fVarA, fVarB, lVarE);
            z16 = z18;
        }
        if (z16) {
            f4.f.f68735e.getClass();
            f4.f.a.f();
        }
        h();
    }

    public final void h() {
        int i14 = ((q3.c.a) this.f69023a.E()).f142359a.f142358c;
        p1.t0<h5.e0, b> t0Var = this.f69028f;
        if (t0Var.f134724e != i14) {
            e5.a.a("Inconsistency between the count of nodes tracked by the state (" + t0Var.f134724e + ") and the children count on the SubcomposeLayout (" + i14 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i14 - this.f69036n) - this.f69037o < 0) {
            StringBuilder sbI = b71.i.i(i14, "Incorrect state. Total children ", ". Reusable children ");
            sbI.append(this.f69036n);
            sbI.append(". Precomposed children ");
            sbI.append(this.f69037o);
            e5.a.a(sbI.toString());
        }
        p1.t0<Object, h5.e0> t0Var2 = this.f69032j;
        if (t0Var2.f134724e == this.f69037o) {
            return;
        }
        e5.a.a("Incorrect state. Precomposed children " + this.f69037o + ". Map size " + t0Var2.f134724e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(boolean z14) {
        this.f69037o = 0;
        this.f69032j.g();
        List<h5.e0> listE = this.f69023a.E();
        int i14 = ((q3.c.a) listE).f142359a.f142358c;
        if (this.f69036n != i14) {
            this.f69036n = i14;
            f4.f.f68735e.getClass();
            f4.f fVarA = f4.f.a.a();
            e23.l<Object, Unit> lVarE = fVarA != null ? fVarA.getF68733f() : null;
            f4.f fVarB = f4.f.a.b(fVarA);
            for (int i15 = 0; i15 < i14; i15++) {
                try {
                    h5.e0 e0Var = (h5.e0) ((q3.c.a) listE).get(i15);
                    b bVarD = this.f69028f.d(e0Var);
                    if (bVarD != null && ((Boolean) bVarD.f69047g.getF182175a()).booleanValue()) {
                        h5.j0 j0Var = e0Var.T;
                        h5.r0 r0Var = j0Var.f81853p;
                        h5.e0.g gVar = h5.e0.g.NotUsed;
                        r0Var.f81962l = gVar;
                        h5.n0 n0Var = j0Var.f81854q;
                        if (n0Var != null) {
                            n0Var.f81902j = gVar;
                        }
                        m(bVarD, z14);
                        bVarD.f69041a = i2.f68961a;
                    }
                } catch (Throwable th3) {
                    f4.f.a.e(fVarA, fVarB, lVarE);
                    throw th3;
                }
            }
            Unit unit = Unit.INSTANCE;
            f4.f.a.e(fVarA, fVarB, lVarE);
            this.f69029g.g();
        }
        h();
    }

    public final void j(int i14, int i15) {
        h5.e0 e0Var = this.f69023a;
        e0Var.f81777q = true;
        e0Var.Y(i14, i15, 1);
        Unit unit = Unit.INSTANCE;
        e0Var.f81777q = false;
    }

    @Override // p3.i
    public final void k() {
        i(true);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void l(Object obj, e23.p<? super p3.m, ? super Integer, Unit> pVar, boolean z14) {
        h5.e0 e0Var = this.f69023a;
        if (e0Var.isAttached()) {
            h();
            if (this.f69029g.b(obj)) {
                return;
            }
            this.f69034l.k(obj);
            p1.t0<Object, h5.e0> t0Var = this.f69032j;
            Object objD = t0Var.d(obj);
            if (objD == null) {
                objD = o(obj);
                if (objD != null) {
                    j(((q3.c.a) e0Var.E()).f142359a.i((T) objD), ((q3.c.a) e0Var.E()).f142359a.f142358c);
                    this.f69037o++;
                } else {
                    int i14 = ((q3.c.a) e0Var.E()).f142359a.f142358c;
                    h5.e0 e0Var2 = new h5.e0(true, 0, 2, null);
                    e0Var.f81777q = true;
                    e0Var.Q(i14, e0Var2);
                    Unit unit = Unit.INSTANCE;
                    e0Var.f81777q = false;
                    this.f69037o++;
                    objD = e0Var2;
                }
                t0Var.m(obj, objD);
            }
            n((h5.e0) objD, obj, z14, pVar);
        }
    }

    public final void m(b bVar, boolean z14) {
        b3 b3Var;
        if (z14 || !bVar.f69048h) {
            bVar.f69047g = p3.p0.n(Boolean.FALSE);
        } else {
            bVar.f69047g.setValue(Boolean.FALSE);
        }
        if (bVar.f69046f != null) {
            d(bVar);
            return;
        }
        if (z14) {
            b3 b3Var2 = bVar.f69043c;
            if (b3Var2 != null) {
                b3Var2.deactivate();
                return;
            }
            return;
        }
        h5.m1 outOfFrameExecutor = h5.i0.a(this.f69023a).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            outOfFrameExecutor.n(new s0(bVar));
        } else {
            if (bVar.f69048h || (b3Var = bVar.f69043c) == null) {
                return;
            }
            b3Var.deactivate();
        }
    }

    public final void n(h5.e0 e0Var, Object obj, boolean z14, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        p3.r rVar;
        h5.e0 e0Var2 = this.f69023a;
        p1.t0<h5.e0, b> t0Var = this.f69028f;
        b bVarD = t0Var.d(e0Var);
        if (bVarD == null) {
            j.f68973a.getClass();
            b bVar = new b(obj, j.f68974b, null, 4, null);
            t0Var.m(e0Var, bVar);
            bVarD = bVar;
        }
        b bVar2 = bVarD;
        boolean z15 = bVar2.f69042b != pVar;
        if (bVar2.f69046f != null) {
            if (z15) {
                d(bVar2);
            } else if (z14) {
                return;
            } else {
                c(bVar2, true);
            }
        }
        b3 b3Var = bVar2.f69043c;
        boolean zW = b3Var != null ? b3Var.w() : true;
        if (z15 || zW || bVar2.f69044d) {
            bVar2.f69042b = pVar;
            if (bVar2.f69046f != null) {
                e5.a.a("new subcompose call while paused composition is still active");
            }
            f4.f.f68735e.getClass();
            f4.f fVarA = f4.f.a.a();
            e23.l<Object, Unit> lVarE = fVarA != null ? fVarA.getF68733f() : null;
            f4.f fVarB = f4.f.a.b(fVarA);
            try {
                e0Var2.f81777q = true;
                b3 b3Var2 = bVar2.f69043c;
                p3.p pVar2 = this.f69024b;
                if (pVar2 == null) {
                    e5.a.c("parent composition reference not set");
                    throw new KotlinNothingValueException();
                }
                if (b3Var2 == null || b3Var2.b()) {
                    if (z14) {
                        ViewGroup.LayoutParams layoutParams = z4.f91670a;
                        rVar = new p3.r(pVar2, new h5.f2(e0Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = z4.f91670a;
                        h5.f2 f2Var = new h5.f2(e0Var);
                        Object obj2 = p3.s.f135268a;
                        rVar = new p3.r(pVar2, f2Var);
                    }
                    b3Var2 = rVar;
                }
                bVar2.f69043c = b3Var2;
                e23.p<? super p3.m, ? super Integer, Unit> eVar = bVar2.f69042b;
                if (h5.i0.a(e0Var2).getOutOfFrameExecutor() != null) {
                    bVar2.f69048h = false;
                } else {
                    bVar2.f69048h = true;
                    eVar = new z3.e(1524156494, true, new v0(bVar2, eVar));
                }
                if (z14) {
                    if (bVar2.f69045e) {
                        bVar2.f69046f = ((p3.d2) b3Var2).l(eVar);
                    } else {
                        bVar2.f69046f = ((p3.d2) b3Var2).q(eVar);
                    }
                } else if (bVar2.f69045e) {
                    b3Var2.p(eVar);
                } else {
                    b3Var2.r(eVar);
                }
                bVar2.f69045e = false;
                Unit unit = Unit.INSTANCE;
                e0Var2.f81777q = false;
                f4.f.a.e(fVarA, fVarB, lVarE);
                bVar2.f69044d = false;
            } catch (Throwable th3) {
                f4.f.a.e(fVarA, fVarB, lVarE);
                throw th3;
            }
        }
    }

    public final h5.e0 o(Object obj) {
        p1.t0<h5.e0, b> t0Var;
        int i14;
        if (this.f69036n == 0) {
            return null;
        }
        q3.c.a aVar = (q3.c.a) this.f69023a.E();
        int i15 = aVar.f142359a.f142358c - this.f69037o;
        int i16 = i15 - this.f69036n;
        int i17 = i15 - 1;
        int i18 = i17;
        while (true) {
            t0Var = this.f69028f;
            if (i18 < i16) {
                i14 = -1;
                break;
            }
            b bVarD = t0Var.d((h5.e0) aVar.get(i18));
            bVarD.getClass();
            if (p005kotlin.jvm.internal.s.g(bVarD.f69041a, obj)) {
                i14 = i18;
                break;
            }
            i18--;
        }
        if (i14 == -1) {
            while (true) {
                if (i17 < i16) {
                    i18 = i17;
                    break;
                }
                b bVarD2 = t0Var.d((h5.e0) aVar.get(i17));
                bVarD2.getClass();
                b bVar = bVarD2;
                Object obj2 = bVar.f69041a;
                if (obj2 == i2.f68961a || this.f69025c.b(obj, obj2)) {
                    bVar.f69041a = obj;
                    i18 = i17;
                    i14 = i18;
                    break;
                }
                i17--;
            }
        }
        if (i14 == -1) {
            return null;
        }
        if (i18 != i16) {
            j(i18, i16);
        }
        this.f69036n--;
        h5.e0 e0Var = (h5.e0) aVar.get(i16);
        b bVarD3 = t0Var.d(e0Var);
        bVarD3.getClass();
        b bVar2 = bVarD3;
        bVar2.f69047g = p3.p0.n(Boolean.TRUE);
        bVar2.f69045e = true;
        bVar2.f69044d = true;
        return e0Var;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf5/q0$b;", "", "slotId", "Lkotlin/Function0;", "", FirebaseAnalytics.Param.CONTENT, "Lp3/b3;", "composition", "<init>", "(Ljava/lang/Object;Le23/p;Lp3/b3;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f69041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e23.p<? super p3.m, ? super Integer, Unit> f69042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b3 f69043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f69044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f69045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public p3.f2 f69046f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p3.c2 f69047g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f69048h;

        public b(Object obj, e23.p<? super p3.m, ? super Integer, Unit> pVar, b3 b3Var) {
            this.f69041a = obj;
            this.f69042b = pVar;
            this.f69043c = b3Var;
            this.f69047g = p3.p0.n(Boolean.TRUE);
        }

        public /* synthetic */ b(Object obj, e23.p pVar, b3 b3Var, int i14, p005kotlin.jvm.internal.j jVar) {
            this(obj, pVar, (i14 & 4) != 0 ? null : b3Var);
        }
    }
}
