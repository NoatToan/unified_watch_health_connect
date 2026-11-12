package com.ximalaya.ting.android.sdkdownloader.task;

import android.os.Looper;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes22.dex */
public final class TaskControllerImpl implements TaskController {
    private static volatile TaskController a;

    public class a extends TimerTask {
        public final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            PriorityExecutor priorityExecutor = b.m;
            if (priorityExecutor.isBusy()) {
                new Thread(this.a).start();
            } else {
                priorityExecutor.execute(this.a);
            }
        }
    }

    private TaskControllerImpl() {
    }

    public static TaskController getInstance() {
        if (a == null) {
            synchronized (TaskController.class) {
                if (a == null) {
                    a = new TaskControllerImpl();
                }
            }
        }
        return a;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.TaskController
    public void autoPost(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            b.n.post(runnable);
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.TaskController
    public void autoRun(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            run(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.TaskController
    public void post(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        b.n.post(runnable);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.TaskController
    public void postDelayed(Runnable runnable, long j) {
        if (runnable == null) {
            return;
        }
        b.n.postDelayed(runnable, j);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.TaskController
    public void removeCallbacks(Runnable runnable) {
        b.n.removeCallbacks(runnable);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.TaskController
    public void run(Runnable runnable) {
        PriorityExecutor priorityExecutor = b.m;
        if (priorityExecutor.isBusy()) {
            new Thread(runnable).start();
        } else {
            priorityExecutor.execute(runnable);
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.TaskController
    public void runDelayed(Runnable runnable, long j) {
        new Timer().schedule(new a(runnable), j);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.TaskController
    public <T> AbsTask<T> start(AbsTask<T> absTask) {
        b bVar = absTask instanceof b ? (b) absTask : new b(absTask);
        try {
            bVar.doBackground();
        } catch (Throwable unused) {
        }
        return bVar;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.task.TaskController
    public <T> AbsTask<T> startNoCallWaiting(AbsTask<T> absTask) {
        b bVar = absTask instanceof b ? (b) absTask : new b(absTask);
        try {
            bVar.g();
        } catch (Throwable unused) {
        }
        return bVar;
    }
}
