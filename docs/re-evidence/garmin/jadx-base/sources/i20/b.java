package i20;

import am.x0;
import android.content.DialogInterface;
import c2.a0;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.reports.ActivityReportsActivity;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivitiesActivity;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactActivity;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.common.FitPayA2AInstallAppActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import f20.d0;
import f4.w;
import f5.z0;
import h5.e0;
import i3.c0;
import i3.g5;
import i3.h5;
import i3.h7;
import i3.i7;
import i3.k5;
import i3.mh;
import i3.tc;
import i3.uf;
import i3.y9;
import l72.i3;
import lc.u0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.t0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import v62.e1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f87144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f87145c;

    public /* synthetic */ b(String str, hk1.f fVar, int i14) {
        this.f87143a = 10;
        this.f87145c = str;
        this.f87144b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:166:0x0511  */
    /* JADX WARN: Code duplicated, block: B:171:0x053b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x00be  */
    /* JADX WARN: Code duplicated, block: B:82:0x028b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f87143a;
        p3.m.a aVar = p3.m.f135153a;
        final int i15 = 2;
        boolean z14 = false;
        final int i16 = 1;
        Object obj3 = this.f87145c;
        Object obj4 = this.f87144b;
        switch (i14) {
            case 0:
                final EditContactActivity editContactActivity = (EditContactActivity) obj4;
                ((Integer) obj2).getClass();
                EditContactActivity.a aVar2 = EditContactActivity.f32500n;
                ((DialogInterface) obj).getClass();
                androidx.appcompat.app.e.a message = new androidx.appcompat.app.e.a(editContactActivity).setTitle(R.string.lbl_dont_send_request).setMessage((String) obj3);
                final int i17 = z14 ? 1 : 0;
                message.setNegativeButton(R.string.lbl_cancel, new DialogInterface.OnClickListener() { // from class: i20.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i18) {
                        int i19 = i17;
                        EditContactActivity editContactActivity2 = editContactActivity;
                        switch (i19) {
                            case 0:
                                EditContactActivity.a aVar3 = EditContactActivity.f32500n;
                                dialogInterface.dismiss();
                                editContactActivity2.ca(editContactActivity2.da().f87206e);
                                break;
                            default:
                                editContactActivity2.f32510j = true;
                                editContactActivity2.da().y4();
                                dialogInterface.dismiss();
                                break;
                        }
                    }
                }).setPositiveButton(R.string.lbl_do_not_send, new DialogInterface.OnClickListener() { // from class: i20.c
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i18) {
                        int i19 = i16;
                        EditContactActivity editContactActivity2 = editContactActivity;
                        switch (i19) {
                            case 0:
                                EditContactActivity.a aVar3 = EditContactActivity.f32500n;
                                dialogInterface.dismiss();
                                editContactActivity2.ca(editContactActivity2.da().f87206e);
                                break;
                            default:
                                editContactActivity2.f32510j = true;
                                editContactActivity2.da().y4();
                                dialogInterface.dismiss();
                                break;
                        }
                    }
                }).show();
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                g5 g5Var = g5.f88187a;
                ((g5) obj4).a((c0) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                h5 h5Var = h5.f88293a;
                ((h5) obj4).a((y9) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                k5 k5Var = k5.f88664a;
                ((k5) obj4).a((tc) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                uf.d((e23.p) obj4, (e23.p) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                d91.s sVar = (d91.s) obj4;
                d91.f fVar = (d91.f) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (sVar.f58586h == fVar) {
                        mVar.C(-1125428);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = e1.a(t62.b.f162798a);
                        h4.r.a aVar3 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i7.b(dVarA, gl1.y.Q(mVar, R.string.lbl_selected), x2.q(aVar3, j92.b.f97901d.f97905d), u0.f(mVar), mVar, 0, 0);
                        mVar.f();
                    } else {
                        mVar.C(-615664);
                        h4.r.a aVar4 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.q.a(x2.q(aVar4, j92.b.f97901d.f97905d), mVar, 0);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 6:
                Integer num = (Integer) obj4;
                d91.f fVar2 = (d91.f) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar5, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar6);
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
                    b0 b0Var = b0.f22601a;
                    String strQ = gl1.y.Q(mVar2, num.intValue());
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                    if (fVar2 == d91.f.f58527f) {
                        mVar2.C(440786166);
                        mh.c(gl1.y.Q(mVar2, R.string.help_make_insights_better), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar2), mVar2, 0, 0, 131070);
                        mVar2.f();
                    } else {
                        mVar2.C(441151346);
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ic1.b.b((gc1.a) obj4, (Double) obj3, (p3.m) obj, p0.t(9));
                return Unit.INSTANCE;
            case 8:
                h82.r rVar = (h82.r) obj4;
                final ih0.m mVar3 = (ih0.m) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i18 = ih0.m.f93463f;
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zR = mVar4.r(mVar3);
                    Object objQ = mVar4.q();
                    if (zR) {
                        final int i19 = z14 ? 1 : 0;
                        objQ = new e23.a() { // from class: ih0.k
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i19;
                                m mVar5 = mVar3;
                                switch (i24) {
                                    case 0:
                                        int i25 = m.f93463f;
                                        mVar5.e("ABOUT_FITNESS_AGE");
                                        break;
                                    case 1:
                                        int i26 = m.f93463f;
                                        mVar5.e("HOW_TO_TRACK_FITNESS_AGE");
                                        break;
                                    default:
                                        int i27 = m.f93463f;
                                        mVar5.e("FITNESS_AGE_RESTRICTIONS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int i110 = z14 ? 1 : 0;
                            objQ = new e23.a() { // from class: ih0.k
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i110;
                                    m mVar5 = mVar3;
                                    switch (i24) {
                                        case 0:
                                            int i25 = m.f93463f;
                                            mVar5.e("ABOUT_FITNESS_AGE");
                                            break;
                                        case 1:
                                            int i26 = m.f93463f;
                                            mVar5.e("HOW_TO_TRACK_FITNESS_AGE");
                                            break;
                                        default:
                                            int i27 = m.f93463f;
                                            mVar5.e("FITNESS_AGE_RESTRICTIONS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ);
                        }
                    }
                    rVar.B(R.string.lbl_about_fitness_age, null, false, (e23.a) objQ, mVar4, 0, 6);
                    boolean zR2 = mVar4.r(mVar3);
                    Object objQ2 = mVar4.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: ih0.k
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i16;
                                m mVar5 = mVar3;
                                switch (i24) {
                                    case 0:
                                        int i25 = m.f93463f;
                                        mVar5.e("ABOUT_FITNESS_AGE");
                                        break;
                                    case 1:
                                        int i26 = m.f93463f;
                                        mVar5.e("HOW_TO_TRACK_FITNESS_AGE");
                                        break;
                                    default:
                                        int i27 = m.f93463f;
                                        mVar5.e("FITNESS_AGE_RESTRICTIONS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: ih0.k
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i16;
                                    m mVar5 = mVar3;
                                    switch (i24) {
                                        case 0:
                                            int i25 = m.f93463f;
                                            mVar5.e("ABOUT_FITNESS_AGE");
                                            break;
                                        case 1:
                                            int i26 = m.f93463f;
                                            mVar5.e("HOW_TO_TRACK_FITNESS_AGE");
                                            break;
                                        default:
                                            int i27 = m.f93463f;
                                            mVar5.e("FITNESS_AGE_RESTRICTIONS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ2);
                        }
                    }
                    rVar.B(R.string.lbl_how_to_get_fitness_age, null, false, (e23.a) objQ2, mVar4, 0, 6);
                    boolean zR3 = mVar4.r(mVar3);
                    Object objQ3 = mVar4.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: ih0.k
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i15;
                                m mVar5 = mVar3;
                                switch (i24) {
                                    case 0:
                                        int i25 = m.f93463f;
                                        mVar5.e("ABOUT_FITNESS_AGE");
                                        break;
                                    case 1:
                                        int i26 = m.f93463f;
                                        mVar5.e("HOW_TO_TRACK_FITNESS_AGE");
                                        break;
                                    default:
                                        int i27 = m.f93463f;
                                        mVar5.e("FITNESS_AGE_RESTRICTIONS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: ih0.k
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i15;
                                    m mVar5 = mVar3;
                                    switch (i24) {
                                        case 0:
                                            int i25 = m.f93463f;
                                            mVar5.e("ABOUT_FITNESS_AGE");
                                            break;
                                        case 1:
                                            int i26 = m.f93463f;
                                            mVar5.e("HOW_TO_TRACK_FITNESS_AGE");
                                            break;
                                        default:
                                            int i27 = m.f93463f;
                                            mVar5.e("FITNESS_AGE_RESTRICTIONS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ3);
                        }
                    }
                    rVar.B(R.string.lbl_fitness_age_restrictions, null, false, (e23.a) objQ3, mVar4, 0, 6);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 9:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                GarminPayLaunchScreenActivity.a aVar7 = GarminPayLaunchScreenActivity.f35305d;
                dialogInterface.getClass();
                ((GarminPayLaunchScreenActivity.b) obj4).invoke((kj0.a.C2012a) obj3);
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ik1.d.c((String) obj3, (hk1.f) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                pu0.b bVar2 = (pu0.b) obj;
                bVar2.getClass();
                gv0.d.T4((gv0.d) obj4, bVar2, (pu0.b) obj2, (pu0.b) obj3, 4);
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.multidayactivities.presentation.charts.a.a((sy0.l) obj4, (i53.c) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                final f4.w wVar = (f4.w) obj4;
                p1 p1Var = (p1) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                GroupSettingsActivitiesActivity.a aVar8 = GroupSettingsActivitiesActivity.f31417b;
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    String str = (String) p1Var.getF182175a();
                    Object objQ4 = mVar5.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ4 == c2565a) {
                        final int i24 = z14 ? 1 : 0;
                        objQ4 = new e23.l() { // from class: j10.g
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                int i25 = i24;
                                w wVar2 = wVar;
                                com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.e) obj5;
                                switch (i25) {
                                    case 0:
                                        GroupSettingsActivitiesActivity.a aVar9 = GroupSettingsActivitiesActivity.f31417b;
                                        eVar.getClass();
                                        wVar2.add(eVar);
                                        break;
                                    default:
                                        GroupSettingsActivitiesActivity.a aVar10 = GroupSettingsActivitiesActivity.f31417b;
                                        eVar.getClass();
                                        wVar2.remove(eVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar5.K(objQ4);
                    }
                    e23.l lVar = (e23.l) objQ4;
                    Object objQ5 = mVar5.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new e23.l() { // from class: j10.g
                            @Override // e23.l
                            public final Object invoke(Object obj5) {
                                int i25 = i16;
                                w wVar2 = wVar;
                                com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar = (com.garmin.android.apps.connectmobile.connections.groups.services.model.e) obj5;
                                switch (i25) {
                                    case 0:
                                        GroupSettingsActivitiesActivity.a aVar9 = GroupSettingsActivitiesActivity.f31417b;
                                        eVar.getClass();
                                        wVar2.add(eVar);
                                        break;
                                    default:
                                        GroupSettingsActivitiesActivity.a aVar10 = GroupSettingsActivitiesActivity.f31417b;
                                        eVar.getClass();
                                        wVar2.remove(eVar);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar5.K(objQ5);
                    }
                    e23.l lVar2 = (e23.l) objQ5;
                    Object objQ6 = mVar5.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new hy.h(28, wVar, p1Var);
                        mVar5.K(objQ6);
                    }
                    lm0.e.a(wVar, str, lVar, lVar2, (e23.l) objQ6, mVar5, 28038);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.contacts.emergency.f.a aVar9 = com.garmin.android.apps.connectmobile.contacts.emergency.f.f32689b;
                ((com.garmin.android.apps.connectmobile.contacts.emergency.f) obj4).u6((e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                i53.c cVar = (i53.c) obj4;
                o82.a aVar10 = (o82.a) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    dh.b.j(cVar, aVar10, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.running_tolerance.presentation.a.a((lc.y) obj4, (jf1.b) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ((p003ji0.n.Function0) obj4).a((z3.e) obj3, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 18:
                hk1.y.a aVar11 = (hk1.y.a) obj4;
                e23.a aVar12 = (e23.a) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    String strH = aVar11.f84219b;
                    if (strH == null) {
                        strH = sn.a.h(mVar7, 1073982915, R.string.lbl_unable_to_connect, mVar7);
                    } else {
                        mVar7.C(1073982078);
                        mVar7.f();
                    }
                    z02.f.c(0, 54, null, aVar12, null, strH, mVar7, null);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 19:
                f.c cVar2 = (f.c) obj4;
                ActivityReportsActivity activityReportsActivity = (ActivityReportsActivity) obj3;
                long jLongValue = ((Long) obj).longValue();
                x0 x0Var = (x0) obj2;
                ActivityReportsActivity.a aVar13 = ActivityReportsActivity.f29758a;
                x0Var.getClass();
                aq.b bVar3 = new aq.b();
                bVar3.f11823b = jLongValue;
                am.h hVar = am.h.VIEW_EDIT;
                if (hVar != null) {
                    bVar3.f11824c = hVar;
                }
                bVar3.f11825d = true;
                bVar3.f11827f = x0Var.f4358a;
                cVar2.a(bVar3.a(activityReportsActivity), null);
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                FitPayCardVerificationActivity.b bVar4 = FitPayCardVerificationActivity.f51449m;
                ((DialogInterface) obj).getClass();
                yr2.a.a((FitPayCardVerificationActivity) obj4, s0.f105811a.b(FitPayA2AInstallAppActivity.class), t0.b(new o13.p("app.package.name", (String) obj3)));
                return Unit.INSTANCE;
            case 21:
                pt1.x xVar = (pt1.x) obj4;
                e23.p pVar = (e23.p) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar14 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar14, j92.b.f97901d.f97905d);
                    boolean z15 = !xVar.f141019p;
                    boolean zB = mVar8.B(pVar) | mVar8.r(xVar);
                    Object objQ7 = mVar8.q();
                    if (zB) {
                        objQ7 = new i91.c(25, pVar, xVar);
                        mVar8.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new i91.c(25, pVar, xVar);
                            mVar8.K(objQ7);
                        }
                    }
                    h7.a((e23.a) objQ7, rVarQ, z15, null, null, z3.f.c(763806782, new ik1.c(xVar, 13), mVar8), mVar8, 1572864, 56);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                jt1.l.a((h4.r) obj4, (e23.l) obj3, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                jy0.u.d((jy0.l) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                c12.h hVar2 = (c12.h) obj4;
                p1 p1Var2 = (p1) obj3;
                i3 i3Var = (i3) obj;
                jy0.v vVar = (jy0.v) obj2;
                i3Var.getClass();
                vVar.getClass();
                String str2 = i3Var.f111063a;
                if (p005kotlin.jvm.internal.s.g(str2, "MENU_ITEM_EXIT")) {
                    p1Var2.setValue(Boolean.TRUE);
                } else if (p005kotlin.jvm.internal.s.g(str2, "MENU_ITEM_FILTER")) {
                    if (vVar.equals(jy0.v.a.f101826b)) {
                        hVar2.b(jy0.v.b.f101827b);
                    } else if (vVar.equals(jy0.v.d.f101829b)) {
                        hVar2.b(jy0.v.c.f101828b);
                    }
                }
                return Unit.INSTANCE;
            case 25:
                sy0.m mVar9 = (sy0.m) obj4;
                sy0.m mVar10 = (sy0.m) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    if (mVar9 == mVar10) {
                        mVar11.C(-350920220);
                        h4.r.a aVar15 = h4.r.S;
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode2 = Long.hashCode(mVar11.getU());
                        i2 i2VarX2 = mVar11.x();
                        h4.r rVarC2 = h4.k.c(aVar15, mVar11);
                        h5.g.V.getClass();
                        e0.a aVar16 = h5.g.a.f81805b;
                        if (mVar11.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar11.z();
                        if (mVar11.getT()) {
                            mVar11.M(aVar16);
                        } else {
                            mVar11.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar11);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar11);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar11, iHashCode2, bVar5);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, mVar11);
                        c2.u uVar = c2.u.f22885a;
                        s62.a.f157643a.getClass();
                        u4.d dVarA2 = e1.a(t62.b.f162798a);
                        long jG = fb1.c.g(d92.b.f58623a, mVar11);
                        String strQ2 = gl1.y.Q(mVar11, R.string.lbl_selected);
                        d92.b.f58625c.getClass();
                        i7.b(dVarA2, strQ2, x2.q(aVar15, j92.b.f97901d.f97904c), jG, mVar11, 0, 0);
                        mVar11.y();
                        mVar11.f();
                    } else {
                        mVar11.C(-350493536);
                        mVar11.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                jy0.c0.a((sy0.m) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                e23.a aVar17 = (e23.a) obj4;
                l11.n nVar = (l11.n) obj3;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar12, R.string.meal_details);
                    boolean zB2 = mVar12.B(aVar17);
                    Object objQ8 = mVar12.q();
                    if (zB2) {
                        objQ8 = new j22.d(aVar17, 21);
                        mVar12.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new j22.d(aVar17, 21);
                            mVar12.K(objQ8);
                        }
                    }
                    e23.a aVar18 = (e23.a) objQ8;
                    i53.f fVarA = i53.a.a(new i3("ADD_MEAL", gl1.y.Q(mVar12, R.string.lbl_add), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR4 = mVar12.r(nVar);
                    Object objQ9 = mVar12.q();
                    if (zR4) {
                        objQ9 = new k11.t(nVar, z14 ? 1 : 0);
                        mVar12.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new k11.t(nVar, z14 ? 1 : 0);
                            mVar12.K(objQ9);
                        }
                    }
                    z02.f.e(strQ3, null, aVar18, fVarA, (e23.l) objQ9, mVar12, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).intValue();
                k20.d.a aVar19 = k20.d.f102434j;
                ((DialogInterface) obj).getClass();
                ((k20.d) obj4).A6((d0.b) obj3);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                k41.g.a((a0) obj4, (h41.g) obj3, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, int i14, int i15) {
        this.f87143a = i15;
        this.f87144b = obj;
        this.f87145c = obj2;
    }

    public /* synthetic */ b(int i14, Object obj, Object obj2) {
        this.f87143a = i14;
        this.f87144b = obj;
        this.f87145c = obj2;
    }
}
