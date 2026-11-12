package com.github.mikephil.chartingv2.data.realm.implementation;

import com.github.mikephil.chartingv2.data.BubbleEntry;
import com.github.mikephil.chartingv2.data.realm.base.RealmBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.chartingv2.utils.Utils;
import io.realm.DynamicRealmObject;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmBubbleDataSet<T extends RealmObject> extends RealmBarLineScatterCandleBubbleDataSet<T, BubbleEntry> implements IBubbleDataSet {
    private float mHighlightCircleWidth;
    protected float mMaxSize;
    private String mSizeField;
    protected float mXMax;
    protected float mXMin;

    public RealmBubbleDataSet(RealmResults<T> realmResults, String str, String str2) {
        super(realmResults, str);
        this.mHighlightCircleWidth = 2.5f;
        this.mSizeField = str2;
        build(this.results);
        calcMinMax(0, this.results.size());
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

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.github.mikephil.chartingv2.data.realm.base.RealmBaseDataSet
    public void build(RealmResults<T> realmResults) {
        if (this.mIndexField != null) {
            Iterator it = realmResults.iterator();
            while (it.hasNext()) {
                DynamicRealmObject dynamicRealmObject = new DynamicRealmObject((RealmObject) it.next());
                this.mValues.add(new BubbleEntry(dynamicRealmObject.getInt(this.mIndexField), dynamicRealmObject.getFloat(this.mValuesField), dynamicRealmObject.getFloat(this.mSizeField)));
            }
            return;
        }
        Iterator it3 = realmResults.iterator();
        int i14 = 0;
        while (it3.hasNext()) {
            DynamicRealmObject dynamicRealmObject2 = new DynamicRealmObject((RealmObject) it3.next());
            this.mValues.add(new BubbleEntry(i14, dynamicRealmObject2.getFloat(this.mValuesField), dynamicRealmObject2.getFloat(this.mSizeField)));
            i14++;
        }
    }

    @Override // com.github.mikephil.chartingv2.data.realm.base.RealmBaseDataSet, com.github.mikephil.chartingv2.interfaces.datasets.IDataSet
    public void calcMinMax(int i14, int i15) {
        List<S> list = this.mValues;
        if (list == 0 || list.size() == 0) {
            return;
        }
        if (i15 == 0 || i15 >= this.mValues.size()) {
            i15 = this.mValues.size() - 1;
        }
        this.mYMin = yMin((BubbleEntry) this.mValues.get(i14));
        this.mYMax = yMax((BubbleEntry) this.mValues.get(i14));
        while (i14 < i15) {
            BubbleEntry bubbleEntry = (BubbleEntry) this.mValues.get(i14);
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

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet
    public float getHighlightCircleWidth() {
        return this.mHighlightCircleWidth;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet
    public float getMaxSize() {
        return this.mMaxSize;
    }

    public String getSizeField() {
        return this.mSizeField;
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

    public void setSizeField(String str) {
        this.mSizeField = str;
    }

    public RealmBubbleDataSet(RealmResults<T> realmResults, String str, String str2, String str3) {
        super(realmResults, str, str2);
        this.mHighlightCircleWidth = 2.5f;
        this.mSizeField = str3;
        build(this.results);
        calcMinMax(0, this.results.size());
    }
}
