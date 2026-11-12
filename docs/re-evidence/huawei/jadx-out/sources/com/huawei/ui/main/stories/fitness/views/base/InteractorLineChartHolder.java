package com.huawei.ui.main.stories.fitness.views.base;

import android.content.Context;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser;
import defpackage.qqn;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public abstract class InteractorLineChartHolder extends HwHealthLineScrollChartHolder implements HighlightedEntryParser {
    private static final float ALONE_DOT_WIDTH = 4.0f;
    protected static final int ALPHA = 255;
    protected static final int BLUE = 178;
    private static final String DEFAULT_VALUE = "--";
    protected static final float FIVETY_PERCENT = 0.5f;
    protected static final int GREEN = 178;
    protected static final int LABLE_COUNT = 5;
    protected static final int LINE_BLUE = 94;
    protected static final int LINE_GREEN = 70;
    protected static final int LINE_RED = 213;
    protected static final float LINE_WIDTH = 2.0f;
    protected static final int MAX_ALPHA = 255;
    protected static final float OTHRE_LINE_WIDTH = 1.5f;
    protected static final float PERCENT_NINETY = 0.9f;
    protected static final int RED = 178;
    protected HwHealthLineDataSet.LineLinkerFilter mLineLinkerFilter;
    protected HwHealthLineDataSet.NodeDrawStyle mNodeDrawStyle;

    public InteractorLineChartHolder(Context context) {
        super(context);
        this.mLineLinkerFilter = new HwHealthLineDataSet.LineLinkerFilter() { // from class: com.huawei.ui.main.stories.fitness.views.base.InteractorLineChartHolder.3
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public boolean drawLine(int i, int i2, int i3) {
                return true;
            }
        };
        this.mNodeDrawStyle = new HwHealthLineDataSet.NodeDrawStyle() { // from class: com.huawei.ui.main.stories.fitness.views.base.InteractorLineChartHolder.4
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
                return Utils.convertDpToPixel(InteractorLineChartHolder.ALONE_DOT_WIDTH);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public void onCustomChartStyle(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos) {
        hwHealthLineChart.makeReverse(true);
        hwHealthLineChart.setGridColor(qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color), qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color));
        hwHealthLineChart.setLabelColor(qqn.b(BaseApplication.getContext(), R.color.health_chart_default_text_color));
        hwHealthLineChart.setAvoidFirstLastClipping(false);
        hwHealthLineChart.enableOnlyShowMinutes(true);
        hwHealthLineChart.enableOneMinuteOmit(true);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser
    public String parse(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null || ((int) hwHealthBaseEntry.getY()) == Integer.MIN_VALUE) {
            return DEFAULT_VALUE;
        }
        return UnitUtil.e(hwHealthBaseEntry.getY(), 1, 0);
    }
}
