package com.github.mikephil.chartingv2.data;

import com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class CandleData extends BarLineScatterCandleBubbleData<ICandleDataSet> {
    public CandleData(List<String> list, ICandleDataSet iCandleDataSet) {
        super(list, toList(iCandleDataSet));
    }

    private static List<ICandleDataSet> toList(ICandleDataSet iCandleDataSet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iCandleDataSet);
        return arrayList;
    }

    public CandleData(List<String> list) {
        super(list);
    }

    public CandleData(String[] strArr) {
        super(strArr);
    }

    public CandleData(List<String> list, List<ICandleDataSet> list2) {
        super(list, list2);
    }

    public CandleData(String[] strArr, List<ICandleDataSet> list) {
        super(strArr, list);
    }

    public CandleData() {
    }

    public CandleData(String[] strArr, ICandleDataSet iCandleDataSet) {
        super(strArr, toList(iCandleDataSet));
    }
}
