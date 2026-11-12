package com.twitter.sdk.android.core.internal.persistence;

/* JADX INFO: loaded from: classes18.dex */
public interface SerializationStrategy<T> {
    T deserialize(String str);

    String serialize(T t);
}
