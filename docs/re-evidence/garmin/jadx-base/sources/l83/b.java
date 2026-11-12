package l83;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j83.h;
import j83.o;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.OnErrorNotImplementedException;
import v83.v;
import y83.d;

/* JADX INFO: loaded from: classes11.dex */
public class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f111502a;

    public static class a extends h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f111503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k83.b f111504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f111505c;

        public a(Handler handler) {
            this.f111503a = handler;
            AtomicReference<k83.b> atomicReference = k83.a.f103403b.f103404a;
            if (atomicReference.get() == null) {
                k83.b bVar = k83.b.f103405a;
                while (!atomicReference.compareAndSet(null, bVar) && atomicReference.get() == null) {
                }
            }
            this.f111504b = atomicReference.get();
        }

        @Override // j83.h.a
        public final o a(n83.a aVar) {
            if (this.f111505c) {
                return d.f195249a;
            }
            this.f111504b.getClass();
            RunnableC2131b runnableC2131b = new RunnableC2131b(aVar, this.f111503a);
            Message messageObtain = Message.obtain(this.f111503a, runnableC2131b);
            messageObtain.obj = this;
            this.f111503a.sendMessageDelayed(messageObtain, 0L);
            if (!this.f111505c) {
                return runnableC2131b;
            }
            this.f111503a.removeCallbacks(runnableC2131b);
            return d.f195249a;
        }

        @Override // j83.o
        public final boolean e() {
            return this.f111505c;
        }

        @Override // j83.o
        public final void f() {
            this.f111505c = true;
            this.f111503a.removeCallbacksAndMessages(this);
        }
    }

    /* JADX INFO: renamed from: l83.b$b, reason: collision with other inner class name */
    public static final class RunnableC2131b implements Runnable, o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n83.a f111506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f111507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f111508c;

        public RunnableC2131b(n83.a aVar, Handler handler) {
            this.f111506a = aVar;
            this.f111507b = handler;
        }

        @Override // j83.o
        public final boolean e() {
            return this.f111508c;
        }

        @Override // j83.o
        public final void f() {
            this.f111508c = true;
            this.f111507b.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f111506a.d();
            } catch (Throwable th3) {
                IllegalStateException illegalStateException = th3 instanceof OnErrorNotImplementedException ? new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th3) : new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th3);
                v.f176271f.b().getClass();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, illegalStateException);
            }
        }
    }

    public b(Looper looper) {
        this.f111502a = new Handler(looper);
    }

    @Override // j83.h
    public final h.a createWorker() {
        return new a(this.f111502a);
    }

    public b(Handler handler) {
        this.f111502a = handler;
    }
}
