package rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.internal.util.atomic.MpscLinkedAtomicQueue;
import rx.internal.util.unsafe.MpscLinkedQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class CompletableOnSubscribeMergeDelayErrorIterable implements Completable.OnSubscribe {
    public final Iterable<? extends Completable> a;

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

    public CompletableOnSubscribeMergeDelayErrorIterable(Iterable<? extends Completable> iterable) {
        this.a = iterable;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        completableSubscriber.onSubscribe(compositeSubscription);
        try {
            Iterator<? extends Completable> it2 = this.a.iterator();
            if (it2 == null) {
                completableSubscriber.onError(new NullPointerException("The source iterator returned is null"));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(1);
            Queue mpscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new MpscLinkedQueue() : new MpscLinkedAtomicQueue();
            while (!compositeSubscription.isUnsubscribed()) {
                try {
                    if (!it2.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (mpscLinkedQueue.isEmpty()) {
                                completableSubscriber.onCompleted();
                                return;
                            } else {
                                completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(mpscLinkedQueue));
                                return;
                            }
                        }
                        return;
                    }
                    if (compositeSubscription.isUnsubscribed()) {
                        return;
                    }
                    try {
                        Completable next = it2.next();
                        if (compositeSubscription.isUnsubscribed()) {
                            return;
                        }
                        if (next == null) {
                            mpscLinkedQueue.offer(new NullPointerException("A completable source is null"));
                            if (atomicInteger.decrementAndGet() == 0) {
                                if (mpscLinkedQueue.isEmpty()) {
                                    completableSubscriber.onCompleted();
                                    return;
                                } else {
                                    completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(mpscLinkedQueue));
                                    return;
                                }
                            }
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        next.unsafeSubscribe(new a(compositeSubscription, mpscLinkedQueue, atomicInteger, completableSubscriber));
                    } catch (Throwable th) {
                        mpscLinkedQueue.offer(th);
                        if (atomicInteger.decrementAndGet() == 0) {
                            if (mpscLinkedQueue.isEmpty()) {
                                completableSubscriber.onCompleted();
                                return;
                            } else {
                                completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(mpscLinkedQueue));
                                return;
                            }
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    mpscLinkedQueue.offer(th2);
                    if (atomicInteger.decrementAndGet() == 0) {
                        if (mpscLinkedQueue.isEmpty()) {
                            completableSubscriber.onCompleted();
                            return;
                        } else {
                            completableSubscriber.onError(CompletableOnSubscribeMerge.collectErrors(mpscLinkedQueue));
                            return;
                        }
                    }
                    return;
                }
            }
        } catch (Throwable th3) {
            completableSubscriber.onError(th3);
        }
    }
}
