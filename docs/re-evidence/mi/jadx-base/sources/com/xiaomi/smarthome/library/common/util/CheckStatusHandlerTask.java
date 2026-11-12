package com.xiaomi.smarthome.library.common.util;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public class CheckStatusHandlerTask {
    public static final int MESSAGE_GET_STATUS = 10;
    public static final int MESSAGE_TIME_OUT = 11;
    MyRunnable mCheckStatusRunnable;
    long mDeltaCheckTimemillis;
    Handler mHandler;
    boolean mIsAutoCheck;
    boolean mIsCheckStatus = false;
    Runnable mTimeoutRunnable;
    long mTimeoutTimemillis;

    public interface MyRunnable {
        void run(Handler handler);
    }

    public CheckStatusHandlerTask(boolean z) {
        this.mIsAutoCheck = z;
    }

    public void changeDeltaCheckTimemillis(long j) {
        this.mDeltaCheckTimemillis = j;
    }

    public boolean isEnable(Handler handler) {
        return this.mIsCheckStatus && this.mHandler == handler;
    }

    public void prepareNextCheckStatus() {
        this.mHandler.sendEmptyMessageDelayed(10, this.mDeltaCheckTimemillis);
    }

    public void setCheckStatusRunnable(MyRunnable myRunnable, long j) {
        this.mCheckStatusRunnable = myRunnable;
        this.mDeltaCheckTimemillis = j;
    }

    public void setTimeoutRunnable(Runnable runnable, long j) {
        this.mTimeoutRunnable = runnable;
        this.mTimeoutTimemillis = j;
    }

    public void start() {
        Handler handler = new Handler() { // from class: com.xiaomi.smarthome.library.common.util.CheckStatusHandlerTask.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Handler handler2;
                int i = message.what;
                if (i == 10) {
                    CheckStatusHandlerTask checkStatusHandlerTask = CheckStatusHandlerTask.this;
                    if (checkStatusHandlerTask.mIsCheckStatus && checkStatusHandlerTask.mHandler == this) {
                        checkStatusHandlerTask.mCheckStatusRunnable.run(this);
                        CheckStatusHandlerTask checkStatusHandlerTask2 = CheckStatusHandlerTask.this;
                        if (checkStatusHandlerTask2.mIsAutoCheck) {
                            long j = checkStatusHandlerTask2.mDeltaCheckTimemillis;
                            if (j > 0) {
                                sendEmptyMessageDelayed(10, j);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i != 11) {
                    return;
                }
                CheckStatusHandlerTask checkStatusHandlerTask3 = CheckStatusHandlerTask.this;
                if (checkStatusHandlerTask3.mIsCheckStatus && (handler2 = checkStatusHandlerTask3.mHandler) == this) {
                    handler2.removeMessages(10);
                    CheckStatusHandlerTask checkStatusHandlerTask4 = CheckStatusHandlerTask.this;
                    checkStatusHandlerTask4.mIsCheckStatus = false;
                    checkStatusHandlerTask4.mHandler = null;
                    Runnable runnable = checkStatusHandlerTask4.mTimeoutRunnable;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        };
        this.mHandler = handler;
        this.mIsCheckStatus = true;
        handler.sendEmptyMessage(10);
        long j = this.mTimeoutTimemillis;
        if (j <= 0 || this.mTimeoutRunnable == null) {
            return;
        }
        this.mHandler.sendEmptyMessageDelayed(11, j);
    }

    public void stop() {
        this.mIsCheckStatus = false;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeMessages(10);
            this.mHandler.removeMessages(11);
            this.mHandler = null;
        }
    }
}
