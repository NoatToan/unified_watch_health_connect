package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.model.RunWorkout;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hms.network.embedded.x2;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.HealthWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.pluginfitnessadvice.WorkoutPackageInfo;
import com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository;
import com.huawei.pluginfitnessadvice.pricetagbean.PriceTagBean;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class pea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f45230a = "courseParameter";

    public static List<Workout> f(List<FitWorkout> list) {
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    public static List<FitWorkout> b(List<Workout> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            LogUtil.j("Suggestion_CourseUtil", "toFitWorkoutList workouts is null.");
            return null;
        }
        if (!njy.b((Object) list, FitWorkout.class)) {
            LogUtil.j("Suggestion_CourseUtil", "toFitWorkoutList: workouts element type is not FitWorkout.");
            return arrayList;
        }
        Iterator<Workout> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((FitWorkout) it.next());
        }
        return arrayList;
    }

    public static List<RunWorkout> d(List<Workout> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            LogUtil.j("Suggestion_CourseUtil", "toRunWorkoutList: workouts is null.");
            return null;
        }
        if (!njy.b((Object) list, RunWorkout.class)) {
            LogUtil.j("Suggestion_CourseUtil", "toRunWorkoutList: workouts element type is not RunWorkout.");
            return arrayList;
        }
        Iterator<Workout> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((RunWorkout) it.next());
        }
        return arrayList;
    }

    public static List<HealthWorkout> a(List<Workout> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            LogUtil.j("Suggestion_CourseUtil", "toFitWorkoutList workouts is null.");
            return null;
        }
        if (!njy.b((Object) list, HealthWorkout.class)) {
            LogUtil.j("Suggestion_CourseUtil", "toFitWorkoutList: workouts element type is not FitWorkout.");
            return arrayList;
        }
        Iterator<Workout> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((HealthWorkout) it.next());
        }
        return arrayList;
    }

    public static FitWorkout d(Workout workout) {
        if (workout == null) {
            LogUtil.j("Suggestion_CourseUtil", "toFitWorkout: workout is null.");
            return null;
        }
        if (!(workout instanceof FitWorkout)) {
            LogUtil.j("Suggestion_CourseUtil", "toFitWorkout: workout real type is not FitWorkout.");
            return null;
        }
        return (FitWorkout) workout;
    }

    public static WorkoutPackageInfo a(Workout workout) {
        if (workout == null) {
            LogUtil.j("Suggestion_CourseUtil", "toWorkoutPackageInfo: workout is null.");
            return null;
        }
        if (!(workout instanceof WorkoutPackageInfo)) {
            LogUtil.j("Suggestion_CourseUtil", "toWorkoutPackageInfo: workout real type is not WorkoutPackageInfo.");
            return null;
        }
        return (WorkoutPackageInfo) workout;
    }

    public static String e(List<PriceTagBean> list) {
        String url = "";
        if (list == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = 0;
        int i = 0;
        for (PriceTagBean priceTagBean : list) {
            if (priceTagBean == null) {
                LogUtil.e("Suggestion_CourseUtil", "invalid price tag");
            } else {
                long priceStartTime = priceTagBean.getPriceStartTime();
                long priceEndTime = priceTagBean.getPriceEndTime();
                int weight = priceTagBean.getWeight();
                if (priceEndTime >= jCurrentTimeMillis && priceStartTime <= jCurrentTimeMillis && (priceStartTime > j || (priceStartTime == j && weight > i))) {
                    url = priceTagBean.getUrl();
                    j = priceStartTime;
                    i = weight;
                }
            }
        }
        return url;
    }

    public static float d(String str) {
        String strE = buh.e("workoutid_" + str);
        if (TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.e("Suggestion_CourseUtil", "getDownloadedProgress oldData == null");
            return 0.0f;
        }
        String[] strArrSplit = strE.split("_");
        if (strArrSplit.length == 0) {
            LogUtil.j("Suggestion_CourseUtil", "getDownloadedProgress split.length <= 0");
            return 0.0f;
        }
        String str2 = strArrSplit[0];
        int iE = strArrSplit.length >= 2 ? ifp.e((Object) strArrSplit[1]) : 0;
        int iE2 = ifp.e((Object) buh.e("clear_version"));
        float fFloatValue = iE >= iE2 ? ifp.c((Object) str2).floatValue() : 0.0f;
        LogUtil.a("Suggestion_CourseUtil", "getCourseDownloadedProgress courseId: ", str, " oldClearVersion:", Integer.valueOf(iE), "- newClearVersion:", Integer.valueOf(iE2), "-invalidProgress:", Float.valueOf(fFloatValue));
        return fFloatValue;
    }

    public static void c(String str, float f) {
        String str2 = "workoutid_" + str;
        buh.d(str2, String.valueOf(f + "_" + ifp.e((Object) buh.e("clear_version"))));
    }

    public static List<String> b(FitWorkout fitWorkout) {
        if (fitWorkout == null) {
            return Collections.EMPTY_LIST;
        }
        List<String> listAcquireListRelativeWorkouts = fitWorkout.acquireListRelativeWorkouts();
        if (njy.b(listAcquireListRelativeWorkouts)) {
            return listAcquireListRelativeWorkouts;
        }
        ReleaseLogUtil.e("Suggestion_CourseUtil", "getRelativeCourses user old extendmap");
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(fitWorkout.acquireNarrowDesc());
            if (jSONObject.has("recommendCourses")) {
                return Collections.EMPTY_LIST;
            }
            JSONArray jSONArray = new JSONArray(jSONObject.optString("recommendCourses"));
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(strOptString);
                }
            }
            return arrayList;
        } catch (JSONException e) {
            LogUtil.j("Suggestion_CourseUtil", "getRelativeCourses ", LogAnonymous.b(e));
        }
    }

    public static List<gzl> c(List<String> list) {
        if (njy.e(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new gzl.a(it.next()).c());
        }
        return arrayList;
    }

    public static float a(long j, int i, float f, float f2) {
        return ped.b(CommonUtil.j(ped.j(j)) * f * f2 * i);
    }

    public static float a(float f, long j, float f2) {
        return ped.b(f * j * f2);
    }

    public static void a(Context context, FitWorkout fitWorkout) {
        a(context, fitWorkout, (pcd) null);
    }

    public static void a(Context context, FitWorkout fitWorkout, pcd pcdVar) {
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_CourseUtil", "fitWorkout == null");
            return;
        }
        if (pcdVar == null) {
            pcdVar = new pcd(fitWorkout.acquireId());
            pcdVar.q(fitWorkout.accquireVersion());
        }
        if (a(fitWorkout.isCustomCourse())) {
            c(context, pcdVar);
        } else {
            b(context, fitWorkout, pcdVar);
        }
    }

    public static void b(Context context, pcd pcdVar, ArrayList<WorkoutRecord> arrayList) {
        if (CollectionUtils.a(arrayList) || pcdVar == null) {
            ReleaseLogUtil.e("Suggestion_CourseUtil", "jumpTrainDetail workoutRecords null || parameter == null");
            return;
        }
        if (a(pcdVar.u() == 1)) {
            c(context, pcdVar);
            return;
        }
        Bundle bundle = new Bundle();
        c(pcdVar, bundle);
        bundle.putParcelableArrayList("workoutrecord", arrayList);
        AppRouter.c("/PluginFitnessAdvice/TrainDetail").d(bundle).a(pcdVar.d(), pcdVar.i()).d(268435456).b(context);
    }

    public static void a(Context context, pcd pcdVar) {
        if (pcdVar == null) {
            LogUtil.j("Suggestion_CourseUtil", "jumpTrainDetail parameter == null");
            return;
        }
        if (TextUtils.isEmpty(pcdVar.ac())) {
            ReleaseLogUtil.e("Suggestion_CourseUtil", "jumpTrainDetail getWorkoutId == null");
            return;
        }
        if (a(pcdVar.u() == 1)) {
            c(context, pcdVar);
            return;
        }
        Bundle bundle = new Bundle();
        c(pcdVar, bundle);
        AppRouter.c("/PluginFitnessAdvice/TrainDetail").d(bundle).d(268435456).b(context);
    }

    private static void b(Context context, FitWorkout fitWorkout, pcd pcdVar) {
        WorkoutRecord workoutRecordD = d(fitWorkout, pcdVar);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(1);
        arrayList.add(workoutRecordD);
        Bundle bundle = new Bundle();
        c(pcdVar, bundle);
        bundle.putParcelableArrayList("workoutrecord", arrayList);
        AppRouter.c("/PluginFitnessAdvice/TrainDetail").d(bundle).a(pcdVar.d(), pcdVar.i()).d(268435456).b(context);
        ReleaseLogUtil.d("Suggestion_CourseUtil", "jumpToDetailH5 gotoTrainDetailNativeStyle");
    }

    public static WorkoutRecord d(FitWorkout fitWorkout, pcd pcdVar) {
        if (fitWorkout == null) {
            ReleaseLogUtil.e("Suggestion_CourseUtil", "getWorkoutRecord null");
            return new WorkoutRecord();
        }
        if (pcdVar == null) {
            pcdVar = new pcd(fitWorkout.acquireId());
            pcdVar.q(fitWorkout.accquireVersion());
        }
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveVersion(fitWorkout.accquireVersion());
        workoutRecord.saveExerciseTime(new Date().getTime());
        workoutRecord.saveWorkoutId(fitWorkout.acquireId());
        workoutRecord.saveCalorie(fitWorkout.acquireCalorie());
        workoutRecord.saveCategory(fitWorkout.getCategory());
        workoutRecord.saveWeekNum(pcdVar.ab());
        workoutRecord.saveWorkoutOrder(pcdVar.ad());
        workoutRecord.savePlanId(pcdVar.k());
        workoutRecord.setAiWorkout(fitWorkout.getIsAi());
        workoutRecord.saveWorkoutDate(DateFormatUtil.d(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD));
        workoutRecord.saveWorkoutName(fitWorkout.acquireName());
        return workoutRecord;
    }

    private static void c(pcd pcdVar, Bundle bundle) {
        if (pcdVar != null) {
            a(pcdVar, bundle);
            d(pcdVar, bundle);
            e(pcdVar, bundle);
            bundle.putBundle("bundlekey", b(pcdVar));
            ReleaseLogUtil.d("Suggestion_CourseUtil", "buildParameter parameter", new Gson().toJson(pcdVar));
        }
    }

    private static void e(pcd pcdVar, Bundle bundle) {
        bundle.putBoolean("isSendCourseDevice", pcdVar.aj());
        bundle.putString("entrance_type", pcdVar.e());
        bundle.putBoolean("ISFROMSCHEME", pcdVar.af());
        bundle.putBoolean("ISPLANFIT", pcdVar.al());
        bundle.putBoolean("isafterrun", pcdVar.ai());
        bundle.putBoolean("moveTaskToBack", pcdVar.an());
        bundle.putBoolean("IS_START_DOWNLOAD_WORKOUT", pcdVar.am());
        bundle.putInt("executImmediateErrorType", pcdVar.g());
        bundle.putBoolean("isNeedExecutImmediate", pcdVar.ah());
        bundle.putBoolean("havenexttrain", pcdVar.ae());
        bundle.putBoolean("deviceTraining", pcdVar.ag());
    }

    private static void a(pcd pcdVar, Bundle bundle) {
        bundle.putString("workoutid", pcdVar.ac());
        bundle.putLong("plan_execute_time", pcdVar.f());
        bundle.putInt("userDefinedType", pcdVar.u());
        bundle.putString("version", pcdVar.aa());
        bundle.putString("workout_package_id", pcdVar.z());
        bundle.putString("planId", pcdVar.k());
    }

    private static void d(pcd pcdVar, Bundle bundle) {
        bundle.putString("entrance", pcdVar.c());
        bundle.putString("resource_type", pcdVar.s());
        bundle.putString("planTempId", pcdVar.o());
        bundle.putString(WebViewHelp.BI_KEY_PULL_FROM, pcdVar.n());
        bundle.putString("resourceId", pcdVar.p());
        bundle.putString("resourceName", pcdVar.r());
        bundle.putString("pullOrder", pcdVar.l());
        bundle.putString("algId", pcdVar.a());
        bundle.putString("promoteTag", pcdVar.m());
        bundle.putString("itemId", pcdVar.h());
        bundle.putString(x2.AB_INFO, pcdVar.b());
        bundle.putString("topic_name", pcdVar.x());
    }

    public static Bundle b(pcd pcdVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isshowbutton", pcdVar.ak());
        bundle.putInt("track_type", pcdVar.v());
        bundle.putInt("track_target", pcdVar.y());
        bundle.putFloat("track_targetvalue", pcdVar.w());
        return bundle;
    }

    public static boolean a(boolean z) {
        if (z) {
            return false;
        }
        if (CommonUtil.ap()) {
            return true;
        }
        return qsr.c().j();
    }

    private static void c(Context context, pcd pcdVar) {
        ReleaseLogUtil.d("Suggestion_CourseUtil", "jumpToDetailH5 parameter", pcdVar);
        Context contextE = e(context);
        if (contextE == null || pcdVar == null) {
            ReleaseLogUtil.e("Suggestion_CourseUtil", "jumpToTrainingDaySettingsH5() context is null");
            return;
        }
        boolean zIsBrowseMode = LoginInit.getInstance(contextE).isBrowseMode();
        ReleaseLogUtil.d("Suggestion_CourseUtil", "jumpToDetailH5 isBrowseMode", Boolean.valueOf(zIsBrowseMode));
        if (zIsBrowseMode) {
            LoginInit.getInstance(contextE).browsingToLogin(new IBaseResponseCallback() { // from class: pea.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("Suggestion_CourseUtil", "jumpToDetailH5 browsingToLogin", Integer.valueOf(i));
                }
            }, "");
            return;
        }
        String strAc = pcdVar.ac();
        String json = new Gson().toJson(pcdVar);
        ddv.b().initH5Pro();
        ddv ddvVarB = ddv.b();
        H5ProLaunchOption.Builder builderAddGlobalBiParam = new H5ProLaunchOption.Builder().addPath("#/CourseDetail?id=" + strAc).addCustomizeArg(f45230a, json).addGlobalBiParam(WebViewHelp.BI_KEY_PULL_FROM, pcdVar.n()).addGlobalBiParam("resourceId", pcdVar.p()).addGlobalBiParam("resourceName", pcdVar.r()).addGlobalBiParam("pullOrder", pcdVar.l());
        SeriesCourseH5Repository.registerService();
        ddvVarB.loadH5ProApp(contextE, "com.huawei.health.h5.course", builderAddGlobalBiParam);
        ReleaseLogUtil.d("Suggestion_CourseUtil", "jumpToDetailH5 success");
        btq.e().e("COLLECTION_ADD");
    }

    private static Context e(Context context) {
        if (context != null) {
            return context;
        }
        Activity activity = BaseApplication.getActivity();
        return activity == null ? BaseApplication.getContext() : activity;
    }

    public static List<ChoreographedMultiActions> a(pce.b bVar) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(bVar.d())) {
            LogUtil.j("Suggestion_CourseUtil", "CourseComb is empty");
            return arrayList;
        }
        for (pce.a aVar : bVar.d()) {
            ChoreographedMultiActions choreographedMultiActions = new ChoreographedMultiActions();
            choreographedMultiActions.setRepeatTimes(aVar.e());
            arrayList.add(choreographedMultiActions);
            ArrayList arrayList2 = new ArrayList();
            choreographedMultiActions.setActionList(arrayList2);
            if (!njy.e(aVar.b())) {
                for (pce.c cVar : aVar.b()) {
                    ChoreographedSingleAction choreographedSingleAction = new ChoreographedSingleAction();
                    choreographedSingleAction.setTargetConfig(cVar.c());
                    choreographedSingleAction.setIntensityConfig(cVar.b());
                    AtomicAction atomicAction = new AtomicAction();
                    atomicAction.setId(cVar.e());
                    atomicAction.saveName(cVar.a());
                    choreographedSingleAction.setAction(atomicAction);
                    arrayList2.add(choreographedSingleAction);
                }
            }
        }
        return arrayList;
    }
}
