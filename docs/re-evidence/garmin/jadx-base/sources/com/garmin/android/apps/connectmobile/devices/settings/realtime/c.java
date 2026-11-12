package com.garmin.android.apps.connectmobile.devices.settings.realtime;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import c22.b0;
import c80.s;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activityrecording.presentation.ActivityRecordingActivity;
import com.garmin.android.apps.connectmobile.bikesensors.firmwareupdate.SensorsFirmwareUpdateActivity;
import com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeActivity;
import com.garmin.android.apps.connectmobile.devices.settings.tutorials.DeviceTutorialsActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.EcgOnboardingActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgActivity;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.gncs.GNCSOptOutSettingsActivity;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectionTermsActivity;
import com.garmin.android.apps.connectmobile.liveeventsharing.ui.LiveEventSharingActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingActivity;
import com.garmin.android.apps.connectmobile.settings.GCMUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.autodetect.DeviceAutoDetectActivity;
import com.garmin.android.apps.connectmobile.settings.devices.CannedTextResponsesActivity;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.BikeAlarmSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.FindMyWatchActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.TransferActivityProfilesActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.TransferSensorsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.music.MusicSetupActivity;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceActivity;
import com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionManagerActivity;
import com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachLTEActivationRedirectActivity;
import com.garmin.android.apps.connectmobile.settings.notification.NotificationOffActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity;
import com.garmin.android.apps.connectmobile.setup.presentation.RecordActivitySettingsActivity;
import com.garmin.android.apps.connectmobile.solarcharge.EdgeSolarChargeActivity;
import com.garmin.android.apps.connectmobile.solarintensity.presentation.activity.SolarIntensityActivity;
import com.garmin.android.apps.connectmobile.wheelchair.presentation.EditPushesGoalActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.myworkouts.MyWorkoutsActivity;
import d53.w;
import gh2.i;
import gw.k;
import hk0.p;
import java.util.Locale;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import sd2.f;
import t13.d;
import v13.e;
import vb.h;
import w3.x;
import xc0.g;
import xc0.j;
import xc0.l;
import xc0.n;
import xc0.r;
import yc.l2;
import zb0.n0;
import zb0.t;
import zd0.j1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rB-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/c;", "Lvw2/a;", "Lgb2/a$e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "deviceDatabaseRecord", "Lgj1/c;", "primaryDevice", "Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/b$b;", "launchStateListener", "<init>", "(Landroid/content/Context;Lsd2/f;Lgj1/c;Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/b$b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements vw2.a, gb2.a.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f34371f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f34373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gj1.c f34374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.devices.settings.realtime.b.InterfaceC0579b f34375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xw2.b f34376e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsTunnel", f = "RTSSettingsTunnel.kt", l = {227, 230}, m = "isUserGCPlus", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j1 f34377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f34378b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f34380d;

        public b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f34378b = obj;
            this.f34380d |= Integer.MIN_VALUE;
            return c.this.e(this);
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f34371f = gt2.b.f79005a.h("RTS-RealTimeSettingsTunnel");
    }

    public c(Context context, f fVar, gj1.c cVar, com.garmin.android.apps.connectmobile.devices.settings.realtime.b.InterfaceC0579b interfaceC0579b) {
        context.getClass();
        fVar.getClass();
        this.f34372a = context;
        this.f34373b = fVar;
        this.f34374c = cVar;
        this.f34375d = interfaceC0579b;
        xw2.b bVarV = x.v(fVar);
        this.f34376e = bVarV;
        com.airbnb.lottie.animation.keyframe.a.u("Initializing RealTimeSettingsTunnel for display name: ", bVarV != null ? bVarV.f192451c : null, StringUtils.SPACE, f34371f);
        context.getString(R.string.txt_something_went_wrong_try_again).getClass();
    }

    @Override // vw2.a
    public final void a() {
        com.garmin.android.apps.connectmobile.devices.settings.realtime.b.InterfaceC0579b interfaceC0579b = this.f34375d;
        if (interfaceC0579b != null) {
            interfaceC0579b.a();
        }
    }

    @Override // gb2.a.e
    public final void b(gb2.a.d dVar) {
        dVar.getClass();
        int i14 = dVar.f76774f;
        if (i14 != 3) {
            if (i14 != 4) {
                return;
            }
            gb2.a.b().f76763b.remove(this);
        } else {
            xw2.b bVar = this.f34376e;
            com.garmin.android.library.backgroundtaskmanagement.c.d(new k(String.valueOf(bVar != null ? Long.valueOf(bVar.f192449a) : null), null), null);
            gb2.a.b().f76763b.remove(this);
        }
    }

    @Override // vw2.a
    public final void c(int i14, boolean z14) {
        Logger logger = f34371f;
        xw2.b bVar = this.f34376e;
        if (bVar == null) {
            logger.error("onExit from RTS: rtsDeviceRecord must not be null");
        }
        long j8 = bVar.f192449a;
        if (z14 && j8 >= 0 && p.k(j8)) {
            logger.debug("onExit from RTS : Performing sync for composition " + i14 + " for device ID " + j8);
            String name = logger.getName();
            name.getClass();
            yr1.e.e(new n(this, 0), j8, name);
        }
        switch (i14) {
            case PULSE_OX_SETTINGS_VALUE:
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.ENTERED_PULSE_OX_SETTINGS);
                break;
            case ALARM_SETTINGS_VALUE:
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.ENTERED_ALARMS);
                break;
            case ACTIVITY_TRACKING_SETTINGS_VALUE:
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.ENTERED_ACTIVITY_TRACKING_SCREEN);
                break;
            case WIDGETS_SETTINGS_VALUE:
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.ENTERED_WIDGETS_SETUP_SCREEN);
                break;
            case WATCH_FACE_SETTINGS_VALUE:
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.ENTERED_CUSTOMIZE_WATCH_FACE);
                break;
            case DISPLAY_NAME_SETTINGS_VALUE:
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.ENTERED_DEVICE_DISPLAY_NAME);
                break;
            case TOPOACTIVE_MAPS_MENU_VALUE:
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.HAS_TOPO_ACTIVE_MAPS_SUPPORT);
                break;
            case ADD_SMART_WAKE_ALARM_VALUE:
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.ENTERED_SMART_WAKE_ALARM);
                break;
            case DAILY_STATS_VALUE:
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.HAS_ENTERED_DAILY_STATS);
                break;
            case MORNING_REPORT_VALUE:
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.HAS_ENTERED_MORNING_REPORT);
                break;
            case HEALTH_AND_WELLNESS_SETTINGS_VALUE:
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.HAS_ENTERED_SET_GOALS);
                break;
            case SELECT_ACTIVITY_VALUE:
                ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.HAS_ENTERED_SELECT_ACTIVITIES);
                break;
        }
    }

    @Override // vw2.a
    public final zw2.f d(Context context, String str) {
        str.getClass();
        xw2.b bVar = this.f34376e;
        if (bVar == null) {
            f34371f.error("getTransforms: rtsDeviceRecord must not be null");
            return null;
        }
        yc0.e.f196726a.getClass();
        if (str.equals(yc0.f.ALERT_VOLUME.f196737a)) {
            return new xc0.a(context, bVar);
        }
        if (str.equals(yc0.f.SYNC_DEVICE.f196737a)) {
            return new r(context, bVar);
        }
        if (str.equals(yc0.f.DEVICE_VIEW.f196737a)) {
            return new xc0.b(context, bVar);
        }
        boolean zEquals = str.equals(yc0.f.MANAGE_DEVICE_PRIORITY.f196737a);
        gj1.c cVar = this.f34374c;
        if (zEquals) {
            return new xc0.k(context, bVar, cVar);
        }
        if (str.equals(yc0.f.REMOVE_DEVICE.f196737a)) {
            return new l(context, bVar, cVar);
        }
        if (str.equals(yc0.f.FEATURE_SETUP.f196737a)) {
            return new xc0.e(context, bVar);
        }
        if (str.equals(yc0.f.FIND_MY_DEVICE.f196737a)) {
            return new g(context, bVar);
        }
        if (str.equals(yc0.f.HAND_ALIGNMENT.f196737a)) {
            return new j(context, bVar);
        }
        if (str.equals(yc0.f.SINGLE_LABEL.f196737a)) {
            return new xc0.p(context, bVar);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r7 == r1) goto L22;
     */
    @Override // vw2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(d<? super Boolean> dVar) {
        b bVar;
        j1 j1Var;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f34380d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f34380d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objI = bVar.f34378b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f34380d;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objI);
            j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            bVar.f34377a = j1Var;
            bVar.f34380d = 1;
            if (j1Var.d(bVar) != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            j1Var = bVar.f34377a;
            o13.r.b(objI);
        } else {
            if (i15 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        s sVar = (s) objI;
        if (!(sVar instanceof s.a)) {
            z14 = false;
            if (!(sVar instanceof s.b) && !(sVar instanceof s.c)) {
                u0.r();
                return null;
            }
        }
        return Boolean.valueOf(z14);
        bVar.f34377a = null;
        bVar.f34380d = 2;
        objI = j1Var.i(bVar);
    }

    @Override // vw2.a
    public final boolean f() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return i.f77458c.a().f77477b.c("enable_cross_sell_accessories");
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01d3  */
    @Override // vw2.a
    public final Intent g(Context context, String str) {
        Uri uri;
        String productPageUrl;
        str.getClass();
        f34371f.debug("getExternalSettingsActivity: ExternalSettings: ".concat(str));
        com.garmin.android.apps.connectmobile.devices.settings.realtime.a.f34355a.getClass();
        f fVar = this.f34373b;
        fVar.getClass();
        if (str.equals("APP_LIST_SETUP")) {
            return com.garmin.android.apps.connectmobile.devices.settings.realtime.a.C0578a.a(context, fVar, com.garmin.android.apps.connectmobile.connectiq.l.APPS);
        }
        if (str.equals("BIKE_ALARM")) {
            Intent intent = new Intent(context, (Class<?>) BikeAlarmSettingActivity.class);
            intent.putExtra("GCM_deviceUnitID", fVar.getUnitID());
            return intent;
        }
        if (str.equals("WALK_STRIDE_LENGTH")) {
            RTSDynamicSettingsLauncherActivity.a aVar = RTSDynamicSettingsLauncherActivity.f34350a;
            String str2 = ni2.b.RTS_WALK_STRIDE_LENGTH.f126214a;
            aVar.getClass();
            return RTSDynamicSettingsLauncherActivity.a.a(context, fVar, str2);
        }
        if (str.equals("GARMIN_PAY_SETUP")) {
            GarminPayLaunchScreenActivity.a aVar2 = GarminPayLaunchScreenActivity.f35305d;
            kj0.a.c cVar = new kj0.a.c(Long.valueOf(fVar.getUnitID()), fVar.getImageURL(), fVar.getProductDisplayName());
            aVar2.getClass();
            return GarminPayLaunchScreenActivity.a.a(context, cVar);
        }
        if (str.equals("SET_PASSCODE")) {
            DevicePasscodeActivity.a aVar3 = DevicePasscodeActivity.f33744a;
            long unitID = fVar.getUnitID();
            ca2.a aVar4 = ca2.a.SET_PASSCODE;
            y92.e eVar = y92.e.DEVICE_SETTINGS;
            aVar3.getClass();
            return DevicePasscodeActivity.a.a(context, unitID, aVar4, eVar);
        }
        if (str.equals("CHANGE_PASSCODE")) {
            DevicePasscodeActivity.a aVar5 = DevicePasscodeActivity.f33744a;
            long unitID2 = fVar.getUnitID();
            ca2.a aVar6 = ca2.a.CHANGE_PASSCODE;
            y92.e eVar2 = y92.e.DEVICE_SETTINGS;
            aVar5.getClass();
            return DevicePasscodeActivity.a.a(context, unitID2, aVar6, eVar2);
        }
        if (str.equals("CONFIRM_PASSCODE")) {
            DevicePasscodeActivity.a aVar7 = DevicePasscodeActivity.f33744a;
            long unitID3 = fVar.getUnitID();
            ca2.a aVar8 = ca2.a.CONFIRM_PASSCODE;
            y92.e eVar3 = y92.e.DEVICE_SETTINGS;
            aVar7.getClass();
            return DevicePasscodeActivity.a.a(context, unitID3, aVar8, eVar3);
        }
        if (str.equals("ECG_SETUP")) {
            EcgOnboardingActivity.a aVar9 = EcgOnboardingActivity.f34765b;
            long unitID4 = fVar.getUnitID();
            aVar9.getClass();
            Intent intent2 = new Intent(context, (Class<?>) EcgOnboardingActivity.class);
            intent2.putExtra("DEVICE_UNIT_ID", unitID4);
            return intent2;
        }
        if (str.equals("ECG_FEATURE")) {
            EcgActivity.f34850a.getClass();
            return new Intent(context, (Class<?>) EcgActivity.class);
        }
        if (str.equals("FIND_MY_EDGE")) {
            long unitID5 = fVar.getUnitID();
            int i14 = FindMyWatchActivity.f42782c;
            return l2.d(context, FindMyWatchActivity.class, "GCM_deviceUnitID", unitID5);
        }
        if (str.equals(yc0.d.FEATURE_SETUP.f196725a)) {
            Intent intent3 = new Intent(context, (Class<?>) DeviceOnboardingActivity.class);
            intent3.putExtra("GCM_deviceUnitID", fVar.getUnitID());
            return intent3;
        }
        if (str.equals("DEVICE_FIRMWARE_UPDATE")) {
            if (!p.k(fVar.getUnitID())) {
                com.garmin.android.apps.connectmobile.devices.settings.realtime.a.C0578a.b(context, fVar.getDisplayName());
                return null;
            }
            SensorsFirmwareUpdateActivity.a aVar10 = SensorsFirmwareUpdateActivity.f30877a;
            long unitID6 = fVar.getUnitID();
            aVar10.getClass();
            return SensorsFirmwareUpdateActivity.a.a(context, unitID6, false);
        }
        if (str.equals("FLOORS_GOAL")) {
            RTSDynamicSettingsLauncherActivity.a aVar11 = RTSDynamicSettingsLauncherActivity.f34350a;
            String str3 = ni2.b.RTS_GOALS_FLOORS.f126214a;
            aVar11.getClass();
            return RTSDynamicSettingsLauncherActivity.a.a(context, fVar, str3);
        }
        if (str.equals(yc0.d.HELP_AND_INFO.f196725a)) {
            Intent intent4 = new Intent("android.intent.action.VIEW", n0.e(fVar.getUnitID()));
            if (intent4.resolveActivity(context.getPackageManager()) != null) {
                return intent4;
            }
        } else {
            if (!str.equals(yc0.d.AVAILABLE_ACCESSORIES.f196725a)) {
                if (str.equals("INTENSITY_MINUTES_GOAL")) {
                    RTSDynamicSettingsLauncherActivity.a aVar12 = RTSDynamicSettingsLauncherActivity.f34350a;
                    String str4 = ni2.b.RTS_GOALS_WEEKLY_INTENSITY.f126214a;
                    aVar12.getClass();
                    return RTSDynamicSettingsLauncherActivity.a.a(context, fVar, str4);
                }
                if (str.equals("LAST_KNOWN_LOCATION")) {
                    return ar.a.d(context, fVar.getUnitID());
                }
                if (str.equals("LIVE_TRACK")) {
                    return new Intent(context, (Class<?>) LiveTrackActivity.class);
                }
                if (str.equals("MUSIC_PROVIDERS")) {
                    MusicSetupActivity.a aVar13 = MusicSetupActivity.f43129f;
                    long unitID7 = fVar.getUnitID();
                    String displayName = fVar.getDisplayName();
                    aVar13.getClass();
                    return MusicSetupActivity.a.a(context, unitID7, displayName);
                }
                if (str.equals(yc0.d.PULSE_OX_HELP.f196725a)) {
                    String str5 = b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry()) ? "BLOOD_EFFICIENCY_ACTION" : null;
                    ic1.i.f92620g.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("SHOW_PULSE_OX_SETTINGS_EXTRA", false);
                    HelpActivity.a aVar14 = HelpActivity.f36653a;
                    ro0.l lVar = ro0.l.PULSE_OX;
                    aVar14.getClass();
                    return HelpActivity.a.a(context, lVar, str5, bundle);
                }
                if (str.equals("SAFETY_FEATURES")) {
                    return new Intent(context, (Class<?>) IncidentDetectionTermsActivity.class);
                }
                if (str.equals("SOLAR_INTENSITY")) {
                    SolarIntensityActivity.a aVar15 = SolarIntensityActivity.f44787a;
                    long unitID8 = fVar.getUnitID();
                    aVar15.getClass();
                    return SolarIntensityActivity.a.a(context, unitID8);
                }
                if (str.equals("SOLAR_CHARGE")) {
                    EdgeSolarChargeActivity.a aVar16 = EdgeSolarChargeActivity.f44765o;
                    long unitID9 = fVar.getUnitID();
                    aVar16.getClass();
                    Intent intent5 = new Intent(context, (Class<?>) EdgeSolarChargeActivity.class);
                    intent5.putExtra("GCM_deviceUnitID", unitID9);
                    return intent5;
                }
                if (str.equals("STEPS_GOAL")) {
                    RTSDynamicSettingsLauncherActivity.a aVar17 = RTSDynamicSettingsLauncherActivity.f34350a;
                    String str6 = ni2.b.RTS_GOALS_DAILY_STEPS.f126214a;
                    aVar17.getClass();
                    return RTSDynamicSettingsLauncherActivity.a.a(context, fVar, str6);
                }
                if (str.equals("PUSHES_GOAL")) {
                    EditPushesGoalActivity.f48020l.getClass();
                    return new Intent(context, (Class<?>) EditPushesGoalActivity.class);
                }
                if (str.equals("LIVE_EVENT_SHARING")) {
                    return new Intent(context, (Class<?>) LiveEventSharingActivity.class);
                }
                if (str.equals("TEXT_RESPONSE_SETUP")) {
                    if (!p.k(fVar.getUnitID())) {
                        com.garmin.android.apps.connectmobile.devices.settings.realtime.a.C0578a.b(context, fVar.getDisplayName());
                        return null;
                    }
                    CannedTextResponsesActivity.a aVar18 = CannedTextResponsesActivity.f41931o;
                    long unitID10 = fVar.getUnitID();
                    String productNumber = fVar.getProductNumber();
                    productNumber.getClass();
                    String productDisplayName = fVar.getProductDisplayName();
                    productDisplayName.getClass();
                    String strD0 = fVar.d0();
                    String strD = t.d(fVar);
                    aVar18.getClass();
                    return CannedTextResponsesActivity.a.a(context, unitID10, productNumber, productDisplayName, strD0, strD);
                }
                if (str.equals("TRANSFER_ACTIVITY_PROFILES")) {
                    if (!p.k(fVar.getUnitID())) {
                        com.garmin.android.apps.connectmobile.devices.settings.realtime.a.C0578a.b(context, fVar.getDisplayName());
                        return null;
                    }
                    TransferActivityProfilesActivity.a aVar19 = TransferActivityProfilesActivity.f42791h;
                    long unitID11 = fVar.getUnitID();
                    String productDisplayName2 = fVar.getProductDisplayName();
                    productDisplayName2.getClass();
                    aVar19.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("GCM_deviceUnitID", unitID11);
                    bundle2.putString("GCM_deviceName", productDisplayName2);
                    Intent intent6 = new Intent(context, (Class<?>) TransferActivityProfilesActivity.class);
                    intent6.putExtras(bundle2);
                    return intent6;
                }
                if (str.equals("TRANSFER_SENSORS")) {
                    if (!p.k(fVar.getUnitID())) {
                        com.garmin.android.apps.connectmobile.devices.settings.realtime.a.C0578a.b(context, fVar.getDisplayName());
                        return null;
                    }
                    TransferSensorsActivity.a aVar20 = TransferSensorsActivity.f42801h;
                    long unitID12 = fVar.getUnitID();
                    String productDisplayName3 = fVar.getProductDisplayName();
                    productDisplayName3.getClass();
                    aVar20.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("GCM_deviceUnitID", unitID12);
                    bundle3.putString("GCM_deviceName", productDisplayName3);
                    Intent intent7 = new Intent(context, (Class<?>) TransferSensorsActivity.class);
                    intent7.putExtras(bundle3);
                    return intent7;
                }
                if (str.equals("WIDGET_LIST_SETUP")) {
                    return com.garmin.android.apps.connectmobile.devices.settings.realtime.a.C0578a.a(context, fVar, com.garmin.android.apps.connectmobile.connectiq.l.WIDGETS);
                }
                if (str.equals("USER_PROFILE")) {
                    return new Intent(context, (Class<?>) GCMUserSettingsActivity.class);
                }
                if (str.equals("WIFI_SETUP")) {
                    if (!p.k(fVar.getUnitID())) {
                        com.garmin.android.apps.connectmobile.devices.settings.realtime.a.C0578a.b(context, fVar.getDisplayName());
                        return null;
                    }
                    GCMWiFiNetworksActivity.a aVar21 = GCMWiFiNetworksActivity.f43245f;
                    long unitID13 = fVar.getUnitID();
                    String productNumber2 = fVar.getProductNumber();
                    String productDisplayName4 = fVar.getProductDisplayName();
                    String strD2 = t.d(fVar);
                    aVar21.getClass();
                    return GCMWiFiNetworksActivity.a.b(context, unitID13, productNumber2, productDisplayName4, strD2, false);
                }
                if (str.equals("LTE_SETUP")) {
                    return LTESubscriptionManagerActivity.a.a(LTESubscriptionManagerActivity.f43457e, context, fVar.getUnitID(), false, 12);
                }
                if (str.equals("DEVICE_BACKUPS")) {
                    DeviceBackupActivity.a aVar22 = DeviceBackupActivity.f42558c;
                    long unitID14 = fVar.getUnitID();
                    aVar22.getClass();
                    return DeviceBackupActivity.a.a(context, unitID14);
                }
                if (str.equals("MANAGE_APP_NOTIFICATIONS")) {
                    GNCSOptOutSettingsActivity.f35738a.getClass();
                    return new Intent(context, (Class<?>) GNCSOptOutSettingsActivity.class);
                }
                if (str.equals("DEVICE_GENERATED_ACTIVITIES")) {
                    if (!p.k(fVar.getUnitID())) {
                        com.garmin.android.apps.connectmobile.devices.settings.realtime.a.C0578a.b(context, fVar.getDisplayName());
                        return null;
                    }
                    if (((bu0.i) KoinJavaComponent.get$default(bu0.i.class, null, null, 6, null)).a(Long.valueOf(fVar.getUnitID()))) {
                        RecordActivitySettingsActivity.f44210b.getClass();
                        return new Intent(context, (Class<?>) RecordActivitySettingsActivity.class);
                    }
                    if (((bu0.i) KoinJavaComponent.get$default(bu0.i.class, null, null, 6, null)).a(null)) {
                        new androidx.appcompat.app.e.a(context).setTitle(context.getString(R.string.lbl_activity_in_progress)).setMessage(context.getString(R.string.msg_end_current_activity)).setCancelable(false).setPositiveButton(R.string.lbl_ok, new vu1.k(16)).create().show();
                        return null;
                    }
                    if (fVar.g3()) {
                        RecordActivitySettingsActivity.a aVar23 = RecordActivitySettingsActivity.f44210b;
                        long unitID15 = fVar.getUnitID();
                        aVar23.getClass();
                        Intent intent8 = new Intent(context, (Class<?>) RecordActivitySettingsActivity.class);
                        intent8.putExtra("extra_device_id", unitID15);
                        return intent8;
                    }
                    ActivityRecordingActivity.a aVar24 = ActivityRecordingActivity.f30163b;
                    long unitID16 = fVar.getUnitID();
                    String displayName2 = fVar.getDisplayName();
                    String imageURL = fVar.getImageURL();
                    aVar24.getClass();
                    Intent intent9 = new Intent(context, (Class<?>) ActivityRecordingActivity.class);
                    Bundle bundle4 = new Bundle();
                    bundle4.putLong("GCM_deviceUnitID", unitID16);
                    bundle4.putString("GCM_deviceName", displayName2);
                    bundle4.putString("GCM_extra_device_image_url", imageURL);
                    intent9.putExtras(bundle4);
                    return intent9;
                }
                if (str.equals("LTE_AND_INREACH_SETUP")) {
                    return InReachLTEActivationRedirectActivity.a.a(InReachLTEActivationRedirectActivity.f43507a, context, Long.valueOf(fVar.getUnitID()), 12);
                }
                if (str.equals("FIND_MY_DEVICE_MAP")) {
                    FindMyDeviceActivity.a aVar25 = FindMyDeviceActivity.f43421e;
                    long unitID17 = fVar.getUnitID();
                    aVar25.getClass();
                    Intent intent10 = new Intent(context, (Class<?>) FindMyDeviceActivity.class);
                    intent10.putExtra("extra_device_id", unitID17);
                    return intent10;
                }
                if (str.equals(gw2.f.BIRTHDATE_CUSTOMER_SUPPORT.f79889a)) {
                    return new Intent(context, (Class<?>) UpdateBirthdateActivity.class);
                }
                if (str.equals("DEVICE_WORKOUT_LIST")) {
                    MyWorkoutsActivity.a aVar26 = MyWorkoutsActivity.f49529a;
                    long unitID18 = fVar.getUnitID();
                    aVar26.getClass();
                    Intent intent11 = new Intent(context, (Class<?>) MyWorkoutsActivity.class);
                    intent11.putExtra("extra_device_id", unitID18);
                    return intent11;
                }
                if (str.equals("NOTIFICATIONS")) {
                    if (!p.k(fVar.getUnitID())) {
                        com.garmin.android.apps.connectmobile.devices.settings.realtime.a.C0578a.b(context, fVar.getDisplayName());
                        return null;
                    }
                    NotificationOffActivity.a aVar27 = NotificationOffActivity.f43557e;
                    long unitID19 = fVar.getUnitID();
                    String displayName3 = fVar.getDisplayName();
                    aVar27.getClass();
                    Intent intent12 = new Intent(context, (Class<?>) NotificationOffActivity.class);
                    intent12.putExtra("GCM_deviceDisplayName", displayName3);
                    intent12.putExtra("GCM_deviceUnitID", unitID19);
                    return intent12;
                }
                if (str.equals("AUTO_ACTIVITY_CONSENT")) {
                    DeviceAutoDetectActivity.a aVar28 = DeviceAutoDetectActivity.f41730c;
                    long unitID20 = fVar.getUnitID();
                    aVar28.getClass();
                    Intent intent13 = new Intent(context, (Class<?>) DeviceAutoDetectActivity.class);
                    intent13.putExtra("EXTRA_DEVICE_UNIT_ID", unitID20);
                    return intent13;
                }
                if (!str.equals("TUTORIALS")) {
                    com.garmin.android.apps.connectmobile.devices.settings.realtime.a.f34356b.error("Did not find an intent for external ".concat(str));
                    return null;
                }
                DeviceTutorialsActivity.a aVar29 = DeviceTutorialsActivity.f34381b;
                String productNumber3 = fVar.getProductNumber();
                productNumber3.getClass();
                String productDisplayName5 = fVar.getProductDisplayName();
                productDisplayName5.getClass();
                String applicationKey = fVar.getApplicationKey();
                applicationKey.getClass();
                o90.a aVar30 = new o90.a(fVar.getImageURL(), (Integer) null, fVar.a1(), fVar.t0(), fVar.r2(), fVar.f3(), fVar.w1(), fVar.L(), 2, (p005kotlin.jvm.internal.j) null);
                aVar29.getClass();
                return DeviceTutorialsActivity.a.a(context, productNumber3, productDisplayName5, applicationKey, aVar30);
            }
            String sku = fVar.getSku();
            if (sku == null || w.J(sku)) {
                uri = com.garmin.android.apps.connectmobile.devices.settings.realtime.a.f34357c;
            } else {
                pc0.f.f137206a.getClass();
                com.garmin.android.apps.connectmobile.devices.model.e eVar4 = pc0.f.f137207b.get(sku);
                if (eVar4 == null || (productPageUrl = eVar4.getProductPageUrl()) == null) {
                    uri = com.garmin.android.apps.connectmobile.devices.settings.realtime.a.f34357c;
                } else {
                    if (w.J(productPageUrl)) {
                        productPageUrl = null;
                    }
                    if (productPageUrl == null || (uri = Uri.parse(productPageUrl)) == null) {
                        uri = com.garmin.android.apps.connectmobile.devices.settings.realtime.a.f34357c;
                    }
                }
            }
            Intent intent14 = new Intent("android.intent.action.VIEW", uri);
            if (intent14.resolveActivity(context.getPackageManager()) != null) {
                return intent14;
            }
        }
        return null;
    }

    @Override // vw2.a
    public final bv2.b h(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new bv2.b(new wz1.c(16, this, str), new n(this, 1));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/settings/realtime/c$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(Context context, f fVar, gj1.c cVar, com.garmin.android.apps.connectmobile.devices.settings.realtime.b.InterfaceC0579b interfaceC0579b, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, fVar, (i14 & 4) != 0 ? null : cVar, interfaceC0579b);
    }
}
