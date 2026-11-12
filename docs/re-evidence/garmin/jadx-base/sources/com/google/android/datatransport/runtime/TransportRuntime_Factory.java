package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;

/* JADX INFO: loaded from: classes13.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {
    private final n13.a<Clock> eventClockProvider;
    private final n13.a<WorkInitializer> initializerProvider;
    private final n13.a<Scheduler> schedulerProvider;
    private final n13.a<Uploader> uploaderProvider;
    private final n13.a<Clock> uptimeClockProvider;

    public TransportRuntime_Factory(n13.a<Clock> aVar, n13.a<Clock> aVar2, n13.a<Scheduler> aVar3, n13.a<Uploader> aVar4, n13.a<WorkInitializer> aVar5) {
        this.eventClockProvider = aVar;
        this.uptimeClockProvider = aVar2;
        this.schedulerProvider = aVar3;
        this.uploaderProvider = aVar4;
        this.initializerProvider = aVar5;
    }

    public static TransportRuntime_Factory create(n13.a<Clock> aVar, n13.a<Clock> aVar2, n13.a<Scheduler> aVar3, n13.a<Uploader> aVar4, n13.a<WorkInitializer> aVar5) {
        return new TransportRuntime_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, n13.a
    public TransportRuntime get() {
        return newInstance(this.eventClockProvider.get(), this.uptimeClockProvider.get(), this.schedulerProvider.get(), this.uploaderProvider.get(), this.initializerProvider.get());
    }
}
