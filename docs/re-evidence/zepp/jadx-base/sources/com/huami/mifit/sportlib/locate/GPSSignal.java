package com.huami.mifit.sportlib.locate;

/* JADX INFO: loaded from: classes11.dex */
public class GPSSignal {
    public static final float GOOD = 35.0f;
    public static final float LOW = 80.0f;
    public static final float NORMAL = 65.0f;

    public enum SignalLevel {
        DEFAULT(-2),
        DISABLED(-1),
        UNAVAILABLE(0),
        WEAK(1),
        MIDDLE(2),
        STRONG(3);

        private int mValue;

        SignalLevel(int i) {
            this.mValue = -1;
            this.mValue = i;
        }

        public static boolean isAvailable(int i) {
            return i > UNAVAILABLE.getValue();
        }

        public static boolean isUnavailable(int i) {
            return UNAVAILABLE.getValue() >= i;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    public static int getSignalLevel(float f) {
        if (f <= 35.0f) {
            return SignalLevel.STRONG.getValue();
        }
        if (f <= 65.0f) {
            return SignalLevel.MIDDLE.getValue();
        }
        return f <= 80.0f ? SignalLevel.WEAK.getValue() : SignalLevel.UNAVAILABLE.getValue();
    }
}
