package com.xiaomi.hm.health.lab.activity;

import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.grsp.SensorType;
import com.xiaomi.hm.health.lab.activity.EarbudBehaviorTaggingActivity;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.utils.StatEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class EarbudBehaviorTaggingActivity extends BaseBehaviorTaggingActivity {
    private static final String R = "ShoesBehaviorTaggingActivity";
    private HmEarbudDevice P;
    private boolean Q = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String k2() {
        return "labs 获取earbud信息成功";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l2() {
        return "labs 获取earbud信息成功建立连接成功";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m2() {
        return "labs 未绑定获取earbud信息成功设备";
    }

    private void n2() {
        HmEarbudDevice hmEarbudDevice = this.P;
        if (hmEarbudDevice != null) {
            hmEarbudDevice.stopSensorData();
            this.P = null;
            this.i = false;
            this.k = false;
        }
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public boolean connectDevice() {
        HmEarbudDevice hmEarbudDevice = (HmEarbudDevice) LabCallbackInit.getInitCallBack().getDevice(HMDeviceType.EARBUD);
        this.P = hmEarbudDevice;
        if (hmEarbudDevice != null) {
            HMLog.info(R, new Function0() { // from class: od1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return EarbudBehaviorTaggingActivity.k2();
                }
            });
            DeviceInfo deviceInfo = this.P.getDeviceInfo();
            if (deviceInfo != null) {
                N1(deviceInfo);
                if (this.P.isConnected()) {
                    HMLog.info(R, new Function0() { // from class: pd1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return EarbudBehaviorTaggingActivity.l2();
                        }
                    });
                    this.P.startSensorData(SensorType.GSENSOR.getValue(), this);
                    if (!this.Q) {
                        return true;
                    }
                    this.Q = false;
                    Analytics.event(this, StatEvent.LAB_TAGGING_BEHAVIORMARK_EQUIPMENT, "Earbud");
                    return true;
                }
            }
        } else {
            HMLog.info(R, new Function0() { // from class: qd1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return EarbudBehaviorTaggingActivity.m2();
                }
            });
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public HMDeviceType getMyHMDeviceType() {
        return HMDeviceType.EARBUD;
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public void stopOrPauseRecordSensorData() {
        n2();
    }
}
