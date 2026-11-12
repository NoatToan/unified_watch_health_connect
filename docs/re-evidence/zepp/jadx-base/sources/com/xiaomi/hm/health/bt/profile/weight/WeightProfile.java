package com.xiaomi.hm.health.bt.profile.weight;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"NewApi"})
public final class WeightProfile extends WeightBaseProfile {
    public static final UUID UUID_SERVICE_WEIGHT_SCALE_SERVICE = GattUtils.uuid16("181D");
    private static final UUID y0 = GattUtils.uuid16("2A9D");
    private final int w0;
    private final int x0;

    public WeightProfile(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback connCB) {
        super(context, device, connCB);
        this.w0 = 3;
        this.x0 = 259;
        Debug.trace();
    }

    private int t0() {
        byte[] bArr = read(this.n0);
        if (bArr == null || bArr.length < 2) {
            Debug.fi(BaseProfile.TAG, "getSandglassMode failed!!!");
            return -1;
        }
        Debug.fi(BaseProfile.TAG, "Sandglass mode : " + GattUtils.bytesToHexString(bArr));
        return (bArr[0] & 255) | ((bArr[1] & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(byte[] bArr) {
        WeightAdvData weightData;
        if (this.o0 == null || (weightData = ProfileUtils.parseWeightData(bArr, true, false)) == null) {
            return;
        }
        this.o0.onChanged(weightData);
    }

    private boolean v0() {
        return write(this.n0, new byte[]{3, 1, 0, 0, 0});
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile, com.xiaomi.hm.health.bt.profile.weight.IWeightRecordSync
    public IWeightRecordParser getRecordParser() {
        return new WeightRecordParser();
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile, com.xiaomi.hm.health.bt.profile.weight.IWeightRecordSync
    public UUID getSyncServiceUUID() {
        return UUID_SERVICE_WEIGHT_SCALE_SERVICE;
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile, com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean initCharacteristics() {
        super.initCharacteristics();
        UUID uuid = UUID_SERVICE_WEIGHT_SCALE_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi(BaseProfile.TAG, uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = y0;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        if (characteristic == null) {
            Debug.fi(BaseProfile.TAG, uuid2 + " is null!!!");
            return false;
        }
        UUID uuid3 = IBaseProfile.UUID_CHARACTERISTIC_DATE_TIME;
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(uuid3);
        this.m0 = characteristic2;
        if (characteristic2 == null) {
            Debug.fi(BaseProfile.TAG, uuid3 + " is null!!!");
            return false;
        }
        if (!registerNotification(characteristic, new IGattCallback.INotifyCallback() { // from class: ft8
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.u0(bArr);
            }
        })) {
            Debug.fi(BaseProfile.TAG, "registerNotification:" + uuid2 + " failed!!!");
            return false;
        }
        if (t0() != 3) {
            return true;
        }
        Debug.fi(BaseProfile.TAG, "set user mode:" + v0());
        return true;
    }
}
