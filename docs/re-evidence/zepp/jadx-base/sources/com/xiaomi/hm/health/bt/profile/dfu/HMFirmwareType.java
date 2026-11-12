package com.xiaomi.hm.health.bt.profile.dfu;

/* JADX INFO: loaded from: classes12.dex */
public enum HMFirmwareType {
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
    RESOURCE_EXTERNAL((byte) 18),
    OFFLINE_VOICE_ASSISTANT_RESOURCE((byte) 19),
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
    FIRMWARE_NB((byte) 12),
    FIRMWARE_LITE_APP((byte) -96),
    FIRMWARE_AGPS_BATCH((byte) -4),
    FIRMWARE_VOICE((byte) -124),
    FIRMWARE_BATCH((byte) -3),
    FIRMWARE_BOOTLOADER((byte) -2),
    FIRMWARE_GPS_GLN_EPO((byte) -116),
    FIRMWARE_QUERY((byte) -1);

    private byte mValue;

    HMFirmwareType(byte value) {
        this.mValue = (byte) 0;
        this.mValue = value;
    }

    public static HMFirmwareType fromValue(int type) {
        for (HMFirmwareType hMFirmwareType : values()) {
            if (type == (hMFirmwareType.getValue() & 255)) {
                return hMFirmwareType;
            }
        }
        return FIRMWARE;
    }

    public byte getValue() {
        return this.mValue;
    }
}
