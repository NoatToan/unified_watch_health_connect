package defpackage;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.miui.tsmclient.service.DKFRequestService;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes3.dex */
public enum yd {
    FIRMWARE((byte) 0),
    FONT((byte) 1),
    RESOURCE((byte) 2),
    RESOURCE_COMPRESS((byte) -126),
    RESOURCE_BASE((byte) -125),
    FIRMWARE_GPS((byte) 3),
    FIRMWARE_GPS_CEP((byte) 4),
    FIRMWARE_GPS_ALM((byte) 5),
    FIRMWARE_GPS_NMEA((byte) 6),
    FIRMWARE_GNS_ALM((byte) 15),
    FIRMWARE_CHANGE_LOG((byte) 16),
    RESOURCE_EXTERNAL(HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE),
    OFFLINE_VOICE_ASSISTANT_RESOURCE(HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY),
    FIRMWARE_GPS_SONY_LLE_BEIDOU((byte) -122),
    FIRMWARE_GPS_SONY_LLE_GPS((byte) -121),
    FIRMWARE_GPS_SONY_LLE_GLONASS((byte) -120),
    FIRMWARE_GPS_SONY_LLE_GALILEO((byte) -119),
    FIRMWARE_GPS_SONY_LLE_QZSS((byte) -118),
    FIRMWARE_AS7000((byte) 7),
    FIRMWARE_DIAL((byte) 8),
    FIRMWARE_MSG((byte) 9),
    FIRMWARE_EMOJI((byte) 10),
    FONT_LATIN((byte) 11),
    FIRMWARE_NB(AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT),
    FIRMWARE_LITE_APP(DKFRequestService.o),
    FIRMWARE_AGPS_BATCH((byte) -4),
    FIRMWARE_VOICE((byte) -124),
    FIRMWARE_BATCH((byte) -3),
    FIRMWARE_BOOTLOADER((byte) -2),
    FIRMWARE_GPS_GLN_EPO((byte) -116),
    FIRMWARE_QUERY((byte) -1);

    public byte t;

    yd(byte b2) {
        this.t = b2;
    }

    public static yd a(int i) {
        for (yd ydVar : values()) {
            if (i == (ydVar.a() & 255)) {
                return ydVar;
            }
        }
        return FIRMWARE;
    }

    public byte a() {
        return this.t;
    }
}
