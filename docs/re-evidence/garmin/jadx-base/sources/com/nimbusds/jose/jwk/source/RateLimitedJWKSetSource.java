package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.events.EventListener;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class RateLimitedJWKSetSource<C extends SecurityContext> extends JWKSetSourceWrapper<C> {
    private int counter;
    private final EventListener<RateLimitedJWKSetSource<C>, C> eventListener;
    private final long minTimeInterval;
    private long nextOpeningTime;

    public RateLimitedJWKSetSource(JWKSetSource<C> jWKSetSource, long j8, EventListener<RateLimitedJWKSetSource<C>, C> eventListener) {
        super(jWKSetSource);
        this.nextOpeningTime = -1L;
        this.counter = 0;
        this.minTimeInterval = j8;
        this.eventListener = eventListener;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSource
    public JWKSet getJWKSet(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j8, C c14) throws RateLimitReachedException {
        boolean z14;
        synchronized (this) {
            try {
                z14 = false;
                if (this.nextOpeningTime <= j8) {
                    this.nextOpeningTime = this.minTimeInterval + j8;
                    this.counter = 1;
                } else {
                    int i14 = this.counter;
                    z14 = i14 <= 0;
                    if (!z14) {
                        this.counter = i14 - 1;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z14) {
            return getSource().getJWKSet(jWKSetCacheRefreshEvaluator, j8, c14);
        }
        EventListener<RateLimitedJWKSetSource<C>, C> eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.notify(new RateLimitedEvent(c14));
        }
        throw new RateLimitReachedException();
    }

    public long getMinTimeInterval() {
        return this.minTimeInterval;
    }

    public static class RateLimitedEvent<C extends SecurityContext> extends AbstractJWKSetSourceEvent<RateLimitedJWKSetSource<C>, C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }

        private RateLimitedEvent(RateLimitedJWKSetSource<C> rateLimitedJWKSetSource, C c14) {
            super(rateLimitedJWKSetSource, c14);
        }
    }
}
