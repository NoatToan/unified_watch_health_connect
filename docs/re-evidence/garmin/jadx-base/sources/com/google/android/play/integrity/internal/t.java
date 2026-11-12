package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
public abstract class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f53447a;

    public t() {
        this.f53447a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f53447a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f53447a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e4) {
            a(e4);
        }
    }

    public t(TaskCompletionSource taskCompletionSource) {
        this.f53447a = taskCompletionSource;
    }
}
