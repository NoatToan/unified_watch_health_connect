package rx;

import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.annotations.Experimental;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.functions.Func5;
import rx.functions.Func6;
import rx.functions.Func7;
import rx.functions.Func8;
import rx.functions.Func9;
import rx.functions.FuncN;
import rx.internal.observers.AssertableSubscriberObservable;
import rx.internal.operators.CompletableFlatMapSingleToCompletable;
import rx.internal.operators.SingleDelay;
import rx.internal.operators.SingleDoAfterTerminate;
import rx.internal.operators.SingleDoOnEvent;
import rx.internal.operators.SingleDoOnSubscribe;
import rx.internal.operators.SingleDoOnUnsubscribe;
import rx.internal.operators.SingleFromCallable;
import rx.internal.operators.SingleFromEmitter;
import rx.internal.operators.SingleFromFuture;
import rx.internal.operators.SingleFromObservable;
import rx.internal.operators.SingleLiftObservableOperator;
import rx.internal.operators.SingleObserveOn;
import rx.internal.operators.SingleOnErrorReturn;
import rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther;
import rx.internal.operators.SingleOnSubscribeMap;
import rx.internal.operators.SingleOnSubscribeUsing;
import rx.internal.operators.SingleOperatorOnErrorResumeNext;
import rx.internal.operators.SingleOperatorZip;
import rx.internal.operators.SingleTakeUntilCompletable;
import rx.internal.operators.SingleTakeUntilObservable;
import rx.internal.operators.SingleTakeUntilSingle;
import rx.internal.operators.SingleTimeout;
import rx.internal.operators.SingleToObservable;
import rx.internal.util.ScalarSynchronousSingle;
import rx.internal.util.UtilityFunctions;
import rx.observers.AssertableSubscriber;
import rx.observers.SafeSubscriber;
import rx.plugins.RxJavaHooks;
import rx.schedulers.Schedulers;
import rx.singles.BlockingSingle;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public class Single<T> {
    public final OnSubscribe<T> a;

    public interface OnSubscribe<T> extends Action1<SingleSubscriber<? super T>> {
    }

    public interface Transformer<T, R> extends Func1<Single<T>, Single<R>> {
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class a<R> implements FuncN<R> {
        public final /* synthetic */ Func9 a;

        public a(Func9 func9) {
            this.a = func9;
        }

        @Override // rx.functions.FuncN
        public R call(Object... objArr) {
            return (R) this.a.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
        }
    }

    public class b extends SingleSubscriber<T> {
        public final /* synthetic */ Action1 b;
        public final /* synthetic */ Action1 c;

        public b(Action1 action1, Action1 action2) {
            this.b = action1;
            this.c = action2;
        }

        @Override // rx.SingleSubscriber
        public final void onError(Throwable th) {
            try {
                this.b.call(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            try {
                this.c.call(t);
            } finally {
                unsubscribe();
            }
        }
    }

    public class c extends SingleSubscriber<T> {
        public final /* synthetic */ Observer b;

        public c(Observer observer) {
            this.b = observer;
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            this.b.onNext(t);
            this.b.onCompleted();
        }
    }

    public class d implements OnSubscribe<T> {
        public final /* synthetic */ Scheduler a;

        public class a implements Action0 {
            public final /* synthetic */ SingleSubscriber a;
            public final /* synthetic */ Scheduler.Worker b;

            /* JADX INFO: renamed from: rx.Single$d$a$a, reason: collision with other inner class name */
            public class C1225a extends SingleSubscriber<T> {
                public C1225a() {
                }

                @Override // rx.SingleSubscriber
                public void onError(Throwable th) {
                    try {
                        a.this.a.onError(th);
                    } finally {
                        a.this.b.unsubscribe();
                    }
                }

                @Override // rx.SingleSubscriber
                public void onSuccess(T t) {
                    try {
                        a.this.a.onSuccess(t);
                    } finally {
                        a.this.b.unsubscribe();
                    }
                }
            }

            public a(SingleSubscriber singleSubscriber, Scheduler.Worker worker) {
                this.a = singleSubscriber;
                this.b = worker;
            }

            @Override // rx.functions.Action0
            public void call() {
                C1225a c1225a = new C1225a();
                this.a.add(c1225a);
                Single.this.subscribe(c1225a);
            }
        }

        public d(Scheduler scheduler) {
            this.a = scheduler;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            Scheduler.Worker workerCreateWorker = this.a.createWorker();
            singleSubscriber.add(workerCreateWorker);
            workerCreateWorker.schedule(new a(singleSubscriber, workerCreateWorker));
        }
    }

    public class e implements Func0<Single<T>> {
        public e() {
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Single<T> call() {
            return Single.error(new TimeoutException());
        }
    }

    public class f implements Action1<Throwable> {
        public final /* synthetic */ Action1 a;

        public f(Action1 action1) {
            this.a = action1;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            this.a.call(th);
        }
    }

    public class g implements Action1<T> {
        public final /* synthetic */ Action1 a;

        public g(Action1 action1) {
            this.a = action1;
        }

        @Override // rx.functions.Action1
        public void call(T t) {
            this.a.call(Notification.createOnNext(t));
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

    public static class i implements OnSubscribe<T> {
        public final /* synthetic */ Callable a;

        public i(Callable callable) {
            this.a = callable;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            try {
                ((Single) this.a.call()).subscribe(singleSubscriber);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                singleSubscriber.onError(th);
            }
        }
    }

    public class j implements OnSubscribe<T> {
        public final /* synthetic */ Scheduler a;

        public class a extends SingleSubscriber<T> {
            public final /* synthetic */ SingleSubscriber b;

            public a(SingleSubscriber singleSubscriber) {
                this.b = singleSubscriber;
            }

            @Override // rx.SingleSubscriber
            public void onError(Throwable th) {
                this.b.onError(th);
            }

            @Override // rx.SingleSubscriber
            public void onSuccess(T t) {
                this.b.onSuccess(t);
            }
        }

        public class b implements Action0 {
            public final /* synthetic */ SingleSubscriber a;

            public class a implements Action0 {
                public final /* synthetic */ Scheduler.Worker a;

                public a(Scheduler.Worker worker) {
                    this.a = worker;
                }

                @Override // rx.functions.Action0
                public void call() {
                    try {
                        b.this.a.unsubscribe();
                    } finally {
                        this.a.unsubscribe();
                    }
                }
            }

            public b(SingleSubscriber singleSubscriber) {
                this.a = singleSubscriber;
            }

            @Override // rx.functions.Action0
            public void call() {
                Scheduler.Worker workerCreateWorker = j.this.a.createWorker();
                workerCreateWorker.schedule(new a(workerCreateWorker));
            }
        }

        public j(Scheduler scheduler) {
            this.a = scheduler;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            a aVar = new a(singleSubscriber);
            singleSubscriber.add(Subscriptions.create(new b(aVar)));
            Single.this.subscribe(aVar);
        }
    }

    public static class k implements OnSubscribe<T> {
        public final /* synthetic */ Throwable a;

        public k(Throwable th) {
            this.a = th;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            singleSubscriber.onError(this.a);
        }
    }

    public static class l implements OnSubscribe<T> {

        public class a extends SingleSubscriber<Single<? extends T>> {
            public final /* synthetic */ SingleSubscriber b;

            public a(SingleSubscriber singleSubscriber) {
                this.b = singleSubscriber;
            }

            @Override // rx.SingleSubscriber
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Single<? extends T> single) {
                single.subscribe(this.b);
            }

            @Override // rx.SingleSubscriber
            public void onError(Throwable th) {
                this.b.onError(th);
            }
        }

        public l() {
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(SingleSubscriber<? super T> singleSubscriber) {
            a aVar = new a(singleSubscriber);
            singleSubscriber.add(aVar);
            Single.this.subscribe(aVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class m<R> implements FuncN<R> {
        public final /* synthetic */ Func2 a;

        public m(Func2 func2) {
            this.a = func2;
        }

        @Override // rx.functions.FuncN
        public R call(Object... objArr) {
            return (R) this.a.call(objArr[0], objArr[1]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class n<R> implements FuncN<R> {
        public final /* synthetic */ Func3 a;

        public n(Func3 func3) {
            this.a = func3;
        }

        @Override // rx.functions.FuncN
        public R call(Object... objArr) {
            return (R) this.a.call(objArr[0], objArr[1], objArr[2]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class o<R> implements FuncN<R> {
        public final /* synthetic */ Func4 a;

        public o(Func4 func4) {
            this.a = func4;
        }

        @Override // rx.functions.FuncN
        public R call(Object... objArr) {
            return (R) this.a.call(objArr[0], objArr[1], objArr[2], objArr[3]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class p<R> implements FuncN<R> {
        public final /* synthetic */ Func5 a;

        public p(Func5 func5) {
            this.a = func5;
        }

        @Override // rx.functions.FuncN
        public R call(Object... objArr) {
            return (R) this.a.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class q<R> implements FuncN<R> {
        public final /* synthetic */ Func6 a;

        public q(Func6 func6) {
            this.a = func6;
        }

        @Override // rx.functions.FuncN
        public R call(Object... objArr) {
            return (R) this.a.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class r<R> implements FuncN<R> {
        public final /* synthetic */ Func7 a;

        public r(Func7 func7) {
            this.a = func7;
        }

        @Override // rx.functions.FuncN
        public R call(Object... objArr) {
            return (R) this.a.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static class s<R> implements FuncN<R> {
        public final /* synthetic */ Func8 a;

        public s(Func8 func8) {
            this.a = func8;
        }

        @Override // rx.functions.FuncN
        public R call(Object... objArr) {
            return (R) this.a.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
        }
    }

    public Single(OnSubscribe<T> onSubscribe) {
        this.a = RxJavaHooks.onCreate(onSubscribe);
    }

    private static <T> Observable<T> a(Single<T> single) {
        return Observable.unsafeCreate(new SingleToObservable(single.a));
    }

    public static <T> Single<? extends T>[] b(Iterable<? extends Single<? extends T>> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return (Single[]) collection.toArray(new Single[collection.size()]);
        }
        Single<? extends T>[] singleArr = new Single[8];
        int i2 = 0;
        for (Single<? extends T> single : iterable) {
            if (i2 == singleArr.length) {
                Single<? extends T>[] singleArr2 = new Single[(i2 >> 2) + i2];
                System.arraycopy(singleArr, 0, singleArr2, 0, i2);
                singleArr = singleArr2;
            }
            singleArr[i2] = single;
            i2++;
        }
        if (singleArr.length == i2) {
            return singleArr;
        }
        Single<? extends T>[] singleArr3 = new Single[i2];
        System.arraycopy(singleArr, 0, singleArr3, 0, i2);
        return singleArr3;
    }

    private Subscription c(Subscriber<? super T> subscriber, boolean z) {
        if (z) {
            try {
                subscriber.onStart();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                try {
                    subscriber.onError(RxJavaHooks.onSingleError(th));
                    return Subscriptions.unsubscribed();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                    RxJavaHooks.onSingleError(runtimeException);
                    throw runtimeException;
                }
            }
        }
        RxJavaHooks.onSingleStart(this, this.a).call(SingleLiftObservableOperator.wrap(subscriber));
        return RxJavaHooks.onSingleReturn(subscriber);
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2) {
        return Observable.concat(a(single), a(single2));
    }

    public static <T> Single<T> create(OnSubscribe<T> onSubscribe) {
        return new Single<>(onSubscribe);
    }

    public static <T> Single<T> defer(Callable<Single<T>> callable) {
        return create(new i(callable));
    }

    public static <T> Single<T> error(Throwable th) {
        return create(new k(th));
    }

    public static <T> Single<T> from(Future<? extends T> future) {
        return create(new SingleFromFuture(future, 0L, null));
    }

    public static <T> Single<T> fromCallable(Callable<? extends T> callable) {
        return create(new SingleFromCallable(callable));
    }

    public static <T> Single<T> fromEmitter(Action1<SingleEmitter<T>> action1) {
        Objects.requireNonNull(action1, "producer is null");
        return create(new SingleFromEmitter(action1));
    }

    public static <T> Single<T> just(T t) {
        return ScalarSynchronousSingle.create(t);
    }

    public static <T> Single<T> merge(Single<? extends Single<? extends T>> single) {
        return single instanceof ScalarSynchronousSingle ? ((ScalarSynchronousSingle) single).scalarFlatMap(UtilityFunctions.identity()) : create(new l());
    }

    public static <T> Observable<T> mergeDelayError(Observable<? extends Single<? extends T>> observable) {
        return merge(observable, Integer.MAX_VALUE);
    }

    public static <T, Resource> Single<T> using(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1) {
        return using(func0, func1, action1, false);
    }

    public static <T1, T2, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Func2<? super T1, ? super T2, ? extends R> func2) {
        return SingleOperatorZip.zip(new Single[]{single, single2}, new m(func2));
    }

    public final Single<T> cache() {
        return toObservable().cacheWithInitialCapacity(1).toSingle();
    }

    public <R> Single<R> compose(Transformer<? super T, ? extends R> transformer) {
        return (Single) transformer.call(this);
    }

    public final Observable<T> concatWith(Single<? extends T> single) {
        return concat(this, single);
    }

    public final Single<T> delay(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return create(new SingleDelay(this.a, j2, timeUnit, scheduler));
    }

    public final Single<T> delaySubscription(Observable<?> observable) {
        Objects.requireNonNull(observable);
        return create(new SingleOnSubscribeDelaySubscriptionOther(this, observable));
    }

    public final Single<T> doAfterTerminate(Action0 action0) {
        return create(new SingleDoAfterTerminate(this, action0));
    }

    public final Single<T> doOnEach(Action1<Notification<? extends T>> action1) {
        if (action1 != null) {
            return create(new SingleDoOnEvent(this, new g(action1), new h(action1)));
        }
        throw new IllegalArgumentException("onNotification is null");
    }

    public final Single<T> doOnError(Action1<Throwable> action1) {
        if (action1 != null) {
            return create(new SingleDoOnEvent(this, Actions.empty(), new f(action1)));
        }
        throw new IllegalArgumentException("onError is null");
    }

    public final Single<T> doOnSubscribe(Action0 action0) {
        return create(new SingleDoOnSubscribe(this.a, action0));
    }

    public final Single<T> doOnSuccess(Action1<? super T> action1) {
        if (action1 != null) {
            return create(new SingleDoOnEvent(this, action1, Actions.empty()));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    public final Single<T> doOnUnsubscribe(Action0 action0) {
        return create(new SingleDoOnUnsubscribe(this.a, action0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Single<R> flatMap(Func1<? super T, ? extends Single<? extends R>> func1) {
        return this instanceof ScalarSynchronousSingle ? ((ScalarSynchronousSingle) this).scalarFlatMap(func1) : merge(map(func1));
    }

    public final Completable flatMapCompletable(Func1<? super T, ? extends Completable> func1) {
        return Completable.create(new CompletableFlatMapSingleToCompletable(this, func1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable<R> flatMapObservable(Func1<? super T, ? extends Observable<? extends R>> func1) {
        return Observable.merge(a(map(func1)));
    }

    public final <R> Single<R> lift(Observable.Operator<? extends R, ? super T> operator) {
        return create(new SingleLiftObservableOperator(this.a, operator));
    }

    public final <R> Single<R> map(Func1<? super T, ? extends R> func1) {
        return create(new SingleOnSubscribeMap(this, func1));
    }

    public final Observable<T> mergeWith(Single<? extends T> single) {
        return merge(this, single);
    }

    public final Single<T> observeOn(Scheduler scheduler) {
        if (this instanceof ScalarSynchronousSingle) {
            return ((ScalarSynchronousSingle) this).scalarScheduleOn(scheduler);
        }
        Objects.requireNonNull(scheduler, "scheduler is null");
        return create(new SingleObserveOn(this.a, scheduler));
    }

    public final Single<T> onErrorResumeNext(Single<? extends T> single) {
        return new Single<>(SingleOperatorOnErrorResumeNext.withOther(this, single));
    }

    public final Single<T> onErrorReturn(Func1<Throwable, ? extends T> func1) {
        return create(new SingleOnErrorReturn(this.a, func1));
    }

    public final Single<T> retry() {
        return toObservable().retry().toSingle();
    }

    public final Single<T> retryWhen(Func1<Observable<? extends Throwable>, ? extends Observable<?>> func1) {
        return toObservable().retryWhen(func1).toSingle();
    }

    public final Subscription subscribe() {
        return subscribe(Actions.empty(), Actions.errorNotImplemented());
    }

    public final Single<T> subscribeOn(Scheduler scheduler) {
        return this instanceof ScalarSynchronousSingle ? ((ScalarSynchronousSingle) this).scalarScheduleOn(scheduler) : create(new d(scheduler));
    }

    public final Single<T> takeUntil(Completable completable) {
        return create(new SingleTakeUntilCompletable(this.a, completable));
    }

    public final AssertableSubscriber<T> test() {
        AssertableSubscriberObservable assertableSubscriberObservableCreate = AssertableSubscriberObservable.create(Long.MAX_VALUE);
        subscribe((Subscriber) assertableSubscriberObservableCreate);
        return assertableSubscriberObservableCreate;
    }

    public final Single<T> timeout(long j2, TimeUnit timeUnit) {
        return timeout(j2, timeUnit, null, Schedulers.computation());
    }

    public final <R> R to(Func1<? super Single<T>, R> func1) {
        return func1.call(this);
    }

    public final BlockingSingle<T> toBlocking() {
        return BlockingSingle.from(this);
    }

    public final Completable toCompletable() {
        return Completable.fromSingle(this);
    }

    public final Observable<T> toObservable() {
        return a(this);
    }

    public final Subscription unsafeSubscribe(Subscriber<? super T> subscriber) {
        return c(subscriber, true);
    }

    @Experimental
    public final Single<T> unsubscribeOn(Scheduler scheduler) {
        return create(new j(scheduler));
    }

    public final <T2, R> Single<R> zipWith(Single<? extends T2> single, Func2<? super T, ? super T2, ? extends R> func2) {
        return zip(this, single, func2);
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3) {
        return Observable.concat(a(single), a(single2), a(single3));
    }

    public static <T> Single<T> from(Future<? extends T> future, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit, "unit is null");
        return create(new SingleFromFuture(future, j2, timeUnit));
    }

    public static <T> Observable<T> mergeDelayError(Observable<? extends Single<? extends T>> observable, int i2) {
        return (Observable<T>) observable.flatMapSingle(UtilityFunctions.identity(), true, i2);
    }

    public static <T, Resource> Single<T> using(Func0<Resource> func0, Func1<? super Resource, ? extends Single<? extends T>> func1, Action1<? super Resource> action1, boolean z) {
        Objects.requireNonNull(func0, "resourceFactory is null");
        Objects.requireNonNull(func1, "singleFactory is null");
        Objects.requireNonNull(action1, "disposeAction is null");
        return create(new SingleOnSubscribeUsing(func0, func1, action1, z));
    }

    public static <T1, T2, T3, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Func3<? super T1, ? super T2, ? super T3, ? extends R> func3) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3}, new n(func3));
    }

    public final Single<T> delay(long j2, TimeUnit timeUnit) {
        return delay(j2, timeUnit, Schedulers.computation());
    }

    public final Single<T> onErrorResumeNext(Func1<Throwable, ? extends Single<? extends T>> func1) {
        return new Single<>(SingleOperatorOnErrorResumeNext.withFunction(this, func1));
    }

    public final Single<T> retry(long j2) {
        return toObservable().retry(j2).toSingle();
    }

    public final Subscription subscribe(Action1<? super T> action1) {
        return subscribe(action1, Actions.errorNotImplemented());
    }

    public final <E> Single<T> takeUntil(Observable<? extends E> observable) {
        return create(new SingleTakeUntilObservable(this.a, observable));
    }

    public final Single<T> timeout(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout(j2, timeUnit, null, scheduler);
    }

    @Deprecated
    public Single(Observable.OnSubscribe<T> onSubscribe) {
        this.a = RxJavaHooks.onCreate(new SingleFromObservable(onSubscribe));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4) {
        return Observable.concat(a(single), a(single2), a(single3), a(single4));
    }

    public static <T1, T2, T3, T4, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Func4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func4) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4}, new o(func4));
    }

    public final Single<T> retry(Func2<Integer, Throwable, Boolean> func2) {
        return toObservable().retry(func2).toSingle();
    }

    public final Subscription subscribe(Action1<? super T> action1, Action1<Throwable> action2) {
        if (action1 == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        }
        if (action2 != null) {
            return subscribe(new b(action2, action1));
        }
        throw new IllegalArgumentException("onError can not be null");
    }

    public final <E> Single<T> takeUntil(Single<? extends E> single) {
        return create(new SingleTakeUntilSingle(this.a, single));
    }

    public final Single<T> timeout(long j2, TimeUnit timeUnit, Single<? extends T> single) {
        return timeout(j2, timeUnit, single, Schedulers.computation());
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5) {
        return Observable.concat(a(single), a(single2), a(single3), a(single4), a(single5));
    }

    public static <T> Single<T> from(Future<? extends T> future, Scheduler scheduler) {
        return from(future).subscribeOn(scheduler);
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2) {
        return Observable.merge(a(single), a(single2));
    }

    public static <T1, T2, T3, T4, T5, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Func5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> func5) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5}, new p(func5));
    }

    public final Single<T> timeout(long j2, TimeUnit timeUnit, Single<? extends T> single, Scheduler scheduler) {
        if (single == null) {
            single = defer(new e());
        }
        return create(new SingleTimeout(this.a, j2, timeUnit, scheduler, single.a));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6) {
        return Observable.concat(a(single), a(single2), a(single3), a(single4), a(single5), a(single6));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3) {
        return Observable.merge(a(single), a(single2), a(single3));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Func6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> func6) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6}, new q(func6));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7) {
        return Observable.concat(a(single), a(single2), a(single3), a(single4), a(single5), a(single6), a(single7));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4) {
        return Observable.merge(a(single), a(single2), a(single3), a(single4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Single<? extends T7> single7, Func7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> func7) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6, single7}, new r(func7));
    }

    public final Subscription subscribe(Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        return subscribe(new c(observer));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8) {
        return Observable.concat(a(single), a(single2), a(single3), a(single4), a(single5), a(single6), a(single7), a(single8));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5) {
        return Observable.merge(a(single), a(single2), a(single3), a(single4), a(single5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Single<? extends T7> single7, Single<? extends T8> single8, Func8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> func8) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6, single7, single8}, new s(func8));
    }

    public static <T> Observable<T> concat(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8, Single<? extends T> single9) {
        return Observable.concat(a(single), a(single2), a(single3), a(single4), a(single5), a(single6), a(single7), a(single8), a(single9));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6) {
        return Observable.merge(a(single), a(single2), a(single3), a(single4), a(single5), a(single6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Single<R> zip(Single<? extends T1> single, Single<? extends T2> single2, Single<? extends T3> single3, Single<? extends T4> single4, Single<? extends T5> single5, Single<? extends T6> single6, Single<? extends T7> single7, Single<? extends T8> single8, Single<? extends T9> single9, Func9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> func9) {
        return SingleOperatorZip.zip(new Single[]{single, single2, single3, single4, single5, single6, single7, single8, single9}, new a(func9));
    }

    public final Subscription subscribe(Subscriber<? super T> subscriber) {
        if (subscriber != null) {
            subscriber.onStart();
            if (!(subscriber instanceof SafeSubscriber)) {
                return c(new SafeSubscriber(subscriber), false);
            }
            return c(subscriber, true);
        }
        throw new IllegalArgumentException("observer can not be null");
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7) {
        return Observable.merge(a(single), a(single2), a(single3), a(single4), a(single5), a(single6), a(single7));
    }

    public static <R> Single<R> zip(Iterable<? extends Single<?>> iterable, FuncN<? extends R> funcN) {
        return SingleOperatorZip.zip(b(iterable), funcN);
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8) {
        return Observable.merge(a(single), a(single2), a(single3), a(single4), a(single5), a(single6), a(single7), a(single8));
    }

    public static <T> Observable<T> merge(Single<? extends T> single, Single<? extends T> single2, Single<? extends T> single3, Single<? extends T> single4, Single<? extends T> single5, Single<? extends T> single6, Single<? extends T> single7, Single<? extends T> single8, Single<? extends T> single9) {
        return Observable.merge(a(single), a(single2), a(single3), a(single4), a(single5), a(single6), a(single7), a(single8), a(single9));
    }

    public static <T> Observable<T> merge(Observable<? extends Single<? extends T>> observable) {
        return merge(observable, Integer.MAX_VALUE);
    }

    public static <T> Observable<T> merge(Observable<? extends Single<? extends T>> observable, int i2) {
        return (Observable<T>) observable.flatMapSingle(UtilityFunctions.identity(), false, i2);
    }

    public final Subscription subscribe(SingleSubscriber<? super T> singleSubscriber) {
        if (singleSubscriber != null) {
            try {
                RxJavaHooks.onSingleStart(this, this.a).call(singleSubscriber);
                return RxJavaHooks.onSingleReturn(singleSubscriber);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                try {
                    singleSubscriber.onError(RxJavaHooks.onSingleError(th));
                    return Subscriptions.empty();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th2);
                    RxJavaHooks.onSingleError(runtimeException);
                    throw runtimeException;
                }
            }
        }
        throw new IllegalArgumentException("te is null");
    }
}
