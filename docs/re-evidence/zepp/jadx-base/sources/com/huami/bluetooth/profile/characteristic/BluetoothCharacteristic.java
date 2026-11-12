package com.huami.bluetooth.profile.characteristic;

import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0002H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "", "", PointCategory.INIT, "deInit", "Lcom/huami/bluetooth/profile/characteristic/DataCallback;", "callback", "registerNotification", "unregisterNotification", "", "data", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "sendCommandWithResponse", "", "timeout", "sendCommandNoResponse", "read", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface BluetoothCharacteristic {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Nullable
        public static byte[] read(@NotNull BluetoothCharacteristic bluetoothCharacteristic) {
            return bluetoothCharacteristic.read(5000);
        }

        @Nullable
        public static HMNotifyResponse sendCommandWithResponse(@NotNull BluetoothCharacteristic bluetoothCharacteristic, @NotNull byte[] bArr) {
            return bluetoothCharacteristic.sendCommandWithResponse(bArr, 5000);
        }
    }

    boolean deInit();

    boolean init();

    @Nullable
    byte[] read();

    @Nullable
    byte[] read(int timeout);

    boolean registerNotification(@NotNull DataCallback callback);

    boolean sendCommandNoResponse(@NotNull byte[] data);

    @Nullable
    HMNotifyResponse sendCommandWithResponse(@NotNull byte[] data);

    @Nullable
    HMNotifyResponse sendCommandWithResponse(@NotNull byte[] data, int timeout);

    boolean unregisterNotification();
}
