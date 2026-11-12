package com.garmin.android.apps.connectmobile.leaderboard.model;

import a3.m0;
import a3.s1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.c3;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.n0;
import com.google.android.exoplayer2.audio.WavUtil;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f38377b;

    public /* synthetic */ x(s sVar, int i14) {
        this.f38376a = 0;
        this.f38377b = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f38376a;
        int i15 = 2;
        s sVar = this.f38377b;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                y.a(sVar, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1626967260, new x(sVar, i15, objArr == true ? 1 : 0), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarC = x2.c(aVar, 1.0f);
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    u2 u2Var = u2.f22900a;
                    u4.d dVarB = y.b(sVar);
                    if (dVarB == null) {
                        s62.a.f157643a.getClass();
                        dVarB = u62.a.a(t62.a.f162797a);
                    }
                    long jB = ds.e0.b(d92.b.f58623a, mVar2);
                    d92.b.f58625c.getClass();
                    m0.a(0, jB, x2.q(c2.l.A(aVar, j92.b.f97899b.f97920e, 0.0f, 2), j92.b.f97901d.f97906e), mVar2, dVarB);
                    c3 c3Var = sVar.f38320b;
                    c3Var.getClass();
                    String strT = gl1.d.T(c3Var, mVar2, 0);
                    d92.b.f58624b.getClass();
                    s1.b(strT, null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.i0.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.i0.f37604i;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    u4.d dVarB2 = y.b(sVar);
                    if (dVarB2 == null) {
                        s62.a.f157643a.getClass();
                        dVarB2 = u62.a.a(t62.a.f162797a);
                    }
                    u4.d dVar = dVarB2;
                    long jB2 = ds.e0.b(d92.b.f58623a, mVar3);
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58625c.getClass();
                    m0.a(0, jB2, x2.q(aVar4, j92.b.f97901d.f97906e), mVar3, dVar);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                n0.a aVar5 = n0.f37680l;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(984771477, new x(sVar, 6, objArr2 == true ? 1 : 0), mVar4), mVar4, 196608, 31);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                n0.a aVar6 = n0.f37680l;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(463966547, new x(sVar, 7, objArr3 == true ? 1 : 0), mVar5), mVar5, 196608, 31);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                n0.a aVar7 = n0.f37680l;
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    y.a(sVar, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                n0.a aVar8 = n0.f37680l;
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    y.a(sVar, mVar7, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ x(s sVar, int i14, byte b14) {
        this.f38376a = i14;
        this.f38377b = sVar;
    }
}
