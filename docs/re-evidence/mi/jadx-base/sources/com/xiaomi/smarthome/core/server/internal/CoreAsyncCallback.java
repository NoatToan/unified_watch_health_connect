package com.xiaomi.smarthome.core.server.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.smarthome.core.server.internal.CoreError;

/* JADX INFO: loaded from: classes10.dex */
public abstract class CoreAsyncCallback<R, E extends CoreError> {
    private static final int MSG_FAILURE = 1;
    private static final int MSG_SUCCESS = 0;
    private Handler mDispatcher;

    public static class Dispatcher<R, E extends CoreError> extends Handler {
        private CoreAsyncCallback<R, E> mCallback;

        public Dispatcher(CoreAsyncCallback coreAsyncCallback, Looper looper) {
            super(looper);
            this.mCallback = coreAsyncCallback;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.mCallback.onSuccess((R) message.obj);
            } else {
                if (i != 1) {
                    return;
                }
                this.mCallback.onFailure((CoreError) message.obj);
            }
        }
    }

    public CoreAsyncCallback() {
        this(Looper.myLooper());
    }

    public abstract void onFailure(E e);

    public abstract void onSuccess(R r2);

    public void sendFailureMessage(E e) {
        Handler handler = this.mDispatcher;
        handler.sendMessage(handler.obtainMessage(1, e));
    }

    public void sendSuccessMessage(R r2) {
        Handler handler = this.mDispatcher;
        handler.sendMessage(handler.obtainMessage(0, r2));
    }

    public CoreAsyncCallback(Looper looper) {
        if (looper == null) {
            throw new RuntimeException("Async Callback must have Looper");
        }
        this.mDispatcher = new Dispatcher(this, looper);
    }
}
