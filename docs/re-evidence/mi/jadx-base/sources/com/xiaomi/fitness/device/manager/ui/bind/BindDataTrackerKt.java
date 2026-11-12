package com.xiaomi.fitness.device.manager.ui.bind;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u001a\u0006\u0010\u0014\u001a\u00020\u0015\u001al\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0001\u001a\u0016\u0010%\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"TIP", "", "NAME", "RESULT", "DEVICE_MODEL", "DEVICE_VERSION", "DEVICE_DID", "ERROR_CODE", "DEVICE_NAME", "ERROR_INFO", "VERSION", "DURATION_SEC", "COUNT", "FROM", "time", "", "getTime", "()J", "setTime", "(J)V", "reportBindStart", "", "reportBindFinish", "result", "", "model", "version", "code", "", "info", "count", "deviceType", "from", "inBindList", "connectedDevice", "paired", "mac", "reportUnbind", "device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BindDataTrackerKt {

    @NotNull
    public static final String COUNT = "count";

    @NotNull
    public static final String DEVICE_DID = "device_did";

    @NotNull
    public static final String DEVICE_MODEL = "device_model";

    @NotNull
    public static final String DEVICE_NAME = "device_name";

    @NotNull
    public static final String DEVICE_VERSION = "device_version";

    @NotNull
    public static final String DURATION_SEC = "duration_sec";

    @NotNull
    public static final String ERROR_CODE = "error_code";

    @NotNull
    public static final String ERROR_INFO = "error_info";

    @NotNull
    public static final String FROM = "source";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String RESULT = "result";

    @NotNull
    public static final String TIP = "tip";

    @NotNull
    public static final String VERSION = "version";
    private static volatile long time;

    public static final long getTime() {
        return time;
    }

    public static final void reportBindFinish(boolean z, @NotNull String model, @NotNull String version, int i, @NotNull String info, int i2, int i3, int i4, boolean z2, int i5, boolean z3, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(mac, "mac");
        if (time == 0) {
            DeviceModelExtKt.logd("reportBindFinish error start");
            return;
        }
        Logger.i("BindDataTracker", "reportBindFinish() called with: result = " + z + ", model = " + model + ", version = " + version + ", code = " + i + ", info = " + info + ", count = " + i2 + ", from = " + i4 + ", inbindlist = " + z2 + ", connectedDevice = " + i5 + ", paired = " + z3);
        if (!z) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).setCommonProperty();
        }
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("connect_v3", "56.8.1.1.15234"), "result", Boolean.valueOf(z), "device_model", model, "device_version", version, "name", "bind_process", "who", "", "duration_sec", Long.valueOf((System.currentTimeMillis() - time) / ((long) 1000)), "error_code", Integer.valueOf(i), "error_info", info, "count", Integer.valueOf(i2), DeviceContractKt.COLUMN_DEVICE_TYPE, String.valueOf(i3), "source", Integer.valueOf(i4), "in_binding_list", Integer.valueOf(z2 ? 1 : 0), "ble_connect_num", Integer.valueOf(i5), "has_ble_pairing", Integer.valueOf(z3 ? 1 : 0), "mac", mac);
        time = 0L;
    }

    public static final void reportBindStart() {
        time = System.currentTimeMillis();
    }

    public static final void reportUnbind(@NotNull String model, @NotNull String version) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(version, "version");
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("connect_v3", "56.8.4.1.17892"), "name", "break", "who", "", "device_model", model, "device_version", version);
    }

    public static final void setTime(long j) {
        time = j;
    }
}
