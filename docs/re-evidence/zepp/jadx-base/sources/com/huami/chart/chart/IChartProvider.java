package com.huami.chart.chart;

import android.view.ViewGroup;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.provider.DrawConfig;
import com.huami.chart.provider.RenderConfig;
import com.huami.chart.util.Index;

/* JADX INFO: loaded from: classes6.dex */
public interface IChartProvider {
    ViewGroup getChartContainer();

    ChartDataList getChartDataList();

    Index getCurrentIndex();

    DrawConfig getDrawConfig();

    ChartDataList[] getMultiChartDataList();

    ChartDataList[] getPointChartDataList();

    RenderConfig getRenderConfig();

    boolean preAnim();

    boolean refreshingAnim();
}
