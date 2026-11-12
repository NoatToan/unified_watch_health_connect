package com.xiaomi.onetrack.c;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13828a = "BroadcastExecutor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f13829b = "onetrack_broadcast";
    private static Handler c;

    public static void a() {
        if (c == null) {
            synchronized (a.class) {
                try {
                    if (c == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("initIfNeeded : ");
                        sb.append(Thread.currentThread().getId());
                        HandlerThread handlerThread = new HandlerThread(f13829b);
                        handlerThread.start();
                        c = new Handler(handlerThread.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void a(Runnable runnable) {
        StringBuilder sb = new StringBuilder();
        sb.append("BroadcastExecutor : ");
        sb.append(Thread.currentThread().getId());
        a();
        c.post(runnable);
    }
}
