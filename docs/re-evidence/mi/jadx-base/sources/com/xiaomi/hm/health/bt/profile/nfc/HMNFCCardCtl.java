package com.xiaomi.hm.health.bt.profile.nfc;

/* JADX INFO: loaded from: classes11.dex */
public enum HMNFCCardCtl {
    ACTIVATE((byte) 1),
    INACTIVATE((byte) 2),
    READ((byte) 3);

    private byte value;

    HMNFCCardCtl(byte b2) {
        this.value = b2;
    }

    public static HMNFCCardCtl from(byte b2) {
        for (HMNFCCardCtl hMNFCCardCtl : values()) {
            if (b2 == hMNFCCardCtl.getValue()) {
                return hMNFCCardCtl;
            }
        }
        return ACTIVATE;
    }

    public byte getValue() {
        return this.value;
    }
}
