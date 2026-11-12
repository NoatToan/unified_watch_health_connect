package com.huawei.health.suggestion.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanPoster;
import com.huawei.basefitnessadvice.model.PlanWorkout;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.model.data.RecordPlanInfo;
import com.huawei.health.suggestion.FitnessExternalUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.callback.JudgeCallback;
import com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository;
import com.huawei.health.suggestion.ui.FitnessPlanJoinActivity;
import com.huawei.health.suggestion.ui.MyPlanReportActivity;
import com.huawei.health.suggestion.ui.TrainEventActivity;
import com.huawei.health.suggestion.ui.fitness.activity.CoachActivity;
import com.huawei.health.suggestion.ui.fitness.activity.LongCoachActivity;
import com.huawei.health.suggestion.ui.fitness.activity.MyFitnessCourseActivity;
import com.huawei.health.suggestion.ui.fitness.activity.SportAllCourseActivity;
import com.huawei.health.suggestion.ui.fitness.callback.JumpFinishCallback;
import com.huawei.health.suggestion.ui.fitness.callback.JumpViewInterface;
import com.huawei.health.suggestion.ui.fitness.module.CoachData;
import com.huawei.health.suggestion.ui.fitness.module.Motion;
import com.huawei.health.suggestion.ui.plan.activity.AiPlanActivity;
import com.huawei.health.suggestion.ui.plan.activity.FitnessPlanDetailActivity;
import com.huawei.health.suggestion.ui.run.activity.CustomCourseActivity;
import com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.health.weight.WeightApi;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.maps.offlinedata.DeviceTypeConsts;
import com.huawei.openalliance.ad.db.bean.ContentTemplateRecord;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.ArkUIJsApi;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.OperationUtilsApi;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.pluginfitnessadvice.LongVideoInfo;
import com.huawei.pluginfitnessadvice.Video;
import com.huawei.pluginfitnessadvice.VideoSegment;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import com.huawei.pluginfitnessadvice.h5pro.SeriesCourseH5Repository;
import com.huawei.pluginoperation.util.DietKakaUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btq;
import defpackage.btw;
import defpackage.btx;
import defpackage.ddq;
import defpackage.ddv;
import defpackage.ddx;
import defpackage.ecu;
import defpackage.gzm;
import defpackage.gzx;
import defpackage.hcg;
import defpackage.hcu;
import defpackage.hiu;
import defpackage.hjs;
import defpackage.hkt;
import defpackage.hot;
import defpackage.idy;
import defpackage.ied;
import defpackage.iei;
import defpackage.ien;
import defpackage.ifi;
import defpackage.ift;
import defpackage.ifx;
import defpackage.iov;
import defpackage.irz;
import defpackage.isa;
import defpackage.iun;
import defpackage.lmf;
import defpackage.lsj;
import defpackage.ltb;
import defpackage.lua;
import defpackage.njy;
import defpackage.pcd;
import defpackage.pcp;
import defpackage.pdn;
import defpackage.pea;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class JumpUtil {
    public static void e(Context context, CourseApi courseApi, FitWorkout fitWorkout) {
        new JumpHelper().c(context, courseApi, fitWorkout);
    }

    public static boolean b(CourseApi courseApi, FitWorkout fitWorkout) {
        return new JumpHelper().c(courseApi, fitWorkout);
    }

    public static void c(Context context, FitWorkout fitWorkout) {
        new JumpHelper().c(context, fitWorkout);
    }

    public static void a(Context context, FitWorkout fitWorkout, boolean z) {
        new JumpHelper().e(context, fitWorkout, z);
    }

    public static void e(Context context, int i) {
        new JumpHelper().e(context, i);
    }

    public static void b(Context context, int i) {
        new JumpHelper().c(context, i);
    }

    public static void a(Context context, int i, int i2, String str) {
        new JumpHelper().c(context, i, i2, str);
    }

    public static void c(Context context, FitWorkout fitWorkout, Map<String, Object> map) {
        new JumpHelper().d(context, fitWorkout, map);
    }

    public static void e(Context context, pcp pcpVar) {
        new JumpHelper().d(context, pcpVar);
    }

    public static void c(Context context, int i) {
        new JumpHelper().d(context, i);
    }

    public static void a(Context context, int i) {
        new JumpHelper().a(context, i);
    }

    public static void c(Context context) {
        new JumpHelper().d(context);
    }

    public static void b(Plan plan, PlanWorkout planWorkout) {
        new JumpHelper().e(plan, planWorkout);
    }

    public static void a(Context context, Plan plan, FitWorkout fitWorkout) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            return;
        }
        planApi.setPlanType(0);
        ien.b(context, fitWorkout, plan, System.currentTimeMillis());
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, 1);
        idy.b(AnalyticsValue.HEALTH_HOME_START_TRAIN_BTN_2010037.value(), map);
    }

    public static void j(Context context) {
        new JumpHelper().j(context);
    }

    public static void b(Context context, FitWorkout fitWorkout) {
        new JumpHelper().d(context, fitWorkout, (RecordPlanInfo) null, (Bundle) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Context context, FitWorkout fitWorkout, RecordPlanInfo recordPlanInfo, Bundle bundle) {
        JumpHelper jumpHelper = new JumpHelper();
        if (context instanceof JumpFinishCallback) {
            jumpHelper.a((JumpFinishCallback) context);
        }
        jumpHelper.d(context, fitWorkout, recordPlanInfo, bundle);
    }

    public static void c() {
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi == null) {
            ReleaseLogUtil.e("Suggestion_JumpUtil", "jumpDietaryInstruct api is null");
            return;
        }
        marketRouterApi.router(Constants.OPEN_HEALTH_SPORT_PREFIX + ddx.e + "?h5pro=true&urlType=4&pName=com.huawei.health&path=dietary_instruct");
    }

    public static void a(Context context) {
        new JumpHelper().a(context);
    }

    public static void e(Context context) {
        new JumpHelper().e(context);
    }

    public static void b(Context context) {
        new JumpHelper().c(context);
    }

    public static void e(int i, String str, String str2, Context context) {
        new JumpHelper(context).d(i, str, str2);
    }

    public static void d(Context context) {
        new JumpHelper().b(context);
    }

    public static void b(Context context, String str, int i) {
        new JumpHelper().c(context, str, i);
    }

    public static void c(Context context, double d, double d2) {
        new JumpHelper().e(context, d, d2, (String) null);
    }

    public static void c(Context context, double d, double d2, String str) {
        new JumpHelper().e(context, d, d2, str);
    }

    public static void d(Context context, String str, int i) {
        new JumpHelper().a(context, str, i);
    }

    public static void d(int i, Context context, int i2, String str) {
        new JumpHelper(context).c(i, i2, str, 0);
    }

    public static void a(int i, Context context, int i2, String str, int i3) {
        new JumpHelper(context).c(i, i2, str, i3);
    }

    public static void e(Context context, String str) {
        new JumpHelper().e(context, str);
    }

    public static void a(String str, String... strArr) {
        new JumpHelper().c(str, strArr);
    }

    public static void e(long j, int i, int i2) {
        new JumpHelper().e(j, i, i2);
    }

    public static void f(Context context) {
        new JumpHelper().h(context);
    }

    public static void c(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str)) {
            LogUtil.a("Suggestion_JumpUtil", "context ", context, " courseId ", str, " courseEditState ", Integer.valueOf(i));
            Intent intent = new Intent(context, (Class<?>) CustomCourseActivity.class);
            intent.putExtra("CustomCourseFitWorkoutId", str);
            intent.putExtra("CustomCourseState", i);
            intent.setFlags(268435456);
            iov.d(context, intent);
            return;
        }
        LogUtil.j("Suggestion_JumpUtil", "jumpToCustomCourseEdit failed context ", context, " courseId ", str, " courseEditState ", Integer.valueOf(i));
    }

    public static void a(Context context, String str) {
        ddv.b().initH5Pro();
        H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).addCustomizeJsModule("mediaCenter", ddv.b().getCommonJsModule("mediaCenter")).enableOnPauseCallback().setImmerse().showStatusBar().setStatusBarTextBlack(true).addCustomizeArg("workoutPackageId", str).setForceDarkMode(0).build();
        SeriesCourseH5Repository.registerService();
        H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.course", h5ProLaunchOptionBuild);
        btq.e().e("COLLECTION_ADD");
    }

    public static void c(final Context context, final WorkoutRecord workoutRecord, final Bundle bundle) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_JumpUtil", "doViewTrainDetailBi, getCurrentPlan : planApi is null.");
        } else {
            planApi.e(new UiCallback<IntPlan>() { // from class: com.huawei.health.suggestion.util.JumpUtil.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Suggestion_JumpUtil", "getCurrentPlan fail errCode:", Integer.valueOf(i), ",errInfo:", str);
                    JumpUtil.b(context, workoutRecord, 0, bundle, null);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(IntPlan intPlan) {
                    int type;
                    LogUtil.a("Suggestion_JumpUtil", "jumpToMotionGuidance onSuccess");
                    if (intPlan != null) {
                        type = intPlan.getPlanType().getType();
                        LogUtil.a("Suggestion_JumpUtil", "type: ", Integer.valueOf(type));
                    } else {
                        type = 0;
                    }
                    JumpUtil.b(context, workoutRecord, type, bundle, intPlan);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, WorkoutRecord workoutRecord, int i, Bundle bundle, IntPlan intPlan) {
        int iB;
        int iE;
        long time;
        int planTrainDate = workoutRecord.getPlanTrainDate();
        if (planTrainDate == 0 || intPlan == null) {
            iB = 0;
            iE = 0;
        } else {
            try {
                time = DateFormatUtil.d(String.valueOf(planTrainDate), DateFormatUtil.DateFormatType.DATE_FORMAT_8).getTime();
            } catch (ParseException e) {
                LogUtil.e("Suggestion_JumpUtil", "startMotionGuidance exception", LogAnonymous.b(e));
                time = 0;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(time);
            iB = ift.b(calendar.get(7));
            iE = btw.e(intPlan, time);
        }
        LogUtil.a("Suggestion_JumpUtil", "dayNumber: ", Integer.valueOf(iB), "weekNumber: ", Integer.valueOf(iE));
        bundle.putInt("planType", i);
        bundle.putInt("dayNumber", iB);
        bundle.putInt("weekNumber", iE);
        AppRouter.c("/PluginAiFitnessSportCommon/AIMotionGuidanceActivity").d(bundle).b(BaseApplication.getContext());
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public static void b(int i, String str, int i2, Context context) {
        d(i, str, i2, "", "", context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(int i, String str, int i2, String str2, String str3, Context context) {
        JumpHelper jumpHelper = new JumpHelper(context);
        if (context instanceof JumpFinishCallback) {
            jumpHelper.a((JumpFinishCallback) context);
        }
        if (context instanceof JumpViewInterface) {
            jumpHelper.c((JumpViewInterface) context);
        }
        jumpHelper.d(i, str, i2, str2, str3);
    }

    public static void a(String str, Context context) {
        new JumpHelper().c(str, context);
    }

    public static void a(pcp pcpVar, String str, Context context, boolean z) {
        new JumpHelper().d(pcpVar, str, context, z);
    }

    public static void d(pcp pcpVar, Context context) {
        new JumpHelper().b(pcpVar, context);
    }

    public static void d(IntPlan intPlan) {
        new JumpHelper().e(intPlan);
    }

    public static void c(int i, String str) {
        new JumpHelper().c(i, str);
    }

    public static void d(FitnessPackageInfo fitnessPackageInfo, String str, Context context) {
        new JumpHelper().e(fitnessPackageInfo, str, context);
    }

    public static void d(int i, Context context, String str) {
        new JumpHelper().b(i, context, str);
    }

    public static void a(Context context, pcp pcpVar) {
        new JumpHelper().e(context, pcpVar);
    }

    public static void a(Context context, Map<String, String> map) {
        new JumpHelper(context).a(map);
    }

    public static void a(Context context, String str, int i) {
        new JumpHelper(context).e(str, i);
    }

    public static class JumpHelper {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<Context> f10221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<JumpFinishCallback> f10222c;
        private boolean d;
        private WeakReference<JumpViewInterface> e;

        public static /* synthetic */ void c(View view) {
        }

        public static /* synthetic */ void d(View view) {
        }

        public JumpHelper() {
            this(BaseApplication.getContext());
        }

        public JumpHelper(Context context) {
            this.d = false;
            if (context != null) {
                this.f10221b = new WeakReference<>(context);
            } else {
                this.f10221b = new WeakReference<>(BaseApplication.getContext());
            }
        }

        public void c(final Context context, final CourseApi courseApi, final FitWorkout fitWorkout) {
            if (context == null || courseApi == null || fitWorkout == null) {
                LogUtil.e("JumpUtil", "params are invalid");
            } else if (d(fitWorkout)) {
                courseApi.getCourseLongVideoInfo(fitWorkout.acquireId(), new UiCallback<LongVideoInfo>() { // from class: com.huawei.health.suggestion.util.JumpUtil.JumpHelper.1
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.a("JumpUtil", "getCourseLongVideoInfo failed, errorCode: ", Integer.valueOf(i), ", errorInfo: ", str, ", try to jump course detail");
                        JumpHelper.this.b(context, fitWorkout);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(LongVideoInfo longVideoInfo) {
                        courseApi.postUserCourse(fitWorkout.acquireId(), fitWorkout.accquireVersion(), 0);
                        JumpHelper.this.d(context, longVideoInfo.getUrl(), fitWorkout);
                    }
                });
            }
        }

        public boolean c(CourseApi courseApi, FitWorkout fitWorkout) {
            return (fitWorkout == null || courseApi == null || courseApi.getCourseMediaFilesLength(fitWorkout.acquireId(), fitWorkout.accquireVersion()) != 0) ? false : true;
        }

        public void c(Context context, FitWorkout fitWorkout) {
            if (context == null || fitWorkout == null) {
                LogUtil.e("JumpUtil", "context or workout is invalid");
                return;
            }
            CoachData coachDataE = e(fitWorkout, false);
            if (gzx.e(coachDataE)) {
                boolean zE = e();
                hjs.b().e(fitWorkout);
                WorkoutRecord workoutRecordC = c(fitWorkout);
                workoutRecordC.saveExerciseTime(System.currentTimeMillis());
                Intent intent = new Intent(context, (Class<?>) CoachActivity.class);
                intent.putExtra("BASE_AUDIO_TIMBRE", fitWorkout.getTimbre());
                intent.putExtra("islinkedfitness", zE);
                intent.putExtra("isafterrun", false);
                intent.putExtra(ContentTemplateRecord.MOTIONS, coachDataE);
                intent.putExtra("coachstartposition", 0);
                intent.putExtra("havenexttrain", false);
                intent.putExtra("workoutrecord", workoutRecordC);
                intent.putExtra("entrance", "DailyMoment");
                intent.putExtra("ISPLANFIT", false);
                iov.d(context, intent);
            }
        }

        public void b(Context context, FitWorkout fitWorkout) {
            e(context, fitWorkout, false);
        }

        public void e(Context context, FitWorkout fitWorkout, boolean z) {
            if (fitWorkout == null) {
                return;
            }
            pcd pcdVar = new pcd(fitWorkout.acquireId());
            pcdVar.a("DailyMoment");
            pcdVar.h(z);
            pea.a(context, fitWorkout, pcdVar);
        }

        public void e(Context context, int i) {
            String str;
            LogUtil.a("JumpUtil", "jumpToHistoryPlanList");
            if (context == null) {
                LogUtil.j("JumpUtil", "jumpToHistoryPlanList() context is null");
                return;
            }
            if (i == 2) {
                str = "#/my_plan_list?planType=0";
            } else if (i == 3) {
                str = "#/my_plan_list?planType=1";
            } else {
                LogUtil.a("JumpUtil", "jumpToHistoryPlanList all planType");
                str = "#/my_plan_list?planType=";
            }
            OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
            if (operationUtilsApi != null) {
                operationUtilsApi.initH5pro();
                H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).setImmerse().showStatusBar().addPath(str).setStatusBarTextBlack(true).setForceDarkMode(1).build();
                IntelligentPlanH5Repository.registerService();
                H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.ai-weight", h5ProLaunchOptionBuild);
            }
        }

        public void c(Context context, int i) {
            c(context, i, CommonUtil.e(SharedPreferenceManager.e(context, Integer.toString(20002), "map_tracking_sport_type"), 258) == 264 ? 5 : 4, "RUNNING_COURSE");
            HashMap map = new HashMap(1);
            map.put("click", 1);
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_SPORT_TAP_ALL_RUNNING_COURSE_1120018.value(), map, 0);
        }

        public void c(Context context, int i, int i2, String str) {
            Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) SportAllCourseActivity.class);
            intent.putExtra("COURSE_CATEGORY_KEY", i);
            int iB = idy.b(str);
            intent.putExtra("SKIP_ALL_COURSE_KEY", str);
            intent.addFlags(268435456);
            iov.d(context, intent);
            iei.e(iB, i2);
        }

        public void d(Context context, FitWorkout fitWorkout, Map<String, Object> map) {
            idy.b("1130015", map);
            pcd pcdVar = new pcd(fitWorkout.acquireId());
            pcdVar.a(hiu.e(map, "entrance"));
            if (fitWorkout.getCourseDefineType() == 1) {
                pcdVar.i(1);
            }
            pea.a(context, fitWorkout, pcdVar);
        }

        public void d(Context context, pcp pcpVar) {
            if (FitnessExternalUtils.b() && !FitnessExternalUtils.c()) {
                c(context, pcpVar);
            } else {
                b();
            }
        }

        private void c(Context context, pcp pcpVar) {
            Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) RunPlanCreateActivity.class);
            intent.putExtra("runPlanTitle", pcpVar.f());
            intent.putExtra("runPlanType", pcpVar.e());
            intent.setFlags(268435456);
            iov.d(context, intent);
        }

        private void b() {
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.e("JumpUtil", "bindRunPlanInfo, getCurrentPlan : planApi is null.");
            } else {
                planApi.setPlanType(0);
                planApi.checkAllowCreateOldPlan(new UiCallback<Boolean>() { // from class: com.huawei.health.suggestion.util.JumpUtil.JumpHelper.2
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        ReleaseLogUtil.a("JumpUtil", "checkAllowCreateOldPlan()  failed errorCode=", Integer.valueOf(i));
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(Boolean bool) {
                        if (bool != null) {
                            JumpHelper.this.c();
                        } else {
                            ReleaseLogUtil.a("JumpUtil", "checkAllowCreateOldPlan() onSuccess plan is null");
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(BaseApplication.getContext());
            builder.b(R.string.IDS_sport_notify_update_app);
            final NoTitleCustomAlertDialog noTitleCustomAlertDialog = null;
            builder.c(R.string.IDS_update_new_version_to_upgrade_app, new View.OnClickListener() { // from class: ifb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    JumpUtil.JumpHelper.d(noTitleCustomAlertDialog, view);
                }
            });
            builder.a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: ifd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    JumpUtil.JumpHelper.d(view);
                }
            });
            builder.c().show();
        }

        public static /* synthetic */ void d(NoTitleCustomAlertDialog noTitleCustomAlertDialog, View view) {
            if (lsj.c(BaseApplication.getContext(), "com.huawei.appmarket")) {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=" + BaseApplication.getAppPackage()));
                intent.addFlags(268435456);
                intent.setPackage("com.huawei.appmarket");
                qrs.c(intent, "com.huawei.appmarket", BaseApplication.getContext(), qre.f(com.huawei.ui.commonui.R.string.IDS_device_fragment_application_market));
            } else {
                qpx.e(BaseApplication.getContext(), R.string.IDS_main_sns_app_store_content);
            }
            noTitleCustomAlertDialog.dismiss();
        }

        public void d(Context context, int i) {
            Intent intent = new Intent(btx.c(), (Class<?>) MyFitnessCourseActivity.class);
            intent.putExtra("intent_behavior_key", i);
            intent.putExtra("courseCategoryKey", 258);
            intent.putExtra("titleName", btx.c().getString(R.string.IDS_fitness_advice_run_my_running_course));
            intent.addFlags(268435456);
            iov.d(context, intent);
            HashMap map = new HashMap(10);
            map.put("click", 1);
            lmf.d().c(context, AnalyticsValue.HEALTH_SPORT_TAP_MY_RUNNING_COURSE_1120017.value(), map, 0);
        }

        public void a(Context context, int i) {
            Intent intent = new Intent(btx.c(), (Class<?>) MyFitnessCourseActivity.class);
            intent.putExtra("intent_behavior_key", i);
            intent.putExtra("courseCategoryKey", 257);
            intent.putExtra("titleName", context.getString(R.string.IDS_my_walk_course));
            intent.addFlags(268435456);
            iov.d(context, intent);
            HashMap map = new HashMap(10);
            map.put("click", 1);
            lmf.d().c(context, AnalyticsValue.HEALTH_SPORT_TAP_MY_RUNNING_COURSE_1120017.value(), map, 0);
        }

        public void d(Context context) {
            Intent intent = new Intent(context, (Class<?>) AiPlanActivity.class);
            intent.putExtra("plantype", 2);
            intent.addFlags(268435456);
            iov.d(context, intent);
            idy.c("1120019");
        }

        public void e(Plan plan, PlanWorkout planWorkout) {
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.j("JumpUtil", "startRunPlan : planApi is null.");
                return;
            }
            planApi.setPlanType(0);
            if (hcg.e().d()) {
                gzm.c(planWorkout);
                HashMap map = new HashMap(16);
                map.put("click", 1);
                map.put(BleConstants.SPORT_TYPE, 1);
                idy.b(AnalyticsValue.HEALTH_HOME_START_TRAIN_BTN_2010037.value(), map);
            }
        }

        public void j(Context context) {
            if (isa.d()) {
                LogUtil.a("JumpUtil", "jump to discover.");
                AppRouter.c("/home/main").e("openDiscover", true).b(com.huawei.haf.application.BaseApplication.b());
            } else {
                H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
                builder.addPath("#/PrivilegeDetail?functionId=1");
                ddv.b().loadH5ProApp(context, "com.huawei.health.h5.vip", builder);
            }
        }

        public void d(Context context, FitWorkout fitWorkout, RecordPlanInfo recordPlanInfo, Bundle bundle) {
            if (hcu.b().c(context, fitWorkout, recordPlanInfo, bundle) == 0) {
                d();
            }
        }

        public void c(Context context, String str, int i) {
            ddv.b().initH5Pro();
            StringBuilder sb = new StringBuilder("#/home");
            if (!TextUtils.isEmpty(str)) {
                sb.append("?planTempId=");
                sb.append(str);
                sb.append("&planType=");
                sb.append(i);
            }
            H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).setImmerse().showStatusBar().setStatusBarTextBlack(true).addPath(sb.toString()).setForceDarkMode(0).build();
            IntelligentPlanH5Repository.registerService();
            H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.general-plan", h5ProLaunchOptionBuild);
            d();
        }

        private WorkoutRecord c(FitWorkout fitWorkout) {
            WorkoutRecord workoutRecord = new WorkoutRecord();
            if (fitWorkout == null) {
                return workoutRecord;
            }
            workoutRecord.saveWorkoutId(fitWorkout.acquireId());
            workoutRecord.saveVersion(fitWorkout.accquireVersion());
            workoutRecord.saveExerciseTime(System.currentTimeMillis());
            workoutRecord.savePlanId("");
            workoutRecord.saveWorkoutName(fitWorkout.acquireName());
            workoutRecord.saveCalorie(fitWorkout.acquireCalorie());
            workoutRecord.saveCategory(fitWorkout.getCategory());
            workoutRecord.saveHeartRateDataList(new ArrayList());
            workoutRecord.saveInvalidHeartRateList(new ArrayList());
            return workoutRecord;
        }

        private boolean d(FitWorkout fitWorkout) {
            Video videoA = a(fitWorkout);
            return (videoA == null || videoA.getFileId() == null) ? false : true;
        }

        private Video a(FitWorkout fitWorkout) {
            WorkoutAction workoutAction;
            Video video;
            if (fitWorkout == null) {
                return null;
            }
            List<WorkoutAction> listAcquireWorkoutActions = fitWorkout.acquireWorkoutActions();
            if (njy.e(listAcquireWorkoutActions, 0) || (workoutAction = listAcquireWorkoutActions.get(0)) == null || workoutAction.getAction() == null) {
                return null;
            }
            List extendPropertyList = workoutAction.getAction().getExtendPropertyList("actionVideo", Video[].class);
            if (njy.e(extendPropertyList, 0) || (video = (Video) extendPropertyList.get(0)) == null) {
                return null;
            }
            return video;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Context context, String str, FitWorkout fitWorkout) {
            LogUtil.a("JumpUtil", "long video url: " + str);
            CoachData coachDataE = e(fitWorkout, true);
            if (!gzx.e(coachDataE)) {
                LogUtil.j("JumpUtil", "startLongCoachActivity mCoachData is null");
                return;
            }
            LogUtil.a("JumpUtil", "startLongCoachActivity isSupportDevices:", Integer.valueOf(fitWorkout.acquireIsSupportDevice()));
            ecu.d().unregisterDataCallback(0);
            hjs.b().e(fitWorkout);
            Intent intent = new Intent(context, (Class<?>) LongCoachActivity.class);
            intent.putExtra("islinkedfitness", e());
            intent.putExtra("isafterrun", false);
            List<Motion> listAcquireMotions = coachDataE.acquireMotions();
            if (njy.b(listAcquireMotions) && njy.c(listAcquireMotions, 0)) {
                e(fitWorkout, listAcquireMotions.get(0));
            }
            intent.putExtra(ContentTemplateRecord.MOTIONS, coachDataE);
            intent.putExtra("commodityFlag", fitWorkout.acquireCommodityFlag());
            intent.putExtra("long_coach_type", fitWorkout.getVideoProperty());
            intent.putExtra("long_coach_video_url", str);
            intent.putExtra("long_coach_show_action", fitWorkout.getWorkoutActionProperty());
            intent.putExtra("long_coach_need_calories", fitWorkout.getShowCalories());
            intent.putExtra("long_coach_need_countdown", fitWorkout.getShowCountdown());
            intent.putExtra("long_coach_need_heart_rate", fitWorkout.getShowHeartRate());
            intent.putExtra("havenexttrain", false);
            WorkoutRecord workoutRecordC = c(fitWorkout);
            intent.putExtra("coach_detail_name", !TextUtils.isEmpty(workoutRecordC.acquireWorkoutName()) ? workoutRecordC.acquireWorkoutName() : fitWorkout.acquireName());
            intent.putExtra("coach_detail_picture", FitWorkout.nullToStr(!TextUtils.isEmpty(fitWorkout.acquireMidPicture()) ? fitWorkout.acquireMidPicture() : fitWorkout.acquirePicture()));
            intent.putExtra("workoutrecord", workoutRecordC);
            intent.putExtra("bundlekey", "");
            intent.putExtra("topic_name", "");
            intent.putExtra("entrance", "DailyMoment");
            intent.putExtra("ISPLANFIT", false);
            iov.d(context, intent);
        }

        private CoachData e(FitWorkout fitWorkout, boolean z) {
            CoachData coachData = new CoachData();
            if (fitWorkout == null) {
                return coachData;
            }
            coachData.saveWorkId(fitWorkout.acquireId());
            coachData.savePlanId("");
            coachData.saveDuration(fitWorkout.acquireDuration());
            coachData.saveMotions(d(fitWorkout, z));
            return coachData;
        }

        private List<Motion> d(FitWorkout fitWorkout, boolean z) {
            List<ChoreographedSingleAction> listC = ien.c(fitWorkout.acquireWorkoutActions());
            ArrayList arrayList = new ArrayList(10);
            if (z) {
                hkt.d(listC, fitWorkout.acquireId(), (ArrayList<Motion>) arrayList);
                return arrayList;
            }
            hkt.a(listC, ied.e(), fitWorkout.acquireId(), arrayList);
            return arrayList;
        }

        private void e(FitWorkout fitWorkout, Motion motion) {
            if (motion == null) {
                ReleaseLogUtil.e("JumpUtil", "setVideoSegmentIntoMotion mFitWorkout or motion null");
                return;
            }
            Video videoA = a(fitWorkout);
            if (videoA == null) {
                return;
            }
            List<VideoSegment> videoSegmentList = videoA.getVideoSegmentList();
            if (njy.b(videoSegmentList)) {
                motion.setVideoSegments(videoSegmentList);
            }
        }

        private boolean e() {
            DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "JumpUtil");
            if (deviceInfo == null) {
                return false;
            }
            Map<String, DeviceCapability> mapQueryDeviceCapability = ecu.d().queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "JumpUtil");
            if (mapQueryDeviceCapability != null && mapQueryDeviceCapability.containsKey(deviceInfo.getDeviceIdentify())) {
                return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify()) != null && mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify()).isSupportPosture();
            }
            LogUtil.j("JumpUtil", "deviceCapabilityHashMaps is empty or does not contain key:", deviceInfo.getDeviceIdentify());
            return false;
        }

        public void a(Context context) {
            LogUtil.a("JumpUtil", "jumpToPlanTab");
            if (context == null) {
                LogUtil.j("JumpUtil", "jumpToPlanTab() context is null");
                return;
            }
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setClassName(context.getPackageName(), "com.huawei.health.MainActivity");
            if ((context instanceof Activity) && ((Activity) context).getWindowManager().getDefaultDisplay().getRotation() == 1 && qrs.ah(BaseApplication.getContext())) {
                intent.setFlags(131072);
            } else {
                intent.setFlags(872415232);
            }
            intent.putExtra("isToSportTab", true);
            intent.putExtra(BleConstants.SPORT_TYPE, 2);
            intent.putExtra(Constants.HOME_TAB_NAME, "SPORT");
            iov.d(context, intent);
        }

        public void e(Context context) {
            LogUtil.a("JumpUtil", "jumpToMyPlanH5");
            if (context == null) {
                LogUtil.j("JumpUtil", "jumpToMyPlanH5() context is null");
                return;
            }
            OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
            if (operationUtilsApi != null) {
                operationUtilsApi.initH5pro();
                H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).setImmerse().showStatusBar().addPath("#/my_plan").setStatusBarTextBlack(true).setForceDarkMode(1).build();
                IntelligentPlanH5Repository.registerService();
                H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.ai-weight", h5ProLaunchOptionBuild);
            }
        }

        public void c(Context context) {
            LogUtil.a("JumpUtil", "jumpToTrainingDaySettingsH5");
            if (context == null) {
                LogUtil.j("JumpUtil", "jumpToTrainingDaySettingsH5() context is null");
                return;
            }
            OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
            if (operationUtilsApi != null) {
                operationUtilsApi.initH5pro();
                H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).setImmerse().showStatusBar().addPath("#/set_training_day").setStatusBarTextBlack(true).setForceDarkMode(1).build();
                IntelligentPlanH5Repository.registerService();
                H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.ai-weight", h5ProLaunchOptionBuild);
            }
        }

        public void d(int i, String str, String str2) {
            WeakReference<Context> weakReference = this.f10221b;
            if (weakReference == null) {
                LogUtil.j("JumpUtil", "jumpToCreatePlan() mContextReference is null");
                return;
            }
            Context context = weakReference.get();
            if (context == null) {
                LogUtil.j("JumpUtil", "jumpToCreatePlan() context is null");
                d();
                return;
            }
            if (i == IntPlan.PlanType.AI_RUN_PLAN.getType()) {
                c(str, context, false);
                return;
            }
            if (i == IntPlan.PlanType.FIT_PLAN.getType()) {
                PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
                if (planApi == null) {
                    d();
                    LogUtil.j("JumpUtil", "initData : planApi is null.");
                    return;
                } else {
                    c(planApi.getFitnessPkgInfoByTempId(str), str, context, false);
                    return;
                }
            }
            if (i == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
                c(context, i, str, str2, "");
            } else {
                d();
                LogUtil.j("JumpUtil", "jumpToCreatePlan invalid param");
            }
        }

        public void c(Context context, int i, String str, String str2, String str3) {
            Activity activityJ;
            ReleaseLogUtil.d("JumpUtil", "jumpToCreateAiFitnessPlanH5");
            if (context == null) {
                LogUtil.j("JumpUtil", "jumpToCreateAiFitnessPlanH5() context is null");
                d();
                return;
            }
            if (!lua.e()) {
                ReleaseLogUtil.e("JumpUtil", "pull all status false");
                qpx.e(BaseApplication.getContext(), R.string.IDS_hw_show_sync_data_in_progress);
                return;
            }
            H5ProClient.getServiceManager().registerService((Class<?>) ddv.b().getCommonJsModule("PlanDeviceManager"));
            OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
            if (operationUtilsApi != null) {
                operationUtilsApi.initH5pro();
                H5ProLaunchOption.Builder forceDarkMode = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).addCustomizeJsModule("weight", ddv.b().getCommonJsModule("weight")).addCustomizeJsModule("WeightManagement", ddv.b().getCommonJsModule("WeightManagement")).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement")).addCustomizeJsModule("LocationService", ddv.b().getCommonJsModule("LocationService")).addCustomizeJsModule(ArkUIJsApi.MODEL, ddv.b().getCommonJsModule(ArkUIJsApi.MODEL)).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeArg("planType", String.valueOf(i)).addCustomizeArg("planTempId", str).addCustomizeArg("entrySource", str2).setImmerse().showStatusBar().setNeedSoftInputAdapter().addPath(btw.a() ? "#/recomend_infomation" : "#/plan_introduce").setStatusBarTextBlack(true).setForceDarkMode(1);
                H5ProServiceManager.getInstance().registerService(SeriesCourseH5Repository.class);
                if (!TextUtils.isEmpty(str2)) {
                    forceDarkMode.setStartSource(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    forceDarkMode.setFromPageTitle(str3);
                }
                if (DeviceTypeConsts.WATCH.equals(str2)) {
                    forceDarkMode.setActivityStartFlag(67108864);
                    if (!(context instanceof Activity) && (activityJ = com.huawei.haf.application.BaseApplication.j()) != null) {
                        context = activityJ;
                    }
                }
                WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
                if (weightApi != null) {
                    H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
                    H5ProServiceManager.getInstance().registerService(weightApi.getCustomRecipe());
                } else {
                    LogUtil.j("JumpUtil", "jumpToCreateAiFitnessPlanH5 weightApi is null.");
                }
                IntelligentPlanH5Repository.registerService();
                H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.ai-weight", forceDarkMode.build());
            }
            d();
        }

        public void b(Context context) {
            ReleaseLogUtil.d("JumpUtil", "jumpToPlanDetailH5");
            if (context == null) {
                LogUtil.j("JumpUtil", "jumpToPlanDetailH5() context is null");
                return;
            }
            OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
            if (operationUtilsApi != null) {
                operationUtilsApi.initH5pro();
                H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).setImmerse().showStatusBar().addPath("#/program_details").setStatusBarTextBlack(true).setForceDarkMode(1).build();
                WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
                if (weightApi != null) {
                    H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
                } else {
                    LogUtil.j("JumpUtil", "weightApi is null.");
                }
                IntelligentPlanH5Repository.registerService();
                H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.ai-weight", h5ProLaunchOptionBuild);
            }
        }

        public void e(Context context, double d, double d2, String str) {
            if (context == null) {
                LogUtil.j("JumpUtil", "joinInputActivity() context is null");
            } else {
                iun.c(context);
            }
        }

        public void a(Context context, String str, int i) {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setClassName(context.getPackageName(), "com.huawei.health.device.ui.DeviceMainActivity");
            intent.putExtra("kind", str);
            intent.putExtra("view", "MeasureDevice");
            intent.putExtra("type", i);
            iov.d(context, intent);
        }

        public void c(int i, int i2, String str, int i3) {
            WeakReference<Context> weakReference = this.f10221b;
            if (weakReference == null) {
                LogUtil.j("JumpUtil", "jumpToPlanReport() mContextReference is null");
                return;
            }
            Context context = weakReference.get();
            if (context == null) {
                LogUtil.j("JumpUtil", "jumpToPlanReport() context is null");
                return;
            }
            if (i2 == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
                LogUtil.j("JumpUtil", "jumpToPlanReport goto ai fitness");
                e(i, context, i2, str);
                return;
            }
            if (i2 == IntPlan.PlanType.AI_RUN_PLAN.getType() || (i2 == IntPlan.PlanType.FIT_PLAN.getType() && i3 == 2)) {
                Intent intent = new Intent(context, (Class<?>) MyPlanReportActivity.class);
                intent.putExtra("planId", str);
                intent.putExtra("plantype", i2);
                intent.setFlags(268435456);
                iov.d(context, intent);
                return;
            }
            if (i2 == IntPlan.PlanType.RUN_PLAN.getType()) {
                Intent intent2 = new Intent(context, (Class<?>) TrainEventActivity.class);
                intent2.setFlags(268435456);
                intent2.putExtra("planid", str);
                intent2.putExtra("plantype", 0);
                iov.d(context, intent2);
                return;
            }
            if (i2 == IntPlan.PlanType.FIT_PLAN.getType()) {
                Intent intent3 = new Intent(context, (Class<?>) TrainEventActivity.class);
                intent3.setFlags(268435456);
                intent3.putExtra("planid", str);
                intent3.putExtra("plantype", 3);
                iov.d(context, intent3);
                return;
            }
            LogUtil.j("JumpUtil", "jumpToPlanReport invalid param");
        }

        private void e(int i, Context context, int i2, String str) {
            OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
            if (operationUtilsApi != null) {
                operationUtilsApi.initH5pro();
                H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).setImmerse().showStatusBar().addCustomizeArg("reportType", String.valueOf(i)).addCustomizeArg("planType", String.valueOf(i2)).addCustomizeArg("planId", str).addCustomizeArg("from", String.valueOf(2)).addPath("#/weekly_report").setStatusBarTextBlack(true).build();
                IntelligentPlanH5Repository.registerService();
                H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.ai-weight", h5ProLaunchOptionBuild);
            }
        }

        public void e(Context context, String str) {
            if (context == null) {
                LogUtil.j("JumpUtil", "context is null");
                return;
            }
            LogUtil.j("JumpUtil", "jumpToWeightDataActivity");
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("from", str);
            }
            iun.d(str, bundle);
        }

        public void c(String str, String... strArr) {
            d("#/diet_recording_tool?from=3&date=" + (ltb.b(str + " 00:00:00") / 1000), strArr);
        }

        public void e(long j, int i, int i2) {
            d("#/record_breakfast?date=" + (j / 1000) + "&whichMeal=" + i + "&index=" + i2, "weightControlPlan");
        }

        private void d(String str, String... strArr) {
            LogUtil.a("JumpUtil", "jumpToDietH5Page() path: ", str);
            ddv.b().initH5Pro();
            H5ProLaunchOption.Builder builderAddCustomizeArg = new H5ProLaunchOption.Builder().addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddv.b().getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL)).addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).setImmerse().showStatusBar().setStatusBarTextBlack(true).setNeedSoftInputAdapter().addCustomizeJsModule("DietKakaUtil", DietKakaUtil.class).addPath(str + "&from=3").addCustomizeArg("entrySource", "plan");
            if (strArr != null && strArr.length > 0) {
                builderAddCustomizeArg.addGlobalBiParam(WebViewHelp.BI_KEY_PULL_FROM, strArr[0]);
            }
            WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
            if (weightApi == null) {
                return;
            }
            H5ProServiceManager.getInstance().registerService(weightApi.getCustomRecipe());
            H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
            H5ProClient.startH5MiniProgram(com.huawei.haf.application.BaseApplication.b(), ddx.e, builderAddCustomizeArg.build());
        }

        public void h(Context context) {
            if (isa.d()) {
                LogUtil.a("JumpUtil", "jump to discover.");
                AppRouter.c("/home/main").e("openDiscover", true).b(com.huawei.haf.application.BaseApplication.b());
            } else {
                irz.d(context, "from=7");
            }
        }

        public void d(int i, String str, int i2, String str2, String str3) {
            WeakReference<Context> weakReference = this.f10221b;
            if (weakReference == null) {
                LogUtil.j("JumpUtil", "jumpToPlanFromDp() mContextReference is null");
                return;
            }
            Context context = weakReference.get();
            if (context == null) {
                LogUtil.j("JumpUtil", "jumpToPlanFromDp context == null");
                d();
                return;
            }
            if (TextUtils.isEmpty(str) || i == IntPlan.PlanType.RUN_PLAN.getType() || i == IntPlan.PlanType.NA_PLAN.getType()) {
                LogUtil.a("JumpUtil", "planTempId is empty or planType error ", Integer.valueOf(i), "pullFrom:", str2);
                a(context);
                if (i == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
                    btw.a(hot.c(str2), 1, 1, 1);
                }
                d();
                return;
            }
            if (i == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
                e(i, str, str2, str3, context);
                return;
            }
            if (i == IntPlan.PlanType.FIT_PLAN.getType()) {
                if (FitnessExternalUtils.d() && i2 == 2) {
                    c(context, str, IntPlan.PlanType.FIT_PLAN.getType());
                    return;
                } else {
                    e(str, context);
                    return;
                }
            }
            if (i == IntPlan.PlanType.AI_RUN_PLAN.getType()) {
                c(str, context);
            } else {
                a(context);
            }
        }

        public void e(IntPlan intPlan) {
            String memberEquityPictureForPhone;
            String memberEquityPictureForPad;
            String string;
            String string2;
            PlanPoster planPosterC = c(intPlan);
            if (planPosterC != null) {
                memberEquityPictureForPhone = planPosterC.getMemberEquityPictureForPhone();
                memberEquityPictureForPad = planPosterC.getMemberEquityPictureForPad();
            } else {
                memberEquityPictureForPhone = null;
                memberEquityPictureForPad = null;
            }
            if (!TextUtils.isEmpty(memberEquityPictureForPhone) && !TextUtils.isEmpty(memberEquityPictureForPad)) {
                LogUtil.a("JumpUtil", "posterUrl:", memberEquityPictureForPhone, " posterPadUrl:", memberEquityPictureForPad);
                e(memberEquityPictureForPhone, memberEquityPictureForPad, intPlan.getMetaInfo().getName());
                return;
            }
            if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN)) {
                e(BaseApplication.getContext().getResources().getString(R.string.sug_ai_run_plan_des_url), BaseApplication.getContext().getResources().getString(R.string.sug_ai_run_plan_des_pad_url), intPlan.getMetaInfo().getName());
                return;
            }
            if (intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
                if (Utils.o()) {
                    String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010);
                    string = d(accountInfo, false);
                    string2 = d(accountInfo, true);
                } else {
                    string = BaseApplication.getContext().getResources().getString(R.string.sug_ai_fitness_plan_des_url);
                    string2 = BaseApplication.getContext().getResources().getString(R.string.sug_ai_fitness_plan_des_pad_url);
                }
                e(string, string2, intPlan.getMetaInfo().getName());
                return;
            }
            h(BaseApplication.getContext());
        }

        private PlanPoster c(IntPlan intPlan) {
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.j("JumpUtil", "getPlanPoster : planApi is null.");
                return null;
            }
            if (intPlan.getMetaInfo() == null) {
                LogUtil.j("JumpUtil", "getPlanPoster : getMetaInfo is null.");
                return null;
            }
            FitnessPackageInfo fitnessPkgInfoByTempId = planApi.getFitnessPkgInfoByTempId(intPlan.getMetaInfo().getPlanTempId());
            if (fitnessPkgInfoByTempId != null) {
                return fitnessPkgInfoByTempId.getPlanPoster();
            }
            return null;
        }

        private String d(String str, boolean z) {
            if (TextUtils.isEmpty(str)) {
                return BaseApplication.getContext().getResources().getString(R.string.sug_ai_fitness_plan_oversea_des_url);
            }
            if ("de".equals(str.toLowerCase(Locale.ENGLISH))) {
                if (z) {
                    return BaseApplication.getContext().getResources().getString(R.string.sug_ai_fitness_plan_oversea_de_pad_url);
                }
                return BaseApplication.getContext().getResources().getString(R.string.sug_ai_fitness_plan_oversea_de_url);
            }
            if (!"it".equals(str.toLowerCase(Locale.ENGLISH))) {
                return BaseApplication.getContext().getResources().getString(R.string.sug_ai_fitness_plan_oversea_des_url);
            }
            if (z) {
                return BaseApplication.getContext().getResources().getString(R.string.sug_ai_fitness_plan_oversea_it_pad_url);
            }
            return BaseApplication.getContext().getResources().getString(R.string.sug_ai_fitness_plan_oversea_it_url);
        }

        public void c(int i, String str) {
            if (i == IntPlan.PlanType.AI_RUN_PLAN.getType()) {
                e(BaseApplication.getContext().getResources().getString(R.string.sug_ai_run_plan_des_url), BaseApplication.getContext().getResources().getString(R.string.sug_ai_run_plan_des_pad_url), BaseApplication.getContext().getString(R.string.IDS_plan_intelligence_running));
                return;
            }
            if (this.f10221b == null) {
                this.f10221b = new WeakReference<>(BaseApplication.getContext());
            }
            d(i, str, "");
        }

        public void a(String str) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("JumpUtil", "jumpToVipBenefit path is empty");
                d();
                return;
            }
            if (isa.d()) {
                LogUtil.a("JumpUtil", "jump to discover.");
                AppRouter.c("/home/main").e("openDiscover", true).b(com.huawei.haf.application.BaseApplication.b());
            } else {
                H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
                builder.addPath(str);
                LogUtil.a("JumpUtil", str);
                ddv.b().loadH5ProApp(com.huawei.haf.application.BaseApplication.b(), "com.huawei.health.h5.vip", builder);
            }
            d();
        }

        public void e(String str, String str2, String str3) {
            a("#/PrivilegeDetail?detailImgUrl=" + str + "&detailBigImgUrl=" + str2 + "&title=" + str3);
        }

        public void a(JumpFinishCallback jumpFinishCallback) {
            this.f10222c = new WeakReference<>(jumpFinishCallback);
        }

        public void c(JumpViewInterface jumpViewInterface) {
            this.e = new WeakReference<>(jumpViewInterface);
        }

        private void e(String str, Context context) {
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                d();
                LogUtil.j("JumpUtil", "initData : planApi is null.");
            } else {
                e(planApi.getFitnessPkgInfoByTempId(str), str, context);
            }
        }

        public void e(final FitnessPackageInfo fitnessPackageInfo, final String str, final Context context) {
            if (fitnessPackageInfo == null) {
                a(context);
                d();
            } else {
                ifi.b(new JudgeCallback() { // from class: iez
                    @Override // com.huawei.health.suggestion.callback.JudgeCallback
                    public final void onJudgeCallback(Object obj) {
                        this.e.c(str, context, fitnessPackageInfo, (IntPlan) obj);
                    }
                });
            }
        }

        public /* synthetic */ void c(String str, Context context, FitnessPackageInfo fitnessPackageInfo, IntPlan intPlan) {
            if (intPlan != null && TextUtils.equals(intPlan.getPlanTempId(), str)) {
                a(context);
                d();
            } else {
                c(fitnessPackageInfo, str, context, intPlan != null);
            }
        }

        private void c(final FitnessPackageInfo fitnessPackageInfo, final String str, final Context context, final boolean z) {
            if (fitnessPackageInfo.getCommodityFlag() == 0) {
                b(context, str);
            } else {
                ResourceJudgeUtil.c(2, str, fitnessPackageInfo.getCommodityFlag() == 1 ? 2 : 3, (JudgeCallback<Integer>) new JudgeCallback() { // from class: ifj
                    @Override // com.huawei.health.suggestion.callback.JudgeCallback
                    public final void onJudgeCallback(Object obj) {
                        this.d.c(z, context, str, fitnessPackageInfo, (Integer) obj);
                    }
                });
            }
        }

        public /* synthetic */ void c(boolean z, Context context, String str, FitnessPackageInfo fitnessPackageInfo, Integer num) {
            LogUtil.e("JumpUtil", "jumpFitPlanWithVipJudge: resourceJudge result is ", num, "hasCurrentPlan = ", Boolean.valueOf(z));
            if (num.intValue() == 0) {
                b(context, str);
                d();
                return;
            }
            if ((num.intValue() == 2 && fitnessPackageInfo.getCommodityFlag() == 2) || num.intValue() == 3) {
                e(ifx.b(fitnessPackageInfo, str));
                d();
                return;
            }
            if (num.intValue() == 2 || z) {
                b(IntPlan.PlanType.FIT_PLAN.getType(), context, str);
            } else {
                b(context, str);
            }
            d();
        }

        public void e(String str) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("JumpUtil", "jumpToVipBenefit path is empty");
                d();
                return;
            }
            if (isa.d()) {
                LogUtil.a("JumpUtil", "jump to member relay.");
                irz.d(BaseApplication.getContext(), "");
            } else {
                H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
                builder.addPath(str);
                LogUtil.a("JumpUtil", str);
                ddv.b().loadH5ProApp(com.huawei.haf.application.BaseApplication.b(), "com.huawei.health.h5.vip", builder);
            }
            d();
        }

        public void a(Map<String, String> map) {
            WeakReference<Context> weakReference = this.f10221b;
            if (weakReference == null) {
                LogUtil.j("JumpUtil", "jumpToPlanListH5() mContextReference is null");
                return;
            }
            Context context = weakReference.get();
            if (context == null) {
                LogUtil.j("JumpUtil", "jumpToPlanListH5() context is null");
                return;
            }
            OperationUtilsApi operationUtilsApi = (OperationUtilsApi) Services.d("PluginOperation", OperationUtilsApi.class);
            if (operationUtilsApi != null) {
                operationUtilsApi.initH5pro();
                H5ProLaunchOption h5ProLaunchOptionA = a("#/train_plan_list", map);
                IntelligentPlanH5Repository.registerService();
                WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
                if (weightApi != null) {
                    H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
                } else {
                    LogUtil.j("JumpUtil", "jumpToPlanListH5 weightApi is null.");
                }
                H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.ai-weight", h5ProLaunchOptionA);
            }
        }

        public void c(final String str, final Context context) {
            ifi.b(new JudgeCallback() { // from class: ifg
                @Override // com.huawei.health.suggestion.callback.JudgeCallback
                public final void onJudgeCallback(Object obj) {
                    this.f37559b.b(str, context, (IntPlan) obj);
                }
            });
        }

        public /* synthetic */ void b(String str, Context context, IntPlan intPlan) {
            if (intPlan != null && TextUtils.equals(intPlan.getPlanTempId(), str)) {
                a(context);
                d();
            } else {
                c(str, context, intPlan != null);
            }
        }

        private void c(final String str, final Context context, final boolean z) {
            PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
            if (planApi == null) {
                LogUtil.e("JumpUtil", "Jump getPlanData : planApi is null.");
                e(context, (pcp) null);
                d();
                return;
            }
            planApi.getAllPlans(0, new UiCallback<pdn>() { // from class: com.huawei.health.suggestion.util.JumpUtil.JumpHelper.5
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.e("JumpUtil", "No current plan now.", Integer.valueOf(i), " ", str2);
                    JumpHelper.this.e(context, (pcp) null);
                    JumpHelper.this.d();
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(pdn pdnVar) {
                    if (pdnVar == null || njy.e(pdnVar.a())) {
                        JumpHelper.this.e(context, (pcp) null);
                        JumpHelper.this.d();
                    } else {
                        JumpHelper.this.d(ifi.e(str, pdnVar.a()), str, context, z);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(final pcp pcpVar, final String str, final Context context, final boolean z) {
            if (pcpVar == null) {
                e(context, (pcp) null);
                d();
                return;
            }
            if (Utils.o()) {
                if (z) {
                    i(context);
                    return;
                } else {
                    b(pcpVar, context);
                    return;
                }
            }
            if (pcpVar.getCommodityFlag() == 0) {
                e(pcpVar, str, context, z);
                d();
            } else {
                int iE = pcpVar.e();
                ResourceJudgeUtil.c(5, String.valueOf(iE), 3, (JudgeCallback<Integer>) new JudgeCallback() { // from class: iey
                    @Override // com.huawei.health.suggestion.callback.JudgeCallback
                    public final void onJudgeCallback(Object obj) {
                        this.f37554c.b(str, pcpVar, context, z, (Integer) obj);
                    }
                });
            }
        }

        public /* synthetic */ void b(String str, pcp pcpVar, Context context, boolean z, Integer num) {
            if (num.intValue() == 3 || num.intValue() == 2) {
                c(IntPlan.PlanType.AI_RUN_PLAN.getType(), str);
            } else {
                e(pcpVar, str, context, z);
            }
            d();
        }

        private void i(final Context context) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
            builder.b(R.string.IDS_sug_has_doing_plan_content);
            builder.c(R.string.IDS_FitnessAdvice_has_doing_plan_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.util.JumpUtil$JumpHelper$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    JumpUtil.a(context);
                }
            }).a(com.huawei.health.basefitnessadvice.R.string.sug_dialog_yes, new View.OnClickListener() { // from class: ifa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    JumpUtil.JumpHelper.c(view);
                }
            });
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
            noTitleCustomAlertDialogC.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ife
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.d.a(dialogInterface);
                }
            });
            noTitleCustomAlertDialogC.show();
            a();
        }

        public /* synthetic */ void a(DialogInterface dialogInterface) {
            d();
        }

        public void b(final pcp pcpVar, final Context context) {
            a();
            final String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
            if (TextUtils.isEmpty(SharedPreferenceManager.e(context, Integer.toString(101010), accountInfo + "agree_plan_privacy_key"))) {
                NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getString(R.string.IDS_ai_run_program_privacy)).a(context.getString(R.string.IDS_user_watchFace_permission_ok).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: iex
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.e.c(context, accountInfo, pcpVar, view);
                    }
                }).d(context.getString(R.string.IDS_plugin_fitnessadvice_cancal).toUpperCase(Locale.getDefault()), new View.OnClickListener() { // from class: iew
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.e.b(view);
                    }
                }).c();
                noTitleCustomAlertDialogC.setCancelable(false);
                noTitleCustomAlertDialogC.show();
                return;
            }
            e(pcpVar, context);
        }

        public /* synthetic */ void c(Context context, String str, pcp pcpVar, View view) {
            SharedPreferenceManager.e(context, Integer.toString(101010), str + "agree_plan_privacy_key", "agree_plan_privacy_key", new StorageParams());
            e(pcpVar, context);
        }

        public /* synthetic */ void b(View view) {
            d();
        }

        private void e(final pcp pcpVar, final Context context) {
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.sug_remind_dialog_view, (ViewGroup) null);
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.dialog_tv_message);
            healthTextView.setMovementMethod(new ScrollingMovementMethod());
            healthTextView.setText(context.getString(R.string.IDS_h5_plan_intro_risk_1) + System.lineSeparator() + context.getString(R.string.IDS_h5_plan_intro_risk_2) + System.lineSeparator() + context.getString(R.string.IDS_h5_plan_intro_risk_3));
            healthTextView.setHyphenationFrequency(1);
            healthTextView.setBreakStrategy(1);
            CustomViewDialog.Builder builderC = new CustomViewDialog.Builder(context).b(R.string.IDS_h5_plan_intro_risk).d(viewInflate).d(R.string.IDS_user_watchFace_permission_ok, new View.OnClickListener() { // from class: iev
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37549b.c(context, pcpVar, view);
                }
            }).c(R.string.IDS_common_disagree, new View.OnClickListener() { // from class: ifc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37558a.e(view);
                }
            });
            ((HealthTextView) viewInflate.findViewById(R.id.dialog_tv_agree)).setText(context.getResources().getString(R.string.IDS_plan_intro_agree));
            CustomViewDialog customViewDialogD = builderC.d();
            customViewDialogD.setCancelable(false);
            customViewDialogD.show();
        }

        public /* synthetic */ void c(Context context, pcp pcpVar, View view) {
            e(context, pcpVar);
        }

        public /* synthetic */ void e(View view) {
            d();
        }

        private void e(pcp pcpVar, String str, Context context, boolean z) {
            if (z) {
                b(IntPlan.PlanType.AI_RUN_PLAN.getType(), context, str);
            } else {
                e(context, pcpVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Context context, pcp pcpVar) {
            Intent intent;
            if (pcpVar == null) {
                intent = new Intent(context, (Class<?>) AiPlanActivity.class);
                intent.putExtra("plantype", 2);
            } else {
                HashMap map = new HashMap(5);
                map.put("click", 1);
                map.put("type", 2);
                map.put("planType", 0);
                map.put("planName", pcpVar.f());
                map.put("enter", "0");
                idy.b(AnalyticsValue.HEALTH_HOME_TRAINING_PROGRAM_PIC_2010036.value(), map);
                Intent intent2 = new Intent(context, (Class<?>) RunPlanCreateActivity.class);
                intent2.putExtra("runPlanTitle", pcpVar.f());
                intent2.putExtra("runPlanType", pcpVar.e());
                intent = intent2;
            }
            intent.setFlags(268435456);
            iov.d(context, intent);
            d();
        }

        private void b(Context context, String str) {
            if (TextUtils.isEmpty(str)) {
                d();
                LogUtil.e("JumpUtil", "jumpToFitnessPlanCreateView : planTempId is empty");
                return;
            }
            Intent intent = new Intent(context, (Class<?>) FitnessPlanJoinActivity.class);
            intent.putExtra("PLAN_TEMP_ID_KEY", str);
            intent.setFlags(268435456);
            iov.d(context, intent);
            if (context instanceof Activity) {
                if (LanguageUtil.ba(context)) {
                    ((Activity) context).overridePendingTransition(R.anim.right_enter, R.anim.right_exit);
                } else {
                    ((Activity) context).overridePendingTransition(R.anim.left_enter, R.anim.left_exit);
                }
            }
            d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i, Context context, String str) {
            Intent intent = new Intent(context, (Class<?>) FitnessPlanDetailActivity.class);
            intent.putExtra("params_plan_id_key", str);
            intent.putExtra("params_plan_TYPE_key", i);
            intent.setFlags(872415232);
            iov.d(context, intent);
            d();
        }

        private void e(final int i, final String str, final String str2, final String str3, final Context context) {
            ifi.b(new JudgeCallback() { // from class: ifh
                @Override // com.huawei.health.suggestion.callback.JudgeCallback
                public final void onJudgeCallback(Object obj) {
                    this.f37563c.d(str, context, i, str2, str3, (IntPlan) obj);
                }
            });
        }

        public /* synthetic */ void d(String str, Context context, int i, String str2, String str3, IntPlan intPlan) {
            if (intPlan != null && TextUtils.equals(intPlan.getPlanTempId(), str)) {
                a(context);
                LogUtil.a("JumpUtil", "jumpToAiFitnessPlan jumpToPlanTab.");
                g(context);
            } else {
                c(context, i, str, str2, str3);
                LogUtil.a("JumpUtil", "jumpToAiFitnessPlan jumpToCreateAiFitnessPlanH5.");
            }
            d();
        }

        private void g(Context context) {
            if ("1".equals(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "MAIN_VIP_KEY"))) {
                ddq.d().finishKakaTask(context, 20009, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            WeakReference<JumpFinishCallback> weakReference = this.f10222c;
            if (weakReference == null) {
                LogUtil.j("JumpUtil", "onJumpFinish mJumpFinishCallback is null");
                return;
            }
            JumpFinishCallback jumpFinishCallback = weakReference.get();
            if (jumpFinishCallback == null) {
                LogUtil.j("JumpUtil", "onJumpFinish jumpFinishCallback is null");
            } else {
                jumpFinishCallback.onJumpFinish();
                this.f10222c = null;
            }
        }

        private void a() {
            WeakReference<JumpViewInterface> weakReference = this.e;
            if (weakReference == null) {
                LogUtil.j("JumpUtil", "hideProgressBar: jumpViewController is null");
                return;
            }
            JumpViewInterface jumpViewInterface = weakReference.get();
            if (jumpViewInterface == null) {
                LogUtil.j("JumpUtil", "hideProgressBar: jumpViewController is null");
            } else {
                jumpViewInterface.setProgressBarVisible(false);
            }
        }

        private H5ProLaunchOption a(String str, Map<String, String> map) {
            if (map != null && !map.isEmpty()) {
                StringBuilder sb = new StringBuilder(str + "?");
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append("&");
                }
                str = sb.substring(0, sb.length() - 1);
            }
            H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).setImmerse().showStatusBar().addPath(str).setStatusBarTextBlack(true).setForceDarkMode(1).build();
            LogUtil.a("JumpUtil", "buildCommonJumpH5Option option is " + h5ProLaunchOptionBuild.getPath());
            return h5ProLaunchOptionBuild;
        }

        public void e(String str, int i) {
            LogUtil.a("JumpUtil", "gotoSeriesCourseH5 seriesCourseId ", str, " type ", Integer.valueOf(i));
            ddv.b().initH5Pro();
            H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("tradeApi", ddv.b().getCommonJsModule("tradeApi")).addCustomizeJsModule("mediaCenter", ddv.b().getCommonJsModule("mediaCenter")).addCustomizeJsModule("course", ((FitnessAdviceApi) Services.b("PluginFitnessAdvice", FitnessAdviceApi.class)).getCourseDetailH5Bridge()).enableOnPauseCallback().setImmerse().showStatusBar().setStatusBarTextBlack(true).addPath("#/seriesCourse?id=" + str + "&type=" + i).setForceDarkMode(1).build();
            SeriesCourseH5Repository.registerService();
            H5ProClient.startH5MiniProgram(BaseApplication.getContext(), "com.huawei.health.h5.sleeping-music", h5ProLaunchOptionBuild);
            btq.e().e("COLLECTION_ADD");
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        btw.d(context, str, str2, str3);
    }
}
