package com.xiaomi.hm.health.devicex.manage.impl.core.feature;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u001d\u0010\u0012\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/impl/core/feature/HmDeviceSnService;", "Lcom/xiaomi/hm/health/devicex/manage/api/core/feature/DeviceSnService;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "Lcom/xiaomi/hm/health/databases/model/Device;", "a", "", "getSn", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "sn", "", "updateSn", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "deviceRepositoryApi", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HmDeviceSnService implements DeviceSnService, KoinComponent {

    @NotNull
    private static final String b = "HmDeviceSnService";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceRepositoryApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device sn -> [" + this.a + "]";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Device is null while update sn " + this.a;
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
        public final String invoke() {
            return "No need upgrade sn";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Device a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Device device) {
            super(0);
            this.a = device;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            Device device = this.a;
            return "update device sn -> [" + (device == null ? null : device.getSn()) + "]";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HmDeviceSnService() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceRepositoryApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceRepositoryApi>() { // from class: com.xiaomi.hm.health.devicex.manage.impl.core.feature.HmDeviceSnService$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceRepositoryApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceRepositoryApi.class), qualifier, objArr);
            }
        });
    }

    private final Device a(HMDeviceType type) {
        return HMDeviceManager.getInstance().getDeviceBound(type);
    }

    private final DeviceRepositoryApi b() {
        return (DeviceRepositoryApi) this.deviceRepositoryApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService
    @Nullable
    public synchronized String getSn(@NotNull HMDeviceType type) {
        String sn;
        Device deviceA = a(type);
        sn = deviceA == null ? null : deviceA.getSn();
        HMLog.debug(b, new a(sn));
        return sn;
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService
    public synchronized void updateSn(@NotNull HMDeviceType type, @NotNull String sn) {
        Device deviceA = a(type);
        if (deviceA == null) {
            HMLog.debug(b, new b(sn));
        } else {
            if (Intrinsics.areEqual(deviceA.getSn(), sn)) {
                HMLog.info(b, c.a);
                return;
            }
            deviceA.setSn(sn);
            b().insertOrReplace(deviceA);
            HMLog.debug(b, new d(deviceA));
        }
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService
    @Nullable
    public synchronized String getSn(@NotNull HMBaseDevice device) {
        HMDeviceType deviceType;
        deviceType = device.getDeviceType();
        return deviceType == null ? null : getSn(deviceType);
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService
    public synchronized void updateSn(@NotNull HMBaseDevice device, @NotNull String sn) {
        HMDeviceType deviceType = device.getDeviceType();
        if (deviceType != null) {
            updateSn(deviceType, sn);
        }
    }
}
