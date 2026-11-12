package com.xiaomi.hm.health.bt.sdk.data;

/* JADX INFO: loaded from: classes11.dex */
public enum VibrateType {
    APP_NOTIFY,
    INCOMING_CALL,
    SMS,
    EMAIL,
    SPORT_REACH_GOAL,
    ALARM,
    LONG_SIT,
    DISCONNECT,
    EVENT_REMIND,
    FIND_BAND,
    TODO,
    COUNT_DOWN,
    SCHEDULE,
    INVALID;

    public static VibrateType fromValue(int i) {
        for (VibrateType vibrateType : values()) {
            if (vibrateType.ordinal() == i) {
                return vibrateType;
            }
        }
        return INVALID;
    }
}
