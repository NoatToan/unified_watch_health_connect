package com.xiaomi.fitness.eco.device.contact.extensions;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.extensions.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001f\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"DEVICE_SYNC_TAG", "", "logi", "", "msg", "loge", "instance", "Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineInternal;", "Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineInternal$Companion;", "getInstance", "(Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineInternal$Companion;)Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineInternal;", "instance$delegate", "Lkotlin/Lazy;", "eco-device-contact_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoDeviceSyncExtKt {

    @NotNull
    public static final String DEVICE_SYNC_TAG = "Eco-Device-Sync";

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zs7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EcoDeviceSyncExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final EcoDeviceContactEngineInternal getInstance(@NotNull EcoDeviceContactEngineInternal.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (EcoDeviceContactEngineInternal) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EcoDeviceContactEngineInternal instance_delegate$lambda$0() {
        return ((EcoDeviceSyncPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), EcoDeviceSyncPoint.class)).getEcoDeviceSyncEngine();
    }

    public static final void loge(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.e(DEVICE_SYNC_TAG, msg);
    }

    public static final void logi(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i(DEVICE_SYNC_TAG, msg);
    }
}
