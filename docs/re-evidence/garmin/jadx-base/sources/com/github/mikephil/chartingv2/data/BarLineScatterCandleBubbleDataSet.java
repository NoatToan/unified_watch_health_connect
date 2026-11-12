package com.github.mikephil.chartingv2.data;

import android.graphics.Color;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class BarLineScatterCandleBubbleDataSet<T extends Entry> extends DataSet<T> implements IBarLineScatterCandleBubbleDataSet<T> {
    protected int mHighLightColor;

    public BarLineScatterCandleBubbleDataSet(List<T> list, String str) {
        super(list, str);
        this.mHighLightColor = Color.rgb(255, 187, 115);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBarLineScatterCandleBubbleDataSet
    public int getHighLightColor() {
        return this.mHighLightColor;
    }

    public void setHighLightColor(int i14) {
        this.mHighLightColor = i14;
    }
}
