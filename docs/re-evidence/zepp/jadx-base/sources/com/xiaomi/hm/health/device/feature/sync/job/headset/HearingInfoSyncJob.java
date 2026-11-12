package com.xiaomi.hm.health.device.feature.sync.job.headset;

import com.huami.bluetooth.profile.gdsp.HearingHealthDayData;
import com.huami.device.core.sync.impl.job.headset.HDHearingInfoJob;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.tools.log.HMLog;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0014\u0010\r\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/headset/HearingInfoSyncJob;", "Lcom/huami/device/core/sync/impl/job/headset/HDHearingInfoJob;", "Lorg/koin/core/component/KoinComponent;", "Ljava/util/Calendar;", "loadStartTime", "", "Lcom/huami/bluetooth/profile/gdsp/HearingHealthDayData;", "outData", "", "onDataOut", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.EXCEPTION, "onError", "Lcom/xiaomi/hm/health/device/feature/sync/job/headset/IHearingInfoSyncJobHandler;", "hearingInfoSyncJobHandler$delegate", "Lkotlin/Lazy;", "getHearingInfoSyncJobHandler", "()Lcom/xiaomi/hm/health/device/feature/sync/job/headset/IHearingInfoSyncJobHandler;", "hearingInfoSyncJobHandler", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi$delegate", "getKeeperProxyApi", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HearingInfoSyncJob extends HDHearingInfoJob implements KoinComponent {

    @NotNull
    private static final String TAG = "SyncJob-HearingInfoSyncJob";

    /* JADX INFO: renamed from: hearingInfoSyncJobHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hearingInfoSyncJobHandler;

    /* JADX INFO: renamed from: keeperProxyApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApi;

    /* JADX WARN: Multi-variable type inference failed */
    public HearingInfoSyncJob() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.hearingInfoSyncJobHandler = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IHearingInfoSyncJobHandler>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.headset.HearingInfoSyncJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.feature.sync.job.headset.IHearingInfoSyncJobHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IHearingInfoSyncJobHandler invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IHearingInfoSyncJobHandler.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.headset.HearingInfoSyncJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KeeperProxyApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), objArr2, objArr3);
            }
        });
    }

    private final IHearingInfoSyncJobHandler getHearingInfoSyncJobHandler() {
        return (IHearingInfoSyncJobHandler) this.hearingInfoSyncJobHandler.getValue();
    }

    private final KeeperProxyApi getKeeperProxyApi() {
        return (KeeperProxyApi) this.keeperProxyApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    @NotNull
    public Calendar loadStartTime() {
        return getKeeperProxyApi().getHearingHealthTime();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public /* bridge */ /* synthetic */ void onDataOut(List<? extends HearingHealthDayData> list) {
        onDataOut2((List<HearingHealthDayData>) list);
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onError(@NotNull final Exception exception) {
        HMLog.error$default(TAG, null, null, new Function0<String>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.headset.HearingInfoSyncJob.onError.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return exception.toString();
            }
        }, 6, null);
    }

    /* JADX INFO: renamed from: onDataOut, reason: avoid collision after fix types in other method */
    public void onDataOut2(@NotNull List<HearingHealthDayData> outData) {
        getHearingInfoSyncJobHandler().onDataOut(outData);
    }
}
