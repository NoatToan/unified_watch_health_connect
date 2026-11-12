package com.xiaomi.hm.health.di.koin.spo2;

import com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi;
import com.huami.bloodoxygen.bluetooth.sync.Spo2SyncUtilsKt;
import com.huami.device.feature.health.HealthDetect;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\u001d\u0010\u000f\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/di/koin/spo2/RealSpo2DeviceApiImpl;", "Lcom/huami/bloodoxygen/bluetooth/sync/Spo2DeviceApi;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "syncFromDevice", "", "supportSpo2", "supportOsa", "isOsaEnable", "Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "deviceSnService", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RealSpo2DeviceApiImpl implements Spo2DeviceApi, KoinComponent {

    @NotNull
    private static final String b = "RealSpo2DeviceApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceSnService;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceType hMDeviceType) {
            super(0);
            this.a = hMDeviceType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "syncSpo2Data deviceType:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "not supportSpo2";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "start syncSpo2Data...";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealSpo2DeviceApiImpl() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceSnService = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceSnService>() { // from class: com.xiaomi.hm.health.di.koin.spo2.RealSpo2DeviceApiImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceSnService getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceSnService.class), qualifier, objArr);
            }
        });
    }

    private final DeviceSnService a() {
        return (DeviceSnService) this.deviceSnService.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi
    public boolean isOsaEnable() {
        return HealthDetect.INSTANCE.getHealthConfig().getUserConfig().getOsaEnable();
    }

    @Override // com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi
    public boolean supportOsa() {
        return HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(21);
    }

    @Override // com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi
    public boolean supportSpo2() {
        return HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(4);
    }

    @Override // com.huami.bloodoxygen.bluetooth.sync.Spo2DeviceApi
    public void syncFromDevice(@NotNull HMBaseDevice device) {
        HMDeviceType type = device.getMDeviceSource().getType();
        HMLog.info(b, new a(type));
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if (type != hMDeviceType) {
            return;
        }
        if (!supportSpo2()) {
            HMLog.info(b, b.a);
            return;
        }
        String sn = a().getSn(hMDeviceType);
        HMLog.info(b, c.a);
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
        HMBaseDevice device2 = HMDeviceManager.getInstance().getDevice();
        Spo2SyncUtilsKt.syncSpo2(hMMiLiProDevice, HMPersonInfo.getInstance().getUserInfo().getUserid(), supportOsa(), ((device2 == null ? null : device2.getMDeviceSource()) == HMDeviceSource.MILI_YORK) && !HMDevicePropertyCache.INSTANCE.getInstance().getMiliFeature().hasSw(25), sn);
    }
}
