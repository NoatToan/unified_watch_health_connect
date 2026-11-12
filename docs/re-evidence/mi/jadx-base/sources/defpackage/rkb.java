package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class rkb extends hfl {
    public final Handler c;
    public final boolean d;

    public static final class a extends hfl.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f32631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f32632b;
        public volatile boolean c;

        public a(Handler handler, boolean z) {
            this.f32631a = handler;
            this.f32632b = z;
        }

        @Override // hfl.c
        @SuppressLint({"NewApi"})
        public jz6 c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.c) {
                return nz6.a();
            }
            b bVar = new b(this.f32631a, t5l.r(runnable));
            Message messageObtain = Message.obtain(this.f32631a, bVar);
            messageObtain.obj = this;
            if (this.f32632b) {
                messageObtain.setAsynchronous(true);
            }
            this.f32631a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.c) {
                return bVar;
            }
            this.f32631a.removeCallbacks(bVar);
            return nz6.a();
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.c = true;
            this.f32631a.removeCallbacksAndMessages(this);
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.c;
        }
    }

    public static final class b implements Runnable, jz6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f32633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f32634b;
        public volatile boolean c;

        public b(Handler handler, Runnable runnable) {
            this.f32633a = handler;
            this.f32634b = runnable;
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.f32633a.removeCallbacks(this);
            this.c = true;
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f32634b.run();
            } catch (Throwable th) {
                t5l.p(th);
            }
        }
    }

    public rkb(Handler handler, boolean z) {
        this.c = handler;
        this.d = z;
    }

    @Override // defpackage.hfl
    public hfl.c b() {
        return new a(this.c, this.d);
    }

    @Override // defpackage.hfl
    @SuppressLint({"NewApi"})
    public jz6 d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        b bVar = new b(this.c, t5l.r(runnable));
        Message messageObtain = Message.obtain(this.c, bVar);
        if (this.d) {
            messageObtain.setAsynchronous(true);
        }
        this.c.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return bVar;
    }
}
