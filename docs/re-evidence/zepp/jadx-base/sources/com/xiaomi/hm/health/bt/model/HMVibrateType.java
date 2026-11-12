package com.xiaomi.hm.health.bt.model;

/* JADX INFO: loaded from: classes19.dex */
public enum HMVibrateType {
    MOTOR_GOAL_COMPLETE(7),
    MOTOR_UNKNOWN(255),
    MOTOR_NOTIFY(13),
    MOTOR_CALL(14),
    MOTOR_DISCONNECT(15),
    MOTOR_SMART_ALARM(16),
    MOTOR_ALARM(17),
    MOTOR_GOAL(18),
    MOTOR_AUTH(19),
    MOTOR_SHUTDOWN(20),
    MOTOR_AUTH_SUCCESS(21),
    MOTOR_TEST(22),
    MOTOR_SPEED_WARNING(27),
    MOTOR_FIND(30),
    MOTOR_USER_SLEEP(32),
    MOTOR_USER_WEEK_UP(33),
    MOTOR_W_GOAL_COMPLETE(34);

    private int mType;

    HMVibrateType(int type) {
        this.mType = type;
    }

    public static HMVibrateType from(int value) {
        for (HMVibrateType hMVibrateType : values()) {
            if (hMVibrateType.getValue() == value) {
                return hMVibrateType;
            }
        }
        return MOTOR_UNKNOWN;
    }

    public int getValue() {
        return this.mType;
    }
}
