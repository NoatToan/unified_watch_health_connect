package g02;

import c2.x2;
import i3.ua;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.ProgressAlertDialogKt$FixedDurationProgressLoadingGauge$1$1", f = "ProgressAlertDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p3.m1 f74441a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p3.m1 m1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f74441a = m1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f74441a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f74441a.i(1.0f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.ProgressAlertDialogKt$FixedDurationProgressLoadingGauge$2$1", f = "ProgressAlertDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f74442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<Float> f74443b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a<Unit> aVar, x3<Float> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f74442a = aVar;
            this.f74443b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f74442a, this.f74443b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f74443b.getF182175a().floatValue() >= 1.0f) {
                this.f74442a.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.ProgressAlertDialogKt$ProgressCompleteGauge$1$1", f = "ProgressAlertDialog.kt", l = {118}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f74444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f74445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f74446c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i14, e23.a<Unit> aVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f74445b = i14;
            this.f74446c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f74445b, this.f74446c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f74444a;
            if (i14 == 0) {
                o13.r.b(obj);
                long j8 = this.f74445b;
                this.f74444a = 1;
                if (o53.m0.b(j8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            this.f74446c.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final void a(e23.a aVar, int i14, p3.m mVar, int i15) {
        p3.o0 o0VarE = mVar.E(45013047);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = n23.j.o(0.0f, o0VarE);
            }
            p3.m1 m1Var = (p3.m1) objQ;
            x3 x3VarB = s1.f.b(m1Var.getFloatValue(), s1.l.d(i14, 0, s1.e0.f155561b, 2), null, o0VarE, 0, 28);
            e(((Number) x3VarB.getF182175a()).floatValue(), o0VarE, 0);
            Unit unit = Unit.INSTANCE;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new a(m1Var, null);
                o0VarE.K(objQ2);
            }
            p3.l0.e((e23.p) objQ2, unit, o0VarE);
            Float fValueOf = Float.valueOf(((Number) x3VarB.getF182175a()).floatValue());
            boolean zB = o0VarE.B(x3VarB) | ((i16 & 112) == 32);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new b(aVar, x3VarB, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, fValueOf, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(i14, i15, 4, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i14, int i15, p3.m mVar, boolean z14) {
        p3.o0 o0VarE = mVar.E(-700817036);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.h(z14) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            s1.n0.a aVarA = s1.p0.a(s1.p0.c(null, o0VarE, 1), 0.0f, 1.0f, s1.l.a(s1.l.d(i14, 0, s1.e0.f155561b, 2), s1.y0.Restart, 4), null, o0VarE, 4536, 8);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            h4.r.a aVar = h4.r.S;
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            e(((Number) aVarA.f155651d.getF182175a()).floatValue(), o0VarE, 0);
            if (z14) {
                o0VarE.C(-348240376);
                s0.b(null, 0.0f, o0VarE, 0, 3);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-348198092);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i0(i14, z14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    public static final void c(String str, String str2, l0 l0Var, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        e23.a aVar2 = aVar;
        p3.o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, 522997840);
        if ((i14 & 6) == 0) {
            i15 = (o0VarK.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarK.B(str2) ? 32 : 16;
        }
        int i16 = i15 | (o0VarK.B(l0Var) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i16 |= o0VarK.r(aVar2) ? 2048 : 1024;
        }
        int i17 = i16;
        boolean z14 = false;
        if (o0VarK.n(i17 & 1, (i17 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            g82.c cVar = g82.c.f76436a;
            z3.e eVarC = z3.f.c(591653750, new d50.i(l0Var, aVar2, str, str2, 27), o0VarK);
            if ((i17 & 7168) == 2048) {
                aVar2 = aVar2;
                z14 = true;
            }
            aVar2 = aVar2;
            Object objQ = o0VarK.q();
            if (z14) {
                objQ = new eu.a(aVar2, 29);
                o0VarK.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new eu.a(aVar2, 29);
                    o0VarK.K(objQ);
                }
            }
            o0Var = o0VarK;
            cVar.b(null, null, eVarC, null, null, null, null, false, (e23.a) objQ, o0Var, 384, 251);
        } else {
            o0Var = o0VarK;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(str, str2, l0Var, aVar2, i14, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    public static final void d(e23.a aVar, int i14, p3.m mVar, int i15) {
        p3.o0 o0VarE = mVar.E(194155830);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Unit unit = Unit.INSTANCE;
            boolean z14 = ((i16 & 112) == 32) | ((i16 & 14) == 4);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new c(i14, aVar, null);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c(i14, aVar, null);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.e((e23.p) objQ, unit, o0VarE);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            h4.r.a aVar3 = h4.r.S;
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.c cVar = j92.b.f97901d;
            h4.r rVarQ = x2.q(aVar3, cVar.f97908g);
            long jF = d92.b.a(o0VarE).j().f();
            o4.d0.f128823b.getClass();
            long j8 = o4.d0.f128831j;
            o4.u1.f129010b.getClass();
            int i17 = o4.u1.f129012d;
            float f14 = 0;
            g6.f.a aVar5 = g6.f.f75994b;
            bVar2.getClass();
            float f15 = j92.b.f97899b.f97917b;
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new g01.q(27);
                o0VarE.K(objQ2);
            }
            ua.b((e23.a) objQ2, rVarQ, jF, f15, j8, i17, f14, o0VarE, 1597446, 0);
            s62.a.f157643a.getClass();
            u4.d dVarA = v62.e1.a(t62.b.f162798a);
            bVar2.getClass();
            u1.y0.b(dVarA, null, x2.q(aVar3, cVar.f97907f), o4.e0.a.a(o4.e0.f128843b, d92.b.a(o0VarE).j().f()), o0VarE, 48, 56);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(i14, i15, 3, aVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    public static final void e(float f14, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1543645410);
        int i15 = (o0VarE.i(f14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            h4.r.a aVar = h4.r.S;
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            h4.r rVarQ = x2.q(aVar, j92.b.f97901d.f97908g);
            long jE = d92.b.a(o0VarE).j().e();
            o4.d0.f128823b.getClass();
            long j8 = o4.d0.f128831j;
            o4.u1.f129010b.getClass();
            int i16 = o4.u1.f129012d;
            float f15 = 0;
            g6.f.a aVar3 = g6.f.f75994b;
            bVar2.getClass();
            float f16 = j92.b.f97899b.f97917b;
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new j0(f14, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j0(f14, 0);
                    o0VarE.K(objQ);
                }
            }
            ua.b((e23.a) objQ, rVarQ, jE, f16, j8, i16, f15, o0VarE, 1597440, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.o0(f14, i14, 2);
        }
    }
}
