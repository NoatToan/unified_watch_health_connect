package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.cache.CachedObject;
import com.nimbusds.jose.util.events.EventListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class OutageTolerantJWKSetSource<C extends SecurityContext> extends AbstractCachingJWKSetSource<C> {
    private final EventListener<OutageTolerantJWKSetSource<C>, C> eventListener;

    public static class OutageEvent<C extends SecurityContext> extends AbstractJWKSetSourceEvent<OutageTolerantJWKSetSource<C>, C> {
        private final Exception exception;
        private final long remainingTime;

        private OutageEvent(OutageTolerantJWKSetSource<C> outageTolerantJWKSetSource, Exception exc, long j8, C c14) {
            super(outageTolerantJWKSetSource, c14);
            Objects.requireNonNull(exc);
            this.exception = exc;
            this.remainingTime = j8;
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        public Exception getException() {
            return this.exception;
        }

        public long getRemainingTime() {
            return this.remainingTime;
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }
    }

    public OutageTolerantJWKSetSource(JWKSetSource<C> jWKSetSource, long j8, EventListener<OutageTolerantJWKSetSource<C>, C> eventListener) {
        super(jWKSetSource, j8);
        this.eventListener = eventListener;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSource
    public JWKSet getJWKSet(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j8, C c14) throws JWKSetUnavailableException {
        try {
            JWKSet jWKSet = getSource().getJWKSet(jWKSetCacheRefreshEvaluator, j8, c14);
            cacheJWKSet(jWKSet, j8);
            return jWKSet;
        } catch (JWKSetUnavailableException e4) {
            CachedObject<JWKSet> cachedJWKSet = getCachedJWKSet();
            if (cachedJWKSet == null || !cachedJWKSet.isValid(j8)) {
                throw e4;
            }
            long expirationTime = cachedJWKSet.getExpirationTime() - j8;
            EventListener<OutageTolerantJWKSetSource<C>, C> eventListener = this.eventListener;
            if (eventListener != null) {
                eventListener.notify(new OutageEvent(e4, expirationTime, c14));
            }
            JWKSet jWKSet2 = new JWKSet(cachedJWKSet.get().getKeys());
            if (jWKSetCacheRefreshEvaluator.requiresRefresh(jWKSet2)) {
                throw e4;
            }
            return jWKSet2;
        }
    }

    @Override // com.nimbusds.jose.jwk.source.AbstractCachingJWKSetSource
    public /* bridge */ /* synthetic */ long getTimeToLive() {
        return super.getTimeToLive();
    }
}
