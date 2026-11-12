package com.huawei.healthcloud.plugintrack.golf.device;

import com.huawei.healthcloud.plugintrack.golf.Utils;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseInfo;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseListInfo;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseStateInfo;
import com.huawei.healthcloud.plugintrack.golf.cloud.CloudManager;
import com.huawei.healthcloud.plugintrack.golf.cloud.beans.CourseData;
import com.huawei.healthcloud.plugintrack.golf.cloud.beans.CourseDetail;
import com.huawei.healthcloud.plugintrack.golf.cloud.requests.GetGolfCourseDataReq;
import com.huawei.healthcloud.plugintrack.golf.cloud.requests.GetGolfCourseDetailReq;
import com.huawei.healthcloud.plugintrack.golf.cloud.requests.GolfClubListDataReq;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.GetGolfCourseDataRsp;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.GetGolfCourseDetailRsp;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.GolfClubInfoData;
import com.huawei.healthcloud.plugintrack.golf.cloud.response.GolfClubListInfoDataRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ies;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CloudHelper {
    private static final int CLOUD_RSP_STATE_SUCCESS = 0;
    private static final int DEFAULT_VERSION = 0;
    private static final int DISTANCE_TRANSFER_PARAM = 1000;
    private static final String TAG = "Track_CloudHelper";
    private static final String VERSION_ONE = "1";
    private static final String VERSION_TWO = "2";

    public static GolfCourseStateInfo checkCourseVersion(int i, int i2, boolean z) {
        LogUtil.a(TAG, "checkCourseVersion");
        GolfCourseStateInfo golfCourseStateInfo = new GolfCourseStateInfo();
        golfCourseStateInfo.setCourseId(i);
        golfCourseStateInfo.setRspState(0);
        golfCourseStateInfo.setState(0);
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            ReleaseLogUtil.e(TAG, "network is not connected!");
            return golfCourseStateInfo;
        }
        GetGolfCourseDetailReq.Builder builder = new GetGolfCourseDetailReq.Builder();
        builder.addCourseId(Long.valueOf(i)).language(Utils.getLanguage());
        builder.isAnon(z);
        GetGolfCourseDetailRsp golfCourseDetail = CloudManager.getInstance().getGolfCourseDetail(builder.build());
        if (golfCourseDetail.getResultCode() == null || golfCourseDetail.getResultCode().intValue() != 0) {
            ReleaseLogUtil.e(TAG, "cloud response is invalid: ", golfCourseDetail.getResultCode());
            return golfCourseStateInfo;
        }
        golfCourseStateInfo.setRspState(0);
        List<CourseDetail> courseDetails = golfCourseDetail.getCourseDetails();
        if (courseDetails != null) {
            try {
                if (courseDetails.size() > 0) {
                    String version = courseDetails.get(0).getVersion();
                    LogUtil.a(TAG, "version is: ", Integer.valueOf(i2), " versionNewest: ", Integer.valueOf(Integer.parseInt(version)));
                    if (i2 < Integer.parseInt(version)) {
                        golfCourseStateInfo.setState(1);
                        return golfCourseStateInfo;
                    }
                    return golfCourseStateInfo;
                }
            } catch (NumberFormatException e) {
                ReleaseLogUtil.a(TAG, "NumberFormatException", e.getMessage());
            }
        }
        ReleaseLogUtil.e(TAG, "checkCourseVersion response detailList is empty");
        return golfCourseStateInfo;
    }

    public static int getVersion(long j, boolean z) {
        int i = 0;
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            ReleaseLogUtil.e(TAG, " network is not connected");
            return 0;
        }
        GetGolfCourseDetailReq.Builder builder = new GetGolfCourseDetailReq.Builder();
        builder.addCourseId(Long.valueOf(j)).language(Utils.getLanguage());
        builder.isAnon(z);
        List<CourseDetail> courseDetails = CloudManager.getInstance().getGolfCourseDetail(builder.build()).getCourseDetails();
        if (courseDetails != null && courseDetails.size() > 0) {
            try {
                i = Integer.parseInt(courseDetails.get(0).getVersion());
            } catch (NumberFormatException e) {
                ReleaseLogUtil.a(TAG, "NumberFormatException", e.getMessage());
            }
            LogUtil.a(TAG, " getVersion : No.", Long.valueOf(j), " course version is: ", Integer.valueOf(i));
            return i;
        }
        ReleaseLogUtil.e(TAG, " getVersion response is invalid!");
        return 0;
    }

    public static GolfCourseListInfo getGolfCourseListByGPS(double d, double d2) {
        GolfCourseListInfo golfCourseListInfo = new GolfCourseListInfo();
        int i = 1;
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            ReleaseLogUtil.e(TAG, "network is not connected");
            golfCourseListInfo.setRspState(1);
            golfCourseListInfo.setListInfos(new ArrayList());
            return golfCourseListInfo;
        }
        GetGolfCourseDataReq.Builder builder = new GetGolfCourseDataReq.Builder();
        builder.lat(Double.valueOf(d2)).lon(Double.valueOf(d)).devConType(Utils.getGolfResultCode()).language(Utils.getLanguage());
        GetGolfCourseDataRsp golfCourseData = CloudManager.getInstance().getGolfCourseData(builder.build());
        if (golfCourseData.getResultCode() == null) {
            ReleaseLogUtil.a(TAG, "invalid response!");
        } else if (golfCourseData.getResultCode().intValue() == 0) {
            i = 0;
        }
        golfCourseListInfo.setRspState(i);
        List<CourseData> courseDataList = golfCourseData.getCourseDataList();
        ArrayList arrayList = new ArrayList();
        if (courseDataList != null && courseDataList.size() != 0) {
            for (CourseData courseData : courseDataList) {
                GolfCourseInfo golfCourseInfo = new GolfCourseInfo();
                try {
                    golfCourseInfo.setCourseId(Integer.parseInt(String.valueOf(courseData.getCourseId())));
                    golfCourseInfo.setVersion(Integer.parseInt(courseData.getVersion()));
                } catch (NumberFormatException e) {
                    ReleaseLogUtil.a(TAG, "NumberFormatException", e.getMessage());
                }
                golfCourseInfo.setDistance((int) (courseData.getDistance() * 1000.0d));
                golfCourseInfo.setCourseName(courseData.getName());
                arrayList.add(golfCourseInfo);
            }
        }
        golfCourseListInfo.setListInfos(arrayList);
        LogUtil.a(TAG, "getGolfCourseListByGPS, res: ", arrayList.toString());
        return golfCourseListInfo;
    }

    public static GolfClubListInfoDataRsp getGolfClubListInfo() {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            ReleaseLogUtil.e(TAG, "network is not connected");
            return null;
        }
        GolfClubListDataReq.Builder builder = new GolfClubListDataReq.Builder();
        builder.language(Utils.getLanguage());
        builder.version(GolfDeviceProxy.getInstance().isSupportNewGolfClub() ? "2" : "1");
        GolfClubListInfoDataRsp golfClubList = CloudManager.getInstance().getGolfClubList(builder.build());
        if (golfClubList == null) {
            ReleaseLogUtil.e(TAG, "getGolfClubListInfo response == null");
            return null;
        }
        List<GolfClubInfoData> clubInfoList = golfClubList.getClubInfoList();
        if (njy.e(clubInfoList)) {
            ReleaseLogUtil.e(TAG, "clubInfoList isEmpty");
            return null;
        }
        ReleaseLogUtil.d(TAG, "getGolfClubListInfo response original:", ies.c(golfClubList));
        Iterator<GolfClubInfoData> it = clubInfoList.iterator();
        while (it.hasNext()) {
            GolfClubInfoData next = it.next();
            if (next != null && !next.isEnable()) {
                it.remove();
            }
        }
        ReleaseLogUtil.d(TAG, "getGolfClubListInfo response:", ies.c(golfClubList));
        return golfClubList;
    }
}
