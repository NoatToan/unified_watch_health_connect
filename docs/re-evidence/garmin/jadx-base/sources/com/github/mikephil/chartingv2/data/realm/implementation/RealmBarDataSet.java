package com.github.mikephil.chartingv2.data.realm.implementation;

import android.graphics.Color;
import com.github.mikephil.chartingv2.data.BarEntry;
import com.github.mikephil.chartingv2.data.realm.base.RealmBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;
import io.realm.DynamicRealmObject;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmBarDataSet<T extends RealmObject> extends RealmBarLineScatterCandleBubbleDataSet<T, BarEntry> implements IBarDataSet {
    private int mBarShadowColor;
    private float mBarSpace;
    private int mHighLightAlpha;
    private String[] mStackLabels;
    private int mStackSize;
    private String mStackValueFieldName;

    public RealmBarDataSet(RealmResults<T> realmResults, String str, String str2, String str3) {
        super(realmResults, str, str2);
        this.mBarSpace = 0.15f;
        this.mStackSize = 1;
        this.mBarShadowColor = Color.rgb(215, 215, 215);
        this.mHighLightAlpha = 120;
        this.mStackLabels = new String[]{"Stack"};
        this.mStackValueFieldName = str3;
        this.mHighLightColor = Color.rgb(0, 0, 0);
        build(this.results);
        calcMinMax(0, realmResults.size());
    }

    private void calcStackSize() {
        for (int i14 = 0; i14 < this.mValues.size(); i14++) {
            float[] vals = ((BarEntry) this.mValues.get(i14)).getVals();
            if (vals != null && vals.length > this.mStackSize) {
                this.mStackSize = vals.length;
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.github.mikephil.chartingv2.data.realm.base.RealmBaseDataSet
    public void build(RealmResults<T> realmResults) {
        Iterator it = realmResults.iterator();
        while (it.hasNext()) {
            DynamicRealmObject dynamicRealmObject = new DynamicRealmObject((RealmObject) it.next());
            try {
                this.mValues.add(new BarEntry(dynamicRealmObject.getFloat(this.mValuesField), dynamicRealmObject.getInt(this.mIndexField)));
            } catch (IllegalArgumentException unused) {
                RealmList list = dynamicRealmObject.getList(this.mValuesField);
                float[] fArr = new float[list.size()];
                Iterator it3 = list.iterator();
                int i14 = 0;
                while (it3.hasNext()) {
                    fArr[i14] = ((DynamicRealmObject) it3.next()).getFloat(this.mStackValueFieldName);
                    i14++;
                }
                this.mValues.add(new BarEntry(fArr, dynamicRealmObject.getInt(this.mIndexField)));
            }
        }
        calcStackSize();
    }

    @Override // com.github.mikephil.chartingv2.data.realm.base.RealmBaseDataSet, com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void calcMinMax(int i14, int i15) {
        int size;
        List<S> list = this.mValues;
        if (list == 0 || (size = list.size()) == 0) {
            return;
        }
        if (i15 == 0 || i15 >= size) {
            i15 = size - 1;
        }
        this.mYMin = Float.MAX_VALUE;
        this.mYMax = -3.4028235E38f;
        while (i14 <= i15) {
            BarEntry barEntry = (BarEntry) this.mValues.get(i14);
            if (barEntry != null && !Float.isNaN(barEntry.getVal())) {
                if (barEntry.getVals() == null) {
                    if (barEntry.getVal() < this.mYMin) {
                        this.mYMin = barEntry.getVal();
                    }
                    if (barEntry.getVal() > this.mYMax) {
                        this.mYMax = barEntry.getVal();
                    }
                } else {
                    if ((-barEntry.getNegativeSum()) < this.mYMin) {
                        this.mYMin = -barEntry.getNegativeSum();
                    }
                    if (barEntry.getPositiveSum() > this.mYMax) {
                        this.mYMax = barEntry.getPositiveSum();
                    }
                }
            }
            i14++;
        }
        if (this.mYMin == Float.MAX_VALUE) {
            this.mYMin = 0.0f;
            this.mYMax = 0.0f;
        }
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet
    public int getBarShadowColor() {
        return this.mBarShadowColor;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet
    public float getBarSpace() {
        return this.mBarSpace;
    }

    public float getBarSpacePercent() {
        return this.mBarSpace * 100.0f;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet
    public int getHighLightAlpha() {
        return this.mHighLightAlpha;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet
    public String[] getStackLabels() {
        return this.mStackLabels;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet
    public int getStackSize() {
        return this.mStackSize;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet
    public boolean isStacked() {
        return this.mStackSize > 1;
    }

    public void setBarShadowColor(int i14) {
        this.mBarShadowColor = i14;
    }

    public void setBarSpacePercent(float f14) {
        this.mBarSpace = f14 / 100.0f;
    }

    public void setHighLightAlpha(int i14) {
        this.mHighLightAlpha = i14;
    }

    public void setStackLabels(String[] strArr) {
        this.mStackLabels = strArr;
    }

    public RealmBarDataSet(RealmResults<T> realmResults, String str, String str2) {
        super(realmResults, str, str2);
        this.mBarSpace = 0.15f;
        this.mStackSize = 1;
        this.mBarShadowColor = Color.rgb(215, 215, 215);
        this.mHighLightAlpha = 120;
        this.mStackLabels = new String[]{"Stack"};
        this.mHighLightColor = Color.rgb(0, 0, 0);
        build(this.results);
        calcMinMax(0, realmResults.size());
    }
}
