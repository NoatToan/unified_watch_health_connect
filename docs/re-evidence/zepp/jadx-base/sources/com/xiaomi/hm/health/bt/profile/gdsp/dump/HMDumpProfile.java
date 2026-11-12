package com.xiaomi.hm.health.bt.profile.gdsp.dump;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.dump.HMDumpProfile;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes18.dex */
public class HMDumpProfile extends HMProSyncDataBaseProfile {
    public static final byte OP_DUMP_FLASH = 16;

    public interface IDataLisenter {
        void onData(byte[] data);

        void onError(int error);
    }

    public HMDumpProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(AtomicBoolean atomicBoolean, HMNotifyResponse hMNotifyResponse, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "fetchData control point:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        hMNotifyResponse.from(bArr);
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

    public boolean config(HMDumpSettings setting) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(16);
        byte[] bytes = setting.getBytes();
        byteArrayOutputStream.write(bytes, 0, bytes.length);
        HMNotifyResponse hMNotifyResponseSendControlCommandResponse = sendControlCommandResponse(byteArrayOutputStream.toByteArray());
        return hMNotifyResponseSendControlCommandResponse != null && hMNotifyResponseSendControlCommandResponse.isSuccess((byte) 16);
    }

    public boolean start(final IDataLisenter lisenter) {
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final HMNotifyResponse hMNotifyResponse = new HMNotifyResponse();
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: lu2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.q(atomicBoolean, hMNotifyResponse, bArr);
            }
        });
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: mu2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMDumpProfile.r(atomicInteger, lisenter, atomicBoolean, bArr);
            }
        });
        if (!startTransfer()) {
            return false;
        }
        while (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            waiting(20000);
        }
        return hMNotifyResponse.isSuccess((byte) 2);
    }
}
