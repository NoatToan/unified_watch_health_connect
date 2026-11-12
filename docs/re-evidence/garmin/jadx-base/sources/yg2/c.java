package yg2;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import i3.ve;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import r1.q2;
import s5.x0;
import u1.y0;
import v62.d3;
import v62.j1;
import zd0.g1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196956a;

    public /* synthetic */ c(int i14) {
        this.f196956a = i14;
    }

    private final Object a(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        yu1.b bVar = yu1.b.f199773a;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarF, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            yu1.g.a(new fy1.f("26:08", "26 minutes 8 seconds", null, "8:25", "8 minutes 25 seconds per mile", "/mi"), "Goal Distance", "Goal Pace", mVar, 432);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f196956a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                d dVar = d.f196958a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    long jE = q2.e(d92.b.f58623a, mVar);
                    nt2.e eVar = new nt2.e("Test Long Long Long Long Long Long Long Long Long Title", "Test Title");
                    i53.f fVarA = i53.a.a(new nt2.e("Test Long Long Long Long Long Long Long Long Long Subtitle", "Test Subtitle"));
                    e2.i0 i0Var = new e2.i0(0, 0);
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p3.l0.j(t13.h.f161748a, mVar);
                        mVar.K(objQ);
                    }
                    o53.b0 b0Var = (o53.b0) objQ;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new ya1.h(11);
                        mVar.K(objQ2);
                    }
                    e23.l lVar = (e23.l) objQ2;
                    Object objQ3 = mVar.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new ya1.h(12);
                        mVar.K(objQ3);
                    }
                    e23.l lVar2 = (e23.l) objQ3;
                    Object objQ4 = mVar.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new ya1.h(13);
                        mVar.K(objQ4);
                    }
                    e23.l lVar3 = (e23.l) objQ4;
                    Object objQ5 = mVar.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new ya1.h(14);
                        mVar.K(objQ5);
                    }
                    e23.l lVar4 = (e23.l) objQ5;
                    Object objQ6 = mVar.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new ya1.h(15);
                        mVar.K(objQ6);
                    }
                    t.a(jE, "Test Long Long Long Long Long Long Long Long Long Overline", eVar, fVarA, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", null, true, false, false, 0, i0Var, b0Var, 0, lVar, true, lVar2, lVar3, lVar4, (e23.l) objQ6, true, mVar, 806879280, 920350080, 416);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                d dVar2 = d.f196958a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    long jE2 = q2.e(d92.b.f58623a, mVar2);
                    nt2.e eVar2 = new nt2.e("Test Long Long Long Long Long Long Long Long Long Title", "Test Title");
                    i53.f fVarA2 = i53.a.a(new nt2.e("Test Long Long Long Long Long Long Long Long Long Subtitle", "Test Subtitle"));
                    n nVar = n.COMPLETED;
                    e2.i0 i0Var2 = new e2.i0(0, 0);
                    Object objQ7 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ7 == c2565a2) {
                        objQ7 = p3.l0.j(t13.h.f161748a, mVar2);
                        mVar2.K(objQ7);
                    }
                    o53.b0 b0Var2 = (o53.b0) objQ7;
                    Object objQ8 = mVar2.q();
                    if (objQ8 == c2565a2) {
                        objQ8 = new ya1.h(16);
                        mVar2.K(objQ8);
                    }
                    e23.l lVar5 = (e23.l) objQ8;
                    Object objQ9 = mVar2.q();
                    if (objQ9 == c2565a2) {
                        objQ9 = new ya1.h(17);
                        mVar2.K(objQ9);
                    }
                    e23.l lVar6 = (e23.l) objQ9;
                    Object objQ10 = mVar2.q();
                    if (objQ10 == c2565a2) {
                        objQ10 = new ya1.h(18);
                        mVar2.K(objQ10);
                    }
                    e23.l lVar7 = (e23.l) objQ10;
                    Object objQ11 = mVar2.q();
                    if (objQ11 == c2565a2) {
                        objQ11 = new ya1.h(19);
                        mVar2.K(objQ11);
                    }
                    e23.l lVar8 = (e23.l) objQ11;
                    Object objQ12 = mVar2.q();
                    if (objQ12 == c2565a2) {
                        objQ12 = new ya1.h(20);
                        mVar2.K(objQ12);
                    }
                    t.a(jE2, "Test Long Long Long Long Long Long Long Long Long Overline", eVar2, fVarA2, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", nVar, false, false, false, 0, i0Var2, b0Var2, 0, lVar5, true, lVar6, lVar7, lVar8, (e23.l) objQ12, true, mVar2, 805503024, 920350080, 448);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e eVar3 = e.f196969a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    u4.d dVarA = j1.a(t62.b.f162798a);
                    String strQ = gl1.y.Q(mVar3, R.string.strength_training_select_exercise);
                    o4.e0.a aVar2 = o4.e0.f128843b;
                    d92.b.f58623a.getClass();
                    y0.b(dVarA, strQ, null, o4.e0.a.a(aVar2, d92.b.a(mVar3).f().d()), mVar3, 0, 60);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e eVar4 = e.f196969a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    u4.d dVarA2 = j1.a(t62.b.f162798a);
                    String strQ2 = gl1.y.Q(mVar4, R.string.strength_training_select_exercise);
                    o4.e0.a aVar3 = o4.e0.f128843b;
                    d92.b.f58623a.getClass();
                    y0.b(dVarA2, strQ2, null, o4.e0.a.a(aVar3, d92.b.a(mVar4).f().d()), mVar4, 0, 60);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e eVar5 = e.f196969a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar5, R.string.pounds_with_unit);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar5), mVar5, 0, 0, 131070);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e eVar6 = e.f196969a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    String strQ4 = gl1.y.Q(mVar6, R.string.kilograms_with_unit);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar6), mVar6, 0, 0, 131070);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                f fVar = f.f196976a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    String strQ5 = gl1.y.Q(mVar7, R.string.start_now);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar7), mVar7, 0, 0, 131070);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                f fVar2 = f.f196976a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    String strQ6 = gl1.y.Q(mVar8, R.string.lbl_skip_button);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar8), mVar8, 0, 0, 131070);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                f fVar3 = f.f196976a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    String strQ7 = gl1.y.Q(mVar9, R.string.add_to_workout);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ7, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar9), mVar9, 0, 0, 131070);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                f fVar4 = f.f196976a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    String strQ8 = gl1.y.Q(mVar10, R.string.lbl_delete);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar10);
                    gl.c.f77766a.getClass();
                    mh.c(strQ8, null, gl.c.a(mVar10).l(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar10, 0, 0, 131066);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                yn0.a aVar4 = yn0.a.f198136a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                yp0.a aVar5 = yp0.a.f198626a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    ub1.l lVarU = g1.u((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null), c80.s0.HYDRATION, null, 6);
                    if (lVarU == null) {
                        mVar12.C(531287926);
                        mVar12.f();
                    } else {
                        mVar12.C(531287927);
                        h4.r.a aVar6 = h4.r.S;
                        h4.r rVarE = u1.n.e(x2.f(aVar6, 1.0f), tn.k.a(d92.b.f58623a, mVar12), m1.f128891a);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar12, 0);
                        int iHashCode = Long.hashCode(mVar12.getU());
                        i2 i2VarX = mVar12.x();
                        h4.r rVarC = h4.k.c(rVarE, mVar12);
                        h5.g.V.getClass();
                        h5.e0.a aVar7 = h5.g.a.f81805b;
                        if (mVar12.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar12.z();
                        if (mVar12.getT()) {
                            mVar12.M(aVar7);
                        } else {
                            mVar12.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar12);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar12);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar12, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar12);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        d92.b.f58625c.getClass();
                        lVarU.a(c2.l.y(aVar6, j92.b.f97899b.f97920e), mVar12, 0);
                        mVar12.y();
                        mVar12.f();
                    }
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                yp0.a aVar8 = yp0.a.f198626a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, yp0.a.f198627b, mVar13, 196608, 31);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                yr.f fVar5 = yr.f.f198858a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    t4.d dVarA3 = n5.c.a(2131231376, mVar14, 0);
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    y0.a(dVarA3, null, x2.q(aVar9, j92.b.f97899b.f97923h), null, null, 0.0f, null, mVar14, 48, 120);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                yr.g gVar = yr.g.f198861a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    y0.a(n5.c.a(2131231554, mVar15, 0), gl1.y.Q(mVar15, R.string.diving_app_title), x2.q(h4.r.S, wz1.b.f188181a), null, null, 0.0f, null, mVar15, 0, 120);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                yr.g gVar2 = yr.g.f198861a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA4 = d3.a(t62.b.f162798a);
                    h4.r.a aVar10 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(dVarA4, null, x2.q(aVar10, j92.b.f97901d.f97904c), lc.u0.f(mVar16), mVar16, 48, 0);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                yr.h hVar = yr.h.f198864a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA5 = j1.a(t62.b.f162798a);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar17);
                    h4.r.a aVar11 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA5, null, x2.q(aVar11, j92.b.f97901d.f97905d), jA, mVar17, 48, 0);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                yr.h hVar2 = yr.h.f198864a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    Object objQ13 = mVar18.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ13 == c2565a3) {
                        objQ13 = new ya0.j(16);
                        mVar18.K(objQ13);
                    }
                    nr.w wVar = new nr.w(1L, "_Buddy", null, "71 Activities", (e23.a) objQ13);
                    Object objQ14 = mVar18.q();
                    if (objQ14 == c2565a3) {
                        objQ14 = new ya0.j(17);
                        mVar18.K(objQ14);
                    }
                    nr.w wVar2 = new nr.w(2L, "_Luna", null, "15 Activities", (e23.a) objQ14);
                    Object objQ15 = mVar18.q();
                    if (objQ15 == c2565a3) {
                        objQ15 = new ya0.j(18);
                        mVar18.K(objQ15);
                    }
                    yr.s.c(new nr.g.h("Dogs", p13.x.k(wVar, wVar2, new nr.w(3L, "_Max", null, "3 Activities", (e23.a) objQ15))), mVar18, 0);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                yr.h hVar3 = yr.h.f198864a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    yr.s.c(new nr.g.h("Dogs", p13.x.k(new nr.w(1L, "_Buddy", null, null, null, 24, null), new nr.w(2L, "_Luna", null, null, null, 24, null))), mVar19, 0);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                yr.i iVar = yr.i.f198868a;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    h82.r rVar = h82.r.f82497a;
                    rVar.q(gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.y.Q(mVar20, R.string.workout_benefit_help_1), gl1.y.Q(mVar20, R.string.workout_benefit_help_2)}, mVar20), mVar20, 48);
                    rVar.t(R.string.activities_training_effect_recovery, mVar20, 48);
                    rVar.o(R.string.workout_benefit_recovery_desc, 384, 2, null, mVar20);
                    rVar.t(R.string.workout_benefit_maintaining_health_title, mVar20, 48);
                    rVar.o(R.string.workout_benefit_maintaining_health_desc, 384, 2, null, mVar20);
                    rVar.t(R.string.workout_benefit_maintaining_fitness_title, mVar20, 48);
                    rVar.o(R.string.workout_benefit_maintaining_fitness_desc, 384, 2, null, mVar20);
                    rVar.t(R.string.anaerobic_maintaining_ff_production, mVar20, 48);
                    rVar.o(R.string.workout_benefit_maintaining_speed_desc, 384, 2, null, mVar20);
                    rVar.t(R.string.workout_benefit_maintaining_vo2_max, mVar20, 48);
                    rVar.o(R.string.workout_benefit_maintaining_vo2_max_desc, 384, 2, null, mVar20);
                    rVar.t(R.string.workout_benefit_improving_health_title, mVar20, 48);
                    rVar.o(R.string.workout_benefit_improving_health_desc, 384, 2, null, mVar20);
                    rVar.t(R.string.workout_benefit_improving_fitness_title, mVar20, 48);
                    rVar.o(R.string.workout_benefit_improving_fitness_desc, 384, 2, null, mVar20);
                    rVar.t(R.string.workout_benefit_improving_vo2_max, mVar20, 48);
                    rVar.o(R.string.workout_benefit_improving_vo2_max_desc, 384, 2, null, mVar20);
                    rVar.t(R.string.workout_benefit_improving_speed_title, mVar20, 48);
                    rVar.o(R.string.workout_benefit_improving_speed_desc, 384, 2, null, mVar20);
                    rVar.t(R.string.workout_benefit_high_intensity_title, mVar20, 48);
                    rVar.o(R.string.workout_benefit_high_intensity_desc, 384, 2, null, mVar20);
                    rVar.t(R.string.workout_benefit_high_exertion_title, mVar20, 48);
                    rVar.o(R.string.workout_benefit_high_exertion_desc, 384, 2, null, mVar20);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                yr.i iVar2 = yr.i.f198868a;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = p3.n.f135158a;
                    h82.r rVar2 = h82.r.f82497a;
                    rVar2.t(R.string.workout_execution_score_help_subtitle2, mVar21, 48);
                    rVar2.o(R.string.workout_execution_score_help_msg3, 384, 2, null, mVar21);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                yr.j jVar = yr.j.f198871a;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = p3.n.f135158a;
                    y0.a(n5.c.a(R.drawable.shotview_app_icon, mVar22, 0), gl1.y.Q(mVar22, R.string.shotview_app_title), x2.q(h4.r.S, wz1.b.f188181a), null, null, 0.0f, null, mVar22, 0, 120);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar23 = (p3.m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                yr.j jVar2 = yr.j.f198871a;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA6 = d3.a(t62.b.f162798a);
                    h4.r.a aVar12 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(dVarA6, null, x2.q(aVar12, j92.b.f97901d.f97904c), lc.u0.f(mVar23), mVar23, 48, 0);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 23:
                p3.m mVar24 = (p3.m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                ys1.c cVar = ys1.c.f199165a;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.close_circle, mVar24, 0), gl1.y.Q(mVar24, R.string.lbl_close), null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar24), mVar24, 0, 4);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar25 = (p3.m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                ys1.d dVar3 = ys1.d.f199167a;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var25 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.close_circle, mVar25, 0), gl1.y.Q(mVar25, R.string.lbl_close), null, com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar25), mVar25, 0, 4);
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar26 = (p3.m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                ys1.d dVar4 = ys1.d.f199167a;
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var26 = p3.n.f135158a;
                    i53.f fVarA3 = i53.a.a(Integer.valueOf(R.string.trails_welcome_title), Integer.valueOf(R.string.trails_welcome_list_curate_title), Integer.valueOf(R.string.trails_welcome_offline_title));
                    i53.f fVarA4 = i53.a.a(Integer.valueOf(R.string.trails_welcome_caption), Integer.valueOf(R.string.trails_welcome_list_curate_caption), Integer.valueOf(R.string.trails_welcome_offline_caption));
                    Object objQ16 = mVar26.q();
                    aVar.getClass();
                    if (objQ16 == p3.m.a.f135155b) {
                        objQ16 = new ya0.j(26);
                        mVar26.K(objQ16);
                    }
                    ys1.h.a(0, fVarA3, fVarA4, (e23.a) objQ16, mVar26, 3072, 1);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar27 = (p3.m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                ys1.d dVar5 = ys1.d.f199167a;
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var27 = p3.n.f135158a;
                    ve.a(null, null, vb.h.e(d92.b.f58623a, mVar27), 0L, 0.0f, 0.0f, null, ys1.d.f199169c, mVar27, 12582912, 123);
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
            case 27:
                return a(obj, obj2);
            case 28:
                p3.m mVar28 = (p3.m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                yu1.b bVar2 = yu1.b.f199773a;
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var28 = p3.n.f135158a;
                    ve.a(null, null, 0L, 0L, 0.0f, 0.0f, null, yu1.b.f199775c, mVar28, 12582912, 127);
                } else {
                    mVar28.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar29 = (p3.m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                yu1.b bVar3 = yu1.b.f199773a;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var29 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar29, 0);
                    int iHashCode2 = Long.hashCode(mVar29.getU());
                    i2 i2VarX2 = mVar29.x();
                    h4.r rVarC2 = h4.k.c(rVarF, mVar29);
                    h5.g.V.getClass();
                    h5.e0.a aVar13 = h5.g.a.f81805b;
                    if (mVar29.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar29.z();
                    if (mVar29.getT()) {
                        mVar29.M(aVar13);
                    } else {
                        mVar29.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar29);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar29);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar29.getT() || !p005kotlin.jvm.internal.s.g(mVar29.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar29, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar29);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    yu1.g.b(new fy1.f("26:08", "26 minutes 8 seconds", null, "8:25", "8 minutes 25 seconds per mile", "/mi"), "Goal Distance", "Goal Pace", new fy1.f("24:45", "24 minutes 45 seconds", null, "8:02", "8 minutes 2 seconds per mile", "/mi"), "Actual Distance", "Actual Pace", mVar29, 221616);
                    mVar29.y();
                } else {
                    mVar29.e();
                }
                return Unit.INSTANCE;
        }
    }
}
