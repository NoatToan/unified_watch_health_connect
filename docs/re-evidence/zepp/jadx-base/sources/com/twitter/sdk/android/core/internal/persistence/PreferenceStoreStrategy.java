package com.twitter.sdk.android.core.internal.persistence;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes18.dex */
public class PreferenceStoreStrategy<T> implements PersistenceStrategy<T> {
    private final PreferenceStore a;
    private final SerializationStrategy<T> b;
    private final String c;

    public PreferenceStoreStrategy(PreferenceStore preferenceStore, SerializationStrategy<T> serializationStrategy, String str) {
        this.a = preferenceStore;
        this.b = serializationStrategy;
        this.c = str;
    }

    @Override // com.twitter.sdk.android.core.internal.persistence.PersistenceStrategy
    @SuppressLint({"CommitPrefEdits"})
    public void clear() {
        this.a.edit().remove(this.c).commit();
    }

    @Override // com.twitter.sdk.android.core.internal.persistence.PersistenceStrategy
    public T restore() {
        return this.b.deserialize(this.a.get().getString(this.c, null));
    }

    @Override // com.twitter.sdk.android.core.internal.persistence.PersistenceStrategy
    @SuppressLint({"CommitPrefEdits"})
    public void save(T t) {
        PreferenceStore preferenceStore = this.a;
        preferenceStore.save(preferenceStore.edit().putString(this.c, this.b.serialize(t)));
    }
}
