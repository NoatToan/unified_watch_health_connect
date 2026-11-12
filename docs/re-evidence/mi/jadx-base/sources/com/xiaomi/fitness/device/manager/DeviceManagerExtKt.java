package com.xiaomi.fitness.device.manager;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.bean.Product;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"%\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\"1\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b*\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u0004\u0010\r¨\u0006\u000f"}, d2 = {"instance", "Lcom/xiaomi/fitness/device/manager/ProductManager;", "Lcom/xiaomi/fitness/device/manager/bean/Product;", "Lcom/xiaomi/fitness/device/manager/ProductManager$Companion;", "getInstance", "(Lcom/xiaomi/fitness/device/manager/ProductManager$Companion;)Lcom/xiaomi/fitness/device/manager/ProductManager;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/device/manager/DeviceManager;", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "Lcom/xiaomi/fitness/device/manager/DeviceManager$Companion;", "(Lcom/xiaomi/fitness/device/manager/DeviceManager$Companion;)Lcom/xiaomi/fitness/device/manager/DeviceManager;", "instance$delegate$1", "device-manager_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceManagerExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: r96
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceManagerExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: t96
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceManagerExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    public static final ProductManager<Product> getInstance(@NotNull ProductManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ProductManager) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductManager instance_delegate$lambda$0() {
        return ((DevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), DevicePoint.class)).getProductManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceManager instance_delegate$lambda$1() {
        return ((DevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), DevicePoint.class)).getDeviceManager();
    }

    @NotNull
    public static final DeviceManager<DeviceModel<DeviceInfo<Device>>> getInstance(@NotNull DeviceManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (DeviceManager) instance$delegate$1.getValue();
    }
}
