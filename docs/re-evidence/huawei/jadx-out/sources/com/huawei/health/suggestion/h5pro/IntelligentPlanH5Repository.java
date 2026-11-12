package com.huawei.health.suggestion.h5pro;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanInfo;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.intplan.IntPlanBean;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.health.suggestion.h5pro.h5params.CourseDayPlanDetail;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.main.stories.health.weight.callback.WeightCallback;
import defpackage.btt;
import defpackage.btw;
import defpackage.buh;
import defpackage.gho;
import defpackage.ghr;
import defpackage.gzl;
import defpackage.gzx;
import defpackage.hcu;
import defpackage.hjg;
import defpackage.hvh;
import defpackage.hvu;
import defpackage.hvv;
import defpackage.ibn;
import defpackage.ien;
import defpackage.iep;
import defpackage.ift;
import defpackage.ifu;
import defpackage.iun;
import defpackage.njy;
import defpackage.pdn;
import defpackage.pea;
import defpackage.ped;
import defpackage.peh;
import defpackage.pqg;
import defpackage.vfv;
import defpackage.vfy;
import defpackage.vgo;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = "IntelligentPlan", users = {"", "", "9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class IntelligentPlanH5Repository {
    private static final int ERROR_CODE_FAIL = -1;
    private static final String ERROR_MESSAGE = "PlanAPI not exist";
    private static final String[] H5_PKG_LIST = {"ai-weight"};
    private static final int PAGE_SIZE = 10;
    private static final String SHOW_REPORT_TIME = "showReportTime";
    private static final String TAG = "IntelligentPlanH5Repository";

    @H5ProMethod(name = "createIntelligentPlan")
    public static void createIntelligentPlan(AiFitnessCreateParam aiFitnessCreateParam, final IntelligentPlanH5Cbk<IntPlanBean> intelligentPlanH5Cbk) {
        LogUtil.d(TAG, "createIntelligentPlan for input :", aiFitnessCreateParam);
        LogUtil.a(TAG, "Begin to createIntelligentPlan");
        if (aiFitnessCreateParam == null || intelligentPlanH5Cbk == null) {
            ReleaseLogUtil.e(TAG, "createIntelligentPlan data == null || callback == null");
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(-1, IntelligentPlanH5Repository.ERROR_MESSAGE);
                }
            });
        } else {
            LogUtil.a(TAG, "AiFitnessCreateParam:", Boolean.valueOf(aiFitnessCreateParam.isModifyWeight()));
            planApi.createPlan(aiFitnessCreateParam, new AnonymousClass1(intelligentPlanH5Cbk, aiFitnessCreateParam));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$1, reason: invalid class name */
    class AnonymousClass1 extends UiCallback<IntPlan> {
        final /* synthetic */ IntelligentPlanH5Cbk val$callback;
        final /* synthetic */ AiFitnessCreateParam val$data;

        AnonymousClass1(IntelligentPlanH5Cbk intelligentPlanH5Cbk, AiFitnessCreateParam aiFitnessCreateParam) {
            this.val$callback = intelligentPlanH5Cbk;
            this.val$data = aiFitnessCreateParam;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, final String str) {
            LogUtil.e(IntelligentPlanH5Repository.TAG, "H5 createPlan fail");
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(i, str);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(final IntPlan intPlan) {
            btt bttVarD = btt.d();
            final AiFitnessCreateParam aiFitnessCreateParam = this.val$data;
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    IntelligentPlanH5Repository.AnonymousClass1.lambda$onSuccess$1(aiFitnessCreateParam, intPlan, intelligentPlanH5Cbk);
                }
            });
        }

        static /* synthetic */ void lambda$onSuccess$1(AiFitnessCreateParam aiFitnessCreateParam, IntPlan intPlan, IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
            LogUtil.a(IntelligentPlanH5Repository.TAG, "H5 createPlan success");
            WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
            if (weightApi != null) {
                if (!weightApi.isJoinDietDiary()) {
                    weightApi.joinDietDiary();
                }
            } else {
                LogUtil.j(IntelligentPlanH5Repository.TAG, "weightApi is null.");
            }
            if (aiFitnessCreateParam.getTemp() != 1 && PluginSuggestion.getInstance() != null) {
                PluginSuggestion.getInstance().startSendIntelligentPlan();
            }
            aiFitnessCreateParam.getTimeInfo().setEndDate(intPlan.getPlanTimeInfo().getEndDate());
            if (aiFitnessCreateParam.isModifyWeight()) {
                ifu.e(aiFitnessCreateParam.getPlanInput().getUserInfo().getWeight());
            }
            IntPlanBean intPlanBean = new IntPlanBean(intPlan);
            LogUtil.d(IntelligentPlanH5Repository.TAG, "newIntPlanBean :", intPlanBean);
            intelligentPlanH5Cbk.onSuccess(intPlanBean);
        }
    }

    @H5ProMethod(name = "getCurrentPlan")
    public static void getCurrentPlan(final IntelligentPlanH5Cbk<IntPlanBean> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to getCurrentPlan");
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j(TAG, "Failed to getCurrentPlan, intPlanApi is null");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(-1, IntelligentPlanH5Repository.ERROR_MESSAGE);
                }
            });
        } else {
            planApi.e(new AnonymousClass2(intelligentPlanH5Cbk));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$2, reason: invalid class name */
    class AnonymousClass2 extends UiCallback<IntPlan> {
        final /* synthetic */ IntelligentPlanH5Cbk val$callback;

        AnonymousClass2(IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
            this.val$callback = intelligentPlanH5Cbk;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, final String str) {
            LogUtil.a(IntelligentPlanH5Repository.TAG, "H5 getCurrentPlan fail");
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(i, str);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(final IntPlan intPlan) {
            if (intPlan == null) {
                LogUtil.a(IntelligentPlanH5Repository.TAG, "getCurrentPlan is null");
                btt bttVarD = btt.d();
                final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
                bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        intelligentPlanH5Cbk.onSuccess(null);
                    }
                });
                return;
            }
            btt bttVarD2 = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk2 = this.val$callback;
            bttVarD2.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    IntelligentPlanH5Repository.AnonymousClass2.lambda$onSuccess$2(intPlan, intelligentPlanH5Cbk2);
                }
            });
        }

        static /* synthetic */ void lambda$onSuccess$2(IntPlan intPlan, IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
            IntPlanBean intPlanBean = new IntPlanBean(intPlan);
            LogUtil.a(IntelligentPlanH5Repository.TAG, "getCurrentPlan success");
            intelligentPlanH5Cbk.onSuccess(intPlanBean);
        }
    }

    @H5ProMethod(name = "getCourseById")
    public static void getCourseById(String str, final IntelligentPlanH5Cbk<FitWorkout> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to getCourseById, workoutId: ", str);
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j(TAG, "requestCourseList : courseApi is null.");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(-1, IntelligentPlanH5Repository.ERROR_MESSAGE);
                }
            });
        } else {
            courseApi.getCourseById(new gzl.a(str).c(), new AnonymousClass3(intelligentPlanH5Cbk));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$3, reason: invalid class name */
    class AnonymousClass3 extends UiCallback<Workout> {
        final /* synthetic */ IntelligentPlanH5Cbk val$callback;

        AnonymousClass3(IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
            this.val$callback = intelligentPlanH5Cbk;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, final String str) {
            LogUtil.e(IntelligentPlanH5Repository.TAG, "H5 getCourseById fail,", str);
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(i, str);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(Workout workout) {
            LogUtil.a(IntelligentPlanH5Repository.TAG, "H5 getCourseById onSuccess");
            final FitWorkout fitWorkoutD = pea.d(workout);
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onSuccess(fitWorkoutD);
                }
            });
        }
    }

    @H5ProMethod(name = "getCourseByIds")
    public static void getCourseByIds(String[] strArr, final IntelligentPlanH5Cbk<List<FitWorkout>> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to getCourseByIds, workoutIds: ", Arrays.toString(strArr));
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j(TAG, "requestCourseList : courseApi is null.");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(-1, IntelligentPlanH5Repository.ERROR_MESSAGE);
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(new gzl.a(str).c());
        }
        courseApi.getCourseByIds(arrayList, false, new AnonymousClass4(intelligentPlanH5Cbk));
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$4, reason: invalid class name */
    class AnonymousClass4 extends UiCallback<List<FitWorkout>> {
        final /* synthetic */ IntelligentPlanH5Cbk val$callback;

        AnonymousClass4(IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
            this.val$callback = intelligentPlanH5Cbk;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, final String str) {
            LogUtil.e(IntelligentPlanH5Repository.TAG, "H5 getCourseById fail,", str);
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(i, str);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(final List<FitWorkout> list) {
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onSuccess(list);
                }
            });
        }
    }

    @H5ProMethod(name = "finishPlan")
    public static void finishPlan(String str, final IntelligentPlanH5Cbk<String> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to finishPlan, planId: ", str);
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j(TAG, "Failed to finishPlan, intPlanApi is null");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(-1, IntelligentPlanH5Repository.ERROR_MESSAGE);
                }
            });
        } else {
            planApi.finishPlan(1, str, new AnonymousClass5(intelligentPlanH5Cbk));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$5, reason: invalid class name */
    class AnonymousClass5 extends UiCallback<String> {
        final /* synthetic */ IntelligentPlanH5Cbk val$callback;

        AnonymousClass5(IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
            this.val$callback = intelligentPlanH5Cbk;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, final String str) {
            LogUtil.e(IntelligentPlanH5Repository.TAG, "H5 finishPlan fail ", str);
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(i, str);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(final String str) {
            LogUtil.a(IntelligentPlanH5Repository.TAG, "H5 finishPlan success");
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$5$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onSuccess(str);
                }
            });
        }
    }

    @H5ProMethod(name = "getRecommendPlans")
    public static void getRecommendPlans(final IntelligentPlanH5Cbk<List<PlanInfo>> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to getRecommendPlans");
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j(TAG, "Failed to getRecommendPlans, intPlanApi is null");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(-1, IntelligentPlanH5Repository.ERROR_MESSAGE);
                }
            });
        } else {
            planApi.setPlanType(-1);
            planApi.getRecommedPlans(-1, new AnonymousClass6(intelligentPlanH5Cbk));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$6, reason: invalid class name */
    class AnonymousClass6 extends UiCallback<List<PlanInfo>> {
        final /* synthetic */ IntelligentPlanH5Cbk val$callback;

        AnonymousClass6(IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
            this.val$callback = intelligentPlanH5Cbk;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, final String str) {
            LogUtil.e(IntelligentPlanH5Repository.TAG, "H5 getRecommendPlans fail ", str);
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$6$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(i, str);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(final List<PlanInfo> list) {
            LogUtil.a(IntelligentPlanH5Repository.TAG, "H5 getRecommendPlans success");
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$6$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onSuccess(list);
                }
            });
        }
    }

    @H5ProMethod(name = "getIntRunPlans")
    public static void getIntRunPlans(final IntelligentPlanH5Cbk<List<PlanInfo>> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to getIntRunPlans");
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j(TAG, "Failed to getIntRunPlans, intPlanApi is null");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(-1, IntelligentPlanH5Repository.ERROR_MESSAGE);
                }
            });
        } else {
            planApi.getAllPlans(0, new AnonymousClass7(intelligentPlanH5Cbk));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$7, reason: invalid class name */
    class AnonymousClass7 extends UiCallback<pdn> {
        final /* synthetic */ IntelligentPlanH5Cbk val$callback;

        AnonymousClass7(IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
            this.val$callback = intelligentPlanH5Cbk;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, final String str) {
            LogUtil.e(IntelligentPlanH5Repository.TAG, "H5 getRecommendPlans fail ", str);
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$7$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(i, str);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(pdn pdnVar) {
            if (pdnVar == null || njy.e(pdnVar.a())) {
                LogUtil.j(IntelligentPlanH5Repository.TAG, "onSuccess getRunPlanInfoList is empty");
                return;
            }
            LogUtil.a(IntelligentPlanH5Repository.TAG, "H5 getRecommendPlans success");
            final ArrayList arrayList = new ArrayList(pdnVar.a());
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$7$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onSuccess(arrayList);
                }
            });
        }
    }

    @H5ProMethod(name = "getAllPlanInfo")
    public static void getAllPlanInfo(final IntelligentPlanH5Cbk<List<FitnessPackageInfo>> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to getAllPlanInfo");
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j(TAG, "Failed to getAllPlanInfo, intPlanApi is null");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(-1, IntelligentPlanH5Repository.ERROR_MESSAGE);
                }
            });
        } else {
            planApi.getAllFitnessPackage(-1, new AnonymousClass8(intelligentPlanH5Cbk));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$8, reason: invalid class name */
    class AnonymousClass8 extends UiCallback<List<FitnessPackageInfo>> {
        final /* synthetic */ IntelligentPlanH5Cbk val$callback;

        AnonymousClass8(IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
            this.val$callback = intelligentPlanH5Cbk;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, final String str) {
            LogUtil.e(IntelligentPlanH5Repository.TAG, "H5 getAllPlanInfo fail ", str);
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$8$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(i, str);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(final List<FitnessPackageInfo> list) {
            LogUtil.a(IntelligentPlanH5Repository.TAG, "H5 getAllPlanInfo success");
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$8$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onSuccess(list);
                }
            });
        }
    }

    @H5ProMethod(name = "getBaseUrl")
    public static void getBaseUrl(IntelligentPlanH5Cbk<String> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to getBaseUrl");
        if (intelligentPlanH5Cbk == null) {
            LogUtil.e(TAG, "callback is null");
            return;
        }
        String url = GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl");
        if (TextUtils.isEmpty(url)) {
            intelligentPlanH5Cbk.onFailure(-1, "url is null");
        } else {
            LogUtil.d(TAG, "plan base url is:", url);
            intelligentPlanH5Cbk.onSuccess(url);
        }
    }

    @H5ProMethod(name = "updatePlanDate")
    public static void updatePlanDate(String str, Integer[] numArr, final IntelligentPlanH5Cbk<String> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to updatePlanDate, planId: ", str);
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j(TAG, "updatePlanDate : intPlanApi is null.");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(-1, IntelligentPlanH5Repository.ERROR_MESSAGE);
                }
            });
        } else {
            planApi.updatePlanDate(str, new ArrayList(), numArr == null ? new ArrayList<>() : Arrays.asList(numArr), new AnonymousClass9(intelligentPlanH5Cbk));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$9, reason: invalid class name */
    class AnonymousClass9 extends UiCallback<String> {
        final /* synthetic */ IntelligentPlanH5Cbk val$callback;

        AnonymousClass9(IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
            this.val$callback = intelligentPlanH5Cbk;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, final String str) {
            LogUtil.e(IntelligentPlanH5Repository.TAG, "H5 updatePlanDate fail ", str);
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$9$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(i, str);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(final String str) {
            LogUtil.a(IntelligentPlanH5Repository.TAG, "H5 updatePlanDate success");
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$9$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onSuccess(str);
                }
            });
        }
    }

    @H5ProMethod(name = "downloadPlanRecord")
    public static void downloadPlanRecord(int i, String str, final IntelligentPlanH5Cbk<Boolean> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to downloadPlanRecord, planType: ", Integer.valueOf(i), ", planId: ", str);
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j(TAG, "updatePlanDate : intPlanApi is null.");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onSuccess(false);
                }
            });
            return;
        }
        if (i == IntPlan.PlanType.RUN_PLAN.getType()) {
            planApi.setPlanType(0);
            if (planApi.getjoinedPlanById(str) != null) {
                LogUtil.a(TAG, "downloadPlanRecord run planId=", str, " success");
                btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        intelligentPlanH5Cbk.onSuccess(true);
                    }
                });
                return;
            } else {
                LogUtil.a(TAG, "downloadPlanRecord run planId=", str, " begin");
                findRunPlanRecord(planApi, 0, str, intelligentPlanH5Cbk);
                return;
            }
        }
        if (i == IntPlan.PlanType.FIT_PLAN.getType()) {
            planApi.setPlanType(3);
            if (planApi.getjoinedPlanById(str) != null) {
                LogUtil.a(TAG, "downloadPlanRecord fit planId=", str, " success");
                btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        intelligentPlanH5Cbk.onSuccess(true);
                    }
                });
                return;
            } else {
                LogUtil.a(TAG, "downloadPlanRecord fit planId=", str, " begin");
                findFitPlanRecord(planApi, str, intelligentPlanH5Cbk);
                return;
            }
        }
        LogUtil.e(TAG, "downloadPlanRecord wrong plan type");
        btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                intelligentPlanH5Cbk.onSuccess(false);
            }
        });
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$10, reason: invalid class name */
    class AnonymousClass10 extends UiCallback<List<PlanRecord>> {
        final /* synthetic */ IntelligentPlanH5Cbk val$callback;
        final /* synthetic */ PlanApi val$intPlanApi;
        final /* synthetic */ String val$planId;
        final /* synthetic */ int val$startIdx;

        AnonymousClass10(int i, IntelligentPlanH5Cbk intelligentPlanH5Cbk, String str, PlanApi planApi) {
            this.val$startIdx = i;
            this.val$callback = intelligentPlanH5Cbk;
            this.val$planId = str;
            this.val$intPlanApi = planApi;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e(IntelligentPlanH5Repository.TAG, "findRunPlanRecord from ", Integer.valueOf(this.val$startIdx), " error=", Integer.valueOf(i));
            this.val$callback.onSuccess(false);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(List<PlanRecord> list) {
            if (!njy.e(list)) {
                for (PlanRecord planRecord : list) {
                    if (planRecord.acquirePlanId() != null && planRecord.acquirePlanId().equals(this.val$planId)) {
                        LogUtil.a(IntelligentPlanH5Repository.TAG, "findRunPlanRecord from ", Integer.valueOf(this.val$startIdx), " success");
                        btt bttVarD = btt.d();
                        final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
                        bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$10$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                intelligentPlanH5Cbk.onSuccess(true);
                            }
                        });
                        return;
                    }
                }
                if (list.size() >= 10) {
                    IntelligentPlanH5Repository.findRunPlanRecord(this.val$intPlanApi, this.val$startIdx + 10, this.val$planId, this.val$callback);
                    return;
                }
                LogUtil.e(IntelligentPlanH5Repository.TAG, "findRunPlanRecord from ", Integer.valueOf(this.val$startIdx), " not found");
                btt bttVarD2 = btt.d();
                final IntelligentPlanH5Cbk intelligentPlanH5Cbk2 = this.val$callback;
                bttVarD2.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$10$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        intelligentPlanH5Cbk2.onSuccess(false);
                    }
                });
                return;
            }
            LogUtil.e(IntelligentPlanH5Repository.TAG, "findRunPlanRecord from ", Integer.valueOf(this.val$startIdx), " null data");
            btt bttVarD3 = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk3 = this.val$callback;
            bttVarD3.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$10$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk3.onSuccess(false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void findRunPlanRecord(PlanApi planApi, int i, String str, IntelligentPlanH5Cbk<Boolean> intelligentPlanH5Cbk) {
        planApi.getPlanRecords(i, 10, new AnonymousClass10(i, intelligentPlanH5Cbk, str, planApi));
    }

    private static void findFitPlanRecord(final PlanApi planApi, final String str, final IntelligentPlanH5Cbk<Boolean> intelligentPlanH5Cbk) {
        planApi.queryAllCompletedFitnessPlanFromCloud(new ResultCallback() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda16
            @Override // com.huawei.health.suggestion.ResultCallback
            public final void onResult(int i, Object obj) {
                IntelligentPlanH5Repository.lambda$findFitPlanRecord$14(planApi, str, intelligentPlanH5Cbk, i, obj);
            }
        });
    }

    static /* synthetic */ void lambda$findFitPlanRecord$14(PlanApi planApi, String str, final IntelligentPlanH5Cbk intelligentPlanH5Cbk, int i, Object obj) {
        planApi.setPlanType(3);
        final Plan plan = planApi.getjoinedPlanById(str);
        LogUtil.a(TAG, "findFitPlanRecord  result=", Boolean.valueOf(plan != null), " resultCode =", Integer.valueOf(i));
        btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                intelligentPlanH5Cbk.onSuccess(Boolean.valueOf(plan != null));
            }
        });
    }

    public static void registerService() {
        H5ProClient.getServiceManager();
        H5ProServiceManager.getInstance().registerService(IntelligentPlanH5Repository.class);
    }

    @H5ProMethod(name = "getWeeklyReport")
    public static void getWeeklyReport(final IntelligentPlanH5Cbk<JSONObject> intelligentPlanH5Cbk) {
        ReleaseLogUtil.d(TAG, "Begin to getWeeklyReport");
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            ReleaseLogUtil.e(TAG, "Failed to getWeeklyReport, intPlanApi is null");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(-1, IntelligentPlanH5Repository.ERROR_MESSAGE);
                }
            });
        } else {
            planApi.e(new AnonymousClass11(intelligentPlanH5Cbk, planApi));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$11, reason: invalid class name */
    class AnonymousClass11 extends UiCallback<IntPlan> {
        final /* synthetic */ IntelligentPlanH5Cbk val$callback;
        final /* synthetic */ PlanApi val$intPlanApi;

        AnonymousClass11(IntelligentPlanH5Cbk intelligentPlanH5Cbk, PlanApi planApi) {
            this.val$callback = intelligentPlanH5Cbk;
            this.val$intPlanApi = planApi;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, final String str) {
            ReleaseLogUtil.d(IntelligentPlanH5Repository.TAG, "H5 getWeeklyReport get plan fail");
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$11$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(i, str);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(IntPlan intPlan) {
            if (intPlan == null) {
                ReleaseLogUtil.d(IntelligentPlanH5Repository.TAG, "getWeeklyReport plan is null");
                btt bttVarD = btt.d();
                final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
                bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$11$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        intelligentPlanH5Cbk.onSuccess(null);
                    }
                });
                return;
            }
            IntelligentPlanH5Repository.setReport(intPlan, this.val$callback, this.val$intPlanApi);
        }
    }

    @H5ProMethod(name = "getFinalReport")
    public static void getFinalReport(String str, int i, final IntelligentPlanH5Cbk<JSONObject> intelligentPlanH5Cbk) {
        ReleaseLogUtil.d(TAG, "Begin to getFinalReport, planId: ", str, ", planType: ", Integer.valueOf(i));
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            ReleaseLogUtil.e(TAG, "Failed to getFinalReport, intPlanApi is null");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(-1, IntelligentPlanH5Repository.ERROR_MESSAGE);
                }
            });
        } else {
            planApi.getIntPlanReport(str, i, 2, new UiCallback<String>() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository.12
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str2) {
                    intelligentPlanH5Cbk.onFailure(i2, str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onSuccess(String str2) {
                    if (str2 == null) {
                        intelligentPlanH5Cbk.onSuccess(null);
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        LogUtil.a(IntelligentPlanH5Repository.TAG, "getReport success ", jSONObject);
                        intelligentPlanH5Cbk.onSuccess(new JSONObject(jSONObject.optString("report")));
                    } catch (JSONException unused) {
                        intelligentPlanH5Cbk.onSuccess(null);
                    }
                }
            });
        }
    }

    @H5ProMethod(name = "toTrainDetail")
    public static void toTrainDetail(FitWorkout fitWorkout, String str, long j, int i, int i2) {
        LogUtil.a(TAG, "Begin to toTrainDetail, planId: ", str);
        if (fitWorkout == null) {
            ReleaseLogUtil.a(TAG, "toTrainDetail fitWorkout == null");
            return;
        }
        ReleaseLogUtil.d(TAG, "toTrainDetail time", Long.valueOf(j), "weekOrder:", Integer.valueOf(i), "dayCourseOrder:", Integer.valueOf(i2));
        if (fitWorkout.isRunModelCourse()) {
            ibn.b(BaseApplication.b(), fitWorkout, ibn.c(str, j, i2, i));
        } else {
            ien.b(BaseApplication.b(), fitWorkout, str, i, i2, j);
        }
    }

    public static void setReport(final IntPlan intPlan, final IntelligentPlanH5Cbk<JSONObject> intelligentPlanH5Cbk, final PlanApi planApi) {
        btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                IntelligentPlanH5Repository.lambda$setReport$17(intPlan, intelligentPlanH5Cbk, planApi);
            }
        });
    }

    static /* synthetic */ void lambda$setReport$17(IntPlan intPlan, final IntelligentPlanH5Cbk intelligentPlanH5Cbk, PlanApi planApi) {
        hvh hvhVar = new hvh();
        hvhVar.a(intPlan);
        if (hvhVar.b()) {
            buh.d(SHOW_REPORT_TIME, String.valueOf(ift.a(System.currentTimeMillis(), 0)));
            JSONObject jSONObjectB = hvhVar.b(1, false);
            hvhVar.d(jSONObjectB, 1, ift.a(System.currentTimeMillis(), 0));
            intelligentPlanH5Cbk.onSuccess(jSONObjectB);
            return;
        }
        if (hvhVar.c()) {
            buh.d(SHOW_REPORT_TIME, String.valueOf(ift.c(System.currentTimeMillis(), 0)));
            JSONObject jSONObjectB2 = hvhVar.b(1, true);
            hvhVar.d(jSONObjectB2, 1, ift.c(System.currentTimeMillis(), 0));
            intelligentPlanH5Cbk.onSuccess(jSONObjectB2);
            return;
        }
        setShowReportTime(intPlan);
        planApi.getIntPlanReport(intPlan.getPlanId(), intPlan.getPlanType().getType(), 1, new UiCallback<String>() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository.13
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                intelligentPlanH5Cbk.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onSuccess(String str) {
                if (str == null) {
                    intelligentPlanH5Cbk.onSuccess(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    LogUtil.a(IntelligentPlanH5Repository.TAG, "getReport success ", jSONObject);
                    intelligentPlanH5Cbk.onSuccess(new JSONObject(jSONObject.optString("report")));
                } catch (JSONException unused) {
                    intelligentPlanH5Cbk.onSuccess(null);
                }
            }
        });
    }

    private static void setShowReportTime(IntPlan intPlan) {
        if (hvu.v(intPlan) && hvu.a(intPlan)) {
            buh.d(SHOW_REPORT_TIME, String.valueOf(ift.a(System.currentTimeMillis(), 0)));
        } else {
            buh.d(SHOW_REPORT_TIME, String.valueOf(ift.c(System.currentTimeMillis(), 0)));
        }
    }

    @H5ProMethod(name = "isShowImperialUnit")
    public static boolean isShowImperialUnit() {
        return UnitUtil.f();
    }

    @H5ProMethod(name = "getRecentlyWeightRecord")
    public static void getRecentlyWeightRecord(final IntelligentPlanH5Cbk<JSONObject> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "getRecentlyWeightRecord");
        if (intelligentPlanH5Cbk == null) {
            LogUtil.e(TAG, "getRecentlyWeightRecord callback is null");
            return;
        }
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            hiAggregateOption.setTimeRange(0L, System.currentTimeMillis());
            hiAggregateOption.setAggregateType(4);
            hiAggregateOption.setGroupUnitType(0);
            hiAggregateOption.setCount(1);
            weightApi.getWeightData(hiAggregateOption, new WeightCallback() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository.14
                @Override // com.huawei.ui.main.stories.health.weight.callback.WeightCallback
                public void getWeight(ArrayList<vfv> arrayList) {
                    LogUtil.a(IntelligentPlanH5Repository.TAG, "getRecentlyWeightRecord weightBeanList = ", arrayList);
                    if (arrayList != null && !arrayList.isEmpty()) {
                        vfv vfvVar = arrayList.get(0);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("weight", vfvVar.d());
                            jSONObject.put("fateRate", vfvVar.c());
                            jSONObject.put("weightTime", vfvVar.b());
                            intelligentPlanH5Cbk.onSuccess(jSONObject);
                            return;
                        } catch (JSONException unused) {
                            intelligentPlanH5Cbk.onSuccess(jSONObject);
                            return;
                        }
                    }
                    intelligentPlanH5Cbk.onFailure(0, "getRecentlyWeightRecord There's no record of any");
                }
            });
            return;
        }
        LogUtil.e(TAG, "weightApi is null.");
        intelligentPlanH5Cbk.onFailure(0, "weight Api is null");
    }

    @H5ProMethod(name = "recordWeight")
    public static void recordWeight(double d, double d2) {
        LogUtil.a(TAG, "Begin to recordWeight");
        iep.a(BaseApplication.j(), d, d2);
    }

    @H5ProMethod(name = "getAiModelType")
    public static void getAiModelType(IntelligentPlanH5Cbk<Integer> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to getAiModelType");
        intelligentPlanH5Cbk.onSuccess(Integer.valueOf(pqg.d().getModelType()));
    }

    @H5ProMethod(name = "getLocalRunPlanRecord")
    public static void getLocalRunPlanRecord(int i, final IntelligentPlanH5Cbk<List<PlanRecord>> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to getLocalRunPlanRecord, startPage: ", Integer.valueOf(i));
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j(TAG, "getLocalRunPlanRecord : intPlanApi is null.");
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(-1, "getLocalRunPlanRecord : intPlanApi is null.");
                }
            });
        } else {
            planApi.setPlanType(6);
            planApi.getPlanRecords(i, 10, new AnonymousClass15(i, intelligentPlanH5Cbk));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$15, reason: invalid class name */
    class AnonymousClass15 extends UiCallback<List<PlanRecord>> {
        final /* synthetic */ IntelligentPlanH5Cbk val$callback;
        final /* synthetic */ int val$startPage;

        AnonymousClass15(int i, IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
            this.val$startPage = i;
            this.val$callback = intelligentPlanH5Cbk;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, final String str) {
            LogUtil.e(IntelligentPlanH5Repository.TAG, "getLocalRunPlanRecord of page ", Integer.valueOf(this.val$startPage), ", error=", Integer.valueOf(i));
            btt bttVarD = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
            bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$15$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk.onFailure(i, str);
                }
            });
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(final List<PlanRecord> list) {
            if (!njy.e(list)) {
                LogUtil.a(IntelligentPlanH5Repository.TAG, "getLocalRunPlanRecord of page ", Integer.valueOf(this.val$startPage));
                btt bttVarD = btt.d();
                final IntelligentPlanH5Cbk intelligentPlanH5Cbk = this.val$callback;
                bttVarD.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$15$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        intelligentPlanH5Cbk.onSuccess(list);
                    }
                });
                return;
            }
            LogUtil.a(IntelligentPlanH5Repository.TAG, "getLocalRunPlanRecord of page ", Integer.valueOf(this.val$startPage), ", null data");
            btt bttVarD2 = btt.d();
            final IntelligentPlanH5Cbk intelligentPlanH5Cbk2 = this.val$callback;
            bttVarD2.c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$15$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    intelligentPlanH5Cbk2.onSuccess(null);
                }
            });
        }
    }

    @H5ProMethod(name = "createGeneralPlan")
    public static void createGeneralPlan(gho ghoVar, final IntelligentPlanH5Cbk<Plan> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "Begin to createGeneralPlan");
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    IntelligentPlanH5Repository.lambda$createGeneralPlan$19(intelligentPlanH5Cbk);
                }
            });
            return;
        }
        if (ghoVar == null) {
            btt.d().c(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    IntelligentPlanH5Repository.lambda$createGeneralPlan$20(intelligentPlanH5Cbk);
                }
            });
            return;
        }
        planApi.setPlanType(3);
        LogUtil.a(TAG, "H5 createGeneralPlan planTempId = ", ghoVar.d(), " startTime = ", Long.valueOf(ghoVar.e()), " remindTime = ", Integer.valueOf(ghoVar.c()));
        planApi.createPlan(new ghr(ghoVar), new UiCallback<Plan>() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository.16
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e(IntelligentPlanH5Repository.TAG, "H5 createGeneralPlan fail");
                intelligentPlanH5Cbk.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onSuccess(Plan plan) {
                LogUtil.a(IntelligentPlanH5Repository.TAG, "H5 createGeneralPlan success");
                intelligentPlanH5Cbk.onSuccess(plan);
            }
        });
    }

    static /* synthetic */ void lambda$createGeneralPlan$19(IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "H5 createGeneralPlan fail ", ERROR_MESSAGE);
        intelligentPlanH5Cbk.onFailure(-1, ERROR_MESSAGE);
    }

    static /* synthetic */ void lambda$createGeneralPlan$20(IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "H5 createGeneralPlan fail params == null");
        intelligentPlanH5Cbk.onFailure(-1, "params == null");
    }

    @H5ProMethod(name = "recordCreateTempPlan")
    public static void recordCreateTempPlan(boolean z, double d, IntelligentPlanH5Cbk<Plan> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "recordCreateTempPlan");
        if (intelligentPlanH5Cbk != null) {
            intelligentPlanH5Cbk.onSuccess(null);
        }
        iep.a(BaseApplication.j(), z, (int) d);
    }

    @H5ProMethod(name = "getAiFitnessPlanSummary")
    public static void getAiFitnessPlanSummary(final IntelligentPlanH5Cbk<Map<String, Object>> intelligentPlanH5Cbk) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                IntelligentPlanH5Repository.lambda$getAiFitnessPlanSummary$21(intelligentPlanH5Cbk);
            }
        });
    }

    static /* synthetic */ void lambda$getAiFitnessPlanSummary$21(final IntelligentPlanH5Cbk intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "getAiFitnessPlanSummary start");
        final HashMap map = new HashMap(10);
        ((PlanApi) Services.b("CoursePlanService", PlanApi.class)).e(new UiCallback<IntPlan>() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository.17
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j(IntelligentPlanH5Repository.TAG, "getCurrentIntPlan onFailure errorCode", Integer.valueOf(i));
                intelligentPlanH5Cbk.onFailure(i, str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onSuccess(IntPlan intPlan) {
                LogUtil.a(IntelligentPlanH5Repository.TAG, "getCurrentIntPlan onSuccess");
                if (intPlan == null || !IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType())) {
                    intelligentPlanH5Cbk.onSuccess(map);
                    return;
                }
                map.put("trainDay", iep.a(System.currentTimeMillis(), intPlan));
                map.put("finishRate", intPlan.getStat("progress") == null ? 0 : intPlan.getStat("progress").getValue());
                final float fA = hjg.a();
                IntelligentPlanH5Repository.putGoalWeightContent(map, intPlan, fA);
                IntelligentPlanH5Repository.putReportContent(map, intPlan);
                int iH = btw.h(intPlan);
                int iB = ift.b(Calendar.getInstance().get(7));
                IntelligentPlanH5Repository.setDayStatus(intPlan, iH, iB, map);
                map.put("consumption", Integer.valueOf(Math.round(btw.e(intPlan, iH, iB, System.currentTimeMillis()))));
                final List<IntAction> listA = hvv.a(intPlan, iH, iB);
                if (njy.e(listA)) {
                    map.put("heatGoal", 0);
                    IntelligentPlanH5Repository.getDietRecord(map, intelligentPlanH5Cbk);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (IntAction intAction : listA) {
                    if (intAction != null) {
                        arrayList.add(new gzl.a(intAction.getActionId()).b(intPlan.getPlanId()).c());
                    }
                }
                ((CourseApi) Services.b("CoursePlanService", CourseApi.class)).getCourseByIds(arrayList, false, new UiCallback<List<FitWorkout>>() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository.17.1
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        LogUtil.j(IntelligentPlanH5Repository.TAG, "getCurrentIntPlan getCourseByIds onFailure");
                        IntelligentPlanH5Repository.getDietRecord(map, intelligentPlanH5Cbk);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onSuccess(List<FitWorkout> list) {
                        LogUtil.a(IntelligentPlanH5Repository.TAG, "getCurrentIntPlan getCourseByIds onSuccess");
                        if (njy.e(list)) {
                            IntelligentPlanH5Repository.getDietRecord(map, intelligentPlanH5Cbk);
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList(list.size());
                        float fB = 0.0f;
                        for (FitWorkout fitWorkout : list) {
                            LogUtil.a(IntelligentPlanH5Repository.TAG, "get today fitWorkout : ", fitWorkout.acquireId());
                            fB += ped.b(fitWorkout.acquireCalorie() * fA);
                            IntelligentPlanH5Repository.buildCourseDetail(arrayList2, fitWorkout, listA);
                        }
                        ReleaseLogUtil.d(IntelligentPlanH5Repository.TAG, "courseList:", Integer.valueOf(arrayList2.size()));
                        map.put("dayActionList", peh.c(arrayList2));
                        map.put("heatGoal", Integer.valueOf(Math.round(fB)));
                        IntelligentPlanH5Repository.getDietRecord(map, intelligentPlanH5Cbk);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDayStatus(IntPlan intPlan, int i, int i2, Map<String, Object> map) {
        int dayStatus;
        IntDayPlan dayByOrder;
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(i);
        if (weekInfoByOrder == null || (dayByOrder = weekInfoByOrder.getDayByOrder(i2)) == null) {
            dayStatus = 1;
        } else {
            dayStatus = dayByOrder.getDayStatus();
            map.put("dayStatus", Integer.valueOf(dayStatus));
        }
        ReleaseLogUtil.d(TAG, "setDayStatus:", Integer.valueOf(dayStatus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void buildCourseDetail(List<CourseDayPlanDetail> list, FitWorkout fitWorkout, List<IntAction> list2) {
        CourseDayPlanDetail courseDayPlanDetail = new CourseDayPlanDetail();
        courseDayPlanDetail.setCourseName(fitWorkout.acquireName());
        courseDayPlanDetail.setCalorie((int) ped.b(fitWorkout.acquireCalorie() * hjg.a()));
        String strAcquireMidPicture = fitWorkout.acquireMidPicture();
        if (TextUtils.isEmpty(strAcquireMidPicture)) {
            strAcquireMidPicture = StringUtils.c((Object) fitWorkout.acquirePicture());
        }
        courseDayPlanDetail.setPicture(strAcquireMidPicture);
        courseDayPlanDetail.setDuration(fitWorkout.acquireDuration());
        for (IntAction intAction : list2) {
            if (intAction != null && fitWorkout.acquireId().equals(intAction.getActionId())) {
                courseDayPlanDetail.setPunchFlag(intAction.getPunchFlag());
                break;
            }
        }
        list.add(courseDayPlanDetail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getDietRecord(final Map<String, Object> map, final IntelligentPlanH5Cbk<Map<String, Object>> intelligentPlanH5Cbk) {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        ReleaseLogUtil.d(TAG, "getDietRecord dayFormat ", Integer.valueOf(iA));
        iun.c(iA, iA, new ResponseCallback() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda19
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                IntelligentPlanH5Repository.lambda$getDietRecord$22(map, intelligentPlanH5Cbk, i, (List) obj);
            }
        });
    }

    static /* synthetic */ void lambda$getDietRecord$22(Map map, IntelligentPlanH5Cbk intelligentPlanH5Cbk, int i, List list) {
        vgo vgoVar;
        vfy vfyVarD;
        LogUtil.a(TAG, "getDietRecord errorCode ", Integer.valueOf(i), " list ", list);
        if (njy.b(list) && (vgoVar = (vgo) list.get(0)) != null && (vfyVarD = vgoVar.d()) != null) {
            map.put("inTake", Integer.valueOf(Math.round(vfyVarD.h())));
            map.put("recommendTake", Integer.valueOf(Math.round(vfyVarD.e())));
        }
        intelligentPlanH5Cbk.onSuccess(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float putGoalWeightContent(Map<String, Object> map, IntPlan intPlan, float f) {
        String strC;
        float fFloatValue = intPlan.getGoal("weight") == null ? 0.0f : ((Float) intPlan.getGoal("weight").getGoalDst()).floatValue();
        if (f > fFloatValue) {
            strC = BaseApplication.b().getResources().getString(R.string.IDS_goal_not_reach, iep.b(f, fFloatValue));
        } else {
            strC = gzx.c(BaseApplication.b(), R.string.IDS_goal_reached, new Object[0]);
        }
        map.put("goalContent", strC);
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putReportContent(Map<String, Object> map, IntPlan intPlan) {
        if (hvu.u(intPlan) || hvu.r(intPlan)) {
            return;
        }
        if (hvu.w(intPlan)) {
            map.put("reportButtonText", gzx.c(BaseApplication.b(), R.string.IDS_plan_this_week_report, new Object[0]));
        } else if (hvu.x(intPlan)) {
            map.put("reportButtonText", gzx.c(BaseApplication.b(), R.string.IDS_plan_last_week_report, new Object[0]));
        }
    }

    @H5ProMethod(name = "hasSportExperience")
    public static void hasSportExperience(long j, long j2, final IntelligentPlanH5Cbk<Boolean> intelligentPlanH5Cbk) {
        LogUtil.a(TAG, "hasSportExperience");
        btw.a(j, j2, new IBaseResponseCallback() { // from class: com.huawei.health.suggestion.h5pro.IntelligentPlanH5Repository$$ExternalSyntheticLambda23
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                IntelligentPlanH5Repository.lambda$hasSportExperience$23(intelligentPlanH5Cbk, i, obj);
            }
        });
    }

    static /* synthetic */ void lambda$hasSportExperience$23(IntelligentPlanH5Cbk intelligentPlanH5Cbk, int i, Object obj) {
        if (!njy.b(obj, RecordData.class)) {
            LogUtil.j(TAG, "hasSportExperience onResult obj not instanceof List");
            intelligentPlanH5Cbk.onSuccess(false);
        } else if (!njy.e((List) obj)) {
            LogUtil.a(TAG, "hasSportExperience true");
            intelligentPlanH5Cbk.onSuccess(true);
        } else {
            intelligentPlanH5Cbk.onSuccess(false);
        }
    }

    @H5ProMethod(name = "startSendIntelligentPlan")
    public static void startSendIntelligentPlan() {
        ReleaseLogUtil.d(TAG, "startSendIntelligentPlan");
        if (PluginSuggestion.getInstance() == null) {
            ReleaseLogUtil.d(TAG, "startSendIntelligentPlan pluginSuggestion == null");
        } else {
            PluginSuggestion.getInstance().startSendIntelligentPlan();
        }
    }

    @H5ProMethod(name = "courseOutPlanRecordClick")
    public static void courseOutPlanRecordClick(int i, String str, String str2, long j) {
        LogUtil.a(TAG, "courseOutPlanRecordClick sportType:", Integer.valueOf(i), " recordId:", str, " workoutId:", str2, " endTime:", Long.valueOf(j));
        if (i == 10001) {
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi == null) {
                ReleaseLogUtil.e(TAG, "courseOutPlanRecordClick api is null");
                AppRouter.c("/PluginFitnessAdvice/FitnessResultActivity").d(new Bundle()).b(getContext());
                return;
            }
            WorkoutRecord workoutRecordAcquireWorkoutRecordByExerciseTime = TextUtils.isEmpty(str2) ? null : courseApi.acquireWorkoutRecordByExerciseTime(LoginInit.getInstance(getContext()).getAccountInfo(1011), j, str2);
            Bundle bundle = new Bundle();
            if (workoutRecordAcquireWorkoutRecordByExerciseTime != null) {
                bundle.putParcelable("workout_record", workoutRecordAcquireWorkoutRecordByExerciseTime);
            }
            ReleaseLogUtil.d(TAG, "courseOutPlanRecordClick workoutRecord ", workoutRecordAcquireWorkoutRecordByExerciseTime);
            AppRouter.c("/PluginFitnessAdvice/FitnessResultActivity").d(bundle).b(getContext());
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a(TAG, "courseOutPlanRecordClick recordId empty");
        } else {
            hcu.b().c(str);
        }
    }

    private static Context getContext() {
        Activity activityJ = BaseApplication.j();
        if (activityJ != null) {
            return activityJ;
        }
        LogUtil.j(TAG, "getContext activity is null");
        return BaseApplication.b();
    }
}
