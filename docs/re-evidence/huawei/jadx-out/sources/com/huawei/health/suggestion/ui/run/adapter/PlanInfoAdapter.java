package com.huawei.health.suggestion.ui.run.adapter;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.PlanInfo;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.FitnessExternalUtils;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.callback.JudgeCallback;
import com.huawei.health.suggestion.ui.plan.viewholder.IntPlanListViewHolder;
import com.huawei.health.suggestion.ui.run.activity.RunPlanCreateActivity;
import com.huawei.health.suggestion.ui.run.adapter.PlanInfoAdapter;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.health.suggestion.util.ResourceJudgeUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.pluginfitnessadvice.pricetagbean.PriceTagBean;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.btw;
import defpackage.idy;
import defpackage.lsj;
import defpackage.njy;
import defpackage.pcp;
import defpackage.pea;
import defpackage.qey;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class PlanInfoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f9963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<PlanInfo> f9964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9965c = false;
    private NoTitleCustomAlertDialog d;
    private List<FitnessPackageInfo> e;
    private List<pcp> g;
    private int h;

    public static /* synthetic */ void d(View view) {
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f9972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f9973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f9974c;
        ImageView d;
        ImageView e;

        a(View view) {
            super(view);
            this.e = (ImageView) view.findViewById(R.id.sug_fitness_pkg_bg);
            this.d = (ImageView) view.findViewById(R.id.sug_fitness_corner);
            this.f9972a = (HealthTextView) view.findViewById(R.id.sug_fitness_name);
            this.f9974c = (HealthTextView) view.findViewById(R.id.sug_fitness_description);
            this.f9973b = view.findViewById(R.id.fitness_pkg_interval);
        }
    }

    public PlanInfoAdapter(List<FitnessPackageInfo> list, int i, Context context) {
        this.f9963a = context;
        this.e = list;
        this.h = i;
        b();
    }

    public PlanInfoAdapter(int i, List<pcp> list, Context context) {
        this.f9963a = context;
        this.g = list;
        this.h = i;
        b();
    }

    private void b() {
        e();
    }

    private void e() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f9963a);
        builder.b(com.huawei.health.servicesui.R.string.IDS_sport_notify_update_app);
        builder.c(com.huawei.health.servicesui.R.string.IDS_update_new_version_to_upgrade_app, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.PlanInfoAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!lsj.c(PlanInfoAdapter.this.f9963a, "com.huawei.appmarket")) {
                    qpx.e(PlanInfoAdapter.this.f9963a, com.huawei.ui.commonui.R.string.IDS_main_sns_app_store_content);
                } else {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=" + BaseApplication.d()));
                    intent.addFlags(268435456);
                    intent.setPackage("com.huawei.appmarket");
                    qrs.c(intent, "com.huawei.appmarket", PlanInfoAdapter.this.f9963a, qre.f(com.huawei.ui.commonui.R.string.IDS_device_fragment_application_market));
                }
                PlanInfoAdapter.this.d.dismiss();
            }
        });
        builder.a(com.huawei.health.servicesui.R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.PlanInfoAdapter.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.d = builder.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.h == 3 && FitnessExternalUtils.b()) {
            return new IntPlanListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sug_layout_intplan_recommend_list_item, viewGroup, false), "fitness");
        }
        return new a(LayoutInflater.from(BaseApplication.b()).inflate(R.layout.sug_plan_type_item, viewGroup, false));
    }

    private void a(final HealthTextView healthTextView) {
        if (healthTextView == null) {
            return;
        }
        healthTextView.post(new Runnable() { // from class: com.huawei.health.suggestion.ui.run.adapter.PlanInfoAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                TextPaint paint = healthTextView.getPaint();
                if (paint == null || healthTextView.getText() == null || paint.measureText(healthTextView.getText().toString()) < healthTextView.getMeasuredWidth() * healthTextView.getMaxLines() * 0.85f) {
                    return;
                }
                if (qrs.v()) {
                    healthTextView.setMaxLines(2);
                    healthTextView.setTextSize(2, 10.0f);
                } else {
                    healthTextView.setMaxLines(3);
                    healthTextView.setTextSize(1, 10.0f);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            int i2 = this.h;
            if (i2 == 3) {
                if (njy.e(this.e, i)) {
                    return;
                }
                b(aVar, this.e.get(i));
                return;
            } else if (i2 == 0) {
                if (njy.e(this.g, i)) {
                    return;
                }
                b(aVar, this.g.get(i));
                return;
            } else if (njy.e(this.f9964b, i)) {
                LogUtil.j("Suggestion_PlanInfoAdapter", "onBindViewHolder, mPlanInfoList out of bounds. position = ", Integer.valueOf(i));
                return;
            } else {
                c(aVar, i);
                return;
            }
        }
        if (viewHolder instanceof IntPlanListViewHolder) {
            ((IntPlanListViewHolder) viewHolder).d(this.e.get(0));
        }
    }

    private void c(a aVar, int i) {
        if (njy.e(this.f9964b, i)) {
            LogUtil.j("Suggestion_PlanInfoAdapter", "ArrayIndexOutOfBoundsException");
            return;
        }
        PlanInfo planInfo = this.f9964b.get(i);
        int type = planInfo.getType();
        if (type == 0) {
            if (planInfo instanceof pcp) {
                b(aVar, (pcp) planInfo);
            }
        } else {
            if (type == 3) {
                if (planInfo instanceof FitnessPackageInfo) {
                    b(aVar, (FitnessPackageInfo) planInfo);
                    return;
                }
                return;
            }
            LogUtil.j("Suggestion_PlanInfoAdapter", "planType unSupport");
        }
    }

    private void b(a aVar, pcp pcpVar) {
        if (aVar == null || pcpVar == null) {
            LogUtil.j("Suggestion_PlanInfoAdapter", "holder == null || info == null");
            return;
        }
        aVar.f9973b.setBackgroundColor(this.f9963a.getResources().getColor(com.huawei.ui.commonui.R.color.common_ui_custom_dialog_transparent_bg));
        aVar.f9972a.setText(pcpVar.f());
        aVar.f9974c.setText(pcpVar.c().trim());
        if (qrs.ac()) {
            qrs.a(aVar.f9974c);
        }
        e(aVar.d, pcpVar.getPriceTagBeanList());
        a(aVar.f9974c);
        if (pcpVar.b() != 0) {
            e(aVar.e, pcpVar.b());
        } else {
            qqf.b(pcpVar.a(), aVar.e, qqf.d);
        }
        e(aVar, pcpVar);
    }

    private void e(ImageView imageView, List<PriceTagBean> list) {
        if (imageView == null) {
            return;
        }
        if (njy.b(list) && !TextUtils.isEmpty(pea.e(list))) {
            imageView.setVisibility(0);
            qqf.b(pea.e(list), imageView, 0.0f, qqf.d, 0.0f, 0.0f);
        } else {
            imageView.setVisibility(8);
        }
    }

    private void e(a aVar, final pcp pcpVar) {
        aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.PlanInfoAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == null) {
                    return;
                }
                if (qrs.r()) {
                    LogUtil.j("Suggestion_PlanInfoAdapter", "mBackgroundPicture click too fast.");
                    return;
                }
                LogUtil.a("Suggestion_PlanInfoAdapter", "info.getCommodityFlag()", Integer.valueOf(pcpVar.getCommodityFlag()));
                if (!CommonUtil.ab(PlanInfoAdapter.this.f9963a)) {
                    Toast.makeText(PlanInfoAdapter.this.f9963a, R.string.sug_haveno_network, 0).show();
                    return;
                }
                if (pcpVar.getCommodityFlag() != 2 && !FitnessExternalUtils.c()) {
                    PlanInfoAdapter.this.b(pcpVar);
                } else if (pcpVar.getCommodityFlag() != 2 || FitnessExternalUtils.c()) {
                    PlanInfoAdapter.this.a();
                } else {
                    PlanInfoAdapter.this.c(pcpVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final pcp pcpVar) {
        ResourceJudgeUtil.c(5, String.valueOf(pcpVar.e()), 3, (JudgeCallback<Integer>) new JudgeCallback() { // from class: iay
            @Override // com.huawei.health.suggestion.callback.JudgeCallback
            public final void onJudgeCallback(Object obj) {
                this.f37421a.b(pcpVar, (Integer) obj);
            }
        });
    }

    public /* synthetic */ void b(pcp pcpVar, Integer num) {
        if (num.intValue() == 3 || num.intValue() == 2) {
            d();
        } else {
            b(pcpVar);
        }
    }

    private void d() {
        JumpUtil.c(IntPlan.PlanType.AI_RUN_PLAN.getType(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.e("Suggestion_PlanInfoAdapter", "bindRunPlanInfo, getCurrentPlan : planApi is null.");
        } else {
            planApi.setPlanType(0);
            planApi.checkAllowCreateOldPlan(new UiCallback<Boolean>() { // from class: com.huawei.health.suggestion.ui.run.adapter.PlanInfoAdapter.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("Suggestion_PlanInfoAdapter", "checkAllowCreateOldPlan()  failed errorCode=", Integer.valueOf(i));
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Boolean bool) {
                    if (bool != null) {
                        PlanInfoAdapter.this.i();
                    } else {
                        ReleaseLogUtil.a("Suggestion_PlanInfoAdapter", "checkAllowCreateOldPlan() onSuccess plan is null");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final pcp pcpVar) {
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null || pcpVar == null) {
            LogUtil.e("Suggestion_PlanInfoAdapter", "bindRunPlanInfo, getCurrentPlan : planApi is null.");
            return;
        }
        ReleaseLogUtil.d("Suggestion_PlanInfoAdapter", "createIntelligentPlan runpaln Name:", pcpVar.f());
        IntPlan currentIntPlan = planApi.getCurrentIntPlan();
        boolean z = currentIntPlan != null;
        if (z || !btw.i()) {
            a(pcpVar, z, z ? currentIntPlan.getPlanTempId() : "");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: iav
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37420a.a(planApi, pcpVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.run.adapter.PlanInfoAdapter$6, reason: invalid class name */
    public class AnonymousClass6 extends UiCallback<qey> {
        final /* synthetic */ pcp e;

        AnonymousClass6(pcp pcpVar) {
            this.e = pcpVar;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.e("Suggestion_PlanInfoAdapter", "errorCode:", Integer.valueOf(i), " errorInfo:", str);
            HandlerExecutor.b(new Runnable() { // from class: ibd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37428b.c();
                }
            });
        }

        public /* synthetic */ void c() {
            qpx.e(PlanInfoAdapter.this.f9963a, qre.f(R.string.sug_haveno_network));
        }

        public /* synthetic */ void a(pcp pcpVar, qey qeyVar) {
            PlanInfoAdapter.this.d(pcpVar, qeyVar, "");
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final qey qeyVar) {
            final pcp pcpVar = this.e;
            HandlerExecutor.b(new Runnable() { // from class: iba
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37425b.a(pcpVar, qeyVar);
                }
            });
        }
    }

    public /* synthetic */ void a(PlanApi planApi, pcp pcpVar) {
        planApi.getCurrentPlan(new AnonymousClass6(pcpVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(pcp pcpVar, qey qeyVar, String str) {
        boolean z = btw.f() && qeyVar != null && qeyVar.e() == 0 && qeyVar.k() == 0;
        if (z && qeyVar.o() == 1) {
            btw.e(this.f9963a, qeyVar, new AnonymousClass10(pcpVar, str));
            return;
        }
        if (z) {
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f9963a);
            builder.b(R.string.IDS_sug_has_doing_plan_content);
            builder.c(R.string.IDS_FitnessAdvice_has_doing_plan_ok, new View.OnClickListener() { // from class: iaw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.c(view);
                }
            }).a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: iax
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlanInfoAdapter.d(view);
                }
            });
            builder.c().show();
            return;
        }
        a(pcpVar, qeyVar != null, str);
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.run.adapter.PlanInfoAdapter$10, reason: invalid class name */
    public class AnonymousClass10 extends UiCallback<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pcp f9967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9968b;

        AnonymousClass10(pcp pcpVar, String str) {
            this.f9967a = pcpVar;
            this.f9968b = str;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_PlanInfoAdapter", "errorCode:", Integer.valueOf(i), " errorInfo:", str);
            HandlerExecutor.b(new Runnable() { // from class: ibb
                @Override // java.lang.Runnable
                public final void run() {
                    qpx.e(BaseApplication.b(), qre.f(R.string.sug_haveno_network));
                }
            });
        }

        public /* synthetic */ void c(pcp pcpVar, String str) {
            PlanInfoAdapter.this.a(pcpVar, false, str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(Object obj) {
            final pcp pcpVar = this.f9967a;
            final String str = this.f9968b;
            HandlerExecutor.b(new Runnable() { // from class: iaz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37424c.c(pcpVar, str);
                }
            });
        }
    }

    public /* synthetic */ void c(View view) {
        JumpUtil.a(this.f9963a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(pcp pcpVar, boolean z, String str) {
        if (z) {
            boolean z2 = (Utils.o() || pcpVar.h() == null || !njy.b(pcpVar.h().acquireIntroductionImgs())) ? false : true;
            if (TextUtils.equals(str, String.valueOf(pcpVar.e()))) {
                JumpUtil.a(this.f9963a);
                return;
            } else {
                if (z2) {
                    JumpUtil.b(this.f9963a, String.valueOf(pcpVar.e()), IntPlan.PlanType.AI_RUN_PLAN.getType());
                    return;
                }
                JumpUtil.a(pcpVar, String.valueOf(pcpVar.e()), this.f9963a, true);
                return;
            }
        }
        d(pcpVar);
    }

    private void d(pcp pcpVar) {
        LogUtil.d("Suggestion_PlanInfoAdapter", "isShowPrivacyTipsDialog enter");
        if (!Utils.o()) {
            e(pcpVar);
        } else {
            JumpUtil.d(pcpVar, this.f9963a);
        }
    }

    private void e(pcp pcpVar) {
        HashMap map = new HashMap(5);
        map.put("click", 1);
        map.put("type", 2);
        map.put("planType", 0);
        map.put("planName", pcpVar.f());
        map.put("enter", "0");
        idy.b(AnalyticsValue.HEALTH_HOME_TRAINING_PROGRAM_PIC_2010036.value(), map);
        Intent intent = new Intent(this.f9963a, (Class<?>) RunPlanCreateActivity.class);
        intent.putExtra("runPlanTitle", pcpVar.f());
        intent.putExtra("runPlanType", pcpVar.e());
        intent.setFlags(268435456);
        d(intent);
    }

    private void d(Intent intent) {
        if (intent == null) {
            LogUtil.j("Suggestion_PlanInfoAdapter", "startActivity intent is null.");
            return;
        }
        try {
            this.f9963a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Suggestion_PlanInfoAdapter", "startActivity ActivityNotFoundException.");
        }
    }

    private void e(ImageView imageView, int i) {
        if (!LanguageUtil.ba(this.f9963a)) {
            qqf.a(imageView, i, qqf.d, 0, 0);
        } else {
            qqf.e(qqz.e(this.f9963a, i), imageView, qqf.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.d;
        if (noTitleCustomAlertDialog == null) {
            LogUtil.j("Suggestion_PlanInfoAdapter", "showTipsDialog() mCheckAllowCreateOldPlanDialog is null");
        } else {
            noTitleCustomAlertDialog.show();
        }
    }

    private void b(a aVar, final FitnessPackageInfo fitnessPackageInfo) {
        if (aVar == null || fitnessPackageInfo == null) {
            return;
        }
        aVar.f9973b.setBackgroundColor(this.f9963a.getResources().getColor(com.huawei.ui.commonui.R.color.common_ui_custom_dialog_transparent_bg));
        qqf.b(aVar.e, fitnessPackageInfo.acquirePicture(), qqf.d, 0, com.huawei.ui.commonui.R.color.common_ui_custom_dialog_transparent_bg);
        e(aVar.d, fitnessPackageInfo.getPriceTagBeanList());
        aVar.f9972a.setText(fitnessPackageInfo.acquireName());
        aVar.f9974c.setText(fitnessPackageInfo.acquireDescription());
        aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.adapter.PlanInfoAdapter.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PlanInfoAdapter.this.e(fitnessPackageInfo);
                HashMap map = new HashMap(5);
                map.put("click", 1);
                map.put("type", 2);
                map.put("planType", 1);
                map.put("planName", fitnessPackageInfo.acquireName());
                map.put("enter", "1");
                idy.b(AnalyticsValue.HEALTH_HOME_TRAINING_PROGRAM_PIC_2010036.value(), map);
                if (PlanInfoAdapter.this.c()) {
                    map.clear();
                    map.put("click", 1);
                    idy.b(AnalyticsValue.HEALTH_WEIGHT_TRAINING_PROGRAM_PIC_2030053.value(), map);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(FitnessPackageInfo fitnessPackageInfo) {
        JumpUtil.d(fitnessPackageInfo, fitnessPackageInfo.acquirePlanTempId(), this.f9963a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = this.h;
        if (i == 3) {
            return this.e.size();
        }
        if (i == 0) {
            return this.g.size();
        }
        if (njy.e(this.f9964b)) {
            return 0;
        }
        return this.f9964b.size();
    }

    public boolean c() {
        return this.f9965c;
    }
}
