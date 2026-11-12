package r22;

import kotlin.w2;
import kotlin.x2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.view.BadgeLeaderboardViewKt$BadgesLeaderboardView$1$1", f = "BadgeLeaderboardView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ zc.d<com.garmin.android.apps.connectmobile.badges.service.model.q> f149674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f149675b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zc.d<com.garmin.android.apps.connectmobile.badges.service.model.q> dVar, p3.p1<Boolean> p1Var, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f149674a = dVar;
            this.f149675b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f149674a, this.f149675b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p3.p1<Boolean> p1Var = this.f149675b;
            if (p1Var.getF182175a().booleanValue()) {
                zc.d<com.garmin.android.apps.connectmobile.badges.service.model.q> dVar = this.f149674a;
                if (dVar.d().f196390f || dVar.d().f196391g) {
                    p1Var.setValue(Boolean.FALSE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x007a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(uu.q qVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-169373722);
        int i15 = (o0VarE.r(qVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            zc.d dVarA = zc.g.a(qVar.f172751p, o0VarE);
            p3.p1 p1VarC = s9.c.c(qVar.f172750o, o0VarE);
            boolean zK = o0VarE.k(((com.garmin.android.apps.connectmobile.badges.service.model.r) p1VarC.getF182175a()).ordinal());
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zK) {
                objQ = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = p3.p0.n(Boolean.TRUE);
                    o0VarE.K(objQ);
                }
            }
            p3.p1 p1Var = (p3.p1) objQ;
            yc.s sVarD = dVarA.d();
            boolean zB = o0VarE.B(p1Var) | o0VarE.r(dVarA);
            Object objQ2 = o0VarE.q();
            Object obj = null;
            if (zB) {
                objQ2 = new a(dVarA, p1Var, null);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a(dVarA, p1Var, null);
                    o0VarE.K(objQ2);
                }
            }
            p3.l0.e((e23.p) objQ2, sVarD, o0VarE);
            boolean z14 = true;
            w2 w2VarE = x2.e(o0VarE);
            for (Object obj2 : dVarA.c().f196336d) {
                if (!((com.garmin.android.apps.connectmobile.badges.service.model.q) obj2).f30663i) {
                    obj = obj2;
                    break;
                }
            }
            com.garmin.android.apps.connectmobile.badges.service.model.q qVar2 = (com.garmin.android.apps.connectmobile.badges.service.model.q) obj;
            if (qVar2 != null && !qVar2.getHasPrivate() && qVar2.getUserPoint() != 0) {
                z14 = false;
            }
            z02.b.a(false, null, null, null, false, z3.f.c(-534115940, new ck0.h(p1Var, qVar, dVarA, w2VarE, z14, p1VarC), o0VarE), o0VarE, 196608, 31);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r12.a(qVar, i14, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(com.garmin.android.apps.connectmobile.badges.service.model.r rVar, e23.l<? super com.garmin.android.apps.connectmobile.badges.service.model.r, Unit> lVar, p3.m mVar, int i14) {
        com.garmin.android.apps.connectmobile.badges.service.model.r rVar2 = rVar;
        rVar2.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-1076433497);
        int i15 = i14 | (o0VarE.k(rVar2.ordinal()) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarF, j92.b.f97899b.f97917b, 0.0f, 0.0f, 0.0f, 14);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new qk0.m(p1Var, 16);
                o0VarE.K(objQ2);
            }
            i3.h1.c((e23.a) objQ2, null, false, null, null, null, null, null, z3.f.c(-433550332, new o62.s0(rVar2, 14), o0VarE), o0VarE, 805306374, 510);
            h4.r rVarE = u1.n.e(aVar, ds.e0.w(o0VarE), o4.m1.f128891a);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new qk0.m(p1Var, 17);
                o0VarE.K(objQ3);
            }
            rVar2 = rVar;
            i3.u.a(zBooleanValue, (e23.a) objQ3, rVarE, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(1657663132, new ng2.i(lVar, 13, p1Var, rVar), o0VarE), o0VarE, 48, 48, 2040);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q72.f(rVar2, lVar, i14, 18);
        }
    }
}
