package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.internal.producers.ProducerArbiter;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.UtilityFunctions;
import rx.observables.GroupedObservable;
import rx.observers.Subscribers;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorGroupBy<T, K, V> implements Observable.Operator<GroupedObservable<K, V>, T> {
    public final Func1<? super T, ? extends K> a;
    public final Func1<? super T, ? extends V> b;
    public final int c;
    public final boolean d;
    public final Func1<Action1<K>, Map<K, Object>> e;

    public static final class GroupByProducer implements Producer {
        public final GroupBySubscriber<?, ?, ?> a;

        public GroupByProducer(GroupBySubscriber<?, ?, ?> groupBySubscriber) {
            this.a = groupBySubscriber;
        }

        @Override // rx.Producer
        public void request(long j) {
            this.a.requestMore(j);
        }
    }

    public class a implements Action0 {
        public final /* synthetic */ GroupBySubscriber a;

        public a(GroupBySubscriber groupBySubscriber) {
            this.a = groupBySubscriber;
        }

        @Override // rx.functions.Action0
        public void call() {
            this.a.cancel();
        }
    }

    public static final class b<K, T> extends GroupedObservable<K, T> {
        public final c<T, K> c;

        public b(K k, c<T, K> cVar) {
            super(k, cVar);
            this.c = cVar;
        }

        public static <T, K> b<K, T> c(K k, int i, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z) {
            return new b<>(k, new c(i, groupBySubscriber, k, z));
        }

        public void d() {
            this.c.e();
        }

        public void onError(Throwable th) {
            this.c.f(th);
        }

        public void onNext(T t) {
            this.c.g(t);
        }
    }

    public static final class c<T, K> extends AtomicInteger implements Producer, Subscription, Observable.OnSubscribe<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        public final K a;
        public final GroupBySubscriber<?, K, T> c;
        public final boolean d;
        public volatile boolean f;
        public Throwable g;
        public final Queue<Object> b = new ConcurrentLinkedQueue();
        public final AtomicBoolean h = new AtomicBoolean();
        public final AtomicReference<Subscriber<? super T>> i = new AtomicReference<>();
        public final AtomicBoolean j = new AtomicBoolean();
        public final AtomicLong e = new AtomicLong();

        public c(int i, GroupBySubscriber<?, K, T> groupBySubscriber, K k, boolean z) {
            this.c = groupBySubscriber;
            this.a = k;
            this.d = z;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            if (!this.j.compareAndSet(false, true)) {
                subscriber.onError(new IllegalStateException("Only one Subscriber allowed!"));
                return;
            }
            subscriber.add(this);
            subscriber.setProducer(this);
            this.i.lazySet(subscriber);
            c();
        }

        public boolean b(boolean z, boolean z2, Subscriber<? super T> subscriber, boolean z3) {
            if (this.h.get()) {
                this.b.clear();
                this.c.cancel(this.a);
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.g;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onCompleted();
                }
                return true;
            }
            Throwable th2 = this.g;
            if (th2 != null) {
                this.b.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        public void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            Queue<Object> queue = this.b;
            boolean z = this.d;
            Subscriber<? super T> subscriber = this.i.get();
            int iAddAndGet = 1;
            while (true) {
                if (subscriber != null) {
                    if (b(this.f, queue.isEmpty(), subscriber, z)) {
                        return;
                    }
                    long j = this.e.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.f;
                        Object objPoll = queue.poll();
                        boolean z3 = objPoll == null;
                        if (b(z2, z3, subscriber, z)) {
                            return;
                        }
                        if (z3) {
                            break;
                        }
                        subscriber.onNext((Object) NotificationLite.getValue(objPoll));
                        j2++;
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            BackpressureUtils.produced(this.e, j2);
                        }
                        this.c.o.request(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (subscriber == null) {
                    subscriber = this.i.get();
                }
            }
        }

        public void e() {
            this.f = true;
            c();
        }

        public void f(Throwable th) {
            this.g = th;
            this.f = true;
            c();
        }

        public void g(T t) {
            if (t == null) {
                this.g = new NullPointerException();
                this.f = true;
            } else {
                this.b.offer(NotificationLite.next(t));
            }
            c();
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.h.get();
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
            if (j != 0) {
                BackpressureUtils.getAndAddRequest(this.e, j);
                c();
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.h.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.c.cancel(this.a);
            }
        }
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1) {
        this(func1, UtilityFunctions.identity(), RxRingBuffer.SIZE, false, null);
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2) {
        this(func1, func2, RxRingBuffer.SIZE, false, null);
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super GroupedObservable<K, V>> subscriber) {
        try {
            GroupBySubscriber groupBySubscriber = new GroupBySubscriber(subscriber, this.a, this.b, this.c, this.d, this.e);
            subscriber.add(Subscriptions.create(new a(groupBySubscriber)));
            subscriber.setProducer(groupBySubscriber.m);
            return groupBySubscriber;
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
            Subscriber<? super T> subscriberEmpty = Subscribers.empty();
            subscriberEmpty.unsubscribe();
            return subscriberEmpty;
        }
    }

    public static final class GroupBySubscriber<T, K, V> extends Subscriber<T> {
        public static final Object v = new Object();
        public final Subscriber<? super GroupedObservable<K, V>> f;
        public final Func1<? super T, ? extends K> g;
        public final Func1<? super T, ? extends V> h;
        public final int i;
        public final boolean j;
        public final Map<Object, b<K, V>> k;
        public final Queue<GroupedObservable<K, V>> l = new ConcurrentLinkedQueue();
        public final GroupByProducer m;
        public final Queue<K> n;
        public final ProducerArbiter o;
        public final AtomicBoolean p;
        public final AtomicLong q;
        public final AtomicInteger r;
        public Throwable s;
        public volatile boolean t;
        public final AtomicInteger u;

        public static class a<K> implements Action1<K> {
            public final Queue<K> a;

            public a(Queue<K> queue) {
                this.a = queue;
            }

            @Override // rx.functions.Action1
            public void call(K k) {
                this.a.offer(k);
            }
        }

        public GroupBySubscriber(Subscriber<? super GroupedObservable<K, V>> subscriber, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2, int i, boolean z, Func1<Action1<K>, Map<K, Object>> func3) {
            this.f = subscriber;
            this.g = func1;
            this.h = func2;
            this.i = i;
            this.j = z;
            ProducerArbiter producerArbiter = new ProducerArbiter();
            this.o = producerArbiter;
            producerArbiter.request(i);
            this.m = new GroupByProducer(this);
            this.p = new AtomicBoolean();
            this.q = new AtomicLong();
            this.r = new AtomicInteger(1);
            this.u = new AtomicInteger();
            if (func3 == null) {
                this.k = new ConcurrentHashMap();
                this.n = null;
            } else {
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                this.n = concurrentLinkedQueue;
                this.k = c(func3, new a(concurrentLinkedQueue));
            }
        }

        private Map<Object, b<K, V>> c(Func1<Action1<K>, Map<K, Object>> func1, Action1<K> action1) {
            return func1.call(action1);
        }

        public boolean b(boolean z, boolean z2, Subscriber<? super GroupedObservable<K, V>> subscriber, Queue<?> queue) {
            if (!z) {
                return false;
            }
            Throwable th = this.s;
            if (th != null) {
                e(subscriber, queue, th);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f.onCompleted();
            return true;
        }

        public void cancel() {
            if (this.p.compareAndSet(false, true) && this.r.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        public void d() {
            if (this.u.getAndIncrement() != 0) {
                return;
            }
            Queue<GroupedObservable<K, V>> queue = this.l;
            Subscriber<? super GroupedObservable<K, V>> subscriber = this.f;
            int iAddAndGet = 1;
            while (!b(this.t, queue.isEmpty(), subscriber, queue)) {
                long j = this.q.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.t;
                    GroupedObservable<K, V> groupedObservablePoll = queue.poll();
                    boolean z2 = groupedObservablePoll == null;
                    if (b(z, z2, subscriber, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(groupedObservablePoll);
                    j2++;
                }
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        BackpressureUtils.produced(this.q, j2);
                    }
                    this.o.request(j2);
                }
                iAddAndGet = this.u.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public void e(Subscriber<? super GroupedObservable<K, V>> subscriber, Queue<?> queue, Throwable th) {
            queue.clear();
            ArrayList arrayList = new ArrayList(this.k.values());
            this.k.clear();
            Queue<K> queue2 = this.n;
            if (queue2 != null) {
                queue2.clear();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).onError(th);
            }
            subscriber.onError(th);
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.t) {
                return;
            }
            Iterator<b<K, V>> it2 = this.k.values().iterator();
            while (it2.hasNext()) {
                it2.next().d();
            }
            this.k.clear();
            Queue<K> queue = this.n;
            if (queue != null) {
                queue.clear();
            }
            this.t = true;
            this.r.decrementAndGet();
            d();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.t) {
                RxJavaHooks.onError(th);
                return;
            }
            this.s = th;
            this.t = true;
            this.r.decrementAndGet();
            d();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.t) {
                return;
            }
            Queue<?> queue = this.l;
            Subscriber<? super GroupedObservable<K, V>> subscriber = this.f;
            try {
                K kCall = this.g.call(t);
                boolean z = false;
                Object obj = kCall != null ? kCall : v;
                b<K, V> bVarC = this.k.get(obj);
                if (bVarC == null) {
                    if (this.p.get()) {
                        return;
                    }
                    bVarC = b.c(kCall, this.i, this, this.j);
                    this.k.put(obj, bVarC);
                    this.r.getAndIncrement();
                    z = true;
                }
                try {
                    bVarC.onNext(this.h.call(t));
                    if (this.n != null) {
                        while (true) {
                            K kPoll = this.n.poll();
                            if (kPoll == null) {
                                break;
                            }
                            b<K, V> bVar = this.k.get(kPoll);
                            if (bVar != null) {
                                bVar.d();
                            }
                        }
                    }
                    if (z) {
                        queue.offer(bVarC);
                        d();
                    }
                } catch (Throwable th) {
                    unsubscribe();
                    e(subscriber, queue, th);
                }
            } catch (Throwable th2) {
                unsubscribe();
                e(subscriber, queue, th2);
            }
        }

        public void requestMore(long j) {
            if (j >= 0) {
                BackpressureUtils.getAndAddRequest(this.q, j);
                d();
            } else {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.o.setProducer(producer);
        }

        public void cancel(K k) {
            if (k == null) {
                k = (K) v;
            }
            if (this.k.remove(k) == null || this.r.decrementAndGet() != 0) {
                return;
            }
            unsubscribe();
        }
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2, Func1<Action1<K>, Map<K, Object>> func3) {
        this(func1, func2, RxRingBuffer.SIZE, false, func3);
    }

    public OperatorGroupBy(Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2, int i, boolean z, Func1<Action1<K>, Map<K, Object>> func3) {
        this.a = func1;
        this.b = func2;
        this.c = i;
        this.d = z;
        this.e = func3;
    }
}
