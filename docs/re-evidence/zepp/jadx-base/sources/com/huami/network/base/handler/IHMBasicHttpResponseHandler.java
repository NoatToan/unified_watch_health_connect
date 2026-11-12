package com.huami.network.base.handler;

import com.huami.network.base.model.HMHttpResponseData;

/* JADX INFO: loaded from: classes6.dex */
public interface IHMBasicHttpResponseHandler {
    void onCancel(int i);

    void onCompleted();

    void onError(Throwable th);

    void onFailure(HMHttpResponseData hMHttpResponseData);

    void onSuccess(HMHttpResponseData hMHttpResponseData);
}
