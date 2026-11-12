package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {
    private final n13.a<Executor> executorProvider;
    private final n13.a<SynchronizationGuard> guardProvider;
    private final n13.a<WorkScheduler> schedulerProvider;
    private final n13.a<EventStore> storeProvider;

    public WorkInitializer_Factory(n13.a<Executor> aVar, n13.a<EventStore> aVar2, n13.a<WorkScheduler> aVar3, n13.a<SynchronizationGuard> aVar4) {
        this.executorProvider = aVar;
        this.storeProvider = aVar2;
        this.schedulerProvider = aVar3;
        this.guardProvider = aVar4;
    }

    public static WorkInitializer_Factory create(n13.a<Executor> aVar, n13.a<EventStore> aVar2, n13.a<WorkScheduler> aVar3, n13.a<SynchronizationGuard> aVar4) {
        return new WorkInitializer_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, n13.a
    public WorkInitializer get() {
        return newInstance(this.executorProvider.get(), this.storeProvider.get(), this.schedulerProvider.get(), this.guardProvider.get());
    }
}
