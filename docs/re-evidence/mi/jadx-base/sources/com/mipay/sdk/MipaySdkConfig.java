package com.mipay.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class MipaySdkConfig {
    private static UI_MODE sUiMode = UI_MODE.AUTO;

    public enum UI_MODE {
        LIGHT,
        DARK,
        AUTO
    }

    private MipaySdkConfig() {
    }

    public static UI_MODE getUiMode() {
        return sUiMode;
    }

    public static void setUiMode(UI_MODE ui_mode) {
        sUiMode = ui_mode;
    }
}
