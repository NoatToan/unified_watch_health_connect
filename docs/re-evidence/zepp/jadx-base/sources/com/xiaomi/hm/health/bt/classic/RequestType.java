package com.xiaomi.hm.health.bt.classic;

/* JADX INFO: loaded from: classes19.dex */
public enum RequestType {
    READ((byte) 0),
    READ_RESPONSE((byte) 1),
    WRITE((byte) 2),
    WRITE_RESPONSE((byte) 3),
    WRITE_CMD((byte) 4),
    NOTIFICATION((byte) 5);

    private byte value;

    RequestType(byte value) {
        this.value = value;
    }

    public static RequestType from(byte value) {
        for (RequestType requestType : values()) {
            if (requestType.getValue() == value) {
                return requestType;
            }
        }
        return NOTIFICATION;
    }

    public byte getValue() {
        return this.value;
    }
}
