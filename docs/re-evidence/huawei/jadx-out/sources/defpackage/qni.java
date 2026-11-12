package defpackage;

import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthFillFormatter;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;

/* JADX INFO: loaded from: classes16.dex */
public class qni implements IHwHealthFillFormatter {
    @Override // com.huawei.ui.commonui.linechart.icommon.IHwHealthFillFormatter
    public float getFillLinePosition(IHwHealthLineDataSet iHwHealthLineDataSet, HwHealthLineDataProvider hwHealthLineDataProvider) {
        if (hwHealthLineDataProvider == null || iHwHealthLineDataSet == null) {
            LogUtil.j("DefaultHwHealthFillFormatter", "getFillLinePosition dataProvider == null || dataSet == null");
            return 0.0f;
        }
        float yChartMax = hwHealthLineDataProvider.getYChartMax();
        float yChartMin = hwHealthLineDataProvider.getYChartMin();
        BarLineScatterCandleBubbleData data = hwHealthLineDataProvider.getData();
        if (!(data instanceof qnt)) {
            LogUtil.j("DefaultHwHealthFillFormatter", "!(getData instanceof HwHealthLineData)");
            return 0.0f;
        }
        qnt qntVar = (qnt) data;
        if (iHwHealthLineDataSet.getYMax() > 0.0f && iHwHealthLineDataSet.getYMin() < 0.0f) {
            return 0.0f;
        }
        if (qntVar.getYMax() > 0.0f) {
            yChartMax = 0.0f;
        }
        if (qntVar.getYMin() < 0.0f) {
            yChartMin = 0.0f;
        }
        return iHwHealthLineDataSet.getYMin() >= 0.0f ? yChartMin : yChartMax;
    }
}
