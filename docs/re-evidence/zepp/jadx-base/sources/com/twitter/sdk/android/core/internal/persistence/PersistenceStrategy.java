package com.twitter.sdk.android.core.internal.persistence;

/* JADX INFO: loaded from: classes18.dex */
public interface PersistenceStrategy<T> {
    void clear();

    T restore();

    void save(T t);
}
