package com.mibi.sdk.task;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RxBaseSuccessHandler<R> {
    public void call(R r2) {
        try {
            handleSuccess(r2);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException("exception occurs in onNext", e);
        }
    }

    public abstract void handleSuccess(R r2);
}
