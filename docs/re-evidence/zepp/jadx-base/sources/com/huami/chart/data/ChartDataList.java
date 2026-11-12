package com.huami.chart.data;

import android.util.SparseArray;
import com.huami.chart.util.Index;

/* JADX INFO: loaded from: classes6.dex */
public class ChartDataList extends BaseDataList<ChartData> {
    private float e;
    private float f;
    private float g;

    public ChartDataList(SparseArray<ChartData> sparseArray) {
        super(sparseArray);
        this.f = Float.NaN;
        this.g = Float.NaN;
    }

    private void a(ChartData chartData) {
        if (!this.isSegmentData) {
            float sumValue = chartData.getSumValue();
            if (sumValue > this.maxValue) {
                this.maxValue = sumValue;
                this.maxData = chartData;
                this.maxIndex = new Index(this.mDatas.size() - 1, chartData.getBaseIndex());
                notifyDataMinMaxChanged();
            }
            if (sumValue < this.minValue) {
                this.minValue = sumValue;
                this.minData = chartData;
                this.minIndex = new Index(this.mDatas.size() - 1, chartData.getBaseIndex());
                notifyDataMinMaxChanged();
                return;
            }
            return;
        }
        float maxVlue = chartData.getMaxVlue();
        float minVlue = chartData.getMinVlue();
        if (maxVlue > this.maxValue) {
            this.maxValue = maxVlue;
            this.maxData = chartData;
            this.maxIndex = new Index(this.mDatas.size() - 1, chartData.getBaseIndex());
            notifyDataMinMaxChanged();
        }
        if (minVlue < this.minValue) {
            this.minValue = minVlue;
            this.minData = chartData;
            this.minIndex = new Index(this.mDatas.size() - 1, chartData.getBaseIndex());
            notifyDataMinMaxChanged();
        }
    }

    @Override // com.huami.chart.data.BaseDataList
    public void calculateMinMax() {
        if (this.mDatas.size() == 0) {
            return;
        }
        this.maxData = (T) this.mDatas.valueAt(0);
        this.minData = (T) this.mDatas.valueAt(0);
        if (this.isSegmentData) {
            this.maxValue = ((ChartData) this.mDatas.valueAt(0)).getMaxVlue();
            this.minValue = ((ChartData) this.mDatas.valueAt(0)).getMinVlue();
        } else {
            this.maxValue = ((ChartData) this.maxData).getSumValue();
            this.minValue = ((ChartData) this.minData).getSumValue();
        }
        for (int i = 0; i < this.mDatas.size(); i++) {
            a((ChartData) this.mDatas.valueAt(i));
        }
        SparseArray<T> sparseArray = this.mDatas;
        this.lastData = (T) sparseArray.valueAt(sparseArray.size() - 1);
        this.firstData = (T) this.mDatas.valueAt(0);
    }

    public int getCount() {
        return this.mDatas.size();
    }

    public float getGoalValue() {
        return this.e;
    }

    public float getMaxDataValue() {
        return ((ChartData) this.maxData).getSumValue();
    }

    public float getMaxValue() {
        return Float.isNaN(this.f) ? this.maxValue : this.f;
    }

    public float getMinDataValue() {
        return ((ChartData) this.minData).getSumValue();
    }

    public float getMinValue() {
        return Float.isNaN(this.g) ? this.minValue : this.g;
    }

    public float getStartEndBarMaxDataValue() {
        float fMax = 0.0f;
        for (int i = 0; i < this.mDatas.size(); i++) {
            fMax = Math.max(fMax, ((ChartData) this.mDatas.valueAt(i)).getMaxVlue());
        }
        return fMax;
    }

    public float getStartEndBarMinDataValue() {
        float fMax = 0.0f;
        for (int i = 0; i < this.mDatas.size(); i++) {
            fMax = Math.max(fMax, ((ChartData) this.mDatas.valueAt(i)).getMaxVlue());
        }
        return fMax;
    }

    @Override // com.huami.chart.data.BaseDataList
    public void notifyDataMinMaxChanged() {
    }

    public void removeData(ChartData chartData) {
        removeDataByPositionIndex(chartData.getBaseIndex().getIndex());
        float sumValue = chartData.getSumValue();
        if (sumValue == this.maxValue || sumValue == this.minValue) {
            calculateMinMax();
            notifyDataMinMaxChanged();
        }
    }

    public void removeDataByDataIndex(int i) {
        this.mDatas.removeAt(i);
    }

    public void removeDataByPositionIndex(int i) {
        this.mDatas.remove(i);
    }

    public void setMaxValue(float f) {
        this.f = f;
        notifyDataMinMaxChanged();
    }

    public void setMinValue(float f) {
        this.g = f;
        notifyDataMinMaxChanged();
    }

    public String toString() {
        return new StringBuffer("").toString();
    }

    @Override // com.huami.chart.data.BaseDataList
    public void addData(ChartData chartData) {
        super.addData(chartData);
        a(chartData);
        calculateMinMax();
    }

    public ChartDataList(SparseArray<ChartData> sparseArray, int i, int i2) {
        super(sparseArray, i, i2);
        this.f = Float.NaN;
        this.g = Float.NaN;
    }

    public void addData(float f) {
        this.e = f;
        if (f > this.maxValue) {
            this.maxValue = f;
            notifyDataMinMaxChanged();
        } else if (f < this.minValue) {
            this.minValue = f;
            notifyDataMinMaxChanged();
        }
    }
}
