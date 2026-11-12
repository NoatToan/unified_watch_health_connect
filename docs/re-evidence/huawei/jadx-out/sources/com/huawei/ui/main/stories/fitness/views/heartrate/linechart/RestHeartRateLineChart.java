package com.huawei.ui.main.stories.fitness.views.heartrate.linechart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextUtils;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDatasContainer;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.main.R;
import defpackage.lrd;
import defpackage.qmm;
import defpackage.qnt;
import defpackage.qre;
import defpackage.umy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class RestHeartRateLineChart extends HwHealthLineChart {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f27341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27342c;
    private Float d;

    public RestHeartRateLineChart(Context context) {
        super(context);
        this.f27341b = null;
        this.f27342c = true;
        this.d = Float.valueOf(0.0f);
        LogUtil.d("RestHeartRateLineChart", "construct chart");
        this.f27341b = context;
        e();
    }

    private void e() {
        this.mLegend.setEnabled(false);
        getDescription().setEnabled(false);
        XAxis xAxis = getXAxis();
        xAxis.setValueFormatter(new c());
        xAxis.setAxisMinimum(0.0f);
        xAxis.setAxisMaximum(1440.0f);
        this.mAxisRendererFirstParty = new qmm(this.f27341b, this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        this.mAxisRendererSecondParty = new qmm(this.f27341b, this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this);
        this.mAxisRendererThirdParty = new qmm(this.f27341b, this.mViewPortHandler, this.mAxisThirdParty, this.mThirdPartyAxisTransformer, this);
        injectDataContainer(new HwHealthBaseBarLineChart.HwHealthDataContainerGenerator() { // from class: com.huawei.ui.main.stories.fitness.views.heartrate.linechart.RestHeartRateLineChart.2
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart.HwHealthDataContainerGenerator
            public boolean typeOf(Class cls) {
                Class<umy> superclass = umy.class;
                while (true) {
                    if (superclass == null) {
                        return false;
                    }
                    if (superclass.equals(cls)) {
                        return true;
                    }
                    for (Class<?> cls2 : superclass.getInterfaces()) {
                        if (cls2.equals(cls)) {
                            return true;
                        }
                    }
                    superclass = superclass.getSuperclass();
                }
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart.HwHealthDataContainerGenerator
            public IHwHealthDatasContainer newDataContainer() {
                return new umy(RestHeartRateLineChart.this);
            }
        });
        setExtraTopOffset(5.0f);
        setExtraBottomOffset(7.0f);
        setBackgroundColor(Color.argb(255, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE));
        enableMarkerView(true);
        setMarkerSlidingMode(HwHealthBaseBarLineChart.MarkerViewSlidingMode.ACCORDING_DATA);
        enableSpacePreserveForDataOverlay(true);
    }

    static class c implements IAxisValueFormatter {
        private c() {
        }

        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f, AxisBase axisBase) {
            DecimalFormat decimalFormat = new DecimalFormat("00");
            int i = (int) f;
            int i2 = i / 60;
            return decimalFormat.format(i2) + ":" + decimalFormat.format(i - (i2 * 60));
        }
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void refresh() {
        LogUtil.d("RestHeartRateLineChart", "refresh chart");
        super.refresh();
    }

    private boolean b() {
        List<T> dataSets = ((qnt) this.mData).getDataSets();
        if (dataSets == 0 || dataSets.size() == 0) {
            return true;
        }
        LogUtil.a("RestHeartRateLineChart", "fillOriginalData mLineData size = ", Integer.valueOf(dataSets.size()));
        return false;
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart
    public void customAxisShow() {
        if (!b()) {
            super.customAxisShow();
            return;
        }
        this.mAxisFirstParty.setEnabled(true);
        this.mAxisSecondParty.setEnabled(false);
        this.mAxisThirdParty.setEnabled(false);
        this.mAxisFirstParty.setDrawLabels(true);
        this.mAxisSecondParty.setDrawLabels(false);
        this.mAxisThirdParty.setDrawLabels(false);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart, com.github.mikephil.charting.charts.Chart
    public void drawMarkers(Canvas canvas) {
        super.drawMarkers(canvas);
        if (lrd.d()) {
            d();
        }
    }

    private void d() {
        String strA;
        if (((HwHealthMarkerView) this.mMarker).getData().size() == 0) {
            ReleaseLogUtil.e("RestHeartRateLineChart", "data is null");
            return;
        }
        HwHealthMarkerView.d dVar = ((HwHealthMarkerView) this.mMarker).getData().get(0);
        if (dVar.f23737a == null) {
            ReleaseLogUtil.e("RestHeartRateLineChart", "entry is null");
            return;
        }
        float y = dVar.f23737a.getY();
        if (this.f27342c) {
            strA = qre.a(R.string.accessibility_heart_rate_day_chart, a(dVar));
            lrd.b(this, strA);
            this.d = Float.valueOf(y);
            this.f27342c = false;
        } else {
            strA = a(dVar);
        }
        if (Float.compare(y, this.d.floatValue()) == 0) {
            ReleaseLogUtil.d("RestHeartRateLineChart", "val not change");
        } else {
            this.d = Float.valueOf(y);
            lrd.c(this, strA);
        }
    }

    private String a(HwHealthMarkerView.d dVar) {
        Object parseTool = getParseTool();
        String str = "";
        if (parseTool == null) {
            ReleaseLogUtil.e("RestHeartRateLineChart", "cant setAccessibilityDescription,", parseTool);
            return "";
        }
        String string = ((HwHealthMarkerView) this.mMarker).getTime().toString();
        try {
            str = (String) Class.forName("com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView").getDeclaredMethod("parse", HwHealthBaseEntry.class).invoke(parseTool, dVar.f23737a);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            ReleaseLogUtil.a("RestHeartRateLineChart", "reflect error");
        }
        String str2 = dVar.d;
        if (!TextUtils.isEmpty(str)) {
            string = qre.a(com.huawei.ui.commonui.R.string.IDS_two_parts, string, str);
        }
        return (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) ? string : qre.a(com.huawei.ui.commonui.R.string.IDS_two_parts, string, str2);
    }
}
