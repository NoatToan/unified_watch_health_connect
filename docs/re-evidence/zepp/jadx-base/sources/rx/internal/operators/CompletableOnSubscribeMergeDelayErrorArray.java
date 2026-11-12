package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class CompletableOnSubscribeMergeDelayErrorArray implements Completable.OnSubscribe {
    public final Completable[] a;

    public class a implements CompletableSubscriber {
        public final /* synthetic */ CompositeSubscription a;
        public final /* synthetic */ Queue b;
        public final /* synthetic */ AtomicInteger c;
        public final /* synthetic */ CompletableSubscriber d;

        public a(CompositeSubscription compositeSubscription, Queue queue, AtomicInteger atomicInteger, CompletableSubscriber completableSubscriber) {
            this.a = compositeSubscription;
            this.b = queue;
            this.c = atomicInteger;
            this.d = completableSubscriber;
        }

        public void a() {
            if (this.c.decrementAndGet() == 0) {
                if (this.b.isEmpty()) {
                    this.d.onCompleted();
                } else {
                    this.d.onError(CompletableOnSubscribeMerge.collectErrors(this.b));
                }
            }
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            a();
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            this.b.offer(th);
            a();
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.a.add(subscription);
        }
    }

    public CompletableOnSubscribeMergeDelayErrorArray(Completable[] completableArr) {
        this.a = completableArr;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        AtomicInteger atomicInteger = new AtomicInteger(this.a.length + 1);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        completableSubscriber.onSubscribe(compositeSubscription);
        for (Completable completable : this.a) {
            if (compositeSubscription.isUnsubscribed()) {
                return;
            }
            if (completable == null) {
                concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                completable.unsafeSubscribe(new a(compositeSubscription, concurrentLinkedQueue, atomicInteger, completableSubscriber));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            if (concurrentLinkedQueue.isEmpty()) {
                completableSubscriber.onCompleted();
            } else {
                completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(concurrentLinkedQueue));
            }
        }
    }
}
