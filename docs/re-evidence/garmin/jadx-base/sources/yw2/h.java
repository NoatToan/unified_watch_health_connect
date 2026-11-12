package yw2;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.m;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import b5.a0;
import c80.n;
import c80.o0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activityrecording.presentation.ActivityRecordingActivity;
import com.garmin.android.apps.connectmobile.consent.PopularityRoutingConsentActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.nutrition.presentation.myfitnesspal.screen.CaloriesLinkAccountsActivity;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.feature.garminpay.ui.addcard.SelectOperatorActivity;
import com.garmin.feature.garminpay.ui.addcard.SelectProductActivity;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.google.gson.Gson;
import d53.u;
import d53.w;
import e23.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p5.h0;
import p5.k0;
import q92.v;
import r53.p2;
import z10.j2;
import z10.n1;
import z12.o;
import zb0.c1;
import zf0.n0;
import zo.q;
import zo0.z;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f200001b;

    public /* synthetic */ h(Object obj, int i14) {
        this.f200000a = i14;
        this.f200001b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v173, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, o13.l] */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        int i14;
        n1 n1Var;
        int i15;
        be2.f fVar;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        Object value;
        ys.b bVar;
        vs.a aVar;
        int i16 = this.f200000a;
        boolean z14 = false;
        Object obj2 = this.f200001b;
        switch (i16) {
            case 0:
                com.garmin.realtimesettings.app.presentationlayer.b bVar2 = (com.garmin.realtimesettings.app.presentationlayer.b) obj2;
                if (((Boolean) obj).booleanValue()) {
                    bVar2.e();
                } else {
                    cx2.h hVar = bVar2.f52626f;
                    Logger logger = cx2.h.f56678c;
                    hVar.d(null, "App did not have fall-back composition with ID 36356");
                    bVar2.g();
                }
                return Unit.INSTANCE;
            case 1:
                j2 j2Var = (j2) obj2;
                v2.b bVar3 = (v2.b) obj;
                if (bVar3 != null) {
                    ArrayList<d20.b> arrayList = j2Var.f201071c;
                    arrayList.clear();
                    arrayList.addAll((Collection) bVar3.f47386a);
                    if (arrayList.isEmpty()) {
                        g22.e.c(j2Var);
                    } else {
                        m activity = j2Var.getActivity();
                        if (activity != null) {
                            i14 = 0;
                            n1Var = new n1(activity, R.layout.rectangle_border_text_view, (d20.b[]) arrayList.toArray(new d20.b[0]));
                        } else {
                            i14 = 0;
                            n1Var = null;
                        }
                        if (n1Var != null) {
                            n1Var.setDropDownViewResource(R.layout.spinner_dropdown_item_layout);
                        }
                        Spinner spinner = j2Var.f201072d;
                        if (spinner == null) {
                            s.m("spinner");
                            throw null;
                        }
                        spinner.setAdapter((SpinnerAdapter) n1Var);
                        Spinner spinner2 = j2Var.f201072d;
                        if (spinner2 == null) {
                            s.m("spinner");
                            throw null;
                        }
                        if (j2Var.f201073e != null) {
                            int size = arrayList.size();
                            i15 = i14;
                            while (true) {
                                if (i15 >= size) {
                                    i15 = i14;
                                } else if (!TextUtils.equals(j2Var.f201073e, arrayList.get(i15).getTwoCharacterCode())) {
                                    i15++;
                                }
                            }
                        } else {
                            i15 = i14;
                        }
                        spinner2.setSelection(i15);
                    }
                } else {
                    j2.a aVar2 = j2.f201069f;
                    g22.e.a(j2Var, null);
                }
                return Unit.INSTANCE;
            case 2:
                PopularityRoutingConsentActivity popularityRoutingConsentActivity = (PopularityRoutingConsentActivity) obj2;
                v vVar = (v) obj;
                PopularityRoutingConsentActivity.a aVar3 = PopularityRoutingConsentActivity.f32209d;
                popularityRoutingConsentActivity.hideProgressOverlay();
                if (vVar != null) {
                    popularityRoutingConsentActivity.f32210a = vVar.f143784b;
                    GCMComplexOneLineButton gCMComplexOneLineButton = popularityRoutingConsentActivity.f32211b;
                    if (gCMComplexOneLineButton == null) {
                        s.m("mConsentToggle");
                        throw null;
                    }
                    gCMComplexOneLineButton.i(vVar.b());
                } else {
                    popularityRoutingConsentActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            case 3:
                CaloriesLinkAccountsActivity caloriesLinkAccountsActivity = (CaloriesLinkAccountsActivity) obj2;
                v vVar2 = (v) obj;
                CaloriesLinkAccountsActivity.a aVar4 = CaloriesLinkAccountsActivity.f39595i;
                caloriesLinkAccountsActivity.hideProgressOverlay();
                if (vVar2 != null) {
                    i2.a.c(i2.f36769a, "CaloriesLinkAccountsActivity", "Consent grant SUCCESS (status = " + vVar2 + ")");
                    vz2.i iVar = caloriesLinkAccountsActivity.f39597b;
                    if (iVar != null) {
                        iVar.a(caloriesLinkAccountsActivity, vz2.k.f180958a, vz2.j.f180954a, caloriesLinkAccountsActivity.f39598c);
                    }
                } else {
                    i2.a.c(i2.f36769a, "CaloriesLinkAccountsActivity", "Consent grant ERROR");
                    caloriesLinkAccountsActivity.displayFailedMessage();
                }
                return Unit.INSTANCE;
            case 4:
                Context context = (Context) obj;
                o oVar = o.f201454a;
                context.getClass();
                ((o0) obj2).f25518n.invoke(context);
                return Unit.INSTANCE;
            case 5:
                a0 a0Var = (a0) obj;
                if (((z2.l) obj2).e(a0Var.f15750c)) {
                    a0Var.a();
                }
                return Unit.INSTANCE;
            case 6:
                n nVar = (n) obj;
                int i17 = z70.s.f202859d;
                nVar.getClass();
                return Boolean.valueOf(s.g(nVar.f25464a, ((n) obj2).f25464a));
            case 7:
                za0.i iVar2 = (za0.i) obj2;
                ((f.a) obj).getClass();
                ge1.b.T(v1.a(iVar2), null, null, new za0.j(iVar2, null), 3);
                return Unit.INSTANCE;
            case 8:
                za1.f fVar2 = (za1.f) obj2;
                Highlight[] highlightArr = (Highlight[]) obj;
                int i18 = za1.b.f203281e;
                highlightArr.getClass();
                int length = highlightArr.length;
                if (length != 1) {
                    return length != 2 ? new Entry() : new Entry();
                }
                return fVar2.d(highlightArr[0]);
            case 9:
                String str = (String) obj;
                int i19 = c1.f203441z;
                str.getClass();
                ((c1) obj2).y6().y4(str);
                return Unit.INSTANCE;
            case 10:
                zd2.e eVar = (zd2.e) obj2;
                ud.a aVar5 = (ud.a) obj;
                zd2.e.b bVar4 = zd2.e.f204232d;
                aVar5.getClass();
                ud.c cVarM0 = aVar5.M0("SELECT * FROM general_settings LIMIT 1");
                try {
                    int iB = ge1.b.B(cVarM0, "device_settings");
                    int iB2 = ge1.b.B(cVarM0, "email_enabled");
                    int iB3 = ge1.b.B(cVarM0, "extend_live_track");
                    int iB4 = ge1.b.B(cVarM0, "group_track_all_connections");
                    int iB5 = ge1.b.B(cVarM0, "group_track_enabled");
                    int iB6 = ge1.b.B(cVarM0, "post_track_point_frequency_seconds");
                    int iB7 = ge1.b.B(cVarM0, "profile_settings");
                    int iB8 = ge1.b.B(cVarM0, "uid");
                    if (cVarM0.J0()) {
                        String strM1 = cVarM0.isNull(iB) ? null : cVarM0.M1(iB);
                        eVar.f204235c.getClass();
                        Map map = (Map) new Gson().fromJson(strM1, new be2.a().getType());
                        Integer numValueOf = cVarM0.isNull(iB2) ? null : Integer.valueOf((int) cVarM0.getLong(iB2));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        Integer numValueOf2 = cVarM0.isNull(iB3) ? null : Integer.valueOf((int) cVarM0.getLong(iB3));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        Integer numValueOf3 = cVarM0.isNull(iB4) ? null : Integer.valueOf((int) cVarM0.getLong(iB4));
                        if (numValueOf3 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        Integer numValueOf4 = cVarM0.isNull(iB5) ? null : Integer.valueOf((int) cVarM0.getLong(iB5));
                        if (numValueOf4 != null) {
                            boolValueOf4 = Boolean.valueOf(numValueOf4.intValue() != 0);
                        } else {
                            boolValueOf4 = null;
                        }
                        Integer numValueOf5 = cVarM0.isNull(iB6) ? null : Integer.valueOf((int) cVarM0.getLong(iB6));
                        fVar = new be2.f(map, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, numValueOf5 != null ? Period.seconds(numValueOf5.intValue()) : null, (be2.f.b) new Gson().fromJson(cVarM0.isNull(iB7) ? null : cVarM0.M1(iB7), new be2.b().getType()));
                        fVar.f17758h = (int) cVarM0.getLong(iB8);
                        break;
                    } else {
                        fVar = null;
                    }
                    return fVar;
                } finally {
                    cVarM0.close();
                }
            case 11:
                zd2.h hVar2 = (zd2.h) obj2;
                ud.a aVar6 = (ud.a) obj;
                zd2.h.c cVar = zd2.h.f204240e;
                aVar6.getClass();
                ud.c cVarM1 = aVar6.M0("SELECT * FROM session_info");
                try {
                    int iB9 = ge1.b.B(cVarM1, "device_unit_id");
                    int iB10 = ge1.b.B(cVarM1, "name");
                    int iB11 = ge1.b.B(cVarM1, "publisher_id");
                    int iB12 = ge1.b.B(cVarM1, "publisher_type");
                    int iB13 = ge1.b.B(cVarM1, "device_driven");
                    int iB14 = ge1.b.B(cVarM1, "should_stop_on_device");
                    int iB15 = ge1.b.B(cVarM1, "group_track_session_id");
                    int iB16 = ge1.b.B(cVarM1, "activity_type");
                    int iB17 = ge1.b.B(cVarM1, "activity_created_time");
                    int iB18 = ge1.b.B(cVarM1, "sharing_errors");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarM1.J0()) {
                        long j8 = cVarM1.getLong(iB9);
                        String strM2 = cVarM1.M1(iB10);
                        String strM3 = cVarM1.M1(iB11);
                        String strM4 = cVarM1.M1(iB12);
                        boolean z15 = ((int) cVarM1.getLong(iB13)) != 0;
                        boolean z16 = ((int) cVarM1.getLong(iB14)) != 0;
                        String strM5 = cVarM1.isNull(iB15) ? null : cVarM1.M1(iB15);
                        String strM6 = cVarM1.isNull(iB16) ? null : cVarM1.M1(iB16);
                        Long lValueOf = cVarM1.isNull(iB17) ? null : Long.valueOf(cVarM1.getLong(iB17));
                        String strM7 = cVarM1.isNull(iB18) ? null : cVarM1.M1(iB18);
                        hVar2.f204243c.getClass();
                        int i24 = iB9;
                        arrayList2.add(new be2.g(j8, strM2, strM3, strM4, z15, z16, strM5, strM6, lValueOf, (List) new Gson().fromJson(strM7, new be2.c().getType())));
                        iB9 = i24;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarM1.close();
                }
            case 12:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c cVar2 = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c) obj2;
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c.f43896j;
                int i25 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.c.b.f43905a[g3Var.f35300a.ordinal()];
                if (i25 == 1) {
                    g22.e.f(cVar2);
                    yj1.l lVar = (yj1.l) g3Var.f35301b;
                    if ((lVar != null ? lVar.f197561c : null) != null) {
                        String str2 = lVar.f197561c;
                        if (str2 == null || !(!w.J(str2))) {
                            View view2 = cVar2.f43898c;
                            if (view2 == null) {
                                s.m("addNotesOption");
                                throw null;
                            }
                            view2.setVisibility(0);
                            View view3 = cVar2.f43899d;
                            if (view3 == null) {
                                s.m("displayNotesLayout");
                                throw null;
                            }
                            view3.setVisibility(8);
                        } else {
                            MultiLineImeEditText multiLineImeEditText = cVar2.f43901f;
                            if (multiLineImeEditText == null) {
                                s.m("notesEditText");
                                throw null;
                            }
                            multiLineImeEditText.setText(Editable.Factory.getInstance().newEditable(str2));
                            View view4 = cVar2.f43899d;
                            if (view4 == null) {
                                s.m("displayNotesLayout");
                                throw null;
                            }
                            view4.setVisibility(0);
                            View view5 = cVar2.f43898c;
                            if (view5 == null) {
                                s.m("addNotesOption");
                                throw null;
                            }
                            view5.setVisibility(8);
                            View view6 = cVar2.f43903h;
                            if (view6 == null) {
                                s.m("notesTextClearButton");
                                throw null;
                            }
                            view6.setVisibility(8);
                        }
                    }
                    cVar2.v6();
                } else if (i25 == 2) {
                    g22.e.l(cVar2);
                } else {
                    if (i25 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(cVar2);
                    g22.e.c(cVar2);
                }
                return Unit.INSTANCE;
            case 13:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e eVar2 = (com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e) obj2;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a aVar8 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d;
                int i26 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.b.f43916a[((g3) obj).f35300a.ordinal()];
                if (i26 == 1) {
                    g22.e.f(eVar2);
                } else if (i26 == 2) {
                    g22.e.l(eVar2);
                } else {
                    if (i26 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(eVar2);
                    g22.e.c(eVar2);
                }
                return Unit.INSTANCE;
            case 14:
                double dDoubleValue = ((Double) obj).doubleValue();
                com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h.a aVar9 = com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h.f29360p;
                i2.a aVar10 = i2.f36769a;
                aVar10.getClass();
                i2.a.a(a2.ACTIVITIES, "Selected distance: " + dDoubleValue);
                ((com.garmin.android.apps.connectmobile.activities.multisport.advancededit.ui.h) obj2).K6((int) dDoubleValue);
                return Unit.INSTANCE;
            case 15:
                q qVar = (q) obj2;
                double dDoubleValue2 = ((Double) obj).doubleValue();
                q.a aVar11 = q.f206067k;
                i2.a aVar12 = i2.f36769a;
                aVar12.getClass();
                i2.a.a(a2.ACTIVITIES, "Selected distance: " + dDoubleValue2);
                qVar.E6().B4(dDoubleValue2, qVar.f206024g);
                return Unit.INSTANCE;
            case 16:
                DateTime dateTime = (DateTime) obj;
                int i27 = z.f206208d;
                dateTime.getClass();
                long jL3 = ((z) obj2).f206210b.l3("scheduled_maintenance_dialog_shown");
                i2.a aVar13 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar13.getClass();
                i2.a.b(a2Var, "ScheduledServerMaintenanceDialogHandler", "wasDialogShown dialogShownTimestamp[" + jL3 + "] startDateTime[" + dateTime + "]");
                if (jL3 > 0 && jL3 > dateTime.minusHours(24).getMillis()) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 17:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.n(k0Var, u.v(u.v(((s5.c) obj2).f157138b, "<link>", "", false), "</link>", "", false));
                return Unit.INSTANCE;
            case 18:
                com.garmin.feature.garminpay.ui.addcard.b.c cVar3 = (com.garmin.feature.garminpay.ui.addcard.b.c) obj;
                cVar3.getClass();
                hn2.c cVar4 = ((com.garmin.feature.garminpay.ui.addcard.a) obj2).f51835a;
                if (cVar3 instanceof com.garmin.feature.garminpay.ui.addcard.b.c.C1080b) {
                    com.garmin.feature.garminpay.ui.addcard.c.b(cVar4, ar2.a.b.C0176b.f12566a);
                    return Unit.INSTANCE;
                }
                u0.r();
                return null;
            case 19:
                com.garmin.feature.garminpay.ui.addcard.b.c cVar5 = (com.garmin.feature.garminpay.ui.addcard.b.c) obj;
                SelectOperatorActivity.a aVar14 = SelectOperatorActivity.f51812i;
                cVar5.getClass();
                ((ar2.e) ((SelectOperatorActivity) obj2).f51813g.getValue()).z4(cVar5);
                return Unit.INSTANCE;
            case 20:
                com.garmin.feature.garminpay.ui.addcard.b.c cVar6 = (com.garmin.feature.garminpay.ui.addcard.b.c) obj;
                SelectProductActivity.a aVar15 = SelectProductActivity.f51824i;
                cVar6.getClass();
                ((ar2.g) ((SelectProductActivity) obj2).f51825g.getValue()).z4(cVar6);
                return Unit.INSTANCE;
            case 21:
                ActivityRecordingActivity activityRecordingActivity = (ActivityRecordingActivity) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ActivityRecordingActivity.a aVar16 = ActivityRecordingActivity.f30163b;
                if (zBooleanValue) {
                    zs.c cVar7 = (zs.c) activityRecordingActivity.f30164a.getValue();
                    p2 p2Var = cVar7.f206791g;
                    do {
                        value = p2Var.getValue();
                        bVar = (ys.b) p2Var.getValue();
                        int i28 = zs.c.f206784l;
                        bVar.getClass();
                        aVar = bVar.f199162d;
                    } while (!p2Var.b(value, ys.b.b(bVar, false, false, null, aVar != null ? vs.a.b(aVar, null, ys.a.C3724a.f199152a, null, 5) : null, null, null, 55)));
                    cVar7.f206785a.f(p2Var.getValue(), "ui_state");
                    ((ws.a) KoinJavaComponent.get$default(ws.a.class, null, null, 6, null)).c(activityRecordingActivity);
                } else {
                    activityRecordingActivity.finish();
                }
                return Unit.INSTANCE;
            case 22:
                wu.a aVar17 = (wu.a) obj;
                aVar17.getClass();
                aVar17.a((com.garmin.android.apps.connectmobile.badges.service.model.m) ((v2.b) ((v2) obj2)).f47386a, true);
                return Unit.INSTANCE;
            default:
                zy1.d dVar = (zy1.d) obj2;
                g3 g3Var2 = (g3) obj;
                int i29 = zy1.d.Q0;
                g3Var2.getClass();
                bz1.c cVar8 = (bz1.c) g3Var2.f35301b;
                List<fg0.k> list = cVar8 != null ? cVar8.f22295a : null;
                y0 y0Var = new y0();
                ge1.b.T(v1.a(dVar), null, null, new n0(list, y0Var, dVar, null), 3);
                return y0Var;
        }
    }
}
