package com.xiaomi.hm.health.devicex.manage.impl.core;

import com.xiaomi.hm.health.devicex.manage.api.core.DeviceRepositoryApiFactory;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceMigrationApi;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import com.xiaomi.hm.health.devicex.manage.impl.repository.DeviceRepositoryImpl;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001d\u0010\n\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/impl/core/HMDeviceRepositoryApiFactory;", "Lcom/xiaomi/hm/health/devicex/manage/api/core/DeviceRepositoryApiFactory;", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "createDeviceRepository", "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceMigrationApi;", "createDeviceMigrateApi", "Lcom/xiaomi/hm/health/devicex/manage/impl/repository/DeviceRepositoryImpl;", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/devicex/manage/impl/repository/DeviceRepositoryImpl;", "deviceRepository", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HMDeviceRepositoryApiFactory implements DeviceRepositoryApiFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceRepository = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/devicex/manage/impl/repository/DeviceRepositoryImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DeviceRepositoryImpl> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceRepositoryImpl invoke() {
            return new DeviceRepositoryImpl();
        }
    }

    private final DeviceRepositoryImpl a() {
        return (DeviceRepositoryImpl) this.deviceRepository.getValue();
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.core.DeviceRepositoryApiFactory
    @NotNull
    public DeviceMigrationApi createDeviceMigrateApi() {
        return a();
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.core.DeviceRepositoryApiFactory
    @NotNull
    public DeviceRepositoryApi createDeviceRepository() {
        return a();
    }
}
