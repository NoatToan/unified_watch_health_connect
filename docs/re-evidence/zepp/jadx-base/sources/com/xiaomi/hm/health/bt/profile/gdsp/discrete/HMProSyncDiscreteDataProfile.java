package com.xiaomi.hm.health.bt.profile.gdsp.discrete;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IDiscreteDataListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes18.dex */
public class HMProSyncDiscreteDataProfile extends HMProSyncDataBaseProfile {
    private static final byte n = 1;
    private static final byte o = 4;
    private static final byte p = 5;
    private static final byte q = 3;

    public HMProSyncDiscreteDataProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(AtomicBoolean atomicBoolean, IDiscreteDataListener iDiscreteDataListener, HMDeviceSource hMDeviceSource, byte[] bArr) {
        Debug.i(HMBaseProfile.TAG, "activity data:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.getAndSet(false);
        try {
            iDiscreteDataListener.onDataReceived(parseData(bArr, hMDeviceSource, null));
        } catch (Exception e) {
            Debug.fi(HMBaseProfile.TAG, "Parse data exception:" + e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(AtomicBoolean atomicBoolean, IDiscreteDataListener iDiscreteDataListener, byte[] bArr) {
        Debug.i(HMBaseProfile.TAG, "activity data control:" + GattUtils.bytesToHexString(bArr));
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse(bArr);
        if (hMNotifyResponse == null || !hMNotifyResponse.isSuccess((byte) 5)) {
            atomicBoolean.getAndSet(true);
            waitingNotify();
            iDiscreteDataListener.onDataFinished(false);
        } else if (hMNotifyResponse.getData() != null) {
            atomicBoolean.getAndSet(false);
            iDiscreteDataListener.onDataHeaderReceived(parseDataHeader(hMNotifyResponse.getData()));
        } else {
            atomicBoolean.getAndSet(true);
            waitingNotify();
            iDiscreteDataListener.onDataFinished(true);
        }
    }

    public int config() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseSendControlCommandResponse = sendControlCommandResponse(new byte[]{4, 1});
        if (hMNotifyResponseSendControlCommandResponse == null || !hMNotifyResponseSendControlCommandResponse.isSuccess((byte) 4) || (data = hMNotifyResponseSendControlCommandResponse.getData()) == null || data.length != 4) {
            return -1;
        }
        return ((data[2] & 255) << 16) | (data[0] & 255) | ((data[1] & 255) << 8) | ((data[3] & 255) << 24);
    }

    public boolean fetchData(final IDiscreteDataListener listener, final HMDeviceSource source) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: fd3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.q(atomicBoolean, listener, source, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: ed3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.r(atomicBoolean, listener, bArr);
            }
        });
        boolean zStartTransfer = startTransfer();
        if (zStartTransfer) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        return zStartTransfer;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile
    public boolean startTransfer() {
        return sendControlCommandNoResponse(new byte[]{5});
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile
    public boolean stopTransfer() {
        HMNotifyResponse hMNotifyResponseSendControlCommandResponse = sendControlCommandResponse(new byte[]{3});
        return hMNotifyResponseSendControlCommandResponse != null && hMNotifyResponseSendControlCommandResponse.isSuccess((byte) 3);
    }
}
