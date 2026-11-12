package com.garmin.android.apps.connectmobile.charts.mpchart.wrapper;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.components.MarkerView;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.renderer.LegendRenderer;
import com.github.mikephil.chartingv2.utils.Utils;
import gz.d;
import mz.a;
import mz.c;
import o13.e;
import p005kotlin.Metadata;
import q6.f;

/* JADX INFO: loaded from: classes7.dex */
@e
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/charts/mpchart/wrapper/BaseLineChart;", "Lcom/github/mikephil/chartingv2/charts/LineChart;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "", "setNoDataText", "(Ljava/lang/String;)V", "", "showNoDataTextOnTop", "setShowNoDataTextOnTop", "(Z)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class BaseLineChart extends LineChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f31319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f31320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31322d;

    public BaseLineChart(Context context) {
        super(context);
    }

    public final void a(d dVar, c cVar) {
        Legend legend = dVar;
        if (dVar == null) {
            legend = getLegend();
        }
        this.mLegend = legend;
        LegendRenderer legendRenderer = cVar;
        if (cVar == null) {
            legendRenderer = getLegendRenderer();
        }
        this.mLegendRenderer = legendRenderer;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public final void drawMarkers(Canvas canvas) {
        Entry entryForHighlight;
        float f14;
        canvas.getClass();
        if (this.mMarkerView != null && this.mDrawMarkerViews && valuesToHighlight()) {
            int length = this.mIndicesToHighlight.length;
            for (int i14 = 0; i14 < length; i14++) {
                Highlight highlight = this.mIndicesToHighlight[i14];
                int xIndex = highlight.getXIndex();
                highlight.getDataSetIndex();
                float f15 = this.mXAxis.mAxisRange;
                float f16 = xIndex;
                if (f16 <= f15 && f16 <= this.mAnimator.getPhaseX() * f15 && (entryForHighlight = ((LineData) this.mData).getEntryForHighlight(this.mIndicesToHighlight[i14])) != null) {
                    float[] markerPosition = getMarkerPosition(entryForHighlight, highlight);
                    if (this.mViewPortHandler.isInBounds(markerPosition[0], markerPosition[1])) {
                        this.mMarkerView.refreshContent(entryForHighlight, highlight);
                        this.mMarkerView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        MarkerView markerView = this.mMarkerView;
                        markerView.layout(0, 0, markerView.getMeasuredWidth(), this.mMarkerView.getMeasuredHeight());
                        this.f31319a += markerPosition[0];
                        if (markerPosition[1] - this.mMarkerView.getHeight() <= 0.0f) {
                            float height = this.mMarkerView.getHeight();
                            float f17 = markerPosition[1];
                            f14 = (height - f17) + f17;
                        } else {
                            f14 = markerPosition[1];
                        }
                        this.f31320b = f14;
                    }
                }
            }
            this.mMarkerView.draw(canvas, this.f31319a / this.mIndicesToHighlight.length, this.f31320b);
            this.f31319a = 0.0f;
        }
    }

    @Override // com.github.mikephil.chartingv2.charts.LineChart, com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart
    public final void init() {
        super.init();
        this.mRenderer = new a(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // com.github.mikephil.chartingv2.charts.BarLineChartBase, com.github.mikephil.chartingv2.charts.Chart, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (TextUtils.isEmpty(this.f31321c) || !this.f31322d) {
            return;
        }
        float fCalcTextHeight = Utils.calcTextHeight(this.mInfoPaint, this.f31321c);
        float fC = f.c(getHeight(), fCalcTextHeight, 2.0f, fCalcTextHeight) - getLegend().mNeededHeight;
        String str = this.f31321c;
        if (str == null) {
            str = "";
        }
        canvas.drawText(str, getWidth() / 2.0f, fC, this.mInfoPaint);
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public void setNoDataText(String text) {
        super.setNoDataText(text);
        this.f31321c = text;
    }

    public final void setShowNoDataTextOnTop(boolean showNoDataTextOnTop) {
        this.f31322d = showNoDataTextOnTop;
    }

    public BaseLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseLineChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }
}
