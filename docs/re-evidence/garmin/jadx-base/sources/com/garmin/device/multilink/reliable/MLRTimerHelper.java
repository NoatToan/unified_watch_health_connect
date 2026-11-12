package com.garmin.device.multilink.reliable;

import java.util.Timer;
import java.util.TimerTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public final class MLRTimerHelper {
    private static final Logger LOGGER = LoggerFactory.getLogger("MLRTimerHelper");

    private static void detailedLog(String str) {
        if (MLRInitializer.isDebug()) {
            LOGGER.trace(str);
        }
    }

    public static native void mlrExecuteTimer(long j8);

    public static TimerTask startTimer(Timer timer, final long j8, long j14) {
        try {
            TimerTask timerTask = new TimerTask() { // from class: com.garmin.device.multilink.reliable.MLRTimerHelper.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    MLRTimerHelper.mlrExecuteTimer(j8);
                }
            };
            timer.schedule(timerTask, j14);
            return timerTask;
        } catch (Exception e4) {
            LOGGER.error("startTimer: failed", (Throwable) e4);
            return null;
        }
    }
}
