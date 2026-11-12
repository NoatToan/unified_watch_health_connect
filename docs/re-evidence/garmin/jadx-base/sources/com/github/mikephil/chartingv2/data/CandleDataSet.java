package com.github.mikephil.chartingv2.data;

import android.graphics.Paint;
import com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class CandleDataSet extends LineScatterCandleRadarDataSet<CandleEntry> implements ICandleDataSet {
    private float mBarSpace;
    protected int mDecreasingColor;
    protected Paint.Style mDecreasingPaintStyle;
    protected int mIncreasingColor;
    protected Paint.Style mIncreasingPaintStyle;
    protected int mNeutralColor;
    protected int mShadowColor;
    private boolean mShadowColorSameAsCandle;
    private float mShadowWidth;
    private boolean mShowCandleBar;

    public CandleDataSet(List<CandleEntry> list, String str) {
        super(list, str);
        this.mShadowWidth = 3.0f;
        this.mShowCandleBar = true;
        this.mBarSpace = 0.1f;
        this.mShadowColorSameAsCandle = false;
        this.mIncreasingPaintStyle = Paint.Style.STROKE;
        this.mDecreasingPaintStyle = Paint.Style.FILL;
        this.mNeutralColor = 1122867;
        this.mIncreasingColor = 1122867;
        this.mDecreasingColor = 1122867;
        this.mShadowColor = 1122867;
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
        this.mYMin = Float.MAX_VALUE;
        this.mYMax = -3.4028235E38f;
        while (i14 <= i15) {
            CandleEntry candleEntry = (CandleEntry) this.mYVals.get(i14);
            if (candleEntry.getLow() < this.mYMin) {
                this.mYMin = candleEntry.getLow();
            }
            if (candleEntry.getHigh() > this.mYMax) {
                this.mYMax = candleEntry.getHigh();
            }
            i14++;
        }
    }

    @Override // com.github.mikephil.chartingv2.data.DataSet
    public DataSet<CandleEntry> copy() {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < this.mYVals.size(); i14++) {
            arrayList.add(((CandleEntry) this.mYVals.get(i14)).copy());
        }
        CandleDataSet candleDataSet = new CandleDataSet(arrayList, getLabel());
        candleDataSet.mColors = this.mColors;
        candleDataSet.mShadowWidth = this.mShadowWidth;
        candleDataSet.mShowCandleBar = this.mShowCandleBar;
        candleDataSet.mBarSpace = this.mBarSpace;
        candleDataSet.mHighLightColor = this.mHighLightColor;
        candleDataSet.mIncreasingPaintStyle = this.mIncreasingPaintStyle;
        candleDataSet.mDecreasingPaintStyle = this.mDecreasingPaintStyle;
        candleDataSet.mShadowColor = this.mShadowColor;
        return candleDataSet;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet
    public float getBarSpace() {
        return this.mBarSpace;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet
    public int getDecreasingColor() {
        return this.mDecreasingColor;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet
    public Paint.Style getDecreasingPaintStyle() {
        return this.mDecreasingPaintStyle;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet
    public int getIncreasingColor() {
        return this.mIncreasingColor;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet
    public Paint.Style getIncreasingPaintStyle() {
        return this.mIncreasingPaintStyle;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet
    public int getNeutralColor() {
        return this.mNeutralColor;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet
    public int getShadowColor() {
        return this.mShadowColor;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet
    public boolean getShadowColorSameAsCandle() {
        return this.mShadowColorSameAsCandle;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet
    public float getShadowWidth() {
        return this.mShadowWidth;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet
    public boolean getShowCandleBar() {
        return this.mShowCandleBar;
    }

    public void setBarSpace(float f14) {
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 0.45f) {
            f14 = 0.45f;
        }
        this.mBarSpace = f14;
    }

    public void setDecreasingColor(int i14) {
        this.mDecreasingColor = i14;
    }

    public void setDecreasingPaintStyle(Paint.Style style) {
        this.mDecreasingPaintStyle = style;
    }

    public void setIncreasingColor(int i14) {
        this.mIncreasingColor = i14;
    }

    public void setIncreasingPaintStyle(Paint.Style style) {
        this.mIncreasingPaintStyle = style;
    }

    public void setNeutralColor(int i14) {
        this.mNeutralColor = i14;
    }

    public void setShadowColor(int i14) {
        this.mShadowColor = i14;
    }

    public void setShadowColorSameAsCandle(boolean z14) {
        this.mShadowColorSameAsCandle = z14;
    }

    public void setShadowWidth(float f14) {
        this.mShadowWidth = Utils.convertDpToPixel(f14);
    }

    public void setShowCandleBar(boolean z14) {
        this.mShowCandleBar = z14;
    }
}
