package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.inner.AdRequestParam;
import com.huawei.openalliance.ad.beans.metadata.AdEvent;
import com.huawei.openalliance.ad.beans.metadata.AppCollection;
import com.huawei.openalliance.ad.beans.server.AdContentReq;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.beans.server.AdPreReq;
import com.huawei.openalliance.ad.beans.server.AppConfigRsp;
import com.huawei.openalliance.ad.beans.server.AppDataCollectionRsp;
import com.huawei.openalliance.ad.beans.server.ConsentConfigReq;
import com.huawei.openalliance.ad.beans.server.ConsentConfigRsp;
import com.huawei.openalliance.ad.beans.server.EventReportRsp;
import com.huawei.openalliance.ad.beans.server.PermissionRsp;
import com.huawei.openalliance.ad.beans.server.ThirdReportRsp;
import com.huawei.openalliance.ad.net.http.Response;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface gf {
    AppConfigRsp a(String str);

    ConsentConfigRsp a(String str, ConsentConfigReq consentConfigReq);

    EventReportRsp a(List<AdEvent> list);

    PermissionRsp a(String str, String str2, String str3, int i, int i2);

    Response<AdContentRsp> a(AdRequestParam adRequestParam);

    Response<String> a(AdContentReq adContentReq);

    so a(sn snVar);

    Map<Integer, AdContentRsp> a(String str, long j, List<String> list);

    void a(AdPreReq adPreReq);

    AdContentReq b(AdRequestParam adRequestParam);

    AppDataCollectionRsp b(List<AppCollection> list);

    ThirdReportRsp b(String str);
}
