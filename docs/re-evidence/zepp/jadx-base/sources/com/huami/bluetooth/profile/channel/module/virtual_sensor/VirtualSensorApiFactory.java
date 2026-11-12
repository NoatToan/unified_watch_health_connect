package com.huami.bluetooth.profile.channel.module.virtual_sensor;

import com.huami.bluetooth.profile.channel.module.virtual_sensor.impl.VirtualSensorApiImpl;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorApiFactory;", "", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class VirtualSensorApiFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "VirtualSensorApiFactory";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorApiFactory$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/huami/bluetooth/profile/channel/module/virtual_sensor/VirtualSensorApi;", "create", "", "tag", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final VirtualSensorApi create(@NotNull HMBaseDevice device) {
            if (!device.supportModule(VirtualSensorModule.class)) {
                return null;
            }
            VirtualSensorModule virtualSensorModule = (VirtualSensorModule) device.getChannelModule(VirtualSensorModule.class);
            if (virtualSensorModule == null) {
                Debug.fi(VirtualSensorApiFactory.a, "Module is null");
                return null;
            }
            Integer version = virtualSensorModule.getVersion();
            if (version == null) {
                Debug.fi(VirtualSensorApiFactory.a, "version is null");
                return null;
            }
            if (version.intValue() == 1) {
                return new VirtualSensorApiImpl(virtualSensorModule);
            }
            Debug.fi(VirtualSensorApiFactory.a, Intrinsics.stringPlus("Not support version:", version));
            return null;
        }
    }
}
