package com.xiaomi.hm.health.device.callback;

import com.huami.devicex.injection.basic.HRDataManagerApi;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HMHrData;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.eventbus.EventHeartRateChanged;
import com.xiaomi.hm.health.eventbus.EventHeartRateSync;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class MyHrDataSyncCallback implements IHMHrDataCallback {
    private final String a = "MyHrDataSyncCallback";
    private final Lazy<DeviceManagerApi> b = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceTimeStoreApi> c = KoinJavaComponent.inject(DeviceTimeStoreApi.class);
    private final Lazy<HRDataManagerApi> d = KoinJavaComponent.inject(HRDataManagerApi.class);

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback
    public void onHrData(ArrayList<HMHrData> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        ArrayList<HeartRate> arrayList2 = new ArrayList<>();
        Calendar proHrSyncTime = this.c.getValue().getProHrSyncTime();
        for (HMHrData hMHrData : arrayList) {
            int hr = hMHrData.getHr();
            HMLog.d("MyHrDataSyncCallback", "time:" + hMHrData.getTime().getTime().toString() + ",hr:" + hr, new Object[0]);
            if (hr <= 0) {
                HMLog.i("MyHrDataSyncCallback", "drop as invalid hr value:" + hr, new Object[0]);
            } else if (hMHrData.getTime().getTimeInMillis() < proHrSyncTime.getTimeInMillis()) {
                HMLog.i("MyHrDataSyncCallback", "drop as old hr value:" + hr, new Object[0]);
            } else {
                HeartRate heartRate = new HeartRate();
                heartRate.setHr(Integer.valueOf(hr));
                heartRate.setTime(Long.valueOf(hMHrData.getTime().getTimeInMillis() / 1000));
                heartRate.setType(2);
                heartRate.setState(0);
                heartRate.setTime_zone(Integer.valueOf(TimeZone.getDefault().getRawOffset()));
                DeviceManagerApi value = this.b.getValue();
                HMDeviceType hMDeviceType = HMDeviceType.MILI;
                heartRate.setDevice_id(value.getBoundDeviceId(hMDeviceType));
                heartRate.setDevice_type(Integer.valueOf(hMDeviceType.getValue()));
                heartRate.setDevice_source(Integer.valueOf(HMDeviceConfig.getFeatureHrDevice().getValue()));
                arrayList2.add(heartRate);
            }
        }
        Calendar time = arrayList.get(arrayList.size() - 1).getTime();
        time.add(14, 1000);
        this.c.getValue().setProHrSyncTime(time);
        this.d.getValue().insertHeartRateList(arrayList2);
        if (arrayList2.size() > 0) {
            EventBus.getDefault().post(new EventHeartRateSync(arrayList2));
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback
    public void onHrStart() {
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.hr.IHMHrDataCallback
    public void onHrStop(boolean z) {
        if (z) {
            this.d.getValue().syncToServer();
            EventBus.getDefault().post(new EventHeartRateChanged());
        }
    }
}
