package com.xiaomi.hm.health.bt.profile.grsp;

import androidx.annotation.NonNull;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class HMHealthBandSDControoler extends HMProSensorDataController {
    private List<SensorDataFragment> n;

    public HMHealthBandSDControoler(@NonNull GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.n = Collections.synchronizedList(new LinkedList());
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController, com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataProfile.ISensorDataListener
    public void onSensorData(SensorDataFragment fragment) {
        this.n.add(fragment);
        super.onSensorData(fragment);
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController
    public void sendSensorData(SensorDataFragment sensorData) {
        this.n.remove(sensorData);
        super.sendSensorData(sensorData);
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController
    public CheckData stop() {
        CheckData checkDataStop = super.stop();
        Iterator<SensorDataFragment> it2 = this.n.iterator();
        while (it2.hasNext()) {
            super.sendSensorData(it2.next());
        }
        this.n.clear();
        return checkDataStop;
    }
}
