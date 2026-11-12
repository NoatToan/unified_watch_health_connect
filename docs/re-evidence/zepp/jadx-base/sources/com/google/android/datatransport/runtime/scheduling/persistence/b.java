package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class b extends PersistedEvent {
    private final long a;
    private final TransportContext b;
    private final EventInternal c;

    public b(long j, TransportContext transportContext, EventInternal eventInternal) {
        this.a = j;
        Objects.requireNonNull(transportContext, "Null transportContext");
        this.b = transportContext;
        Objects.requireNonNull(eventInternal, "Null event");
        this.c = eventInternal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        return this.a == persistedEvent.getId() && this.b.equals(persistedEvent.getTransportContext()) && this.c.equals(persistedEvent.getEvent());
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public EventInternal getEvent() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public long getId() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public TransportContext getTransportContext() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + com.alipay.sdk.m.u.i.d;
    }
}
