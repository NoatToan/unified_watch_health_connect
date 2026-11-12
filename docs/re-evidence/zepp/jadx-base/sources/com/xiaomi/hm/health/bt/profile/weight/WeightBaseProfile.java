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
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class WeightBaseProfile extends BaseProfile implements IWeightRecordSync {
    public static final byte p0 = 4;
    public static final byte q0 = 6;
    private static final short r0 = 4;
    private static final short s0 = 15;
    private static final short t0 = 16;
    private static final short u0 = 18;
    private static final UUID v0 = GattUtils.uuid128(10799);
    private UUID W;
    private UUID X;
    private UUID Y;
    private UUID Z;
    public BluetoothGattCharacteristic m0;
    public BluetoothGattCharacteristic n0;
    public IMeasurementChangedCallback o0;

    public interface IMeasurementChangedCallback {
        void onChanged(WeightAdvData data);
    }

    public WeightBaseProfile(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback callback) {
        super(context, device, callback);
        this.W = GattUtils.uuid128(5424);
        this.X = GattUtils.uuid128(5442);
        this.Y = GattUtils.uuid128(5443);
        this.Z = GattUtils.uuid16("2A9E");
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
    }

    private synchronized boolean q0(byte[] allDatas, byte cmd, short extendCmd) {
        boolean z;
        z = false;
        if (allDatas != null) {
            if (allDatas.length >= 5 && (allDatas[0] & 255) == 16 && (allDatas[1] & 255) == cmd && (allDatas[2] & 255) == (extendCmd & 255) && (allDatas[4] & 255) == 1) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(HMNotifyResponse hMNotifyResponse, CountDownLatch countDownLatch, IOFMeasurementCallback iOFMeasurementCallback, CountDownLatch countDownLatch2, boolean z, byte[] bArr) {
        Debug.fi(BaseProfile.TAG, "notify:" + GattUtils.bytesToHexString(bArr));
        if (bArr == null) {
            return;
        }
        if (bArr.length == 5) {
            hMNotifyResponse.from(bArr);
            countDownLatch.countDown();
            return;
        }
        if (bArr.length != 6 || iOFMeasurementCallback == null) {
            return;
        }
        countDownLatch2.countDown();
        int i = bArr[3] & 255;
        int i2 = ((bArr[4] & 255) | ((bArr[5] & 255) << 8)) * 100;
        if (i == 2) {
            unregisterNotification(this.n0);
        }
        if (!z) {
            iOFMeasurementCallback.onDataChanged(new OFMeasurement(i, i2));
        } else if (countDownLatch.getCount() <= 0) {
            iOFMeasurementCallback.onDataChanged(new OFMeasurement(i, i2));
        }
    }

    public void addMeasurementChangedCallback(IMeasurementChangedCallback measureCb) {
        this.o0 = measureCb;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public void clean() {
        super.clean();
        this.o0 = null;
    }

    public boolean enablePartMeasure(boolean z) {
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.n0;
        return (bluetoothGattCharacteristic == null || (hMNotifyResponseSendCommandWithResponse = sendCommandWithResponse(bluetoothGattCharacteristic, new byte[]{6, 16, 0, (byte) (!z ? 1 : 0)})) == null || !q0(hMNotifyResponseSendCommandWithResponse.getOriginResponseData(), (byte) 6, (short) 16)) ? false : true;
    }

    public boolean eraseHistoryRecord() {
        HMNotifyResponse hMNotifyResponseSendCommandWithResponse;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.n0;
        return (bluetoothGattCharacteristic == null || (hMNotifyResponseSendCommandWithResponse = sendCommandWithResponse(bluetoothGattCharacteristic, new byte[]{6, 18, 0, 0})) == null || !q0(hMNotifyResponseSendCommandWithResponse.getOriginResponseData(), (byte) 6, (short) 18)) ? false : true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public Calendar getDateTime() {
        Debug.trace();
        byte[] bArr = read(this.m0);
        if (bArr == null || bArr.length != 10) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, ((bArr[1] & 255) << 8) | (bArr[0] & 255));
        gregorianCalendar.set(2, bArr[2] - 1);
        gregorianCalendar.set(5, bArr[3]);
        gregorianCalendar.set(11, bArr[4]);
        gregorianCalendar.set(12, bArr[5]);
        gregorianCalendar.set(13, bArr[6]);
        gregorianCalendar.set(7, bArr[7]);
        return gregorianCalendar;
    }

    public int getIdLen() {
        return 4;
    }

    public IWeightRecordParser getRecordParser() {
        return new WeightRecordParser();
    }

    @NotNull
    public UUID getSyncCharacteristicUUID() {
        return v0;
    }

    public UUID getSyncServiceUUID() {
        return GattUtils.uuid16("181B");
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean initCharacteristics() {
        super.initCharacteristics();
        BluetoothGattService service = getService(this.W);
        if (service == null) {
            Debug.fi(BaseProfile.TAG, this.W + " is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.Y);
        this.m_CharBattery = characteristic;
        if (characteristic == null) {
            Debug.fi(BaseProfile.TAG, this.Y + " is null!!!");
        }
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(this.X);
        this.n0 = characteristic2;
        if (characteristic2 != null) {
            return true;
        }
        Debug.fi(BaseProfile.TAG, this.X + " is null!!!");
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public BatteryInfo parseBatteryInfo(byte[] value) {
        if (value != null && value.length == 2 && (value[0] & 255) == 1 && (value[1] & 255) == 1) {
            return new BatteryInfo(1);
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public boolean setDateTime(Calendar cal) {
        Debug.trace();
        short s = (short) cal.get(1);
        byte b = (byte) (cal.get(2) + 1);
        byte b2 = (byte) cal.get(5);
        byte b3 = (byte) cal.get(11);
        byte b4 = (byte) cal.get(12);
        byte b5 = (byte) cal.get(13);
        byte[] bArr = new byte[2];
        GattUtils.writeLE(bArr, 0, s);
        byte b6 = (byte) cal.get(7);
        Debug.fi(BaseProfile.TAG, "set date:" + cal.getTime().toString());
        Debug.fi(BaseProfile.TAG, "year:" + ((int) s) + ",month:" + ((int) b) + ",day:" + ((int) b2) + ",hour:" + ((int) b3) + ",min:" + ((int) b4) + ",sec:" + ((int) b5));
        return write(this.m0, new byte[]{bArr[0], bArr[1], b, b2, b3, b4, b5, b6, 0, 0});
    }

    public boolean setUnit(final byte unit) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.n0;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{6, 4, 0, unit});
    }

    public boolean startOneFootMeasure(final IOFMeasurementCallback callback, final boolean forceStart) {
        if (this.n0 == null) {
            return false;
        }
        byte[] bArr = {6, 15, 0, 0};
        final HMNotifyResponse hMNotifyResponse = new HMNotifyResponse();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final CountDownLatch countDownLatch2 = new CountDownLatch(1);
        if (!registerNotification(this.n0, new IGattCallback.INotifyCallback() { // from class: ar8
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr2) {
                this.a.r0(hMNotifyResponse, countDownLatch, callback, countDownLatch2, forceStart, bArr2);
            }
        })) {
            return false;
        }
        if (!forceStart) {
            try {
                if (countDownLatch2.await(100L, TimeUnit.MILLISECONDS)) {
                    return false;
                }
            } catch (Exception e) {
                Debug.fi(BaseProfile.TAG, "await exception:" + e.getMessage());
            }
        }
        if (!write(this.n0, bArr)) {
            unregisterNotification(this.n0);
            return false;
        }
        try {
            countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            Debug.fi(BaseProfile.TAG, "await exception:" + e2.getMessage());
        }
        if (hMNotifyResponse.isSuccess((byte) 6, (short) 15)) {
            return true;
        }
        unregisterNotification(this.n0);
        return false;
    }

    public boolean stopOneFootMeasure() {
        return write(this.n0, new byte[]{6, 17, 0, 0});
    }
}
