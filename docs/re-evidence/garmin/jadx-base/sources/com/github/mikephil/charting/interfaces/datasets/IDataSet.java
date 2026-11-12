package com.github.mikephil.charting.interfaces.datasets;

import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.MPPointF;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public interface IDataSet<T extends Entry> {
    boolean addEntry(T t7);

    void addEntryOrdered(T t7);

    void calcMinMax();

    void calcMinMaxY(float f14, float f15);

    void clear();

    boolean contains(T t7);

    YAxis.AxisDependency getAxisDependency();

    int getColor();

    int getColor(int i14);

    List<Integer> getColors();

    List<T> getEntriesForXValue(float f14);

    int getEntryCount();

    T getEntryForIndex(int i14);

    T getEntryForXValue(float f14, float f15);

    T getEntryForXValue(float f14, float f15, DataSet.Rounding rounding);

    int getEntryIndex(float f14, float f15, DataSet.Rounding rounding);

    int getEntryIndex(T t7);

    Legend.LegendForm getForm();

    DashPathEffect getFormLineDashEffect();

    float getFormLineWidth();

    float getFormSize();

    GradientColor getGradientColor();

    GradientColor getGradientColor(int i14);

    List<GradientColor> getGradientColors();

    MPPointF getIconsOffset();

    int getIndexInEntries(int i14);

    String getLabel();

    ValueFormatter getValueFormatter();

    int getValueTextColor();

    int getValueTextColor(int i14);

    float getValueTextSize();

    Typeface getValueTypeface();

    float getXMax();

    float getXMin();

    float getYMax();

    float getYMin();

    boolean isDrawIconsEnabled();

    boolean isDrawValuesEnabled();

    boolean isHighlightEnabled();

    boolean isVisible();

    boolean needsFormatter();

    boolean removeEntry(int i14);

    boolean removeEntry(T t7);

    boolean removeEntryByXValue(float f14);

    boolean removeFirst();

    boolean removeLast();

    void setAxisDependency(YAxis.AxisDependency axisDependency);

    void setDrawIcons(boolean z14);

    void setDrawValues(boolean z14);

    void setHighlightEnabled(boolean z14);

    void setIconsOffset(MPPointF mPPointF);

    void setLabel(String str);

    void setValueFormatter(ValueFormatter valueFormatter);

    void setValueTextColor(int i14);

    void setValueTextColors(List<Integer> list);

    void setValueTextSize(float f14);

    void setValueTypeface(Typeface typeface);

    void setVisible(boolean z14);
}
