package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.v1;
import androidx.lifecycle.w1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.stats.climbs.ClimbDetailActivity;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.developer.CIQPushNotificationTestActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectionTermsActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.MultipleValueSelectorView;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupGenesisActivity;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.DisplayWiFiNetworksActivity;
import com.garmin.android.apps.connectmobile.smartscale.InviteSmartScaleConnectionsActivity;
import com.garmin.android.apps.connectmobile.social.VideoPlayerActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.RescheduleWorkoutActivity;
import com.garmin.subscriptions.ui.InAppPurchaseActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.textfield.TextInputLayout;
import com.mapbox.maps.plugin.compass.CompassViewImpl;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import r53.p2;
import rx.schedulers.Schedulers;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32085b;

    public /* synthetic */ x(Object obj, int i14) {
        this.f32084a = i14;
        this.f32085b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, o13.l] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        b.u onBackPressedDispatcher;
        androidx.fragment.app.v supportFragmentManager;
        int i14 = this.f32084a;
        int i15 = 2;
        int i16 = 1;
        int i17 = 3;
        Object obj = this.f32085b;
        switch (i14) {
            case 0:
                ((w.d) obj).f32066a.onClick(view2);
                return;
            case 1:
                ((MaterialDatePicker) obj).lambda$initHeaderToggle$0(view2);
                return;
            case 2:
                CompassViewImpl._init_$lambda$1((CompassViewImpl) obj, view2);
                return;
            case 3:
                cp2.f.a aVar = cp2.f.f54931p;
                ((c32.k) obj).invoke();
                return;
            case 4:
                cp2.i iVar = (cp2.i) obj;
                String string = d53.w.i0(iVar.f54972i).toString();
                if (string == null || string.length() == 0 || string.length() < iVar.f54964a) {
                    TextInputLayout textInputLayout = iVar.f54967d;
                    if (textInputLayout != null) {
                        textInputLayout.setError(iVar.getString(R.string.cvv_not_valid));
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("addInfoCvvEditTextLayout");
                        throw null;
                    }
                }
                TextInputLayout textInputLayout2 = iVar.f54967d;
                if (textInputLayout2 == null) {
                    p005kotlin.jvm.internal.s.m("addInfoCvvEditTextLayout");
                    throw null;
                }
                textInputLayout2.setError(null);
                dp2.b bVar = new dp2.b(null, null, null, null, string, null, null, null, null, null, null, 2031, null);
                ap2.h hVar = iVar.f54965b;
                if (hVar == null) {
                    p005kotlin.jvm.internal.s.m("fitPayAddCardViewModel");
                    throw null;
                }
                hVar.f11699c.set(bVar);
                ap2.h hVar2 = iVar.f54965b;
                if (hVar2 == null) {
                    p005kotlin.jvm.internal.s.m("fitPayAddCardViewModel");
                    throw null;
                }
                boolean zF4 = hVar2.F4();
                yq2.a aVar2 = iVar.f54966c;
                if (zF4) {
                    if (aVar2 != null) {
                        aVar2.K8();
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        throw null;
                    }
                }
                if (aVar2 != null) {
                    aVar2.G2(bVar);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
            case 5:
                ClimbDetailActivity.a aVar3 = ClimbDetailActivity.f29814a;
                HelpActivity.a.e(HelpActivity.f36653a, (ClimbDetailActivity) obj, ro0.l.CLIMB_PRO, null, null, 12);
                return;
            case 6:
                HelpActivity.a.e(HelpActivity.f36653a, ((View) obj).getContext(), ro0.l.CLIMB_PRO, null, null, 12);
                return;
            case 7:
                IncidentDetectionTermsActivity incidentDetectionTermsActivity = (IncidentDetectionTermsActivity) obj;
                IncidentDetectionTermsActivity.a aVar4 = IncidentDetectionTermsActivity.f36839e;
                hl.a aVarCa = incidentDetectionTermsActivity.ca();
                if (p005kotlin.jvm.internal.s.g(aVarCa, hl.a.c.f84256b)) {
                    eq0.a.f65038b.a().getClass();
                    SharedPreferences sharedPreferencesP = eq0.a.P();
                    String strO = eq0.a.O(R.string.key_incident_detection_config_first_time);
                    Set<String> stringSet = sharedPreferencesP.getStringSet(strO, null);
                    if (stringSet == null) {
                        stringSet = new HashSet<>();
                    }
                    Object obj2 = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                    obj2.getClass();
                    String userDisplayName = ((f12.b) obj2).getUserDisplayName();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    String lowerCase = userDisplayName.toLowerCase(locale);
                    lowerCase.getClass();
                    stringSet.add(lowerCase);
                    sharedPreferencesP.edit().putStringSet(strO, stringSet).commit();
                } else {
                    if (!(aVarCa instanceof hl.a.b)) {
                        lc.u0.r();
                        return;
                    }
                    eq0.a aVarA = eq0.a.f65038b.a();
                    hl.a aVarCa2 = incidentDetectionTermsActivity.ca();
                    aVarCa2.getClass();
                    long j8 = ((hl.a.b) aVarCa2).f84252b;
                    hl.a aVarCa3 = incidentDetectionTermsActivity.ca();
                    aVarCa3.getClass();
                    String str = ((hl.a.b) aVarCa3).f84253c;
                    String str2 = str != null ? str : "";
                    aVarA.getClass();
                    eq0.a.R(j8, str2);
                }
                ((cq0.j) KoinJavaComponent.get$default(cq0.j.class, null, null, 6, null)).i(incidentDetectionTermsActivity, incidentDetectionTermsActivity.f36841b, incidentDetectionTermsActivity.f36842c, incidentDetectionTermsActivity.ca());
                incidentDetectionTermsActivity.finish();
                return;
            case 8:
                cu1.l lVar = ((cu1.r) obj).f55701b;
                if (lVar != null) {
                    lVar.y2(cu1.j.RESUME_ATP);
                    return;
                }
                return;
            case 9:
                RescheduleWorkoutActivity rescheduleWorkoutActivity = (RescheduleWorkoutActivity) obj;
                RescheduleWorkoutActivity.a aVar5 = RescheduleWorkoutActivity.f45357n;
                String string2 = rescheduleWorkoutActivity.getString(R.string.msg_reschedule_workout);
                string2.getClass();
                String string3 = rescheduleWorkoutActivity.getString(R.string.msg_reschedule_workout_info);
                string3.getClass();
                q1.b bVar2 = q1.f41066b;
                com.mapbox.maps.renderer.e eVar = new com.mapbox.maps.renderer.e(rescheduleWorkoutActivity, 9);
                bVar2.getClass();
                q1 q1VarC = q1.b.c(string2, string3, R.string.common_confirm, R.string.device_action_cancel, eVar);
                androidx.fragment.app.v supportFragmentManager2 = rescheduleWorkoutActivity.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                q1VarC.v6(supportFragmentManager2, "GCMFragTwoBttnAlertDialog");
                return;
            case 10:
                cu1.l lVar2 = ((cu1.v) obj).f55711b;
                if (lVar2 != null) {
                    lVar2.y2(cu1.j.REVIEW_PERMISSION);
                    return;
                }
                return;
            case 11:
                cu1.l lVar3 = ((cu1.w) obj).f55715b;
                if (lVar3 != null) {
                    lVar3.y2(cu1.j.SHOW_WORKOUT_SCHEDULE);
                    return;
                }
                return;
            case 12:
                d10.c<T> cVar = ((d10.d) obj).f57031b;
                if (cVar != 0) {
                    cVar.d2();
                    return;
                }
                return;
            case 13:
                ((com.garmin.android.apps.connectmobile.devices.setup.wizard.c) obj).f34518d.L3();
                return;
            case 14:
                ((com.garmin.android.apps.connectmobile.devices.setup.wizard.d) obj).f34528j.C8();
                return;
            case 15:
                ((com.garmin.android.apps.connectmobile.devices.setup.wizard.e) obj).f34529a.V0();
                return;
            case 16:
                ((com.garmin.android.apps.connectmobile.devices.setup.wizard.f) obj).f34534a.X6();
                return;
            case 17:
                DisplayWiFiNetworksActivity displayWiFiNetworksActivity = (DisplayWiFiNetworksActivity) obj;
                DisplayWiFiNetworksActivity.a aVar6 = DisplayWiFiNetworksActivity.f43230m;
                i2.a aVar7 = i2.f36769a;
                a2 a2Var = a2.SETTINGS;
                aVar7.getClass();
                i2.a.b(a2Var, "DisplayWiFiNetworksActivity", "transitionToInviteConnectionsActivity");
                hk0.a.f().i(displayWiFiNetworksActivity.f43231a);
                com.garmin.android.apps.connectmobile.devices.model.l lVar4 = displayWiFiNetworksActivity.f43232b;
                boolean z14 = displayWiFiNetworksActivity.f43233c;
                Intent intent = new Intent(displayWiFiNetworksActivity, (Class<?>) InviteSmartScaleConnectionsActivity.class);
                if (lVar4 != null) {
                    intent.putExtra("GCM_deviceDTO", lVar4);
                }
                intent.putExtra("GCM_extra_in_pairing_mode", z14);
                displayWiFiNetworksActivity.startActivityForResult(intent, 999);
                displayWiFiNetworksActivity.setResult(-1);
                displayWiFiNetworksActivity.finish();
                return;
            case 18:
                di1.a0 a0Var = (di1.a0) obj;
                ?? r14 = a0Var.f59727e;
                hd0.b bVar3 = (hd0.b) r14.getValue();
                if (bVar3.f83310c.size() >= bVar3.f83311d) {
                    new androidx.appcompat.app.e.a(a0Var.requireContext()).setTitle(a0Var.getString(R.string.wifi_max_wifi_networks_added_error_title)).setMessage(a0Var.getString(R.string.wifi_max_wifi_networks_added_error_msg)).setPositiveButton(a0Var.getString(R.string.lbl_ok), new i(15)).show();
                    return;
                }
                hd0.b bVar4 = (hd0.b) r14.getValue();
                bVar4.getClass();
                a2 a2Var2 = a2.DEVICES;
                String strF = androidx.room.a0.f(bVar4.f83308a, "scanNetworks deviceId[", "]");
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "WifiNetworksViewModel", strF);
                androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
                bVar4.f83309b.j(hd0.h.a.f83351a);
                ge1.b.T(v1.a(bVar4), null, null, new hd0.e(bVar4, y0Var, null), 3);
                return;
            case 19:
                VideoPlayerActivity.a aVar8 = VideoPlayerActivity.f44499a;
                ((VideoPlayerActivity) obj).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/t/terms")));
                return;
            case 20:
                MultipleValueSelectorView.a((MultipleValueSelectorView) obj, view2);
                return;
            case 21:
                GCMCalendarActivity gCMCalendarActivity = (GCMCalendarActivity) obj;
                GCMCalendarActivity.a aVar9 = GCMCalendarActivity.F;
                o53.f0.N(new ey.r((ey.s) gCMCalendarActivity.f31083v.getValue(), "AutoSync.OneTimeMessage.dismiss", new xx.f("AutoSync.OneTimeMessage.dismiss", true), null)).f(gCMCalendarActivity, new GCMCalendarActivity.c(new ey.k(gCMCalendarActivity, i15)));
                return;
            case 22:
                InAppPurchaseActivity.a aVar10 = InAppPurchaseActivity.f52722l;
                ((InAppPurchaseActivity) obj).P9();
                return;
            case 23:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h hVar3 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar11 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                o13.p pVar = new o13.p(hVar3.getString(R.string.lbl_delete), new fb1.c0(hVar3, 0));
                o13.p pVar2 = new o13.p(hVar3.getString(R.string.lbl_cancel), new ex.b(19));
                c22.f fVar = c22.f.f23050a;
                Context contextRequireContext = hVar3.requireContext();
                contextRequireContext.getClass();
                fVar.getClass();
                androidx.appcompat.app.e eVarA = c22.f.a(contextRequireContext, R.string.pregnancy_delete_entry_question, R.string.pregnancy_delete_entry_message, pVar, pVar2);
                eVarA.setOnShowListener(new c22.e(hVar3, i15));
                eVarA.show();
                return;
            case 24:
                fv1.i iVar2 = (fv1.i) obj;
                fv1.i.a aVar12 = fv1.i.f73723f;
                w1 w1Var = iVar2.f73724a;
                ev1.b bVar5 = (ev1.b) w1Var.getValue();
                bw1.b<vt1.f> bVar6 = iVar2.f73725b;
                if (bVar6 == null) {
                    p005kotlin.jvm.internal.s.m("itemAdapter");
                    throw null;
                }
                vt1.f fVar2 = bVar6.f21568a.get(bVar6.f21570c);
                fVar2.getClass();
                p2 p2Var = bVar5.P;
                gv1.a aVar13 = (gv1.a) p2Var.getValue();
                p2Var.setValue(aVar13 != null ? gv1.a.a(aVar13, fVar2, null, 14) : null);
                bw1.b<vt1.f> bVar7 = iVar2.f73725b;
                if (bVar7 == null) {
                    p005kotlin.jvm.internal.s.m("itemAdapter");
                    throw null;
                }
                if (bVar7.f21568a.get(bVar7.f21570c) == vt1.g.FINISH_GOAL_TIME) {
                    ((androidx.lifecycle.y0) ((ev1.b) w1Var.getValue()).X.getValue()).m("FBTEditGoalDataFragment");
                    return;
                }
                androidx.fragment.app.m activity = iVar2.getActivity();
                if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                    return;
                }
                onBackPressedDispatcher.d();
                return;
            case 25:
                g32.a<Data> aVar14 = ((g32.c) obj).f75713n;
                if (aVar14 != 0) {
                    aVar14.a();
                    return;
                }
                return;
            case 26:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a aVar15 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.i iVar3 = aVar15.f49096b;
                if (iVar3 != null) {
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.a.u6(aVar15, iVar3.r().size());
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("adapter");
                    throw null;
                }
            case 27:
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar8 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar16 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                g62.a0 a0Var2 = new g62.a0(new g62.g(bVar8, i16));
                androidx.fragment.app.m activity2 = bVar8.getActivity();
                if (activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null) {
                    return;
                }
                a0Var2.show(supportFragmentManager, "");
                return;
            case 28:
                CIQPushNotificationTestActivity cIQPushNotificationTestActivity = (CIQPushNotificationTestActivity) obj;
                int i18 = CIQPushNotificationTestActivity.f33602d;
                zb0.n0.f203581e.a();
                j83.e eVarE = j83.e.e(new o83.s(new j83.l(new o83.r(j83.l.a(new jr2.f(i17)).d(Schedulers.io()), new l2(23))).f97754a));
                (eVarE.getClass() == s83.i.class ? j83.e.e(new s83.h((s83.i) eVarE, s83.l.INSTANCE)) : j83.e.e(new o83.h(eVarE.f97747a, o83.j.a.f130889a))).b(l83.a.a()).d(new zb0.m0(cIQPushNotificationTestActivity));
                return;
            default:
                androidx.fragment.app.m mVar = (androidx.fragment.app.m) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.c.a aVar17 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.c.f40542g;
                PregnancySetupGenesisActivity.f40944a.getClass();
                mVar.startActivity(new Intent(mVar, (Class<?>) PregnancySetupGenesisActivity.class));
                return;
        }
    }
}
