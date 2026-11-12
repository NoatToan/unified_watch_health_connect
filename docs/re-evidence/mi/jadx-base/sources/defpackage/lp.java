package defpackage;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes3.dex */
public enum lp {
    RFU((byte) 0),
    AUTH_CP((byte) 1),
    AUTH_MIUI((byte) 2),
    ECF((byte) 3),
    CTS((byte) 4),
    PPCP((byte) 5),
    GRSP_CP((byte) 6),
    GRSP_DATA((byte) 7),
    GDSP_CP((byte) 8),
    GDSP_DATA((byte) 9),
    BATTERY((byte) 10),
    STEP((byte) 11),
    USER(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT),
    SLRE(HMProSyncDataBaseProfile.DATA_TYPE_PAI),
    WEATHER(HMProSyncDataBaseProfile.DATA_TYPE_COACHING),
    SPORT_SHOW((byte) 15),
    APDU((byte) 16),
    SPEECH_CP((byte) 17),
    SPEECH_DATA(HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE),
    DISS(HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY),
    IAS((byte) 20),
    HRS_MEASURE((byte) 21),
    HRS_CP((byte) 22),
    ANS_NEW((byte) 23),
    ANS_CP((byte) 24),
    DFU_CP((byte) 25),
    DFU_PACKET((byte) 26),
    ALIPAY((byte) 27),
    FTMS_CP((byte) 28),
    FTMS_TD(HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR),
    FTMS_STATUS(HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC),
    FTMS_FEATURE((byte) 31),
    CHANNEL_UP((byte) 32),
    CHANNEL_DOWN(SettingsModule.VALUE_TYPE_STRING_ENUM),
    DEVICE_FEATURE((byte) 34),
    NEW_VERSION(HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL),
    VERSION((byte) -1);

    public byte t;

    lp(byte b2) {
        this.t = b2;
    }
}
