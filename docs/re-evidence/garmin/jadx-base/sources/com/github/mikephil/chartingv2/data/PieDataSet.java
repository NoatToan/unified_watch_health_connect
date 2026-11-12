package com.github.mikephil.chartingv2.data;

import com.github.mikephil.chartingv2.interfaces.datasets.IPieDataSet;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class PieDataSet extends DataSet<Entry> implements IPieDataSet {
    private float mShift;
    private float mSliceSpace;

    public PieDataSet(List<Entry> list, String str) {
        super(list, str);
        this.mSliceSpace = 0.0f;
        this.mShift = 18.0f;
    }

    @Override // com.github.mikephil.chartingv2.data.DataSet
    public DataSet<Entry> copy() {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < this.mYVals.size(); i14++) {
            arrayList.add(((Entry) this.mYVals.get(i14)).copy());
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, getLabel());
        pieDataSet.mColors = this.mColors;
        pieDataSet.mSliceSpace = this.mSliceSpace;
        pieDataSet.mShift = this.mShift;
        return pieDataSet;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IPieDataSet
    public float getSelectionShift() {
        return this.mShift;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IPieDataSet
    public float getSliceSpace() {
        return this.mSliceSpace;
    }

    public void setSelectionShift(float f14) {
        this.mShift = Utils.convertDpToPixel(f14);
    }

    public void setSliceSpace(float f14) {
        if (f14 > 20.0f) {
            f14 = 20.0f;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        this.mSliceSpace = Utils.convertDpToPixel(f14);
    }
}
