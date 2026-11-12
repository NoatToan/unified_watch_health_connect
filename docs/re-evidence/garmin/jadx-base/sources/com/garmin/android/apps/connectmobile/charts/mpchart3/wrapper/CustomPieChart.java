package com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper;

import a7.b;
import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomPieChart;", "Lcom/github/mikephil/charting/charts/PieChart;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getDrawAngles", "()[F", "getAbsoluteAngles", "", "text", "", "setNoDataText", "(Ljava/lang/String;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class CustomPieChart extends PieChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f31352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f31353b;

    public /* synthetic */ CustomPieChart(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }

    @Override // com.github.mikephil.charting.charts.PieChart, com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public final void calcMinMax() {
        this.f31352a = new float[((PieData) this.mData).getEntryCount()];
        this.f31353b = new float[((PieData) this.mData).getEntryCount()];
        float yValueSum = ((PieData) this.mData).getYValueSum();
        List<IPieDataSet> dataSets = ((PieData) this.mData).getDataSets();
        int dataSetCount = ((PieData) this.mData).getDataSetCount();
        int i14 = 0;
        for (int i15 = 0; i15 < dataSetCount; i15++) {
            IPieDataSet iPieDataSet = dataSets.get(i15);
            iPieDataSet.getClass();
            int entryCount = iPieDataSet.getEntryCount();
            boolean z14 = false;
            int i16 = 0;
            for (int i17 = 0; i17 < entryCount; i17++) {
                float value = iPieDataSet.getEntryForIndex(i17).getValue();
                if (value > 0.0f) {
                    i16++;
                    if (value < 1.0f) {
                        z14 = true;
                    }
                }
            }
            float f14 = z14 ? (100.0f - i16) / 100.0f : 0.0f;
            int entryCount2 = iPieDataSet.getEntryCount();
            for (int i18 = 0; i18 < entryCount2; i18++) {
                float value2 = iPieDataSet.getEntryForIndex(i18).getValue();
                if (f14 > 0.0f && value2 > 0.0f) {
                    value2 = (value2 * f14) + 1;
                }
                this.f31352a[i14] = (Math.abs(value2) / yValueSum) * this.mMaxAngle;
                float[] fArr = this.f31353b;
                if (i14 == 0) {
                    fArr[i14] = this.f31352a[i14];
                } else {
                    fArr[i14] = fArr[i14 - 1] + this.f31352a[i14];
                }
                i14++;
            }
        }
    }

    @Override // com.github.mikephil.charting.charts.PieChart
    /* JADX INFO: renamed from: getAbsoluteAngles, reason: from getter */
    public float[] getF31353b() {
        return this.f31353b;
    }

    @Override // com.github.mikephil.charting.charts.PieChart
    /* JADX INFO: renamed from: getDrawAngles, reason: from getter */
    public float[] getF31352a() {
        return this.f31352a;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setNoDataText(String text) {
        text.getClass();
        super.setNoDataText(text);
        getPaint(7).setColor(b.getColor(getContext(), R.color.gcm_text_secondary));
    }

    public CustomPieChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CustomPieChart(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f31352a = new float[1];
        this.f31353b = new float[1];
    }

    public CustomPieChart(Context context) {
        this(context, null, 0, 6, null);
    }
}
