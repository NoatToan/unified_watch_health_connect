package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Emitter;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action1;
import rx.functions.Cancellable;
import rx.internal.subscriptions.CancellableSubscription;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeCreate<T> implements Observable.OnSubscribe<T> {
    public final Action1<Emitter<T>> a;
    public final Emitter.BackpressureMode b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Emitter.BackpressureMode.values().length];
            a = iArr;
            try {
                iArr[Emitter.BackpressureMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Emitter.BackpressureMode.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Emitter.BackpressureMode.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Emitter.BackpressureMode.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static abstract class b<T> extends AtomicLong implements Emitter<T>, Producer, Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        public final Subscriber<? super T> a;
        public final SerialSubscription b = new SerialSubscription();

        public b(Subscriber<? super T> subscriber) {
            this.a = subscriber;
        }

        public void a() {
        }

        public void b() {
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.b.isUnsubscribed();
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.a.isUnsubscribed()) {
                return;
            }
            try {
                this.a.onCompleted();
            } finally {
                this.b.unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.a.isUnsubscribed()) {
                return;
            }
            try {
                this.a.onError(th);
            } finally {
                this.b.unsubscribe();
            }
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (BackpressureUtils.validate(j)) {
                BackpressureUtils.getAndAddRequest(this, j);
                a();
            }
        }

        @Override // rx.Emitter
        public final long requested() {
            return get();
        }

        @Override // rx.Emitter
        public final void setCancellation(Cancellable cancellable) {
            setSubscription(new CancellableSubscription(cancellable));
        }

        @Override // rx.Emitter
        public final void setSubscription(Subscription subscription) {
            this.b.set(subscription);
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            this.b.unsubscribe();
            b();
        }
    }

    public static final class c<T> extends b<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        public final Queue<Object> c;
        public Throwable d;
        public volatile boolean e;
        public final AtomicInteger f;

        public c(Subscriber<? super T> subscriber, int i) {
            super(subscriber);
            this.c = UnsafeAccess.isUnsafeAvailable() ? new SpscUnboundedArrayQueue<>(i) : new SpscUnboundedAtomicArrayQueue<>(i);
            this.f = new AtomicInteger();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.b
        public void a() {
            c();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.b
        public void b() {
            if (this.f.getAndIncrement() == 0) {
                this.c.clear();
            }
        }

        public void c() {
            if (this.f.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.a;
            Queue<Object> queue = this.c;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (subscriber.isUnsubscribed()) {
                        queue.clear();
                        return;
                    }
                    boolean z = this.e;
                    Object objPoll = queue.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.d;
                        if (th != null) {
                            super.onError(th);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext((Object) NotificationLite.getValue(objPoll));
                    j2++;
                }
                if (j2 == j) {
                    if (subscriber.isUnsubscribed()) {
                        queue.clear();
                        return;
                    }
                    boolean z3 = this.e;
                    boolean zIsEmpty = queue.isEmpty();
                    if (z3 && zIsEmpty) {
                        Throwable th2 = this.d;
                        if (th2 != null) {
                            super.onError(th2);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureUtils.produced(this, j2);
                }
                iAddAndGet = this.f.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.internal.operators.OnSubscribeCreate.b, rx.Observer
        public void onCompleted() {
            this.e = true;
            c();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.b, rx.Observer
        public void onError(Throwable th) {
            this.d = th;
            this.e = true;
            c();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.c.offer(NotificationLite.next(t));
            c();
        }
    }

    public static final class d<T> extends g<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public d(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // rx.internal.operators.OnSubscribeCreate.g
        public void c() {
        }
    }

    public static final class e<T> extends g<T> {
        private static final long serialVersionUID = 338953216916120960L;
        private boolean c;

        public e(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // rx.internal.operators.OnSubscribeCreate.g
        public void c() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }

        @Override // rx.internal.operators.OnSubscribeCreate.b, rx.Observer
        public void onCompleted() {
            if (this.c) {
                return;
            }
            this.c = true;
            super.onCompleted();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.b, rx.Observer
        public void onError(Throwable th) {
            if (this.c) {
                RxJavaHooks.onError(th);
            } else {
                this.c = true;
                super.onError(th);
            }
        }

        @Override // rx.internal.operators.OnSubscribeCreate.g, rx.Observer
        public void onNext(T t) {
            if (this.c) {
                return;
            }
            super.onNext(t);
        }
    }

    public static final class f<T> extends b<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        public final AtomicReference<Object> c;
        public Throwable d;
        public volatile boolean e;
        public final AtomicInteger f;

        public f(Subscriber<? super T> subscriber) {
            super(subscriber);
            this.c = new AtomicReference<>();
            this.f = new AtomicInteger();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.b
        public void a() {
            c();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.b
        public void b() {
            if (this.f.getAndIncrement() == 0) {
                this.c.lazySet(null);
            }
        }

        public void c() {
            if (this.f.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = this.a;
            AtomicReference<Object> atomicReference = this.c;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (subscriber.isUnsubscribed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z = this.e;
                    Object andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (z && z2) {
                        Throwable th = this.d;
                        if (th != null) {
                            super.onError(th);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext((Object) NotificationLite.getValue(andSet));
                    j2++;
                }
                if (j2 == j) {
                    if (subscriber.isUnsubscribed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z3 = this.e;
                    boolean z4 = atomicReference.get() == null;
                    if (z3 && z4) {
                        Throwable th2 = this.d;
                        if (th2 != null) {
                            super.onError(th2);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureUtils.produced(this, j2);
                }
                iAddAndGet = this.f.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // rx.internal.operators.OnSubscribeCreate.b, rx.Observer
        public void onCompleted() {
            this.e = true;
            c();
        }

        @Override // rx.internal.operators.OnSubscribeCreate.b, rx.Observer
        public void onError(Throwable th) {
            this.d = th;
            this.e = true;
            c();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.c.set(NotificationLite.next(t));
            c();
        }
    }

    public static abstract class g<T> extends b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public g(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public abstract void c();

        public void onNext(T t) {
            if (this.a.isUnsubscribed()) {
                return;
            }
            if (get() == 0) {
                c();
            } else {
                this.a.onNext(t);
                BackpressureUtils.produced(this, 1L);
            }
        }
    }

    public static final class h<T> extends b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public h(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            long j;
            if (this.a.isUnsubscribed()) {
                return;
            }
            this.a.onNext(t);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    public OnSubscribeCreate(Action1<Emitter<T>> action1, Emitter.BackpressureMode backpressureMode) {
        this.a = action1;
        this.b = backpressureMode;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        b hVar;
        int i = a.a[this.b.ordinal()];
        if (i == 1) {
            hVar = new h(subscriber);
        } else if (i == 2) {
            hVar = new e(subscriber);
        } else if (i != 3) {
            hVar = i != 4 ? new c(subscriber, RxRingBuffer.SIZE) : new f(subscriber);
        } else {
            hVar = new d(subscriber);
        }
        subscriber.add(hVar);
        subscriber.setProducer(hVar);
        this.a.call(hVar);
    }
}
