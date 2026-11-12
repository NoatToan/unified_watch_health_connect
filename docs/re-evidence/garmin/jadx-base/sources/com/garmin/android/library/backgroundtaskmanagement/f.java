package com.garmin.android.library.backgroundtaskmanagement;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f extends pd2.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<Thread> f50130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f50131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f50132e;

    public f() {
        super(b.d.DEFAULT_PRIORITY.ordinal());
        this.f50130c = new AtomicReference<>();
        this.f50131d = new AtomicBoolean(false);
        this.f50132e = new AtomicLong(0L);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f50131d.get()) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (this) {
            this.f50130c.set(threadCurrentThread);
        }
        a();
        synchronized (this) {
            this.f50130c.set(null);
        }
    }

    public f(b.d dVar) {
        super(dVar.ordinal());
        this.f50130c = new AtomicReference<>();
        this.f50131d = new AtomicBoolean(false);
        this.f50132e = new AtomicLong(0L);
    }

    public f(long j8, b.d dVar) {
        super(dVar.ordinal());
        this.f50130c = new AtomicReference<>();
        this.f50131d = new AtomicBoolean(false);
        this.f50132e = new AtomicLong(j8);
    }
}
