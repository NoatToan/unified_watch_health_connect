package com.careforeyou.library.intface;

import android.bluetooth.BluetoothGattCharacteristic;
import com.careforeyou.library.bean.CsFatScale;
import defpackage.vk;
import defpackage.vu;

/* JADX INFO: loaded from: classes4.dex */
public interface OnWeightScalesListener {
    void bluetoothWriteChannelDone(BluetoothGattCharacteristic bluetoothGattCharacteristic);

    void broadcastChipseaData(vu vuVar);

    void matchUserMsg(vk vkVar);

    void specialFatScaleInfo(CsFatScale csFatScale);
}
