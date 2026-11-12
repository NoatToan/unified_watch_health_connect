package com.github.mikephil.chartingv2.highlight;

import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.chartingv2.utils.SelectionDetail;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class ChartHighlighter<T extends BarLineScatterCandleBubbleDataProvider> {
    protected T mChart;

    public ChartHighlighter(T t7) {
        this.mChart = t7;
    }

    public int getDataSetIndex(int i14, float f14, float f15) {
        List<SelectionDetail> selectionDetailsAtIndex = getSelectionDetailsAtIndex(i14);
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.LEFT;
        float minimumDistance = Utils.getMinimumDistance(selectionDetailsAtIndex, f15, axisDependency);
        YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.RIGHT;
        if (minimumDistance >= Utils.getMinimumDistance(selectionDetailsAtIndex, f15, axisDependency2)) {
            axisDependency = axisDependency2;
        }
        return Utils.getClosestDataSetIndex(selectionDetailsAtIndex, f15, axisDependency);
    }

    public Highlight getHighlight(float f14, float f15) {
        int dataSetIndex;
        int xIndex = getXIndex(f14);
        if (xIndex == -2147483647 || (dataSetIndex = getDataSetIndex(xIndex, f14, f15)) == -2147483647) {
            return null;
        }
        return new Highlight(xIndex, dataSetIndex);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [com.github.mikephil.chartingv2.interfaces.datasets.IDataSet] */
    public List<SelectionDetail> getSelectionDetailsAtIndex(int i14) {
        ArrayList arrayList = new ArrayList();
        float[] fArr = new float[2];
        for (int i15 = 0; i15 < this.mChart.getData().getDataSetCount(); i15++) {
            ?? dataSetByIndex = this.mChart.getData().getDataSetByIndex(i15);
            if (dataSetByIndex.isHighlightEnabled()) {
                float yValForXIndex = dataSetByIndex.getYValForXIndex(i14);
                if (yValForXIndex != Float.NaN) {
                    fArr[1] = yValForXIndex;
                    this.mChart.getTransformer(dataSetByIndex.getAxisDependency()).pointValuesToPixel(fArr);
                    if (!Float.isNaN(fArr[1])) {
                        arrayList.add(new SelectionDetail(fArr[1], i15, dataSetByIndex));
                    }
                }
            }
        }
        return arrayList;
    }

    public int getXIndex(float f14) {
        float[] fArr = {f14, 0.0f};
        this.mChart.getTransformer(YAxis.AxisDependency.LEFT).pixelsToValue(fArr);
        return Math.round(fArr[0]);
    }
}
