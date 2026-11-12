package com.github.mikephil.chartingv2.data.realm.base;

import android.graphics.Color;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import io.realm.RealmObject;
import io.realm.RealmResults;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class RealmBarLineScatterCandleBubbleDataSet<T extends RealmObject, S extends Entry> extends RealmBaseDataSet<T, S> implements IBarLineScatterCandleBubbleDataSet<S> {
    protected int mHighLightColor;

    public RealmBarLineScatterCandleBubbleDataSet(RealmResults<T> realmResults, String str) {
        super(realmResults, str);
        this.mHighLightColor = Color.rgb(255, 187, 115);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IBarLineScatterCandleBubbleDataSet
    public int getHighLightColor() {
        return this.mHighLightColor;
    }

    public void setHighLightColor(int i14) {
        this.mHighLightColor = i14;
    }

    public RealmBarLineScatterCandleBubbleDataSet(RealmResults<T> realmResults, String str, String str2) {
        super(realmResults, str, str2);
        this.mHighLightColor = Color.rgb(255, 187, 115);
    }
}
