package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BubbleData extends BarLineScatterCandleBubbleData<IBubbleDataSet> {
    public BubbleData() {
    }

    public void setHighlightCircleWidth(float f) {
        Iterator it2 = this.mDataSets.iterator();
        while (it2.hasNext()) {
            ((IBubbleDataSet) it2.next()).setHighlightCircleWidth(f);
        }
    }

    public BubbleData(IBubbleDataSet... iBubbleDataSetArr) {
        super(iBubbleDataSetArr);
    }

    public BubbleData(List<IBubbleDataSet> list) {
        super(list);
    }
}
