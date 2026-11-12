package com.nimbusds.jose.util.health;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.shaded.jcip.Immutable;
import com.nimbusds.jose.util.events.Event;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public class HealthReport<S, C extends SecurityContext> implements Event<S, C> {
    private final C context;
    private final Exception exception;
    private final S source;
    private final HealthStatus status;
    private final long timestamp;

    public HealthReport(S s8, HealthStatus healthStatus, Exception exc, long j8, C c14) {
        Objects.requireNonNull(s8);
        this.source = s8;
        Objects.requireNonNull(healthStatus);
        this.status = healthStatus;
        if (exc != null && HealthStatus.HEALTHY.equals(healthStatus)) {
            h.s("Exception not accepted for a healthy status");
            throw null;
        }
        this.exception = exc;
        this.timestamp = j8;
        this.context = c14;
    }

    @Override // com.nimbusds.jose.util.events.Event
    public C getContext() {
        return this.context;
    }

    public Exception getException() {
        return this.exception;
    }

    public HealthStatus getHealthStatus() {
        return this.status;
    }

    @Override // com.nimbusds.jose.util.events.Event
    public S getSource() {
        return this.source;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public String toString() {
        return "HealthReport{source=" + this.source + ", status=" + this.status + ", exception=" + this.exception + ", timestamp=" + this.timestamp + ", context=" + this.context + CoreConstants.CURLY_RIGHT;
    }

    public HealthReport(S s8, HealthStatus healthStatus, long j8, C c14) {
        this(s8, healthStatus, null, j8, c14);
    }
}
