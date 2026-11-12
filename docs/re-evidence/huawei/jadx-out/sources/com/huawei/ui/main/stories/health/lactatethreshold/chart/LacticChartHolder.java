package com.huawei.ui.main.stories.health.lactatethreshold.chart;

import android.R;
import android.content.Context;
import android.graphics.Color;
import androidx.core.content.ContextCompat;
import com.huawei.health.knit.section.utils.CardSelectedInterface;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarLineDataSet;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser;
import defpackage.frd;
import defpackage.qls;
import defpackage.qma;
import defpackage.uwq;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class LacticChartHolder extends HwHealthLineScrollChartHolder implements HighlightedEntryParser, CardSelectedInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uwq f27986a;
    protected String d;

    public LacticChartHolder(Context context) {
        super(context);
        this.d = "lthrHr";
        this.f27986a = new uwq();
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthLineDataSet onCreateDataSet(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        frd frdVar = new frd(BaseApplication.getContext(), new ArrayList(16), "", "", "");
        frdVar.setShowType(this.d);
        int iC = c(frdVar);
        frdVar.setColor(iC);
        frdVar.a(Color.argb(153, Color.red(iC), Color.green(iC), Color.blue(iC)), ContextCompat.getColor(this.mContext, R.color.transparent), true);
        frdVar.setLabelCount(5, true);
        hwHealthLineChart.getAxisFirstParty().setAxisMaximum(d(frdVar));
        hwHealthLineChart.getAxisFirstParty().setAxisMinimum(b(frdVar));
        frdVar.setLineWidth(1.5f);
        frdVar.setShowMaxMinValue(false);
        if (a(frdVar)) {
            hwHealthLineChart.getAxisFirstParty().setValueFormatter(new qma());
            return frdVar;
        }
        hwHealthLineChart.getAxisFirstParty().setValueFormatter(new qls());
        return frdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public HwHealthLineDataSet onFakeDataSet(HwHealthChartHolder.c cVar) {
        return new HwHealthLineDataSet(BaseApplication.getContext(), new ArrayList(16), "", "", "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onCustomChartStyle(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos) {
        hwHealthLineChart.setAvoidFirstLastClipping(false);
        int color = ContextCompat.getColor(this.mContext, com.huawei.ui.main.R.color.common_black_20alpha);
        hwHealthLineChart.setGridColor(color, color);
        hwHealthLineChart.enableOnlyShowMinutes(true);
        hwHealthLineChart.enableOneMinuteOmit(true);
        hwHealthLineChart.getAxisSecondParty().setEnabled(false);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.f27986a;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser
    public String parse(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null || ((int) hwHealthBaseEntry.getY()) == Integer.MIN_VALUE) {
            return "--";
        }
        return UnitUtil.e(hwHealthBaseEntry.getY(), 1, 0);
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return d(hwHealthBaseBarLineDataSet);
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return b(hwHealthBaseBarLineDataSet);
    }

    @Override // com.huawei.health.knit.section.utils.CardSelectedInterface
    public void setShowDataType(String str) {
        this.d = str;
        this.f27986a.b(str);
    }

    protected int c(IHwHealthBarLineDataSet iHwHealthBarLineDataSet) {
        if (a(iHwHealthBarLineDataSet)) {
            return ContextCompat.getColor(this.mContext, com.huawei.ui.main.R.color.pace_chart_date_color);
        }
        return ContextCompat.getColor(this.mContext, com.huawei.ui.main.R.color.heart_rate_chart_date_color);
    }

    protected boolean a(IHwHealthBarLineDataSet iHwHealthBarLineDataSet) {
        return "lthrPace".equals(iHwHealthBarLineDataSet.getShowType());
    }

    protected float b(IHwHealthBarLineDataSet iHwHealthBarLineDataSet) {
        return a(iHwHealthBarLineDataSet) ? 0.0f : 100.0f;
    }

    protected float d(IHwHealthBarLineDataSet iHwHealthBarLineDataSet) {
        return a(iHwHealthBarLineDataSet) ? 600.0f : 200.0f;
    }
}
