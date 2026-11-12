package jy0;

import b82.t0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.x0;
import i3.mh;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesNameScreenKt$MultiDayActivitiesNameScreen$1$3$1", f = "MultiDayActivitiesNameScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f101851a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m4.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f101851a = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f101851a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            m4.b0.a(this.f101851a);
            return Unit.INSTANCE;
        }
    }

    public static final void a(String str, e23.l<? super String, Unit> lVar, p3.m mVar, int i14) {
        e23.l<? super String, Unit> lVar2;
        e23.l<? super String, Unit> lVar3;
        lVar.getClass();
        o0 o0VarE = mVar.E(1968434029);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97921f, 1);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r rVarF2 = x2.f(aVar, 1.0f);
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.Wa);
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97930g, o0VarE);
            d6.h.f57752b.getClass();
            boolean z14 = false;
            mh.c(strW, rVarF2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 48, 0, 130044);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            t0 t0Var = t0.f16792a;
            h4.r rVarA2 = m4.e.a(aVar, b0Var);
            String strW2 = gl1.d.W(x0.f23443ha);
            String str2 = str == null ? "" : str;
            x5.v.f188954b.getClass();
            int i16 = x5.v.f188955c;
            if ((i15 & 112) == 32) {
                z14 = true;
            }
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                lVar3 = lVar;
                objQ2 = new fb0.d(lVar3, 27);
                o0VarE.K(objQ2);
            } else {
                lVar3 = lVar;
            }
            e23.l lVar4 = (e23.l) objQ2;
            lVar2 = lVar3;
            t0Var.i(rVarA2, strW2, str2, 62, false, lVar4, null, i16, 0, null, o0VarE, 12610560, 832);
            Unit unit = Unit.INSTANCE;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new a(b0Var, null);
                o0VarE.K(objQ3);
            }
            l0.e((e23.p) objQ3, unit, o0VarE);
            o0VarE.g0(true);
        } else {
            lVar2 = lVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.b(str, lVar2, i14, 3);
        }
    }
}
