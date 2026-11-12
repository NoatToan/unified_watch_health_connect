package com.xiaomi.smarthome.library.http.async;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.smarthome.library.http.Error;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AsyncHandler<R, E extends Error> implements OkhttpCallback<R> {
    private static final int MSG_FAILURE = 2;
    private static final int MSG_PROGRESS = 1;
    private static final int MSG_SUCCESS = 0;
    private Handler mDispatchHandler;

    public static class DispatchHandler<R, E extends Error> extends Handler {
        private AsyncHandler<R, E> mCallback;

        public DispatchHandler(AsyncHandler asyncHandler, Looper looper) {
            super(looper);
            this.mCallback = asyncHandler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                SuccessMessage successMessage = (SuccessMessage) message.obj;
                this.mCallback.onSuccess(successMessage.result, successMessage.response);
            } else if (i == 1) {
                ProgressMessage progressMessage = (ProgressMessage) message.obj;
                this.mCallback.onProgress(progressMessage.bytesWritten, progressMessage.totalSize);
            } else {
                if (i != 2) {
                    return;
                }
                FailureMessage failureMessage = (FailureMessage) message.obj;
                this.mCallback.onFailure(failureMessage.error, failureMessage.e, failureMessage.response);
            }
        }
    }

    public static class FailureMessage<E extends Error> {
        Exception e;
        E error;
        Response response;

        private FailureMessage() {
        }
    }

    public static class ProgressMessage {
        long bytesWritten;
        long totalSize;

        private ProgressMessage() {
        }
    }

    public static class SuccessMessage<R> {
        Response response;
        R result;

        private SuccessMessage() {
        }
    }

    public AsyncHandler() {
        Looper looperMyLooper = Looper.myLooper();
        this.mDispatchHandler = new DispatchHandler(this, looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
    }

    public void onProgress(long j, long j2) {
    }

    public abstract void processFailure(Call call, IOException iOException);

    public abstract void processResponse(Response response);

    public final void sendFailureMessage(E e, Exception exc, Response response) {
        FailureMessage failureMessage = new FailureMessage();
        failureMessage.error = e;
        failureMessage.e = exc;
        failureMessage.response = response;
        Handler handler = this.mDispatchHandler;
        handler.sendMessage(handler.obtainMessage(2, failureMessage));
    }

    public void sendProgressMessage(long j, long j2) {
        ProgressMessage progressMessage = new ProgressMessage();
        progressMessage.bytesWritten = j;
        progressMessage.totalSize = j2;
        Handler handler = this.mDispatchHandler;
        handler.sendMessage(handler.obtainMessage(1, progressMessage));
    }

    public void sendSuccessMessage(R r2, Response response) {
        SuccessMessage successMessage = new SuccessMessage();
        successMessage.result = r2;
        successMessage.response = response;
        Handler handler = this.mDispatchHandler;
        handler.sendMessage(handler.obtainMessage(0, successMessage));
    }
}
