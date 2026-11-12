package com.google.firebase;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class StartupTime {
    public static StartupTime create(long j8, long j14, long j15) {
        return new AutoValue_StartupTime(j8, j14, j15);
    }

    public static StartupTime now() {
        return create(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long getElapsedRealtime();

    public abstract long getEpochMillis();

    public abstract long getUptimeMillis();
}
