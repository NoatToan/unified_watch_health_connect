package com.github.mikephil.chartingv2.renderer;

import androidx.core.view.j;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class Renderer {
    protected ViewPortHandler mViewPortHandler;
    protected int mMinX = 0;
    protected int mMaxX = 0;

    public Renderer(ViewPortHandler viewPortHandler) {
        this.mViewPortHandler = viewPortHandler;
    }

    public void calcXBounds(BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider, int i14) {
        int lowestVisibleXIndex = barLineScatterCandleBubbleDataProvider.getLowestVisibleXIndex();
        int highestVisibleXIndex = barLineScatterCandleBubbleDataProvider.getHighestVisibleXIndex();
        this.mMinX = Math.max(((lowestVisibleXIndex / i14) * i14) - (lowestVisibleXIndex % i14 == 0 ? i14 : 0), 0);
        this.mMaxX = Math.min(j.v(highestVisibleXIndex, i14, i14, i14), (int) barLineScatterCandleBubbleDataProvider.getXChartMax());
    }

    public boolean fitsBounds(float f14, float f15, float f16) {
        return f14 >= f15 && f14 <= f16;
    }
}
