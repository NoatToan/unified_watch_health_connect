package com.github.mikephil.chartingv2.data;

import com.github.mikephil.chartingv2.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class CombinedData extends BarLineScatterCandleBubbleData<IBarLineScatterCandleBubbleDataSet<?>> {
    private BarData mBarData;
    private BubbleData mBubbleData;
    private CandleData mCandleData;
    private LineData mLineData;
    private ScatterData mScatterData;

    public CombinedData() {
    }

    public List<ChartData> getAllData() {
        ArrayList arrayList = new ArrayList();
        LineData lineData = this.mLineData;
        if (lineData != null) {
            arrayList.add(lineData);
        }
        BarData barData = this.mBarData;
        if (barData != null) {
            arrayList.add(barData);
        }
        ScatterData scatterData = this.mScatterData;
        if (scatterData != null) {
            arrayList.add(scatterData);
        }
        CandleData candleData = this.mCandleData;
        if (candleData != null) {
            arrayList.add(candleData);
        }
        BubbleData bubbleData = this.mBubbleData;
        if (bubbleData != null) {
            arrayList.add(bubbleData);
        }
        return arrayList;
    }

    public BarData getBarData() {
        return this.mBarData;
    }

    public BubbleData getBubbleData() {
        return this.mBubbleData;
    }

    public CandleData getCandleData() {
        return this.mCandleData;
    }

    public LineData getLineData() {
        return this.mLineData;
    }

    public ScatterData getScatterData() {
        return this.mScatterData;
    }

    @Override // com.github.mikephil.chartingv2.data.ChartData
    public void notifyDataChanged() {
        LineData lineData = this.mLineData;
        if (lineData != null) {
            lineData.notifyDataChanged();
        }
        BarData barData = this.mBarData;
        if (barData != null) {
            barData.notifyDataChanged();
        }
        CandleData candleData = this.mCandleData;
        if (candleData != null) {
            candleData.notifyDataChanged();
        }
        ScatterData scatterData = this.mScatterData;
        if (scatterData != null) {
            scatterData.notifyDataChanged();
        }
        BubbleData bubbleData = this.mBubbleData;
        if (bubbleData != null) {
            bubbleData.notifyDataChanged();
        }
        init();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void setData(LineData lineData) {
        this.mLineData = lineData;
        this.mDataSets.addAll((Collection<? extends T>) lineData.getDataSets());
        init();
    }

    public CombinedData(List<String> list) {
        super(list);
    }

    public CombinedData(String[] strArr) {
        super(strArr);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void setData(BarData barData) {
        this.mBarData = barData;
        this.mDataSets.addAll((Collection<? extends T>) barData.getDataSets());
        init();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void setData(ScatterData scatterData) {
        this.mScatterData = scatterData;
        this.mDataSets.addAll((Collection<? extends T>) scatterData.getDataSets());
        init();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void setData(CandleData candleData) {
        this.mCandleData = candleData;
        this.mDataSets.addAll((Collection<? extends T>) candleData.getDataSets());
        init();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void setData(BubbleData bubbleData) {
        this.mBubbleData = bubbleData;
        this.mDataSets.addAll((Collection<? extends T>) bubbleData.getDataSets());
        init();
    }
}
