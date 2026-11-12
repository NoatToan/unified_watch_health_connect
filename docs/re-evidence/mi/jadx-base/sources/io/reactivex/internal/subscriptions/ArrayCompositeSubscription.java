package io.reactivex.internal.subscriptions;

import defpackage.joo;
import defpackage.jz6;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<joo> implements jz6 {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i) {
        super(i);
    }

    @Override // defpackage.jz6
    public void dispose() {
        joo andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                joo jooVar = get(i);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (jooVar != subscriptionHelper && (andSet = getAndSet(i, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }

    public joo replaceResource(int i, joo jooVar) {
        joo jooVar2;
        do {
            jooVar2 = get(i);
            if (jooVar2 == SubscriptionHelper.CANCELLED) {
                if (jooVar == null) {
                    return null;
                }
                jooVar.cancel();
                return null;
            }
        } while (!compareAndSet(i, jooVar2, jooVar));
        return jooVar2;
    }

    public boolean setResource(int i, joo jooVar) {
        joo jooVar2;
        do {
            jooVar2 = get(i);
            if (jooVar2 == SubscriptionHelper.CANCELLED) {
                if (jooVar == null) {
                    return false;
                }
                jooVar.cancel();
                return false;
            }
        } while (!compareAndSet(i, jooVar2, jooVar));
        if (jooVar2 == null) {
            return true;
        }
        jooVar2.cancel();
        return true;
    }
}
