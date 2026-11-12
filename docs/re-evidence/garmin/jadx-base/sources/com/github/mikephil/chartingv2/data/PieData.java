package com.github.mikephil.chartingv2.data;

import com.github.mikephil.chartingv2.interfaces.datasets.IPieDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class PieData extends ChartData<IPieDataSet> {
    public PieData(List<String> list, IPieDataSet iPieDataSet) {
        super(list, toList(iPieDataSet));
    }

    private static List<IPieDataSet> toList(IPieDataSet iPieDataSet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iPieDataSet);
        return arrayList;
    }

    public IPieDataSet getDataSet() {
        return (IPieDataSet) this.mDataSets.get(0);
    }

    @Override // com.github.mikephil.chartingv2.data.ChartData
    public IPieDataSet getDataSetByIndex(int i14) {
        if (i14 == 0) {
            return getDataSet();
        }
        return null;
    }

    @Override // com.github.mikephil.chartingv2.data.ChartData
    public IPieDataSet getDataSetByLabel(String str, boolean z14) {
        List<T> list = this.mDataSets;
        if (z14) {
            if (str.equalsIgnoreCase(((IPieDataSet) list.get(0)).getLabel())) {
                return (IPieDataSet) this.mDataSets.get(0);
            }
            return null;
        }
        if (str.equals(((IPieDataSet) list.get(0)).getLabel())) {
            return (IPieDataSet) this.mDataSets.get(0);
        }
        return null;
    }

    public float getYValueSum() {
        float val = 0.0f;
        for (int i14 = 0; i14 < getDataSet().getEntryCount(); i14++) {
            val += getDataSet().getEntryForIndex(i14).getVal();
        }
        return val;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void setDataSet(IPieDataSet iPieDataSet) {
        this.mDataSets.clear();
        this.mDataSets.add(iPieDataSet);
        init();
    }

    public PieData(List<String> list) {
        super(list);
    }

    public PieData(String[] strArr) {
        super(strArr);
    }

    public PieData() {
    }

    public PieData(String[] strArr, IPieDataSet iPieDataSet) {
        super(strArr, toList(iPieDataSet));
    }
}
