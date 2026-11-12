package com.github.mikephil.chartingv2.data.realm.implementation;

import com.github.mikephil.chartingv2.data.BubbleData;
import com.github.mikephil.chartingv2.data.realm.base.RealmUtils;
import com.github.mikephil.chartingv2.interfaces.datasets.IBubbleDataSet;
import io.realm.RealmObject;
import io.realm.RealmResults;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmBubbleData extends BubbleData {
    public RealmBubbleData(RealmResults<? extends RealmObject> realmResults, String str, List<IBubbleDataSet> list) {
        super(RealmUtils.toXVals(realmResults, str), list);
    }
}
