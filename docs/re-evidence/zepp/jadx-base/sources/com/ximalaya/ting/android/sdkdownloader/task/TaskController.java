package com.ximalaya.ting.android.sdkdownloader.task;

/* JADX INFO: loaded from: classes22.dex */
public interface TaskController {
    void autoPost(Runnable runnable);

    void autoRun(Runnable runnable);

    void post(Runnable runnable);

    void postDelayed(Runnable runnable, long j);

    void removeCallbacks(Runnable runnable);

    void run(Runnable runnable);

    void runDelayed(Runnable runnable, long j);

    <T> AbsTask<T> start(AbsTask<T> absTask);

    <T> AbsTask<T> startNoCallWaiting(AbsTask<T> absTask);
}
