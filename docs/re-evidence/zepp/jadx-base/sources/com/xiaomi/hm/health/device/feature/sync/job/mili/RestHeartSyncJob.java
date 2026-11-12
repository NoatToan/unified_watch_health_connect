package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.app.restheartrate.service.api.RestHeartSyncApi;
import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.type.JobType;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/RestHeartSyncJob;", "Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMBaseSyncJob;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "Lcom/app/restheartrate/service/api/RestHeartSyncApi;", "api$delegate", "Lkotlin/Lazy;", "getApi", "()Lcom/app/restheartrate/service/api/RestHeartSyncApi;", "api", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class RestHeartSyncJob extends HMBaseSyncJob implements KoinComponent {
    public static final int PROGRESS_DONE = 100;

    /* JADX INFO: renamed from: api$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy api;

    /* JADX WARN: Multi-variable type inference failed */
    public RestHeartSyncJob() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.api = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<RestHeartSyncApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.RestHeartSyncJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.app.restheartrate.service.api.RestHeartSyncApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final RestHeartSyncApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(RestHeartSyncApi.class), qualifier, objArr);
            }
        });
    }

    private final RestHeartSyncApi getApi() {
        return (RestHeartSyncApi) this.api.getValue();
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.create(18);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public void start() throws SyncException, DeviceConnectException {
        HMBaseDevice device = getDevice();
        boolean z = false;
        if (device != null && !device.isConnected()) {
            z = true;
        }
        if (z || !(getDevice() instanceof HMMiLiProDevice)) {
            throw new DeviceConnectException();
        }
        sendStatus(1);
        try {
            getApi().syncDataFromDevice();
            sendStatus(100);
        } catch (Exception e) {
            throw new SyncException("error of Stop RestHeartSyncJob", e, 0, 4, null);
        }
    }
}
