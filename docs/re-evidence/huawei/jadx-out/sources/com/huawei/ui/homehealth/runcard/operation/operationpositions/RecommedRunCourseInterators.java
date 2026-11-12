package com.huawei.ui.homehealth.runcard.operation.operationpositions;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.runcard.operation.recommendalgo.model.RecommendSchedule;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes43.dex */
public class RecommedRunCourseInterators {

    public interface UpdateWorkoutsCallback {
        void onUpdateFinish();
    }

    public static RecommendSchedule c(int i) {
        LogUtil.j("Track_RecommedRunCourseInterators", "getCoursesBySportLevel ", Integer.valueOf(i));
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), a(i));
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        try {
            return (RecommendSchedule) new Gson().fromJson(strE, RecommendSchedule.class);
        } catch (JsonSyntaxException e) {
            LogUtil.j("Track_RecommedRunCourseInterators", "getCoursesBySportLevel ", e.getMessage());
            return null;
        }
    }

    private static String a(int i) {
        switch (i) {
            case -1:
                return "KEY_COURSE_LEVEL_NONE";
            case 0:
                return "KEY_COURSE_LEVEL_VERY_POOR";
            case 1:
                return "KEY_COURSE_LEVEL_POOR";
            case 2:
                return "KEY_COURSE_LEVEL_FAIR";
            case 3:
                return "KEY_COURSE_LEVEL_AVERAGE";
            case 4:
                return "KEY_COURSE_LEVEL_GOOD";
            case 5:
                return "KEY_COURSE_LEVEL_VERY_GOOD";
            case 6:
                return "KEY_COURSE_LEVEL_TREADMILL";
            default:
                return "";
        }
    }

    public static void c() {
        for (int i = -1; i <= 5; i++) {
            RecommendSchedule recommendScheduleC = c(i);
            if (recommendScheduleC != null) {
                recommendScheduleC.resetSchedule();
                SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), a(i), new Gson().toJson(recommendScheduleC), new StorageParams());
            }
        }
    }
}
