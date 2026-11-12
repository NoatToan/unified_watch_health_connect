package com.xiaomi.hm.health.bt.classic;

import com.xiaomi.hm.health.bt.model.HMDisplaySetting;

/* JADX INFO: loaded from: classes19.dex */
public enum Protocol {
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
    USER((byte) 12),
    SLRE((byte) 13),
    WEATHER((byte) 14),
    SPORT_SHOW((byte) 15),
    APDU((byte) 16),
    SPEECH_CP((byte) 17),
    SPEECH_DATA((byte) 18),
    DISS((byte) 19),
    IAS((byte) 20),
    HRS_MEASURE((byte) 21),
    HRS_CP((byte) 22),
    ANS_NEW((byte) 23),
    ANS_CP((byte) 24),
    DFU_CP((byte) 25),
    DFU_PACKET((byte) 26),
    ALIPAY((byte) 27),
    FTMS_CP((byte) 28),
    FTMS_TD((byte) 29),
    FTMS_STATUS((byte) 30),
    FTMS_FEATURE((byte) 31),
    CHANNEL_UP((byte) 32),
    CHANNEL_DOWN((byte) 33),
    DEVICE_FEATURE(HMDisplaySetting.TYPE_HAWK_SWK),
    NEW_VERSION((byte) 35),
    VERSION((byte) -1);

    private byte value;

    Protocol(byte value) {
        this.value = value;
    }

    public static Protocol from(byte value) {
        for (Protocol protocol : values()) {
            if (protocol.getValue() == value) {
                return protocol;
            }
        }
        return RFU;
    }

    public byte getValue() {
        return this.value;
    }
}
