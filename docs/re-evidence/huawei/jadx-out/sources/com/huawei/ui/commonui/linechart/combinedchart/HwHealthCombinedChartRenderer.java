package com.huawei.ui.commonui.linechart.combinedchart;

import android.graphics.Canvas;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.IHwHealthDataRender;
import defpackage.qlz;
import defpackage.qns;
import defpackage.qrs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class HwHealthCombinedChartRenderer extends DataRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DrawAction f23611a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<DataRenderer> f23612c;
    protected List<Highlight> d;
    protected WeakReference<Chart> e;

    interface DrawAction {
        void doDraw(DataRenderer dataRenderer, Canvas canvas);
    }

    public HwHealthCombinedChartRenderer(HwHealthCombinedChart hwHealthCombinedChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.f23612c = new ArrayList(5);
        this.d = new ArrayList();
        this.f23611a = new DrawAction() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChartRenderer.5
            @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChartRenderer.DrawAction
            public void doDraw(DataRenderer dataRenderer, Canvas canvas) {
                dataRenderer.drawData(canvas);
            }
        };
        this.e = new WeakReference<>(hwHealthCombinedChart);
        b();
    }

    public void b() {
        HwHealthCombinedChart hwHealthCombinedChart;
        HwHealthCombinedChart.DrawOrder[] drawOrder;
        this.f23612c.clear();
        Chart chart = this.e.get();
        if (!(chart instanceof HwHealthCombinedChart) || (drawOrder = (hwHealthCombinedChart = (HwHealthCombinedChart) chart).getDrawOrder()) == null || drawOrder.length == 0) {
            return;
        }
        for (HwHealthCombinedChart.DrawOrder drawOrder2 : drawOrder) {
            int i = AnonymousClass2.f23613b[drawOrder2.ordinal()];
            if (i == 1) {
                if (hwHealthCombinedChart.getBarData() != null) {
                    this.f23612c.add(new qlz(hwHealthCombinedChart, this.mAnimator, this.mViewPortHandler));
                }
            } else if (i == 2 && hwHealthCombinedChart.getLineData() != null) {
                qns qnsVar = new qns(hwHealthCombinedChart, this.mAnimator, this.mViewPortHandler);
                qnsVar.c(1);
                this.f23612c.add(qnsVar);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChartRenderer$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f23613b;

        static {
            int[] iArr = new int[HwHealthCombinedChart.DrawOrder.values().length];
            f23613b = iArr;
            try {
                iArr[HwHealthCombinedChart.DrawOrder.BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23613b[HwHealthCombinedChart.DrawOrder.LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        for (DataRenderer dataRenderer : this.f23612c) {
            if (dataRenderer != null) {
                dataRenderer.initBuffers();
            }
        }
    }

    private List<DataRenderer> c() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f23612c) {
            if (!(obj instanceof IHwHealthDataRender)) {
                throw new RuntimeException("only support huawei chart render,interface specified!!!");
            }
            if (((IHwHealthDataRender) obj).hasData()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(DrawAction drawAction, Canvas canvas) {
        List<DataRenderer> listC = c();
        if (listC.size() == 0) {
            return;
        }
        if (listC.size() == 1) {
            drawAction.doDraw(listC.get(0), canvas);
            return;
        }
        if (listC.size() > 2) {
            throw new RuntimeException("combined chart not support More than 2 renders draw");
        }
        DataRenderer dataRenderer = listC.get(0);
        if (!(dataRenderer instanceof IHwHealthDataRender)) {
            LogUtil.e("HealthChart_HwHealthCombinedChartRenderer", "Can not transform to IHwHealthDataRender.");
            return;
        }
        IHwHealthDataRender iHwHealthDataRender = (IHwHealthDataRender) dataRenderer;
        iHwHealthDataRender.usePaintAsBackground(true);
        drawAction.doDraw(dataRenderer, canvas);
        iHwHealthDataRender.usePaintAsBackground(false);
        Iterator<DataRenderer> it = this.f23612c.iterator();
        while (it.hasNext()) {
            drawAction.doDraw(it.next(), canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        e(this.f23611a, canvas);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        Iterator<DataRenderer> it = this.f23612c.iterator();
        while (it.hasNext()) {
            it.next().drawValues(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        Iterator<DataRenderer> it = this.f23612c.iterator();
        while (it.hasNext()) {
            it.next().drawExtras(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, final Highlight[] highlightArr) {
        final Chart chart = this.e.get();
        if (chart == null) {
            return;
        }
        e(new DrawAction() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChartRenderer.3
            @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChartRenderer.DrawAction
            public void doDraw(DataRenderer dataRenderer, Canvas canvas2) {
                qrs.e(dataRenderer, canvas2, chart, -1, HwHealthCombinedChartRenderer.this.d, highlightArr);
            }
        }, canvas);
    }
}
