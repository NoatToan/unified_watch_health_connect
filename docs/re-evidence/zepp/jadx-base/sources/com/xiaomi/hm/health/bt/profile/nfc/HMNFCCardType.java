package com.xiaomi.hm.health.bt.profile.nfc;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public enum HMNFCCardType implements Serializable {
    UNKNOWN((byte) 0),
    BUS((byte) 1),
    DOOR((byte) 2),
    MASTERCARD((byte) 3),
    UNIONPAY((byte) 4),
    XIAOPENG((byte) 6),
    JAC((byte) 7);

    private static final long serialVersionUID = 1;
    private byte value;

    HMNFCCardType(byte value) {
        this.value = value;
    }

    public static HMNFCCardType from(byte value) {
        for (HMNFCCardType hMNFCCardType : values()) {
            if (value == hMNFCCardType.getValue()) {
                return hMNFCCardType;
            }
        }
        return UNKNOWN;
    }

    public byte getValue() {
        return this.value;
    }
}
