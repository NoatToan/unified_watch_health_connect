package com.github.mikephil.chartingv2.data;

import com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BubbleData extends BarLineScatterCandleBubbleData<IBubbleDataSet> {
    public BubbleData(List<String> list, IBubbleDataSet iBubbleDataSet) {
        super(list, toList(iBubbleDataSet));
    }

    private static List<IBubbleDataSet> toList(IBubbleDataSet iBubbleDataSet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iBubbleDataSet);
        return arrayList;
    }

    public void setHighlightCircleWidth(float f14) {
        Iterator it = this.mDataSets.iterator();
        while (it.hasNext()) {
            ((IBubbleDataSet) it.next()).setHighlightCircleWidth(f14);
        }
    }

    public BubbleData(List<String> list) {
        super(list);
    }

    public BubbleData(String[] strArr) {
        super(strArr);
    }

    public BubbleData(List<String> list, List<IBubbleDataSet> list2) {
        super(list, list2);
    }

    public BubbleData(String[] strArr, List<IBubbleDataSet> list) {
        super(strArr, list);
    }

    public BubbleData() {
    }

    public BubbleData(String[] strArr, IBubbleDataSet iBubbleDataSet) {
        super(strArr, toList(iBubbleDataSet));
    }
}
