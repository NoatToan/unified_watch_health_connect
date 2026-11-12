package com.github.mikephil.chartingv2.data.realm.implementation;

import com.github.mikephil.chartingv2.data.LineData;
import com.github.mikephil.chartingv2.data.realm.base.RealmUtils;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmLineData extends LineData {
    public RealmLineData(RealmResults<? extends RealmObject> realmResults, String str, List<ILineDataSet> list) {
        super(RealmUtils.toXVals(realmResults, str), list);
    }
}
