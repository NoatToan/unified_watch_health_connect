package com.xiaomi.hm.health.bt.profile.gdsp.raw;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes18.dex */
public class HMSyncRawDataProfile extends HMProSyncDataBaseProfile {
    private static final int p = 255;
    private final String n;
    private int o;

    public HMSyncRawDataProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.n = "HMSyncRawDataProfile";
        this.o = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(ByteArrayOutputStream byteArrayOutputStream, AtomicBoolean atomicBoolean, byte[] bArr) {
        int i = bArr[0] & 255;
        int i2 = this.o;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
            } catch (Exception e) {
                Debug.fi("HMSyncRawDataProfile", "Exception:" + e.getMessage());
                atomicBoolean.getAndSet(true);
                waitingNotify();
            }
        } else {
            Debug.fi("HMSyncRawDataProfile", "Missing package");
            atomicBoolean.getAndSet(true);
            waitingNotify();
        }
        this.o = i;
        atomicBoolean.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi("HMSyncRawDataProfile", "Control:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        waitingNotify();
    }

    public byte[] fetchData() {
        this.o = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: xj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.q(byteArrayOutputStream, atomicBoolean, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: yj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.r(atomicBoolean, bArr);
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
            Debug.fi("HMSyncRawDataProfile", "Parse exception:" + e.getMessage());
            return null;
        }
    }
}
