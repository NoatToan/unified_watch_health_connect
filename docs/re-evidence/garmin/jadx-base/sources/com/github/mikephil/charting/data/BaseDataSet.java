package com.github.mikephil.charting.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseDataSet<T extends Entry> implements IDataSet<T> {
    protected YAxis.AxisDependency mAxisDependency;
    protected List<Integer> mColors;
    protected boolean mDrawIcons;
    protected boolean mDrawValues;
    private Legend.LegendForm mForm;
    private DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    protected GradientColor mGradientColor;
    protected List<GradientColor> mGradientColors;
    protected boolean mHighlightEnabled;
    protected MPPointF mIconsOffset;
    private String mLabel;
    protected List<Integer> mValueColors;
    protected transient ValueFormatter mValueFormatter;
    protected float mValueTextSize;
    protected Typeface mValueTypeface;
    protected boolean mVisible;

    public BaseDataSet() {
        this.mColors = null;
        this.mGradientColor = null;
        this.mGradientColors = null;
        this.mValueColors = null;
        this.mLabel = "DataSet";
        this.mAxisDependency = YAxis.AxisDependency.LEFT;
        this.mHighlightEnabled = true;
        this.mForm = Legend.LegendForm.DEFAULT;
        this.mFormSize = Float.NaN;
        this.mFormLineWidth = Float.NaN;
        this.mFormLineDashEffect = null;
        this.mDrawValues = true;
        this.mDrawIcons = true;
        this.mIconsOffset = new MPPointF();
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

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean contains(T t7) {
        for (int i14 = 0; i14 < getEntryCount(); i14++) {
            if (getEntryForIndex(i14).equals(t7)) {
                return true;
            }
        }
        return false;
    }

    public void copy(BaseDataSet baseDataSet) {
        baseDataSet.mAxisDependency = this.mAxisDependency;
        baseDataSet.mColors = this.mColors;
        baseDataSet.mDrawIcons = this.mDrawIcons;
        baseDataSet.mDrawValues = this.mDrawValues;
        baseDataSet.mForm = this.mForm;
        baseDataSet.mFormLineDashEffect = this.mFormLineDashEffect;
        baseDataSet.mFormLineWidth = this.mFormLineWidth;
        baseDataSet.mFormSize = this.mFormSize;
        baseDataSet.mGradientColor = this.mGradientColor;
        baseDataSet.mGradientColors = this.mGradientColors;
        baseDataSet.mHighlightEnabled = this.mHighlightEnabled;
        baseDataSet.mIconsOffset = this.mIconsOffset;
        baseDataSet.mValueColors = this.mValueColors;
        baseDataSet.mValueFormatter = this.mValueFormatter;
        baseDataSet.mValueColors = this.mValueColors;
        baseDataSet.mValueTextSize = this.mValueTextSize;
        baseDataSet.mVisible = this.mVisible;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public YAxis.AxisDependency getAxisDependency() {
        return this.mAxisDependency;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getColor(int i14) {
        List<Integer> list = this.mColors;
        return list.get(i14 % list.size()).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<Integer> getColors() {
        return this.mColors;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public Legend.LegendForm getForm() {
        return this.mForm;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public DashPathEffect getFormLineDashEffect() {
        return this.mFormLineDashEffect;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getFormLineWidth() {
        return this.mFormLineWidth;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getFormSize() {
        return this.mFormSize;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public GradientColor getGradientColor(int i14) {
        List<GradientColor> list = this.mGradientColors;
        return list.get(i14 % list.size());
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<GradientColor> getGradientColors() {
        return this.mGradientColors;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public MPPointF getIconsOffset() {
        return this.mIconsOffset;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getIndexInEntries(int i14) {
        for (int i15 = 0; i15 < getEntryCount(); i15++) {
            if (i14 == getEntryForIndex(i15).getX()) {
                return i15;
            }
        }
        return -1;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public String getLabel() {
        return this.mLabel;
    }

    public List<Integer> getValueColors() {
        return this.mValueColors;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public ValueFormatter getValueFormatter() {
        return needsFormatter() ? Utils.getDefaultValueFormatter() : this.mValueFormatter;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getValueTextColor(int i14) {
        List<Integer> list = this.mValueColors;
        return list.get(i14 % list.size()).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getValueTextSize() {
        return this.mValueTextSize;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public Typeface getValueTypeface() {
        return this.mValueTypeface;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean isDrawIconsEnabled() {
        return this.mDrawIcons;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean isDrawValuesEnabled() {
        return this.mDrawValues;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean isHighlightEnabled() {
        return this.mHighlightEnabled;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean isVisible() {
        return this.mVisible;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean needsFormatter() {
        return this.mValueFormatter == null;
    }

    public void notifyDataSetChanged() {
        calcMinMax();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeEntry(int i14) {
        return removeEntry(getEntryForIndex(i14));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeEntryByXValue(float f14) {
        return removeEntry(getEntryForXValue(f14, Float.NaN));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeFirst() {
        if (getEntryCount() > 0) {
            return removeEntry(getEntryForIndex(0));
        }
        return false;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeLast() {
        if (getEntryCount() > 0) {
            return removeEntry(getEntryForIndex(getEntryCount() - 1));
        }
        return false;
    }

    public void resetColors() {
        if (this.mColors == null) {
            this.mColors = new ArrayList();
        }
        this.mColors.clear();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setAxisDependency(YAxis.AxisDependency axisDependency) {
        this.mAxisDependency = axisDependency;
    }

    public void setColor(int i14, int i15) {
        setColor(Color.argb(i15, Color.red(i14), Color.green(i14), Color.blue(i14)));
    }

    public void setColors(int[] iArr, Context context) {
        if (this.mColors == null) {
            this.mColors = new ArrayList();
        }
        this.mColors.clear();
        for (int i14 : iArr) {
            this.mColors.add(Integer.valueOf(context.getResources().getColor(i14)));
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setDrawIcons(boolean z14) {
        this.mDrawIcons = z14;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setDrawValues(boolean z14) {
        this.mDrawValues = z14;
    }

    public void setForm(Legend.LegendForm legendForm) {
        this.mForm = legendForm;
    }

    public void setFormLineDashEffect(DashPathEffect dashPathEffect) {
        this.mFormLineDashEffect = dashPathEffect;
    }

    public void setFormLineWidth(float f14) {
        this.mFormLineWidth = f14;
    }

    public void setFormSize(float f14) {
        this.mFormSize = f14;
    }

    public void setGradientColor(int i14, int i15) {
        this.mGradientColor = new GradientColor(i14, i15);
    }

    public void setGradientColors(List<GradientColor> list) {
        this.mGradientColors = list;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setHighlightEnabled(boolean z14) {
        this.mHighlightEnabled = z14;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setIconsOffset(MPPointF mPPointF) {
        MPPointF mPPointF2 = this.mIconsOffset;
        mPPointF2.f52828x = mPPointF.f52828x;
        mPPointF2.f52829y = mPPointF.f52829y;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setLabel(String str) {
        this.mLabel = str;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueFormatter(ValueFormatter valueFormatter) {
        if (valueFormatter == null) {
            return;
        }
        this.mValueFormatter = valueFormatter;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueTextColor(int i14) {
        this.mValueColors.clear();
        this.mValueColors.add(Integer.valueOf(i14));
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueTextColors(List<Integer> list) {
        this.mValueColors = list;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueTextSize(float f14) {
        this.mValueTextSize = Utils.convertDpToPixel(f14);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setValueTypeface(Typeface typeface) {
        this.mValueTypeface = typeface;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void setVisible(boolean z14) {
        this.mVisible = z14;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public GradientColor getGradientColor() {
        return this.mGradientColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getColor() {
        return this.mColors.get(0).intValue();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getValueTextColor() {
        return this.mValueColors.get(0).intValue();
    }

    public void setColor(int i14) {
        resetColors();
        this.mColors.add(Integer.valueOf(i14));
    }

    public void setColors(int... iArr) {
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
