package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public class ggi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f18960a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Object f18961b = new Object();
    public static final LinkedList<Runnable> c = new LinkedList<>();
    public static Handler d = null;
    public static final LinkedList<Runnable> e = new LinkedList<>();
    public static boolean f = true;
    public static final qj8 g = new qj8(16);
    public static int h = 0;

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                ggi.d();
            }
        }
    }

    public static void b(Runnable runnable) {
        synchronized (f18960a) {
            c.add(runnable);
        }
    }

    public static Handler c() {
        Handler handler;
        synchronized (f18960a) {
            try {
                if (d == null) {
                    HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                    handlerThread.start();
                    d = new a(handlerThread.getLooper());
                }
                handler = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public static void d() {
        LinkedList linkedList;
        synchronized (f18961b) {
            try {
                synchronized (f18960a) {
                    LinkedList<Runnable> linkedList2 = e;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    c().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(Runnable runnable, boolean z) {
        Handler handlerC = c();
        synchronized (f18960a) {
            try {
                e.add(runnable);
                if (z && f) {
                    handlerC.sendEmptyMessageDelayed(1, 100L);
                } else {
                    handlerC.sendEmptyMessage(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(Runnable runnable) {
        synchronized (f18960a) {
            c.remove(runnable);
        }
    }
}
