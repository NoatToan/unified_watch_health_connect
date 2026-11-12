package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class LottieTask<T> {
    public static Executor EXECUTOR = Executors.newCachedThreadPool();
    private final Set<LottieListener<T>> a;
    private final Set<LottieListener<Throwable>> b;
    private final Handler c;

    @Nullable
    private volatile LottieResult<T> d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LottieTask.this.d == null) {
                return;
            }
            LottieResult lottieResult = LottieTask.this.d;
            if (lottieResult.getValue() != null) {
                LottieTask.this.g(lottieResult.getValue());
            } else {
                LottieTask.this.e(lottieResult.getException());
            }
        }
    }

    public class b extends FutureTask<LottieResult<T>> {
        public b(Callable<LottieResult<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                LottieTask.this.h(get());
            } catch (InterruptedException | ExecutionException e) {
                LottieTask.this.h(new LottieResult(e));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieTask(Callable<LottieResult<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e(Throwable th) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            Logger.warning("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((LottieListener) it2.next()).onResult(th);
        }
    }

    private void f() {
        this.c.post(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g(T t) {
        Iterator it2 = new ArrayList(this.a).iterator();
        while (it2.hasNext()) {
            ((LottieListener) it2.next()).onResult(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(@Nullable LottieResult<T> lottieResult) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = lottieResult;
        f();
    }

    public synchronized LottieTask<T> addFailureListener(LottieListener<Throwable> lottieListener) {
        if (this.d != null && this.d.getException() != null) {
            lottieListener.onResult(this.d.getException());
        }
        this.b.add(lottieListener);
        return this;
    }

    public synchronized LottieTask<T> addListener(LottieListener<T> lottieListener) {
        if (this.d != null && this.d.getValue() != null) {
            lottieListener.onResult(this.d.getValue());
        }
        this.a.add(lottieListener);
        return this;
    }

    public synchronized LottieTask<T> removeFailureListener(LottieListener<Throwable> lottieListener) {
        this.b.remove(lottieListener);
        return this;
    }

    public synchronized LottieTask<T> removeListener(LottieListener<T> lottieListener) {
        this.a.remove(lottieListener);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieTask(Callable<LottieResult<T>> callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (!z) {
            EXECUTOR.execute(new b(callable));
            return;
        }
        try {
            h(callable.call());
        } catch (Throwable th) {
            h(new LottieResult<>(th));
        }
    }
}
