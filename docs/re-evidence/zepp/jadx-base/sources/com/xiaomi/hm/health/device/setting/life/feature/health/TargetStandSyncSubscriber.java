package com.xiaomi.hm.health.device.setting.life.feature.health;

import com.huami.bluetooth.profile.channel.module.settings.SettingsApi;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.huami.devicex.injection.basic.GoalFunctionsApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\u000e\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/health/TargetStandSyncSubscriber;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "Lorg/koin/core/component/KoinComponent;", "", "getName", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/huami/devicex/injection/basic/GoalFunctionsApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/basic/GoalFunctionsApi;", "goalFunctionsApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TargetStandSyncSubscriber implements BleEventSubscriber, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy goalFunctionsApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMTarget a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMTarget hMTarget) {
            super(0);
            this.a = hMTarget;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get target from device, result=" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ StandAlertConfig a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StandAlertConfig standAlertConfig) {
            super(0);
            this.a = standAlertConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "get stand alert config.result=" + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TargetStandSyncSubscriber() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.goalFunctionsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<GoalFunctionsApi>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.health.TargetStandSyncSubscriber$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.GoalFunctionsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final GoalFunctionsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(GoalFunctionsApi.class), qualifier, objArr);
            }
        });
    }

    private final GoalFunctionsApi a() {
        return (GoalFunctionsApi) this.goalFunctionsApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    public String getName() {
        return "Target-StandAlert-SyncFromDevice";
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        SettingsApi settingsApi;
        StandAlertConfig standAlertConfig;
        if (device instanceof HMMiLiProDevice) {
            HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
            HMTarget targetSync = hMMiLiProDevice.getTargetSync();
            if (targetSync != null) {
                HMLog.info(getName(), new a(targetSync));
                Long calorieTarget = targetSync.getCalorieTarget();
                if (calorieTarget != null) {
                    if (!(calorieTarget.longValue() > 0)) {
                        calorieTarget = null;
                    }
                    if (calorieTarget != null) {
                        a().postCalorieGoal((int) calorieTarget.longValue(), true);
                    }
                }
                Long stepTarget = targetSync.getStepTarget();
                if (stepTarget != null) {
                    Long l = stepTarget.longValue() > 0 ? stepTarget : null;
                    if (l != null) {
                        a().postStepGoal((int) l.longValue());
                    }
                }
                Boolean stepRemind = targetSync.getStepRemind();
                if (stepRemind != null) {
                    StandAlertConfigManager.INSTANCE.getSInstance().setTargetAchieveAlertEnable(stepRemind.booleanValue());
                }
            }
            BaseProfile profile = hMMiLiProDevice.getProfile();
            if (profile == null || (settingsApi = profile.getSettingsApi()) == null || (standAlertConfig = settingsApi.getStandAlertConfig()) == null) {
                return;
            }
            HMLog.info(getName(), new b(standAlertConfig));
            StandAlertConfigManager.INSTANCE.getSInstance().setConfig(standAlertConfig);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
    }
}
