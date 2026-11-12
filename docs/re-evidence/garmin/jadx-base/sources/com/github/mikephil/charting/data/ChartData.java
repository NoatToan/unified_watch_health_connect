package com.github.mikephil.charting.data;

import android.graphics.Typeface;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ChartData<T extends IDataSet<? extends Entry>> {
    protected List<T> mDataSets;
    protected float mLeftAxisMax;
    protected float mLeftAxisMin;
    protected float mRightAxisMax;
    protected float mRightAxisMin;
    protected float mXMax;
    protected float mXMin;
    protected float mYMax;
    protected float mYMin;

    public ChartData(T... tArr) {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = arrayToList(tArr);
        notifyDataChanged();
    }

    private List<T> arrayToList(T[] tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t7 : tArr) {
            arrayList.add(t7);
        }
        return arrayList;
    }

    public void addDataSet(T t7) {
        if (t7 == null) {
            return;
        }
        calcMinMax(t7);
        this.mDataSets.add(t7);
    }

    public void addEntry(Entry entry, int i14) {
        if (this.mDataSets.size() <= i14 || i14 < 0) {
            return;
        }
        T t7 = this.mDataSets.get(i14);
        if (t7.addEntry(entry)) {
            calcMinMax(entry, t7.getAxisDependency());
        }
    }

    public void calcMinMax() {
        List<T> list = this.mDataSets;
        if (list == null) {
            return;
        }
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            calcMinMax(it.next());
        }
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        IDataSet firstLeft = getFirstLeft(this.mDataSets);
        if (firstLeft != null) {
            this.mLeftAxisMax = firstLeft.getYMax();
            this.mLeftAxisMin = firstLeft.getYMin();
            for (T t7 : this.mDataSets) {
                if (t7.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                    if (t7.getYMin() < this.mLeftAxisMin) {
                        this.mLeftAxisMin = t7.getYMin();
                    }
                    if (t7.getYMax() > this.mLeftAxisMax) {
                        this.mLeftAxisMax = t7.getYMax();
                    }
                }
            }
        }
        IDataSet firstRight = getFirstRight(this.mDataSets);
        if (firstRight != null) {
            this.mRightAxisMax = firstRight.getYMax();
            this.mRightAxisMin = firstRight.getYMin();
            for (T t14 : this.mDataSets) {
                if (t14.getAxisDependency() == YAxis.AxisDependency.RIGHT) {
                    if (t14.getYMin() < this.mRightAxisMin) {
                        this.mRightAxisMin = t14.getYMin();
                    }
                    if (t14.getYMax() > this.mRightAxisMax) {
                        this.mRightAxisMax = t14.getYMax();
                    }
                }
            }
        }
    }

    public void calcMinMaxY(float f14, float f15) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().calcMinMaxY(f14, f15);
        }
        calcMinMax();
    }

    public void clearValues() {
        List<T> list = this.mDataSets;
        if (list != null) {
            list.clear();
        }
        notifyDataChanged();
    }

    public boolean contains(T t7) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            if (it.next().equals(t7)) {
                return true;
            }
        }
        return false;
    }

    public int[] getColors() {
        if (this.mDataSets == null) {
            return null;
        }
        int size = 0;
        for (int i14 = 0; i14 < this.mDataSets.size(); i14++) {
            size += this.mDataSets.get(i14).getColors().size();
        }
        int[] iArr = new int[size];
        int i15 = 0;
        for (int i16 = 0; i16 < this.mDataSets.size(); i16++) {
            Iterator<Integer> it = this.mDataSets.get(i16).getColors().iterator();
            while (it.hasNext()) {
                iArr[i15] = it.next().intValue();
                i15++;
            }
        }
        return iArr;
    }

    public T getDataSetByIndex(int i14) {
        List<T> list = this.mDataSets;
        if (list == null || i14 < 0 || i14 >= list.size()) {
            return null;
        }
        return this.mDataSets.get(i14);
    }

    public T getDataSetByLabel(String str, boolean z14) {
        int dataSetIndexByLabel = getDataSetIndexByLabel(this.mDataSets, str, z14);
        if (dataSetIndexByLabel < 0 || dataSetIndexByLabel >= this.mDataSets.size()) {
            return null;
        }
        return this.mDataSets.get(dataSetIndexByLabel);
    }

    public int getDataSetCount() {
        List<T> list = this.mDataSets;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T getDataSetForEntry(Entry entry) {
        if (entry == null) {
            return null;
        }
        for (int i14 = 0; i14 < this.mDataSets.size(); i14++) {
            T t7 = this.mDataSets.get(i14);
            for (int i15 = 0; i15 < t7.getEntryCount(); i15++) {
                if (entry.equalTo(t7.getEntryForXValue(entry.getX(), entry.getY()))) {
                    return t7;
                }
            }
        }
        return null;
    }

    public int getDataSetIndexByLabel(List<T> list, String str, boolean z14) {
        int i14 = 0;
        if (z14) {
            while (i14 < list.size()) {
                if (str.equalsIgnoreCase(list.get(i14).getLabel())) {
                    return i14;
                }
                i14++;
            }
            return -1;
        }
        while (i14 < list.size()) {
            if (str.equals(list.get(i14).getLabel())) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public String[] getDataSetLabels() {
        String[] strArr = new String[this.mDataSets.size()];
        for (int i14 = 0; i14 < this.mDataSets.size(); i14++) {
            strArr[i14] = this.mDataSets.get(i14).getLabel();
        }
        return strArr;
    }

    public List<T> getDataSets() {
        return this.mDataSets;
    }

    public int getEntryCount() {
        Iterator<T> it = this.mDataSets.iterator();
        int entryCount = 0;
        while (it.hasNext()) {
            entryCount += it.next().getEntryCount();
        }
        return entryCount;
    }

    public Entry getEntryForHighlight(Highlight highlight) {
        if (highlight.getDataSetIndex() >= this.mDataSets.size()) {
            return null;
        }
        return this.mDataSets.get(highlight.getDataSetIndex()).getEntryForXValue(highlight.getX(), highlight.getY());
    }

    public T getFirstLeft(List<T> list) {
        for (T t7 : list) {
            if (t7.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                return t7;
            }
        }
        return null;
    }

    public T getFirstRight(List<T> list) {
        for (T t7 : list) {
            if (t7.getAxisDependency() == YAxis.AxisDependency.RIGHT) {
                return t7;
            }
        }
        return null;
    }

    public int getIndexOfDataSet(T t7) {
        return this.mDataSets.indexOf(t7);
    }

    public T getMaxEntryCountSet() {
        List<T> list = this.mDataSets;
        if (list == null || list.isEmpty()) {
            return null;
        }
        T t7 = this.mDataSets.get(0);
        for (T t14 : this.mDataSets) {
            if (t14.getEntryCount() > t7.getEntryCount()) {
                t7 = t14;
            }
        }
        return t7;
    }

    public float getXMax() {
        return this.mXMax;
    }

    public float getXMin() {
        return this.mXMin;
    }

    public float getYMax(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f14 = this.mLeftAxisMax;
            return f14 == -3.4028235E38f ? this.mRightAxisMax : f14;
        }
        float f15 = this.mRightAxisMax;
        return f15 == -3.4028235E38f ? this.mLeftAxisMax : f15;
    }

    public float getYMin(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            float f14 = this.mLeftAxisMin;
            return f14 == Float.MAX_VALUE ? this.mRightAxisMin : f14;
        }
        float f15 = this.mRightAxisMin;
        return f15 == Float.MAX_VALUE ? this.mLeftAxisMin : f15;
    }

    public boolean isHighlightEnabled() {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            if (!it.next().isHighlightEnabled()) {
                return false;
            }
        }
        return true;
    }

    public void notifyDataChanged() {
        calcMinMax();
    }

    public boolean removeDataSet(int i14) {
        if (i14 >= this.mDataSets.size() || i14 < 0) {
            return false;
        }
        return removeDataSet(this.mDataSets.get(i14));
    }

    public boolean removeEntry(Entry entry, int i14) {
        T t7;
        if (entry == null || i14 >= this.mDataSets.size() || (t7 = this.mDataSets.get(i14)) == null) {
            return false;
        }
        boolean zRemoveEntry = t7.removeEntry(entry);
        if (zRemoveEntry) {
            calcMinMax();
        }
        return zRemoveEntry;
    }

    public void setDrawValues(boolean z14) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setDrawValues(z14);
        }
    }

    public void setHighlightEnabled(boolean z14) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setHighlightEnabled(z14);
        }
    }

    public void setValueFormatter(ValueFormatter valueFormatter) {
        if (valueFormatter == null) {
            return;
        }
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueFormatter(valueFormatter);
        }
    }

    public void setValueTextColor(int i14) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTextColor(i14);
        }
    }

    public void setValueTextColors(List<Integer> list) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTextColors(list);
        }
    }

    public void setValueTextSize(float f14) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTextSize(f14);
        }
    }

    public void setValueTypeface(Typeface typeface) {
        Iterator<T> it = this.mDataSets.iterator();
        while (it.hasNext()) {
            it.next().setValueTypeface(typeface);
        }
    }

    public float getYMax() {
        return this.mYMax;
    }

    public float getYMin() {
        return this.mYMin;
    }

    public boolean removeDataSet(T t7) {
        if (t7 == null) {
            return false;
        }
        boolean zRemove = this.mDataSets.remove(t7);
        if (zRemove) {
            calcMinMax();
        }
        return zRemove;
    }

    public boolean removeEntry(float f14, int i14) {
        Entry entryForXValue;
        if (i14 < this.mDataSets.size() && (entryForXValue = this.mDataSets.get(i14).getEntryForXValue(f14, Float.NaN)) != null) {
            return removeEntry(entryForXValue, i14);
        }
        return false;
    }

    public ChartData() {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = new ArrayList();
    }

    public ChartData(List<T> list) {
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mLeftAxisMax = -3.4028235E38f;
        this.mLeftAxisMin = Float.MAX_VALUE;
        this.mRightAxisMax = -3.4028235E38f;
        this.mRightAxisMin = Float.MAX_VALUE;
        this.mDataSets = list;
        notifyDataChanged();
    }

    public void calcMinMax(Entry entry, YAxis.AxisDependency axisDependency) {
        if (this.mYMax < entry.getY()) {
            this.mYMax = entry.getY();
        }
        if (this.mYMin > entry.getY()) {
            this.mYMin = entry.getY();
        }
        if (this.mXMax < entry.getX()) {
            this.mXMax = entry.getX();
        }
        if (this.mXMin > entry.getX()) {
            this.mXMin = entry.getX();
        }
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            if (this.mLeftAxisMax < entry.getY()) {
                this.mLeftAxisMax = entry.getY();
            }
            if (this.mLeftAxisMin > entry.getY()) {
                this.mLeftAxisMin = entry.getY();
                return;
            }
            return;
        }
        if (this.mRightAxisMax < entry.getY()) {
            this.mRightAxisMax = entry.getY();
        }
        if (this.mRightAxisMin > entry.getY()) {
            this.mRightAxisMin = entry.getY();
        }
    }

    public void calcMinMax(T t7) {
        if (this.mYMax < t7.getYMax()) {
            this.mYMax = t7.getYMax();
        }
        if (this.mYMin > t7.getYMin()) {
            this.mYMin = t7.getYMin();
        }
        if (this.mXMax < t7.getXMax()) {
            this.mXMax = t7.getXMax();
        }
        if (this.mXMin > t7.getXMin()) {
            this.mXMin = t7.getXMin();
        }
        if (t7.getAxisDependency() == YAxis.AxisDependency.LEFT) {
            if (this.mLeftAxisMax < t7.getYMax()) {
                this.mLeftAxisMax = t7.getYMax();
            }
            if (this.mLeftAxisMin > t7.getYMin()) {
                this.mLeftAxisMin = t7.getYMin();
                return;
            }
            return;
        }
        if (this.mRightAxisMax < t7.getYMax()) {
            this.mRightAxisMax = t7.getYMax();
        }
        if (this.mRightAxisMin > t7.getYMin()) {
            this.mRightAxisMin = t7.getYMin();
        }
    }
}
