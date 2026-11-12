package com.huawei.pluginachievement.ui.barchart;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.BarHighlighter;
import com.github.mikephil.charting.utils.Transformer;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import defpackage.oyz;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class WisdomBarChart extends BarChart {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f22202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22203c;
    private CustomMarkerView d;
    private oyz e;

    public WisdomBarChart(Context context) {
        super(context);
        this.f22203c = false;
        this.f22202b = new float[2];
        d(context);
    }

    public WisdomBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22203c = false;
        this.f22202b = new float[2];
        d(context);
    }

    public WisdomBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22203c = false;
        this.f22202b = new float[2];
        d(context);
    }

    private void setXAxisValueFormatter(final List<String> list) {
        if (list == null) {
            return;
        }
        final int size = list.size();
        getXAxis().setValueFormatter(new IAxisValueFormatter() { // from class: com.huawei.pluginachievement.ui.barchart.WisdomBarChart.5
            @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
            public String getFormattedValue(float f, AxisBase axisBase) {
                int i = (int) f;
                if (i < 0 || i >= size) {
                    return "";
                }
                return (String) list.get(i);
            }
        });
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.e.e(canvas);
        Transformer transformerE = this.e.e();
        float[] fArr = this.f22202b;
        float[] fArr2 = {fArr[0], fArr[1]};
        if (transformerE == null) {
            LogUtil.a("WisdomBarChart", "onDraw() trans = null");
            return;
        }
        transformerE.pointValuesToPixel(fArr2);
        this.d.setIsRun(this.f22203c);
        this.d.draw(canvas, fArr2[0], fArr2[1]);
    }

    @Override // com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        oyz oyzVar = new oyz(this, this.mAnimator, this.mViewPortHandler);
        this.e = oyzVar;
        this.mRenderer = oyzVar;
        setHighlighter(new BarHighlighter(this));
    }

    private void d(Context context) {
        setDrawMarkers(true);
        CustomMarkerView customMarkerView = new CustomMarkerView(context, R.layout.pop_maekerview);
        this.d = customMarkerView;
        customMarkerView.setChartView(this);
        setMarker(this.d);
        getDescription().setEnabled(false);
        setScaleEnabled(false);
        setDrawGridBackground(false);
        setTouchEnabled(false);
        setDragXEnabled(false);
        getXAxis().setDrawGridLines(false);
        getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        getXAxis().setTextSize(10.0f);
        getXAxis().setTextColor(context.getResources().getColor(R.color.color_reprot_frg_lebal));
        getXAxis().setDrawAxisLine(false);
        getLegend().setEnabled(false);
        getAxisRight().setDrawAxisLine(false);
        getAxisRight().setEnabled(false);
        getAxisLeft().setEnabled(false);
        getAxisLeft().setDrawAxisLine(false);
        getAxisLeft().setLabelCount(5, true);
        getAxisLeft().setTextSize(10.0f);
        getAxisLeft().setTextColor(context.getResources().getColor(R.color.color_reprot_frg_lebal));
        getAxisLeft().setAxisMinimum(0.0f);
        getAxisLeft().setSpaceTop(22.0f);
        getAxisLeft().setDrawGridLines(true);
    }
}
