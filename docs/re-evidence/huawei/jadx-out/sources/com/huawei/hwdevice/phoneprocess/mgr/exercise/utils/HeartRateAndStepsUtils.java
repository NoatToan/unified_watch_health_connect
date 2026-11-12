package com.huawei.hwdevice.phoneprocess.mgr.exercise.utils;

import android.text.TextUtils;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class HeartRateAndStepsUtils {
    private static final int HEART_RATE_ZONE_CONFIG_INDEX = 0;
    private static final int HEART_RATE_ZONE_CONFIG_SIZE = 2;
    private static final int HEART_RATE_ZONE_THRESHOLD_INDEX = 1;
    private static final int INITIAL_NUMBER = -1;
    private static final String TAG = "HeartRateAndStepsUtils";
    private static HeartZoneConf mHeartZoneConf;

    private HeartRateAndStepsUtils() {
    }

    public static int[] requestHeartInteDuration(List<HeartRateData> list) {
        int i = 5;
        int[] iArr = new int[5];
        int i2 = 0;
        if (list.size() >= 2 && list.get(1).acquireTime() - list.get(0).acquireTime() >= 40000) {
            i = 60;
        }
        HeartZoneConf heartZoneConf = getHeartZoneConf();
        StringBuilder sb = new StringBuilder("heartzone:");
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (i2 < list.size()) {
            HeartRateData heartRateData = list.get(i2);
            int i6 = i * i2;
            int iFindRateRegion = heartZoneConf.findRateRegion(heartRateData.acquireHeartRate());
            sb.append(heartRateData.acquireHeartRate());
            sb.append(":");
            sb.append(iFindRateRegion);
            sb.append(" ");
            if (iFindRateRegion != -1) {
                if (i5 != iFindRateRegion) {
                    if (i5 != -1) {
                        iArr[i5] = iArr[i5] + (i6 - i3);
                    }
                    i3 = i6;
                    i5 = iFindRateRegion;
                }
            } else if (i5 != -1) {
                iArr[i5] = iArr[i5] + (i6 - i3);
                i5 = -1;
            }
            i2++;
            i4 = i6;
        }
        HeartRateData heartRateData2 = list.get(list.size() - 1);
        int iFindRateRegion2 = heartZoneConf.findRateRegion(heartRateData2.acquireHeartRate());
        if (iFindRateRegion2 != -1 && iFindRateRegion2 == i5) {
            iArr[i5] = iArr[i5] + (i4 - i3);
            sb.append(heartRateData2.acquireHeartRate());
            sb.append(":");
            sb.append(iFindRateRegion2);
        }
        LogUtil.d(TAG, sb);
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0068  */
    public static HeartZoneConf getHeartZoneConf() {
        if (mHeartZoneConf == null) {
            LogUtil.d(TAG, "getHeartZoneConf enter");
            UserInfomation localUserInfo = getLocalUserInfo();
            LogUtil.d(TAG, "getHeartZoneConf enter ,age:", Integer.valueOf(localUserInfo.getAge()));
            HeartZoneConf heartZoneConf = new HeartZoneConf(localUserInfo.getAge());
            HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HeartRate_Classify_Method");
            if (userPreference != null) {
                int i = 0;
                try {
                    i = Integer.parseInt(userPreference.getValue());
                    heartZoneConf.setClassifyMethod(i);
                } catch (NumberFormatException unused) {
                    LogUtil.e(TAG, "parse UserPreference value fail");
                }
                if (i == 0) {
                    setHeartZoneConfigure(HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HeartZone_Config"), heartZoneConf);
                } else {
                    setHeartZoneConfigure(HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HRRHeartZone_Config"), heartZoneConf);
                }
            } else {
                setHeartZoneConfigure(HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.UserPreference_HeartZone_Config"), heartZoneConf);
            }
            LogUtil.d(TAG, "getHeartZoneConf", heartZoneConf);
            mHeartZoneConf = heartZoneConf;
        }
        return mHeartZoneConf;
    }

    private static HeartZoneConf setHeartZoneConfigure(HiUserPreference hiUserPreference, HeartZoneConf heartZoneConf) {
        if (hiUserPreference != null && !TextUtils.isEmpty(hiUserPreference.getValue())) {
            String[] strArrSplit = hiUserPreference.getValue().split(",");
            if (strArrSplit.length == 2) {
                heartZoneConf.setHRZoneConf(strArrSplit[0]);
                heartZoneConf.setThreshold(strArrSplit[1]);
            }
        }
        return heartZoneConf;
    }

    private static UserInfomation getLocalUserInfo() {
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        boolean zF = UnitUtil.f();
        if (userProfileMgrApi != null) {
            UserInfomation userInfo = userProfileMgrApi.getUserInfo();
            if (userInfo != null) {
                LogUtil.a(TAG, "getLocalUserInfo return MerryuserInfomation");
                return userInfo;
            }
            UserInfomation userInfomation = new UserInfomation(zF ? 1 : 0);
            LogUtil.j(TAG, "getLocalUserInfo is null");
            return userInfomation;
        }
        UserInfomation userInfomation2 = new UserInfomation(zF ? 1 : 0);
        LogUtil.j(TAG, "userProfileMgrApi is null");
        return userInfomation2;
    }
}
