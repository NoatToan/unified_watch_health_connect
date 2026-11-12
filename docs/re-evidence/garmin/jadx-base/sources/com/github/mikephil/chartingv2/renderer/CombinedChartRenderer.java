package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.charts.CombinedChart;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class CombinedChartRenderer extends DataRenderer {
    protected List<DataRenderer> mRenderers;

    /* JADX INFO: renamed from: com.github.mikephil.chartingv2.renderer.CombinedChartRenderer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$chartingv2$charts$CombinedChart$DrawOrder;

        static {
            int[] iArr = new int[CombinedChart.DrawOrder.values().length];
            $SwitchMap$com$github$mikephil$chartingv2$charts$CombinedChart$DrawOrder = iArr;
            try {
                iArr[CombinedChart.DrawOrder.BAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$charts$CombinedChart$DrawOrder[CombinedChart.DrawOrder.BUBBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$charts$CombinedChart$DrawOrder[CombinedChart.DrawOrder.LINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$charts$CombinedChart$DrawOrder[CombinedChart.DrawOrder.CANDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$chartingv2$charts$CombinedChart$DrawOrder[CombinedChart.DrawOrder.SCATTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public CombinedChartRenderer(CombinedChart combinedChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        createRenderers(combinedChart, chartAnimator, viewPortHandler);
    }

    @Override // com.github.mikephil.chartingv2.renderer.Renderer
    public void calcXBounds(BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider, int i14) {
        Iterator<DataRenderer> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().calcXBounds(barLineScatterCandleBubbleDataProvider, i14);
        }
    }

    public void createRenderers(CombinedChart combinedChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        this.mRenderers = new ArrayList();
        for (CombinedChart.DrawOrder drawOrder : combinedChart.getDrawOrder()) {
            int i14 = AnonymousClass1.$SwitchMap$com$github$mikephil$chartingv2$charts$CombinedChart$DrawOrder[drawOrder.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 == 5 && combinedChart.getScatterData() != null) {
                                this.mRenderers.add(new ScatterChartRenderer(combinedChart, chartAnimator, viewPortHandler));
                            }
                        } else if (combinedChart.getCandleData() != null) {
                            this.mRenderers.add(new CandleStickChartRenderer(combinedChart, chartAnimator, viewPortHandler));
                        }
                    } else if (combinedChart.getLineData() != null) {
                        this.mRenderers.add(new LineChartRenderer(combinedChart, chartAnimator, viewPortHandler));
                    }
                } else if (combinedChart.getBubbleData() != null) {
                    this.mRenderers.add(new BubbleChartRenderer(combinedChart, chartAnimator, viewPortHandler));
                }
            } else if (combinedChart.getBarData() != null) {
                this.mRenderers.add(new BarChartRenderer(combinedChart, chartAnimator, viewPortHandler));
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        Iterator<DataRenderer> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().drawData(canvas);
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        Iterator<DataRenderer> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().drawExtras(canvas);
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        Iterator<DataRenderer> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().drawHighlighted(canvas, highlightArr);
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        Iterator<DataRenderer> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().drawValues(canvas);
        }
    }

    public DataRenderer getSubRenderer(int i14) {
        if (i14 >= this.mRenderers.size() || i14 < 0) {
            return null;
        }
        return this.mRenderers.get(i14);
    }

    public List<DataRenderer> getSubRenderers() {
        return this.mRenderers;
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void initBuffers() {
        Iterator<DataRenderer> it = this.mRenderers.iterator();
        while (it.hasNext()) {
            it.next().initBuffers();
        }
    }

    public void setSubRenderers(List<DataRenderer> list) {
        this.mRenderers = list;
    }
}
