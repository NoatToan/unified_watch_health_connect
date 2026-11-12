package com.github.mikephil.charting.data;

import com.airbnb.lottie.animation.keyframe.a;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes13.dex */
public abstract class DataSet<T extends Entry> extends BaseDataSet<T> {
    protected List<T> mValues;
    protected float mXMax;
    protected float mXMin;
    protected float mYMax;
    protected float mYMin;

    public enum Rounding {
        UP,
        DOWN,
        CLOSEST
    }

    public DataSet(List<T> list, String str) {
        super(str);
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        this.mValues = list;
        if (list == null) {
            this.mValues = new ArrayList();
        }
        calcMinMax();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean addEntry(T t7) {
        if (t7 == null) {
            return false;
        }
        List<T> values = getValues();
        if (values == null) {
            values = new ArrayList<>();
        }
        calcMinMax(t7);
        return values.add(t7);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void addEntryOrdered(T t7) {
        if (t7 == null) {
            return;
        }
        if (this.mValues == null) {
            this.mValues = new ArrayList();
        }
        calcMinMax(t7);
        if (this.mValues.size() <= 0 || ((Entry) a.c(1, this.mValues)).getX() <= t7.getX()) {
            this.mValues.add(t7);
        } else {
            this.mValues.add(getEntryIndex(t7.getX(), t7.getY(), Rounding.UP), t7);
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void calcMinMax() {
        List<T> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        this.mXMax = -3.4028235E38f;
        this.mXMin = Float.MAX_VALUE;
        Iterator<T> it = this.mValues.iterator();
        while (it.hasNext()) {
            calcMinMax(it.next());
        }
    }

    public void calcMinMaxX(T t7) {
        if (t7.getX() < this.mXMin) {
            this.mXMin = t7.getX();
        }
        if (t7.getX() > this.mXMax) {
            this.mXMax = t7.getX();
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void calcMinMaxY(float f14, float f15) {
        List<T> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mYMax = -3.4028235E38f;
        this.mYMin = Float.MAX_VALUE;
        int entryIndex = getEntryIndex(f15, Float.NaN, Rounding.UP);
        for (int entryIndex2 = getEntryIndex(f14, Float.NaN, Rounding.DOWN); entryIndex2 <= entryIndex; entryIndex2++) {
            calcMinMaxY(this.mValues.get(entryIndex2));
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public void clear() {
        this.mValues.clear();
        notifyDataSetChanged();
    }

    public abstract DataSet<T> copy();

    public void copy(DataSet dataSet) {
        super.copy((BaseDataSet) dataSet);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public List<T> getEntriesForXValue(float f14) {
        ArrayList arrayList = new ArrayList();
        int size = this.mValues.size() - 1;
        int i14 = 0;
        while (i14 <= size) {
            int i15 = (size + i14) / 2;
            T t7 = this.mValues.get(i15);
            if (f14 == t7.getX()) {
                while (i15 > 0 && this.mValues.get(i15 - 1).getX() == f14) {
                    i15--;
                }
                int size2 = this.mValues.size();
                while (i15 < size2) {
                    T t14 = this.mValues.get(i15);
                    if (t14.getX() != f14) {
                        break;
                    }
                    arrayList.add(t14);
                    i15++;
                }
                break;
            }
            if (f14 > t7.getX()) {
                i14 = i15 + 1;
            } else {
                size = i15 - 1;
            }
        }
        return arrayList;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryCount() {
        return this.mValues.size();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public T getEntryForIndex(int i14) {
        return this.mValues.get(i14);
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public T getEntryForXValue(float f14, float f15, Rounding rounding) {
        int entryIndex = getEntryIndex(f14, f15, rounding);
        if (entryIndex > -1) {
            return this.mValues.get(entryIndex);
        }
        return null;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryIndex(float f14, float f15, Rounding rounding) {
        int i14;
        T t7;
        List<T> list = this.mValues;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = this.mValues.size() - 1;
        int i15 = 0;
        while (i15 < size) {
            int i16 = (i15 + size) / 2;
            float x14 = this.mValues.get(i16).getX() - f14;
            int i17 = i16 + 1;
            float x15 = this.mValues.get(i17).getX() - f14;
            float fAbs = Math.abs(x14);
            float fAbs2 = Math.abs(x15);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d14 = x14;
                    if (d14 < 0.0d) {
                        if (d14 < 0.0d) {
                        }
                    }
                }
                size = i16;
            }
            i15 = i17;
        }
        if (size != -1) {
            float x16 = this.mValues.get(size).getX();
            if (rounding == Rounding.UP) {
                if (x16 < f14 && size < this.mValues.size() - 1) {
                    size++;
                }
            } else if (rounding == Rounding.DOWN && x16 > f14 && size > 0) {
                size--;
            }
            if (!Float.isNaN(f15)) {
                while (size > 0 && this.mValues.get(size - 1).getX() == x16) {
                    size--;
                }
                float y14 = this.mValues.get(size).getY();
                loop2: while (true) {
                    i14 = size;
                    do {
                        size++;
                        if (size >= this.mValues.size()) {
                            break loop2;
                        }
                        t7 = this.mValues.get(size);
                        if (t7.getX() != x16) {
                            break loop2;
                        }
                    } while (Math.abs(t7.getY() - f15) >= Math.abs(y14 - f15));
                    y14 = f15;
                }
                return i14;
            }
        }
        return size;
    }

    public List<T> getValues() {
        return this.mValues;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getXMax() {
        return this.mXMax;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getXMin() {
        return this.mXMin;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getYMax() {
        return this.mYMax;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public float getYMin() {
        return this.mYMin;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public boolean removeEntry(T t7) {
        List<T> list;
        if (t7 == null || (list = this.mValues) == null) {
            return false;
        }
        boolean zRemove = list.remove(t7);
        if (zRemove) {
            calcMinMax();
        }
        return zRemove;
    }

    public void setValues(List<T> list) {
        this.mValues = list;
        notifyDataSetChanged();
    }

    public String toSimpleString() {
        StringBuilder sb3 = new StringBuilder("DataSet, label: ");
        sb3.append(getLabel() == null ? "" : getLabel());
        sb3.append(", entries: ");
        sb3.append(this.mValues.size());
        sb3.append("\n");
        return sb3.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(toSimpleString());
        for (int i14 = 0; i14 < this.mValues.size(); i14++) {
            stringBuffer.append(this.mValues.get(i14).toString() + StringUtils.SPACE);
        }
        return stringBuffer.toString();
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public T getEntryForXValue(float f14, float f15) {
        return (T) getEntryForXValue(f14, f15, Rounding.CLOSEST);
    }

    public void calcMinMax(T t7) {
        if (t7 == null) {
            return;
        }
        calcMinMaxX(t7);
        calcMinMaxY(t7);
    }

    public void calcMinMaxY(T t7) {
        if (t7.getY() < this.mYMin) {
            this.mYMin = t7.getY();
        }
        if (t7.getY() > this.mYMax) {
            this.mYMax = t7.getY();
        }
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IDataSet
    public int getEntryIndex(Entry entry) {
        return this.mValues.indexOf(entry);
    }
}
