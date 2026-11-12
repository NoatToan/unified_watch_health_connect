package com.xiaomi.fitness.eco.device.manager.ui.bind;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0006\u0010\u0013\u001a\u00020\u0014\u001a>\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b\u001a\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"TIP", "", "NAME", "RESULT", "DEVICE_MODEL", "DEVICE_VERSION", "DEVICE_DID", "ERROR_CODE", "DEVICE_NAME", "ERROR_INFO", "VERSION", "DURATION_SEC", "COUNT", "time", "", "getTime", "()J", "setTime", "(J)V", "reportBindStart", "", "reportBindFinish", "result", "", "model", "version", "code", "", "info", "count", "deviceType", "reportUnbind", "eco-device-manager_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoBindDataTrackerKt {

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
    public static final String NAME = "name";

    @NotNull
    public static final String RESULT = "result";

    @NotNull
    public static final String TIP = "tip";

    @NotNull
    public static final String VERSION = "version";
    private static long time;

    public static final long getTime() {
        return time;
    }

    public static final void reportBindFinish(boolean z, @NotNull String model, @NotNull String version, int i, @NotNull String info, int i2, int i3) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(info, "info");
        if (time == 0) {
            EcoDeviceModelExtKt.logd("reportBindFinish error start");
            return;
        }
        Logger.i("BindDataTracker", "reportBindFinish() called with: result = " + z + ", model = " + model + ", version = " + version + ", code = " + i + ", info = " + info + ", count = " + i2);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("connect_v3", "56.8.1.1.15234"), "result", Boolean.valueOf(z), "device_model", model, "device_version", version, "name", "bind_process", "who", "", "duration_sec", Long.valueOf((System.currentTimeMillis() - time) / ((long) 1000)), "error_code", Integer.valueOf(i), "error_info", info, "count", Integer.valueOf(i2), DeviceContractKt.COLUMN_DEVICE_TYPE, String.valueOf(i3));
        time = 0L;
    }

    public static final void reportBindStart() {
        time = System.currentTimeMillis();
    }

    public static final void reportUnbind(@NotNull String model, @NotNull String version) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(version, "version");
        Logger.i("BindDataTracker", "reportUnbind() called model = " + model + ", version = " + version);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("connect_v3", "56.8.4.1.17892"), "name", "break", "who", "", "device_model", model, "device_version", version);
    }

    public static final void setTime(long j) {
        time = j;
    }
}
