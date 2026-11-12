package com.xiaomi.hm.health.bt.classic;

import com.xiaomi.hm.health.bt.classic.HMSyncLogProfile;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class HMSyncLogProfile extends HMProSyncDataBaseProfile {
    private CountDownLatch d;
    private AtomicBoolean e;

    public interface IDataListener {
        void onData(byte[] data);

        void onError(int error);
    }

    public HMSyncLogProfile(ITransport transport) {
        super(transport);
        this.d = null;
        this.e = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(AtomicBoolean atomicBoolean, HMNotifyResponse hMNotifyResponse, byte[] bArr) {
        Debug.fi(HMProSyncDataBaseProfile.TAG, "fetchData control point:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        hMNotifyResponse.from(bArr);
        this.d.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(AtomicInteger atomicInteger, IDataListener iDataListener, AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMProSyncDataBaseProfile.TAG, "fetchData:" + GattUtils.bytesToHexString(bArr));
        int i = bArr[0] & 255;
        Debug.fi(HMProSyncDataBaseProfile.TAG, "fetchData data index:" + i);
        if (atomicInteger.get() + 1 != i && (atomicInteger.get() != 255 || i != 0)) {
            Debug.fi(HMProSyncDataBaseProfile.TAG, "missing package!!!");
            iDataListener.onError(1);
        }
        byte[] bArr2 = new byte[bArr.length - 1];
        System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        iDataListener.onData(bArr2);
        atomicBoolean.set(false);
        atomicInteger.getAndSet(i);
    }

    public void forceStop() {
        this.e.getAndSet(true);
        CountDownLatch countDownLatch = this.d;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public boolean g(final IDataListener lisenter) {
        this.d = new CountDownLatch(1);
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final HMNotifyResponse hMNotifyResponse = new HMNotifyResponse();
        IGattCallback.INotifyCallback iNotifyCallback = new IGattCallback.INotifyCallback() { // from class: rj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.h(atomicBoolean, hMNotifyResponse, bArr);
            }
        };
        if (!a(iNotifyCallback)) {
            Debug.fi(HMProSyncDataBaseProfile.TAG, "registerControlCallback failed!!!");
            return false;
        }
        IGattCallback.INotifyCallback iNotifyCallback2 = new IGattCallback.INotifyCallback() { // from class: sj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMSyncLogProfile.i(atomicInteger, lisenter, atomicBoolean, bArr);
            }
        };
        if (!b(iNotifyCallback2)) {
            Debug.fi(HMProSyncDataBaseProfile.TAG, "registerDataCallback failed!!!");
            c(iNotifyCallback);
            return false;
        }
        if (startTransfer() && this.d.getCount() > 0) {
            while (!atomicBoolean.get() && !this.e.get()) {
                atomicBoolean.set(true);
                try {
                    this.d.await(20000L, TimeUnit.MILLISECONDS);
                } catch (Exception e) {
                    Debug.fi(HMProSyncDataBaseProfile.TAG, "await exception:" + e.getMessage());
                }
            }
        }
        c(iNotifyCallback);
        d(iNotifyCallback2);
        this.d = null;
        return hMNotifyResponse.isSuccess((byte) 2);
    }

    public DataHeader getDataHeader(Calendar startTime) {
        return getDataHeader(startTime, (byte) 7);
    }
}
