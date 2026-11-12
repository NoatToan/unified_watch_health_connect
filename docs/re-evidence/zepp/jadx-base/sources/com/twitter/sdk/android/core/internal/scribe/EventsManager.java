package com.twitter.sdk.android.core.internal.scribe;

/* JADX INFO: loaded from: classes18.dex */
public interface EventsManager<T> {
    void deleteAllEvents();

    void recordEvent(T t);

    void sendEvents();
}
