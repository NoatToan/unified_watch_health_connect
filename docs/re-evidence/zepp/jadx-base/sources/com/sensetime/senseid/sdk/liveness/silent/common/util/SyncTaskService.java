package com.sensetime.senseid.sdk.liveness.silent.common.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes18.dex */
public class SyncTaskService {
    private HandlerThread a;
    private Handler b;

    public static class a extends Handler {
        private final SyncTaskService a;

        public a(SyncTaskService syncTaskService, Looper looper) {
            super(looper);
            this.a = syncTaskService;
        }

        @Override // android.os.Handler
        public final void dispatchMessage(Message message) {
            this.a.onPreExecute(message.what);
            if (message.getCallback() != null) {
                message.getCallback().run();
            }
            this.a.onPostExecute(message.what);
        }
    }

    public void execute(int i, Runnable runnable) {
        Message messageObtain = Message.obtain(this.b, runnable);
        messageObtain.what = i;
        this.b.sendMessage(messageObtain);
    }

    public boolean hasTasks(int i) {
        return this.b.hasMessages(i);
    }

    public void onPostExecute(int i) {
    }

    public void onPreExecute(int i) {
    }

    public void shutdown() {
        HandlerThread handlerThread = this.a;
        if (handlerThread == null) {
            throw new IllegalStateException("Service is not started.");
        }
        handlerThread.quit();
        this.a = null;
        this.b = null;
    }

    public void start() {
        if (this.a != null) {
            throw new IllegalStateException("Service is started.");
        }
        HandlerThread handlerThread = new HandlerThread("SenseService");
        this.a = handlerThread;
        handlerThread.start();
        this.b = new a(this, this.a.getLooper());
    }
}
