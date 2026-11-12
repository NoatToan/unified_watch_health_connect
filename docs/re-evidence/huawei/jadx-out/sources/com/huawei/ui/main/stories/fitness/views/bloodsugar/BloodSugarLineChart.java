package com.huawei.ui.main.stories.fitness.views.bloodsugar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.github.mikephil.charting.components.XAxis;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart;
import defpackage.qnq;
import defpackage.qqp;
import defpackage.ukf;
import defpackage.ulh;
import defpackage.ulm;
import defpackage.ulz;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarLineChart extends InteractorLineChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f27214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27215b;
    private String d;
    private int e;

    @Override // com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart
    public ukf getHealthLineDataSet(HwHealthBaseBarLineData hwHealthBaseBarLineData) {
        return null;
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarLineChart$1, reason: invalid class name */
    public class AnonymousClass1 implements ViewTreeObserver.OnGlobalLayoutListener {
        AnonymousClass1() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BloodSugarLineChart.this.post(new Runnable() { // from class: ulk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50328b.c();
                }
            });
        }

        public /* synthetic */ void c() {
            if (BloodSugarLineChart.this.getWidth() > 0) {
                BloodSugarLineChart bloodSugarLineChart = BloodSugarLineChart.this;
                bloodSugarLineChart.f27215b = bloodSugarLineChart.getWidth();
            }
            LogUtil.d("BloodSugarLineChart", "Blood sugar ViewTreeObserver width:", Integer.valueOf(BloodSugarLineChart.this.f27215b));
            float f = BloodSugarLineChart.this.mContext.getResources().getDisplayMetrics().density;
            BloodSugarLineChart bloodSugarLineChart2 = BloodSugarLineChart.this;
            bloodSugarLineChart2.e = (int) (bloodSugarLineChart2.f27215b / (f * 3.0f));
            BloodSugarLineChart bloodSugarLineChart3 = BloodSugarLineChart.this;
            bloodSugarLineChart3.reCalculate(bloodSugarLineChart3.e);
            BloodSugarLineChart.this.getViewTreeObserver().removeOnGlobalLayoutListener(BloodSugarLineChart.this.f27214a);
        }
    }

    public BloodSugarLineChart(Context context, DataInfos dataInfos) {
        super(context, dataInfos);
        this.e = 0;
        this.f27215b = 0;
        this.f27214a = new AnonymousClass1();
        LogUtil.d("BloodSugarLineChart", "construct chart");
        injectDataContainer(new HwHealthBaseBarLineChart.HwHealthDataContainerGenerator() { // from class: com.huawei.ui.main.stories.fitness.views.bloodsugar.BloodSugarLineChart.3
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart.HwHealthDataContainerGenerator
            public boolean typeOf(Class cls) {
                Class<ulh> superclass = ulh.class;
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
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public ulh newDataContainer() {
                return new ulh(BloodSugarLineChart.this);
            }
        });
    }

    public BloodSugarLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 0;
        this.f27215b = 0;
        this.f27214a = new AnonymousClass1();
    }

    public BloodSugarLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
        this.f27215b = 0;
        this.f27214a = new AnonymousClass1();
    }

    public void setShowDataType(String str) {
        if (this.mRenderer instanceof ulm) {
            ((ulm) this.mRenderer).a(str);
        }
        if (this.mAxisRendererFirstParty instanceof ulz) {
            ((ulz) this.mAxisRendererFirstParty).b(str);
        }
        if (this.mAxisRendererSecondParty instanceof ulz) {
            ((ulz) this.mAxisRendererSecondParty).b(str);
        }
        if (this.mAxisRendererThirdParty instanceof ulz) {
            ((ulz) this.mAxisRendererThirdParty).b(str);
        }
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void refresh() {
        int width = getWidth();
        this.f27215b = width;
        if (width == 0) {
            setVisibility(0);
            getViewTreeObserver().addOnGlobalLayoutListener(this.f27214a);
            return;
        }
        int i = (int) (this.f27215b / (this.mContext.getResources().getDisplayMetrics().density * 3.0f));
        this.e = i;
        if (i == 0) {
            LogUtil.j("BloodSugarLineChart", "mOneScreenShowCounts null,width not null");
        } else {
            reCalculate(i);
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public float computeTipsCenterHeightPx() {
        super.computeTipsCenterHeightPx();
        if (this.mAxisFirstParty.mEntries.length > 2) {
            return (this.mAxisFirstParty.mEntries[1] + this.mAxisFirstParty.mEntries[2]) / 2.0f;
        }
        return 0.0f;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart
    public qnq getLineChartRender(Context context, DataInfos dataInfos) {
        return new ulm(this, this.mAnimator, this.mViewPortHandler, context, dataInfos);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart
    public void initXAxis() {
        XAxis xAxis = getXAxis();
        xAxis.setValueFormatter(new InteractorLineChart.d());
        xAxis.enableGridDashedLine(qqp.a(this.mContext, 2.0f), qqp.a(this.mContext, 1.0f), 0.0f);
        xAxis.setAxisMinimum(0.0f);
        xAxis.setAxisMaximum(1440.0f);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart
    public void initYRender() {
        this.mAxisRendererFirstParty = new ulz(this.mContext, this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        this.mAxisRendererSecondParty = new ulz(this.mContext, this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this);
        this.mAxisRendererThirdParty = new ulz(this.mContext, this.mViewPortHandler, this.mAxisThirdParty, this.mThirdPartyAxisTransformer, this);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart
    public void initCursorMode() {
        setBackgroundColor(this.mContext.getResources().getColor(R.color.color_fff2f2f2));
        enableMarkerView(true);
        setMarkerSlidingMode(HwHealthBaseBarLineChart.MarkerViewSlidingMode.ACCORDING_DATA);
        enableSpacePreserveForDataOverlay(true);
    }

    public void e() {
        if (this.mRenderer == null || !(this.mRenderer instanceof ulm)) {
            return;
        }
        ((ulm) this.mRenderer).c();
    }

    public void setBloodSugarLineChartInterface(BloodSugarLineChartInterface bloodSugarLineChartInterface) {
        if (this.mRenderer == null || !(this.mRenderer instanceof ulm)) {
            return;
        }
        ((ulm) this.mRenderer).b(bloodSugarLineChartInterface);
    }

    public void d() {
        if (this.mRenderer == null || !(this.mRenderer instanceof ulm)) {
            return;
        }
        ((ulm) this.mRenderer).b((BloodSugarLineChartInterface) null);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void setMarkerViewPosition(HwHealthBaseBarLineChart.d dVar) {
        if (dVar == null && (this.mRenderer instanceof ulm)) {
            float fE = ((ulm) this.mRenderer).e();
            if (fE >= 0.0f) {
                highlightValue(fE, false);
                return;
            }
        }
        super.setMarkerViewPosition(dVar);
    }

    public void c() {
        if (this.mRenderer instanceof ulm) {
            ((ulm) this.mRenderer).b();
        }
    }

    public String getDataType() {
        return this.d;
    }

    public void setDataType(String str) {
        this.d = str;
    }
}
