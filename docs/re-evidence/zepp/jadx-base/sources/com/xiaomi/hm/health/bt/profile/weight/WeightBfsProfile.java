package com.xiaomi.hm.health.bt.profile.weight;

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
import com.xiaomi.hm.health.bt.profile.base.MKTime;
import java.util.Calendar;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class WeightBfsProfile extends WeightBaseProfile {
    private static final short x0 = 5;
    private static final short y0 = 10;
    private static final short z0 = 11;
    private UUID w0;
    public static UUID UUID_SERVICE_BODY_COMPOSITION_SERVICE = GattUtils.uuid16("181B");
    public static UUID UUID_SERVICE_AMAZFIT_BODY_COMPOSITION_SERVICE = GattUtils.uuid16("FEE0");

    public WeightBfsProfile(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback callback) {
        super(context, device, callback);
        this.w0 = GattUtils.uuid16("2A9C");
    }

    public static WeightAdvData parseWeightData(byte[] value, boolean isMeasurement, boolean isHistory) {
        boolean z;
        int i;
        Debug.fi(BaseProfile.TAG, "value = " + GattUtils.bytesToHexString(value));
        if (value == null || value.length < 13) {
            Debug.i(BaseProfile.TAG, "measurement value is wrong!!!");
            return null;
        }
        float f = ((value[12] & 255) << 8) | (value[11] & 255);
        boolean z2 = (value[1] & 32) != 0;
        boolean z3 = (value[1] & 128) != 0;
        boolean z4 = (value[0] & 4) != 0;
        StringBuilder sb = new StringBuilder();
        sb.append("measure is overload = ");
        int i2 = (int) f;
        sb.append(i2 == 65520);
        Debug.i(BaseProfile.TAG, sb.toString());
        if (i2 == 65520) {
            i = 0;
            z = false;
        } else if (((value[1] & 64) >> 6) == 1) {
            i = 16;
            f /= 100.0f;
            z = z2;
        } else if ((value[0] & 1) == 1) {
            f /= 100.0f;
            z = z2;
            i = 1;
        } else {
            f /= 200.0f;
            z = z2;
            i = 0;
        }
        Calendar calendar = Calendar.getInstance(MKTime.INSTANCE.zoneKeyToTimeZone(0));
        calendar.clear();
        calendar.set(1, (value[2] & 255) | ((value[3] & 255) << 8));
        calendar.set(2, value[4] - 1);
        calendar.set(5, value[5]);
        calendar.set(11, value[6]);
        calendar.set(12, value[7]);
        calendar.set(13, value[8]);
        int i3 = ((value[10] & 255) << 8) | (value[9] & 255);
        boolean z5 = (value[1] & 2) != 0;
        WeightAdvData weightAdvData = new WeightAdvData(i, f, calendar.getTimeInMillis(), z, isMeasurement, isHistory, z3);
        weightAdvData.setPart(z4);
        weightAdvData.setImpedance(i3);
        weightAdvData.setImpedanceStable(z5);
        Debug.i(BaseProfile.TAG, "WeightAdvData:" + weightAdvData);
        return weightAdvData;
    }

    private int t0() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.n0;
        if (bluetoothGattCharacteristic == null) {
            return -1;
        }
        byte[] bArr = read(bluetoothGattCharacteristic);
        Debug.i(BaseProfile.TAG, "getMode:" + GattUtils.bytesToHexString(bArr));
        if (bArr == null || bArr.length < 2) {
            return -1;
        }
        return ((bArr[1] & 255) << 8) | (bArr[0] & 255);
    }

    private boolean u0() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.n0;
        if (bluetoothGattCharacteristic == null) {
            return true;
        }
        byte[] bArr = read(bluetoothGattCharacteristic);
        Debug.i(BaseProfile.TAG, "getMode:" + GattUtils.bytesToHexString(bArr));
        if (bArr == null || bArr.length < 2) {
            return true;
        }
        return (((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(byte[] bArr) {
        Debug.i(BaseProfile.TAG, "--------------------------");
        Debug.i(BaseProfile.TAG, "m_CharMeasurement:" + GattUtils.bytesToHexString(bArr));
        Debug.i(BaseProfile.TAG, "--------------------------");
        WeightAdvData weightData = parseWeightData(bArr, true, false);
        WeightBaseProfile.IMeasurementChangedCallback iMeasurementChangedCallback = this.o0;
        if (iMeasurementChangedCallback == null || weightData == null) {
            return;
        }
        iMeasurementChangedCallback.onChanged(weightData);
    }

    private boolean w0(final boolean isFactory) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.n0;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        int i = isFactory ? 10 : 11;
        return write(bluetoothGattCharacteristic, new byte[]{6, (byte) (i & 255), (byte) ((i >> 8) & 255), 0});
    }

    public boolean calibration() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.n0;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{6, 5, 0, 0});
    }

    public boolean enableLed(final boolean enable) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.n0;
        if (bluetoothGattCharacteristic != null) {
            byte[] bArr = new byte[2];
            bArr[0] = 4;
            bArr[1] = enable ? (byte) 2 : (byte) 3;
            if (write(bluetoothGattCharacteristic, bArr)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile, com.xiaomi.hm.health.bt.profile.weight.IWeightRecordSync
    public IWeightRecordParser getRecordParser() {
        return new WeightBfsRecordParser();
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile, com.xiaomi.hm.health.bt.profile.weight.IWeightRecordSync
    public UUID getSyncServiceUUID() {
        return UUID_SERVICE_BODY_COMPOSITION_SERVICE;
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile, com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean initCharacteristics() {
        BluetoothGattCharacteristic characteristic;
        super.initCharacteristics();
        BluetoothGattService service = getService(UUID_SERVICE_BODY_COMPOSITION_SERVICE);
        if (service == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(IBaseProfile.UUID_CHARACTERISTIC_DATE_TIME);
        this.m0 = characteristic2;
        if (characteristic2 == null || (characteristic = service.getCharacteristic(this.w0)) == null) {
            return false;
        }
        boolean zRegisterNotification = registerNotification(characteristic, new IGattCallback.INotifyCallback() { // from class: br8
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.v0(bArr);
            }
        });
        if (!u0()) {
            return zRegisterNotification;
        }
        boolean zW0 = w0(false);
        Debug.fi(BaseProfile.TAG, "set user mode:" + zW0);
        return zW0;
    }

    public boolean selfTest(final boolean enable) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.n0;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        byte[] bArr = new byte[2];
        bArr[0] = 4;
        bArr[1] = enable ? (byte) 1 : (byte) 4;
        return write(bluetoothGattCharacteristic, bArr);
    }
}
