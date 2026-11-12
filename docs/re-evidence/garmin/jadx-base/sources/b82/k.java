package b82;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import i3.i7;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u4.d f16640b;

    public /* synthetic */ k(u4.d dVar, int i14) {
        this.f16639a = i14;
        this.f16640b = dVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16639a;
        u4.d dVar = this.f16640b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    g6.f.a aVar2 = g6.f.f75994b;
                    h4.r rVarQ = x2.q(u1.n.e(aVar, d92.b.a(mVar).e().g(), k2.i.f102406a), 48);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarQ, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    float f14 = 24;
                    i7.b(this.f16640b, null, c2.u.f22885a.c(x2.u(x2.h(aVar, f14), f14), h4.d.a.f81528f), lc.u0.f(mVar), mVar, 48, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                WorkoutActivityProfileSelectionActivity.b bVar2 = WorkoutActivityProfileSelectionActivity.f48559a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    long jB = ds.e0.b(d92.b.f58623a, mVar2);
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(this.f16640b, null, x2.q(aVar4, j92.b.f97901d.f97905d), jB, mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ew1.q1.a aVar5 = ew1.q1.f66677f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(this.f16640b, null, x2.q(aVar6, j92.b.f97901d.f97904c), lc.u0.f(mVar3), mVar3, 48, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i15 = g62.c0.f76064c;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(599285942, new k(dVar, 4), mVar4), mVar4, 196608, 31);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i16 = g62.c0.f76064c;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    long jB2 = ds.e0.b(d92.b.f58623a, mVar5);
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(this.f16640b, null, x2.q(aVar7, j92.b.f97901d.f97905d), jB2, mVar5, 48, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(this.f16640b, "", x2.q(aVar8, j92.b.f97901d.f97905d), lc.u0.f(mVar6), mVar6, 48, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    i7.b(this.f16640b, "", null, 0L, mVar7, 0, 12);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    i7.b(this.f16640b, null, null, ds.e0.b(d92.b.f58623a, mVar8), mVar8, 48, 4);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                oo0.h.d(dVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                oo0.h.e(dVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 10:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i17 = q62.b.f143174r;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1888018667, new k(dVar, 11), mVar9), mVar9, 196608, 31);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i18 = q62.b.f143174r;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    long jB3 = ds.e0.b(d92.b.f58623a, mVar10);
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(this.f16640b, null, x2.q(aVar9, j92.b.f97901d.f97905d), jB3, mVar10, 48, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar11);
                    h4.r.a aVar10 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(this.f16640b, null, x2.q(aVar10, j92.b.f97901d.f97905d), jA, mVar11, 48, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    long jB4 = ds.e0.b(d92.b.f58623a, mVar12);
                    g6.f.a aVar11 = g6.f.f75994b;
                    i7.b(this.f16640b, null, x2.q(h4.r.S, 20), jB4, mVar12, 432, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    long jB5 = ds.e0.b(d92.b.f58623a, mVar13);
                    g6.f.a aVar12 = g6.f.f75994b;
                    i7.b(this.f16640b, null, x2.q(h4.r.S, 20), jB5, mVar13, 432, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    p3.x1 x1Var14 = p3.n.f135158a;
                    long jB6 = ds.e0.b(d92.b.f58623a, mVar14);
                    h4.r.a aVar13 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(this.f16640b, null, x2.q(aVar13, j92.b.f97901d.f97905d), jB6, mVar14, 48, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    p3.x1 x1Var15 = p3.n.f135158a;
                    long jB7 = ds.e0.b(d92.b.f58623a, mVar15);
                    h4.r.a aVar14 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(this.f16640b, null, x2.q(aVar14, j92.b.f97901d.f97904c), jB7, mVar15, 48, 0);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    p3.x1 x1Var16 = p3.n.f135158a;
                    long jB8 = ds.e0.b(d92.b.f58623a, mVar16);
                    h4.r.a aVar15 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(this.f16640b, null, x2.q(aVar15, j92.b.f97901d.f97904c), jB8, mVar16, 48, 0);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                int i19 = xu2.c.f192256h;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 11) != 2)) {
                    mVar17.C(-1631667980);
                    long jA2 = n5.a.a(mVar17, R.color.rts_primary_text_color);
                    mVar17.f();
                    a3.m0.a(4, jA2, null, mVar17, this.f16640b);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    p3.x1 x1Var17 = p3.n.f135158a;
                    gl.c.f77766a.getClass();
                    long jL = gl.c.a(mVar18).l();
                    h4.r.a aVar16 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(this.f16640b, null, x2.q(aVar16, j92.b.f97901d.f97905d), jL, mVar18, 48, 0);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(u4.d dVar, int i14, int i15) {
        this.f16639a = i15;
        this.f16640b = dVar;
    }
}
