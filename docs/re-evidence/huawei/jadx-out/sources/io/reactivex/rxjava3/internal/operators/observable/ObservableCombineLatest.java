package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableCombineLatest<T, R> extends Observable<R> {
    final int bufferSize;
    final Function<? super Object[], ? extends R> combiner;
    final boolean delayError;
    final ObservableSource<? extends T>[] sources;
    final Iterable<? extends ObservableSource<? extends T>> sourcesIterable;

    public ObservableCombineLatest(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.sources = observableSourceArr;
        this.sourcesIterable = iterable;
        this.combiner = function;
        this.bufferSize = i;
        this.delayError = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<? extends T>[] observableSourceArr = this.sources;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            try {
                length = 0;
                for (ObservableSource<? extends T> observableSource : this.sourcesIterable) {
                    if (length == observableSourceArr.length) {
                        ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                        System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                        observableSourceArr = observableSourceArr2;
                    }
                    observableSourceArr[length] = (ObservableSource) Objects.requireNonNull(observableSource, "The Iterator returned a null ObservableSource");
                    length++;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptyDisposable.error(th, observer);
                return;
            }
        } else {
            length = observableSourceArr.length;
        }
        int i = length;
        if (i == 0) {
            EmptyDisposable.complete(observer);
        } else {
            new LatestCoordinator(observer, this.combiner, i, this.bufferSize, this.delayError).subscribe(observableSourceArr);
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class LatestCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        volatile boolean cancelled;
        final Function<? super Object[], ? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final Observer<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        Object[] latest;
        final CombinerObserver<T, R>[] observers;
        final SpscLinkedArrayQueue<Object[]> queue;

        LatestCoordinator(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.downstream = observer;
            this.combiner = function;
            this.delayError = z;
            this.latest = new Object[i];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[i];
            for (int i3 = 0; i3 < i; i3++) {
                combinerObserverArr[i3] = new CombinerObserver<>(this, i3);
            }
            this.observers = combinerObserverArr;
            this.queue = new SpscLinkedArrayQueue<>(i2);
        }

        public void subscribe(ObservableSource<? extends T>[] observableSourceArr) {
            CombinerObserver<T, R>[] combinerObserverArr = this.observers;
            int length = combinerObserverArr.length;
            this.downstream.onSubscribe(this);
            for (int i = 0; i < length && !this.done && !this.cancelled; i++) {
                observableSourceArr[i].subscribe(combinerObserverArr[i]);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelSources();
            drain();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        void cancelSources() {
            for (CombinerObserver<T, R> combinerObserver : this.observers) {
                combinerObserver.dispose();
            }
        }

        void clear(SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            synchronized (this) {
                this.latest = null;
            }
            spscLinkedArrayQueue.clear();
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object[]> spscLinkedArrayQueue = this.queue;
            Observer<? super R> observer = this.downstream;
            boolean z = this.delayError;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (!z && this.errors.get() != null) {
                    cancelSources();
                    clear(spscLinkedArrayQueue);
                    this.errors.tryTerminateConsumer(observer);
                    return;
                }
                boolean z2 = this.done;
                Object[] objArrPoll = spscLinkedArrayQueue.poll();
                boolean z3 = objArrPoll == null;
                if (z2 && z3) {
                    clear(spscLinkedArrayQueue);
                    this.errors.tryTerminateConsumer(observer);
                    return;
                }
                if (!z3) {
                    try {
                        observer.onNext((Object) Objects.requireNonNull(this.combiner.apply(objArrPoll), "The combiner returned a null value"));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.errors.tryAddThrowableOrReport(th);
                        cancelSources();
                        clear(spscLinkedArrayQueue);
                        this.errors.tryTerminateConsumer(observer);
                        return;
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            clear(spscLinkedArrayQueue);
            this.errors.tryTerminateAndReport();
        }

        void innerNext(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i];
                int i2 = this.active;
                if (obj == null) {
                    i2++;
                    this.active = i2;
                }
                objArr[i] = t;
                if (i2 == objArr.length) {
                    this.queue.offer((Object[]) objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    drain();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0025 A[Catch: all -> 0x002b, TryCatch #0 {, blocks: (B:7:0x000d, B:9:0x0011, B:11:0x0013, B:16:0x001d, B:19:0x0027, B:18:0x0025), top: B:28:0x000d }] */
        void innerError(int i, Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.delayError) {
                    synchronized (this) {
                        Object[] objArr = this.latest;
                        if (objArr == null) {
                            return;
                        }
                        boolean z = objArr[i] == null;
                        if (!z) {
                            int i2 = this.complete + 1;
                            this.complete = i2;
                            if (i2 == objArr.length) {
                                this.done = true;
                            }
                        } else {
                            this.done = true;
                        }
                        if (z) {
                            cancelSources();
                        }
                    }
                } else {
                    cancelSources();
                }
                drain();
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0019 A[Catch: all -> 0x0025, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0007, B:12:0x0011, B:15:0x001b, B:14:0x0019), top: B:23:0x0001 }] */
        void innerComplete(int i) {
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr == null) {
                    return;
                }
                boolean z = objArr[i] == null;
                if (!z) {
                    int i2 = this.complete + 1;
                    this.complete = i2;
                    if (i2 == objArr.length) {
                        this.done = true;
                    }
                } else {
                    this.done = true;
                }
                if (z) {
                    cancelSources();
                }
                drain();
            }
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class CombinerObserver<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        final int index;
        final LatestCoordinator<T, R> parent;

        CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i) {
            this.parent = latestCoordinator;
            this.index = i;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            this.parent.innerNext(this.index, t);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
            this.parent.innerError(this.index, th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }
    }
}
