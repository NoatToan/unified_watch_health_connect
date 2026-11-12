package com.google.common.cache;

import defpackage.c6i;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes5.dex */
public final class RemovalNotification<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final RemovalCause cause;

    private RemovalNotification(K k2, V v, RemovalCause removalCause) {
        super(k2, v);
        this.cause = (RemovalCause) c6i.o(removalCause);
    }

    public static <K, V> RemovalNotification<K, V> create(K k2, V v, RemovalCause removalCause) {
        return new RemovalNotification<>(k2, v, removalCause);
    }

    public RemovalCause getCause() {
        return this.cause;
    }

    public boolean wasEvicted() {
        return this.cause.wasEvicted();
    }
}
