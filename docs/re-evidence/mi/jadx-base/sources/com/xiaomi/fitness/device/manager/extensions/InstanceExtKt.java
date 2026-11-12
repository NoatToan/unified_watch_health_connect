package com.xiaomi.fitness.device.manager.extensions;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.extensions.InstanceExtKt;
import com.xiaomi.fitness.device.manager.remote.DeviceManagerRemoteImpl;
import com.xiaomi.fitness.device.model.api.ProductManagerInternal;
import com.xiaomi.fitness.device.model.api.ProductManagerRemoteInternal;
import com.xiaomi.fitness.device.model.api.WearableDeviceManagerWrapper;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0003\u0010\t\"\u001f\u0010\u0000\u001a\u00020\u000b*\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0003\u0010\r\"\u001f\u0010\u0000\u001a\u00020\u000f*\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"instance", "Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper$Companion;", "getInstance", "(Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper$Companion;)Lcom/xiaomi/fitness/device/model/api/WearableDeviceManagerWrapper;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal$Companion;", "(Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal$Companion;)Lcom/xiaomi/fitness/device/model/api/ProductManagerInternal;", "instance$delegate$1", "Lcom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl;", "Lcom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl$Companion;", "(Lcom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl$Companion;)Lcom/xiaomi/fitness/device/manager/remote/DeviceManagerRemoteImpl;", "instance$delegate$2", "Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal;", "Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal$Companion;", "(Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal$Companion;)Lcom/xiaomi/fitness/device/model/api/ProductManagerRemoteInternal;", "instance$delegate$3", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InstanceExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vbd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InstanceExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wbd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InstanceExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$2 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xbd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InstanceExtKt.instance_delegate$lambda$2();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$3 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ybd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return InstanceExtKt.instance_delegate$lambda$3();
        }
    });

    @NotNull
    public static final WearableDeviceManagerWrapper getInstance(@NotNull WearableDeviceManagerWrapper.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (WearableDeviceManagerWrapper) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceManagerWrapper instance_delegate$lambda$0() {
        return ((DevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), DevicePoint.class)).getDeviceManagerWrapper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductManagerInternal instance_delegate$lambda$1() {
        return ((DevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), DevicePoint.class)).getProductManagerInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceManagerRemoteImpl instance_delegate$lambda$2() {
        return ((DevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), DevicePoint.class)).getDeviceManagerRemote();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductManagerRemoteInternal instance_delegate$lambda$3() {
        return ((DevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), DevicePoint.class)).getProductManagerRemoteInternal();
    }

    @NotNull
    public static final ProductManagerInternal getInstance(@NotNull ProductManagerInternal.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ProductManagerInternal) instance$delegate$1.getValue();
    }

    @NotNull
    public static final DeviceManagerRemoteImpl getInstance(@NotNull DeviceManagerRemoteImpl.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (DeviceManagerRemoteImpl) instance$delegate$2.getValue();
    }

    @NotNull
    public static final ProductManagerRemoteInternal getInstance(@NotNull ProductManagerRemoteInternal.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (ProductManagerRemoteInternal) instance$delegate$3.getValue();
    }
}
