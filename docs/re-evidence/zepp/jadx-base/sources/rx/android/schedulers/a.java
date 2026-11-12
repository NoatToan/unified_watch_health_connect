package rx.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscription;
import rx.android.plugins.RxAndroidPlugins;
import rx.android.plugins.RxAndroidSchedulersHook;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.plugins.RxJavaPlugins;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
class a extends Scheduler {
    private final Handler a;

    public static final class b implements Runnable, Subscription {
        private final Action0 a;
        private final Handler b;
        private volatile boolean c;

        public b(Action0 action0, Handler handler) {
            this.a = action0;
            this.b = handler;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.call();
            } catch (Throwable th) {
                IllegalStateException illegalStateException = th instanceof OnErrorNotImplementedException ? new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th) : new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
                RxJavaPlugins.getInstance().getErrorHandler().handleError(illegalStateException);
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, illegalStateException);
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.c = true;
            this.b.removeCallbacks(this);
        }
    }

    public a(Looper looper) {
        this.a = new Handler(looper);
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new C1226a(this.a);
    }

    public a(Handler handler) {
        this.a = handler;
    }

    /* JADX INFO: renamed from: rx.android.schedulers.a$a, reason: collision with other inner class name */
    public static class C1226a extends Scheduler.Worker {
        private final Handler a;
        private final RxAndroidSchedulersHook b = RxAndroidPlugins.getInstance().getSchedulersHook();
        private volatile boolean c;

        public C1226a(Handler handler) {
            this.a = handler;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.c;
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            if (this.c) {
                return Subscriptions.unsubscribed();
            }
            b bVar = new b(this.b.onSchedule(action0), this.a);
            Message messageObtain = Message.obtain(this.a, bVar);
            messageObtain.obj = this;
            this.a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.c) {
                return bVar;
            }
            this.a.removeCallbacks(bVar);
            return Subscriptions.unsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.c = true;
            this.a.removeCallbacksAndMessages(this);
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return schedule(action0, 0L, TimeUnit.MILLISECONDS);
        }
    }
}
