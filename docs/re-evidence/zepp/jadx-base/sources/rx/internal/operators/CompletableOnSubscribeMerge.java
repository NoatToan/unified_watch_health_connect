package rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class CompletableOnSubscribeMerge implements Completable.OnSubscribe {
    public final Observable<Completable> a;
    public final int b;
    public final boolean c;

    public static final class a extends Subscriber<Completable> {
        public final CompletableSubscriber f;
        public final boolean h;
        public volatile boolean i;
        public final CompositeSubscription g = new CompositeSubscription();
        public final AtomicInteger l = new AtomicInteger(1);
        public final AtomicBoolean k = new AtomicBoolean();
        public final AtomicReference<Queue<Throwable>> j = new AtomicReference<>();

        /* JADX INFO: renamed from: rx.internal.operators.CompletableOnSubscribeMerge$a$a, reason: collision with other inner class name */
        public class C1229a implements CompletableSubscriber {
            public Subscription a;
            public boolean b;

            public C1229a() {
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                if (this.b) {
                    return;
                }
                this.b = true;
                a.this.g.remove(this.a);
                a.this.f();
                if (a.this.i) {
                    return;
                }
                a.this.request(1L);
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                if (this.b) {
                    RxJavaHooks.onError(th);
                    return;
                }
                this.b = true;
                a.this.g.remove(this.a);
                a.this.d().offer(th);
                a.this.f();
                a aVar = a.this;
                if (!aVar.h || aVar.i) {
                    return;
                }
                a.this.request(1L);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.a = subscription;
                a.this.g.add(subscription);
            }
        }

        public a(CompletableSubscriber completableSubscriber, int i, boolean z) {
            this.f = completableSubscriber;
            this.h = z;
            if (i == Integer.MAX_VALUE) {
                request(Long.MAX_VALUE);
            } else {
                request(i);
            }
        }

        public Queue<Throwable> d() {
            Queue<Throwable> queue = this.j.get();
            if (queue != null) {
                return queue;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            return this.j.compareAndSet(null, concurrentLinkedQueue) ? concurrentLinkedQueue : this.j.get();
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onNext(Completable completable) {
            if (this.i) {
                return;
            }
            this.l.getAndIncrement();
            completable.unsafeSubscribe(new C1229a());
        }

        public void f() {
            Queue<Throwable> queue;
            if (this.l.decrementAndGet() != 0) {
                if (this.h || (queue = this.j.get()) == null || queue.isEmpty()) {
                    return;
                }
                Throwable thCollectErrors = CompletableOnSubscribeMerge.collectErrors(queue);
                if (this.k.compareAndSet(false, true)) {
                    this.f.onError(thCollectErrors);
                    return;
                } else {
                    RxJavaHooks.onError(thCollectErrors);
                    return;
                }
            }
            Queue<Throwable> queue2 = this.j.get();
            if (queue2 == null || queue2.isEmpty()) {
                this.f.onCompleted();
                return;
            }
            Throwable thCollectErrors2 = CompletableOnSubscribeMerge.collectErrors(queue2);
            if (this.k.compareAndSet(false, true)) {
                this.f.onError(thCollectErrors2);
            } else {
                RxJavaHooks.onError(thCollectErrors2);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.i) {
                return;
            }
            this.i = true;
            f();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.i) {
                RxJavaHooks.onError(th);
                return;
            }
            d().offer(th);
            this.i = true;
            f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompletableOnSubscribeMerge(Observable<? extends Completable> observable, int i, boolean z) {
        this.a = observable;
        this.b = i;
        this.c = z;
    }

    public static Throwable collectErrors(Queue<Throwable> queue) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Throwable thPoll = queue.poll();
            if (thPoll == null) {
                break;
            }
            arrayList.add(thPoll);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? (Throwable) arrayList.get(0) : new CompositeException(arrayList);
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        a aVar = new a(completableSubscriber, this.b, this.c);
        completableSubscriber.onSubscribe(aVar);
        this.a.unsafeSubscribe(aVar);
    }
}
