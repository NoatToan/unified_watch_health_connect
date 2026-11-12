package rx.internal.operators;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.subscriptions.SerialSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class CompletableOnSubscribeConcatIterable implements Completable.OnSubscribe {
    public final Iterable<? extends Completable> a;

    public static final class a extends AtomicInteger implements CompletableSubscriber {
        private static final long serialVersionUID = -7965400327305809232L;
        public final CompletableSubscriber a;
        public final Iterator<? extends Completable> b;
        public final SerialSubscription c = new SerialSubscription();

        public a(CompletableSubscriber completableSubscriber, Iterator<? extends Completable> it2) {
            this.a = completableSubscriber;
            this.b = it2;
        }

        public void a() {
            if (!this.c.isUnsubscribed() && getAndIncrement() == 0) {
                Iterator<? extends Completable> it2 = this.b;
                while (!this.c.isUnsubscribed()) {
                    try {
                        if (!it2.hasNext()) {
                            this.a.onCompleted();
                            return;
                        }
                        try {
                            Completable next = it2.next();
                            if (next == null) {
                                this.a.onError(new NullPointerException("The completable returned is null"));
                                return;
                            } else {
                                next.unsafeSubscribe(this);
                                if (decrementAndGet() == 0) {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            this.a.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        this.a.onError(th2);
                        return;
                    }
                }
            }
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            a();
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.c.set(subscription);
        }
    }

    public CompletableOnSubscribeConcatIterable(Iterable<? extends Completable> iterable) {
        this.a = iterable;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        try {
            Iterator<? extends Completable> it2 = this.a.iterator();
            if (it2 == null) {
                completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                completableSubscriber.onError(new NullPointerException("The iterator returned is null"));
            } else {
                a aVar = new a(completableSubscriber, it2);
                completableSubscriber.onSubscribe(aVar.c);
                aVar.a();
            }
        } catch (Throwable th) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
            completableSubscriber.onError(th);
        }
    }
}
