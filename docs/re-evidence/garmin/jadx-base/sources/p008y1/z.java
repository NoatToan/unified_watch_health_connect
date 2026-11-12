package p008y1;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import e23.p;
import f5.c0;
import g6.m;
import g6.n;
import h4.r;
import h5.b0;
import h5.c1;
import h5.h;
import i2.f;
import i2.g;
import j23.l;
import j23.t;
import java.util.concurrent.CancellationException;
import lc.u0;
import n4.d;
import o13.q;
import o53.a0;
import o53.d0;
import o53.j;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import u1.g0;
import u1.k1;
import v13.e;
import v13.i;
import x72.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0012B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ly1/z;", "Lh4/r$c;", "Li2/f;", "Lh5/h;", "Lh5/b0;", "Ly1/b2;", ModelSourceWrapper.ORIENTATION, "Ly1/h3;", "scrollingLogic", "", "reverseDirection", "Ly1/x;", "bringIntoViewSpec", "Lkotlin/Function0;", "Ln4/d;", "getFocusedRect", "<init>", "(Ly1/b2;Ly1/h3;ZLy1/x;Le23/a;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z extends r.c implements f, h, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b2 f193730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3 f193731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f193732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f193733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<d> f193734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f193735f = new w();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c0 f193736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f193737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f193738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f193739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f193740k;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly1/z$a;", "", "Lkotlin/Function0;", "Ln4/d;", "currentBounds", "Lo53/j;", "", "continuation", "<init>", "(Le23/a;Lo53/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e23.a<d> f193741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j<Unit> f193742b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.a<d> aVar, j<? super Unit> jVar) {
            this.f193741a = aVar;
            this.f193742b = jVar;
        }

        public final String toString() {
            j<Unit> jVar = this.f193742b;
            a0 a0Var = (a0) jVar.getF157466b().get(a0.f129303b);
            String str = a0Var != null ? a0Var.f129304a : null;
            StringBuilder sb3 = new StringBuilder("Request@");
            int iHashCode = hashCode();
            d53.a.a(16);
            String string = Integer.toString(iHashCode, 16);
            string.getClass();
            sb3.append(string);
            sb3.append(str != null ? am.j.m("[", str, "](") : "(");
            sb3.append("currentBounds()=");
            sb3.append(this.f193741a.invoke());
            sb3.append(", continuation=");
            sb3.append(jVar);
            sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb3.toString();
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f193743a;

        static {
            int[] iArr = new int[b2.values().length];
            try {
                iArr[b2.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b2.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f193743a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {282}, m = "invokeSuspend", v = 1)
    public static final class c extends i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f193745b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3 f193747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x f193748e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f193749f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/y1;", "", "<anonymous>", "(Ly1/y1;)V"}, k = 3, mv = {2, 0, 0})
        @e(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {289}, m = "invokeSuspend", v = 1)
        public static final class a extends i implements p<y1, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f193750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f193751b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x3 f193752c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ z f193753d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ x f193754e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ long f193755f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ l1 f193756g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x3 x3Var, z zVar, x xVar, long j8, l1 l1Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f193752c = x3Var;
                this.f193753d = zVar;
                this.f193754e = xVar;
                this.f193755f = j8;
                this.f193756g = l1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f193752c, this.f193753d, this.f193754e, this.f193755f, this.f193756g, dVar);
                aVar.f193751b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(y1 y1Var, t13.d<? super Unit> dVar) {
                return ((a) create(y1Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f193750a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    y1 y1Var = (y1) this.f193751b;
                    long j8 = this.f193755f;
                    z zVar = this.f193753d;
                    x xVar = this.f193754e;
                    float fU1 = z.U1(zVar, xVar, j8);
                    x3 x3Var = this.f193752c;
                    x3Var.f193716e = fU1;
                    wn2.f fVar = new wn2.f(zVar, x3Var, this.f193756g, y1Var);
                    k kVar = new k(zVar, 5, x3Var, xVar);
                    this.f193750a = 1;
                    if (x3Var.a(fVar, kVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x3 x3Var, x xVar, long j8, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f193747d = x3Var;
            this.f193748e = xVar;
            this.f193749f = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = z.this.new c(this.f193747d, this.f193748e, this.f193749f, dVar);
            cVar.f193745b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193744a;
            z zVar = z.this;
            try {
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        l1 l1VarG = g8.i.G(((o53.b0) this.f193745b).getF195311f());
                        zVar.f193740k = true;
                        h3 h3Var = zVar.f193731b;
                        k1 k1Var = k1.Default;
                        a aVar2 = new a(this.f193747d, zVar, this.f193748e, this.f193749f, l1VarG, null);
                        this.f193744a = 1;
                        if (h3Var.h(k1Var, aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    zVar.f193735f.b();
                    zVar.f193740k = false;
                    zVar.f193735f.a(null);
                    zVar.f193737h = false;
                    return Unit.INSTANCE;
                } catch (CancellationException e4) {
                    throw e4;
                }
            } catch (Throwable th3) {
                zVar.f193740k = false;
                zVar.f193735f.a(null);
                zVar.f193737h = false;
                throw th3;
            }
        }
    }

    public z(b2 b2Var, h3 h3Var, boolean z14, x xVar, e23.a<d> aVar) {
        this.f193730a = b2Var;
        this.f193731b = h3Var;
        this.f193732c = z14;
        this.f193733d = xVar;
        this.f193734e = aVar;
        m.f76012b.getClass();
        this.f193739j = 0L;
    }

    public static final float U1(z zVar, x xVar, long j8) {
        float f14;
        d dVar;
        int iCompare;
        long j14 = zVar.f193739j;
        m.f76012b.getClass();
        if (m.c(j14, 0L)) {
            return 0.0f;
        }
        q3.c<a> cVar = zVar.f193735f.f193690a;
        int i14 = cVar.f142358c - 1;
        a[] aVarArr = cVar.f142356a;
        if (i14 < aVarArr.length) {
            dVar = null;
            while (true) {
                if (i14 < 0) {
                    f14 = 0.0f;
                    break;
                }
                d dVarInvoke = aVarArr[i14].f193741a.invoke();
                if (dVarInvoke != null) {
                    long jG = dVarInvoke.g();
                    f14 = 0.0f;
                    long jC = n.c(zVar.f193739j);
                    int i15 = b.f193743a[zVar.f193730a.ordinal()];
                    if (i15 == 1) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jG & 4294967295L)), Float.intBitsToFloat((int) (jC & 4294967295L)));
                    } else {
                        if (i15 != 2) {
                            u0.r();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jG >> 32)), Float.intBitsToFloat((int) (jC >> 32)));
                    }
                    if (iCompare > 0) {
                        if (dVar != null) {
                            break;
                        }
                        dVar = dVarInvoke;
                        break;
                    }
                    dVar = dVarInvoke;
                }
                i14--;
            }
        } else {
            f14 = 0.0f;
            dVar = null;
        }
        if (dVar == null) {
            d dVarW1 = zVar.f193737h ? zVar.W1() : null;
            if (dVarW1 == null) {
                return f14;
            }
            dVar = dVarW1;
        }
        long jC2 = n.c(zVar.f193739j);
        int i16 = b.f193743a[zVar.f193730a.ordinal()];
        if (i16 == 1) {
            float f15 = dVar.f123548b;
            g6.k.a aVar = g6.k.f76003b;
            return xVar.a(f15 - ((int) (j8 & 4294967295L)), dVar.f123550d - f15, Float.intBitsToFloat((int) (jC2 & 4294967295L)));
        }
        if (i16 != 2) {
            u0.r();
            return f14;
        }
        float f16 = dVar.f123547a;
        g6.k.a aVar2 = g6.k.f76003b;
        return xVar.a(f16 - ((int) (j8 >> 32)), dVar.f123549c - f16, Float.intBitsToFloat((int) (jC2 >> 32)));
    }

    public static boolean X1(z zVar, d dVar, long j8, long j14, int i14) {
        if ((i14 & 1) != 0) {
            j8 = zVar.f193739j;
        }
        long j15 = j8;
        if ((i14 & 2) != 0) {
            g6.k.f76003b.getClass();
            j14 = 0;
        }
        long jZ1 = zVar.Z1(dVar, j15, j14);
        return Math.abs(Float.intBitsToFloat((int) (jZ1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jZ1 & 4294967295L))) <= 0.5f;
    }

    @Override // i2.f
    public final d G(d dVar) {
        long j8 = this.f193739j;
        m.f76012b.getClass();
        if (m.c(j8, 0L)) {
            b2.e.c("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        long j14 = this.f193739j;
        g6.k.f76003b.getClass();
        long jZ1 = (-9223372034707292160L) ^ Z1(dVar, j14, 0L);
        n4.c.a aVar = n4.c.f123541b;
        return dVar.o(jZ1);
    }

    @Override // i2.f
    public final Object J1(g.a.C1729a c1729a, g.a aVar) throws Throwable {
        d dVar = (d) c1729a.invoke();
        if (dVar != null && !X1(this, dVar, 0L, 0L, 3)) {
            o53.k kVar = new o53.k(u13.f.b(aVar), 1);
            kVar.q();
            a aVar2 = new a(c1729a, kVar);
            w wVar = this.f193735f;
            q3.c<a> cVar = wVar.f193690a;
            d dVarInvoke = aVar2.f193741a.invoke();
            j<Unit> jVar = aVar2.f193742b;
            if (dVarInvoke == null) {
                int i14 = q.f128596b;
                jVar.resumeWith(Unit.INSTANCE);
            } else {
                jVar.r(new x9.b(10, wVar, aVar2));
                l lVarO = t.o(0, cVar.f142358c);
                int i15 = lVarO.f96796a;
                int i16 = lVarO.f96797b;
                if (i15 > i16) {
                    cVar.a(0, aVar2);
                    break;
                }
                while (true) {
                    d dVarInvoke2 = cVar.f142356a[i16].f193741a.invoke();
                    if (dVarInvoke2 != null) {
                        d dVarK = dVarInvoke.k(dVarInvoke2);
                        if (!dVarK.equals(dVarInvoke)) {
                            if (!dVarK.equals(dVarInvoke2)) {
                                CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                int i17 = cVar.f142358c - 1;
                                if (i17 <= i16) {
                                    while (true) {
                                        cVar.f142356a[i16].f193742b.u(cancellationException);
                                        if (i17 == i16) {
                                            break;
                                        }
                                        i17++;
                                    }
                                }
                            }
                        } else {
                            cVar.a(i16 + 1, aVar2);
                            break;
                        }
                    }
                    if (i16 == i15) {
                        cVar.a(0, aVar2);
                        break;
                    }
                    i16--;
                }
                if (!this.f193740k) {
                    g6.k.f76003b.getClass();
                    Y1(0L);
                }
            }
            Object objP = kVar.p();
            return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final int V1(long j8, long j14) {
        int i14 = b.f193743a[this.f193730a.ordinal()];
        if (i14 == 1) {
            return s.h((int) (j8 & 4294967295L), (int) (j14 & 4294967295L));
        }
        if (i14 == 2) {
            return s.h((int) (j8 >> 32), (int) (j14 >> 32));
        }
        u0.r();
        return 0;
    }

    public final d W1() {
        if (g0.f167500g) {
            return this.f193734e.invoke();
        }
        if (getIsAttached()) {
            c1 c1VarF = h5.k.f(this);
            c0 c0Var = this.f193736g;
            if (c0Var != null) {
                if (!c0Var.isAttached()) {
                    c0Var = null;
                }
                if (c0Var != null) {
                    return c1VarF.j0(c0Var, false);
                }
            }
        }
        return null;
    }

    public final void Y1(long j8) {
        x xVar = this.f193733d;
        if (xVar == null) {
            xVar = (x) h5.i.a(this, y.f193717a);
        }
        x xVar2 = xVar;
        if (this.f193740k) {
            b2.e.c("launchAnimation called when previous animation was running");
        }
        x xVar3 = this.f193733d;
        if (xVar3 == null) {
            xVar3 = (x) h5.i.a(this, y.f193717a);
        }
        xVar3.getClass();
        x.f193700a.getClass();
        ge1.b.T(getCoroutineScope(), null, d0.UNDISPATCHED, new c(new x3(x.a.f193702b), xVar2, j8, null), 1);
    }

    public final long Z1(d dVar, long j8, long j14) {
        long jC = n.c(j8);
        int i14 = b.f193743a[this.f193730a.ordinal()];
        if (i14 == 1) {
            x xVar = this.f193733d;
            if (xVar == null) {
                xVar = (x) h5.i.a(this, y.f193717a);
            }
            float f14 = dVar.f123548b;
            g6.k.a aVar = g6.k.f76003b;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(xVar.a(f14 - ((int) (j14 & 4294967295L)), dVar.f123550d - f14, Float.intBitsToFloat((int) (jC & 4294967295L))))) & 4294967295L);
            n4.c.a aVar2 = n4.c.f123541b;
            return jFloatToRawIntBits;
        }
        if (i14 != 2) {
            u0.r();
            return 0L;
        }
        x xVar2 = this.f193733d;
        if (xVar2 == null) {
            xVar2 = (x) h5.i.a(this, y.f193717a);
        }
        float f15 = dVar.f123547a;
        g6.k.a aVar3 = g6.k.f76003b;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(xVar2.a(f15 - ((int) (j14 >> 32)), dVar.f123549c - f15, Float.intBitsToFloat((int) (jC >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        n4.c.a aVar4 = n4.c.f123541b;
        return jFloatToRawIntBits2;
    }

    @Override // h5.b0, h5.w0
    public final void e(long j8) {
        long j14;
        d dVarW1;
        boolean z14 = g0.f167500g;
        long j15 = this.f193739j;
        if (z14) {
            this.f193739j = j8;
            if (V1(j8, j15) >= 0) {
                return;
            }
            if (this.f193732c) {
                g6.k.f76003b.getClass();
                j14 = 0;
            } else if (this.f193730a == b2.Vertical) {
                j14 = (((long) 0) << 32) | (((long) (((int) (j15 & 4294967295L)) - ((int) (j8 & 4294967295L)))) & 4294967295L);
                g6.k.a aVar = g6.k.f76003b;
            } else {
                j14 = (((long) (((int) (j15 >> 32)) - ((int) (j8 >> 32)))) << 32) | (((long) 0) & 4294967295L);
                g6.k.a aVar2 = g6.k.f76003b;
            }
            d dVarInvoke = this.f193734e.invoke();
            if (dVarInvoke == null || this.f193740k || this.f193737h) {
                return;
            }
            if (X1(this, dVarInvoke, j15, 0L, 2)) {
                long j16 = j14;
                if (X1(this, dVarInvoke, 0L, j16, 1)) {
                    return;
                }
                this.f193737h = true;
                Y1(j16);
            }
        } else {
            this.f193739j = j8;
            if (V1(j8, j15) < 0 && !this.f193740k && !this.f193737h && (dVarW1 = W1()) != null) {
                if (X1(this, dVarW1, j15, 0L, 2)) {
                    this.f193738i = true;
                }
            }
        }
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }
}
