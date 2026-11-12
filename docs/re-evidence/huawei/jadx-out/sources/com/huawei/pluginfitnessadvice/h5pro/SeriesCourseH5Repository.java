package com.huawei.pluginfitnessadvice.h5pro;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.servicesapi.R;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository;
import com.huawei.ui.commonui.dialog.PurchaseSuccessDialog;
import defpackage.ied;
import defpackage.iov;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = "SeriesCourse", users = {"", "", "9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class SeriesCourseH5Repository {
    private static final String COURSE_CATEGORY_KEY = "courseCategoryKey";
    private static final String INTENT_BEHAVIOR_KEY = "intent_behavior_key";
    private static final String MY_FITNESS_COURSE_ACTIVITY_CLASS_NAME = "com.huawei.health.suggestion.ui.fitness.activity.MyFitnessCourseActivity";
    private static final int ONE_TIME_PAY = 2;
    private static final String RELAX = "relax";
    private static final String SPORT = "sport";
    private static final String TAG = "R_SeriesCourseH5Repository";
    private static final String TITLE_NAME = "titleName";

    @H5ProMethod(name = "getCoachGender")
    public static void getCoachGender(SeriesCourseH5Cbk<Integer> seriesCourseH5Cbk) {
        if (seriesCourseH5Cbk == null) {
            LogUtil.j(TAG, "getCoachGender callback == null");
        } else {
            seriesCourseH5Cbk.onSuccess(Integer.valueOf(ied.e()));
        }
    }

    public static void registerService() {
        H5ProClient.getServiceManager();
        H5ProServiceManager.getInstance().registerService(SeriesCourseH5Repository.class);
    }

    @H5ProMethod(name = "showPaySuccess")
    public static void showPaySuccess(final String str, final SeriesCourseH5Cbk<Integer> seriesCourseH5Cbk) {
        LogUtil.a(TAG, "showPaySuccess");
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: pdo
                @Override // java.lang.Runnable
                public final void run() {
                    SeriesCourseH5Repository.showPaySuccess(str, seriesCourseH5Cbk);
                }
            });
            return;
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.e(TAG, "topActivity is null");
            seriesCourseH5Cbk.onFailure(-1, "topActivity is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("finishCount");
            int i2 = jSONObject.getInt("totalCount");
            String string = jSONObject.getString("courseName");
            String string2 = jSONObject.getString("imageUrl");
            String quantityString = activityJ.getResources().getQuantityString(R.plurals.IDS_sug_series_course_exercised, i, Integer.valueOf(i), Integer.valueOf(i2));
            final String string3 = jSONObject.getString(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID);
            final int i3 = jSONObject.getInt("courseBelongType");
            PurchaseSuccessDialog.Builder builder = new PurchaseSuccessDialog.Builder(activityJ);
            final CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi == null) {
                LogUtil.e(TAG, "courseApi is null");
            } else {
                collectCourseWhenShowDialog(string3, i3, courseApi);
                builder.d(com.huawei.ui.commonui.R.string.IDS_go_check_my_sport_course).e(string).d(string2).b(new UiCallback<Boolean>() { // from class: com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository.1
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i4, String str2) {
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(Boolean bool) {
                        LogUtil.a(SeriesCourseH5Repository.TAG, "checkbox status is ", bool);
                        seriesCourseH5Cbk.onSuccess(Integer.valueOf(bool.compareTo((Boolean) false)));
                    }
                }).a(quantityString).b(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository.4
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        SeriesCourseH5Repository.collectOrUncollectCourse(z, courseApi, string3, i3);
                    }
                }).c(new View.OnClickListener() { // from class: pdp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SeriesCourseH5Repository.jumpToAllCourse(SeriesCourseH5Repository.SPORT, seriesCourseH5Cbk);
                    }
                }).c().show();
            }
        } catch (JSONException unused) {
            LogUtil.e(TAG, "buildQuestionResult JSONException");
            seriesCourseH5Cbk.onFailure(-1, "JSONException");
        }
    }

    private static void collectCourseWhenShowDialog(final String str, final int i, final CourseApi courseApi) {
        courseApi.isCourseCollected(str, new UiCallback<Boolean>() { // from class: com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository.2
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str2) {
                LogUtil.a(SeriesCourseH5Repository.TAG, "if collected failed");
                courseApi.collectCourse(str, i, null);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Boolean bool) {
                LogUtil.a(SeriesCourseH5Repository.TAG, "if collected:", bool);
                if (bool.booleanValue()) {
                    return;
                }
                courseApi.collectCourse(str, i, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void collectOrUncollectCourse(boolean z, CourseApi courseApi, String str, int i) {
        LogUtil.a(TAG, "ischecked ", Boolean.valueOf(z));
        if (!z) {
            courseApi.uncollectCourse(str, i);
        } else {
            courseApi.collectCourse(str, i, null);
        }
    }

    @H5ProMethod(name = "jumpToAllCourse")
    public static void jumpToAllCourse(String str, SeriesCourseH5Cbk<Integer> seriesCourseH5Cbk) {
        ReleaseLogUtil.d(TAG, "jumpToAllCourse:", str);
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            ReleaseLogUtil.e(TAG, "topActivity is null");
            seriesCourseH5Cbk.onFailure(-1, "topActivity is null");
            return;
        }
        if (!SPORT.equals(str) && !RELAX.equals(str)) {
            ReleaseLogUtil.e(TAG, "wrong course class");
            seriesCourseH5Cbk.onFailure(-1, "wrong course class");
            return;
        }
        String string = activityJ.getString(R.string.IDS_course_title_sport);
        if (RELAX.equals(str)) {
            string = activityJ.getString(R.string.IDS_hw_sleep_relax);
        }
        Intent intent = new Intent();
        intent.setClassName(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), MY_FITNESS_COURSE_ACTIVITY_CLASS_NAME);
        intent.putExtra(TITLE_NAME, string);
        intent.putExtra(COURSE_CATEGORY_KEY, 4);
        intent.putExtra(INTENT_BEHAVIOR_KEY, 2);
        iov.d(activityJ, intent);
        overridePendingTransition();
        seriesCourseH5Cbk.onSuccess(0);
    }

    private static void overridePendingTransition() {
        Activity activityJ = BaseApplication.j();
        if (activityJ instanceof Activity) {
            activityJ.overridePendingTransition(0, R.anim.activity_no_animation_short);
        }
    }
}
