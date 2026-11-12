package y40;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.g0;
import gl1.y;
import h5.e0;
import jy0.t;
import l72.f0;
import l72.v2;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.d2;
import s1.y0;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.custom.components.CustomCourseActionsKt$CustomCourseActions$3$1", f = "CustomCourseActions.kt", l = {82}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f194421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2<a50.e> f194422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f194423c;

        /* JADX INFO: renamed from: y40.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3623a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f194424a;

            public C3623a(p1<Boolean> p1Var) {
                this.f194424a = p1Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                a50.e eVar = (a50.e) obj;
                if (eVar instanceof a50.e.h0) {
                    this.f194424a.setValue(Boolean.valueOf(((a50.e.h0) eVar).f1345a));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d2<? extends a50.e> d2Var, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f194422b = d2Var;
            this.f194423c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f194422b, this.f194423c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f194421a;
            if (i14 == 0) {
                r.b(obj);
                C3623a c3623a = new C3623a(this.f194423c);
                this.f194421a = 1;
                if (this.f194422b.collect(c3623a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(a50.d dVar, d2<? extends a50.e> d2Var, e23.l<? super a50.c, Unit> lVar, e23.l<? super g6.m, Unit> lVar2, p3.m mVar, int i14) {
        boolean z14 = dVar.f1318a;
        d2Var.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-318534144);
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.r(d2Var) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar = h4.r.S;
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z15 || objQ2 == c2565a) {
                objQ2 = new wr1.d(lVar2, 10);
                o0VarE.K(objQ2);
            }
            h4.r rVarF = g0.f(aVar, (e23.l) objQ2);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97918c;
            h4.r rVarB = a2.b(c2.l.y(rVarF, f14), a2.a(o0VarE), false);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            f0.a aVar3 = f0.a.f111000a;
            String strQ = y.Q(o0VarE, R.string.lbl_save);
            boolean z16 = z14 && dVar.f1319b;
            int i16 = i15 & 896;
            boolean z17 = i16 == 256;
            Object objQ3 = o0VarE.q();
            if (z17 || objQ3 == c2565a) {
                objQ3 = new ub0.h(lVar, 20);
                o0VarE.K(objQ3);
            }
            aVar3.f(strQ, null, z16, (e23.a) objQ3, o0VarE, 0, 2);
            bVar.getClass();
            c2.l.f(x2.u(aVar, f15), o0VarE);
            String strQ2 = y.Q(o0VarE, R.string.lbl_course_options);
            boolean z18 = i16 == 256;
            Object objQ4 = o0VarE.q();
            if (z18 || objQ4 == c2565a) {
                objQ4 = new ub0.h(lVar, 21);
                o0VarE.K(objQ4);
            }
            aVar3.j(strQ2, null, false, (e23.a) objQ4, o0VarE, 0, 6);
            if (z14) {
                o0VarE.C(341350757);
                bVar.getClass();
                c2.l.f(x2.u(aVar, f15), o0VarE);
                h4.r rVarA = v2.a(aVar, ((Boolean) p1Var.getF182175a()).booleanValue(), new t(s1.p0.a(s1.p0.c(null, o0VarE, 1), 1.0f, 0.15f, s1.l.a(s1.l.d(1000, 0, null, 6), y0.Reverse, 4), null, o0VarE, 4536, 8), 2), o0VarE, 6);
                String strQ3 = y.Q(o0VarE, R.string.title_edit_waypoints);
                boolean z19 = i16 == 256;
                Object objQ5 = o0VarE.q();
                if (z19 || objQ5 == c2565a) {
                    objQ5 = new ub0.h(lVar, 22);
                    o0VarE.K(objQ5);
                }
                aVar3.j(strQ3, rVarA, false, (e23.a) objQ5, o0VarE, 0, 4);
                o0VarE.g0(false);
            } else {
                o0VarE.C(342112830);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(d2Var);
            Object objQ6 = o0VarE.q();
            if (zR || objQ6 == c2565a) {
                objQ6 = new a(d2Var, p1Var, null);
                o0VarE.K(objQ6);
            }
            l0.e((e23.p) objQ6, unit, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(dVar, d2Var, lVar, lVar2, i14);
        }
    }
}
