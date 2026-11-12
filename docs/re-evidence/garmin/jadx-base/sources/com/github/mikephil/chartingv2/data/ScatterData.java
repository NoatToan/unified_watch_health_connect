package com.github.mikephil.chartingv2.data;

import com.github.mikephil.chartingv2.interfaces.datasets.IScatterDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class ScatterData extends BarLineScatterCandleBubbleData<IScatterDataSet> {
    public ScatterData(List<String> list, IScatterDataSet iScatterDataSet) {
        super(list, toList(iScatterDataSet));
    }

    private static List<IScatterDataSet> toList(IScatterDataSet iScatterDataSet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iScatterDataSet);
        return arrayList;
    }

    public float getGreatestShapeSize() {
        Iterator it = this.mDataSets.iterator();
        float f14 = 0.0f;
        while (it.hasNext()) {
            float scatterShapeSize = ((IScatterDataSet) it.next()).getScatterShapeSize();
            if (scatterShapeSize > f14) {
                f14 = scatterShapeSize;
            }
        }
        return f14;
    }

    public ScatterData(List<String> list) {
        super(list);
    }

    public ScatterData(String[] strArr) {
        super(strArr);
    }

    public ScatterData(List<String> list, List<IScatterDataSet> list2) {
        super(list, list2);
    }

    public ScatterData(String[] strArr, List<IScatterDataSet> list) {
        super(strArr, list);
    }

    public ScatterData() {
    }

    public ScatterData(String[] strArr, IScatterDataSet iScatterDataSet) {
        super(strArr, toList(iScatterDataSet));
    }
}
