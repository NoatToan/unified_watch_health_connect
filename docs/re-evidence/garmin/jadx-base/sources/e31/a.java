package e31;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v55 e31.a[], still in use, count: 1, list:
  (r0v55 e31.a[]) from 0x0377: CONSTRUCTOR (r0v55 e31.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Le31/a;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    ONBOARDING_COMPLETE("onboarding_complete"),
    HAS_CONTACTS("has_contacts"),
    HAS_EMERGENCY_CONTACTS("has_emergency_contacts"),
    ENTERED_JET_LAG("entered_jet_lag"),
    ENTERED_KOMOOT("entered_komoot"),
    ENTERED_GARMIN_COACH("entered_garmin_coach"),
    ENTERED_COURSES("entered_courses"),
    ENTERED_PACE_PRO("entered_pace_pro"),
    ENTERED_POWER_GUIDE("entered_power_guide"),
    ENTERED_WORKOUTS("entered_workouts"),
    ENTERED_SOLAR_INTENSITY("entered_solar_intensity"),
    ENTERED_GROUP_RIDE("entered_group_ride"),
    ENTERED_GROUPS("entered_groups"),
    ENTERED_TRAINING_PLANS("entered_training_plans"),
    ENTERED_AB_SYNAPSE("entered_ab_synapse"),
    ENTERED_AB_QUANTUM("entered_ab_quantum"),
    ENTERED_BPM_REMINDERS("entered_bpm_reminders"),
    ENTERED_GARMIN_PILOT("entered_garmin_pilot"),
    ENTERED_PULSE_OX_SETTINGS("entered_pulse_ox_settings"),
    ENTERED_ACTIVITY_TRACKING_SCREEN("entered_activity_tracking_screen"),
    ENTERED_CUSTOMIZE_WATCH_FACE("entered_customize_watch_face"),
    ENTERED_WIDGETS_SETUP_SCREEN("entered_widgets_setup_screen"),
    ENTERED_ALARMS("entered_alarms"),
    ENTERED_LTE_SETUP("entered_lte_setup"),
    ENTERED_LIVE_TRACK("entered_live_track"),
    ENTERED_MANAGE_PEOPLE_SCREEN("entered_manage_people_screen"),
    ENTERED_MAKE_CONNECTIONS_SCREEN("entered_make_connections_screen"),
    ENTERED_DEVICE_DISPLAY_NAME("entered_device_display_name"),
    ENTERED_SMART_WAKE_ALARM("entered_smart_wake_alarm"),
    ENTERED_MENSTRUAL_CYCLE_TRACKING("entered_menstrual_cycle_tracking"),
    ENTERED_GARMIN_MESSENGER("entered_garmin_messenger"),
    HEART_RATE_ZONES_CONFIGURED("heart_rate_zones_configured"),
    POWER_ZONES_CONFIGURED("power_zones_configured"),
    HAS_INSTALLED_MUSIC_APPS("has_installed_music_apps"),
    CREATED_GARMIN_PAY_WALLET("created_garmin_pay_wallet"),
    STORED_WIFI_NETWORK("stored_wifi_network"),
    HAS_CONNECT_IQ_APP_INSTALLED("has_connect_iq_app_installed"),
    VISITED_BIKE_ALARM_TUTORIAL("visited_bike_alarm_tutorial"),
    ECG_APP_ENABLED("ecg_app_enabled"),
    OPENED_VOICE_ASSISTANT_SETUP_PAGE("opened_voice_assistant_setup_page"),
    OPENED_VOICE_COMMAND_SETUP_PAGE("opened_voice_command_setup_page"),
    GARMIN_DIVE_APP_ONBOARDING("garmin_dive_app_onboarding"),
    HAS_MESSENGER_APP_INSTALLED("has_messenger_app_installed"),
    HAS_DEZL_APP_INSTALLED("has_dezl_app_installed"),
    HAS_TOPO_ACTIVE_MAPS_SUPPORT("has_topo_active_maps_support"),
    HAS_INREACH_SUBSCRIPTION("has_inreach_subscription"),
    INREACH_SUBSCRIPTION_ACTIVATED_ON_DEVICE("inreach_subscription_activated_on_device"),
    HAS_ENTERED_LIFESTYLE_LOGGING("has_entered_lifestyle_logging"),
    HAS_ENTERED_DAILY_STATS("has_entered_daily_stats"),
    HAS_ENTERED_MORNING_REPORT("has_entered_morning_report"),
    HAS_ENTERED_RECORD_ACTIVITIES("has_entered_record_activities"),
    HAS_ENTERED_SET_GOALS("has_entered_set_goals"),
    HAS_ENTERED_VO2MAX_TEST("has_entered_VO2max_test"),
    HAS_PRECISE_LOCATION_ACCESS("has_precise_location_access"),
    HAS_ENTERED_SELECT_ACTIVITIES("has_entered_select_activities");


    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final /* synthetic */ c f62744b1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62768a;

    static {
        f62744b1 = new c(aVarArr);
        new C1317a(null);
    }

    private a(String str) {
        super(str, i);
        this.f62768a = str;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f62742a1.clone();
    }

    /* JADX INFO: renamed from: e31.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le31/a$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1317a {
        public /* synthetic */ C1317a(j jVar) {
            this();
        }

        private C1317a() {
        }
    }
}
