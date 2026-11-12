package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.huawei.health.knit.section.chart.InteractorLineChartHolder;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class twf extends InteractorLineChartHolder {
    private IChartStorageHelper d;
    private DataInfos e;

    private float c() {
        return 101.0f;
    }

    public twf(Context context, DataInfos dataInfos, BloodOxygenDayDetailFragmentPresenter bloodOxygenDayDetailFragmentPresenter) {
        super(context);
        this.e = dataInfos;
        this.d = new twi(bloodOxygenDayDetailFragmentPresenter);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthLineDataSet onCreateDataSet(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        twe tweVar = new twe(new ArrayList(16), getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos), this.e);
        tweVar.setColor(Color.argb(255, 178, 178, 178));
        tweVar.d(Color.argb(229, 178, 178, 178));
        tweVar.b(this.mLineLinkerFilter);
        tweVar.setLineWidth(1.5f);
        tweVar.e(this.mNodeDrawStyle);
        tweVar.setLabelCount(5, true);
        hwHealthLineChart.getAxisFirstParty().setAxisMinimum(85.0f);
        hwHealthLineChart.getAxisFirstParty().setAxisMaximum(c());
        hwHealthLineChart.getAxisSecondParty().setEnabled(false);
        return tweVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HwHealthLineDataSet onFakeDataSet(HwHealthChartHolder.c cVar) {
        ArrayList arrayList = new ArrayList(16);
        DataInfos dataInfosC = cVar.c();
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.mContext, arrayList, getChartBrief(dataInfosC), getChartLabel(dataInfosC), getChartUnit(dataInfosC));
        hwHealthLineDataSet.setColor(Color.argb(255, 178, 178, 178));
        hwHealthLineDataSet.d(Color.argb(229, a.L, 70, 94));
        hwHealthLineDataSet.a(Color.argb(127, 178, 178, 178), Color.argb(0, 178, 178, 178), true);
        hwHealthLineDataSet.b(this.mLineLinkerFilter);
        hwHealthLineDataSet.setLineWidth(2.0f);
        hwHealthLineDataSet.e(this.mNodeDrawStyle);
        return hwHealthLineDataSet;
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return c();
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return tvs.b(f2);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.d;
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public void initChartData(HwHealthLineChart hwHealthLineChart) {
        if (((qnt) hwHealthLineChart.getData()) == null) {
            hwHealthLineChart.setData(new twm(new ArrayList()));
        }
    }
}
