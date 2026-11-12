package vg1;

import com.garmin.android.apps.connectmobile.bikesensors.VectorGeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.bikesensors.orca.OrcaGeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.bikesensors.orca.OrcaUserSettingsActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQActivitiesAndAppsActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppearanceActivity;
import com.garmin.android.apps.connectmobile.connectiq.DefaultConnectIQActivitiesAndAppsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.CannedTextResponsesActivity;
import com.garmin.android.apps.connectmobile.settings.devices.EdgeGeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.Forerunner30AppearanceSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.Forerunner30DeviceSettingsDisplayOptions;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.approachS62.ApproachS62GeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceActivityOptionsSettingActivityDefault;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceActivityTrackingSettingActivityDefault;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceAppearanceSettingActivityDefault;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceGeneralSettingActivityDefault;
import com.garmin.android.apps.connectmobile.settings.devices.common.DevicePhoneNotificationActivityV3;
import com.garmin.android.apps.connectmobile.settings.devices.common.DevicePhoneNotificationsActivityDefault;
import com.garmin.android.apps.connectmobile.settings.devices.common.DevicePhoneNotificationsActivityVivoActive3LTE;
import com.garmin.android.apps.connectmobile.settings.devices.common.DevicePhoneNotificationsWithPrivacyActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceRunOptionSettingActivityDefault;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsActivityTrackerSetupDefault;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsDisplayOptionsDefault;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSoundsAndAlertSettingActivityDefault;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceUserSettingActivityDefault;
import com.garmin.android.apps.connectmobile.settings.devices.edge130.Edge130GeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.edge130.Edge130UserSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.edge520Plus.Edge520PlusActivityOptionsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.edge520Plus.Edge520PlusUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.edge530830.Edge530830GeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.edge530830.Edge530830UserSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.edgeExplore.EdgeExploreUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusActivityOptionsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusGeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusSoundsAndAlertsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.Fenix5PlusUserSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fenix5Plus.InstinctSoundsAndAlertsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fenix6.Fenix6ActivityTrackingSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fenix6.Fenix6GeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fenix6.Fenix6SoundsAndAlertsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fenix6.Fenix6SportGeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr245m.FR245ActivityTrackingSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr245m.FR245GeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr245m.FR245MSoundAndAlertsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr245m.FR245MUserSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr30.Forerunner30PhoneNotificationsDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.fr45.FR45ActivityOptionsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr45.FR45AppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr45.FR45GeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr45.FR45SoundAndAlertsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityOptionsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645GeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645SoundsAndAlertsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645UserSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr945.FR945ActivityTrackingSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr945.FR945AppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr945.FR945GeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr945.FR945SoundsAndAlertsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr945.FR945UserSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.gentoo.GentooGeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.hrm.HrmGeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.hrm.HrmUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.index.IndexDevicesGeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.indexbpm.IndexBpmAppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.indexbpm.IndexBpmUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale2.IndexScale2AppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale2.IndexScale2UserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.instinct.InstinctActivityTrackingSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.lumen.LumenActivityOptionsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.lumen.LumenActivityTrackingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.lumen.LumenAppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.lumen.LumenGeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.lumen.LumenSoundsAndAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.lumen.LumenUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.marq.MarqActivityTracking;
import com.garmin.android.apps.connectmobile.settings.devices.marq.MarqGeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.marq.MarqSoundsAndAlertsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.swim.SwimActivityOptionsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.swim.SwimActivityTrackingSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.swim.SwimGeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicActivityTracking;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicAppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicGeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicSoundsAndAlertsSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicUserSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3musiclte.Vivoactive3MusicLteActivityTracking;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3musiclte.Vivoactive3MusicLteAppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3musiclte.Vivoactive3MusicLteGeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3musiclte.Vivoactive3MusicLteUserSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive4.Vva4ActivityTrackingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive4.Vva4AppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive4.Vva4GeneralSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive4.Vva4SoundsAndAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3AlertsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3AppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3GeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.VivoSmart4ActivityTracking;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.VivoSmart4AppearanceActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.VivoSmart4GeneralSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.VivoSmart4SoundsAndAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.VivoSmart4UserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.heartratezones.ui.HRZonesConfigVivosportActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvg1/y;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y {
    public static final t A;
    public static final t B;
    public static final t C;
    public static final t D;
    public static final t E;
    public static final t F;
    public static final t G;
    public static final t H;
    public static final t I;
    public static final t J;
    public static final t K;
    public static final t L;
    public static final t M;
    public static final t N;
    public static final t O;
    public static final t P;
    public static final t Q;
    public static final t R;
    public static final t S;
    public static final t T;
    public static final t U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f178216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f178217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f178218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f178219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f178220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f178221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f178222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t f178223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t f178224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t f178225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t f178226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t f178227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final t f178228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t f178229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t f178230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t f178231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t f178232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t f178233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t f178234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t f178235t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final t f178236u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t f178237v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final t f178238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final t f178239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final t f178240y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final t f178241z;

    static {
        new y();
        f178216a = new t(null, false, false, null, Forerunner30AppearanceSettingActivity.class.getName(), DeviceSoundsAndAlertSettingActivityDefault.class.getName(), DeviceActivityOptionsSettingActivityDefault.class.getName(), DeviceActivityTrackingSettingActivityDefault.class.getName(), DeviceUserSettingActivityDefault.class.getName(), DeviceGeneralSettingActivityDefault.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), Forerunner30PhoneNotificationsDeviceSettings.class.getName(), false, false);
        f178217b = new t(null, false, false, null, FR45AppearanceActivity.class.getName(), FR45SoundAndAlertsSettingsActivity.class.getName(), FR45ActivityOptionsSettingActivity.class.getName(), FR245ActivityTrackingSettingsActivity.class.getName(), FR245MUserSettingActivity.class.getName(), FR45GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationActivityV3.class.getName(), false, false);
        f178218c = new t(null, false, false, null, FR45AppearanceActivity.class.getName(), FR45SoundAndAlertsSettingsActivity.class.getName(), FR45ActivityOptionsSettingActivity.class.getName(), FR245ActivityTrackingSettingsActivity.class.getName(), FR245MUserSettingActivity.class.getName(), FR45GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationActivityV3.class.getName(), false, false);
        f178219d = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), false, false, CannedTextResponsesActivity.class.getName(), ConnectIQAppearanceActivity.class.getName(), FR245MSoundAndAlertsSettingsActivity.class.getName(), FR645ActivityOptionsSettingActivity.class.getName(), FR245ActivityTrackingSettingsActivity.class.getName(), FR245MUserSettingActivity.class.getName(), FR245GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationActivityV3.class.getName(), false, false);
        f178220e = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), true, false, CannedTextResponsesActivity.class.getName(), ConnectIQAppearanceActivity.class.getName(), FR245MSoundAndAlertsSettingsActivity.class.getName(), FR645ActivityOptionsSettingActivity.class.getName(), FR245ActivityTrackingSettingsActivity.class.getName(), FR245MUserSettingActivity.class.getName(), FR245GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        f178221f = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), false, false, null, ConnectIQAppearanceActivity.class.getName(), FR645SoundsAndAlertsSettingActivity.class.getName(), FR645ActivityOptionsSettingActivity.class.getName(), FR645ActivityTrackingSettingActivity.class.getName(), FR645UserSettingActivity.class.getName(), FR645GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        f178222g = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), true, false, null, ConnectIQAppearanceActivity.class.getName(), FR645SoundsAndAlertsSettingActivity.class.getName(), FR645ActivityOptionsSettingActivity.class.getName(), FR645ActivityTrackingSettingActivity.class.getName(), FR645UserSettingActivity.class.getName(), FR645GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        f178223h = new t(DefaultConnectIQActivitiesAndAppsActivity.class.getName(), true, false, CannedTextResponsesActivity.class.getName(), FR945AppearanceActivity.class.getName(), FR945SoundsAndAlertsSettingsActivity.class.getName(), FR645ActivityOptionsSettingActivity.class.getName(), FR945ActivityTrackingSettingActivity.class.getName(), FR945UserSettingActivity.class.getName(), FR945GeneralSettingsActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        f178224i = new t(DefaultConnectIQActivitiesAndAppsActivity.class.getName(), true, false, CannedTextResponsesActivity.class.getName(), FR945AppearanceActivity.class.getName(), FR945SoundsAndAlertsSettingsActivity.class.getName(), FR645ActivityOptionsSettingActivity.class.getName(), FR945ActivityTrackingSettingActivity.class.getName(), FR945UserSettingActivity.class.getName(), FR945GeneralSettingsActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        f178225j = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), true, false, CannedTextResponsesActivity.class.getName(), Vivoactive3MusicAppearanceActivity.class.getName(), Vivoactive3MusicSoundsAndAlertsSettingActivity.class.getName(), null, Vivoactive3MusicActivityTracking.class.getName(), Vivoactive3MusicUserSettingActivity.class.getName(), Vivoactive3MusicGeneralSettingActivity.class.getName(), null, null, HRZonesConfigVivosportActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationActivityV3.class.getName(), false, false);
        f178226k = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), true, true, CannedTextResponsesActivity.class.getName(), Vivoactive3MusicLteAppearanceActivity.class.getName(), Vivoactive3MusicSoundsAndAlertsSettingActivity.class.getName(), null, Vivoactive3MusicLteActivityTracking.class.getName(), Vivoactive3MusicLteUserSettingActivity.class.getName(), Vivoactive3MusicLteGeneralSettingActivity.class.getName(), null, null, HRZonesConfigVivosportActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsActivityVivoActive3LTE.class.getName(), false, false);
        f178227l = new t(null, false, false, CannedTextResponsesActivity.class.getName(), LumenAppearanceActivity.class.getName(), LumenSoundsAndAlertsActivity.class.getName(), LumenActivityOptionsActivity.class.getName(), LumenActivityTrackingActivity.class.getName(), LumenUserSettingsActivity.class.getName(), LumenGeneralSettingsActivity.class.getName(), null, null, HRZonesConfigVivosportActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationActivityV3.class.getName(), false, false);
        f178228m = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), true, false, CannedTextResponsesActivity.class.getName(), Vva4AppearanceActivity.class.getName(), Vva4SoundsAndAlertsActivity.class.getName(), null, Vva4ActivityTrackingActivity.class.getName(), Vivoactive3MusicUserSettingActivity.class.getName(), Vva4GeneralSettingActivity.class.getName(), null, null, HRZonesConfigVivosportActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        f178229n = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), true, false, CannedTextResponsesActivity.class.getName(), Vva4AppearanceActivity.class.getName(), Vva4SoundsAndAlertsActivity.class.getName(), null, Vva4ActivityTrackingActivity.class.getName(), Vivoactive3MusicUserSettingActivity.class.getName(), Vva4GeneralSettingActivity.class.getName(), null, null, HRZonesConfigVivosportActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        f178230o = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), true, false, CannedTextResponsesActivity.class.getName(), Vva4AppearanceActivity.class.getName(), Vva4SoundsAndAlertsActivity.class.getName(), null, Vva4ActivityTrackingActivity.class.getName(), Vivoactive3MusicUserSettingActivity.class.getName(), Vva4GeneralSettingActivity.class.getName(), null, null, HRZonesConfigVivosportActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        f178231p = new t(null, false, false, null, null, null, null, null, OrcaUserSettingsActivity.class.getName(), OrcaGeneralSettingsActivity.class.getName(), null, null, null, DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        f178232q = new t(null, false, false, null, null, null, null, null, HrmUserSettingsActivity.class.getName(), HrmGeneralSettingsActivity.class.getName(), null, null, null, DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        f178233r = new t(null, false, false, null, null, null, null, null, HrmUserSettingsActivity.class.getName(), HrmGeneralSettingsActivity.class.getName(), null, null, null, DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        f178234s = new t(null, false, false, null, null, null, null, null, HrmUserSettingsActivity.class.getName(), HrmGeneralSettingsActivity.class.getName(), null, null, null, DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        f178235t = new t(DefaultConnectIQActivitiesAndAppsActivity.class.getName(), false, false, null, null, null, null, null, Edge130UserSettingActivity.class.getName(), Edge130GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        f178236u = new t(DefaultConnectIQActivitiesAndAppsActivity.class.getName(), false, false, null, null, null, null, null, Edge130UserSettingActivity.class.getName(), Edge130GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        f178237v = new t(DefaultConnectIQActivitiesAndAppsActivity.class.getName(), false, false, null, null, null, Edge520PlusActivityOptionsSettingActivity.class.getName(), null, EdgeExploreUserSettingsActivity.class.getName(), EdgeGeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        f178238w = new t(DefaultConnectIQActivitiesAndAppsActivity.class.getName(), false, false, null, null, null, Edge520PlusActivityOptionsSettingActivity.class.getName(), null, Edge520PlusUserSettingsActivity.class.getName(), EdgeGeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        f178239x = new t(DefaultConnectIQActivitiesAndAppsActivity.class.getName(), false, false, null, null, null, Edge520PlusActivityOptionsSettingActivity.class.getName(), null, Edge530830UserSettingActivity.class.getName(), Edge530830GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, true, false);
        f178240y = new t(DefaultConnectIQActivitiesAndAppsActivity.class.getName(), false, false, null, null, null, Edge520PlusActivityOptionsSettingActivity.class.getName(), null, Edge530830UserSettingActivity.class.getName(), Edge530830GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, true, false);
        f178241z = new t(DefaultConnectIQActivitiesAndAppsActivity.class.getName(), false, false, null, null, null, Edge520PlusActivityOptionsSettingActivity.class.getName(), null, Edge530830UserSettingActivity.class.getName(), Edge530830GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, true, false);
        A = new t(DefaultConnectIQActivitiesAndAppsActivity.class.getName(), false, false, null, null, null, Edge520PlusActivityOptionsSettingActivity.class.getName(), null, Edge530830UserSettingActivity.class.getName(), Edge530830GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, true, false);
        B = new t(null, false, false, null, VivoSmart4AppearanceActivity.class.getName(), VivoSmart4SoundsAndAlertsActivity.class.getName(), ActivityOptionsActivity.class.getName(), VivoSmart4ActivityTracking.class.getName(), VivoSmart4UserSettingsActivity.class.getName(), VivoSmart4GeneralSettingsActivity.class.getName(), null, null, HRZonesConfigVivosportActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationActivityV3.class.getName(), false, false);
        C = new t(null, false, false, CannedTextResponsesActivity.class.getName(), Vivomove3AppearanceActivity.class.getName(), Vivomove3AlertsActivity.class.getName(), ActivityOptionsActivity.class.getName(), VivoSmart4ActivityTracking.class.getName(), VivoSmart4UserSettingsActivity.class.getName(), Vivomove3GeneralSettingsActivity.class.getName(), null, null, HRZonesConfigVivosportActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationActivityV3.class.getName(), false, false);
        D = new t(null, false, false, CannedTextResponsesActivity.class.getName(), Vivomove3AppearanceActivity.class.getName(), Vivomove3AlertsActivity.class.getName(), ActivityOptionsActivity.class.getName(), VivoSmart4ActivityTracking.class.getName(), VivoSmart4UserSettingsActivity.class.getName(), Vivomove3GeneralSettingsActivity.class.getName(), null, null, HRZonesConfigVivosportActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationActivityV3.class.getName(), false, false);
        E = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), true, false, CannedTextResponsesActivity.class.getName(), ConnectIQAppearanceActivity.class.getName(), Fenix5PlusSoundsAndAlertsSettingActivity.class.getName(), Fenix5PlusActivityOptionsSettingActivity.class.getName(), FR645ActivityTrackingSettingActivity.class.getName(), Fenix5PlusUserSettingActivity.class.getName(), Fenix5PlusGeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsActivityDefault.class.getName(), false, false);
        F = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), true, false, CannedTextResponsesActivity.class.getName(), ConnectIQAppearanceActivity.class.getName(), Fenix5PlusSoundsAndAlertsSettingActivity.class.getName(), Fenix5PlusActivityOptionsSettingActivity.class.getName(), FR645ActivityTrackingSettingActivity.class.getName(), Fenix5PlusUserSettingActivity.class.getName(), Fenix5PlusGeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        G = new t(null, false, false, CannedTextResponsesActivity.class.getName(), null, InstinctSoundsAndAlertsSettingActivity.class.getName(), Fenix5PlusActivityOptionsSettingActivity.class.getName(), InstinctActivityTrackingSettingActivity.class.getName(), Fenix5PlusUserSettingActivity.class.getName(), Fenix5PlusGeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsActivityDefault.class.getName(), false, false);
        H = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), true, false, CannedTextResponsesActivity.class.getName(), ConnectIQAppearanceActivity.class.getName(), Fenix6SoundsAndAlertsSettingActivity.class.getName(), Fenix5PlusActivityOptionsSettingActivity.class.getName(), Fenix6ActivityTrackingSettingActivity.class.getName(), Fenix5PlusUserSettingActivity.class.getName(), Fenix6GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        I = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), false, false, CannedTextResponsesActivity.class.getName(), ConnectIQAppearanceActivity.class.getName(), Fenix6SoundsAndAlertsSettingActivity.class.getName(), Fenix5PlusActivityOptionsSettingActivity.class.getName(), Fenix6ActivityTrackingSettingActivity.class.getName(), Fenix5PlusUserSettingActivity.class.getName(), Fenix6SportGeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        J = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), true, false, CannedTextResponsesActivity.class.getName(), ConnectIQAppearanceActivity.class.getName(), MarqSoundsAndAlertsSettingActivity.class.getName(), Fenix5PlusActivityOptionsSettingActivity.class.getName(), MarqActivityTracking.class.getName(), Fenix5PlusUserSettingActivity.class.getName(), MarqGeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        K = new t(ConnectIQActivitiesAndAppsActivity.class.getName(), true, false, CannedTextResponsesActivity.class.getName(), ConnectIQAppearanceActivity.class.getName(), Fenix6SoundsAndAlertsSettingActivity.class.getName(), Fenix5PlusActivityOptionsSettingActivity.class.getName(), Fenix6ActivityTrackingSettingActivity.class.getName(), Fenix5PlusUserSettingActivity.class.getName(), GentooGeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
        L = new t(null, false, false, null, FR45AppearanceActivity.class.getName(), FR945SoundsAndAlertsSettingsActivity.class.getName(), SwimActivityOptionsActivity.class.getName(), SwimActivityTrackingSettingActivity.class.getName(), FR645UserSettingActivity.class.getName(), SwimGeneralSettingsActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), Forerunner30DeviceSettingsDisplayOptions.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationActivityV3.class.getName(), false, false);
        M = new t(null, false, false, null, IndexScale2AppearanceActivity.class.getName(), null, null, null, IndexScale2UserSettingsActivity.class.getName(), IndexDevicesGeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), DeviceSettingsDisplayOptionsDefault.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsActivityDefault.class.getName(), false, true);
        N = new t(null, false, false, null, null, DeviceSoundsAndAlertSettingActivityDefault.class.getName(), null, DeviceActivityTrackingSettingActivityDefault.class.getName(), DeviceUserSettingActivityDefault.class.getName(), ApproachS62GeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), DeviceSettingsDisplayOptionsDefault.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsActivityDefault.class.getName(), false, false);
        O = new t(null, false, false, null, IndexBpmAppearanceActivity.class.getName(), null, null, null, IndexBpmUserSettingsActivity.class.getName(), IndexDevicesGeneralSettingActivity.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), DeviceSettingsDisplayOptionsDefault.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsActivityDefault.class.getName(), false, true);
        P = new t(null, false, false, null, null, null, null, null, null, VectorGeneralSettingsActivity.class.getName(), null, null, null, DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        Q = new t(null, false, false, null, null, null, null, null, null, VectorGeneralSettingsActivity.class.getName(), null, null, null, DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        R = new t(null, false, false, null, null, null, null, null, HrmUserSettingsActivity.class.getName(), HrmGeneralSettingsActivity.class.getName(), null, null, null, DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        S = new t(null, false, false, null, null, null, null, null, HrmUserSettingsActivity.class.getName(), HrmGeneralSettingsActivity.class.getName(), null, null, null, DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        T = new t(null, false, false, null, null, null, null, null, HrmUserSettingsActivity.class.getName(), HrmGeneralSettingsActivity.class.getName(), null, null, null, DeviceSettingsActivityTrackerSetupDefault.class.getName(), null, null, null, false, false);
        U = new t(null, false, false, null, DeviceAppearanceSettingActivityDefault.class.getName(), DeviceSoundsAndAlertSettingActivityDefault.class.getName(), DeviceActivityOptionsSettingActivityDefault.class.getName(), DeviceActivityTrackingSettingActivityDefault.class.getName(), DeviceUserSettingActivityDefault.class.getName(), DeviceGeneralSettingActivityDefault.class.getName(), null, null, HRZonesConfigActivity.class.getName(), DeviceSettingsActivityTrackerSetupDefault.class.getName(), DeviceSettingsDisplayOptionsDefault.class.getName(), DeviceRunOptionSettingActivityDefault.class.getName(), DevicePhoneNotificationsWithPrivacyActivity.class.getName(), false, false);
    }

    private y() {
    }
}
