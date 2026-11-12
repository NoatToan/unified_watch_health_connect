package com.github.mikephil.chartingv2.data.realm.implementation;

import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.realm.base.RealmBaseDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.IPieDataSet;
import com.github.mikephil.chartingv2.utils.Utils;
import io.realm.DynamicRealmObject;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmPieDataSet<T extends RealmObject> extends RealmBaseDataSet<T, Entry> implements IPieDataSet {
    private float mShift;
    private float mSliceSpace;

    public RealmPieDataSet(RealmResults<T> realmResults, String str) {
        super(realmResults, str);
        this.mSliceSpace = 0.0f;
        this.mShift = 18.0f;
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

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IPieDataSet
    public float getSelectionShift() {
        return this.mShift;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IPieDataSet
    public float getSliceSpace() {
        return this.mSliceSpace;
    }

    public void setSelectionShift(float f14) {
        this.mShift = Utils.convertDpToPixel(f14);
    }

    public void setSliceSpace(float f14) {
        if (f14 > 20.0f) {
            f14 = 20.0f;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        this.mSliceSpace = Utils.convertDpToPixel(f14);
    }

    public RealmPieDataSet(RealmResults<T> realmResults, String str, String str2) {
        super(realmResults, str, str2);
        this.mSliceSpace = 0.0f;
        this.mShift = 18.0f;
        build(this.results);
        calcMinMax(0, this.results.size());
    }
}
