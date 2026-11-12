package com.xiaomi.hm.health.bt.device;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes11.dex */
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
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                HMCallback.this.onStart();
                return;
            }
            if (i == 1) {
                Object obj = message.obj;
                if (obj instanceof Boolean) {
                    HMCallback.this.onFinish(((Boolean) obj).booleanValue());
                    return;
                } else {
                    HMCallback.this.onFinish(obj);
                    return;
                }
            }
            if (i == 2) {
                HMCallback.this.onData(message.obj);
            } else {
                if (i != 3) {
                    return;
                }
                HMCallback.this.onProgress((Progress) message.obj);
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

    public void onProgress(Progress progress) {
    }

    public void onStart() {
    }

    public void sendFinishMessage(boolean z) {
        sendOnFinishMessage(z);
    }

    public void sendOnDataMessage(T t) {
        if (!this.mIsOnUIThread) {
            onData(t);
            return;
        }
        Message messageObtainMessage = this.handler.obtainMessage(2);
        messageObtainMessage.obj = t;
        this.handler.sendMessage(messageObtainMessage);
    }

    public void sendOnFinishMessage(boolean z) {
        if (!this.mIsOnUIThread) {
            onFinish(z);
            return;
        }
        Message messageObtainMessage = this.handler.obtainMessage(1);
        messageObtainMessage.obj = Boolean.valueOf(z);
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

    public void onFinish(boolean z) {
    }

    public HMCallback(boolean z) {
        this.TAG = "HMCallback";
        this.mIsOnUIThread = true;
        this.handler = new a(Looper.getMainLooper());
        this.mIsOnUIThread = z;
    }

    public void sendOnFinishMessage(T t) {
        if (this.mIsOnUIThread) {
            Message messageObtainMessage = this.handler.obtainMessage(1);
            messageObtainMessage.obj = t;
            this.handler.sendMessage(messageObtainMessage);
            return;
        }
        onFinish(t);
    }
}
