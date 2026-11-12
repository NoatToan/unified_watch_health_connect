package com.xiaomi.smarthome.library.common.util;

import android.os.AsyncTask;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class SerialExecutor implements Executor {
    Runnable mActive;
    final ArrayDeque<Runnable> mTasks = new ArrayDeque<>();

    @Override // java.util.concurrent.Executor
    public synchronized void execute(final Runnable runnable) {
        this.mTasks.offer(new Runnable() { // from class: com.xiaomi.smarthome.library.common.util.SerialExecutor.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } finally {
                    SerialExecutor.this.scheduleNext();
                }
            }
        });
        if (this.mActive == null) {
            scheduleNext();
        }
    }

    public synchronized void scheduleNext() {
        Runnable runnablePoll = this.mTasks.poll();
        this.mActive = runnablePoll;
        if (runnablePoll != null) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnablePoll);
        }
    }
}
