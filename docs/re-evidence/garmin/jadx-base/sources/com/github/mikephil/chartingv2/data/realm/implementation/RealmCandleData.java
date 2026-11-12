package com.github.mikephil.chartingv2.data.realm.implementation;

import com.github.mikephil.chartingv2.data.CandleData;
import com.github.mikephil.chartingv2.data.realm.base.RealmUtils;
import com.github.mikephil.chartingv2.interfaces.datasets.ICandleDataSet;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmCandleData extends CandleData {
    public RealmCandleData(RealmResults<? extends RealmObject> realmResults, String str, List<ICandleDataSet> list) {
        super(RealmUtils.toXVals(realmResults, str), list);
    }
}
