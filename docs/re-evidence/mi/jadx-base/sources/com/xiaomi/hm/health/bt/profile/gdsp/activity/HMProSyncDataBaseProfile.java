package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.GDSPVersion;
import defpackage.a6t;
import defpackage.ats;
import defpackage.f4s;
import defpackage.i;
import defpackage.j;
import defpackage.jet;
import defpackage.l;
import defpackage.lb;
import defpackage.qd;
import defpackage.qe;
import defpackage.t5t;
import defpackage.tet;
import defpackage.xb;
import defpackage.xk;
import defpackage.zh;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMProSyncDataBaseProfile extends a6t {
    public static final byte CMD_DATA_SIZE = 1;
    public static final byte CMD_START_TRANSFER = 2;
    private static final byte CMD_STOP_TRANSFER = 3;
    private static final int CONTROL_TIMEOUT_SECONDS = 5;
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
    private static final int GET_DATA_HEADER_TIMEOUT_SECONDS = 20;
    private final UUID UUID_CHARACTERISTIC_ACTIVITY_DATA;
    private final UUID UUID_CHARACTERISTIC_ACTIVITY_DATA_CONTROL_POINT;
    private zh.b mControlCallback;
    private Object mControlSyncObj;
    private zh.b mDataCallback;
    private Object mDataSyncObj;
    private int mLastIndex;
    private BluetoothGattCharacteristic m_CharActivityData;
    private BluetoothGattCharacteristic m_CharActivityDataControlPoint;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public short f13479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte f13480b;
        public byte c;
        public byte d;
        public byte e;
        public byte f;
        public byte g;

        public a(short s, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7) {
            this.f13479a = s;
            this.f13480b = b2;
            this.c = b3;
            this.d = b4;
            this.e = b5;
            this.f = b6;
            this.g = b7;
        }

        public String toString() {
            return "MkTime{year=" + ((int) this.f13479a) + ", month=" + ((int) this.f13480b) + ", day=" + ((int) this.c) + ", hour=" + ((int) this.d) + ", minute=" + ((int) this.e) + ", sec=" + ((int) this.f) + ", tz=" + ((int) this.g) + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public HMProSyncDataBaseProfile(jet jetVar) {
        super(jetVar);
        this.UUID_CHARACTERISTIC_ACTIVITY_DATA_CONTROL_POINT = tet.C(4);
        this.UUID_CHARACTERISTIC_ACTIVITY_DATA = tet.C(5);
        this.m_CharActivityData = null;
        this.m_CharActivityDataControlPoint = null;
        this.mDataCallback = null;
        this.mControlCallback = null;
        this.mDataSyncObj = new Object();
        this.mControlSyncObj = new Object();
        this.mLastIndex = -1;
    }

    private void checkDataLen(int i, int i2) throws Exception {
        if ((i - 1) % i2 != 0) {
            throw new Exception("活动数据长度不符合协议定义，无法解析，将直接丢弃");
        }
    }

    public static boolean isPackageMissing(int i, int i2) {
        return (i + 1) % 256 != i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchRawData$3(AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        t5t.d(a6t.TAG, "data:" + tet.x(bArr));
        int i = bArr[0] & 255;
        if ((this.mLastIndex + 1) % 256 != i) {
            t5t.d(a6t.TAG, "missing package!!!");
            atomicBoolean.getAndSet(true);
            waitingNotify();
        } else {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
            } catch (Exception e) {
                t5t.d(a6t.TAG, "exception:" + e.getMessage());
                atomicBoolean.getAndSet(true);
                waitingNotify();
            }
        }
        this.mLastIndex = i;
        atomicBoolean.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchRawData$4(AtomicBoolean atomicBoolean, byte[] bArr) {
        t5t.d(a6t.TAG, "control:" + tet.x(bArr));
        atomicBoolean.set(true);
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(byte[] bArr) {
        synchronized (this.mDataSyncObj) {
            try {
                zh.b bVar = this.mDataCallback;
                if (bVar != null) {
                    bVar.e(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(byte[] bArr) {
        synchronized (this.mControlSyncObj) {
            try {
                zh.b bVar = this.mControlCallback;
                if (bVar != null) {
                    bVar.e(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendControlCommandResponse$2(qe qeVar, CountDownLatch countDownLatch, byte[] bArr) {
        t5t.d(a6t.TAG, "notify:" + tet.x(bArr));
        qeVar.b(bArr);
        countDownLatch.countDown();
    }

    private a requestTime(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return new a((short) calendar2.get(1), (byte) (calendar2.get(2) + 1), (byte) calendar2.get(5), (byte) calendar2.get(11), (byte) calendar2.get(12), (byte) calendar2.get(13), (byte) ProfileUtils.getTimezoneKey(calendar2.getTimeZone().getOffset(calendar.getTimeInMillis())));
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        unregisterNotification(this.m_CharActivityData);
        unregisterNotification(this.m_CharActivityDataControlPoint);
        xb.f38931a.b();
        return true;
    }

    public byte[] fetchRawData() {
        this.mLastIndex = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new zh.b() { // from class: ddb
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f15396a.lambda$fetchRawData$3(atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new zh.b() { // from class: edb
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f16522a.lambda$fetchRawData$4(atomicBoolean, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(ErrorCode.ERROR_CODE_INVALID_PARAM);
            }
        }
        try {
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            t5t.m(a6t.TAG, "extra bytes exception:" + e.getMessage());
            return null;
        }
    }

    public f4s getDataHeader(Calendar calendar, byte b2) {
        a aVarRequestTime = requestTime(calendar);
        return getDataHeader(b2, aVarRequestTime.f13479a, aVarRequestTime.f13480b, aVarRequestTime.c, aVarRequestTime.d, aVarRequestTime.e, aVarRequestTime.f, aVarRequestTime.g);
    }

    public f4s getGpsHeader(Calendar calendar, byte b2) {
        f4s dataHeader = getDataHeader(b2, (short) calendar.get(1), (byte) (calendar.get(2) + 1), (byte) calendar.get(5), (byte) calendar.get(11), (byte) calendar.get(12), (byte) calendar.get(13), (byte) ProfileUtils.getTimezoneKey(calendar.getTimeZone().getOffset(calendar.getTimeInMillis())));
        if (dataHeader != null) {
            Calendar calendar2 = dataHeader.f17406a;
            calendar2.setTimeInMillis(calendar2.getTimeInMillis() + ((long) ProfileUtils.getDstOffset(calendar2)));
        }
        return dataHeader;
    }

    public GDSPVersion getVersion() {
        if (!init()) {
            return GDSPVersion.f30182b.a();
        }
        qe qeVarSendControlCommandResponse = sendControlCommandResponse(lb.a.f24844a.getF34884a());
        t5t.d(a6t.TAG, "Query version response:" + qeVarSendControlCommandResponse);
        if (qeVarSendControlCommandResponse == null || !qeVarSendControlCommandResponse.k()) {
            return GDSPVersion.f30182b.a();
        }
        if (qeVarSendControlCommandResponse.i() != null && qeVarSendControlCommandResponse.i().length != 0) {
            return new GDSPVersion(qeVarSendControlCommandResponse.i()[0] & 255);
        }
        t5t.d(a6t.TAG, "Query version no data response");
        return GDSPVersion.f30182b.a();
    }

    @Override // defpackage.a6t
    public boolean init() {
        xb.f38931a.b();
        UUID uuid = a6t.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            t5t.d(a6t.TAG, uuid + " is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.UUID_CHARACTERISTIC_ACTIVITY_DATA);
        this.m_CharActivityData = characteristic;
        if (characteristic == null) {
            t5t.d(a6t.TAG, this.UUID_CHARACTERISTIC_ACTIVITY_DATA + " is null!");
            return false;
        }
        if (hasNotification(characteristic)) {
            t5t.d(a6t.TAG, "Notification exist:" + this.m_CharActivityData.getUuid());
            unregisterNotification(this.m_CharActivityData);
        }
        if (!registerNotification(this.m_CharActivityData, new zh.b() { // from class: fdb
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f17673a.lambda$init$0(bArr);
            }
        })) {
            t5t.d(a6t.TAG, "registerNotification " + this.UUID_CHARACTERISTIC_ACTIVITY_DATA + " failed!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(this.UUID_CHARACTERISTIC_ACTIVITY_DATA_CONTROL_POINT);
        this.m_CharActivityDataControlPoint = characteristic2;
        if (characteristic2 == null) {
            t5t.d(a6t.TAG, this.UUID_CHARACTERISTIC_ACTIVITY_DATA_CONTROL_POINT + " is null!");
            unregisterNotification(this.m_CharActivityData);
            return false;
        }
        if (hasNotification(characteristic2)) {
            t5t.d(a6t.TAG, "Notification exist:" + this.m_CharActivityDataControlPoint.getUuid());
            unregisterNotification(this.m_CharActivityDataControlPoint);
        }
        if (registerNotification(this.m_CharActivityDataControlPoint, new zh.b() { // from class: gdb
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f18850a.lambda$init$1(bArr);
            }
        })) {
            return true;
        }
        unregisterNotification(this.m_CharActivityData);
        t5t.d(a6t.TAG, "registerNotification " + this.UUID_CHARACTERISTIC_ACTIVITY_DATA_CONTROL_POINT + " failed!!!");
        return false;
    }

    public synchronized ArrayList<i> parseData(byte[] bArr, qd qdVar, Feature feature) {
        i iVar;
        int i;
        int i2;
        ArrayList<i> arrayList = new ArrayList<>();
        if (bArr != null) {
            int i3 = 1;
            if (bArr.length >= 1) {
                if (feature != null && feature.hasAlg(0) && (i = feature.get(0)) > 4) {
                    checkDataLen(bArr.length, i);
                    while (i3 < bArr.length && (i2 = i3 + i) <= bArr.length) {
                        byte[] bArr2 = new byte[i];
                        System.arraycopy(bArr, i3, bArr2, 0, i);
                        arrayList.add(new j(bArr2));
                        i3 = i2;
                    }
                    return arrayList;
                }
                int i4 = (qdVar == qd.J || qdVar == qd.b0) ? 3 : 4;
                checkDataLen(bArr.length, i4);
                while (i3 < bArr.length) {
                    if (qdVar == qd.J) {
                        iVar = new i(bArr[i3], bArr[i3 + 1], bArr[i3 + 2]);
                    } else {
                        iVar = qdVar == qd.b0 ? new i(bArr[i3 + 1], bArr[i3 + 2], bArr[i3]) : new l(bArr[i3 + 1], bArr[i3 + 2], bArr[i3], bArr[i3 + 3]);
                    }
                    arrayList.add(iVar);
                    i3 += i4;
                }
                return arrayList;
            }
        }
        return arrayList;
    }

    public synchronized f4s parseDataHeader(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length >= 12) {
                f4s f4sVar = new f4s();
                f4sVar.f17407b = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
                xk xkVar = xk.f39201a;
                int iA = xkVar.a((bArr[4] & 255) | ((bArr[5] & 255) << 8), bArr[6] & 255, bArr[7] & 255, bArr[8] & 255, bArr[9] & 255, bArr[10] & 255, bArr[11]);
                Calendar calendar = Calendar.getInstance(xkVar.a(bArr[11]));
                calendar.setTimeInMillis(((long) iA) * 1000);
                f4sVar.f17406a = calendar;
                if (bArr.length > 12) {
                    f4sVar.d = Arrays.copyOfRange(bArr, 12, bArr.length);
                }
                return f4sVar;
            }
        }
        t5t.d(a6t.TAG, "parseDataHeader return as wrong value:" + tet.x(bArr));
        return null;
    }

    public boolean sendControlCommandNoResponse(byte[] bArr) {
        return sendCommandWithNoResponse(this.m_CharActivityDataControlPoint, bArr);
    }

    public qe sendControlCommandResponse(byte[] bArr) {
        return sendControlCommandResponse(bArr, 5);
    }

    public void setControlCallback(zh.b bVar) {
        synchronized (this.mControlSyncObj) {
            this.mControlCallback = bVar;
        }
    }

    public void setDataCallback(zh.b bVar) {
        synchronized (this.mDataSyncObj) {
            this.mDataCallback = bVar;
        }
    }

    public boolean startTransfer() {
        return sendControlCommandNoResponse(new byte[]{2});
    }

    public boolean stopTransfer() {
        qe qeVarSendControlCommandResponse = sendControlCommandResponse(new byte[]{3});
        return qeVarSendControlCommandResponse != null && qeVarSendControlCommandResponse.d((byte) 3);
    }

    public boolean testLeParams() {
        byte[] bArrS0;
        BluetoothGattService service = getService(ats.Wb);
        if (service == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(ats.Zb);
        jet peripheral = getPeripheral();
        return (characteristic == null || peripheral == null || (bArrS0 = peripheral.S0(characteristic)) == null || bArrS0.length <= 0) ? false : true;
    }

    public void waiting(int i) {
        waiting(this.m_CharActivityDataControlPoint, i);
    }

    public void waitingNotify() {
        watingNotify(this.m_CharActivityDataControlPoint);
    }

    public qe sendControlCommandResponse(byte[] bArr, int i) {
        final qe qeVar = new qe();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        setControlCallback(new zh.b() { // from class: cdb
            @Override // zh.b
            public final void e(byte[] bArr2) {
                HMProSyncDataBaseProfile.lambda$sendControlCommandResponse$2(qeVar, countDownLatch, bArr2);
            }
        });
        if (!sendCommandWithNoResponse(this.m_CharActivityDataControlPoint, bArr)) {
            return null;
        }
        try {
            countDownLatch.await(i, TimeUnit.SECONDS);
        } catch (Exception e) {
            t5t.d(a6t.TAG, "await exception:" + e.getMessage());
        }
        return qeVar;
    }

    public f4s getDataHeader(Calendar calendar, byte b2, boolean z) {
        a aVarRequestTime = requestTime(calendar);
        t5t.d(a6t.TAG, "type:" + ((int) b2) + ",time:" + aVarRequestTime);
        short s = aVarRequestTime.f13479a;
        return getDataHeader(new byte[]{1, b2, (byte) (s & 255), (byte) ((s >> 8) & 255), aVarRequestTime.f13480b, aVarRequestTime.c, aVarRequestTime.d, aVarRequestTime.e, aVarRequestTime.f, aVarRequestTime.g, z ? (byte) 1 : (byte) 0});
    }

    public boolean stopTransfer(int i) {
        qe qeVarSendControlCommandResponse = sendControlCommandResponse(new byte[]{3, (byte) i});
        return qeVarSendControlCommandResponse != null && qeVarSendControlCommandResponse.d((byte) 3);
    }

    private f4s getDataHeader(byte[] bArr) {
        t5t.m(a6t.TAG, "cmd:" + tet.x(bArr));
        qe qeVarSendControlCommandResponse = sendControlCommandResponse(bArr, 20);
        if (qeVarSendControlCommandResponse == null) {
            return null;
        }
        if (!qeVarSendControlCommandResponse.d((byte) 1)) {
            return new f4s(qeVarSendControlCommandResponse.f());
        }
        f4s dataHeader = parseDataHeader(qeVarSendControlCommandResponse.i());
        t5t.d(a6t.TAG, "type:" + ((int) bArr[1]) + " data header:" + dataHeader);
        return dataHeader;
    }

    public f4s getDataHeader(byte b2, short s, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        t5t.d(a6t.TAG, "type:" + ((int) b2) + ",year:" + ((int) s) + ",month:" + ((int) b3) + ",day:" + ((int) b4) + ",hours:" + ((int) b5) + ",minutes:" + ((int) b6) + ",seconds:" + ((int) b7) + ",tz:" + ((int) b8));
        return getDataHeader(new byte[]{1, b2, (byte) (s & 255), (byte) ((s >> 8) & 255), b3, b4, b5, b6, b7, b8});
    }
}
