package io.jsonwebtoken.security;

import java.security.Key;

/* JADX INFO: loaded from: classes46.dex */
public interface KeySupplier<K extends Key> {
    K getKey();
}
