package com.huami.mifit.sportlib.common;

/* JADX INFO: loaded from: classes11.dex */
public class SportStatusCommand {
    public static final int CMD_EMITTER_ALGO = 19;
    public static final int CMD_EMITTER_APP = 18;
    public static final int CMD_EMITTER_DEVICE = 20;
    public static final int PAUSE = 3;
    public static final int RESUME = 2;
    public static final int START = 1;
    public static final int STOP = 4;

    public static boolean isValidCmd(int i) {
        return i >= 1 && i <= 4;
    }
}
