package com.huawei.animationkit.computationalwallpaper.utils;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import defpackage.bdo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AsyncExecutor<T, R> {
    private final ExecutorService mExecutorService = Executors.newSingleThreadExecutor();
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    protected abstract void finishOnUiThread(R r, bdo bdoVar);

    protected abstract R runInBackground(T t) throws bdo;

    public void execute(T t) {
        this.mExecutorService.submit(new e(t));
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T f5172c;

        private e(T t) {
            this.f5172c = t;
        }

        @Override // java.lang.Runnable
        public void run() throws bdo {
            Object objRunInBackground = null;
            try {
                e = null;
                objRunInBackground = AsyncExecutor.this.runInBackground(this.f5172c);
            } catch (bdo e) {
                e = e;
                Log.e("ExecuteRunnable", "run generate task failed");
            }
            AsyncExecutor.this.mHandler.post(new a(objRunInBackground, e));
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final R f5169a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final bdo f5170c;

        public a(R r, bdo bdoVar) {
            this.f5169a = r;
            this.f5170c = bdoVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncExecutor.this.finishOnUiThread(this.f5169a, this.f5170c);
        }
    }
}
