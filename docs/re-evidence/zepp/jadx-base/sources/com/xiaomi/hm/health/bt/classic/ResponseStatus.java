package com.xiaomi.hm.health.bt.classic;

/* JADX INFO: loaded from: classes19.dex */
public enum ResponseStatus {
    RFU((byte) 0),
    SUCCESS((byte) 1),
    INVALID_CRC((byte) 2),
    INVALID_LENGTH((byte) 3),
    NOT_SUPPORT_CMD((byte) 4),
    CMD_ERROR((byte) 5);

    public byte value;

    ResponseStatus(byte value) {
        this.value = value;
    }

    public static ResponseStatus from(byte value) {
        for (ResponseStatus responseStatus : values()) {
            if (responseStatus.a() == value) {
                return responseStatus;
            }
        }
        return RFU;
    }

    public byte a() {
        return this.value;
    }
}
