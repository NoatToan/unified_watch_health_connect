package com.xiaomi.smarthome.report;

/* JADX INFO: loaded from: classes2.dex */
public enum BleType {
    RC4(1),
    STANDARD(2),
    MESH(3),
    SECURITY_CHIP(4);

    private int type;

    BleType(int i) {
        this.type = i;
    }

    public int getType() {
        return this.type;
    }
}
