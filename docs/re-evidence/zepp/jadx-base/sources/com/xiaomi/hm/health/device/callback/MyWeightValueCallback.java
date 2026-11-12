package com.xiaomi.hm.health.device.callback;

import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.event.EventUpdateUnit;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.device.event.HMDeviceWeightValueEvent;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class MyWeightValueCallback extends HMCallback<WeightAdvData> {
    private HMDeviceSource b;
    private final String a = "MyWeightValueCallback";
    private final Lazy<AccountWebExtApi> c = KoinJavaComponent.inject(AccountWebExtApi.class);

    public MyWeightValueCallback(HMDeviceSource hMDeviceSource) {
        this.b = HMDeviceSource.WEIGHT;
        this.b = hMDeviceSource;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onData(WeightAdvData weightAdvData) {
        super.onData(weightAdvData);
        HMLog.d("MyWeightValueCallback", "WeightAdvData:" + weightAdvData, new Object[0]);
        if (this.b == HMDeviceSource.WEIGHT) {
            int type = weightAdvData.getType();
            if (type == 0) {
                UnitManager.getInstance().setWeightUnit(0);
            } else if (type == 16) {
                UnitManager.getInstance().setWeightUnit(16);
            } else if (type == 1) {
                UnitManager.getInstance().setWeightUnit(1);
            }
        } else {
            int type2 = weightAdvData.getType();
            HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
            int weightBfsUnit = hMPersonInfo.getMiliConfig().getWeightBfsUnit();
            HMLog.i("MyWeightValueCallback", "type = " + type2 + ", localSavedType = " + weightBfsUnit, new Object[0]);
            if (type2 != weightBfsUnit) {
                hMPersonInfo.getMiliConfig().setWeightBfsUnit(type2);
                hMPersonInfo.saveInfo(2);
                this.c.getValue().updateProfile(false);
                EventBus.getDefault().post(new EventUpdateUnit());
            }
        }
        if (weightAdvData.getValue() > 0.0f || weightAdvData.isFinish()) {
            EventBus.getDefault().post(new HMDeviceWeightValueEvent(weightAdvData));
        } else {
            HMLog.i("MyWeightValueCallback", "drop data as weight is 0!!!", new Object[0]);
        }
    }
}
