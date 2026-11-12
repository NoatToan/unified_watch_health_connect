package mt0;

import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f3 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f120598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.model.s f120599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.i0 f120600d;

    public /* synthetic */ f3(List list, com.garmin.android.apps.connectmobile.leaderboard.model.s sVar, com.garmin.android.apps.connectmobile.leaderboard.challenges.i0 i0Var, int i14) {
        this.f120597a = i14;
        this.f120598b = list;
        this.f120599c = sVar;
        this.f120600d = i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        String strH;
        z3.e eVar;
        int i15 = this.f120597a;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.i0 i0Var = this.f120600d;
        com.garmin.android.apps.connectmobile.leaderboard.model.s sVar = this.f120599c;
        List<com.garmin.android.apps.connectmobile.leaderboard.model.s> list = this.f120598b;
        Object[] objArr = 0;
        int i16 = 1;
        switch (i15) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.i0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.i0.f37604i;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(397745128, new f3(list, sVar, i0Var, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.i0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.i0.f37604i;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = p3.p0.n(sVar);
                        mVar2.K(objQ);
                    }
                    p3.p1 p1Var = (p3.p1) objQ;
                    if (!p13.h0.R(list, (com.garmin.android.apps.connectmobile.leaderboard.model.s) p1Var.getF182175a())) {
                        p1Var.setValue((com.garmin.android.apps.connectmobile.leaderboard.model.s) list.get(0));
                    }
                    h4.r.a aVar3 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar3, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    p3.b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    mVar2.C(2010453685);
                    for (com.garmin.android.apps.connectmobile.leaderboard.model.s sVar2 : list) {
                        switch (com.garmin.android.apps.connectmobile.leaderboard.challenges.i0.b.f37613a[sVar2.ordinal()]) {
                            case 1:
                                i14 = R.string.social_challenge_activity_type_description_steps;
                                break;
                            case 2:
                                i14 = R.string.social_challenge_activity_type_description_running;
                                break;
                            case 3:
                                i14 = R.string.social_challenge_activity_type_description_push;
                                break;
                            case 4:
                                i14 = R.string.social_challenge_activity_type_description_parasports;
                                break;
                            case 5:
                            case 6:
                                i14 = R.string.social_challenge_activity_type_description_cycling;
                                break;
                            case 7:
                                i14 = R.string.social_challenge_activity_type_description_swimming;
                                break;
                            default:
                                i14 = 0;
                                break;
                        }
                        l72.p2 p2Var = l72.p2.f111205a;
                        c22.c3 c3Var = sVar2.f38320b;
                        c3Var.getClass();
                        String strT = gl1.d.T(c3Var, mVar2, 0);
                        if (i14 != 0) {
                            strH = sn.a.h(mVar2, 236089104, i14, mVar2);
                        } else {
                            mVar2.C(-1271138485);
                            mVar2.f();
                            strH = "";
                        }
                        String str = strH;
                        if (((com.garmin.android.apps.connectmobile.leaderboard.model.s) p1Var.getF182175a()) == sVar2) {
                            g2.f120627a.getClass();
                            eVar = g2.f120628b;
                        } else {
                            eVar = null;
                        }
                        z3.e eVarC = z3.f.c(1212599041, new com.garmin.android.apps.connectmobile.leaderboard.model.x(sVar2, 3, objArr == true ? 1 : 0), mVar2);
                        boolean zK = mVar2.k(sVar2.ordinal()) | mVar2.r(i0Var);
                        Object objQ2 = mVar2.q();
                        if (zK || objQ2 == p3.m.a.f135155b) {
                            objQ2 = new kk1.a(sVar2, 23, i0Var, p1Var);
                            mVar2.K(objQ2);
                        }
                        p2Var.h(strT, str, null, null, null, false, false, eVarC, eVar, null, (e23.a) objQ2, mVar2, 12582912, 0, 636);
                    }
                    mVar2.f();
                    mVar2.y();
                    p3.x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
