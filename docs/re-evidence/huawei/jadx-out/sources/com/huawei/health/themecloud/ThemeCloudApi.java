package com.huawei.health.themecloud;

import com.huawei.hms.framework.network.restclient.Submit;
import com.huawei.hms.framework.network.restclient.annotate.FieldMap;
import com.huawei.hms.framework.network.restclient.annotate.FormUrlEncoded;
import com.huawei.hms.framework.network.restclient.annotate.GET;
import com.huawei.hms.framework.network.restclient.annotate.HeaderMap;
import com.huawei.hms.framework.network.restclient.annotate.POST;
import com.huawei.hms.framework.network.restclient.annotate.QueryMap;
import com.huawei.hms.framework.network.restclient.annotate.Url;
import defpackage.iju;
import defpackage.ijz;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public interface ThemeCloudApi {
    @POST
    @FormUrlEncoded
    Submit<iju> getSign(@Url String str, @HeaderMap Map<String, String> map, @FieldMap Map<String, String> map2);

    @GET
    Submit<ijz> productQueryByType(@Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2);
}
