package defpackage;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.huawei.ui.commonui.linechart.common.HwEntrys;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDatasContainer;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qnt extends HwHealthBaseBarLineData<IHwHealthLineDataSet> {
    public qnt(List<IHwHealthLineDataSet> list) {
        super(list);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData, com.github.mikephil.charting.data.ChartData
    public Entry getEntryForHighlight(Highlight highlight) {
        HwEntrys hwEntrys = new HwEntrys();
        for (T t : this.mDataSets) {
            if (t != null) {
                List<T> entriesForXValue = t.getEntriesForXValue(highlight.getX());
                if (!njy.e(entriesForXValue) && (t instanceof HwHealthLineDataSet)) {
                    hwEntrys.add(new HwEntrys.HwDataEntry((HwHealthBaseEntry) entriesForXValue.get(0), (HwHealthLineDataSet) t));
                }
            }
        }
        return hwEntrys;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData
    public Entry getEntryForXValue(float f, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        HwEntrys hwEntrys = new HwEntrys();
        for (T t : this.mDataSets) {
            if (t != null) {
                IHwHealthDatasContainer iHwHealthDatasContainerCacheDataContainer = t.cacheDataContainer(hwHealthBaseBarLineChart);
                if (iHwHealthDatasContainerCacheDataContainer instanceof IHwHealthLineDatasContainer) {
                    List<HwHealthBaseEntry> listSearchEntryForXValue = ((IHwHealthLineDatasContainer) iHwHealthDatasContainerCacheDataContainer).searchEntryForXValue(f);
                    if (t instanceof HwHealthLineDataSet) {
                        if (njy.e(listSearchEntryForXValue)) {
                            hwEntrys.add(new HwEntrys.HwDataEntry(null, (HwHealthLineDataSet) t));
                        } else {
                            hwEntrys.add(new HwEntrys.HwDataEntry(listSearchEntryForXValue.get(0), (HwHealthLineDataSet) t));
                        }
                    }
                }
            }
        }
        return hwEntrys;
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData
    public float getNearestValueForXValue(float f, HwHealthBaseBarLineChart hwHealthBaseBarLineChart, HwHealthBaseBarLineChart.MarkerViewSlidingMode markerViewSlidingMode) {
        IHwHealthLineDatasContainer iHwHealthLineDatasContainer;
        HwHealthBaseEntry hwHealthBaseEntryAcquireNearestPoint;
        if (!njy.b(this.mDataSets) || hwHealthBaseBarLineChart == null || !(((IHwHealthLineDataSet) this.mDataSets.get(0)).cacheDataContainer(hwHealthBaseBarLineChart) instanceof IHwHealthLineDatasContainer) || (iHwHealthLineDatasContainer = (IHwHealthLineDatasContainer) ((IHwHealthLineDataSet) this.mDataSets.get(0)).cacheDataContainer(hwHealthBaseBarLineChart)) == null) {
            return f;
        }
        List<HwHealthBaseEntry> listSearchEntryForXValue = iHwHealthLineDatasContainer.searchEntryForXValue(f);
        if (njy.b(listSearchEntryForXValue)) {
            return listSearchEntryForXValue.get(0).getX();
        }
        return (!HwHealthBaseBarLineChart.MarkerViewSlidingMode.FORCE_ACCORDING_DATA.equals(markerViewSlidingMode) || (hwHealthBaseEntryAcquireNearestPoint = iHwHealthLineDatasContainer.acquireNearestPoint(f)) == null) ? f : hwHealthBaseEntryAcquireNearestPoint.getX();
    }
}
