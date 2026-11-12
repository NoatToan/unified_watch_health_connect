package com.xiaomi.hm.health.device.weight;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.device.IWeightDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.weight.WeightDevice;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.utils.UnitFunctionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class WeightDevice implements IWeightDevice {
    private static final String a = "WeightDevice";

    public class a extends HMCallback<Boolean> {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(boolean z) {
            return "ret: " + z;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(final boolean result) {
            HMLog.info(WeightDevice.a, new Function0() { // from class: com.xiaomi.hm.health.device.weight.a
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WeightDevice.a.b(result);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c() {
        return "device mismatch.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d() {
        return "not support.";
    }

    @Override // com.xiaomi.hm.health.bodyfat.device.IWeightDevice
    public void saveWeightGoalToDevice(float goalWeightKG) {
        HMBaseDevice miliDevice = HMDeviceManager.getInstance().getMiliDevice();
        if (!(miliDevice instanceof HMMiLiProDevice)) {
            HMLog.error(a, new Function0() { // from class: bs8
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WeightDevice.c();
                }
            });
            return;
        }
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) miliDevice;
        if (!hMMiLiProDevice.isHuamiOs()) {
            HMLog.error(a, new Function0() { // from class: cs8
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return WeightDevice.d();
                }
            });
        } else {
            hMMiLiProDevice.setTargets(new HMTarget(HMPersonInfo.getInstance().getMiliConfig().isGoalRemind(), null, null, Long.valueOf(UnitFunctionsKt.convertKgToBleUnit(goalWeightKG)), null, null, null), new a());
        }
    }
}
