package com.xiaomi.eco;

import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import defpackage.jpc;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "supportLargerMtu", "clearCacheWhenDisconnected", "miuiConnectionFirst", "Ljpc;", "createBleManager", "(ZZZ)Ljpc;", "eco-common-connect_release"}, k = 2, mv = {2, 0, 0})
public final class BleManagerFactoryKt {
    @NotNull
    public static final jpc createBleManager(boolean z, boolean z2, boolean z3) {
        return (MIUIProxyKt.isBleOpen() && MIUIProxyKt.hasBluetoothPermission() && z3) ? BluetoothManager.INSTANCE.get().createMIUIBleManager(z, z2) : BluetoothManager.INSTANCE.get().createBleManager(z, z2);
    }
}
