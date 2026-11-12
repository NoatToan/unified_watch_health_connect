package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableDebounceTimed<T> extends AbstractObservableWithUpstream<T, T> {
    final Consumer<? super T> onDropped;
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    public ObservableDebounceTimed(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler, Consumer<? super T> consumer) {
        super(observableSource);
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.onDropped = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new DebounceTimedObserver(new SerializedObserver(observer), this.timeout, this.unit, this.scheduler.createWorker(), this.onDropped));
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class DebounceTimedObserver<T> implements Observer<T>, Disposable {
        boolean done;
        final Observer<? super T> downstream;
        volatile long index;
        final Consumer<? super T> onDropped;
        final long timeout;
        DebounceEmitter<T> timer;
        final TimeUnit unit;
        Disposable upstream;
        final Scheduler.Worker worker;

        DebounceTimedObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, Scheduler.Worker worker, Consumer<? super T> consumer) {
            this.downstream = observer;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker;
            this.onDropped = consumer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            long j = this.index + 1;
            this.index = j;
            DebounceEmitter<T> debounceEmitter = this.timer;
            if (debounceEmitter != null) {
                debounceEmitter.dispose();
            }
            Consumer<? super T> consumer = this.onDropped;
            if (consumer != null && debounceEmitter != null) {
                try {
                    consumer.accept(this.timer.value);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.dispose();
                    this.downstream.onError(th);
                    this.done = true;
                }
            }
            DebounceEmitter<T> debounceEmitter2 = new DebounceEmitter<>(t, j, this);
            this.timer = debounceEmitter2;
            debounceEmitter2.setResource(this.worker.schedule(debounceEmitter2, this.timeout, this.unit));
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            DebounceEmitter<T> debounceEmitter = this.timer;
            if (debounceEmitter != null) {
                debounceEmitter.dispose();
            }
            this.done = true;
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            DebounceEmitter<T> debounceEmitter = this.timer;
            if (debounceEmitter != null) {
                debounceEmitter.dispose();
            }
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.worker.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.worker.isDisposed();
        }

        void emit(long j, T t, DebounceEmitter<T> debounceEmitter) {
            if (j == this.index) {
                this.downstream.onNext(t);
                debounceEmitter.dispose();
            }
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final DebounceTimedObserver<T> parent;
        final T value;

        DebounceEmitter(T t, long j, DebounceTimedObserver<T> debounceTimedObserver) {
            this.value = t;
            this.idx = j;
            this.parent = debounceTimedObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.emit(this.idx, this.value, this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }
}
