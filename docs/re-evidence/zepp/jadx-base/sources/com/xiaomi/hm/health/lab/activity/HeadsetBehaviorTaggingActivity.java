package com.xiaomi.hm.health.lab.activity;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.MozartDevice;
import com.xiaomi.hm.health.bt.profile.grsp.SensorType;
import com.xiaomi.hm.health.lab.activity.HeadsetBehaviorTaggingActivity;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class HeadsetBehaviorTaggingActivity extends BaseBehaviorTaggingActivity {
    private final String P = "HeadsetBehaviorTaggingActivity";
    private MozartDevice Q;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j2() {
        return "已获取耳机对象";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k2() {
        return "耳机对象为空或未连接";
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public boolean connectDevice() {
        MozartDevice mozartDevice = (MozartDevice) LabCallbackInit.getInitCallBack().getDevice(HMDeviceType.HEADSET);
        this.Q = mozartDevice;
        if (mozartDevice == null || !mozartDevice.isConnected()) {
            HMLog.info("HeadsetBehaviorTaggingActivity", new Function0() { // from class: et3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HeadsetBehaviorTaggingActivity.k2();
                }
            });
            return false;
        }
        HMLog.info("HeadsetBehaviorTaggingActivity", new Function0() { // from class: dt3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HeadsetBehaviorTaggingActivity.j2();
            }
        });
        N1(this.Q.getDeviceInfo());
        this.Q.startSensorData(SensorType.GSENSOR.getValue(), this);
        return true;
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public HMDeviceType getMyHMDeviceType() {
        return HMDeviceType.HEADSET;
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public void stopOrPauseRecordSensorData() {
        MozartDevice mozartDevice = this.Q;
        if (mozartDevice != null) {
            mozartDevice.stopSensorData();
            this.Q = null;
            this.i = false;
            this.k = false;
        }
    }
}
