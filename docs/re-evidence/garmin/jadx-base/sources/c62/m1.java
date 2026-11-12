package c62;

import android.app.Activity;
import android.content.DialogInterface;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDownloadListActivity;
import com.garmin.android.apps.connectmobile.cyclingability.presentation.CyclingAbilityReportsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.settings.thirdparty.details.ThirdPartyConnectActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.fragment.FitPayAddressManagementFragment;
import i3.mh;
import i3.ua;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Unit;
import p3.p3;
import ro0.l;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24808b;

    public /* synthetic */ m1(Object obj, int i14) {
        this.f24807a = i14;
        this.f24808b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:236:0x0688  */
    /* JADX WARN: Code duplicated, block: B:241:0x06a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f24807a;
        p3.m.a aVar = p3.m.f135153a;
        Object objValueOf = null;
        final int i19 = 1;
        Object obj4 = this.f24808b;
        switch (i18) {
            case 0:
                p005kotlin.jvm.internal.p0 p0Var = (p005kotlin.jvm.internal.p0) obj4;
                l52.r rVar = (l52.r) obj;
                int i24 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
                rVar.getClass();
                ((l52.i.a) obj2).getClass();
                int i25 = p0Var.f105807a + 1;
                p0Var.f105807a = i25;
                if (i25 > 50) {
                    Unit unit = Unit.INSTANCE;
                    int i26 = o13.q.f128596b;
                    rVar.a(unit);
                }
                return Unit.INSTANCE;
            case 1:
                final CyclingAbilityReportsActivity cyclingAbilityReportsActivity = (CyclingAbilityReportsActivity) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i27 = CyclingAbilityReportsActivity.f33114b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    c70.i iVar = (c70.i) cyclingAbilityReportsActivity.f33115a.getValue();
                    boolean zR = mVar.r(cyclingAbilityReportsActivity);
                    Object objQ = mVar.q();
                    if (zR) {
                        final int i28 = false ? 1 : 0;
                        objQ = new e23.a() { // from class: c70.d
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i28) {
                                    case 0:
                                        int i29 = CyclingAbilityReportsActivity.f33114b;
                                        cyclingAbilityReportsActivity.getOnBackPressedDispatcher().d();
                                        break;
                                    default:
                                        int i30 = CyclingAbilityReportsActivity.f33114b;
                                        HelpActivity.a.e(HelpActivity.f36653a, cyclingAbilityReportsActivity, l.CYCLING_ABILITY, null, null, 12);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            final int i29 = false ? 1 : 0;
                            objQ = new e23.a() { // from class: c70.d
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i29) {
                                        case 0:
                                            int i210 = CyclingAbilityReportsActivity.f33114b;
                                            cyclingAbilityReportsActivity.getOnBackPressedDispatcher().d();
                                            break;
                                        default:
                                            int i30 = CyclingAbilityReportsActivity.f33114b;
                                            HelpActivity.a.e(HelpActivity.f36653a, cyclingAbilityReportsActivity, l.CYCLING_ABILITY, null, null, 12);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar2 = (e23.a) objQ;
                    boolean zR2 = mVar.r(cyclingAbilityReportsActivity);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: c70.d
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        int i210 = CyclingAbilityReportsActivity.f33114b;
                                        cyclingAbilityReportsActivity.getOnBackPressedDispatcher().d();
                                        break;
                                    default:
                                        int i30 = CyclingAbilityReportsActivity.f33114b;
                                        HelpActivity.a.e(HelpActivity.f36653a, cyclingAbilityReportsActivity, l.CYCLING_ABILITY, null, null, 12);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: c70.d
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            int i210 = CyclingAbilityReportsActivity.f33114b;
                                            cyclingAbilityReportsActivity.getOnBackPressedDispatcher().d();
                                            break;
                                        default:
                                            int i30 = CyclingAbilityReportsActivity.f33114b;
                                            HelpActivity.a.e(HelpActivity.f36653a, cyclingAbilityReportsActivity, l.CYCLING_ABILITY, null, null, 12);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ2);
                        }
                    }
                    c70.g.a(iVar, aVar2, (e23.a) objQ2, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                c81.g.b((g81.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                c81.g.a((g81.d0) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                c81.g.c((g81.e0) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                g81.b bVar = (g81.b) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    if (bVar == null) {
                        mVar2.C(877272089);
                        mVar2.f();
                    } else {
                        mVar2.C(877272090);
                        c81.j.a(bVar.f76267a, bVar.f76281o, bVar.f76282p, mVar2, 0);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 6:
                g81.e eVar = (g81.e) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    c81.m.a(eVar.f76303a, eVar.f76304b, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 7:
                int iIntValue4 = ((Integer) obj).intValue();
                gg1.o0 o0Var = (gg1.o0) obj2;
                o0Var.getClass();
                ((na0.r) obj4).y4(o0Var, iIntValue4);
                return Unit.INSTANCE;
            case 8:
                sg1.c cVar = (sg1.c) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                cVar.getClass();
                ((qa0.f) obj4).x4(cVar.f159207e, zBooleanValue, false);
                return Unit.INSTANCE;
            case 9:
                ck0.v vVar = (ck0.v) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    if (vVar instanceof ck0.v.c) {
                        mVar4.C(-756926671);
                        h4.r.a aVar3 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        ua.a(0.0f, 0.0f, 0, 0, 60, lc.u0.f(mVar4), 0L, x2.q(aVar3, j92.b.f97901d.f97903b), mVar4);
                        mVar4.f();
                    } else {
                        mVar4.C(-756697953);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ck0.k.b((ck0.t) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ThirdPartyConnectActivity thirdPartyConnectActivity = (ThirdPartyConnectActivity) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ThirdPartyConnectActivity.a aVar4 = ThirdPartyConnectActivity.f43974c;
                if (mVar5.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    jk1.f fVar = thirdPartyConnectActivity.f43975a;
                    if (fVar == null) {
                        p005kotlin.jvm.internal.s.m("viewModel");
                        throw null;
                    }
                    p3.p1 p1VarC = s9.c.c(fVar.f99407k, mVar5);
                    Boolean boolValueOf = Boolean.valueOf(((jk1.e) p1VarC.getF182175a()).f99394h);
                    boolean zB = mVar5.B(p1VarC) | mVar5.r(thirdPartyConnectActivity);
                    Object objQ3 = mVar5.q();
                    if (zB) {
                        obj3 = objQ3;
                        ThirdPartyConnectActivity.b bVar2 = new ThirdPartyConnectActivity.b(thirdPartyConnectActivity, p1VarC, null);
                        mVar5.K(bVar2);
                        obj3 = bVar2;
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            obj3 = objQ3;
                            ThirdPartyConnectActivity.b bVar3 = new ThirdPartyConnectActivity.b(thirdPartyConnectActivity, p1VarC, null);
                            mVar5.K(bVar3);
                            obj3 = bVar3;
                        }
                    }
                    obj3 = objQ3;
                    p3.l0.e((e23.p) obj3, boolValueOf, mVar5);
                    z02.b.a(false, null, null, null, false, z3.f.c(-884350274, new ck1.b(thirdPartyConnectActivity, p1VarC, false ? 1 : 0), mVar5), mVar5, 196608, 31);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                cm.b.a aVar5 = cm.b.f27956g;
                ((cm.b) obj4).g((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.q1.b bVar4 = com.garmin.android.apps.connectmobile.q1.f41066b;
                ((com.garmin.android.apps.connectmobile.q1) obj4).u6((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 14:
                com.garmin.android.apps.connectmobile.connectiq.n nVar = (com.garmin.android.apps.connectmobile.connectiq.n) obj4;
                ((Integer) obj2).getClass();
                ((DialogInterface) obj).getClass();
                Activity activity = nVar.f31905a;
                if (activity == null) {
                    p005kotlin.jvm.internal.s.m("mActivity");
                    throw null;
                }
                activity.setResult(999);
                Activity activity2 = nVar.f31905a;
                if (activity2 != null) {
                    activity2.finish();
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("mActivity");
                throw null;
            case 15:
                ConnectIQDownloadListActivity connectIQDownloadListActivity = (ConnectIQDownloadListActivity) obj4;
                int iIntValue7 = ((Integer) obj).intValue();
                int iIntValue8 = ((Integer) obj2).intValue();
                ConnectIQDownloadListActivity.a aVar6 = ConnectIQDownloadListActivity.f31779o;
                y10.k kVarFa = connectIQDownloadListActivity.fa();
                com.garmin.android.apps.connectmobile.connectiq.l lVarDa = connectIQDownloadListActivity.da();
                LinkedHashMap<String, o10.b> linkedHashMap = kVarFa.f193914m;
                LinkedHashMap<String, o10.b> linkedHashMap2 = kVarFa.f193916o;
                lVarDa.getClass();
                ArrayList arrayList = kVarFa.f193913l;
                Object obj5 = arrayList.get(iIntValue7);
                obj5.getClass();
                o10.b bVar5 = ((com.garmin.android.apps.connectmobile.connectiq.y.a) obj5).f32092a;
                Object obj6 = arrayList.get(iIntValue8);
                obj6.getClass();
                o10.b bVar6 = ((com.garmin.android.apps.connectmobile.connectiq.y.a) obj6).f32092a;
                LinkedHashMap<String, o10.b> linkedHashMap3 = kVarFa.f193915n;
                if (linkedHashMap3.containsKey(bVar5.f())) {
                    y10.k.J4(linkedHashMap3, bVar5, bVar6);
                } else if (linkedHashMap2.containsKey(bVar5.f())) {
                    y10.k.J4(linkedHashMap2, bVar5, bVar6);
                } else if (linkedHashMap.containsKey(bVar5.f())) {
                    y10.k.J4(linkedHashMap, bVar5, bVar6);
                }
                Collections.swap(arrayList, iIntValue7, iIntValue8);
                kVarFa.f193917p.m(new y10.n0.b(p13.h0.d1(arrayList), kVarFa.G4(lVarDa), false, null, 12, null));
                com.garmin.android.apps.connectmobile.connectiq.y yVar = (com.garmin.android.apps.connectmobile.connectiq.y) new ArrayList(arrayList).get(iIntValue7);
                if ((yVar instanceof com.garmin.android.apps.connectmobile.connectiq.y.a) && iIntValue7 < arrayList.size() && iIntValue8 < arrayList.size()) {
                    kVarFa.f193919r.m(new y10.o0(iIntValue7, iIntValue8, ((com.garmin.android.apps.connectmobile.connectiq.y.a) yVar).f32092a.getName()));
                }
                return Boolean.TRUE;
            case 16:
                FitPayAddressManagementFragment fitPayAddressManagementFragment = (FitPayAddressManagementFragment) obj4;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                FitPayAddressManagementFragment.b bVar7 = FitPayAddressManagementFragment.f51413t;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                if (fitPayAddressManagementFragment.isAdded()) {
                    fitPayAddressManagementFragment.getChildFragmentManager().Z();
                }
                return Unit.INSTANCE;
            case 17:
                l20.a aVar7 = (l20.a) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97901d.f97906e;
                    l20.g gVarQ = aVar7.q();
                    String strK = gVarQ != null ? gVarQ.getProfileImageUrlSmall() : null;
                    String firstName = aVar7.getFirstName();
                    b12.k.b(null, null, f14, new b12.b(strK, null, null, firstName != null ? d53.y.q0(firstName) : null, null, 22, null), mVar6, b12.b.f14385f << 9, 19);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 18:
                com.garmin.android.apps.connectmobile.incidentdetection.c cVar2 = (com.garmin.android.apps.connectmobile.incidentdetection.c) obj4;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.incidentdetection.c.a aVar8 = com.garmin.android.apps.connectmobile.incidentdetection.c.f36851e;
                if (mVar7.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    p3.c2 c2Var = ((cq0.y) cVar2.f55121b.getValue()).f55180e;
                    String strH = cVar2.f36853d ? sn.a.h(mVar7, 2081241360, R.string.lbl_fall_detected, mVar7) : sn.a.h(mVar7, 2081328842, R.string.incident_detected_title, mVar7);
                    com.garmin.android.apps.connectmobile.incidentdetection.c.a aVar9 = com.garmin.android.apps.connectmobile.incidentdetection.c.f36851e;
                    cq0.f fVar2 = cVar2.f36852c;
                    boolean z14 = ((List) c2Var.getF182175a()).size() == 1;
                    boolean z15 = cVar2.f36853d;
                    aVar9.getClass();
                    switch (fVar2 == null ? -1 : com.garmin.android.apps.connectmobile.incidentdetection.c.a.C0657a.f36854a[fVar2.ordinal()]) {
                        case 1:
                        case 2:
                            objValueOf = Integer.valueOf(z14 ? R.string.incident_detection_cancelled_no_assistance_contact_notified_msg : R.string.incident_detection_cancelled_no_assistance_contacts_notified_msg);
                            break;
                        case 3:
                        case 4:
                            objValueOf = Integer.valueOf(z14 ? R.string.incident_detection_msg_assistance_contact_notified_okay : R.string.incident_detection_msg_assistance_contacts_notified_okay);
                            break;
                        case 5:
                        case 6:
                            objValueOf = Integer.valueOf(z15 ? R.string.lbl_fall_detection_finished : R.string.incident_detection_finished_i_am_okay_never_pressed);
                            break;
                        case 7:
                            objValueOf = Integer.valueOf(z14 ? R.string.incident_detection_unable_to_notify_assistance_contact : R.string.incident_detection_unable_to_notify_assistance_contacts);
                            break;
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(-21020822, new a51.l(strH, objValueOf, cVar2, c2Var, 24), mVar7), mVar7, 196608, 31);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 19:
                com.garmin.android.apps.connectmobile.incidentdetection.e eVar2 = (com.garmin.android.apps.connectmobile.incidentdetection.e) obj4;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.incidentdetection.e.a aVar10 = com.garmin.android.apps.connectmobile.incidentdetection.e.f36857e;
                if (mVar8.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    p3.c2 c2Var2 = ((cq0.y) eVar2.f55121b.getValue()).f55180e;
                    String strH2 = eVar2.f36859d ? sn.a.h(mVar8, 1165759935, R.string.lbl_fall_detected, mVar8) : sn.a.h(mVar8, 1165847417, R.string.incident_detected_title, mVar8);
                    if (((List) c2Var2.getF182175a()).size() == 1) {
                        i14 = 1165991102;
                        i15 = R.string.incident_detection_msg_assistance_contact_notified;
                    } else {
                        i14 = 1166111165;
                        i15 = R.string.incident_detection_msg_assistance_contacts_notified;
                    }
                    String strH3 = sn.a.h(mVar8, i14, i15, mVar8);
                    if (((List) c2Var2.getF182175a()).size() == 1) {
                        i16 = 1166277077;
                        i17 = R.string.incident_detection_msg_confirm_to_notify_assistance_contact;
                    } else {
                        i16 = 1166406068;
                        i17 = R.string.incident_detection_msg_confirm_to_notify_assistance_contacts;
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(738620359, new a42.z(eVar2, strH2, strH3, sn.a.h(mVar8, i16, i17, mVar8), c2Var2, 15), mVar8), mVar8, 196608, 31);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                cr.d0.a((er.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.training.atp.dashboard.c.a aVar11 = com.garmin.android.apps.connectmobile.training.atp.dashboard.c.f45406k;
                ((com.garmin.android.apps.connectmobile.training.atp.dashboard.c) obj4).h((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                cw1.w0.b((d6.h) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 23:
                d4.k kVar = (d4.k) obj4;
                d4.n nVar2 = (d4.n) obj;
                p3.p1 p1Var = (p3.p1) obj2;
                if (!(p1Var instanceof f4.q)) {
                    vb.h.s("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                f4.q qVar = (f4.q) p1Var;
                Object objB = kVar.b(nVar2, qVar.getF182175a());
                if (objB == null) {
                    return null;
                }
                p3 p3VarB = qVar.b();
                p3VarB.getClass();
                return new p3.c2(objB, p3VarB);
            case 24:
                e50.c cVar3 = (e50.c) obj4;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar9, cVar3.f62986h ? R.string.activity_unfavorite_icon_title : R.string.activity_favorite_icon_title);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar9), mVar9, 0, 0, 131070);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 25:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int I = d53.w.I(charSequence, (char[]) obj4, iIntValue13, false);
                if (I < 0) {
                    return null;
                }
                return new o13.p(Integer.valueOf(I), 1);
            case 26:
                ((Integer) obj2).getClass();
                d81.a.b((g81.l) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                d81.a.a((g81.x) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                d82.d.b((d82.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                dd1.b.a((fd1.d) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m1(Object obj, int i14, int i15) {
        this.f24807a = i15;
        this.f24808b = obj;
    }
}
