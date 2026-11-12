package mz;

import android.util.SparseArray;
import com.github.mikephil.chartingv2.charts.CombinedChart;
import com.github.mikephil.chartingv2.renderer.BarChartRenderer;
import com.github.mikephil.chartingv2.renderer.BubbleChartRenderer;
import com.github.mikephil.chartingv2.renderer.CandleStickChartRenderer;
import com.github.mikephil.chartingv2.renderer.CombinedChartRenderer;
import com.github.mikephil.chartingv2.renderer.DataRenderer;
import com.github.mikephil.chartingv2.renderer.LineScatterCandleRadarRenderer;
import com.github.mikephil.chartingv2.renderer.ScatterChartRenderer;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lmz/b;", "Lcom/github/mikephil/chartingv2/renderer/CombinedChartRenderer;", "Lcom/github/mikephil/chartingv2/charts/CombinedChart;", "chart", "", "Lmz/b$a;", "customRenderers", "<init>", "(Lcom/github/mikephil/chartingv2/charts/CombinedChart;Ljava/util/List;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends CombinedChartRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<a> f121611a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmz/b$a;", "", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {
        public abstract LineScatterCandleRadarRenderer a();

        public abstract int b();
    }

    /* JADX INFO: renamed from: mz.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C2305b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121612a;

        static {
            int[] iArr = new int[CombinedChart.DrawOrder.values().length];
            try {
                iArr[CombinedChart.DrawOrder.BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CombinedChart.DrawOrder.BUBBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CombinedChart.DrawOrder.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CombinedChart.DrawOrder.CANDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CombinedChart.DrawOrder.SCATTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f121612a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00f9  */
    public b(CombinedChart combinedChart, List<? extends a> list) {
        DataRenderer dataRendererA;
        super(combinedChart, combinedChart != null ? combinedChart.getAnimator() : null, combinedChart != null ? combinedChart.getViewPortHandler() : null);
        this.f121611a = new SparseArray<>();
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            a aVar = list.get(i14);
            SparseArray<a> sparseArray = this.f121611a;
            if (sparseArray != null) {
                sparseArray.put(aVar.b(), aVar);
            }
        }
        this.mRenderers = new ArrayList();
        CombinedChart.DrawOrder[] drawOrder = combinedChart != null ? combinedChart.getDrawOrder() : null;
        if (drawOrder != null) {
            int length = drawOrder.length;
            for (int i15 = 0; i15 < length; i15++) {
                CombinedChart.DrawOrder drawOrder2 = drawOrder[i15];
                int i16 = drawOrder2 == null ? -1 : C2305b.f121612a[drawOrder2.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 != 4) {
                                if (i16 != 5) {
                                    u0.r();
                                    throw null;
                                }
                                if (combinedChart.getScatterData() != null) {
                                    dataRendererA = a(4);
                                    if (dataRendererA == null) {
                                        dataRendererA = new ScatterChartRenderer(combinedChart, combinedChart.getAnimator(), combinedChart.getViewPortHandler());
                                    }
                                } else {
                                    dataRendererA = null;
                                }
                            } else if (combinedChart.getCandleData() != null) {
                                dataRendererA = a(3);
                                if (dataRendererA == null) {
                                    dataRendererA = new CandleStickChartRenderer(combinedChart, combinedChart.getAnimator(), combinedChart.getViewPortHandler());
                                }
                            } else {
                                dataRendererA = null;
                            }
                        } else if (combinedChart.getLineData() != null) {
                            dataRendererA = a(2);
                            if (dataRendererA == null) {
                                dataRendererA = new mz.a(combinedChart, combinedChart.getAnimator(), combinedChart.getViewPortHandler());
                            }
                        } else {
                            dataRendererA = null;
                        }
                    } else if (combinedChart.getBubbleData() != null) {
                        dataRendererA = a(1);
                        if (dataRendererA == null) {
                            dataRendererA = new BubbleChartRenderer(combinedChart, combinedChart.getAnimator(), combinedChart.getViewPortHandler());
                        }
                    } else {
                        dataRendererA = null;
                    }
                } else if (combinedChart.getBarData() != null) {
                    dataRendererA = a(0);
                    if (dataRendererA == null) {
                        dataRendererA = new BarChartRenderer(combinedChart, combinedChart.getAnimator(), combinedChart.getViewPortHandler());
                    }
                } else {
                    dataRendererA = null;
                }
                if (dataRendererA != null) {
                    this.mRenderers.add(dataRendererA);
                }
            }
        }
    }

    public final DataRenderer a(int i14) {
        a aVar;
        SparseArray<a> sparseArray = this.f121611a;
        if (sparseArray == null || (aVar = sparseArray.get(i14)) == null) {
            return null;
        }
        return aVar.a();
    }

    public final float b() {
        return this.mHighlightPaint.getStrokeWidth() + this.mViewPortHandler.offsetLeft();
    }

    public final float c() {
        return this.mHighlightPaint.getStrokeWidth() + this.mViewPortHandler.offsetRight();
    }
}
