package com.xiaomi.hm.health.bt.profile.user;

/* JADX INFO: loaded from: classes18.dex */
public class LocationExt {
    private Wear a;
    private Way b;

    public enum Way {
        OTHER(-1),
        LEFT(0),
        RIGHT(1);

        private int mValue;

        Way(int value) {
            this.mValue = -1;
            this.mValue = value;
        }

        public static Way fromValue(byte value) {
            for (Way way : values()) {
                if (way.getValue() == value) {
                    return way;
                }
            }
            return LEFT;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    public enum Wear {
        OTHER(0),
        CHEST(1),
        WRIST(2),
        FINGER(3),
        HAND(4),
        EAR_LOBE(5),
        FOOT(6);

        private int mValue;

        Wear(int value) {
            this.mValue = 0;
            this.mValue = value;
        }

        public static Wear fromValue(byte value) {
            for (Wear wear : values()) {
                if (wear.getValue() == value) {
                    return wear;
                }
            }
            return OTHER;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    public LocationExt() {
        this.a = Wear.WRIST;
        this.b = Way.LEFT;
    }

    public byte[] a() {
        return new byte[]{(byte) (this.a.getValue() | (this.b.getValue() << 7))};
    }

    public Way getWay() {
        return this.b;
    }

    public Wear getWear() {
        return this.a;
    }

    public void setWay(Way way) {
        this.b = way;
    }

    public void setWear(Wear wear) {
        this.a = wear;
    }

    public String toString() {
        return "[Wear:" + this.a + ",Way:" + this.b + "]";
    }

    public LocationExt(Wear wear, Way way) {
        this.a = Wear.WRIST;
        this.b = Way.LEFT;
        this.a = wear;
        this.b = way;
    }

    public LocationExt(byte wear, byte way) {
        this.a = Wear.WRIST;
        this.b = Way.LEFT;
        this.a = Wear.fromValue(wear);
        this.b = Way.fromValue(way);
    }
}
