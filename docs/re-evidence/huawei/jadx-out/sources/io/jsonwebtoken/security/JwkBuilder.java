package io.jsonwebtoken.security;

import io.jsonwebtoken.lang.MapMutator;
import io.jsonwebtoken.lang.NestedCollection;
import io.jsonwebtoken.security.Jwk;
import io.jsonwebtoken.security.JwkBuilder;
import java.security.Key;

/* JADX INFO: loaded from: classes46.dex */
public interface JwkBuilder<K extends Key, J extends Jwk<K>, T extends JwkBuilder<K, J, T>> extends MapMutator<String, Object, T>, SecurityBuilder<J, T>, KeyOperationPolicied<T> {
    T algorithm(String str) throws IllegalArgumentException;

    T id(String str) throws IllegalArgumentException;

    T idFromThumbprint();

    T idFromThumbprint(HashAlgorithm hashAlgorithm);

    NestedCollection<KeyOperation, T> operations();
}
