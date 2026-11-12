package com.huawei.healthcloud.plugintrack.ui.fragmentutils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.tablewidget.HealthTableWidget;

/* JADX INFO: loaded from: classes10.dex */
public class CombineChartTableLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f11185a;
    private HealthTableWidget d;
    private HealthDivider e;

    public CombineChartTableLayout(Context context) {
        super(context);
        a(context);
    }

    public CombineChartTableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public CombineChartTableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.chart_combine_layout, this);
        this.f11185a = (LinearLayout) viewInflate.findViewById(R.id.layout_combine_chart);
        this.e = (HealthDivider) viewInflate.findViewById(R.id.view_div_tip);
        this.d = (HealthTableWidget) viewInflate.findViewById(R.id.pace_table_layout);
    }

    public LinearLayout getChartView() {
        return this.f11185a;
    }

    public HealthDivider getDiv() {
        return this.e;
    }

    public HealthTableWidget getTable() {
        return this.d;
    }
}
