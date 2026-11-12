package com.huami.bluetooth.profile.channel.module.customvibrate;

import com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/customvibrate/CustomVibrateFactory;", "", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CustomVibrateFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/customvibrate/CustomVibrateFactory$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "Lcom/huami/bluetooth/profile/channel/module/customvibrate/CustomVibrateApi;", "create", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final CustomVibrateApi create(@NotNull HMBaseDevice baseDevice) {
            if (baseDevice.supportModule(MotorVibrateModule.class)) {
                return (CustomVibrateApi) baseDevice.getChannelModule(MotorVibrateModule.class);
            }
            HMMiLiProDevice hMMiLiProDevice = baseDevice instanceof HMMiLiProDevice ? (HMMiLiProDevice) baseDevice : null;
            BaseProfile profile = hMMiLiProDevice == null ? null : hMMiLiProDevice.getProfile();
            return new CustomVibrateDefaultImpl(profile instanceof EcfCmdProvider ? (EcfCmdProvider) profile : null);
        }
    }

    @JvmStatic
    @Nullable
    public static final CustomVibrateApi create(@NotNull HMBaseDevice hMBaseDevice) {
        return INSTANCE.create(hMBaseDevice);
    }
}
