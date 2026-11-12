package com.xiaomi.hm.health.bt.profile.speech;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class HMSpeechProfile extends HMBaseProfile {
    public static final int VERSION_12 = 12;
    private static final UUID f = GattUtils.uuid128(18);
    private static final UUID g = GattUtils.uuid128(19);
    private BluetoothGattCharacteristic b;
    private BluetoothGattCharacteristic c;
    private ISpeechListener d;
    private int e;

    public HMSpeechProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = null;
        this.c = null;
        this.e = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(byte[] bArr) {
        ISpeechListener iSpeechListener;
        Debug.i(HMBaseProfile.TAG, "charSpeechCtl:" + GattUtils.bytesToHexString(bArr));
        if (bArr == null || bArr.length < 2) {
            return;
        }
        HMSpeechEvent hMSpeechEvent = null;
        int i = bArr[0] & 255;
        if (i == 1) {
            hMSpeechEvent = new HMSpeechEvent(i, bArr[1] & 255);
        } else if (i == 2) {
            hMSpeechEvent = new HMSpeechEvent(i, bArr[1] & 255, bArr[2] & 255);
        }
        if (hMSpeechEvent == null || (iSpeechListener = this.d) == null) {
            return;
        }
        iSpeechListener.onSpeechEvent(hMSpeechEvent);
    }

    public static boolean isSupport(GattPeripheral gattPeripheral) {
        BluetoothGattService service = gattPeripheral.getService(HMBaseProfile.UUID_SERVICE_MILI_SERVICE);
        return (service == null || service.getCharacteristic(f) == null || service.getCharacteristic(g) == null) ? false : true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        unregisterNotification(this.b);
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        UUID uuid = HMBaseProfile.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi(HMBaseProfile.TAG, uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = f;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.b = characteristic;
        if (characteristic == null) {
            Debug.fi(HMBaseProfile.TAG, uuid2 + " is null!!!");
            return false;
        }
        byte[] bArr = read(characteristic);
        if (bArr != null && bArr.length > 0) {
            this.e = bArr[0];
        }
        if (!registerNotification(this.b, new IGattCallback.INotifyCallback() { // from class: wh3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr2) {
                this.a.c(bArr2);
            }
        })) {
            Debug.fi(HMBaseProfile.TAG, "registerNotification " + uuid2 + " failed!!!");
            return false;
        }
        UUID uuid3 = g;
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(uuid3);
        this.c = characteristic2;
        if (characteristic2 != null) {
            return true;
        }
        Debug.fi(HMBaseProfile.TAG, uuid3 + " is null!!!");
        return false;
    }

    public boolean sendSpeechInfo(HMSpeechInfo info) {
        OpenContent openContent;
        byte appID;
        if (info == null) {
            return false;
        }
        if (this.e < 12 && info.getType() == SpeechType.OPEN && ((appID = (openContent = (OpenContent) info.getContent()).getAppID()) == 7 || appID == 15 || appID == 9)) {
            openContent.setParam(null);
        }
        return patchWrite(info.getBytes(), 5);
    }

    public void setListener(ISpeechListener listener) {
        this.d = listener;
    }
}
