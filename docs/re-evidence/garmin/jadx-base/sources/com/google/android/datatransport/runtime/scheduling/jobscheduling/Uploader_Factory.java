package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
public final class Uploader_Factory implements Factory<Uploader> {
    private final n13.a<BackendRegistry> backendRegistryProvider;
    private final n13.a<ClientHealthMetricsStore> clientHealthMetricsStoreProvider;
    private final n13.a<Clock> clockProvider;
    private final n13.a<Context> contextProvider;
    private final n13.a<EventStore> eventStoreProvider;
    private final n13.a<Executor> executorProvider;
    private final n13.a<SynchronizationGuard> guardProvider;
    private final n13.a<Clock> uptimeClockProvider;
    private final n13.a<WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(n13.a<Context> aVar, n13.a<BackendRegistry> aVar2, n13.a<EventStore> aVar3, n13.a<WorkScheduler> aVar4, n13.a<Executor> aVar5, n13.a<SynchronizationGuard> aVar6, n13.a<Clock> aVar7, n13.a<Clock> aVar8, n13.a<ClientHealthMetricsStore> aVar9) {
        this.contextProvider = aVar;
        this.backendRegistryProvider = aVar2;
        this.eventStoreProvider = aVar3;
        this.workSchedulerProvider = aVar4;
        this.executorProvider = aVar5;
        this.guardProvider = aVar6;
        this.clockProvider = aVar7;
        this.uptimeClockProvider = aVar8;
        this.clientHealthMetricsStoreProvider = aVar9;
    }

    public static Uploader_Factory create(n13.a<Context> aVar, n13.a<BackendRegistry> aVar2, n13.a<EventStore> aVar3, n13.a<WorkScheduler> aVar4, n13.a<Executor> aVar5, n13.a<SynchronizationGuard> aVar6, n13.a<Clock> aVar7, n13.a<Clock> aVar8, n13.a<ClientHealthMetricsStore> aVar9) {
        return new Uploader_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, n13.a
    public Uploader get() {
        return newInstance(this.contextProvider.get(), this.backendRegistryProvider.get(), this.eventStoreProvider.get(), this.workSchedulerProvider.get(), this.executorProvider.get(), this.guardProvider.get(), this.clockProvider.get(), this.uptimeClockProvider.get(), this.clientHealthMetricsStoreProvider.get());
    }
}
