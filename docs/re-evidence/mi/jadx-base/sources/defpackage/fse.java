package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: loaded from: classes3.dex */
public class fse extends ifl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f18153a;

    public static class a extends ifl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f18154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k5l f18155b = i5l.a().b();
        public volatile boolean c;

        public a(Handler handler) {
            this.f18154a = handler;
        }

        @Override // ifl.a
        public koo a(sc0 sc0Var) {
            return b(sc0Var, 0L, TimeUnit.MILLISECONDS);
        }

        public koo b(sc0 sc0Var, long j, TimeUnit timeUnit) {
            if (this.c) {
                return noo.b();
            }
            b bVar = new b(this.f18155b.c(sc0Var), this.f18154a);
            Message messageObtain = Message.obtain(this.f18154a, bVar);
            messageObtain.obj = this;
            this.f18154a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.c) {
                return bVar;
            }
            this.f18154a.removeCallbacks(bVar);
            return noo.b();
        }

        @Override // defpackage.koo
        public boolean isUnsubscribed() {
            return this.c;
        }

        @Override // defpackage.koo
        public void unsubscribe() {
            this.c = true;
            this.f18154a.removeCallbacksAndMessages(this);
        }
    }

    public static final class b implements Runnable, koo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sc0 f18156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f18157b;
        public volatile boolean c;

        public b(sc0 sc0Var, Handler handler) {
            this.f18156a = sc0Var;
            this.f18157b = handler;
        }

        @Override // defpackage.koo
        public boolean isUnsubscribed() {
            return this.c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f18156a.call();
            } catch (Throwable th) {
                IllegalStateException illegalStateException = th instanceof OnErrorNotImplementedException ? new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th) : new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th);
                s5l.c().b().a(illegalStateException);
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, illegalStateException);
            }
        }

        @Override // defpackage.koo
        public void unsubscribe() {
            this.c = true;
            this.f18157b.removeCallbacks(this);
        }
    }

    public fse(Looper looper) {
        this.f18153a = new Handler(looper);
    }

    @Override // defpackage.ifl
    public ifl.a a() {
        return new a(this.f18153a);
    }
}
