package com.huawei.featureuserprofile.target.js;

import com.huawei.basefitnessadvice.model.FitnessTrackRecord;
import com.huawei.featureuserprofile.target.cloud.ActiveTargetManager;
import com.huawei.health.h5pro.service.anotation.H5ProCallback;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import defpackage.cyo;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = "ActiveTarget", users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class ActiveTargetService {
    private static final String TAG = "ActiveTargetService";

    @H5ProCallback
    public interface ActiveTargetsCallback {
        void onFailure(int i, String str);

        void onSuccess(Object obj);
    }

    private ActiveTargetService() {
    }

    @H5ProMethod
    public static void getActiveTargets(final ActiveTargetsCallback activeTargetsCallback) {
        LogUtil.a(TAG, "enter getActiveTargets");
        ActiveTargetManager.c().a(new ResultCallback<cyo>() { // from class: com.huawei.featureuserprofile.target.js.ActiveTargetService.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(cyo cyoVar) {
                LogUtil.a(ActiveTargetService.TAG, "data is ", cyoVar);
                activeTargetsCallback.onSuccess(cyoVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e(ActiveTargetService.TAG, "throwable is ", th.getMessage());
            }
        });
    }

    @H5ProMethod
    public static void getLastYearData(int i, ActiveTargetsCallback activeTargetsCallback) {
        LogUtil.a(TAG, "enter getLastYearData");
        ActiveTargetManager.c().a(i, activeTargetsCallback);
    }

    @H5ProMethod
    public static void updateActiveTarget(int i, double d, double d2, double d3) {
        LogUtil.a(TAG, "enter updateActiveTarget, type = ", Integer.valueOf(i), ", goalValue = ", Double.valueOf(d), ", completeValue = ", Double.valueOf(d2), ", initialWeight = ", Double.valueOf(d3));
        ActiveTargetManager.c().e(i, d, d2, d3);
    }

    @H5ProMethod
    public static void getFitnessCourseRecordList(long j, long j2, String str, final ActiveTargetsCallback activeTargetsCallback) {
        LogUtil.a(TAG, "enter getFitnessCourseRecordList");
        ActiveTargetManager.c().d(j, j2, str, new ResultCallback<List<FitnessTrackRecord>>() { // from class: com.huawei.featureuserprofile.target.js.ActiveTargetService.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitnessTrackRecord> list) {
                if (!njy.e(list)) {
                    LogUtil.a(ActiveTargetService.TAG, "getFitnessCourseRecordList data is ", list.toString());
                }
                activeTargetsCallback.onSuccess(list);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e(ActiveTargetService.TAG, "throwable is ", th.getMessage());
                activeTargetsCallback.onFailure(-1, "getFitnessCourseRecordList fail");
            }
        });
    }
}
