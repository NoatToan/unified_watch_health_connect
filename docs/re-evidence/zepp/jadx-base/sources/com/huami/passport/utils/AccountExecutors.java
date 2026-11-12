package com.huami.passport.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes12.dex */
public class AccountExecutors {
    private final Executor diskIO;
    private final Executor mainThread;
    private final Executor networkIO;

    public static class MainThreadExecutor implements Executor {
        private Handler mainThreadHandler;

        private MainThreadExecutor() {
            this.mainThreadHandler = new Handler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.mainThreadHandler.post(runnable);
        }
    }

    public AccountExecutors(Executor executor, Executor executor2, Executor executor3) {
        this.diskIO = executor;
        this.networkIO = executor2;
        this.mainThread = executor3;
    }

    public Executor diskIO() {
        return this.diskIO;
    }

    public Executor mainThread() {
        return this.mainThread;
    }

    public Executor networkIO() {
        return this.networkIO;
    }

    public AccountExecutors() {
        this(Executors.newSingleThreadExecutor(), Executors.newFixedThreadPool(2), new MainThreadExecutor());
    }
}
