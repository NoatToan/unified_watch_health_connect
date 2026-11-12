package com.huawei.codevalueplatform.auth;

import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.restclient.anno.GET;
import com.huawei.hms.network.restclient.anno.QueryMap;
import defpackage.cho;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
interface OAuthApi {
    @GET("/rest.php?")
    Submit<cho> getOAuthInfo(@QueryMap Map<String, String> map);
}
