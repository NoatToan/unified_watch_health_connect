package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.devicesdk.connect.physical.ConsumerHandler;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class clp {
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HandlerThread f1742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f1743c;

    public clp(ConsumerHandler<Message> consumerHandler) {
        HandlerThread handlerThread = new HandlerThread("SafePhysicalConnectHandler");
        this.f1742b = handlerThread;
        if (consumerHandler != null) {
            handlerThread.start();
            this.f1743c = new a(this.f1742b.getLooper(), consumerHandler);
        }
    }

    public final void d(Object obj) {
        synchronized (e) {
            if (c()) {
                this.f1743c.removeCallbacksAndMessages(obj);
            }
        }
    }

    public final Message e(int i) {
        synchronized (e) {
            if (c()) {
                return this.f1743c.obtainMessage(i);
            }
            return new Message();
        }
    }

    public final boolean c(Message message) {
        synchronized (e) {
            if (!c()) {
                return false;
            }
            return this.f1743c.sendMessage(message);
        }
    }

    public final void a(int i) {
        synchronized (e) {
            if (c()) {
                this.f1743c.removeMessages(i);
            }
        }
    }

    public final boolean e(int i, long j) {
        synchronized (e) {
            if (!c()) {
                return false;
            }
            return this.f1743c.sendEmptyMessageDelayed(i, j);
        }
    }

    public final boolean b(int i) {
        synchronized (e) {
            if (!c()) {
                return false;
            }
            return this.f1743c.sendEmptyMessage(i);
        }
    }

    public final boolean a(Message message, long j) {
        synchronized (e) {
            if (!c()) {
                return false;
            }
            return this.f1743c.sendMessageDelayed(message, j);
        }
    }

    public final boolean a(Runnable runnable) {
        synchronized (e) {
            if (!c()) {
                return false;
            }
            return this.f1743c.post(runnable);
        }
    }

    static class a extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConsumerHandler<Message> f1744b;

        a(Looper looper, ConsumerHandler<Message> consumerHandler) {
            super(looper);
            this.f1744b = consumerHandler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ConsumerHandler<Message> consumerHandler = this.f1744b;
            if (consumerHandler != null) {
                consumerHandler.accept(message);
            }
        }

        void d() {
            this.f1744b = null;
        }
    }

    public void a() {
        LogUtil.b("SafePhysicalConnectHandler", "stop physical connect handler.");
        synchronized (e) {
            if (c()) {
                this.f1743c.d();
                this.f1743c = null;
            }
        }
        this.f1742b.quitSafely();
    }

    public boolean c() {
        boolean z;
        synchronized (e) {
            z = this.f1743c != null;
        }
        return z;
    }
}
