package com.xiaomi.smarthome.library.util;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.smarthome.library.common.util.MessageHandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public class GlobalHandlerManager {
    private static volatile GlobalHandlerManager sInstance;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private Handler mWorkHandler;

    private GlobalHandlerManager() {
        MessageHandlerThread messageHandlerThread = new MessageHandlerThread("GlobalHandlerManager");
        messageHandlerThread.start();
        this.mWorkHandler = new Handler(messageHandlerThread.getLooper());
    }

    public static GlobalHandlerManager getInstance() {
        if (sInstance == null) {
            synchronized (GlobalHandlerManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new GlobalHandlerManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public Handler getGlobalHandler() {
        return this.mHandler;
    }

    public Handler getGlobalWorkerHandler() {
        return this.mWorkHandler;
    }
}
