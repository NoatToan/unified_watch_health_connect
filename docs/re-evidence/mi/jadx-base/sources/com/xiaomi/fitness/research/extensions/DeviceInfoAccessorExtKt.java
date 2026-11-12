package com.xiaomi.fitness.research.extensions;

import com.xiaomi.fitness.device.manager.export.WearableProductManager;
import com.xiaomi.fitness.research.device.DeviceInfoAccessor;
import com.xiaomi.fitness.research.device.DeviceInfoAccessorImpl;
import com.xiaomi.fitness.research.device.ResearchProductManager;
import com.xiaomi.fitness.research.extensions.DeviceInfoAccessorExtKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001f\u0010\u0000\u001a\u00020\u0007*\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0003\u0010\b¨\u0006\n"}, d2 = {"instance", "Lcom/xiaomi/fitness/research/device/DeviceInfoAccessor;", "Lcom/xiaomi/fitness/research/device/DeviceInfoAccessor$Companion;", "getInstance", "(Lcom/xiaomi/fitness/research/device/DeviceInfoAccessor$Companion;)Lcom/xiaomi/fitness/research/device/DeviceInfoAccessor;", "instance$delegate", "Lkotlin/Lazy;", "Lcom/xiaomi/fitness/device/manager/export/WearableProductManager;", "(Lcom/xiaomi/fitness/device/manager/export/WearableProductManager;)Lcom/xiaomi/fitness/device/manager/export/WearableProductManager;", "instance$delegate$1", "research-support_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceInfoAccessorExtKt {

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: v56
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceInfoAccessorExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private static final Lazy instance$delegate$1 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: w56
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceInfoAccessorExtKt.instance_delegate$lambda$1();
        }
    });

    @NotNull
    public static final DeviceInfoAccessor getInstance(@NotNull DeviceInfoAccessor.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (DeviceInfoAccessor) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceInfoAccessorImpl instance_delegate$lambda$0() {
        return new DeviceInfoAccessorImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResearchProductManager instance_delegate$lambda$1() {
        return new ResearchProductManager();
    }

    @NotNull
    public static final WearableProductManager getInstance(@NotNull WearableProductManager wearableProductManager) {
        Intrinsics.checkNotNullParameter(wearableProductManager, "<this>");
        return (WearableProductManager) instance$delegate$1.getValue();
    }
}
