package com.xiaomi.hm.health.ui.smartplay.customvibrate.model;

/* JADX INFO: loaded from: classes22.dex */
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

    public static VibrateType fromValue(int value) {
        for (VibrateType vibrateType : values()) {
            if (vibrateType.ordinal() == value) {
                return vibrateType;
            }
        }
        return INVALID;
    }
}
