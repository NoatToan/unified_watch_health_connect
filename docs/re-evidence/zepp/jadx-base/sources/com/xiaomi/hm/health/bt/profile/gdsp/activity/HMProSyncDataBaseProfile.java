package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.MKTime;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPCommand;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPVersion;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GdspFactory;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public class HMProSyncDataBaseProfile extends HMBaseProfile {
    public static final byte CMD_DATA_SIZE = 1;
    public static final byte CMD_START_TRANSFER = 2;
    public static final byte DATA_HIGH_OR_LOW_HR_NOTIFICATION = 64;
    public static final byte DATA_LOW_OSA_NOTIFICATION = 65;
    public static final byte DATA_SPO2_ODI = 40;
    public static final byte DATA_SPO2_OSA = 38;
    public static final byte DATA_SPO2_OSA_EVENT = 39;
    public static final byte DATA_SPO2_OSA_EVENT_YORK = 43;
    public static final byte DATA_SPO2_POINT = 37;
    public static final byte DATA_STAND_HOUR = 41;
    public static final byte DATA_STATISTIC_V2 = 44;
    public static final byte DATA_TYPE_ACTIVITY_TODAY = 63;
    public static final byte DATA_TYPE_AF = 17;
    public static final byte DATA_TYPE_AF_PPG = 11;
    public static final byte DATA_TYPE_AF_TIME = 10;
    public static final byte DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC = 53;
    public static final byte DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG = 52;
    public static final byte DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG = 54;
    public static final byte DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT = 55;
    public static final byte DATA_TYPE_BODY_TEMPERATURE_80S = 48;
    public static final byte DATA_TYPE_BODY_TEMPERATURE_ALL_DAY = 46;
    public static final byte DATA_TYPE_BODY_TEMPERATURE_SINGLE = 47;
    public static final byte DATA_TYPE_COACHING = 14;
    public static final byte DATA_TYPE_ECG = 3;
    public static final byte DATA_TYPE_ECG_SUMMARY = 42;
    public static final byte DATA_TYPE_FIRSTBEAT_DETAIL = 35;
    public static final byte DATA_TYPE_FIRSTBEAT_SIMPLE = 36;
    public static final byte DATA_TYPE_GPS_DETAIL = 6;
    public static final byte DATA_TYPE_GPS_SUMMARY = 5;
    public static final byte DATA_TYPE_HEARTRATE = 2;
    public static final byte DATA_TYPE_HEIGHT_LOW_HR = 29;
    public static final byte DATA_TYPE_HIGH_LOW_HR = 50;
    public static final byte DATA_TYPE_LOG = 7;
    public static final byte DATA_TYPE_PAI = 13;
    public static final byte DATA_TYPE_PPG = 16;
    public static final byte DATA_TYPE_PPG_RR = 8;
    public static final byte DATA_TYPE_PRESSURE_ALL_DAY = 19;
    public static final byte DATA_TYPE_PRESSURE_SINGLE = 18;
    public static final byte DATA_TYPE_RESTING_HEART_RATE = 58;
    public static final byte DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT = 62;
    public static final byte DATA_TYPE_SLEEP_BREATH_RATE_DATA = 56;
    public static final byte DATA_TYPE_SLEEP_BREATH_RATE_EVENT = 57;
    public static final byte DATA_TYPE_TEMPERATURE = 4;
    public static final byte DATA_TYPE_WRISTLET = 1;
    public static final byte DATE_TYPE_AF_ACC = 30;
    public static final int GDSP_BUSY = 7;
    public static final int GDSP_INVALID_LEN = 3;
    public static final int GDSP_INVALID_STATE = 5;
    public static final int GDSP_MUSIC_ALIVE = 48;
    public static final int GDSP_OPERATION_FAILED = 4;
    public static final int GDSP_SPEECH_ALIVE = 49;
    public static final int GDSP_STATE_UNKNOWN = 0;
    public static final int GDSP_SUCCESS = 1;
    public static final int GDSP_UNEXPECTED_INDEX = 6;
    public static final int GDSP_UNKNOW_CMD = 2;
    private static final byte k = 3;
    private static final int l = 20;
    private static final int m = 5;
    private final UUID b;
    private final UUID c;
    private BluetoothGattCharacteristic d;
    private BluetoothGattCharacteristic e;
    private IGattCallback.INotifyCallback f;
    private IGattCallback.INotifyCallback g;
    private Object h;
    private Object i;
    private int j;

    public static class a {
        public short a;
        public byte b;
        public byte c;
        public byte d;
        public byte e;
        public byte f;
        public byte g;

        public a(short year, byte month, byte day, byte hour, byte minute, byte second, byte tz) {
            this.a = year;
            this.b = month;
            this.c = day;
            this.d = hour;
            this.e = minute;
            this.f = second;
            this.g = tz;
        }

        @NonNull
        public String toString() {
            return "MkTime{year=" + ((int) this.a) + ", month=" + ((int) this.b) + ", day=" + ((int) this.c) + ", hour=" + ((int) this.d) + ", minute=" + ((int) this.e) + ", sec=" + ((int) this.f) + ", tz=" + ((int) this.g) + '}';
        }
    }

    public HMProSyncDataBaseProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = GattUtils.uuid128(4);
        this.c = GattUtils.uuid128(5);
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = new Object();
        this.i = new Object();
        this.j = -1;
    }

    private void g(int totalBytesSize, int sliceByteSize) throws Exception {
        if ((totalBytesSize - 1) % sliceByteSize != 0) {
            throw new Exception("活动数据长度不符合协议定义，无法解析，将直接丢弃");
        }
    }

    private DataHeader h(byte[] cmd) {
        Debug.i(HMBaseProfile.TAG, "cmd:" + GattUtils.bytesToHexString(cmd));
        HMNotifyResponse hMNotifyResponseSendControlCommandResponse = sendControlCommandResponse(cmd, 20);
        if (hMNotifyResponseSendControlCommandResponse == null) {
            return null;
        }
        if (!hMNotifyResponseSendControlCommandResponse.isSuccess((byte) 1)) {
            return new DataHeader(hMNotifyResponseSendControlCommandResponse.getCode());
        }
        DataHeader dataHeader = parseDataHeader(hMNotifyResponseSendControlCommandResponse.getData());
        Debug.fi(HMBaseProfile.TAG, "type:" + ((int) cmd[1]) + " data header:" + dataHeader);
        return dataHeader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "data:" + GattUtils.bytesToHexString(bArr));
        int i = bArr[0] & 255;
        if ((this.j + 1) % 256 != i) {
            Debug.fi(HMBaseProfile.TAG, "missing package!!!");
            atomicBoolean.getAndSet(true);
            waitingNotify();
        } else {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
            } catch (Exception e) {
                Debug.fi(HMBaseProfile.TAG, "exception:" + e.getMessage());
                atomicBoolean.getAndSet(true);
                waitingNotify();
            }
        }
        this.j = i;
        atomicBoolean.set(false);
    }

    public static boolean isPackageMissing(int lastIndex, int currentIndex) {
        return (lastIndex + 1) % 256 != currentIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "control:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(byte[] bArr) {
        synchronized (this.h) {
            IGattCallback.INotifyCallback iNotifyCallback = this.f;
            if (iNotifyCallback != null) {
                iNotifyCallback.notify(bArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(byte[] bArr) {
        synchronized (this.i) {
            IGattCallback.INotifyCallback iNotifyCallback = this.g;
            if (iNotifyCallback != null) {
                iNotifyCallback.notify(bArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(HMNotifyResponse hMNotifyResponse, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "notify:" + GattUtils.bytesToHexString(bArr));
        hMNotifyResponse.from(bArr);
        countDownLatch.countDown();
    }

    private a n(Calendar startTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime.getTimeInMillis());
        return new a((short) calendar.get(1), (byte) (calendar.get(2) + 1), (byte) calendar.get(5), (byte) calendar.get(11), (byte) calendar.get(12), (byte) calendar.get(13), (byte) ProfileUtils.getTimezoneKey(calendar.getTimeZone().getOffset(startTime.getTimeInMillis())));
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        unregisterNotification(this.d);
        unregisterNotification(this.e);
        GdspFactory.INSTANCE.resetGdspSyncProfile();
        return true;
    }

    public byte[] fetchRawData() {
        this.j = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: pc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.i(atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: oc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.j(atomicBoolean, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        try {
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            Debug.i(HMBaseProfile.TAG, "extra bytes exception:" + e.getMessage());
            return null;
        }
    }

    @Nullable
    public DataHeader getDataHeader(Calendar startTime, byte type) {
        a aVarN = n(startTime);
        return getDataHeader(type, aVarN.a, aVarN.b, aVarN.c, aVarN.d, aVarN.e, aVarN.f, aVarN.g);
    }

    public DataHeader getGpsHeader(Calendar startTime, byte type) {
        DataHeader dataHeader = getDataHeader(type, (short) startTime.get(1), (byte) (startTime.get(2) + 1), (byte) startTime.get(5), (byte) startTime.get(11), (byte) startTime.get(12), (byte) startTime.get(13), (byte) ProfileUtils.getTimezoneKey(startTime.getTimeZone().getOffset(startTime.getTimeInMillis())));
        if (dataHeader != null) {
            Calendar calendar = dataHeader.calendar;
            calendar.setTimeInMillis(calendar.getTimeInMillis() + ((long) ProfileUtils.getDstOffset(calendar)));
        }
        return dataHeader;
    }

    public GDSPVersion getVersion() {
        if (!init()) {
            return GDSPVersion.INSTANCE.getINVALID_VERSION();
        }
        HMNotifyResponse hMNotifyResponseSendControlCommandResponse = sendControlCommandResponse(GDSPCommand.QueryGDSPVersionCommand.INSTANCE.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
        Debug.fi(HMBaseProfile.TAG, "Query version response:" + hMNotifyResponseSendControlCommandResponse);
        if (hMNotifyResponseSendControlCommandResponse == null || !hMNotifyResponseSendControlCommandResponse.isSuccess()) {
            return GDSPVersion.INSTANCE.getINVALID_VERSION();
        }
        if (hMNotifyResponseSendControlCommandResponse.getData() != null && hMNotifyResponseSendControlCommandResponse.getData().length != 0) {
            return new GDSPVersion(hMNotifyResponseSendControlCommandResponse.getData()[0] & 255);
        }
        Debug.fi(HMBaseProfile.TAG, "Query version no data response");
        return GDSPVersion.INSTANCE.getINVALID_VERSION();
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        GdspFactory.INSTANCE.resetGdspSyncProfile();
        UUID uuid = HMBaseProfile.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi(HMBaseProfile.TAG, uuid + " is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.c);
        this.d = characteristic;
        if (characteristic == null) {
            Debug.fi(HMBaseProfile.TAG, this.c + " is null!");
            return false;
        }
        if (hasNotification(characteristic)) {
            Debug.fi(HMBaseProfile.TAG, "Notification exist:" + this.d.getUuid());
            unregisterNotification(this.d);
        }
        if (!registerNotification(this.d, new IGattCallback.INotifyCallback() { // from class: mc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.k(bArr);
            }
        })) {
            Debug.fi(HMBaseProfile.TAG, "registerNotification " + this.c + " failed!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(this.b);
        this.e = characteristic2;
        if (characteristic2 == null) {
            Debug.fi(HMBaseProfile.TAG, this.b + " is null!");
            unregisterNotification(this.d);
            return false;
        }
        if (hasNotification(characteristic2)) {
            Debug.fi(HMBaseProfile.TAG, "Notification exist:" + this.e.getUuid());
            unregisterNotification(this.e);
        }
        if (registerNotification(this.e, new IGattCallback.INotifyCallback() { // from class: nc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.l(bArr);
            }
        })) {
            return true;
        }
        unregisterNotification(this.d);
        Debug.fi(HMBaseProfile.TAG, "registerNotification " + this.b + " failed!!!");
        return false;
    }

    public synchronized ArrayList<ActivityData> parseData(byte[] value, HMDeviceSource source, Feature feature) throws Exception {
        ActivityData activityData;
        int i;
        int i2;
        ArrayList<ActivityData> arrayList = new ArrayList<>();
        if (value != null) {
            int i3 = 1;
            if (value.length >= 1) {
                if (feature != null && feature.hasAlg(0) && (i = feature.get(0)) > 4) {
                    g(value.length, i);
                    while (i3 < value.length && (i2 = i3 + i) <= value.length) {
                        byte[] bArr = new byte[i];
                        System.arraycopy(value, i3, bArr, 0, i);
                        arrayList.add(new ActivityDataExtend(bArr));
                        i3 = i2;
                    }
                    return arrayList;
                }
                int i4 = (source == HMDeviceSource.SHOES_MARS || source == HMDeviceSource.MILI_NFC) ? 3 : 4;
                g(value.length, i4);
                while (i3 < value.length) {
                    if (source == HMDeviceSource.SHOES_MARS) {
                        activityData = new ActivityData(value[i3], value[i3 + 1], value[i3 + 2]);
                    } else {
                        activityData = source == HMDeviceSource.MILI_NFC ? new ActivityData(value[i3 + 1], value[i3 + 2], value[i3]) : new ActivityHrData(value[i3 + 1], value[i3 + 2], value[i3], value[i3 + 3]);
                    }
                    arrayList.add(activityData);
                    i3 += i4;
                }
                return arrayList;
            }
        }
        return arrayList;
    }

    @Nullable
    public synchronized DataHeader parseDataHeader(byte[] data) {
        if (data != null) {
            if (data.length >= 12) {
                DataHeader dataHeader = new DataHeader();
                dataHeader.size = (data[0] & 255) | ((data[1] & 255) << 8) | ((data[2] & 255) << 16) | ((data[3] & 255) << 24);
                MKTime mKTime = MKTime.INSTANCE;
                int iMktime = mKTime.mktime((data[4] & 255) | ((data[5] & 255) << 8), data[6] & 255, data[7] & 255, data[8] & 255, data[9] & 255, data[10] & 255, data[11]);
                Calendar calendar = Calendar.getInstance(mKTime.zoneKeyToTimeZone(data[11]));
                calendar.setTimeInMillis(((long) iMktime) * 1000);
                dataHeader.calendar = calendar;
                if (data.length > 12) {
                    dataHeader.expansionData = Arrays.copyOfRange(data, 12, data.length);
                }
                return dataHeader;
            }
        }
        Debug.fi(HMBaseProfile.TAG, "parseDataHeader return as wrong value:" + GattUtils.bytesToHexString(data));
        return null;
    }

    public boolean sendControlCommandNoResponse(byte[] cmd) {
        return sendCommandWithNoResponse(this.e, cmd);
    }

    public HMNotifyResponse sendControlCommandResponse(byte[] cmd) {
        return sendControlCommandResponse(cmd, 5);
    }

    public void setControlCallback(IGattCallback.INotifyCallback callback) {
        synchronized (this.i) {
            this.g = callback;
        }
    }

    public void setDataCallback(IGattCallback.INotifyCallback callback) {
        synchronized (this.h) {
            this.f = callback;
        }
    }

    public boolean startTransfer() {
        return sendControlCommandNoResponse(new byte[]{2});
    }

    public boolean stopTransfer() {
        HMNotifyResponse hMNotifyResponseSendControlCommandResponse = sendControlCommandResponse(new byte[]{3});
        return hMNotifyResponseSendControlCommandResponse != null && hMNotifyResponseSendControlCommandResponse.isSuccess((byte) 3);
    }

    public boolean testLeParams() {
        byte[] bArr;
        BluetoothGattService service = getService(IBaseProfile.UUID_SERVICE_DEVICE_SERVICE);
        if (service == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(IBaseProfile.UUID_CHARACTERISTIC_DEVICE_SOFTWARE_REVISION);
        GattPeripheral peripheral = getPeripheral();
        return (characteristic == null || peripheral == null || (bArr = peripheral.read(characteristic)) == null || bArr.length <= 0) ? false : true;
    }

    public void waiting(int timeout) {
        waiting(this.e, timeout);
    }

    public void waitingNotify() {
        watingNotify(this.e);
    }

    public HMNotifyResponse sendControlCommandResponse(byte[] cmd, int timeoutSecs) {
        final HMNotifyResponse hMNotifyResponse = new HMNotifyResponse();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: lc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMProSyncDataBaseProfile.m(hMNotifyResponse, countDownLatch, bArr);
            }
        });
        if (!sendCommandWithNoResponse(this.e, cmd)) {
            return null;
        }
        try {
            countDownLatch.await(timeoutSecs, TimeUnit.SECONDS);
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "await exception:" + e.getMessage());
        }
        return hMNotifyResponse;
    }

    @Nullable
    public DataHeader getDataHeader(Calendar calendar, byte b, boolean z) {
        a aVarN = n(calendar);
        Debug.fi(HMBaseProfile.TAG, "type:" + ((int) b) + ",time:" + aVarN);
        short s = aVarN.a;
        return h(new byte[]{1, b, (byte) (s & 255), (byte) ((s >> 8) & 255), aVarN.b, aVarN.c, aVarN.d, aVarN.e, aVarN.f, aVarN.g, z ? (byte) 1 : (byte) 0});
    }

    public boolean stopTransfer(int error) {
        HMNotifyResponse hMNotifyResponseSendControlCommandResponse = sendControlCommandResponse(new byte[]{3, (byte) error});
        return hMNotifyResponseSendControlCommandResponse != null && hMNotifyResponseSendControlCommandResponse.isSuccess((byte) 3);
    }

    public DataHeader getDataHeader(byte type, short year, byte month, byte day, byte hours, byte minutes, byte seconds, byte tz) {
        Debug.fi(HMBaseProfile.TAG, "type:" + ((int) type) + ",year:" + ((int) year) + ",month:" + ((int) month) + ",day:" + ((int) day) + ",hours:" + ((int) hours) + ",minutes:" + ((int) minutes) + ",seconds:" + ((int) seconds) + ",tz:" + ((int) tz));
        return h(new byte[]{1, type, (byte) (year & 255), (byte) ((year >> 8) & 255), month, day, hours, minutes, seconds, tz});
    }
}
