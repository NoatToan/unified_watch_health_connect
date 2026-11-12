package com.huami.network.base.framework;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.http.AbsHMHttpInit;
import com.huami.network.base.http.IHMHttpClient;
import com.huami.network.base.model.HMHttpRequestData;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.tools.log.HMLog;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class HMHttpFramework<Request, Params, Entity, Header> extends AbsHMHttpInit<Request> implements IHMHttpClient<Params, Entity, Header> {
    private static final String a = "HMHttpFramework";
    public HMHttpConfig mConfig;
    public Request mRequest;

    @Override // com.huami.network.base.http.AbsHMHttpInit
    public Request createRequest(HMHttpConfig hMHttpConfig) {
        Request requestCreate = create();
        supportHttps(requestCreate, hMHttpConfig.isSupportHttps());
        supportGzip(requestCreate, hMHttpConfig.isSupportGzip());
        setRetries(requestCreate, hMHttpConfig.getRetries());
        setTimeout(requestCreate, hMHttpConfig.getTimeout());
        return requestCreate;
    }

    @Override // com.huami.network.base.http.AbsHMHttpInit
    public void init(HMHttpConfig hMHttpConfig) {
        this.mConfig = hMHttpConfig;
        this.mRequest = createRequest(HMHttpConfig.getDefault());
        HMLog.w(a, "createRequest:retries=" + hMHttpConfig.getRetries() + ";timeout=" + hMHttpConfig.getTimeout() + ";supportGzip=" + hMHttpConfig.isSupportGzip() + ";supportHttps:" + hMHttpConfig.isSupportHttps(), new Object[0]);
    }

    @Override // com.huami.network.base.http.IHMHttpClient
    public HMHttpResponseData request(HMHttpRequestData hMHttpRequestData, Support.RequestSupport requestSupport, @Nullable Map<String, String> map) {
        return response(this.mRequest, hMHttpRequestData, requestSupport, map);
    }

    public abstract HMHttpResponseData response(Request request, HMHttpRequestData hMHttpRequestData, Support.RequestSupport requestSupport, @Nullable Map<String, String> map);

    @Override // com.huami.network.base.http.IHMHttpClient
    public HMHttpResponseData request(HMHttpRequestData hMHttpRequestData, Support.RequestSupport requestSupport, @Nullable Map<String, String> map, @NonNull HMHttpConfig hMHttpConfig) {
        return this.mConfig.equals(hMHttpConfig) ? request(hMHttpRequestData, requestSupport, map) : response(createRequest(hMHttpConfig), hMHttpRequestData, requestSupport, map);
    }
}
