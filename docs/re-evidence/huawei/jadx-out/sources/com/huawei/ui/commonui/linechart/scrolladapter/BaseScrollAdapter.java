package com.huawei.ui.commonui.linechart.scrolladapter;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet;
import defpackage.qmk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseScrollAdapter extends HwHealthBaseScrollBarLineChart.ScrollAdapter {
    private HwHealthBaseScrollBarLineChart mChart;
    private b mChartDataSetPropManager;
    private long mDefaultTime;
    private DynamicBorderSupportable mDynamicBorderSupportable;
    private b mProxyDataSetPropManager;

    public BaseScrollAdapter(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DynamicBorderSupportable dynamicBorderSupportable) {
        super(hwHealthBaseScrollBarLineChart);
        this.mChartDataSetPropManager = new b();
        this.mProxyDataSetPropManager = new b();
        this.mDefaultTime = System.currentTimeMillis();
        this.mChart = hwHealthBaseScrollBarLineChart;
        this.mDynamicBorderSupportable = dynamicBorderSupportable;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public List<IChartStorageHelper> parseAssociatedStorageHelper() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mChartDataSetPropManager.d());
        arrayList.addAll(this.mProxyDataSetPropManager.d());
        return arrayList;
    }

    static class b {
        private Map<HwHealthBaseBarLineDataSet, d> d;

        private b() {
            this.d = new HashMap();
        }

        public Set<HwHealthBaseBarLineDataSet> c() {
            return this.d.keySet();
        }

        public void c(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, d dVar) {
            this.d.put(hwHealthBaseBarLineDataSet, dVar);
        }

        public d e(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
            d dVar = this.d.get(hwHealthBaseBarLineDataSet);
            if (dVar != null) {
                return dVar;
            }
            throw new RuntimeException("dataSetProp null");
        }

        public void c(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
            this.d.remove(hwHealthBaseBarLineDataSet);
        }

        public IChartStorageHelper a(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
            d dVarE = e(hwHealthBaseBarLineDataSet);
            if (hwHealthBaseBarLineDataSet == null || dVarE == null) {
                return null;
            }
            return dVarE.f23709b;
        }

        public List<IChartStorageHelper> d() {
            d next;
            ArrayList arrayList = new ArrayList();
            Iterator<d> it = this.d.values().iterator();
            while (it.hasNext() && (next = it.next()) != null) {
                arrayList.add(next.f23709b);
            }
            return arrayList;
        }

        public HwHealthChartHolder.c d(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
            d dVarE = e(hwHealthBaseBarLineDataSet);
            if (hwHealthBaseBarLineDataSet == null) {
                return null;
            }
            return dVarE.e;
        }

        public DataInfos b(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
            d dVarE = e(hwHealthBaseBarLineDataSet);
            if (hwHealthBaseBarLineDataSet == null || dVarE == null) {
                return null;
            }
            return dVarE.f23710c;
        }
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IChartStorageHelper f23709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        DataInfos f23710c;
        HwHealthChartHolder.c e;

        d(DataInfos dataInfos, HwHealthChartHolder.c cVar, IChartStorageHelper iChartStorageHelper) {
            this.f23710c = dataInfos;
            this.e = cVar;
            this.f23709b = iChartStorageHelper;
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public void injectStorage(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, IChartStorageHelper iChartStorageHelper, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        injectStorage(this.mChartDataSetPropManager, hwHealthBaseBarLineDataSet, iChartStorageHelper, dataInfos, cVar);
    }

    private void injectStorage(b bVar, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, IChartStorageHelper iChartStorageHelper, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        bVar.c(hwHealthBaseBarLineDataSet, new d(dataInfos, cVar, iChartStorageHelper));
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public void reverseInjectStorage(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        this.mChartDataSetPropManager.c(hwHealthBaseBarLineDataSet);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public IChartStorageHelper queryStorage(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        return this.mChartDataSetPropManager.a(hwHealthBaseBarLineDataSet);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public HwHealthChartHolder.c queryShowMode(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        return this.mChartDataSetPropManager.d(hwHealthBaseBarLineDataSet);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public DataInfos queryDataInfos(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        return this.mChartDataSetPropManager.b(hwHealthBaseBarLineDataSet);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return this.mDynamicBorderSupportable.computeDynamicBorderMax(hwHealthBaseBarLineDataSet, f, f2);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return this.mDynamicBorderSupportable.computeDynamicBorderMin(hwHealthBaseBarLineDataSet, f, f2);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapter
    public void fillBuffer(HwHealthBaseScrollBarLineChart.ScrollAdapter.a aVar, List<? extends IHwHealthBarLineDataSet<? extends HwHealthBaseEntry>> list, HwHealthBaseScrollBarLineChart.OnDataFillCallback onDataFillCallback) {
        HwHealthBaseBarLineDataSet next;
        if (aVar == null || this.mProxyDataSetPropManager == null) {
            return;
        }
        this.mChart.fillBuffer(aVar, onDataFillCallback);
        Iterator<HwHealthBaseBarLineDataSet> it = this.mProxyDataSetPropManager.c().iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            next.fillSetByDatabase(BaseApplication.getContext(), null, new qmk(aVar.b(), aVar.e(), aVar.c(), aVar.d(), this.mProxyDataSetPropManager.d(next), this.mProxyDataSetPropManager.b(next)), new HwHealthBaseScrollBarLineChart.OnDataFillCallback() { // from class: com.huawei.ui.commonui.linechart.scrolladapter.BaseScrollAdapter.2
                @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.OnDataFillCallback
                public void onResult() {
                    BaseScrollAdapter baseScrollAdapter = BaseScrollAdapter.this;
                    baseScrollAdapter.setFlag(baseScrollAdapter.getFlag() | 1);
                    BaseScrollAdapter.this.mChart.refresh();
                }
            }, this.mProxyDataSetPropManager.a(next));
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public void manageDataSetAsProxy(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, IChartStorageHelper iChartStorageHelper, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        injectStorage(this.mProxyDataSetPropManager, hwHealthBaseBarLineDataSet, iChartStorageHelper, dataInfos, cVar);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public void unmanageDataSetAsProxy(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        this.mProxyDataSetPropManager.c(hwHealthBaseBarLineDataSet);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireRangeCenterValue(int i) {
        return (int) ((acquireValuePresentRangeMax(i) + acquireValuePresentRangeMin(i)) / 2.0f);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public int acquireRange(long j) {
        return acquireRange();
    }

    public long getDefaultTime() {
        return this.mDefaultTime;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.ScrollAdapterInterface
    public void setDefaultTime(long j) {
        this.mDefaultTime = j;
    }
}
