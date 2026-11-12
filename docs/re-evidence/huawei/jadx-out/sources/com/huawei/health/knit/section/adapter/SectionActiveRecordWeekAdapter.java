package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fsy;
import defpackage.njy;
import defpackage.qly;
import defpackage.qmf;
import defpackage.qqz;
import defpackage.qre;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionActiveRecordWeekAdapter extends BaseRecyclerAdapter<fsy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f7328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7329c;
    private OnClickSectionListener e;

    public SectionActiveRecordWeekAdapter() {
        super(new ArrayList(), R.layout.section_active_record_week_item);
        Context contextB = BaseApplication.b();
        this.f7328b = contextB;
        this.f7327a = HiDateUtil.d(System.currentTimeMillis());
        this.f7329c = LanguageUtil.ba(contextB);
    }

    public void b(List<fsy> list) {
        refreshDataChange(list);
    }

    @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void convert(RecyclerHolder recyclerHolder, final int i, fsy fsyVar) {
        HwHealthBarChart hwHealthBarChart;
        if (recyclerHolder == null || fsyVar == null) {
            ReleaseLogUtil.d("R_SectionActiveRecordWeekAdapter", "convert holder ", recyclerHolder, " itemData ", fsyVar);
            return;
        }
        HealthImageView healthImageView = (HealthImageView) recyclerHolder.d(R.id.section_active_record_week_item_arrow);
        healthImageView.setImageResource(this.f7329c ? R.drawable.common_ui_arrow_left : R.drawable.common_ui_arrow_right);
        healthImageView.setOnClickListener(new View.OnClickListener() { // from class: fpm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34367c.c(i, view);
            }
        });
        HealthImageView healthImageView2 = (HealthImageView) recyclerHolder.d(R.id.section_active_record_week_item_icon);
        int iF = fsyVar.f();
        if (this.f7329c) {
            Context context = this.f7328b;
            healthImageView2.setImageDrawable(qqz.e(context, ContextCompat.getDrawable(context, iF)));
        } else {
            healthImageView2.setImageResource(iF);
        }
        healthImageView2.setOnClickListener(new View.OnClickListener() { // from class: fpu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(i, view);
            }
        });
        HealthTextView healthTextView = (HealthTextView) recyclerHolder.d(R.id.section_active_record_week_item_title);
        healthTextView.setText(fsyVar.m());
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: fps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34377a.d(i, view);
            }
        });
        int iG = fsyVar.g();
        Drawable drawableC = qre.c(iG);
        HealthImageView healthImageView3 = (HealthImageView) recyclerHolder.d(R.id.section_active_record_week_item_icon_tip);
        if (drawableC == null) {
            ReleaseLogUtil.d("R_SectionActiveRecordWeekAdapter", "convert drawable is null iconTipResourceId ", Integer.valueOf(iG));
            healthImageView3.setVisibility(8);
        } else {
            healthImageView3.setVisibility(0);
            healthImageView3.setImageDrawable(drawableC);
            healthImageView3.setOnClickListener(new View.OnClickListener() { // from class: fpt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34378a.d(view);
                }
            });
        }
        recyclerHolder.a(R.id.section_active_record_week_item_tip, fsyVar.h());
        LinearLayout linearLayout = (LinearLayout) recyclerHolder.d(R.id.section_active_record_week_item_event);
        if (fsyVar.j() == 1) {
            linearLayout.setVisibility(0);
            recyclerHolder.e(R.id.section_active_record_week_item_event_button, new View.OnClickListener() { // from class: fpr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34376b.e(view);
                }
            });
        } else {
            linearLayout.setVisibility(8);
        }
        recyclerHolder.a(R.id.section_active_record_week_item_compare_day_title, qre.f(HiDateUtil.d(fsyVar.b()) == this.f7327a ? R.string.IDS_hwh_home_group_today : R.string.IDS_same_day));
        recyclerHolder.a(R.id.section_active_record_week_item_compare_day_value, fsyVar.c());
        recyclerHolder.a(R.id.section_active_record_week_item_compare_week_value, fsyVar.n());
        if (new HealthColumnSystem(this.f7328b, 0).a()) {
            hwHealthBarChart = (HwHealthBarChart) recyclerHolder.d(R.id.section_active_record_week_item_bar_chart);
            recyclerHolder.e(R.id.section_active_record_week_item_bar_chart_widescreen, 8);
        } else {
            hwHealthBarChart = (HwHealthBarChart) recyclerHolder.d(R.id.section_active_record_week_item_bar_chart_widescreen);
            recyclerHolder.e(R.id.section_active_record_week_item_bar_chart, 8);
        }
        b(hwHealthBarChart, fsyVar);
    }

    public /* synthetic */ void c(int i, View view) {
        OnClickSectionListener onClickSectionListener = this.e;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i);
        }
    }

    public /* synthetic */ void b(int i, View view) {
        OnClickSectionListener onClickSectionListener = this.e;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i);
        }
    }

    public /* synthetic */ void d(int i, View view) {
        OnClickSectionListener onClickSectionListener = this.e;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i);
        }
    }

    public /* synthetic */ void d(View view) {
        OnClickSectionListener onClickSectionListener = this.e;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick("RIGHT_ICON_CLICK_EVENT");
        }
    }

    public /* synthetic */ void e(View view) {
        OnClickSectionListener onClickSectionListener = this.e;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick("GOAL_BUTTON");
        }
    }

    private void b(HwHealthBarChart hwHealthBarChart, fsy fsyVar) {
        List<Integer> listO = fsyVar.o();
        if (njy.e(listO)) {
            ReleaseLogUtil.d("R_SectionActiveRecordWeekAdapter", "setBarChart valueList ", listO);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = listO.size();
        int iA = a(fsyVar.b());
        int iA2 = fsyVar.a();
        int iD = fsyVar.d();
        int i = 0;
        while (i < size) {
            arrayList.add(new HwHealthBarEntry(i, new qmf(listO.get(i).intValue(), i == iA ? iD : iA2, iD)));
            i++;
        }
        d(hwHealthBarChart);
        c(hwHealthBarChart, c(arrayList, fsyVar));
        HwHealthBarDataSet hwHealthBarDataSet = new HwHealthBarDataSet(arrayList, "", "", "");
        hwHealthBarDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        hwHealthBarDataSet.e(HwHealthBarDataSet.DrawColorMode.DATA_COLOR);
        hwHealthBarDataSet.setBarDrawWidth(0.3f);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(hwHealthBarDataSet);
        hwHealthBarChart.setData(new qly(arrayList2));
        int i2 = fsyVar.i();
        hwHealthBarChart.setManualReferenceLine(i2, fsyVar.e(), qre.a(R.string.IDS_current_target, UnitUtil.e(i2, 1, 0)));
        hwHealthBarChart.setHorizontalAxisFocusLabelIndex(iA);
        hwHealthBarChart.refresh();
    }

    private int a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        calendar.setTimeInMillis(j);
        int i = calendar.get(7);
        if (i == 1) {
            return 6;
        }
        return i - 2;
    }

    private void d(HwHealthBarChart hwHealthBarChart) {
        hwHealthBarChart.setVisibility(0);
        hwHealthBarChart.makeReverse(true);
        hwHealthBarChart.setTouchEnabled(false);
        hwHealthBarChart.e(true, false);
        hwHealthBarChart.enableSpacePreserveForDataOverlay(true);
        hwHealthBarChart.enableManualFloatLineText(ContextCompat.getColor(this.f7328b, R.color.textColorSecondary));
        hwHealthBarChart.fillChartBackground(ContextCompat.getColor(this.f7328b, R.color.colorCardPanelBg), ContextCompat.getColor(this.f7328b, R.color.colorCardPanelBg));
    }

    private void c(HwHealthBarChart hwHealthBarChart, float f) {
        HwHealthYAxis axisFirstParty = hwHealthBarChart.getAxisFirstParty();
        if (axisFirstParty != null) {
            axisFirstParty.setEnabled(true);
            axisFirstParty.setDrawLabels(false);
            axisFirstParty.setDrawAxisLine(false);
            axisFirstParty.setDrawGridLines(false);
            axisFirstParty.setAxisMinimum(0.0f);
            axisFirstParty.setAxisMaximum(f);
        }
        HwHealthYAxis axisSecondParty = hwHealthBarChart.getAxisSecondParty();
        if (axisSecondParty != null) {
            axisSecondParty.setEnabled(true);
            axisSecondParty.setDrawLabels(false);
            axisSecondParty.setDrawAxisLine(false);
            axisSecondParty.setDrawGridLines(true);
            axisSecondParty.disableGridDashedLine();
            axisSecondParty.setGridColor(ContextCompat.getColor(this.f7328b, R.color.active_week_grid_color));
            axisSecondParty.setAxisMinimum(0.0f);
            axisSecondParty.setAxisMaximum(f);
        }
        XAxis xAxis = hwHealthBarChart.getXAxis();
        if (xAxis == null) {
            ReleaseLogUtil.d("R_SectionActiveRecordWeekAdapter", "initAxis xAxis is null");
            return;
        }
        xAxis.setTextSize(10.0f);
        xAxis.setEnabled(true);
        xAxis.setDrawLabels(true);
        final List<String> listB = b();
        xAxis.setValueFormatter(new IAxisValueFormatter() { // from class: com.huawei.health.knit.section.adapter.SectionActiveRecordWeekAdapter.1
            @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
            public String getFormattedValue(float f2, AxisBase axisBase) {
                int i = (int) f2;
                if (njy.e(listB, i)) {
                    return "";
                }
                return (String) listB.get(i);
            }
        });
    }

    private List<String> b() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(qre.f(R.string.IDS_report_monday));
        arrayList.add(qre.f(R.string.IDS_report_thuesday));
        arrayList.add(qre.f(R.string.IDS_report_wedesday));
        arrayList.add(qre.f(R.string.IDS_report_thursday));
        arrayList.add(qre.f(R.string.IDS_report_friday));
        arrayList.add(qre.f(R.string.IDS_report_saturday));
        arrayList.add(qre.f(R.string.IDS_report_sunday));
        return arrayList;
    }

    private float c(List<HwHealthBarEntry> list, fsy fsyVar) {
        if (njy.e(list) || fsyVar == null) {
            ReleaseLogUtil.d("R_SectionActiveRecordWeekAdapter", "getVerticalAxisMaximum list ", list, " bean ", fsyVar);
            return 0.0f;
        }
        float fI = fsyVar.i();
        float fMax = fI;
        for (HwHealthBarEntry hwHealthBarEntry : list) {
            if (hwHealthBarEntry != null) {
                fMax = Math.max(fMax, hwHealthBarEntry.getY());
            }
        }
        float f = fI * 1.2f;
        return Float.compare(fMax, f) == 1 ? fMax : f;
    }

    public void b(OnClickSectionListener onClickSectionListener) {
        this.e = onClickSectionListener;
    }
}
