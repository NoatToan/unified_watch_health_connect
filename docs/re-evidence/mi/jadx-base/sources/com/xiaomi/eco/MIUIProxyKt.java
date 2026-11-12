package com.xiaomi.eco;

import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import com.xiaomi.EcoConnectPreference;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import defpackage.ni4;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0006\u0010\u0007\u001a\u00020\b\u001a\b\u0010\t\u001a\u00020\bH\u0002\u001a\u0006\u0010\n\u001a\u00020\b\u001a\u0006\u0010\u000b\u001a\u00020\b\u001a\b\u0010\f\u001a\u00020\bH\u0002\u001a\b\u0010\r\u001a\u00020\u0005H\u0002\u001a\b\u0010\u000e\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"TAG", "", "MIUI_PC_SERVICE_VERSION", "MIUI_PC_SERVICE_STATE", "SERVICE_OFF", "", "SERVICE_ON", "isAppCloudBLEOpen", "", "isSuitableModel", "isBleOpen", "hasBluetoothPermission", "isSystemProxyOpen", "getProcessUserId", "getBleProxyVersion", "eco-common-connect_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MIUIProxyKt {

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
            return Settings.Global.getInt(ApplicationExtKt.getApplication().getContentResolver(), "MiuiPeripheralConnectionServiceVersion", 0);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static final int getProcessUserId() {
        int iHashCode = Process.myUserHandle().hashCode();
        Logger.i(TAG, "getProcessUserId, userId: " + iHashCode);
        return iHashCode;
    }

    public static final boolean hasBluetoothPermission() {
        if (Build.VERSION.SDK_INT >= 31) {
            if (ni4.a(ApplicationExtKt.getApplication(), "android.permission.BLUETOOTH_CONNECT") != 0) {
                return false;
            }
        } else if (ni4.a(ApplicationExtKt.getApplication(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return false;
        }
        return true;
    }

    public static final boolean isAppCloudBLEOpen() {
        return EcoConnectPreference.INSTANCE.getOPEN_MIUI_CONNECTION_V5();
    }

    public static final boolean isBleOpen() {
        boolean zIsAppCloudBLEOpen = isAppCloudBLEOpen();
        boolean zIsSystemProxyOpen = isSystemProxyOpen();
        int processUserId = getProcessUserId();
        int bleProxyVersion = getBleProxyVersion();
        boolean zIsSuitableModel = isSuitableModel();
        Logger.i(TAG, "isBleOpen: cloudOpen = " + zIsAppCloudBLEOpen + ",proxyOpen = " + zIsSystemProxyOpen + ",bleProxyVersion = " + bleProxyVersion + ",processUserId = " + processUserId + ",suitableModel = " + zIsSuitableModel);
        return zIsAppCloudBLEOpen && zIsSystemProxyOpen && processUserId == 0 && bleProxyVersion == 2 && zIsSuitableModel;
    }

    private static final boolean isSuitableModel() {
        RomUtils romUtils = RomUtils.INSTANCE;
        Logger.i(TAG, "isSuitableModel: system version = " + romUtils.getRomInfo().getVersion() + ", model = " + Build.MODEL);
        return romUtils.isMiDev() || romUtils.isMiuiDev();
    }

    private static final boolean isSystemProxyOpen() {
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%d#", Arrays.copyOf(new Object[]{Integer.valueOf(getProcessUserId())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            int i = Settings.Global.getInt(ApplicationExtKt.getApplication().getContentResolver(), str + "MiuiPeripheralConnectionService");
            Logger.i(TAG, "isSystemSupport: state = " + i);
            return i == 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
