package com.facebook.common.time;

import android.os.SystemClock;
import defpackage.q7g;
import defpackage.w07;

/* JADX INFO: loaded from: classes4.dex */
@w07
public class AwakeTimeSinceBootClock implements q7g {

    @w07
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @w07
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // defpackage.q7g
    @w07
    public long now() {
        return SystemClock.uptimeMillis();
    }
}
