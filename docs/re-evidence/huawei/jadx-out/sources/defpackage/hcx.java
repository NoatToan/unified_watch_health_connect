package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.sport.model.data.RecordPlanInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.CommonUtils;

/* JADX INFO: loaded from: classes9.dex */
class hcx {
    static void b(String str) {
        LogUtil.a("Suggestion_ExternalTrackUtils", "gotoTrackDetail SportId:", str);
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length != 2) {
            LogUtil.e("Suggestion_ExternalTrackUtils", "showDetails error, can not use this sportId:", str);
            return;
        }
        long jA = CommonUtils.a(strArrSplit[0], -1L);
        long jA2 = CommonUtils.a(strArrSplit[1], -1L);
        if (jA == -1 || jA2 == -1) {
            LogUtil.e("Suggestion_ExternalTrackUtils", "showDetails error with start time:", Long.valueOf(jA), ", end time: ", Long.valueOf(jA2));
        }
        gcn.c().startTrackDetail(jA, jA2);
    }

    static void d() {
        HandlerExecutor.b(new Runnable() { // from class: hcy
            @Override // java.lang.Runnable
            public final void run() {
                gcn.c().startNearTrackDetail();
            }
        });
    }

    static void d(final Context context, final int i, final int i2, final float f) {
        HandlerExecutor.b(new Runnable() { // from class: hdb
            @Override // java.lang.Runnable
            public final void run() {
                gcn.c().gotoSport(context, i, i2, f);
            }
        });
    }

    static int b(Context context, FitWorkout fitWorkout, RecordPlanInfo recordPlanInfo, Bundle bundle) {
        double dAcquireDistance;
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_ExternalTrackUtils", "fitWorkout is null");
            return 3;
        }
        if (context == null) {
            context = BaseApplication.getContext();
        }
        Context context2 = context;
        if (fitWorkout.acquireMeasurementType() == 1) {
            dAcquireDistance = fitWorkout.acquireDuration();
        } else {
            dAcquireDistance = fitWorkout.acquireDistance();
        }
        Bundle bundle2 = new Bundle();
        if (ien.d(fitWorkout)) {
            bundle2.putInt("runningCourse", 2);
        } else {
            bundle2.putInt("runningCourse", 1);
        }
        bundle2.putParcelable("runCourseDetail", fitWorkout);
        bundle2.putParcelable("coursePlanInfo", recordPlanInfo);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        LogUtil.a("Suggestion_ExternalTrackUtils", "startTrackCourseSport");
        if (fitWorkout.isWalkCourse()) {
            return gcn.c().startRunCourseSport(context2, 257, 4, (float) dAcquireDistance, bundle2);
        }
        int i = bundle != null ? bundle.getInt("sport_type", 0) : 0;
        if (i > 0) {
            return gcn.c().startRunCourseSport(context2, i, 4, (float) dAcquireDistance, bundle2);
        }
        return gcn.c().startRunCourseSport(context2, 258, 4, (float) dAcquireDistance, bundle2);
    }

    static void a(Object obj, String str) {
        gcn.c().playSound(obj, str);
    }

    static void d(String str, Object obj, String str2) {
        gcn.c().playSound(str, obj, str2);
    }

    static void a(String str, int i) {
        gcn.c().sendPlayerCommand(str, i);
    }

    static void b(String str, String str2, int i) {
        gcn.c().startVoiceService(str, str2, i);
    }

    static void d(String str) {
        gcn.c().stopVoiceService(str);
    }
}
