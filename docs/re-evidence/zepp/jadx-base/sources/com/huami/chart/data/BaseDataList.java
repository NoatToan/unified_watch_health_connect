package com.huami.chart.data;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.huami.chart.data.BaseData;
import com.huami.chart.util.Index;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseDataList<T extends BaseData> {
    private static final String d = "BaseDataList";
    private int a;
    private int b;
    private int c;
    public T firstData;
    public boolean isSegmentData;
    public T lastData;
    public SparseArray<T> mDatas;
    public T maxData;
    public Index maxIndex;
    public float maxValue;
    public T minData;
    public Index minIndex;
    public float minValue;

    public BaseDataList(SparseArray<T> sparseArray) {
        this.mDatas = new SparseArray<>();
        this.maxValue = Float.MIN_VALUE;
        this.minValue = 0.0f;
        this.isSegmentData = false;
        this.mDatas = sparseArray;
        calculateMinMax();
    }

    public void addData(T t) {
        if (Float.isNaN(this.maxValue) || Float.isNaN(this.minValue)) {
            throw new IllegalStateException("assign max min value in calculateMinMax() method");
        }
        this.mDatas.put(t.getBaseIndex().getIndex(), t);
    }

    public abstract void calculateMinMax();

    public T getData(Index index) {
        return (T) getDataByPositionIndex(index.getDataIndex());
    }

    @Nullable
    public T getDataByDataIndex(int i) {
        if (Float.isNaN(this.maxValue) || Float.isNaN(this.minValue) || i < 0 || i >= this.mDatas.size() || i >= this.mDatas.size()) {
            return null;
        }
        return this.mDatas.valueAt(i);
    }

    public T getDataByPositionIndex(int i) {
        if (Float.isNaN(this.maxValue) || Float.isNaN(this.minValue)) {
            throw new IllegalStateException("assign max min value in calculateMinMax() method");
        }
        return this.mDatas.get(i);
    }

    public List<Integer> getDataKeyList() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.mDatas.size(); i++) {
            arrayList.add(Integer.valueOf(this.mDatas.keyAt(i)));
        }
        return arrayList;
    }

    public int getEnd() {
        return this.b;
    }

    public T getFirstData() {
        return this.firstData;
    }

    public T getLastData() {
        return this.lastData;
    }

    public T getMaxData() {
        return this.maxData;
    }

    public Index getMaxIndex() {
        return this.maxIndex;
    }

    public T getMinData() {
        return this.minData;
    }

    public Index getMinIndex() {
        return this.minIndex;
    }

    public int getShownCount() {
        return this.c;
    }

    public int getStart() {
        return this.a;
    }

    public abstract void notifyDataMinMaxChanged();

    public void setEnd(int i) {
        this.b = i;
    }

    public void setSegmentData(boolean z) {
        this.isSegmentData = z;
    }

    public void setShownCount(int i) {
        this.c = i;
    }

    public void setStart(int i) {
        this.a = i;
    }

    public BaseDataList(SparseArray<T> sparseArray, int i, int i2) {
        this(sparseArray);
        this.a = i;
        this.b = i2;
    }
}
