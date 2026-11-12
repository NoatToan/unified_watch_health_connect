package com.huawei.health.suggestion.ui.run.holder;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.module.SugChart;
import com.huawei.hidatamanager.util.LogUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gzw;
import defpackage.gzx;
import defpackage.hmc;
import defpackage.ieg;
import defpackage.njy;
import defpackage.ped;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class ReportChartHolder extends BaseReportHolder<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HealthTextView f10010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HealthTextView f10011b;
    private final SugChart e;

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f10014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10016c;
        int d;
        int e;
        boolean f;
        int[] g;
        Calendar h;
        int[] i;
        int j;
        float k;
        int l;
        Date m;
        int n;
        float o;
        List<hmc> p;
        CharSequence t;
    }

    public ReportChartHolder(View view) {
        super(view);
        this.f10011b = (HealthTextView) view.findViewById(R.id.sug_tv_title);
        this.f10010a = (HealthTextView) view.findViewById(R.id.sug_tv_sub_title);
        this.e = (SugChart) view.findViewById(R.id.sug_chart);
    }

    @Override // com.huawei.health.suggestion.ui.run.holder.BaseReportHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void bindDataToView(e eVar) {
        if (eVar == null) {
            LogUtil.j("Suggestion_ReportChartHolder", "data == null");
            return;
        }
        this.f10011b.setVisibility(eVar.f ? 0 : 8);
        this.f10010a.setText(eVar.t);
        this.e.b(eVar.f10015b);
        this.e.f(eVar.l);
        this.e.e(eVar.f10014a);
        this.e.g(eVar.n);
        this.e.e(eVar.j);
        this.e.c(eVar.d);
        this.e.a(eVar.e);
        this.e.d(eVar.f10016c);
        this.e.c(eVar.g);
        this.e.d(eVar.p);
        this.e.a(eVar.k);
        this.e.c(eVar.o);
        this.e.d(eVar.i);
    }

    public static List<e> c(Context context, Plan plan, List<WorkoutRecord> list) {
        ArrayList arrayList = new ArrayList();
        d(context, arrayList, plan, list);
        if (arrayList.size() != 0) {
            ((e) arrayList.get(0)).f = true;
        }
        return arrayList;
    }

    public static void d(Context context, List<e> list, Plan plan, List<WorkoutRecord> list2) {
        try {
            a aVarC = c(context, plan);
            if (plan.acquireType() == 0) {
                a(context, list, list2, aVarC);
            } else {
                b(context, list, list2, aVarC);
            }
        } catch (ParseException e2) {
            LogUtil.e("Suggestion_ReportChartHolder", LogAnonymous.b(e2));
        }
    }

    private static void a(Context context, List<e> list, List<WorkoutRecord> list2, a aVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        e(context, aVar.f10013c, arrayList, arrayList2);
        b(list, c(context, list2, aVar, arrayList));
        b(list, b(context, list2, aVar, arrayList2));
    }

    private static void b(Context context, List<e> list, List<WorkoutRecord> list2, a aVar) {
        b(list, a(context, list2, aVar));
    }

    private static e c(Context context, List<WorkoutRecord> list, a aVar, List<hmc> list2) {
        e eVar = new e();
        eVar.t = context.getString(R.string.sug_distance);
        eVar.f10015b = 1;
        eVar.j = 30;
        eVar.l = context.getResources().getColor(R.color.sug_report_dis_50dgreen);
        eVar.d = context.getResources().getColor(com.huawei.ui.commonui.R.color.textColorSecondary);
        eVar.f10016c = context.getResources().getColor(com.huawei.ui.commonui.R.color.textColorTertiary);
        eVar.n = context.getResources().getColor(R.color.sug_report_dis_dgreen);
        eVar.e = context.getResources().getColor(com.huawei.ui.commonui.R.color.textColorTertiary);
        eVar.f10014a = (int) context.getResources().getDimension(R.dimen.sug_chart_textsize);
        eVar.g = new int[]{context.getResources().getColor(R.color.sug_report_dis_dgreen), context.getResources().getColor(R.color.sug_report_dis_green)};
        e eVar2 = new e();
        eVar2.m = aVar.e;
        eVar2.h = null;
        List<hmc> listC = c(context, list2, list, eVar2, 0);
        a(context, listC);
        eVar.p = listC;
        return eVar;
    }

    private static e b(Context context, List<WorkoutRecord> list, a aVar, List<hmc> list2) {
        e eVar = new e();
        eVar.m = aVar.e;
        eVar.h = null;
        List<hmc> listC = c(context, list2, list, eVar, 2);
        if (!a(listC)) {
            return null;
        }
        a(context, listC);
        SpannableString spannableStringC = gzx.c(context, context.getString(R.string.sug_report_vo2max), context.getString(R.string.sug_report_vo), R.style.sug_report_vo2, R.style.sug_report_normal);
        e eVar2 = new e();
        eVar2.t = spannableStringC;
        eVar2.f10015b = 2;
        eVar2.j = 30;
        eVar2.k = (int) context.getResources().getDimension(R.dimen.sug_event_linewidth);
        eVar2.o = (int) context.getResources().getDimension(R.dimen.sug_event_line_pointradio);
        eVar2.d = context.getResources().getColor(com.huawei.ui.commonui.R.color.textColorSecondary);
        eVar2.f10016c = context.getResources().getColor(com.huawei.ui.commonui.R.color.textColorSecondary);
        eVar2.n = context.getResources().getColor(R.color.sug_report_vo_sgreen);
        eVar2.e = context.getResources().getColor(com.huawei.ui.commonui.R.color.textColorTertiary);
        eVar2.g = new int[]{context.getResources().getColor(R.color.sug_report_vo_shader1), context.getResources().getColor(R.color.sug_report_vo_shader2)};
        eVar2.i = new int[]{context.getResources().getColor(R.color.sug_report_vo_sgreen), context.getResources().getColor(R.color.sug_report_vo_tgreen)};
        eVar2.p = listC;
        return eVar2;
    }

    private static e a(Context context, List<WorkoutRecord> list, a aVar) {
        e eVar = new e();
        eVar.t = context.getString(R.string.IDS_track_total_calorie);
        eVar.j = 30;
        eVar.l = context.getResources().getColor(R.color.sug_event_50dorign);
        eVar.d = context.getResources().getColor(com.huawei.ui.commonui.R.color.textColorSecondary);
        eVar.f10015b = 1;
        eVar.f10016c = context.getResources().getColor(com.huawei.ui.commonui.R.color.textColorTertiary);
        eVar.n = context.getResources().getColor(R.color.sug_event_selebg1);
        eVar.e = context.getResources().getColor(com.huawei.ui.commonui.R.color.textColorTertiary);
        eVar.f10014a = (int) context.getResources().getDimension(R.dimen.sug_chart_textsize);
        eVar.g = new int[]{context.getResources().getColor(R.color.sug_event_dorign), context.getResources().getColor(R.color.sug_event_qorign)};
        ArrayList arrayList = new ArrayList();
        e(aVar.e, aVar.f10012a, aVar.d, aVar.f10013c, arrayList);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(aVar.e);
        e eVar2 = new e();
        eVar2.m = aVar.e;
        eVar2.h = calendar;
        eVar.p = c(context, arrayList, list, eVar2, 1);
        return eVar;
    }

    private static a c(Context context, Plan plan) throws ParseException {
        a aVar = new a();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (!TextUtils.isEmpty(plan.acquireStartDate()) && !TextUtils.isEmpty(plan.getEndDate())) {
            aVar.e = simpleDateFormat.parse(plan.acquireStartDate());
            aVar.f10012a = simpleDateFormat.parse(plan.getEndDate());
            aVar.f10013c = ieg.e(aVar.e, aVar.f10012a);
            aVar.d = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), context.getString(R.string.sug_timeformart_mmmd)));
            return aVar;
        }
        LogUtil.j("Suggestion_ReportChartHolder", "plan date is null");
        return aVar;
    }

    private static void b(List<e> list, e eVar) {
        if (eVar != null) {
            list.add(eVar);
        }
    }

    private static boolean a(List<hmc> list) {
        for (hmc hmcVar : list) {
            if (hmcVar == null) {
                LogUtil.j("Suggestion_ReportChartHolder", "sugExcel == null");
            } else if (hmcVar.w() > 0.0f) {
                return true;
            }
        }
        return false;
    }

    private static void a(Context context, List<hmc> list) {
        if (LanguageUtil.ba(context)) {
            Collections.reverse(list);
        }
    }

    private static void e(Date date, Date date2, SimpleDateFormat simpleDateFormat, int i, List<hmc> list) {
        hmc hmcVar;
        for (int i2 = 0; i2 < i + 1; i2++) {
            if (i2 == 0) {
                hmcVar = new hmc(0.0f, simpleDateFormat.format(date), i2);
            } else if (i2 == i) {
                hmcVar = new hmc(0.0f, simpleDateFormat.format(date2), i2);
            } else {
                hmcVar = new hmc(0.0f, "", i2);
            }
            list.add(hmcVar);
        }
    }

    private static void e(Context context, int i, List<hmc> list, List<hmc> list2) {
        hmc hmcVar;
        hmc hmcVar2;
        int i2 = (i + 1) / 7;
        if (i2 <= 8) {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                String strC = gzx.c(context, R.string.sug_unit_week, UnitUtil.e(i4, 1, 0));
                hmc hmcVar3 = new hmc(0.0f, strC, i3);
                list2.add(new hmc(0.0f, strC, i3));
                list.add(hmcVar3);
                i3 = i4;
            }
            return;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 == 0 || i5 == 9 || i5 == 19) {
                String strC2 = gzx.c(context, R.string.sug_unit_week, UnitUtil.e(i5 + 1, 1, 0));
                hmc hmcVar4 = new hmc(0.0f, strC2, i5);
                hmcVar = new hmc(0.0f, strC2, i5);
                hmcVar2 = hmcVar4;
            } else {
                hmcVar2 = new hmc(0.0f, "", i5);
                hmcVar = new hmc(0.0f, "", i5);
            }
            list2.add(hmcVar);
            list.add(hmcVar2);
        }
    }

    private static List<hmc> c(Context context, List<hmc> list, List<WorkoutRecord> list2, e eVar, int i) {
        if (njy.e(list2)) {
            LogUtils.w("Suggestion_ReportChartHolder", "recordList is empty");
            return list;
        }
        for (WorkoutRecord workoutRecord : list2) {
            if (workoutRecord != null) {
                int iE = e(eVar.m, eVar.h, workoutRecord);
                if (b(list, iE)) {
                    c(context, list, i, workoutRecord, iE);
                }
            }
        }
        return list;
    }

    private static boolean b(List<hmc> list, int i) {
        return i >= 0 && i < list.size();
    }

    private static void c(Context context, List<hmc> list, int i, WorkoutRecord workoutRecord, int i2) {
        if (njy.e(list, i2)) {
            return;
        }
        hmc hmcVar = list.get(i2);
        if (i == 0) {
            hmcVar.c(3);
            hmcVar.f(hmcVar.i() + workoutRecord.acquireDistance());
            try {
                hmcVar.a(hmcVar.n() + Float.parseFloat(ped.e(workoutRecord.acquireActualDistance())));
            } catch (NumberFormatException e2) {
                LogUtil.e("Suggestion_ReportChartHolder", "recordToExcel NumberFormatException", e2.getMessage());
            }
            hmcVar.b(gzx.d(gzw.a(), (int) hmcVar.n(), UnitUtil.e(ped.h(hmcVar.n()), 1, 2)));
            return;
        }
        if (i == 1) {
            hmcVar.c(1);
            hmcVar.f(hmcVar.i() + workoutRecord.acquireCalorie());
            hmcVar.a(hmcVar.n() + workoutRecord.acquireActualCalorie());
            hmcVar.j(ped.d(hmcVar.n()));
            hmcVar.b(gzx.c(context, com.huawei.health.basefitnessadvice.R.string.sug_chart_kcal, UnitUtil.e(Math.round(hmcVar.n() / 1000.0f), 1, 0)));
            return;
        }
        if (i == 2) {
            float fB = b((int) workoutRecord.acquireOxygen());
            if (hmcVar.w() > fB) {
                fB = hmcVar.w();
            }
            hmcVar.j(fB);
            hmcVar.c(3);
        }
    }

    private static int b(int i) {
        return ((float) i) > 18724.572f ? a(i) : i;
    }

    private static int e(Date date, Calendar calendar, WorkoutRecord workoutRecord) {
        try {
            if (calendar == null) {
                return ieg.e(date, new SimpleDateFormat("yyyy-MM-dd").parse(workoutRecord.acquireWorkoutDate())) / 7;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(workoutRecord.acquireWorkoutDate()));
            return calendar2.get(6) - calendar.get(6);
        } catch (ParseException unused) {
            LogUtil.e("Suggestion_ReportChartHolder", "refreshExcels");
            return 0;
        }
    }

    private static int a(double d) {
        return ((int) (d * 3.5d)) / 65536;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Date f10012a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10013c;
        SimpleDateFormat d;
        Date e;

        private a() {
        }
    }
}
