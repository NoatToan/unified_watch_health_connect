package com.xiaomi.hm.health.devicex.proxy.fw;

import com.huami.feedback.zepp.ui.FeedbackActivity;
import com.huami.moving.ui.sport.in.GPSMainActivity;
import com.huami.treadmill.ui.running.RunningActivity;
import com.huami.treadmill.ui.running.StartupActivity;
import com.xiaomi.hm.health.bodyfat.activity.BabyWeightActivity;
import com.xiaomi.hm.health.bodyfat.activity.InstructScale2Activity;
import com.xiaomi.hm.health.bodyfat.activity.WeightConnectActivity;
import com.xiaomi.hm.health.bodyfat.activity.WeightingActivity;
import com.xiaomi.hm.health.device.HMBindDeviceActivity;
import com.xiaomi.hm.health.device.HMSwitchDeviceActivity;
import com.xiaomi.hm.health.device.HMUnusedDeviceActivity;
import com.xiaomi.hm.health.device.PairCCBActivity;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeFailedActivity;
import com.xiaomi.hm.health.device.setting.ui.HMUnusedDeviceActivityNew;
import com.xiaomi.hm.health.device.weight.InstructionWeightActivity;
import com.xiaomi.hm.health.device.weight.InstructionWeightBfsActivity;
import com.xiaomi.hm.health.lab.activity.MiLiBehaviorTaggingActivity;
import com.xiaomi.hm.health.lab.activity.ShoesBehaviorTaggingActivity;
import com.xiaomi.hm.health.training.ui.activity.trainplay.TrainingPlayActivity;
import com.xiaomi.hm.health.ui.playmiband2.MiBand2InstructionActivity;
import com.xiaomi.hm.health.ui.playmiband2.MiBand3InstructionActivity;
import com.xiaomi.hm.health.ui.smartplay.RestoreDeviceConfigActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class FwUpgradeManagerUtils {
    public static final ArrayList<Class> ignoreFwUpgradeList = new a();

    public class a extends ArrayList<Class> {
        public a() {
            add(GPSMainActivity.class);
            add(FeedbackActivity.class);
            add(ShoesBehaviorTaggingActivity.class);
            add(MiLiBehaviorTaggingActivity.class);
            add(RestoreDeviceConfigActivity.class);
            add(InstructScale2Activity.class);
            add(HMUnusedDeviceActivity.class);
            add(HMUnusedDeviceActivityNew.class);
            add(InstructionWeightActivity.class);
            add(InstructionWeightBfsActivity.class);
            add(MiBand2InstructionActivity.class);
            add(MiBand3InstructionActivity.class);
            add(HMSwitchDeviceActivity.class);
            add(HMBindDeviceActivity.class);
            add(PairCCBActivity.class);
            add(HMFwUpgradeFailedActivity.class);
            add(TrainingPlayActivity.class);
            add(WeightingActivity.class);
            add(BabyWeightActivity.class);
            add(WeightConnectActivity.class);
            add(StartupActivity.class);
            add(RunningActivity.class);
        }
    }
}
