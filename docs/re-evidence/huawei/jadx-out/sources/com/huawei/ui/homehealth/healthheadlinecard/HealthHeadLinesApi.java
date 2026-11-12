package com.huawei.ui.homehealth.healthheadlinecard;

import com.huawei.hms.framework.network.restclient.Submit;
import com.huawei.hms.framework.network.restclient.annotate.Body;
import com.huawei.hms.framework.network.restclient.annotate.HeaderMap;
import com.huawei.hms.framework.network.restclient.annotate.POST;
import com.huawei.hms.framework.network.restclient.annotate.Url;
import defpackage.snj;
import defpackage.snl;
import defpackage.snm;
import defpackage.sno;
import defpackage.snr;
import defpackage.snt;
import defpackage.sny;
import defpackage.sob;
import defpackage.soc;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface HealthHeadLinesApi {
    @POST
    Submit<snr> getAudioWorkoutInfo(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<sno> getBehaviorList(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<snl> getLecturerInfo(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<snj> getWorkoutListHistory(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<snm> getWorkoutsByTopicId(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<snt> setWorkoutPlay(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<soc> userAccumulatedPlayDuration(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<sob> userBehaviorList(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);

    @POST
    Submit<sny> userPlayRecord(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);
}
