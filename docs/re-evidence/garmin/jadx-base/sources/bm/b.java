package bm;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.advancedactivityediting.ActivitiesTrimActivity;
import l72.x0;
import p005kotlin.Unit;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivitiesTrimActivity f18766b;

    public /* synthetic */ b(ActivitiesTrimActivity activitiesTrimActivity, int i14) {
        this.f18765a = i14;
        this.f18766b = activitiesTrimActivity;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i14 = this.f18765a;
        final ActivitiesTrimActivity activitiesTrimActivity = this.f18766b;
        boolean z14 = false;
        int i15 = 2;
        final int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ActivitiesTrimActivity.a aVar = ActivitiesTrimActivity.f28809p;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-2120671283, new b(activitiesTrimActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ActivitiesTrimActivity.a aVar2 = ActivitiesTrimActivity.f28809p;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar3, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    x0 x0Var = x0.f111346a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(aVar3, eVar.f97920e);
                    final int i17 = z14 ? 1 : 0;
                    z3.e eVarC = z3.f.c(1667688633, new e23.q() { // from class: bm.d
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.q
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i18 = i17;
                            ActivitiesTrimActivity activitiesTrimActivity2 = activitiesTrimActivity;
                            switch (i18) {
                                case 0:
                                    t2 t2Var = (t2) obj4;
                                    p3.m mVar3 = (p3.m) obj5;
                                    int iIntValue3 = ((Integer) obj6).intValue();
                                    ActivitiesTrimActivity.a aVar5 = ActivitiesTrimActivity.f28809p;
                                    t2Var.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= mVar3.B(t2Var) ? 4 : 2;
                                    }
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        x0 x0Var2 = x0.f111346a;
                                        String str = (String) activitiesTrimActivity2.f28813d.getF182175a();
                                        String str2 = (String) activitiesTrimActivity2.f28812c.getF182175a();
                                        int i19 = (x0.f111348c << 24) | (iIntValue3 & 14);
                                        x0Var2.a(i19, 124, null, t2Var, null, null, str, str2, null, null, mVar3);
                                        x0Var2.a(i19, 124, null, t2Var, null, null, (String) activitiesTrimActivity2.f28815f.getF182175a(), (String) activitiesTrimActivity2.f28814e.getF182175a(), null, null, mVar3);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    c2 c2Var = activitiesTrimActivity2.f28817h;
                                    t2 t2Var2 = (t2) obj4;
                                    p3.m mVar4 = (p3.m) obj5;
                                    int iIntValue4 = ((Integer) obj6).intValue();
                                    ActivitiesTrimActivity.a aVar6 = ActivitiesTrimActivity.f28809p;
                                    t2Var2.getClass();
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= mVar4.B(t2Var2) ? 4 : 2;
                                    }
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        x0 x0Var3 = x0.f111346a;
                                        String str3 = (String) c2Var.getF182175a();
                                        String str4 = (String) activitiesTrimActivity2.f28816g.getF182175a();
                                        b92.a aVarA = wz1.a.a(c2Var.getF182175a() + activitiesTrimActivity2.getString(R.string.chart_distance_title, activitiesTrimActivity2.getString(activitiesTrimActivity2.f28820k)));
                                        int i24 = iIntValue4 & 14;
                                        int i25 = b92.a.f16960b;
                                        int i26 = x0.f111348c;
                                        x0Var3.a(i24 | (i26 << 24), 60, aVarA, t2Var2, null, null, str3, str4, null, null, mVar4);
                                        x0Var3.h(t2Var2, mVar4, i24 | (i26 << 3));
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2);
                    int i18 = (x0.f111348c << 6) | 48;
                    x0Var.e(rVarY, eVarC, mVar2, i18, 0);
                    x0Var.e(c2.l.y(aVar3, eVar.f97920e), z3.f.c(2062150562, new e23.q() { // from class: bm.d
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.q
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i19 = i16;
                            ActivitiesTrimActivity activitiesTrimActivity2 = activitiesTrimActivity;
                            switch (i19) {
                                case 0:
                                    t2 t2Var = (t2) obj4;
                                    p3.m mVar3 = (p3.m) obj5;
                                    int iIntValue3 = ((Integer) obj6).intValue();
                                    ActivitiesTrimActivity.a aVar5 = ActivitiesTrimActivity.f28809p;
                                    t2Var.getClass();
                                    if ((iIntValue3 & 6) == 0) {
                                        iIntValue3 |= mVar3.B(t2Var) ? 4 : 2;
                                    }
                                    if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                        x1 x1Var3 = p3.n.f135158a;
                                        x0 x0Var2 = x0.f111346a;
                                        String str = (String) activitiesTrimActivity2.f28813d.getF182175a();
                                        String str2 = (String) activitiesTrimActivity2.f28812c.getF182175a();
                                        int i110 = (x0.f111348c << 24) | (iIntValue3 & 14);
                                        x0Var2.a(i110, 124, null, t2Var, null, null, str, str2, null, null, mVar3);
                                        x0Var2.a(i110, 124, null, t2Var, null, null, (String) activitiesTrimActivity2.f28815f.getF182175a(), (String) activitiesTrimActivity2.f28814e.getF182175a(), null, null, mVar3);
                                    } else {
                                        mVar3.e();
                                    }
                                    break;
                                default:
                                    c2 c2Var = activitiesTrimActivity2.f28817h;
                                    t2 t2Var2 = (t2) obj4;
                                    p3.m mVar4 = (p3.m) obj5;
                                    int iIntValue4 = ((Integer) obj6).intValue();
                                    ActivitiesTrimActivity.a aVar6 = ActivitiesTrimActivity.f28809p;
                                    t2Var2.getClass();
                                    if ((iIntValue4 & 6) == 0) {
                                        iIntValue4 |= mVar4.B(t2Var2) ? 4 : 2;
                                    }
                                    if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                                        x1 x1Var4 = p3.n.f135158a;
                                        x0 x0Var3 = x0.f111346a;
                                        String str3 = (String) c2Var.getF182175a();
                                        String str4 = (String) activitiesTrimActivity2.f28816g.getF182175a();
                                        b92.a aVarA = wz1.a.a(c2Var.getF182175a() + activitiesTrimActivity2.getString(R.string.chart_distance_title, activitiesTrimActivity2.getString(activitiesTrimActivity2.f28820k)));
                                        int i24 = iIntValue4 & 14;
                                        int i25 = b92.a.f16960b;
                                        int i26 = x0.f111348c;
                                        x0Var3.a(i24 | (i26 << 24), 60, aVarA, t2Var2, null, null, str3, str4, null, null, mVar4);
                                        x0Var3.h(t2Var2, mVar4, i24 | (i26 << 3));
                                    } else {
                                        mVar4.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar2), mVar2, i18, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ActivitiesTrimActivity.a aVar5 = ActivitiesTrimActivity.f28809p;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (((Boolean) p0.c(activitiesTrimActivity.f28821l, mVar3, 0).getF182175a()).booleanValue()) {
                        mVar3.C(2050837709);
                        o13.u uVar = (o13.u) p0.c(activitiesTrimActivity.f28822m, mVar3, 0).getF182175a();
                        h4.r.a aVar6 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        h4.r rVarZ = c2.l.z(aVar6, eVar2.f97920e, eVar2.f97917b);
                        String string = activitiesTrimActivity.getString(R.string.provisional_finish_point_banner_title);
                        String string2 = activitiesTrimActivity.getString(R.string.provisional_finish_point_banner_message, uVar.f128605a, uVar.f128606b);
                        string2.getClass();
                        String string3 = activitiesTrimActivity.getString(R.string.provisional_finish_point_banner_action);
                        boolean zR = mVar3.r(activitiesTrimActivity) | mVar3.B(uVar);
                        Object objQ = mVar3.q();
                        if (zR) {
                            obj3 = objQ;
                            bb0.d dVar = new bb0.d(4, activitiesTrimActivity, uVar);
                            mVar3.K(dVar);
                            obj3 = dVar;
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                obj3 = objQ;
                                bb0.d dVar2 = new bb0.d(4, activitiesTrimActivity, uVar);
                                mVar3.K(dVar2);
                                obj3 = dVar2;
                            }
                        }
                        obj3 = objQ;
                        defpackage.e.a(rVarZ, null, string, string2, string3, false, (e23.a) obj3, mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(2051552693);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ActivitiesTrimActivity.a aVar7 = ActivitiesTrimActivity.f28809p;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1501547560, new b(activitiesTrimActivity, i16), mVar4), mVar4, 196608, 31);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }
}
