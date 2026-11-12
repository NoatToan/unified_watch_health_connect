package io.reactivex.internal.subscriptions;

import defpackage.fgi;
import defpackage.yno;

/* JADX INFO: loaded from: classes2.dex */
public enum EmptySubscription implements fgi<Object> {
    INSTANCE;

    public static void complete(yno<?> ynoVar) {
        ynoVar.onSubscribe(INSTANCE);
        ynoVar.onComplete();
    }

    public static void error(Throwable th, yno<?> ynoVar) {
        ynoVar.onSubscribe(INSTANCE);
        ynoVar.onError(th);
    }

    @Override // defpackage.joo
    public void cancel() {
    }

    @Override // defpackage.jdm
    public void clear() {
    }

    @Override // defpackage.jdm
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.jdm
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.jdm
    public Object poll() {
        return null;
    }

    @Override // defpackage.joo
    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    @Override // defpackage.dgi
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
