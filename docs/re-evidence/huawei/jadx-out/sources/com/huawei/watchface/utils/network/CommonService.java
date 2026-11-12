package com.huawei.watchface.utils.network;

import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.restclient.anno.Body;
import com.huawei.hms.network.restclient.anno.GET;
import com.huawei.hms.network.restclient.anno.HeaderMap;
import com.huawei.hms.network.restclient.anno.NetworkParameters;
import com.huawei.hms.network.restclient.anno.POST;
import com.huawei.hms.network.restclient.anno.Url;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public interface CommonService {
    @GET
    Submit<String> get(@Url String str, @HeaderMap Map<String, String> map);

    @GET
    Submit<String> get(@Url String str, @HeaderMap Map<String, String> map, @NetworkParameters String str2);

    @POST
    Submit<String> post(@Url String str, @HeaderMap Map<String, String> map, @Body RequestBody requestBody);

    @POST
    Submit<String> post(@Url String str, @HeaderMap Map<String, String> map, @Body RequestBody requestBody, @NetworkParameters String str2);

    @POST
    Submit<String> post(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<String> post(@Url String str, @HeaderMap Map<String, String> map, @Body String str2, @NetworkParameters String str3);
}
