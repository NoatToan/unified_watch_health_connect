package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.shaded.jcip.Immutable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Deprecated
public final class JWKSetWithTimestamp {
    private final JWKSet jwkSet;
    private final Date timestamp;

    public JWKSetWithTimestamp(JWKSet jWKSet, Date date) {
        Objects.requireNonNull(jWKSet);
        this.jwkSet = jWKSet;
        Objects.requireNonNull(date);
        this.timestamp = date;
    }

    public Date getDate() {
        return this.timestamp;
    }

    public JWKSet getJWKSet() {
        return this.jwkSet;
    }

    public JWKSetWithTimestamp(JWKSet jWKSet) {
        this(jWKSet, new Date());
    }
}
