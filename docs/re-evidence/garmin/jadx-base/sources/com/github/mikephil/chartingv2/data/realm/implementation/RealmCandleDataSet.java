package com.github.mikephil.chartingv2.data.realm.implementation;

import android.graphics.Paint;
import com.github.mikephil.chartingv2.data.CandleEntry;
import com.github.mikephil.chartingv2.data.realm.base.RealmLineScatterCandleRadarDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.chartingv2.utils.Utils;
import io.realm.DynamicRealmObject;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmCandleDataSet<T extends RealmObject> extends RealmLineScatterCandleRadarDataSet<T, CandleEntry> implements ICandleDataSet {
    private float mBarSpace;
    private String mCloseField;
    protected int mDecreasingColor;
    protected Paint.Style mDecreasingPaintStyle;
    private String mHighField;
    protected int mIncreasingColor;
    protected Paint.Style mIncreasingPaintStyle;
    private String mLowField;
    protected int mNeutralColor;
    private String mOpenField;
    protected int mShadowColor;
    private boolean mShadowColorSameAsCandle;
    private float mShadowWidth;
    private boolean mShowCandleBar;

    public RealmCandleDataSet(RealmResults<T> realmResults, String str, String str2, String str3, String str4) {
        super(realmResults, null);
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
        this.mHighField = str;
        this.mLowField = str2;
        this.mOpenField = str3;
        this.mCloseField = str4;
        build(this.results);
        calcMinMax(0, this.results.size());
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.github.mikephil.chartingv2.data.realm.base.RealmBaseDataSet
    public void build(RealmResults<T> realmResults) {
        if (this.mIndexField != null) {
            Iterator it = realmResults.iterator();
            while (it.hasNext()) {
                DynamicRealmObject dynamicRealmObject = new DynamicRealmObject((RealmObject) it.next());
                this.mValues.add(new CandleEntry(dynamicRealmObject.getInt(this.mIndexField), dynamicRealmObject.getFloat(this.mHighField), dynamicRealmObject.getFloat(this.mLowField), dynamicRealmObject.getFloat(this.mOpenField), dynamicRealmObject.getFloat(this.mCloseField)));
            }
            return;
        }
        Iterator it3 = realmResults.iterator();
        int i14 = 0;
        while (it3.hasNext()) {
            DynamicRealmObject dynamicRealmObject2 = new DynamicRealmObject((RealmObject) it3.next());
            this.mValues.add(new CandleEntry(i14, dynamicRealmObject2.getFloat(this.mHighField), dynamicRealmObject2.getFloat(this.mLowField), dynamicRealmObject2.getFloat(this.mOpenField), dynamicRealmObject2.getFloat(this.mCloseField)));
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
        this.mYMin = Float.MAX_VALUE;
        this.mYMax = -3.4028235E38f;
        while (i14 <= i15) {
            CandleEntry candleEntry = (CandleEntry) this.mValues.get(i14);
            if (candleEntry.getLow() < this.mYMin) {
                this.mYMin = candleEntry.getLow();
            }
            if (candleEntry.getHigh() > this.mYMax) {
                this.mYMax = candleEntry.getHigh();
            }
            i14++;
        }
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

    public RealmCandleDataSet(RealmResults<T> realmResults, String str, String str2, String str3, String str4, String str5) {
        super(realmResults, null, str5);
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
        this.mHighField = str;
        this.mLowField = str2;
        this.mOpenField = str3;
        this.mCloseField = str4;
        build(this.results);
        calcMinMax(0, this.results.size());
    }
}
