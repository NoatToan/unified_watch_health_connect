package com.xiaomi.onetrack.c;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13830a = "DbExecutor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f13831b = "onetrack_db";
    private static Handler c;

    private static void a() {
        if (c == null) {
            synchronized (b.class) {
                try {
                    if (c == null) {
                        HandlerThread handlerThread = new HandlerThread(f13831b);
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
        a();
        c.post(runnable);
    }
}
