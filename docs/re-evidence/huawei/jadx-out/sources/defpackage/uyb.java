package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class uyb extends HwHealthLineScrollChartHolder implements HighlightedEntryParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DataInfos f50725a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwHealthLineDataSet.NodeDrawStyle f50726c;
    private uyf d;
    private HwHealthLineDataSet.LineLinkerFilter e;

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return 99.0f;
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return 0.0f;
    }

    public uyb(Context context, DataInfos dataInfos) {
        super(context);
        this.d = new uyf();
        this.e = new HwHealthLineDataSet.LineLinkerFilter() { // from class: uyb.5
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public boolean drawLine(int i, int i2, int i3) {
                return true;
            }
        };
        this.f50726c = new HwHealthLineDataSet.NodeDrawStyle() { // from class: uyb.3
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float initNodeStyle(int i) {
                return 0.0f;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public boolean needDrawNodeFill(boolean z) {
                return false;
            }

            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.NodeDrawStyle
            public float calcuNodeWidthPixel(boolean z) {
                return Utils.convertDpToPixel(4.0f);
            }
        };
        this.f50725a = dataInfos;
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.d;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser
    public String parse(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null || ((int) hwHealthBaseEntry.getY()) == Integer.MIN_VALUE) {
            return "--";
        }
        return UnitUtil.e(hwHealthBaseEntry.getY(), 1, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onCustomChartStyle(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos) {
        hwHealthLineChart.makeReverse(true);
        hwHealthLineChart.setGridColor(qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color), qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color));
        hwHealthLineChart.setLabelColor(qqn.b(BaseApplication.getContext(), R.color.health_chart_default_text_color));
        hwHealthLineChart.setAvoidFirstLastClipping(false);
        hwHealthLineChart.enableOnlyShowMinutes(true);
        hwHealthLineChart.enableOneMinuteOmit(true);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthLineDataSet onCreateDataSet(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        frj frjVar = new frj(new ArrayList(10), getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos), this.f50725a);
        frjVar.setColor(qqn.b(BaseApplication.getContext(), R.color.health_pressureline_color));
        frjVar.d(Color.argb(229, 178, 178, 178));
        frjVar.b(this.e);
        frjVar.setLineWidth(1.5f);
        frjVar.e(this.f50726c);
        frjVar.setLabelCount(5, true);
        hwHealthLineChart.getAxisFirstParty().setAxisMinimum(0.0f);
        hwHealthLineChart.getAxisFirstParty().setAxisMaximum(99.0f);
        hwHealthLineChart.getAxisSecondParty().setEnabled(false);
        return frjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public HwHealthLineDataSet onFakeDataSet(HwHealthChartHolder.c cVar) {
        ArrayList arrayList = new ArrayList(10);
        DataInfos dataInfosC = cVar.c();
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.mContext, arrayList, getChartBrief(dataInfosC), getChartLabel(dataInfosC), getChartUnit(dataInfosC));
        hwHealthLineDataSet.setColor(qqn.b(BaseApplication.getContext(), R.color.health_pressureline_color));
        hwHealthLineDataSet.d(Color.argb(229, a.L, 70, 94));
        hwHealthLineDataSet.a(Color.argb(127, 178, 178, 178), Color.argb(0, 178, 178, 178), true);
        hwHealthLineDataSet.b(this.e);
        hwHealthLineDataSet.setLineWidth(2.0f);
        hwHealthLineDataSet.e(this.f50726c);
        return hwHealthLineDataSet;
    }
}
