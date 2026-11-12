package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes2.dex */
public class WorkInitializer {
    private final Executor a;
    private final EventStore b;
    private final WorkScheduler c;
    private final SynchronizationGuard d;

    @Inject
    public WorkInitializer(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        this.a = executor;
        this.b = eventStore;
        this.c = workScheduler;
        this.d = synchronizationGuard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object c() {
        Iterator<TransportContext> it2 = this.b.loadActiveContexts().iterator();
        while (it2.hasNext()) {
            this.c.schedule(it2.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.d.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: lw8
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return this.a.c();
            }
        });
    }

    public void ensureContextsScheduled() {
        this.a.execute(new Runnable() { // from class: mw8
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        });
    }
}
