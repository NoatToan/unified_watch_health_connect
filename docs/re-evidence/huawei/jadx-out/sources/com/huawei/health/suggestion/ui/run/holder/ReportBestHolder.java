package com.huawei.health.suggestion.ui.run.holder;

import android.content.Context;
import android.view.View;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.health.plan.model.PlanStat;
import com.huawei.health.suggestion.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gzw;
import defpackage.gzx;
import defpackage.ieg;
import defpackage.ift;
import defpackage.ped;
import defpackage.pei;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ReportBestHolder extends BaseReportHolder<d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HealthTextView f10008c;
    private final HealthTextView d;
    private final View e;

    public ReportBestHolder(View view) {
        super(view);
        this.d = (HealthTextView) view.findViewById(R.id.sug_tv_name);
        this.f10008c = (HealthTextView) view.findViewById(R.id.sug_tv_value);
        this.e = view.findViewById(R.id.sug_divider);
    }

    @Override // com.huawei.health.suggestion.ui.run.holder.BaseReportHolder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void bindDataToView(d dVar) {
        this.d.setText(dVar.f10009b);
        this.f10008c.setText(dVar.e);
        this.e.setVisibility(dVar.d ? 8 : 0);
    }

    public static List<d> a(Context context, Plan plan, PlanStat planStat) {
        ArrayList arrayList = new ArrayList(10);
        if (plan.acquireType() == 0) {
            e(context, planStat, arrayList);
        } else {
            d(context, planStat, arrayList);
        }
        if (arrayList.size() != 0) {
            ((d) arrayList.get(arrayList.size() - 1)).d = true;
        }
        return arrayList;
    }

    private static void e(Context context, PlanStat planStat, List<d> list) {
        list.add(new d(R.string.sug_report_tfr, b(planStat)));
        list.add(new d(R.string.sug_report_tlr, d(planStat)));
        e(R.string.sug_report_1br, planStat.getBestRecordForOneKm(), list);
        e(R.string.sug_report_5br, planStat.getBestRecordForFiveKm(), list);
        e(R.string.sug_report_10br, planStat.getBestRecordForTenKm(), list);
        e(R.string.sug_report_hmbr, planStat.getBestRecordForHalfMarathon(), list);
        e(R.string.sug_report_mbr, planStat.getBestRecordForMarathon(), list);
    }

    private static void d(Context context, PlanStat planStat, List<d> list) {
        list.add(new d(R.string.sug_fitness_ltpw, d(context, planStat)));
        list.add(new d(R.string.sug_fitness_mcbrpw, a(context, planStat)));
        list.add(new d(R.string.sug_fitness_hcr, c(planStat)));
    }

    private static String b(PlanStat planStat) {
        float farthestRunning = planStat.getFarthestRunning();
        return gzx.d(gzw.a(), (int) farthestRunning, ped.e(ped.h(farthestRunning)));
    }

    private static String d(PlanStat planStat) {
        return ieg.d(new Date(ift.h(planStat.getLongestRunning())), Constants.TIME_FORMAT_WITHOUT_MILLS);
    }

    private static String d(int i) {
        return ieg.d(new Date(ift.h(i)), Constants.TIME_FORMAT_WITHOUT_MILLS);
    }

    private static void e(int i, int i2, List<d> list) {
        if (i2 != 0) {
            list.add(new d(i, d(i2)));
        }
    }

    private static String d(Context context, PlanStat planStat) {
        return pei.c(context, com.huawei.health.basefitnessadvice.R.string.sug_fitness_min, ped.i(planStat.getLongestTimePerWeek()));
    }

    private static String a(Context context, PlanStat planStat) {
        return pei.c(context, com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, ped.e(planStat.getMostCaloriePerWeek()));
    }

    private static String c(PlanStat planStat) {
        return UnitUtil.e(planStat.getHighestCompleteRate(), 2, 1);
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10009b;
        boolean d;
        String e;

        public d(int i, String str) {
            this.f10009b = i;
            this.e = str;
        }
    }
}
