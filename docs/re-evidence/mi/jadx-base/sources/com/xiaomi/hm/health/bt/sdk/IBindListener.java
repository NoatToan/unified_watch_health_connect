package com.xiaomi.hm.health.bt.sdk;

import android.bluetooth.BluetoothDevice;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bt/sdk/IBindListener;", "", "onBindFailure", "", "error", "Lcom/xiaomi/hm/health/bt/sdk/BindWeightError;", "onBindSuccess", "weightDeviceApi", "Lcom/xiaomi/hm/health/bt/sdk/IWeightDeviceApi;", "onBindWeightValue", "bluetoothDevice", "Landroid/bluetooth/BluetoothDevice;", "weightAdvData", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "isOnly", "", "btData_wearRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IBindListener {
    void onBindFailure(@NotNull BindWeightError error);

    void onBindSuccess(@NotNull IWeightDeviceApi weightDeviceApi);

    void onBindWeightValue(@NotNull BluetoothDevice bluetoothDevice, @NotNull WeightAdvData weightAdvData, boolean isOnly);
}
