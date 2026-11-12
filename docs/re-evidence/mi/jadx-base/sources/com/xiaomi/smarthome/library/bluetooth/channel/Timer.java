package com.xiaomi.smarthome.library.bluetooth.channel;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class Timer {
    private TimerCallback mCallback;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public static abstract class TimerCallback implements Runnable {
        private String name;

        public TimerCallback(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }

        public abstract void onTimerCallback() throws TimeoutException;

        public abstract void resetCallback();

        @Override // java.lang.Runnable
        public final void run() {
            BluetoothLog.e(String.format("%s: Timer expired!!!", this.name));
            try {
                onTimerCallback();
            } catch (TimeoutException e) {
                BluetoothLog.e(e);
            }
            resetCallback();
        }
    }

    private Timer() {
    }

    public static Timer newInstance() {
        return new Timer();
    }

    public synchronized String getName() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return isRunning() ? this.mCallback.getName() : "";
    }

    public synchronized boolean isRunning() {
        return this.mCallback != null;
    }

    public synchronized void resetCallback() {
        this.mCallback = null;
    }

    public synchronized void start(TimerCallback timerCallback, long j) {
        try {
            this.mHandler.removeCallbacksAndMessages(null);
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            Handler handler = new Handler(looperMyLooper);
            this.mHandler = handler;
            handler.postDelayed(timerCallback, j);
            this.mCallback = timerCallback;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void stop() {
        this.mHandler.removeCallbacksAndMessages(null);
        this.mCallback = null;
    }
}
