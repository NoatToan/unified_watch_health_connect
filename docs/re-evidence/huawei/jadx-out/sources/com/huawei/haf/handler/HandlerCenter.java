package com.huawei.haf.handler;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.text.TextUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class HandlerCenter implements Executor {
    private static volatile HandlerCenter d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, AutoTaskHandler> f5947a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5949c;
    private final long e;

    public static final class OnlyTaskHandlerCallback implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            return false;
        }
    }

    private HandlerCenter(String str, int i, long j) {
        this.f5948b = str;
        this.f5949c = i;
        this.e = e(j);
    }

    public static HandlerCenter a() {
        if (d == null) {
            synchronized (HandlerCenter.class) {
                if (d == null) {
                    d = c("haf_hc_", 0, 60000L);
                }
            }
        }
        return d;
    }

    public static HandlerCenter d(String str) {
        return new HandlerCenter(str, 10, 60000L);
    }

    public static HandlerCenter c(String str, int i, long j) {
        return new HandlerCenter(str, i, j);
    }

    public static ExtendHandler e(String str) {
        return c((HandlerCenter) null, (Handler.Callback) null, str);
    }

    public static ExtendHandler b(Handler.Callback callback, String str) {
        return c((HandlerCenter) null, callback, str);
    }

    public static ExtendHandler c(HandlerCenter handlerCenter, Handler.Callback callback, String str) {
        return new ExtendHandlerWithCenter(c(handlerCenter), c(callback), a(str));
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c(runnable, (Handler.Callback) null, 0L, a((String) null));
    }

    public void b(String str, boolean z) {
        if ("default".equals(str) && d == this) {
            LogUtil.e("HAF_HandlerCenter", "Can't actively quit this default handler");
        } else {
            a(str, z);
        }
    }

    public void c(Runnable runnable) {
        c(runnable, (Handler.Callback) null, 0L, a((String) null));
    }

    public void d(Runnable runnable, long j) {
        c(runnable, (Handler.Callback) null, j, a((String) null));
    }

    public void d(Runnable runnable, String str) {
        c(runnable, (Handler.Callback) null, 0L, a(str));
    }

    void c(Runnable runnable, Handler.Callback callback, long j, String str) {
        if (runnable == null) {
            return;
        }
        synchronized (this.f5947a) {
            AutoTaskHandler autoTaskHandlerC = this.f5947a.get(str);
            if (autoTaskHandlerC == null) {
                autoTaskHandlerC = c(str);
            }
            if (!autoTaskHandlerC.c(runnable, j, callback)) {
                a(str, true);
                c(runnable, callback, j, str);
            }
        }
    }

    void c(Message message, Handler.Callback callback, long j, String str) {
        if (message.getCallback() == null && (callback instanceof OnlyTaskHandlerCallback)) {
            throw new UnsupportedOperationException("The Handler.Callback used does not support processing Message.what messages");
        }
        synchronized (this.f5947a) {
            AutoTaskHandler autoTaskHandlerC = this.f5947a.get(str);
            if (autoTaskHandlerC == null) {
                autoTaskHandlerC = c(str);
            }
            if (!autoTaskHandlerC.d(message, j, callback)) {
                a(str, true);
                c(message, callback, j, str);
            }
        }
    }

    boolean a(int i, Handler.Callback callback, String str) {
        AutoTaskHandler autoTaskHandlerB = b(str);
        if (autoTaskHandlerB != null) {
            return autoTaskHandlerB.hasMessages(i, callback);
        }
        return false;
    }

    void d(Runnable runnable, Handler.Callback callback, String str) {
        AutoTaskHandler autoTaskHandlerB = b(str);
        if (autoTaskHandlerB != null) {
            autoTaskHandlerB.removeCallbacks(runnable, callback);
        }
    }

    void e(int i, Handler.Callback callback, String str) {
        AutoTaskHandler autoTaskHandlerB = b(str);
        if (autoTaskHandlerB != null) {
            autoTaskHandlerB.removeMessages(i, callback);
        }
    }

    void e(Handler.Callback callback, String str) {
        AutoTaskHandler autoTaskHandlerB = b(str);
        if (autoTaskHandlerB != null) {
            autoTaskHandlerB.removeCallbacksAndMessages(callback);
        }
    }

    static Handler.Callback c(Handler.Callback callback) {
        return callback == null ? new OnlyTaskHandlerCallback() : callback;
    }

    private static HandlerCenter c(HandlerCenter handlerCenter) {
        return handlerCenter == null ? a() : handlerCenter;
    }

    private static String a(String str) {
        return TextUtils.isEmpty(str) ? "default" : str;
    }

    private AutoTaskHandler c(String str) {
        HandlerThread handlerThread = new HandlerThread(e(str, this.f5948b), this.f5949c);
        handlerThread.start();
        AutoTaskHandler autoTaskHandler = new AutoTaskHandler(this, handlerThread.getLooper(), str);
        this.f5947a.put(str, autoTaskHandler);
        LogUtil.b("HAF_HandlerCenter", "add ", autoTaskHandler, ", size=", Integer.valueOf(this.f5947a.size()));
        return autoTaskHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z) {
        synchronized (this.f5947a) {
            AutoTaskHandler autoTaskHandlerG = g(str);
            if (autoTaskHandlerG != null) {
                autoTaskHandlerG.e(z);
            }
        }
    }

    private AutoTaskHandler g(String str) {
        AutoTaskHandler autoTaskHandlerRemove = this.f5947a.remove(str);
        if (autoTaskHandlerRemove != null) {
            LogUtil.b("HAF_HandlerCenter", "remove ", autoTaskHandlerRemove, ", size=", Integer.valueOf(this.f5947a.size()));
        }
        return autoTaskHandlerRemove;
    }

    private AutoTaskHandler b(String str) {
        AutoTaskHandler autoTaskHandler;
        synchronized (this.f5947a) {
            autoTaskHandler = this.f5947a.get(str);
        }
        return autoTaskHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        int size;
        synchronized (this.f5947a) {
            size = this.f5947a.size();
        }
        return size;
    }

    private static String e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2 + str;
    }

    private static long e(long j) {
        if (j == 0) {
            return 0L;
        }
        return Math.min(Math.max(j, 10000L), 300000L);
    }

    static class AutoTaskHandler extends TaskHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Field f5950a = ReflectionUtils.a(MessageQueue.class, "mMessages");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f5951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f5952c;
        private final HandlerCenter d;

        AutoTaskHandler(HandlerCenter handlerCenter, Looper looper, String str) {
            super(looper);
            this.d = handlerCenter;
            this.f5952c = str;
        }

        boolean c(Runnable runnable, long j, Handler.Callback callback) {
            if (this.f5951b) {
                return false;
            }
            return d(Message.obtain(this, runnable), j, callback);
        }

        boolean d(Message message, long j, Handler.Callback callback) {
            if (this.f5951b || !b(message, j, callback)) {
                return false;
            }
            b();
            return true;
        }

        void e(boolean z) {
            this.f5951b = true;
            if (z) {
                getLooper().quitSafely();
            } else {
                getLooper().quit();
            }
        }

        @Override // com.huawei.haf.handler.TaskHandler
        protected void e(Message message) {
            if (this.f5951b || !b(message)) {
                return;
            }
            if (e()) {
                b();
                return;
            }
            if (d()) {
                synchronized (this.d.f5947a) {
                    if (!e()) {
                        this.d.a(this.f5952c, true);
                        return;
                    }
                }
            }
            b();
            LogUtil.b("HAF_HandlerCenter", "idle ", this, ", cur size=", Integer.valueOf(this.d.d()));
        }

        @Override // android.os.Handler
        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("TaskHandler{handlerKey=");
            sb.append(this.f5952c);
            if (!TextUtils.isEmpty(this.d.f5948b)) {
                sb.append(", prefix=");
                sb.append(this.d.f5948b);
            }
            sb.append(", idleTime=");
            sb.append(this.d.e);
            sb.append(", HC=");
            sb.append(System.identityHashCode(this.d));
            sb.append(", TH=");
            sb.append(c());
            sb.append("}");
            return sb.toString();
        }

        private boolean d() {
            return (this.d.e == 0 || f5950a == null) ? false : true;
        }

        private boolean b(Message message) {
            return message.what == 100 && message.obj == this;
        }

        private void b() {
            removeMessages(100, this);
            Message messageObtain = Message.obtain(this, 100);
            messageObtain.obj = this;
            sendMessageDelayed(messageObtain, d() ? this.d.e : 600000L);
        }

        private boolean e() {
            Field field = f5950a;
            if (field == null) {
                return true;
            }
            try {
                Object obj = field.get(getLooper().getQueue());
                if (!(obj instanceof Message)) {
                    return false;
                }
                Message message = (Message) obj;
                if (message.getTarget() != this) {
                    LogUtil.e("HAF_HandlerCenter", "exist other handler message in the queue. handler=", message.getTarget());
                }
                return true;
            } catch (IllegalAccessException e) {
                LogUtil.e("HAF_HandlerCenter", "isExistMessages invoke error, ex=", LogUtil.c(e));
                f5950a = null;
                return true;
            }
        }
    }
}
