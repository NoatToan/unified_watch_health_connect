package com.xiaomi.hm.health.bt.device;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes19.dex */
public class HMCallback<T> {
    private static final int CHANGED = 2;
    private static final int FINISH = 1;
    private static final int PROGRESS = 3;
    private static final int START = 0;
    private final String TAG;
    private Handler handler;
    private boolean mIsOnUIThread;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                HMCallback.this.onStart();
                return;
            }
            if (i == 1) {
                Object obj = msg.obj;
                if (obj instanceof Boolean) {
                    HMCallback.this.onFinish(((Boolean) obj).booleanValue());
                    return;
                } else {
                    HMCallback.this.onFinish(obj);
                    return;
                }
            }
            if (i == 2) {
                HMCallback.this.onData(msg.obj);
            } else {
                if (i != 3) {
                    return;
                }
                HMCallback.this.onProgress((Progress) msg.obj);
            }
        }
    }

    public HMCallback() {
        this.TAG = "HMCallback";
        this.mIsOnUIThread = true;
        this.handler = new a(Looper.getMainLooper());
    }

    public boolean isOnUIThread() {
        return this.mIsOnUIThread;
    }

    public void onData(T t) {
    }

    public void onFinish(T t) {
    }

    public void onFinish(boolean result) {
    }

    public void onProgress(Progress progress) {
    }

    public void onStart() {
    }

    public void sendFinishMessage(boolean obj) {
        sendOnFinishMessage(obj);
    }

    public void sendOnDataMessage(T obj) {
        if (!this.mIsOnUIThread) {
            onData(obj);
            return;
        }
        Message messageObtainMessage = this.handler.obtainMessage(2);
        messageObtainMessage.obj = obj;
        this.handler.sendMessage(messageObtainMessage);
    }

    public void sendOnFinishMessage(boolean obj) {
        if (!this.mIsOnUIThread) {
            onFinish(obj);
            return;
        }
        Message messageObtainMessage = this.handler.obtainMessage(1);
        messageObtainMessage.obj = Boolean.valueOf(obj);
        this.handler.sendMessage(messageObtainMessage);
    }

    public void sendOnProgressMessage(Progress progress) {
        if (!this.mIsOnUIThread) {
            onProgress(progress);
            return;
        }
        Message messageObtainMessage = this.handler.obtainMessage(3);
        messageObtainMessage.obj = progress;
        this.handler.sendMessage(messageObtainMessage);
    }

    public void sendOnStartMessage() {
        if (!this.mIsOnUIThread) {
            onStart();
        } else {
            this.handler.sendMessage(this.handler.obtainMessage(0));
        }
    }

    public HMCallback(boolean onUIThread) {
        this.TAG = "HMCallback";
        this.mIsOnUIThread = true;
        this.handler = new a(Looper.getMainLooper());
        this.mIsOnUIThread = onUIThread;
    }

    public void sendOnFinishMessage(T obj) {
        if (this.mIsOnUIThread) {
            Message messageObtainMessage = this.handler.obtainMessage(1);
            messageObtainMessage.obj = obj;
            this.handler.sendMessage(messageObtainMessage);
            return;
        }
        onFinish(obj);
    }
}
