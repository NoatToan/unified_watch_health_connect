package com.huami.mifit.sportlib.model;

/* JADX INFO: loaded from: classes11.dex */
public class GPSSportState {
    public static final int DEFUALT = -1;
    public static final int IDLE = 0;
    public static final int PAUSED = 2;
    public static final int RESUMED = 3;
    public static final int STARTED = 1;
    public static final int STOPPED = 4;

    private GPSSportState() {
    }

    public static boolean isActive(int i) {
        return i == 1 || i == 3;
    }

    public static boolean isSportInactive(int i) {
        return i == 4 || i == 2;
    }

    public static boolean isValidate(int i) {
        return i <= 4 && i >= -1;
    }
}
