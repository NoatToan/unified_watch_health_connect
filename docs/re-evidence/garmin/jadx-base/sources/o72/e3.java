package o72;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class e3 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.ReportsPageScrollExampleKt$ReportsPageScrollExample$1$1$1$1", f = "ReportsPageScrollExample.kt", l = {44}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u1.d2 f130372b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u1.d2 d2Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f130372b = d2Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f130372b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130371a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130371a = 1;
                u1.d2.a aVar = u1.d2.f167431j;
                s1.j1 j1Var = new s1.j1(0.0f, 0.0f, null, 7, null);
                u1.d2 d2Var = this.f130372b;
                Object objA = p008y1.m2.a(d2Var, 5000 - d2Var.f167433a.getIntValue(), j1Var, this);
                if (objA != obj2) {
                    objA = Unit.INSTANCE;
                }
                if (objA == obj2) {
                    return obj2;
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

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", Action.KEY_ATTRIBUTE}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.ReportsPageScrollExampleKt$ReportsPageScrollExample$reportsPageState$1$1", f = "ReportsPageScrollExample.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<String, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f130373a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f130373a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(String str, t13.d<? super String> dVar) {
            return ((b) create(str, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.f130373a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return "Sample data for " + str;
        }
    }

    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-249155041);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            u1.d2 d2VarA = u1.a2.a(o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            o53.b0 b0Var2 = (o53.b0) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new b(null);
                o0VarE.K(objQ3);
            }
            u82.a aVar = new u82.a(b0Var2, new y82.e(new y82.c((e23.p) objQ3), null, 2, null), false, 4, null);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = c2.x2.f(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            c2.b0 b0Var3 = c2.b0.f22601a;
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r rVarF2 = c2.x2.f(u1.n.e(aVar2, tn.k.b(d92.b.f58623a, o0VarE), o4.m1.f128891a), 1.0f);
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarF2, j92.b.f97899b.f97920e);
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(d2VarA);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new mt0.s1(27, b0Var, d2VarA);
                o0VarE.K(objQ4);
            }
            f0Var.d(48, 9, (e23.a) objQ4, rVarY, "Scroll to Top", o0VarE, null, false);
            h4.r rVarF3 = c2.x2.f(aVar2, 1.0f);
            d1.f130352a.getClass();
            u82.e.a("exampleKey", aVar, rVarF3, d2VarA, d1.f130353b, o0VarE, 24966, 0);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z1(i14, 24);
        }
    }
}
