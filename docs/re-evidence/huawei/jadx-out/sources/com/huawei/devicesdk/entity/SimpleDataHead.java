package com.huawei.devicesdk.entity;

/* JADX INFO: loaded from: classes4.dex */
public enum SimpleDataHead {
    DB((byte) -37),
    DC((byte) -36),
    BD((byte) -67),
    CD((byte) -51),
    INVALID((byte) -1);

    private byte dataHead;

    SimpleDataHead(byte b2) {
        this.dataHead = b2;
    }

    public byte getDataHead() {
        return this.dataHead;
    }

    public static SimpleDataHead get(byte b2) {
        for (SimpleDataHead simpleDataHead : values()) {
            if (simpleDataHead.dataHead == b2) {
                return simpleDataHead;
            }
        }
        return INVALID;
    }

    public static boolean isEncryptedDataHead(byte b2) {
        SimpleDataHead simpleDataHead = get(b2);
        return simpleDataHead == DC || simpleDataHead == CD;
    }

    public static SimpleDataHead getDownloadDataHead(boolean z) {
        return z ? DC : DB;
    }
}
