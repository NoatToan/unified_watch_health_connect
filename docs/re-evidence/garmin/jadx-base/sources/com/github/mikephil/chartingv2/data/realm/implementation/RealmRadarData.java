package com.github.mikephil.chartingv2.data.realm.implementation;

import com.github.mikephil.chartingv2.data.RadarData;
import com.github.mikephil.chartingv2.data.realm.base.RealmUtils;
import com.github.mikephil.chartingv2.interfaces.datasets.IRadarDataSet;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmRadarData extends RadarData {
    public RealmRadarData(RealmResults<? extends RealmObject> realmResults, String str, List<IRadarDataSet> list) {
        super(RealmUtils.toXVals(realmResults, str), list);
    }
}
