package ku1;

import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import ca0.q1;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import f5.z0;
import h5.e0;
import i3.mh;
import l72.f0;
import l72.y2;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.composable.PlanCreationScreenKt$PlanCreationProgressContent$1$1", f = "PlanCreationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f106568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m1 f106569b;

        /* JADX INFO: renamed from: ku1.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.training.composable.PlanCreationScreenKt$PlanCreationProgressContent$1$1$1", f = "PlanCreationScreen.kt", l = {92}, m = "invokeSuspend", v = 2)
        public static final class C2057a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f106570a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f106571b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2057a(m1 m1Var, t13.d<? super C2057a> dVar) {
                super(2, dVar);
                this.f106571b = m1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2057a(this.f106571b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C2057a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f106570a;
                if (i14 == 0) {
                    r.b(obj);
                    q1 q1Var = new q1(this.f106571b, 4);
                    this.f106570a = 1;
                    if (g.g(q1Var, this) == aVar) {
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
        public a(b0 b0Var, m1 m1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f106568a = b0Var;
            this.f106569b = m1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f106568a, this.f106569b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ge1.b.T(this.f106568a, null, null, new C2057a(this.f106569b, null), 3);
            return Unit.INSTANCE;
        }
    }

    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(1984582715);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.r.a aVar3 = h4.r.S;
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            f0 f0Var = f0.f110999a;
            f0Var.d(((i15 << 12) & 57344) | 384, 9, aVar, x2.f(aVar3, 1.0f), gl1.y.Q(o0VarE, R.string.lbl_try_again), o0VarE, null, false);
            f0Var.k(gl1.y.Q(o0VarE, R.string.lbl_cancel_setup), x2.f(aVar3, 1.0f), false, aVar2, o0VarE, ((i15 << 6) & 7168) | 48, 4);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.l(aVar, aVar2, i14, 5, (byte) 0);
        }
    }

    public static final void b(p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1736570108);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar.getClass();
            z zVarA = y.a(c2.j.i(f14), aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_whoops);
            d6.h.f57752b.getClass();
            int i15 = d6.h.f57755e;
            d6.h hVarA = d6.h.a(i15);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97930g, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 130046);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_atp_error);
            d6.h hVarA2 = d6.h.a(i15);
            fVar.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97931h, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 130046);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kc0.a(i14, 26);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1019104909);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = n23.j.o(0.0f, o0VarE);
            }
            m1 m1Var = (m1) objQ2;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(b0Var);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new a(b0Var, m1Var, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, unit, o0VarE);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar.getClass();
            z zVarA = y.a(c2.j.i(f14), aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_creating_plan);
            d6.h.f57752b.getClass();
            d6.h hVarA = d6.h.a(d6.h.f57755e);
            d92.b.f58624b.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97929f, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 130046);
            o0VarE = o0VarE;
            y2.f111386a.c(m1Var.getFloatValue(), null, false, o0VarE, 0, 6);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kc0.a(i14, 25);
        }
    }

    public static final void d(int i14, boolean z14, boolean z15, String str, e23.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i15) {
        int i16;
        o0 o0Var;
        String str2;
        e23.a aVar4;
        int i17;
        e23.a aVar5 = aVar2;
        e23.a aVar6 = aVar3;
        str.getClass();
        o0 o0VarE = mVar.E(-319362149);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.h(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.r(aVar5) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i16 |= o0VarE.r(aVar6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i18 = i16;
        if (o0VarE.n(i18 & 1, (i18 & 599187) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar7 = h4.r.S;
            h4.r rVarD = x2.d(aVar7, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar8 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            h4.r rVarA = l4.k.a(x2.d(aVar7, 1.0f), 0.3f);
            f5.k.f68985a.getClass();
            y0.a(n5.c.a(i14, o0VarE, i18 & 14), null, rVarA, null, f5.k.a.f68987b, 0.0f, null, o0VarE, 25008, 104);
            o0Var = o0VarE;
            h4.r rVarF = x2.f(aVar7, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarC2 = uVar.c(c2.l.y(rVarF, eVar2.f97920e), h4.d.a.f81528f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.g.a aVar9 = h4.d.a.f81536n;
            z zVarA = y.a(kVar, aVar9, o0Var, 0);
            int iHashCode2 = Long.hashCode(o0Var.U);
            i2 i2VarA1 = o0Var.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0Var);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar8);
            } else {
                o0Var.c();
            }
            b4.c(eVar, zVarA, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0Var);
            c2.b0 b0Var = c2.b0.f22601a;
            if (z14) {
                o0Var.C(-184411500);
                i17 = 0;
                c(o0Var, 0);
                o0Var.g0(false);
                str2 = str;
            } else {
                i17 = 0;
                if (z15) {
                    o0Var.C(-184409469);
                    str2 = str;
                    f(str2, o0Var, (i18 >> 9) & 14);
                    o0Var.g0(false);
                } else {
                    str2 = str;
                    o0Var.C(-184407279);
                    b(o0Var, 0);
                    o0Var.g0(false);
                }
            }
            o0Var.g0(true);
            h4.r rVarF2 = x2.f(aVar7, 1.0f);
            bVar2.getClass();
            h4.r rVarC4 = uVar.c(c2.l.y(rVarF2, eVar2.f97920e), h4.d.a.f81531i);
            z zVarA2 = y.a(kVar, aVar9, o0Var, i17);
            int iHashCode3 = Long.hashCode(o0Var.U);
            i2 i2VarA2 = o0Var.a0();
            h4.r rVarC5 = h4.k.c(rVarC4, o0Var);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar8);
            } else {
                o0Var.c();
            }
            b4.c(eVar, zVarA2, o0Var);
            b4.c(c1623g, i2VarA2, o0Var);
            if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0Var, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC5, o0Var);
            if (z15) {
                o0Var.C(1893810834);
                aVar4 = aVar;
                e(aVar4, o0Var, (i18 >> 12) & 14);
                o0Var.g0(false);
                aVar5 = aVar2;
                aVar6 = aVar3;
            } else {
                aVar4 = aVar;
                if (z14) {
                    aVar5 = aVar2;
                    aVar6 = aVar3;
                    o0Var.C(-1421131628);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1893814348);
                    aVar5 = aVar2;
                    aVar6 = aVar3;
                    a(aVar5, aVar6, o0Var, (i18 >> 15) & 126);
                    o0Var.g0(false);
                }
            }
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            str2 = str;
            aVar4 = aVar;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.a(i14, z14, z15, str2, aVar4, aVar5, aVar6, i15);
        }
    }

    public static final void e(e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar2;
        o0 o0VarE = mVar.E(-2093148694);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            aVar2 = aVar;
            f0.f110999a.d(((i15 << 12) & 57344) | 384, 9, aVar2, x2.f(h4.r.S, 1.0f), gl1.y.Q(o0VarE, R.string.lbl_got_it), o0VarE, null, false);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar2, i14, 7);
        }
    }

    public static final void f(String str, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(670091176);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar = h4.d.a.f81537o;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar.getClass();
            z zVarA = y.a(c2.j.i(f14), aVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_plan_created);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            d6.h hVarA = d6.h.a(i16);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strQ, null, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97929f, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 130046);
            y2.f111386a.c(100.0f, null, false, o0VarE, 6, 6);
            d6.h hVarA2 = d6.h.a(i16);
            fVar.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, hVarA2, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97930g, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, i15 & 14, 0, 130046);
            String strQ2 = gl1.y.Q(o0VarE, R.string.first_training_workout_description);
            d6.h hVarA3 = d6.h.a(i16);
            fVar.getClass();
            mh.c(strQ2, null, 0L, null, 0L, null, 0L, hVarA3, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, d92.b.a(o0VarE).k().f63527d, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 130046);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bg2.b(str, i14, 2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0055 -> B:20:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object g(ca0.q1 r6, v13.c r7) {
        /*
            boolean r0 = r7 instanceof ku1.h
            if (r0 == 0) goto L13
            r0 = r7
            ku1.h r0 = (ku1.h) r0
            int r1 = r0.f106575d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f106575d = r1
            goto L18
        L13:
            ku1.h r0 = new ku1.h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f106574c
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f106575d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            int r6 = r0.f106573b
            e23.l r2 = r0.f106572a
            o13.r.b(r7)
            r7 = r2
            goto L58
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r6)
            r6 = 0
            return r6
        L33:
            o13.r.b(r7)
            r7 = r6
            r6 = r3
        L38:
            r2 = 101(0x65, float:1.42E-43)
            if (r6 >= r2) goto L5a
            float r2 = (float) r6
            r4 = 100
            float r4 = (float) r4
            float r2 = r2 / r4
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r2)
            r7.invoke(r4)
            r0.f106572a = r7
            r0.f106573b = r6
            r0.f106575d = r3
            r4 = 50
            java.lang.Object r2 = o53.m0.b(r4, r0)
            if (r2 != r1) goto L58
            return r1
        L58:
            int r6 = r6 + r3
            goto L38
        L5a:
            kotlin.Unit r6 = p005kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ku1.g.g(ca0.q1, v13.c):java.lang.Object");
    }
}
