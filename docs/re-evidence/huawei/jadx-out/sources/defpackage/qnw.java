package defpackage;

import android.content.Context;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;

/* JADX INFO: loaded from: classes16.dex */
public class qnw extends qnx {
    public qnw(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler, context);
    }

    @Override // defpackage.qnx, defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public qnt getDataset() {
        return this.mChart.getPointData();
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean hasData() {
        qnt pointData = this.mChart.getPointData();
        return (pointData == null || pointData.getDataSets() == null || pointData.getDataSets().size() == 0) ? false : true;
    }
}
