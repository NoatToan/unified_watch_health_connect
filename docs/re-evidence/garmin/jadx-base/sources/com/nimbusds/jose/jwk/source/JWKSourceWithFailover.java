package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.KeySourceException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSelector;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.IOUtils;
import java.io.Closeable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class JWKSourceWithFailover<C extends SecurityContext> implements JWKSource<C>, Closeable {
    private final JWKSource<C> failoverJWKSource;
    private final JWKSource<C> jwkSource;

    public JWKSourceWithFailover(JWKSource<C> jWKSource, JWKSource<C> jWKSource2) {
        Objects.requireNonNull(jWKSource, "The primary JWK source must not be null");
        this.jwkSource = jWKSource;
        this.failoverJWKSource = jWKSource2;
    }

    private List<JWK> failover(Exception exc, JWKSelector jWKSelector, C c14) throws KeySourceException {
        try {
            return this.failoverJWKSource.get(jWKSelector, c14);
        } catch (KeySourceException e4) {
            throw new KeySourceException(exc.getMessage() + "; Failover JWK source retrieval failed with: " + e4.getMessage(), e4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JWKSource<C> jWKSource = this.jwkSource;
        if (jWKSource instanceof Closeable) {
            IOUtils.closeSilently((Closeable) jWKSource);
        }
        JWKSource<C> jWKSource2 = this.failoverJWKSource;
        if (jWKSource2 instanceof Closeable) {
            IOUtils.closeSilently((Closeable) jWKSource2);
        }
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSource
    public List<JWK> get(JWKSelector jWKSelector, C c14) {
        try {
            return this.jwkSource.get(jWKSelector, c14);
        } catch (Exception e4) {
            return failover(e4, jWKSelector, c14);
        }
    }
}
