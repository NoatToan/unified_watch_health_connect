package com.xiaomi.wearable;

import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.wearable.utils.SharedPreferencesUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0006\u0010\n\u001a\u00020\u000b\u001a\u0006\u0010\f\u001a\u00020\u000b\u001a\b\u0010\r\u001a\u00020\u000bH\u0002\u001a\u0006\u0010\u000e\u001a\u00020\u000b\u001a\u0006\u0010\u000f\u001a\u00020\u000b\u001a\u0006\u0010\u0010\u001a\u00020\u000b\u001a\b\u0010\u0011\u001a\u00020\u000bH\u0002\u001a\u0006\u0010\u0012\u001a\u00020\u000b\u001a\b\u0010\u0013\u001a\u00020\u0007H\u0002\u001a\b\u0010\u0014\u001a\u00020\u0007H\u0002\u001a\b\u0010\u0015\u001a\u00020\u0007H\u0002\u001a\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0001\u001a\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u000b\u001a\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"TAG", "", "MIUI_PC_SERVICE_VERSION", "MIUI_PC_SERVICE_SPP_VERSION", "MIUI_PC_SERVICE_STATE", "MIUI_PC_SERVICE_SPP_STATE", "CURRENT_SPP_VERSION", "", "SERVICE_OFF", "SERVICE_ON", "isAppCloudBLEOpen", "", "isAppCloudSPPOpen", "isSuitableModel", "isBleOpen", "isSppOpen", "hasBluetoothPermission", "isSystemProxyOpen", "isSppProxyOpen", "getProcessUserId", "getBleProxyVersion", "getSppProxyVersion", "isProxyRegister", Home.JSON_KEY_ADDRESS, "setProxyRegistered", "", "registered", "logInfo", "tag", "info", "miwear-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProxyManagerKt {
    public static final int CURRENT_SPP_VERSION = 1;

    @NotNull
    public static final String MIUI_PC_SERVICE_SPP_STATE = "0#pc_service_cloud";

    @NotNull
    public static final String MIUI_PC_SERVICE_SPP_VERSION = "MiuiPeripheralConnectionServiceSppVersion";

    @NotNull
    public static final String MIUI_PC_SERVICE_STATE = "MiuiPeripheralConnectionService";

    @NotNull
    public static final String MIUI_PC_SERVICE_VERSION = "MiuiPeripheralConnectionServiceVersion";
    public static final int SERVICE_OFF = 0;
    public static final int SERVICE_ON = 1;

    @NotNull
    private static final String TAG = "MIUIProxy";

    private static final int getBleProxyVersion() {
        try {
            return Settings.Global.getInt(CoreExtKt.getContext().getContentResolver(), "MiuiPeripheralConnectionServiceVersion", 0);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static final int getProcessUserId() {
        int iHashCode = Process.myUserHandle().hashCode();
        logInfo(TAG, "getProcessUserId, userId: " + iHashCode);
        return iHashCode;
    }

    private static final int getSppProxyVersion() {
        try {
            return Settings.Global.getInt(CoreExtKt.getContext().getContentResolver(), MIUI_PC_SERVICE_SPP_VERSION, 0);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static final boolean hasBluetoothPermission() {
        if (Build.VERSION.SDK_INT >= 31) {
            if (CoreExtKt.getContext().checkSelfPermission("android.permission.BLUETOOTH_CONNECT") != 0) {
                return false;
            }
        } else if (CoreExtKt.getContext().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return false;
        }
        return true;
    }

    public static final boolean isAppCloudBLEOpen() {
        return true;
    }

    public static final boolean isAppCloudSPPOpen() {
        return false;
    }

    public static final boolean isBleOpen() {
        boolean zIsSystemProxyOpen = isSystemProxyOpen();
        int processUserId = getProcessUserId();
        int bleProxyVersion = getBleProxyVersion();
        logInfo(TAG, "isBleOpen: proxyOpen = " + zIsSystemProxyOpen + ",bleProxyVersion = " + bleProxyVersion + ",processUserId = " + processUserId + ",suitableModel = " + isSuitableModel());
        return zIsSystemProxyOpen && processUserId == 0 && bleProxyVersion == 2;
    }

    public static final boolean isProxyRegister(@NotNull String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        boolean z = SharedPreferencesUtil.INSTANCE.getBoolean(address + ":bluetooth_registered", false);
        com.xiaomi.wearable.core.CoreExtKt.getLogger().i(TAG, "isProxyRegister " + address + " " + z);
        return z;
    }

    public static final boolean isSppOpen() {
        boolean zIsAppCloudSPPOpen = isAppCloudSPPOpen();
        boolean zIsSystemProxyOpen = isSystemProxyOpen();
        int processUserId = getProcessUserId();
        int sppProxyVersion = getSppProxyVersion();
        boolean zIsSuitableModel = isSuitableModel();
        boolean zIsSppProxyOpen = isSppProxyOpen();
        logInfo(TAG, "isSppOpen: cloudOpen = " + zIsAppCloudSPPOpen + ",proxyOpen = " + zIsSystemProxyOpen + ",sppProxyVersion = " + sppProxyVersion + ",processUserId = " + processUserId + ",sppProxyOpen = " + zIsSppProxyOpen + "suitableModel = " + zIsSuitableModel);
        return zIsAppCloudSPPOpen && zIsSystemProxyOpen && zIsSppProxyOpen && zIsSuitableModel && processUserId == 0 && sppProxyVersion == 2;
    }

    public static final boolean isSppProxyOpen() {
        try {
            int i = Settings.Global.getInt(CoreExtKt.getContext().getContentResolver(), MIUI_PC_SERVICE_SPP_STATE);
            logInfo(TAG, "isSppProxySupport: state = " + i);
            return i == 1;
        } catch (Exception e) {
            logInfo(TAG, "not support spp connection, " + e);
            return false;
        }
    }

    private static final boolean isSuitableModel() {
        return false;
    }

    private static final boolean isSystemProxyOpen() {
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%d#", Arrays.copyOf(new Object[]{Integer.valueOf(getProcessUserId())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            int i = Settings.Global.getInt(CoreExtKt.getContext().getContentResolver(), str + "MiuiPeripheralConnectionService");
            logInfo(TAG, "isSystemSupport: state = " + i);
            return i == 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static final void logInfo(String str, String str2) {
        try {
            com.xiaomi.wearable.core.CoreExtKt.getLogger().i(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final void setProxyRegistered(@NotNull String address, boolean z) {
        Intrinsics.checkNotNullParameter(address, "address");
        com.xiaomi.wearable.core.CoreExtKt.getLogger().i(TAG, "setProxyRegistered() called with: address = " + address + ", registered = " + z);
        SharedPreferencesUtil sharedPreferencesUtil = SharedPreferencesUtil.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append(address);
        sb.append(":bluetooth_registered");
        sharedPreferencesUtil.setBoolean(sb.toString(), z);
    }
}
