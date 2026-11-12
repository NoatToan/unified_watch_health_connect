package com.xiaomi.hm.health.device.feature.sync.job.hub;

import com.huami.device.core.sync.impl.job.hub.SensorHub;
import com.huami.device.core.sync.impl.job.hub.SensorHubJob;
import com.huami.devicex.injection.SensorHubControllerApi;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.callback.MyActivityDataSyncCallback;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/hub/MiFitSensorHubJob;", "Lcom/huami/device/core/sync/impl/job/hub/SensorHubJob;", "Lcom/huami/device/core/sync/impl/job/hub/SensorHub;", "Lorg/koin/core/component/KoinComponent;", "loadSensorHub", "Ljava/util/Calendar;", "loadStartTime", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/ActivityDataFragment;", "", "outData", "", "onDataOut", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/IHMActivityDataCallback;", "callback", "syncSensorHubData", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi$delegate", "Lkotlin/Lazy;", "getDeviceTimeStoreApi", "()Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi", "Lcom/huami/devicex/injection/SensorHubControllerApi;", "sensorHubControllerApi$delegate", "getSensorHubControllerApi", "()Lcom/huami/devicex/injection/SensorHubControllerApi;", "sensorHubControllerApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class MiFitSensorHubJob extends SensorHubJob implements SensorHub, KoinComponent {

    /* JADX INFO: renamed from: deviceTimeStoreApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceTimeStoreApi = LazyKt__LazyJVMKt.lazy(new Function0<HMDeviceManager>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.hub.MiFitSensorHubJob$deviceTimeStoreApi$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final HMDeviceManager getA() {
            return HMDeviceManager.getInstance();
        }
    });

    /* JADX INFO: renamed from: sensorHubControllerApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sensorHubControllerApi;

    /* JADX WARN: Multi-variable type inference failed */
    public MiFitSensorHubJob() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sensorHubControllerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SensorHubControllerApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.hub.MiFitSensorHubJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.SensorHubControllerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SensorHubControllerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SensorHubControllerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceTimeStoreApi getDeviceTimeStoreApi() {
        return (DeviceTimeStoreApi) this.deviceTimeStoreApi.getValue();
    }

    private final SensorHubControllerApi getSensorHubControllerApi() {
        return (SensorHubControllerApi) this.sensorHubControllerApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.device.core.sync.impl.job.hub.SensorHubJob
    @NotNull
    public SensorHub loadSensorHub() {
        return this;
    }

    @Override // com.huami.device.core.sync.impl.job.hub.SensorHubJob
    @NotNull
    public Calendar loadStartTime() {
        return getDeviceTimeStoreApi().getBoundDeviceSyncTime(HMDeviceType.SENSORHUB);
    }

    @Override // com.huami.device.core.sync.impl.job.hub.SensorHubJob
    public void onDataOut(@NotNull List<? extends ActivityDataFragment<Object>> outData) {
        new MyActivityDataSyncCallback(HMDeviceManager.getInstance(), HMDeviceSource.SENSORHUB).onSyncStop(outData);
    }

    @Override // com.huami.device.core.sync.impl.job.hub.SensorHub
    public void syncSensorHubData(@NotNull Calendar startTime, @NotNull IHMActivityDataCallback callback) {
        getSensorHubControllerApi().syncSensorHubData(startTime, callback);
    }
}
