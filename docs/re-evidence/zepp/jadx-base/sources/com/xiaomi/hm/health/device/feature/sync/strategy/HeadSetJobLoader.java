package com.xiaomi.hm.health.device.feature.sync.strategy;

import com.huami.account.HMLoginManager;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.device.MozartDevice;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.feature.sync.job.headset.HearingInfoSyncJob;
import com.xiaomi.hm.health.device.feature.sync.job.headset.SportRecordSyncJob;
import com.xiaomi.hm.health.device.feature.sync.job.headset.StatisticSyncJob;
import com.xiaomi.hm.health.device.feature.sync.job.mili.HMActivityJob;
import com.xiaomi.hm.health.device.service.DeviceStatisticWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0017R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/strategy/HeadSetJobLoader;", "Lcom/xiaomi/hm/health/device/feature/sync/strategy/JobsLoader;", "Lorg/koin/core/component/KoinComponent;", "", "isAddSportRecordJob", "isAddStatisticSyncJob", "isAddHearingInfoSyncJob", "isSupportActivityJob", "isSupportRecordRun", "", "Lcom/huami/device/core/sync/api/type/SyncJob;", "loadJobs", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi$delegate", "Lkotlin/Lazy;", "getKeeperProxyApi", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadSetJobLoader implements JobsLoader, KoinComponent {

    @NotNull
    private static final String TAG = "SyncJob-HeadSetJobLoader";

    @NotNull
    private final HMBaseDevice device;

    /* JADX INFO: renamed from: keeperProxyApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.OTHER_LULLABY.ordinal()] = 1;
            iArr[HMDeviceSource.OTHER_MOZART.ordinal()] = 2;
            iArr[HMDeviceSource.OTHER_HAYDN.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeadSetJobLoader(@NotNull HMBaseDevice hMBaseDevice) {
        this.device = hMBaseDevice;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.HeadSetJobLoader$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KeeperProxyApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), qualifier, objArr);
            }
        });
    }

    private final KeeperProxyApi getKeeperProxyApi() {
        return (KeeperProxyApi) this.keeperProxyApi.getValue();
    }

    private final boolean isAddHearingInfoSyncJob() {
        Feature deviceFeature;
        DeviceInfo deviceInfo = this.device.getDeviceInfo();
        boolean zHasHeadset = (deviceInfo == null || (deviceFeature = deviceInfo.getDeviceFeature()) == null) ? false : deviceFeature.hasHeadset(2);
        IHMAuthCallback iHMAuthCallback = this.device;
        return zHasHeadset && !((iHMAuthCallback instanceof MozartDevice) && ((MozartDevice) iHMAuthCallback).isLockGpsSync());
    }

    private final boolean isAddSportRecordJob() {
        if (!isSupportRecordRun()) {
            return false;
        }
        IHMAuthCallback iHMAuthCallback = this.device;
        if (!(iHMAuthCallback instanceof MozartDevice)) {
            return false;
        }
        if (((MozartDevice) iHMAuthCallback).isLockGpsSync()) {
            HMLog.info(TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.HeadSetJobLoader.isAddSportRecordJob.1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "sync gdsp data is locked";
                }
            });
            return false;
        }
        Boolean runningRecognition = ((MozartDevice) this.device).getRunningRecognition();
        final boolean zBooleanValue = runningRecognition == null ? false : runningRecognition.booleanValue();
        HeadsetDevice.HeadsetDeviceState headsetState = ((MozartDevice) this.device).getHeadsetState();
        if (!zBooleanValue) {
            HMLog.info(TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.HeadSetJobLoader.isAddSportRecordJob.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "runningRecognition:" + zBooleanValue;
                }
            });
            return false;
        }
        if (headsetState == null || headsetState.isDualConnected() || !headsetState.isLeftConnected()) {
            return true;
        }
        HMLog.info(TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.HeadSetJobLoader$isAddSportRecordJob$3$1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "MozartDevice only left ear connected";
            }
        });
        return false;
    }

    private final boolean isAddStatisticSyncJob() {
        IHMAuthCallback iHMAuthCallback = this.device;
        if (!(iHMAuthCallback instanceof MozartDevice)) {
            return false;
        }
        if (((MozartDevice) iHMAuthCallback).isLockGpsSync()) {
            HMLog.info(TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.HeadSetJobLoader.isAddStatisticSyncJob.1
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "sync gdsp data is locked";
                }
            });
            return false;
        }
        if (HMLoginManager.isInEU() || !HMAccountKeeper.INSTANCE.readAgreeUserExperience()) {
            return false;
        }
        final SportDay statisticDay = getKeeperProxyApi().getStatisticDay(this.device.getDeviceType());
        if (!statisticDay.equals(new SportDay())) {
            return !DeviceStatisticWrapper.isRunning();
        }
        HMLog.info(TAG, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.strategy.HeadSetJobLoader.isAddStatisticSyncJob.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Skip upload statistic! Last " + HeadSetJobLoader.this.device.getDeviceType() + "upload day: " + statisticDay;
            }
        });
        return false;
    }

    private final boolean isSupportActivityJob() {
        return this.device.getMDeviceSource() == HMDeviceSource.OTHER_LULLABY;
    }

    private final boolean isSupportRecordRun() {
        HMDeviceSource mDeviceSource = this.device.getMDeviceSource();
        int i = mDeviceSource == null ? -1 : WhenMappings.$EnumSwitchMapping$0[mDeviceSource.ordinal()];
        return (i == 1 || i == 2 || i != 3) ? false : true;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.feature.sync.strategy.JobsLoader
    @ExperimentalCoroutinesApi
    @NotNull
    public List<SyncJob> loadJobs() {
        ArrayList arrayList = new ArrayList();
        if (isAddSportRecordJob()) {
            arrayList.add(new SportRecordSyncJob());
        }
        if (isAddHearingInfoSyncJob()) {
            arrayList.add(new HearingInfoSyncJob());
        }
        if (isAddStatisticSyncJob()) {
            arrayList.add(new StatisticSyncJob());
        }
        if (isSupportActivityJob()) {
            arrayList.add(new HMActivityJob());
        }
        return arrayList;
    }
}
