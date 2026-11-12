package com.xiaomi.onetrack.a.a;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13698a = "AdMonitorDbExecutor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f13699b = "onetrack_ad_monitor_db";
    private static Handler c;

    private static void a() {
        if (c == null) {
            synchronized (a.class) {
                try {
                    if (c == null) {
                        HandlerThread handlerThread = new HandlerThread(f13699b);
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
