package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class CompletableOnSubscribeMergeArray implements Completable.OnSubscribe {
    public final Completable[] a;

    public class a implements CompletableSubscriber {
        public final /* synthetic */ CompositeSubscription a;
        public final /* synthetic */ AtomicBoolean b;
        public final /* synthetic */ CompletableSubscriber c;
        public final /* synthetic */ AtomicInteger d;

        public a(CompositeSubscription compositeSubscription, AtomicBoolean atomicBoolean, CompletableSubscriber completableSubscriber, AtomicInteger atomicInteger) {
            this.a = compositeSubscription;
            this.b = atomicBoolean;
            this.c = completableSubscriber;
            this.d = atomicInteger;
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            if (this.d.decrementAndGet() == 0 && this.b.compareAndSet(false, true)) {
                this.c.onCompleted();
            }
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            this.a.unsubscribe();
            if (this.b.compareAndSet(false, true)) {
                this.c.onError(th);
            } else {
                RxJavaHooks.onError(th);
            }
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.a.add(subscription);
        }
    }

    public CompletableOnSubscribeMergeArray(Completable[] completableArr) {
        this.a = completableArr;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        boolean z = true;
        AtomicInteger atomicInteger = new AtomicInteger(this.a.length + 1);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        completableSubscriber.onSubscribe(compositeSubscription);
        Completable[] completableArr = this.a;
        int length = completableArr.length;
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            Completable completable = completableArr[i];
            if (compositeSubscription.isUnsubscribed()) {
                return;
            }
            if (completable == null) {
                compositeSubscription.unsubscribe();
                Throwable nullPointerException = new NullPointerException("A completable source is null");
                if (atomicBoolean.compareAndSet(z2, z)) {
                    completableSubscriber.onError(nullPointerException);
                    return;
                }
                RxJavaHooks.onError(nullPointerException);
            }
            completable.unsafeSubscribe(new a(compositeSubscription, atomicBoolean, completableSubscriber, atomicInteger));
            i++;
            z = true;
            z2 = false;
        }
        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
            completableSubscriber.onCompleted();
        }
    }
}
