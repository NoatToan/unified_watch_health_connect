package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes13.dex */
final class AutoValue_PersistedEvent extends PersistedEvent {
    private final EventInternal event;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f52851id;
    private final TransportContext transportContext;

    public AutoValue_PersistedEvent(long j8, TransportContext transportContext, EventInternal eventInternal) {
        this.f52851id = j8;
        if (transportContext == null) {
            x.l("Null transportContext");
            throw null;
        }
        this.transportContext = transportContext;
        if (eventInternal != null) {
            this.event = eventInternal;
        } else {
            x.l("Null event");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersistedEvent) {
            PersistedEvent persistedEvent = (PersistedEvent) obj;
            if (this.f52851id == persistedEvent.getId() && this.transportContext.equals(persistedEvent.getTransportContext()) && this.event.equals(persistedEvent.getEvent())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public EventInternal getEvent() {
        return this.event;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public long getId() {
        return this.f52851id;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public TransportContext getTransportContext() {
        return this.transportContext;
    }

    public int hashCode() {
        long j8 = this.f52851id;
        return ((((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ this.transportContext.hashCode()) * 1000003) ^ this.event.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f52851id + ", transportContext=" + this.transportContext + ", event=" + this.event + StringSubstitutor.DEFAULT_VAR_END;
    }
}
