package rx;

import rx.internal.util.SubscriptionList;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Subscriber<T> implements Observer<T>, Subscription {
    private static final long e = Long.MIN_VALUE;
    private final SubscriptionList a;
    private final Subscriber<?> b;
    private Producer c;
    private long d;

    public Subscriber() {
        this(null, false);
    }

    private void a(long j) {
        long j2 = this.d;
        if (j2 == Long.MIN_VALUE) {
            this.d = j;
            return;
        }
        long j3 = j2 + j;
        if (j3 < 0) {
            this.d = Long.MAX_VALUE;
        } else {
            this.d = j3;
        }
    }

    public final void add(Subscription subscription) {
        this.a.add(subscription);
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }

    public void onStart() {
    }

    public final void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("number requested cannot be negative: " + j);
        }
        synchronized (this) {
            Producer producer = this.c;
            if (producer != null) {
                producer.request(j);
            } else {
                a(j);
            }
        }
    }

    public void setProducer(Producer producer) {
        long j;
        Subscriber<?> subscriber;
        boolean z;
        synchronized (this) {
            j = this.d;
            this.c = producer;
            subscriber = this.b;
            z = subscriber != null && j == Long.MIN_VALUE;
        }
        if (z) {
            subscriber.setProducer(producer);
        } else if (j == Long.MIN_VALUE) {
            producer.request(Long.MAX_VALUE);
        } else {
            producer.request(j);
        }
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.a.unsubscribe();
    }

    public Subscriber(Subscriber<?> subscriber) {
        this(subscriber, true);
    }

    public Subscriber(Subscriber<?> subscriber, boolean z) {
        this.d = Long.MIN_VALUE;
        this.b = subscriber;
        this.a = (!z || subscriber == null) ? new SubscriptionList() : subscriber.a;
    }
}
