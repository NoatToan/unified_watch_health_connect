package com.github.mikephil.chartingv2.data.realm.base;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet;
import com.github.mikephil.chartingv2.utils.Utils;
import io.realm.DynamicRealmObject;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class RealmLineRadarDataSet<T extends RealmObject> extends RealmLineScatterCandleRadarDataSet<T, Entry> implements ILineRadarDataSet<Entry> {
    private boolean mDrawFilled;
    private int mFillAlpha;
    private int mFillColor;
    protected Drawable mFillDrawable;
    private float mLineWidth;

    public RealmLineRadarDataSet(RealmResults<T> realmResults, String str) {
        super(realmResults, str);
        this.mFillColor = Color.rgb(140, 234, 255);
        this.mFillAlpha = 85;
        this.mLineWidth = 2.5f;
        this.mDrawFilled = false;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.github.mikephil.chartingv2.data.realm.base.RealmBaseDataSet
    public void build(RealmResults<T> realmResults) {
        if (this.mIndexField != null) {
            Iterator it = realmResults.iterator();
            while (it.hasNext()) {
                DynamicRealmObject dynamicRealmObject = new DynamicRealmObject((RealmObject) it.next());
                this.mValues.add((S) new Entry(dynamicRealmObject.getFloat(this.mValuesField), dynamicRealmObject.getInt(this.mIndexField)));
            }
            return;
        }
        Iterator it3 = realmResults.iterator();
        int i14 = 0;
        while (it3.hasNext()) {
            this.mValues.add((S) new Entry(new DynamicRealmObject((RealmObject) it3.next()).getFloat(this.mValuesField), i14));
            i14++;
        }
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet
    public int getFillAlpha() {
        return this.mFillAlpha;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet
    public int getFillColor() {
        return this.mFillColor;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet
    public Drawable getFillDrawable() {
        return this.mFillDrawable;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet
    public float getLineWidth() {
        return this.mLineWidth;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet
    public boolean isDrawFilledEnabled() {
        return this.mDrawFilled;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineRadarDataSet
    public void setDrawFilled(boolean z14) {
        this.mDrawFilled = z14;
    }

    public void setFillAlpha(int i14) {
        this.mFillAlpha = i14;
    }

    public void setFillColor(int i14) {
        this.mFillColor = i14;
        this.mFillDrawable = null;
    }

    public void setFillDrawable(Drawable drawable) {
        this.mFillDrawable = drawable;
    }

    public void setLineWidth(float f14) {
        if (f14 < 0.2f) {
            f14 = 0.2f;
        }
        if (f14 > 10.0f) {
            f14 = 10.0f;
        }
        this.mLineWidth = Utils.convertDpToPixel(f14);
    }

    public RealmLineRadarDataSet(RealmResults<T> realmResults, String str, String str2) {
        super(realmResults, str, str2);
        this.mFillColor = Color.rgb(140, 234, 255);
        this.mFillAlpha = 85;
        this.mLineWidth = 2.5f;
        this.mDrawFilled = false;
    }
}
