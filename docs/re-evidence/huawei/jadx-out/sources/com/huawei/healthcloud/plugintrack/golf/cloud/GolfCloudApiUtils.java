package com.huawei.healthcloud.plugintrack.golf.cloud;

import android.content.Context;
import com.huawei.healthcloud.plugintrack.golf.cloud.requests.GetGolfCourseDataReq;
import com.huawei.healthcloud.plugintrack.golf.cloud.requests.GetGolfCourseDetailReq;
import com.huawei.healthcloud.plugintrack.golf.cloud.requests.GetGolfCourseMapDataReq;
import com.huawei.healthcloud.plugintrack.golf.cloud.requests.GolfClubListDataReq;
import com.huawei.healthcloud.plugintrack.golf.cloud.requests.GolfCourseBriefInfosReq;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.GetGolfCourseDataRsp;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.GetGolfCourseDetailRsp;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.GetGolfCourseMapDataRsp;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.GolfClubListInfoDataRsp;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.GolfCourseBrieInfosRsp;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.fxl;
import defpackage.oet;
import defpackage.ofe;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class GolfCloudApiUtils {
    private static final String CLIENT_TYPE = "clientType";
    private static final Object LOCK = new Object();
    private static final String TAG = "GolfCloudApiUtils";
    private static volatile GolfCloudApiUtils sCloudUtils;
    private final HealthDataCloudFactory mParamsFactory = new HealthDataCloudFactory(BaseApplication.getContext());

    private GolfCloudApiUtils() {
    }

    protected GetGolfCourseDetailRsp requestCourseDetails(GetGolfCourseDetailReq getGolfCourseDetailReq) {
        Map<String, Object> body = this.mParamsFactory.getBody(getGolfCourseDetailReq);
        body.put("language", getGolfCourseDetailReq.getLanguage());
        body.put("clientType", fxl.d());
        Map<String, String> headers = this.mParamsFactory.getHeaders();
        setGolfAt(BaseApplication.getContext(), headers, body, getGolfCourseDetailReq.isAnon());
        return (GetGolfCourseDetailRsp) oet.d().e(getGolfCourseDetailReq.getUrl(), headers, ofe.c(body), GetGolfCourseDetailRsp.class);
    }

    protected GetGolfCourseDataRsp requestCourseData(GetGolfCourseDataReq getGolfCourseDataReq) {
        Map<String, Object> body = this.mParamsFactory.getBody(getGolfCourseDataReq);
        body.put("language", getGolfCourseDataReq.getLanguage());
        body.put("clientType", fxl.d());
        Map<String, String> headers = this.mParamsFactory.getHeaders();
        setGolfAt(BaseApplication.getContext(), headers);
        return (GetGolfCourseDataRsp) oet.d().e(getGolfCourseDataReq.getUrl(), headers, ofe.c(body), GetGolfCourseDataRsp.class);
    }

    protected GetGolfCourseMapDataRsp requestCourseMapData(GetGolfCourseMapDataReq getGolfCourseMapDataReq) {
        Map<String, Object> body = this.mParamsFactory.getBody(getGolfCourseMapDataReq);
        body.put("language", getGolfCourseMapDataReq.getLanguage());
        body.put("clientType", fxl.d());
        Map<String, String> headers = this.mParamsFactory.getHeaders();
        setGolfAt(BaseApplication.getContext(), headers, body, getGolfCourseMapDataReq.isAnon());
        return (GetGolfCourseMapDataRsp) oet.d().e(getGolfCourseMapDataReq.getUrl(), headers, ofe.c(body), GetGolfCourseMapDataRsp.class);
    }

    private void setGolfAt(Context context, Map<String, String> map, Map<String, Object> map2, boolean z) {
        String strD;
        if (map == null) {
            LogUtil.a(TAG, "headers is null");
            return;
        }
        if (z) {
            if (map2 != null) {
                map2.remove("deviceId");
            }
            map.remove("x-huid");
        } else {
            map.put(CloudParamKeys.X_TOKEN_TYPE, String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
            map.put(CloudParamKeys.X_TOKEN, LoginInit.getInstance(context).getAccountInfo(1008));
        }
        if (LoginInit.getInstance(context).isLoginedByWear()) {
            LogUtil.a(TAG, "callService appid wear logined");
            strD = "com.huawei.bone";
        } else {
            LogUtil.a(TAG, "callService appid health logined");
            strD = com.huawei.haf.application.BaseApplication.d();
        }
        map.put(CloudParamKeys.X_APP_ID, strD);
        map.put(CloudParamKeys.X_SITE_ID, String.valueOf(LoginInit.getInstance(context).getSiteId()));
        LogUtil.a(TAG, "callService getSiteId=", Integer.valueOf(LoginInit.getInstance(context).getSiteId()));
    }

    private void setGolfAt(Context context, Map<String, String> map) {
        setGolfAt(context, map, null, false);
    }

    protected GolfClubListInfoDataRsp requestGolfClubListInfoData(GolfClubListDataReq golfClubListDataReq) {
        Map<String, Object> body = this.mParamsFactory.getBody(golfClubListDataReq);
        body.put("language", golfClubListDataReq.getLanguage());
        body.put("version", golfClubListDataReq.getVersion());
        body.put("clientType", fxl.d());
        Map<String, String> headers = this.mParamsFactory.getHeaders();
        setGolfAt(BaseApplication.getContext(), headers);
        return (GolfClubListInfoDataRsp) oet.d().e(golfClubListDataReq.getUrl(), headers, ofe.c(body), GolfClubListInfoDataRsp.class);
    }

    protected GolfCourseBrieInfosRsp requestGolfBrieInfoData(GolfCourseBriefInfosReq golfCourseBriefInfosReq) {
        Map<String, Object> body = this.mParamsFactory.getBody(golfCourseBriefInfosReq);
        body.put("language", golfCourseBriefInfosReq.getLanguage());
        body.put("clientType", fxl.d());
        Map<String, String> headers = this.mParamsFactory.getHeaders();
        setGolfAt(BaseApplication.getContext(), headers);
        return (GolfCourseBrieInfosRsp) oet.d().e(golfCourseBriefInfosReq.getUrl(), headers, ofe.c(body), GolfCourseBrieInfosRsp.class);
    }

    protected static GolfCloudApiUtils getInstance() {
        if (sCloudUtils == null) {
            synchronized (LOCK) {
                if (sCloudUtils == null) {
                    sCloudUtils = new GolfCloudApiUtils();
                }
            }
        }
        return sCloudUtils;
    }
}
