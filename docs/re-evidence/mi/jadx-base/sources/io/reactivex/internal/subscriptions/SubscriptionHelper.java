package io.reactivex.internal.subscriptions;

import defpackage.d8i;
import defpackage.gx1;
import defpackage.joo;
import defpackage.t5l;
import defpackage.x3h;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public enum SubscriptionHelper implements joo {
    CANCELLED;

    public static void deferredRequest(AtomicReference<joo> atomicReference, AtomicLong atomicLong, long j) {
        joo jooVar = atomicReference.get();
        if (jooVar != null) {
            jooVar.request(j);
            return;
        }
        if (validate(j)) {
            gx1.a(atomicLong, j);
            joo jooVar2 = atomicReference.get();
            if (jooVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    jooVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<joo> atomicReference, AtomicLong atomicLong, joo jooVar) {
        if (!setOnce(atomicReference, jooVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        jooVar.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<joo> atomicReference, joo jooVar) {
        joo jooVar2;
        do {
            jooVar2 = atomicReference.get();
            if (jooVar2 == CANCELLED) {
                if (jooVar == null) {
                    return false;
                }
                jooVar.cancel();
                return false;
            }
        } while (!d8i.a(atomicReference, jooVar2, jooVar));
        return true;
    }

    public static void reportMoreProduced(long j) {
        t5l.p(new ProtocolViolationException("More produced than requested: " + j));
    }

    public static void reportSubscriptionSet() {
        t5l.p(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<joo> atomicReference, joo jooVar) {
        joo jooVar2;
        do {
            jooVar2 = atomicReference.get();
            if (jooVar2 == CANCELLED) {
                if (jooVar == null) {
                    return false;
                }
                jooVar.cancel();
                return false;
            }
        } while (!d8i.a(atomicReference, jooVar2, jooVar));
        if (jooVar2 == null) {
            return true;
        }
        jooVar2.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<joo> atomicReference, joo jooVar) {
        x3h.d(jooVar, "s is null");
        if (d8i.a(atomicReference, null, jooVar)) {
            return true;
        }
        jooVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(joo jooVar, joo jooVar2) {
        if (jooVar2 == null) {
            t5l.p(new NullPointerException("next is null"));
            return false;
        }
        if (jooVar == null) {
            return true;
        }
        jooVar2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // defpackage.joo
    public void cancel() {
    }

    @Override // defpackage.joo
    public void request(long j) {
    }

    public static boolean cancel(AtomicReference<joo> atomicReference) {
        joo andSet;
        joo jooVar = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (jooVar == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j) {
        if (j > 0) {
            return true;
        }
        t5l.p(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    public static boolean setOnce(AtomicReference<joo> atomicReference, joo jooVar, long j) {
        if (!setOnce(atomicReference, jooVar)) {
            return false;
        }
        jooVar.request(j);
        return true;
    }
}
