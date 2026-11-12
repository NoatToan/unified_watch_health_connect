package com.huawei.health.suggestion.h5pro;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.distributedservice.api.DistributedApi;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hkt;
import defpackage.hvp;
import defpackage.iem;
import defpackage.ifz;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = "BodySenseCourse")
public class BodySenseCourseH5Repository {
    private static final String TAG = "BodySenseCourseH5Repository";

    @H5ProMethod(name = "setActionEnd")
    public static void setActionEnd(int i, FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        LogUtil.a(TAG, "setActionEnd:", Integer.valueOf(i));
        fitnessLinkStateH5Cbk.onSuccess(0);
    }

    @H5ProMethod(name = "startFitnessLink")
    public static void startFitnessLink(FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        LogUtil.a(TAG, "startFitnessLink");
        BodySenseManager.getInstance().startFitnessLink();
        fitnessLinkStateH5Cbk.onSuccess(0);
    }

    @H5ProMethod(name = "pauseFitnessLink")
    public static void pauseFitnessLink(FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        LogUtil.a(TAG, "pauseFitnessLink");
        BodySenseManager.getInstance().pauseFitnessLink();
        fitnessLinkStateH5Cbk.onSuccess(0);
    }

    @H5ProMethod(name = "resumeFitnessLink")
    public static void resumeFitnessLink(FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        LogUtil.a(TAG, "resumeFitnessLink");
        BodySenseManager.getInstance().resumeFitnessLink();
        fitnessLinkStateH5Cbk.onSuccess(0);
    }

    @H5ProMethod(name = "stopFitnessLink")
    public static void stopFitnessLink(FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        LogUtil.a(TAG, "stopFitnessLink");
        BodySenseManager.getInstance().stopFitnessLink();
        fitnessLinkStateH5Cbk.onSuccess(0);
    }

    @H5ProMethod(name = "getCurrentHeartRate")
    public static void getCurrentHeartRate(FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        int currentHeartRate = BodySenseManager.getInstance().getCurrentHeartRate();
        long reportTime = BodySenseManager.getInstance().getReportTime();
        HashMap map = new HashMap();
        map.put("currentHeartRate", Integer.valueOf(currentHeartRate));
        map.put("reportTime", Long.valueOf(reportTime));
        LogUtil.d(TAG, "getCurrentHeartRate", Integer.valueOf(currentHeartRate), " reportTime:", Long.valueOf(reportTime));
        fitnessLinkStateH5Cbk.onSuccess(map);
    }

    @H5ProMethod(name = "saveWorkoutRecord")
    public static void saveWorkoutRecord(WorkoutRecord workoutRecord, FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        LogUtil.a(TAG, "saveWorkoutRecord:", workoutRecord.acquireWorkoutName());
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j(TAG, "saveAndFinish, updatePlanProgress : planApi is null.");
            return;
        }
        workoutRecord.setLinkWear(BodySenseManager.getInstance().isConnectFitnessLinkDevice());
        workoutRecord.saveHeartRateDataList(BodySenseManager.getInstance().getHeartRateList());
        workoutRecord.saveInvalidHeartRateList(BodySenseManager.getInstance().getInvalidHeartRateList());
        planApi.updatePlanProgress(workoutRecord);
        fitnessLinkStateH5Cbk.onSuccess(0);
        hvp.d(0, hvp.d(workoutRecord.startTime()));
    }

    @H5ProMethod(name = "initAndDetectLastDevice")
    public static void initAndDetectLastDevice() {
        LogUtil.a(TAG, "initAndDetectLastDevice.");
        if (CommonUtil.bg()) {
            DistributedApi distributedApi = (DistributedApi) Services.d("DistributedService", DistributedApi.class);
            if (distributedApi != null) {
                distributedApi.init(BaseApplication.b());
                distributedApi.setHideNavigationBar(true);
                distributedApi.detectLastWirelessDevice();
                return;
            }
            LogUtil.e(TAG, "can not get DistributedApi.");
            return;
        }
        LogUtil.e(TAG, "is not huawei system.");
    }

    @H5ProMethod(name = "startWirelessProjection")
    public static void startWirelessProjection() {
        LogUtil.a(TAG, "startWirelessProjection.");
        if (CommonUtil.bg()) {
            DistributedApi distributedApi = (DistributedApi) Services.d("DistributedService", DistributedApi.class);
            if (distributedApi != null) {
                distributedApi.startWirelessProjection();
                return;
            } else {
                LogUtil.e(TAG, "can not get DistributedApi.");
                return;
            }
        }
        LogUtil.e(TAG, "is not huawei system.");
    }

    @H5ProMethod(name = "isConnectedHeartRateDeviceWear")
    public static void isConnectedHeartRateDeviceWear(FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        boolean zE = iem.e(BaseApplication.b().getApplicationContext(), ifz.a());
        LogUtil.a(TAG, "isConnectedHeartRateDeviceWear", Boolean.valueOf(zE));
        fitnessLinkStateH5Cbk.onSuccess(Boolean.valueOf(zE));
    }

    @H5ProMethod(name = "updateCalories")
    public static void updateCalories(float f, FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        BodySenseManager.getInstance().updateCalories(f);
        LogUtil.a(TAG, "updateCalories", Float.valueOf(f));
        fitnessLinkStateH5Cbk.onSuccess(0);
    }

    @H5ProMethod(name = "updateActiveCalories")
    public static void updateActiveCalories(float f, FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        BodySenseManager.getInstance().updateActiveCalories(f);
        LogUtil.a(TAG, "updateActiveCalories", Float.valueOf(f));
        fitnessLinkStateH5Cbk.onSuccess(0);
    }

    @H5ProMethod(name = "onChapterForward")
    public static void onChapterForward(int i, FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        LogUtil.a(TAG, "onChapterForward");
        if (fitnessLinkStateH5Cbk == null) {
            ReleaseLogUtil.e(TAG, "onChapterForward callback == null");
        } else {
            BodySenseManager.getInstance().chapterForward(i);
            fitnessLinkStateH5Cbk.onSuccess(0);
        }
    }

    @H5ProMethod(name = "onChapterBackward")
    public static void onChapterBackward(int i, FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        LogUtil.a(TAG, "onChapterBackward");
        if (fitnessLinkStateH5Cbk == null) {
            ReleaseLogUtil.e(TAG, "onChapterBackward callback == null");
        } else {
            BodySenseManager.getInstance().chapterBackward(i);
            fitnessLinkStateH5Cbk.onSuccess(0);
        }
    }

    @H5ProMethod(name = "onInterChapterBreak")
    public static void onInterChapterBreak(int i, int i2, int i3, FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        if (fitnessLinkStateH5Cbk == null) {
            ReleaseLogUtil.e(TAG, "onInterChapterBreak callback == null");
            return;
        }
        LogUtil.a(TAG, "onInterChapterBreak");
        BodySenseManager.getInstance().interChapterBreak(i, i2, i3);
        fitnessLinkStateH5Cbk.onSuccess(0);
    }

    @H5ProMethod(name = "isSupportCourseLinkageEnhance")
    public static void isSupportCourseLinkageEnhance(FitnessLinkStateH5Cbk fitnessLinkStateH5Cbk) {
        if (fitnessLinkStateH5Cbk == null) {
            ReleaseLogUtil.e(TAG, "isSupportCourseLinkageEnhance callback == null");
            return;
        }
        boolean zC = hkt.c();
        ReleaseLogUtil.d(TAG, "isSupportCourseLinkageEnhance isSupport:", Boolean.valueOf(zC));
        fitnessLinkStateH5Cbk.onSuccess(Boolean.valueOf(zC));
    }
}
