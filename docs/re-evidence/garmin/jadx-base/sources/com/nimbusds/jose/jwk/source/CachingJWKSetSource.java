package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.cache.CachedObject;
import com.nimbusds.jose.util.events.EventListener;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class CachingJWKSetSource<C extends SecurityContext> extends AbstractCachingJWKSetSource<C> {
    private final long cacheRefreshTimeout;
    private final EventListener<CachingJWKSetSource<C>, C> eventListener;
    private final ReentrantLock lock;

    public static class AbstractCachingJWKSetSourceEvent<C extends SecurityContext> extends AbstractJWKSetSourceEvent<CachingJWKSetSource<C>, C> {
        private final int threadQueueLength;

        public AbstractCachingJWKSetSourceEvent(CachingJWKSetSource<C> cachingJWKSetSource, int i14, C c14) {
            super(cachingJWKSetSource, c14);
            this.threadQueueLength = i14;
        }

        public int getThreadQueueLength() {
            return this.threadQueueLength;
        }
    }

    public static class RefreshCompletedEvent<C extends SecurityContext> extends AbstractCachingJWKSetSourceEvent<C> {
        private final JWKSet jwkSet;

        private RefreshCompletedEvent(CachingJWKSetSource<C> cachingJWKSetSource, JWKSet jWKSet, int i14, C c14) {
            super(cachingJWKSetSource, i14, c14);
            Objects.requireNonNull(jWKSet);
            this.jwkSet = jWKSet;
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        public JWKSet getJWKSet() {
            return this.jwkSet;
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }

        @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent
        public /* bridge */ /* synthetic */ int getThreadQueueLength() {
            return super.getThreadQueueLength();
        }
    }

    public CachingJWKSetSource(JWKSetSource<C> jWKSetSource, long j8, long j14, EventListener<CachingJWKSetSource<C>, C> eventListener) {
        super(jWKSetSource, j8);
        this.lock = new ReentrantLock();
        this.cacheRefreshTimeout = j14;
        this.eventListener = eventListener;
    }

    public long getCacheRefreshTimeout() {
        return this.cacheRefreshTimeout;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSource
    public JWKSet getJWKSet(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j8, C c14) {
        CachedObject<JWKSet> cachedJWKSet = getCachedJWKSet();
        if (cachedJWKSet == null) {
            return loadJWKSetBlocking(JWKSetCacheRefreshEvaluator.noRefresh(), j8, c14);
        }
        JWKSet jWKSet = cachedJWKSet.get();
        if (jWKSetCacheRefreshEvaluator.requiresRefresh(jWKSet)) {
            return loadJWKSetBlocking(jWKSetCacheRefreshEvaluator, j8, c14);
        }
        return cachedJWKSet.isExpired(j8) ? loadJWKSetBlocking(JWKSetCacheRefreshEvaluator.referenceComparison(jWKSet), j8, c14) : cachedJWKSet.get();
    }

    public ReentrantLock getLock() {
        return this.lock;
    }

    @Override // com.nimbusds.jose.jwk.source.AbstractCachingJWKSetSource
    public /* bridge */ /* synthetic */ long getTimeToLive() {
        return super.getTimeToLive();
    }

    public JWKSet loadJWKSetBlocking(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j8, C c14) throws JWKSetUnavailableException {
        CachedObject<JWKSet> cachedJWKSet;
        try {
            if (this.lock.tryLock()) {
                try {
                    cachedJWKSet = getCachedJWKSet();
                    if (cachedJWKSet == null || jWKSetCacheRefreshEvaluator.requiresRefresh(cachedJWKSet.get())) {
                        EventListener<CachingJWKSetSource<C>, C> eventListener = this.eventListener;
                        if (eventListener != null) {
                            eventListener.notify(new RefreshInitiatedEvent(this.lock.getQueueLength(), c14));
                        }
                        CachedObject<JWKSet> cachedObjectLoadJWKSetNotThreadSafe = loadJWKSetNotThreadSafe(jWKSetCacheRefreshEvaluator, j8, c14);
                        EventListener<CachingJWKSetSource<C>, C> eventListener2 = this.eventListener;
                        if (eventListener2 != null) {
                            eventListener2.notify(new RefreshCompletedEvent(cachedObjectLoadJWKSetNotThreadSafe.get(), this.lock.getQueueLength(), c14));
                        }
                        cachedJWKSet = cachedObjectLoadJWKSetNotThreadSafe;
                    }
                    this.lock.unlock();
                } catch (Throwable th3) {
                    this.lock.unlock();
                    throw th3;
                }
            } else {
                EventListener<CachingJWKSetSource<C>, C> eventListener3 = this.eventListener;
                if (eventListener3 != null) {
                    eventListener3.notify(new WaitingForRefreshEvent(this.lock.getQueueLength(), c14));
                }
                if (!this.lock.tryLock(getCacheRefreshTimeout(), TimeUnit.MILLISECONDS)) {
                    EventListener<CachingJWKSetSource<C>, C> eventListener4 = this.eventListener;
                    if (eventListener4 != null) {
                        eventListener4.notify(new RefreshTimedOutEvent(this.lock.getQueueLength(), c14));
                    }
                    throw new JWKSetUnavailableException("Timeout while waiting for cache refresh (" + this.cacheRefreshTimeout + "ms exceeded)");
                }
                try {
                    cachedJWKSet = getCachedJWKSet();
                    if (cachedJWKSet == null || jWKSetCacheRefreshEvaluator.requiresRefresh(cachedJWKSet.get())) {
                        EventListener<CachingJWKSetSource<C>, C> eventListener5 = this.eventListener;
                        if (eventListener5 != null) {
                            eventListener5.notify(new RefreshInitiatedEvent(this.lock.getQueueLength(), c14));
                        }
                        CachedObject<JWKSet> cachedObjectLoadJWKSetNotThreadSafe2 = loadJWKSetNotThreadSafe(jWKSetCacheRefreshEvaluator, j8, c14);
                        EventListener<CachingJWKSetSource<C>, C> eventListener6 = this.eventListener;
                        if (eventListener6 != null) {
                            eventListener6.notify(new RefreshCompletedEvent(cachedObjectLoadJWKSetNotThreadSafe2.get(), this.lock.getQueueLength(), c14));
                        }
                        cachedJWKSet = cachedObjectLoadJWKSetNotThreadSafe2;
                    }
                    this.lock.unlock();
                } catch (Throwable th4) {
                    this.lock.unlock();
                    throw th4;
                }
            }
            if (cachedJWKSet != null && cachedJWKSet.isValid(j8)) {
                return cachedJWKSet.get();
            }
            EventListener<CachingJWKSetSource<C>, C> eventListener7 = this.eventListener;
            if (eventListener7 != null) {
                eventListener7.notify(new UnableToRefreshEvent(c14));
            }
            throw new JWKSetUnavailableException("Unable to refresh cache");
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            throw new JWKSetUnavailableException("Interrupted while waiting for cache refresh", e4);
        }
    }

    public CachedObject<JWKSet> loadJWKSetNotThreadSafe(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j8, C c14) {
        return cacheJWKSet(getSource().getJWKSet(jWKSetCacheRefreshEvaluator, j8, c14), j8);
    }

    public static class RefreshInitiatedEvent<C extends SecurityContext> extends AbstractCachingJWKSetSourceEvent<C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }

        @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent
        public /* bridge */ /* synthetic */ int getThreadQueueLength() {
            return super.getThreadQueueLength();
        }

        private RefreshInitiatedEvent(CachingJWKSetSource<C> cachingJWKSetSource, int i14, C c14) {
            super(cachingJWKSetSource, i14, c14);
        }
    }

    public static class RefreshTimedOutEvent<C extends SecurityContext> extends AbstractCachingJWKSetSourceEvent<C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }

        @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent
        public /* bridge */ /* synthetic */ int getThreadQueueLength() {
            return super.getThreadQueueLength();
        }

        private RefreshTimedOutEvent(CachingJWKSetSource<C> cachingJWKSetSource, int i14, C c14) {
            super(cachingJWKSetSource, i14, c14);
        }
    }

    public static class UnableToRefreshEvent<C extends SecurityContext> extends AbstractJWKSetSourceEvent<CachingJWKSetSource<C>, C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }

        private UnableToRefreshEvent(CachingJWKSetSource<C> cachingJWKSetSource, C c14) {
            super(cachingJWKSetSource, c14);
        }
    }

    public static class WaitingForRefreshEvent<C extends SecurityContext> extends AbstractCachingJWKSetSourceEvent<C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }

        @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent
        public /* bridge */ /* synthetic */ int getThreadQueueLength() {
            return super.getThreadQueueLength();
        }

        private WaitingForRefreshEvent(CachingJWKSetSource<C> cachingJWKSetSource, int i14, C c14) {
            super(cachingJWKSetSource, i14, c14);
        }
    }
}
