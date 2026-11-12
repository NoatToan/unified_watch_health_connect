package com.huawei.health.suggestion.ui.run.holder;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gzw;
import defpackage.gzx;
import defpackage.hcu;
import defpackage.ibl;
import defpackage.ieg;
import defpackage.ped;
import defpackage.qqf;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class ReportHeaderHolder extends BaseReportHolder<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthTextView f10021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthTextView f10022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RatingBar f10023c;
    private final HealthTextView d;
    private final ImageView e;
    private final HealthTextView f;
    private final HealthTextView g;
    private final HealthTextView i;
    private final HealthTextView j;

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CharSequence f10024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f10025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f10026c;
        CharSequence d;
        CharSequence e;
        Uri f;
        CharSequence g;
        CharSequence h;
        int i;
    }

    public ReportHeaderHolder(View view) {
        super(view);
        this.e = (ImageView) view.findViewById(R.id.sug_iv_user_pic);
        this.f10023c = (RatingBar) view.findViewById(R.id.sug_coach_rating);
        this.g = (HealthTextView) view.findViewById(R.id.sug_train_times);
        this.f = (HealthTextView) view.findViewById(R.id.sug_tv_his_name1);
        this.i = (HealthTextView) view.findViewById(R.id.sug_tv_his_plan_trains);
        this.f10022b = (HealthTextView) view.findViewById(R.id.sug_tv_his_name2);
        this.j = (HealthTextView) view.findViewById(R.id.sug_tv_his_plan_calorie);
        this.d = (HealthTextView) view.findViewById(R.id.sug_tv_his_name3);
        this.f10021a = (HealthTextView) view.findViewById(R.id.sug_tv_his_plan_rate);
    }

    @Override // com.huawei.health.suggestion.ui.run.holder.BaseReportHolder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void bindDataToView(d dVar) {
        if (dVar == null) {
            LogUtil.j("Suggestion_ReportHeaderHolder", "bindDataToView data is null! ");
            return;
        }
        this.f10023c.setRating(dVar.i);
        this.g.setText(dVar.g);
        this.f.setText(dVar.h);
        this.i.setText(dVar.f10025b);
        this.f10022b.setText(dVar.f10026c);
        this.j.setText(dVar.e);
        this.d.setText(dVar.f10024a);
        this.f10021a.setText(dVar.d);
        if (dVar.f != null) {
            qqf.e(dVar.f, this.e);
        } else {
            this.e.setImageResource(com.huawei.ui.commonui.R.mipmap.ic_personal_head);
            LogUtil.j("Suggestion_ReportHeaderHolder", "handleWhenGetUserInfoSuccess()! headImgPath is null! ");
        }
    }

    public static d b(Context context, Plan plan, PlanRecord planRecord) {
        if (context == null || plan == null || planRecord == null) {
            LogUtil.j("Suggestion_ReportHeaderHolder", "context == null || plan == null || planRecord == null");
            return null;
        }
        float fAcquireFinishRate = planRecord.acquireFinishRate();
        float fAcquireActualCalorie = planRecord.acquireActualCalorie();
        float f = CommonUtil.f(ped.e(planRecord.acquireActualDistance()));
        int iAcquireWorkoutDays = planRecord.acquireWorkoutDays();
        d dVar = new d();
        dVar.f = c();
        dVar.i = ibl.d(fAcquireFinishRate);
        dVar.g = c(context, plan);
        dVar.h = context.getString(R.string.sug_myplan_traned);
        dVar.f10025b = gzx.c(context, "\\d", gzx.d(R.plurals.sug_finess_days, iAcquireWorkoutDays, UnitUtil.e(iAcquireWorkoutDays, 1, 0)), R.style.sug_text_myplan_k, R.style.sug_text_myplan_n);
        if (plan.acquireType() == 0) {
            d(context, fAcquireActualCalorie, f, dVar);
            return dVar;
        }
        e(context, fAcquireActualCalorie, fAcquireFinishRate, dVar);
        return dVar;
    }

    private static void d(Context context, float f, float f2, d dVar) {
        dVar.f10026c = context.getString(R.string.sug_distance);
        dVar.e = gzx.c(context, "\\d+.\\d+|\\d+", gzx.d(gzw.a(), (int) f2, ped.f(ped.h(f2))), R.style.sug_text_myplan_k, R.style.sug_text_myplan_n);
        dVar.f10024a = context.getString(R.string.IDS_track_total_calorie);
        dVar.d = gzx.c(context, "\\d+.\\d+|\\d+", gzx.c(context, com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, ped.e(f)), R.style.sug_text_myplan_k, R.style.sug_text_myplan_n);
    }

    private static void e(Context context, float f, float f2, d dVar) {
        dVar.f10026c = context.getString(R.string.IDS_track_total_calorie);
        dVar.e = gzx.c(context, "\\d+.\\d+|\\d+", gzx.c(context, com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, ped.f(f)), R.style.sug_text_myplan_k, R.style.sug_text_myplan_n);
        dVar.f10024a = context.getString(R.string.sug_coach_rate);
        dVar.d = gzx.c(context, "\\d+.\\d+|\\d+", UnitUtil.e(f2, 2, 1), R.style.sug_repirt_big, R.style.sug_report_sma);
    }

    private static Uri c() {
        String strE = hcu.b().e();
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return Uri.parse(strE);
    }

    private static String c(Context context, Plan plan) {
        Date dateB = ieg.b(plan.acquireStartDate(), "yyyy-MM-dd");
        Date dateB2 = ieg.b(plan.getEndDate(), "yyyy-MM-dd");
        String str = dateB != null ? SimpleDateFormat.getDateInstance(3).format(dateB) : "yyyy-MM-dd";
        String str2 = dateB2 != null ? SimpleDateFormat.getDateInstance(3).format(dateB2) : "yyyy-MM-dd";
        if (LanguageUtil.ba(context)) {
            return context.getString(R.string.sug_his_time_formart, str2, str);
        }
        return context.getString(R.string.sug_his_time_formart, str, str2);
    }
}
