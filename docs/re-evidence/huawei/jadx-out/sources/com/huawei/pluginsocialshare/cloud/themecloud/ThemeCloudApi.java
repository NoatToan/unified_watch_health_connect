package com.huawei.pluginsocialshare.cloud.themecloud;

import com.huawei.hms.framework.network.restclient.Submit;
import com.huawei.hms.framework.network.restclient.annotate.Body;
import com.huawei.hms.framework.network.restclient.annotate.FieldMap;
import com.huawei.hms.framework.network.restclient.annotate.FormUrlEncoded;
import com.huawei.hms.framework.network.restclient.annotate.HeaderMap;
import com.huawei.hms.framework.network.restclient.annotate.POST;
import com.huawei.hms.framework.network.restclient.annotate.Url;
import defpackage.plh;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface ThemeCloudApi {
    @POST
    Submit<plh> getThemeList(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    @FormUrlEncoded
    Submit<ThemeSignData> getThemeSign(@Url String str, @HeaderMap Map<String, String> map, @FieldMap Map<String, Object> map2);
}
