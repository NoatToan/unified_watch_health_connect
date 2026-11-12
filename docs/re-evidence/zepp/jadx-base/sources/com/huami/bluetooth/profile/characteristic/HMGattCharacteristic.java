package com.huami.bluetooth.profile.characteristic;

import android.bluetooth.BluetoothGattCharacteristic;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/characteristic/HMGattCharacteristic;", "", "", PointCategory.INIT, "deInit", "Landroid/bluetooth/BluetoothGattCharacteristic;", "getCharacteristic", "()Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface HMGattCharacteristic {
    boolean deInit();

    @Nullable
    BluetoothGattCharacteristic getCharacteristic();

    boolean init();
}
