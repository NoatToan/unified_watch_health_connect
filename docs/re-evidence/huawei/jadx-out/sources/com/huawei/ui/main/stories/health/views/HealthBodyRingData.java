package com.huawei.ui.main.stories.health.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.main.R;
import defpackage.qjm;
import defpackage.vei;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class HealthBodyRingData extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28189c;
    private HealthRingChart e;

    public HealthBodyRingData(Context context) {
        this(context, null);
        d(context);
    }

    public HealthBodyRingData(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            LogUtil.j("HealthBodyRingData", "HealthBodyDetail AttributeSet or context is null");
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.HealthBodyCircleData);
        try {
            this.f28189c = typedArrayObtainStyledAttributes.getInteger(R.styleable.HealthBodyCircleData_detail_or_report, 0);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("HealthBodyRingData", "HealthBodyRingData Resources NotFoundException");
        }
        typedArrayObtainStyledAttributes.recycle();
        d(context);
    }

    private void d(Context context) {
        View viewInflate;
        if (context == null) {
            LogUtil.j("HealthBodyRingData", "initBodyRingView Context is null");
            return;
        }
        this.f28188b = context;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            LogUtil.j("HealthBodyRingData", "initBodyRingView LayoutInflater is null");
            return;
        }
        int i = this.f28189c;
        if (i == 0) {
            viewInflate = layoutInflater.inflate(R.layout.health_body_ring_view_data, this);
        } else if (i == 2) {
            viewInflate = layoutInflater.inflate(R.layout.health_body_ring_view_data_oversea_report, this);
        } else {
            viewInflate = layoutInflater.inflate(R.layout.health_body_ring_view_data_report, this);
        }
        this.e = (HealthRingChart) viewInflate.findViewById(R.id.body_analysis_chart);
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.f28188b, new qjm(true, false, true));
        healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: veo
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return UnitUtil.e(qjpVar.f(), 1, 1);
            }
        });
        this.e.setAdapter(healthRingChartAdapter);
    }

    public void setBodyCircleViewData(float[] fArr, double d, final int i) {
        HealthRingChart healthRingChart = this.e;
        if (healthRingChart == null) {
            LogUtil.j("HealthBodyRingData", "setBodyCircleViewData mBodyCircleView is null");
            return;
        }
        if (fArr.length <= 0) {
            return;
        }
        HealthRingChartAdapter adapter = healthRingChart.getAdapter();
        if (adapter != null) {
            adapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: vek
                @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
                public final String format(qjp qjpVar) {
                    return UnitUtil.e(qjpVar.f(), 1, i);
                }
            });
        }
        this.e.c(vei.b(this.f28188b, fArr));
        if (LanguageUtil.o(this.f28188b)) {
            this.e.setDesc(this.f28188b.getResources().getString(R.string.IDS_hw_health_show_healthdata_weight), String.valueOf(d));
        }
    }
}
