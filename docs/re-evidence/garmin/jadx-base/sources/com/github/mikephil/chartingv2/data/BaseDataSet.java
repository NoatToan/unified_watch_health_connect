package com.github.mikephil.chartingv2.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.formatter.DefaultValueFormatter;
import com.github.mikephil.chartingv2.formatter.ValueFormatter;
import com.github.mikephil.chartingv2.interfaces.datasets.IDataSet;
import com.github.mikephil.chartingv2.utils.ColorTemplate;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class BaseDataSet<T extends Entry> implements IDataSet<T> {
    protected YAxis.AxisDependency mAxisDependency;
    protected List<Integer> mColors;
    protected boolean mDrawValues;
    protected boolean mHighlightEnabled;
    private String mLabel;
    protected List<Integer> mValueColors;
    protected transient ValueFormatter mValueFormatter;
    protected float mValueTextSize;
    protected Typeface mValueTypeface;
    protected boolean mVisible;

    public BaseDataSet() {
        this.mColors = null;
        this.mValueColors = null;
        this.mLabel = "DataSet";
        this.mAxisDependency = YAxis.AxisDependency.LEFT;
        this.mHighlightEnabled = true;
        this.mDrawValues = true;
        this.mValueTextSize = 17.0f;
        this.mVisible = true;
        this.mColors = new ArrayList();
        this.mValueColors = new ArrayList();
        this.mColors.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        this.mValueColors.add(-16777216);
    }

    public void addColor(int i14) {
        if (this.mColors == null) {
            this.mColors = new ArrayList();
        }
        this.mColors.add(Integer.valueOf(i14));
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public boolean contains(T t7) {
        for (int i14 = 0; i14 < getEntryCount(); i14++) {
            if (getEntryForIndex(i14).equals(t7)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public YAxis.AxisDependency getAxisDependency() {
        return this.mAxisDependency;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public int getColor(int i14) {
        List<Integer> list = this.mColors;
        return list.get(i14 % list.size()).intValue();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public List<Integer> getColors() {
        return this.mColors;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public int getIndexInEntries(int i14) {
        for (int i15 = 0; i15 < getEntryCount(); i15++) {
            if (i14 == getEntryForIndex(i15).getXIndex()) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public String getLabel() {
        return this.mLabel;
    }

    public List<Integer> getValueColors() {
        return this.mValueColors;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public ValueFormatter getValueFormatter() {
        ValueFormatter valueFormatter = this.mValueFormatter;
        return valueFormatter == null ? new DefaultValueFormatter(1) : valueFormatter;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public int getValueTextColor(int i14) {
        List<Integer> list = this.mValueColors;
        return list.get(i14 % list.size()).intValue();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public float getValueTextSize() {
        return this.mValueTextSize;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public Typeface getValueTypeface() {
        return this.mValueTypeface;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public boolean isDrawValuesEnabled() {
        return this.mDrawValues;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public boolean isHighlightEnabled() {
        return this.mHighlightEnabled;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public boolean isVisible() {
        return this.mVisible;
    }

    public void notifyDataSetChanged() {
        calcMinMax(0, getEntryCount() - 1);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public boolean removeEntry(int i14) {
        return removeEntry(getEntryForXIndex(i14));
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public boolean removeFirst() {
        return removeEntry(getEntryForIndex(0));
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public boolean removeLast() {
        return removeEntry(getEntryForIndex(getEntryCount() - 1));
    }

    public void resetColors() {
        this.mColors = new ArrayList();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void setAxisDependency(YAxis.AxisDependency axisDependency) {
        this.mAxisDependency = axisDependency;
    }

    public void setColor(int i14, int i15) {
        setColor(Color.argb(i15, Color.red(i14), Color.green(i14), Color.blue(i14)));
    }

    public void setColors(int[] iArr, Context context) {
        ArrayList arrayList = new ArrayList();
        for (int i14 : iArr) {
            arrayList.add(Integer.valueOf(context.getResources().getColor(i14)));
        }
        this.mColors = arrayList;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void setDrawValues(boolean z14) {
        this.mDrawValues = z14;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void setHighlightEnabled(boolean z14) {
        this.mHighlightEnabled = z14;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void setLabel(String str) {
        this.mLabel = str;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void setValueFormatter(ValueFormatter valueFormatter) {
        if (valueFormatter == null) {
            return;
        }
        this.mValueFormatter = valueFormatter;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void setValueTextColor(int i14) {
        this.mValueColors.clear();
        this.mValueColors.add(Integer.valueOf(i14));
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void setValueTextColors(List<Integer> list) {
        this.mValueColors = list;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void setValueTextSize(float f14) {
        this.mValueTextSize = Utils.convertDpToPixel(f14);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void setValueTypeface(Typeface typeface) {
        this.mValueTypeface = typeface;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void setVisible(boolean z14) {
        this.mVisible = z14;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public int getColor() {
        return this.mColors.get(0).intValue();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public int getValueTextColor() {
        return this.mValueColors.get(0).intValue();
    }

    public void setColor(int i14) {
        resetColors();
        this.mColors.add(Integer.valueOf(i14));
    }

    public void setColors(int[] iArr) {
        this.mColors = ColorTemplate.createColors(iArr);
    }

    public void setColors(List<Integer> list) {
        this.mColors = list;
    }

    public void setColors(int[] iArr, int i14) {
        resetColors();
        for (int i15 : iArr) {
            addColor(Color.argb(i14, Color.red(i15), Color.green(i15), Color.blue(i15)));
        }
    }

    public BaseDataSet(String str) {
        this();
        this.mLabel = str;
    }
}
