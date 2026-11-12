package com.huawei.health.sportservice.dataproducer;

import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hau;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 2, name = ComponentName.VALID_TIMES_PRODUCER)
public class ValidTimesProducer extends BaseProducer implements SportLifecycle {
    private static final String TAG = "SportService_ValidTimesProducer";
    private int mValidTimes = 0;
    private hau mSportCallbackOption = new hau();

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onSaveData() {
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer, com.huawei.health.sportservice.inter.SourceToProducer
    public void onSourceDataChanged(Object obj) {
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("AI_TRAIN_RESULT_CODE");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.dataproducer.ValidTimesProducer$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1169xc259e283(list, map);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-dataproducer-ValidTimesProducer, reason: not valid java name */
    /* synthetic */ void m1169xc259e283(List list, Map map) {
        if (list.contains("AI_TRAIN_RESULT_CODE")) {
            Object obj = map.get("AI_TRAIN_RESULT_CODE");
            if (obj instanceof Integer) {
                calculateValidTimes(((Integer) obj).intValue());
            }
        }
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onStagingAndNotification() {
        BaseSportManager.getInstance().stagingAndNotification("AI_TRAIN_VALID_TIMES", Integer.valueOf(this.mValidTimes));
    }

    private void calculateValidTimes(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            int i2 = this.mValidTimes + 1;
            this.mValidTimes = i2;
            LogUtil.a(TAG, "mValidTimes is ", Integer.valueOf(i2));
            onStagingAndNotification();
        }
    }
}
