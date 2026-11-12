package com.github.mikephil.chartingv2.data.realm.implementation;

import com.github.mikephil.chartingv2.data.PieData;
import com.github.mikephil.chartingv2.data.realm.base.RealmUtils;
import com.github.mikephil.chartingv2.interfaces.datasets.IPieDataSet;
import io.realm.RealmObject;
import io.realm.RealmResults;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmPieData extends PieData {
    public RealmPieData(RealmResults<? extends RealmObject> realmResults, String str, IPieDataSet iPieDataSet) {
        super(RealmUtils.toXVals(realmResults, str), iPieDataSet);
    }
}
