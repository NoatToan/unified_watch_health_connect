package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeModule_UptimeClockFactory implements Factory<Clock> {

    public static final class a {
        private static final TimeModule_UptimeClockFactory a = new TimeModule_UptimeClockFactory();

        private a() {
        }
    }

    public static TimeModule_UptimeClockFactory create() {
        return a.a;
    }

    public static Clock uptimeClock() {
        return (Clock) Preconditions.checkNotNull(TimeModule.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return uptimeClock();
    }
}
