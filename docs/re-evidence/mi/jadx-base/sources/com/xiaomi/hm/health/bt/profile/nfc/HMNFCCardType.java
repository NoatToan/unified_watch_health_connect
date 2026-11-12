package com.xiaomi.hm.health.bt.profile.nfc;

/* JADX INFO: loaded from: classes11.dex */
public enum HMNFCCardType {
    UNKNOWN((byte) 0),
    BUS((byte) 1),
    DOOR((byte) 2),
    MASTERCARD((byte) 3),
    UNIONPAY((byte) 4),
    XIAOPENG((byte) 6),
    JAC((byte) 7),
    VISA((byte) 8);

    private static final long serialVersionUID = 1;
    private byte value;

    HMNFCCardType(byte b2) {
        this.value = b2;
    }

    public static HMNFCCardType from(byte b2) {
        for (HMNFCCardType hMNFCCardType : values()) {
            if (b2 == hMNFCCardType.getValue()) {
                return hMNFCCardType;
            }
        }
        return UNKNOWN;
    }

    public byte getValue() {
        return this.value;
    }
}
