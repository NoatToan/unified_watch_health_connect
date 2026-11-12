package com.xiaomi.fitness.eco.device.manager.export;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManagerExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"instance", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceConfigManager;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceConfigManager$Companion;", "getInstance", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceConfigManager$Companion;)Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceConfigManager;", "instance$delegate", "Lkotlin/Lazy;", "MODEL_EIGTHT_SCALE", "", "MODEL_SCALE_MIBFS", "MODEL_SCALE_MISCALE2", "GYM_MODEL_EX_BIKE", "GYM_MODEL_YE_SOUL_EX_BIKE", "eco-device-manager-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceConfigManagerExtKt {

    @NotNull
    public static final String GYM_MODEL_EX_BIKE = "runmi.exbike.jscrm1";

    @NotNull
    public static final String GYM_MODEL_YE_SOUL_EX_BIKE = "yesoul.exbike.jsc01y";

    @NotNull
    public static final String MODEL_EIGTHT_SCALE = "yunmai.scales.ms3001";

    @NotNull
    public static final String MODEL_SCALE_MIBFS = "hmpace.scales.mibfs";

    @NotNull
    public static final String MODEL_SCALE_MISCALE2 = "hmpace.scales.miscale2";

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wq7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoDeviceConfigManagerExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final EcoDeviceConfigManager getInstance(@NotNull EcoDeviceConfigManager.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (EcoDeviceConfigManager) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceConfigManager instance_delegate$lambda$0() {
        return ((EcoDeviceConfigPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), EcoDeviceConfigPoint.class)).getEcoDeviceConfigManager();
    }
}
