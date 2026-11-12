package com.xiaomi.hm.health.bt.profile.running;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.GeneralDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.LEParams;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"NewApi"})
public class RunningProfile extends BaseProfile implements a {
    public static final String TYPE_CALIBRATE = "CALIBRATE";
    public static final String TYPE_SYNC_DATA = "SYNC_DATA";
    private final HashMap<String, IGattCallback.INotifyCallback> W;
    private String X;
    private BluetoothGattCharacteristic Y;
    private BluetoothGattCharacteristic Z;
    private BluetoothGattCharacteristic m0;
    private BluetoothGattCharacteristic n0;
    private BluetoothGattCharacteristic o0;
    private BluetoothGattCharacteristic p0;

    public RunningProfile(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback connCB) {
        super(context, device, connCB);
        this.W = new HashMap<>();
        this.X = "RunningProfile";
        this.Y = null;
        this.Z = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(byte[] bArr) {
        Debug.i(this.X, "m_CharActivityDataControl:" + GattUtils.bytesToHexString(bArr));
        synchronized (this.W) {
            boolean z = false;
            if (bArr.length == 1 && (bArr[0] == 0 || bArr[0] == 1)) {
                z = true;
            }
            this.W.get(z ? TYPE_CALIBRATE : TYPE_SYNC_DATA).notify(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(byte[] bArr, byte[] bArr2) {
        Debug.fi(this.X, "m_CharLEParams notify:" + GattUtils.bytesToHexString(bArr2));
        synchronized (this.o0) {
            bArr[0] = bArr2[0];
            bArr[1] = bArr2[1];
            this.o0.notify();
        }
    }

    public boolean enableCalibrate(boolean enable) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.Z;
        byte[] bArr = new byte[1];
        bArr[0] = enable ? (byte) 16 : (byte) 17;
        return write(bluetoothGattCharacteristic, bArr);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.huami.bluetooth.profile.channel.module.battery.BatteryApi
    public BatteryInfo getBatteryInfo() {
        return new BatteryInfo(getBatteryLevel());
    }

    public int getBatteryLevel() {
        byte[] bArr;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.n0;
        if (bluetoothGattCharacteristic == null || (bArr = read(bluetoothGattCharacteristic)) == null || bArr.length != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public Calendar getDateTime() {
        Debug.trace();
        byte[] bArr = read(this.Y);
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
        return gregorianCalendar;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public GeneralDeviceInfo getGeneralDeviceInfo() {
        GeneralDeviceInfo generalDeviceInfo = super.getGeneralDeviceInfo();
        if (generalDeviceInfo != null && generalDeviceInfo.isValid() && generalDeviceInfo.pnp.productId == 8 && generalDeviceInfo.firmwareRevision.equalsIgnoreCase("V4.0.0.1")) {
            generalDeviceInfo.firmwareRevision = "V4.0.0";
        }
        return generalDeviceInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r0 == null) goto L8;
     */
    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LEParams getLEParams() {
        Debug.trace();
        if (this.o0 == null) {
            BluetoothGattService service = getService(a.l0);
            if (service != null) {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(a.k0);
                this.o0 = characteristic;
            }
            return null;
        }
        byte[] bArr = read(this.o0);
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Debug.assertTrue(bArr.length == 8);
        return new LEParams(((bArr[0] & 255) | ((bArr[1] & 255) << 8)) & 65535, ((bArr[2] & 255) | ((bArr[3] & 255) << 8)) & 65535, ((bArr[4] & 255) | ((bArr[5] & 255) << 8)) & 65535, (((bArr[7] & 255) << 8) | (bArr[6] & 255)) & 65535, -1, -1);
    }

    public HMStatisticInfo getStatisticInfo() {
        byte[] bArr;
        HMStatisticInfo hMStatisticInfo = new HMStatisticInfo();
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.p0;
        if (bluetoothGattCharacteristic != null && (bArr = read(bluetoothGattCharacteristic)) != null && bArr.length == 4) {
            hMStatisticInfo.setRebootCount(((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16));
        }
        return hMStatisticInfo;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.xiaomi.hm.health.bt.gatt.GattPeripheral
    @SuppressLint({"NewApi"})
    public boolean initCharacteristics() {
        super.initCharacteristics();
        BluetoothGattService service = getService(a.e0);
        if (service == null) {
            Debug.fi(this.X, "UUID_SERVICE_MILI_SERVICE is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(IBaseProfile.UUID_CHARACTERISTIC_DATE_TIME);
        this.Y = characteristic;
        if (characteristic == null) {
            Debug.fi(this.X, "UUID_CHARACTERISTIC_DATE_TIME_OLD is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(a.f0);
        this.m_CharRealtimeSteps = characteristic2;
        if (characteristic2 == null) {
            Debug.fi(this.X, "UUID_CHARACTERISTIC_REALTIME_STEPS is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic3 = service.getCharacteristic(a.g0);
        this.Z = characteristic3;
        if (characteristic3 == null) {
            Debug.fi(this.X, "UUID_CHARACTERISTIC_ACTIVITY_DATA_CONTROL_POINT is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic4 = service.getCharacteristic(a.h0);
        this.m0 = characteristic4;
        if (characteristic4 == null) {
            Debug.fi(this.X, "UUID_CHARACTERISTIC_ACTIVITY_DATA is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic5 = service.getCharacteristic(a.j0);
        this.n0 = characteristic5;
        if (characteristic5 == null) {
            Debug.fi(this.X, "UUID_CHARACTERISTIC_BATTERY_INFO is null!!!");
        }
        BluetoothGattCharacteristic characteristic6 = service.getCharacteristic(a.i0);
        this.p0 = characteristic6;
        if (characteristic6 != null) {
            return true;
        }
        Debug.fi(this.X, "UUID_CHARACTERISTIC_TEST is null!!!");
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public RealtimeStep parseRealtimeStep(byte[] value) {
        Debug.fi(this.X, "realtime steps:" + GattUtils.bytesToHexString(value));
        RealtimeStep realtimeStep = new RealtimeStep();
        if (value == null) {
            Debug.fi(this.X, "bytes of realtime step is null!!");
            return null;
        }
        if (value.length == 4) {
            realtimeStep.setTotalStep((((value[3] & 255) << 24) | (value[0] & 255) | ((value[1] & 255) << 8) | ((value[2] & 255) << 16)) * 2);
        } else if (value.length != 9) {
            Debug.fi(this.X, "length of realtime step byte is wrong:" + value.length);
        } else if (value[0] == 1) {
            int i = ((value[1] & 255) | ((value[2] & 255) << 8) | ((value[3] & 255) << 16) | ((value[4] & 255) << 24)) * 2;
            int i2 = (((value[8] & 255) << 24) | (value[5] & 255) | ((value[6] & 255) << 8) | ((value[7] & 255) << 16)) * 2;
            realtimeStep.setTotalStep(i);
            realtimeStep.setFront(i2);
        } else {
            Debug.fi(this.X, "wrong type current!!!");
        }
        return realtimeStep;
    }

    public boolean registerDataControlNotification(String type, IGattCallback.INotifyCallback notify) {
        synchronized (this.W) {
            if (!this.W.containsKey(type)) {
                this.W.put(type, notify);
            }
            if (hasNotification(this.Z)) {
                return true;
            }
            return registerNotification(this.Z, new IGattCallback.INotifyCallback() { // from class: kg6
                @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
                public final void notify(byte[] bArr) {
                    this.a.r0(bArr);
                }
            });
        }
    }

    public boolean registerDataNotification(IGattCallback.INotifyCallback notify) {
        return registerNotification(this.m0, notify);
    }

    public boolean sendDataControlCommand(byte cmd) {
        return write(this.Z, new byte[]{cmd});
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
        Debug.fi(this.X, "set date:" + cal.getTime().toString());
        Debug.fi(this.X, "year:" + ((int) s) + ",month:" + ((int) b) + ",day:" + ((int) b2) + ",hour:" + ((int) b3) + ",min:" + ((int) b4) + ",sec:" + ((int) b5));
        return write(this.Y, new byte[]{bArr[0], bArr[1], b, b2, b3, b4, b5, b6, 0, 0});
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r0 == null) goto L8;
     */
    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean setLEParams(int connIntMin, int connIntMax, int latency, int timeout, int advInt) {
        Debug.trace();
        if (this.o0 == null) {
            BluetoothGattService service = getService(a.l0);
            if (service != null) {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(a.k0);
                this.o0 = characteristic;
            }
            return false;
        }
        final byte[] bArr = {-1, -1};
        if (!registerNotification(this.o0, new IGattCallback.INotifyCallback() { // from class: lg6
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr2) {
                this.a.s0(bArr, bArr2);
            }
        })) {
            return false;
        }
        boolean lEParamsInternal = setLEParamsInternal(connIntMin, connIntMax, latency, timeout, advInt);
        if (lEParamsInternal && bArr[0] == -1) {
            synchronized (this.o0) {
                try {
                    this.o0.wait(8000L);
                } catch (Exception unused) {
                }
            }
        }
        unregisterNotification(this.o0);
        int i = ((bArr[1] & 255) << 8) | (bArr[0] & 255);
        return lEParamsInternal && i >= connIntMin && i <= connIntMax;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean setLEParamsInternal(int connIntMin, int connIntMax, int latency, int timeout, int advInt) {
        return write(this.o0, new byte[]{(byte) (connIntMin & 255), (byte) ((connIntMin >> 8) & 255), (byte) (connIntMax & 255), (byte) ((connIntMax >> 8) & 255), (byte) (latency & 255), (byte) ((latency >> 8) & 255), (byte) (timeout & 255), (byte) ((timeout >> 8) & 255)});
    }

    public boolean unRegisterDataControlNotification(String type) {
        boolean z;
        synchronized (this.W) {
            this.W.remove(type);
            z = this.W.size() != 0 || unregisterNotification(this.Z);
        }
        return z;
    }

    public boolean unRegisterDataNotification() {
        return unregisterNotification(this.m0);
    }
}
