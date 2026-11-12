package mh2;

import ch.qos.logback.core.joran.action.Action;
import com.mapbox.common.HttpHeaders;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmh2/h;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum h {
    AGE(HttpHeaders.AGE),
    ALERT_TONES("alertTones"),
    ALL_BOOLEAN("allBoolean"),
    ANY_BOOLEAN("anyBoolean"),
    AUDIO_PROMPT_FREQUENCY("audioPromptFrequency"),
    BIRTH_DATE("birthdate"),
    BLOOD_EFFICIENCY("bloodEfficiency"),
    CONTROLS_MENU_WATCH_FACE("controlsMenuWatchFace"),
    CRITICAL_SWIM_SPEED_PICKER("criticalSwimSpeedPicker"),
    CUSTOM_STRIDE_CALCULATION("customStrideCalculation"),
    CUSTOM_STRIDE_DISTANCE("customStrideDistance"),
    CUSTOM_STRIDE_STEPS("customStrideSteps"),
    DATE_PICKER("datePicker"),
    DEFAULT("default"),
    DAILY_STEPS("dailySteps"),
    FLOORS_CLIMBED("dailyFloorsClimbed"),
    HEIGHT_PICKER("heightPicker"),
    HYDRATION_CONTAINER("hydrationContainer"),
    HYDRATION_DAILY_GOAL("hydrationDailyGoal"),
    INTENSITY_MINUTES("intensityMinutes"),
    MODERATE_INTENSITY_ZONE("moderateIntensityZone"),
    MENU_DEFAULT("menuDefault"),
    MENU_HELP("menuHelp"),
    MENU_REMOVE_DEVICE("removeDevice"),
    MENU_SYNC("sync"),
    MENU_MANAGE_DEVICE_PRIORITY("manageDevicePriority"),
    PERIOD_CYCLE_LENGTH("periodCycleLength"),
    PERIOD_DURATION("periodDuration"),
    PICKER("picker"),
    PICKER_LABEL("pickerLabel"),
    PULSE_OX_III("pulseOxIII"),
    SLEEP_BED_TIME_PICKER("sleepBedTimePicker"),
    SLEEP_WAKE_TIME_PICKER("sleepWakeTimePicker"),
    SMART_NOTIFICATIONS("smartNotifications"),
    TIME_PICKER("timePicker"),
    TOTAL_BOTTOM_TIME("totalBottomTimePicker"),
    TOTAL_BOTTOM_TIME_ALL_DIVES("totalBottomTimeAllDives"),
    TOTAL_STEPS("totalSteps"),
    VIGOROUS_INTENSITY_ZONE("vigorousIntensityZone"),
    WEIGHT_PICKER("weightPicker");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f118578a;

    h(String str) {
        this.f118578a = str;
    }
}
