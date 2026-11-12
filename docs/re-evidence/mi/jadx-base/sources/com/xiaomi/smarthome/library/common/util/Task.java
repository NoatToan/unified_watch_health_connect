package com.xiaomi.smarthome.library.common.util;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Task extends AsyncTask<Void, Void, Void> {
    private static volatile Handler mHandler;

    private static Handler getHandler() {
        if (mHandler == null) {
            synchronized (Task.class) {
                try {
                    if (mHandler == null) {
                        mHandler = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mHandler;
    }

    public abstract void doInBackground();

    public void execute(final Executor executor) {
        getHandler().post(new Runnable() { // from class: com.xiaomi.smarthome.library.common.util.Task.2
            @Override // java.lang.Runnable
            public void run() {
                Task task = Task.this;
                Executor executor2 = executor;
                if (executor2 == null) {
                    executor2 = AsyncTask.THREAD_POOL_EXECUTOR;
                }
                task.executeOnExecutor(executor2, new Void[0]);
            }
        });
    }

    public void executeDelayed(final Executor executor, long j) {
        getHandler().postDelayed(new Runnable() { // from class: com.xiaomi.smarthome.library.common.util.Task.1
            @Override // java.lang.Runnable
            public void run() {
                Task task = Task.this;
                Executor executor2 = executor;
                if (executor2 == null) {
                    executor2 = AsyncTask.THREAD_POOL_EXECUTOR;
                }
                task.executeOnExecutor(executor2, new Void[0]);
            }
        }, j);
    }

    public static void execute(Task task, Executor executor) {
        if (task != null) {
            task.execute(executor);
        }
    }

    public static void executeDelayed(Task task, Executor executor, long j) {
        if (task != null) {
            task.executeDelayed(executor, j);
        }
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void... voidArr) {
        doInBackground();
        return null;
    }

    public static void executeDelayed(final FutureTask futureTask, final Executor executor, long j) {
        if (futureTask == null || executor == null) {
            return;
        }
        getHandler().postDelayed(new Runnable() { // from class: com.xiaomi.smarthome.library.common.util.Task.3
            @Override // java.lang.Runnable
            public void run() {
                executor.execute(futureTask);
            }
        }, j);
    }
}
