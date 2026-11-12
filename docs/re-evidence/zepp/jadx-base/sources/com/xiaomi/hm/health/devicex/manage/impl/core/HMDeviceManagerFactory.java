package com.xiaomi.hm.health.devicex.manage.impl.core;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.devicex.manage.api.core.DeviceManagerFactory;
import com.xiaomi.hm.health.devicex.manage.api.core.DeviceRepositoryApiFactory;
import com.xiaomi.hm.health.devicex.manage.api.core.manager.DeviceConnectManger;
import com.xiaomi.hm.health.devicex.manage.impl.core.manager.HMDeviceConnectManager;
import com.xiaomi.hm.health.devicex.manage.impl.core.manager.HMUserInfoProvider;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R%\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u0013R\u001d\u0010\u0017\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u000e\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/impl/core/HMDeviceManagerFactory;", "Lcom/xiaomi/hm/health/devicex/manage/api/core/DeviceManagerFactory;", "Lcom/xiaomi/hm/health/devicex/manage/api/core/DeviceRepositoryApiFactory;", "loadRepositoryFactory", "Lcom/xiaomi/hm/health/devicex/manage/api/core/manager/DeviceConnectManger;", "loadDeviceConnectManager", "Lcom/xiaomi/hm/health/device/HMDeviceManager;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "c", "()Lcom/xiaomi/hm/health/device/HMDeviceManager;", "deviceManager", "Lcom/xiaomi/hm/health/devicex/manage/impl/core/HMDeviceRepositoryApiFactory;", "b", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/devicex/manage/impl/core/HMDeviceRepositoryApiFactory;", "deviceRepositoryApiFactory", "Lcom/xiaomi/hm/health/bt/ife/IHMConnectionCallback;", "()Lcom/xiaomi/hm/health/bt/ife/IHMConnectionCallback;", "connectionCallback", "Lcom/xiaomi/hm/health/devicex/manage/impl/core/manager/HMDeviceConnectManager;", "()Lcom/xiaomi/hm/health/devicex/manage/impl/core/manager/HMDeviceConnectManager;", "deviceConnectManager", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HMDeviceManagerFactory implements DeviceManagerFactory {

    @NotNull
    public static final HMDeviceManagerFactory INSTANCE = new HMDeviceManagerFactory();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceManager = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceRepositoryApiFactory = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy connectionCallback = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceConnectManager = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/HMDeviceManager;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HMDeviceManager> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HMDeviceManager invoke() {
            return HMDeviceManagerFactory.INSTANCE.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/impl/core/manager/HMDeviceConnectManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HMDeviceConnectManager> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceConnectManager invoke() {
            return new HMDeviceConnectManager(DeviceXFunctionsKt.getContext(), new HMUserInfoProvider(), HMDeviceManagerFactory.INSTANCE.a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/HMDeviceManager;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<HMDeviceManager> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HMDeviceManager invoke() {
            return HMDeviceManager.getInstance();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/impl/core/HMDeviceRepositoryApiFactory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<HMDeviceRepositoryApiFactory> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceRepositoryApiFactory invoke() {
            return new HMDeviceRepositoryApiFactory();
        }
    }

    private HMDeviceManagerFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IHMConnectionCallback a() {
        return (IHMConnectionCallback) connectionCallback.getValue();
    }

    private final HMDeviceConnectManager b() {
        return (HMDeviceConnectManager) deviceConnectManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMDeviceManager c() {
        return (HMDeviceManager) deviceManager.getValue();
    }

    private final HMDeviceRepositoryApiFactory d() {
        return (HMDeviceRepositoryApiFactory) deviceRepositoryApiFactory.getValue();
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.core.DeviceManagerFactory
    @NotNull
    public DeviceConnectManger loadDeviceConnectManager() {
        return b();
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.core.DeviceManagerFactory
    @NotNull
    public DeviceRepositoryApiFactory loadRepositoryFactory() {
        return d();
    }
}
