package com.github.mikephil.chartingv2.data;

import com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BubbleDataSet extends BarLineScatterCandleBubbleDataSet<BubbleEntry> implements IBubbleDataSet {
    private float mHighlightCircleWidth;
    protected float mMaxSize;
    protected float mXMax;
    protected float mXMin;

    public BubbleDataSet(List<BubbleEntry> list, String str) {
        super(list, str);
        this.mHighlightCircleWidth = 2.5f;
    }

    private float largestSize(BubbleEntry bubbleEntry) {
        return bubbleEntry.getSize();
    }

    private float xMax(BubbleEntry bubbleEntry) {
        return bubbleEntry.getXIndex();
    }

    private float xMin(BubbleEntry bubbleEntry) {
        return bubbleEntry.getXIndex();
    }

    private float yMax(BubbleEntry bubbleEntry) {
        return bubbleEntry.getVal();
    }

    private float yMin(BubbleEntry bubbleEntry) {
        return bubbleEntry.getVal();
    }

    @Override // com.github.mikephil.chartingv2.data.DataSet, com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void calcMinMax(int i14, int i15) {
        List<T> list = this.mYVals;
        if (list == 0 || list.size() == 0) {
            return;
        }
        if (i15 == 0 || i15 >= this.mYVals.size()) {
            i15 = this.mYVals.size() - 1;
        }
        this.mYMin = yMin((BubbleEntry) this.mYVals.get(i14));
        this.mYMax = yMax((BubbleEntry) this.mYVals.get(i14));
        while (i14 <= i15) {
            BubbleEntry bubbleEntry = (BubbleEntry) this.mYVals.get(i14);
            float fYMin = yMin(bubbleEntry);
            float fYMax = yMax(bubbleEntry);
            if (fYMin < this.mYMin) {
                this.mYMin = fYMin;
            }
            if (fYMax > this.mYMax) {
                this.mYMax = fYMax;
            }
            float fXMin = xMin(bubbleEntry);
            float fXMax = xMax(bubbleEntry);
            if (fXMin < this.mXMin) {
                this.mXMin = fXMin;
            }
            if (fXMax > this.mXMax) {
                this.mXMax = fXMax;
            }
            float fLargestSize = largestSize(bubbleEntry);
            if (fLargestSize > this.mMaxSize) {
                this.mMaxSize = fLargestSize;
            }
            i14++;
        }
    }

    @Override // com.github.mikephil.chartingv2.data.DataSet
    public DataSet<BubbleEntry> copy() {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < this.mYVals.size(); i14++) {
            arrayList.add(((BubbleEntry) this.mYVals.get(i14)).copy());
        }
        BubbleDataSet bubbleDataSet = new BubbleDataSet(arrayList, getLabel());
        bubbleDataSet.mColors = this.mColors;
        bubbleDataSet.mHighLightColor = this.mHighLightColor;
        return bubbleDataSet;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet
    public float getHighlightCircleWidth() {
        return this.mHighlightCircleWidth;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet
    public float getMaxSize() {
        return this.mMaxSize;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet
    public float getXMax() {
        return this.mXMax;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet
    public float getXMin() {
        return this.mXMin;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet
    public void setHighlightCircleWidth(float f14) {
        this.mHighlightCircleWidth = Utils.convertDpToPixel(f14);
    }
}
