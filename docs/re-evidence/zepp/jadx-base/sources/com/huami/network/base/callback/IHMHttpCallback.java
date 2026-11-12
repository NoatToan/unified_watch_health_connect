package com.huami.network.base.callback;

import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpRequestData;
import com.huami.network.base.model.HMHttpResponseData;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface IHMHttpCallback {
    Map<String, String> getHeader() throws Exception;

    void log(HMHttpResponseData hMHttpResponseData);

    boolean needCancelBeforeResponse(HMHttpRequestData hMHttpRequestData, HMHttpResponseData hMHttpResponseData, IHMBasicHttpResponseHandler iHMBasicHttpResponseHandler);

    boolean onPreRequest(Map<String, String> map, HMHttpRequestData hMHttpRequestData);
}
