package com.huawei.ui.commonui.linechart.combinedchart;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import defpackage.qpc;
import defpackage.qpg;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthTrackCombinedChart extends HwHealthBaseCombinedChart {
    private final a e;

    public HwHealthTrackCombinedChart(Context context) {
        super(context);
        this.e = new a();
        b();
    }

    public HwHealthTrackCombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new a();
        b();
    }

    public HwHealthTrackCombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new a();
        b();
    }

    private void b() {
        d(this.e);
        getLegend().setEnabled(true);
    }

    public void setIsSupportSampling(boolean z) {
        this.e.a(z);
    }

    public void b(HwHealthBaseCombinedChart.DataParser dataParser) {
        d(dataParser);
    }

    static class a implements HwHealthBaseCombinedChart.DataParser {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23617b;
        private boolean e;

        @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.DataParser
        public boolean isSupportOverlaying() {
            return true;
        }

        @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.DataParser
        public boolean isSupportSampling() {
            return true;
        }

        private a() {
            this.f23617b = 5;
            this.e = true;
        }

        public void a(boolean z) {
            this.e = z;
        }

        @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.DataParser
        public void onOverlaying(List<HwHealthBaseEntry> list, HwHealthLineDataSet hwHealthLineDataSet) {
            qpc.a(list, hwHealthLineDataSet.c(), this.f23617b);
        }

        @Override // com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart.DataParser
        public int onSampling(List<HwHealthBaseEntry> list, int i, HwHealthLineDataSet hwHealthLineDataSet) {
            if (this.e) {
                return new qpg().decresPoint(list, i);
            }
            return 5;
        }
    }
}
