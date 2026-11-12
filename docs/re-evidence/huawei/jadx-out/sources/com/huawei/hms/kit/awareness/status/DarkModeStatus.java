package com.huawei.hms.kit.awareness.status;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes34.dex */
public interface DarkModeStatus {
    public static final int DARK_MODE_OFF = 0;
    public static final int DARK_MODE_ON = 1;
    public static final int DARK_MODE_UNKNOWN = -1;

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DarkModeStatusDef {
    }

    boolean isDarkModeOn();
}
