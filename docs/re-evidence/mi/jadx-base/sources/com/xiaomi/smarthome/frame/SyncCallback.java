package com.xiaomi.smarthome.frame;

import com.xiaomi.smarthome.frame.Error;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SyncCallback<R, E extends Error> extends AsyncCallback<R, E> {
    private E mError;
    private R mResult;
    private boolean mIsSuccess = false;
    private Object mSyncLock = null;

    public E getError() {
        return this.mError;
    }

    public R getResult() {
        return this.mResult;
    }

    public Object getSyncLock() {
        return this.mSyncLock;
    }

    public boolean isSuccess() {
        return this.mIsSuccess;
    }

    public boolean isSyncLockMode() {
        return this.mSyncLock != null;
    }

    @Override // com.xiaomi.smarthome.frame.AsyncCallback
    public void sendFailureMessage(E e) {
        if (!isSyncLockMode()) {
            onFailure(e);
            return;
        }
        this.mIsSuccess = false;
        this.mError = e;
        synchronized (this.mSyncLock) {
            this.mSyncLock.notify();
        }
    }

    @Override // com.xiaomi.smarthome.frame.AsyncCallback
    public void sendSuccessMessage(R r2) {
        if (!isSyncLockMode()) {
            onSuccess(r2);
            return;
        }
        this.mIsSuccess = true;
        this.mResult = r2;
        synchronized (this.mSyncLock) {
            this.mSyncLock.notify();
        }
    }

    public void setUseSyncLockMode() {
        this.mSyncLock = new Object();
    }
}
