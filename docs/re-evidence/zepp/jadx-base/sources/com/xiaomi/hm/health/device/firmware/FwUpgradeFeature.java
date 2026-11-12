package com.xiaomi.hm.health.device.firmware;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/device/firmware/FwUpgradeFeature;", "", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FwUpgradeFeature {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/firmware/FwUpgradeFeature$Companion;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "", "supportSilentUpgrade", "supportDfuV5", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean supportDfuV5(@NotNull HMDeviceType deviceType) {
            return HMDevicePropertyCache.INSTANCE.getInstance().getFeature(deviceType).hasBase(3);
        }

        @JvmStatic
        public final boolean supportSilentUpgrade(@NotNull HMDeviceType deviceType) {
            return HMDevicePropertyCache.INSTANCE.getInstance().getFeature(deviceType).hasBase(0);
        }
    }

    @JvmStatic
    public static final boolean supportSilentUpgrade(@NotNull HMDeviceType hMDeviceType) {
        return INSTANCE.supportSilentUpgrade(hMDeviceType);
    }
}
