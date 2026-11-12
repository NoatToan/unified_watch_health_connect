package com.huami.chart.data;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes6.dex */
public class PointChartDataList extends ChartDataList {
    private int h;

    public PointChartDataList(SparseArray<ChartData> sparseArray) {
        super(sparseArray);
        this.h = -16777216;
    }

    public int getInteractivePointColor() {
        return this.h;
    }

    public void setInteractivePointColor(int i) {
        this.h = i;
    }

    public PointChartDataList(SparseArray<ChartData> sparseArray, int i, int i2) {
        super(sparseArray, i, i2);
        this.h = -16777216;
    }
}
