package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.impl.job.milible.HrJob;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HMHrData;
import com.xiaomi.hm.health.device.callback.MyHrDataSyncCallback;
import com.xiaomi.hm.health.device.feature.sync.job.ConstKt;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Calendar;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0014\u0010\r\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/HMHrJob;", "Lcom/huami/device/core/sync/impl/job/milible/HrJob;", "Lorg/koin/core/component/KoinComponent;", "Ljava/util/Calendar;", "loadStartTime", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/hr/HMHrData;", "outData", "", "onDataOut", "Ljava/lang/Exception;", "Lkotlin/Exception;", Constants.EXCEPTION, "onError", "Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi$delegate", "Lkotlin/Lazy;", "getDeviceTimeStoreApi", "()Lcom/huami/devicex/injection/keeper/DeviceTimeStoreApi;", "deviceTimeStoreApi", "Lcom/xiaomi/hm/health/device/callback/MyHrDataSyncCallback;", "jobCallback$delegate", "getJobCallback", "()Lcom/xiaomi/hm/health/device/callback/MyHrDataSyncCallback;", "jobCallback", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class HMHrJob extends HrJob implements KoinComponent {

    /* JADX INFO: renamed from: deviceTimeStoreApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceTimeStoreApi;

    /* JADX INFO: renamed from: jobCallback$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy jobCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public HMHrJob() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceTimeStoreApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceTimeStoreApi>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMHrJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.DeviceTimeStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceTimeStoreApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceTimeStoreApi.class), qualifier, objArr);
            }
        });
        this.jobCallback = LazyKt__LazyJVMKt.lazy(new Function0<MyHrDataSyncCallback>() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.HMHrJob$jobCallback$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MyHrDataSyncCallback invoke() {
                return new MyHrDataSyncCallback();
            }
        });
    }

    private final DeviceTimeStoreApi getDeviceTimeStoreApi() {
        return (DeviceTimeStoreApi) this.deviceTimeStoreApi.getValue();
    }

    private final MyHrDataSyncCallback getJobCallback() {
        return (MyHrDataSyncCallback) this.jobCallback.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    @NotNull
    public Calendar loadStartTime() {
        return getDeviceTimeStoreApi().getProHrSyncTime();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onError(@NotNull Exception exception) {
        HMLog.e(ConstKt.debugTag, exception);
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onDataOut(@NotNull ArrayList<HMHrData> outData) throws SyncException {
        try {
            getJobCallback().onHrData(outData);
            getJobCallback().onHrStop(true);
        } catch (Exception e) {
            throw new SyncException("error of Stop HRJob", e, 0, 4, null);
        }
    }
}
