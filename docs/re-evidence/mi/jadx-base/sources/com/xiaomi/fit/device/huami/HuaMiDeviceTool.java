package com.xiaomi.fit.device.huami;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import com.xiaomi.hm.health.bt.sdk.IDeviceBaseCallback;
import com.xiaomi.wearable.HuamiApiClient;
import com.xiaomi.wearable.HuamiApiExtKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0003\u0018\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\"\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/device/huami/HuaMiDeviceTool;", "", "<init>", "()V", "huaMiDeviceHashMap", "", "", "Lcom/xiaomi/fit/device/huami/HuaMiInternalApiCaller;", "bind", "", "mac", "deviceCallback", "Lcom/xiaomi/hm/health/bt/sdk/IDeviceBaseCallback;", "getOrInit", "did", "initHuaMiDevice", "removeHuaMiDevice", "recreateHuaMiDevice", "callback", "Lcom/xiaomi/fit/device/huami/HuaMiDeviceTool$RemoveCallBack;", "getHuaMiDevice", "getDeviceInfo", "Lcom/xiaomi/hm/health/bt/sdk/DeviceInfoExt;", "changeInValidMac", "Companion", "RemoveCallBack", "HuamiDeviceConnectToolHolder", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuaMiDeviceTool {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int ERROR_CODE_ALARM_FULL = 1;
    public static final int SUPPORT_MAX_ALARM_COUNT = 10;

    @NotNull
    private static final String TAG = "HuaMiDeviceTool";

    @NotNull
    private final Map<String, HuaMiInternalApiCaller> huaMiDeviceHashMap;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/device/huami/HuaMiDeviceTool$Companion;", "", "<init>", "()V", "SUPPORT_MAX_ALARM_COUNT", "", "ERROR_CODE_ALARM_FULL", "TAG", "", "instance", "Lcom/xiaomi/fit/device/huami/HuaMiDeviceTool;", "getInstance", "()Lcom/xiaomi/fit/device/huami/HuaMiDeviceTool;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HuaMiDeviceTool getInstance() {
            return HuamiDeviceConnectToolHolder.INSTANCE.getInstance();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fit/device/huami/HuaMiDeviceTool$HuamiDeviceConnectToolHolder;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/device/huami/HuaMiDeviceTool;", "getInstance", "()Lcom/xiaomi/fit/device/huami/HuaMiDeviceTool;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HuamiDeviceConnectToolHolder {

        @NotNull
        public static final HuamiDeviceConnectToolHolder INSTANCE = new HuamiDeviceConnectToolHolder();

        @NotNull
        private static final HuaMiDeviceTool instance = new HuaMiDeviceTool(null);

        private HuamiDeviceConnectToolHolder() {
        }

        @NotNull
        public final HuaMiDeviceTool getInstance() {
            return instance;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fit/device/huami/HuaMiDeviceTool$RemoveCallBack;", "", "onRemoved", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface RemoveCallBack {
        void onRemoved();
    }

    public /* synthetic */ HuaMiDeviceTool(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final synchronized HuaMiInternalApiCaller initHuaMiDevice(String mac, String did) {
        HuaMiApiCallerImpl huaMiApiCallerImpl;
        huaMiApiCallerImpl = new HuaMiApiCallerImpl(mac, did);
        this.huaMiDeviceHashMap.put(mac, huaMiApiCallerImpl);
        return huaMiApiCallerImpl;
    }

    public final synchronized void bind(@NotNull String mac, @NotNull IDeviceBaseCallback deviceCallback) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(deviceCallback, "deviceCallback");
        removeHuaMiDevice(mac);
        HuaMiInternalApiCaller orInit = getOrInit(mac, null);
        this.huaMiDeviceHashMap.put(mac, orInit);
        orInit.setPair(true);
        orInit.connect(deviceCallback);
    }

    @NotNull
    public final String changeInValidMac(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.i(TAG, "changeInValidMac() called with: mac = " + mac);
        int length = mac.length() / 2;
        int i = length + (-1);
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i3 + 2;
            String strSubstring = mac.substring(i3, i4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb.append(strSubstring);
            sb.append(":");
            if (i2 == length - 2) {
                String strSubstring2 = mac.substring(i4, i3 + 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                sb.append(strSubstring2);
            }
            i2++;
            i3 = i4;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Nullable
    public final DeviceInfoExt getDeviceInfo(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.i(TAG, "getDeviceInfo() called with: mac = " + mac);
        HuaMiInternalApiCaller huaMiDevice = getHuaMiDevice(mac);
        if (huaMiDevice != null) {
            return huaMiDevice.getDeviceInfo();
        }
        return null;
    }

    @Nullable
    public final synchronized HuaMiInternalApiCaller getHuaMiDevice(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return this.huaMiDeviceHashMap.get(mac);
    }

    @NotNull
    public final synchronized HuaMiInternalApiCaller getOrInit(@NotNull String mac, @Nullable String did) {
        HuaMiInternalApiCaller huaMiDevice;
        Intrinsics.checkNotNullParameter(mac, "mac");
        huaMiDevice = getHuaMiDevice(mac);
        Logger.d(TAG, "getOrInit() called with: mac = [" + mac + "], " + huaMiDevice);
        if (huaMiDevice == null) {
            huaMiDevice = initHuaMiDevice(mac, did);
        }
        return huaMiDevice;
    }

    @Nullable
    public final synchronized HuaMiInternalApiCaller recreateHuaMiDevice(@NotNull String mac, @NotNull String did, @Nullable RemoveCallBack callback) {
        try {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i(TAG, "recreateHuaMiDevice() called with: mac = " + mac + ", did = " + did + ", callback = " + callback);
            removeHuaMiDevice(mac);
            if (callback != null) {
                callback.onRemoved();
            }
        } catch (Throwable th) {
            throw th;
        }
        return initHuaMiDevice(mac, did);
    }

    public final synchronized void removeHuaMiDevice(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Logger.i(TAG, "removeHuaMiDevice() called with: mac = " + mac);
        HuaMiInternalApiCaller huaMiDevice = getHuaMiDevice(mac);
        if (huaMiDevice != null) {
            huaMiDevice.setAutoReconnect(false);
            try {
                huaMiDevice.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
            HuamiApiExtKt.getInstance(HuamiApiClient.INSTANCE).removeRemoteHuamiApi(mac, null);
            huaMiDevice.setCallback(null);
            huaMiDevice.destroy();
            Logger.i(TAG, "remove huaMiDevice, mac:" + mac + ", device = " + this.huaMiDeviceHashMap.remove(mac));
        }
    }

    private HuaMiDeviceTool() {
        this.huaMiDeviceHashMap = new HashMap();
    }
}
