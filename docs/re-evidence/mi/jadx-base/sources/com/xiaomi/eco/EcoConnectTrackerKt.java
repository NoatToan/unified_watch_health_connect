package com.xiaomi.eco;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.sync.model.ICalendar;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0006\u001a\u0006\u0010\u0012\u001a\u00020\u0013\u001a>\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018\u001a>\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0018\u001a\u0010\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010\u0001\u001a0\u0010'\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\"\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {ICalendar.Property.DURATION, "", "DEVICE_MODEL", "ERROR_CODE", "ERROR_MSG", "DEVICE_NAME", "DEVICE_MAC", "RESULT", "VERSION", "IS_AUTO", "FIRMWARE_VERSION", "TAG", "connectCostStart", "", "getConnectCostStart", "()J", "setConnectCostStart", "(J)V", "trackConnectStart", "", "trackConnectSuccess", "model", "firmwareVersion", "count", "", "auto", "", "authType", "from", "deviceType", "trackConnectError", "errorCode", Constants.EXTRA_ERROR_MESSAGE, "deviceConnectMap", "", "getDeviceConnectMap", "()Ljava/util/Map;", "startTrackConnectAlive", "did", "endTrackConnectAlive", "eco-common-connect_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EcoConnectTrackerKt {

    @NotNull
    public static final String DEVICE_MAC = "mac";

    @NotNull
    public static final String DEVICE_MODEL = "device_model";

    @NotNull
    public static final String DEVICE_NAME = "device_name";

    @NotNull
    public static final String DURATION = "duration";

    @NotNull
    public static final String ERROR_CODE = "error_code";

    @NotNull
    public static final String ERROR_MSG = "error_info";

    @NotNull
    public static final String FIRMWARE_VERSION = "firmware_version";

    @NotNull
    public static final String IS_AUTO = "is_auto";

    @NotNull
    public static final String RESULT = "result";

    @NotNull
    private static final String TAG = "ConnectTracker";

    @NotNull
    public static final String VERSION = "version";
    private static long connectCostStart;

    @NotNull
    private static final Map<String, Long> deviceConnectMap = new ArrayMap();

    public static final void endTrackConnectAlive(@Nullable String str, @NotNull String model, int i, @NotNull String errorMsg, @NotNull String firmwareVersion) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        try {
            Logger.i("ConnectTrack", "endTrackConnectAlive() called with: did = " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Map<String, Long> map = deviceConnectMap;
            Long l = map.get(str);
            Logger.i("ConnectTrack", "endTrackConnectAlive() called with: start = " + l);
            if (l != null && l.longValue() != 0) {
                long jCurrentTimeMillis = (System.currentTimeMillis() - l.longValue()) / ((long) 1000);
                Logger.i("ConnectTrack", "endTrackConnectAlive() called with: model = " + model + ", errorCode = " + i + ", errorMsg = " + errorMsg + ", firmwareVersion = " + firmwareVersion);
                OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("connect_v3", "56.8.2.1.15236"), "device_model", model, "name", "connect_duration", "who", "", "duration_sec", Long.valueOf(jCurrentTimeMillis), "device_version", firmwareVersion, "error_code", Integer.valueOf(i), "error_info", errorMsg);
                Intrinsics.checkNotNull(str);
                map.put(str, 0L);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final long getConnectCostStart() {
        return connectCostStart;
    }

    @NotNull
    public static final Map<String, Long> getDeviceConnectMap() {
        return deviceConnectMap;
    }

    public static final void setConnectCostStart(long j) {
        connectCostStart = j;
    }

    public static final void startTrackConnectAlive(@Nullable String str) {
        Logger.i("ConnectTrack", "startTrackConnectAlive() called with: did = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Map<String, Long> map = deviceConnectMap;
            Intrinsics.checkNotNull(str);
            map.put(str, Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void trackConnectError(@NotNull String model, @NotNull String firmwareVersion, int i, @NotNull String errorMsg, int i2, boolean z, int i3) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        if (connectCostStart == 0) {
            Logger.i(TAG, "trackConnectError: no record connect start " + model);
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - connectCostStart) / ((long) 1000);
        Logger.i("ConnectTrack", "trackConnectError() called with: costMills = " + jCurrentTimeMillis);
        if (jCurrentTimeMillis < 0) {
            return;
        }
        Logger.i("ConnectTrack", "trackConnectSuccess() called with: model = " + model + ", firmwareVersion = " + firmwareVersion + ", errorCode = " + i + ", errorMsg = " + errorMsg + ", count = " + i2 + ", deviceType = " + i3);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("connect_v3", "56.8.2.1.15235"), "result", Boolean.FALSE, "device_model", model, "error_code", Integer.valueOf(i), "error_info", errorMsg, "name", "connect_process", "who", "", "duration_sec", Long.valueOf(jCurrentTimeMillis), "device_version", firmwareVersion, "is_foreground", Boolean.valueOf(ApplicationExtKt.isForeground(ApplicationExtKt.getApplication())), "is_auto", Boolean.valueOf(z), "count", Integer.valueOf(i2), DeviceContractKt.COLUMN_DEVICE_TYPE, String.valueOf(i3));
        connectCostStart = 0L;
    }

    public static final void trackConnectStart() {
        connectCostStart = System.currentTimeMillis();
    }

    public static final void trackConnectSuccess(@NotNull String model, @NotNull String firmwareVersion, int i, boolean z, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        if (connectCostStart == 0) {
            Logger.i(TAG, "trackConnectSuccess: no record connect start " + model);
            return;
        }
        float fCurrentTimeMillis = (System.currentTimeMillis() - connectCostStart) / 1000.0f;
        if (fCurrentTimeMillis < 0.0f) {
            return;
        }
        double d = fCurrentTimeMillis;
        Logger.i("ConnectTrack", "trackConnectSuccess() called with: model = " + model + ", firmwareVersion = " + firmwareVersion + ", count = " + i + ", auto = " + z + ", sec = " + Math.floor(d) + ", from = " + i3 + ", auth_type = " + i2 + ", deviceType = " + i4);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("connect_v3", "56.8.2.1.15235"), "result", Boolean.TRUE, "device_model", model, "error_code", 0, "error_info", "", "name", "connect_process", "who", "", "device_version", firmwareVersion, "duration_sec", Double.valueOf(Math.floor(d)), "is_foreground", Boolean.valueOf(ApplicationExtKt.isForeground(ApplicationExtKt.getApplication())), "is_auto", Boolean.valueOf(z), "type_str", String.valueOf(i2), "from", Integer.valueOf(i3), "count", Integer.valueOf(i), DeviceContractKt.COLUMN_DEVICE_TYPE, String.valueOf(i4));
        connectCostStart = 0L;
    }
}
