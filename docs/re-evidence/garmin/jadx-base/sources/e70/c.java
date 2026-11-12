package e70;

import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import e11.f0;
import e2.i0;
import e2.k0;
import e23.l;
import e23.p;
import g6.f;
import h4.k;
import h5.e0;
import h5.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.j0;
import o13.r;
import o4.m1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.y;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import ww1.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.cyclingability.presentation.components.patterns.TrainingPlanPhasesChipGroupKt$TrainingPlanPhasesChipGroup$1$2$1", f = "TrainingPlanPhasesChipGroup.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b0 f63289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f63290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f63291c;

        /* JADX INFO: renamed from: e70.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.cyclingability.presentation.components.patterns.TrainingPlanPhasesChipGroupKt$TrainingPlanPhasesChipGroup$1$2$1$1", f = "TrainingPlanPhasesChipGroup.kt", l = {52}, m = "invokeSuspend", v = 2)
        public static final class C1335a extends i implements p<b0, d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f63292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i0 f63293b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f63294c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1335a(i0 i0Var, int i14, d<? super C1335a> dVar) {
                super(2, dVar);
                this.f63293b = i0Var;
                this.f63294c = i14;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C1335a(this.f63293b, this.f63294c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
                return ((C1335a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f63292a;
                if (i14 == 0) {
                    r.b(obj);
                    this.f63292a = 1;
                    if (i0.f(this.f63293b, this.f63294c, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, i0 i0Var, int i14, d<? super a> dVar) {
            super(2, dVar);
            this.f63289a = b0Var;
            this.f63290b = i0Var;
            this.f63291c = i14;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f63289a, this.f63290b, this.f63291c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ge1.b.T(this.f63289a, null, null, new C1335a(this.f63290b, this.f63291c, null), 3);
            return Unit.INSTANCE;
        }
    }

    public static final void a(List<? extends a0> list, l<? super a0, Unit> lVar, m mVar, int i14) {
        int i15;
        Object next;
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-923094805);
        int i16 = (o0VarE.r(list) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            o0VarE.C(1964127618);
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new j0(gl1.y.Q(o0VarE, ((a0) it.next()).f187719b), null, null, false, false, 30, null));
            }
            o0VarE.g0(false);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(arrayList);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarE, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, s2VarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            i53.c cVarE = i53.a.e((Iterable) p1Var.getF182175a());
            f.a aVar3 = f.f75994b;
            h4.r rVarA = c2.l.A(aVar, 0.0f, 8, 1);
            f82.b bVar2 = new f82.b();
            boolean zR = o0VarE.r(list);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new f0(p1Var, 2, lVar, list);
                o0VarE.K(objQ2);
            }
            e82.a.b(cVarE, bVar2, i0VarA, rVarA, null, (p) objQ2, o0VarE, 3072, 16);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            b0 b0Var = (b0) objQ3;
            Iterator it3 = arrayList.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!((j0) next).f111076e);
            int iIndexOf = arrayList.indexOf(next);
            if (iIndexOf != -1) {
                o0VarE.C(-1792203994);
                Integer numValueOf = Integer.valueOf(iIndexOf);
                boolean zR2 = o0VarE.r(b0Var) | o0VarE.B(i0VarA) | o0VarE.k(iIndexOf);
                Object objQ4 = o0VarE.q();
                if (zR2 || objQ4 == m.a.f135155b) {
                    objQ4 = new a(b0Var, i0VarA, iIndexOf, null);
                    o0VarE.K(objQ4);
                }
                l0.e((p) objQ4, numValueOf, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1791945485);
                o0VarE.g0(false);
            }
            i15 = 1;
            o0VarE.g0(true);
            x1 x1Var3 = n.f135158a;
        } else {
            i15 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.e0(lVar, i14, i15, list);
        }
    }
}
