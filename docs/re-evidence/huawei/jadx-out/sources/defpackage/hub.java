package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment;
import com.huawei.health.suggestion.ui.plan.viewholder.IntAiDialogViewHolder;
import com.huawei.health.suggestion.ui.plan.viewmodel.IntPlanDetailDataViewModel;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.plandata.UserInfoBean;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class hub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IntelligencePlanFragment f37149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IntPlan f37150b;
    private IntPlanDetailDataViewModel d;

    static /* synthetic */ void a(View view) {
    }

    static /* synthetic */ void c(View view) {
    }

    public hub(IntPlanDetailDataViewModel intPlanDetailDataViewModel, IntelligencePlanFragment intelligencePlanFragment) {
        this.d = intPlanDetailDataViewModel;
        this.f37149a = intelligencePlanFragment;
    }

    public void a(IntPlan intPlan) {
        this.f37150b = intPlan;
    }

    public void e(Context context, IntPlan intPlan) {
        if (context == null) {
            return;
        }
        a(intPlan);
        a();
        if (!d()) {
            n(context);
            return;
        }
        if (hvu.u(this.f37150b)) {
            LogUtil.a("Suggestion_IntPlanInteract", "showPlanOverdueDialog expired dialog show");
            m(context);
        } else {
            if (hvu.r(this.f37150b)) {
                return;
            }
            j(context);
            if (btw.l(this.f37150b)) {
                LogUtil.a("Suggestion_IntPlanInteract", "init is h5 plan");
            } else {
                if (a(context)) {
                    return;
                }
                b(context);
            }
        }
    }

    public void c(Context context, IntPlan intPlan) {
        if (context == null || intPlan == null || hvu.u(intPlan) || hvu.r(intPlan) || hvu.c()) {
            return;
        }
        int iH = btw.h(this.f37150b);
        if (hvu.e(intPlan) && a(intPlan.getPlanId(), true, iH)) {
            SharedPreferenceManager.c("MMKV_SUGGEST_MODULE_TAG", "weekReportDialogIndex", intPlan.getPlanId() + " " + iH);
            o(context);
            return;
        }
        if (hvu.b(intPlan) && a(intPlan.getPlanId(), false, iH)) {
            SharedPreferenceManager.c("MMKV_SUGGEST_MODULE_TAG", "weekReportDialogIndex", intPlan.getPlanId() + " " + (iH - 1));
            l(context);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004a  */
    private boolean a(String str, boolean z, int i) {
        int iJ;
        String strB = SharedPreferenceManager.b("MMKV_SUGGEST_MODULE_TAG", "weekReportDialogIndex", "");
        LogUtil.a("Suggestion_IntPlanInteract", "isNeedShowWeekReportDialog:", str, " isThisWeek:", Boolean.valueOf(z), " currentWeek:", Integer.valueOf(i), " cache:", strB);
        if (TextUtils.isEmpty(strB) || strB.split(" ").length != 2) {
            iJ = 0;
        } else {
            String[] strArrSplit = strB.split(" ");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[1];
            if (str.equals(str2)) {
                iJ = CommonUtil.j(str3);
            } else {
                iJ = 0;
            }
        }
        if (z) {
            return i > iJ;
        }
        return i - 1 > iJ;
    }

    private void j(Context context) {
        IntPlan intPlan = this.f37150b;
        if (intPlan != null) {
            if (intPlan.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN || this.f37150b.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
                int iH = btw.h(this.f37150b);
                if (iH <= 1) {
                    buh.a("plan_update_week", Integer.toString(1), this.f37150b.getPlanId());
                    return;
                }
                int iC = c();
                ReleaseLogUtil.d("Suggestion_IntPlanInteract", "currentWeek:", Integer.valueOf(iH), " savedWeek:", Integer.valueOf(iC));
                if (iH > iC) {
                    e(new AnonymousClass1(iH, context));
                }
            }
        }
    }

    /* JADX INFO: renamed from: hub$1, reason: invalid class name */
    class AnonymousClass1 extends UiCallback<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f37152c;

        AnonymousClass1(int i, Context context) {
            this.f37151b = i;
            this.f37152c = context;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_IntPlanInteract", "handlePlanUpdate fail err:", Integer.valueOf(i), " errInfo:", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            if (hub.this.f37150b != null) {
                buh.a("plan_update_week", Integer.toString(this.f37151b), hub.this.f37150b.getPlanId());
                String string = this.f37152c.getString(R.string.IDS_fitnesst_plan_adjust);
                hub.this.e(this.f37152c, string, new View.OnClickListener() { // from class: huu
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f37178c.b(view);
                    }
                });
                hwb.d(string, hub.this.f37150b);
                if (hvl.d(this.f37152c)) {
                    ReleaseLogUtil.d("Suggestion_IntPlanInteract", "IntelligencePlanFragment has CalendarPermission");
                    hub.this.e(this.f37152c);
                    hub.this.c(this.f37152c);
                }
                ReleaseLogUtil.d("Suggestion_IntPlanInteract", "save update plan week:", Integer.valueOf(this.f37151b));
            } else {
                ReleaseLogUtil.e("Suggestion_IntPlanInteract", "mCurrentPlan is null");
            }
            qpx.e(this.f37152c, R.string.IDS_fitness_update_plan_success);
            hub.this.b();
        }

        /* synthetic */ void b(View view) {
            hub.this.d.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        IntPlan intPlan = this.f37150b;
        if (intPlan != null) {
            if (intPlan.getPlanType() != null && igc.e(this.f37150b.getPlanType().getType()) && hve.d()) {
                LogUtil.a("Suggestion_IntPlanInteract", "send plan to Device :", ies.c(this.f37150b));
                hve.e(this.f37150b, BaseApplication.getContext());
            } else {
                PluginSuggestion.getInstance().startSendIntelligentPlan();
            }
        }
    }

    private int c() {
        try {
            return Integer.parseInt(buh.b("plan_update_week", this.f37150b.getPlanId()));
        } catch (NumberFormatException e2) {
            LogUtil.j("Suggestion_IntPlanInteract", "update:", LogAnonymous.b(e2));
            return 1;
        }
    }

    private void e(final UiCallback<String> uiCallback) {
        btt.d().c(new Runnable() { // from class: hus
            @Override // java.lang.Runnable
            public final void run() {
                this.f37176a.a(uiCallback);
            }
        });
    }

    /* synthetic */ void a(final UiCallback uiCallback) {
        HiHealthManager.d(BaseApplication.getContext()).fetchUserData(new HiCommonListener() { // from class: hub.3
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (!gzx.e(obj)) {
                    ReleaseLogUtil.a("Suggestion_IntPlanInteract", "FetchUserDataListener data is null.");
                    uiCallback.onFailure(0, "user info data is null");
                    return;
                }
                if (!njy.b(obj, HiUserInfo.class)) {
                    ReleaseLogUtil.e("Suggestion_IntPlanInteract", "FetchUserDataListener onSuccess data is not List<HiUserInfo>.");
                    uiCallback.onFailure(0, "user info data is not match");
                    return;
                }
                HiUserInfo hiUserInfo = (HiUserInfo) ((List) obj).get(0);
                if (hiUserInfo != null) {
                    hub.this.c((UiCallback<String>) uiCallback, hub.d(hiUserInfo));
                } else {
                    ReleaseLogUtil.e("Suggestion_IntPlanInteract", "FetchUserDataListener onSuccess userInfo is null.");
                    uiCallback.onFailure(0, "userInfo is null");
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j("Suggestion_IntPlanInteract", "fetchUserData fail:", Integer.valueOf(i), " ", obj);
                uiCallback.onFailure(i, obj.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static UserInfoBean d(HiUserInfo hiUserInfo) {
        UserInfoBean userInfoBean = new UserInfoBean();
        userInfoBean.setSex(hiUserInfo.getGenderOrDefaultValue());
        userInfoBean.setAge(hiUserInfo.getAgeOrDefaultValue());
        userInfoBean.setHeight(hiUserInfo.getHeightOrDefaultValue());
        userInfoBean.setWeight((int) hiUserInfo.getWeightOrDefaultValue());
        return userInfoBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final UiCallback<String> uiCallback, UserInfoBean userInfoBean) {
        if (this.f37150b == null) {
            LogUtil.e("Suggestion_IntPlanInteract", "updateCurrentPlan mCurrentPlan is null.");
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_IntPlanInteract", "updatePlan : planApi is null.");
            uiCallback.onFailure(0, "planApi is null");
        } else {
            planApi.updatePlan(userInfoBean, this.f37150b.getPlanId(), new UiCallback<IntPlan>() { // from class: hub.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.e("Suggestion_IntPlanInteract", "updatePlan fail,", Integer.valueOf(i), " ", str);
                    uiCallback.onFailure(i, str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(IntPlan intPlan) {
                    ReleaseLogUtil.d("Suggestion_IntPlanInteract", "updateCurrentPlan success");
                    hub.this.f37150b = intPlan;
                    uiCallback.onSuccess("update plan success");
                }
            });
        }
    }

    private void n(Context context) {
        if (btw.l(this.f37150b)) {
            LogUtil.a("Suggestion_IntPlanInteract", "showPrivacySwitchDialog is h5 plan");
            return;
        }
        IntAiDialogViewHolder.b bVar = new IntAiDialogViewHolder.b();
        bVar.d = context.getString(R.string.IDS_privacy_switch_tip);
        bVar.j = context.getString(R.string.IDS_settings_button_ok);
        bVar.f9754b = new View.OnClickListener() { // from class: hut
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37177c.e(view);
            }
        };
        bVar.f9755c = context.getString(R.string.IDS_settings_button_cancal);
        bVar.f9753a = new View.OnClickListener() { // from class: hur
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37175a.b(view);
            }
        };
        this.d.b(bVar);
    }

    /* synthetic */ void e(View view) {
        ien.e(3, true);
        this.d.d();
    }

    /* synthetic */ void b(View view) {
        this.d.d();
    }

    private boolean a(final Context context) {
        String string;
        String string2;
        if (this.f37150b != null) {
            if (this.f37150b.getPlanId().equals(buh.e("ai_plan_create"))) {
                LogUtil.a("Suggestion_IntPlanInteract", "checkFirstCreatePlanDialog OK");
                return false;
            }
            if (!hvu.m(this.f37150b)) {
                buh.d("ai_plan_create", this.f37150b.getPlanId());
            } else {
                boolean z = this.f37150b.getMetaInfo().getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN;
                if (z && Utils.o()) {
                    LogUtil.a("Suggestion_IntPlanInteract", "current plan is ai fitness but is oversea");
                    return false;
                }
                LogUtil.a("Suggestion_IntPlanInteract", "checkFirstCreatePlanDialog show in the begin day");
                IntAiDialogViewHolder.b bVar = new IntAiDialogViewHolder.b();
                if (z) {
                    bVar.d = context.getString(R.string.IDS_fitness_create_plan);
                    string2 = context.getString(R.string.IDS_plan_tip_to_watch);
                } else {
                    bVar.d = String.format(Locale.ENGLISH, context.getString(R.string.IDS_create_plan_not_related_to_weight), this.f37150b.getMetaInfo().getName());
                    if (this.f37150b.getMetaInfo().getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
                        string = context.getString(R.string.IDS_run_plan_tip_to_watch);
                    } else {
                        string = context.getString(R.string.IDS_no_weight_plan_tip_to_watch);
                    }
                    string2 = String.format(Locale.ENGLISH, string, this.f37150b.getMetaInfo().getName());
                }
                bVar.j = c(context, R.string.IDS_fitness_plan_sync);
                bVar.f9754b = new View.OnClickListener() { // from class: huk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.e.a(context, view);
                    }
                };
                bVar.f9755c = c(context, R.string.IDS_fitness_plan_nonsync);
                bVar.f9753a = new View.OnClickListener() { // from class: huj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f37165c.d(view);
                    }
                };
                if (!EnvironmentInfo.m()) {
                    this.d.b(bVar);
                } else {
                    this.d.d();
                }
                if (!buh.e("notify_to_watch").equals(this.f37150b.getPlanId())) {
                    LogUtil.a("Suggestion_IntPlanInteract", "send the plan's creating message to watch.");
                    hwb.d(string2, this.f37150b);
                    buh.d("notify_to_watch", this.f37150b.getPlanId());
                }
                return true;
            }
        }
        return false;
    }

    /* synthetic */ void a(Context context, View view) {
        f(context);
    }

    /* synthetic */ void d(View view) {
        this.d.d();
        buh.d("ai_plan_create", this.f37150b.getPlanId());
    }

    private static String c(Context context, int i) {
        if (context == null) {
            return "";
        }
        String language = context.getResources().getConfiguration().locale.getLanguage();
        boolean z = true;
        boolean z2 = "it".equalsIgnoreCase(language) || "de".equalsIgnoreCase(language) || "es".equalsIgnoreCase(language);
        if (!"fr".equalsIgnoreCase(language) && !"en".equalsIgnoreCase(language)) {
            z = false;
        }
        if (z2 || z) {
            return context.getString(i).toUpperCase();
        }
        return context.getString(i);
    }

    private void f(Context context) {
        if (hvl.d(context)) {
            LogUtil.a("Suggestion_IntPlanInteract", "IntelligencePlanFragment has CalendarPermission");
            c(context);
        } else {
            this.d.d();
            buh.d("ai_plan_create", this.f37150b.getPlanId());
            LogUtil.a("Suggestion_IntPlanInteract", "request CalendarPermission");
            this.f37149a.t();
        }
    }

    public void c(Context context) {
        if (context == null) {
            return;
        }
        this.d.d();
        buh.d("ai_plan_create", this.f37150b.getPlanId());
        hvl.e(this.f37150b, context, 0);
    }

    public void d(Context context) {
        if (this.f37150b == null || context == null) {
            return;
        }
        g(context);
    }

    private void g(Context context) {
        if (hvl.d(context)) {
            e(context);
        } else {
            LogUtil.a("Suggestion_IntPlanInteract", "request CalendarPermission");
        }
    }

    public void e(Context context) {
        hvl.e(context, buh.e("ai_plan_sync_name"), (IntPlan.PlanType) null);
        buh.c("ai_plan_sync_name");
        buh.c("ai_plan_sync");
    }

    public boolean b(Context context) {
        if (!d() || hvu.u(this.f37150b) || hvu.r(this.f37150b) || btw.l(this.f37150b)) {
            ReleaseLogUtil.d("Suggestion_IntPlanInteract", "checkShowPlanAbnormalDialog dialog no need show");
            return false;
        }
        IntPlan intPlan = this.f37150b;
        if (intPlan != null && (intPlan.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) || this.f37150b.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN))) {
            String strB = buh.b("has_shown_plan_dialog_today", this.f37150b.getPlanId());
            String strValueOf = String.valueOf(hvu.c(this.f37150b));
            LogUtil.a("Suggestion_IntPlanInteract", "currentDay:", strValueOf);
            if (strValueOf.equals(strB)) {
                LogUtil.a("Suggestion_IntPlanInteract", "abnormal exercise dialog has been shown today.");
                return false;
            }
            int i = hvu.i(this.f37150b);
            LogUtil.a("Suggestion_IntPlanInteract", "checkShowPlanAbnormalDialog absentWeekCnt:", Integer.valueOf(i));
            if (i >= 3) {
                i(context);
                return true;
            }
            if (!hvu.b(this.f37150b, "last_two_week_not_exercise") && hvu.s(this.f37150b)) {
                h(context);
                return true;
            }
            if (!hvu.b(this.f37150b, "last_week_not_exercise_well") && hvu.t(this.f37150b)) {
                k(context);
                return true;
            }
            if (hvu.b(this.f37150b, 5)) {
                d(context, 5);
                return true;
            }
            if (hvu.b(this.f37150b, 4)) {
                d(context, 4);
                return true;
            }
            if (hvu.b(this.f37150b, 3)) {
                d(context, 3);
                return true;
            }
            if (hvu.b(this.f37150b, 2)) {
                d(context, 2);
                return true;
            }
            if (hvu.b(this.f37150b, 1)) {
                d(context, 1);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, String str, View.OnClickListener onClickListener) {
        IntAiDialogViewHolder.b bVar = new IntAiDialogViewHolder.b();
        bVar.d = str;
        bVar.j = context.getString(R.string.sug_dialog_yes);
        bVar.f9754b = onClickListener;
        this.d.b(bVar);
    }

    private void c(String str) {
        IntAiDialogViewHolder.b bVar = new IntAiDialogViewHolder.b();
        bVar.d = str;
        this.d.b(bVar);
    }

    private void h(Context context) {
        String strB = buh.b("last_two_week_not_exercise", this.f37150b.getPlanId());
        final String strValueOf = String.valueOf(hvu.g(this.f37150b));
        LogUtil.a("Suggestion_IntPlanInteract", "showLastWeekNotExerciseDialog lastRemindTime:", strB, " currentWeek:", strValueOf);
        if (strB == null || !strB.equals(strValueOf)) {
            final String strValueOf2 = String.valueOf(hvu.c(this.f37150b));
            String string = context.getString(R.string.IDS_fitness_plan_absent_last_two_week);
            e(context, string, new View.OnClickListener() { // from class: hul
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.a(strValueOf, strValueOf2, view);
                }
            });
            a(strValueOf2, string);
        }
    }

    /* synthetic */ void a(String str, String str2, View view) {
        buh.a("last_two_week_not_exercise", str, this.f37150b.getPlanId());
        buh.a("has_shown_plan_dialog_today", str2, this.f37150b.getPlanId());
        this.d.d();
    }

    private void k(Context context) {
        String string;
        String strB = buh.b("last_week_not_exercise_well", this.f37150b.getPlanId());
        final String strValueOf = String.valueOf(hvu.g(this.f37150b));
        LogUtil.a("Suggestion_IntPlanInteract", "showLastWeekNotExerciseWellDialog lastRemindTime:", strB, " currentWeek:", strValueOf);
        if (strB == null || !strB.equals(strValueOf)) {
            final String strValueOf2 = String.valueOf(hvu.c(this.f37150b));
            if (this.f37150b.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
                string = context.getString(R.string.IDS_fitness_plan_absent_one_week);
            } else {
                string = context.getString(R.string.IDS_fitness_plan_absent_last_week);
            }
            e(context, string, new View.OnClickListener() { // from class: hum
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37168a.d(strValueOf, strValueOf2, view);
                }
            });
            a(strValueOf2, string);
        }
    }

    /* synthetic */ void d(String str, String str2, View view) {
        buh.a("last_week_not_exercise_well", str, this.f37150b.getPlanId());
        buh.a("has_shown_plan_dialog_today", str2, this.f37150b.getPlanId());
        this.d.d();
    }

    private void d(Context context, int i) {
        int i2;
        String strB = buh.b("has_shown_plan_dialog_today", this.f37150b.getPlanId());
        final String strValueOf = String.valueOf(hvu.c(this.f37150b));
        LogUtil.a("Suggestion_IntPlanInteract", "NotExerciseDialog lastRemindTime:", strB, " currentDay:", strValueOf);
        if (i == 1) {
            i2 = R.string.IDS_fitness_plan_absent_last_day;
        } else if (i == 2) {
            i2 = R.string.IDS_fitness_plan_absent_two_day;
        } else if (i == 3) {
            i2 = R.string.IDS_fitness_plan_absent_three_day;
        } else if (i == 4) {
            i2 = R.string.IDS_fitness_plan_absent_four_day;
        } else if (i != 5) {
            return;
        } else {
            i2 = R.string.IDS_fitness_plan_absent_over_four_day;
        }
        if (strB == null || !strB.equals(strValueOf)) {
            LogUtil.a("Suggestion_IntPlanInteract", "show NotExercise tip");
            String string = context.getString(i2);
            e(context, string, new View.OnClickListener() { // from class: hui
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37164a.c(strValueOf, view);
                }
            });
            a(strValueOf, string);
        }
    }

    /* synthetic */ void c(String str, View view) {
        buh.a("has_shown_plan_dialog_today", str, this.f37150b.getPlanId());
        this.d.d();
    }

    private void m(Context context) {
        c(context.getString(R.string.IDS_FitnessAdvice_finish_current_plan));
    }

    private void i(Context context) {
        c(context.getString(R.string.IDS_fitness_plan_abnormal));
    }

    private void a(String str, String str2) {
        LogUtil.a("Suggestion_IntPlanInteract", "shownWatchTipToday");
        String strB = buh.b("has_shown_watch_tip_today", this.f37150b.getPlanId());
        if (strB == null || !strB.equals(str)) {
            hwb.d(str2, this.f37150b);
            buh.a("has_shown_watch_tip_today", str, this.f37150b.getPlanId());
        }
    }

    private void o(final Context context) {
        new NoTitleCustomAlertDialog.Builder(context).b(R.string.IDS_this_week_report_created).c(R.string.IDS_FitnessAdvice_go_and_see, new View.OnClickListener() { // from class: hup
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(context, view);
            }
        }).a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: hun
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hub.a(view);
            }
        }).c().show();
        hwb.d(context.getString(R.string.IDS_this_week_report_created), this.f37150b);
    }

    /* synthetic */ void d(Context context, View view) {
        ObserverManagerUtil.e("WATCH_PLAN_REPORT_DIALOG", new Object[0]);
        JumpUtil.d(1, context, this.f37150b.getPlanType().getType(), this.f37150b.getPlanId());
    }

    private void l(final Context context) {
        new NoTitleCustomAlertDialog.Builder(context).b(R.string.IDS_last_week_report_created).c(R.string.IDS_FitnessAdvice_go_and_see, new View.OnClickListener() { // from class: huh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37162a.e(context, view);
            }
        }).a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: hug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hub.c(view);
            }
        }).c().show();
        hwb.d(context.getString(R.string.IDS_last_week_report_created), this.f37150b);
    }

    /* synthetic */ void e(Context context, View view) {
        ObserverManagerUtil.e("WATCH_PLAN_REPORT_DIALOG", new Object[0]);
        JumpUtil.d(1, context, this.f37150b.getPlanType().getType(), this.f37150b.getPlanId());
    }

    private boolean d() {
        return ien.e(3);
    }

    public void a() {
        if (this.f37150b == null) {
            LogUtil.a("Suggestion_IntPlanInteract", "no doing plan.");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: huo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37171b.e();
                }
            });
        }
    }

    /* synthetic */ void e() {
        d(this.f37150b);
        if (this.f37150b.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) || this.f37150b.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
            e(this.f37150b);
        }
    }

    private static void d(IntPlan intPlan) {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("Suggestion_IntPlanInteract", "lastWeekStatistics courseApi is null");
            return;
        }
        int iH = btw.h(intPlan);
        long jE = btw.e(intPlan, iH);
        long jD = btw.d(intPlan, iH);
        LogUtil.a("Suggestion_IntPlanInteract", "checkInPlanPunch weekNum:", Integer.valueOf(iH), " weekStartTime:", Long.valueOf(jE), " weekEndTime:", Long.valueOf(jD), " planType:", Integer.valueOf(intPlan.getPlanType().getType()));
        String strI = ift.i(jE * 1000);
        String strI2 = ift.i(jD * 1000);
        LogUtil.a("Suggestion_IntPlanInteract", "getWorkoutRecords startDate = ", strI, " endDate = ", strI2);
        List<WorkoutRecord> workoutRecords = courseApi.getWorkoutRecords(intPlan.getPlanId(), strI, strI2);
        if (njy.e(workoutRecords)) {
            LogUtil.a("Suggestion_IntPlanInteract", "plan workoutRecords empty.");
            return;
        }
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(iH);
        if (weekInfoByOrder == null) {
            LogUtil.e("Suggestion_IntPlanInteract", "weekPlan == null:", Integer.valueOf(iH));
            return;
        }
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList();
        for (WorkoutRecord workoutRecord : workoutRecords) {
            if (workoutRecord.getPlanTrainDate() == 0) {
                LogUtil.e("Suggestion_IntPlanInteract", "workoutRecord getPlanTrainDate() == 0:", workoutRecord.acquireWorkoutId());
            } else {
                calendar.setTimeInMillis(ieg.e(workoutRecord.getPlanTrainDate()));
                int iB = ift.b(calendar.get(7));
                boolean zE = e(weekInfoByOrder, iB, workoutRecord);
                boolean zD = d(weekInfoByOrder, iB, workoutRecord);
                int planTrainDate = workoutRecord.getPlanTrainDate();
                LogUtil.a("Suggestion_IntPlanInteract", "plan train date:", Integer.valueOf(planTrainDate), " planDayIndex:", Integer.valueOf(iB), " workoutId:", workoutRecord.acquireWorkoutId(), " isRecordCourseInPlan:", Boolean.valueOf(zD), " isUploadCloud:", Boolean.valueOf(zE));
                if (zD && !zE) {
                    arrayList.add(workoutRecord);
                }
            }
        }
        b(intPlan, arrayList);
    }

    private static boolean e(IntWeekPlan intWeekPlan, int i, WorkoutRecord workoutRecord) {
        IntDayPlan dayByOrder = intWeekPlan.getDayByOrder(i);
        if (dayByOrder == null) {
            return false;
        }
        if (d(workoutRecord, dayByOrder)) {
            LogUtil.a("Suggestion_IntPlanInteract", "action has clocked.");
            return true;
        }
        for (int i2 = 0; i2 < dayByOrder.getRecordDataCnt(); i2++) {
            RecordData recordData = dayByOrder.getRecordData(i2);
            LogUtil.a("Suggestion_IntPlanInteract", "record data:", recordData.getWorkoutId(), " ", recordData.getRecordId());
            if (recordData.getWorkoutId().equals(workoutRecord.acquireWorkoutId())) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(WorkoutRecord workoutRecord, IntDayPlan intDayPlan) {
        boolean z = false;
        for (int i = 0; i < intDayPlan.getInPlanActionCnt(); i++) {
            IntAction inPlanAction = intDayPlan.getInPlanAction(i);
            if (inPlanAction != null && inPlanAction.getActionId() != null && inPlanAction.getActionId().equals(workoutRecord.acquireWorkoutId()) && inPlanAction.getPunchFlag() == 1) {
                z = true;
            }
        }
        return z;
    }

    private static boolean d(IntWeekPlan intWeekPlan, int i, WorkoutRecord workoutRecord) {
        IntDayPlan dayByOrder = intWeekPlan.getDayByOrder(i);
        if (dayByOrder == null) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < dayByOrder.getInPlanActionCnt(); i2++) {
            if (dayByOrder.getInPlanAction(i2).getActionId().equals(workoutRecord.acquireWorkoutId())) {
                z = true;
            }
        }
        for (int i3 = 0; i3 < dayByOrder.getOutPlanActionCnt(); i3++) {
            if (dayByOrder.getOutPlanAction(i3).getActionId().equals(workoutRecord.acquireWorkoutId())) {
                z = true;
            }
        }
        return z;
    }

    private static void b(IntPlan intPlan, List<WorkoutRecord> list) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_IntPlanInteract", "checkPlanPunchThisWeek : planApi is null.");
            return;
        }
        for (WorkoutRecord workoutRecord : list) {
            planApi.updateDayRecord(intPlan, workoutRecord, new b(workoutRecord));
        }
    }

    static class b extends DataCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WorkoutRecord f37154c;

        public b(WorkoutRecord workoutRecord) {
            this.f37154c = workoutRecord;
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onFailure(int i, String str) {
            WorkoutRecord workoutRecord = this.f37154c;
            if (workoutRecord == null) {
                LogUtil.e("Suggestion_IntPlanInteract", "updateDayRecord onFailure errorCode:", Integer.valueOf(i), "errorInfo:", str);
            } else {
                LogUtil.e("Suggestion_IntPlanInteract", "updateDayRecord onFailure,", workoutRecord.acquireWorkoutId(), Integer.valueOf(this.f37154c.getPlanTrainDate()), " errorCode:", Integer.valueOf(i), " ", str);
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onSuccess(JSONObject jSONObject) {
            LogUtil.a("Suggestion_IntPlanInteract", "updateDayRecord onSuccess.");
        }
    }

    private static void e(IntPlan intPlan) {
        int iH = btw.h(intPlan);
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(iH);
        if (weekInfoByOrder == null) {
            LogUtil.e("Suggestion_IntPlanInteract", "checkOutPlanPunch weekPlan == null:", Integer.valueOf(iH));
            return;
        }
        long jE = btw.e(intPlan, iH) * 1000;
        long jD = btw.d(intPlan, iH) * 1000;
        if (IntPlan.PlanType.AI_RUN_PLAN.equals(intPlan.getPlanType()) && intPlan.getPlanTimeInfo() != null && TimeUnit.SECONDS.toMillis(intPlan.getPlanTimeInfo().getEndDate()) == jD) {
            jD = lsl.c(jD);
        }
        long j = jD;
        LogUtil.a("Suggestion_IntPlanInteract", "checkOutPlanPunch weekNum:", Integer.valueOf(iH), " weekStartTime:", Long.valueOf(jE), " weekEndTime:", Long.valueOf(j), " planType:", Integer.valueOf(intPlan.getPlanType().getType()));
        e(intPlan.getPlanType().getType(), jE, j, new d(weekInfoByOrder));
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IntWeekPlan f37155b;

        public d(IntWeekPlan intWeekPlan) {
            this.f37155b = intWeekPlan;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (!njy.b(obj, HiHealthData.class)) {
                LogUtil.e("Suggestion_IntPlanInteract", "getRunTrackData ListTypeNotMatch.");
                return;
            }
            List list = (List) obj;
            if (hub.b((List<HiHealthData>) list)) {
                Calendar calendar = Calendar.getInstance();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MotionPathSimplify motionPathSimplifyD = ntv.d((HiHealthData) it.next());
                    if (hub.e(motionPathSimplifyD)) {
                        long jRequestStartTime = motionPathSimplifyD.requestStartTime();
                        calendar.setTimeInMillis(jRequestStartTime);
                        int iB = ift.b(calendar.get(7));
                        boolean zA = hub.a(this.f37155b, iB, motionPathSimplifyD);
                        LogUtil.a("Suggestion_IntPlanInteract", "motionPathSimplify startTime:", Long.valueOf(jRequestStartTime), " endTime:", Long.valueOf(motionPathSimplifyD.requestEndTime()), " sportType:", Integer.valueOf(motionPathSimplifyD.requestSportType()), " distance:", Integer.valueOf(motionPathSimplifyD.requestTotalDistance()), " planDayIndex:", Integer.valueOf(iB), " isRecordUploadCloud:", Boolean.valueOf(zA));
                        if (!zA) {
                            hub.c(motionPathSimplifyD);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(List<HiHealthData> list) {
        if (!list.isEmpty() && list.get(0) != null) {
            return true;
        }
        LogUtil.j("Suggestion_IntPlanInteract", "requestTrackSimplifyData size 0");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.j("Suggestion_IntPlanInteract", "motionPathSimplify == null.");
            return false;
        }
        if (motionPathSimplify.requestSportDataSource() == 2) {
            LogUtil.j("Suggestion_IntPlanInteract", "motionPathSimplifySPORT_DATA_SOURCE_USER_INPUT_SPORT.");
            return false;
        }
        if (motionPathSimplify.requestAbnormalTrack() == 0) {
            return true;
        }
        LogUtil.j("Suggestion_IntPlanInteract", "motionPathSimplify is abnormal.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(IntWeekPlan intWeekPlan, int i, MotionPathSimplify motionPathSimplify) {
        IntDayPlan dayByOrder = intWeekPlan.getDayByOrder(i);
        if (dayByOrder == null) {
            return false;
        }
        for (int i2 = 0; i2 < dayByOrder.getRecordDataCnt(); i2++) {
            RecordData recordData = dayByOrder.getRecordData(i2);
            LogUtil.a("Suggestion_IntPlanInteract", "record data:", recordData.getRecordId(), " ", motionPathSimplify.requestStartTime() + "_" + motionPathSimplify.requestEndTime());
            if (recordData.getRecordId().equals(motionPathSimplify.requestStartTime() + "_" + motionPathSimplify.requestEndTime())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(MotionPathSimplify motionPathSimplify) {
        String strOptString;
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_IntPlanInteract", "updateOutPlanDayRecord : planApi is null.");
            return;
        }
        pdr pdrVarE = btw.e(motionPathSimplify);
        String extendDataString = motionPathSimplify.getExtendDataString("planInfo", "");
        String extendDataString2 = motionPathSimplify.getExtendDataString(HwExerciseConstants.JSON_NAME_PLAN_ID, "");
        if ("".equals(extendDataString)) {
            strOptString = "";
        } else {
            try {
                strOptString = new JSONObject(extendDataString).optString("planId");
            } catch (JSONException unused) {
                LogUtil.e("Suggestion_IntPlanInteract", "toJson error");
                strOptString = "";
            }
        }
        if ("".equals(extendDataString2)) {
            extendDataString2 = strOptString;
        }
        String str = extendDataString2;
        ReleaseLogUtil.d("Suggestion_IntPlanInteract", "updateOutPlanDayRecord planId:", str, " workoutId:", pdrVarE.l(), " startTime:", Long.valueOf(pdrVarE.f()), " planCourseTime:", Integer.valueOf(motionPathSimplify.getExtendDataInt(HwExerciseConstants.JSON_NAME_PLAN_COURSE_TIME)));
        planApi.updateDayRecord(extendDataString2, pdrVarE);
    }

    public static void e(int i, long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(i == IntPlan.PlanType.AI_RUN_PLAN.getType() ? new int[]{258, 264, OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE, 227} : null);
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(btx.c()).fetchSequenceDataBySportType(hiDataReadOption, new e(iBaseResponseCallback));
    }

    static class e implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IBaseResponseCallback f37156b;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        public e(IBaseResponseCallback iBaseResponseCallback) {
            this.f37156b = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (this.f37156b == null) {
                ReleaseLogUtil.e("Suggestion_IntPlanInteract", "MyHiDataReadResultListener intPlanInteract == null");
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (!(obj instanceof SparseArray)) {
                LogUtil.j("Suggestion_IntPlanInteract", "data error.");
                this.f37156b.a(-1, arrayList);
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (!njy.b(sparseArray.get(i), HiHealthData.class)) {
                LogUtil.j("Suggestion_IntPlanInteract", "requestTrackSimplifyData onResult obj not instanceof List");
                this.f37156b.a(-1, arrayList);
            } else {
                this.f37156b.a(-1, (List) sparseArray.get(i));
            }
        }
    }
}
