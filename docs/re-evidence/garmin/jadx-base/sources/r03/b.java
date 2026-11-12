package r03;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import j20.x;
import java.util.concurrent.TimeUnit;
import q03.q;
import v03.d;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f148955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f148956c;

    public static final class a extends q.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f148957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f148958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f148959c;

        public a(Handler handler, boolean z14) {
            this.f148957a = handler;
            this.f148958b = z14;
        }

        @Override // s03.b
        public final boolean b() {
            return this.f148959c;
        }

        @Override // q03.q.b
        @SuppressLint({"NewApi"})
        public final s03.b c(Runnable runnable, long j8, TimeUnit timeUnit) {
            if (timeUnit == null) {
                x.l("unit == null");
                return null;
            }
            if (this.f148959c) {
                return d.INSTANCE;
            }
            int i14 = w03.b.f181178a;
            RunnableC2810b runnableC2810b = new RunnableC2810b(this.f148957a, runnable);
            Message messageObtain = Message.obtain(this.f148957a, runnableC2810b);
            messageObtain.obj = this;
            if (this.f148958b) {
                messageObtain.setAsynchronous(true);
            }
            this.f148957a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j8));
            if (!this.f148959c) {
                return runnableC2810b;
            }
            this.f148957a.removeCallbacks(runnableC2810b);
            return d.INSTANCE;
        }

        @Override // s03.b
        public final void dispose() {
            this.f148959c = true;
            this.f148957a.removeCallbacksAndMessages(this);
        }
    }

    /* JADX INFO: renamed from: r03.b$b, reason: collision with other inner class name */
    public static final class RunnableC2810b implements Runnable, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f148960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f148961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f148962c;

        public RunnableC2810b(Handler handler, Runnable runnable) {
            this.f148960a = handler;
            this.f148961b = runnable;
        }

        @Override // s03.b
        public final boolean b() {
            return this.f148962c;
        }

        @Override // s03.b
        public final void dispose() {
            this.f148960a.removeCallbacks(this);
            this.f148962c = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f148961b.run();
            } catch (Throwable th3) {
                k13.a.b(th3);
            }
        }
    }

    public b(Handler handler, boolean z14) {
        this.f148955b = handler;
        this.f148956c = z14;
    }

    @Override // q03.q
    public final q.b a() {
        return new a(this.f148955b, this.f148956c);
    }

    @Override // q03.q
    @SuppressLint({"NewApi"})
    public final s03.b c(Runnable runnable, long j8, TimeUnit timeUnit) {
        if (timeUnit == null) {
            x.l("unit == null");
            return null;
        }
        int i14 = w03.b.f181178a;
        Handler handler = this.f148955b;
        RunnableC2810b runnableC2810b = new RunnableC2810b(handler, runnable);
        Message messageObtain = Message.obtain(handler, runnableC2810b);
        if (this.f148956c) {
            messageObtain.setAsynchronous(true);
        }
        handler.sendMessageDelayed(messageObtain, timeUnit.toMillis(j8));
        return runnableC2810b;
    }
}
