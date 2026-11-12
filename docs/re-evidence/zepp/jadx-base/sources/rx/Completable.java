package rx;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.observers.AssertableSubscriberObservable;
import rx.internal.operators.CompletableFromEmitter;
import rx.internal.operators.CompletableOnSubscribeConcat;
import rx.internal.operators.CompletableOnSubscribeConcatArray;
import rx.internal.operators.CompletableOnSubscribeConcatIterable;
import rx.internal.operators.CompletableOnSubscribeMerge;
import rx.internal.operators.CompletableOnSubscribeMergeArray;
import rx.internal.operators.CompletableOnSubscribeMergeDelayErrorArray;
import rx.internal.operators.CompletableOnSubscribeMergeDelayErrorIterable;
import rx.internal.operators.CompletableOnSubscribeMergeIterable;
import rx.internal.operators.CompletableOnSubscribeTimeout;
import rx.internal.util.SubscriptionList;
import rx.internal.util.UtilityFunctions;
import rx.observers.AssertableSubscriber;
import rx.observers.SafeCompletableSubscriber;
import rx.observers.SafeSubscriber;
import rx.plugins.RxJavaHooks;
import rx.schedulers.Schedulers;
import rx.subscriptions.BooleanSubscription;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.MultipleAssignmentSubscription;
import rx.subscriptions.SerialSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public class Completable {
    public static final Completable b = new Completable(new k(), false);
    public static final Completable c = new Completable(new v(), false);
    private final OnSubscribe a;

    public interface OnSubscribe extends Action1<CompletableSubscriber> {
    }

    public interface Operator extends Func1<CompletableSubscriber, CompletableSubscriber> {
    }

    public interface Transformer extends Func1<Completable, Completable> {
    }

    public static class a implements OnSubscribe {
        public final /* synthetic */ Observable a;

        /* JADX INFO: renamed from: rx.Completable$a$a, reason: collision with other inner class name */
        public class C1217a extends Subscriber<Object> {
            public final /* synthetic */ CompletableSubscriber f;

            public C1217a(CompletableSubscriber completableSubscriber) {
                this.f = completableSubscriber;
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.f.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                this.f.onError(th);
            }

            @Override // rx.Observer
            public void onNext(Object obj) {
            }
        }

        public a(Observable observable) {
            this.a = observable;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            C1217a c1217a = new C1217a(completableSubscriber);
            completableSubscriber.onSubscribe(c1217a);
            this.a.unsafeSubscribe(c1217a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a0<T> implements Single.OnSubscribe<T> {
        public final /* synthetic */ Func0 a;

        public class a implements CompletableSubscriber {
            public final /* synthetic */ SingleSubscriber a;

            public a(SingleSubscriber singleSubscriber) {
                this.a = singleSubscriber;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                try {
                    Object objCall = a0.this.a.call();
                    if (objCall == null) {
                        this.a.onError(new NullPointerException("The value supplied is null"));
                    } else {
                        this.a.onSuccess(objCall);
                    }
                } catch (Throwable th) {
                    this.a.onError(th);
                }
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                this.a.onError(th);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.a.add(subscription);
            }
        }

        public a0(Func0 func0) {
            this.a = func0;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            Completable.this.unsafeSubscribe(new a(singleSubscriber));
        }
    }

    public static class b implements OnSubscribe {
        public final /* synthetic */ Single a;

        public class a extends SingleSubscriber<Object> {
            public final /* synthetic */ CompletableSubscriber b;

            public a(CompletableSubscriber completableSubscriber) {
                this.b = completableSubscriber;
            }

            @Override // rx.SingleSubscriber
            public void onError(Throwable th) {
                this.b.onError(th);
            }

            @Override // rx.SingleSubscriber
            public void onSuccess(Object obj) {
                this.b.onCompleted();
            }
        }

        public b(Single single) {
            this.a = single;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            a aVar = new a(completableSubscriber);
            completableSubscriber.onSubscribe(aVar);
            this.a.subscribe(aVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b0<T> implements Func0<T> {
        public final /* synthetic */ Object a;

        public b0(Object obj) {
            this.a = obj;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        public T call() {
            return (T) this.a;
        }
    }

    public static class c implements OnSubscribe {
        public final /* synthetic */ Scheduler a;
        public final /* synthetic */ long b;
        public final /* synthetic */ TimeUnit c;

        public class a implements Action0 {
            public final /* synthetic */ CompletableSubscriber a;
            public final /* synthetic */ Scheduler.Worker b;

            public a(CompletableSubscriber completableSubscriber, Scheduler.Worker worker) {
                this.a = completableSubscriber;
                this.b = worker;
            }

            @Override // rx.functions.Action0
            public void call() {
                try {
                    this.a.onCompleted();
                } finally {
                    this.b.unsubscribe();
                }
            }
        }

        public c(Scheduler scheduler, long j, TimeUnit timeUnit) {
            this.a = scheduler;
            this.b = j;
            this.c = timeUnit;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
            completableSubscriber.onSubscribe(multipleAssignmentSubscription);
            if (multipleAssignmentSubscription.isUnsubscribed()) {
                return;
            }
            Scheduler.Worker workerCreateWorker = this.a.createWorker();
            multipleAssignmentSubscription.set(workerCreateWorker);
            workerCreateWorker.schedule(new a(completableSubscriber, workerCreateWorker), this.b, this.c);
        }
    }

    public class c0 implements OnSubscribe {
        public final /* synthetic */ Scheduler a;

        public class a implements CompletableSubscriber {
            public final /* synthetic */ CompletableSubscriber a;

            /* JADX INFO: renamed from: rx.Completable$c0$a$a, reason: collision with other inner class name */
            public class C1218a implements Action0 {
                public final /* synthetic */ Subscription a;

                /* JADX INFO: renamed from: rx.Completable$c0$a$a$a, reason: collision with other inner class name */
                public class C1219a implements Action0 {
                    public final /* synthetic */ Scheduler.Worker a;

                    public C1219a(Scheduler.Worker worker) {
                        this.a = worker;
                    }

                    @Override // rx.functions.Action0
                    public void call() {
                        try {
                            C1218a.this.a.unsubscribe();
                        } finally {
                            this.a.unsubscribe();
                        }
                    }
                }

                public C1218a(Subscription subscription) {
                    this.a = subscription;
                }

                @Override // rx.functions.Action0
                public void call() {
                    Scheduler.Worker workerCreateWorker = c0.this.a.createWorker();
                    workerCreateWorker.schedule(new C1219a(workerCreateWorker));
                }
            }

            public a(CompletableSubscriber completableSubscriber) {
                this.a = completableSubscriber;
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                this.a.onCompleted();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                this.a.onError(th);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.a.onSubscribe(Subscriptions.create(new C1218a(subscription)));
            }
        }

        public c0(Scheduler scheduler) {
            this.a = scheduler;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            Completable.this.unsafeSubscribe(new a(completableSubscriber));
        }
    }

    public static class d implements OnSubscribe {
        public final /* synthetic */ Func0 a;
        public final /* synthetic */ Func1 b;
        public final /* synthetic */ Action1 c;
        public final /* synthetic */ boolean d;

        public class a implements CompletableSubscriber {
            public Subscription a;
            public final /* synthetic */ AtomicBoolean b;
            public final /* synthetic */ Object c;
            public final /* synthetic */ CompletableSubscriber d;

            /* JADX INFO: renamed from: rx.Completable$d$a$a, reason: collision with other inner class name */
            public class C1220a implements Action0 {
                public C1220a() {
                }

                @Override // rx.functions.Action0
                public void call() {
                    a.this.a();
                }
            }

            public a(AtomicBoolean atomicBoolean, Object obj, CompletableSubscriber completableSubscriber) {
                this.b = atomicBoolean;
                this.c = obj;
                this.d = completableSubscriber;
            }

            public void a() {
                this.a.unsubscribe();
                if (this.b.compareAndSet(false, true)) {
                    try {
                        d.this.c.call(this.c);
                    } catch (Throwable th) {
                        RxJavaHooks.onError(th);
                    }
                }
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                if (d.this.d && this.b.compareAndSet(false, true)) {
                    try {
                        d.this.c.call(this.c);
                    } catch (Throwable th) {
                        this.d.onError(th);
                        return;
                    }
                }
                this.d.onCompleted();
                if (d.this.d) {
                    return;
                }
                a();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                if (d.this.d && this.b.compareAndSet(false, true)) {
                    try {
                        d.this.c.call(this.c);
                    } catch (Throwable th2) {
                        th = new CompositeException(Arrays.asList(th, th2));
                    }
                }
                this.d.onError(th);
                if (d.this.d) {
                    return;
                }
                a();
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.a = subscription;
                this.d.onSubscribe(Subscriptions.create(new C1220a()));
            }
        }

        public d(Func0 func0, Func1 func1, Action1 action1, boolean z) {
            this.a = func0;
            this.b = func1;
            this.c = action1;
            this.d = z;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            try {
                Object objCall = this.a.call();
                try {
                    Completable completable = (Completable) this.b.call(objCall);
                    if (completable != null) {
                        completable.unsafeSubscribe(new a(new AtomicBoolean(), objCall, completableSubscriber));
                        return;
                    }
                    try {
                        this.c.call(objCall);
                        completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                        completableSubscriber.onError(new NullPointerException("The completable supplied is null"));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                        completableSubscriber.onError(new CompositeException(Arrays.asList(new NullPointerException("The completable supplied is null"), th)));
                    }
                } catch (Throwable th2) {
                    try {
                        this.c.call(objCall);
                        Exceptions.throwIfFatal(th2);
                        completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                        completableSubscriber.onError(th2);
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th2);
                        Exceptions.throwIfFatal(th3);
                        completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                        completableSubscriber.onError(new CompositeException(Arrays.asList(th2, th3)));
                    }
                }
            } catch (Throwable th4) {
                completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                completableSubscriber.onError(th4);
            }
        }
    }

    public static class d0 implements OnSubscribe {
        public final /* synthetic */ Iterable a;

        public class a implements CompletableSubscriber {
            public final /* synthetic */ AtomicBoolean a;
            public final /* synthetic */ CompositeSubscription b;
            public final /* synthetic */ CompletableSubscriber c;

            public a(AtomicBoolean atomicBoolean, CompositeSubscription compositeSubscription, CompletableSubscriber completableSubscriber) {
                this.a = atomicBoolean;
                this.b = compositeSubscription;
                this.c = completableSubscriber;
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                if (this.a.compareAndSet(false, true)) {
                    this.b.unsubscribe();
                    this.c.onCompleted();
                }
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                if (!this.a.compareAndSet(false, true)) {
                    RxJavaHooks.onError(th);
                } else {
                    this.b.unsubscribe();
                    this.c.onError(th);
                }
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.b.add(subscription);
            }
        }

        public d0(Iterable iterable) {
            this.a = iterable;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            completableSubscriber.onSubscribe(compositeSubscription);
            try {
                Iterator it2 = this.a.iterator();
                if (it2 == null) {
                    completableSubscriber.onError(new NullPointerException("The iterator returned is null"));
                    return;
                }
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                a aVar = new a(atomicBoolean, compositeSubscription, completableSubscriber);
                boolean z = true;
                while (!atomicBoolean.get() && !compositeSubscription.isUnsubscribed()) {
                    try {
                        if (!it2.hasNext()) {
                            if (z) {
                                completableSubscriber.onCompleted();
                                return;
                            }
                            return;
                        }
                        if (atomicBoolean.get() || compositeSubscription.isUnsubscribed()) {
                            return;
                        }
                        try {
                            Completable completable = (Completable) it2.next();
                            if (completable == null) {
                                Throwable nullPointerException = new NullPointerException("One of the sources is null");
                                if (!atomicBoolean.compareAndSet(false, true)) {
                                    RxJavaHooks.onError(nullPointerException);
                                    return;
                                } else {
                                    compositeSubscription.unsubscribe();
                                    completableSubscriber.onError(nullPointerException);
                                    return;
                                }
                            }
                            if (atomicBoolean.get() || compositeSubscription.isUnsubscribed()) {
                                return;
                            }
                            completable.unsafeSubscribe(aVar);
                            z = false;
                        } catch (Throwable th) {
                            if (!atomicBoolean.compareAndSet(false, true)) {
                                RxJavaHooks.onError(th);
                                return;
                            } else {
                                compositeSubscription.unsubscribe();
                                completableSubscriber.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        if (!atomicBoolean.compareAndSet(false, true)) {
                            RxJavaHooks.onError(th2);
                            return;
                        } else {
                            compositeSubscription.unsubscribe();
                            completableSubscriber.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                completableSubscriber.onError(th3);
            }
        }
    }

    public class e implements CompletableSubscriber {
        public final /* synthetic */ CountDownLatch a;
        public final /* synthetic */ Throwable[] b;

        public e(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.a = countDownLatch;
            this.b = thArr;
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            this.a.countDown();
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            this.b[0] = th;
            this.a.countDown();
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
        }
    }

    public static class e0 implements OnSubscribe {
        public final /* synthetic */ Func0 a;

        public e0(Func0 func0) {
            this.a = func0;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            try {
                Completable completable = (Completable) this.a.call();
                if (completable != null) {
                    completable.unsafeSubscribe(completableSubscriber);
                } else {
                    completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                    completableSubscriber.onError(new NullPointerException("The completable returned is null"));
                }
            } catch (Throwable th) {
                completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
                completableSubscriber.onError(th);
            }
        }
    }

    public class f implements CompletableSubscriber {
        public final /* synthetic */ CountDownLatch a;
        public final /* synthetic */ Throwable[] b;

        public f(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.a = countDownLatch;
            this.b = thArr;
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            this.a.countDown();
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            this.b[0] = th;
            this.a.countDown();
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
        }
    }

    public static class f0 implements OnSubscribe {
        public final /* synthetic */ Func0 a;

        public f0(Func0 func0) {
            this.a = func0;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
            try {
                th = (Throwable) this.a.call();
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                th = new NullPointerException("The error supplied is null");
            }
            completableSubscriber.onError(th);
        }
    }

    public class g implements OnSubscribe {
        public final /* synthetic */ Scheduler a;
        public final /* synthetic */ long b;
        public final /* synthetic */ TimeUnit c;
        public final /* synthetic */ boolean d;

        public class a implements CompletableSubscriber {
            public final /* synthetic */ CompositeSubscription a;
            public final /* synthetic */ Scheduler.Worker b;
            public final /* synthetic */ CompletableSubscriber c;

            /* JADX INFO: renamed from: rx.Completable$g$a$a, reason: collision with other inner class name */
            public class C1221a implements Action0 {
                public C1221a() {
                }

                @Override // rx.functions.Action0
                public void call() {
                    try {
                        a.this.c.onCompleted();
                    } finally {
                        a.this.b.unsubscribe();
                    }
                }
            }

            public class b implements Action0 {
                public final /* synthetic */ Throwable a;

                public b(Throwable th) {
                    this.a = th;
                }

                @Override // rx.functions.Action0
                public void call() {
                    try {
                        a.this.c.onError(this.a);
                    } finally {
                        a.this.b.unsubscribe();
                    }
                }
            }

            public a(CompositeSubscription compositeSubscription, Scheduler.Worker worker, CompletableSubscriber completableSubscriber) {
                this.a = compositeSubscription;
                this.b = worker;
                this.c = completableSubscriber;
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                CompositeSubscription compositeSubscription = this.a;
                Scheduler.Worker worker = this.b;
                C1221a c1221a = new C1221a();
                g gVar = g.this;
                compositeSubscription.add(worker.schedule(c1221a, gVar.b, gVar.c));
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                if (!g.this.d) {
                    this.c.onError(th);
                    return;
                }
                CompositeSubscription compositeSubscription = this.a;
                Scheduler.Worker worker = this.b;
                b bVar = new b(th);
                g gVar = g.this;
                compositeSubscription.add(worker.schedule(bVar, gVar.b, gVar.c));
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.a.add(subscription);
                this.c.onSubscribe(this.a);
            }
        }

        public g(Scheduler scheduler, long j, TimeUnit timeUnit, boolean z) {
            this.a = scheduler;
            this.b = j;
            this.c = timeUnit;
            this.d = z;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            Scheduler.Worker workerCreateWorker = this.a.createWorker();
            compositeSubscription.add(workerCreateWorker);
            Completable.this.unsafeSubscribe(new a(compositeSubscription, workerCreateWorker, completableSubscriber));
        }
    }

    public static class g0 implements OnSubscribe {
        public final /* synthetic */ Throwable a;

        public g0(Throwable th) {
            this.a = th;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
            completableSubscriber.onError(this.a);
        }
    }

    public class h implements Action1<Throwable> {
        public final /* synthetic */ Action1 a;

        public h(Action1 action1) {
            this.a = action1;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            this.a.call(Notification.createOnError(th));
        }
    }

    public static class h0 implements OnSubscribe {
        public final /* synthetic */ Action0 a;

        public h0(Action0 action0) {
            this.a = action0;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            BooleanSubscription booleanSubscription = new BooleanSubscription();
            completableSubscriber.onSubscribe(booleanSubscription);
            try {
                this.a.call();
                if (booleanSubscription.isUnsubscribed()) {
                    return;
                }
                completableSubscriber.onCompleted();
            } catch (Throwable th) {
                if (booleanSubscription.isUnsubscribed()) {
                    return;
                }
                completableSubscriber.onError(th);
            }
        }
    }

    public class i implements Action0 {
        public final /* synthetic */ Action1 a;

        public i(Action1 action1) {
            this.a = action1;
        }

        @Override // rx.functions.Action0
        public void call() {
            this.a.call(Notification.createOnCompleted());
        }
    }

    public static class i0 implements OnSubscribe {
        public final /* synthetic */ Callable a;

        public i0(Callable callable) {
            this.a = callable;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            BooleanSubscription booleanSubscription = new BooleanSubscription();
            completableSubscriber.onSubscribe(booleanSubscription);
            try {
                this.a.call();
                if (booleanSubscription.isUnsubscribed()) {
                    return;
                }
                completableSubscriber.onCompleted();
            } catch (Throwable th) {
                if (booleanSubscription.isUnsubscribed()) {
                    return;
                }
                completableSubscriber.onError(th);
            }
        }
    }

    public class j implements OnSubscribe {
        public final /* synthetic */ Action0 a;
        public final /* synthetic */ Action0 b;
        public final /* synthetic */ Action1 c;
        public final /* synthetic */ Action1 d;
        public final /* synthetic */ Action0 e;

        public class a implements CompletableSubscriber {
            public final /* synthetic */ CompletableSubscriber a;

            /* JADX INFO: renamed from: rx.Completable$j$a$a, reason: collision with other inner class name */
            public class C1222a implements Action0 {
                public final /* synthetic */ Subscription a;

                public C1222a(Subscription subscription) {
                    this.a = subscription;
                }

                @Override // rx.functions.Action0
                public void call() {
                    try {
                        j.this.e.call();
                    } catch (Throwable th) {
                        RxJavaHooks.onError(th);
                    }
                    this.a.unsubscribe();
                }
            }

            public a(CompletableSubscriber completableSubscriber) {
                this.a = completableSubscriber;
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                try {
                    j.this.a.call();
                    this.a.onCompleted();
                    try {
                        j.this.b.call();
                    } catch (Throwable th) {
                        RxJavaHooks.onError(th);
                    }
                } catch (Throwable th2) {
                    this.a.onError(th2);
                }
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                try {
                    j.this.c.call(th);
                } catch (Throwable th2) {
                    th = new CompositeException(Arrays.asList(th, th2));
                }
                this.a.onError(th);
                try {
                    j.this.b.call();
                } catch (Throwable th3) {
                    RxJavaHooks.onError(th3);
                }
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                try {
                    j.this.d.call(subscription);
                    this.a.onSubscribe(Subscriptions.create(new C1222a(subscription)));
                } catch (Throwable th) {
                    subscription.unsubscribe();
                    this.a.onSubscribe(Subscriptions.unsubscribed());
                    this.a.onError(th);
                }
            }
        }

        public j(Action0 action0, Action0 action1, Action1 action2, Action1 action3, Action0 action4) {
            this.a = action0;
            this.b = action1;
            this.c = action2;
            this.d = action3;
            this.e = action4;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            Completable.this.unsafeSubscribe(new a(completableSubscriber));
        }
    }

    public static class k implements OnSubscribe {
        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
            completableSubscriber.onCompleted();
        }
    }

    public class l implements Action1<Throwable> {
        public final /* synthetic */ Action0 a;

        public l(Action0 action0) {
            this.a = action0;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            this.a.call();
        }
    }

    public class m implements CompletableSubscriber {
        public final /* synthetic */ CountDownLatch a;
        public final /* synthetic */ Throwable[] b;

        public m(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.a = countDownLatch;
            this.b = thArr;
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            this.a.countDown();
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            this.b[0] = th;
            this.a.countDown();
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
        }
    }

    public class n implements CompletableSubscriber {
        public final /* synthetic */ CountDownLatch a;
        public final /* synthetic */ Throwable[] b;

        public n(CountDownLatch countDownLatch, Throwable[] thArr) {
            this.a = countDownLatch;
            this.b = thArr;
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            this.a.countDown();
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            this.b[0] = th;
            this.a.countDown();
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
        }
    }

    public class o implements OnSubscribe {
        public final /* synthetic */ Operator a;

        public o(Operator operator) {
            this.a = operator;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            try {
                Completable.this.unsafeSubscribe(RxJavaHooks.onCompletableLift(this.a).call(completableSubscriber));
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                throw Completable.c(th);
            }
        }
    }

    public class p implements OnSubscribe {
        public final /* synthetic */ Scheduler a;

        public class a implements CompletableSubscriber {
            public final /* synthetic */ Scheduler.Worker a;
            public final /* synthetic */ CompletableSubscriber b;
            public final /* synthetic */ SubscriptionList c;

            /* JADX INFO: renamed from: rx.Completable$p$a$a, reason: collision with other inner class name */
            public class C1223a implements Action0 {
                public C1223a() {
                }

                @Override // rx.functions.Action0
                public void call() {
                    try {
                        a.this.b.onCompleted();
                    } finally {
                        a.this.c.unsubscribe();
                    }
                }
            }

            public class b implements Action0 {
                public final /* synthetic */ Throwable a;

                public b(Throwable th) {
                    this.a = th;
                }

                @Override // rx.functions.Action0
                public void call() {
                    try {
                        a.this.b.onError(this.a);
                    } finally {
                        a.this.c.unsubscribe();
                    }
                }
            }

            public a(Scheduler.Worker worker, CompletableSubscriber completableSubscriber, SubscriptionList subscriptionList) {
                this.a = worker;
                this.b = completableSubscriber;
                this.c = subscriptionList;
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                this.a.schedule(new C1223a());
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                this.a.schedule(new b(th));
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.c.add(subscription);
            }
        }

        public p(Scheduler scheduler) {
            this.a = scheduler;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            SubscriptionList subscriptionList = new SubscriptionList();
            Scheduler.Worker workerCreateWorker = this.a.createWorker();
            subscriptionList.add(workerCreateWorker);
            completableSubscriber.onSubscribe(subscriptionList);
            Completable.this.unsafeSubscribe(new a(workerCreateWorker, completableSubscriber, subscriptionList));
        }
    }

    public class q implements OnSubscribe {
        public final /* synthetic */ Func1 a;

        public class a implements CompletableSubscriber {
            public final /* synthetic */ CompletableSubscriber a;

            public a(CompletableSubscriber completableSubscriber) {
                this.a = completableSubscriber;
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                this.a.onCompleted();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                boolean zBooleanValue = false;
                try {
                    zBooleanValue = ((Boolean) q.this.a.call(th)).booleanValue();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    th = new CompositeException(Arrays.asList(th, th2));
                }
                if (zBooleanValue) {
                    this.a.onCompleted();
                } else {
                    this.a.onError(th);
                }
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.a.onSubscribe(subscription);
            }
        }

        public q(Func1 func1) {
            this.a = func1;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            Completable.this.unsafeSubscribe(new a(completableSubscriber));
        }
    }

    public class r implements OnSubscribe {
        public final /* synthetic */ Func1 a;

        public class a implements CompletableSubscriber {
            public final /* synthetic */ CompletableSubscriber a;
            public final /* synthetic */ SerialSubscription b;

            /* JADX INFO: renamed from: rx.Completable$r$a$a, reason: collision with other inner class name */
            public class C1224a implements CompletableSubscriber {
                public C1224a() {
                }

                @Override // rx.CompletableSubscriber
                public void onCompleted() {
                    a.this.a.onCompleted();
                }

                @Override // rx.CompletableSubscriber
                public void onError(Throwable th) {
                    a.this.a.onError(th);
                }

                @Override // rx.CompletableSubscriber
                public void onSubscribe(Subscription subscription) {
                    a.this.b.set(subscription);
                }
            }

            public a(CompletableSubscriber completableSubscriber, SerialSubscription serialSubscription) {
                this.a = completableSubscriber;
                this.b = serialSubscription;
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                this.a.onCompleted();
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                try {
                    Completable completable = (Completable) r.this.a.call(th);
                    if (completable == null) {
                        this.a.onError(new CompositeException(Arrays.asList(th, new NullPointerException("The completable returned is null"))));
                    } else {
                        completable.unsafeSubscribe(new C1224a());
                    }
                } catch (Throwable th2) {
                    this.a.onError(new CompositeException(Arrays.asList(th, th2)));
                }
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.b.set(subscription);
            }
        }

        public r(Func1 func1) {
            this.a = func1;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            SerialSubscription serialSubscription = new SerialSubscription();
            completableSubscriber.onSubscribe(serialSubscription);
            Completable.this.unsafeSubscribe(new a(completableSubscriber, serialSubscription));
        }
    }

    public class s implements CompletableSubscriber {
        public final /* synthetic */ MultipleAssignmentSubscription a;

        public s(MultipleAssignmentSubscription multipleAssignmentSubscription) {
            this.a = multipleAssignmentSubscription;
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            this.a.unsubscribe();
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            RxJavaHooks.onError(th);
            this.a.unsubscribe();
            Completable.a(th);
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.a.set(subscription);
        }
    }

    public class t implements CompletableSubscriber {
        public boolean a;
        public final /* synthetic */ Action0 b;
        public final /* synthetic */ MultipleAssignmentSubscription c;

        public t(Action0 action0, MultipleAssignmentSubscription multipleAssignmentSubscription) {
            this.b = action0;
            this.c = multipleAssignmentSubscription;
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            if (this.a) {
                return;
            }
            this.a = true;
            try {
                this.b.call();
            } catch (Throwable th) {
                try {
                    RxJavaHooks.onError(th);
                    Completable.a(th);
                } finally {
                    this.c.unsubscribe();
                }
            }
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            RxJavaHooks.onError(th);
            this.c.unsubscribe();
            Completable.a(th);
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.c.set(subscription);
        }
    }

    public class u implements CompletableSubscriber {
        public boolean a;
        public final /* synthetic */ Action0 b;
        public final /* synthetic */ MultipleAssignmentSubscription c;
        public final /* synthetic */ Action1 d;

        public u(Action0 action0, MultipleAssignmentSubscription multipleAssignmentSubscription, Action1 action1) {
            this.b = action0;
            this.c = multipleAssignmentSubscription;
            this.d = action1;
        }

        public void a(Throwable th) {
            try {
                this.d.call(th);
            } catch (Throwable th2) {
                try {
                    CompositeException compositeException = new CompositeException(Arrays.asList(th, th2));
                    RxJavaHooks.onError(compositeException);
                    Completable.a(compositeException);
                } finally {
                    this.c.unsubscribe();
                }
            }
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            if (this.a) {
                return;
            }
            this.a = true;
            try {
                this.b.call();
                this.c.unsubscribe();
            } catch (Throwable th) {
                a(th);
            }
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            if (this.a) {
                RxJavaHooks.onError(th);
                Completable.a(th);
            } else {
                this.a = true;
                a(th);
            }
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.c.set(subscription);
        }
    }

    public static class v implements OnSubscribe {
        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(Subscriptions.unsubscribed());
        }
    }

    public static class w implements OnSubscribe {
        public final /* synthetic */ Completable[] a;

        public class a implements CompletableSubscriber {
            public final /* synthetic */ AtomicBoolean a;
            public final /* synthetic */ CompositeSubscription b;
            public final /* synthetic */ CompletableSubscriber c;

            public a(AtomicBoolean atomicBoolean, CompositeSubscription compositeSubscription, CompletableSubscriber completableSubscriber) {
                this.a = atomicBoolean;
                this.b = compositeSubscription;
                this.c = completableSubscriber;
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                if (this.a.compareAndSet(false, true)) {
                    this.b.unsubscribe();
                    this.c.onCompleted();
                }
            }

            @Override // rx.CompletableSubscriber
            public void onError(Throwable th) {
                if (!this.a.compareAndSet(false, true)) {
                    RxJavaHooks.onError(th);
                } else {
                    this.b.unsubscribe();
                    this.c.onError(th);
                }
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(Subscription subscription) {
                this.b.add(subscription);
            }
        }

        public w(Completable[] completableArr) {
            this.a = completableArr;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            completableSubscriber.onSubscribe(compositeSubscription);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            a aVar = new a(atomicBoolean, compositeSubscription, completableSubscriber);
            for (Completable completable : this.a) {
                if (compositeSubscription.isUnsubscribed()) {
                    return;
                }
                if (completable == null) {
                    Throwable nullPointerException = new NullPointerException("One of the sources is null");
                    if (!atomicBoolean.compareAndSet(false, true)) {
                        RxJavaHooks.onError(nullPointerException);
                        return;
                    } else {
                        compositeSubscription.unsubscribe();
                        completableSubscriber.onError(nullPointerException);
                        return;
                    }
                }
                if (atomicBoolean.get() || compositeSubscription.isUnsubscribed()) {
                    return;
                }
                completable.unsafeSubscribe(aVar);
            }
        }
    }

    public class x implements CompletableSubscriber {
        public final /* synthetic */ Subscriber a;

        public x(Subscriber subscriber) {
            this.a = subscriber;
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            this.a.onCompleted();
        }

        @Override // rx.CompletableSubscriber
        public void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            this.a.add(subscription);
        }
    }

    public class y implements OnSubscribe {
        public final /* synthetic */ Scheduler a;

        public class a implements Action0 {
            public final /* synthetic */ CompletableSubscriber a;
            public final /* synthetic */ Scheduler.Worker b;

            public a(CompletableSubscriber completableSubscriber, Scheduler.Worker worker) {
                this.a = completableSubscriber;
                this.b = worker;
            }

            @Override // rx.functions.Action0
            public void call() {
                try {
                    Completable.this.unsafeSubscribe(this.a);
                } finally {
                    this.b.unsubscribe();
                }
            }
        }

        public y(Scheduler scheduler) {
            this.a = scheduler;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(CompletableSubscriber completableSubscriber) {
            Scheduler.Worker workerCreateWorker = this.a.createWorker();
            workerCreateWorker.schedule(new a(completableSubscriber, workerCreateWorker));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class z<T> implements Observable.OnSubscribe<T> {
        public z() {
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            Completable.this.unsafeSubscribe(subscriber);
        }
    }

    public Completable(OnSubscribe onSubscribe) {
        this.a = RxJavaHooks.onCreate(onSubscribe);
    }

    public static void a(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    public static Completable amb(Completable... completableArr) {
        b(completableArr);
        if (completableArr.length == 0) {
            return complete();
        }
        return completableArr.length == 1 ? completableArr[0] : create(new w(completableArr));
    }

    public static <T> T b(T t2) {
        Objects.requireNonNull(t2);
        return t2;
    }

    public static NullPointerException c(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    public static Completable complete() {
        Completable completable = b;
        OnSubscribe onSubscribeOnCreate = RxJavaHooks.onCreate(completable.a);
        return onSubscribeOnCreate == completable.a ? completable : new Completable(onSubscribeOnCreate, false);
    }

    public static Completable concat(Completable... completableArr) {
        b(completableArr);
        if (completableArr.length == 0) {
            return complete();
        }
        return completableArr.length == 1 ? completableArr[0] : create(new CompletableOnSubscribeConcatArray(completableArr));
    }

    public static Completable create(OnSubscribe onSubscribe) {
        b(onSubscribe);
        try {
            return new Completable(onSubscribe);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            RxJavaHooks.onError(th);
            throw c(th);
        }
    }

    private <T> void d(Subscriber<T> subscriber, boolean z2) {
        b(subscriber);
        if (z2) {
            try {
                subscriber.onStart();
            } catch (NullPointerException e2) {
                throw e2;
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                Throwable thOnObservableError = RxJavaHooks.onObservableError(th);
                RxJavaHooks.onError(thOnObservableError);
                throw c(thOnObservableError);
            }
        }
        unsafeSubscribe(new x(subscriber));
        RxJavaHooks.onObservableReturn(subscriber);
    }

    public static Completable defer(Func0<? extends Completable> func0) {
        b(func0);
        return create(new e0(func0));
    }

    public static Completable error(Func0<? extends Throwable> func0) {
        b(func0);
        return create(new f0(func0));
    }

    public static Completable fromAction(Action0 action0) {
        b(action0);
        return create(new h0(action0));
    }

    public static Completable fromCallable(Callable<?> callable) {
        b(callable);
        return create(new i0(callable));
    }

    public static Completable fromEmitter(Action1<CompletableEmitter> action1) {
        return create(new CompletableFromEmitter(action1));
    }

    public static Completable fromFuture(Future<?> future) {
        b(future);
        return fromObservable(Observable.from(future));
    }

    public static Completable fromObservable(Observable<?> observable) {
        b(observable);
        return create(new a(observable));
    }

    public static Completable fromSingle(Single<?> single) {
        b(single);
        return create(new b(single));
    }

    public static Completable merge(Completable... completableArr) {
        b(completableArr);
        if (completableArr.length == 0) {
            return complete();
        }
        return completableArr.length == 1 ? completableArr[0] : create(new CompletableOnSubscribeMergeArray(completableArr));
    }

    public static Completable merge0(Observable<? extends Completable> observable, int i2, boolean z2) {
        b(observable);
        if (i2 >= 1) {
            return create(new CompletableOnSubscribeMerge(observable, i2, z2));
        }
        throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i2);
    }

    public static Completable mergeDelayError(Completable... completableArr) {
        b(completableArr);
        return create(new CompletableOnSubscribeMergeDelayErrorArray(completableArr));
    }

    public static Completable never() {
        Completable completable = c;
        OnSubscribe onSubscribeOnCreate = RxJavaHooks.onCreate(completable.a);
        return onSubscribeOnCreate == completable.a ? completable : new Completable(onSubscribeOnCreate, false);
    }

    public static Completable timer(long j2, TimeUnit timeUnit) {
        return timer(j2, timeUnit, Schedulers.computation());
    }

    public static <R> Completable using(Func0<R> func0, Func1<? super R, ? extends Completable> func1, Action1<? super R> action1) {
        return using(func0, func1, action1, true);
    }

    public final Completable ambWith(Completable completable) {
        b(completable);
        return amb(this, completable);
    }

    public final <T> Observable<T> andThen(Observable<T> observable) {
        b(observable);
        return observable.delaySubscription(toObservable());
    }

    public final void await() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        unsafeSubscribe(new e(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            if (thArr[0] != null) {
                Exceptions.propagate(thArr[0]);
            }
        } else {
            try {
                countDownLatch.await();
                if (thArr[0] != null) {
                    Exceptions.propagate(thArr[0]);
                }
            } catch (InterruptedException e2) {
                throw Exceptions.propagate(e2);
            }
        }
    }

    public final Completable compose(Transformer transformer) {
        return (Completable) to(transformer);
    }

    public final Completable concatWith(Completable completable) {
        b(completable);
        return concat(this, completable);
    }

    public final Completable delay(long j2, TimeUnit timeUnit) {
        return delay(j2, timeUnit, Schedulers.computation(), false);
    }

    public final Completable doAfterTerminate(Action0 action0) {
        return doOnLifecycle(Actions.empty(), Actions.empty(), Actions.empty(), action0, Actions.empty());
    }

    public final Completable doOnCompleted(Action0 action0) {
        return doOnLifecycle(Actions.empty(), Actions.empty(), action0, Actions.empty(), Actions.empty());
    }

    public final Completable doOnEach(Action1<Notification<Object>> action1) {
        if (action1 != null) {
            return doOnLifecycle(Actions.empty(), new h(action1), new i(action1), Actions.empty(), Actions.empty());
        }
        throw new IllegalArgumentException("onNotification is null");
    }

    public final Completable doOnError(Action1<? super Throwable> action1) {
        return doOnLifecycle(Actions.empty(), action1, Actions.empty(), Actions.empty(), Actions.empty());
    }

    public final Completable doOnLifecycle(Action1<? super Subscription> action1, Action1<? super Throwable> action2, Action0 action0, Action0 action3, Action0 action4) {
        b(action1);
        b(action2);
        b(action0);
        b(action3);
        b(action4);
        return create(new j(action0, action3, action2, action1, action4));
    }

    public final Completable doOnSubscribe(Action1<? super Subscription> action1) {
        return doOnLifecycle(action1, Actions.empty(), Actions.empty(), Actions.empty(), Actions.empty());
    }

    public final Completable doOnTerminate(Action0 action0) {
        return doOnLifecycle(Actions.empty(), new l(action0), action0, Actions.empty(), Actions.empty());
    }

    public final Completable doOnUnsubscribe(Action0 action0) {
        return doOnLifecycle(Actions.empty(), Actions.empty(), Actions.empty(), Actions.empty(), action0);
    }

    public final Throwable get() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        unsafeSubscribe(new m(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            countDownLatch.await();
            return thArr[0];
        } catch (InterruptedException e2) {
            throw Exceptions.propagate(e2);
        }
    }

    public final Completable lift(Operator operator) {
        b(operator);
        return create(new o(operator));
    }

    public final Completable mergeWith(Completable completable) {
        b(completable);
        return merge(this, completable);
    }

    public final Completable observeOn(Scheduler scheduler) {
        b(scheduler);
        return create(new p(scheduler));
    }

    public final Completable onErrorComplete() {
        return onErrorComplete(UtilityFunctions.alwaysTrue());
    }

    public final Completable onErrorResumeNext(Func1<? super Throwable, ? extends Completable> func1) {
        b(func1);
        return create(new r(func1));
    }

    public final Completable repeat() {
        return fromObservable(toObservable().repeat());
    }

    public final Completable repeatWhen(Func1<? super Observable<? extends Void>, ? extends Observable<?>> func1) {
        b(func1);
        return fromObservable(toObservable().repeatWhen(func1));
    }

    public final Completable retry() {
        return fromObservable(toObservable().retry());
    }

    public final Completable retryWhen(Func1<? super Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return fromObservable(toObservable().retryWhen(func1));
    }

    public final Completable startWith(Completable completable) {
        b(completable);
        return concat(completable, this);
    }

    public final Subscription subscribe() {
        MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
        unsafeSubscribe(new s(multipleAssignmentSubscription));
        return multipleAssignmentSubscription;
    }

    public final Completable subscribeOn(Scheduler scheduler) {
        b(scheduler);
        return create(new y(scheduler));
    }

    public final AssertableSubscriber<Void> test() {
        AssertableSubscriberObservable assertableSubscriberObservableCreate = AssertableSubscriberObservable.create(Long.MAX_VALUE);
        subscribe(assertableSubscriberObservableCreate);
        return assertableSubscriberObservableCreate;
    }

    public final Completable timeout(long j2, TimeUnit timeUnit) {
        return timeout0(j2, timeUnit, Schedulers.computation(), null);
    }

    public final Completable timeout0(long j2, TimeUnit timeUnit, Scheduler scheduler, Completable completable) {
        b(timeUnit);
        b(scheduler);
        return create(new CompletableOnSubscribeTimeout(this, j2, timeUnit, scheduler, completable));
    }

    public final <R> R to(Func1<? super Completable, R> func1) {
        return func1.call(this);
    }

    public final <T> Observable<T> toObservable() {
        return Observable.unsafeCreate(new z());
    }

    public final <T> Single<T> toSingle(Func0<? extends T> func0) {
        b(func0);
        return Single.create(new a0(func0));
    }

    public final <T> Single<T> toSingleDefault(T t2) {
        b(t2);
        return toSingle(new b0(t2));
    }

    public final void unsafeSubscribe(CompletableSubscriber completableSubscriber) {
        b(completableSubscriber);
        try {
            RxJavaHooks.onCompletableStart(this, this.a).call(completableSubscriber);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            Throwable thOnCompletableError = RxJavaHooks.onCompletableError(th);
            RxJavaHooks.onError(thOnCompletableError);
            throw c(thOnCompletableError);
        }
    }

    public final Completable unsubscribeOn(Scheduler scheduler) {
        b(scheduler);
        return create(new c0(scheduler));
    }

    public static Completable timer(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        b(timeUnit);
        b(scheduler);
        return create(new c(scheduler, j2, timeUnit));
    }

    public static <R> Completable using(Func0<R> func0, Func1<? super R, ? extends Completable> func1, Action1<? super R> action1, boolean z2) {
        b(func0);
        b(func1);
        b(action1);
        return create(new d(func0, func1, action1, z2));
    }

    public final Completable delay(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j2, timeUnit, scheduler, false);
    }

    public final Completable onErrorComplete(Func1<? super Throwable, Boolean> func1) {
        b(func1);
        return create(new q(func1));
    }

    public final Completable repeat(long j2) {
        return fromObservable(toObservable().repeat(j2));
    }

    public final Completable retry(Func2<Integer, Throwable, Boolean> func2) {
        return fromObservable(toObservable().retry(func2));
    }

    public final Completable timeout(long j2, TimeUnit timeUnit, Completable completable) {
        b(completable);
        return timeout0(j2, timeUnit, Schedulers.computation(), completable);
    }

    public Completable(OnSubscribe onSubscribe, boolean z2) {
        this.a = z2 ? RxJavaHooks.onCreate(onSubscribe) : onSubscribe;
    }

    public static Completable error(Throwable th) {
        b(th);
        return create(new g0(th));
    }

    public static Completable mergeDelayError(Iterable<? extends Completable> iterable) {
        b(iterable);
        return create(new CompletableOnSubscribeMergeDelayErrorIterable(iterable));
    }

    public final <T> Single<T> andThen(Single<T> single) {
        b(single);
        return single.delaySubscription(toObservable());
    }

    public final Completable delay(long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        b(timeUnit);
        b(scheduler);
        return create(new g(scheduler, j2, timeUnit, z2));
    }

    public final Completable retry(long j2) {
        return fromObservable(toObservable().retry(j2));
    }

    public final <T> Observable<T> startWith(Observable<T> observable) {
        b(observable);
        return toObservable().startWith((Observable) observable);
    }

    public final Subscription subscribe(Action0 action0) {
        b(action0);
        MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
        unsafeSubscribe(new t(action0, multipleAssignmentSubscription));
        return multipleAssignmentSubscription;
    }

    public final Completable timeout(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j2, timeUnit, scheduler, null);
    }

    public static Completable mergeDelayError(Observable<? extends Completable> observable) {
        return merge0(observable, Integer.MAX_VALUE, true);
    }

    public final Completable andThen(Completable completable) {
        return concatWith(completable);
    }

    public final Completable timeout(long j2, TimeUnit timeUnit, Scheduler scheduler, Completable completable) {
        b(completable);
        return timeout0(j2, timeUnit, scheduler, completable);
    }

    public static Completable mergeDelayError(Observable<? extends Completable> observable, int i2) {
        return merge0(observable, i2, true);
    }

    public final Subscription subscribe(Action0 action0, Action1<? super Throwable> action1) {
        b(action0);
        b(action1);
        MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
        unsafeSubscribe(new u(action0, multipleAssignmentSubscription, action1));
        return multipleAssignmentSubscription;
    }

    public static Completable amb(Iterable<? extends Completable> iterable) {
        b(iterable);
        return create(new d0(iterable));
    }

    public static Completable concat(Iterable<? extends Completable> iterable) {
        b(iterable);
        return create(new CompletableOnSubscribeConcatIterable(iterable));
    }

    public static Completable merge(Iterable<? extends Completable> iterable) {
        b(iterable);
        return create(new CompletableOnSubscribeMergeIterable(iterable));
    }

    public final Throwable get(long j2, TimeUnit timeUnit) {
        b(timeUnit);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        unsafeSubscribe(new n(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            if (countDownLatch.await(j2, timeUnit)) {
                return thArr[0];
            }
            Exceptions.propagate(new TimeoutException());
            return null;
        } catch (InterruptedException e2) {
            throw Exceptions.propagate(e2);
        }
    }

    public static Completable concat(Observable<? extends Completable> observable) {
        return concat(observable, 2);
    }

    public static Completable merge(Observable<? extends Completable> observable) {
        return merge0(observable, Integer.MAX_VALUE, false);
    }

    public final <T> void unsafeSubscribe(Subscriber<T> subscriber) {
        d(subscriber, true);
    }

    public static Completable concat(Observable<? extends Completable> observable, int i2) {
        b(observable);
        if (i2 >= 1) {
            return create(new CompletableOnSubscribeConcat(observable, i2));
        }
        throw new IllegalArgumentException("prefetch > 0 required but it was " + i2);
    }

    public static Completable merge(Observable<? extends Completable> observable, int i2) {
        return merge0(observable, i2, false);
    }

    public final boolean await(long j2, TimeUnit timeUnit) {
        b(timeUnit);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Throwable[] thArr = new Throwable[1];
        unsafeSubscribe(new f(countDownLatch, thArr));
        if (countDownLatch.getCount() == 0) {
            if (thArr[0] != null) {
                Exceptions.propagate(thArr[0]);
            }
            return true;
        }
        try {
            boolean zAwait = countDownLatch.await(j2, timeUnit);
            if (zAwait && thArr[0] != null) {
                Exceptions.propagate(thArr[0]);
            }
            return zAwait;
        } catch (InterruptedException e2) {
            throw Exceptions.propagate(e2);
        }
    }

    public final void subscribe(CompletableSubscriber completableSubscriber) {
        if (!(completableSubscriber instanceof SafeCompletableSubscriber)) {
            completableSubscriber = new SafeCompletableSubscriber(completableSubscriber);
        }
        unsafeSubscribe(completableSubscriber);
    }

    public final <T> void subscribe(Subscriber<T> subscriber) {
        subscriber.onStart();
        if (!(subscriber instanceof SafeSubscriber)) {
            subscriber = new SafeSubscriber(subscriber);
        }
        d(subscriber, false);
    }
}
