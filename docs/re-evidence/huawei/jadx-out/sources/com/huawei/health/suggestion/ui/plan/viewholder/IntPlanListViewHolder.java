package com.huawei.health.suggestion.ui.plan.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.pluginfitnessadvice.pricetagbean.PriceTagBean;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.hvu;
import defpackage.njy;
import defpackage.pcp;
import defpackage.pea;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class IntPlanListViewHolder extends AbsFitnessViewHolder<Object> implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f9759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f9760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f9761c;
    private boolean d;
    private String e;
    private HealthTextView f;
    private HealthSubHeader g;
    private IntPlan.PlanType h;
    private String i;
    private boolean j;
    private HealthTextView n;

    public IntPlanListViewHolder(View view, String str) {
        super(view);
        this.d = false;
        this.j = false;
        this.f9761c = view.getContext();
        ImageView imageView = (ImageView) view.findViewById(R.id.fit_plan_pkg_bg);
        this.f9760b = imageView;
        imageView.setOnClickListener(this);
        this.n = (HealthTextView) view.findViewById(R.id.fit_plan_name);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.fit_plan_description);
        this.f = healthTextView;
        healthTextView.setMaxLines(Integer.MAX_VALUE);
        this.f9759a = (ImageView) view.findViewById(R.id.fit_plan_fitness_corner);
        this.e = str;
        this.g = (HealthSubHeader) view.findViewById(R.id.fit_plan_period);
        if (qrs.ac()) {
            qrs.a(this.n);
            qrs.a(this.f);
        }
        int iB = qrs.af(this.f9761c) ? 0 : qre.b(R.dimen.cardMarginMiddle);
        this.itemView.setPadding(iB, 0, iB, 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IntPlan.PlanType planType;
        if (qrs.r()) {
            LogUtil.j("Suggestion_PlanFitnessViewHolder", "click too fast");
            return;
        }
        if (view.getId() != R.id.fit_plan_pkg_bg || (planType = this.h) == null) {
            return;
        }
        if (planType.equals(IntPlan.PlanType.AI_RUN_PLAN) || this.h.equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: hyl
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f37332c.b(i, obj);
                }
            }, "");
        } else {
            JumpUtil.e(this.h.getType(), this.i, this.e, this.f9761c);
        }
    }

    public /* synthetic */ void b(int i, Object obj) {
        if (i == 0) {
            JumpUtil.e(this.h.getType(), this.i, this.e, this.f9761c);
        } else {
            LogUtil.a("Suggestion_PlanFitnessViewHolder", "LoginInit is not success", Integer.valueOf(i));
        }
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    public void init(Object obj) {
        String strA;
        List<PriceTagBean> priceTagBeanList;
        if (obj == null) {
            return;
        }
        if (obj instanceof pcp) {
            pcp pcpVar = (pcp) obj;
            this.n.setText(pcpVar.f());
            this.f.setText(pcpVar.c().trim());
            if (qrs.ac()) {
                qrs.a(this.f);
            }
            this.h = IntPlan.PlanType.getPlanType(IntPlan.PlanType.AI_RUN_PLAN.getType());
            this.i = String.valueOf(pcpVar.e());
            strA = pcpVar.a();
            priceTagBeanList = pcpVar.getPriceTagBeanList();
            LogUtil.a("Suggestion_PlanFitnessViewHolder", "mPlanTempId = ", this.i);
            e();
        } else if (obj instanceof FitnessPackageInfo) {
            FitnessPackageInfo fitnessPackageInfo = (FitnessPackageInfo) obj;
            this.n.setText(fitnessPackageInfo.acquireName());
            this.f.setText(fitnessPackageInfo.acquireDescription());
            this.h = IntPlan.PlanType.getPlanType(fitnessPackageInfo.getPlanType());
            this.i = fitnessPackageInfo.acquirePlanTempId();
            List<PriceTagBean> priceTagBeanList2 = fitnessPackageInfo.getPriceTagBeanList();
            String strAcquirePicture = fitnessPackageInfo.acquirePicture();
            a();
            strA = strAcquirePicture;
            priceTagBeanList = priceTagBeanList2;
        } else {
            LogUtil.j("Suggestion_PlanFitnessViewHolder", "invalid data.");
            return;
        }
        qqf.b(this.f9760b, strA, qqf.d, 0, com.huawei.ui.commonui.R.color.common_ui_custom_dialog_transparent_bg);
        if (njy.b(priceTagBeanList)) {
            this.f9759a.setVisibility(0);
            qqf.b(pea.e(priceTagBeanList), this.f9759a, 0.0f, qqf.d, 0.0f, 0.0f);
        } else {
            this.f9759a.setVisibility(8);
        }
    }

    private void a() {
        HealthSubHeader healthSubHeader = this.g;
        if (healthSubHeader == null) {
            LogUtil.j("Suggestion_PlanFitnessViewHolder", "setFitnessPlanSubHeader mPlanPeriod is null.");
            return;
        }
        healthSubHeader.setVisibility(0);
        this.g.setSubHeaderBackgroundColor(ContextCompat.getColor(this.itemView.getContext(), com.huawei.health.servicesui.R.color.common_transparent));
        if (!hvu.d()) {
            this.g.setHeadTitleText(this.f9761c.getString(R.string.IDS_plan_reduction));
            b();
        } else {
            this.g.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    private void e() {
        HealthSubHeader healthSubHeader = this.g;
        if (healthSubHeader == null) {
            LogUtil.j("Suggestion_PlanFitnessViewHolder", "setHealthSubHeaderStyle mPlanPeriod is null.");
            return;
        }
        byte b2 = 0;
        healthSubHeader.setVisibility(0);
        this.g.setSubHeaderBackgroundColor(ContextCompat.getColor(this.itemView.getContext(), com.huawei.health.servicesui.R.color.common_transparent));
        int i = 8;
        if (!hvu.d()) {
            b();
            if (this.d) {
                this.g.setVisibility(0);
                this.g.setHeadTitleText(this.f9761c.getString(R.string.IDS_plan_intelligence_running));
                return;
            }
            HealthSubHeader healthSubHeader2 = this.g;
            if (qrs.af(this.f9761c) && this.j) {
                i = 4;
            }
            healthSubHeader2.setVisibility(i);
            return;
        }
        String str = this.i;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 51) {
            if (iHashCode != 1568) {
                if (iHashCode == 1569 && str.equals("12")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("11")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (!str.equals("3")) {
            b2 = -1;
        }
        if (b2 == 0) {
            this.g.setHeadTitleText(this.f9761c.getString(R.string.IDS_run_plan_period_improve));
            return;
        }
        if (b2 == 1) {
            this.g.setHeadTitleText(this.f9761c.getString(R.string.IDS_run_plan_period_begin));
            return;
        }
        if (b2 == 2) {
            this.g.setHeadTitleText(this.f9761c.getString(R.string.IDS_run_plan_period_stay));
        } else if (qrs.af(this.f9761c)) {
            this.g.setVisibility(4);
        } else {
            this.g.setVisibility(8);
        }
    }

    private void b() {
        if (this.g.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams.leftMargin = this.f9761c.getResources().getDimensionPixelSize(R.dimen.health_common_min_12dp);
            layoutParams.rightMargin = this.f9761c.getResources().getDimensionPixelSize(R.dimen.health_common_min_12dp);
            layoutParams.topMargin = this.f9761c.getResources().getDimensionPixelSize(R.dimen.health_common_min_12dp);
            this.g.setLayoutParams(layoutParams);
        }
    }

    public void b(boolean z) {
        this.d = z;
    }

    public void d(boolean z) {
        this.j = z;
    }
}
