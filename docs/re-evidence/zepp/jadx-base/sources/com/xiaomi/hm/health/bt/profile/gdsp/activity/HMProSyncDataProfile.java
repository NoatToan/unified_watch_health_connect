package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import android.annotation.SuppressLint;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.hr.HMHrData;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import com.xiaomi.hm.health.bt.profile.gdsp.temperature.HMTemperatureData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
@SuppressLint({"NewApi"})
public class HMProSyncDataProfile extends HMProSyncDataBaseProfile {
    public byte[] mCptValue;
    private boolean n;

    public HMProSyncDataProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.mCptValue = null;
        this.n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "fetchData control point:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        this.mCptValue = bArr;
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(AtomicBoolean atomicBoolean, HMDeviceSource hMDeviceSource, Feature feature, IDataListener iDataListener, AtomicInteger atomicInteger, StringBuilder sb, byte[] bArr) {
        if (this.n) {
            atomicBoolean.set(true);
            waitingNotify();
            return;
        }
        String strBytesToHexString = GattUtils.bytesToHexString(bArr);
        Debug.fi(HMBaseProfile.TAG, "fetchData:" + strBytesToHexString);
        try {
            ArrayList<ActivityData> data = parseData(bArr, hMDeviceSource, feature);
            iDataListener.onDataReceived(data);
            int i = bArr[0] & 255;
            Debug.fi(HMBaseProfile.TAG, "fetchData data index:" + i + ",size:" + data.size());
            if ((atomicInteger.get() == i && strBytesToHexString.equals(sb.toString())) || atomicInteger.get() + 1 == i || (atomicInteger.get() == 255 && i == 0)) {
                atomicBoolean.set(false);
            } else {
                Debug.fi(HMBaseProfile.TAG, "missing package!!!");
                iDataListener.onDataMissing();
                atomicBoolean.set(true);
                this.mCptValue = null;
                waitingNotify();
            }
            atomicInteger.getAndSet(i);
            if (sb.length() > 0) {
                sb.delete(0, sb.length());
            }
            sb.append(strBytesToHexString);
        } catch (Exception e) {
            atomicBoolean.set(true);
            this.mCptValue = null;
            waitingNotify();
            Debug.fi(HMBaseProfile.TAG, "Parse data exception:" + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "fetch hr Data control point:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        this.mCptValue = bArr;
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(AtomicBoolean atomicBoolean, IHrDataListener iHrDataListener, byte[] bArr) {
        atomicBoolean.set(false);
        iHrDataListener.onDataReceived(parseHrData(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "fetchData control point:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        this.mCptValue = bArr;
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(IPressureAllDayDataListener iPressureAllDayDataListener, AtomicInteger atomicInteger, StringBuilder sb, AtomicBoolean atomicBoolean, byte[] bArr) {
        String strBytesToHexString = GattUtils.bytesToHexString(bArr);
        Debug.fi(HMBaseProfile.TAG, "fetchPressureAllDayData:" + strBytesToHexString);
        ArrayList<Integer> arrayListM = M(bArr);
        iPressureAllDayDataListener.onDataReceived(arrayListM);
        int i = bArr[0] & 255;
        Debug.fi(HMBaseProfile.TAG, "fetchPressureAllDayData data index:" + i + ",size:" + arrayListM.size());
        if ((atomicInteger.get() == i && strBytesToHexString.equals(sb.toString())) || atomicInteger.get() + 1 == i || (atomicInteger.get() == 255 && i == 0)) {
            atomicBoolean.set(false);
        } else {
            Debug.fi(HMBaseProfile.TAG, "missing package!!!");
            iPressureAllDayDataListener.onDataMissing();
            atomicBoolean.set(true);
            this.mCptValue = null;
            waitingNotify();
        }
        atomicInteger.getAndSet(i);
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
        sb.append(strBytesToHexString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "fetch pressure single Data control point:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        this.mCptValue = bArr;
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H(AtomicBoolean atomicBoolean, IPressureSingleDataListener iPressureSingleDataListener, byte[] bArr) {
        atomicBoolean.set(false);
        iPressureSingleDataListener.onDataReceived(parsePressureSingleData(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "fetch Temperature Data control point:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        this.mCptValue = bArr;
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J(AtomicBoolean atomicBoolean, ITemperatureDataListener iTemperatureDataListener, byte[] bArr) {
        atomicBoolean.set(false);
        iTemperatureDataListener.onDataReceived(parseTemperatureData(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "getLargeOriginData control point:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        this.mCptValue = bArr;
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(IDataCallback iDataCallback, AtomicInteger atomicInteger, StringBuilder sb, AtomicBoolean atomicBoolean, byte[] bArr) {
        String strBytesToHexString = GattUtils.bytesToHexString(bArr);
        Debug.fi(HMBaseProfile.TAG, "getLargeOriginData:" + strBytesToHexString);
        iDataCallback.onDataReceived(bArr);
        int i = bArr[0] & 255;
        Debug.fi(HMBaseProfile.TAG, "getLargeOriginData data index:" + i + ",size:" + bArr.length);
        if ((atomicInteger.get() == i && strBytesToHexString.equals(sb.toString())) || atomicInteger.get() + 1 == i || (atomicInteger.get() == 255 && i == 0)) {
            atomicBoolean.set(false);
        } else {
            Debug.fi(HMBaseProfile.TAG, "missing package!!!");
            iDataCallback.onDataMissing();
            atomicBoolean.set(true);
            this.mCptValue = null;
            waitingNotify();
        }
        atomicInteger.getAndSet(i);
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
        sb.append(strBytesToHexString);
    }

    private synchronized ArrayList<Integer> M(byte[] data) {
        ArrayList<Integer> arrayList;
        arrayList = new ArrayList<>();
        int length = data.length;
        for (int i = 1; i < length; i++) {
            arrayList.add(Integer.valueOf(data[i] & 255));
        }
        return arrayList;
    }

    public static synchronized ArrayList<HMHrData> parseHrData(byte[] data) {
        ArrayList<HMHrData> arrayList = new ArrayList<>();
        int length = data.length;
        if ((length - 1) % 6 != 0) {
            return arrayList;
        }
        for (int i = 1; i < length; i += 6) {
            int i2 = (data[i] & 255) | ((data[i + 1] & 255) << 8) | ((data[i + 2] & 255) << 16) | ((data[i + 3] & 255) << 24);
            byte b = data[i + 4];
            int i3 = data[i + 5] & 255;
            long j = ((long) i2) * 1000;
            Calendar calendar = Calendar.getInstance(ProfileUtils.getTimezone(b));
            calendar.setTimeInMillis(j);
            Debug.fi(HMBaseProfile.TAG, "HR_Log Key-Manual:" + i3 + "(" + calendar.getTime() + ")");
            arrayList.add(new HMHrData(calendar, i3));
        }
        return arrayList;
    }

    public static synchronized ArrayList<HMPressureData> parsePressureSingleData(byte[] data) {
        ArrayList<HMPressureData> arrayList = new ArrayList<>();
        int length = data.length;
        if ((length - 1) % 5 != 0) {
            return arrayList;
        }
        for (int i = 1; i < length; i += 5) {
            int i2 = (data[i] & 255) | ((data[i + 1] & 255) << 8) | ((data[i + 2] & 255) << 16) | ((data[i + 3] & 255) << 24);
            int i3 = data[i + 4] & 255;
            long j = ((long) i2) * 1000;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            Debug.fi(HMBaseProfile.TAG, "pressure:" + i3 + "(" + calendar.getTime() + ")");
            arrayList.add(new HMPressureData(j, i3));
        }
        return arrayList;
    }

    public static synchronized ArrayList<HMTemperatureData> parseTemperatureData(byte[] data) {
        ArrayList<HMTemperatureData> arrayList = new ArrayList<>();
        int length = data.length;
        if ((length - 1) % 5 != 0) {
            return arrayList;
        }
        for (int i = 1; i < length; i += 5) {
            int i2 = data[i] & 255;
            long j = ((long) ((data[i + 1] & 255) | ((data[i + 2] & 255) << 8) | ((data[i + 3] & 255) << 16) | ((data[i + 4] & 255) << 24))) * 1000;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            Debug.fi(HMBaseProfile.TAG, "temperature:" + i2 + "(" + calendar.getTime() + ")");
            arrayList.add(new HMTemperatureData(calendar, i2));
        }
        return arrayList;
    }

    public boolean fetchData(final IDataListener listener, final HMDeviceSource source, final Feature feature) {
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final StringBuilder sb = new StringBuilder();
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: cd3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.A(atomicBoolean, bArr);
            }
        });
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: rc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.B(atomicBoolean, source, feature, listener, atomicInteger, sb, bArr);
            }
        });
        this.mCptValue = null;
        if (!startTransfer()) {
            return false;
        }
        if (this.mCptValue == null) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.mCptValue);
        return hMNotifyResponse != null && hMNotifyResponse.isSuccess((byte) 2);
    }

    public boolean fetchHrData(final IHrDataListener listener) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: yc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.C(atomicBoolean, bArr);
            }
        });
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: sc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMProSyncDataProfile.D(atomicBoolean, listener, bArr);
            }
        });
        this.mCptValue = null;
        if (!startTransfer()) {
            return false;
        }
        if (this.mCptValue == null) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.mCptValue);
        return hMNotifyResponse != null && hMNotifyResponse.isSuccess((byte) 2);
    }

    public boolean fetchPressureAllDayData(final IPressureAllDayDataListener listener) {
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final StringBuilder sb = new StringBuilder();
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: dd3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.E(atomicBoolean, bArr);
            }
        });
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: xc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.F(listener, atomicInteger, sb, atomicBoolean, bArr);
            }
        });
        this.mCptValue = null;
        if (!startTransfer()) {
            return false;
        }
        if (this.mCptValue == null) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.mCptValue);
        return hMNotifyResponse != null && hMNotifyResponse.isSuccess((byte) 2);
    }

    public boolean fetchPressureSingleData(final IPressureSingleDataListener listener) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: ad3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.G(atomicBoolean, bArr);
            }
        });
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: tc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMProSyncDataProfile.H(atomicBoolean, listener, bArr);
            }
        });
        this.mCptValue = null;
        if (!startTransfer()) {
            return false;
        }
        if (this.mCptValue == null) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.mCptValue);
        return hMNotifyResponse != null && hMNotifyResponse.isSuccess((byte) 2);
    }

    public boolean fetchTemperatureData(final ITemperatureDataListener listener) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: zc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.I(atomicBoolean, bArr);
            }
        });
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: uc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMProSyncDataProfile.J(atomicBoolean, listener, bArr);
            }
        });
        this.mCptValue = null;
        if (!startTransfer()) {
            return false;
        }
        if (this.mCptValue == null) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.mCptValue);
        return hMNotifyResponse != null && hMNotifyResponse.isSuccess((byte) 2);
    }

    public DataHeader getDataHeader(Calendar startTime) {
        return getDataHeader(startTime, (byte) 1);
    }

    public boolean getLargeOriginData(final IDataCallback listener) {
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final StringBuilder sb = new StringBuilder();
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: bd3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.K(atomicBoolean, bArr);
            }
        });
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: wc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.L(listener, atomicInteger, sb, atomicBoolean, bArr);
            }
        });
        this.mCptValue = null;
        if (!startTransfer()) {
            return false;
        }
        if (this.mCptValue == null) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.mCptValue);
        return hMNotifyResponse != null && hMNotifyResponse.isSuccess((byte) 2);
    }

    public void stopFetch() {
        this.n = true;
    }
}
