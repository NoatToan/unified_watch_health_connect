package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Message;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
final class a extends Scheduler {
    private final Handler b;

    /* JADX INFO: renamed from: io.reactivex.android.schedulers.a$a, reason: collision with other inner class name */
    public static final class C1089a extends Scheduler.Worker {
        private final Handler a;
        private volatile boolean b;

        public C1089a(Handler handler) {
            this.a = handler;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.b = true;
            this.a.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.b;
        }

        @Override // io.reactivex.Scheduler.Worker
        public Disposable schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.b) {
                return Disposables.disposed();
            }
            b bVar = new b(this.a, RxJavaPlugins.onSchedule(runnable));
            Message messageObtain = Message.obtain(this.a, bVar);
            messageObtain.obj = this;
            this.a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.b) {
                return bVar;
            }
            this.a.removeCallbacks(bVar);
            return Disposables.disposed();
        }
    }

    public static final class b implements Runnable, Disposable {
        private final Handler a;
        private final Runnable b;
        private volatile boolean c;

        public b(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.c = true;
            this.a.removeCallbacks(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.run();
            } catch (Throwable th) {
                RxJavaPlugins.onError(th);
            }
        }
    }

    public a(Handler handler) {
        this.b = handler;
    }

    @Override // io.reactivex.Scheduler
    public Scheduler.Worker createWorker() {
        return new C1089a(this.b);
    }

    @Override // io.reactivex.Scheduler
    public Disposable scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        b bVar = new b(this.b, RxJavaPlugins.onSchedule(runnable));
        this.b.postDelayed(bVar, timeUnit.toMillis(j));
        return bVar;
    }
}
