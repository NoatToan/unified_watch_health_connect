package com.xiaomi.wearable.core;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.sync.model.ICalendar;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\t\u001a\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0016\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000e\u001a^\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020#\u001a\u0010\u0010/\u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u00010\u0001\u001a8\u00101\u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u00010\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u00102\u001a\u00020#\u001a\u0010\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020#H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"/\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\u000fj\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e`\r¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\"\u001d\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u00065"}, d2 = {ICalendar.Property.DURATION, "", "DEVICE_MODEL", "ERROR_CODE", "ERROR_MSG", "DEVICE_NAME", "DEVICE_MAC", "RESULT", "VERSION", "IS_AUTO", "FIRMWARE_VERSION", "TAG", "connectTime", "Lkotlin/collections/HashMap;", "", "Ljava/util/HashMap;", "getConnectTime", "()Ljava/util/HashMap;", "Ljava/util/HashMap;", "connectCostStart", "getConnectCostStart", "()J", "setConnectCostStart", "(J)V", "trackConnectStart", "", "trackConnectTime", "step", "duration", "trackConnectResult", "result", "", "model", "firmwareVersion", "errorCode", "", Constants.EXTRA_ERROR_MESSAGE, "count", "authType", "auto", "deviceType", "aclConnected", "from", "deviceConnectMap", "", "getDeviceConnectMap", "()Ljava/util/Map;", "startTrackConnectAlive", "did", "endTrackConnectAlive", "reason", "getRangedDurationTime", "realSecond", "miwear-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConnectTrackerKt {

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
    private static final HashMap<String, Long> connectTime = new HashMap<>();

    @NotNull
    private static final Map<String, Long> deviceConnectMap = new ArrayMap();

    public static final void endTrackConnectAlive(@Nullable String str, @NotNull String model, int i, @NotNull String errorMsg, @NotNull String firmwareVersion, int i2) {
        Long l;
        long jCurrentTimeMillis;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        if (i2 != 4) {
            try {
                if (!TextUtils.isEmpty(str) && (l = deviceConnectMap.get(str)) != null && l.longValue() != 0) {
                    jCurrentTimeMillis = ((System.currentTimeMillis() - l.longValue()) / ((long) 1000)) / ((long) 60);
                }
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        jCurrentTimeMillis = 0;
        CoreExtKt.getReporter().report("connect_v3", MapsKt__MapsKt.hashMapOf(TuplesKt.to("tip", "56.8.2.1.15236"), TuplesKt.to("device_model", model), TuplesKt.to("name", "connect_duration"), TuplesKt.to("who", ""), TuplesKt.to("duration_sec", Long.valueOf(jCurrentTimeMillis)), TuplesKt.to("duration", String.valueOf(getRangedDurationTime((int) jCurrentTimeMillis))), TuplesKt.to("device_version", firmwareVersion), TuplesKt.to("error_code", Integer.valueOf(i)), TuplesKt.to("error_info", errorMsg), TuplesKt.to("reason", Integer.valueOf(i2))));
        if (str != null) {
            deviceConnectMap.put(str, 0L);
        }
    }

    public static final long getConnectCostStart() {
        return connectCostStart;
    }

    @NotNull
    public static final HashMap<String, Long> getConnectTime() {
        return connectTime;
    }

    @NotNull
    public static final Map<String, Long> getDeviceConnectMap() {
        return deviceConnectMap;
    }

    private static final int getRangedDurationTime(int i) {
        if (i <= 5) {
            return i;
        }
        if (6 <= i && i < 20) {
            return 10;
        }
        if (20 <= i && i < 40) {
            return 20;
        }
        if (40 <= i && i < 80) {
            return 40;
        }
        if (80 > i || i >= 100) {
            return (i / 100) * 100;
        }
        return 80;
    }

    public static final void setConnectCostStart(long j) {
        connectCostStart = j;
    }

    public static final void startTrackConnectAlive(@Nullable String str) {
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

    public static final void trackConnectResult(boolean z, @NotNull String model, @NotNull String firmwareVersion, int i, @NotNull String errorMsg, int i2, int i3, boolean z2, int i4, boolean z3, int i5) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        if (connectCostStart == 0) {
            CoreExtKt.getLogger().i(TAG, "trackConnectError: no record connect start " + model);
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - connectCostStart) / ((long) 1000);
        if (jCurrentTimeMillis < 0) {
            return;
        }
        try {
            CoreExtKt.getReporter().report("connect_v3", MapsKt__MapsKt.hashMapOf(TuplesKt.to("tip", "56.8.2.1.15235"), TuplesKt.to("result", Boolean.valueOf(z)), TuplesKt.to("device_model", model), TuplesKt.to("error_code", Integer.valueOf(i)), TuplesKt.to("error_info", errorMsg), TuplesKt.to("name", "connect_process"), TuplesKt.to("who", ""), TuplesKt.to("duration_sec", Long.valueOf(jCurrentTimeMillis)), TuplesKt.to("device_version", firmwareVersion), TuplesKt.to("is_auto", Boolean.valueOf(z2)), TuplesKt.to("count", Integer.valueOf(i2)), TuplesKt.to("type_str", String.valueOf(i3)), TuplesKt.to(DeviceContractKt.COLUMN_DEVICE_TYPE, String.valueOf(i4)), TuplesKt.to("duration_dict", DeviceInfoExtKt.getGson().toJson(connectTime)), TuplesKt.to("acl_connected", Boolean.valueOf(z3)), TuplesKt.to("from", Integer.valueOf(i5))));
        } catch (Exception e) {
            e.printStackTrace();
            CoreExtKt.getLogger().i(TAG, "trackConnectError: e: " + e);
        }
        connectCostStart = 0L;
    }

    public static final void trackConnectStart() {
        connectCostStart = System.currentTimeMillis();
        connectTime.clear();
    }

    public static final void trackConnectTime(@NotNull String step, long j) {
        Intrinsics.checkNotNullParameter(step, "step");
        connectTime.put(step, Long.valueOf(j / ((long) 1000)));
    }
}
