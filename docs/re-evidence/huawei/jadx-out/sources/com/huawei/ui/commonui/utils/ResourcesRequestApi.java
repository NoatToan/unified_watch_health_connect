package com.huawei.ui.commonui.utils;

import com.huawei.hms.framework.network.restclient.Submit;
import com.huawei.hms.framework.network.restclient.annotate.Body;
import com.huawei.hms.framework.network.restclient.annotate.HeaderMap;
import com.huawei.hms.framework.network.restclient.annotate.POST;
import com.huawei.hms.framework.network.restclient.annotate.Url;
import defpackage.qqi;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public interface ResourcesRequestApi {
    @POST
    Submit<List<qqi>> getResourcesConfigList(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);
}
