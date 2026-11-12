package com.huami.hid.bluetooth;

import android.bluetooth.BluetoothDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/huami/hid/bluetooth/BluetoothCallback;", "", "", "bondNone", "bondBonding", "bondBonded", "Landroid/bluetooth/BluetoothDevice;", "device", "", "previousState", "newState", "stateConnectionChanged", "hid_release"}, k = 1, mv = {1, 5, 1})
public interface BluetoothCallback {
    void bondBonded();

    void bondBonding();

    void bondNone();

    void stateConnectionChanged(@NotNull BluetoothDevice device, int previousState, int newState);
}
