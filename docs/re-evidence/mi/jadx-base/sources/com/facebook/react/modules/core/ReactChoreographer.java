package com.facebook.react.modules.core;

import androidx.annotation.GuardedBy;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.cm8;
import defpackage.sk1;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public class ReactChoreographer {
    public static ReactChoreographer g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile com.facebook.react.modules.core.a f7376a;
    public final Object c = new Object();
    public int e = 0;
    public boolean f = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f7377b = new c(this, null);

    @GuardedBy("mCallbackQueuesLock")
    public final ArrayDeque<com.facebook.react.modules.core.a.AbstractC0164a>[] d = new ArrayDeque[CallbackType.values().length];

    public enum CallbackType {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);

        private final int mOrder;

        CallbackType(int i) {
            this.mOrder = i;
        }

        public int getOrder() {
            return this.mOrder;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ReactChoreographer.this.n();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f7379a;

        public b(Runnable runnable) {
            this.f7379a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ReactChoreographer.class) {
                try {
                    if (ReactChoreographer.this.f7376a == null) {
                        ReactChoreographer.this.f7376a = com.facebook.react.modules.core.a.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Runnable runnable = this.f7379a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public class c extends com.facebook.react.modules.core.a.AbstractC0164a {
        public c() {
        }

        @Override // com.facebook.react.modules.core.a.AbstractC0164a
        public void a(long j) {
            synchronized (ReactChoreographer.this.c) {
                try {
                    ReactChoreographer.this.f = false;
                    for (int i = 0; i < ReactChoreographer.this.d.length; i++) {
                        ArrayDeque arrayDeque = ReactChoreographer.this.d[i];
                        int size = arrayDeque.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            com.facebook.react.modules.core.a.AbstractC0164a abstractC0164a = (com.facebook.react.modules.core.a.AbstractC0164a) arrayDeque.pollFirst();
                            if (abstractC0164a != null) {
                                abstractC0164a.a(j);
                                ReactChoreographer.g(ReactChoreographer.this);
                            } else {
                                cm8.i("ReactNative", "Tried to execute non-existent frame callback");
                            }
                        }
                    }
                    ReactChoreographer.this.l();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ c(ReactChoreographer reactChoreographer, a aVar) {
            this();
        }
    }

    public ReactChoreographer() {
        int i = 0;
        while (true) {
            ArrayDeque<com.facebook.react.modules.core.a.AbstractC0164a>[] arrayDequeArr = this.d;
            if (i >= arrayDequeArr.length) {
                k(null);
                return;
            } else {
                arrayDequeArr[i] = new ArrayDeque<>();
                i++;
            }
        }
    }

    public static /* synthetic */ int g(ReactChoreographer reactChoreographer) {
        int i = reactChoreographer.e;
        reactChoreographer.e = i - 1;
        return i;
    }

    public static ReactChoreographer i() {
        sk1.d(g, "ReactChoreographer needs to be initialized.");
        return g;
    }

    public static void j() {
        if (g == null) {
            g = new ReactChoreographer();
        }
    }

    public void k(Runnable runnable) {
        UiThreadUtil.runOnUiThread(new b(runnable));
    }

    public final void l() {
        sk1.a(this.e >= 0);
        if (this.e == 0 && this.f) {
            if (this.f7376a != null) {
                this.f7376a.f(this.f7377b);
            }
            this.f = false;
        }
    }

    public void m(CallbackType callbackType, com.facebook.react.modules.core.a.AbstractC0164a abstractC0164a) {
        synchronized (this.c) {
            try {
                this.d[callbackType.getOrder()].addLast(abstractC0164a);
                boolean z = true;
                int i = this.e + 1;
                this.e = i;
                if (i <= 0) {
                    z = false;
                }
                sk1.a(z);
                if (!this.f) {
                    if (this.f7376a == null) {
                        k(new a());
                    } else {
                        n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        this.f7376a.e(this.f7377b);
        this.f = true;
    }

    public void o(CallbackType callbackType, com.facebook.react.modules.core.a.AbstractC0164a abstractC0164a) {
        synchronized (this.c) {
            try {
                if (this.d[callbackType.getOrder()].removeFirstOccurrence(abstractC0164a)) {
                    this.e--;
                    l();
                } else {
                    cm8.i("ReactNative", "Tried to remove non-existent frame callback");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
