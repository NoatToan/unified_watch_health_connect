package com.huami.assistant.ocr.camera;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public class CameraThreadPool {
    private static final long a = 2000;
    private static Timer b;
    private static int c;
    private static ExecutorService d;

    public class a extends TimerTask {
        public final /* synthetic */ Runnable a;

        public a(final Runnable val$runnable) {
            this.a = val$runnable;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.a.run();
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        c = iAvailableProcessors;
        d = Executors.newFixedThreadPool(iAvailableProcessors);
    }

    public static void cancelAutoFocusTimer() {
        Timer timer = b;
        if (timer != null) {
            timer.cancel();
            b = null;
        }
    }

    public static Timer createAutoFocusTimerTask(final Runnable runnable) {
        Timer timer = b;
        if (timer != null) {
            return timer;
        }
        b = new Timer();
        b.scheduleAtFixedRate(new a(runnable), 0L, 2000L);
        return b;
    }

    public static void execute(Runnable runnable) {
        d.execute(runnable);
    }
}
