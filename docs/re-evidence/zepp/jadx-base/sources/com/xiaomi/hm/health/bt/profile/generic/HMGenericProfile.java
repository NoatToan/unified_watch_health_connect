package com.xiaomi.hm.health.bt.profile.generic;

import android.bluetooth.BluetoothGattCharacteristic;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericProfile;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public class HMGenericProfile extends HMBaseProfile {
    private static final int b = 10000;

    public HMGenericProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(HMGenericResponse hMGenericResponse, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "Generic notify:" + GattUtils.bytesToHexString(bArr));
        hMGenericResponse.add(bArr);
        if (hMGenericResponse.isEnd()) {
            countDownLatch.countDown();
        }
    }

    public static HMGenericResponse write(GattPeripheral gattPeripheral, BluetoothGattCharacteristic characteristic, HMGenericCommand command) {
        if (gattPeripheral == null || characteristic == null || command == null) {
            Debug.fi(HMBaseProfile.TAG, "Parameter error!!!");
            return null;
        }
        Debug.fi(HMBaseProfile.TAG, "Generic command:" + GattUtils.bytesToHexString(command.getBytes()));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final HMGenericResponse hMGenericResponse = new HMGenericResponse(command);
        if (!gattPeripheral.registerNotification(characteristic, new IGattCallback.INotifyCallback() { // from class: jw2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMGenericProfile.c(hMGenericResponse, countDownLatch, bArr);
            }
        })) {
            Debug.fi(HMBaseProfile.TAG, "registerNotification " + characteristic.getUuid() + " failed!!!");
            return null;
        }
        if (gattPeripheral.write(characteristic, command.getBytes())) {
            try {
                countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
            return hMGenericResponse;
        }
        Debug.fi(HMBaseProfile.TAG, "write " + characteristic.getUuid() + " failed!!!");
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        return true;
    }
}
