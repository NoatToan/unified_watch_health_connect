package com.huawei.healthcloud.plugintrack.golf.cloud;

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
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class CloudImpl implements CloudApi {
    private static final String TAG = "Track_CloudImpl";

    @Override // com.huawei.healthcloud.plugintrack.golf.cloud.CloudApi
    public GetGolfCourseDetailRsp getGolfCourseDetail(GetGolfCourseDetailReq getGolfCourseDetailReq) {
        LogUtil.a(TAG, "getGolfCourseDetail: Request Received, processing.....");
        GetGolfCourseDetailRsp courseDetailsRsp = CloudImplHelper.getCourseDetailsRsp(getGolfCourseDetailReq);
        if (courseDetailsRsp != null) {
            ReleaseLogUtil.d(TAG, "getGolfCourseDetail: ", courseDetailsRsp.getResultCode());
            return courseDetailsRsp;
        }
        ReleaseLogUtil.a(TAG, "getGolfCourseDetail: Invalid Response!");
        return new GetGolfCourseDetailRsp();
    }

    @Override // com.huawei.healthcloud.plugintrack.golf.cloud.CloudApi
    public GetGolfCourseDataRsp getGolfCourseData(GetGolfCourseDataReq getGolfCourseDataReq) {
        LogUtil.a(TAG, "getGolfCourseData: Request Received, processing.....");
        GetGolfCourseDataRsp golfCourseDataRsp = CloudImplHelper.getGolfCourseDataRsp(getGolfCourseDataReq);
        if (golfCourseDataRsp != null) {
            ReleaseLogUtil.d(TAG, "getGolfCourseData: ", golfCourseDataRsp.getResultCode());
            return golfCourseDataRsp;
        }
        ReleaseLogUtil.a(TAG, "getGolfCourseData: Invalid Response!");
        return new GetGolfCourseDataRsp();
    }

    @Override // com.huawei.healthcloud.plugintrack.golf.cloud.CloudApi
    public GetGolfCourseMapDataRsp getGolfCourseMapData(GetGolfCourseMapDataReq getGolfCourseMapDataReq) {
        LogUtil.a(TAG, "getGolfCourseMapData: Request Received, processing.....");
        GetGolfCourseMapDataRsp golfCourseMapDataRsp = CloudImplHelper.getGolfCourseMapDataRsp(getGolfCourseMapDataReq);
        if (golfCourseMapDataRsp != null) {
            ReleaseLogUtil.d(TAG, "getGolfCourseMapData: ", golfCourseMapDataRsp.getResultCode());
            return golfCourseMapDataRsp;
        }
        ReleaseLogUtil.a(TAG, "getGolfCourseMapData: Invalid Response!");
        return new GetGolfCourseMapDataRsp();
    }

    @Override // com.huawei.healthcloud.plugintrack.golf.cloud.CloudApi
    public GolfClubListInfoDataRsp getGolfClubList(GolfClubListDataReq golfClubListDataReq) {
        GolfClubListInfoDataRsp golfClubListInfoDataRsp = CloudImplHelper.getGolfClubListInfoDataRsp(golfClubListDataReq);
        if (golfClubListInfoDataRsp != null) {
            ReleaseLogUtil.d(TAG, "getGolfClubList:", golfClubListInfoDataRsp.getResultCode());
            return golfClubListInfoDataRsp;
        }
        ReleaseLogUtil.e(TAG, "getGolfClubList response == null");
        return null;
    }

    @Override // com.huawei.healthcloud.plugintrack.golf.cloud.CloudApi
    public GolfCourseBrieInfosRsp getGolfCourseBrieInfos(GolfCourseBriefInfosReq golfCourseBriefInfosReq) {
        GolfCourseBrieInfosRsp golfCourseBrieInfos = CloudImplHelper.getGolfCourseBrieInfos(golfCourseBriefInfosReq);
        if (golfCourseBrieInfos != null) {
            ReleaseLogUtil.d(TAG, "getGolfCourseBrieInfos:", golfCourseBrieInfos.getResultCode());
            return golfCourseBrieInfos;
        }
        ReleaseLogUtil.e(TAG, "getGolfCourseBrieInfos response == null");
        return null;
    }
}
