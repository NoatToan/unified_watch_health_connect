package defpackage;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;

/* JADX INFO: loaded from: classes3.dex */
public enum ik {
    ALARM_DELAY(-1),
    ALARM_CANCEL(-2),
    UNKNOWN(0),
    SLEEPING(1),
    AWAKING(2),
    GOALR(3),
    KEY(4),
    TAP_TAP(5),
    NON_WEAR(6),
    END_CALL(7),
    FIND_PHONE(8),
    IGNORE_CALL(9),
    SETTINGS_CHANGED(10),
    LONG_KEY(11),
    ECG_SUCCESS(12),
    ECG_FAILED(13),
    WAKE_UP(14),
    STOP_FIND_PHONE(15),
    MUTE_PHONE(16),
    RECORD(17),
    NFC_TRADE(18),
    ILLEGAL_BIND(19),
    SPORT(20),
    SPEECH(21),
    MTU_CHANGE(22),
    JHM_UNBIND(24),
    REMINDER_CHANGED(25),
    ALARM_CHANGED(26),
    FALL_DOWN(27),
    BATTERY_CHANGED(28),
    HEART_RATE_ALL_DAY(33),
    MULTI_DEVICE_CONNECTION_CHANGED(30),
    BREAK_PPG(70),
    STATISTIC_READY(32),
    GOAL_CHANGE(34),
    ALL_DAY_PRESSURE_CHANGE(36),
    ASYNC_PIECE(252),
    NOTIFICATION_BLOCK(VibrateModeSetViewModel.DEFAULT_BBJI),
    DELETE_MSG(253),
    MUSIC_CONTROL(254),
    EARBUD_STATUS(29),
    HEART_RATE_DETECTION_INTERVAL(39),
    ATRIAL_FIB_CHANGED(40),
    INNER_EAR_VOLUME_REPORT_AND_USER_TIME(41),
    HEADSET_REQUEST_APP_OPERATION(42),
    NOISE_REDUCTION_CHANGES(44),
    EQUALIZER_CONFIG_TAKES_EFFECT(46),
    HEAD_NECK_ANGLE_CHANGE(45),
    CERVICAL_PROTECTION_SOUND(48),
    CONTINUOUS_BLOOD_OXYGEN_MONITORING_SWITCH_STATE_CHANGE(49),
    CHANGES_IN_LOW_BLOOD_OXYGEN_REMINDERS(50);

    public int t;

    ik(int i) {
        this.t = i;
    }

    public static ik a(int i) {
        for (ik ikVar : values()) {
            if (ikVar.a() == i) {
                return ikVar;
            }
        }
        return UNKNOWN;
    }

    public int a() {
        return this.t;
    }
}
