package com.xiaomi.hm.health.bt.profile.gdsp;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public class HMGDSPProfile extends HMProSyncDataBaseProfile {
    private byte[] n;

    public interface IMyListener {
        void onData(int index, byte[] data);
    }

    public HMGDSPProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "fetchData control point:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        this.n = bArr;
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(IMyListener iMyListener, AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.i(HMBaseProfile.TAG, "fetchData:" + GattUtils.bytesToHexString(bArr));
        byte[] bArr2 = new byte[bArr.length - 1];
        System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        iMyListener.onData(bArr[0] & 255, bArr2);
        atomicBoolean.set(false);
    }

    public boolean startTransfer(final IMyListener lisenter) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: hw2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.q(atomicBoolean, bArr);
            }
        });
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: gw2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMGDSPProfile.r(lisenter, atomicBoolean, bArr);
            }
        });
        this.n = null;
        if (!startTransfer()) {
            return false;
        }
        if (this.n == null) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(this.n);
        return hMNotifyResponse != null && hMNotifyResponse.isSuccess((byte) 2);
    }
}
