package com.huawei.ui.commonui.linechart;

import android.content.Context;
import android.graphics.Color;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChart;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import defpackage.qly;
import defpackage.qmc;
import defpackage.qme;
import defpackage.qnt;
import defpackage.qnu;
import defpackage.qny;
import defpackage.qrs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HwHealthCombinedScrollChartHolder extends HwHealthScrollChartHolder<HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry>, HwHealthCombinedChart> {
    private static final String TAG = "HealthChart_HwHealthCombinedScrollChartHolder";

    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    protected /* bridge */ /* synthetic */ void addDataSet(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        addDataSet((HwHealthCombinedChart) hwHealthBaseScrollBarLineChart, (HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry>) hwHealthBaseBarLineDataSet);
    }

    public HwHealthCombinedScrollChartHolder(Context context) {
        super(context);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry> onCreateDataSet(HwHealthCombinedChart hwHealthCombinedChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        return createData(hwHealthCombinedChart, cVar);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry> onFakeDataSet(HwHealthChartHolder.c cVar) {
        return createData(null, cVar);
    }

    public HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry> createData(HwHealthCombinedChart hwHealthCombinedChart, HwHealthChartHolder.c cVar) {
        DataInfos dataInfosC = cVar.c();
        if (HwHealthChartHolder.LAYER_ID_NORMAL_HR.equals(cVar.a())) {
            qme qmeVar = new qme(new ArrayList(), getChartBrief(dataInfosC), getChartLabel(dataInfosC), getChartUnit(dataInfosC), dataInfosC);
            qmeVar.setColor(Color.argb(255, 253, 152, TsExtractor.TS_STREAM_TYPE_AC4));
            qmeVar.e(Color.argb(255, 252, 49, 89));
            qmeVar.setLabelCount(5, true);
            if (hwHealthCombinedChart != null) {
                qly barData = hwHealthCombinedChart.getBarData();
                if (barData == null) {
                    LogUtil.e(TAG, "build bar data,find null");
                    return null;
                }
                barData.e(dataInfosC);
            }
            return qmeVar;
        }
        if (HwHealthChartHolder.LAYER_ID_REST_HR.equals(cVar.a())) {
            return getRestDataSet(dataInfosC);
        }
        if (HwHealthChartHolder.LAYER_ID_WARNING_HR.equals(cVar.a())) {
            return getWaringDataSet(dataInfosC, hwHealthCombinedChart);
        }
        if (HwHealthChartHolder.LAYER_ID_BRADYCARDIA.equals(cVar.a())) {
            return getBarDataSet(dataInfosC, hwHealthCombinedChart);
        }
        LogUtil.a(TAG, "showModeArg.dataLayerId: ", cVar.a());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public void initChartData(HwHealthCombinedChart hwHealthCombinedChart) {
        if (((qmc) hwHealthCombinedChart.getData()) == null) {
            qmc qmcVar = new qmc();
            qmcVar.d(new qly(new ArrayList()));
            qmcVar.d(new qnt(new ArrayList()));
            qmcVar.a(new qnu(new ArrayList()));
            hwHealthCombinedChart.setData(qmcVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void addDataSet(HwHealthCombinedChart hwHealthCombinedChart, HwHealthBaseBarLineDataSet<? extends HwHealthBaseEntry> hwHealthBaseBarLineDataSet) {
        if (hwHealthCombinedChart == null) {
            return;
        }
        qmc qmcVar = (qmc) hwHealthCombinedChart.getData();
        if (qmcVar == null) {
            LogUtil.e(TAG, "addDataSet method found data null");
            return;
        }
        if (hwHealthBaseBarLineDataSet instanceof HwHealthBarDataSet) {
            qmcVar.h().addDataSet((IHwHealthBarDataSet) hwHealthBaseBarLineDataSet);
        } else if (hwHealthBaseBarLineDataSet instanceof qny) {
            qmcVar.i().addDataSet((IHwHealthLineDataSet) hwHealthBaseBarLineDataSet);
        } else if (hwHealthBaseBarLineDataSet instanceof HwHealthLineDataSet) {
            qmcVar.j().addDataSet((IHwHealthLineDataSet) hwHealthBaseBarLineDataSet);
        }
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder, com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder
    public void rmDataLayer(HwHealthCombinedChart hwHealthCombinedChart, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        if (hwHealthCombinedChart == null || hwHealthCombinedChart.getData() == null) {
            return;
        }
        if (hwHealthBaseBarLineDataSet instanceof HwHealthBarDataSet) {
            hwHealthCombinedChart.c((HwHealthBarDataSet) hwHealthBaseBarLineDataSet);
            hwHealthCombinedChart.acquireScrollAdapter().reverseInjectStorage(hwHealthBaseBarLineDataSet);
            hwHealthCombinedChart.refresh();
        } else if (hwHealthBaseBarLineDataSet instanceof qny) {
            hwHealthCombinedChart.b();
            hwHealthCombinedChart.acquireScrollAdapter().reverseInjectStorage(hwHealthBaseBarLineDataSet);
            hwHealthCombinedChart.refresh();
        } else {
            if (hwHealthBaseBarLineDataSet instanceof HwHealthLineDataSet) {
                hwHealthCombinedChart.e();
                hwHealthCombinedChart.acquireScrollAdapter().reverseInjectStorage(hwHealthBaseBarLineDataSet);
                hwHealthCombinedChart.refresh();
                return;
            }
            LogUtil.e(TAG, "rmDataLayer unrecognized dataSet,logic error!!!");
        }
    }

    private HwHealthBarDataSet getBarDataSet(DataInfos dataInfos, HwHealthCombinedChart hwHealthCombinedChart) {
        qme qmeVar = new qme(new ArrayList(16), "bradycardia", getChartLabel(dataInfos), getChartUnit(dataInfos), dataInfos);
        qmeVar.setColor(Color.argb(255, 253, 152, TsExtractor.TS_STREAM_TYPE_AC4));
        qmeVar.e(Color.argb(255, 252, 49, 89));
        qmeVar.setLabelCount(5, true);
        if (hwHealthCombinedChart != null) {
            qly barData = hwHealthCombinedChart.getBarData();
            if (barData == null) {
                LogUtil.e(TAG, "build bar data,find null 3");
                return null;
            }
            barData.e(dataInfos);
        }
        return qmeVar;
    }

    private HwHealthBarDataSet getWaringDataSet(DataInfos dataInfos, HwHealthCombinedChart hwHealthCombinedChart) {
        ArrayList arrayList = new ArrayList();
        getChartBrief(dataInfos);
        qme qmeVar = new qme(arrayList, HwHealthChartHolder.LAYER_ID_WARNING_HR, getChartLabel(dataInfos), getChartUnit(dataInfos), dataInfos);
        qmeVar.setColor(Color.argb(255, 253, 152, TsExtractor.TS_STREAM_TYPE_AC4));
        qmeVar.e(Color.argb(255, 252, 49, 89));
        qmeVar.setLabelCount(5, true);
        if (hwHealthCombinedChart != null) {
            qly barData = hwHealthCombinedChart.getBarData();
            if (barData == null) {
                LogUtil.e(TAG, "build bar data,find null 2");
                return null;
            }
            barData.e(dataInfos);
        }
        return qmeVar;
    }

    private HwHealthLineDataSet getRestDataSet(DataInfos dataInfos) {
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.mContext, new ArrayList(), getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos));
        hwHealthLineDataSet.setLabelCount(5, true);
        hwHealthLineDataSet.setColor(Color.argb(255, 252, 49, 89));
        hwHealthLineDataSet.d(new HwHealthLineDataSet.NodeDrawStyle() { // from class: com.huawei.ui.commonui.linechart.HwHealthCombinedScrollChartHolder.2
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i) {
                return 1.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return true;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                return qrs.d(BaseApplication.getContext(), 2.0f);
            }
        });
        return hwHealthLineDataSet;
    }
}
