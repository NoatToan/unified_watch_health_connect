package com.huawei.ui.main.stories.fitness.views.heartrate.linechart;

import android.content.Context;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import defpackage.qnh;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class HeartRateHorizontalLineChart extends RestHeartRateLineChart {
    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart
    public boolean isSupportScaled() {
        return true;
    }

    public HeartRateHorizontalLineChart(Context context) {
        super(context);
        injectDataParser(new d());
    }

    static class d implements HwHealthLineChart.DataParser {
        @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart.DataParser
        public void onOverlaying(List<HwHealthBaseEntry> list, HwHealthLineDataSet hwHealthLineDataSet) {
        }

        @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart.DataParser
        public boolean supportOverlaying() {
            return false;
        }

        @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart.DataParser
        public boolean supportSamping() {
            return true;
        }

        private d() {
        }

        @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart.DataParser
        public int onSamping(List<HwHealthBaseEntry> list, int i, HwHealthLineDataSet hwHealthLineDataSet) {
            int iCeil = (int) Math.ceil((TimeUnit.MILLISECONDS.toMinutes(qnh.d()) * 1.0d) / ((double) (i * 3)));
            if (iCeil >= 1) {
                return iCeil;
            }
            return 5;
        }
    }
}
