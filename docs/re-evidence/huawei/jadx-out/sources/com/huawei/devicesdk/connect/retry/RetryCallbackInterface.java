package com.huawei.devicesdk.connect.retry;

/* JADX INFO: loaded from: classes4.dex */
public interface RetryCallbackInterface {
    void doFailureAction();

    void doRetryAction(int i);

    void doSuccessAction();
}
