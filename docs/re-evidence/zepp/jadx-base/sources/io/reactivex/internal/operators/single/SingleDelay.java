package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public final class SingleDelay<T> extends Single<T> {
    public final SingleSource<? extends T> a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;

    public final class a implements SingleObserver<T> {
        private final SequentialDisposable a;
        public final SingleObserver<? super T> b;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.single.SingleDelay$a$a, reason: collision with other inner class name */
        public final class RunnableC1150a implements Runnable {
            private final Throwable a;

            public RunnableC1150a(Throwable th) {
                this.a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onError(this.a);
            }
        }

        public final class b implements Runnable {
            private final T a;

            public b(T t) {
                this.a = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.onSuccess(this.a);
            }
        }

        public a(SequentialDisposable sequentialDisposable, SingleObserver<? super T> singleObserver) {
            this.a = sequentialDisposable;
            this.b = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            SequentialDisposable sequentialDisposable = this.a;
            Scheduler scheduler = SingleDelay.this.d;
            RunnableC1150a runnableC1150a = new RunnableC1150a(th);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(runnableC1150a, singleDelay.e ? singleDelay.b : 0L, singleDelay.c));
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.a.replace(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            SequentialDisposable sequentialDisposable = this.a;
            Scheduler scheduler = SingleDelay.this.d;
            b bVar = new b(t);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(bVar, singleDelay.b, singleDelay.c));
        }
    }

    public SingleDelay(SingleSource<? extends T> singleSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.a = singleSource;
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = z;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.a.subscribe(new a(sequentialDisposable, singleObserver));
    }
}
