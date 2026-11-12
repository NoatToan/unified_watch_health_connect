package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.subscribers.SubscriberResourceWrapper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableReplay<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T>, ResettableConnectable {
    public static final Callable f = new c();
    public final Flowable<T> b;
    public final AtomicReference<j<T>> c;
    public final Callable<? extends g<T>> d;
    public final Publisher<T> e;

    public static class a<T> extends AtomicReference<f> implements g<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        public f a;
        public int b;
        public long c;

        public a() {
            f fVar = new f(null, 0L);
            this.a = fVar;
            set(fVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public final void a(T t) {
            Object objF = f(NotificationLite.next(t));
            long j = this.c + 1;
            this.c = j;
            c(new f(objF, j));
            p();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public final void b(d<T> dVar) {
            f fVar;
            synchronized (dVar) {
                if (dVar.e) {
                    dVar.f = true;
                    return;
                }
                dVar.e = true;
                while (!dVar.isDisposed()) {
                    long j = dVar.get();
                    boolean z = j == Long.MAX_VALUE;
                    f fVarG = (f) dVar.a();
                    if (fVarG == null) {
                        fVarG = g();
                        dVar.c = fVarG;
                        BackpressureHelper.add(dVar.d, fVarG.b);
                    }
                    long j2 = 0;
                    while (j != 0 && (fVar = fVarG.get()) != null) {
                        Object objJ = j(fVar.a);
                        try {
                            if (NotificationLite.accept(objJ, dVar.b)) {
                                dVar.c = null;
                                return;
                            }
                            j2++;
                            j--;
                            if (dVar.isDisposed()) {
                                return;
                            } else {
                                fVarG = fVar;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            dVar.c = null;
                            dVar.dispose();
                            if (NotificationLite.isError(objJ) || NotificationLite.isComplete(objJ)) {
                                return;
                            }
                            dVar.b.onError(th);
                            return;
                        }
                    }
                    if (j2 != 0) {
                        dVar.c = fVarG;
                        if (!z) {
                            dVar.b(j2);
                        }
                    }
                    synchronized (dVar) {
                        if (!dVar.f) {
                            dVar.e = false;
                            return;
                        }
                        dVar.f = false;
                    }
                }
            }
        }

        public final void c(f fVar) {
            this.a.set(fVar);
            this.a = fVar;
            this.b++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public final void complete() {
            Object objF = f(NotificationLite.complete());
            long j = this.c + 1;
            this.c = j;
            c(new f(objF, j));
            q();
        }

        public final void e(Collection<? super T> collection) {
            f fVarG = g();
            while (true) {
                fVarG = fVarG.get();
                if (fVarG == null) {
                    return;
                }
                Object objJ = j(fVarG.a);
                if (NotificationLite.isComplete(objJ) || NotificationLite.isError(objJ)) {
                    return;
                } else {
                    collection.add((Object) NotificationLite.getValue(objJ));
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public final void error(Throwable th) {
            Object objF = f(NotificationLite.error(th));
            long j = this.c + 1;
            this.c = j;
            c(new f(objF, j));
            q();
        }

        public Object f(Object obj) {
            return obj;
        }

        public f g() {
            return get();
        }

        public boolean h() {
            Object obj = this.a.a;
            return obj != null && NotificationLite.isComplete(j(obj));
        }

        public boolean i() {
            Object obj = this.a.a;
            return obj != null && NotificationLite.isError(j(obj));
        }

        public Object j(Object obj) {
            return obj;
        }

        public final void k() {
            f fVar = get().get();
            if (fVar == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.b--;
            n(fVar);
        }

        public final void m(int i) {
            f fVar = get();
            while (i > 0) {
                fVar = fVar.get();
                i--;
                this.b--;
            }
            n(fVar);
        }

        public final void n(f fVar) {
            set(fVar);
        }

        public final void o() {
            f fVar = get();
            if (fVar.a != null) {
                f fVar2 = new f(null, 0L);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        public void p() {
        }

        public void q() {
            o();
        }
    }

    public static final class b<T> extends ConnectableFlowable<T> {
        private final ConnectableFlowable<T> b;
        private final Flowable<T> c;

        public b(ConnectableFlowable<T> connectableFlowable, Flowable<T> flowable) {
            this.b = connectableFlowable;
            this.c = flowable;
        }

        @Override // io.reactivex.flowables.ConnectableFlowable
        public void connect(Consumer<? super Disposable> consumer) {
            this.b.connect(consumer);
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(Subscriber<? super T> subscriber) {
            this.c.subscribe(subscriber);
        }
    }

    public static final class c implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public Object call() {
            return new n(16);
        }
    }

    public static final class d<T> extends AtomicLong implements Subscription, Disposable {
        public static final long g = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        public final j<T> a;
        public final Subscriber<? super T> b;
        public Object c;
        public final AtomicLong d = new AtomicLong();
        public boolean e;
        public boolean f;

        public d(j<T> jVar, Subscriber<? super T> subscriber) {
            this.a = jVar;
            this.b = subscriber;
        }

        public <U> U a() {
            return (U) this.c;
        }

        public long b(long j) {
            return BackpressureHelper.producedCancel(this, j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.a.c(this);
                this.a.b();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (!SubscriptionHelper.validate(j) || BackpressureHelper.addCancel(this, j) == Long.MIN_VALUE) {
                return;
            }
            BackpressureHelper.add(this.d, j);
            this.a.b();
            this.a.a.b(this);
        }
    }

    public static final class e<R, U> extends Flowable<R> {
        private final Callable<? extends ConnectableFlowable<U>> b;
        private final Function<? super Flowable<U>, ? extends Publisher<R>> c;

        public final class a implements Consumer<Disposable> {
            private final SubscriberResourceWrapper<R> a;

            public a(SubscriberResourceWrapper<R> subscriberResourceWrapper) {
                this.a = subscriberResourceWrapper;
            }

            @Override // io.reactivex.functions.Consumer
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void accept(Disposable disposable) {
                this.a.setResource(disposable);
            }
        }

        public e(Callable<? extends ConnectableFlowable<U>> callable, Function<? super Flowable<U>, ? extends Publisher<R>> function) {
            this.b = callable;
            this.c = function;
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(Subscriber<? super R> subscriber) {
            try {
                ConnectableFlowable connectableFlowable = (ConnectableFlowable) ObjectHelper.requireNonNull(this.b.call(), "The connectableFactory returned null");
                try {
                    Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.c.apply(connectableFlowable), "The selector returned a null Publisher");
                    SubscriberResourceWrapper subscriberResourceWrapper = new SubscriberResourceWrapper(subscriber);
                    publisher.subscribe(subscriberResourceWrapper);
                    connectableFlowable.connect(new a(subscriberResourceWrapper));
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, subscriber);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, subscriber);
            }
        }
    }

    public static final class f extends AtomicReference<f> {
        private static final long serialVersionUID = 245354315435971818L;
        public final Object a;
        public final long b;

        public f(Object obj, long j) {
            this.a = obj;
            this.b = j;
        }
    }

    public interface g<T> {
        void a(T t);

        void b(d<T> dVar);

        void complete();

        void error(Throwable th);
    }

    public static final class h<T> implements Callable<g<T>> {
        private final int a;

        public h(int i) {
            this.a = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g<T> call() {
            return new m(this.a);
        }
    }

    public static final class i<T> implements Publisher<T> {
        private final AtomicReference<j<T>> a;
        private final Callable<? extends g<T>> b;

        public i(AtomicReference<j<T>> atomicReference, Callable<? extends g<T>> callable) {
            this.a = atomicReference;
            this.b = callable;
        }

        @Override // org.reactivestreams.Publisher
        public void subscribe(Subscriber<? super T> subscriber) {
            j<T> jVar;
            while (true) {
                jVar = this.a.get();
                if (jVar != null) {
                    break;
                }
                try {
                    j<T> jVar2 = new j<>(this.b.call());
                    if (this.a.compareAndSet(null, jVar2)) {
                        jVar = jVar2;
                        break;
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, subscriber);
                    return;
                }
            }
            d<T> dVar = new d<>(jVar, subscriber);
            subscriber.onSubscribe(dVar);
            jVar.a(dVar);
            if (dVar.isDisposed()) {
                jVar.c(dVar);
            } else {
                jVar.b();
                jVar.a.b(dVar);
            }
        }
    }

    public static final class j<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Disposable {
        public static final d[] h = new d[0];
        public static final d[] i = new d[0];
        private static final long serialVersionUID = 7224554242710036740L;
        public final g<T> a;
        public boolean b;
        public long f;
        public long g;
        public final AtomicInteger e = new AtomicInteger();
        public final AtomicReference<d<T>[]> c = new AtomicReference<>(h);
        public final AtomicBoolean d = new AtomicBoolean();

        public j(g<T> gVar) {
            this.a = gVar;
        }

        public boolean a(d<T> dVar) {
            d<T>[] dVarArr;
            d<T>[] dVarArr2;
            Objects.requireNonNull(dVar);
            do {
                dVarArr = this.c.get();
                if (dVarArr == i) {
                    return false;
                }
                int length = dVarArr.length;
                dVarArr2 = new d[length + 1];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
            } while (!this.c.compareAndSet(dVarArr, dVarArr2));
            return true;
        }

        public void b() {
            if (this.e.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!isDisposed()) {
                d<T>[] dVarArr = this.c.get();
                long j = this.f;
                long jMax = j;
                for (d<T> dVar : dVarArr) {
                    jMax = Math.max(jMax, dVar.d.get());
                }
                long j2 = this.g;
                Subscription subscription = get();
                long j3 = jMax - j;
                if (j3 != 0) {
                    this.f = jMax;
                    if (subscription == null) {
                        long j4 = j2 + j3;
                        if (j4 < 0) {
                            j4 = Long.MAX_VALUE;
                        }
                        this.g = j4;
                    } else if (j2 != 0) {
                        this.g = 0L;
                        subscription.request(j2 + j3);
                    } else {
                        subscription.request(j3);
                    }
                } else if (j2 != 0 && subscription != null) {
                    this.g = 0L;
                    subscription.request(j2);
                }
                iAddAndGet = this.e.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public void c(d<T> dVar) {
            d<T>[] dVarArr;
            d<T>[] dVarArr2;
            do {
                dVarArr = this.c.get();
                int length = dVarArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = -1;
                for (int i3 = 0; i3 < length; i3++) {
                    if (dVarArr[i3].equals(dVar)) {
                        i2 = i3;
                        break;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                if (length == 1) {
                    dVarArr2 = h;
                } else {
                    d<T>[] dVarArr3 = new d[length - 1];
                    System.arraycopy(dVarArr, 0, dVarArr3, 0, i2);
                    System.arraycopy(dVarArr, i2 + 1, dVarArr3, i2, (length - i2) - 1);
                    dVarArr2 = dVarArr3;
                }
            } while (!this.c.compareAndSet(dVarArr, dVarArr2));
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.c.set(i);
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.c.get() == i;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.complete();
            for (d<T> dVar : this.c.getAndSet(i)) {
                this.a.b(dVar);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.b) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.b = true;
            this.a.error(th);
            for (d<T> dVar : this.c.getAndSet(i)) {
                this.a.b(dVar);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.b) {
                return;
            }
            this.a.a(t);
            for (d<T> dVar : this.c.get()) {
                this.a.b(dVar);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                b();
                for (d<T> dVar : this.c.get()) {
                    this.a.b(dVar);
                }
            }
        }
    }

    public static final class k<T> implements Callable<g<T>> {
        private final int a;
        private final long b;
        private final TimeUnit c;
        private final Scheduler d;

        public k(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.a = i;
            this.b = j;
            this.c = timeUnit;
            this.d = scheduler;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g<T> call() {
            return new l(this.a, this.b, this.c, this.d);
        }
    }

    public static final class l<T> extends a<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        public final Scheduler d;
        public final long e;
        public final TimeUnit f;
        public final int g;

        public l(int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.d = scheduler;
            this.g = i;
            this.e = j;
            this.f = timeUnit;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.a
        public Object f(Object obj) {
            return new Timed(obj, this.d.now(this.f), this.f);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.a
        public f g() {
            f fVar;
            long jNow = this.d.now(this.f) - this.e;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                Timed timed = (Timed) fVar2.a;
                if (NotificationLite.isComplete(timed.value()) || NotificationLite.isError(timed.value()) || timed.time() > jNow) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.a
        public Object j(Object obj) {
            return ((Timed) obj).value();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.a
        public void p() {
            f fVar;
            long jNow = this.d.now(this.f) - this.e;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 != null) {
                    int i2 = this.b;
                    if (i2 <= this.g) {
                        if (((Timed) fVar2.a).time() > jNow) {
                            break;
                        }
                        i++;
                        this.b--;
                        fVar3 = fVar2.get();
                    } else {
                        i++;
                        this.b = i2 - 1;
                        fVar3 = fVar2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                n(fVar);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.a
        public void q() {
            f fVar;
            long jNow = this.d.now(this.f) - this.e;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || this.b <= 1 || ((Timed) fVar2.a).time() > jNow) {
                    break;
                }
                i++;
                this.b--;
                fVar3 = fVar2.get();
            }
            if (i != 0) {
                n(fVar);
            }
        }
    }

    public static final class m<T> extends a<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        public final int d;

        public m(int i) {
            this.d = i;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.a
        public void p() {
            if (this.b > this.d) {
                k();
            }
        }
    }

    public static final class n<T> extends ArrayList<Object> implements g<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        public volatile int a;

        public n(int i) {
            super(i);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public void a(T t) {
            add(NotificationLite.next(t));
            this.a++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public void b(d<T> dVar) {
            synchronized (dVar) {
                if (dVar.e) {
                    dVar.f = true;
                    return;
                }
                dVar.e = true;
                Subscriber<? super T> subscriber = dVar.b;
                while (!dVar.isDisposed()) {
                    int i = this.a;
                    Integer num = (Integer) dVar.a();
                    int iIntValue = num != null ? num.intValue() : 0;
                    long j = dVar.get();
                    long j2 = j;
                    long j3 = 0;
                    while (j2 != 0 && iIntValue < i) {
                        Object obj = get(iIntValue);
                        try {
                            if (NotificationLite.accept(obj, subscriber) || dVar.isDisposed()) {
                                return;
                            }
                            iIntValue++;
                            j2--;
                            j3++;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            dVar.dispose();
                            if (NotificationLite.isError(obj) || NotificationLite.isComplete(obj)) {
                                return;
                            }
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (j3 != 0) {
                        dVar.c = Integer.valueOf(iIntValue);
                        if (j != Long.MAX_VALUE) {
                            dVar.b(j3);
                        }
                    }
                    synchronized (dVar) {
                        if (!dVar.f) {
                            dVar.e = false;
                            return;
                        }
                        dVar.f = false;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public void complete() {
            add(NotificationLite.complete());
            this.a++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.g
        public void error(Throwable th) {
            add(NotificationLite.error(th));
            this.a++;
        }
    }

    private FlowableReplay(Publisher<T> publisher, Flowable<T> flowable, AtomicReference<j<T>> atomicReference, Callable<? extends g<T>> callable) {
        this.e = publisher;
        this.b = flowable;
        this.c = atomicReference;
        this.d = callable;
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, int i2) {
        return i2 == Integer.MAX_VALUE ? createFrom(flowable) : e(flowable, new h(i2));
    }

    public static <T> ConnectableFlowable<T> createFrom(Flowable<? extends T> flowable) {
        return e(flowable, f);
    }

    public static <T> ConnectableFlowable<T> e(Flowable<T> flowable, Callable<? extends g<T>> callable) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowableReplay(new i(atomicReference, callable), flowable, atomicReference, callable));
    }

    public static <U, R> Flowable<R> multicastSelector(Callable<? extends ConnectableFlowable<U>> callable, Function<? super Flowable<U>, ? extends Publisher<R>> function) {
        return new e(callable, function);
    }

    public static <T> ConnectableFlowable<T> observeOn(ConnectableFlowable<T> connectableFlowable, Scheduler scheduler) {
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new b(connectableFlowable, connectableFlowable.observeOn(scheduler)));
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        j<T> jVar;
        while (true) {
            jVar = this.c.get();
            if (jVar != null && !jVar.isDisposed()) {
                break;
            }
            try {
                j<T> jVar2 = new j<>(this.d.call());
                if (this.c.compareAndSet(jVar, jVar2)) {
                    jVar = jVar2;
                    break;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                throw ExceptionHelper.wrapOrThrow(th);
            }
        }
        boolean z = !jVar.d.get() && jVar.d.compareAndSet(false, true);
        try {
            consumer.accept(jVar);
            if (z) {
                this.b.subscribe((FlowableSubscriber) jVar);
            }
        } catch (Throwable th2) {
            if (z) {
                jVar.d.compareAndSet(true, false);
            }
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable) {
        this.c.compareAndSet((j) disposable, null);
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.b;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.e.subscribe(subscriber);
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return create(flowable, j2, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, long j2, TimeUnit timeUnit, Scheduler scheduler, int i2) {
        return e(flowable, new k(i2, j2, timeUnit, scheduler));
    }
}
