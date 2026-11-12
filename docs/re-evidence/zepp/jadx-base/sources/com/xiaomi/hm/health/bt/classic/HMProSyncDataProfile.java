package com.xiaomi.hm.health.bt.classic;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataExtend;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityHrData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IDataListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class HMProSyncDataProfile extends HMProSyncDataBaseProfile {
    private boolean d;
    public byte[] mCptValue;

    public HMProSyncDataProfile(ITransport transport) {
        super(transport);
        this.mCptValue = null;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, HMDeviceSource hMDeviceSource, Feature feature, IDataListener iDataListener, AtomicInteger atomicInteger, StringBuilder sb, byte[] bArr) {
        if (this.d) {
            atomicBoolean.set(true);
            countDownLatch.countDown();
            return;
        }
        String strBytesToHexString = GattUtils.bytesToHexString(bArr);
        Debug.fi(HMProSyncDataBaseProfile.TAG, "fetchData:" + strBytesToHexString);
        ArrayList<ActivityData> data = parseData(bArr, hMDeviceSource, feature);
        iDataListener.onDataReceived(data);
        int i = bArr[0] & 255;
        Debug.fi(HMProSyncDataBaseProfile.TAG, "fetchData data index:" + i + ",size:" + data.size());
        if ((atomicInteger.get() == i && strBytesToHexString.equals(sb.toString())) || atomicInteger.get() + 1 == i || (atomicInteger.get() == 255 && i == 0)) {
            atomicBoolean.set(false);
        } else {
            Debug.fi(HMProSyncDataBaseProfile.TAG, "missing package!!!");
            atomicBoolean.set(true);
            countDownLatch.countDown();
        }
        atomicInteger.getAndSet(i);
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
        sb.append(strBytesToHexString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi(HMProSyncDataBaseProfile.TAG, "fetchData control point:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        this.mCptValue = bArr;
        countDownLatch.countDown();
    }

    public boolean fetchData(final IDataListener listener, final HMDeviceSource source, final Feature feature) {
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final StringBuilder sb = new StringBuilder();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        IGattCallback.INotifyCallback iNotifyCallback = new IGattCallback.INotifyCallback() { // from class: vc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.g(atomicBoolean, countDownLatch, source, feature, listener, atomicInteger, sb, bArr);
            }
        };
        if (!b(iNotifyCallback)) {
            Debug.fi(HMProSyncDataBaseProfile.TAG, "registerDataCallback failed!!!");
            return false;
        }
        if (!a(new IGattCallback.INotifyCallback() { // from class: qc3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.h(atomicBoolean, countDownLatch, bArr);
            }
        })) {
            Debug.fi(HMProSyncDataBaseProfile.TAG, "registerControlCallback failed!!!");
            d(iNotifyCallback);
            return false;
        }
        this.mCptValue = null;
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                try {
                    countDownLatch.await(20000L, TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
            }
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.mCptValue);
        return hMNotifyResponse != null && hMNotifyResponse.isSuccess((byte) 2);
    }

    public DataHeader getDataHeader(Calendar startTime) {
        return getDataHeader(startTime, (byte) 1);
    }

    public synchronized ArrayList<ActivityData> parseData(byte[] value, HMDeviceSource source, Feature feature) {
        ActivityData activityData;
        int i;
        ArrayList<ActivityData> arrayList = new ArrayList<>();
        if (value != null) {
            int i2 = 1;
            if (value.length >= 1) {
                if (feature != null && feature.hasAlg(0) && (i = feature.get(0)) > 4) {
                    while (i2 < value.length) {
                        byte[] bArr = new byte[i];
                        System.arraycopy(value, i2, bArr, 0, i);
                        arrayList.add(new ActivityDataExtend(bArr));
                        i2 += i;
                    }
                    return arrayList;
                }
                int i3 = (source == HMDeviceSource.SHOES_MARS || source == HMDeviceSource.MILI_NFC) ? 3 : 4;
                while (i2 < value.length) {
                    if (source == HMDeviceSource.SHOES_MARS) {
                        activityData = new ActivityData(value[i2], value[i2 + 1], value[i2 + 2]);
                    } else {
                        activityData = source == HMDeviceSource.MILI_NFC ? new ActivityData(value[i2 + 1], value[i2 + 2], value[i2]) : new ActivityHrData(value[i2 + 1], value[i2 + 2], value[i2], value[i2 + 3]);
                    }
                    arrayList.add(activityData);
                    i2 += i3;
                }
                return arrayList;
            }
        }
        return arrayList;
    }

    public void stopFetch() {
        this.d = true;
    }
}
