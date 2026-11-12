package com.xiaomi.hm.health.bt.profile.bodytemperature;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.bodytemperature.HMSyncTemperatureFileProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.threeten.bp.a;

/* JADX INFO: loaded from: classes11.dex */
public class HMSyncTemperatureFileProfile extends HMProSyncDataBaseProfile {
    private byte[] n;
    private AtomicBoolean o;

    public interface IDataLisenter {
        void onData(byte[] data);

        void onError(int error);
    }

    public HMSyncTemperatureFileProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.n = null;
        this.o = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "fetchData control point:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        this.n = bArr;
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(AtomicInteger atomicInteger, IDataLisenter iDataLisenter, AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "fetchData:" + GattUtils.bytesToHexString(bArr));
        int i = bArr[0] & 255;
        Debug.fi(HMBaseProfile.TAG, "fetchData data index:" + i);
        if (atomicInteger.get() + 1 != i && (atomicInteger.get() != 255 || i != 0)) {
            Debug.fi(HMBaseProfile.TAG, "missing package!!!");
            iDataLisenter.onError(1);
        }
        byte[] bArr2 = new byte[bArr.length - 1];
        System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        iDataLisenter.onData(bArr2);
        atomicBoolean.set(false);
        atomicInteger.getAndSet(i);
    }

    public boolean fetchFile(final IDataLisenter lisenter) {
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: dk3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.q(atomicBoolean, bArr);
            }
        });
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: ek3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMSyncTemperatureFileProfile.r(atomicInteger, lisenter, atomicBoolean, bArr);
            }
        });
        this.n = null;
        if (!startTransfer()) {
            return false;
        }
        if (this.n == null) {
            while (!atomicBoolean.get() && !this.o.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.n);
        return hMNotifyResponse != null && hMNotifyResponse.isSuccess((byte) 2);
    }

    public void forceStop() {
        this.o.getAndSet(true);
        waitingNotify();
    }

    public DataHeader getDataHeader(Calendar startTime) {
        return getDataHeader(startTime, a.l);
    }
}
