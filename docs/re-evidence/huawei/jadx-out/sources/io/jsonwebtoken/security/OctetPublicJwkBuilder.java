package io.jsonwebtoken.security;

import java.security.PrivateKey;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes46.dex */
public interface OctetPublicJwkBuilder<A extends PublicKey, B extends PrivateKey> extends PublicJwkBuilder<A, B, OctetPublicJwk<A>, OctetPrivateJwk<B, A>, OctetPrivateJwkBuilder<B, A>, OctetPublicJwkBuilder<A, B>> {
}
