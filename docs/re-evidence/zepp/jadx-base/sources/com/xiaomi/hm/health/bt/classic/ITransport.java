package com.xiaomi.hm.health.bt.classic;

import android.bluetooth.BluetoothDevice;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public interface ITransport {
    BluetoothDevice getDevice();

    @Nullable
    byte[] read(Protocol protocol, int timeout);

    boolean registerNotification(Protocol protocol, IGattCallback.INotifyCallback callback);

    boolean sendCommandNoResponse(Protocol protocol, byte[] data);

    HMNotifyResponse sendCommandWithResponse(Protocol protocol, byte[] data, int timeout);

    boolean unregisterNotification(Protocol protocol);
}
