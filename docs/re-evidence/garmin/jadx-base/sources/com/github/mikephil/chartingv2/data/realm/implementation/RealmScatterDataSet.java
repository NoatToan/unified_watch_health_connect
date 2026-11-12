package com.github.mikephil.chartingv2.data.realm.implementation;

import com.github.mikephil.chartingv2.charts.ScatterChart;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.realm.base.RealmLineScatterCandleRadarDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.IScatterDataSet;
import io.realm.DynamicRealmObject;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmScatterDataSet<T extends RealmObject> extends RealmLineScatterCandleRadarDataSet<T, Entry> implements IScatterDataSet {
    private ScatterChart.ScatterShape mScatterShape;
    private int mScatterShapeHoleColor;
    private float mScatterShapeHoleRadius;
    private float mShapeSize;

    public RealmScatterDataSet(RealmResults<T> realmResults, String str) {
        super(realmResults, str);
        this.mShapeSize = 10.0f;
        this.mScatterShape = ScatterChart.ScatterShape.SQUARE;
        this.mScatterShapeHoleRadius = 0.0f;
        this.mScatterShapeHoleColor = 1122867;
        build(this.results);
        calcMinMax(0, this.results.size());
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.github.mikephil.chartingv2.data.realm.base.RealmBaseDataSet
    public void build(RealmResults<T> realmResults) {
        if (this.mIndexField != null) {
            Iterator it = realmResults.iterator();
            while (it.hasNext()) {
                DynamicRealmObject dynamicRealmObject = new DynamicRealmObject((RealmObject) it.next());
                this.mValues.add((S) new Entry(dynamicRealmObject.getFloat(this.mValuesField), dynamicRealmObject.getInt(this.mIndexField)));
            }
            return;
        }
        Iterator it3 = realmResults.iterator();
        int i14 = 0;
        while (it3.hasNext()) {
            this.mValues.add((S) new Entry(new DynamicRealmObject((RealmObject) it3.next()).getFloat(this.mValuesField), i14));
            i14++;
        }
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

    public RealmScatterDataSet(RealmResults<T> realmResults, String str, String str2) {
        super(realmResults, str, str2);
        this.mShapeSize = 10.0f;
        this.mScatterShape = ScatterChart.ScatterShape.SQUARE;
        this.mScatterShapeHoleRadius = 0.0f;
        this.mScatterShapeHoleColor = 1122867;
        build(this.results);
        calcMinMax(0, this.results.size());
    }
}
