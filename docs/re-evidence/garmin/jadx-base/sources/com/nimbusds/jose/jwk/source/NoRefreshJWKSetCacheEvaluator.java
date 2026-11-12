package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;

/* JADX INFO: loaded from: classes3.dex */
class NoRefreshJWKSetCacheEvaluator extends JWKSetCacheRefreshEvaluator {
    private static final NoRefreshJWKSetCacheEvaluator INSTANCE = new NoRefreshJWKSetCacheEvaluator();

    private NoRefreshJWKSetCacheEvaluator() {
    }

    public static NoRefreshJWKSetCacheEvaluator getInstance() {
        return INSTANCE;
    }

    public boolean equals(Object obj) {
        return obj instanceof NoRefreshJWKSetCacheEvaluator;
    }

    public int hashCode() {
        return 0;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator
    public boolean requiresRefresh(JWKSet jWKSet) {
        return false;
    }
}
