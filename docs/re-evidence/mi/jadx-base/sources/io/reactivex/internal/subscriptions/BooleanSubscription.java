package io.reactivex.internal.subscriptions;

import defpackage.joo;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class BooleanSubscription extends AtomicBoolean implements joo {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // defpackage.joo
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // defpackage.joo
    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
