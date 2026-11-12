package com.github.mikephil.chartingv2.data;

import android.graphics.Color;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BarDataSet extends BarLineScatterCandleBubbleDataSet<BarEntry> implements IBarDataSet {
    private int mBarShadowColor;
    private float mBarSpace;
    private int mEntryCountStacks;
    private int mHighLightAlpha;
    private String[] mStackLabels;
    private int mStackSize;

    public BarDataSet(List<BarEntry> list, String str) {
        super(list, str);
        this.mBarSpace = 0.15f;
        this.mStackSize = 1;
        this.mBarShadowColor = Color.rgb(215, 215, 215);
        this.mHighLightAlpha = 120;
        this.mEntryCountStacks = 0;
        this.mStackLabels = new String[]{"Stack"};
        this.mHighLightColor = Color.rgb(0, 0, 0);
        calcStackSize(list);
        calcEntryCountIncludingStacks(list);
    }

    private void calcEntryCountIncludingStacks(List<BarEntry> list) {
        this.mEntryCountStacks = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            float[] vals = list.get(i14).getVals();
            int i15 = this.mEntryCountStacks;
            if (vals == null) {
                this.mEntryCountStacks = i15 + 1;
            } else {
                this.mEntryCountStacks = i15 + vals.length;
            }
        }
    }

    private void calcStackSize(List<BarEntry> list) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            float[] vals = list.get(i14).getVals();
            if (vals != null && vals.length > this.mStackSize) {
                this.mStackSize = vals.length;
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.data.DataSet, com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void calcMinMax(int i14, int i15) {
        int size;
        List<T> list = this.mYVals;
        if (list == 0 || (size = list.size()) == 0) {
            return;
        }
        if (i15 == 0 || i15 >= size) {
            i15 = size - 1;
        }
        this.mYMin = Float.MAX_VALUE;
        this.mYMax = -3.4028235E38f;
        while (i14 <= i15) {
            BarEntry barEntry = (BarEntry) this.mYVals.get(i14);
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

    @Override // com.github.mikephil.chartingv2.data.DataSet
    public DataSet<BarEntry> copy() {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < this.mYVals.size(); i14++) {
            arrayList.add(((BarEntry) this.mYVals.get(i14)).copy());
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, getLabel());
        barDataSet.mColors = this.mColors;
        barDataSet.mStackSize = this.mStackSize;
        barDataSet.mBarSpace = this.mBarSpace;
        barDataSet.mBarShadowColor = this.mBarShadowColor;
        barDataSet.mStackLabels = this.mStackLabels;
        barDataSet.mHighLightColor = this.mHighLightColor;
        barDataSet.mHighLightAlpha = this.mHighLightAlpha;
        return barDataSet;
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

    public int getEntryCountStacks() {
        return this.mEntryCountStacks;
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
}
