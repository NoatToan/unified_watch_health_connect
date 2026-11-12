package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
@Deprecated
public class DefaultJWKSetCache implements JWKSetCache {
    public static final long DEFAULT_LIFESPAN_MINUTES = 15;
    public static final long DEFAULT_REFRESH_TIME_MINUTES = 5;
    private volatile JWKSetWithTimestamp jwkSetWithTimestamp;
    private final long lifespan;
    private final long refreshTime;
    private final TimeUnit timeUnit;

    public DefaultJWKSetCache(long j8, long j14, TimeUnit timeUnit) {
        this.lifespan = j8;
        this.refreshTime = j14;
        if ((j8 > -1 || j14 > -1) && timeUnit == null) {
            h.s("A time unit must be specified for non-negative lifespans or refresh times");
            throw null;
        }
        this.timeUnit = timeUnit;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetCache
    public JWKSet get() {
        if (this.jwkSetWithTimestamp == null || isExpired()) {
            return null;
        }
        return this.jwkSetWithTimestamp.getJWKSet();
    }

    public long getLifespan(TimeUnit timeUnit) {
        long j8 = this.lifespan;
        return j8 < 0 ? j8 : timeUnit.convert(j8, this.timeUnit);
    }

    public long getPutTimestamp() {
        if (this.jwkSetWithTimestamp != null) {
            return this.jwkSetWithTimestamp.getDate().getTime();
        }
        return -1L;
    }

    public long getRefreshTime(TimeUnit timeUnit) {
        long j8 = this.refreshTime;
        return j8 < 0 ? j8 : timeUnit.convert(j8, this.timeUnit);
    }

    public boolean isExpired() {
        if (this.jwkSetWithTimestamp == null || this.lifespan <= -1) {
            return false;
        }
        return new Date().getTime() > TimeUnit.MILLISECONDS.convert(this.lifespan, this.timeUnit) + this.jwkSetWithTimestamp.getDate().getTime();
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetCache
    public void put(JWKSet jWKSet) {
        this.jwkSetWithTimestamp = jWKSet != null ? new JWKSetWithTimestamp(jWKSet) : null;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetCache
    public boolean requiresRefresh() {
        if (this.jwkSetWithTimestamp == null || this.refreshTime <= -1) {
            return false;
        }
        return new Date().getTime() > TimeUnit.MILLISECONDS.convert(this.refreshTime, this.timeUnit) + this.jwkSetWithTimestamp.getDate().getTime();
    }

    public DefaultJWKSetCache() {
        this(15L, 5L, TimeUnit.MINUTES);
    }
}
