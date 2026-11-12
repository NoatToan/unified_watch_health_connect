package com.google.android.material.chip;

import android.content.SharedPreferences;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.app.e;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsConfigActivity;
import com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.c;
import com.garmin.android.apps.connectmobile.devices.model.f;
import com.garmin.android.apps.connectmobile.devices.model.i;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.segments.presentation.leaderboard.SegmentLeaderboardFilterActivity;
import com.garmin.android.apps.connectmobile.settings.DeviceConnectionAidViewer;
import com.garmin.android.apps.connectmobile.settings.activityoptions.GCMRunModeAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.activityoptions.HeartRateAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.Fenix3HRDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.usersettings.accessibility.WheelchairModeActivity;
import com.garmin.android.apps.connectmobile.userprofile.model.g;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d;
import com.garmin.proto.generated.GDIAntiTheftAlarmProto;
import com.garmin.proto.generated.GDISmartProto;
import db1.u;
import f12.l;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import xk1.v;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53171b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f53170a = i14;
        this.f53171b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
        String str;
        int i14 = this.f53170a;
        Object obj = this.f53171b;
        switch (i14) {
            case 0:
                ((Chip) obj).lambda$new$0(compoundButton, z14);
                return;
            case 1:
                int i15 = SegmentLeaderboardFilterActivity.f41475w;
                compoundButton.getClass();
                LinearLayout linearLayout = ((SegmentLeaderboardFilterActivity) obj).f41477b;
                linearLayout.getClass();
                linearLayout.setVisibility(z14 ? 0 : 8);
                return;
            case 2:
                b.a aVar = b.f49107t;
                compoundButton.getClass();
                ((b) obj).y6().f49138r.J0 = z14;
                return;
            case 3:
                SharedPreferences.Editor editorEdit = ((DeviceConnectionAidViewer) obj).f41514b.edit();
                editorEdit.putBoolean("UserScanChoice", z14);
                editorEdit.commit();
                l80.b bVar = (l80.b) KoinJavaComponent.get(l80.b.class);
                if (z14) {
                    i2.a(a2.SETTINGS, "DeviceConnectionAidViewer", "Friendly scan enabled");
                    bVar.m();
                    return;
                } else {
                    i2.a(a2.SETTINGS, "DeviceConnectionAidViewer", "Aggressive scan enabled");
                    bVar.y();
                    return;
                }
            case 4:
                GCMRunModeAlertsActivity gCMRunModeAlertsActivity = (GCMRunModeAlertsActivity) obj;
                LinearLayout linearLayout2 = gCMRunModeAlertsActivity.f41656b;
                if (z14) {
                    linearLayout2.setVisibility(0);
                    gCMRunModeAlertsActivity.f41660f.setVisibility(0);
                    gCMRunModeAlertsActivity.ea(gCMRunModeAlertsActivity.f41655a, true);
                    return;
                } else {
                    linearLayout2.setVisibility(8);
                    gCMRunModeAlertsActivity.f41660f.setVisibility(8);
                    gCMRunModeAlertsActivity.f41662h.C();
                    return;
                }
            case 5:
                HeartRateAlertsActivity heartRateAlertsActivity = (HeartRateAlertsActivity) obj;
                int i16 = HeartRateAlertsActivity.f41672k;
                compoundButton.getClass();
                if (z14) {
                    LinearLayout linearLayout3 = heartRateAlertsActivity.f41673a;
                    linearLayout3.getClass();
                    linearLayout3.setVisibility(0);
                    f fVar = heartRateAlertsActivity.f41681i;
                    fVar.getClass();
                    fVar.y1("heartRateAlertEnabled", Boolean.TRUE);
                    return;
                }
                LinearLayout linearLayout4 = heartRateAlertsActivity.f41673a;
                linearLayout4.getClass();
                linearLayout4.setVisibility(8);
                f fVar2 = heartRateAlertsActivity.f41681i;
                fVar2.getClass();
                fVar2.y1("heartRateAlertEnabled", Boolean.FALSE);
                return;
            case 6:
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.a.C0679a c0679a = com.garmin.android.apps.connectmobile.liveeventsharing.ui.a.f38531q;
                compoundButton.getClass();
                ht.a.f85464a.getClass();
                ht.a.a(null, "LiveEventSharingEstCompletionTimeToggle");
                ((com.garmin.android.apps.connectmobile.liveeventsharing.ui.a) obj).u6().G4(ju0.b.EST_COMPLETION_TIME);
                return;
            case 7:
                AlarmDeviceSettings alarmDeviceSettings = (AlarmDeviceSettings) obj;
                AlarmDeviceSettings.a aVar2 = AlarmDeviceSettings.f41833n;
                compoundButton.getClass();
                i iVar = alarmDeviceSettings.f41840g;
                if (z14) {
                    iVar.getClass();
                    c.a aVar3 = c.f34112c;
                    String str2 = iVar.f34181a;
                    aVar3.getClass();
                    if (c.a.a(str2) == c.OFF) {
                        List<String> list = alarmDeviceSettings.f41841h;
                        if (list == null || list.size() <= 0) {
                            i iVar2 = alarmDeviceSettings.f41840g;
                            iVar2.getClass();
                            iVar2.C(c.DAILY);
                        } else {
                            i iVar3 = alarmDeviceSettings.f41840g;
                            iVar3.getClass();
                            List<String> list2 = alarmDeviceSettings.f41841h;
                            list2.getClass();
                            iVar3.f34181a = list2.get(0);
                        }
                    }
                } else {
                    iVar.getClass();
                    iVar.C(c.OFF);
                }
                alarmDeviceSettings.ea(z14);
                return;
            case 8:
                int i17 = Fenix3HRDeviceSettings.P;
                compoundButton.getClass();
                DeviceSettingsDTO deviceSettingsDTO = ((Fenix3HRDeviceSettings) obj).f125985k;
                deviceSettingsDTO.getClass();
                deviceSettingsDTO.K0 = Boolean.valueOf(z14);
                deviceSettingsDTO.S1("opticalHeartRateEnabled");
                return;
            case 9:
                d dVar = (d) obj;
                d.a aVar4 = d.f49637i;
                compoundButton.getClass();
                dVar.v6().x4().f48221g = Boolean.valueOf(z14);
                dVar.v6().x4().f48222h = true;
                return;
            case 10:
                AudioPromptsConfigActivity audioPromptsConfigActivity = (AudioPromptsConfigActivity) obj;
                int i18 = AudioPromptsConfigActivity.f30253i;
                compoundButton.getClass();
                ((gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null)).n(audioPromptsConfigActivity.f30257d, z14, audioPromptsConfigActivity.f30259f);
                audioPromptsConfigActivity.ea(z14);
                return;
            case 11:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.c.a aVar5 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.c.f40965f;
                compoundButton.getClass();
                for (GCMComplexOneLineButton gCMComplexOneLineButton : ((com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.c) obj).f40967b) {
                    gCMComplexOneLineButton.setVisibility(z14 ? 0 : 8);
                    if (z14) {
                        gCMComplexOneLineButton.i(true);
                    }
                }
                return;
            case 12:
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f fVar3 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.a aVar6 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.f.f40985j;
                compoundButton.getClass();
                u uVarC = fVar3.u6().C.getWeightGoalUserInputs();
                if (uVarC != null) {
                    uVarC.j(z14);
                }
                int i19 = z14 ? 0 : 8;
                GCMComplexTwoLineButton gCMComplexTwoLineButton = fVar3.f40988c;
                if (gCMComplexTwoLineButton == null) {
                    s.m("mWeightBeforePregnancyButton");
                    throw null;
                }
                gCMComplexTwoLineButton.setVisibility(i19);
                GCMComplexOneLineButton gCMComplexOneLineButton2 = fVar3.f40991f;
                if (gCMComplexOneLineButton2 != null) {
                    gCMComplexOneLineButton2.setVisibility(i19);
                    return;
                } else {
                    s.m("mHeightButton");
                    throw null;
                }
            case 13:
                l lVar = (l) obj;
                WheelchairModeActivity.a aVar7 = WheelchairModeActivity.f44027a;
                compoundButton.getClass();
                lVar.v4(z14);
                lVar.T3(true);
                lVar.H0(true);
                return;
            case 14:
                com.garmin.android.apps.connectmobile.settings.devices.common.c cVar = (com.garmin.android.apps.connectmobile.settings.devices.common.c) obj;
                com.garmin.android.apps.connectmobile.settings.devices.common.b.C0798b c0798b = com.garmin.android.apps.connectmobile.settings.devices.common.b.f42819d;
                compoundButton.getClass();
                if (cVar != null) {
                    GDIAntiTheftAlarmProto.SettingChangeRequest.Builder builderNewBuilder = GDIAntiTheftAlarmProto.SettingChangeRequest.newBuilder();
                    builderNewBuilder.setIsEnabled(z14);
                    GDIAntiTheftAlarmProto.AntiTheftAlarmService.Builder builderNewBuilder2 = GDIAntiTheftAlarmProto.AntiTheftAlarmService.newBuilder();
                    builderNewBuilder2.setSettingChangeRequest(builderNewBuilder);
                    GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                    builderNewBuilder3.getClass();
                    vg1.f.b(builderNewBuilder3, builderNewBuilder2);
                    cVar.b(builderNewBuilder3);
                    return;
                }
                return;
            default:
                ProductImprovementConsentActivity productImprovementConsentActivity = (ProductImprovementConsentActivity) obj;
                ProductImprovementConsentActivity.a aVar8 = ProductImprovementConsentActivity.f32230h;
                compoundButton.getClass();
                if (z14) {
                    l.f68084a.getClass();
                    g gVarW0 = l.a.a().W0();
                    e.a aVar9 = new e.a(productImprovementConsentActivity, 0);
                    aVar9.setTitle(productImprovementConsentActivity.getString(R.string.lbl_admin_setup_required));
                    if (gVarW0 == null || (str = gVarW0.f46858b) == null) {
                        str = "";
                    }
                    aVar9.setMessage(productImprovementConsentActivity.getString(R.string.msg_admin_setup_product_improvement_required, str));
                    aVar9.setCancelable(false);
                    aVar9.setPositiveButton(productImprovementConsentActivity.getString(R.string.lbl_ok), new v(19));
                    aVar9.create().show();
                    GCMComplexOneLineButton gCMComplexOneLineButton3 = productImprovementConsentActivity.f32232b;
                    if (gCMComplexOneLineButton3 != null) {
                        gCMComplexOneLineButton3.i(false);
                        return;
                    } else {
                        s.m("consentToggle");
                        throw null;
                    }
                }
                return;
        }
    }
}
