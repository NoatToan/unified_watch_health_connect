package io.jsonwebtoken.security;

import io.jsonwebtoken.security.AsymmetricJwk;
import io.jsonwebtoken.security.AsymmetricJwkBuilder;
import java.security.Key;

/* JADX INFO: loaded from: classes46.dex */
public interface AsymmetricJwkBuilder<K extends Key, J extends AsymmetricJwk<K>, T extends AsymmetricJwkBuilder<K, J, T>> extends JwkBuilder<K, J, T>, X509Builder<T> {
    T publicKeyUse(String str) throws IllegalArgumentException;
}
