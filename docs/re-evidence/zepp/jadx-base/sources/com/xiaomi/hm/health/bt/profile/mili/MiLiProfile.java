package com.xiaomi.hm.health.bt.profile.mili;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.util.Pair;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.HMVibrateType;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.LEParams;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class MiLiProfile extends BaseProfile implements IMiLiProfile {
    private static final byte A0 = 5;
    private static final byte B0 = 6;
    private static final byte C0 = 7;
    private static final byte D0 = 8;
    private static final byte E0 = 9;
    private static final byte F0 = 10;
    private static final byte G0 = 11;
    private static final byte H0 = 12;
    private static final byte I0 = 14;
    private static final byte J0 = 15;
    private static final byte K0 = 20;
    private static final byte L0 = 17;
    private static final byte M0 = 18;
    private static final byte N0 = 19;
    private static final byte O0 = 1;
    private static final byte P0 = 2;
    private static final byte Q0 = 3;
    private static final byte R0 = 5;
    private static final String w0 = "2.0.0.20140514";
    private static final String x0 = "MiLiProfile";
    private static final byte y0 = 3;
    private static final byte z0 = 4;
    private BluetoothGattCharacteristic W;
    private BluetoothGattCharacteristic X;
    private BluetoothGattCharacteristic Y;
    private BluetoothGattCharacteristic Z;
    private BluetoothGattCharacteristic m0;
    public BluetoothGattCharacteristic mCharUserInfo;
    private BluetoothGattCharacteristic n0;
    private BluetoothGattCharacteristic o0;
    private BluetoothGattCharacteristic p0;
    private BluetoothGattCharacteristic q0;
    private BluetoothGattCharacteristic r0;
    private IVibrateNotifyListener s0;
    private Integer t0;
    private Integer u0;
    private Integer v0;

    public interface IVibrateNotifyListener {
        void onVibrate(HMVibrateType type);
    }

    static {
        Debug.info(MiLiProfile.class.getSimpleName() + ".VERSION: " + w0);
    }

    public MiLiProfile(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback connCb) {
        super(context, device, connCb);
        this.mCharUserInfo = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        Debug.trace();
    }

    private Pair<Calendar, Calendar> q0() {
        Debug.trace();
        byte[] bArr = read(this.o0);
        Debug.i(x0, "time value:" + GattUtils.bytesToHexString(bArr));
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Debug.assertTrue(bArr.length == 12);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar.set(1, bArr[0] + 2000);
        gregorianCalendar.set(2, bArr[1]);
        gregorianCalendar.set(5, bArr[2]);
        gregorianCalendar.set(11, bArr[3]);
        gregorianCalendar.set(12, bArr[4]);
        gregorianCalendar.set(13, bArr[5]);
        gregorianCalendar2.set(1, bArr[6] + 2000);
        gregorianCalendar2.set(2, bArr[7]);
        gregorianCalendar2.set(5, bArr[8]);
        gregorianCalendar2.set(11, bArr[9]);
        gregorianCalendar2.set(12, bArr[10]);
        gregorianCalendar2.set(13, bArr[11]);
        Debug.i(x0, "new:" + gregorianCalendar.getTime().toString() + ",old:" + gregorianCalendar2.getTime().toString());
        return new Pair<>(gregorianCalendar, gregorianCalendar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(byte[] bArr) {
        IVibrateNotifyListener iVibrateNotifyListener;
        Debug.assertTrue(bArr.length == 1);
        Debug.info("=================================================");
        Debug.info("========== NOTIFICATION STATUS CHANGED ==========");
        Debug.info("=================================================");
        if (s0(bArr[0]) || (iVibrateNotifyListener = this.s0) == null) {
            return;
        }
        iVibrateNotifyListener.onVibrate(HMVibrateType.from(bArr[0]));
    }

    private boolean s0(int status) {
        if (status != 1 && status != 2) {
            if (status != 5 && status != 6) {
                switch (status) {
                    case 8:
                        this.v0 = Integer.valueOf(status);
                        watingNotify(this.n0);
                        return true;
                    case 9:
                    case 10:
                        break;
                    case 11:
                    case 12:
                        break;
                    default:
                        return false;
                }
            }
            this.u0 = Integer.valueOf(status);
            watingNotify(this.mCharUserInfo);
            return true;
        }
        this.t0 = Integer.valueOf(status);
        watingNotify(this.m0);
        return true;
    }

    private boolean t0() {
        Debug.trace();
        return write(this.Y, new byte[]{17});
    }

    public boolean auth(UserInfo info, IHMAuthCallback cb) {
        this.u0 = -1;
        if (!setUserInfo(info)) {
            cb.onAuthentication(new HMAuthState(1, 4));
            return false;
        }
        if (this.u0.intValue() == -1) {
            waiting(this.mCharUserInfo, 10000);
        }
        if (this.u0.intValue() == -1) {
            cb.onAuthentication(new HMAuthState(1, 1));
            return false;
        }
        if (this.u0.intValue() != 6) {
            if (this.u0.intValue() == 5) {
                cb.onAuthentication(new HMAuthState(0));
                return true;
            }
            cb.onAuthentication(new HMAuthState(1, 2));
            return false;
        }
        cb.onAuthentication(new HMAuthState(2));
        this.u0 = -1;
        waiting(this.mCharUserInfo, 30000);
        if (this.u0.intValue() == -1) {
            cb.onAuthentication(new HMAuthState(1, 1));
            return false;
        }
        if (this.u0.intValue() == 9) {
            cb.onAuthentication(new HMAuthState(1, 3));
            return false;
        }
        if (this.u0.intValue() != 10) {
            cb.onAuthentication(new HMAuthState(1, 2));
            return false;
        }
        cb.onAuthentication(new HMAuthState(3));
        cb.onAuthentication(new HMAuthState(0));
        return true;
    }

    public boolean authenticate(UserInfo info) {
        Debug.trace();
        boolean userInfo = setUserInfo(info);
        Debug.assertTrue(userInfo);
        if (!userInfo) {
            return false;
        }
        boolean dateTime = setDateTime(Calendar.getInstance());
        Debug.assertTrue(dateTime);
        return dateTime;
    }

    public void cancelAuth() {
        this.u0 = 239;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.mCharUserInfo;
        if (bluetoothGattCharacteristic != null) {
            watingNotify(bluetoothGattCharacteristic);
        }
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public void cleanup() {
        Debug.trace();
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.X;
        if (bluetoothGattCharacteristic != null) {
            unregisterNotification(bluetoothGattCharacteristic);
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.m_CharRealtimeSteps;
        if (bluetoothGattCharacteristic2 != null) {
            unregisterNotification(bluetoothGattCharacteristic2);
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic3 = this.Z;
        if (bluetoothGattCharacteristic3 != null) {
            unregisterNotification(bluetoothGattCharacteristic3);
        }
        this.mProfileState = 0;
    }

    public boolean confirmActivityDataTransferComplete(Calendar timeStamp, int length) {
        Debug.trace();
        return write(this.Y, new byte[]{10, (byte) (timeStamp.get(1) - 2000), (byte) timeStamp.get(2), (byte) timeStamp.get(5), (byte) timeStamp.get(11), (byte) timeStamp.get(12), (byte) timeStamp.get(13), (byte) (length & 255), (byte) ((length >> 8) & 255)});
    }

    public boolean enableConnectedBroadcast(boolean z) {
        Debug.trace();
        return write(this.W, new byte[]{z ? (byte) 1 : (byte) 0});
    }

    public boolean factoryReset() {
        Debug.trace();
        return write(this.Y, new byte[]{9});
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.huami.bluetooth.profile.channel.module.battery.BatteryApi
    public BatteryInfo getBatteryInfo() {
        Debug.trace();
        byte[] bArr = read(this.m_CharBattery);
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Debug.assertTrue(bArr.length == 10);
        int i = bArr[0] & 255;
        if (i > 100) {
            i = 100;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, bArr[1] + 2000);
        gregorianCalendar.set(2, bArr[2]);
        gregorianCalendar.set(5, bArr[3]);
        gregorianCalendar.set(11, bArr[4]);
        gregorianCalendar.set(12, bArr[5]);
        gregorianCalendar.set(13, bArr[6]);
        return new BatteryInfo(i, gregorianCalendar, ((bArr[7] & 255) | ((bArr[8] & 255) << 8)) & 65535, bArr[9]);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public Calendar getDateTime() {
        Pair<Calendar, Calendar> pairQ0 = q0();
        if (pairQ0 != null) {
            return (Calendar) pairQ0.first;
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public DeviceInfo getDeviceInfo() {
        Debug.trace();
        return getSpecialDeviceInfo();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public LEParams getLEParams() {
        Debug.trace();
        byte[] bArr = read(this.n0);
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Debug.assertTrue(bArr.length == 12);
        return new LEParams(((bArr[0] & 255) | ((bArr[1] & 255) << 8)) & 65535, ((bArr[2] & 255) | ((bArr[3] & 255) << 8)) & 65535, ((bArr[4] & 255) | ((bArr[5] & 255) << 8)) & 65535, ((bArr[6] & 255) | ((bArr[7] & 255) << 8)) & 65535, ((bArr[8] & 255) | ((bArr[9] & 255) << 8)) & 65535, (((bArr[11] & 255) << 8) | (bArr[10] & 255)) & 65535);
    }

    public HMStatisticInfo getStatisticInfo() {
        HMStatisticInfo hMStatisticInfo = new HMStatisticInfo();
        byte[] bArr = read(this.q0);
        if (bArr != null && bArr.length == 4) {
            hMStatisticInfo.setRebootCount(((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16));
        }
        return hMStatisticInfo;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.xiaomi.hm.health.bt.gatt.GattPeripheral
    @SuppressLint({"NewApi"})
    public boolean initCharacteristics() {
        super.initCharacteristics();
        UUID uuid = IBaseProfile.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi(x0, uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = IMiLiProfile.UUID_CHARACTERISTIC_DEVICE_NAME;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.W = characteristic;
        if (characteristic == null) {
            Debug.fi(x0, uuid2 + " is null!!!");
            return false;
        }
        UUID uuid3 = IMiLiProfile.UUID_CHARACTERISTIC_NOTIFICATION;
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(uuid3);
        this.X = characteristic2;
        if (characteristic2 == null) {
            Debug.fi(x0, uuid3 + " is null!!!");
            return false;
        }
        UUID uuid4 = IMiLiProfile.UUID_CHARACTERISTIC_USER_INFO;
        BluetoothGattCharacteristic characteristic3 = service.getCharacteristic(uuid4);
        this.mCharUserInfo = characteristic3;
        if (characteristic3 == null) {
            Debug.fi(x0, uuid4 + " is null!!!");
            return false;
        }
        UUID uuid5 = IMiLiProfile.UUID_CHARACTERISTIC_CONTROL_POINT;
        BluetoothGattCharacteristic characteristic4 = service.getCharacteristic(uuid5);
        this.Y = characteristic4;
        if (characteristic4 == null) {
            Debug.fi(x0, uuid5 + " is null!!!");
            return false;
        }
        UUID uuid6 = IMiLiProfile.UUID_CHARACTERISTIC_REALTIME_STEPS;
        BluetoothGattCharacteristic characteristic5 = service.getCharacteristic(uuid6);
        this.m_CharRealtimeSteps = characteristic5;
        if (characteristic5 == null) {
            Debug.fi(x0, uuid6 + " is null!!!");
            return false;
        }
        UUID uuid7 = IMiLiProfile.UUID_CHARACTERISTIC_ACTIVITY_DATA;
        BluetoothGattCharacteristic characteristic6 = service.getCharacteristic(uuid7);
        this.Z = characteristic6;
        if (characteristic6 == null) {
            Debug.fi(x0, uuid7 + " is null!!!");
            return false;
        }
        UUID uuid8 = IMiLiProfile.UUID_CHARACTERISTIC_FIRMWARE_DATA;
        BluetoothGattCharacteristic characteristic7 = service.getCharacteristic(uuid8);
        this.m0 = characteristic7;
        if (characteristic7 == null) {
            Debug.fi(x0, uuid8 + " is null!!!");
            return false;
        }
        UUID uuid9 = IMiLiProfile.UUID_CHARACTERISTIC_LE_PARAMS;
        BluetoothGattCharacteristic characteristic8 = service.getCharacteristic(uuid9);
        this.n0 = characteristic8;
        if (characteristic8 == null) {
            Debug.fi(x0, uuid9 + " is null!!!");
            return false;
        }
        UUID uuid10 = IMiLiProfile.UUID_CHARACTERISTIC_DATE_TIME_OLD;
        BluetoothGattCharacteristic characteristic9 = service.getCharacteristic(uuid10);
        this.o0 = characteristic9;
        if (characteristic9 == null) {
            Debug.fi(x0, uuid10 + " is null!!!");
            return false;
        }
        UUID uuid11 = IMiLiProfile.UUID_CHARACTERISTIC_BATTERY;
        BluetoothGattCharacteristic characteristic10 = service.getCharacteristic(uuid11);
        this.m_CharBattery = characteristic10;
        if (characteristic10 == null) {
            Debug.fi(x0, uuid11 + " is null!!!");
            return false;
        }
        UUID uuid12 = IMiLiProfile.UUID_CHARACTERISTIC_TEST;
        BluetoothGattCharacteristic characteristic11 = service.getCharacteristic(uuid12);
        this.q0 = characteristic11;
        if (characteristic11 == null) {
            Debug.fi(x0, uuid12 + " is null!!!");
            return false;
        }
        if (!registerNotification(this.X, new IGattCallback.INotifyCallback() { // from class: u45
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.r0(bArr);
            }
        })) {
            Debug.fi(x0, "registerNotification:" + uuid3 + " failed!!!");
            return false;
        }
        if (registerNotification(this.Z, null)) {
            BluetoothGattCharacteristic characteristic12 = service.getCharacteristic(IMiLiProfile.UUID_CHARACTERISTIC_PAIR);
            this.r0 = characteristic12;
            if (characteristic12 != null) {
                return true;
            }
            Debug.fi(x0, "mCharPair is null!!!");
            return true;
        }
        Debug.fi(x0, "registerNotification:" + uuid7 + " failed!!!");
        return false;
    }

    public boolean pair() {
        Debug.trace();
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.r0;
        return bluetoothGattCharacteristic != null && write(bluetoothGattCharacteristic, new byte[]{2});
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public BatteryInfo parseBatteryInfo(byte[] value) {
        Debug.assertTrue(value.length == 10);
        byte b = value[9];
        int i = value[0] & 255;
        if (b == 0) {
            Debug.warn(">>> UNEXPECTED <<<");
        } else if (b == 1) {
            Debug.debug("Battery low");
        } else if (b == 2) {
            Debug.debug("Battery charging");
        } else if (b == 3) {
            Debug.debug("Battery full (charging)");
        } else if (b != 4) {
            Debug.warn(">>> UNEXPECTED <<<");
        } else {
            Debug.debug("Battery charger off");
        }
        BatteryInfo batteryInfo = new BatteryInfo();
        batteryInfo.setStatus(b);
        batteryInfo.setLevel(i);
        return batteryInfo;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public RealtimeStep parseRealtimeStep(byte[] ret) {
        int i;
        int i2;
        if (ret == null) {
            Debug.fi(x0, "getRealtimeSteps return null!!!");
            return null;
        }
        int length = ret.length;
        if (length == 2 || length == 3) {
            i = ret[0] & 255;
            byte b = ret[1];
            i2 = (b & 255) << 8;
        } else {
            if (length != 4) {
                Debug.fi(x0, "getRealtimeSteps data length<" + length + "> error!!!");
                return null;
            }
            i = (ret[0] & 255) | ((ret[1] & 255) << 8) | ((ret[2] & 255) << 16);
            i2 = (ret[3] & 255) << 24;
        }
        return new RealtimeStep(i2 | i, -1);
    }

    public boolean reboot() {
        Debug.trace();
        return write(this.Y, new byte[]{12});
    }

    public void registerDataCallback(IGattCallback.INotifyCallback nc) {
        registerCallback(this.Z, nc);
    }

    public boolean sendFetchDataCmd() {
        return write(this.Y, new byte[]{6});
    }

    public boolean sendFetchDataCmdFrom(Calendar calendar) {
        return write(this.Y, new byte[]{6, (byte) (calendar.get(1) - 2000), (byte) calendar.get(2), (byte) calendar.get(5), (byte) calendar.get(11), (byte) calendar.get(12), (byte) calendar.get(13)});
    }

    public boolean sendFirmwareData(byte[] data, IHMFirmwareUpgradeCallback cb) {
        Debug.trace();
        int length = data.length;
        int i = length / 20;
        Debug.debug("totalPackets = " + i);
        this.t0 = -1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte[] bArr = new byte[20];
            System.arraycopy(data, i4 * 20, bArr, 0, 20);
            boolean zWrite = write(this.m0, bArr);
            Debug.assertTrue(zWrite);
            if (!zWrite) {
                return false;
            }
            i2 += 20;
            if (cb != null) {
                cb.onFwProgress(new Progress(length, i2));
            }
            i3 += 20;
            Debug.debug("transferedPackets = " + i3);
            if (i3 >= 1000) {
                sync();
                i3 = 0;
            }
        }
        int i5 = length % 20;
        if (i5 == 0) {
            sync();
            Debug.debug("transferFirmwareData: complete");
            return true;
        }
        byte[] bArr2 = new byte[i5];
        System.arraycopy(data, i * 20, bArr2, 0, i5);
        boolean zWrite2 = write(this.m0, bArr2);
        Debug.assertTrue(zWrite2);
        if (!zWrite2) {
            return false;
        }
        int i6 = i2 + i5;
        if (cb != null) {
            cb.onFwProgress(new Progress(length, i6));
        }
        Debug.debug("transferedPackets = " + (i3 + i5));
        sync();
        Debug.debug("transferFirmwareData: complete");
        if (this.t0.intValue() == -1) {
            waiting(this.m0, 20000);
        }
        return this.t0.intValue() == 2;
    }

    public boolean sendFirmwareInfo(int oldVer, int newVer, int len, int crc) {
        Debug.trace();
        this.t0 = -1;
        if (!write(this.Y, new byte[]{7, (byte) oldVer, (byte) (oldVer >> 8), (byte) (oldVer >> 16), (byte) (oldVer >> 24), (byte) newVer, (byte) (newVer >> 8), (byte) (newVer >> 16), (byte) (newVer >> 24), (byte) len, (byte) (len >> 8), (byte) crc, (byte) (crc >> 8)})) {
            return false;
        }
        if (this.t0.intValue() == -1) {
            waiting(this.Y, 5000);
        }
        return this.t0.intValue() == 12;
    }

    @Deprecated
    public boolean sendNotification(byte type) {
        Debug.trace();
        return write(this.Y, new byte[]{8, type});
    }

    public boolean setColorTheme(byte r, byte g, byte b, byte flag) {
        return write(this.Y, new byte[]{14, r, g, b, flag});
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public boolean setDateTime(Calendar cal) {
        Debug.trace();
        return write(this.o0, new byte[]{(byte) (cal.get(1) - 2000), (byte) cal.get(2), (byte) cal.get(5), (byte) cal.get(11), (byte) cal.get(12), (byte) cal.get(13), -1, -1, -1, -1, -1, -1});
    }

    public boolean setGoal(byte type, int target) {
        Debug.trace();
        return write(this.Y, new byte[]{5, type, (byte) (target & 255), (byte) ((target >> 8) & 255)});
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean setLEParams(int connIntMin, int connIntMax, int latency, int timeout, int advInt) {
        Debug.trace();
        this.v0 = -1;
        if (!setLEParamsInternal(connIntMin, connIntMax, latency, timeout, advInt)) {
            return false;
        }
        if (this.v0.intValue() == -1) {
            waiting(this.n0, 8000);
        }
        return this.v0.intValue() == 8;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean setLEParamsInternal(int connIntMin, int connIntMax, int latency, int timeout, int advInt) {
        return write(this.n0, new byte[]{(byte) (connIntMin & 255), (byte) ((connIntMin >> 8) & 255), (byte) (connIntMax & 255), (byte) ((connIntMax >> 8) & 255), (byte) (latency & 255), (byte) ((latency >> 8) & 255), (byte) (timeout & 255), (byte) ((timeout >> 8) & 255), 0, 0, (byte) (advInt & 255), (byte) ((advInt >> 8) & 255)});
    }

    public boolean setTimer(byte index, byte state, Calendar time, byte duration, byte dow) {
        Debug.trace();
        return write(this.Y, new byte[]{4, index, state, (byte) (time.get(1) - 2000), (byte) time.get(2), (byte) time.get(5), (byte) time.get(11), (byte) time.get(12), (byte) time.get(13), duration, dow});
    }

    public boolean setUserInfo(UserInfo info) {
        Debug.trace();
        byte[] bArr = new byte[20];
        int i = info.uid;
        bArr[0] = (byte) (i & 255);
        bArr[1] = (byte) ((i >> 8) & 255);
        bArr[2] = (byte) ((i >> 16) & 255);
        bArr[3] = (byte) ((i >> 24) & 255);
        bArr[4] = info.gender;
        bArr[5] = info.age;
        bArr[6] = info.height;
        bArr[7] = info.weight;
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            Debug.fi(x0, "getDeviceInfo return null in setUserInfo function!!!");
            return false;
        }
        Debug.fi(x0, "device info:" + deviceInfo);
        if (deviceInfo.isMiLi1A() || deviceInfo.isMiLi1S() || deviceInfo.getFirmwareVersion() >= 16779599) {
            bArr[8] = info.type;
        } else {
            bArr[8] = 0;
        }
        bArr[9] = (byte) (deviceInfo.getFeature() & 255);
        bArr[10] = (byte) (deviceInfo.getAppearance() & 255);
        byte[] bArr2 = info.alias;
        System.arraycopy(bArr2, 0, bArr, 11, bArr2.length <= 9 ? bArr2.length : 9);
        byte[] bArr3 = new byte[19];
        System.arraycopy(bArr, 0, bArr3, 0, 19);
        int iCrc8 = GattUtils.crc8(bArr3);
        String address = getDevice().getAddress();
        bArr[19] = (byte) (iCrc8 ^ Integer.decode("0x" + address.substring(address.length() - 2)).intValue());
        return write(this.mCharUserInfo, bArr);
    }

    public void setVibrateNotifyListener(IVibrateNotifyListener listener) {
        this.s0 = listener;
    }

    public boolean setWearLocation(byte location) {
        return write(this.Y, new byte[]{15, location});
    }

    public boolean stopGetActivities() {
        return t0();
    }

    @Deprecated
    public boolean stopMotorVibrate() {
        Debug.trace();
        return write(this.Y, new byte[]{19});
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean sync() {
        Debug.trace();
        return write(this.Y, new byte[]{11});
    }

    public void unRegisterDataCallback() {
        unRegisterCallback(this.Z);
    }

    public boolean wirteMD5(byte[] md5) {
        if (md5 == null || md5.length != 16) {
            return false;
        }
        byte[] bArr = new byte[17];
        bArr[0] = 4;
        System.arraycopy(md5, 0, bArr, 1, 16);
        return write(this.q0, bArr);
    }

    public boolean writeBaseSteps(int step) {
        byte[] bArr = {(byte) (step & 255), (byte) ((step >> 8) & 255), (byte) ((step >> 16) & 255), (byte) ((step >> 24) & 255)};
        return write(this.Y, new byte[]{20, bArr[0], bArr[1], bArr[2], bArr[3]});
    }

    public boolean sendFirmwareInfo(int oldVer, int newVer, int len, int crc, int flag) {
        Debug.trace();
        this.t0 = -1;
        if (!write(this.Y, new byte[]{7, (byte) oldVer, (byte) (oldVer >> 8), (byte) (oldVer >> 16), (byte) (oldVer >> 24), (byte) newVer, (byte) (newVer >> 8), (byte) (newVer >> 16), (byte) (newVer >> 24), (byte) len, (byte) (len >> 8), (byte) crc, (byte) (crc >> 8), (byte) flag})) {
            return false;
        }
        if (this.t0.intValue() == -1) {
            waiting(this.m0, 5000);
        }
        return this.t0.intValue() == 12;
    }
}
