package com.youth.banner;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes22.dex */
public class WeakHandler {
    private final Handler.Callback a;
    private final b b;
    private Lock c;

    @VisibleForTesting
    public final a d;

    public static class a {

        @Nullable
        public a a;

        @Nullable
        public a b;

        @NonNull
        public final Runnable c;

        @NonNull
        public final c d;

        @NonNull
        public Lock e;

        public a(@NonNull Lock lock, @NonNull Runnable runnable) {
            this.c = runnable;
            this.e = lock;
            this.d = new c(new WeakReference(runnable), new WeakReference(this));
        }

        public void a(@NonNull a aVar) {
            this.e.lock();
            try {
                a aVar2 = this.a;
                if (aVar2 != null) {
                    aVar2.b = aVar;
                }
                aVar.a = aVar2;
                this.a = aVar;
                aVar.b = this;
            } finally {
                this.e.unlock();
            }
        }

        public c b() {
            this.e.lock();
            try {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a = this.a;
                }
                a aVar2 = this.a;
                if (aVar2 != null) {
                    aVar2.b = aVar;
                }
                this.b = null;
                this.a = null;
                return this.d;
            } finally {
                this.e.unlock();
            }
        }

        @Nullable
        public c c(Runnable runnable) {
            this.e.lock();
            try {
                for (a aVar = this.a; aVar != null; aVar = aVar.a) {
                    if (aVar.c == runnable) {
                        return aVar.b();
                    }
                }
                return null;
            } finally {
                this.e.unlock();
            }
        }
    }

    public static class c implements Runnable {
        private final WeakReference<Runnable> a;
        private final WeakReference<a> b;

        public c(WeakReference<Runnable> weakReference, WeakReference<a> weakReference2) {
            this.a = weakReference;
            this.b = weakReference2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.a.get();
            a aVar = this.b.get();
            if (aVar != null) {
                aVar.b();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public WeakHandler() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = new a(reentrantLock, null);
        this.a = null;
        this.b = new b();
    }

    private c a(@NonNull Runnable runnable) {
        Objects.requireNonNull(runnable, "Runnable can't be null");
        a aVar = new a(this.c, runnable);
        this.d.a(aVar);
        return aVar.d;
    }

    public final Looper getLooper() {
        return this.b.getLooper();
    }

    public final boolean hasMessages(int i) {
        return this.b.hasMessages(i);
    }

    public final boolean post(@NonNull Runnable runnable) {
        return this.b.post(a(runnable));
    }

    public final boolean postAtFrontOfQueue(Runnable runnable) {
        return this.b.postAtFrontOfQueue(a(runnable));
    }

    public final boolean postAtTime(@NonNull Runnable runnable, long j) {
        return this.b.postAtTime(a(runnable), j);
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        return this.b.postDelayed(a(runnable), j);
    }

    public final void removeCallbacks(Runnable runnable) {
        c cVarC = this.d.c(runnable);
        if (cVarC != null) {
            this.b.removeCallbacks(cVarC);
        }
    }

    public final void removeCallbacksAndMessages(Object obj) {
        this.b.removeCallbacksAndMessages(obj);
    }

    public final void removeMessages(int i) {
        this.b.removeMessages(i);
    }

    public final boolean sendEmptyMessage(int i) {
        return this.b.sendEmptyMessage(i);
    }

    public final boolean sendEmptyMessageAtTime(int i, long j) {
        return this.b.sendEmptyMessageAtTime(i, j);
    }

    public final boolean sendEmptyMessageDelayed(int i, long j) {
        return this.b.sendEmptyMessageDelayed(i, j);
    }

    public final boolean sendMessage(Message message) {
        return this.b.sendMessage(message);
    }

    public final boolean sendMessageAtFrontOfQueue(Message message) {
        return this.b.sendMessageAtFrontOfQueue(message);
    }

    public boolean sendMessageAtTime(Message message, long j) {
        return this.b.sendMessageAtTime(message, j);
    }

    public final boolean sendMessageDelayed(Message message, long j) {
        return this.b.sendMessageDelayed(message, j);
    }

    public static class b extends Handler {
        private final WeakReference<Handler.Callback> a;

        public b() {
            this.a = null;
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            Handler.Callback callback;
            WeakReference<Handler.Callback> weakReference = this.a;
            if (weakReference == null || (callback = weakReference.get()) == null) {
                return;
            }
            callback.handleMessage(message);
        }

        public b(WeakReference<Handler.Callback> weakReference) {
            this.a = weakReference;
        }

        public b(Looper looper) {
            super(looper);
            this.a = null;
        }

        public b(Looper looper, WeakReference<Handler.Callback> weakReference) {
            super(looper);
            this.a = weakReference;
        }
    }

    public final boolean hasMessages(int i, Object obj) {
        return this.b.hasMessages(i, obj);
    }

    public final boolean postAtTime(Runnable runnable, Object obj, long j) {
        return this.b.postAtTime(a(runnable), obj, j);
    }

    public final void removeMessages(int i, Object obj) {
        this.b.removeMessages(i, obj);
    }

    public final void removeCallbacks(Runnable runnable, Object obj) {
        c cVarC = this.d.c(runnable);
        if (cVarC != null) {
            this.b.removeCallbacks(cVarC, obj);
        }
    }

    public WeakHandler(@Nullable Handler.Callback callback) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = new a(reentrantLock, null);
        this.a = callback;
        this.b = new b((WeakReference<Handler.Callback>) new WeakReference(callback));
    }

    public WeakHandler(@NonNull Looper looper) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = new a(reentrantLock, null);
        this.a = null;
        this.b = new b(looper);
    }

    public WeakHandler(@NonNull Looper looper, @NonNull Handler.Callback callback) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = new a(reentrantLock, null);
        this.a = callback;
        this.b = new b(looper, new WeakReference(callback));
    }
}
