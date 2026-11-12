package com.xiaomi.wearable.wear;

import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import com.xiaomi.wearable.ProxyManagerKt;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import defpackage.e7r;
import defpackage.jpc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "", "supportLargerMtu", "miuiConnectionFirst", "Ljpc;", "createBleManager", "(Lcom/xiaomi/wearable/core/DeviceInfo;ZZ)Ljpc;", "", "TAG", "Ljava/lang/String;", "hasMIUIBleChannel", "Z", "getHasMIUIBleChannel", "()Z", "setHasMIUIBleChannel", "(Z)V", "miwear-core_release"}, k = 2, mv = {2, 0, 0})
public final class BleManagerFactoryKt {

    @NotNull
    private static final String TAG = "BleManagerFactory";
    private static boolean hasMIUIBleChannel;

    @NotNull
    public static final jpc createBleManager(@NotNull DeviceInfo deviceInfo, boolean z, boolean z2) {
        jpc jpcVarCreateBleManager;
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        if (z2 && ProxyManagerKt.hasBluetoothPermission() && !hasMIUIBleChannel) {
            hasMIUIBleChannel = true;
            jpcVarCreateBleManager = BluetoothManager.INSTANCE.get().createMIUIBleManager(z, false);
        } else {
            jpcVarCreateBleManager = BluetoothManager.INSTANCE.get().createBleManager(z, false);
        }
        CoreExtKt.getLogger().i(TAG, "createBleManager() called with: deviceInfo = " + deviceInfo + ", bleManager = " + jpcVarCreateBleManager + ", miuiConnectionFirst = " + z2);
        if (jpcVarCreateBleManager instanceof e7r) {
            if (ProxyManagerKt.isProxyRegister(deviceInfo.getAddress())) {
                BluetoothManager.INSTANCE.get().unregisterConnectProxy(deviceInfo.getAddress());
            }
        } else if (!ProxyManagerKt.isProxyRegister(deviceInfo.getAddress())) {
            ProxyManagerKt.setProxyRegistered(deviceInfo.getAddress(), true);
        }
        return jpcVarCreateBleManager;
    }

    public static final boolean getHasMIUIBleChannel() {
        return hasMIUIBleChannel;
    }

    public static final void setHasMIUIBleChannel(boolean z) {
        hasMIUIBleChannel = z;
    }
}
