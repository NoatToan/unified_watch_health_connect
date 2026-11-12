package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.util.DefaultResourceRetriever;
import com.nimbusds.jose.util.ResourceRetriever;
import com.nimbusds.jose.util.events.EventListener;
import com.nimbusds.jose.util.health.HealthReportListener;
import java.net.URL;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class JWKSourceBuilder<C extends SecurityContext> {
    public static final long DEFAULT_CACHE_REFRESH_TIMEOUT = 15000;
    public static final long DEFAULT_CACHE_TIME_TO_LIVE = 300000;
    public static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 500;
    public static final int DEFAULT_HTTP_READ_TIMEOUT = 500;
    public static final int DEFAULT_HTTP_SIZE_LIMIT = 51200;
    public static final long DEFAULT_RATE_LIMIT_MIN_INTERVAL = 30000;
    public static final long DEFAULT_REFRESH_AHEAD_TIME = 30000;
    private EventListener<CachingJWKSetSource<C>, C> cachingEventListener;
    protected JWKSource<C> failover;
    private HealthReportListener<JWKSetSourceWithHealthStatusReporting<C>, C> healthReportListener;
    private final JWKSetSource<C> jwkSetSource;
    private EventListener<OutageTolerantJWKSetSource<C>, C> outageEventListener;
    private EventListener<RateLimitedJWKSetSource<C>, C> rateLimitedEventListener;
    private EventListener<RetryingJWKSetSource<C>, C> retryingEventListener;
    private boolean caching = true;
    private long cacheTimeToLive = 300000;
    private long cacheRefreshTimeout = 15000;
    private boolean refreshAhead = true;
    private long refreshAheadTime = 30000;
    private boolean refreshAheadScheduled = false;
    private boolean rateLimited = true;
    private long minTimeInterval = 30000;
    private boolean retrying = false;
    private boolean outageTolerant = false;
    private long outageCacheTimeToLive = -1;

    private JWKSourceBuilder(JWKSetSource<C> jWKSetSource) {
        Objects.requireNonNull(jWKSetSource);
        this.jwkSetSource = jWKSetSource;
    }

    public static <C extends SecurityContext> JWKSourceBuilder<C> create(URL url) {
        return new JWKSourceBuilder<>(new URLBasedJWKSetSource(url, new DefaultResourceRetriever(500, 500, 51200)));
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e6 A[RETURN] */
    public JWKSource<C> build() {
        JWKSetSource<C> cachingJWKSetSource;
        JWKSetBasedJWKSource jWKSetBasedJWKSource;
        JWKSource<C> jWKSource;
        boolean z14 = this.caching;
        if (!z14 && this.rateLimited) {
            h.z("Rate limiting requires caching");
            return null;
        }
        if (!z14 && this.refreshAhead) {
            h.z("Refresh-ahead caching requires general caching");
            return null;
        }
        if (z14 && this.rateLimited && this.cacheTimeToLive <= this.minTimeInterval) {
            h.z("The rate limiting min time interval between requests must be less than the cache time-to-live");
            return null;
        }
        if (z14 && this.outageTolerant && this.cacheTimeToLive == Long.MAX_VALUE && this.outageCacheTimeToLive == Long.MAX_VALUE) {
            h.z("Outage tolerance not necessary with a non-expiring cache");
            return null;
        }
        if (z14 && this.refreshAhead && this.cacheTimeToLive == Long.MAX_VALUE) {
            h.z("Refresh-ahead caching not necessary with a non-expiring cache");
            return null;
        }
        JWKSetSource<C> jWKSetSourceWithHealthStatusReporting = this.jwkSetSource;
        if (this.retrying) {
            jWKSetSourceWithHealthStatusReporting = new RetryingJWKSetSource(jWKSetSourceWithHealthStatusReporting, this.retryingEventListener);
        }
        if (this.outageTolerant) {
            if (this.outageCacheTimeToLive == -1) {
                if (this.caching) {
                    this.outageCacheTimeToLive = this.cacheTimeToLive * 10;
                } else {
                    this.outageCacheTimeToLive = 3000000L;
                }
            }
            jWKSetSourceWithHealthStatusReporting = new OutageTolerantJWKSetSource(jWKSetSourceWithHealthStatusReporting, this.outageCacheTimeToLive, this.outageEventListener);
        }
        HealthReportListener<JWKSetSourceWithHealthStatusReporting<C>, C> healthReportListener = this.healthReportListener;
        if (healthReportListener != null) {
            jWKSetSourceWithHealthStatusReporting = new JWKSetSourceWithHealthStatusReporting(jWKSetSourceWithHealthStatusReporting, healthReportListener);
        }
        JWKSetSource<C> rateLimitedJWKSetSource = this.rateLimited ? new RateLimitedJWKSetSource(jWKSetSourceWithHealthStatusReporting, this.minTimeInterval, this.rateLimitedEventListener) : jWKSetSourceWithHealthStatusReporting;
        if (!this.refreshAhead) {
            if (this.caching) {
                cachingJWKSetSource = new CachingJWKSetSource<>(rateLimitedJWKSetSource, this.cacheTimeToLive, this.cacheRefreshTimeout, this.cachingEventListener);
            }
            jWKSetBasedJWKSource = new JWKSetBasedJWKSource(rateLimitedJWKSetSource);
            jWKSource = this.failover;
            if (jWKSource != null) {
                return new JWKSourceWithFailover(jWKSetBasedJWKSource, jWKSource);
            }
            return jWKSetBasedJWKSource;
        }
        cachingJWKSetSource = new RefreshAheadCachingJWKSetSource<>(rateLimitedJWKSetSource, this.cacheTimeToLive, this.cacheRefreshTimeout, this.refreshAheadTime, this.refreshAheadScheduled, this.cachingEventListener);
        rateLimitedJWKSetSource = cachingJWKSetSource;
        jWKSetBasedJWKSource = new JWKSetBasedJWKSource(rateLimitedJWKSetSource);
        jWKSource = this.failover;
        if (jWKSource != null) {
            return new JWKSourceWithFailover(jWKSetBasedJWKSource, jWKSource);
        }
        return jWKSetBasedJWKSource;
    }

    public JWKSourceBuilder<C> cache(long j8, long j14, EventListener<CachingJWKSetSource<C>, C> eventListener) {
        this.caching = true;
        this.cacheTimeToLive = j8;
        this.cacheRefreshTimeout = j14;
        this.cachingEventListener = eventListener;
        return this;
    }

    public JWKSourceBuilder<C> cacheForever() {
        this.caching = true;
        this.cacheTimeToLive = Long.MAX_VALUE;
        this.refreshAhead = false;
        return this;
    }

    public JWKSourceBuilder<C> failover(JWKSource<C> jWKSource) {
        this.failover = jWKSource;
        return this;
    }

    public JWKSourceBuilder<C> healthReporting(HealthReportListener<JWKSetSourceWithHealthStatusReporting<C>, C> healthReportListener) {
        this.healthReportListener = healthReportListener;
        return this;
    }

    public JWKSourceBuilder<C> outageTolerant(long j8, EventListener<OutageTolerantJWKSetSource<C>, C> eventListener) {
        this.outageTolerant = true;
        this.outageCacheTimeToLive = j8;
        this.outageEventListener = eventListener;
        return this;
    }

    public JWKSourceBuilder<C> outageTolerantForever() {
        this.outageTolerant = true;
        this.outageCacheTimeToLive = Long.MAX_VALUE;
        return this;
    }

    public JWKSourceBuilder<C> rateLimited(long j8, EventListener<RateLimitedJWKSetSource<C>, C> eventListener) {
        this.rateLimited = true;
        this.minTimeInterval = j8;
        this.rateLimitedEventListener = eventListener;
        return this;
    }

    public JWKSourceBuilder<C> refreshAheadCache(long j8, boolean z14, EventListener<CachingJWKSetSource<C>, C> eventListener) {
        this.caching = true;
        this.refreshAhead = true;
        this.refreshAheadTime = j8;
        this.refreshAheadScheduled = z14;
        this.cachingEventListener = eventListener;
        return this;
    }

    public JWKSourceBuilder<C> retrying(EventListener<RetryingJWKSetSource<C>, C> eventListener) {
        this.retrying = true;
        this.retryingEventListener = eventListener;
        return this;
    }

    public JWKSourceBuilder<C> retrying(boolean z14) {
        this.retrying = z14;
        return this;
    }

    public JWKSourceBuilder<C> outageTolerant(long j8) {
        this.outageTolerant = true;
        this.outageCacheTimeToLive = j8;
        return this;
    }

    public JWKSourceBuilder<C> rateLimited(long j8) {
        this.rateLimited = true;
        this.minTimeInterval = j8;
        return this;
    }

    public JWKSourceBuilder<C> cache(long j8, long j14) {
        this.caching = true;
        this.cacheTimeToLive = j8;
        this.cacheRefreshTimeout = j14;
        return this;
    }

    public JWKSourceBuilder<C> outageTolerant(boolean z14) {
        this.outageTolerant = z14;
        return this;
    }

    public JWKSourceBuilder<C> rateLimited(boolean z14) {
        this.rateLimited = z14;
        return this;
    }

    public JWKSourceBuilder<C> refreshAheadCache(long j8, boolean z14) {
        this.caching = true;
        this.refreshAhead = true;
        this.refreshAheadTime = j8;
        this.refreshAheadScheduled = z14;
        return this;
    }

    public JWKSourceBuilder<C> cache(boolean z14) {
        this.caching = z14;
        return this;
    }

    public JWKSourceBuilder<C> refreshAheadCache(boolean z14) {
        if (z14) {
            this.caching = true;
        }
        this.refreshAhead = z14;
        return this;
    }

    public static <C extends SecurityContext> JWKSourceBuilder<C> create(URL url, ResourceRetriever resourceRetriever) {
        return new JWKSourceBuilder<>(new URLBasedJWKSetSource(url, resourceRetriever));
    }

    public static <C extends SecurityContext> JWKSourceBuilder<C> create(JWKSetSource<C> jWKSetSource) {
        return new JWKSourceBuilder<>(jWKSetSource);
    }
}
