package io.jsonwebtoken.security;

import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes46.dex */
public interface MacAlgorithm extends SecureDigestAlgorithm<SecretKey, SecretKey>, KeyBuilderSupplier<SecretKey, SecretKeyBuilder>, KeyLengthSupplier {
}
