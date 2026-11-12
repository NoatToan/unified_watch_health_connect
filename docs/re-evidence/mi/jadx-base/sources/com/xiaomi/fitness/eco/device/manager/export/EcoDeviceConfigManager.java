package com.xiaomi.fitness.eco.device.manager.export;

import android.content.Context;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoScannedDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceConfigManager;", "", "isEcoDevice", "", "model", "", "isNotShowDisconnectTipDevices", "isEightScaleDevice", "launchEcoBindActivity", "context", "Landroid/content/Context;", "deviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoScannedDeviceInfo;", "from", "", "ecoWeightActivityPath", "Companion", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EcoDeviceConfigManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceConfigManager$Companion;", "", "<init>", "()V", "eco-device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @NotNull
    String ecoWeightActivityPath(@NotNull String model);

    boolean isEcoDevice(@NotNull String model);

    boolean isEightScaleDevice(@NotNull String model);

    boolean isNotShowDisconnectTipDevices(@NotNull String model);

    boolean launchEcoBindActivity(@NotNull Context context, @NotNull EcoScannedDeviceInfo deviceInfo, int from);
}
