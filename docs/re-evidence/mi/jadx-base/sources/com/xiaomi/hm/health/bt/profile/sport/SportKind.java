package com.xiaomi.hm.health.bt.profile.sport;

/* JADX INFO: loaded from: classes11.dex */
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

    SportKind(byte b2) {
        this.kind = b2;
    }

    public static SportKind from(byte b2) {
        for (SportKind sportKind : values()) {
            if (sportKind.getKind() == b2) {
                return sportKind;
            }
        }
        return NONE;
    }

    public byte getKind() {
        return this.kind;
    }
}
