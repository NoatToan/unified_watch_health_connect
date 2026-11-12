package com.huawei.health.suggestion.ui;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.suggestion.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.barlist.HealthBarListView;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarView;
import com.huawei.ui.commonui.calendarview.HealthMark;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.gzx;
import defpackage.ift;
import defpackage.njy;
import defpackage.pdq;
import defpackage.pdt;
import defpackage.pdx;
import defpackage.pdz;
import defpackage.ped;
import defpackage.qix;
import defpackage.qjm;
import defpackage.qjp;
import defpackage.qrs;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class RunPlanReportAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UiCallback f9003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private pdx f9005c;
    private Context d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 4;
    }

    public RunPlanReportAdapter(int i, Context context) {
        this.d = context;
        this.f9004b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2 && this.f9004b == 0) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        LogUtil.e("sug_RunPlanReportAdapter", "position is out of index");
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            LogUtil.e("sug_RunPlanReportAdapter", "parent is null");
            return new RecyclerViewHolder(this.d, new View(this.d), i);
        }
        if (i == 0 && this.f9005c.g()) {
            return new RecyclerViewHolder(this.d, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_report_coach_comments_item, viewGroup, false), 0);
        }
        if (1 == i) {
            return new RecyclerViewHolder(this.d, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_report_training_completion_detail_item, viewGroup, false), 1);
        }
        if (2 == i && this.f9004b == 0 && this.f9005c.g()) {
            return new RecyclerViewHolder(this.d, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_report_last_week_summary_item, viewGroup, false), 2);
        }
        if (3 == i && b() && this.f9005c.g()) {
            return new RecyclerViewHolder(this.d, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_report_performance_prediction_item, viewGroup, false), 3);
        }
        return new RecyclerViewHolder(this.d, new View(this.d), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RecyclerViewHolder recyclerViewHolder, int i) {
        if (recyclerViewHolder == null || this.f9005c == null) {
            return;
        }
        if (recyclerViewHolder.w == 0) {
            String strB = this.f9005c.b();
            if (TextUtils.isEmpty(strB) || !this.f9005c.g()) {
                return;
            }
            recyclerViewHolder.f9007a.setText(strB);
            return;
        }
        if (1 == recyclerViewHolder.w) {
            d(recyclerViewHolder);
            return;
        }
        if (2 == recyclerViewHolder.w && this.f9004b == 0 && this.f9005c.g()) {
            a(recyclerViewHolder);
        } else if (3 == recyclerViewHolder.w && this.f9005c.g()) {
            b(recyclerViewHolder);
        } else {
            LogUtil.e("sug_RunPlanReportAdapter", "Holder mType ==", Integer.valueOf(recyclerViewHolder.w));
        }
    }

    private void b(RecyclerViewHolder recyclerViewHolder) {
        if (this.f9005c.h() == 0 || this.f9005c.k() == 0 || this.f9005c.i() == 0) {
            LogUtil.e("sug_RunPlanReportAdapter", "getTargetTime  =", Integer.valueOf(this.f9005c.k()), "before = ", Integer.valueOf(this.f9005c.h()), "current  =", Integer.valueOf(this.f9005c.i()));
            UiCallback uiCallback = this.f9003a;
            if (uiCallback != null) {
                uiCallback.onSuccess("");
                return;
            }
            return;
        }
        f(recyclerViewHolder);
        c(recyclerViewHolder);
        recyclerViewHolder.e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.huawei.health.suggestion.ui.RunPlanReportAdapter.3
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                LogUtil.a("sug_RunPlanReportAdapter", "addOnLayoutChangeListener");
                if (RunPlanReportAdapter.this.f9003a == null || !RunPlanReportAdapter.this.f9005c.t()) {
                    return;
                }
                RunPlanReportAdapter.this.f9003a.onSuccess("");
            }
        });
    }

    private void c(RecyclerViewHolder recyclerViewHolder) {
        LogUtil.a("sug_RunPlanReportAdapter", "getTargetTime  =", Integer.valueOf(this.f9005c.k()), "before = ", Integer.valueOf(this.f9005c.h()), "current  =", Integer.valueOf(this.f9005c.i()));
        recyclerViewHolder.l.setText(e(this.f9005c.k()));
        recyclerViewHolder.k.setText(e(this.f9005c.i()));
        e(recyclerViewHolder);
        if (this.f9005c.k() - this.f9005c.i() >= 0) {
            recyclerViewHolder.e.setText(this.d.getResources().getString(R.string.IDS_sug_plan_comment_three));
        } else {
            recyclerViewHolder.e.setText(this.d.getResources().getString(R.string.IDS_sug_plan_comment_one));
        }
    }

    private void f(RecyclerViewHolder recyclerViewHolder) {
        if (this.f9005c.t()) {
            recyclerViewHolder.h.setRightArrayVisibility(8);
        } else {
            recyclerViewHolder.h.setRightArrayVisibility(0);
        }
        recyclerViewHolder.h.setRightDrawable(R.drawable.ic_health_toolbar_help);
        recyclerViewHolder.h.setSubHeaderBackgroundColor(ContextCompat.getColor(this.d, R.color.common_transparent));
        recyclerViewHolder.h.setMoreTextVisibility(4);
        recyclerViewHolder.h.setMoreViewClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.RunPlanReportAdapter.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RunPlanReportAdapter.this.d(1);
            }
        });
    }

    private void a(RecyclerViewHolder recyclerViewHolder) {
        String[] strArrD = d(this.f9005c.j().d());
        recyclerViewHolder.x.setText(strArrD[0]);
        recyclerViewHolder.y.setText(strArrD[1]);
        String[] strArrA = a(this.f9005c.j().c());
        recyclerViewHolder.aa.setText(strArrA[0]);
        recyclerViewHolder.ac.setText(strArrA[1]);
        recyclerViewHolder.ad.setText(UnitUtil.e(this.f9005c.j().a(), 1, 0));
        recyclerViewHolder.z.setText(BaseApplication.getContext().getResources().getString(R.string.sug_fitness_min, ""));
        recyclerViewHolder.j.setVisibility(8);
        recyclerViewHolder.i.setVisibility(8);
        e(recyclerViewHolder, this.f9005c);
        if (this.f9005c.t()) {
            recyclerViewHolder.i.setVisibility(8);
        }
        recyclerViewHolder.i.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.RunPlanReportAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RunPlanReportAdapter.this.d(0);
            }
        });
        recyclerViewHolder.f.setSubHeaderBackgroundColor(ContextCompat.getColor(this.d, R.color.common_transparent));
    }

    private void d(RecyclerViewHolder recyclerViewHolder) {
        if (this.f9005c.r() == null) {
            LogUtil.e("sug_RunPlanReportAdapter", "mTrainReportBean.getTotalStatisticsData() == null");
            return;
        }
        c(recyclerViewHolder, d(this.f9005c.r().d()));
        List<Integer> listD = this.f9005c.r().d();
        List<Integer> listC = this.f9005c.r().c();
        if (njy.e(listD) || njy.e(listC)) {
            LogUtil.j("sug_RunPlanReportAdapter", "realClockInDayList || targetClockInDayList is null");
            return;
        }
        e(recyclerViewHolder, recyclerViewHolder.g, d(listD), d(listC));
    }

    private List<Integer> d(List<Integer> list) {
        if (this.f9004b == 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (i < this.f9005c.p()) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    private void e(RecyclerViewHolder recyclerViewHolder, HealthBarListView healthBarListView, List<Integer> list, List<Integer> list2) {
        long jD;
        if (list2.size() >= list.size()) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < list2.size()) {
                int iIntValue = njy.c(list, i) ? list.get(i).intValue() : 0;
                int iIntValue2 = list2.get(i).intValue();
                i++;
                arrayList.add(new qix(iIntValue, iIntValue2, this.d.getResources().getString(R.string.IDS_current_total_time, UnitUtil.e(iIntValue, 1, 0), UnitUtil.e(iIntValue2, 1, 0)), this.d.getResources().getQuantityString(R.plurals.IDS_sug_week_index, i, Integer.valueOf(i))));
                i3 += iIntValue2;
                i2 += iIntValue;
            }
            if (this.f9005c.n() > 0) {
                jD = this.f9005c.n() * 1000;
            } else {
                jD = ift.d(this.f9005c.l());
            }
            int iC = ift.c(jD, System.currentTimeMillis());
            healthBarListView.setBarColor(this.d.getResources().getColor(R.color.common_colorAccent));
            healthBarListView.setData(arrayList, iC + 1);
            a(recyclerViewHolder, list2, i2, i3);
        }
    }

    private boolean e(List<Integer> list) {
        pdx pdxVar = this.f9005c;
        if (pdxVar == null || pdxVar.r() == null) {
            LogUtil.e("sug_RunPlanReportAdapter", "isShowCalendar data null");
            return false;
        }
        if (!njy.e(list)) {
            return list.size() <= 4 && njy.b(this.f9005c.m());
        }
        LogUtil.e("sug_RunPlanReportAdapter", "isShowCalendar targetClockInDayList is 0");
        return false;
    }

    private void a(RecyclerViewHolder recyclerViewHolder, List<Integer> list, int i, int i2) {
        String quantityString = this.d.getResources().getQuantityString(R.plurals.IDS_plan_complete_day, i2, UnitUtil.e(i, 1, 0), UnitUtil.e(i2, 1, 0));
        if (e(list)) {
            recyclerViewHolder.f9008b.setVisibility(0);
            recyclerViewHolder.d.setVisibility(0);
            recyclerViewHolder.g.setVisibility(8);
            recyclerViewHolder.f9008b.setText(gzx.c(this.d, R.string.IDS_sug_punch_in_days, quantityString));
            b(recyclerViewHolder, list);
            return;
        }
        recyclerViewHolder.f9008b.setVisibility(8);
        recyclerViewHolder.d.setVisibility(8);
        recyclerViewHolder.g.setVisibility(0);
        recyclerViewHolder.g.setTitle(gzx.c(this.d, R.string.IDS_sug_punch_in_days, quantityString));
    }

    private void c(RecyclerViewHolder recyclerViewHolder, List<Integer> list) {
        float fA = ped.a(this.f9005c.r().j());
        recyclerViewHolder.n.setText(UnitUtil.e(fA, 2, 1));
        recyclerViewHolder.o.setProgress(Math.round(fA));
        if (this.f9005c.g()) {
            String[] strArrA = a(this.f9005c.r().a());
            recyclerViewHolder.t.setText(strArrA[0]);
            recyclerViewHolder.p.setText(strArrA[1]);
            recyclerViewHolder.u.setText(R.string.IDS_fitness_total_run_distance);
        } else {
            recyclerViewHolder.u.setText(R.string.sug_total_days);
            int iB = b(list);
            recyclerViewHolder.t.setText(UnitUtil.e(iB, 1, 0));
            recyclerViewHolder.p.setText(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_user_profile_achieve_day, iB));
        }
        String[] strArrD = d(this.f9005c.r().b());
        recyclerViewHolder.r.setText(strArrD[1]);
        recyclerViewHolder.m.setText(strArrD[0]);
        recyclerViewHolder.s.setText(BaseApplication.getContext().getResources().getString(R.string.sug_fitness_min, ""));
        recyclerViewHolder.q.setText(UnitUtil.e(this.f9005c.r().e(), 1, 0));
    }

    private int b(List<Integer> list) {
        int iIntValue = 0;
        if (njy.b(list)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                iIntValue += it.next().intValue();
            }
        }
        return iIntValue;
    }

    private String e(int i) {
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "Hms")).format(new Date(ift.h(i)));
    }

    private void e(RecyclerViewHolder recyclerViewHolder) {
        pdx pdxVar = this.f9005c;
        if (pdxVar == null) {
            LogUtil.e("sug_RunPlanReportAdapter", "hideForGoalScoreView mTrainReportBean == null");
        } else if (pdxVar.i() == 0) {
            recyclerViewHolder.e.setVisibility(8);
        }
    }

    private void e(RecyclerViewHolder recyclerViewHolder, pdx pdxVar) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(this.d.getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 5));
        arrayList.add(this.d.getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 4));
        arrayList.add(this.d.getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 3));
        arrayList.add(this.d.getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 2));
        arrayList.add(this.d.getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 1));
        List<qjp> listA = a(arrayList, pdxVar);
        pdz pdzVarJ = pdxVar.j();
        List<Integer> listB = pdzVarJ.b();
        final List<Integer> listE = pdzVarJ.e();
        if (njy.e(listB) || njy.e(listE)) {
            LogUtil.e("sug_RunPlanReportAdapter", "initIntensityStatistics realIntensityZone or targetIntensityZone is null");
            return;
        }
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.d, new qjm().b(false).c(true), listA);
        healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: hep
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return this.f36691a.d(listE, qjpVar);
            }
        });
        recyclerViewHolder.j.setAdapter(healthRingChartAdapter);
    }

    public /* synthetic */ String d(List list, qjp qjpVar) {
        return c((List<Integer>) list, qjpVar);
    }

    private String c(List<Integer> list, qjp qjpVar) {
        return this.d.getString(R.string.sug_fitness_min, this.d.getResources().getString(R.string.IDS_current_total_time, UnitUtil.e(qjpVar.f() / 60.0d, 1, 0), UnitUtil.e(0.0d, 1, 0)));
    }

    private List<qjp> a(List<String> list, pdx pdxVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_extreme_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_anaerobic_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_aerobic_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_fatburn_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_warmup_color_end)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_extreme_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_anaerobic_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_aerobic_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_fatburn_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_warmup_color_begin)));
        int size = list.size();
        List<Integer> listB = pdxVar.j().b();
        ArrayList arrayList3 = new ArrayList(size);
        if (njy.e(listB)) {
            LogUtil.e("sug_RunPlanReportAdapter", "realIntensityZone is empty");
            return arrayList3;
        }
        int i = 0;
        while (i < size) {
            arrayList3.add(new qjp(i < list.size() ? list.get(i) : "", njy.c(listB, i) ? listB.get(i).intValue() : 0, i < arrayList.size() ? ((Integer) arrayList.get(i)).intValue() : 0, i < arrayList2.size() ? ((Integer) arrayList2.get(i)).intValue() : 0));
            i++;
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        String string;
        String string2;
        if (i == 0) {
            string = this.d.getResources().getString(R.string.IDS_intensity_statistics_explain);
            string2 = this.d.getResources().getString(R.string.IDS_sug_Intensity_statistics);
        } else if (i == 1) {
            string = this.d.getResources().getString(R.string.IDS_prediction_num_explain);
            string2 = this.d.getResources().getString(R.string.IDS_hwh_health_vo2max_record_forecast);
        } else {
            LogUtil.e("sug_RunPlanReportAdapter", "explainType = ", Integer.valueOf(i));
            string = null;
            string2 = null;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.d).a(string).e(string2).a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.RunPlanReportAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).b();
        if (customTextAlertDialogB.isShowing()) {
            return;
        }
        customTextAlertDialogB.show();
    }

    private String[] a(double d) {
        String string;
        if (UnitUtil.f()) {
            d = UnitUtil.e(d, 3);
        }
        String strE = UnitUtil.e(d, 1, 2);
        if (UnitUtil.f()) {
            string = this.d.getResources().getString(R.string.IDS_hw_show_sport_kms_string_en, "");
        } else {
            string = this.d.getResources().getString(R.string.IDS_hw_show_sport_kms_string, "");
        }
        return new String[]{strE, string};
    }

    private String[] d(float f) {
        String string;
        String strE;
        float fB = ped.b(f);
        if (fB >= 100000.0f) {
            string = BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_ten_thousand_kcal);
            strE = UnitUtil.e(fB / 10000.0f, 1, 2);
        } else {
            string = BaseApplication.getContext().getResources().getString(R.string.sug_chart_kcal, "");
            strE = UnitUtil.e(fB, 1, 0);
        }
        return new String[]{strE, string};
    }

    public void d(pdx pdxVar) {
        this.f9005c = pdxVar;
        if (b()) {
            this.f9005c.d(false);
            notifyItemChanged(3);
        }
    }

    public void c(UiCallback uiCallback) {
        this.f9003a = uiCallback;
        if (b()) {
            this.f9005c.d(true);
            notifyItemChanged(3);
        } else {
            this.f9003a.onSuccess("");
        }
    }

    private boolean b() {
        pdx pdxVar = this.f9005c;
        if (pdxVar != null) {
            return (pdxVar.h() == 0 || this.f9005c.k() == 0 || this.f9005c.i() == 0) ? false : true;
        }
        LogUtil.e("sug_RunPlanReportAdapter", "isValidValue mTrainReportBean == null");
        return false;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthTextView f9007a;
        private HealthTextView aa;
        private HealthTextView ac;
        private HealthTextView ad;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f9008b;
        private HealthCalendarView d;
        private HealthTextView e;
        private HealthSubHeader f;
        private HealthBarListView g;
        private HealthSubHeader h;
        private ImageView i;
        private HealthRingChart j;
        private HealthTextView k;
        private HealthTextView l;
        private HealthTextView m;
        private HealthTextView n;
        private HealthProgressBar o;
        private HealthTextView p;
        private HealthTextView q;
        private HealthTextView r;
        private HealthTextView s;
        private HealthTextView t;
        private HealthTextView u;
        private View v;
        private int w;
        private HealthTextView x;
        private HealthTextView y;
        private HealthTextView z;

        public RecyclerViewHolder(Context context, View view, int i) {
            super(view);
            this.w = i;
            this.v = view;
            RunPlanReportAdapter.this.d = context;
            b();
        }

        private void b() {
            int i = this.w;
            if (i == 0) {
                this.f9007a = (HealthTextView) this.v.findViewById(R.id.coach_comments);
                return;
            }
            if (i == 1) {
                this.n = (HealthTextView) this.v.findViewById(R.id.plan_finish_percent);
                this.o = (HealthProgressBar) this.v.findViewById(R.id.plan_report_progressbar);
                this.q = (HealthTextView) this.v.findViewById(R.id.sug_tv_total_plan_trains);
                this.s = (HealthTextView) this.v.findViewById(R.id.sug_tv_total_plan_unit);
                this.t = (HealthTextView) this.v.findViewById(R.id.sug_tv_plan_distance);
                this.p = (HealthTextView) this.v.findViewById(R.id.sug_tv_plan_distance_unit);
                this.m = (HealthTextView) this.v.findViewById(R.id.sug_tv_plan_calorie);
                this.r = (HealthTextView) this.v.findViewById(R.id.sug_tv_plan_calorie_unit);
                this.g = (HealthBarListView) this.v.findViewById(R.id.finish_record);
                this.u = (HealthTextView) this.v.findViewById(R.id.sug_tv_his_name1);
                d();
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    this.h = (HealthSubHeader) this.v.findViewById(R.id.sub_header_performance_prediction);
                    this.l = (HealthTextView) this.v.findViewById(R.id.plan_target_time);
                    this.k = (HealthTextView) this.v.findViewById(R.id.plan_prediction_time);
                    this.e = (HealthTextView) this.v.findViewById(R.id.plan_achieve_comment);
                    return;
                }
                LogUtil.e("sug_RunPlanReportAdapter", "initView type error");
                return;
            }
            this.ad = (HealthTextView) this.v.findViewById(R.id.sug_tv_week_plan_trains);
            this.z = (HealthTextView) this.v.findViewById(R.id.sug_tv_week_plan_unit);
            this.aa = (HealthTextView) this.v.findViewById(R.id.sug_week_plan_distance);
            this.ac = (HealthTextView) this.v.findViewById(R.id.sug_week_plan_distance_unit);
            this.x = (HealthTextView) this.v.findViewById(R.id.sug_week_plan_calorie);
            this.y = (HealthTextView) this.v.findViewById(R.id.sug_week_plan_calorie_unit);
            this.j = (HealthRingChart) this.v.findViewById(R.id.intensity_statistics_layout);
            this.i = (ImageView) this.v.findViewById(R.id.intensity_statistics_explain_icon);
            this.f = (HealthSubHeader) this.v.findViewById(R.id.last_week_summary_header);
        }

        private void d() {
            this.d = (HealthCalendarView) this.v.findViewById(R.id.report_calendarView);
            this.f9008b = (HealthTextView) this.v.findViewById(R.id.calendar_title);
            this.d.setIsDrawSelected(false);
            this.d.a(true);
            this.d.setWeekViewScrollable(false);
            this.d.c(false);
            this.d.setMonthViewIsScroll(false);
            this.d.setOnCalendarSelectListener(null);
        }
    }

    private void b(RecyclerViewHolder recyclerViewHolder, List<Integer> list) {
        if (recyclerViewHolder != null) {
            recyclerViewHolder.d.b();
            e(recyclerViewHolder, list);
            List<pdq> listM = this.f9005c.m();
            HashMap map = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                if (njy.e(listM, i)) {
                    LogUtil.e("sug_RunPlanReportAdapter", "updateCalendarMark planWeekDataList isOutOfBounds");
                    break;
                }
                pdq pdqVar = listM.get(i);
                if (pdqVar == null) {
                    LogUtil.e("sug_RunPlanReportAdapter", "updateCalendarMark planWeekDataBean == null");
                } else {
                    List<pdt> listF = pdqVar.f();
                    if (njy.e(listF)) {
                        LogUtil.j("sug_RunPlanReportAdapter", "updateCalendarMark trainingDateWeek is rest");
                    } else {
                        c(map, pdqVar, listF);
                    }
                }
            }
            recyclerViewHolder.d.e(map);
            return;
        }
        LogUtil.e("sug_RunPlanReportAdapter", "updateCalendarMark intPlan == null");
    }

    private void c(Map<String, HealthCalendar> map, pdq pdqVar, List<pdt> list) {
        for (pdt pdtVar : list) {
            if (pdtVar == null || njy.e(pdtVar.a())) {
                LogUtil.j("sug_RunPlanReportAdapter", "updateCalendarMark planDayDataBean is rest");
            } else {
                Calendar calendar = Calendar.getInstance();
                long jN = this.f9005c.n();
                calendar.setTimeInMillis(ift.b(jN * 1000, pdqVar.j() - 1, pdtVar.d(), ift.b(this.f9005c.o())));
                int i = calendar.get(1);
                int i2 = calendar.get(2) + 1;
                int i3 = calendar.get(5);
                HealthCalendar healthCalendarE = e(i, i2, i3);
                HealthMark healthMark = new HealthMark(HealthMark.MarkType.COLOR);
                healthMark.b(this.d.getResources().getColor(R.color.calender_day_background));
                healthCalendarE.addMark(healthMark);
                if (pdtVar.c()) {
                    HealthMark healthMark2 = new HealthMark(HealthMark.MarkType.DRAWABLE);
                    healthMark2.e(this.d.getDrawable(R.drawable.calendar_select));
                    healthMark2.a(qrs.d(this.d, 4.0f));
                    healthCalendarE.addMark(healthMark2);
                    LogUtil.a("sug_RunPlanReportAdapter", "mark checkIn month ", Integer.valueOf(i2), " day ", Integer.valueOf(i3));
                }
                map.put(healthCalendarE.toString(), healthCalendarE);
            }
        }
    }

    private HealthCalendar e(int i, int i2, int i3) {
        HealthCalendar healthCalendar = new HealthCalendar();
        healthCalendar.setYear(i);
        healthCalendar.setMonth(i2);
        healthCalendar.setDay(i3);
        return healthCalendar;
    }

    private void e(RecyclerViewHolder recyclerViewHolder, List<Integer> list) {
        long jN = this.f9005c.n() * 1000;
        Date date = new Date();
        date.setTime(jN);
        HealthCalendar healthCalendar = new HealthCalendar();
        healthCalendar.setTime(date);
        int iB = ift.b(ift.a(jN, ift.b(this.f9005c.o())).get(7));
        long size = (((long) (7 - iB)) * 86400000) + jN + (((long) ((list.size() - 1) * 7)) * 86400000);
        if (size > this.f9005c.d() * 1000) {
            size = this.f9005c.d() * 1000;
        }
        Date date2 = new Date();
        date2.setTime(size);
        HealthCalendar healthCalendar2 = new HealthCalendar();
        healthCalendar2.setTime(date2);
        recyclerViewHolder.d.setRange(healthCalendar, healthCalendar2, false);
        LogUtil.a("sug_RunPlanReportAdapter", "setRangeTime startPlanTime: ", Long.valueOf(jN), "planStartDayIndex: ", Integer.valueOf(iB), "endTime: ", Long.valueOf(size));
    }
}
