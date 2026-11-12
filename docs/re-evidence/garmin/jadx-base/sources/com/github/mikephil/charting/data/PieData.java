package com.github.mikephil.charting.data;

import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class PieData extends ChartData<IPieDataSet> {
    public PieData(IPieDataSet iPieDataSet) {
        super(iPieDataSet);
    }

    public IPieDataSet getDataSet() {
        return (IPieDataSet) this.mDataSets.get(0);
    }

    @Override // com.github.mikephil.charting.data.ChartData
    public IPieDataSet getDataSetByIndex(int i14) {
        if (i14 == 0) {
            return getDataSet();
        }
        return null;
    }

    @Override // com.github.mikephil.charting.data.ChartData
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

    @Override // com.github.mikephil.charting.data.ChartData
    public Entry getEntryForHighlight(Highlight highlight) {
        return getDataSet().getEntryForIndex((int) highlight.getX());
    }

    public float getYValueSum() {
        float y14 = 0.0f;
        for (int i14 = 0; i14 < getDataSet().getEntryCount(); i14++) {
            y14 += getDataSet().getEntryForIndex(i14).getY();
        }
        return y14;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void setDataSet(IPieDataSet iPieDataSet) {
        this.mDataSets.clear();
        this.mDataSets.add(iPieDataSet);
        notifyDataChanged();
    }

    public PieData() {
    }
}
