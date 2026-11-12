package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import n13.a;

/* JADX INFO: loaded from: classes13.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime"})
@ScopeMetadata
@DaggerGenerated
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {
    private final a<Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(a<Clock> aVar) {
        this.clockProvider = aVar;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNullFromProvides(SchedulingConfigModule.config(clock));
    }

    public static SchedulingConfigModule_ConfigFactory create(a<Clock> aVar) {
        return new SchedulingConfigModule_ConfigFactory(aVar);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, n13.a
    public SchedulerConfig get() {
        return config(this.clockProvider.get());
    }
}
