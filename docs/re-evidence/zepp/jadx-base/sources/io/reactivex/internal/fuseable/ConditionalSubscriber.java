package io.reactivex.internal.fuseable;

import io.reactivex.FlowableSubscriber;

/* JADX INFO: loaded from: classes22.dex */
public interface ConditionalSubscriber<T> extends FlowableSubscriber<T> {
    boolean tryOnNext(T t);
}
