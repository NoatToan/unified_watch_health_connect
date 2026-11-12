package com.xiaomi.smarthome.library.common.util;

import android.content.Context;
import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public class TimerManager {
    private final Handler handler;
    private final Timer timer = new Timer(false);

    public TimerManager(Handler handler) {
        this.handler = handler;
    }

    public void cancel() {
        this.timer.cancel();
    }

    public void registerTask(Context context, final Runnable runnable, long j, long j2) {
        this.timer.schedule(new TimerTask() { // from class: com.xiaomi.smarthome.library.common.util.TimerManager.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                TimerManager.this.handler.post(runnable);
            }
        }, j, j2);
    }

    public void registerTask(TimerTask timerTask, long j, long j2) {
        this.timer.schedule(timerTask, j, j2);
    }
}
