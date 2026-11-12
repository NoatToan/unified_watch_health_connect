package com.xiaomi.fitness.device.contact.extensions;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.extensions.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001f\u0010\b\u001a\u00020\t*\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"DEVICE_SYNC_TAG", "", "logi", "", "msg", "loge", "throwable", "", "instance", "Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineInternal;", "Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineInternal$Companion;", "getInstance", "(Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineInternal$Companion;)Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineInternal;", "instance$delegate", "Lkotlin/Lazy;", "device-contact_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceSyncExtKt {

    @NotNull
    public static final String DEVICE_SYNC_TAG = "Device-Sync";

    @NotNull
    private static final Lazy instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xp6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceSyncExtKt.instance_delegate$lambda$0();
        }
    });

    @NotNull
    public static final DeviceContactEngineInternal getInstance(@NotNull DeviceContactEngineInternal.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return (DeviceContactEngineInternal) instance$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceContactEngineInternal instance_delegate$lambda$0() {
        return ((DeviceSyncPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), DeviceSyncPoint.class)).getDeviceSyncEngine();
    }

    public static final void loge(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.e(DEVICE_SYNC_TAG, msg);
    }

    public static final void logi(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i(DEVICE_SYNC_TAG, msg);
    }

    public static final void loge(@NotNull String msg, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Logger.e(DEVICE_SYNC_TAG, msg, throwable);
    }
}
