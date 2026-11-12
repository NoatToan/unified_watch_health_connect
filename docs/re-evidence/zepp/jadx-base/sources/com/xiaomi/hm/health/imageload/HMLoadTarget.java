package com.xiaomi.hm.health.imageload;

/* JADX INFO: loaded from: classes21.dex */
public abstract class HMLoadTarget<R> {
    public void onLoadCancel() {
    }

    public void onLoadFailed(Exception exc) {
    }

    public abstract void onLoadFinish(R r);

    public void onLoadStarted() {
    }
}
