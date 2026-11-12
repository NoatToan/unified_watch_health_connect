package com.huawei.health.sportservice.dataproducer;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 2, name = ComponentName.AI_TRAIN_STATUS_CODE_PRODUCER)
public class StatusCodeProducer extends BaseProducer implements SportLifecycle {
    private static final String TAG = "SportService_StatusCodeProducer";
    private int mStatusCode;

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onSaveData() {
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer, com.huawei.health.sportservice.inter.SourceToProducer
    public void onSourceDataChanged(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        this.mStatusCode = iIntValue;
        LogUtil.a(TAG, "mStatusCode ", Integer.valueOf(iIntValue));
        onStagingAndNotification();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        BaseSportManager.getInstance().subscribeToSource("STATUS_CODE_DATA", this);
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onStagingAndNotification() {
        BaseSportManager.getInstance().stagingAndNotification("STATUS_CODE_DATA", Integer.valueOf(this.mStatusCode));
    }
}
