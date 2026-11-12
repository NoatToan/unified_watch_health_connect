package com.github.mikephil.chartingv2.data.realm.base;

import com.airbnb.lottie.animation.keyframe.a;
import com.github.mikephil.chartingv2.data.BaseDataSet;
import com.github.mikephil.chartingv2.data.DataSet;
import com.github.mikephil.chartingv2.data.Entry;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.Sort;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class RealmBaseDataSet<T extends RealmObject, S extends Entry> extends BaseDataSet<S> {
    protected String mIndexField;
    protected String mValuesField;
    protected RealmResults<T> results;
    protected float mYMax = 0.0f;
    protected float mYMin = 0.0f;
    protected List<S> mValues = new ArrayList();

    public RealmBaseDataSet(RealmResults<T> realmResults, String str, String str2) {
        this.results = realmResults;
        this.mValuesField = str;
        this.mIndexField = str2;
        String str3 = this.mIndexField;
        if (str3 != null) {
            this.results.sort(str3, Sort.ASCENDING);
        }
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public boolean addEntry(S s8) {
        if (s8 == null) {
            return false;
        }
        float val = s8.getVal();
        if (this.mValues == null) {
            this.mValues = new ArrayList();
        }
        if (this.mValues.size() == 0) {
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
        this.mValues.add(s8);
        return true;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void addEntryOrdered(S s8) {
        if (s8 == null) {
            return;
        }
        float val = s8.getVal();
        if (this.mValues == null) {
            this.mValues = new ArrayList();
        }
        if (this.mValues.size() == 0) {
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
        if (this.mValues.size() <= 0 || ((Entry) a.c(1, this.mValues)).getXIndex() <= s8.getXIndex()) {
            this.mValues.add(s8);
        } else {
            this.mValues.add(getEntryIndex(s8.getXIndex(), DataSet.Rounding.UP), s8);
        }
    }

    public abstract void build(RealmResults<T> realmResults);

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void calcMinMax(int i14, int i15) {
        int size;
        List<S> list = this.mValues;
        if (list == null || (size = list.size()) == 0) {
            return;
        }
        if (i15 == 0 || i15 >= size) {
            i15 = size - 1;
        }
        this.mYMin = Float.MAX_VALUE;
        this.mYMax = -3.4028235E38f;
        while (i14 <= i15) {
            S s8 = this.mValues.get(i14);
            if (s8 != null && !Float.isNaN(s8.getVal())) {
                if (s8.getVal() < this.mYMin) {
                    this.mYMin = s8.getVal();
                }
                if (s8.getVal() > this.mYMax) {
                    this.mYMax = s8.getVal();
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
        this.mValues.clear();
        notifyDataSetChanged();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public int getEntryCount() {
        return this.mValues.size();
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public S getEntryForIndex(int i14) {
        return this.mValues.get(i14);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public S getEntryForXIndex(int i14, DataSet.Rounding rounding) {
        int entryIndex = getEntryIndex(i14, rounding);
        if (entryIndex > -1) {
            return this.mValues.get(entryIndex);
        }
        return null;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public int getEntryIndex(int i14, DataSet.Rounding rounding) {
        int size = this.mValues.size() - 1;
        int i15 = 0;
        int i16 = -1;
        while (i15 <= size) {
            i16 = (size + i15) / 2;
            if (i14 == this.mValues.get(i16).getXIndex()) {
                while (i16 > 0 && this.mValues.get(i16 - 1).getXIndex() == i14) {
                    i16--;
                }
                return i16;
            }
            if (i14 > this.mValues.get(i16).getXIndex()) {
                i15 = i16 + 1;
            } else {
                size = i16 - 1;
            }
        }
        if (i16 == -1) {
            return i16;
        }
        int xIndex = this.mValues.get(i16).getXIndex();
        if (rounding == DataSet.Rounding.UP) {
            return (xIndex >= i14 || i16 >= this.mValues.size() + (-1)) ? i16 : i16 + 1;
        }
        return (rounding != DataSet.Rounding.DOWN || xIndex <= i14 || i16 <= 0) ? i16 : i16 - 1;
    }

    public String getIndexField() {
        return this.mIndexField;
    }

    public RealmResults<T> getResults() {
        return this.results;
    }

    public List<S> getValues() {
        return this.mValues;
    }

    public String getValuesField() {
        return this.mValuesField;
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

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public boolean removeEntry(S s8) {
        List<S> list;
        if (s8 == null || (list = this.mValues) == null) {
            return false;
        }
        boolean zRemove = list.remove(s8);
        if (zRemove) {
            calcMinMax(0, this.mValues.size());
        }
        return zRemove;
    }

    public void setIndexField(String str) {
        this.mIndexField = str;
    }

    public void setValuesField(String str) {
        this.mValuesField = str;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public S getEntryForXIndex(int i14) {
        return (S) getEntryForXIndex(i14, DataSet.Rounding.CLOSEST);
    }

    public RealmBaseDataSet(RealmResults<T> realmResults, String str) {
        this.results = realmResults;
        this.mValuesField = str;
        String str2 = this.mIndexField;
        if (str2 != null) {
            this.results.sort(str2, Sort.ASCENDING);
        }
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public int getEntryIndex(S s8) {
        return this.mValues.indexOf(s8);
    }
}
