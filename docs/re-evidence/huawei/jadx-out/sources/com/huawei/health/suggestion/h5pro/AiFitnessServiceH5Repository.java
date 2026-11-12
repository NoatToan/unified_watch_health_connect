package com.huawei.health.suggestion.h5pro;

import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Cbk;
import defpackage.dem;
import defpackage.hjg;
import defpackage.hvp;
import defpackage.ped;
import defpackage.xkf;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = "FitnessService", users = {"", "", "9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class AiFitnessServiceH5Repository {
    private static final String TAG = "AiFitnessServiceH5Repository";

    @H5ProMethod(name = "saveTrainingResult")
    public static void saveTrainingResult(WorkoutRecord workoutRecord, SeriesCourseH5Cbk<Integer> seriesCourseH5Cbk) {
        if (seriesCourseH5Cbk == null) {
            LogUtil.j(TAG, "saveTrainingResult callback == null");
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j(TAG, "saveTrainingResult : planApi is null");
            seriesCourseH5Cbk.onFailure(-1, "PlanApi is null");
        }
        LogUtil.a(TAG, "H5 begin saveTrainingResult");
        planApi.updatePlanProgress(workoutRecord);
        seriesCourseH5Cbk.onSuccess(0);
        hvp.d(0, hvp.d(workoutRecord.startTime()));
    }

    @H5ProMethod(name = "getVideoLocalUrl")
    public static void getVideoLocalUrl(String str, SeriesCourseH5Cbk<String> seriesCourseH5Cbk) {
        if (seriesCourseH5Cbk == null) {
            LogUtil.j(TAG, "getVideoLocalUrl callback == null");
        } else {
            seriesCourseH5Cbk.onSuccess(xkf.l(str));
        }
    }

    @H5ProMethod(name = "jumpSportNoun")
    public static void jumpSportNounPage(String str, SeriesCourseH5Cbk<Integer> seriesCourseH5Cbk) {
        dem.b().a(str);
        seriesCourseH5Cbk.onSuccess(0);
    }

    @H5ProMethod(name = "calcWorkoutFullCalorie")
    public static void calcWorkoutFullCalorie(int i, SeriesCourseH5Cbk<Integer> seriesCourseH5Cbk) {
        seriesCourseH5Cbk.onSuccess(Integer.valueOf(Math.round(ped.b(i * hjg.a()))));
    }
}
