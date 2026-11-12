package com.xiaomi.hm.health.lab.activity;

import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBMDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.grsp.SensorType;
import com.xiaomi.hm.health.lab.activity.MonkeyBehaviorTaggingActivity;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.utils.StatEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class MonkeyBehaviorTaggingActivity extends BaseBehaviorTaggingActivity {
    private static final String R = "ShoesBehaviorTaggingActivity";
    private HMBMDevice P;
    private boolean Q = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k2() {
        return "labs 获取blue monkey信息成功";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l2() {
        return "labs blue monkey建立连接成功";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m2() {
        return "labs 未绑定blue monkey设备";
    }

    private void n2() {
        HMBMDevice hMBMDevice = this.P;
        if (hMBMDevice != null) {
            hMBMDevice.stopSensorData();
            this.P = null;
            this.i = false;
            this.k = false;
        }
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public boolean connectDevice() {
        HMBMDevice hMBMDevice = (HMBMDevice) LabCallbackInit.getInitCallBack().getDevice(HMDeviceType.OTHER);
        this.P = hMBMDevice;
        if (hMBMDevice != null) {
            HMLog.info(R, new Function0() { // from class: v75
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MonkeyBehaviorTaggingActivity.k2();
                }
            });
            DeviceInfo deviceInfo = this.P.getDeviceInfo();
            if (deviceInfo != null) {
                N1(deviceInfo);
                if (this.P.isConnected()) {
                    HMLog.info(R, new Function0() { // from class: x75
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return MonkeyBehaviorTaggingActivity.l2();
                        }
                    });
                    this.P.startSensorData(SensorType.GSENSOR.getValue() | SensorType.PPG.getValue(), this);
                    if (!this.Q) {
                        return true;
                    }
                    this.Q = false;
                    Analytics.event(this, StatEvent.LAB_TAGGING_BEHAVIORMARK_EQUIPMENT, "BlueMonkey");
                    return true;
                }
            }
        } else {
            HMLog.info(R, new Function0() { // from class: w75
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MonkeyBehaviorTaggingActivity.m2();
                }
            });
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public HMDeviceType getMyHMDeviceType() {
        return HMDeviceType.OTHER;
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public void stopOrPauseRecordSensorData() {
        n2();
    }
}
