package o72;

import f72.kb;
import i3.e9;
import i3.mc;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class u1 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.FeatureUpdateExampleKt$FeatureUpdateExamples$1$1$1", f = "FeatureUpdateExample.kt", l = {86}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f130610b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f130610b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f130610b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130609a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130609a = 1;
                if (this.f130610b.d(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.FeatureUpdateExampleKt$FeatureUpdateExamples$2$1$1$1", f = "FeatureUpdateExample.kt", l = {96}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f130612b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f130612b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f130612b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130611a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130611a = 1;
                if (this.f130612b.d(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.FeatureUpdateExampleKt$FeatureUpdateExamples$2$2$1$1", f = "FeatureUpdateExample.kt", l = {111}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f130614b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f130614b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f130614b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130613a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130613a = 1;
                if (this.f130614b.d(this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(346644377);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            b82.s sVar = b82.s.f16758a;
            l0.f130464a.getClass();
            z3.e eVar = l0.f130466c;
            z3.e eVar2 = l0.f130467d;
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new nw0.x(aVar, 12);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new nw0.x(aVar, 12);
                    o0VarE.K(objQ);
                }
            }
            sVar.d(eVar, eVar2, null, (e23.a) objQ, o0VarE, 54, 4);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ll1.g(aVar, i14, 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(p3.m mVar, int i14) {
        p3.p1 p1Var;
        Throwable th3;
        int i15;
        p3.o0 o0VarE = mVar.E(1562862054);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new i0(17);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            o53.b0 b0Var = (o53.b0) objQ2;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object[] objArr2 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new i0(19);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var3 = (p3.p1) d4.a.e(objArr2, (e23.a) objQ3, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new i0(20);
                o0VarE.K(objQ4);
            }
            p3.p1 p1Var4 = (p3.p1) d4.a.e(objArr3, (e23.a) objQ4, o0VarE, 48);
            Object[] objArr4 = new Object[0];
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new i0(21);
                o0VarE.K(objQ5);
            }
            p3.p1 p1Var5 = (p3.p1) d4.a.e(objArr4, (e23.a) objQ5, o0VarE, 48);
            Object[] objArr5 = new Object[0];
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new i0(22);
                o0VarE.K(objQ6);
            }
            p3.p1 p1Var6 = (p3.p1) d4.a.e(objArr5, (e23.a) objQ6, o0VarE, 48);
            Object[] objArr6 = new Object[0];
            Object objQ7 = o0VarE.q();
            int i16 = 18;
            if (objQ7 == c2565a) {
                objQ7 = new i0(18);
                o0VarE.K(objQ7);
            }
            p3.p1 p1Var7 = (p3.p1) d4.a.e(objArr6, (e23.a) objQ7, o0VarE, 48);
            s62.a.f157643a.getClass();
            t62.c cVar = t62.c.f162799a;
            u4.d dVarA = kb.a(cVar);
            gl.c.f77766a.getClass();
            p005kotlin.jvm.internal.j jVar = null;
            b92.a aVar = null;
            int i17 = 24;
            o4.d0 d0Var = null;
            i53.c cVarE = i53.a.e(p13.x.k(new b82.s.b("Optimal Sleep Schedule", "Learn what sleep timing works best for you based on historical data, physiological insight and advanced skin temperature technology. ", dVarA, o4.d0.a(gl.c.a(o0VarE).d()), aVar, 16, jVar), new b82.s.b("Enhanced Performance", "Faster load times and smoother animations", f72.s.a(cVar), d0Var, aVar, i17, jVar), new b82.s.b("Bug Fixes", "Resolved various issues for a better experience", u62.a.a(t62.a.f162797a), d0Var, aVar, i17, jVar)));
            i53.c cVarE2 = i53.a.e(p13.h0.C0(p13.h0.C0(p13.h0.C0(cVarE, cVarE), cVarE), cVarE));
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(1779496359);
                l72.w wVar = l72.w.f111301a;
                l0.f130464a.getClass();
                z3.e eVar = l0.f130465b;
                boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1Var2);
                Object objQ8 = o0VarE.q();
                if (zR || objQ8 == c2565a) {
                    objQ8 = new fo.j(b0Var, mcVarF, p1Var2, 11);
                    o0VarE.K(objQ8);
                }
                p1Var = p1Var2;
                th3 = null;
                wVar.c(eVar, null, (e23.a) objQ8, mcVarF, null, null, z3.f.c(-1280650643, new a11.l(b0Var, mcVarF, p1Var2, cVarE, cVarE2, p1Var7, p1Var4, p1Var5, p1Var3, p1Var6, 6), o0VarE), o0VarE, 1572870, 50);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                p1Var = p1Var2;
                th3 = null;
                o0VarE.C(1781023388);
                o0VarE.g0(false);
            }
            h4.r.a aVar2 = h4.r.S;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarY = c2.l.y(u1.a2.b(c2.x2.d(aVar2, 1.0f), u1.a2.a(o0VarE), true), 16);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw th3;
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
            boolean zB = o0VarE.B(p1Var3);
            Object objQ9 = o0VarE.q();
            if (zB || objQ9 == c2565a) {
                objQ9 = new md0.f(p1Var3, i16);
                o0VarE.K(objQ9);
            }
            y72.a.a("Short Feature List", zBooleanValue, false, null, (e23.l) objQ9, o0VarE, 6, 12);
            boolean zBooleanValue2 = ((Boolean) p1Var6.getF182175a()).booleanValue();
            boolean zB2 = o0VarE.B(p1Var6);
            Object objQ10 = o0VarE.q();
            if (zB2 || objQ10 == c2565a) {
                objQ10 = new md0.f(p1Var6, 19);
                o0VarE.K(objQ10);
            }
            y72.a.a("Custom Button Label ", zBooleanValue2, false, null, (e23.l) objQ10, o0VarE, 6, 12);
            boolean zBooleanValue3 = ((Boolean) p1Var4.getF182175a()).booleanValue();
            boolean zB3 = o0VarE.B(p1Var4);
            Object objQ11 = o0VarE.q();
            if (zB3 || objQ11 == c2565a) {
                i15 = 20;
                objQ11 = new md0.f(p1Var4, i15);
                o0VarE.K(objQ11);
            } else {
                i15 = 20;
            }
            y72.a.a("Show Heading", zBooleanValue3, false, null, (e23.l) objQ11, o0VarE, 6, 12);
            boolean zBooleanValue4 = ((Boolean) p1Var5.getF182175a()).booleanValue();
            boolean zB4 = o0VarE.B(p1Var5);
            Object objQ12 = o0VarE.q();
            if (zB4 || objQ12 == c2565a) {
                objQ12 = new md0.f(p1Var5, 21);
                o0VarE.K(objQ12);
            }
            y72.a.a("Show Subheading", zBooleanValue4, false, null, (e23.l) objQ12, o0VarE, 6, 12);
            boolean zBooleanValue5 = ((Boolean) p1Var7.getF182175a()).booleanValue();
            boolean zB5 = o0VarE.B(p1Var7);
            Object objQ13 = o0VarE.q();
            if (zB5 || objQ13 == c2565a) {
                objQ13 = new md0.f(p1Var7, 22);
                o0VarE.K(objQ13);
            }
            y72.a.a("Custom Content", zBooleanValue5, false, null, (e23.l) objQ13, o0VarE, 6, 12);
            c2.l.f(c2.x2.h(aVar2, i15), o0VarE);
            l72.f0 f0Var = l72.f0.f110999a;
            boolean zB6 = o0VarE.B(p1Var);
            Object objQ14 = o0VarE.q();
            if (zB6 || objQ14 == c2565a) {
                objQ14 = new q1(p1Var, 25);
                o0VarE.K(objQ14);
            }
            p3.o0 o0Var = o0VarE;
            f0Var.d(48, 13, (e23.a) objQ14, null, "Click to show Features", o0Var, null, false);
            o0VarE = o0Var;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b1(i14, 26);
        }
    }
}
