package rx.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.cybergarage.soap.SOAP;
import rx.Subscription;

/* JADX INFO: loaded from: classes23.dex */
public final class RefCountSubscription implements Subscription {
    public static final b c = new b(false, 0);
    private final Subscription a;
    public final AtomicReference<b> b = new AtomicReference<>(c);

    public static final class a extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 7005765588239987643L;
        public final RefCountSubscription a;

        public a(RefCountSubscription refCountSubscription) {
            this.a = refCountSubscription;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() != 0;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(0, 1)) {
                this.a.a();
            }
        }
    }

    public static final class b {
        public final boolean a;
        public final int b;

        public b(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        public b a() {
            return new b(this.a, this.b + 1);
        }

        public b b() {
            return new b(this.a, this.b - 1);
        }

        public b c() {
            return new b(true, this.b);
        }
    }

    public RefCountSubscription(Subscription subscription) {
        if (subscription == null) {
            throw new IllegalArgumentException(SOAP.XMLNS);
        }
        this.a = subscription;
    }

    private void b(b bVar) {
        if (bVar.a && bVar.b == 0) {
            this.a.unsubscribe();
        }
    }

    public void a() {
        b bVar;
        b bVarB;
        AtomicReference<b> atomicReference = this.b;
        do {
            bVar = atomicReference.get();
            bVarB = bVar.b();
        } while (!atomicReference.compareAndSet(bVar, bVarB));
        b(bVarB);
    }

    public Subscription get() {
        b bVar;
        AtomicReference<b> atomicReference = this.b;
        do {
            bVar = atomicReference.get();
            if (bVar.a) {
                return Subscriptions.unsubscribed();
            }
        } while (!atomicReference.compareAndSet(bVar, bVar.a()));
        return new a(this);
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.b.get().a;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        b bVar;
        b bVarC;
        AtomicReference<b> atomicReference = this.b;
        do {
            bVar = atomicReference.get();
            if (bVar.a) {
                return;
            } else {
                bVarC = bVar.c();
            }
        } while (!atomicReference.compareAndSet(bVar, bVarC));
        b(bVarC);
    }
}
