package ni2;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lni2/b;", "", "", Action.KEY_ATTRIBUTE, "parentSection", "uiComposition", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum b {
    ACTIVITIES("activities", "device", "activitiesSettingsUI.json"),
    ACTIVITY_OPTIONS("activityOptions", "device", "activityOptionsSettingsUI.json"),
    ACTIVITY_TRACKING("activityTracking", "device", "activityTrackingSettingsUI.json"),
    APPEARANCE("appearance", "device", "appearanceSettingsUI.json"),
    CUSTOM_STRIDE("customStride", "customStride", "customStrideSettingsUI.json"),
    DEVICE("device", "device", "deviceSettingsUI.json"),
    DEVICE_USER("deviceUser", "user", "deviceUserSettingsUI.json"),
    CONTROLS_MENU_RESET("controlsMenuReset", "controlsMenuReset", "appearanceSettingsUI.json"),
    GENERAL("general", "device", "generalSettingsUI.json"),
    RTS_WALK_STRIDE_LENGTH("rts_walk_stride_length", "customStride", "walkCustomStrideSettingsUI.json"),
    RTS_GOALS_DAILY_STEPS("rts_goals_daily_steps", "device", "goalDailyStepsSettingsUI.json"),
    RTS_GOALS_FLOORS("rts_goals_floors", "device", "goalFloorsClimbedSettingsUI.json"),
    RTS_GOALS_WEEKLY_INTENSITY("rts_goals_weekly_intensity", "device", "goalWeeklyIntensityMinutesSettingsUI.json"),
    SEARCH_INDEX("search", "search", "searchIndex.json"),
    SOUND_AND_ALERTS("soundsAndAlerts", "device", "soundsAndAlertsSettingsUI.json"),
    USER("user", "user", "userSettingsUI.json");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f126216c;

    b(String str, String str2, String str3) {
        this.f126214a = str;
        this.f126215b = str2;
        this.f126216c = str3;
    }
}
