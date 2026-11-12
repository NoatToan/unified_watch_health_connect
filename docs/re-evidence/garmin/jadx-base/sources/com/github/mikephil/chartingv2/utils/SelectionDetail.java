package com.github.mikephil.chartingv2.utils;

import com.github.mikephil.chartingv2.interfaces.datasets.IDataSet;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class SelectionDetail {
    public IDataSet dataSet;
    public int dataSetIndex;
    public float val;

    public SelectionDetail(float f14, int i14, IDataSet iDataSet) {
        this.val = f14;
        this.dataSetIndex = i14;
        this.dataSet = iDataSet;
    }
}
