package com.huami.network.base.http;

import androidx.annotation.Nullable;
import com.huami.network.base.HMHttpConfig;
import com.huami.network.base.model.HMHttpRequestData;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public interface IHMHttpClient<Params, Entity, Header> {
    boolean cancel(String str);

    void cancelAll();

    Header map2Header(Map<String, String> map);

    Params map2Params(Map<String, Object> map);

    HMHttpResponseData request(HMHttpRequestData hMHttpRequestData, Support.RequestSupport requestSupport, @Nullable Map<String, String> map);

    HMHttpResponseData request(HMHttpRequestData hMHttpRequestData, Support.RequestSupport requestSupport, @Nullable Map<String, String> map, HMHttpConfig hMHttpConfig);

    Entity set2Entity(Set<Object> set);
}
