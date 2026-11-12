package com.xiaomi.hm.health.bt.profile.sport;

/* JADX INFO: loaded from: classes18.dex */
public enum SportKind {
    NONE((byte) 0),
    OUTDOOR((byte) 1),
    INDOOR((byte) 2),
    RIDING((byte) 3),
    WALK((byte) 4),
    EXERCISE((byte) 5),
    POOL_SWIM((byte) 6),
    OPEN_WATER_SWIM((byte) 7);

    private byte kind;

    SportKind(byte kind) {
        this.kind = (byte) 1;
        this.kind = kind;
    }

    public static SportKind from(byte kind) {
        for (SportKind sportKind : values()) {
            if (sportKind.getKind() == kind) {
                return sportKind;
            }
        }
        return NONE;
    }

    public byte getKind() {
        return this.kind;
    }
}
