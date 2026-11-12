package com.huawei.ui.commonui.linechart.combinedchart;

import android.graphics.Canvas;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.ui.commonui.linechart.common.IHwHealthDataRender;
import defpackage.qlz;
import defpackage.qns;
import defpackage.qnw;
import defpackage.qrs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class HwHealthBaseCombinedChartRenderer extends DataRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DrawAction f23604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List<DataRenderer> f23605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<Highlight> f23606c;
    private boolean d;
    protected WeakReference<Chart> e;

    interface DrawAction {
        void doDraw(DataRenderer dataRenderer, Canvas canvas);
    }

    public HwHealthBaseCombinedChartRenderer(HwHealthBaseCombinedChart hwHealthBaseCombinedChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.f23605b = new ArrayList(3);
        this.f23606c = new ArrayList(10);
        this.d = false;
        this.f23604a = new DrawAction() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChartRenderer.3
            @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChartRenderer.DrawAction
            public void doDraw(DataRenderer dataRenderer, Canvas canvas) {
                if (dataRenderer == null || canvas == null) {
                    return;
                }
                dataRenderer.drawData(canvas);
            }
        };
        this.e = new WeakReference<>(hwHealthBaseCombinedChart);
        b();
    }

    public void b() {
        HwHealthBaseCombinedChart hwHealthBaseCombinedChart;
        HwHealthBaseCombinedChart.DrawOrder[] drawOrder;
        this.f23605b.clear();
        Chart chart = this.e.get();
        if (!(chart instanceof HwHealthBaseCombinedChart) || (drawOrder = (hwHealthBaseCombinedChart = (HwHealthBaseCombinedChart) chart).getDrawOrder()) == null || drawOrder.length == 0) {
            return;
        }
        for (HwHealthBaseCombinedChart.DrawOrder drawOrder2 : drawOrder) {
            int i = AnonymousClass4.f23607a[drawOrder2.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (hwHealthBaseCombinedChart.getLineData() != null) {
                        this.f23605b.add(new qns(hwHealthBaseCombinedChart, this.mAnimator, this.mViewPortHandler));
                    }
                } else if (i == 3 && hwHealthBaseCombinedChart.getPointData() != null) {
                    this.f23605b.add(new qnw(hwHealthBaseCombinedChart, this.mAnimator, this.mViewPortHandler, hwHealthBaseCombinedChart.getContext()));
                }
            } else if (hwHealthBaseCombinedChart.getBarData() != null) {
                this.f23605b.add(new qlz(hwHealthBaseCombinedChart, this.mAnimator, this.mViewPortHandler));
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChartRenderer$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23607a;

        static {
            int[] iArr = new int[HwHealthBaseCombinedChart.DrawOrder.values().length];
            f23607a = iArr;
            try {
                iArr[HwHealthBaseCombinedChart.DrawOrder.BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23607a[HwHealthBaseCombinedChart.DrawOrder.LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23607a[HwHealthBaseCombinedChart.DrawOrder.POINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
        Iterator<DataRenderer> it = this.f23605b.iterator();
        while (it.hasNext()) {
            it.next().initBuffers();
        }
    }

    private List<DataRenderer> e() {
        ArrayList arrayList = new ArrayList(this.f23605b.size());
        for (Object obj : this.f23605b) {
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
    private void d(DrawAction drawAction, Canvas canvas) {
        List<DataRenderer> listE = e();
        if (listE.size() > 3) {
            throw new RuntimeException("combined chart not support More than 3 renders draw");
        }
        boolean z = true;
        for (DataRenderer dataRenderer : listE) {
            if (z && this.d && listE.size() != 1 && (dataRenderer instanceof IHwHealthDataRender)) {
                IHwHealthDataRender iHwHealthDataRender = (IHwHealthDataRender) dataRenderer;
                iHwHealthDataRender.usePaintAsBackground(true);
                drawAction.doDraw(dataRenderer, canvas);
                iHwHealthDataRender.usePaintAsBackground(false);
            } else {
                drawAction.doDraw(dataRenderer, canvas);
            }
            z = false;
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        d(this.f23604a, canvas);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        Iterator<DataRenderer> it = this.f23605b.iterator();
        while (it.hasNext()) {
            it.next().drawValues(canvas);
        }
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        Iterator<DataRenderer> it = this.f23605b.iterator();
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
        d(new DrawAction() { // from class: com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChartRenderer.5
            @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChartRenderer.DrawAction
            public void doDraw(DataRenderer dataRenderer, Canvas canvas2) {
                if (dataRenderer == null || canvas2 == null) {
                    return;
                }
                qrs.e(dataRenderer, canvas2, chart, -1, HwHealthBaseCombinedChartRenderer.this.f23606c, highlightArr);
            }
        }, canvas);
    }
}
