package com.xiaomi.hm.health.device.recover;

import com.huami.device.feature.health.HealthDetect;
import com.huami.devicex.injection.basic.GoalFunctionsApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.introduce.recocver.IRecover;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/recover/HealthRecover;", "Lcom/xiaomi/hm/health/device/introduce/recocver/IRecover;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", "notRecover", "recover", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthRecover implements IRecover {

    @NotNull
    private static final String a = "HealthRecover";
    private static final int b = 8000;
    private static final int c = 300;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "not restore, reset goal setting to default";
        }
    }

    @Override // com.xiaomi.hm.health.device.introduce.recocver.IRecover
    public boolean notRecover(@NotNull HMMiLiProDevice device) {
        if (ConfigHelperKt.hasFeature(device.getMDeviceSource(), Feature.GT3_SOURCE)) {
            HealthDetect.INSTANCE.getHealthConfig().resetToDefault();
        }
        GoalFunctionsApi goalFunctionsApi = (GoalFunctionsApi) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(GoalFunctionsApi.class), null, null);
        HMLog.info(a, a.a);
        goalFunctionsApi.postStepGoal(8000);
        goalFunctionsApi.postCalorieGoal(300, false);
        return true;
    }

    @Override // com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover
    public boolean recover(@NotNull HMMiLiProDevice device) {
        return true;
    }
}
