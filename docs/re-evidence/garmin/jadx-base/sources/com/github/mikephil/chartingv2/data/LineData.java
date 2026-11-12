package com.github.mikephil.chartingv2.data;

import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class LineData extends BarLineScatterCandleBubbleData<ILineDataSet> {
    public LineData(List<String> list, ILineDataSet iLineDataSet) {
        super(list, toList(iLineDataSet));
    }

    private static List<ILineDataSet> toList(ILineDataSet iLineDataSet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iLineDataSet);
        return arrayList;
    }

    public LineData(List<String> list) {
        super(list);
    }

    public LineData(String[] strArr) {
        super(strArr);
    }

    public LineData(List<String> list, List<ILineDataSet> list2) {
        super(list, list2);
    }

    public LineData(String[] strArr, List<ILineDataSet> list) {
        super(strArr, list);
    }

    public LineData() {
    }

    public LineData(String[] strArr, ILineDataSet iLineDataSet) {
        super(strArr, toList(iLineDataSet));
    }
}
