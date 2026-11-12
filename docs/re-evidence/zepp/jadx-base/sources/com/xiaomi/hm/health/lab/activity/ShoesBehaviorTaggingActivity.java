package com.xiaomi.hm.health.lab.activity;

import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMNormandyDevice;
import com.xiaomi.hm.health.bt.device.HMShoesDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.grsp.SensorType;
import com.xiaomi.hm.health.lab.activity.ShoesBehaviorTaggingActivity;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.utils.StatEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class ShoesBehaviorTaggingActivity extends BaseBehaviorTaggingActivity {
    private static final String R = "ShoesBehaviorTaggingActivity";
    private HMBaseDevice P;
    private boolean Q = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k2() {
        return "labs 获取跑鞋信息成功";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l2() {
        return "labs 跑鞋建立连接成功";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m2() {
        return "labs 未绑定智能跑鞋设备";
    }

    private void n2() {
        HMBaseDevice hMBaseDevice = this.P;
        if (hMBaseDevice instanceof HMNormandyDevice) {
            ((HMNormandyDevice) hMBaseDevice).startSensorData(SensorType.GSENSOR.getValue() | SensorType.GYRO.getValue(), this);
        } else if (hMBaseDevice instanceof HMShoesDevice) {
            ((HMShoesDevice) hMBaseDevice).startSensorData(SensorType.GSENSOR.getValue(), this);
        }
    }

    private void o2() {
        HMBaseDevice hMBaseDevice = this.P;
        if (hMBaseDevice != null) {
            if (hMBaseDevice instanceof HMNormandyDevice) {
                ((HMNormandyDevice) hMBaseDevice).stopSensorData();
            } else if (hMBaseDevice instanceof HMShoesDevice) {
                ((HMShoesDevice) hMBaseDevice).stopSensorData();
            }
            this.P = null;
            this.i = false;
            this.k = false;
        }
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public boolean connectDevice() {
        HMBaseDevice device = LabCallbackInit.getInitCallBack().getDevice(HMDeviceType.SHOES);
        this.P = device;
        if (device != null) {
            HMLog.info(R, new Function0() { // from class: gu6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return ShoesBehaviorTaggingActivity.k2();
                }
            });
            DeviceInfo deviceInfo = this.P.getDeviceInfo();
            if (deviceInfo != null) {
                N1(deviceInfo);
                if (this.P.isConnected()) {
                    HMLog.info(R, new Function0() { // from class: eu6
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return ShoesBehaviorTaggingActivity.l2();
                        }
                    });
                    n2();
                    if (!this.Q) {
                        return true;
                    }
                    this.Q = false;
                    Analytics.event(this, StatEvent.LAB_TAGGING_BEHAVIORMARK_EQUIPMENT, "RunShoe");
                    return true;
                }
            }
        } else {
            HMLog.info(R, new Function0() { // from class: fu6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return ShoesBehaviorTaggingActivity.m2();
                }
            });
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public HMDeviceType getMyHMDeviceType() {
        return HMDeviceType.SHOES;
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public void stopOrPauseRecordSensorData() {
        o2();
    }
}
