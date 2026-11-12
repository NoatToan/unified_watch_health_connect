package rx.internal.subscriptions;

import defpackage.koo;
import defpackage.noo;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class SequentialSubscription extends AtomicReference<koo> implements koo {
    private static final long serialVersionUID = 995205034283130269L;

    public SequentialSubscription() {
    }

    public koo current() {
        koo kooVar = (koo) super.get();
        return kooVar == Unsubscribed.INSTANCE ? noo.b() : kooVar;
    }

    @Override // defpackage.koo
    public boolean isUnsubscribed() {
        return get() == Unsubscribed.INSTANCE;
    }

    public boolean replace(koo kooVar) {
        koo kooVar2;
        do {
            kooVar2 = get();
            if (kooVar2 == Unsubscribed.INSTANCE) {
                if (kooVar == null) {
                    return false;
                }
                kooVar.unsubscribe();
                return false;
            }
        } while (!compareAndSet(kooVar2, kooVar));
        return true;
    }

    public boolean replaceWeak(koo kooVar) {
        koo kooVar2 = get();
        Unsubscribed unsubscribed = Unsubscribed.INSTANCE;
        if (kooVar2 == unsubscribed) {
            if (kooVar != null) {
                kooVar.unsubscribe();
            }
            return false;
        }
        if (compareAndSet(kooVar2, kooVar) || get() != unsubscribed) {
            return true;
        }
        if (kooVar != null) {
            kooVar.unsubscribe();
        }
        return false;
    }

    @Override // defpackage.koo
    public void unsubscribe() {
        koo andSet;
        koo kooVar = get();
        Unsubscribed unsubscribed = Unsubscribed.INSTANCE;
        if (kooVar == unsubscribed || (andSet = getAndSet(unsubscribed)) == null || andSet == unsubscribed) {
            return;
        }
        andSet.unsubscribe();
    }

    public boolean update(koo kooVar) {
        koo kooVar2;
        do {
            kooVar2 = get();
            if (kooVar2 == Unsubscribed.INSTANCE) {
                if (kooVar == null) {
                    return false;
                }
                kooVar.unsubscribe();
                return false;
            }
        } while (!compareAndSet(kooVar2, kooVar));
        if (kooVar2 == null) {
            return true;
        }
        kooVar2.unsubscribe();
        return true;
    }

    public boolean updateWeak(koo kooVar) {
        koo kooVar2 = get();
        Unsubscribed unsubscribed = Unsubscribed.INSTANCE;
        if (kooVar2 == unsubscribed) {
            if (kooVar != null) {
                kooVar.unsubscribe();
            }
            return false;
        }
        if (compareAndSet(kooVar2, kooVar)) {
            return true;
        }
        koo kooVar3 = get();
        if (kooVar != null) {
            kooVar.unsubscribe();
        }
        return kooVar3 == unsubscribed;
    }

    public SequentialSubscription(koo kooVar) {
        lazySet(kooVar);
    }
}
