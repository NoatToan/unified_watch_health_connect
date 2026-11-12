package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.server.AdContentReq;
import com.huawei.openalliance.ad.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.beans.server.AdPreReq;
import com.huawei.openalliance.ad.beans.server.AdPreRsp;
import com.huawei.openalliance.ad.beans.server.AnalysisReportReq;
import com.huawei.openalliance.ad.beans.server.AppConfigReq;
import com.huawei.openalliance.ad.beans.server.AppConfigRsp;
import com.huawei.openalliance.ad.beans.server.ConsentConfigReq;
import com.huawei.openalliance.ad.beans.server.ConsentConfigRsp;
import com.huawei.openalliance.ad.beans.server.EventReportReq;
import com.huawei.openalliance.ad.beans.server.EventReportRsp;
import com.huawei.openalliance.ad.beans.server.PermissionReq;
import com.huawei.openalliance.ad.beans.server.PermissionRsp;
import com.huawei.openalliance.ad.net.http.Response;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface kc {
    @kt(a = "adxServerFb")
    @ko
    Response<AdContentRsp> a(@ki int i, @kh AdContentReq adContentReq, @km Map<String, String> map);

    @kt(a = "adxServer")
    @ko
    Response<AdPreRsp> a(@kh AdPreReq adPreReq);

    @kt(a = "analyticsServer")
    @ko
    Response<EventReportRsp> a(@kh AnalysisReportReq analysisReportReq, @km Map<String, String> map);

    @kt(a = "consentConfigServer")
    @ko
    Response<ConsentConfigRsp> a(@kh ConsentConfigReq consentConfigReq, @km Map<String, String> map);

    @kt(a = "eventServer")
    @ko
    Response<EventReportRsp> a(@kh EventReportReq eventReportReq, @km Map<String, String> map);

    @kt(a = "permissionServer")
    @ko
    Response<PermissionRsp> a(@kh PermissionReq permissionReq, @km Map<String, String> map);

    @kt(a = "adxServer")
    @ko
    Response<AdContentRsp> a(@kk boolean z, @kh AdContentReq adContentReq, @km Map<String, String> map);

    @kt(a = "configServer")
    @ko
    Response<AppConfigRsp> a(@kk boolean z, @kh AppConfigReq appConfigReq, @km Map<String, String> map);

    @kt(a = "adxServer")
    @ko
    Response<String> b(@kk boolean z, @kh AdContentReq adContentReq, @km Map<String, String> map);
}
