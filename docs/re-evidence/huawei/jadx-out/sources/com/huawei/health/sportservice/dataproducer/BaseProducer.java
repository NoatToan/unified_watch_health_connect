package com.huawei.health.sportservice.dataproducer;

import com.huawei.health.sportservice.inter.SourceToProducer;
import com.huawei.health.sportservice.manager.BaseSportManager;

/* JADX INFO: loaded from: classes31.dex */
public abstract class BaseProducer implements SourceToProducer {
    private static final int FILL_POINT_TIME_INTERVAL = 5000;
    protected boolean mIsFilledPoint;

    void fillList(long j, long j2) {
    }

    abstract void onSaveData();

    @Override // com.huawei.health.sportservice.inter.SourceToProducer
    public abstract void onSourceDataChanged(Object obj);

    abstract void onStagingAndNotification();

    void recoveryData() {
    }

    void fillPoint() {
        if (this.mIsFilledPoint) {
            return;
        }
        if (!isNeedFillList()) {
            this.mIsFilledPoint = true;
            return;
        }
        this.mIsFilledPoint = true;
        Object data = BaseSportManager.getInstance().getData("TIME_FIVE_SECOND_DURATION");
        Object data2 = BaseSportManager.getInstance().getData("TIME_FIVE_SECOND_TIMESTAMP");
        if ((data instanceof Long) && (data2 instanceof Long)) {
            long jLongValue = ((Long) data).longValue();
            long jLongValue2 = ((Long) data2).longValue();
            if (jLongValue < 5000) {
                return;
            }
            while (jLongValue > 5000) {
                fillList(jLongValue, jLongValue2);
                jLongValue -= 5000;
                jLongValue2 -= 5000;
            }
        }
    }

    boolean isNeedFillList() {
        return !BaseSportManager.getInstance().isRestart();
    }
}
