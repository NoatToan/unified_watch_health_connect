package rx.observables;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.Func1;
import rx.internal.operators.BlockingOperatorLatest;
import rx.internal.operators.BlockingOperatorMostRecent;
import rx.internal.operators.BlockingOperatorNext;
import rx.internal.operators.BlockingOperatorToFuture;
import rx.internal.operators.BlockingOperatorToIterator;
import rx.internal.operators.NotificationLite;
import rx.internal.util.BlockingUtils;
import rx.internal.util.UtilityFunctions;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class BlockingObservable<T> {
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final Object d = new Object();
    private final Observable<? extends T> a;

    public class a extends Subscriber<T> {
        public final /* synthetic */ CountDownLatch f;
        public final /* synthetic */ AtomicReference g;
        public final /* synthetic */ Action1 h;

        public a(CountDownLatch countDownLatch, AtomicReference atomicReference, Action1 action1) {
            this.f = countDownLatch;
            this.g = atomicReference;
            this.h = action1;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.countDown();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.set(th);
            this.f.countDown();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.h.call(t);
        }
    }

    public class b implements Iterable<T> {
        public b() {
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return BlockingObservable.this.getIterator();
        }
    }

    public class c extends Subscriber<T> {
        public final /* synthetic */ CountDownLatch f;
        public final /* synthetic */ AtomicReference g;
        public final /* synthetic */ AtomicReference h;

        public c(CountDownLatch countDownLatch, AtomicReference atomicReference, AtomicReference atomicReference2) {
            this.f = countDownLatch;
            this.g = atomicReference;
            this.h = atomicReference2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.countDown();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.set(th);
            this.f.countDown();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.h.set(t);
        }
    }

    public class d extends Subscriber<T> {
        public final /* synthetic */ Throwable[] f;
        public final /* synthetic */ CountDownLatch g;

        public d(Throwable[] thArr, CountDownLatch countDownLatch) {
            this.f = thArr;
            this.g = countDownLatch;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.g.countDown();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f[0] = th;
            this.g.countDown();
        }

        @Override // rx.Observer
        public void onNext(T t) {
        }
    }

    public class e extends Subscriber<T> {
        public final /* synthetic */ BlockingQueue f;

        public e(BlockingQueue blockingQueue) {
            this.f = blockingQueue;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.offer(NotificationLite.completed());
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.offer(NotificationLite.error(th));
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.offer(NotificationLite.next(t));
        }
    }

    public class f extends Subscriber<T> {
        public final /* synthetic */ BlockingQueue f;
        public final /* synthetic */ Producer[] g;

        public f(BlockingQueue blockingQueue, Producer[] producerArr) {
            this.f = blockingQueue;
            this.g = producerArr;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.offer(NotificationLite.completed());
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.offer(NotificationLite.error(th));
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.offer(NotificationLite.next(t));
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            this.f.offer(BlockingObservable.b);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.g[0] = producer;
            this.f.offer(BlockingObservable.c);
        }
    }

    public class g implements Action0 {
        public final /* synthetic */ BlockingQueue a;

        public g(BlockingQueue blockingQueue) {
            this.a = blockingQueue;
        }

        @Override // rx.functions.Action0
        public void call() {
            this.a.offer(BlockingObservable.d);
        }
    }

    public class h implements Action1<Throwable> {
        public h() {
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    }

    public class i implements Observer<T> {
        public final /* synthetic */ Action1 a;
        public final /* synthetic */ Action1 b;
        public final /* synthetic */ Action0 c;

        public i(Action1 action1, Action1 action2, Action0 action0) {
            this.a = action1;
            this.b = action2;
            this.c = action0;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.c.call();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.b.call(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.a.call(t);
        }
    }

    private BlockingObservable(Observable<? extends T> observable) {
        this.a = observable;
    }

    private T a(Observable<? extends T> observable) {
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        BlockingUtils.awaitForComplete(countDownLatch, observable.subscribe((Subscriber<? super Object>) new c(countDownLatch, atomicReference2, atomicReference)));
        if (atomicReference2.get() != null) {
            Exceptions.propagate((Throwable) atomicReference2.get());
        }
        return (T) atomicReference.get();
    }

    public static <T> BlockingObservable<T> from(Observable<? extends T> observable) {
        return new BlockingObservable<>(observable);
    }

    public T first() {
        return a(this.a.first());
    }

    public T firstOrDefault(T t) {
        return a(this.a.map(UtilityFunctions.identity()).firstOrDefault(t));
    }

    public void forEach(Action1<? super T> action1) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        BlockingUtils.awaitForComplete(countDownLatch, this.a.subscribe((Subscriber<? super Object>) new a(countDownLatch, atomicReference, action1)));
        if (atomicReference.get() != null) {
            Exceptions.propagate((Throwable) atomicReference.get());
        }
    }

    public Iterator<T> getIterator() {
        return BlockingOperatorToIterator.toIterator(this.a);
    }

    public T last() {
        return a(this.a.last());
    }

    public T lastOrDefault(T t) {
        return a(this.a.map(UtilityFunctions.identity()).lastOrDefault(t));
    }

    public Iterable<T> latest() {
        return BlockingOperatorLatest.latest(this.a);
    }

    public Iterable<T> mostRecent(T t) {
        return BlockingOperatorMostRecent.mostRecent(this.a, t);
    }

    public Iterable<T> next() {
        return BlockingOperatorNext.next(this.a);
    }

    public T single() {
        return a(this.a.single());
    }

    public T singleOrDefault(T t) {
        return a(this.a.map(UtilityFunctions.identity()).singleOrDefault(t));
    }

    public void subscribe() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = {null};
        BlockingUtils.awaitForComplete(countDownLatch, this.a.subscribe((Subscriber<? super Object>) new d(thArr, countDownLatch)));
        Throwable th = thArr[0];
        if (th != null) {
            Exceptions.propagate(th);
        }
    }

    public Future<T> toFuture() {
        return BlockingOperatorToFuture.toFuture(this.a);
    }

    public Iterable<T> toIterable() {
        return new b();
    }

    public T first(Func1<? super T, Boolean> func1) {
        return a(this.a.first(func1));
    }

    public T firstOrDefault(T t, Func1<? super T, Boolean> func1) {
        return a(this.a.filter(func1).map(UtilityFunctions.identity()).firstOrDefault(t));
    }

    public T last(Func1<? super T, Boolean> func1) {
        return a(this.a.last(func1));
    }

    public T lastOrDefault(T t, Func1<? super T, Boolean> func1) {
        return a(this.a.filter(func1).map(UtilityFunctions.identity()).lastOrDefault(t));
    }

    public T single(Func1<? super T, Boolean> func1) {
        return a(this.a.single(func1));
    }

    public T singleOrDefault(T t, Func1<? super T, Boolean> func1) {
        return a(this.a.filter(func1).map(UtilityFunctions.identity()).singleOrDefault(t));
    }

    public void subscribe(Observer<? super T> observer) {
        Object objPoll;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Subscription subscriptionSubscribe = this.a.subscribe((Subscriber<? super Object>) new e(linkedBlockingQueue));
        do {
            try {
                try {
                    objPoll = linkedBlockingQueue.poll();
                    if (objPoll == null) {
                        objPoll = linkedBlockingQueue.take();
                    }
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    observer.onError(e2);
                    subscriptionSubscribe.unsubscribe();
                    return;
                }
            } catch (Throwable th) {
                subscriptionSubscribe.unsubscribe();
                throw th;
            }
        } while (!NotificationLite.accept(observer, objPoll));
        subscriptionSubscribe.unsubscribe();
    }

    public void subscribe(Subscriber<? super T> subscriber) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Producer[] producerArr = {null};
        f fVar = new f(linkedBlockingQueue, producerArr);
        subscriber.add(fVar);
        subscriber.add(Subscriptions.create(new g(linkedBlockingQueue)));
        this.a.subscribe((Subscriber<? super Object>) fVar);
        while (!subscriber.isUnsubscribed()) {
            try {
                try {
                    Object objPoll = linkedBlockingQueue.poll();
                    if (objPoll == null) {
                        objPoll = linkedBlockingQueue.take();
                    }
                    if (subscriber.isUnsubscribed() || objPoll == d) {
                        break;
                        break;
                    } else if (objPoll == b) {
                        subscriber.onStart();
                    } else if (objPoll == c) {
                        subscriber.setProducer(producerArr[0]);
                    } else if (NotificationLite.accept(subscriber, objPoll)) {
                        fVar.unsubscribe();
                        return;
                    }
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    subscriber.onError(e2);
                }
            } catch (Throwable th) {
                fVar.unsubscribe();
                throw th;
            }
        }
        fVar.unsubscribe();
    }

    public void subscribe(Action1<? super T> action1) {
        subscribe(action1, new h(), Actions.empty());
    }

    public void subscribe(Action1<? super T> action1, Action1<? super Throwable> action2) {
        subscribe(action1, action2, Actions.empty());
    }

    public void subscribe(Action1<? super T> action1, Action1<? super Throwable> action2, Action0 action0) {
        subscribe(new i(action1, action2, action0));
    }
}
