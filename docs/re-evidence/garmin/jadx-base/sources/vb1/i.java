package vb1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.w;
import c2.l;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c80.i0;
import c80.l0;
import c80.q0;
import com.garmin.android.apps.connectmobile.R;
import cr.t;
import e23.p;
import e23.q;
import f5.z0;
import g6.o;
import h4.k;
import h5.e0;
import i3.i7;
import i3.mh;
import kotlin.t1;
import l72.u0;
import o13.r;
import o4.d0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p40.j0;
import p5.v;
import r1.c0;
import r53.j;
import u1.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.presentation.components.SmallPromoCardKt$SmallPromoCard$1$1", f = "SmallPromoCard.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f176909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f176910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r53.i<q0> f176911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l0.e f176912d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f176913e;

        /* JADX INFO: renamed from: vb1.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.presentation.components.SmallPromoCardKt$SmallPromoCard$1$1$1", f = "SmallPromoCard.kt", l = {87}, m = "invokeSuspend", v = 2)
        public static final class C3307a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f176914a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r53.i<q0> f176915b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l0.e f176916c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f176917d;

            /* JADX INFO: renamed from: vb1.i$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C3308a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ l0.e f176918a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p1<Boolean> f176919b;

                public C3308a(l0.e eVar, p1<Boolean> p1Var) {
                    this.f176918a = eVar;
                    this.f176919b = p1Var;
                }

                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    q0 q0Var = (q0) obj;
                    if ((q0Var instanceof q0.a) && ((q0.a) q0Var).f25550a == this.f176918a.f25409a) {
                        this.f176919b.setValue(Boolean.FALSE);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3307a(r53.i<? extends q0> iVar, l0.e eVar, p1<Boolean> p1Var, t13.d<? super C3307a> dVar) {
                super(2, dVar);
                this.f176915b = iVar;
                this.f176916c = eVar;
                this.f176917d = p1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3307a(this.f176915b, this.f176916c, this.f176917d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3307a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f176914a;
                if (i14 == 0) {
                    r.b(obj);
                    C3308a c3308a = new C3308a(this.f176916c, this.f176917d);
                    this.f176914a = 1;
                    if (this.f176915b.collect(c3308a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.a<Unit> aVar, r53.i<? extends q0> iVar, l0.e eVar, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f176910b = aVar;
            this.f176911c = iVar;
            this.f176912d = eVar;
            this.f176913e = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f176910b, this.f176911c, this.f176912d, this.f176913e, dVar);
            aVar.f176909a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f176909a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f176910b.invoke();
            ge1.b.T(b0Var, null, null, new C3307a(this.f176911c, this.f176912d, this.f176913e, null), 3);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f176920a;

        static {
            int[] iArr = new int[i0.values().length];
            try {
                iArr[i0.GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i0.MASK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f176920a = iArr;
        }
    }

    public static final void a(int i14, h4.r rVar, String str, String str2, m mVar) {
        o0 o0Var;
        boolean z14;
        boolean z15;
        o0 o0VarE = mVar.E(-1442976008);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = x2.c(l.y(rVar, eVar.f97920e), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            z zVarA = y.a(gVar, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (str == null) {
                o0VarE.C(-629677882);
                o0VarE.g0(false);
                o0Var = o0VarE;
                z14 = false;
                z15 = true;
            } else {
                o0VarE.C(-629677881);
                h4.r.a aVar2 = h4.r.S;
                bVar.getClass();
                h4.r rVarC3 = l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                d92.b.f58624b.getClass();
                z14 = false;
                z15 = true;
                mh.c(str, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
            if (str2 == null) {
                o0Var.C(-629442499);
                o0Var.g0(z14);
            } else {
                o0Var.C(-629442498);
                long jA = d92.b.a(o0Var).k().a();
                d92.b.f58624b.getClass();
                o0 o0Var2 = o0Var;
                mh.c(str2, null, jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, o0Var2, 0, 0, 131066);
                o0Var = o0Var2;
                o0Var.g0(z14);
            }
            o0Var.g0(z15);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h(rVar, str, str2, i14, 22);
        }
    }

    public static final void b(int i14, e23.a aVar, h4.r rVar, m mVar) {
        e23.a aVar2;
        h4.r rVar2;
        o0 o0VarE = mVar.E(-1304607539);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            aVar2 = aVar;
            rVar2 = rVar;
            u0.a(rVar2, null, gl1.y.Q(o0VarE, R.string.lbl_dismiss), null, aVar2, o0VarE, (i15 & 14) | ((i15 << 9) & 57344), 10);
        } else {
            aVar2 = aVar;
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(rVar2, aVar2, i14, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    public static final void c(h4.r rVar, l0.e.a aVar, boolean z14, long j8, m mVar, int i14) {
        h4.r rVarD;
        h4.r rVar2;
        o0 o0VarE = mVar.E(-953717833);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.l(j8) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            o oVar = (o) o0VarE.A(t1.f91496n);
            int i16 = b.f176920a[aVar.f25434b.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    o0VarE.C(-998349246);
                    boolean zK = ((i15 & 7168) == 2048) | o0VarE.k(oVar.ordinal()) | ((i15 & 896) == 256);
                    Object objQ = o0VarE.q();
                    if (zK) {
                        ba1.b bVar = new ba1.b(j8, oVar, z14, 2);
                        o0VarE.K(bVar);
                        objQ = bVar;
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            ba1.b bVar2 = new ba1.b(j8, oVar, z14, 2);
                            o0VarE.K(bVar2);
                            objQ = bVar2;
                        }
                    }
                    rVarD = l4.k.e(rVar, (e23.l) objQ);
                    o0VarE.g0(false);
                } else {
                    if (i16 != 3) {
                        throw kg.f.h(o0VarE, -1694794324, false);
                    }
                    o0VarE.C(-1694748481);
                    o0VarE.g0(false);
                    rVar2 = rVar;
                }
                f5.k.f68985a.getClass();
                y0.a(aVar.f25433a, aVar.f25435c, rVar2, null, f5.k.a.f68987b, 0.0f, null, o0VarE, 24576, 104);
            } else {
                o0VarE.C(-998973183);
                o4.w.a aVar2 = o4.w.f129023a;
                Float fValueOf = Float.valueOf(0.0f);
                d92.b.f58623a.getClass();
                o13.p[] pVarArr = {new o13.p(fValueOf, d0.a(d0.c(0.0f, d92.b.a(o0VarE).e().g(), 14))), new o13.p(Float.valueOf(0.6f), d0.a(d92.b.a(o0VarE).e().g()))};
                o oVar2 = o.Ltr;
                rVarD = u1.n.d(rVar, o4.w.a.c(aVar2, pVarArr, oVar == oVar2 ? 0.0f : Float.POSITIVE_INFINITY, oVar == oVar2 ? Float.POSITIVE_INFINITY : 0.0f, 8), null, 6);
                o0VarE.g0(false);
            }
            rVar2 = rVarD;
            f5.k.f68985a.getClass();
            y0.a(aVar.f25433a, aVar.f25435c, rVar2, null, f5.k.a.f68987b, 0.0f, null, o0VarE, 24576, 104);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(rVar, aVar, z14, j8, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final h4.r rVar, final l0.e eVar, r53.i<? extends q0> iVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, final e23.l<? super Context, Unit> lVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        p1 p1Var;
        Unit unit;
        rVar.getClass();
        o0 o0VarE = mVar.E(545370776);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(eVar) ? 32 : 16) | (o0VarE.r(iVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean z14 = true;
            final String str = eVar.f25432i;
            final String str2 = eVar.f25431h;
            final o13.p<t4.d, String> pVar = eVar.f25429f;
            final l0.e.a aVar3 = eVar.f25427d;
            boolean z15 = c22.b.a(context) <= 1.3f;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            final float f14 = j92.b.f97900c.f97911c;
            final long jT = v.h.t(o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            Unit unit2 = Unit.INSTANCE;
            boolean zR = ((i16 & 7168) == 2048) | o0VarE.r(iVar) | ((i16 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                p1Var = p1Var2;
                unit = unit2;
                a aVar4 = new a(aVar, iVar, eVar, p1Var, null);
                o0VarE.K(aVar4);
                objQ2 = aVar4;
            } else {
                p1Var = p1Var2;
                unit = unit2;
            }
            p3.l0.e((p) objQ2, unit, o0VarE);
            if ((57344 & i16) != 16384) {
                z14 = false;
            }
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new j0(aVar2, p1Var, 19);
                o0VarE.K(objQ3);
            }
            final e23.a aVar5 = (e23.a) objQ3;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            r1.x1 x1VarJ = r1.u0.j(null, null, 15);
            final boolean z16 = z15;
            z3.e eVarC = z3.f.c(-424665744, new q() { // from class: vb1.h
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v2 */
                /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r12v4 */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    h4.r.a aVar6;
                    long j8;
                    ?? r14;
                    float f15;
                    e23.a aVar7;
                    l0.e.a aVar8;
                    l0.e eVar2 = eVar;
                    boolean z17 = eVar2.f25410b;
                    m mVar2 = (m) obj2;
                    ((Integer) obj3).getClass();
                    ((r1.e0) obj).getClass();
                    x1 x1Var2 = n.f135158a;
                    float f16 = f14;
                    k2.h hVarA = k2.i.a(f16);
                    h4.r rVar2 = rVar;
                    long j14 = jT;
                    h4.r rVarE = u1.n.e(rVar2, j14, hVarA);
                    Object objQ4 = mVar2.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a2 = m.a.f135155b;
                    if (objQ4 == c2565a2) {
                        objQ4 = new d(3);
                        mVar2.K(objQ4);
                    }
                    h4.r rVarC = v.c((e23.l) objQ4, rVarE, true);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC2 = k.c(rVarC, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar9);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar3 = h5.g.a.f81810g;
                    b4.c(eVar3, z0VarD, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar2);
                    u uVar = u.f22885a;
                    h4.r.a aVar10 = h4.r.S;
                    h4.r rVarB = l4.k.b(l.o(x2.f(aVar10, 1.0f), q1.Min), k2.i.a(f16));
                    e23.l lVar2 = lVar;
                    boolean zB = mVar2.B(lVar2);
                    Context context2 = context;
                    boolean zR2 = zB | mVar2.r(context2);
                    Object objQ5 = mVar2.q();
                    if (zR2 || objQ5 == c2565a2) {
                        objQ5 = new kv0.e(4, context2, lVar2);
                        mVar2.K(objQ5);
                    }
                    h4.r rVarD = u1.w.d(rVarB, false, null, null, (e23.a) objQ5, 15);
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81533k, mVar2, 6);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC3 = k.c(rVarD, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar9);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar3, s2VarA, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC3, mVar2);
                    u2 u2Var = u2.f22900a;
                    o13.p pVar2 = pVar;
                    if (pVar2 == null) {
                        mVar2.C(-1929115769);
                        mVar2.f();
                        aVar6 = aVar10;
                        f15 = 1.0f;
                        r14 = 0;
                    } else {
                        mVar2.C(-1929115768);
                        t4.d dVar = (t4.d) pVar2.f128594a;
                        String str3 = (String) pVar2.f128595b;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f17 = j92.b.f97899b.f97920e;
                        aVar6 = aVar10;
                        h4.r rVarQ = x2.q(l.C(aVar10, f17, f17, 0.0f, 0.0f, 12), j92.b.f97901d.f97905d);
                        d0 d0Var = eVar2.f25430g;
                        if (d0Var != null) {
                            j8 = d0Var.f128833a;
                        } else {
                            d0.f128823b.getClass();
                            j8 = d0.f128832k;
                        }
                        r14 = 0;
                        f15 = 1.0f;
                        i7.a(dVar, str3, rVarQ, j8, mVar2, 0, 0);
                        Unit unit3 = Unit.INSTANCE;
                        mVar2.f();
                    }
                    i.a(r14, u2Var.a(aVar6, 2.0f, true), str2, str, mVar2);
                    boolean z18 = z16;
                    e23.a aVar11 = aVar5;
                    if (!z18 || (aVar8 = aVar3) == null) {
                        aVar7 = aVar11;
                        if (z17) {
                            mVar2.C(-1927815938);
                            Object objQ6 = mVar2.q();
                            if (objQ6 == c2565a2) {
                                objQ6 = new d(4);
                                mVar2.K(objQ6);
                            }
                            i.b(r14, aVar7, v.c((e23.l) objQ6, aVar6, r14), mVar2);
                            mVar2.f();
                        } else {
                            mVar2.C(-1927560312);
                            mVar2.f();
                        }
                    } else {
                        mVar2.C(-1928246993);
                        g6.f.a aVar12 = g6.f.f75994b;
                        h4.r rVarH = x2.h(x2.c(u2Var.a(aVar6, f15, true), f15), (float) r14);
                        boolean z19 = !eVar2.f25428e;
                        aVar7 = aVar11;
                        i.c(rVarH, aVar8, z19, j14, mVar2, 64);
                        mVar2.f();
                    }
                    mVar2.y();
                    if (z18 && z17) {
                        mVar2.C(-310896311);
                        h4.r rVarC4 = uVar.c(aVar6, h4.d.a.f81526d);
                        Object objQ7 = mVar2.q();
                        if (objQ7 == c2565a2) {
                            objQ7 = new d(5);
                            mVar2.K(objQ7);
                        }
                        i.b(r14, aVar7, v.c((e23.l) objQ7, rVarC4, r14), mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-310616660);
                        mVar2.f();
                    }
                    mVar2.y();
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            o0Var = o0VarE;
            c0.e(zBooleanValue, null, null, x1VarJ, null, eVarC, o0Var, 199680, 22);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(rVar, eVar, iVar, aVar, aVar2, lVar, i14, 19);
        }
    }
}
