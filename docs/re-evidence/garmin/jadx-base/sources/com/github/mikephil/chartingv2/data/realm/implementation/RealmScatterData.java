package com.github.mikephil.chartingv2.data.realm.implementation;

import com.github.mikephil.chartingv2.data.ScatterData;
import com.github.mikephil.chartingv2.data.realm.base.RealmUtils;
import com.github.mikephil.chartingv2.interfaces.datasets.IScatterDataSet;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmScatterData extends ScatterData {
    public RealmScatterData(RealmResults<? extends RealmObject> realmResults, String str, List<IScatterDataSet> list) {
        super(RealmUtils.toXVals(realmResults, str), list);
    }
}
