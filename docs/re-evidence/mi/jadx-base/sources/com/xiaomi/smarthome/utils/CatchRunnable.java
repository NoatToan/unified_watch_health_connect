package com.xiaomi.smarthome.utils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CatchRunnable implements Runnable {
    public abstract void catchRun() throws Throwable;

    @Override // java.lang.Runnable
    public void run() {
        try {
            catchRun();
        } catch (Throwable th) {
            ExtsKt.getString(th);
        }
    }
}
