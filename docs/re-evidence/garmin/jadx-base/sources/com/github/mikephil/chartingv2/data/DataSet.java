package com.github.mikephil.chartingv2.data;

import com.airbnb.lottie.animation.keyframe.a;
import com.github.mikephil.chartingv2.data.Entry;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class DataSet<T extends Entry> extends BaseDataSet<T> {
    protected float mYMax;
    protected float mYMin;
    protected List<T> mYVals;

    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public DataSet(List<T> list, String str) {
        super(str);
        this.mYMax = 0.0f;
        this.mYMin = 0.0f;
        this.mYVals = list;
        if (list == null) {
            this.mYVals = new ArrayList();
        }
        calcMinMax(0, this.mYVals.size());
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public boolean addEntry(T t7) {
        if (t7 == null) {
            return false;
        }
        float val = t7.getVal();
        List<T> yVals = getYVals();
        if (yVals == null) {
            yVals = new ArrayList<>();
        }
        if (yVals.size() == 0) {
            this.mYMax = val;
            this.mYMin = val;
        } else {
            if (this.mYMax < val) {
                this.mYMax = val;
            }
            if (this.mYMin > val) {
                this.mYMin = val;
            }
        }
        yVals.add(t7);
        return true;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void addEntryOrdered(T t7) {
        if (t7 == null) {
            return;
        }
        float val = t7.getVal();
        if (this.mYVals == null) {
            this.mYVals = new ArrayList();
        }
        if (this.mYVals.size() == 0) {
            this.mYMax = val;
            this.mYMin = val;
        } else {
            if (this.mYMax < val) {
                this.mYMax = val;
            }
            if (this.mYMin > val) {
                this.mYMin = val;
            }
        }
        if (this.mYVals.size() <= 0 || ((Entry) a.c(1, this.mYVals)).getXIndex() <= t7.getXIndex()) {
            this.mYVals.add(t7);
        } else {
            this.mYVals.add(getEntryIndex(t7.getXIndex(), Rounding.UP), t7);
        }
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void calcMinMax(int i14, int i15) {
        int size;
        List<T> list = this.mYVals;
        if (list == null || (size = list.size()) == 0) {
            return;
        }
        if (i15 == 0 || i15 >= size) {
            i15 = size - 1;
        }
        this.mYMin = Float.MAX_VALUE;
        this.mYMax = -3.4028235E38f;
        while (i14 <= i15) {
            T t7 = this.mYVals.get(i14);
            if (t7 != null && !Float.isNaN(t7.getVal())) {
                if (t7.getVal() < this.mYMin) {
                    this.mYMin = t7.getVal();
                }
                if (t7.getVal() > this.mYMax) {
                    this.mYMax = t7.getVal();
                }
            }
            i14++;
        }
        if (this.mYMin == Float.MAX_VALUE) {
            this.mYMin = 0.0f;
            this.mYMax = 0.0f;
        }
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void clear() {
        this.mYVals.clear();
        notifyDataSetChanged();
    }

    public abstract DataSet<T> copy();

    public List<T> getEntriesForXIndex(int i14) {
        ArrayList arrayList = new ArrayList();
        int size = this.mYVals.size() - 1;
        int i15 = 0;
        while (i15 <= size) {
            int i16 = (size + i15) / 2;
            T t7 = this.mYVals.get(i16);
            if (i14 == t7.getXIndex()) {
                while (i16 > 0 && this.mYVals.get(i16 - 1).getXIndex() == i14) {
                    i16--;
                }
                size = this.mYVals.size();
                while (i16 < size) {
                    t7 = this.mYVals.get(i16);
                    if (t7.getXIndex() != i14) {
                        break;
                    }
                    arrayList.add(t7);
                    i16++;
                }
            }
            if (i14 > t7.getXIndex()) {
                i15 = i16 + 1;
            } else {
                size = i16 - 1;
            }
        }
        return arrayList;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public int getEntryCount() {
        return this.mYVals.size();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public T getEntryForIndex(int i14) {
        return this.mYVals.get(i14);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public T getEntryForXIndex(int i14, Rounding rounding) {
        int entryIndex = getEntryIndex(i14, rounding);
        if (entryIndex > -1) {
            return this.mYVals.get(entryIndex);
        }
        return null;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public int getEntryIndex(int i14, Rounding rounding) {
        int size = this.mYVals.size() - 1;
        int i15 = 0;
        int i16 = -1;
        while (i15 <= size) {
            i16 = (size + i15) / 2;
            if (i14 == this.mYVals.get(i16).getXIndex()) {
                while (i16 > 0 && this.mYVals.get(i16 - 1).getXIndex() == i14) {
                    i16--;
                }
                return i16;
            }
            if (i14 > this.mYVals.get(i16).getXIndex()) {
                i15 = i16 + 1;
            } else {
                size = i16 - 1;
            }
        }
        if (i16 == -1) {
            return i16;
        }
        int xIndex = this.mYVals.get(i16).getXIndex();
        if (rounding == Rounding.UP) {
            return (xIndex >= i14 || i16 >= this.mYVals.size() + (-1)) ? i16 : i16 + 1;
        }
        return (rounding != Rounding.DOWN || xIndex <= i14 || i16 <= 0) ? i16 : i16 - 1;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public float getYMax() {
        return this.mYMax;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public float getYMin() {
        return this.mYMin;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public float getYValForXIndex(int i14) {
        Entry entryForXIndex = getEntryForXIndex(i14);
        if (entryForXIndex == null || entryForXIndex.getXIndex() != i14) {
            return Float.NaN;
        }
        return entryForXIndex.getVal();
    }

    public List<T> getYVals() {
        return this.mYVals;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public boolean removeEntry(T t7) {
        List<T> list;
        if (t7 == null || (list = this.mYVals) == null) {
            return false;
        }
        boolean zRemove = list.remove(t7);
        if (zRemove) {
            calcMinMax(0, this.mYVals.size());
        }
        return zRemove;
    }

    public String toSimpleString() {
        StringBuilder sb3 = new StringBuilder("DataSet, label: ");
        sb3.append(getLabel() == null ? "" : getLabel());
        sb3.append(", entries: ");
        sb3.append(this.mYVals.size());
        sb3.append("\n");
        return sb3.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(toSimpleString());
        for (int i14 = 0; i14 < this.mYVals.size(); i14++) {
            stringBuffer.append(this.mYVals.get(i14).toString() + StringUtils.SPACE);
        }
        return stringBuffer.toString();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public T getEntryForXIndex(int i14) {
        return (T) getEntryForXIndex(i14, Rounding.CLOSEST);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public int getEntryIndex(Entry entry) {
        return this.mYVals.indexOf(entry);
    }
}
