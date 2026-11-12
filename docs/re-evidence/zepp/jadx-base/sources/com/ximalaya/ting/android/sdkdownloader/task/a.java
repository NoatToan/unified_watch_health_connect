package com.ximalaya.ting.android.sdkdownloader.task;

/* JADX INFO: loaded from: classes22.dex */
class a implements Runnable {
    public long a;
    public final Priority b;
    private final Runnable c;

    public a(Priority priority, Runnable runnable) {
        this.b = priority == null ? Priority.DEFAULT : priority;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }
}
