package com.huawei.hms.kit.awareness.status;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes34.dex */
public interface ScreenStatus {
    public static final int SCREEN_OFF = 0;
    public static final int SCREEN_ON = 1;
    public static final int UNKNOWN = -1;
    public static final int UNLOCK = 2;

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScreenStatusDef {
    }

    int getStatus();
}
