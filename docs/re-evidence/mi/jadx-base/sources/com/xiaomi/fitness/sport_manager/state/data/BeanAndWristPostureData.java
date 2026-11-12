package com.xiaomi.fitness.sport_manager.state.data;

import com.xiaomi.fitness.sport_manager_export.data.SportResponseExtraData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/state/data/BeanAndWristPostureData;", "", "<init>", "()V", "appFinishMainExtraData", "Lcom/xiaomi/fitness/sport_manager_export/data/SportResponseExtraData;", "getAppFinishMainExtraData", "()Lcom/xiaomi/fitness/sport_manager_export/data/SportResponseExtraData;", "setAppFinishMainExtraData", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportResponseExtraData;)V", "appFinishAccessoryExtraData", "getAppFinishAccessoryExtraData", "setAppFinishAccessoryExtraData", "deviceFinishMainExtraData", "getDeviceFinishMainExtraData", "setDeviceFinishMainExtraData", "isCommandFromDevice", "", "()Z", "setCommandFromDevice", "(Z)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BeanAndWristPostureData {

    @NotNull
    public static final BeanAndWristPostureData INSTANCE = new BeanAndWristPostureData();

    @Nullable
    private static SportResponseExtraData appFinishAccessoryExtraData;

    @Nullable
    private static SportResponseExtraData appFinishMainExtraData;

    @Nullable
    private static SportResponseExtraData deviceFinishMainExtraData;
    private static boolean isCommandFromDevice;

    private BeanAndWristPostureData() {
    }

    @Nullable
    public final SportResponseExtraData getAppFinishAccessoryExtraData() {
        return appFinishAccessoryExtraData;
    }

    @Nullable
    public final SportResponseExtraData getAppFinishMainExtraData() {
        return appFinishMainExtraData;
    }

    @Nullable
    public final SportResponseExtraData getDeviceFinishMainExtraData() {
        return deviceFinishMainExtraData;
    }

    public final boolean isCommandFromDevice() {
        return isCommandFromDevice;
    }

    public final void setAppFinishAccessoryExtraData(@Nullable SportResponseExtraData sportResponseExtraData) {
        appFinishAccessoryExtraData = sportResponseExtraData;
    }

    public final void setAppFinishMainExtraData(@Nullable SportResponseExtraData sportResponseExtraData) {
        appFinishMainExtraData = sportResponseExtraData;
    }

    public final void setCommandFromDevice(boolean z) {
        isCommandFromDevice = z;
    }

    public final void setDeviceFinishMainExtraData(@Nullable SportResponseExtraData sportResponseExtraData) {
        deviceFinishMainExtraData = sportResponseExtraData;
    }
}
