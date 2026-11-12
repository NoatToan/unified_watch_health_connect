package com.huami.chart.data;

import androidx.annotation.Nullable;
import com.huami.chart.chart.HMChart;

/* JADX INFO: loaded from: classes6.dex */
public class ChartDataManager {
    private static final String d = "ChartDataManager";
    private ChartDataList a;
    private ChartDataList[] b;
    private ChartDataList[] c;

    public ChartDataManager(HMChart hMChart) {
    }

    @Nullable
    private ChartData a(int i, int i2, int i3) {
        if (i2 - i <= 1) {
            ChartData dataByDataIndex = this.a.getDataByDataIndex(i);
            ChartData dataByDataIndex2 = this.a.getDataByDataIndex(i2);
            if (dataByDataIndex != null && dataByDataIndex2 != null) {
                if (dataByDataIndex.getStart() <= i3 && dataByDataIndex.getEnd() > i3) {
                    return this.a.getDataByDataIndex(i);
                }
                if (dataByDataIndex2.getStart() <= i3 && dataByDataIndex2.getEnd() > i3) {
                    return this.a.getDataByDataIndex(i2);
                }
            }
            return null;
        }
        int i4 = (i + i2) / 2;
        ChartData dataByDataIndex3 = this.a.getDataByDataIndex(i4);
        if (dataByDataIndex3 == null) {
            return null;
        }
        if (dataByDataIndex3.getStart() <= i3 && dataByDataIndex3.getEnd() > i3) {
            return dataByDataIndex3;
        }
        if (dataByDataIndex3.getEnd() <= i3) {
            i = i4 + 1;
        }
        if (dataByDataIndex3.getStart() > i3) {
            i2 = i4;
        }
        return a(i, i2, i3);
    }

    @Nullable
    private ChartData b(ChartDataList chartDataList, int i, int i2, int i3) {
        if (i2 - i <= 1) {
            ChartData dataByDataIndex = chartDataList.getDataByDataIndex(i);
            ChartData dataByDataIndex2 = chartDataList.getDataByDataIndex(i2);
            if (dataByDataIndex != null && dataByDataIndex2 != null) {
                if (dataByDataIndex.getStart() <= i3 && dataByDataIndex.getEnd() > i3) {
                    return chartDataList.getDataByDataIndex(i);
                }
                if (dataByDataIndex2.getStart() <= i3 && dataByDataIndex2.getEnd() > i3) {
                    return chartDataList.getDataByDataIndex(i2);
                }
            }
            return null;
        }
        int i4 = (i + i2) / 2;
        ChartData dataByDataIndex3 = chartDataList.getDataByDataIndex(i4);
        if (dataByDataIndex3 == null) {
            return null;
        }
        if (dataByDataIndex3.getStart() <= i3 && dataByDataIndex3.getEnd() > i3) {
            return dataByDataIndex3;
        }
        if (dataByDataIndex3.getEnd() <= i3) {
            i = i4 + 1;
        }
        if (dataByDataIndex3.getStart() > i3) {
            i2 = i4;
        }
        return b(chartDataList, i, i2, i3);
    }

    public void clear() {
    }

    public ChartDataList getChartDataList() {
        ChartDataList chartDataList = this.a;
        if (chartDataList != null) {
            return chartDataList;
        }
        throw new IllegalStateException("call setChartDataListFirst");
    }

    @Nullable
    public ChartData getDataByDataIndex(int i) {
        ChartDataList chartDataList = this.a;
        if (chartDataList == null) {
            return null;
        }
        return chartDataList.getDataByDataIndex(i);
    }

    public ChartData getDataByPositionIndex(int i) {
        ChartDataList chartDataList = this.a;
        if (chartDataList == null) {
            throw new IllegalStateException("call setChartDataListFirst");
        }
        ChartData dataByPositionIndex = chartDataList.getDataByPositionIndex(i);
        return dataByPositionIndex == null ? a(0, this.a.getCount() - 1, i) : dataByPositionIndex;
    }

    public int getFirstDataPositionIndex() {
        if (this.a == null) {
            return -1;
        }
        int i = 0;
        while (this.a.getDataByPositionIndex(i) == null) {
            i++;
        }
        return i;
    }

    public ChartDataList[] getMultiChartDataList() {
        return this.b;
    }

    @Nullable
    public ChartData getMultiDataByDataIndex(int i, int i2) {
        ChartDataList[] chartDataListArr = this.b;
        if (chartDataListArr == null || chartDataListArr[i] == null || i > chartDataListArr.length - 1) {
            return null;
        }
        return chartDataListArr[i].getDataByDataIndex(i2);
    }

    public ChartData getMultiDataByPositionIndex(int i, int i2) {
        ChartDataList[] chartDataListArr = this.b;
        if (chartDataListArr == null) {
            throw new IllegalStateException("call setChartDataListFirst");
        }
        ChartData dataByPositionIndex = chartDataListArr[i].getDataByPositionIndex(i2);
        if (dataByPositionIndex != null) {
            return dataByPositionIndex;
        }
        ChartDataList[] chartDataListArr2 = this.b;
        return b(chartDataListArr2[i], 0, chartDataListArr2[i].getCount() - 1, i2);
    }

    public ChartDataList[] getPointChartDataList() {
        return this.c;
    }

    @Nullable
    public ChartData getPointDataByDataIndex(int i, int i2) {
        ChartDataList[] chartDataListArr = this.c;
        if (chartDataListArr == null) {
            return null;
        }
        return chartDataListArr[i].getDataByDataIndex(i2);
    }

    public ChartData getPointDataByPositionIndex(int i, int i2) {
        ChartDataList[] chartDataListArr = this.c;
        if (chartDataListArr == null) {
            throw new IllegalStateException("call setPointChartDataList First");
        }
        ChartData dataByPositionIndex = chartDataListArr[i].getDataByPositionIndex(i2);
        if (dataByPositionIndex != null) {
            return dataByPositionIndex;
        }
        ChartDataList[] chartDataListArr2 = this.c;
        return b(chartDataListArr2[i], 0, chartDataListArr2[i].getCount() - 1, i2);
    }

    public boolean hasDataAtPositionIndex(int i) {
        return this.a.getDataByPositionIndex(i) != null;
    }

    public boolean hasMultiDataAtPositionIndex(int i, int i2) {
        return this.b[i].getDataByPositionIndex(i2) != null;
    }

    public boolean hasPointDataAtPositionIndex(int i, int i2) {
        return this.c[i].getDataByPositionIndex(i2) != null;
    }

    public void setChartDataList(ChartDataList chartDataList) {
        this.a = chartDataList;
        chartDataList.calculateMinMax();
    }

    public void setMultiChartDataList(ChartDataList... chartDataListArr) {
        this.b = chartDataListArr;
        for (ChartDataList chartDataList : chartDataListArr) {
            chartDataList.calculateMinMax();
        }
    }

    public void setPointChartDataList(ChartDataList... chartDataListArr) {
        this.c = chartDataListArr;
        for (ChartDataList chartDataList : chartDataListArr) {
            chartDataList.calculateMinMax();
        }
    }
}
