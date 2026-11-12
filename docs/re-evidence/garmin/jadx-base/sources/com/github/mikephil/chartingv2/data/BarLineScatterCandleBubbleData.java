package com.github.mikephil.chartingv2.data;

import com.github.mikephil.chartingv2.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class BarLineScatterCandleBubbleData<T extends IBarLineScatterCandleBubbleDataSet<? extends Entry>> extends ChartData<T> {
    public BarLineScatterCandleBubbleData() {
    }

    public BarLineScatterCandleBubbleData(List<String> list) {
        super(list);
    }

    public BarLineScatterCandleBubbleData(String[] strArr) {
        super(strArr);
    }

    public BarLineScatterCandleBubbleData(List<String> list, List<T> list2) {
        super(list, list2);
    }

    public BarLineScatterCandleBubbleData(String[] strArr, List<T> list) {
        super(strArr, list);
    }
}
