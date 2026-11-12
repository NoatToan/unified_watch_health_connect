package defpackage;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.highlight.ChartHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.highlight.IHighlighter;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import com.huawei.ui.commonui.linechart.icommon.HwHealthCombinedDataProvider;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qmd extends ChartHighlighter<HwHealthCombinedDataProvider> implements IHighlighter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected qlx f46474c;

    public qmd(HwHealthCombinedDataProvider hwHealthCombinedDataProvider, HwHealthBarDataProvider hwHealthBarDataProvider) {
        super(hwHealthCombinedDataProvider);
        this.f46474c = hwHealthBarDataProvider.getBarData() == null ? null : new qlx(hwHealthBarDataProvider);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public List<Highlight> getHighlightsAtXValue(float f, float f2, float f3) {
        this.mHighlightBuffer.clear();
        List<HwHealthBaseBarLineData> listA = ((HwHealthCombinedDataProvider) this.mChart).getCombinedData().a();
        for (int i = 0; i < listA.size(); i++) {
            HwHealthBaseBarLineData hwHealthBaseBarLineData = listA.get(i);
            qlx qlxVar = this.f46474c;
            if (qlxVar != null && (hwHealthBaseBarLineData instanceof BarData)) {
                Highlight highlight = qlxVar.getHighlight(f2, f3);
                if (highlight != null) {
                    highlight.setDataIndex(i);
                    this.mHighlightBuffer.add(highlight);
                }
            } else {
                int dataSetCount = hwHealthBaseBarLineData.getDataSetCount();
                for (int i2 = 0; i2 < dataSetCount; i2++) {
                    IDataSet dataSetByIndex = listA.get(i).getDataSetByIndex(i2);
                    if (dataSetByIndex.isHighlightEnabled()) {
                        for (Highlight highlight2 : buildHighlights(dataSetByIndex, i2, f, DataSet.Rounding.CLOSEST)) {
                            highlight2.setDataIndex(i);
                            this.mHighlightBuffer.add(highlight2);
                        }
                    }
                }
            }
        }
        return this.mHighlightBuffer;
    }
}
