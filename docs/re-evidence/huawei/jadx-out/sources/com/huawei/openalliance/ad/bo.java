package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public enum bo {
    CUSTOM(-1),
    UNKNOWN(0),
    ANY(1),
    LAND(2),
    PORTRAIT(3),
    SQUARE(4);

    private int g;

    public boolean a(int i) {
        for (int i2 = 0; i2 < values().length; i2++) {
            if (i == values()[i2].a()) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.g;
    }

    bo(int i) {
        this.g = i;
    }
}
