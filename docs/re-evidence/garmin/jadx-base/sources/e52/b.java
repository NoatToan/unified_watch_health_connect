package e52;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.m;
import bs2.nv;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.r;
import com.garmin.proto.generated.GDIHandCalibration;
import com.garmin.proto.generated.GDILiveSessionProto;
import com.garmin.proto.generated.GDISmartProto;
import e23.l;
import ew1.b2;
import ew1.d2;
import ew1.q0;
import f2.n0;
import f2.u;
import f2.v;
import g2.n1.b;
import g21.o;
import i3.mc;
import java.util.ArrayList;
import java.util.List;
import km1.a0;
import l52.i;
import l72.i3;
import lc.u0;
import m52.j;
import m52.k;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.n1;
import p3.o1;
import p3.p1;
import p5.h0;
import p5.k0;
import pt1.p;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f63067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f63068c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(i.a aVar, r0 r0Var) {
        this.f63066a = 13;
        this.f63067b = (l52.f) aVar;
        this.f63068c = r0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16, types: [l52.f, l52.i$a] */
    /* JADX WARN: Type inference failed for: r1v62, types: [T, java.lang.Object, l52.i$a] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        String string;
        z42.b bVar;
        z42.b bVar2;
        nv nvVar;
        us.a aVar;
        List<CalendarItemDTO.b> listD;
        i.a aVar2;
        Object value;
        bz.d dVar;
        Integer f22268g;
        String str;
        Integer actual;
        int i14 = this.f63066a;
        String strB = "";
        z = true;
        boolean z14 = true;
        int iIntValue = 0;
        iIntValue = 0;
        int iIntValue2 = 0;
        Integer pushesGoal = null;
        string = null;
        string = null;
        String string2 = null;
        listZ = null;
        List<? extends CalendarItemDTO.b> listZ = null;
        pushesGoal = null;
        Object obj2 = this.f63068c;
        Object obj3 = this.f63067b;
        switch (i14) {
            case 0:
                z42.g gVar = (z42.g) obj3;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                d52.e eVar = (d52.e) ((p1) obj2).getF182175a();
                Integer pushes = (gVar == null || (bVar2 = gVar.f202396a) == null) ? null : bVar2.getPushes();
                if (gVar != null && (bVar = gVar.f202396a) != null) {
                    pushesGoal = bVar.getPushesGoal();
                }
                Context context = eVar.f57568a;
                int iIntValue3 = pushes != null ? pushes.intValue() : -1;
                int iIntValue4 = pushesGoal != null ? pushesGoal.intValue() : -1;
                if (pushesGoal != null) {
                    int iIntValue5 = pushesGoal.intValue();
                    iIntValue = ((pushes != null ? pushes.intValue() : 0) * 100) / (iIntValue5 > 0 ? iIntValue5 : 1);
                }
                String strValueOf = String.valueOf(iIntValue);
                String strB2 = iIntValue3 > -1 ? d52.e.b(iIntValue3) : "";
                strB = iIntValue4 > 0 ? d52.e.b(iIntValue4) : "";
                if (strB2.length() > 0 && strB.length() > 0) {
                    string = context.getString(R.string.lbl_pushes_pie_chart_value_goal, strB2, strB, strValueOf);
                    string.getClass();
                } else if (strB2.length() > 0 && strB.length() == 0) {
                    string = context.getString(R.string.lbl_pushes_pie_chart_value_only, strB2, strValueOf);
                    string.getClass();
                } else if (strB2.length() != 0 || strB.length() <= 0) {
                    string = context.getString(R.string.txt_empty_page_no_data);
                    string.getClass();
                } else {
                    string = context.getString(R.string.lbl_pushes_pie_chart_value_goal, "0", strB, strValueOf);
                    string.getClass();
                }
                h0.n(k0Var, string);
                return Unit.INSTANCE;
            case 1:
                ((com.garmin.android.apps.connectmobile.workouts.data.model.h0) obj).getClass();
                ((l) obj3).invoke(Integer.valueOf(((com.garmin.android.apps.connectmobile.workouts.data.model.h0) obj2).getSegmentOrder()));
                return Unit.INSTANCE;
            case 2:
                e13.a.C1312a c1312a = (e13.a.C1312a) obj3;
                com.garmin.android.apps.connectmobile.handalignment.f fVar = (com.garmin.android.apps.connectmobile.handalignment.f) obj2;
                GDIHandCalibration.RotateNotification.Status status = (GDIHandCalibration.RotateNotification.Status) obj;
                com.garmin.android.apps.connectmobile.handalignment.f.a aVar3 = com.garmin.android.apps.connectmobile.handalignment.f.f36613h;
                if (status == GDIHandCalibration.RotateNotification.Status.SUCCESS) {
                    c1312a.c(Boolean.TRUE);
                    fVar.d(com.garmin.android.apps.connectmobile.handalignment.f.b.Camera);
                } else {
                    c1312a.c(Boolean.FALSE);
                    fVar.d(com.garmin.android.apps.connectmobile.handalignment.f.b.None);
                    xy2.b.D("HandAlignmentError", fVar.f36616b);
                }
                return Unit.INSTANCE;
            case 3:
                ud.a aVar4 = (ud.a) obj;
                es2.f.b bVar3 = es2.f.f65227d;
                aVar4.getClass();
                ((es2.f) obj3).f65229b.d(aVar4, (fs2.a) obj2);
                return Unit.INSTANCE;
            case 4:
                zs.c cVar = (zs.c) obj3;
                e23.a aVar5 = (e23.a) obj2;
                vs.e eVar2 = (vs.e) obj;
                eVar2.getClass();
                cVar.getClass();
                vs.f fVar2 = eVar2.f179706a;
                if (fVar2 != null && (nvVar = fVar2.f179714d) != null && (aVar = cVar.f206790f) != null) {
                    short s8 = nvVar.f20362a;
                    short s14 = fVar2.f179715e.f20563a;
                    a2 a2Var = a2.ACTIVITY_RECORDING;
                    rs2.c cVar2 = aVar.f172337e;
                    if (cVar2 == null) {
                        s.m("deviceInfo");
                        throw null;
                    }
                    String str2 = "selectActivityRecordingSport device unit id" + cVar2.getF92746j() + ", sport type " + ((int) s8);
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "ActivityRecordingProtobufDataHandler", str2);
                    GDILiveSessionProto.SportProfile.Builder builderNewBuilder = GDILiveSessionProto.SportProfile.newBuilder();
                    builderNewBuilder.setSportFitType(s8);
                    builderNewBuilder.setSportFitSubType(s14);
                    Unit unit = Unit.INSTANCE;
                    GDISmartProto.Smart smartC = us.a.c(aVar, null, builderNewBuilder.build(), 1);
                    if (smartC != null) {
                        aVar.d(smartC);
                    }
                }
                cVar.f206793i.k(null, vs.e.b(eVar2, true));
                aVar5.invoke();
                return Unit.INSTANCE;
            case 5:
                p pVar = (p) obj3;
                e23.p pVar2 = (e23.p) obj2;
                ((i3) obj).getClass();
                if (pVar != null) {
                    pVar2.invoke(Long.valueOf(pVar.f140929a), Long.valueOf(pVar.f140930b));
                }
                return Unit.INSTANCE;
            case 6:
                Long l14 = (Long) obj;
                ((o1) obj3).k(l14.longValue());
                ((l) obj2).invoke(l14);
                return Unit.INSTANCE;
            case 7:
                int iIntValue6 = ((Integer) obj).intValue();
                q0.a aVar6 = q0.f66666g;
                ((n1) obj2).t(iIntValue6);
                ((q0) obj3).w6().F1 = iIntValue6;
                return Unit.INSTANCE;
            case 8:
                d2 d2Var = (d2) obj3;
                ComposeView composeView = (ComposeView) obj2;
                g3 g3Var = (g3) obj;
                d2.a aVar7 = d2.f66384d;
                fw.p pVar3 = g3Var != null ? g3Var.f35300a : null;
                int i15 = pVar3 == null ? -1 : d2.b.f66387a[pVar3.ordinal()];
                if (i15 == 1) {
                    g22.e.l(d2Var);
                } else if (i15 == 2) {
                    g22.e.f(d2Var);
                    jv1.l lVar = (jv1.l) g3Var.f35301b;
                    if (lVar != null) {
                        composeView.setContent(new z3.e(-626948120, true, new b2(lVar, d2Var, iIntValue)));
                    }
                } else if (i15 == 3) {
                    g22.e.f(d2Var);
                    composeView.setContent(new z3.e(1373809504, true, new dh1.a(d2Var, 19)));
                }
                return Unit.INSTANCE;
            case 9:
                GCMCalendarActivity gCMCalendarActivity = (GCMCalendarActivity) obj3;
                DateTime dateTime = (DateTime) obj2;
                g3 g3Var2 = (g3) obj;
                GCMCalendarActivity.a aVar8 = GCMCalendarActivity.F;
                int i16 = GCMCalendarActivity.b.f31088a[g3Var2.f35300a.ordinal()];
                if (i16 == 1) {
                    gCMCalendarActivity.showProgressOverlay();
                } else if (i16 == 2) {
                    gCMCalendarActivity.hideProgressOverlay();
                    gCMCalendarActivity.f31081r = (CalendarDTO) g3Var2.f35301b;
                    gCMCalendarActivity.qa(dateTime);
                    com.garmin.android.apps.connectmobile.calendar.presentation.f fVar3 = gCMCalendarActivity.f31070g;
                    if (fVar3 != null) {
                        com.garmin.android.apps.connectmobile.calendar.presentation.b bVar4 = gCMCalendarActivity.f31069f;
                        if (bVar4 != null && (listD = bVar4.d()) != null) {
                            listZ = p13.h0.Z(listD);
                        }
                        if (listZ == null) {
                            listZ = j0.f134944a;
                        }
                        listZ.getClass();
                        com.garmin.android.apps.connectmobile.calendar.presentation.d dVarV6 = fVar3.v6(fVar3.f31113h, fVar3.f31114i);
                        if (dVarV6 != null) {
                            dVarV6.f31168q = listZ;
                        }
                    }
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    gCMCalendarActivity.hideProgressOverlay();
                }
                return Unit.INSTANCE;
            case 10:
                v vVar = (v) obj2;
                n0.c cVarB = ((n0) obj3).b(((Integer) obj).intValue());
                int i17 = cVarB.f68248a;
                List<f2.c> list = cVarB.f68249b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i18 = 0;
                for (int i19 = 0; i19 < size; i19++) {
                    int i24 = (int) list.get(i19).f68178a;
                    arrayList.add(new o13.p(Integer.valueOf(i17), g6.a.a(vVar.a(i18, i24))));
                    i17++;
                    i18 += i24;
                }
                return arrayList;
            case 11:
                v vVar2 = (v) obj3;
                u uVar = (u) obj2;
                int iIntValue7 = ((Integer) obj).intValue();
                n0 n0Var = vVar2.f68196f;
                int i25 = n0Var.f68243i;
                int iE = n0Var.e(iIntValue7);
                return uVar.d(iIntValue7, 0, iE, uVar.f68177d, vVar2.a(0, iE));
            case 12:
                e23.p pVar4 = (e23.p) obj3;
                o oVar = (o) obj2;
                b11.i iVar = (b11.i) obj;
                iVar.getClass();
                if (pVar4 != null) {
                    pVar4.invoke(iVar, oVar);
                }
                return Unit.INSTANCE;
            case 13:
                ?? r14 = (l52.f) obj3;
                r0 r0Var = (r0) obj2;
                ?? r15 = (i.a) obj;
                j jVar = r.f49273q;
                r15.getClass();
                if (r14.d(r15) || (aVar2 = (i.a) r0Var.f105810a) == null || (aVar2 != r14 && !r14.d(aVar2))) {
                    z14 = false;
                }
                r0Var.f105810a = r15;
                return Boolean.valueOf(z14);
            case 14:
                r rVar = (r) obj3;
                k kVar = (k) obj2;
                i.a aVar9 = (i.a) obj;
                j jVar2 = r.f49273q;
                aVar9.getClass();
                if (aVar9.k()) {
                    rVar.getClass();
                    r.O4(kVar, aVar9);
                }
                return Unit.INSTANCE;
            case 15:
                fb0.a aVar10 = (fb0.a) obj2;
                int iIntValue8 = ((Integer) obj).intValue();
                int i26 = fb0.a.f70169g;
                Integer num = (Integer) p13.h0.e0(iIntValue8, (i53.f) obj3);
                if (num == null) {
                    return Unit.INSTANCE;
                }
                int iIntValue9 = num.intValue();
                r53.b2 b2Var = aVar10.f70174e;
                if (b2Var.f150540a.getValue() instanceof gb0.a.c) {
                    Object value2 = b2Var.f150540a.getValue();
                    value2.getClass();
                    gb0.a.c cVar3 = (gb0.a.c) value2;
                    int i27 = iIntValue9 == 8 ? 4 : 11;
                    int i28 = cVar3.f76640c;
                    if (i28 <= i27) {
                        i27 = i28;
                    }
                    p2 p2Var = aVar10.f70173d;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, new gb0.a.c(iIntValue9, i27)));
                }
                return Unit.INSTANCE;
            case 16:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                String string3 = ((Context) obj3).getString(((gb0.b) obj2).f76644c);
                string3.getClass();
                h0.n(k0Var2, string3);
                return Unit.INSTANCE;
            case 17:
                com.garmin.android.apps.connectmobile.devices.targetedselection.j jVar3 = (com.garmin.android.apps.connectmobile.devices.targetedselection.j) obj3;
                com.garmin.android.apps.connectmobile.devices.targetedselection.i iVar2 = (com.garmin.android.apps.connectmobile.devices.targetedselection.i) obj2;
                com.garmin.android.apps.connectmobile.devices.targetedselection.p pVar5 = (com.garmin.android.apps.connectmobile.devices.targetedselection.p) obj;
                com.garmin.android.apps.connectmobile.devices.targetedselection.j.a aVar11 = com.garmin.android.apps.connectmobile.devices.targetedselection.j.f34605k;
                boolean z15 = pVar5.f34681a;
                List<com.garmin.android.apps.connectmobile.devices.targetedselection.l> list2 = pVar5.f34682b;
                com.garmin.android.apps.connectmobile.devices.targetedselection.l.a aVar12 = pVar5.f34685e;
                if (z15) {
                    jVar3.v6().setVisibility(8);
                    g22.e.l(jVar3);
                } else {
                    if (pVar5.f34684d) {
                        if (aVar12 != null && (dVar = aVar12.f34621j) != null && (f22268g = dVar.getF22268g()) != null) {
                            int iIntValue10 = f22268g.intValue();
                            String str3 = aVar12.f34613b;
                            List<String> listA = dVar.a();
                            String string4 = jVar3.requireContext().getString(R.string.lbl_or);
                            string4.getClass();
                            Integer numValueOf = listA != null ? Integer.valueOf(listA.size()) : null;
                            if (numValueOf != null && numValueOf.intValue() == 1) {
                                str = listA.get(0);
                            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                                str = ((Object) listA.get(0)) + StringUtils.SPACE + string4 + StringUtils.SPACE + ((Object) listA.get(1));
                            } else {
                                if (numValueOf != null && numValueOf.intValue() == 3) {
                                    str = ((Object) listA.get(0)) + ", " + ((Object) listA.get(1)) + StringUtils.SPACE + string4 + StringUtils.SPACE + ((Object) listA.get(2));
                                }
                                string2 = jVar3.getString(iIntValue10, str3, strB);
                            }
                            strB = hb.a.i(str);
                            string2 = jVar3.getString(iIntValue10, str3, strB);
                        }
                        boolean z16 = aVar12 != null && aVar12.f34620i;
                        m mVarRequireActivity = jVar3.requireActivity();
                        Intent intent = new Intent();
                        intent.putExtra("KEY_SNACKBAR_MESSAGE", string2);
                        intent.putExtra("extra_start_workout", z16);
                        Unit unit2 = Unit.INSTANCE;
                        mVarRequireActivity.setResult(-1, intent);
                        mVarRequireActivity.finish();
                    } else {
                        Integer num2 = pVar5.f34683c;
                        if (num2 != null) {
                            String string5 = jVar3.getString(num2.intValue(), aVar12 != null ? aVar12.f34613b : null);
                            string5.getClass();
                            jVar3.E6(string5);
                        }
                        if (list2.isEmpty()) {
                            jVar3.v6().setVisibility(0);
                        } else {
                            iVar2.t(list2);
                            jVar3.v6().setVisibility(8);
                        }
                    }
                    g22.e.f(jVar3);
                }
                return Unit.INSTANCE;
            case 18:
                com.garmin.android.apps.connectmobile.devices.targetedselection.k kVar2 = (com.garmin.android.apps.connectmobile.devices.targetedselection.k) obj3;
                com.garmin.android.apps.connectmobile.devices.targetedselection.h hVar = (com.garmin.android.apps.connectmobile.devices.targetedselection.h) obj2;
                com.garmin.android.apps.connectmobile.devices.targetedselection.p pVar6 = (com.garmin.android.apps.connectmobile.devices.targetedselection.p) obj;
                com.garmin.android.apps.connectmobile.devices.targetedselection.k.a aVar13 = com.garmin.android.apps.connectmobile.devices.targetedselection.k.f34608l;
                boolean z17 = pVar6.f34681a;
                List<com.garmin.android.apps.connectmobile.devices.targetedselection.l> list3 = pVar6.f34682b;
                com.garmin.android.apps.connectmobile.devices.targetedselection.l.a aVar14 = pVar6.f34685e;
                if (z17) {
                    g22.e.l(kVar2);
                } else {
                    if (pVar6.f34684d) {
                        boolean z18 = aVar14 != null && aVar14.f34620i;
                        m mVarRequireActivity2 = kVar2.requireActivity();
                        Intent intent2 = new Intent();
                        intent2.putExtra("extra_start_workout", z18);
                        Unit unit3 = Unit.INSTANCE;
                        mVarRequireActivity2.setResult(-1, intent2);
                        mVarRequireActivity2.finish();
                    } else {
                        kVar2.f34609j = aVar14 != null;
                        Integer num3 = pVar6.f34683c;
                        if (num3 != null) {
                            String string6 = kVar2.getString(num3.intValue(), aVar14 != null ? aVar14.f34613b : null);
                            string6.getClass();
                            kVar2.E6(string6);
                        }
                        if (kVar2.f34609j) {
                            kVar2.requireActivity().invalidateOptionsMenu();
                        }
                        if (list3.isEmpty()) {
                            kVar2.v6().setVisibility(0);
                        } else {
                            hVar.t(list3);
                            kVar2.v6().setVisibility(8);
                        }
                    }
                    g22.e.f(kVar2);
                }
                return Unit.INSTANCE;
            case 19:
                g80.g gVar2 = (g80.g) obj3;
                ff2.i iVar3 = (ff2.i) obj2;
                ff2.f fVar4 = (ff2.f) obj;
                if (fVar4 != null) {
                    hf2.a.C1650a c1650a = hf2.a.f83640a;
                    Context context2 = iVar3.f71157a;
                    c1650a.getClass();
                    List<ff2.a> listA2 = fVar4.a();
                    if (listA2 == null || !listA2.isEmpty()) {
                        for (ff2.a aVar15 : listA2) {
                            hf2.a.C1650a c1650a2 = hf2.a.f83640a;
                            long campaignId = aVar15.getCampaignId();
                            c1650a2.getClass();
                            if (!hf2.a.C1650a.a(context2, campaignId)) {
                                iVar3.b().debug("All images for all campaigns are not yet downloaded");
                                gVar2.invoke(null);
                            }
                        }
                        iVar3.b().debug("All images for all campaigns are downloaded");
                        gVar2.invoke(fVar4.a());
                    } else {
                        iVar3.b().debug("All images for all campaigns are downloaded");
                        gVar2.invoke(fVar4.a());
                    }
                } else {
                    gVar2.invoke(null);
                }
                return Unit.INSTANCE;
            case 20:
                a0 a0Var = (a0) obj3;
                b10.c cVar4 = (b10.c) obj2;
                k0 k0Var3 = (k0) obj;
                k0Var3.getClass();
                if (a0Var != null && (actual = a0Var.getActual()) != null) {
                    iIntValue2 = actual.intValue();
                }
                h0.n(k0Var3, cVar4.b(iIntValue2 * 60));
                return Unit.INSTANCE;
            case 21:
                ActivitiesListActivity activitiesListActivity = (ActivitiesListActivity) obj3;
                zc.d dVar2 = (zc.d) obj2;
                f.a aVar16 = (f.a) obj;
                ActivitiesListActivity.a aVar17 = ActivitiesListActivity.f29099d;
                aVar16.getClass();
                if (aVar16.f67585a == -1) {
                    activitiesListActivity.setResult(-1);
                    Intent intent3 = aVar16.f67586b;
                    if (intent3 != null) {
                        l2.f37135b.getClass();
                        Bundle bundleA = l2.a.a(intent3);
                        if (bundleA != null ? bundleA.getBoolean("GCM_extra_activity_updated") : false) {
                            activitiesListActivity.da().x4();
                            dVar2.e();
                        }
                    }
                }
                return Unit.INSTANCE;
            case 22:
                g3<wg0.a> g3Var3 = (g3) obj;
                ConversationActivity.a aVar18 = ConversationActivity.f44530c;
                g3Var3.getClass();
                ((ConversationActivity) obj3).ea((String) obj2, g3Var3);
                return Unit.INSTANCE;
            case 23:
                l lVar2 = (l) obj2;
                if (!((mc) obj3).e()) {
                    lVar2.invoke(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 24:
                ud.a aVar19 = (ud.a) obj;
                fu0.b.C1485b c1485b = fu0.b.f73492d;
                aVar19.getClass();
                ((fu0.b) obj3).f73494b.c(aVar19, (ArrayList) obj2);
                return Unit.INSTANCE;
            case 25:
                ud.a aVar20 = (ud.a) obj;
                fu0.d.b bVar5 = fu0.d.f73497d;
                aVar20.getClass();
                ((fu0.d) obj3).f73499b.d(aVar20, (gu0.b) obj2);
                return Unit.INSTANCE;
            case 26:
                ud.a aVar21 = (ud.a) obj;
                fu0.f.b bVar6 = fu0.f.f73502c;
                aVar21.getClass();
                ((fu0.f) obj3).f73504b.d(aVar21, (gu0.c) obj2);
                return Unit.INSTANCE;
            case 27:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f fVar5 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f) obj2;
                long jLongValue = ((Long) obj).longValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f.a aVar22 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f.f46045f;
                com.garmin.android.apps.connectmobile.workouts.data.model.c cVarB2 = com.garmin.android.apps.connectmobile.workouts.data.model.c.b((com.garmin.android.apps.connectmobile.workouts.data.model.c) obj3, Integer.valueOf((int) jLongValue));
                fz1.k kVarV6 = fVar5.v6();
                fg0.k kVarX4 = fVar5.v6().x4();
                mg0.b.d(kVarX4, cVarB2);
                kVarV6.f74004c = kVarX4;
                fVar5.w6();
                return Unit.INSTANCE;
            case 28:
                g2.c.a aVar23 = (g2.c.a) obj3;
                g2.c cVar5 = (g2.c) obj2;
                q5.g.a aVar24 = aVar23.f75065a;
                if (aVar24 != null) {
                    aVar24.b();
                }
                aVar23.f75065a = null;
                o53.s sVar = cVar5.f75064b;
                if (sVar != null) {
                    sVar.g0(Unit.INSTANCE);
                }
                cVar5.f75064b = null;
                return Unit.INSTANCE;
            default:
                g2.n1 n1Var = (g2.n1) obj3;
                n1Var.f75187c.i(obj2);
                return n1Var.new b(obj2);
        }
    }

    public /* synthetic */ b(int i14, Object obj, Object obj2) {
        this.f63066a = i14;
        this.f63067b = obj;
        this.f63068c = obj2;
    }
}
