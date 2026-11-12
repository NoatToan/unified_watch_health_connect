package com.github.mikephil.chartingv2.interfaces.datasets;

import android.graphics.Typeface;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.DataSet;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.formatter.ValueFormatter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public interface IDataSet<T extends Entry> {
    boolean addEntry(T t7);

    void addEntryOrdered(T t7);

    void calcMinMax(int i14, int i15);

    void clear();

    boolean contains(T t7);

    YAxis.AxisDependency getAxisDependency();

    int getColor();

    int getColor(int i14);

    List<Integer> getColors();

    int getEntryCount();

    T getEntryForIndex(int i14);

    T getEntryForXIndex(int i14);

    T getEntryForXIndex(int i14, DataSet.Rounding rounding);

    int getEntryIndex(int i14, DataSet.Rounding rounding);

    int getEntryIndex(T t7);

    int getIndexInEntries(int i14);

    String getLabel();

    ValueFormatter getValueFormatter();

    int getValueTextColor();

    int getValueTextColor(int i14);

    float getValueTextSize();

    Typeface getValueTypeface();

    float getYMax();

    float getYMin();

    float getYValForXIndex(int i14);

    boolean isDrawValuesEnabled();

    boolean isHighlightEnabled();

    boolean isVisible();

    boolean removeEntry(int i14);

    boolean removeEntry(T t7);

    boolean removeFirst();

    boolean removeLast();

    void setAxisDependency(YAxis.AxisDependency axisDependency);

    void setDrawValues(boolean z14);

    void setHighlightEnabled(boolean z14);

    void setLabel(String str);

    void setValueFormatter(ValueFormatter valueFormatter);

    void setValueTextColor(int i14);

    void setValueTextColors(List<Integer> list);

    void setValueTextSize(float f14);

    void setValueTypeface(Typeface typeface);

    void setVisible(boolean z14);
}
