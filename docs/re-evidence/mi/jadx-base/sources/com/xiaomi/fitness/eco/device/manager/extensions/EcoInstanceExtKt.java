package com.xiaomi.fitness.eco.device.manager.extensions;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoInstanceExtKt;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceManagerRemoteImpl;
import com.xiaomi.fitness.eco.device.model.api.EcoDeviceManagerWrapper;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerInternal;
import com.xiaomi.fitness.eco.device.model.api.EcoProductManagerRemoteInternal;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0003\u0010\t\"\u001f\u0010\u0000\u001a\u00020\u000b*\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0003\u0010\r\"\u001f\u0010\u0000\u001a\u00020\u000f*\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"instance", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;", "Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper$Companion;", "getInstance", "(Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper$Companion;)Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl;", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl$Companion;", "(Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl$Companion;)Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceManagerRemoteImpl;", "instance$delegate$1", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerInternal;", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerInternal$Companion;", "(Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerInternal$Companion;)Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerInternal;", "instance$delegate$2", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal;", "Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal$Companion;", "(Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal$Companion;)Lcom/xiaomi/fitness/eco/device/model/api/EcoProductManagerRemoteInternal;", "instance$delegate$3", "eco-device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoInstanceExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vt7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoInstanceExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wt7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoInstanceExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$2 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xt7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoInstanceExtKt.instance_delegate$lambda$2();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$3 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yt7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoInstanceExtKt.instance_delegate$lambda$3();
        }
    });

    @NotNull
    public static final EcoDeviceManagerWrapper getInstance(@NotNull EcoDeviceManagerWrapper.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (EcoDeviceManagerWrapper) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceManagerWrapper instance_delegate$lambda$0() {
        return ((EcoDevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), EcoDevicePoint.class)).getEcoDeviceManagerWrapper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceManagerRemoteImpl instance_delegate$lambda$1() {
        return ((EcoDevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), EcoDevicePoint.class)).getEcoDeviceManagerRemote();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoProductManagerInternal instance_delegate$lambda$2() {
        return ((EcoDevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), EcoDevicePoint.class)).getEcoProductManagerInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoProductManagerRemoteInternal instance_delegate$lambda$3() {
        return ((EcoDevicePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), EcoDevicePoint.class)).getEcoProductManagerRemoteInternal();
    }

    @NotNull
    public static final EcoDeviceManagerRemoteImpl getInstance(@NotNull EcoDeviceManagerRemoteImpl.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (EcoDeviceManagerRemoteImpl) instance$delegate$1.getValue();
    }

    @NotNull
    public static final EcoProductManagerInternal getInstance(@NotNull EcoProductManagerInternal.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (EcoProductManagerInternal) instance$delegate$2.getValue();
    }

    @NotNull
    public static final EcoProductManagerRemoteInternal getInstance(@NotNull EcoProductManagerRemoteInternal.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (EcoProductManagerRemoteInternal) instance$delegate$3.getValue();
    }
}
