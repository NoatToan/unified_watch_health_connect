package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface JWKSetSource<C extends SecurityContext> extends Closeable {
    JWKSet getJWKSet(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j8, C c14);
}
