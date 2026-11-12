package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.app.restheartrate.service.api.MaxHeartSyncApi;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.type.JobType;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/MaxSportHrJob;", "Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMBaseSyncJob;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "Lcom/app/restheartrate/service/api/MaxHeartSyncApi;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lcom/app/restheartrate/service/api/MaxHeartSyncApi;", "api", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class MaxSportHrJob extends HMBaseSyncJob implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int JOB_TYPE = 19;
    private static final int MAX_SPORT_HR_FEATURE = 52;
    public static final int PROGRESS_DONE = 100;

    /* JADX INFO: renamed from: api$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy api;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/MaxSportHrJob$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "hasMaxSportHrFeature", "", "JOB_TYPE", LogUtil.I, "MAX_SPORT_HR_FEATURE", "PROGRESS_DONE", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean hasMaxSportHrFeature(@NotNull HMBaseDevice device) {
            return device.getDeviceInfo().getDeviceFeature().hasSw(52);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaxSportHrJob() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.api = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<MaxHeartSyncApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.MaxSportHrJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.app.restheartrate.service.api.MaxHeartSyncApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final MaxHeartSyncApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(MaxHeartSyncApi.class), qualifier, objArr);
            }
        });
    }

    private final MaxHeartSyncApi getApi() {
        return (MaxHeartSyncApi) this.api.getValue();
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.create(19);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public void start() throws DeviceConnectException {
        HMBaseDevice device = getDevice();
        boolean z = false;
        if (device != null && !device.isConnected()) {
            z = true;
        }
        if (z || !(getDevice() instanceof HMMiLiProDevice)) {
            throw new DeviceConnectException();
        }
        sendStatus(1);
        getApi().syncDataFromDevice();
        sendStatus(100);
    }
}
