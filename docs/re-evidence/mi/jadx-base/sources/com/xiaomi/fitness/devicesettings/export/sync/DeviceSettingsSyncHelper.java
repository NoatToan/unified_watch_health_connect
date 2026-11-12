package com.xiaomi.fitness.devicesettings.export.sync;

import com.xiaomi.fitness.devicesettings.export.model.DeviceBPRemind;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0019\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/sync/DeviceSettingsSyncHelper;", "", "setHuamiDeviceAlarmSyncSrc", "", "did", "", "source", "", "getHuamiGoalRemindEnable", "", "setBloodPressureRemind", "remind", "Lcom/xiaomi/fitness/devicesettings/export/model/DeviceBPRemind;", "getBloodPressureRemind", "oneTrackDeviceSetting", "syncPhoneNetState2Device", "isConnect", "(Ljava/lang/Boolean;)V", "Companion", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceSettingsSyncHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/export/sync/DeviceSettingsSyncHelper$Companion;", "", "<init>", "()V", "device-settings-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void syncPhoneNetState2Device$default(DeviceSettingsSyncHelper deviceSettingsSyncHelper, Boolean bool, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncPhoneNetState2Device");
            }
            if ((i & 1) != 0) {
                bool = null;
            }
            deviceSettingsSyncHelper.syncPhoneNetState2Device(bool);
        }
    }

    @NotNull
    String getBloodPressureRemind();

    boolean getHuamiGoalRemindEnable();

    void oneTrackDeviceSetting();

    void setBloodPressureRemind(@NotNull DeviceBPRemind remind);

    void setHuamiDeviceAlarmSyncSrc(@NotNull String did, int source);

    void syncPhoneNetState2Device(@Nullable Boolean isConnect);
}
