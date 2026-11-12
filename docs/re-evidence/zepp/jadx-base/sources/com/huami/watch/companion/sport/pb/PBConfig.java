package com.huami.watch.companion.sport.pb;

/* JADX INFO: loaded from: classes16.dex */
public class PBConfig {
    public static final String KEY_CONFIRMED = "confirmed";
    public static final String KEY_UNCONFIRMED = "unconfirmed";

    public static class ShowType {
        public static final int BIKE = 2;
        public static final int CLIMB = 4;
        public static final int RUNNING = 1;
        public static final int SWIM = 3;
    }

    public enum Status {
        UNCONFIRMED,
        CURRENT,
        LAST
    }

    public enum Unit {
        IMPERIAL,
        METRIC,
        NONE
    }
}
