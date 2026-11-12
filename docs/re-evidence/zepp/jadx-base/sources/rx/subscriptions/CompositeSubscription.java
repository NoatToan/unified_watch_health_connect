package rx.subscriptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import rx.Subscription;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes23.dex */
public final class CompositeSubscription implements Subscription {
    private Set<Subscription> a;
    private volatile boolean b;

    public CompositeSubscription() {
    }

    private static void a(Collection<Subscription> collection) {
        if (collection == null) {
            return;
        }
        ArrayList arrayList = null;
        Iterator<Subscription> it2 = collection.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().unsubscribe();
            } catch (Throwable th) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        Exceptions.throwIfAny(arrayList);
    }

    public void add(Subscription subscription) {
        if (subscription.isUnsubscribed()) {
            return;
        }
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    if (this.a == null) {
                        this.a = new HashSet(4);
                    }
                    this.a.add(subscription);
                    return;
                }
            }
        }
        subscription.unsubscribe();
    }

    public void addAll(Subscription... subscriptionArr) {
        int i = 0;
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    if (this.a == null) {
                        this.a = new HashSet(subscriptionArr.length);
                    }
                    int length = subscriptionArr.length;
                    while (i < length) {
                        Subscription subscription = subscriptionArr[i];
                        if (!subscription.isUnsubscribed()) {
                            this.a.add(subscription);
                        }
                        i++;
                    }
                    return;
                }
            }
        }
        int length2 = subscriptionArr.length;
        while (i < length2) {
            subscriptionArr[i].unsubscribe();
            i++;
        }
    }

    public void clear() {
        Set<Subscription> set;
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b && (set = this.a) != null) {
                this.a = null;
                a(set);
            }
        }
    }

    public boolean hasSubscriptions() {
        Set<Subscription> set;
        boolean z = false;
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (!this.b && (set = this.a) != null && !set.isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.b;
    }

    public void remove(Subscription subscription) {
        Set<Subscription> set;
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (!this.b && (set = this.a) != null) {
                boolean zRemove = set.remove(subscription);
                if (zRemove) {
                    subscription.unsubscribe();
                }
            }
        }
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            Set<Subscription> set = this.a;
            this.a = null;
            a(set);
        }
    }

    public CompositeSubscription(Subscription... subscriptionArr) {
        this.a = new HashSet(Arrays.asList(subscriptionArr));
    }
}
