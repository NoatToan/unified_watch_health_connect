package io.jsonwebtoken.security;

import java.net.URI;

/* JADX INFO: loaded from: classes46.dex */
public interface JwkThumbprint {
    HashAlgorithm getHashAlgorithm();

    byte[] toByteArray();

    String toString();

    URI toURI();
}
