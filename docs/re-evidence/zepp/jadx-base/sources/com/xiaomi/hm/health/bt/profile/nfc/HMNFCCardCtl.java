package com.xiaomi.hm.health.bt.profile.nfc;

/* JADX INFO: loaded from: classes18.dex */
public enum HMNFCCardCtl {
    ACTIVATE((byte) 1),
    INACTIVATE((byte) 2),
    READ((byte) 3);

    private byte value;

    HMNFCCardCtl(byte value) {
        this.value = value;
    }

    public static HMNFCCardCtl from(byte value) {
        for (HMNFCCardCtl hMNFCCardCtl : values()) {
            if (value == hMNFCCardCtl.getValue()) {
                return hMNFCCardCtl;
            }
        }
        return ACTIVATE;
    }

    public byte getValue() {
        return this.value;
    }
}
