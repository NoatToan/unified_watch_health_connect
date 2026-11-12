package com.xiaomi.hm.health.bt.profile.alert;

/* JADX INFO: loaded from: classes10.dex */
public enum HMAlertMode {
    ALERT_SIMPLE((byte) 0),
    ALERT_EMAIL((byte) 1),
    ALERT_NEWS((byte) 2),
    ALERT_INCALL((byte) 3),
    ALERT_MISSED_CALL((byte) 4),
    ALERT_SMS((byte) 5),
    ALERT_VOICE_MAIL((byte) 6),
    ALERT_SCHEDULE((byte) 7),
    ALERT_HIGH_PRIOR((byte) 8),
    ALERT_INSTANT_MSG((byte) 9),
    ALERT_STOP((byte) 10),
    ALERT_FIND((byte) 11),
    ALERT_PACE((byte) 12),
    ALERT_HR((byte) 13),
    ALERT_LOVE((byte) -2),
    ALERT_THIRD_APP((byte) -6);

    public byte mValue;

    HMAlertMode(byte value) {
        this.mValue = (byte) 0;
        this.mValue = value;
    }

    public byte getValue() {
        return this.mValue;
    }
}
