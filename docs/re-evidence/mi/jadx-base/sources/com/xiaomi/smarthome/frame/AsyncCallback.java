package com.xiaomi.smarthome.frame;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.smarthome.frame.Error;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsyncCallback<R, E extends Error> {
    private static final int MSG_CACHE = 0;
    private static final int MSG_FAILURE = 2;
    private static final int MSG_SUCCESS = 1;
    private Handler mDispatcher;

    public static class Dispatcher<R, E extends Error> extends Handler {
        private AsyncCallback<R, E> mCallback;

        public Dispatcher(AsyncCallback asyncCallback, Looper looper) {
            super(looper);
            this.mCallback = asyncCallback;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 0) {
                    this.mCallback.onCache((R) message.obj);
                } else if (i == 1) {
                    this.mCallback.onSuccess((R) message.obj);
                } else if (i == 2) {
                    this.mCallback.onFailure((Error) message.obj);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public AsyncCallback() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.mDispatcher = new Dispatcher(this, looperMyLooper);
        } else {
            if (this instanceof SyncCallback) {
                return;
            }
            this.mDispatcher = new Dispatcher(this, Looper.getMainLooper());
        }
    }

    public void onCache(R r2) {
    }

    public abstract void onFailure(E e);

    public abstract void onSuccess(R r2);

    public void sendCacheMessage(R r2) {
        Handler handler = this.mDispatcher;
        handler.sendMessage(handler.obtainMessage(0, r2));
    }

    public void sendFailureMessage(E e) {
        Handler handler = this.mDispatcher;
        handler.sendMessage(handler.obtainMessage(2, e));
    }

    public void sendSuccessMessage(R r2) {
        Handler handler = this.mDispatcher;
        handler.sendMessage(handler.obtainMessage(1, r2));
    }
}
