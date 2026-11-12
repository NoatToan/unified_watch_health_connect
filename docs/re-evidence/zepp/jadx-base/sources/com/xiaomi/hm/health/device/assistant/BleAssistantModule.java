package com.xiaomi.hm.health.device.assistant;

import android.content.Context;
import com.huami.assistant.IAssistantModule;
import com.huami.assistant.dataexchange.IExchange;
import com.huami.assistant.ui.v2.repo.ScheduleRpcApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.assistant.schedule.ScheduleRpcApiImpl;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTreeFactory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b \u0010!J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/BleAssistantModule;", "Lcom/huami/assistant/IAssistantModule;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "c", "Lcom/huami/assistant/dataexchange/IExchange;", "getExchange", "Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "getScheduleApi", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "getAlarmCountLimit", "", "isSupportUpdates", "isOverSeaSchedule", "isBleDevice", "isSupportEvent", "isDeviceConnected", "isSupportPin", "isSupportFlight", "isSupportAlarm", "getCurrentSource", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/assistant/BleExchangeService;", "b", "()Lcom/xiaomi/hm/health/device/assistant/BleExchangeService;", "exchangeService", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BleAssistantModule implements IAssistantModule, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy exchangeService;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/BleExchangeService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BleExchangeService> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BleExchangeService getA() {
            return new BleExchangeService();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleAssistantModule() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.assistant.BleAssistantModule$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.exchangeService = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final BleExchangeService b() {
        return (BleExchangeService) this.exchangeService.getValue();
    }

    private final HMBaseDevice c() {
        return a().getDevice();
    }

    @Override // com.huami.assistant.IAssistantModule
    public int getAlarmCountLimit(@NotNull Context context) {
        return -1;
    }

    @Override // com.huami.assistant.IAssistantModule
    public int getCurrentSource(@NotNull Context context) {
        HMDeviceSource mDeviceSource;
        HMBaseDevice hMBaseDeviceC = c();
        Integer numValueOf = null;
        if (hMBaseDeviceC != null && (mDeviceSource = hMBaseDeviceC.getMDeviceSource()) != null) {
            numValueOf = Integer.valueOf(mDeviceSource.getValue());
        }
        return numValueOf == null ? HMDeviceSource.VDEVICE.getValue() : numValueOf.intValue();
    }

    @Override // com.huami.assistant.IAssistantModule
    @NotNull
    public IExchange getExchange() {
        return b();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.assistant.IAssistantModule
    @NotNull
    public ScheduleRpcApi getScheduleApi() {
        return new ScheduleRpcApiImpl();
    }

    @Override // com.huami.assistant.IAssistantModule
    public boolean isBleDevice() {
        HMBaseDevice hMBaseDeviceC = c();
        if (hMBaseDeviceC != null && hMBaseDeviceC.isConnected()) {
            return FeatureTreeFactory.INSTANCE.isSupportFeature(SoftFeature.SCHEDULE);
        }
        return false;
    }

    @Override // com.huami.assistant.IAssistantModule
    public boolean isDeviceConnected(@NotNull Context context) {
        HMBaseDevice hMBaseDeviceC = c();
        if (hMBaseDeviceC == null) {
            return false;
        }
        return hMBaseDeviceC.isConnected();
    }

    @Override // com.huami.assistant.IAssistantModule
    public boolean isOverSeaSchedule() {
        HMBaseDevice hMBaseDeviceC = c();
        if (hMBaseDeviceC == null) {
            return false;
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.MILI_MADRID_W, HMDeviceSource.MILI_ANDES_W, HMDeviceSource.MILI_VIENNA_W, HMDeviceSource.MILI_ZURICH_W}).contains(hMBaseDeviceC.getMDeviceSource()) || ConfigHelperKt.hasFeature(hMBaseDeviceC.getMDeviceSource(), Feature.OVERSEA);
    }

    @Override // com.huami.assistant.IAssistantModule
    public boolean isSupportAlarm(@NotNull Context context) {
        return false;
    }

    @Override // com.huami.assistant.IAssistantModule
    public boolean isSupportEvent(@NotNull Context context) {
        return true;
    }

    @Override // com.huami.assistant.IAssistantModule
    public boolean isSupportFlight(@NotNull Context context) {
        return true;
    }

    @Override // com.huami.assistant.IAssistantModule
    public boolean isSupportPin(@NotNull Context context) {
        return false;
    }

    @Override // com.huami.assistant.IAssistantModule
    public boolean isSupportUpdates(@NotNull Context context) {
        return true;
    }
}
