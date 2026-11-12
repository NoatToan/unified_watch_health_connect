package com.huami.moving.sport.ui.view.chart.dataprovider;

import android.util.SparseArray;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.data.XAxisData;
import com.huami.chart.data.YAxisData;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IDataProvider {
    ChartDataList getDataList();

    float getGoalValue();

    float[] getGoalValues();

    List<ChartDataList> getMultiDataList();

    SparseArray<XAxisData> getXAxisData();

    SparseArray<YAxisData> getYAxisData();
}
