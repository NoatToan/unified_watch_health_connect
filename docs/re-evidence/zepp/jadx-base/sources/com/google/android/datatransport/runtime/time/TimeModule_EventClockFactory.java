package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeModule_EventClockFactory implements Factory<Clock> {

    public static final class a {
        private static final TimeModule_EventClockFactory a = new TimeModule_EventClockFactory();

        private a() {
        }
    }

    public static TimeModule_EventClockFactory create() {
        return a.a;
    }

    public static Clock eventClock() {
        return (Clock) Preconditions.checkNotNull(TimeModule.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return eventClock();
    }
}
