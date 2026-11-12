package com.github.mikephil.chartingv2.highlight;

import com.github.mikephil.chartingv2.data.ChartData;
import com.github.mikephil.chartingv2.data.CombinedData;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.IDataSet;
import com.github.mikephil.chartingv2.utils.SelectionDetail;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class CombinedHighlighter extends ChartHighlighter<BarLineScatterCandleBubbleDataProvider> {
    public CombinedHighlighter(BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider) {
        super(barLineScatterCandleBubbleDataProvider);
    }

    @Override // com.github.mikephil.chartingv2.highlight.ChartHighlighter
    public List<SelectionDetail> getSelectionDetailsAtIndex(int i14) {
        List<ChartData> allData = ((CombinedData) this.mChart.getData()).getAllData();
        ArrayList arrayList = new ArrayList();
        float[] fArr = new float[2];
        for (int i15 = 0; i15 < allData.size(); i15++) {
            for (int i16 = 0; i16 < allData.get(i15).getDataSetCount(); i16++) {
                IDataSet dataSetByIndex = allData.get(i15).getDataSetByIndex(i16);
                if (dataSetByIndex.isHighlightEnabled()) {
                    float yValForXIndex = dataSetByIndex.getYValForXIndex(i14);
                    if (yValForXIndex != Float.NaN) {
                        fArr[1] = yValForXIndex;
                        this.mChart.getTransformer(dataSetByIndex.getAxisDependency()).pointValuesToPixel(fArr);
                        if (!Float.isNaN(fArr[1])) {
                            arrayList.add(new SelectionDetail(fArr[1], i16, dataSetByIndex));
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
