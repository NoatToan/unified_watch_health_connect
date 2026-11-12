package rx.internal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.Subscription;
import rx.exceptions.Exceptions;

/* JADX INFO: loaded from: classes23.dex */
public final class SubscriptionList implements Subscription {
    private List<Subscription> a;
    private volatile boolean b;

    public SubscriptionList() {
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
                    List linkedList = this.a;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.a = linkedList;
                    }
                    linkedList.add(subscription);
                    return;
                }
            }
        }
        subscription.unsubscribe();
    }

    public void clear() {
        List<Subscription> list;
        if (this.b) {
            return;
        }
        synchronized (this) {
            list = this.a;
            this.a = null;
        }
        a(list);
    }

    public boolean hasSubscriptions() {
        List<Subscription> list;
        boolean z = false;
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (!this.b && (list = this.a) != null && !list.isEmpty()) {
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
        if (this.b) {
            return;
        }
        synchronized (this) {
            List<Subscription> list = this.a;
            if (!this.b && list != null) {
                boolean zRemove = list.remove(subscription);
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
            List<Subscription> list = this.a;
            this.a = null;
            a(list);
        }
    }

    public SubscriptionList(Subscription... subscriptionArr) {
        this.a = new LinkedList(Arrays.asList(subscriptionArr));
    }

    public SubscriptionList(Subscription subscription) {
        LinkedList linkedList = new LinkedList();
        this.a = linkedList;
        linkedList.add(subscription);
    }
}
