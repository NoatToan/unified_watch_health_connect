package org.reactivestreams;

/* JADX INFO: loaded from: classes23.dex */
public interface Subscription {
    void cancel();

    void request(long j);
}
