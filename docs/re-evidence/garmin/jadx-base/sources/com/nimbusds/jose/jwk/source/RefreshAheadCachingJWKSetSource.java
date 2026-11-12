package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.shaded.gson.internal.a;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.cache.CachedObject;
import com.nimbusds.jose.util.events.EventListener;
import ds.e0;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class RefreshAheadCachingJWKSetSource<C extends SecurityContext> extends CachingJWKSetSource<C> {
    private volatile long cacheExpiration;
    private final EventListener<CachingJWKSetSource<C>, C> eventListener;
    private final ExecutorService executorService;
    private final ReentrantLock lazyLock;
    private final long refreshAheadTime;
    private final ScheduledExecutorService scheduledExecutorService;
    private ScheduledFuture<?> scheduledRefreshFuture;
    private final boolean shutdownExecutorOnClose;

    public static class RefreshNotScheduledEvent<C extends SecurityContext> extends AbstractJWKSetSourceEvent<CachingJWKSetSource<C>, C> {
        public RefreshNotScheduledEvent(RefreshAheadCachingJWKSetSource<C> refreshAheadCachingJWKSetSource, C c14) {
            super(refreshAheadCachingJWKSetSource, c14);
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }
    }

    public static class RefreshScheduledEvent<C extends SecurityContext> extends AbstractJWKSetSourceEvent<CachingJWKSetSource<C>, C> {
        public RefreshScheduledEvent(RefreshAheadCachingJWKSetSource<C> refreshAheadCachingJWKSetSource, C c14) {
            super(refreshAheadCachingJWKSetSource, c14);
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }
    }

    public static class ScheduledRefreshCompletedEvent<C extends SecurityContext> extends AbstractJWKSetSourceEvent<CachingJWKSetSource<C>, C> {
        private final JWKSet jwkSet;

        private ScheduledRefreshCompletedEvent(CachingJWKSetSource<C> cachingJWKSetSource, JWKSet jWKSet, C c14) {
            super(cachingJWKSetSource, c14);
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
    }

    public static class ScheduledRefreshFailed<C extends SecurityContext> extends AbstractJWKSetSourceEvent<CachingJWKSetSource<C>, C> {
        private final Exception exception;

        public ScheduledRefreshFailed(CachingJWKSetSource<C> cachingJWKSetSource, Exception exc, C c14) {
            super(cachingJWKSetSource, c14);
            Objects.requireNonNull(exc);
            this.exception = exc;
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        public Exception getException() {
            return this.exception;
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }
    }

    public static class UnableToRefreshAheadOfExpirationEvent<C extends SecurityContext> extends AbstractJWKSetSourceEvent<CachingJWKSetSource<C>, C> {
        public UnableToRefreshAheadOfExpirationEvent(CachingJWKSetSource<C> cachingJWKSetSource, C c14) {
            super(cachingJWKSetSource, c14);
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }
    }

    public RefreshAheadCachingJWKSetSource(JWKSetSource<C> jWKSetSource, long j8, long j14, long j15, boolean z14, ExecutorService executorService, boolean z15, EventListener<CachingJWKSetSource<C>, C> eventListener) {
        super(jWKSetSource, j8, j14, eventListener);
        this.lazyLock = new ReentrantLock();
        if (j15 + j14 > j8) {
            StringBuilder sbK = e0.k(j15, "The sum of the refresh-ahead time (", "ms) and the cache refresh timeout (");
            sbK.append(j14);
            h.s(a.g(j8, "ms) must not exceed the time-to-lived time (", "ms)", sbK));
            throw null;
        }
        this.refreshAheadTime = j15;
        Objects.requireNonNull(executorService, "The executor service must not be null");
        this.executorService = executorService;
        this.shutdownExecutorOnClose = z15;
        if (z14) {
            this.scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        } else {
            this.scheduledExecutorService = null;
        }
        this.eventListener = eventListener;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSourceWrapper, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ScheduledFuture<?> scheduledFuture = this.scheduledRefreshFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        super.close();
        boolean z14 = this.shutdownExecutorOnClose;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (z14) {
            this.executorService.shutdownNow();
            try {
                this.executorService.awaitTermination(getCacheRefreshTimeout(), timeUnit);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            try {
                this.scheduledExecutorService.awaitTermination(getCacheRefreshTimeout(), timeUnit);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource, com.nimbusds.jose.jwk.source.JWKSetSource
    public JWKSet getJWKSet(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j8, C c14) {
        CachedObject<JWKSet> cachedJWKSet = getCachedJWKSet();
        if (cachedJWKSet == null) {
            return loadJWKSetBlocking(JWKSetCacheRefreshEvaluator.noRefresh(), j8, c14);
        }
        JWKSet jWKSet = cachedJWKSet.get();
        if (jWKSetCacheRefreshEvaluator.requiresRefresh(jWKSet)) {
            return loadJWKSetBlocking(jWKSetCacheRefreshEvaluator, j8, c14);
        }
        if (cachedJWKSet.isExpired(j8)) {
            return loadJWKSetBlocking(JWKSetCacheRefreshEvaluator.referenceComparison(jWKSet), j8, c14);
        }
        refreshAheadOfExpiration(cachedJWKSet, false, j8, c14);
        return cachedJWKSet.get();
    }

    public ReentrantLock getLazyLock() {
        return this.lazyLock;
    }

    public ScheduledFuture<?> getScheduledRefreshFuture() {
        return this.scheduledRefreshFuture;
    }

    @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource
    public CachedObject<JWKSet> loadJWKSetNotThreadSafe(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j8, C c14) {
        CachedObject<JWKSet> cachedObjectLoadJWKSetNotThreadSafe = super.loadJWKSetNotThreadSafe(jWKSetCacheRefreshEvaluator, j8, c14);
        if (this.scheduledExecutorService != null) {
            scheduleRefreshAheadOfExpiration(cachedObjectLoadJWKSetNotThreadSafe, j8, c14);
        }
        return cachedObjectLoadJWKSetNotThreadSafe;
    }

    public void lockedRefresh(CachedObject<JWKSet> cachedObject, final long j8, final C c14) {
        if (this.cacheExpiration < cachedObject.getExpirationTime()) {
            this.cacheExpiration = cachedObject.getExpirationTime();
            this.executorService.execute(new Runnable() { // from class: com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (RefreshAheadCachingJWKSetSource.this.eventListener != null) {
                            RefreshAheadCachingJWKSetSource.this.eventListener.notify(new ScheduledRefreshInitiatedEvent(this, c14));
                        }
                        JWKSet jWKSetLoadJWKSetBlocking = RefreshAheadCachingJWKSetSource.this.loadJWKSetBlocking(JWKSetCacheRefreshEvaluator.forceRefresh(), j8, c14);
                        if (RefreshAheadCachingJWKSetSource.this.eventListener != null) {
                            RefreshAheadCachingJWKSetSource.this.eventListener.notify(new ScheduledRefreshCompletedEvent(this, jWKSetLoadJWKSetBlocking, c14));
                        }
                    } catch (Throwable unused) {
                        RefreshAheadCachingJWKSetSource.this.cacheExpiration = -1L;
                        if (RefreshAheadCachingJWKSetSource.this.eventListener != null) {
                            RefreshAheadCachingJWKSetSource.this.eventListener.notify(new UnableToRefreshAheadOfExpirationEvent(this, c14));
                        }
                    }
                }
            });
        }
    }

    public void refreshAheadOfExpiration(CachedObject<JWKSet> cachedObject, boolean z14, long j8, C c14) {
        if ((cachedObject.isExpired(this.refreshAheadTime + j8) || z14) && this.cacheExpiration < cachedObject.getExpirationTime() && this.lazyLock.tryLock()) {
            try {
                lockedRefresh(cachedObject, j8, c14);
            } finally {
                this.lazyLock.unlock();
            }
        }
    }

    public void scheduleRefreshAheadOfExpiration(final CachedObject<JWKSet> cachedObject, long j8, final C c14) {
        ScheduledFuture<?> scheduledFuture = this.scheduledRefreshFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        long expirationTime = ((cachedObject.getExpirationTime() - j8) - this.refreshAheadTime) - getCacheRefreshTimeout();
        if (expirationTime <= 0) {
            EventListener<CachingJWKSetSource<C>, C> eventListener = this.eventListener;
            if (eventListener != null) {
                eventListener.notify(new RefreshNotScheduledEvent(this, c14));
                return;
            }
            return;
        }
        this.scheduledRefreshFuture = this.scheduledExecutorService.schedule(new Runnable() { // from class: com.nimbusds.jose.jwk.source.RefreshAheadCachingJWKSetSource.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    RefreshAheadCachingJWKSetSource.this.refreshAheadOfExpiration(cachedObject, true, System.currentTimeMillis(), c14);
                } catch (Exception e4) {
                    if (RefreshAheadCachingJWKSetSource.this.eventListener != null) {
                        RefreshAheadCachingJWKSetSource.this.eventListener.notify(new ScheduledRefreshFailed(this, e4, c14));
                    }
                }
            }
        }, expirationTime, TimeUnit.MILLISECONDS);
        EventListener<CachingJWKSetSource<C>, C> eventListener2 = this.eventListener;
        if (eventListener2 != null) {
            eventListener2.notify(new RefreshScheduledEvent(this, c14));
        }
    }

    public static class ScheduledRefreshInitiatedEvent<C extends SecurityContext> extends AbstractJWKSetSourceEvent<CachingJWKSetSource<C>, C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }

        private ScheduledRefreshInitiatedEvent(CachingJWKSetSource<C> cachingJWKSetSource, C c14) {
            super(cachingJWKSetSource, c14);
        }
    }

    public RefreshAheadCachingJWKSetSource(JWKSetSource<C> jWKSetSource, long j8, long j14, long j15, boolean z14, EventListener<CachingJWKSetSource<C>, C> eventListener) {
        this(jWKSetSource, j8, j14, j15, z14, Executors.newSingleThreadExecutor(), true, eventListener);
    }
}
