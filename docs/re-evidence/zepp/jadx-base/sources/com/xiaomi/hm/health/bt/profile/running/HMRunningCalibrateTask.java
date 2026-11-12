package com.xiaomi.hm.health.bt.profile.running;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.BleCallBack;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;

/* JADX INFO: loaded from: classes18.dex */
public class HMRunningCalibrateTask extends HMBaseTask implements IGattCallback.INotifyCallback {
    private RunningProfile b;
    private BleCallBack c;
    private byte[] d;
    private int e;

    public HMRunningCalibrateTask(RunningProfile runningProfile, BleCallBack callBack) {
        this.d = null;
        this.e = 5000;
        this.b = runningProfile;
        this.c = callBack;
    }

    private void a(int timeout) {
        synchronized (this.c) {
            try {
                this.c.wait(timeout);
            } catch (Exception unused) {
            }
        }
    }

    private void b(byte[] value) {
        synchronized (this.c) {
            this.b.unRegisterDataControlNotification(RunningProfile.TYPE_CALIBRATE);
            this.d = value;
            this.c.notify();
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        BleCallBack bleCallBack = this.c;
        if (bleCallBack != null) {
            bleCallBack.onStart();
            RunningProfile runningProfile = this.b;
            if (runningProfile == null || !runningProfile.isConnected()) {
                this.c.onFinish(Boolean.FALSE);
                return;
            }
            this.b.registerDataControlNotification(RunningProfile.TYPE_CALIBRATE, this);
            this.b.enableCalibrate(true);
            a(this.e);
            this.b.enableCalibrate(false);
            if (this.d == null) {
                a(2000);
            }
            this.b.unRegisterDataControlNotification(RunningProfile.TYPE_CALIBRATE);
            byte[] bArr = this.d;
            boolean z = bArr != null && bArr.length == 1;
            if (z) {
                z = bArr[0] == 1;
            }
            this.c.onFinish(Boolean.valueOf(z));
        }
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
    public void notify(byte[] value) {
        Debug.fi("RunningCalibrateTask", "notify:" + GattUtils.bytesToHexString(value));
        b(value);
    }

    public void stop() {
        b(null);
    }

    public HMRunningCalibrateTask(RunningProfile runningProfile, int calibrateTime, BleCallBack callBack) {
        this.d = null;
        this.e = 5000;
        this.b = runningProfile;
        this.c = callBack;
        this.e = calibrateTime;
    }
}
