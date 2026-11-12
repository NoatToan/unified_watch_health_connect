package com.xiaomi.hm.health.bt.profile.alert;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
@SuppressLint({"NewApi"})
public class HMAlertProfile extends HMBaseProfile {
    public static final byte ALERT_FIND = 3;
    private static final byte e = 0;
    private static final byte f = 1;
    private static final byte g = 2;
    private static final byte h = 4;
    private static final byte i = -3;
    private static final byte j = 1;
    private static final byte k = 2;
    private static final byte l = -2;
    private static final byte m = -1;
    private UUID b;
    private UUID c;
    private BluetoothGattCharacteristic d;

    public HMAlertProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = GattUtils.uuid16("1802");
        this.c = GattUtils.uuid16("2A06");
        this.d = null;
    }

    private boolean b(byte mode) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.d;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{mode});
    }

    public boolean alert(short time, short offsetTime, byte num) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.d;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{-1, (byte) (time & 255), (byte) ((time >> 8) & 255), (byte) (offsetTime & 255), (byte) ((offsetTime >> 8) & 255), num});
    }

    public boolean alertFind() {
        return b((byte) 3);
    }

    public boolean alertHr() {
        return alert((short) 600, (short) 200, (byte) 2);
    }

    public boolean alertIncall() {
        return b((byte) 2);
    }

    public boolean alertLove() {
        return b((byte) -2);
    }

    public boolean alertMoreHr(int hr) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.d;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{-3, 2, (byte) (hr & 255), (byte) ((hr >> 8) & 255)});
    }

    public boolean alertMorePace(int pace) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.d;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{-3, 1, (byte) (pace & 255), (byte) ((pace >> 8) & 255)});
    }

    public boolean alertPace() {
        return b((byte) 4);
    }

    public boolean alertSms() {
        return b((byte) 1);
    }

    public boolean alertStop() {
        return b((byte) 0);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        BluetoothGattService service = getService(this.b);
        if (service == null) {
            Debug.fi(HMBaseProfile.TAG, this.b + " is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.c);
        this.d = characteristic;
        if (characteristic != null) {
            return true;
        }
        Debug.fi(HMBaseProfile.TAG, this.c + " is null!!!");
        return false;
    }
}
