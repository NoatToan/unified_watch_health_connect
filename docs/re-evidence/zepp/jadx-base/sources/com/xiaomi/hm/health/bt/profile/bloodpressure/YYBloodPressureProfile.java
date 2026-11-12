package com.xiaomi.hm.health.bt.profile.bloodpressure;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.GeneralDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.bloodpressure.YYBloodPressureProfile;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.yuyuedevice.BPData;
import com.xiaomi.hm.health.bt.profile.gdsp.yuyuedevice.IBPSyncCallback;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u00020\u0001:\u0001>B\u001f\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b<\u0010=J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0014J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0012\u001a\u00020\u000bH\u0014J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0006R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0018\u0010#\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0018\u0010%\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006?"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/bloodpressure/YYBloodPressureProfile;", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "Lcom/xiaomi/hm/health/bt/profile/base/GeneralDeviceInfo;", "info", "", "v0", "", "value", "u0", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "", "t0", "initCharacteristics", "getGeneralDeviceInfo", "Lcom/xiaomi/hm/health/bt/profile/auth/IHMAuthCallback;", "cb", "auth", "isThirdPartDevice", "Ljava/util/Calendar;", "getDateTime", "cal", "setDateTime", "cleanup", "data", "writeCharCp", "Landroid/bluetooth/BluetoothGattCharacteristic;", "W", "Landroid/bluetooth/BluetoothGattCharacteristic;", "m_CharDeviceModelNumber", "X", "m_CharDeviceManufacturerName", "Y", "mCharMeasurement", "Z", "mCharDateTime", "m0", "mCharECF", "", "n0", "J", "getBpSyncDataTime", "()J", "setBpSyncDataTime", "(J)V", "bpSyncDataTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/yuyuedevice/IBPSyncCallback;", "o0", "Lcom/xiaomi/hm/health/bt/profile/gdsp/yuyuedevice/IBPSyncCallback;", "getSyncDataCallback", "()Lcom/xiaomi/hm/health/bt/profile/gdsp/yuyuedevice/IBPSyncCallback;", "setSyncDataCallback", "(Lcom/xiaomi/hm/health/bt/profile/gdsp/yuyuedevice/IBPSyncCallback;)V", "syncDataCallback", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/bluetooth/BluetoothDevice;", "device", "Lcom/xiaomi/hm/health/bt/gatt/IGattCallback$IConnectionStateChangeCallback;", "connCB", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lcom/xiaomi/hm/health/bt/gatt/IGattCallback$IConnectionStateChangeCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class YYBloodPressureProfile extends BaseProfile {

    @NotNull
    private static final String p0 = "BloodPressureProfile";

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @Nullable
    private BluetoothGattCharacteristic m_CharDeviceModelNumber;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @Nullable
    private BluetoothGattCharacteristic m_CharDeviceManufacturerName;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @Nullable
    private BluetoothGattCharacteristic mCharMeasurement;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @Nullable
    private BluetoothGattCharacteristic mCharDateTime;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @Nullable
    private BluetoothGattCharacteristic mCharECF;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    private long bpSyncDataTime;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    @Nullable
    private IBPSyncCallback syncDataCallback;

    public YYBloodPressureProfile(@NotNull Context context, @NotNull BluetoothDevice bluetoothDevice, @NotNull IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback) {
        super(context, bluetoothDevice, iConnectionStateChangeCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(YYBloodPressureProfile yYBloodPressureProfile, byte[] bArr) {
        Debug.fi(p0, Intrinsics.stringPlus("Measurement: ", GattUtils.bytesToHexString(bArr)));
        if (yYBloodPressureProfile.getSyncDataCallback() == null) {
            return;
        }
        yYBloodPressureProfile.u0(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s0(YYBloodPressureProfile yYBloodPressureProfile, byte[] bArr) {
        Debug.fi(p0, Intrinsics.stringPlus("notify Time Data: ", GattUtils.bytesToHexString(bArr)));
        yYBloodPressureProfile.setDateTime(Calendar.getInstance());
    }

    private final boolean t0(DeviceInfo deviceInfo) {
        return ((deviceInfo == null ? null : deviceInfo.getDeviceID()) == null || deviceInfo.getFirmwareVersionStr() == null) ? false : true;
    }

    private final void u0(byte[] value) {
        IBPSyncCallback iBPSyncCallback;
        if (value != null && value.length >= 15) {
            int i = value[0] & 1;
            int i2 = value[1] & 255;
            int i3 = value[2] << 8;
            int i4 = value[3] & 255;
            int i5 = value[4] << 8;
            int i6 = value[5] & 255;
            int i7 = value[6] << 8;
            int i8 = (value[8] << 8) + (value[7] & 255);
            int i9 = value[9] - 1;
            byte b = value[10];
            byte b2 = value[11];
            byte b3 = value[12];
            byte b4 = value[13];
            int i10 = value[14] & 255;
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i8, i9, b, b2, b3, b4);
            StringBuilder sb = new StringBuilder();
            sb.append("BloodPressure timestamp ");
            sb.append(gregorianCalendar.getTime());
            sb.append(", systolic : ");
            int i11 = i2 + i3;
            sb.append(i11);
            sb.append(", diastolic : ");
            int i12 = i5 + i4;
            sb.append(i12);
            sb.append(", arterial : ");
            int i13 = i7 + i6;
            sb.append(i13);
            sb.append(",pluse : ");
            sb.append(i10 + 0);
            sb.append(',');
            Debug.fi(p0, sb.toString());
            BPData bPData = new BPData(gregorianCalendar, i10, i12, i11, i13, i == 1);
            if (gregorianCalendar.getTimeInMillis() <= this.bpSyncDataTime || (iBPSyncCallback = this.syncDataCallback) == null) {
                return;
            }
            iBPSyncCallback.onBPData(bPData);
        }
    }

    private final void v0(GeneralDeviceInfo info) {
        byte[] bArr;
        byte[] bArr2;
        if (isThirdPartDevice()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.m_CharDeviceManufacturerName;
            if (bluetoothGattCharacteristic != null && (bArr2 = read(bluetoothGattCharacteristic)) != null) {
                String str = new String(bArr2, Charset.forName("UTF-8"));
                info.manufacturerName = str;
                Debug.i(p0, Intrinsics.stringPlus("manufacturerName:", str));
            }
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.m_CharDeviceModelNumber;
            if (bluetoothGattCharacteristic2 == null || (bArr = read(bluetoothGattCharacteristic2)) == null) {
                return;
            }
            String str2 = new String(bArr, Charset.forName("UTF-8"));
            info.modelNumberString = str2;
            Debug.i(p0, Intrinsics.stringPlus("modelNumber:", str2));
        }
    }

    public final boolean auth(@Nullable IHMAuthCallback cb) {
        boolean zT0 = t0(getDeviceInfo());
        if (zT0) {
            if (cb != null) {
                cb.onAuthentication(new HMAuthState(0));
            }
        } else if (cb != null) {
            cb.onAuthentication(new HMAuthState(1));
        }
        return zT0;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public void cleanup() {
        if (this.mCharMeasurement != null) {
            Debug.fi(p0, "unregisterNotification mCharMeasurement");
            unregisterNotification(this.mCharMeasurement);
        }
        if (this.mCharECF == null && this.mCharDateTime != null) {
            Debug.fi(p0, "unregisterNotification mCharDateTime");
            unregisterNotification(this.mCharDateTime);
        }
        super.cleanup();
    }

    public final long getBpSyncDataTime() {
        return this.bpSyncDataTime;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    @Nullable
    public Calendar getDateTime() {
        byte[] bArr = read(this.mCharDateTime);
        if (!(bArr != null && bArr.length == 10)) {
            Debug.fi(p0, Intrinsics.stringPlus("get date time return because ret = ", bArr == null ? null : Integer.valueOf(bArr.length)));
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, (bArr[0] & 255) | ((bArr[1] & 255) << 8));
        gregorianCalendar.set(2, bArr[2] - 1);
        gregorianCalendar.set(5, bArr[3]);
        gregorianCalendar.set(11, bArr[4]);
        gregorianCalendar.set(12, bArr[5]);
        gregorianCalendar.set(13, bArr[6]);
        gregorianCalendar.set(7, bArr[7]);
        Debug.fi(p0, Intrinsics.stringPlus("getDate:", gregorianCalendar.getTime()));
        return gregorianCalendar;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    @Nullable
    public GeneralDeviceInfo getGeneralDeviceInfo() {
        if (!checkDeviceSoftwareVersionAndSystemIdAndSN()) {
            return null;
        }
        GeneralDeviceInfo generalDeviceInfo = new GeneralDeviceInfo();
        setSoftwareRevision(generalDeviceInfo);
        setSystemId(generalDeviceInfo);
        setSerialNumber(generalDeviceInfo);
        setPnpInfo(generalDeviceInfo);
        setHardwareRevision(generalDeviceInfo);
        v0(generalDeviceInfo);
        generalDeviceInfo.setDeviceFeature(new Feature());
        Debug.fi(p0, Intrinsics.stringPlus("general device info:", generalDeviceInfo));
        return generalDeviceInfo;
    }

    @Nullable
    public final IBPSyncCallback getSyncDataCallback() {
        return this.syncDataCallback;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean initCharacteristics() {
        super.initCharacteristics();
        BluetoothGattService service = getService(IBaseProfile.UUID_SERVICE_DEVICE_SERVICE);
        if (service == null) {
            Debug.fi(p0, "otherService null!!!");
            return false;
        }
        this.m_CharDeviceModelNumber = service.getCharacteristic(IBaseProfile.UUID_CHARACTERISTIC_DEVICE_MODEL_NUMBER);
        this.m_CharDeviceManufacturerName = service.getCharacteristic(IBaseProfile.UUID_CHARACTERISTIC_DEVICE_MANUFACTURER_NAME);
        BloodPressureConstant bloodPressureConstant = BloodPressureConstant.INSTANCE;
        BluetoothGattService service2 = getService(bloodPressureConstant.getUUID_SERVICE_BLOOD_PRESSURE());
        if (service2 == null) {
            Debug.fi(p0, "bpService null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service2.getCharacteristic(bloodPressureConstant.getUU_CHARA_BP_MEASURE());
        this.mCharMeasurement = characteristic;
        if (characteristic == null) {
            Debug.fi(p0, "CharMeasurement null!!!");
            return false;
        }
        if (!registerNotification(characteristic, new IGattCallback.INotifyCallback() { // from class: c19
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                YYBloodPressureProfile.r0(this.a, bArr);
            }
        })) {
            Debug.fi(p0, "register CharMeasurement failed!!!");
            return false;
        }
        BluetoothGattService service3 = getService(bloodPressureConstant.getUUID_SERVICE_BLOOD_PRESSURE_CURR_TIME());
        if (service3 != null) {
            this.mCharDateTime = service3.getCharacteristic(bloodPressureConstant.getUU_CHARA_DATE_TIME());
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.mCharDateTime;
        int properties = (bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.getProperties() : 0) & 8;
        if (this.mCharDateTime == null || properties <= 0) {
            Debug.fi(p0, "mCharDateTime is null and write property < 0!!!");
        }
        BluetoothGattCharacteristic characteristic2 = service2.getCharacteristic(bloodPressureConstant.getUU_CHARA_BP_RACP());
        this.mCharECF = characteristic2;
        if (characteristic2 != null) {
            return true;
        }
        Debug.fi(p0, "char ecf is null!!!");
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.mCharDateTime;
        if (bluetoothGattCharacteristic2 == null || registerNotification(bluetoothGattCharacteristic2, new IGattCallback.INotifyCallback() { // from class: b19
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                YYBloodPressureProfile.s0(this.a, bArr);
            }
        })) {
            return true;
        }
        Debug.fi(p0, "register CharDateTime failed!!!");
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public boolean isThirdPartDevice() {
        return true;
    }

    public final void setBpSyncDataTime(long j) {
        this.bpSyncDataTime = j;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public boolean setDateTime(@Nullable Calendar cal) {
        if (cal == null) {
            return false;
        }
        short s = (short) cal.get(1);
        byte b = (byte) (cal.get(2) + 1);
        byte b2 = (byte) cal.get(5);
        byte b3 = (byte) cal.get(11);
        byte b4 = (byte) cal.get(12);
        byte b5 = (byte) cal.get(13);
        byte[] bArr = new byte[2];
        GattUtils.writeLE(bArr, 0, s);
        byte b6 = (byte) cal.get(7);
        Debug.fi(p0, "set date, year:" + ((int) s) + ",month:" + ((int) b) + ",day:" + ((int) b2) + ",hour:" + ((int) b3) + ",min:" + ((int) b4) + ",sec:" + ((int) b5));
        byte[] bArr2 = {bArr[0], bArr[1], b, b2, b3, b4, b5, b6};
        if (this.mCharECF != null) {
            return write(this.mCharDateTime, ArraysKt___ArraysJvmKt.plus(bArr2, new byte[]{0, 0}));
        }
        write(this.mCharDateTime, ArraysKt___ArraysJvmKt.plus(bArr2, new byte[]{1, -128}));
        return true;
    }

    public final void setSyncDataCallback(@Nullable IBPSyncCallback iBPSyncCallback) {
        this.syncDataCallback = iBPSyncCallback;
    }

    public final boolean writeCharCp(@NotNull byte[] data) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.mCharECF;
        if (bluetoothGattCharacteristic != null) {
            return write(bluetoothGattCharacteristic, data);
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.mCharMeasurement;
        if (bluetoothGattCharacteristic2 != null) {
            return write(bluetoothGattCharacteristic2, data);
        }
        return false;
    }
}
