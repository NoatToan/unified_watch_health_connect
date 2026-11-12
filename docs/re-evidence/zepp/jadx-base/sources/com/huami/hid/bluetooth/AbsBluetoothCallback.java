package com.huami.hid.bluetooth;

import android.bluetooth.BluetoothDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/huami/hid/bluetooth/AbsBluetoothCallback;", "Lcom/huami/hid/bluetooth/BluetoothCallback;", "", "bondNone", "bondBonding", "bondBonded", "Landroid/bluetooth/BluetoothDevice;", "device", "", "previousState", "newState", "stateConnectionChanged", "<init>", "()V", "hid_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbsBluetoothCallback implements BluetoothCallback {
    @Override // com.huami.hid.bluetooth.BluetoothCallback
    public void bondBonded() {
    }

    @Override // com.huami.hid.bluetooth.BluetoothCallback
    public void bondBonding() {
    }

    @Override // com.huami.hid.bluetooth.BluetoothCallback
    public void bondNone() {
    }

    @Override // com.huami.hid.bluetooth.BluetoothCallback
    public void stateConnectionChanged(@NotNull BluetoothDevice device, int previousState, int newState) {
    }
}
