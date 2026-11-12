package com.xiaomi.smarthome.library.common.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public class MessageHandlerThread extends HandlerThread {
    private static final int DUR_TIME = 7200000;
    private static final int MSG_EMPTY_MSG = 1;
    private Handler mHandler;

    public MessageHandlerThread(String str) {
        super(str);
    }

    public void init() {
        Handler handler = new Handler(getLooper()) { // from class: com.xiaomi.smarthome.library.common.util.MessageHandlerThread.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                MessageHandlerThread.this.mHandler.sendEmptyMessageDelayed(1, 7200000L);
            }
        };
        this.mHandler = handler;
        handler.sendEmptyMessageDelayed(1, 7200000L);
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            if (Looper.myLooper() != null) {
                return;
            }
            super.run();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(getName(), e);
        }
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        super.start();
        init();
    }

    public MessageHandlerThread(String str, int i) {
        super(str, i);
    }
}
