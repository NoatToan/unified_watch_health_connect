package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.LottieThreadFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import org.apache.commons.lang3.BooleanUtils;

/* JADX INFO: loaded from: classes7.dex */
public class LottieTask<T> {
    static final String DIRECT_EXECUTOR_PROPERTY_NAME = "lottie.testing.directExecutor";
    public static Executor EXECUTOR;
    private final Set<LottieListener<Throwable>> failureListeners;
    private final Handler handler;
    private volatile LottieResult<T> result;
    private final Set<LottieListener<T>> successListeners;

    public static class LottieFutureTask<T> extends FutureTask<LottieResult<T>> {
        private LottieTask<T> lottieTask;

        public LottieFutureTask(LottieTask<T> lottieTask, Callable<LottieResult<T>> callable) {
            super(callable);
            this.lottieTask = lottieTask;
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.lottieTask.setResult(get());
                } catch (InterruptedException | ExecutionException e4) {
                    this.lottieTask.setResult(new LottieResult(e4));
                }
            } finally {
                this.lottieTask = null;
            }
        }
    }

    static {
        if (BooleanUtils.TRUE.equals(System.getProperty(DIRECT_EXECUTOR_PROPERTY_NAME))) {
            EXECUTOR = new bv2.g(1);
        } else {
            EXECUTOR = Executors.newCachedThreadPool(new LottieThreadFactory());
        }
    }

    public LottieTask(Callable<LottieResult<T>> callable, boolean z14) {
        this.successListeners = new LinkedHashSet(1);
        this.failureListeners = new LinkedHashSet(1);
        this.handler = new Handler(Looper.getMainLooper());
        this.result = null;
        if (!z14) {
            EXECUTOR.execute(new LottieFutureTask(this, callable));
            return;
        }
        try {
            setResult(callable.call());
        } catch (Throwable th3) {
            setResult(new LottieResult<>(th3));
        }
    }

    private synchronized void notifyFailureListeners(Throwable th3) {
        ArrayList arrayList = new ArrayList(this.failureListeners);
        if (arrayList.isEmpty()) {
            Logger.warning("Lottie encountered an error but no failure listener was added:", th3);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((LottieListener) it.next()).onResult(th3);
        }
    }

    private void notifyListeners() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            notifyListenersInternal();
        } else {
            this.handler.post(new e(this, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListenersInternal() {
        LottieResult<T> lottieResult = this.result;
        if (lottieResult == null) {
            return;
        }
        if (lottieResult.getValue() != null) {
            notifySuccessListeners(lottieResult.getValue());
        } else {
            notifyFailureListeners(lottieResult.getException());
        }
    }

    private synchronized void notifySuccessListeners(T t7) {
        Iterator it = new ArrayList(this.successListeners).iterator();
        while (it.hasNext()) {
            ((LottieListener) it.next()).onResult(t7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(LottieResult<T> lottieResult) {
        if (this.result != null) {
            vb.h.z("A task may only be set once.");
        } else {
            this.result = lottieResult;
            notifyListeners();
        }
    }

    public synchronized LottieTask<T> addFailureListener(LottieListener<Throwable> lottieListener) {
        try {
            LottieResult<T> lottieResult = this.result;
            if (lottieResult != null && lottieResult.getException() != null) {
                lottieListener.onResult(lottieResult.getException());
            }
            this.failureListeners.add(lottieListener);
        } catch (Throwable th3) {
            throw th3;
        }
        return this;
    }

    public synchronized LottieTask<T> addListener(LottieListener<T> lottieListener) {
        try {
            LottieResult<T> lottieResult = this.result;
            if (lottieResult != null && lottieResult.getValue() != null) {
                lottieListener.onResult(lottieResult.getValue());
            }
            this.successListeners.add(lottieListener);
        } catch (Throwable th3) {
            throw th3;
        }
        return this;
    }

    public LottieResult<T> getResult() {
        return this.result;
    }

    public synchronized LottieTask<T> removeFailureListener(LottieListener<Throwable> lottieListener) {
        this.failureListeners.remove(lottieListener);
        return this;
    }

    public synchronized LottieTask<T> removeListener(LottieListener<T> lottieListener) {
        this.successListeners.remove(lottieListener);
        return this;
    }

    public LottieTask(T t7) {
        this.successListeners = new LinkedHashSet(1);
        this.failureListeners = new LinkedHashSet(1);
        this.handler = new Handler(Looper.getMainLooper());
        this.result = null;
        setResult(new LottieResult<>(t7));
    }

    public LottieTask(Callable<LottieResult<T>> callable) {
        this(callable, false);
    }
}
