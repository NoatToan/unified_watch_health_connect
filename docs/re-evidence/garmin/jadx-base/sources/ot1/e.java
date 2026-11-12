package ot1;

import android.annotation.SuppressLint;
import androidx.room.a0;
import et1.w1;
import g02.q0;
import i3.fe;
import kotlin.t1;
import lc.m0;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lot1/e;", "Lot1/a;", "<init>", "()V", "Lpt1/c;", "mainScreenState", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends ot1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f133785a = new e();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.navigation.routes.MainTrailsRoute$Content$2$1", f = "MainTrailsRoute.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qt1.a f133786a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qt1.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f133786a = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f133786a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            qt1.a aVar2 = this.f133786a;
            vs1.t tVar = aVar2.f147506t;
            if (!tVar.f179901j) {
                b0 b0Var = tVar.f179893b;
                x53.c cVar = s0.f129406a;
                ge1.b.T(b0Var, x53.b.f189152a, null, new vs1.r(tVar, null), 2);
            }
            ns1.a.f127814a.getClass();
            zk.c.f205034a.a(p13.x.k("GCS", "FIREBASE")).a(new zk.a("TRAILS_HOMEPAGE_VIEW", j0.f134944a, false, 0L, 12, null));
            vs1.b bVar = aVar2.f147504q;
            ge1.b.T(bVar.f179748a, null, null, new vs1.a(bVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    private e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ot1.a
    @SuppressLint({"MissingPermission"})
    public final void a(lc.v vVar, m0 m0Var, fe feVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        int i16;
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, 1935507329);
        if ((i14 & 48) == 0) {
            i15 = (o0VarQ.r(m0Var) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.B(feVar) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            qt1.a aVarG0 = gl1.d.g0(o0VarQ);
            if (feVar == null) {
                vb.h.s("Snackbar host state must be passed to main trails route");
                return;
            }
            p1 p1VarC = s9.c.c(aVarG0.f147511z, o0VarQ);
            m4.q qVar = (m4.q) o0VarQ.A(t1.f91491i);
            nt1.b bVar = new nt1.b();
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new oe2.g(20);
                o0VarQ.K(objQ);
            }
            c.q qVarC = c.w.c(bVar, (e23.l) objQ, o0VarQ, 48);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarQ.r(aVarG0);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new a(aVarG0, null);
                o0VarQ.K(objQ2);
            }
            l0.e((e23.p) objQ2, unit, o0VarQ);
            pt1.c cVar = (pt1.c) p1VarC.getF182175a();
            boolean zR2 = o0VarQ.r(aVarG0);
            Object objQ3 = o0VarQ.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new b(aVarG0, 0);
                o0VarQ.K(objQ3);
            }
            e23.a aVar = (e23.a) objQ3;
            boolean zR3 = o0VarQ.r(aVarG0);
            Object objQ4 = o0VarQ.q();
            if (zR3 || objQ4 == c2565a) {
                objQ4 = new mt1.b(aVarG0, 4);
                o0VarQ.K(objQ4);
            }
            e23.l lVar = (e23.l) objQ4;
            boolean zR4 = o0VarQ.r(aVarG0) | o0VarQ.r(qVar);
            Object objQ5 = o0VarQ.q();
            if (zR4 || objQ5 == c2565a) {
                objQ5 = new oe.j(12, aVarG0, qVar);
                o0VarQ.K(objQ5);
            }
            e23.a aVar2 = (e23.a) objQ5;
            boolean zR5 = o0VarQ.r(aVarG0);
            Object objQ6 = o0VarQ.q();
            if (zR5 || objQ6 == c2565a) {
                objQ6 = new b(aVarG0, 1);
                o0VarQ.K(objQ6);
            }
            e23.a aVar3 = (e23.a) objQ6;
            boolean zR6 = o0VarQ.r(aVarG0);
            Object objQ7 = o0VarQ.q();
            if (zR6 || objQ7 == c2565a) {
                objQ7 = new mt1.b(aVarG0, 5);
                o0VarQ.K(objQ7);
            }
            e23.l lVar2 = (e23.l) objQ7;
            boolean zR7 = o0VarQ.r(aVarG0);
            Object objQ8 = o0VarQ.q();
            if (zR7 || objQ8 == c2565a) {
                objQ8 = new mt1.b(aVarG0, 6);
                o0VarQ.K(objQ8);
            }
            e23.l lVar3 = (e23.l) objQ8;
            boolean zR8 = o0VarQ.r(aVarG0);
            Object objQ9 = o0VarQ.q();
            if (zR8 || objQ9 == c2565a) {
                objQ9 = new c(aVarG0, 0);
                o0VarQ.K(objQ9);
            }
            e23.p pVar = (e23.p) objQ9;
            boolean zR9 = o0VarQ.r(aVarG0);
            Object objQ10 = o0VarQ.q();
            if (zR9 || objQ10 == c2565a) {
                objQ10 = new mt1.b(aVarG0, 7);
                o0VarQ.K(objQ10);
            }
            e23.l lVar4 = (e23.l) objQ10;
            boolean zR10 = o0VarQ.r(aVarG0);
            Object objQ11 = o0VarQ.q();
            if (zR10 || objQ11 == c2565a) {
                objQ11 = new b(aVarG0, 3);
                o0VarQ.K(objQ11);
            }
            e23.a aVar4 = (e23.a) objQ11;
            boolean zR11 = o0VarQ.r(aVarG0);
            Object objQ12 = o0VarQ.q();
            if (zR11 || objQ12 == c2565a) {
                objQ12 = new b(aVarG0, 2);
                o0VarQ.K(objQ12);
            }
            e23.a aVar5 = (e23.a) objQ12;
            boolean zR12 = o0VarQ.r(m0Var);
            Object objQ13 = o0VarQ.q();
            if (zR12 || objQ13 == c2565a) {
                objQ13 = new ky0.w(m0Var, 14);
                o0VarQ.K(objQ13);
            }
            e23.l lVar5 = (e23.l) objQ13;
            boolean zR13 = o0VarQ.r(m0Var);
            Object objQ14 = o0VarQ.q();
            if (zR13 || objQ14 == c2565a) {
                objQ14 = new nk0.l(m0Var, 2);
                o0VarQ.K(objQ14);
            }
            e23.a aVar6 = (e23.a) objQ14;
            boolean zR14 = o0VarQ.r(qVarC);
            Object objQ15 = o0VarQ.q();
            if (zR14 || objQ15 == c2565a) {
                objQ15 = new d(qVarC, 0);
                o0VarQ.K(objQ15);
            }
            e23.l lVar6 = (e23.l) objQ15;
            boolean zR15 = o0VarQ.r(aVarG0);
            Object objQ16 = o0VarQ.q();
            if (zR15 || objQ16 == c2565a) {
                objQ16 = new mt1.b(aVarG0, 8);
                o0VarQ.K(objQ16);
            }
            e23.l lVar7 = (e23.l) objQ16;
            boolean zR16 = o0VarQ.r(aVarG0);
            Object objQ17 = o0VarQ.q();
            if (zR16 || objQ17 == c2565a) {
                objQ17 = new mt1.b(aVarG0, 9);
                o0VarQ.K(objQ17);
            }
            e23.l lVar8 = (e23.l) objQ17;
            boolean zR17 = o0VarQ.r(m0Var);
            Object objQ18 = o0VarQ.q();
            if (zR17 || objQ18 == c2565a) {
                objQ18 = new nk0.l(m0Var, 3);
                o0VarQ.K(objQ18);
            }
            e23.a aVar7 = (e23.a) objQ18;
            boolean zR18 = o0VarQ.r(aVarG0);
            Object objQ19 = o0VarQ.q();
            if (zR18 || objQ19 == c2565a) {
                objQ19 = new a6.c(aVarG0, 15);
                o0VarQ.K(objQ19);
            }
            e23.r rVar = (e23.r) objQ19;
            boolean zR19 = o0VarQ.r(aVarG0);
            Object objQ20 = o0VarQ.q();
            if (zR19 || objQ20 == c2565a) {
                objQ20 = new mt1.b(aVarG0, 10);
                o0VarQ.K(objQ20);
            }
            e23.l lVar9 = (e23.l) objQ20;
            boolean zR20 = o0VarQ.r(aVarG0);
            Object objQ21 = o0VarQ.q();
            if (zR20 || objQ21 == c2565a) {
                objQ21 = new mt1.b(aVarG0, 1);
                o0VarQ.K(objQ21);
            }
            e23.l lVar10 = (e23.l) objQ21;
            boolean zR21 = o0VarQ.r(aVarG0);
            Object objQ22 = o0VarQ.q();
            if (zR21 || objQ22 == c2565a) {
                objQ22 = new mt1.b(aVarG0, 2);
                o0VarQ.K(objQ22);
            }
            e23.l lVar11 = (e23.l) objQ22;
            boolean zR22 = o0VarQ.r(aVarG0);
            Object objQ23 = o0VarQ.q();
            if (zR22 || objQ23 == c2565a) {
                i16 = 3;
                objQ23 = new mt1.b(aVarG0, i16);
                o0VarQ.K(objQ23);
            } else {
                i16 = 3;
            }
            o0Var = o0VarQ;
            w1.c(cVar, feVar, aVar, lVar, aVar2, aVar3, lVar2, lVar3, pVar, lVar4, aVar4, aVar5, lVar5, aVar6, lVar6, lVar7, lVar8, aVar7, rVar, lVar9, lVar10, lVar11, (e23.l) objQ23, o0Var, (i15 >> i16) & 112);
        } else {
            o0Var = o0VarQ;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(this, vVar, m0Var, feVar, i14, 28);
        }
    }
}
