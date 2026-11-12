package com.xiaomi.smarthome.core.server.internal.bluetooth.blecore;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BleAsyncCallback<R, E extends BleNetError> {
    private static final int MSG_FAILURE = 2;
    private static final int MSG_SUCCESS = 1;
    private Handler mDispatcher;

    public static class Dispatcher<R, E extends BleNetError> extends Handler {
        private BleAsyncCallback<R, E> mCallback;

        public Dispatcher(BleAsyncCallback bleAsyncCallback, Looper looper) {
            super(looper);
            this.mCallback = bleAsyncCallback;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 1) {
                    this.mCallback.onSuccess((R) message.obj);
                } else if (i == 2) {
                    this.mCallback.onFailure((BleNetError) message.obj);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public BleAsyncCallback() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            this.mDispatcher = new Dispatcher(this, Looper.getMainLooper());
        } else {
            this.mDispatcher = new Dispatcher(this, looperMyLooper);
        }
    }

    public abstract void onFailure(E e);

    public abstract void onSuccess(R r2);

    public void sendFailureMessage(E e) {
        Handler handler = this.mDispatcher;
        handler.sendMessage(handler.obtainMessage(2, e));
    }

    public void sendSuccessMessage(R r2) {
        Handler handler = this.mDispatcher;
        handler.sendMessage(handler.obtainMessage(1, r2));
    }
}
