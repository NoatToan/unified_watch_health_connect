package com.huami.network.base.handler;

import com.huami.network.base.model.HMHttpResponseData;

/* JADX INFO: loaded from: classes6.dex */
public abstract class IHMHttpResponseHandler implements IHMBasicHttpResponseHandler {
    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
    public final void onFailure(HMHttpResponseData hMHttpResponseData) {
        onItem(hMHttpResponseData);
    }

    public abstract void onItem(HMHttpResponseData hMHttpResponseData);

    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
    public final void onSuccess(HMHttpResponseData hMHttpResponseData) {
        onItem(hMHttpResponseData);
    }
}
