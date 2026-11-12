package io.reactivex.internal.operators.observable;

import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.observables.ConnectableObservable;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public final class ObservableInternalHelper {

    public static final class a<T> implements Callable<ConnectableObservable<T>> {
        private final Observable<T> a;
        private final int b;

        public a(Observable<T> observable, int i) {
            this.a = observable;
            this.b = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectableObservable<T> call() {
            return this.a.replay(this.b);
        }
    }

    public static final class b<T> implements Callable<ConnectableObservable<T>> {
        private final Observable<T> a;
        private final int b;
        private final long c;
        private final TimeUnit d;
        private final Scheduler e;

        public b(Observable<T> observable, int i, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.a = observable;
            this.b = i;
            this.c = j;
            this.d = timeUnit;
            this.e = scheduler;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectableObservable<T> call() {
            return this.a.replay(this.b, this.c, this.d, this.e);
        }
    }

    public static final class c<T, U> implements Function<T, ObservableSource<U>> {
        private final Function<? super T, ? extends Iterable<? extends U>> a;

        public c(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.a = function;
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableSource<U> apply(T t) throws Exception {
            return new ObservableFromIterable((Iterable) ObjectHelper.requireNonNull(this.a.apply(t), "The mapper returned a null Iterable"));
        }
    }

    public static final class d<U, R, T> implements Function<U, R> {
        private final BiFunction<? super T, ? super U, ? extends R> a;
        private final T b;

        public d(BiFunction<? super T, ? super U, ? extends R> biFunction, T t) {
            this.a = biFunction;
            this.b = t;
        }

        @Override // io.reactivex.functions.Function
        public R apply(U u) throws Exception {
            return this.a.apply(this.b, u);
        }
    }

    public static final class e<T, R, U> implements Function<T, ObservableSource<R>> {
        private final BiFunction<? super T, ? super U, ? extends R> a;
        private final Function<? super T, ? extends ObservableSource<? extends U>> b;

        public e(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends ObservableSource<? extends U>> function) {
            this.a = biFunction;
            this.b = function;
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableSource<R> apply(T t) throws Exception {
            return new ObservableMap((ObservableSource) ObjectHelper.requireNonNull(this.b.apply(t), "The mapper returned a null ObservableSource"), new d(this.a, t));
        }
    }

    public static final class f<T, U> implements Function<T, ObservableSource<T>> {
        public final Function<? super T, ? extends ObservableSource<U>> a;

        public f(Function<? super T, ? extends ObservableSource<U>> function) {
            this.a = function;
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableSource<T> apply(T t) throws Exception {
            return new ObservableTake((ObservableSource) ObjectHelper.requireNonNull(this.a.apply(t), "The itemDelay returned a null ObservableSource"), 1L).map(Functions.justFunction(t)).defaultIfEmpty(t);
        }
    }

    public enum g implements Function<Object, Object> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            return 0;
        }
    }

    public static final class h<T> implements Action {
        public final Observer<T> a;

        public h(Observer<T> observer) {
            this.a = observer;
        }

        @Override // io.reactivex.functions.Action
        public void run() throws Exception {
            this.a.onComplete();
        }
    }

    public static final class i<T> implements Consumer<Throwable> {
        public final Observer<T> a;

        public i(Observer<T> observer) {
            this.a = observer;
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) throws Exception {
            this.a.onError(th);
        }
    }

    public static final class j<T> implements Consumer<T> {
        public final Observer<T> a;

        public j(Observer<T> observer) {
            this.a = observer;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t) throws Exception {
            this.a.onNext(t);
        }
    }

    public static final class k<T> implements Callable<ConnectableObservable<T>> {
        private final Observable<T> a;

        public k(Observable<T> observable) {
            this.a = observable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectableObservable<T> call() {
            return this.a.replay();
        }
    }

    public static final class l<T, R> implements Function<Observable<T>, ObservableSource<R>> {
        private final Function<? super Observable<T>, ? extends ObservableSource<R>> a;
        private final Scheduler b;

        public l(Function<? super Observable<T>, ? extends ObservableSource<R>> function, Scheduler scheduler) {
            this.a = function;
            this.b = scheduler;
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableSource<R> apply(Observable<T> observable) throws Exception {
            return Observable.wrap((ObservableSource) ObjectHelper.requireNonNull(this.a.apply(observable), "The selector returned a null ObservableSource")).observeOn(this.b);
        }
    }

    public static final class m<T, S> implements BiFunction<S, Emitter<T>, S> {
        public final BiConsumer<S, Emitter<T>> a;

        public m(BiConsumer<S, Emitter<T>> biConsumer) {
            this.a = biConsumer;
        }

        @Override // io.reactivex.functions.BiFunction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s, Emitter<T> emitter) throws Exception {
            this.a.accept(s, emitter);
            return s;
        }
    }

    public static final class n<T, S> implements BiFunction<S, Emitter<T>, S> {
        public final Consumer<Emitter<T>> a;

        public n(Consumer<Emitter<T>> consumer) {
            this.a = consumer;
        }

        @Override // io.reactivex.functions.BiFunction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public S apply(S s, Emitter<T> emitter) throws Exception {
            this.a.accept(emitter);
            return s;
        }
    }

    public static final class o<T> implements Callable<ConnectableObservable<T>> {
        private final Observable<T> a;
        private final long b;
        private final TimeUnit c;
        private final Scheduler d;

        public o(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
            this.a = observable;
            this.b = j;
            this.c = timeUnit;
            this.d = scheduler;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectableObservable<T> call() {
            return this.a.replay(this.b, this.c, this.d);
        }
    }

    public static final class p<T, R> implements Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> {
        private final Function<? super Object[], ? extends R> a;

        public p(Function<? super Object[], ? extends R> function) {
            this.a = function;
        }

        @Override // io.reactivex.functions.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableSource<? extends R> apply(List<ObservableSource<? extends T>> list) {
            return Observable.zipIterable(list, this.a, false, Observable.bufferSize());
        }
    }

    private ObservableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Function<T, ObservableSource<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new c(function);
    }

    public static <T, U, R> Function<T, ObservableSource<R>> flatMapWithCombiner(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new e(biFunction, function);
    }

    public static <T, U> Function<T, ObservableSource<T>> itemDelay(Function<? super T, ? extends ObservableSource<U>> function) {
        return new f(function);
    }

    public static <T> Action observerOnComplete(Observer<T> observer) {
        return new h(observer);
    }

    public static <T> Consumer<Throwable> observerOnError(Observer<T> observer) {
        return new i(observer);
    }

    public static <T> Consumer<T> observerOnNext(Observer<T> observer) {
        return new j(observer);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable) {
        return new k(observable);
    }

    public static <T, R> Function<Observable<T>, ObservableSource<R>> replayFunction(Function<? super Observable<T>, ? extends ObservableSource<R>> function, Scheduler scheduler) {
        return new l(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new m(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new n(consumer);
    }

    public static <T, R> Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> zipIterable(Function<? super Object[], ? extends R> function) {
        return new p(function);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, int i2) {
        return new a(observable, i2);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, int i2, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return new b(observable, i2, j2, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableObservable<T>> replayCallable(Observable<T> observable, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return new o(observable, j2, timeUnit, scheduler);
    }
}
