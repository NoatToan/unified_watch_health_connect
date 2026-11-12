package com.huawei.health.suggestion.ui.run.holder;

import android.content.Context;
import android.view.View;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.health.plan.model.PlanStat;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gzw;
import defpackage.gzx;
import defpackage.ibl;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ReportFootHolder extends BaseReportHolder<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTextAlertDialog f10017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthTextView f10018b;
    private final HealthTextView d;

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CharSequence f10020a;
        CharSequence e;
    }

    public ReportFootHolder(View view) {
        super(view);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.sug_tv_improved);
        this.d = healthTextView;
        this.f10018b = (HealthTextView) view.findViewById(R.id.sug_tv_recommended);
        b(view.getContext());
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.holder.ReportFootHolder.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ReportFootHolder.this.f10017a.show();
            }
        });
    }

    @Override // com.huawei.health.suggestion.ui.run.holder.BaseReportHolder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void bindDataToView(c cVar) {
        if (cVar.f10020a == null) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            this.d.setText(cVar.f10020a);
        }
        this.f10018b.setText(cVar.e);
    }

    public static c b(Context context, Plan plan, PlanStat planStat, PlanRecord planRecord) {
        if (context == null) {
            LogUtil.j("Suggestion_ReportFootHolder", "context == null");
            return null;
        }
        c cVar = new c();
        cVar.f10020a = b(context, plan, planStat);
        cVar.e = d(context, plan, planRecord);
        return cVar;
    }

    private static CharSequence d(Context context, Plan plan, PlanRecord planRecord) {
        int iC;
        List<String> listB;
        if (context == null || plan == null || planRecord == null) {
            LogUtil.j("Suggestion_ReportFootHolder", "context == null || plan == null || planRecord == null");
            return null;
        }
        if (plan.acquireType() == 0) {
            iC = ibl.a(plan.acquireGoal());
            listB = ibl.d(context);
        } else {
            iC = ibl.c(plan.acquireType(), plan.getDifficulty());
            listB = ibl.b(context);
        }
        if (ibl.d(planRecord.acquireFinishRate()) >= 4) {
            iC++;
        }
        String str = listB.get(Math.min(listB.size() - 1, Math.max(0, iC)));
        return gzx.c(context, str, gzx.c(context.getApplicationContext(), R.string.sug_next_plan_recommend, str), R.style.sug_report_smasize, R.style.sug_report_bigsize);
    }

    private static CharSequence b(Context context, Plan plan, PlanStat planStat) {
        if (context == null || plan == null || planStat == null) {
            LogUtil.j("Suggestion_ReportFootHolder", "context == null || plan == null || planStat == null");
            return null;
        }
        if (plan.acquireType() != 0) {
            return null;
        }
        int iA = a(planStat);
        LogUtil.a("Suggestion_ReportFootHolder", "improved:", String.valueOf(iA));
        if (iA <= 0) {
            return null;
        }
        return gzx.e(context, gzx.c(context, "\\d+%", gzx.c(context, R.string.sug_run_achievement_info2, UnitUtil.e(iA, 1, 0), gzx.d(gzw.a(), 1, UnitUtil.e(1.0d, 1, 0))) + Constants.LINK, R.style.sug_report_key, R.style.sug_report_smasize), Constants.LINK, R.drawable.sug_ic_help_gray);
    }

    private static int a(PlanStat planStat) {
        if (planStat == null) {
            return 0;
        }
        float bestRecordForFirstOneKm = planStat.getBestRecordForFirstOneKm();
        float bestRecordForOneKm = planStat.getBestRecordForOneKm();
        if (bestRecordForFirstOneKm > 1.0E-4f) {
            return (int) (100.0f - ((bestRecordForOneKm * 100.0f) / bestRecordForFirstOneKm));
        }
        return 0;
    }

    private void b(Context context) {
        String strD = gzx.d(gzw.a(), 1, UnitUtil.e(1.0d, 1, 0));
        this.f10017a = new CustomTextAlertDialog.Builder(context).a(R.string.sug_run_achievement_dialog_reminder).a(gzx.c(context, R.string.sug_run_achievement_dialog_info2, strD, strD, strD)).a(R.string.IDS_plugin_fitnessadvice_ok, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.run.holder.ReportFootHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).b();
    }
}
