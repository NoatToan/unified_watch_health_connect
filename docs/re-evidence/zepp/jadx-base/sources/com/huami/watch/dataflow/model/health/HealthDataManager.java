package com.huami.watch.dataflow.model.health;

import com.huami.watch.dataflow.model.BaseDataManager;
import com.huami.watch.dataflow.model.health.bean.HealthDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthSummaryItem;

/* JADX INFO: loaded from: classes16.dex */
public class HealthDataManager extends BaseDataManager<HealthDataItem, HealthSummaryItem> {
    private static final String d = "DataFlow-Model-HealthData";
    private static HealthDataManager e;

    public static HealthDataManager getManager() {
        if (e == null) {
            e = new HealthDataManager();
        }
        return e;
    }

    @Override // com.huami.watch.dataflow.model.BaseDataManager
    public Class<HealthDataItem> itemClassType() {
        return HealthDataItem.class;
    }

    @Override // com.huami.watch.dataflow.model.BaseDataManager
    public Class<HealthSummaryItem> itemSummaryClassType() {
        return HealthSummaryItem.class;
    }

    @Override // com.huami.watch.dataflow.model.BaseDataManager
    public String tag() {
        return d;
    }
}
