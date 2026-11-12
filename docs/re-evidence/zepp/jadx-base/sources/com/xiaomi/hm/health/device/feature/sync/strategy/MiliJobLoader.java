package com.xiaomi.hm.health.device.feature.sync.strategy;

import com.huami.bluetooth.profile.channel.module.sport.PHNModule;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.impl.job.milible.ZeppCoachJob;
import com.huami.devicex.injection.data.AtrialManagerApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import com.xiaomi.hm.health.device.feature.sync.job.ConstKt;
import com.xiaomi.hm.health.device.feature.sync.job.mili.DeviceStatisticSyncJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMActivityJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMAtrialFibrillationJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMBloodPressureJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMBodyTemperatureJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMEcgJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMFemaleHealthJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMFirstBeatJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMHrJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMPaiJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMPressureJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMRespRateJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMSpo2Job;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMSportRecordJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.MaxSportHrJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.RestHeartSyncJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJob;
import com.xiaomi.hm.health.device.health.blood_pressure.BloodPressureUtil;
import com.xiaomi.hm.health.device.service.DeviceStatisticV2Collector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/strategy/MiliJobLoader;", "Lcom/xiaomi/hm/health/device/feature/sync/strategy/JobsLoader;", "Lorg/koin/core/component/KoinComponent;", "", "Lcom/huami/device/core/sync/api/type/SyncJob;", "loadJobs", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi$delegate", "Lkotlin/Lazy;", "getDeviceManagerApi", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/data/AtrialManagerApi;", "atrialManagerApi$delegate", "getAtrialManagerApi", "()Lcom/huami/devicex/injection/data/AtrialManagerApi;", "atrialManagerApi", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class MiliJobLoader implements JobsLoader, KoinComponent {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "MiliJobLoader";

    /* JADX INFO: renamed from: atrialManagerApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy atrialManagerApi;

    @NotNull
    private final HMBaseDevice device;

    /* JADX INFO: renamed from: deviceManagerApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/strategy/MiliJobLoader$Companion;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MiliJobLoader(@NotNull HMBaseDevice hMBaseDevice) {
        this.device = hMBaseDevice;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.MiliJobLoader$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.atrialManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<AtrialManagerApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.MiliJobLoader$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.data.AtrialManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AtrialManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(AtrialManagerApi.class), objArr2, objArr3);
            }
        });
    }

    private final AtrialManagerApi getAtrialManagerApi() {
        return (AtrialManagerApi) this.atrialManagerApi.getValue();
    }

    private final DeviceManagerApi getDeviceManagerApi() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.device.feature.sync.strategy.JobsLoader
    @NotNull
    public List<SyncJob> loadJobs() {
        List<SyncJob> listFilter;
        Object objM3845constructorimpl;
        Scope rootScope;
        KClass<?> orCreateKotlinClass;
        if (ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE, this.device.getMDeviceSource())) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        HMBaseDevice hMBaseDevice = this.device;
        if ((hMBaseDevice instanceof HMMiLiProDevice) && ((HMMiLiProDevice) hMBaseDevice).isHuamiOs()) {
            arrayList.add(new RestHeartSyncJob());
        }
        arrayList.add(new HMActivityJob());
        arrayList.add(new HMHrJob());
        if (getAtrialManagerApi().isSupportAtrialFib(this.device.getMDeviceSource().getType()) && this.device.getMDeviceSource().getType() != HMDeviceType.WATCH) {
            arrayList.add(new HMAtrialFibrillationJob());
        }
        HMBaseDevice hMBaseDevice2 = this.device;
        if ((hMBaseDevice2 instanceof HMMiLiProDevice) && HMDeviceConfig.isSupportEcg(((HMMiLiProDevice) hMBaseDevice2).getMDeviceSource())) {
            arrayList.add(new HMEcgJob());
        }
        if (ConstKt.needSyncPai(this.device.getMDeviceSource())) {
            arrayList.add(new HMPaiJob());
        }
        arrayList.add(new HMSportRecordJob());
        if (this.device.getDeviceInfo().getDeviceFeature().hasSw(10)) {
            arrayList.add(new HMFirstBeatJob());
        }
        if (HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(4)) {
            arrayList.add(new HMSpo2Job());
        }
        if (getDeviceManagerApi().supportPressure()) {
            arrayList.add(new HMPressureJob());
        }
        if (this.device.getDeviceInfo().getDeviceFeature().hasSw(5)) {
            arrayList.add(new HMFemaleHealthJob());
        }
        if (this.device.getDeviceInfo().getDeviceFeature().hasSw(33)) {
            arrayList.add(new HMBodyTemperatureJob());
        }
        if (DeviceStatisticV2Collector.INSTANCE.supportStatisticV2(this.device)) {
            arrayList.add(new DeviceStatisticSyncJob());
        } else {
            HMLog.info("DeviceStatisticSyncJob", new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.MiliJobLoader.loadJobs.1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "not support DeviceStatisticSyncJob";
                }
            });
        }
        HMBaseDevice hMBaseDevice3 = this.device;
        if ((hMBaseDevice3 instanceof HMMiLiProDevice) && ((HMMiLiProDevice) hMBaseDevice3).isHuamiOs()) {
            arrayList.add(new SportsEffectJob((HMMiLiProDevice) this.device));
            arrayList.add(new HMRespRateJob());
        }
        HMBaseDevice hMBaseDevice4 = this.device;
        if ((hMBaseDevice4 instanceof HMMiLiProDevice) && BloodPressureUtil.INSTANCE.isSupportBloodPressure((HMMiLiProDevice) hMBaseDevice4)) {
            arrayList.add(new HMBloodPressureJob());
        }
        if (this.device.supportModule(PHNModule.class)) {
            try {
                Result.Companion companion = Result.Companion;
                if (this instanceof KoinScopeComponent) {
                    rootScope = ((KoinScopeComponent) this).getScope();
                    orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ZeppCoachJob.class);
                } else {
                    rootScope = getKoin().getScopeRegistry().getRootScope();
                    orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ZeppCoachJob.class);
                }
                objM3845constructorimpl = Result.m3845constructorimpl((ZeppCoachJob) rootScope.get(orCreateKotlinClass, null, null));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3851isSuccessimpl(objM3845constructorimpl)) {
                arrayList.add((ZeppCoachJob) objM3845constructorimpl);
            }
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                HMLog.warn$default(TAG, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.MiliJobLoader$loadJobs$4$1
                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "No ZeppCoachJob implemention!";
                    }
                }, 2, null);
            }
        } else {
            HMLog.info(TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.MiliJobLoader.loadJobs.5
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "Device no phn!";
                }
            });
        }
        HMBaseDevice hMBaseDevice5 = this.device;
        if ((hMBaseDevice5 instanceof HMMiLiProDevice) && MaxSportHrJob.INSTANCE.hasMaxSportHrFeature(hMBaseDevice5)) {
            arrayList.add(new MaxSportHrJob());
        }
        JobLoaderFilter jobLoaderFilter = SyncCenterManager.INSTANCE.getJobLoaderFilter();
        return (jobLoaderFilter == null || (listFilter = jobLoaderFilter.filter(this.device, arrayList)) == null) ? arrayList : listFilter;
    }
}
