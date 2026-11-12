package com.xiaomi.hm.health.traininglib.hr;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.devicelib.DeviceCenter;
import com.xiaomi.hm.health.devicelib.DeviceConnectionStatus;
import com.xiaomi.hm.health.devicelib.DeviceHr;
import com.xiaomi.hm.health.devicelib.DeviceHrEvent;
import com.xiaomi.hm.health.devicelib.DeviceStep;
import com.xiaomi.hm.health.devicelib.PhonePressure;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingHrController implements DeviceCenter.IPeripheralListener {
    private boolean a;
    private TrainingHrHandler b;

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onBatteryLevelChanged(int i, HMDeviceSource hMDeviceSource) {
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onConnectionStatusChanged(DeviceConnectionStatus deviceConnectionStatus, HMDeviceSource hMDeviceSource) {
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onHrData(DeviceHr deviceHr) {
        if (this.a) {
            this.b.handleHr(System.currentTimeMillis() / 1000, deviceHr.getHr());
        }
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onHrState(DeviceHrEvent deviceHrEvent) {
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onPressureData(PhonePressure phonePressure) {
    }

    @Override // com.xiaomi.hm.health.devicelib.DeviceCenter.IPeripheralListener
    public void onStepData(DeviceStep deviceStep) {
    }

    public synchronized void pause() {
        DeviceCenter.getInstance().pause();
        this.a = false;
    }

    public synchronized void resume() {
        DeviceCenter.getInstance().resume();
        this.a = true;
    }

    public synchronized void start(long j, long j2, long j3) {
        this.b = new TrainingHrHandler(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        DeviceCenter.getInstance().setPeripheralListener(this);
        DeviceCenter.getInstance().start(new int[0]);
        this.a = true;
    }

    public synchronized void stop() {
        DeviceCenter.getInstance().stop();
        this.a = false;
    }
}
