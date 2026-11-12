package com.huami.watch.util;

import androidx.annotation.NonNull;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.observers.SafeObserver;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class Rx {
    public static final Consumer<Throwable> SAFE_ON_ERROR = new b();
    public static final String TAG = "Rx";

    public static final class RxBuilder<T> {
        private Observable<T> a;

        public class a implements Function<Long, ObservableSource<T>> {
            public final /* synthetic */ Observable a;

            public a(Observable observable) {
                this.a = observable;
            }

            @Override // io.reactivex.functions.Function
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ObservableSource<T> apply(@NonNull Long l) throws Exception {
                return this.a;
            }
        }

        public /* synthetic */ RxBuilder(a aVar) {
            this();
        }

        public final RxBuilder<T> delay(long j, TimeUnit timeUnit) {
            this.a = this.a.delay(j, timeUnit).observeOn(AndroidSchedulers.mainThread());
            return this;
        }

        public RxBuilder<T> io(@NonNull ObservableOnSubscribe<T> observableOnSubscribe) {
            this.a = Observable.create(observableOnSubscribe).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            return this;
        }

        public Observable<T> observable() {
            return this.a;
        }

        public final Disposable safeSubscribe(@NonNull Consumer<? super T> consumer) {
            return this.a.subscribe(consumer, Rx.SAFE_ON_ERROR);
        }

        public final Disposable subscribe(@NonNull Consumer<? super T> consumer) {
            return this.a.subscribe(consumer);
        }

        public final RxBuilder<T> timer(long j, TimeUnit timeUnit) {
            this.a = (Observable<T>) Observable.timer(j, timeUnit).flatMap(new a(this.a));
            return this;
        }

        private RxBuilder() {
        }

        public final Disposable safeSubscribe(@NonNull Action action) {
            return this.a.subscribe(Functions.emptyConsumer(), Rx.SAFE_ON_ERROR, action);
        }

        public final Disposable subscribe(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2) {
            return this.a.subscribe(consumer, consumer2);
        }

        public final Disposable safeSubscribe(@NonNull Consumer<? super T> consumer, @NonNull Action action) {
            return this.a.subscribe(consumer, Rx.SAFE_ON_ERROR, action);
        }

        public final Disposable subscribe(@NonNull Action action) {
            return this.a.subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING, action);
        }

        public final void safeSubscribe(@NonNull Observer<? super T> observer) {
            this.a.safeSubscribe(observer);
        }

        public final Disposable subscribe(@NonNull Consumer<? super T> consumer, @NonNull Consumer<? super Throwable> consumer2, Action action) {
            return this.a.subscribe(consumer, consumer2, action);
        }

        public final void safeSubscribe() {
            this.a.safeSubscribe(Rx.b());
        }

        public final void subscribe(@NonNull Observer<? super T> observer) {
            this.a.subscribe(observer);
        }

        public final void subscribe() {
            this.a.subscribe();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements Observer<T> {
        public final /* synthetic */ Consumer a;

        public a(Consumer consumer) {
            this.a = consumer;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            Log.w("Rx", "OnErr", th, new Object[0]);
            Analytics.exception(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            Consumer consumer = this.a;
            if (consumer != null) {
                try {
                    consumer.accept(t);
                } catch (Exception e) {
                    Log.w("Rx", "OnNextErr", e, new Object[0]);
                    Analytics.exception(e);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }
    }

    public class b implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) {
            Log.w("Rx", "OnError", th, new Object[0]);
            Analytics.exception(th);
        }
    }

    public class c implements ObservableOnSubscribe<Void> {
        public final /* synthetic */ Runnable a;

        public c(Runnable runnable) {
            this.a = runnable;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<Void> observableEmitter) throws Exception {
            this.a.run();
            observableEmitter.onComplete();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class d<T> implements ObservableOnSubscribe<T> {
        public final /* synthetic */ Callable a;

        public d(Callable callable) {
            this.a = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<T> observableEmitter) throws Exception {
            observableEmitter.onNext(this.a.call());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> Observer<T> b() {
        return safeObserver(null);
    }

    public static void delayIo(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        Schedulers.io().scheduleDirect(runnable, j, timeUnit);
    }

    public static void delayMainThread(Runnable runnable, long j, TimeUnit timeUnit) {
        AndroidSchedulers.mainThread().scheduleDirect(runnable, j, timeUnit);
    }

    public static <T> RxBuilder<T> io(@NonNull ObservableOnSubscribe<T> observableOnSubscribe) {
        return new RxBuilder(null).io(observableOnSubscribe);
    }

    public static Disposable ioDirect(Runnable runnable) {
        return Schedulers.io().scheduleDirect(runnable);
    }

    public static void mainThread(Runnable runnable) {
        AndroidSchedulers.mainThread().scheduleDirect(runnable);
    }

    public static <T> Observer<T> safeObserver(Consumer<T> consumer) {
        return new SafeObserver(new a(consumer));
    }

    public static <T> Disposable delayMainThread(T t, Consumer<T> consumer, long j, TimeUnit timeUnit) {
        return Observable.just(t).delay(j, timeUnit).observeOn(AndroidSchedulers.mainThread()).subscribe(consumer);
    }

    public static RxBuilder<Void> io(@NonNull Runnable runnable) {
        return new RxBuilder(null).io(new c(runnable));
    }

    public static <T> RxBuilder<T> io(@NonNull Callable<T> callable) {
        return new RxBuilder(null).io(new d(callable));
    }
}
