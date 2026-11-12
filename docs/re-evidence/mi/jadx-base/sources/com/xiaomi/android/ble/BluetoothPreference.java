package com.xiaomi.android.ble;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/android/ble/BluetoothPreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "TAG", "setBluetoothProxyRegistered", "", "mac", "registered", "", "isBluetoothProxyRegistered", "miot-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BluetoothPreference extends PreferenceSupport {

    @NotNull
    public static final BluetoothPreference INSTANCE = new BluetoothPreference();

    @NotNull
    private static final String TAG = "BluetoothPreference";

    private BluetoothPreference() {
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "bluetooth_preference";
    }

    public final boolean isBluetoothProxyRegistered(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        return ((Boolean) getValue(mac + ":bluetooth_registered", Boolean.FALSE)).booleanValue();
    }

    public final void setBluetoothProxyRegistered(@NotNull String mac, boolean registered) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        putValue(mac + ":bluetooth_registered", Boolean.valueOf(registered));
    }
}
