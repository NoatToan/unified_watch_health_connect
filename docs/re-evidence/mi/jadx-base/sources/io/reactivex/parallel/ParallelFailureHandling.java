package io.reactivex.parallel;

import defpackage.oi2;

/* JADX INFO: loaded from: classes2.dex */
public enum ParallelFailureHandling implements oi2<Long, Throwable, ParallelFailureHandling> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // defpackage.oi2
    public ParallelFailureHandling apply(Long l, Throwable th) {
        return this;
    }
}
