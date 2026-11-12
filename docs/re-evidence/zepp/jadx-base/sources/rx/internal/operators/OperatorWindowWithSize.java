package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.util.atomic.SpscLinkedArrayQueue;
import rx.subjects.Subject;
import rx.subjects.UnicastSubject;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorWindowWithSize<T> implements Observable.Operator<Observable<T>, T> {
    public final int a;
    public final int b;

    public static final class a<T> extends Subscriber<T> implements Action0 {
        public final Subscriber<? super Observable<T>> f;
        public final int g;
        public final AtomicInteger h = new AtomicInteger(1);
        public final Subscription i;
        public int j;
        public Subject<T, T> k;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorWindowWithSize$a$a, reason: collision with other inner class name */
        public class C1253a implements Producer {
            public C1253a() {
            }

            @Override // rx.Producer
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j);
                }
                if (j != 0) {
                    a.this.request(BackpressureUtils.multiplyCap(a.this.g, j));
                }
            }
        }

        public a(Subscriber<? super Observable<T>> subscriber, int i) {
            this.f = subscriber;
            this.g = i;
            Subscription subscriptionCreate = Subscriptions.create(this);
            this.i = subscriptionCreate;
            add(subscriptionCreate);
            request(0L);
        }

        public Producer c() {
            return new C1253a();
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.h.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            Subject<T, T> subject = this.k;
            if (subject != null) {
                this.k = null;
                subject.onCompleted();
            }
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            Subject<T, T> subject = this.k;
            if (subject != null) {
                this.k = null;
                subject.onError(th);
            }
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            int i = this.j;
            UnicastSubject unicastSubjectCreate = this.k;
            if (i == 0) {
                this.h.getAndIncrement();
                unicastSubjectCreate = UnicastSubject.create(this.g, this);
                this.k = unicastSubjectCreate;
                this.f.onNext(unicastSubjectCreate);
            }
            int i2 = i + 1;
            unicastSubjectCreate.onNext(t);
            if (i2 != this.g) {
                this.j = i2;
                return;
            }
            this.j = 0;
            this.k = null;
            unicastSubjectCreate.onCompleted();
        }
    }

    public static final class b<T> extends Subscriber<T> implements Action0 {
        public final Subscriber<? super Observable<T>> f;
        public final int g;
        public final int h;
        public final Subscription j;
        public final Queue<Subject<T, T>> n;
        public Throwable o;
        public volatile boolean p;
        public int q;
        public int r;
        public final AtomicInteger i = new AtomicInteger(1);
        public final ArrayDeque<Subject<T, T>> k = new ArrayDeque<>();
        public final AtomicInteger m = new AtomicInteger();
        public final AtomicLong l = new AtomicLong();

        public final class a extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 4625807964358024108L;

            public a() {
            }

            @Override // rx.Producer
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j);
                }
                if (j != 0) {
                    b bVar = b.this;
                    if (get() || !compareAndSet(false, true)) {
                        b.this.request(BackpressureUtils.multiplyCap(bVar.h, j));
                    } else {
                        bVar.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(bVar.h, j - 1), bVar.g));
                    }
                    BackpressureUtils.getAndAddRequest(bVar.l, j);
                    bVar.f();
                }
            }
        }

        public b(Subscriber<? super Observable<T>> subscriber, int i, int i2) {
            this.f = subscriber;
            this.g = i;
            this.h = i2;
            Subscription subscriptionCreate = Subscriptions.create(this);
            this.j = subscriptionCreate;
            add(subscriptionCreate);
            request(0L);
            this.n = new SpscLinkedArrayQueue((i + (i2 - 1)) / i2);
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.i.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        public boolean d(boolean z, boolean z2, Subscriber<? super Subject<T, T>> subscriber, Queue<Subject<T, T>> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.o;
            if (th != null) {
                queue.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        public Producer e() {
            return new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void f() {
            AtomicInteger atomicInteger = this.m;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super Observable<T>> subscriber = this.f;
            Queue<Subject<T, T>> queue = this.n;
            int iAddAndGet = 1;
            do {
                long j = this.l.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.p;
                    Subject<T, T> subjectPoll = queue.poll();
                    boolean z2 = subjectPoll == null;
                    if (d(z, z2, subscriber, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(subjectPoll);
                    j2++;
                }
                if (j2 == j && d(this.p, queue.isEmpty(), subscriber, queue)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.l.addAndGet(-j2);
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.Observer
        public void onCompleted() {
            Iterator<Subject<T, T>> it2 = this.k.iterator();
            while (it2.hasNext()) {
                it2.next().onCompleted();
            }
            this.k.clear();
            this.p = true;
            f();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            Iterator<Subject<T, T>> it2 = this.k.iterator();
            while (it2.hasNext()) {
                it2.next().onError(th);
            }
            this.k.clear();
            this.o = th;
            this.p = true;
            f();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            int i = this.q;
            ArrayDeque<Subject<T, T>> arrayDeque = this.k;
            if (i == 0 && !this.f.isUnsubscribed()) {
                this.i.getAndIncrement();
                UnicastSubject unicastSubjectCreate = UnicastSubject.create(16, this);
                arrayDeque.offer(unicastSubjectCreate);
                this.n.offer(unicastSubjectCreate);
                f();
            }
            Iterator<Subject<T, T>> it2 = this.k.iterator();
            while (it2.hasNext()) {
                it2.next().onNext(t);
            }
            int i2 = this.r + 1;
            if (i2 == this.g) {
                this.r = i2 - this.h;
                Subject<T, T> subjectPoll = arrayDeque.poll();
                if (subjectPoll != null) {
                    subjectPoll.onCompleted();
                }
            } else {
                this.r = i2;
            }
            int i3 = i + 1;
            if (i3 == this.h) {
                this.q = 0;
            } else {
                this.q = i3;
            }
        }
    }

    public static final class c<T> extends Subscriber<T> implements Action0 {
        public final Subscriber<? super Observable<T>> f;
        public final int g;
        public final int h;
        public final AtomicInteger i = new AtomicInteger(1);
        public final Subscription j;
        public int k;
        public Subject<T, T> l;

        public final class a extends AtomicBoolean implements Producer {
            private static final long serialVersionUID = 4625807964358024108L;

            public a() {
            }

            @Override // rx.Producer
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j);
                }
                if (j != 0) {
                    c cVar = c.this;
                    if (get() || !compareAndSet(false, true)) {
                        cVar.request(BackpressureUtils.multiplyCap(j, cVar.h));
                    } else {
                        cVar.request(BackpressureUtils.addCap(BackpressureUtils.multiplyCap(j, cVar.g), BackpressureUtils.multiplyCap(cVar.h - cVar.g, j - 1)));
                    }
                }
            }
        }

        public c(Subscriber<? super Observable<T>> subscriber, int i, int i2) {
            this.f = subscriber;
            this.g = i;
            this.h = i2;
            Subscription subscriptionCreate = Subscriptions.create(this);
            this.j = subscriptionCreate;
            add(subscriptionCreate);
            request(0L);
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.i.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        public Producer d() {
            return new a();
        }

        @Override // rx.Observer
        public void onCompleted() {
            Subject<T, T> subject = this.l;
            if (subject != null) {
                this.l = null;
                subject.onCompleted();
            }
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            Subject<T, T> subject = this.l;
            if (subject != null) {
                this.l = null;
                subject.onError(th);
            }
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            int i = this.k;
            UnicastSubject unicastSubjectCreate = this.l;
            if (i == 0) {
                this.i.getAndIncrement();
                unicastSubjectCreate = UnicastSubject.create(this.g, this);
                this.l = unicastSubjectCreate;
                this.f.onNext(unicastSubjectCreate);
            }
            int i2 = i + 1;
            if (unicastSubjectCreate != null) {
                unicastSubjectCreate.onNext(t);
            }
            if (i2 == this.g) {
                this.k = i2;
                this.l = null;
                unicastSubjectCreate.onCompleted();
            } else if (i2 == this.h) {
                this.k = 0;
            } else {
                this.k = i2;
            }
        }
    }

    public OperatorWindowWithSize(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Observable<T>> subscriber) {
        int i = this.b;
        int i2 = this.a;
        if (i == i2) {
            a aVar = new a(subscriber, i2);
            subscriber.add(aVar.i);
            subscriber.setProducer(aVar.c());
            return aVar;
        }
        if (i > i2) {
            c cVar = new c(subscriber, i2, i);
            subscriber.add(cVar.j);
            subscriber.setProducer(cVar.d());
            return cVar;
        }
        b bVar = new b(subscriber, i2, i);
        subscriber.add(bVar.j);
        subscriber.setProducer(bVar.e());
        return bVar;
    }
}
