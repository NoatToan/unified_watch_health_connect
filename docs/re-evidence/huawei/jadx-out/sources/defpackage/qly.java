package defpackage;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwEntrys;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qly extends HwHealthBaseBarLineData<IHwHealthBarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f46465a;

    public qly(List<IHwHealthBarDataSet> list) {
        super(list);
        this.f46465a = 0.85f;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData, com.github.mikephil.charting.data.ChartData
    public Entry getEntryForHighlight(Highlight highlight) {
        HwEntrys hwEntrys = new HwEntrys();
        for (T t : this.mDataSets) {
            List<T> entriesForXValue = t.getEntriesForXValue(highlight.getX());
            if (!njy.e(entriesForXValue)) {
                hwEntrys.add(new HwEntrys.HwDataEntry((HwHealthBaseEntry) entriesForXValue.get(0), (HwHealthBarDataSet) t));
            }
        }
        return hwEntrys;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData
    public Entry getEntryForXValue(float f, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        HwEntrys hwEntrys = new HwEntrys();
        for (T t : this.mDataSets) {
            if (t instanceof HwHealthBarDataSet) {
                List<T> entriesForXValue = t.getEntriesForXValue(f);
                if (njy.e(entriesForXValue)) {
                    hwEntrys.add(new HwEntrys.HwDataEntry(null, (HwHealthBarDataSet) t));
                } else {
                    hwEntrys.add(new HwEntrys.HwDataEntry((HwHealthBaseEntry) entriesForXValue.get(0), (HwHealthBarDataSet) t));
                }
            }
        }
        return hwEntrys;
    }

    public void c(float f) {
        this.f46465a = f;
    }

    public float a() {
        return this.f46465a;
    }

    public void e(DataInfos dataInfos) {
        if (dataInfos.isWeekData()) {
            c(311.1f);
            return;
        }
        if (dataInfos.isMonthData()) {
            c(534.6f);
            return;
        }
        if (dataInfos.isYearData()) {
            c(16272.001f);
        } else if (dataInfos.isDayData()) {
            c(12.6f);
        } else if (dataInfos.isAllData()) {
            c(81256.32f);
        }
    }
}
