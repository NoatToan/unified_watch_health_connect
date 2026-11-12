package defpackage;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes11.dex */
public enum fd {
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
    ALERT_PACE(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT),
    ALERT_HR(HMProSyncDataBaseProfile.DATA_TYPE_PAI),
    ALERT_LOVE((byte) -2),
    ALERT_THIRD_APP((byte) -6);

    public byte t;

    fd(byte b2) {
        this.t = b2;
    }

    public byte a() {
        return this.t;
    }
}
