package com.xiaomi.hm.health.bt.profile.grsp;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.characteristic.DataCallback;
import com.huami.bluetooth.profile.characteristic.HMBleBluetoothCharacteristic;
import com.huami.bluetooth.profile.generic.BleGenericNotifyCharacteristic;
import com.huami.bluetooth.profile.generic.GenericController;
import com.huami.bluetooth.profile.generic.GenericControllerImpl;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataProfile;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"NewApi"})
public class HMProSensorDataProfile {
    private static final String m = "HMProSensorDataProfile";
    private static final int n = 1024;
    private static final byte o = 1;
    private static final byte p = 2;
    private static final byte q = 4;
    private static final byte r = 5;
    private static final byte s = 3;
    private static final byte t = 0;
    private static final byte u = 1;
    private static final byte v = 2;
    private static final byte w = 3;
    private static final UUID x = GattUtils.uuid128(2);
    private static final UUID y = GattUtils.uuid128(1);
    private static final int z = 5;
    private BluetoothCharacteristic a;
    private BluetoothCharacteristic b;
    private GenericController c;
    private DataCallback d;
    private HashMap<SensorType, TimeData> e;
    private HashMap<SensorType, IndexData> f;
    private HashMap<SensorType, SensorFrequency> g;
    private final ByteBuffer h;

    @Nullable
    private HashMap<SensorType, ChannelDescription> i;

    @Nullable
    private GRSPModule j;
    private GattPeripheral k;
    private HashMap<SensorType, Boolean> l;
    public int mLastIndex;
    public ISensorDataListener mListener;
    public int mVersion;

    public interface ISensorDataListener {
        boolean ignoreLostData();

        void onOriginData(byte[] data);

        void onSensorData(SensorDataFragment fragment);
    }

    public static class IndexData {
        public int a;
        public long b;

        public IndexData(int index, long timestamp) {
            this.a = index;
            this.b = timestamp;
        }

        public int getIndex() {
            return this.a;
        }

        public long getTimestamp() {
            return this.b;
        }

        public void setIndex(int index) {
            this.a = index;
        }

        public void setTimestamp(long timestamp) {
            this.b = timestamp;
        }

        @NonNull
        public String toString() {
            return "IndexData{index=" + this.a + ", timestamp=" + this.b + '}';
        }
    }

    public static class TimeData {
        public int a;
        public long b;
        public int c = -1;

        public TimeData(int sensorType, long timestamp) {
            this.a = sensorType;
            this.b = timestamp;
        }

        public int getIndex() {
            return this.c;
        }

        public void setIndex(int index) {
            this.c = index;
        }

        @NonNull
        public String toString() {
            return "TimeData{sensorType=" + this.a + ", timestamp=" + this.b + '}';
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ChannelDataType.values().length];
            b = iArr;
            try {
                iArr[ChannelDataType.INT_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ChannelDataType.INT_16.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ChannelDataType.INT_32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ChannelDataType.INT_64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ChannelDataType.UINT_8.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[ChannelDataType.UINT_16.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[ChannelDataType.UINT_32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[ChannelDataType.UINT_64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[ChannelDataType.FLOAT_32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[ChannelDataType.FLOAT_64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[SensorType.values().length];
            a = iArr2;
            try {
                iArr2[SensorType.GSENSOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[SensorType.PPG.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[SensorType.ECG.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[SensorType.NMEA.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[SensorType.GYRO.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[SensorType.ADATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[SensorType.GEO.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[SensorType.SPO2.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[SensorType.HR.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[SensorType.PRESSURE.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[SensorType.BAROMETER.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[SensorType.PP.ordinal()] = 12;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public HMProSensorDataProfile(GattPeripheral gattPeripheral) {
        this(gattPeripheral, e(gattPeripheral, y), e(gattPeripheral, x));
        this.k = gattPeripheral;
    }

    private void A(byte[] value) {
        int length = value.length;
        ArrayList arrayList = new ArrayList();
        for (int i = 2; i < length; i += 9) {
            arrayList.add(new HrData(GattUtils.bytesToLong(value, i + 1), value[i] & 255));
        }
        ISensorDataListener iSensorDataListener = this.mListener;
        if (iSensorDataListener != null) {
            iSensorDataListener.onSensorData(new SensorDataFragment(arrayList));
        }
    }

    private void B(byte[] value) {
        TimeData timeDataRemove;
        TimeData timeDataRemove2;
        SensorType sensorType = SensorType.PPG;
        int i = value[1] & 255;
        int length = value.length;
        ArrayList arrayList = new ArrayList();
        ISensorDataListener iSensorDataListener = this.mListener;
        int i2 = 0;
        boolean zIgnoreLostData = iSensorDataListener != null ? iSensorDataListener.ignoreLostData() : false;
        IndexData indexData = this.f.get(sensorType);
        if (indexData != null) {
            int iF = f(i, indexData.getIndex());
            if (iF > 5 && !zIgnoreLostData) {
                L();
            } else if (iF > 0 && !zIgnoreLostData) {
                for (int i3 = 0; i3 < iF; i3++) {
                    for (int i4 = 0; i4 < 9; i4++) {
                        arrayList.add(new PPGSensorData(255L));
                    }
                }
            }
            i2 = iF;
        }
        this.f.put(sensorType, new IndexData(i, System.currentTimeMillis()));
        if (n() || o()) {
            for (int i5 = 2; i5 < length; i5 += 4) {
                long jBytesToLong = GattUtils.bytesToLong(value, i5, 4);
                if (n()) {
                    jBytesToLong = (jBytesToLong << 32) >> 32;
                }
                PPGSensorData pPGSensorData = new PPGSensorData(jBytesToLong);
                arrayList.add(pPGSensorData);
                if (i5 == 2 && (timeDataRemove = this.e.remove(sensorType)) != null) {
                    pPGSensorData.setTimestamp(timeDataRemove.b);
                }
            }
        } else {
            for (int i6 = 2; i6 < length; i6 += 2) {
                PPGSensorData pPGSensorData2 = new PPGSensorData((value[i6] & 255) | ((value[i6 + 1] & 255) << 8));
                if (i6 == 2 && (timeDataRemove2 = this.e.remove(sensorType)) != null) {
                    pPGSensorData2.setTimestamp(timeDataRemove2.b);
                }
                Debug.i(m, "PPG:" + pPGSensorData2);
                arrayList.add(pPGSensorData2);
            }
        }
        if (this.mListener != null) {
            SensorDataFragment sensorDataFragment = new SensorDataFragment(arrayList);
            sensorDataFragment.setLosePackages(i2);
            this.mListener.onSensorData(sensorDataFragment);
        }
    }

    private void C(byte[] value) {
        TimeData timeDataRemove;
        int length = value.length;
        ArrayList arrayList = new ArrayList();
        for (int i = 2; i < length; i += 2) {
            PressureData pressureData = new PressureData((((value[i] & 255) | ((value[i + 1] & 255) << 8)) << 16) >> 16);
            if (i == 2 && (timeDataRemove = this.e.remove(SensorType.PRESSURE)) != null) {
                pressureData.setTimestamp(timeDataRemove.b);
            }
            arrayList.add(pressureData);
        }
        ISensorDataListener iSensorDataListener = this.mListener;
        if (iSensorDataListener != null) {
            iSensorDataListener.onSensorData(new SensorDataFragment(arrayList));
        }
    }

    private synchronized void D(byte[] value) {
        Debug.i(m, "parseSenorDataX:" + GattUtils.bytesToHexString(value));
        if (value != null && value.length >= 3) {
            int i = value[0] & 255;
            Debug.i(m, "sensorType:" + i + ",index:" + (value[1] & 255));
            if (i == SensorType.GSENSOR.getValue()) {
                y(value);
            } else if (i == SensorType.PPG.getValue()) {
                B(value);
            } else if (i == SensorType.TIME.getValue()) {
                H(value);
            } else if (i == SensorType.GEO.getValue()) {
                x(value);
            } else if (i == SensorType.ADATA.getValue()) {
                s(value);
            } else if (i == SensorType.ECG.getValue()) {
                w(value);
            } else if (i == SensorType.GYRO.getValue()) {
                z(value);
            } else {
                ISensorDataListener iSensorDataListener = this.mListener;
                if (iSensorDataListener != null) {
                    iSensorDataListener.onOriginData(value);
                }
            }
        }
    }

    private void E(byte[] value) {
        TimeData timeDataRemove;
        TimeData timeDataRemove2;
        if (value == null) {
            Debug.fi(m, "sensor data is null!!!");
            return;
        }
        int length = value.length;
        if (length < 2) {
            Debug.fi(m, "invalid sensor data length!!!");
            return;
        }
        int i = 0;
        int i2 = value[0] & 255;
        byte b = value[1];
        int iH = h(b, this.mLastIndex);
        ISensorDataListener iSensorDataListener = this.mListener;
        boolean zIgnoreLostData = iSensorDataListener != null ? iSensorDataListener.ignoreLostData() : false;
        Debug.i(m, "flag:" + i2 + ",index:" + ((int) b));
        if (i2 == SensorType.GSENSOR.getValue()) {
            ArrayList arrayList = new ArrayList();
            if (iH > 0 && !zIgnoreLostData) {
                Debug.fi(m, "GSensor missingPackets:" + iH);
                while (i < iH) {
                    arrayList.add(new GSensorData(65535, 65535, 65535));
                    i++;
                }
            }
            for (int i3 = 2; i3 < length; i3 += 6) {
                GSensorData gSensorData = new GSensorData((((value[i3] & 255) | ((value[i3 + 1] & 255) << 8)) << 16) >> 16, (((value[i3 + 2] & 255) | ((value[i3 + 3] & 255) << 8)) << 16) >> 16, (((value[i3 + 4] & 255) | ((value[i3 + 5] & 255) << 8)) << 16) >> 16);
                arrayList.add(gSensorData);
                if (i3 == 2 && (timeDataRemove2 = this.e.remove(SensorType.GSENSOR)) != null) {
                    gSensorData.setTimestamp(timeDataRemove2.b);
                }
            }
            I(SensorType.GSENSOR, length / 6);
            if (this.mListener != null) {
                SensorDataFragment sensorDataFragment = new SensorDataFragment(arrayList);
                sensorDataFragment.setLosePackages(iH);
                this.mListener.onSensorData(sensorDataFragment);
            }
        } else if (i2 == SensorType.GYRO.getValue()) {
            ArrayList arrayList2 = new ArrayList();
            if (iH > 0) {
                Debug.fi(m, "missingPackets:" + iH);
                while (i < iH) {
                    arrayList2.add(new GyroData(65535, 65535, 65535));
                    i++;
                }
            }
            for (int i4 = 2; i4 < length; i4 += 6) {
                arrayList2.add(new GyroData((((value[i4] & 255) | ((value[i4 + 1] & 255) << 8)) << 16) >> 16, (((value[i4 + 2] & 255) | ((value[i4 + 3] & 255) << 8)) << 16) >> 16, (((value[i4 + 4] & 255) | ((value[i4 + 5] & 255) << 8)) << 16) >> 16));
            }
            I(SensorType.GYRO, length / 6);
            if (this.mListener != null) {
                SensorDataFragment sensorDataFragment2 = new SensorDataFragment(arrayList2);
                sensorDataFragment2.setLosePackages(iH);
                this.mListener.onSensorData(sensorDataFragment2);
            }
        } else if (i2 == SensorType.PPG.getValue()) {
            ArrayList arrayList3 = new ArrayList();
            if (iH > 0 && !zIgnoreLostData) {
                Debug.fi(m, "PPG missingPackets:" + iH);
                while (i < iH) {
                    arrayList3.add(new PPGSensorData(WebSocketProtocol.s));
                    i++;
                }
            }
            for (int i5 = 2; i5 < length; i5 += 2) {
                PPGSensorData pPGSensorData = new PPGSensorData((value[i5] & 255) | ((value[i5 + 1] & 255) << 8));
                arrayList3.add(pPGSensorData);
                if (i5 == 2 && (timeDataRemove = this.e.remove(SensorType.PPG)) != null) {
                    pPGSensorData.setTimestamp(timeDataRemove.b);
                }
            }
            I(SensorType.PPG, length / 2);
            if (this.mListener != null) {
                SensorDataFragment sensorDataFragment3 = new SensorDataFragment(arrayList3);
                sensorDataFragment3.setLosePackages(iH);
                this.mListener.onSensorData(sensorDataFragment3);
            }
        } else if (i2 == SensorType.ECG.getValue()) {
            ArrayList arrayList4 = new ArrayList();
            for (int i6 = 2; i6 < length; i6 += 2) {
                arrayList4.add(new ECGSensorData(((value[i6] & 255) | ((value[i6 + 1] & 255) << 8)) & 32767));
            }
            I(SensorType.ECG, length / 2);
            if (this.mListener != null) {
                SensorDataFragment sensorDataFragment4 = new SensorDataFragment(arrayList4);
                sensorDataFragment4.setLosePackages(iH);
                this.mListener.onSensorData(sensorDataFragment4);
            }
        } else {
            ISensorDataListener iSensorDataListener2 = this.mListener;
            if (iSensorDataListener2 != null) {
                iSensorDataListener2.onOriginData(value);
            }
        }
        this.mLastIndex = b;
    }

    private void F(byte[] value) {
        Debug.i(m, "parseSensorDataExtend:" + GattUtils.bytesToHexString(value));
        if (value == null || value.length < 3) {
            return;
        }
        int i = value[0] & 255;
        Debug.fi(m, "type: " + i + ", index: " + (value[1] & 255));
        SensorType sensorTypeFromBit = SensorType.fromBit(i);
        if (N(sensorTypeFromBit)) {
            t(sensorTypeFromBit, value);
        }
        switch (i) {
            case 0:
                y(value);
                break;
            case 1:
                B(value);
                break;
            case 2:
                w(value);
                break;
            case 3:
            case 11:
            case 12:
            case 13:
            default:
                ISensorDataListener iSensorDataListener = this.mListener;
                if (iSensorDataListener != null) {
                    iSensorDataListener.onOriginData(value);
                }
                break;
            case 4:
                z(value);
                break;
            case 5:
                s(value);
                break;
            case 6:
                x(value);
                break;
            case 7:
                H(value);
                break;
            case 8:
                G(value);
                break;
            case 9:
                A(value);
                break;
            case 10:
                C(value);
                break;
            case 14:
                if (this.mVersion < 4) {
                    d(SensorType.PP);
                }
                r(SensorType.PP, value);
                break;
            case 15:
                if (this.mVersion < 4) {
                    d(SensorType.BAROMETER);
                }
                r(SensorType.BAROMETER, value);
                break;
            case 16:
                r(SensorType.BODY_TEMPERATURE, value);
                break;
        }
    }

    private void G(byte[] value) {
        int iF;
        SensorType sensorType = SensorType.SPO2;
        boolean z2 = true;
        int i = value[1] & 255;
        int length = value.length;
        ArrayList arrayList = new ArrayList();
        IndexData indexData = this.f.get(sensorType);
        ISensorDataListener iSensorDataListener = this.mListener;
        boolean zIgnoreLostData = iSensorDataListener != null ? iSensorDataListener.ignoreLostData() : false;
        if (indexData != null) {
            iF = f(i, indexData.getIndex());
            if (iF > 5 && !zIgnoreLostData) {
                L();
            } else if (iF > 0 && !zIgnoreLostData) {
                for (int i2 = 0; i2 < iF; i2++) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        arrayList.add(new SPO2Data(-1, -1, -1));
                    }
                }
            }
        } else {
            iF = 0;
        }
        this.f.put(sensorType, new IndexData(i, System.currentTimeMillis()));
        int i4 = 2;
        while (i4 < length) {
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = (value[i4] & 255) | ((value[i5] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | ((value[i6] & 255) << 16);
            int i10 = i8 + 1;
            int i11 = i9 | ((value[i8] & 255) << 24);
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((value[i12] & 255) << 8) | (value[i10] & 255);
            int i15 = i13 + 1;
            int i16 = i14 | ((value[i13] & 255) << 16);
            int i17 = i15 + 1;
            int i18 = i16 | ((value[i15] & 255) << 24);
            int i19 = i17 + 1;
            int i20 = i19 + 1;
            int i21 = ((value[i19] & 255) << 8) | (value[i17] & 255);
            int i22 = i20 + 1;
            int i23 = i21 | ((value[i20] & 255) << 16);
            int i24 = i22 + 1;
            SPO2Data sPO2Data = new SPO2Data(i11, i18, i23 | ((value[i22] & 255) << 24));
            if (z2) {
                TimeData timeDataRemove = this.e.remove(sensorType);
                if (timeDataRemove != null) {
                    sPO2Data.setTimestamp(timeDataRemove.b);
                }
                z2 = false;
            }
            arrayList.add(sPO2Data);
            i4 = i24;
        }
        if (this.mListener != null) {
            SensorDataFragment sensorDataFragment = new SensorDataFragment(arrayList);
            sensorDataFragment.setLosePackages(iF);
            this.mListener.onSensorData(sensorDataFragment);
        }
    }

    private void H(byte[] value) {
        int i = value[1] & 255;
        int value2 = value[2] & 255;
        if (this.mVersion >= 2) {
            value2 = SensorType.fromBit(value2).getValue();
        }
        TimeData timeData = new TimeData(value2, GattUtils.bytesToLong(value, 3));
        timeData.setIndex(i);
        Debug.i(m, "timeData:" + timeData);
        this.e.put(SensorType.from(value2), timeData);
    }

    private void I(SensorType type, int samples) {
        SensorFrequency sensorFrequency = this.g.get(type);
        if (sensorFrequency != null) {
            sensorFrequency.addSample(samples);
        }
    }

    private HMNotifyResponse J(byte[] data) {
        final HMNotifyResponse hMNotifyResponse = new HMNotifyResponse();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (!this.b.registerNotification(new DataCallback() { // from class: ic3
            @Override // com.huami.bluetooth.profile.characteristic.DataCallback
            public final void onReceived(byte[] bArr) {
                HMProSensorDataProfile.q(hMNotifyResponse, countDownLatch, bArr);
            }
        })) {
            return null;
        }
        this.b.sendCommandNoResponse(data);
        try {
            countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        this.b.unregisterNotification();
        return hMNotifyResponse;
    }

    private void K() {
        Iterator<SensorFrequency> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            it2.next().start();
        }
    }

    private void L() {
        stop();
        BluetoothCharacteristic bluetoothCharacteristic = this.b;
        if (bluetoothCharacteristic instanceof HMBleBluetoothCharacteristic) {
            ((HMBleBluetoothCharacteristic) bluetoothCharacteristic).disconnect();
        }
    }

    private void M() {
        Iterator<SensorFrequency> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            it2.next().stop();
        }
    }

    private boolean N(SensorType sensorType) {
        if (this.mVersion < 4) {
            return false;
        }
        HashMap<SensorType, Boolean> map = this.l;
        if (map == null) {
            return true;
        }
        return map.getOrDefault(sensorType, Boolean.TRUE).booleanValue();
    }

    private void c(@NonNull List<CommonSensorData> dataList, @NonNull SensorType type, int count, int channel) {
        for (int i = 0; i < count; i++) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < channel; i2++) {
                arrayList.add(0);
            }
            dataList.add(new CommonSensorData(type, arrayList));
        }
    }

    private void d(@NonNull SensorType type) {
        if (this.i == null) {
            this.i = new HashMap<>();
        }
        if (this.i.get(type) != null) {
            return;
        }
        int i = a.a[type.ordinal()];
        if (i == 11) {
            ChannelDescription channelDescription = new ChannelDescription();
            channelDescription.getChannelDescriptions().add(ChannelDataType.INT_32);
            Debug.fi(m, "Add " + type + " desc: " + channelDescription);
            this.i.put(type, channelDescription);
            return;
        }
        if (i != 12) {
            return;
        }
        ChannelDescription channelDescription2 = new ChannelDescription();
        channelDescription2.getChannelDescriptions().add(ChannelDataType.UINT_32);
        Debug.fi(m, "Add " + type + " desc: " + channelDescription2);
        this.i.put(type, channelDescription2);
    }

    private static HMBleBluetoothCharacteristic e(GattPeripheral gattPeripheral, UUID uuid) {
        return new HMBleBluetoothCharacteristic(gattPeripheral, HMBaseProfile.UUID_SERVICE_MILI_SERVICE, uuid);
    }

    private int f(int current, int last) {
        int i = 255;
        if (last + 1 == current || (last == 255 && current == 0)) {
            i = 0;
        } else if (current > last) {
            i = current - last;
        } else if (current != last) {
            i = (255 - last) + current;
        }
        Debug.i(m, "index delta:" + i);
        return i;
    }

    private int g(@NonNull SensorType type, int index) {
        IndexData indexData = this.f.get(type);
        return indexData == null ? index : f(index, indexData.getIndex());
    }

    private int h(int currentIndex, int lastIndex) {
        Debug.fi(m, "data index:" + currentIndex + ",last index:" + lastIndex);
        if ((lastIndex == 255 && currentIndex == 0) || lastIndex + 1 == currentIndex) {
            return 0;
        }
        return (currentIndex - lastIndex) - 1;
    }

    private HashMap<SensorType, Boolean> i(HashMap<SensorType, ChannelDescription> sensorDescription) {
        HashMap<SensorType, Boolean> map = new HashMap<>();
        for (Map.Entry<SensorType, ChannelDescription> entry : sensorDescription.entrySet()) {
            SensorType key = entry.getKey();
            map.put(key, Boolean.valueOf(!SensorDataConfigKt.isMatch(key, entry.getValue())));
        }
        return map;
    }

    private void j(int value) {
        SensorType sensorType = SensorType.GSENSOR;
        if ((sensorType.getValue() & value) != 0) {
            this.g.put(sensorType, new SensorFrequency(sensorType));
        }
        SensorType sensorType2 = SensorType.PPG;
        if ((sensorType2.getValue() & value) != 0) {
            this.g.put(sensorType2, new SensorFrequency(sensorType2));
        }
        SensorType sensorType3 = SensorType.GYRO;
        if ((sensorType3.getValue() & value) != 0) {
            this.g.put(sensorType3, new SensorFrequency(sensorType3));
        }
        SensorType sensorType4 = SensorType.ECG;
        if ((sensorType4.getValue() & value) != 0) {
            this.g.put(sensorType4, new SensorFrequency(sensorType4));
        }
        SensorType sensorType5 = SensorType.TIME;
        if ((value & sensorType5.getValue()) != 0) {
            this.g.put(sensorType5, new SensorFrequency(sensorType5));
        }
    }

    private boolean k() {
        ChannelDescription channelDescription;
        if (this.mVersion == 3) {
            return true;
        }
        HashMap<SensorType, ChannelDescription> map = this.i;
        return (map == null || (channelDescription = map.get(SensorType.ECG)) == null || !channelDescription.toString().equals(ChannelDataType.INT_32.toString())) ? false : true;
    }

    private boolean l(HashMap<SensorType, ChannelDescription> sensorDescription) {
        boolean zIsMatch;
        boolean z2 = true;
        for (Map.Entry<SensorType, ChannelDescription> entry : sensorDescription.entrySet()) {
            switch (a.a[entry.getKey().ordinal()]) {
                case 1:
                    zIsMatch = SensorDataConfigKt.isMatch(SensorDataConfigKt.getGSENSOR(), entry.getValue().toString());
                    break;
                case 2:
                    zIsMatch = SensorDataConfigKt.isMatch(SensorDataConfigKt.getPPG(), entry.getValue().toString());
                    break;
                case 3:
                    zIsMatch = SensorDataConfigKt.isMatch(SensorDataConfigKt.getECG(), entry.getValue().toString());
                    break;
                case 4:
                    zIsMatch = SensorDataConfigKt.isMatch(SensorDataConfigKt.getNMEA(), entry.getValue().toString());
                    break;
                case 5:
                    zIsMatch = SensorDataConfigKt.isMatch(SensorDataConfigKt.getGYRO(), entry.getValue().toString());
                    break;
                case 6:
                    zIsMatch = SensorDataConfigKt.isMatch(SensorDataConfigKt.getADATA(), entry.getValue().toString());
                    break;
                case 7:
                    zIsMatch = SensorDataConfigKt.isMatch(SensorDataConfigKt.getGEO(), entry.getValue().toString());
                    break;
                case 8:
                    zIsMatch = SensorDataConfigKt.isMatch(SensorDataConfigKt.getSPO2(), entry.getValue().toString());
                    break;
                case 9:
                    zIsMatch = SensorDataConfigKt.isMatch(SensorDataConfigKt.getHR(), entry.getValue().toString());
                    break;
                case 10:
                    zIsMatch = SensorDataConfigKt.isMatch(SensorDataConfigKt.getPRESSURE(), entry.getValue().toString());
                    break;
                default:
                    continue;
            }
            z2 &= zIsMatch;
        }
        return z2;
    }

    private boolean m(@Nullable HashMap<SensorType, ChannelDescription> sensorDescription, SensorType sensorType) {
        if (sensorDescription == null) {
            return false;
        }
        return SensorDataConfigKt.isMatch(SensorDataConfigKt.getGSENSOR(), sensorDescription.get(sensorType).toString());
    }

    private boolean n() {
        ChannelDescription channelDescription;
        HashMap<SensorType, ChannelDescription> map = this.i;
        return (map == null || (channelDescription = map.get(SensorType.PPG)) == null || !channelDescription.toString().equals(ChannelDataType.INT_32.toString())) ? false : true;
    }

    private boolean o() {
        ChannelDescription channelDescription;
        HashMap<SensorType, ChannelDescription> map = this.i;
        return (map == null || (channelDescription = map.get(SensorType.PPG)) == null || !channelDescription.toString().equals(ChannelDataType.UINT_32.toString())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(byte[] bArr) {
        Debug.fi(m, "OnReceived SensorData: " + GattUtils.bytesToHexString(bArr) + ", Length: " + bArr.length);
        int i = this.mVersion;
        if (i >= 2) {
            F(bArr);
        } else if (i == 1) {
            D(bArr);
        } else {
            E(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(HMNotifyResponse hMNotifyResponse, CountDownLatch countDownLatch, byte[] bArr) {
        hMNotifyResponse.from(bArr);
        countDownLatch.countDown();
    }

    private void r(@NonNull SensorType type, byte[] bytes) {
        HashMap<SensorType, ChannelDescription> map = this.i;
        ChannelDescription channelDescription = map == null ? null : map.get(type);
        if (channelDescription == null) {
            return;
        }
        List<CommonSensorData> listU = u(type, channelDescription, bytes);
        ISensorDataListener iSensorDataListener = this.mListener;
        if (iSensorDataListener != null) {
            iSensorDataListener.onSensorData(new SensorDataFragment(new ArrayList(listU)));
        }
    }

    private void s(byte[] value) {
        this.h.put(value, 2, value.length - 2);
        int i = this.h.get(0) & 255;
        while (this.h.position() > i) {
            int i2 = i + 1;
            byte[] bArr = new byte[i2];
            this.h.flip();
            this.h.get(bArr);
            Debug.fi(m, "oneFrame:" + i2 + "," + GattUtils.bytesToHexString(bArr));
            ByteBuffer byteBufferSlice = this.h.slice();
            this.h.clear();
            if (byteBufferSlice.capacity() > 0) {
                this.h.put(byteBufferSlice);
            }
            i = this.h.get(0) & 255;
            ISensorDataListener iSensorDataListener = this.mListener;
            if (iSensorDataListener != null) {
                iSensorDataListener.onSensorData(new SensorDataFragment(new AudioSensorData(bArr)));
            }
        }
    }

    private void t(SensorType sensorType, byte[] value) {
        r(sensorType, value);
    }

    @NonNull
    private List<CommonSensorData> u(@NonNull SensorType type, @NonNull ChannelDescription desc, byte[] bytes) {
        ArrayList arrayList = new ArrayList();
        ArrayList<ChannelDataType> channelDescriptions = desc.getChannelDescriptions();
        if (bytes != null && bytes.length >= 3 && !channelDescriptions.isEmpty()) {
            int i = bytes[0] & 255;
            int i2 = bytes[1] & 255;
            Debug.i(m, "sensorType: " + type + ", notifyType:" + i + ", index:" + i2);
            int iG = g(type, i2);
            if (iG > 0) {
                Debug.fi(m, "Add " + type + " miss data: " + iG);
                c(arrayList, type, iG, channelDescriptions.size());
                if (iG > 5) {
                    L();
                }
            }
            this.f.put(type, new IndexData(i2, System.currentTimeMillis()));
            int byteLen = 2;
            int length = bytes.length;
            int size = channelDescriptions.size();
            int i3 = 0;
            while (byteLen < length) {
                ArrayList arrayList2 = new ArrayList();
                for (int i4 = 0; i4 < size; i4++) {
                    ChannelDataType channelDataType = channelDescriptions.get(i4);
                    int byteLen2 = channelDataType.getByteLen() + byteLen;
                    if (byteLen2 > length) {
                        break;
                    }
                    arrayList2.add(v(channelDataType, Arrays.copyOfRange(bytes, byteLen, byteLen2)));
                    byteLen += channelDataType.getByteLen();
                }
                TimeData timeDataRemove = this.e.remove(type);
                arrayList.add(timeDataRemove == null ? new CommonSensorData(type, arrayList2) : new CommonSensorData(type, arrayList2, Long.valueOf(timeDataRemove.b)));
                i3++;
                byteLen = byteLen;
            }
            Debug.fi(m, "Add " + type + " data: " + i3);
        }
        return arrayList;
    }

    private Number v(ChannelDataType dataType, byte[] bytes) {
        switch (a.b[dataType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return GattUtils.bytesToSignedNumber(bytes, 0, dataType.getByteLen());
            case 5:
            case 6:
            case 7:
            case 8:
                return Long.valueOf(GattUtils.bytesToLong(bytes, 0, dataType.getByteLen()));
            case 9:
                return Float.valueOf(Float.intBitsToFloat(((bytes[3] & 255) << 24) | (bytes[0] & 255) | ((bytes[1] & 255) << 8) | ((bytes[2] & 255) << 16)));
            case 10:
                long j = bytes[0] & 255;
                long j2 = bytes[1] & 65280;
                long j3 = bytes[2] & 16711680;
                long j4 = bytes[3] & (-16777216);
                long j5 = ((long) (bytes[4] & 255)) << 32;
                long j6 = ((long) (bytes[5] & 255)) << 40;
                return Double.valueOf(Double.longBitsToDouble(j | j2 | j3 | j4 | j5 | j6 | (((long) (bytes[6] & 255)) << 48) | (((long) (bytes[7] & 255)) << 56)));
            default:
                throw new RuntimeException("Unsupported type: " + dataType);
        }
    }

    private void w(byte[] value) {
        int iF;
        boolean z2;
        TimeData timeDataRemove;
        TimeData timeDataRemove2;
        SensorType sensorType = SensorType.ECG;
        int i = value[1] & 255;
        int length = value.length;
        ArrayList arrayList = new ArrayList();
        IndexData indexData = this.f.get(sensorType);
        ISensorDataListener iSensorDataListener = this.mListener;
        boolean zIgnoreLostData = iSensorDataListener != null ? iSensorDataListener.ignoreLostData() : false;
        if (indexData != null) {
            iF = f(i, indexData.getIndex());
            if (iF > 5 && !zIgnoreLostData) {
                L();
            } else if (iF > 0 && !zIgnoreLostData) {
                for (int i2 = 0; i2 < iF; i2++) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        arrayList.add(new ECGSensorData(-1L));
                    }
                }
            }
        } else {
            iF = 0;
        }
        this.f.put(sensorType, new IndexData(i, System.currentTimeMillis()));
        if (k() || this.mVersion == 3) {
            z2 = false;
            for (int i4 = 2; i4 < length; i4 += 4) {
                int iBytesToInt = GattUtils.bytesToInt(value, i4);
                ECGSensorData eCGSensorData = new ECGSensorData(iBytesToInt);
                arrayList.add(eCGSensorData);
                if (iBytesToInt == 1 || iBytesToInt == -1) {
                    z2 = true;
                }
                if (i4 == 2 && (timeDataRemove = this.e.remove(sensorType)) != null) {
                    eCGSensorData.setTimestamp(timeDataRemove.b);
                }
            }
        } else {
            z2 = false;
            for (int i5 = 2; i5 < length; i5 += 2) {
                int i6 = i5 + 1;
                ECGSensorData eCGSensorData2 = new ECGSensorData(((value[i5] & 255) | ((value[i6] & 255) << 8)) & 32767);
                arrayList.add(eCGSensorData2);
                if (i5 == 2 && (timeDataRemove2 = this.e.remove(sensorType)) != null) {
                    eCGSensorData2.setTimestamp(timeDataRemove2.b);
                }
                if ((value[i6] & 128) > 0) {
                    z2 = true;
                }
            }
        }
        if (this.mListener != null) {
            SensorDataFragment sensorDataFragment = new SensorDataFragment(arrayList);
            sensorDataFragment.setLod(z2);
            sensorDataFragment.setLosePackages(iF);
            this.mListener.onSensorData(sensorDataFragment);
        }
    }

    private void x(byte[] value) {
        TimeData timeDataRemove;
        SensorType sensorType = SensorType.GEO;
        int i = value[1] & 255;
        int length = value.length;
        ArrayList arrayList = new ArrayList();
        IndexData indexData = this.f.get(sensorType);
        int i2 = 0;
        if (indexData != null) {
            int iF = f(i, indexData.getIndex());
            if (iF > 5) {
                L();
            } else if (iF > 0) {
                for (int i3 = 0; i3 < iF; i3++) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        arrayList.add(new GeoData(65535, 65535, 65535));
                    }
                }
            }
            i2 = iF;
        }
        this.f.put(sensorType, new IndexData(i, System.currentTimeMillis()));
        for (int i5 = 2; i5 < length; i5 += 6) {
            GeoData geoData = new GeoData((((value[i5] & 255) | ((value[i5 + 1] & 255) << 8)) << 16) >> 16, (((value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8)) << 16) >> 16, (((value[i5 + 4] & 255) | ((value[i5 + 5] & 255) << 8)) << 16) >> 16);
            if (i5 == 2 && (timeDataRemove = this.e.remove(sensorType)) != null) {
                geoData.setTimestamp(timeDataRemove.b);
            }
            Debug.i(m, "GSensor:" + geoData);
            arrayList.add(geoData);
        }
        if (this.mListener != null) {
            SensorDataFragment sensorDataFragment = new SensorDataFragment(arrayList);
            sensorDataFragment.setLosePackages(i2);
            this.mListener.onSensorData(sensorDataFragment);
        }
    }

    private void y(byte[] value) {
        TimeData timeDataRemove;
        SensorType sensorType = SensorType.GSENSOR;
        int i = value[1] & 255;
        int length = value.length;
        ArrayList arrayList = new ArrayList();
        ISensorDataListener iSensorDataListener = this.mListener;
        int i2 = 0;
        boolean zIgnoreLostData = iSensorDataListener != null ? iSensorDataListener.ignoreLostData() : false;
        IndexData indexData = this.f.get(sensorType);
        if (indexData != null) {
            int iF = f(i, indexData.getIndex());
            if (iF > 5 && !zIgnoreLostData) {
                L();
            } else if (iF > 0 && !zIgnoreLostData) {
                for (int i3 = 0; i3 < iF; i3++) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        arrayList.add(new GSensorData(65535, 65535, 65535));
                    }
                }
            }
            i2 = iF;
        }
        this.f.put(sensorType, new IndexData(i, System.currentTimeMillis()));
        for (int i5 = 2; i5 < length; i5 += 6) {
            GSensorData gSensorData = new GSensorData((((value[i5] & 255) | ((value[i5 + 1] & 255) << 8)) << 16) >> 16, (((value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8)) << 16) >> 16, (((value[i5 + 4] & 255) | ((value[i5 + 5] & 255) << 8)) << 16) >> 16);
            if (i5 == 2 && (timeDataRemove = this.e.remove(sensorType)) != null) {
                gSensorData.setTimestamp(timeDataRemove.b);
            }
            Debug.i(m, "GSensor:" + gSensorData);
            arrayList.add(gSensorData);
        }
        if (this.mListener != null) {
            SensorDataFragment sensorDataFragment = new SensorDataFragment(arrayList);
            sensorDataFragment.setLosePackages(i2);
            this.mListener.onSensorData(sensorDataFragment);
        }
    }

    private void z(byte[] value) {
        TimeData timeDataRemove;
        SensorType sensorType = SensorType.GYRO;
        int i = value[1] & 255;
        int length = value.length;
        ArrayList arrayList = new ArrayList();
        IndexData indexData = this.f.get(sensorType);
        int i2 = 0;
        if (indexData != null) {
            int iF = f(i, indexData.getIndex());
            if (iF > 5) {
                L();
            } else if (iF > 0) {
                for (int i3 = 0; i3 < iF; i3++) {
                    for (int i4 = 0; i4 < 3; i4++) {
                        arrayList.add(new GyroData(65535, 65535, 65535));
                    }
                }
            }
            i2 = iF;
        }
        this.f.put(sensorType, new IndexData(i, System.currentTimeMillis()));
        for (int i5 = 2; i5 < length; i5 += 6) {
            GyroData gyroData = new GyroData((((value[i5] & 255) | ((value[i5 + 1] & 255) << 8)) << 16) >> 16, (((value[i5 + 2] & 255) | ((value[i5 + 3] & 255) << 8)) << 16) >> 16, (((value[i5 + 4] & 255) | ((value[i5 + 5] & 255) << 8)) << 16) >> 16);
            if (i5 == 2 && (timeDataRemove = this.e.remove(sensorType)) != null) {
                gyroData.setTimestamp(timeDataRemove.b);
            }
            Debug.i(m, "GSensor:" + gyroData);
            arrayList.add(gyroData);
        }
        if (this.mListener != null) {
            SensorDataFragment sensorDataFragment = new SensorDataFragment(arrayList);
            sensorDataFragment.setLosePackages(i2);
            this.mListener.onSensorData(sensorDataFragment);
        }
    }

    public boolean O() {
        return this.b.sendCommandNoResponse(new byte[]{0});
    }

    public boolean config(int type, byte hz) {
        GRSPModule gRSPModule;
        GattPeripheral gattPeripheral = this.k;
        if (gattPeripheral instanceof MiLiProProfile) {
            this.j = (GRSPModule) ((MiLiProProfile) gattPeripheral).getChannelModule(GRSPModule.class);
        }
        HMNotifyResponse hMNotifyResponseJ = J(new byte[]{1, (byte) type, hz});
        Debug.fi(m, "config response:" + hMNotifyResponseJ);
        if (hMNotifyResponseJ == null) {
            return false;
        }
        byte[] data = hMNotifyResponseJ.getData();
        if (data != null && data.length == 1) {
            this.mVersion = data[0];
        }
        int i = this.mVersion;
        if (i >= 4) {
            if (i != 5 || (gRSPModule = this.j) == null) {
                byte[] sensorDesc = this.c.getSensorDesc(type);
                Debug.fi(m, "descData: " + GattUtils.bytesToHexString(sensorDesc));
                if (sensorDesc == null) {
                    return false;
                }
                this.i = DataDescUtilKt.parseDataDescription(sensorDesc);
            } else {
                this.i = gRSPModule.getSensorDescSync(type);
            }
            Debug.fi(m, "SensorDescription: " + this.i);
            HashMap<SensorType, ChannelDescription> map = this.i;
            if (map == null) {
                Debug.fi(m, "sensorDescription null");
                return false;
            }
            HashMap<SensorType, Boolean> mapI = i(map);
            this.l = mapI;
            mapI.put(SensorType.TIME, Boolean.FALSE);
            hMNotifyResponseJ = J(new byte[]{1, (byte) (type & 255), (byte) ((type >> 8) & 255), (byte) ((type >> 16) & 255), (byte) ((type >> 24) & 255), hz});
            Debug.fi(m, "config response version 4:" + hMNotifyResponseJ);
        } else {
            boolean z2 = i == 2 || i == 3;
            if (!hMNotifyResponseJ.isSuccess((byte) 1) && z2) {
                hMNotifyResponseJ = J(new byte[]{1, (byte) (type & 255), (byte) ((type >> 8) & 255), (byte) ((type >> 16) & 255), (byte) ((type >> 24) & 255), hz});
                Debug.fi(m, "config response new:" + hMNotifyResponseJ);
            }
        }
        if (hMNotifyResponseJ == null || !hMNotifyResponseJ.isSuccess((byte) 1)) {
            return false;
        }
        j(type);
        return true;
    }

    public boolean init() {
        return this.b.init() && this.a.init();
    }

    public boolean start(ISensorDataListener listener) {
        this.mListener = listener;
        this.mLastIndex = -1;
        this.e.clear();
        this.f.clear();
        this.h.clear();
        if (!this.a.registerNotification(this.d)) {
            Debug.fi(m, "registerDataCallback failed!!!");
            return false;
        }
        boolean zSendCommandNoResponse = this.b.sendCommandNoResponse(new byte[]{2});
        Debug.fi(m, "start ret: " + zSendCommandNoResponse);
        K();
        return zSendCommandNoResponse;
    }

    public CheckData stop() {
        HMNotifyResponse hMNotifyResponseJ = J(new byte[]{3});
        Debug.fi(m, "stop response: " + hMNotifyResponseJ);
        M();
        if (!this.a.unregisterNotification()) {
            Debug.fi(m, "unregisterControlCallback failed!!!");
        }
        boolean z2 = hMNotifyResponseJ != null && hMNotifyResponseJ.isSuccess();
        CheckData checkData = new CheckData(z2);
        Debug.fi(m, "stop response sucess = " + z2 + "; data = " + (hMNotifyResponseJ == null ? "null" : GattUtils.bytesToHexString(hMNotifyResponseJ.getData())));
        if (hMNotifyResponseJ != null) {
            checkData.setData(hMNotifyResponseJ.getData());
        }
        this.mListener = null;
        return checkData;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private HMProSensorDataProfile(GattPeripheral gattPeripheral, final HMBleBluetoothCharacteristic control, BluetoothCharacteristic data) {
        this(control, data, new GenericControllerImpl(new BleGenericNotifyCharacteristic(gattPeripheral, new Function0() { // from class: kc3
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return control.getCharacteristic();
            }
        })));
        Objects.requireNonNull(control);
    }

    public HMProSensorDataProfile(BluetoothCharacteristic control, BluetoothCharacteristic data, GenericController generic) {
        this.mListener = null;
        this.mLastIndex = -1;
        this.mVersion = -1;
        this.e = new HashMap<>();
        this.f = new HashMap<>();
        this.g = new HashMap<>();
        this.h = ByteBuffer.allocate(1024);
        this.l = new HashMap<>();
        this.b = control;
        this.a = data;
        this.c = generic;
        this.d = new DataCallback() { // from class: jc3
            @Override // com.huami.bluetooth.profile.characteristic.DataCallback
            public final void onReceived(byte[] bArr) {
                this.a.p(bArr);
            }
        };
    }
}
