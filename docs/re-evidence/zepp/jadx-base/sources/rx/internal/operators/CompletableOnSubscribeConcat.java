package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.internal.subscriptions.SequentialSubscription;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class CompletableOnSubscribeConcat implements Completable.OnSubscribe {
    public final Observable<Completable> a;
    public final int b;

    public static final class a extends Subscriber<Completable> {
        public final CompletableSubscriber f;
        public final SequentialSubscription g;
        public final SpscArrayQueue<Completable> h;
        public final C1228a i;
        public final AtomicBoolean j;
        public volatile boolean k;
        public volatile boolean l;

        /* JADX INFO: renamed from: rx.internal.operators.CompletableOnSubscribeConcat$a$a, reason: collision with other inner class name */
        public final class C1228a extends AtomicInteger implements CompletableSubscriber {
            private static final long serialVersionUID = 7233503139645205620L;

            public C1228a() {
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                a.this.c();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                a.this.d(th);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                a.this.g.set(subscription);
            }
        }

        public a(CompletableSubscriber completableSubscriber, int i) {
            this.f = completableSubscriber;
            this.h = new SpscArrayQueue<>(i);
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            this.g = sequentialSubscription;
            this.i = new C1228a();
            this.j = new AtomicBoolean();
            add(sequentialSubscription);
            request(i);
        }

        public void b() {
            C1228a c1228a = this.i;
            if (c1228a.getAndIncrement() != 0) {
                return;
            }
            while (!isUnsubscribed()) {
                if (!this.l) {
                    boolean z = this.k;
                    Completable completablePoll = this.h.poll();
                    boolean z2 = completablePoll == null;
                    if (z && z2) {
                        this.f.onCompleted();
                        return;
                    } else if (!z2) {
                        this.l = true;
                        completablePoll.subscribe(c1228a);
                        request(1L);
                    }
                }
                if (c1228a.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        public void c() {
            this.l = false;
            b();
        }

        public void d(Throwable th) {
            unsubscribe();
            onError(th);
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onNext(Completable completable) {
            if (this.h.offer(completable)) {
                b();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.k) {
                return;
            }
            this.k = true;
            b();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.j.compareAndSet(false, true)) {
                this.f.onError(th);
            } else {
                RxJavaHooks.onError(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompletableOnSubscribeConcat(Observable<? extends Completable> observable, int i) {
        this.a = observable;
        this.b = i;
    }

    @Override // rx.functions.Action1
    public void call(CompletableSubscriber completableSubscriber) {
        a aVar = new a(completableSubscriber, this.b);
        completableSubscriber.onSubscribe(aVar);
        this.a.unsafeSubscribe(aVar);
    }
}
