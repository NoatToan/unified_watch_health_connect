package com.github.mikephil.chartingv2.data;

import com.github.mikephil.chartingv2.charts.ScatterChart;
import com.github.mikephil.chartingv2.interfaces.datasets.IScatterDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class ScatterDataSet extends LineScatterCandleRadarDataSet<Entry> implements IScatterDataSet {
    private ScatterChart.ScatterShape mScatterShape;
    private int mScatterShapeHoleColor;
    private float mScatterShapeHoleRadius;
    private float mShapeSize;

    public ScatterDataSet(List<Entry> list, String str) {
        super(list, str);
        this.mShapeSize = 15.0f;
        this.mScatterShape = ScatterChart.ScatterShape.SQUARE;
        this.mScatterShapeHoleRadius = 0.0f;
        this.mScatterShapeHoleColor = 1122867;
    }

    @Override // com.github.mikephil.chartingv2.data.DataSet
    public DataSet<Entry> copy() {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < this.mYVals.size(); i14++) {
            arrayList.add(((Entry) this.mYVals.get(i14)).copy());
        }
        ScatterDataSet scatterDataSet = new ScatterDataSet(arrayList, getLabel());
        scatterDataSet.mColors = this.mColors;
        scatterDataSet.mShapeSize = this.mShapeSize;
        scatterDataSet.mScatterShape = this.mScatterShape;
        scatterDataSet.mScatterShapeHoleRadius = this.mScatterShapeHoleRadius;
        scatterDataSet.mScatterShapeHoleColor = this.mScatterShapeHoleColor;
        scatterDataSet.mHighLightColor = this.mHighLightColor;
        return scatterDataSet;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IScatterDataSet
    public ScatterChart.ScatterShape getScatterShape() {
        return this.mScatterShape;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IScatterDataSet
    public int getScatterShapeHoleColor() {
        return this.mScatterShapeHoleColor;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IScatterDataSet
    public float getScatterShapeHoleRadius() {
        return this.mScatterShapeHoleRadius;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IScatterDataSet
    public float getScatterShapeSize() {
        return this.mShapeSize;
    }

    public void setScatterShape(ScatterChart.ScatterShape scatterShape) {
        this.mScatterShape = scatterShape;
    }

    public void setScatterShapeHoleColor(int i14) {
        this.mScatterShapeHoleColor = i14;
    }

    public void setScatterShapeHoleRadius(float f14) {
        this.mScatterShapeHoleRadius = f14;
    }

    public void setScatterShapeSize(float f14) {
        this.mShapeSize = f14;
    }
}
