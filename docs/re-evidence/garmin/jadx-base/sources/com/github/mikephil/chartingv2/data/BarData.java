package com.github.mikephil.chartingv2.data;

import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BarData extends BarLineScatterCandleBubbleData<IBarDataSet> {
    private float mGroupSpace;

    public BarData(List<String> list, IBarDataSet iBarDataSet) {
        super(list, toList(iBarDataSet));
        this.mGroupSpace = 0.8f;
    }

    private static List<IBarDataSet> toList(IBarDataSet iBarDataSet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iBarDataSet);
        return arrayList;
    }

    public float getGroupSpace() {
        if (this.mDataSets.size() <= 1) {
            return 0.0f;
        }
        return this.mGroupSpace;
    }

    public boolean isGrouped() {
        return this.mDataSets.size() > 1;
    }

    public void setGroupSpace(float f14) {
        this.mGroupSpace = f14 / 100.0f;
    }

    public BarData(List<String> list) {
        super(list);
        this.mGroupSpace = 0.8f;
    }

    public BarData(String[] strArr) {
        super(strArr);
        this.mGroupSpace = 0.8f;
    }

    public BarData(List<String> list, List<IBarDataSet> list2) {
        super(list, list2);
        this.mGroupSpace = 0.8f;
    }

    public BarData(String[] strArr, List<IBarDataSet> list) {
        super(strArr, list);
        this.mGroupSpace = 0.8f;
    }

    public BarData() {
        this.mGroupSpace = 0.8f;
    }

    public BarData(String[] strArr, IBarDataSet iBarDataSet) {
        super(strArr, toList(iBarDataSet));
        this.mGroupSpace = 0.8f;
    }
}
