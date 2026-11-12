package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class CompletableOnSubscribeConcatArray implements Completable.OnSubscribe {
    public final Completable[] a;

    public static final class a extends AtomicInteger implements CompletableSubscriber {
        private static final long serialVersionUID = -7965400327305809232L;
        public final CompletableSubscriber a;
        public final Completable[] b;
        public int c;
        public final SerialSubscription d = new SerialSubscription();

        public a(CompletableSubscriber completableSubscriber, Completable[] completableArr) {
            this.a = completableSubscriber;
            this.b = completableArr;
        }

        public void a() {
            if (!this.d.isUnsubscribed() && getAndIncrement() == 0) {
                Completable[] completableArr = this.b;
                while (!this.d.isUnsubscribed()) {
                    int i = this.c;
                    this.c = i + 1;
                    if (i == completableArr.length) {
                        this.a.onCompleted();
                        return;
                    } else {
                        completableArr[i].unsafeSubscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
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
            this.d.set(subscription);
        }
    }

    public CompletableOnSubscribeConcatArray(Completable[] completableArr) {
        this.a = completableArr;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        a aVar = new a(completableSubscriber, this.a);
        completableSubscriber.onSubscribe(aVar.d);
        aVar.a();
    }
}
