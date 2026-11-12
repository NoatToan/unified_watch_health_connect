package rd2;

import java.util.Observable;

/* JADX INFO: loaded from: classes11.dex */
public class f extends Observable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f152044d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f152045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f152046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f152047c;

    public enum a {
        SEGMENT_CAPABLE("is_segment_capable"),
        GCJ02_COURSE_CAPABLE("gcj02_course_capable"),
        ACTIVITY_COURSE_CAPABLE("activity_course_capable"),
        /* JADX INFO: Fake field, exist only in values array */
        VIVOHUB_CONFIGURABLE("is_vivohub_configurable"),
        SOLAR_PANEL_UTILIZATION_CAPABLE("solarPanelUtilizationCapable"),
        NFC_CAPABLE("nfc_capable"),
        LOW_HR_ALERT_CAPABLE("lowHrAlertCapable"),
        HIGH_HR_ALERT_CAPABLE("abnormalHeartRateAlertCapable"),
        SPECTATOR_MESSAGING_CAPABLE("spectatorMessagingCapable"),
        TRAINING_STATUS_CAPABLE("trainingStatusCapable"),
        TRAINING_STATUS_PAUSE_CAPABLE("trainingStatusPauseCapable"),
        MEASUREMENT_UNIT_SETTING_CAPABLE("measurementUnitSettingCapable"),
        POWER_CURVE_CAPABLE("powerCurveCapable"),
        SECONDARY_WORKOUT_STEP_TARGET_CAPABLE("secondaryWorkoutStepTargetCapable"),
        ASSISTANCE_PLUS_CAPABLE("assistancePlusCapable"),
        EMERGENCY_CALLING_CAPABLE("emergencyCallingCapable"),
        SOLAR_CHARGE_CAPABLE("solarChargeCapable"),
        DIVE_APP_SYNC_CAPABLE("diveAppSyncCapable"),
        DAY_OF_WEEK_SLEEP_WINDOW_CAPABLE("dayOfWeekSleepWindowCapable"),
        APPLY_BACKUP_CAPABLE("applyBackupCapable"),
        HILLSCORE_ENDURANCESCORE_CAPABLE("hillScoreAndEnduranceScoreCapable"),
        BODY_BATTERY_TRUE_UP_CAPABLE("bodyBatteryTrueUpCapable"),
        /* JADX INFO: Fake field, exist only in values array */
        RECHARGEABLE_SENSOR_CAPABLE("rechargeableSensorCapable"),
        START_ACTIVITY_CAPABLE("startActivityCapable"),
        PENDING_ACTIVITY_CAPABLE("pendingActivityCapable"),
        FIXED_LOCATION_CAPABLE("fixedLocationCapable"),
        SCREENLESS_DEVICE_CAPABLE("screenlessDeviceCapable"),
        START_STOP_WORKOUT_CAPABLE("startStopWorkoutCapable"),
        FALL_DETECTION_CAPABLE("fallDetectionCapable"),
        DIRECT_ACTIVATION_CAPABLE("directActivationCapable");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f152071a;

        a(String str) {
            this.f152071a = str;
        }
    }

    private f() {
        j jVar = new j();
        this.f152045a = jVar;
        this.f152046b = new g();
        this.f152047c = new i(jVar);
    }

    public static f a() {
        if (f152044d == null) {
            f152044d = new f();
        }
        return f152044d;
    }

    public static synchronized void b() {
        f fVarA = a();
        fVarA.setChanged();
        fVarA.notifyObservers();
        fVarA.clearChanged();
    }
}
