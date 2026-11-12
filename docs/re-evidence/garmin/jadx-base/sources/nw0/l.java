package nw0;

import c2.x2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import i3.m8;
import l72.i3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import sg0.q0;
import t21.f1;
import w52.q1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f128060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f128061c;

    public /* synthetic */ l(e23.a aVar, e23.a aVar2, int i14) {
        this.f128059a = i14;
        this.f128060b = aVar;
        this.f128061c = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:126:0x0435  */
    /* JADX WARN: Code duplicated, block: B:131:0x046f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0533  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:30:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x0237  */
    /* JADX WARN: Code duplicated, block: B:82:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:98:0x0372  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f128059a;
        int i15 = 23;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f128060b;
        e23.a aVar3 = this.f128061c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                q.a(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ny0.c.b(aVar2, aVar3, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                oy0.f.b(aVar2, aVar3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                oy0.f.f(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.meal_calorie_goals);
                    i53.f fVarA = i53.a.a(new i3("EDIT", gl1.y.Q(mVar, R.string.lbl_edit), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB = mVar.B(aVar3);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new m8(aVar3, i15);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new m8(aVar3, i15);
                            mVar.K(objQ);
                        }
                    }
                    z02.f.d(strQ, null, null, this.f128060b, fVarA, null, (e23.l) objQ, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                pn1.e.a(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                oi0.c.b(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                o72.t.h(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                oc.b.c(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar2, R.string.training_readiness);
                    boolean zB2 = mVar2.B(aVar2);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new q0(aVar2, 25);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new q0(aVar2, 25);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ2;
                    i53.f fVarA2 = i53.a.a(new i3("MENU_ITEM_HELP_TRAINING_READINESS", gl1.y.Q(mVar2, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB3 = mVar2.B(aVar3);
                    Object objQ3 = mVar2.q();
                    if (zB3) {
                        objQ3 = new rx1.m(aVar3, 6);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new rx1.m(aVar3, 6);
                            mVar2.K(objQ3);
                        }
                    }
                    z02.f.d(strQ2, null, null, aVar4, fVarA2, null, (e23.l) objQ3, mVar2, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    x0.f23314a.getClass();
                    String strW = gl1.d.W(x0.Ud);
                    i53.f fVarA3 = i53.a.a(new i3("DONE", gl1.y.Q(mVar3, R.string.lbl_done), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB4 = mVar3.B(aVar3);
                    Object objQ4 = mVar3.q();
                    if (zB4) {
                        objQ4 = new rx1.m(aVar3, 9);
                        mVar3.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new rx1.m(aVar3, 9);
                            mVar3.K(objQ4);
                        }
                    }
                    z02.f.e(strW, null, this.f128060b, fVarA3, (e23.l) objQ4, mVar3, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    x0.f23314a.getClass();
                    String strW2 = gl1.d.W(x0.f23530me);
                    i53.f fVarA4 = i53.a.a(new i3("SAVE", gl1.y.Q(mVar4, R.string.lbl_done), true, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB5 = mVar4.B(aVar3);
                    Object objQ5 = mVar4.q();
                    if (zB5) {
                        objQ5 = new rx1.m(aVar3, 10);
                        mVar4.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new rx1.m(aVar3, 10);
                            mVar4.K(objQ5);
                        }
                    }
                    z02.f.e(strW2, null, this.f128060b, fVarA4, (e23.l) objQ5, mVar4, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                f1.a(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar5, R.string.lbl_device_settings_device_backup);
                    i53.f fVarA5 = i53.a.a(new i3("MENU_ITEM_MANAGE_BACKUPS_ID", gl1.y.Q(mVar5, R.string.lbl_device_migration_manage_backups), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB6 = mVar5.B(aVar3);
                    Object objQ6 = mVar5.q();
                    if (zB6) {
                        objQ6 = new rx1.m(aVar3, 12);
                        mVar5.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new rx1.m(aVar3, 12);
                            mVar5.K(objQ6);
                        }
                    }
                    z02.f.d(strQ3, null, null, this.f128060b, null, fVarA5, (e23.l) objQ6, mVar5, 2097152, 54);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                u70.g.a(aVar2, aVar3, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ug2.q0.a(aVar2, aVar3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                uk0.h.d(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    String strQ4 = gl1.y.Q(mVar6, R.string.lbl_stp_set_benchmarks);
                    i53.f fVarA6 = i53.a.a(new i3("help", gl1.y.Q(mVar6, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB7 = mVar6.B(aVar3);
                    Object objQ7 = mVar6.q();
                    if (zB7) {
                        objQ7 = new rx1.m(aVar3, 15);
                        mVar6.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new rx1.m(aVar3, 15);
                            mVar6.K(objQ7);
                        }
                    }
                    z02.f.d(strQ4, null, null, this.f128060b, fVarA6, null, (e23.l) objQ7, mVar6, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                v50.k.a(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                og2.k.e(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                w21.m.b(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                q1.h(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                y11.a.a(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                y22.s.d(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                yr.x.b(aVar2, aVar3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                z50.f.a(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    h4.r rVarF = x2.f(aVar5, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar7, 0);
                    int iHashCode = Long.hashCode(mVar7.getU());
                    i2 i2VarX = mVar7.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar7);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar6);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar7);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar7);
                    c2.b0 b0Var = c2.b0.f22601a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    String strQ5 = gl1.y.Q(mVar7, R.string.common_learn_more);
                    h4.r rVarF2 = x2.f(aVar5, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC2 = c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                    boolean zB8 = mVar7.B(aVar2);
                    Object objQ8 = mVar7.q();
                    if (zB8) {
                        objQ8 = new yy1.d(aVar2, 22);
                        mVar7.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new yy1.d(aVar2, 22);
                            mVar7.K(objQ8);
                        }
                    }
                    f0Var.i(strQ5, rVarC2, false, (e23.a) objQ8, mVar7, 0, 4);
                    String strQ6 = gl1.y.Q(mVar7, R.string.lbl_get_started);
                    h4.r rVarF3 = x2.f(aVar5, 1.0f);
                    boolean zB9 = mVar7.B(aVar3);
                    Object objQ9 = mVar7.q();
                    if (zB9) {
                        objQ9 = new yy1.d(aVar3, 23);
                        mVar7.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new yy1.d(aVar3, 23);
                            mVar7.K(objQ9);
                        }
                    }
                    f0Var.d(384, 9, (e23.a) objQ9, rVarF3, strQ6, mVar7, null, false);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f128059a = i15;
        this.f128060b = aVar;
        this.f128061c = aVar2;
    }
}
