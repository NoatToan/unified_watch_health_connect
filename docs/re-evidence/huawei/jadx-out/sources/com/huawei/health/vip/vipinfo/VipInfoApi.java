package com.huawei.health.vip.vipinfo;

import com.huawei.hms.framework.network.restclient.Submit;
import com.huawei.hms.framework.network.restclient.annotate.Body;
import com.huawei.hms.framework.network.restclient.annotate.GET;
import com.huawei.hms.framework.network.restclient.annotate.HeaderMap;
import com.huawei.hms.framework.network.restclient.annotate.POST;
import com.huawei.hms.framework.network.restclient.annotate.QueryMap;
import com.huawei.hms.framework.network.restclient.annotate.Url;
import defpackage.irv;
import defpackage.isd;
import defpackage.isf;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public interface VipInfoApi {
    @GET
    Submit<irv> getSummaryInfo(@Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2);

    @GET
    Submit<isf> getTransferBenefitsList(@Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2);

    @GET
    Submit<VipInfoRsp> getVipMemberInfo(@Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2);

    @GET
    Submit<isd> getVipMemberType(@Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2);

    @GET
    Submit<VipMessageRsp> getVipMessage(@Url String str, @HeaderMap Map<String, String> map);

    @GET
    Submit<VipMessageListRsp> getVipMessageList(@Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2);

    @GET
    Submit<VipSharedInvitationListRsp> getVipSharedInvitationList(@Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2);

    @POST
    Submit<VipMessageReadRsp> setVipMessageRead(@Url String str, @HeaderMap Map<String, String> map, @Body String str2);
}
