package com.xiaomi.wearable.core;

import androidx.annotation.Keep;
import com.xiaomi.wearable.core.client.Logger;
import com.xiaomi.wearable.transport.queue.ITaskQueue;
import com.xiaomi.wearable.wear.api.Callback;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class WearApiTask {
    private static final String TAG = "WearApiTask";
    public static final AtomicInteger taskId = new AtomicInteger(0);
    private final Callback mCallback;
    private volatile boolean mCanceled;
    private final byte[] mData;
    private final int mID = taskId.getAndIncrement();
    private int mMassId;
    private final boolean mNeedResponse;
    private final ITaskQueue mQueue;
    private volatile boolean mResulted;
    private final int mTimeout;
    private final int mType;

    public WearApiTask(ITaskQueue iTaskQueue, int i, byte[] bArr, boolean z, Callback callback, int i2, int i3) {
        this.mMassId = 0;
        this.mQueue = iTaskQueue;
        this.mType = i;
        this.mData = bArr;
        this.mNeedResponse = z;
        this.mCallback = callback;
        this.mTimeout = i2;
        this.mMassId = i3;
    }

    public synchronized void cancel() {
        if (!this.mResulted && !this.mCanceled) {
            this.mCanceled = true;
            this.mQueue.cancel(this);
        }
    }

    public Callback getCallback() {
        return this.mCallback;
    }

    public byte[] getData() {
        return this.mData;
    }

    public int getId() {
        return this.mID;
    }

    public int getMassDataId() {
        return this.mMassId;
    }

    public int getTimeout() {
        return this.mTimeout;
    }

    public int getType() {
        return this.mType;
    }

    public synchronized boolean isCanceled() {
        return this.mCanceled;
    }

    public boolean isMassTask() {
        return this.mMassId != 0;
    }

    public boolean needResponse() {
        return this.mNeedResponse;
    }

    public void onDisconnect() {
        onResult(-3, null);
    }

    public void onReceiveResponse(byte[] bArr) {
        this.mQueue.onReceiveResponse(this);
        onResult(0, bArr);
    }

    public void onResponseTimeout() {
        this.mQueue.onResponseTimeout(this);
        onResult(-6, null);
    }

    public void onResult(int i) {
        onResult(i, null);
    }

    public void onSendResult(int i) {
        CoreExtKt.logger.i(TAG, "onSendResult  code=" + i + "  " + this);
        if (i == 0) {
            this.mQueue.onSendSuccess(this);
            if (needResponse()) {
                return;
            }
        } else {
            this.mQueue.onSendFailed(this, i == -1);
        }
        onResult(i, null);
    }

    public String toString() {
        return "WearApiTask(hasCode:" + hashCode() + ", id=" + this.mID + ", type=" + this.mType + ", timeout=" + this.mTimeout;
    }

    private void onResult(int i, byte[] bArr) {
        if (this.mResulted) {
            CoreExtKt.logger.i(TAG, "onResult  code=" + i + "   has resulted " + this);
            return;
        }
        this.mResulted = true;
        if (this.mCallback == null) {
            CoreExtKt.logger.e(TAG, "onResult  no callback  " + this);
            return;
        }
        Logger logger = CoreExtKt.logger;
        StringBuilder sb = new StringBuilder();
        sb.append("onResult has data=");
        sb.append(bArr != null);
        sb.append("  ");
        sb.append(this);
        logger.i(TAG, sb.toString());
        this.mCallback.onCallback(new WearApiResult(i, bArr));
    }
}
