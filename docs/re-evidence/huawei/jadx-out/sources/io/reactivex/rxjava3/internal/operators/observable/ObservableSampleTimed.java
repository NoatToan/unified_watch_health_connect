package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableSampleTimed<T> extends AbstractObservableWithUpstream<T, T> {
    final boolean emitLast;
    final Consumer<? super T> onDropped;
    final long period;
    final Scheduler scheduler;
    final TimeUnit unit;

    public ObservableSampleTimed(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z, Consumer<? super T> consumer) {
        super(observableSource);
        this.period = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.emitLast = z;
        this.onDropped = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        if (this.emitLast) {
            this.source.subscribe(new SampleTimedEmitLast(serializedObserver, this.period, this.unit, this.scheduler, this.onDropped));
        } else {
            this.source.subscribe(new SampleTimedNoLast(serializedObserver, this.period, this.unit, this.scheduler, this.onDropped));
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final Observer<? super T> downstream;
        final Consumer<? super T> onDropped;
        final long period;
        final Scheduler scheduler;
        final AtomicReference<Disposable> timer = new AtomicReference<>();
        final TimeUnit unit;
        Disposable upstream;

        abstract void complete();

        SampleTimedObserver(Observer<? super T> observer, long j, TimeUnit timeUnit, Scheduler scheduler, Consumer<? super T> consumer) {
            this.downstream = observer;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.onDropped = consumer;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
                Scheduler scheduler = this.scheduler;
                long j = this.period;
                DisposableHelper.replace(this.timer, scheduler.schedulePeriodicallyDirect(this, j, j, this.unit));
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            Consumer<? super T> consumer;
            T andSet = getAndSet(t);
            if (andSet == null || (consumer = this.onDropped) == null) {
                return;
            }
            try {
                consumer.accept(andSet);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                cancelTimer();
                this.upstream.dispose();
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
            cancelTimer();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            cancelTimer();
            complete();
        }

        void cancelTimer() {
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            cancelTimer();
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onNext(andSet);
            }
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(Observer<? super T> observer, long j, TimeUnit timeUnit, Scheduler scheduler, Consumer<? super T> consumer) {
            super(observer, j, timeUnit, scheduler, consumer);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        void complete() {
            this.downstream.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            emit();
        }
    }

    /* JADX INFO: loaded from: classes46.dex */
    static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip;

        SampleTimedEmitLast(Observer<? super T> observer, long j, TimeUnit timeUnit, Scheduler scheduler, Consumer<? super T> consumer) {
            super(observer, j, timeUnit, scheduler, consumer);
            this.wip = new AtomicInteger(1);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        void complete() {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                emit();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }
    }
}
