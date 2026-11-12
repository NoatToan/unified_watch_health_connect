package defpackage;

import com.github.mikephil.charting.data.Entry;
import com.huawei.ui.commonui.linechart.common.HwEntrys;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDatasContainer;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class twm extends qnt {
    public twm(List<IHwHealthLineDataSet> list) {
        super(list);
    }

    @Override // defpackage.qnt, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData
    public Entry getEntryForXValue(float f, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        HwEntrys hwEntrys = new HwEntrys();
        for (T t : this.mDataSets) {
            if (t != null) {
                IHwHealthDatasContainer iHwHealthDatasContainerCacheDataContainer = t.cacheDataContainer(hwHealthBaseBarLineChart);
                if (iHwHealthDatasContainerCacheDataContainer instanceof IHwHealthLineDatasContainer) {
                    IHwHealthLineDatasContainer iHwHealthLineDatasContainer = (IHwHealthLineDatasContainer) iHwHealthDatasContainerCacheDataContainer;
                    if (iHwHealthLineDatasContainer instanceof fqi) {
                        List<HwHealthBaseEntry> listB = ((fqi) iHwHealthLineDatasContainer).b(f);
                        if (t instanceof HwHealthLineDataSet) {
                            if (njy.e(listB)) {
                                hwEntrys.add(new HwEntrys.HwDataEntry(null, (HwHealthLineDataSet) t));
                            } else {
                                hwEntrys.add(new HwEntrys.HwDataEntry(listB.get(0), (HwHealthLineDataSet) t));
                            }
                        }
                    }
                }
            }
        }
        return hwEntrys;
    }
}
