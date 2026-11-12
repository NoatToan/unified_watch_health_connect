package com.huawei.ui.commonui.linechart;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable;
import defpackage.qlp;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HwHealthScrollChartHolder<T extends HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry>, ChartT extends HwHealthBaseScrollBarLineChart> extends HwHealthChartHolder<T, ChartT> implements DynamicBorderSupportable {
    private static final String TAG = "HealthChart_HwHealthScrollChartHolder";
    private qlp mScrollChartInteractor;

    public abstract IChartStorageHelper acquireStorageHelper();

    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    protected void initChartData(ChartT chartt) {
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    protected T onCreateDataSet(ChartT chartt, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        return null;
    }

    public HwHealthScrollChartHolder(Context context) {
        super(context);
        this.mScrollChartInteractor = new qlp();
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    protected T onDataLayerAdded(ChartT chartt, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        prepareScrollMode(chartt, dataInfos);
        if (chartt.acquireScrollAdapter() != null) {
            chartt.acquireScrollAdapter().invalidateBuff();
        }
        return (T) super.onDataLayerAdded(chartt, dataInfos, cVar);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder, com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder
    public T addDataLayer(ChartT chartt, HwHealthChartHolder.c cVar) {
        T t = (T) super.addDataLayer(chartt, cVar);
        HwHealthBaseScrollBarLineChart.ScrollAdapterInterface scrollAdapterInterfaceAcquireScrollAdapter = chartt.acquireScrollAdapter();
        if (scrollAdapterInterfaceAcquireScrollAdapter != null) {
            scrollAdapterInterfaceAcquireScrollAdapter.injectStorage(t, acquireStorageHelper(), cVar.c(), cVar);
        }
        return t;
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder, com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder
    public T addDataLayer(ChartT chartt, T t, HwHealthChartHolder.c cVar) {
        super.addDataLayer(chartt, t, cVar);
        chartt.acquireScrollAdapter().injectStorage(t, acquireStorageHelper(), cVar.c(), cVar);
        return t;
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    protected T onFakeDataSet(HwHealthChartHolder.c cVar) {
        LogUtil.e(TAG, "onFakeDataSet not Support,needs override!!!");
        return null;
    }

    protected void prepareScrollMode(ChartT chartt, DataInfos dataInfos) {
        this.mScrollChartInteractor.d(chartt, dataInfos, this);
    }
}
