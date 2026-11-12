package com.xiaomi.hm.health.device.feature.sync.job.hub;

import com.huami.device.core.sync.impl.job.hub.SensorHub;
import com.huami.device.core.sync.impl.job.hub.SensorHubJob;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.device.feature.sync.job.mili.data.HMActivityDataOut;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016R\u001d\u0010\u0011\u001a\u00020\u00038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/hub/ZeppSensorHubJob;", "Lcom/huami/device/core/sync/impl/job/hub/SensorHubJob;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/device/core/sync/impl/job/hub/SensorHub;", "loadSensorHub", "Ljava/util/Calendar;", "loadStartTime", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "", "outData", "", "onDataOut", "sensorHubApi$delegate", "Lkotlin/Lazy;", "getSensorHubApi", "()Lcom/huami/device/core/sync/impl/job/hub/SensorHub;", "sensorHubApi", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi$delegate", "getDeviceTimeStoreApi", "()Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class ZeppSensorHubJob extends SensorHubJob implements KoinComponent {

    /* JADX INFO: renamed from: deviceTimeStoreApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceTimeStoreApi;

    /* JADX INFO: renamed from: sensorHubApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sensorHubApi;

    /* JADX WARN: Multi-variable type inference failed */
    public ZeppSensorHubJob() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sensorHubApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SensorHub>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.hub.ZeppSensorHubJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.device.core.sync.impl.job.hub.SensorHub, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SensorHub invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SensorHub.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceTimeStoreApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceTimeStoreApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.hub.ZeppSensorHubJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.DeviceTimeStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceTimeStoreApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceTimeStoreApi.class), objArr2, objArr3);
            }
        });
    }

    private final DeviceTimeStoreApi getDeviceTimeStoreApi() {
        return (DeviceTimeStoreApi) this.deviceTimeStoreApi.getValue();
    }

    private final SensorHub getSensorHubApi() {
        return (SensorHub) this.sensorHubApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.device.core.sync.impl.job.hub.SensorHubJob
    @NotNull
    public SensorHub loadSensorHub() {
        return getSensorHubApi();
    }

    @Override // com.huami.device.core.sync.impl.job.hub.SensorHubJob
    @NotNull
    public Calendar loadStartTime() {
        return getDeviceTimeStoreApi().getBoundDeviceSyncTime(HMDeviceType.SENSORHUB);
    }

    @Override // com.huami.device.core.sync.impl.job.hub.SensorHubJob
    public void onDataOut(@NotNull List<? extends ActivityDataFragment<Object>> outData) {
        new HMActivityDataOut().handleSyncedData(HMDeviceType.SENSORHUB, HMDeviceSource.SENSORHUB, outData);
    }
}
