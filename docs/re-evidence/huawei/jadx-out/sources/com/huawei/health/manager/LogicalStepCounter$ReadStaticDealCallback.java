package com.huawei.health.manager;

import android.os.Message;
import com.huawei.health.connectivity.standstepcounter.StandStepDataManager;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogicalStepCounter;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LogicalStepCounter$ReadStaticDealCallback implements HiAggregateListener {
    private WeakReference<LogicalStepCounter> d;
    private int e;

    public LogicalStepCounter$ReadStaticDealCallback(LogicalStepCounter logicalStepCounter, int i) {
        this.d = null;
        this.d = new WeakReference<>(logicalStepCounter);
        this.e = i;
    }

    @Override // com.huawei.hihealth.data.listener.HiAggregateListener
    public void onResult(List<HiHealthData> list, int i, int i2) {
        if (list == null || list.isEmpty()) {
            ReleaseLogUtil.e("Step_LSC", "ReadStaticDealCallback onResult data is null");
            a(this.e == 1017);
            return;
        }
        WeakReference<LogicalStepCounter> weakReference = this.d;
        if (weakReference == null) {
            ReleaseLogUtil.e("Step_LSC", "mLogicalStepCounterRef == null");
            return;
        }
        LogicalStepCounter logicalStepCounter = weakReference.get();
        if (logicalStepCounter == null || logicalStepCounter.bp == null) {
            return;
        }
        Message messageObtainMessage = logicalStepCounter.bp.obtainMessage(this.e);
        messageObtainMessage.obj = list;
        logicalStepCounter.bp.sendMessage(messageObtainMessage);
    }

    private void a(boolean z) {
        if (z) {
            LogicalStepCounter logicalStepCounter = this.d.get();
            if (logicalStepCounter != null) {
                StandStepDataManager standStepDataManager = logicalStepCounter.bg;
                if (standStepDataManager == null || !standStepDataManager.c(0)) {
                    return;
                }
                logicalStepCounter.ar();
                return;
            }
            LogUtil.a("Step_LSC", "refreshThirdStep stepCounter == null");
        }
    }

    @Override // com.huawei.hihealth.data.listener.HiAggregateListener
    public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
        if (list == null) {
            LogUtil.a("Step_LSC", "onResultIntent ", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            LogUtil.a("Step_LSC", "onResultIntent ", Integer.valueOf(i), Integer.valueOf(list.size()), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }
}
