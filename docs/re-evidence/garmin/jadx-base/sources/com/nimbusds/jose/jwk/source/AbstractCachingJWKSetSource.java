package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.cache.CachedObject;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
abstract class AbstractCachingJWKSetSource<C extends SecurityContext> extends JWKSetSourceWrapper<C> {
    private volatile CachedObject<JWKSet> cachedJWKSet;
    private final long timeToLive;

    public AbstractCachingJWKSetSource(JWKSetSource<C> jWKSetSource, long j8) {
        super(jWKSetSource);
        this.timeToLive = j8;
    }

    public CachedObject<JWKSet> cacheJWKSet(JWKSet jWKSet, long j8) {
        CachedObject<JWKSet> cachedObject = new CachedObject<>(jWKSet, currentTimeMillis(), CachedObject.computeExpirationTime(j8, getTimeToLive()));
        setCachedJWKSet(cachedObject);
        return cachedObject;
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public CachedObject<JWKSet> getCachedJWKSet() {
        return this.cachedJWKSet;
    }

    public CachedObject<JWKSet> getCachedJWKSetIfValid(long j8) {
        CachedObject<JWKSet> cachedJWKSet = getCachedJWKSet();
        if (cachedJWKSet == null || !cachedJWKSet.isValid(j8)) {
            return null;
        }
        return cachedJWKSet;
    }

    public long getTimeToLive() {
        return this.timeToLive;
    }

    public void setCachedJWKSet(CachedObject<JWKSet> cachedObject) {
        this.cachedJWKSet = cachedObject;
    }
}
