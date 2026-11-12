package com.huami.network.hmnetwork.handler;

import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.webapi.WebResponse;

/* JADX INFO: loaded from: classes6.dex */
public abstract class IHMSimpleHttpResponseHandler implements IHMBasicHttpResponseHandler {
    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
    public void onCancel(int i) {
    }

    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
    public void onCompleted() {
    }

    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
    public void onError(Throwable th) {
    }

    @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
    public final void onSuccess(HMHttpResponseData hMHttpResponseData) {
        if (hMHttpResponseData.isSuccess() && hMHttpResponseData.getResponseBody() == null) {
            onSuccess(WebResponse.createNoBodySuccessResponse(), hMHttpResponseData);
        } else {
            onSuccess(WebResponse.parse(new String(hMHttpResponseData.getResponseBody())), hMHttpResponseData);
        }
    }

    public abstract void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData);
}
