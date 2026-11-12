package com.huawei.health.marketing.request;

import com.huawei.hms.framework.network.restclient.Submit;
import com.huawei.hms.framework.network.restclient.annotate.Body;
import com.huawei.hms.framework.network.restclient.annotate.HeaderMap;
import com.huawei.hms.framework.network.restclient.annotate.POST;
import com.huawei.hms.framework.network.restclient.annotate.Url;
import defpackage.goa;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface SleepAudioInfoApi {
    @POST
    Submit<goa> addSleepPlayLog(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<RespSleepAudioInfo> getSleepAudioList(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<goa> postBehavior(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<RespQueryAudiosPackageBySeriesId> queryAudiosPackageBySeriesId(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<goa> saveSleepPlayRecord(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);
}
