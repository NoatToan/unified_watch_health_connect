package io.jsonwebtoken.security;

import java.io.InputStream;
import java.security.Key;

/* JADX INFO: loaded from: classes46.dex */
public interface SecureDigestAlgorithm<S extends Key, V extends Key> extends DigestAlgorithm<SecureRequest<InputStream, S>, VerifySecureDigestRequest<V>> {
}
