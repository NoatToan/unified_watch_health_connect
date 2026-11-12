package com.github.mikephil.chartingv2.data.realm.implementation;

import com.github.mikephil.chartingv2.data.BarData;
import com.github.mikephil.chartingv2.data.realm.base.RealmUtils;
import com.github.mikephil.chartingv2.interfaces.datasets.IBarDataSet;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmBarData extends BarData {
    public RealmBarData(RealmResults<? extends RealmObject> realmResults, String str, List<IBarDataSet> list) {
        super(RealmUtils.toXVals(realmResults, str), list);
    }
}
