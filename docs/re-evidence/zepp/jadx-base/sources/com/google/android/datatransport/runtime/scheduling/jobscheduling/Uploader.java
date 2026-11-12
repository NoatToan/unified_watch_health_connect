package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes2.dex */
public class Uploader {
    private static final String j = "Uploader";
    private static final String k = "GDT_CLIENT_METRICS";
    private final Context a;
    private final BackendRegistry b;
    private final EventStore c;
    private final WorkScheduler d;
    private final Executor e;
    private final SynchronizationGuard f;
    private final Clock g;
    private final Clock h;
    private final ClientHealthMetricsStore i;

    @Inject
    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, @WallTime Clock clock, @Monotonic Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.a = context;
        this.b = backendRegistry;
        this.c = eventStore;
        this.d = workScheduler;
        this.e = executor;
        this.f = synchronizationGuard;
        this.g = clock;
        this.h = clock2;
        this.i = clientHealthMetricsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean k(TransportContext transportContext) {
        return Boolean.valueOf(this.c.hasPendingEventsFor(transportContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable l(TransportContext transportContext) {
        return this.c.loadBatch(transportContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object m(Iterable iterable, TransportContext transportContext, long j2) {
        this.c.recordFailure(iterable);
        this.c.recordNextCallTime(transportContext, this.g.getTime() + j2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable) {
        this.c.recordSuccess(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o() {
        this.i.resetClientMetrics();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.i.recordLogEventDropped(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(TransportContext transportContext, long j2) {
        this.c.recordNextCallTime(transportContext, this.g.getTime() + j2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(TransportContext transportContext, int i) {
        this.d.schedule(transportContext, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(final TransportContext transportContext, final int i, Runnable runnable) {
        try {
            try {
                SynchronizationGuard synchronizationGuard = this.f;
                final EventStore eventStore = this.c;
                Objects.requireNonNull(eventStore);
                synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: m58
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return Integer.valueOf(eventStore.cleanUp());
                    }
                });
                if (j()) {
                    t(transportContext, i);
                } else {
                    this.f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: g58
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return this.a.r(transportContext, i);
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                this.d.schedule(transportContext, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    @VisibleForTesting
    public EventInternal createMetricsEvent(TransportBackend transportBackend) {
        SynchronizationGuard synchronizationGuard = this.f;
        final ClientHealthMetricsStore clientHealthMetricsStore = this.i;
        Objects.requireNonNull(clientHealthMetricsStore);
        return transportBackend.decorate(EventInternal.builder().setEventMillis(this.g.getTime()).setUptimeMillis(this.h.getTime()).setTransportName(k).setEncodedPayload(new EncodedPayload(Encoding.of("proto"), ((ClientMetrics) synchronizationGuard.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: l58
            @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
            public final Object execute() {
                return clientHealthMetricsStore.loadClientMetrics();
            }
        })).toByteArray())).build());
    }

    public boolean j() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void t(final TransportContext transportContext, int i) {
        BackendResponse backendResponseSend;
        TransportBackend transportBackend = this.b.get(transportContext.getBackendName());
        long jMax = 0;
        while (true) {
            final long j2 = jMax;
            while (true) {
                if (!((Boolean) this.f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: e58
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return this.a.k(transportContext);
                    }
                })).booleanValue()) {
                    this.f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: h58
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return this.a.q(transportContext, j2);
                        }
                    });
                    return;
                }
                final Iterable iterable = (Iterable) this.f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: f58
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return this.a.l(transportContext);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                if (transportBackend == null) {
                    Logging.d(j, "Unknown backend for %s, deleting event batch for it...", transportContext);
                    backendResponseSend = BackendResponse.fatalError();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((PersistedEvent) it2.next()).getEvent());
                    }
                    if (transportContext.shouldUploadClientHealthMetrics()) {
                        arrayList.add(createMetricsEvent(transportBackend));
                    }
                    backendResponseSend = transportBackend.send(BackendRequest.builder().setEvents(arrayList).setExtras(transportContext.getExtras()).build());
                }
                if (backendResponseSend.getStatus() == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: j58
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return this.a.m(iterable, transportContext, j2);
                        }
                    });
                    this.d.schedule(transportContext, i + 1, true);
                    return;
                }
                this.f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: i58
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return this.a.n(iterable);
                    }
                });
                if (backendResponseSend.getStatus() == BackendResponse.Status.OK) {
                    break;
                }
                if (backendResponseSend.getStatus() == BackendResponse.Status.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it3 = iterable.iterator();
                    while (it3.hasNext()) {
                        String transportName = ((PersistedEvent) it3.next()).getEvent().getTransportName();
                        if (map.containsKey(transportName)) {
                            map.put(transportName, Integer.valueOf(((Integer) map.get(transportName)).intValue() + 1));
                        } else {
                            map.put(transportName, 1);
                        }
                    }
                    this.f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: k58
                        @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                        public final Object execute() {
                            return this.a.p(map);
                        }
                    });
                }
            }
            jMax = Math.max(j2, backendResponseSend.getNextRequestWaitMillis());
            if (transportContext.shouldUploadClientHealthMetrics()) {
                this.f.runCriticalSection(new SynchronizationGuard.CriticalSection() { // from class: c58
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        return this.a.o();
                    }
                });
            }
        }
    }

    public void upload(final TransportContext transportContext, final int i, final Runnable runnable) {
        this.e.execute(new Runnable() { // from class: d58
            @Override // java.lang.Runnable
            public final void run() {
                this.a.s(transportContext, i, runnable);
            }
        });
    }
}
