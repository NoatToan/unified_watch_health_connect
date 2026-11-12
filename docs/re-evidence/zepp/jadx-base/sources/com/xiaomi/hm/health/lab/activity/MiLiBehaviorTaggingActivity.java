package com.xiaomi.hm.health.lab.activity;

import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.grsp.SensorType;
import com.xiaomi.hm.health.lab.activity.MiLiBehaviorTaggingActivity;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingTools;
import com.xiaomi.hm.health.lab.utils.StatEvent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public class MiLiBehaviorTaggingActivity extends BaseBehaviorTaggingActivity {
    private static final String R = "MiLiBehaviorTaggingActivity";
    private HMMiLiDevice P;
    private boolean Q = true;

    private boolean k2(HMDeviceSource hMDeviceSource) {
        return (hMDeviceSource == HMDeviceSource.MILI_DTH_W || hMDeviceSource == HMDeviceSource.MILI_DTH) && BehaviorTaggingTools.SWIM.equals(this.behaviorTagEnity.getBehaviorKey());
    }

    private boolean l2(HMDeviceSource hMDeviceSource) {
        return BehaviorTaggingTools.NMEA.equals(this.behaviorTagEnity.getBehaviorKey());
    }

    private boolean m2() {
        return "temperature".equals(this.behaviorTagEnity.getBehaviorKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n2() {
        return "labs 获取手环信息成功";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o2() {
        return "labs 手环建立连接成功";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p2() {
        return "labs 未绑定手环设备";
    }

    private void q2() {
        HMMiLiDevice hMMiLiDevice = this.P;
        if (hMMiLiDevice != null) {
            hMMiLiDevice.stopSensorData();
            this.P.stopRealtimeMeasureHr();
            this.P = null;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
            this.n = false;
        }
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public boolean connectDevice() {
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) LabCallbackInit.getInitCallBack().getDevice(getMyHMDeviceType());
        this.P = hMMiLiDevice;
        if (hMMiLiDevice != null) {
            HMLog.info(R, new Function0() { // from class: n45
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MiLiBehaviorTaggingActivity.n2();
                }
            });
            DeviceInfo deviceInfo = this.P.getDeviceInfo();
            if (deviceInfo != null) {
                N1(deviceInfo);
                if (this.P.isConnected()) {
                    HMLog.info(R, new Function0() { // from class: l45
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public final Object getA() {
                            return MiLiBehaviorTaggingActivity.o2();
                        }
                    });
                    HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
                    if (k2(deviceSource)) {
                        this.P.startSensorData(SensorType.GSENSOR.getValue() | SensorType.PPG.getValue() | SensorType.GEO.getValue(), this);
                    } else if (l2(deviceSource)) {
                        this.P.startSensorData(SensorType.NMEA.getValue(), this);
                    } else if (m2()) {
                        this.P.startSensorData(SensorType.BODY_TEMPERATURE.getValue(), this);
                    } else {
                        if (deviceSource == HMDeviceSource.MILI_JIUHUASHAN_NOREX) {
                            updateChartParamsOfPPG(18, 20);
                        }
                        this.P.startSensorData(SensorType.GSENSOR.getValue() | SensorType.PPG.getValue(), this);
                    }
                    if (!this.Q) {
                        return true;
                    }
                    this.Q = false;
                    Analytics.recordEvent(new CountEventBuilder(StatEvent.LAB_TAGGING_BEHAVIORMARK_EQUIPMENT).setValue(String.valueOf(deviceSource.getValue())));
                    return true;
                }
            }
        } else {
            HMLog.info(R, new Function0() { // from class: m45
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MiLiBehaviorTaggingActivity.p2();
                }
            });
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public HMDeviceType getMyHMDeviceType() {
        return HMDeviceType.MILI;
    }

    @Override // com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity
    public void stopOrPauseRecordSensorData() {
        q2();
    }
}
