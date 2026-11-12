package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.jwk.source.JWKSetSource;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.util.events.Event;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class AbstractJWKSetSourceEvent<S extends JWKSetSource<C>, C extends SecurityContext> implements Event<S, C> {
    private final C context;
    private final S source;

    public AbstractJWKSetSourceEvent(S s8, C c14) {
        Objects.requireNonNull(s8);
        this.source = s8;
        this.context = c14;
    }

    @Override // com.nimbusds.jose.util.events.Event
    public C getContext() {
        return this.context;
    }

    @Override // com.nimbusds.jose.util.events.Event
    public S getSource() {
        return this.source;
    }
}
