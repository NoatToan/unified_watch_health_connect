package com.github.mikephil.chartingv2.data;

import android.graphics.Typeface;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.formatter.ValueFormatter;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.datasets.IDataSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class ChartData<T extends IDataSet<? extends Entry>> {
    protected List<T> mDataSets;
    protected float mLeftAxisMax;
    protected float mLeftAxisMin;
    protected float mRightAxisMax;
    protected float mRightAxisMin;
    private float mXValMaximumLength;
    protected List<String> mXVals;
    protected float mYMax;
    protected float mYMin;
    private int mYValCount;

    public ChartData(String[] strArr) {
        this.mYMax = 0.0f;
        this.mYMin = 0.0f;
        this.mLeftAxisMax = 0.0f;
        this.mLeftAxisMin = 0.0f;
        this.mRightAxisMax = 0.0f;
        this.mRightAxisMin = 0.0f;
        this.mYValCount = 0;
        this.mXValMaximumLength = 0.0f;
        this.mXVals = arrayToList(strArr);
        this.mDataSets = new ArrayList();
        init();
    }

    private List<String> arrayToList(String[] strArr) {
        return Arrays.asList(strArr);
    }

    private void calcXValMaximumLength() {
        if (this.mXVals.size() <= 0) {
            this.mXValMaximumLength = 1.0f;
            return;
        }
        int i14 = 1;
        for (int i15 = 0; i15 < this.mXVals.size(); i15++) {
            int length = this.mXVals.get(i15).length();
            if (length > i14) {
                i14 = length;
            }
        }
        this.mXValMaximumLength = i14;
    }

    private void checkLegal() {
        if (this.mDataSets == null || (this instanceof ScatterData) || (this instanceof CombinedData)) {
            return;
        }
        for (int i14 = 0; i14 < this.mDataSets.size(); i14++) {
            if (this.mDataSets.get(i14).getEntryCount() > this.mXVals.size()) {
                h.s("One or more of the DataSet Entry arrays are longer than the x-values array of this ChartData object.");
                return;
            }
        }
    }

    public static List<String> generateXVals(int i14, int i15) {
        ArrayList arrayList = new ArrayList();
        while (i14 < i15) {
            arrayList.add("" + i14);
            i14++;
        }
        return arrayList;
    }

    private void handleEmptyAxis(T t7, T t14) {
        if (t7 == null) {
            this.mLeftAxisMax = this.mRightAxisMax;
            this.mLeftAxisMin = this.mRightAxisMin;
        } else if (t14 == null) {
            this.mRightAxisMax = this.mLeftAxisMax;
            this.mRightAxisMin = this.mLeftAxisMin;
        }
    }

    public void addDataSet(T t7) {
        if (t7 == null) {
            return;
        }
        this.mYValCount = t7.getEntryCount() + this.mYValCount;
        if (this.mDataSets.size() <= 0) {
            this.mYMax = t7.getYMax();
            this.mYMin = t7.getYMin();
            if (t7.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                this.mLeftAxisMax = t7.getYMax();
                this.mLeftAxisMin = t7.getYMin();
            } else {
                this.mRightAxisMax = t7.getYMax();
                this.mRightAxisMin = t7.getYMin();
            }
        } else {
            if (this.mYMax < t7.getYMax()) {
                this.mYMax = t7.getYMax();
            }
            if (this.mYMin > t7.getYMin()) {
                this.mYMin = t7.getYMin();
            }
            if (t7.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                if (this.mLeftAxisMax < t7.getYMax()) {
                    this.mLeftAxisMax = t7.getYMax();
                }
                if (this.mLeftAxisMin > t7.getYMin()) {
                    this.mLeftAxisMin = t7.getYMin();
                }
            } else {
                if (this.mRightAxisMax < t7.getYMax()) {
                    this.mRightAxisMax = t7.getYMax();
                }
                if (this.mRightAxisMin > t7.getYMin()) {
                    this.mRightAxisMin = t7.getYMin();
                }
            }
        }
        this.mDataSets.add(t7);
        handleEmptyAxis(getFirstLeft(), getFirstRight());
    }

    public void addEntry(Entry entry, int i14) {
        if (this.mDataSets.size() <= i14 || i14 < 0) {
            return;
        }
        T t7 = this.mDataSets.get(i14);
        if (t7.addEntry(entry)) {
            float val = entry.getVal();
            if (this.mYValCount == 0) {
                this.mYMin = val;
                this.mYMax = val;
                if (t7.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                    this.mLeftAxisMax = entry.getVal();
                    this.mLeftAxisMin = entry.getVal();
                } else {
                    this.mRightAxisMax = entry.getVal();
                    this.mRightAxisMin = entry.getVal();
                }
            } else {
                if (this.mYMax < val) {
                    this.mYMax = val;
                }
                if (this.mYMin > val) {
                    this.mYMin = val;
                }
                if (t7.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                    if (this.mLeftAxisMax < entry.getVal()) {
                        this.mLeftAxisMax = entry.getVal();
                    }
                    if (this.mLeftAxisMin > entry.getVal()) {
                        this.mLeftAxisMin = entry.getVal();
                    }
                } else {
                    if (this.mRightAxisMax < entry.getVal()) {
                        this.mRightAxisMax = entry.getVal();
                    }
                    if (this.mRightAxisMin > entry.getVal()) {
                        this.mRightAxisMin = entry.getVal();
                    }
                }
            }
            this.mYValCount++;
            handleEmptyAxis(getFirstLeft(), getFirstRight());
        }
    }

    public void addXValue(String str) {
        if (str != null && str.length() > this.mXValMaximumLength) {
            this.mXValMaximumLength = str.length();
        }
        this.mXVals.add(str);
    }

    public void calcMinMax(int i14, int i15) {
        List<T> list = this.mDataSets;
        if (list == null || list.size() < 1) {
            this.mYMax = 0.0f;
            this.mYMin = 0.0f;
            return;
        }
        this.mYMin = Float.MAX_VALUE;
        this.mYMax = -3.4028235E38f;
        for (int i16 = 0; i16 < this.mDataSets.size(); i16++) {
            T t7 = this.mDataSets.get(i16);
            t7.calcMinMax(i14, i15);
            if (t7.getYMin() < this.mYMin) {
                this.mYMin = t7.getYMin();
            }
            if (t7.getYMax() > this.mYMax) {
                this.mYMax = t7.getYMax();
            }
        }
        if (this.mYMin == Float.MAX_VALUE) {
            this.mYMin = 0.0f;
            this.mYMax = 0.0f;
        }
        IDataSet firstLeft = getFirstLeft();
        if (firstLeft != null) {
            this.mLeftAxisMax = firstLeft.getYMax();
            this.mLeftAxisMin = firstLeft.getYMin();
            for (T t14 : this.mDataSets) {
                if (t14.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                    if (t14.getYMin() < this.mLeftAxisMin) {
                        this.mLeftAxisMin = t14.getYMin();
                    }
                    if (t14.getYMax() > this.mLeftAxisMax) {
                        this.mLeftAxisMax = t14.getYMax();
                    }
                }
            }
        }
        IDataSet firstRight = getFirstRight();
        if (firstRight != null) {
            this.mRightAxisMax = firstRight.getYMax();
            this.mRightAxisMin = firstRight.getYMin();
            for (T t15 : this.mDataSets) {
                if (t15.getAxisDependency() == YAxis.AxisDependency.RIGHT) {
                    if (t15.getYMin() < this.mRightAxisMin) {
                        this.mRightAxisMin = t15.getYMin();
                    }
                    if (t15.getYMax() > this.mRightAxisMax) {
                        this.mRightAxisMax = t15.getYMax();
                    }
                }
            }
        }
        handleEmptyAxis(firstLeft, firstRight);
    }

    public void calcYValueCount() {
        this.mYValCount = 0;
        if (this.mDataSets == null) {
            return;
        }
        int entryCount = 0;
        for (int i14 = 0; i14 < this.mDataSets.size(); i14++) {
            entryCount += this.mDataSets.get(i14).getEntryCount();
        }
        this.mYValCount = entryCount;
    }

    public void clearValues() {
        this.mDataSets.clear();
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
                if (entry.equalTo(t7.getEntryForXIndex(entry.getXIndex()))) {
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

    public Entry getEntryForHighlight(Highlight highlight) {
        if (highlight.getDataSetIndex() >= this.mDataSets.size()) {
            return null;
        }
        return this.mDataSets.get(highlight.getDataSetIndex()).getEntryForXIndex(highlight.getXIndex());
    }

    public T getFirstLeft() {
        for (T t7 : this.mDataSets) {
            if (t7.getAxisDependency() == YAxis.AxisDependency.LEFT) {
                return t7;
            }
        }
        return null;
    }

    public T getFirstRight() {
        for (T t7 : this.mDataSets) {
            if (t7.getAxisDependency() == YAxis.AxisDependency.RIGHT) {
                return t7;
            }
        }
        return null;
    }

    public int getIndexOfDataSet(T t7) {
        for (int i14 = 0; i14 < this.mDataSets.size(); i14++) {
            if (this.mDataSets.get(i14) == t7) {
                return i14;
            }
        }
        return -1;
    }

    public int getXValCount() {
        return this.mXVals.size();
    }

    public float getXValMaximumLength() {
        return this.mXValMaximumLength;
    }

    public List<String> getXVals() {
        return this.mXVals;
    }

    public float getYMax(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mLeftAxisMax : this.mRightAxisMax;
    }

    public float getYMin(YAxis.AxisDependency axisDependency) {
        return axisDependency == YAxis.AxisDependency.LEFT ? this.mLeftAxisMin : this.mRightAxisMin;
    }

    public int getYValCount() {
        return this.mYValCount;
    }

    public void init() {
        checkLegal();
        calcYValueCount();
        calcMinMax(0, this.mYValCount);
        calcXValMaximumLength();
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
        init();
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
            int i15 = this.mYValCount - 1;
            this.mYValCount = i15;
            calcMinMax(0, i15);
        }
        return zRemoveEntry;
    }

    public void removeXValue(int i14) {
        this.mXVals.remove(i14);
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
            int entryCount = this.mYValCount - t7.getEntryCount();
            this.mYValCount = entryCount;
            calcMinMax(0, entryCount);
        }
        return zRemove;
    }

    public ChartData(List<String> list) {
        this.mYMax = 0.0f;
        this.mYMin = 0.0f;
        this.mLeftAxisMax = 0.0f;
        this.mLeftAxisMin = 0.0f;
        this.mRightAxisMax = 0.0f;
        this.mRightAxisMin = 0.0f;
        this.mYValCount = 0;
        this.mXValMaximumLength = 0.0f;
        this.mXVals = list;
        this.mDataSets = new ArrayList();
        init();
    }

    public boolean removeEntry(int i14, int i15) {
        Entry entryForXIndex;
        if (i15 < this.mDataSets.size() && (entryForXIndex = this.mDataSets.get(i15).getEntryForXIndex(i14)) != null && entryForXIndex.getXIndex() == i14) {
            return removeEntry(entryForXIndex, i15);
        }
        return false;
    }

    public ChartData() {
        this.mYMax = 0.0f;
        this.mYMin = 0.0f;
        this.mLeftAxisMax = 0.0f;
        this.mLeftAxisMin = 0.0f;
        this.mRightAxisMax = 0.0f;
        this.mRightAxisMin = 0.0f;
        this.mYValCount = 0;
        this.mXValMaximumLength = 0.0f;
        this.mXVals = new ArrayList();
        this.mDataSets = new ArrayList();
    }

    public ChartData(List<String> list, List<T> list2) {
        this.mYMax = 0.0f;
        this.mYMin = 0.0f;
        this.mLeftAxisMax = 0.0f;
        this.mLeftAxisMin = 0.0f;
        this.mRightAxisMax = 0.0f;
        this.mRightAxisMin = 0.0f;
        this.mYValCount = 0;
        this.mXValMaximumLength = 0.0f;
        this.mXVals = list;
        this.mDataSets = list2;
        init();
    }

    public ChartData(String[] strArr, List<T> list) {
        this.mYMax = 0.0f;
        this.mYMin = 0.0f;
        this.mLeftAxisMax = 0.0f;
        this.mLeftAxisMin = 0.0f;
        this.mRightAxisMax = 0.0f;
        this.mRightAxisMin = 0.0f;
        this.mYValCount = 0;
        this.mXValMaximumLength = 0.0f;
        this.mXVals = arrayToList(strArr);
        this.mDataSets = list;
        init();
    }
}
