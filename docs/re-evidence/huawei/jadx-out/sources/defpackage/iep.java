package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.StatInfo;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.viewholder.IntCurrentPlanViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.IntPlanListViewHolder;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import com.huawei.utils.RiskBiAnalytics;
import health.compact.a.EnvironmentInfo;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class iep {
    private static Handler e = new Handler(Looper.getMainLooper());

    public static void e(final ViewGroup viewGroup, final boolean z) {
        ((PlanApi) Services.d("CoursePlanService", PlanApi.class)).e(new UiCallback<IntPlan>() { // from class: iep.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_intelligentPlanViewUtil", "getCurrentPlan onFailure");
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(final IntPlan intPlan) {
                if (intPlan == null) {
                    if (z) {
                        iep.d(viewGroup);
                    }
                } else if (intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
                    HandlerExecutor.b(new Runnable() { // from class: iep.3.3
                        @Override // java.lang.Runnable
                        public void run() {
                            new IntCurrentPlanViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sug_layout_intplan_progress, viewGroup, true), 1).d(intPlan);
                        }
                    });
                } else {
                    LogUtil.d("Suggestion_intelligentPlanViewUtil", "Only show with ai fitness plan");
                }
            }
        });
    }

    public static void d(final ViewGroup viewGroup) {
        ((PlanApi) Services.d("CoursePlanService", PlanApi.class)).getAllFitnessPackage(-1, new UiCallback<List<FitnessPackageInfo>>() { // from class: iep.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("Suggestion_intelligentPlanViewUtil", "loadRecommendPlanList onFailure.");
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<FitnessPackageInfo> list) {
                for (FitnessPackageInfo fitnessPackageInfo : list) {
                    if (fitnessPackageInfo.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
                        new IntPlanListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sug_layout_intplan_recommend_list_item, viewGroup, true), "weight").d(fitnessPackageInfo);
                        return;
                    }
                }
            }
        });
    }

    public static void c(Context context, final IntPlan intPlan, int i, final UiCallback uiCallback) {
        if (context == null) {
            LogUtil.e("Suggestion_intelligentPlanViewUtil", "finishPlanAndCreateReport error context is null");
            return;
        }
        boolean zJ = hvu.j(intPlan);
        NoTitleCustomAlertDialog.Builder builderA = new NoTitleCustomAlertDialog.Builder(context).b(i).a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: ieu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iep.e(intPlan, uiCallback, view);
            }
        });
        if (zJ) {
            builderA.c(R.string.IDS_plan_view_report, new View.OnClickListener() { // from class: ier
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iep.b(intPlan, true, uiCallback);
                }
            });
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builderA.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void e(IntPlan intPlan, UiCallback uiCallback, View view) {
        b(intPlan, 0);
        b(intPlan, false, uiCallback);
    }

    public static void b(IntPlan intPlan, int i) {
        if (intPlan == null || intPlan.getMetaInfo() == null || intPlan.getPlanType() == null) {
            LogUtil.j("Suggestion_intelligentPlanViewUtil", "onEventEndPlanRate plan == null");
        } else {
            StatInfo stat = intPlan.getStat("progress");
            idy.d(stat == null ? 0.0f : ((Float) stat.getValue()).floatValue(), intPlan.getMetaInfo().getName(), intPlan.getPlanType().getType(), i);
        }
    }

    public static void b(final IntPlan intPlan, boolean z, final UiCallback uiCallback) {
        if (intPlan == null) {
            if (uiCallback != null) {
                uiCallback.onFailure(e, 20004, "currentPlan is null");
                return;
            }
            return;
        }
        if (hvu.c()) {
            if (uiCallback != null) {
                uiCallback.onFailure(e, -6, "data in sync");
                return;
            }
            return;
        }
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            if (uiCallback != null) {
                uiCallback.onFailure(e, 9999, "intPlanApi is null");
            }
        } else if (hvu.j(intPlan) && intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ieq
                @Override // java.lang.Runnable
                public final void run() {
                    iep.e(intPlan, uiCallback, planApi);
                }
            });
        } else {
            e(intPlan, planApi, z, uiCallback);
        }
    }

    static /* synthetic */ void e(IntPlan intPlan, UiCallback uiCallback, PlanApi planApi) {
        LogUtil.a("Suggestion_intelligentPlanViewUtil", "hasReport finishPlan planId:" + intPlan.getPlanId());
        hvh hvhVar = new hvh();
        hvhVar.a(intPlan);
        JSONObject jSONObjectB = hvhVar.b(2, false);
        if (jSONObjectB == null) {
            if (uiCallback != null) {
                uiCallback.onFailure(e, ResultUtil.ResultCode.NO_NET, "getReport is null");
            }
        } else if (hvhVar.d(jSONObjectB, 2, System.currentTimeMillis())) {
            e(intPlan, planApi, true, uiCallback);
        } else if (uiCallback != null) {
            uiCallback.onFailure(e, -6, "updateReport fail");
        }
    }

    public static void a(final Context context, final double d, final double d2) {
        if (dmg.a().getBondedProductsForDeviceOnly(HealthDevice.HealthDeviceKind.HDK_WEIGHT).size() == 0 || EnvironmentInfo.m()) {
            JumpUtil.c(context, d, d2, "/PluginHealthModel/IntelligentPlanView");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.a(context.getString(R.string.IDS_ask_weight_enter_type)).a(context.getString(R.string.IDS_weight_device_entry), new View.OnClickListener() { // from class: iep.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                buh.d("measure_weight_for_plan", "true");
                JumpUtil.d(context, HealthDevice.HealthDeviceKind.HDK_WEIGHT.name(), -1);
            }
        }).d(context.getString(R.string.IDS_weight_manual_entry), new View.OnClickListener() { // from class: iep.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                JumpUtil.c(context, d, d2, "/PluginHealthModel/IntelligentPlanView");
            }
        });
        builder.c().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a() {
        buh.c("plan_update_week");
        buh.c("ai_plan_sync_name");
        buh.c("ai_plan_sync");
        buh.c("ai_plan_create");
        buh.c("last_week_not_exercise");
        buh.c("last_two_week_not_exercise");
        buh.c("last_week_not_exercise_well");
        buh.c("ai_plan_finish");
        buh.c("showReportTime");
        buh.c("has_shown_plan_dialog_today");
        buh.c("has_shown_watch_tip_today");
        buh.c("read_oversea_dialog");
    }

    public static void a(Context context, boolean z, int i) {
        LogUtil.a("Suggestion_intelligentPlanViewUtil", "enter saveTempPlanToSp");
        if (z) {
            SharedPreferenceManager.e(context, "intelligent_plan", "intelligent_plan_create_temp", String.valueOf(z), new StorageParams());
            SharedPreferenceManager.e(context, "intelligent_plan", "intelligent_plan_sport_consumption", String.valueOf(i), new StorageParams());
            return;
        }
        SharedPreferenceManager.b(context, "intelligent_plan", "intelligent_plan_create_temp");
        SharedPreferenceManager.b(context, "intelligent_plan", "intelligent_plan_sport_consumption");
    }

    private static void e(final IntPlan intPlan, PlanApi planApi, final boolean z, final UiCallback uiCallback) {
        if (intPlan == null) {
            if (uiCallback != null) {
                uiCallback.onFailure(e, 20004, "currentPlan is null");
            }
        } else {
            LogUtil.a("Suggestion_intelligentPlanViewUtil", "finishPlan planId:" + intPlan.getPlanId());
            planApi.finishPlan(1, intPlan.getPlanId(), new UiCallback<String>() { // from class: iep.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.e("Suggestion_intelligentPlanViewUtil", "finishPlan errorCode: ", Integer.valueOf(i), "errorInfo: ", str);
                    RiskBiAnalytics.e(RiskBiAnalytics.FitPLANRiskType.RISK_TYPE_FINISH_PLAN.value(), "finishPlan fail errorCode: ", Integer.valueOf(i), "errorInfo: ", str, "PlanId: ", intPlan.getPlanId());
                    UiCallback uiCallback2 = uiCallback;
                    if (uiCallback2 != null) {
                        if (i == 200025) {
                            uiCallback2.onFailure(ResultUtil.ResultCode.PRIVACY_POST_OFF, str);
                        } else {
                            uiCallback2.onFailure(ResultUtil.ResultCode.NO_NET, str);
                        }
                    }
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    iep.a();
                    hwb.d(BaseApplication.getContext().getString(R.string.IDS_plan_quit_tip_to_watch), intPlan);
                    LogUtil.a("Suggestion_intelligentPlanViewUtil", "finishPlan OK");
                    UiCallback uiCallback2 = uiCallback;
                    if (uiCallback2 != null) {
                        uiCallback2.onSuccess("finish ok");
                    }
                    boolean zJ = hvu.j(intPlan);
                    if (!zJ && hvu.p(intPlan)) {
                        qpx.e(BaseApplication.getActivity(), R.string.IDS_sug_invalid_plan_finish);
                    }
                    if (zJ && z) {
                        JumpUtil.a(2, BaseApplication.getActivity(), intPlan.getPlanType().getType(), intPlan.getPlanId(), 2);
                    }
                }
            });
        }
    }

    public static String a(long j, IntPlan intPlan) {
        if (intPlan == null) {
            LogUtil.j("Suggestion_intelligentPlanViewUtil", "intPlan is null, return");
            return "";
        }
        int iA = (int) (((ift.a(j) / 86400000) - ((intPlan.getPlanTimeInfo().getBeginDate() * 1000) / 86400000)) + 1);
        if (IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType())) {
            iA = lsl.b(btw.f(intPlan), DateFormatUtil.a(j));
        }
        int iE = btw.e(intPlan);
        if (iA > iE) {
            iA = iE;
        }
        return a(iA, intPlan);
    }

    private static String a(int i, IntPlan intPlan) {
        long jG;
        if (i <= 0) {
            if (IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType())) {
                jG = DateFormatUtil.d(btw.f(intPlan));
            } else {
                jG = btw.g(intPlan);
            }
            return qre.a(R.string.IDS_fitness_plan_start_date, DateUtils.formatDateTime(BaseApplication.getContext(), jG, 24));
        }
        return gzx.b(BaseApplication.getContext(), i, btw.e(intPlan), 0);
    }

    public static void a(IntPlan intPlan, HwTextView hwTextView, ImageView imageView) {
        if (intPlan == null) {
            LogUtil.j("Suggestion_intelligentPlanViewUtil", "plan is null");
            return;
        }
        if (hwTextView == null) {
            LogUtil.j("Suggestion_intelligentPlanViewUtil", "planReportButton is null");
            return;
        }
        if (imageView == null) {
            LogUtil.j("Suggestion_intelligentPlanViewUtil", "redDot is null");
            return;
        }
        if (hvu.u(intPlan) || hvu.r(intPlan)) {
            hwTextView.setVisibility(8);
            imageView.setVisibility(8);
            return;
        }
        if (intPlan.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            c(intPlan, hwTextView, imageView);
        } else if (intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
            d(intPlan, hwTextView, imageView);
        } else {
            hwTextView.setVisibility(8);
            imageView.setVisibility(8);
        }
        b(intPlan, hwTextView, imageView);
    }

    private static void b(final IntPlan intPlan, final HwTextView hwTextView, final ImageView imageView) {
        hwTextView.setOnClickListener(new View.OnClickListener() { // from class: iep.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    LogUtil.j("Suggestion_intelligentPlanViewUtil", "plan_report_button click too fast.");
                    return;
                }
                if (hvu.c()) {
                    LogUtil.j("Suggestion_intelligentPlanViewUtil", "is in sync data progress.");
                    qpx.e(hwTextView.getContext(), hwTextView.getContext().getString(R.string.IDS_hw_show_sync_cloud_history_data));
                } else if (intPlan.getPlanType() == null) {
                    LogUtil.j("Suggestion_intelligentPlanViewUtil", "plan.getPlanType()");
                } else {
                    JumpUtil.d(1, hwTextView.getContext(), intPlan.getPlanType().getType(), intPlan.getPlanId());
                    imageView.setVisibility(8);
                }
            }
        });
    }

    private static void c(IntPlan intPlan, HwTextView hwTextView, ImageView imageView) {
        if (hvu.x(intPlan)) {
            ReleaseLogUtil.d("Suggestion_intelligentPlanViewUtil", "show last week report");
            hwTextView.setVisibility(0);
            hwTextView.setText(gzx.c(BaseApplication.getContext(), R.string.IDS_plan_last_week_report, new Object[0]));
            if (hvu.e()) {
                ReleaseLogUtil.d("Suggestion_intelligentPlanViewUtil", "show last week report red dot.");
                imageView.setVisibility(0);
                return;
            } else {
                imageView.setVisibility(8);
                return;
            }
        }
        hwTextView.setVisibility(8);
        imageView.setVisibility(8);
    }

    private static void d(IntPlan intPlan, HwTextView hwTextView, ImageView imageView) {
        if (hvu.w(intPlan)) {
            ReleaseLogUtil.d("Suggestion_intelligentPlanViewUtil", "show this week report");
            hwTextView.setVisibility(0);
            hwTextView.setText(gzx.c(BaseApplication.getContext(), R.string.IDS_plan_this_week_report, new Object[0]));
            if (hvu.a()) {
                ReleaseLogUtil.d("Suggestion_intelligentPlanViewUtil", "show this week report red dot.");
                imageView.setVisibility(0);
                return;
            } else {
                imageView.setVisibility(8);
                return;
            }
        }
        c(intPlan, hwTextView, imageView);
    }

    public static String b(float f, float f2) {
        if (UnitUtil.f()) {
            double d = f - f2;
            return gzx.d(R.plurals.IDS_goal_value_deviation_lb, (int) Math.ceil(UnitUtil.h(d)), UnitUtil.e(UnitUtil.h(d), 1, 1));
        }
        float f3 = f - f2;
        return gzx.d(R.plurals.IDS_goal_value_deviation, (int) f3, UnitUtil.e(Math.round(f3 * 10.0f) / 10.0f, 1, 1));
    }
}
