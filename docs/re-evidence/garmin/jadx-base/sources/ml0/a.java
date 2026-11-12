package ml0;

import a3.m0;
import c2.x2;
import c22.b0;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import i3.i7;
import i3.ve;
import mt0.f2;
import mt0.g2;
import n70.t1;
import org.joda.time.DateTimeComparator;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p13.x;
import p3.p0;
import p3.p1;
import p3.x1;
import v62.e1;
import zd0.g1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119196a;

    public /* synthetic */ a(int i14) {
        this.f119196a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x03fb  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f119196a;
        int i15 = 4;
        p3.m.a aVar = p3.m.f135153a;
        int i16 = 6;
        fs1.a aVar2 = null;
        Object[] objArr = 0;
        int i17 = 2;
        int i18 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b bVar = b.f119197a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.search, mVar, 0), null, null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar), mVar, 48, 4);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                b bVar2 = b.f119197a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    l lVar = new l(false, null, x.k(new il0.a(1, "Golf Course 1", il0.c.NOT_DOWNLOADED, "1.2", 0, null, null, "City 1", "State 1", null, null, null, null, null, null, null, null, null, null, null, null, null, 4193904, null), new il0.a(1, "Golf Course 2", il0.c.DOWNLOADED, "2.3", 0, null, null, "City 2", "State 2", null, null, null, null, null, null, null, null, null, null, null, null, null, 4193904, null), new il0.a(1, "Golf Course 3", il0.c.DOWNLOAD_FAILED, "3.4", 0, null, null, "City 3", "State 3", null, null, null, null, null, null, null, null, null, null, null, null, null, 4193904, null), new il0.a(1, "Golf Course 4", il0.c.DOWNLOADING, "4.5", 0, null, null, "City 4", "State 4", null, null, null, null, null, null, null, null, null, null, null, null, null, 4193904, null)), false, false, 0, k.LOCATION, 59, null);
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new mi0.i(i15);
                        mVar2.K(objQ);
                    }
                    e23.l lVar2 = (e23.l) objQ;
                    Object objQ2 = mVar2.q();
                    int i19 = 5;
                    if (objQ2 == c2565a) {
                        objQ2 = new mh1.q(5);
                        mVar2.K(objQ2);
                    }
                    e23.a aVar3 = (e23.a) objQ2;
                    Object objQ3 = mVar2.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new mi0.i(i19);
                        mVar2.K(objQ3);
                    }
                    e23.l lVar3 = (e23.l) objQ3;
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new mi0.i(i16);
                        mVar2.K(objQ4);
                    }
                    h.h(lVar, lVar2, aVar3, lVar3, (e23.l) objQ4, mVar2, 28080);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                b bVar3 = b.f119197a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    ve.a(null, null, tn.k.a(d92.b.f58623a, mVar3), 0L, 0.0f, 0.0f, null, b.f119200d, mVar3, 12582912, 123);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                b bVar4 = b.f119197a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    l lVar4 = new l(false, null, j0.f134944a, false, false, 0, k.NAME, 58, null);
                    Object objQ5 = mVar4.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ5 == c2565a2) {
                        objQ5 = new mi0.i(i18);
                        mVar4.K(objQ5);
                    }
                    e23.l lVar5 = (e23.l) objQ5;
                    Object objQ6 = mVar4.q();
                    if (objQ6 == c2565a2) {
                        objQ6 = new mh1.q(4);
                        mVar4.K(objQ6);
                    }
                    e23.a aVar4 = (e23.a) objQ6;
                    Object objQ7 = mVar4.q();
                    if (objQ7 == c2565a2) {
                        objQ7 = new mi0.i(i17);
                        mVar4.K(objQ7);
                    }
                    e23.l lVar6 = (e23.l) objQ7;
                    Object objQ8 = mVar4.q();
                    if (objQ8 == c2565a2) {
                        objQ8 = new mi0.i(3);
                        mVar4.K(objQ8);
                    }
                    h.h(lVar4, lVar5, aVar4, lVar6, (e23.l) objQ8, mVar4, 28080);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                b bVar5 = b.f119197a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    ve.a(null, null, tn.k.a(d92.b.f58623a, mVar5), 0L, 0.0f, 0.0f, null, b.f119201e, mVar5, 12582912, 123);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                return Integer.valueOf(((DateTimeComparator) KoinJavaComponent.get$default(DateTimeComparator.class, null, null, 6, null)).compare(((ps.x1) obj).getStartDateTime(), ((ps.x1) obj2).getStartDateTime()));
            case 6:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                mr1.a aVar5 = mr1.a.f120350a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new ur1.a(new or1.a((r53.i) parametersHolder.elementAt(0, s0.f105811a.b(r53.i.class)), new ae0.b(), new t1(j70.n.STRESS), new or1.c()));
            case 7:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                mr1.a aVar6 = mr1.a.f120350a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new tr1.a((ur1.a) parametersHolder2.elementAt(0, s0.f105811a.b(ur1.a.class)));
            case 8:
                Scope scope = (Scope) obj;
                mr1.b bVar6 = mr1.b.f120352a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new ir1.b((f12.l) Scope.get$default(scope, s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 9:
                mr1.b bVar7 = mr1.b.f120352a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (jr1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, jr1.a.class, new c83.h.a[0], null, null, null, 120);
            case 10:
                Scope scope2 = (Scope) obj;
                mr1.b bVar8 = mr1.b.f120352a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new lr1.e((jr1.a) scope2.get((k23.d<?>) s0.f105811a.b(jr1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 11:
                Scope scope3 = (Scope) obj;
                mr1.b bVar9 = mr1.b.f120352a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                is1.e eVar = new is1.e(aVar2, i18, objArr == true ? 1 : 0);
                t0 t0Var = s0.f105811a;
                return new qr1.d(eVar, (lr1.b) scope3.get((k23.d<?>) t0Var.b(lr1.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), wr1.a.f186796b, (zd0.h) scope3.get((k23.d<?>) t0Var.b(zd0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 12:
                com.garmin.android.apps.connectmobile.leaderboard.model.j jVar = (com.garmin.android.apps.connectmobile.leaderboard.model.j) obj;
                com.garmin.android.apps.connectmobile.leaderboard.model.j jVar2 = (com.garmin.android.apps.connectmobile.leaderboard.model.j) obj2;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                jVar.getClass();
                jVar2.getClass();
                int i24 = jVar.f38217h;
                int i25 = jVar2.f38217h;
                if (i24 <= i25) {
                    if (i24 == i25) {
                        String strValueOf = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
                        if (p005kotlin.jvm.internal.s.g(jVar.f38210a, strValueOf)) {
                            i18 = -1;
                        } else if (!p005kotlin.jvm.internal.s.g(jVar2.f38210a, strValueOf)) {
                            i18 = 0;
                        }
                    } else {
                        i18 = -1;
                    }
                }
                return Integer.valueOf(i18);
            case 13:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                f2 f2Var = f2.f120594a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    g1 g1Var = (g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null);
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    h4.r rVarC = c2.l.C(aVar7, f14, f14, f14, 0.0f, 8);
                    ub1.l lVarU = g1.u(g1Var, c80.s0.LEADERBOARD, null, 6);
                    if (lVarU == null) {
                        mVar6.C(-1786791553);
                    } else {
                        mVar6.C(-888922430);
                        lVarU.a(rVarC, mVar6, 0);
                    }
                    mVar6.f();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                f2 f2Var2 = f2.f120594a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, f2.f120595b, mVar7, 196608, 31);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                g2 g2Var = g2.f120627a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = e1.a(t62.b.f162798a);
                    long jG = fb1.c.g(d92.b.f58623a, mVar8);
                    h4.r.a aVar8 = h4.r.S;
                    d92.b.f58625c.getClass();
                    m0.a(0, jG, x2.q(aVar8, j92.b.f97901d.f97904c), mVar8, dVarA);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                mu0.a aVar9 = mu0.a.f121093a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h4.r.a aVar10 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarX = x2.x(aVar10, h4.d.a.f81533k, 2);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    b82.n.c(null, y.Q(mVar9, R.string.lbl_live_event_sharing_not_supported), y.Q(mVar9, R.string.msg_live_event_sharing_not_supported), c2.l.y(rVarX, j92.b.f97899b.f97920e), null, mVar9, 0, 17);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                mu0.a aVar11 = mu0.a.f121093a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, mu0.a.f121094b, mVar10, 196608, 31);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 18:
                Scope scope4 = (Scope) obj;
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                mw.a aVar12 = mw.a.f121241a;
                scope4.getClass();
                parametersHolder3.getClass();
                t0 t0Var2 = s0.f105811a;
                r53.i iVar = (r53.i) parametersHolder3.elementAt(0, t0Var2.b(r53.i.class));
                nw.a aVar13 = (nw.a) scope4.get((k23.d<?>) t0Var2.b(nw.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                bv.b.f21239a.getClass();
                bv.b.a();
                return new vw.a(new ow.a(iVar, aVar13, b0.b(null)));
            case 19:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                mw.a aVar14 = mw.a.f121241a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                return new uw.a((vw.a) parametersHolder4.elementAt(0, s0.f105811a.b(vw.a.class)));
            case 20:
                mw.b bVar10 = mw.b.f121243a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (lw.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, lw.a.class, new c83.h.a[0], null, null, null, 120);
            case 21:
                Scope scope5 = (Scope) obj;
                mw.b bVar11 = mw.b.f121243a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new lw.c((lw.a) scope5.get((k23.d<?>) s0.f105811a.b(lw.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 22:
                ((Integer) obj2).getClass();
                mw0.j.d((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                mw0.j.i((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                n02.a aVar15 = n02.a.f122158a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    h4.r.a aVar16 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.u(aVar16, j92.b.f97899b.f97920e), mVar11);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                n02.a aVar17 = n02.a.f122158a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar18 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.u(aVar18, j92.b.f97899b.f97920e), mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 26:
                p1 p1Var = (p1) obj2;
                ((d4.n) obj).getClass();
                p1Var.getClass();
                return x.k(Integer.valueOf(((n02.f) p1Var.getF182175a()).f122170a.ordinal()), Double.valueOf(((n02.f) p1Var.getF182175a()).f122171b), Boolean.valueOf(((n02.f) p1Var.getF182175a()).f122174e));
            case 27:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                n12.a aVar19 = n12.a.f122212a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    ub1.l lVarU2 = g1.u((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null), c80.s0.PROFILE_FRAME_LIST, null, 6);
                    if (lVarU2 == null) {
                        mVar13.C(-1078335919);
                    } else {
                        mVar13.C(1766330288);
                        lVarU2.a(h4.r.S, mVar13, 6);
                    }
                    mVar13.f();
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                n12.a aVar20 = n12.a.f122212a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, n12.a.f122213b, mVar14, 196608, 31);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                n21.a aVar21 = n21.a.f122359a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    Object objQ9 = mVar15.q();
                    aVar.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new mi0.i(21);
                        mVar15.K(objQ9);
                    }
                    n21.c.a(null, 35.0f, (e23.l) objQ9, null, mVar15, 432, 9);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
        }
    }
}
