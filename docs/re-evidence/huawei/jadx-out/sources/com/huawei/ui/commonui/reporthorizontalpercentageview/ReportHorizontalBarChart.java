package com.huawei.ui.commonui.reporthorizontalpercentageview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes16.dex */
public class ReportHorizontalBarChart extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f23842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f23843c;
    private float d;
    private DottedPercentageView e;
    private HealthTextView i;

    public ReportHorizontalBarChart(Context context) {
        this(context, null);
    }

    public ReportHorizontalBarChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReportHorizontalBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context, attributeSet, i, 0);
    }

    public void setExerciseTime(String str) {
        this.i.setText(str);
    }

    public void setWeekDate(String str) {
        this.f23843c.setText(str);
    }

    public void setMaxValue(float f, float f2) {
        this.d = f;
        this.f23841a = f2;
        this.e.setData((int) f, (int) f2);
    }

    private void d(Context context, AttributeSet attributeSet, int i, int i2) {
        if (context == null) {
            LogUtil.j("ReportHorizontalBarChart", "initView Context is null");
            return;
        }
        this.f23842b = context;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            LogUtil.j("ReportHorizontalBarChart", "initView LayoutInflater is null");
            return;
        }
        View viewInflate = layoutInflater.inflate(R.layout.report_horizontal_bar_chart, (ViewGroup) this, false);
        addView(viewInflate);
        b(viewInflate);
    }

    private void b(View view) {
        this.e = (DottedPercentageView) view.findViewById(R.id.report_weekly_distribution_percentage_view);
        this.f23843c = (HealthTextView) view.findViewById(R.id.report_weekly_distribution_date);
        this.i = (HealthTextView) view.findViewById(R.id.report_weekly_distribution_time);
    }
}
