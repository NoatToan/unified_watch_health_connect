package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.huami.device.core.sync.api.type.JobType;
import com.huami.devicex.injection.data.HealthDataApi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMAtrialFibrillationJob;", "Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMBaseSyncJob;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "Lcom/huami/devicex/injection/data/HealthDataApi;", "healthDataApi$delegate", "Lkotlin/Lazy;", "getHealthDataApi", "()Lcom/huami/devicex/injection/data/HealthDataApi;", "healthDataApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMAtrialFibrillationJob extends HMBaseSyncJob implements KoinComponent {

    /* JADX INFO: renamed from: healthDataApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthDataApi;

    /* JADX WARN: Multi-variable type inference failed */
    public HMAtrialFibrillationJob() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.healthDataApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<HealthDataApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMAtrialFibrillationJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.data.HealthDataApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HealthDataApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(HealthDataApi.class), qualifier, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HealthDataApi getHealthDataApi() {
        return (HealthDataApi) this.healthDataApi.getValue();
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getAF();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public void start() throws InterruptedException {
        CoroutineScope scope = getScope();
        if (scope == null) {
            return;
        }
        BuildersKt.runBlocking(scope.getCoroutineContext(), new HMAtrialFibrillationJob$start$1$1(this, null));
    }
}
