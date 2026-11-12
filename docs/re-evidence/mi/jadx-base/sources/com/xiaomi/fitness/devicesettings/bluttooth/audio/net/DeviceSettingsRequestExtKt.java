package com.xiaomi.fitness.devicesettings.bluttooth.audio.net;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.net.DeviceSettingsRequestExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"deviceSettingsRequest", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsRequest;", "getDeviceSettingsRequest", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/net/DeviceSettingsRequest;", "deviceSettingsRequest$delegate", "Lkotlin/Lazy;", "device-settings_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeviceSettingsRequestExtKt {

    @NotNull
    private static final Lazy deviceSettingsRequest$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pm6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceSettingsRequestExtKt.deviceSettingsRequest_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceSettingsRequest deviceSettingsRequest_delegate$lambda$0() {
        return ((DeviceSettingsPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), DeviceSettingsPoint.class)).getDeviceSettingsRequest();
    }

    @NotNull
    public static final DeviceSettingsRequest getDeviceSettingsRequest() {
        return (DeviceSettingsRequest) deviceSettingsRequest$delegate.getValue();
    }
}
