package com.xiaomi.hm.health.bt.profile.smartwatch.health;

import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataProfile;
import com.xiaomi.hm.health.bt.utils.BytesUtil;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
class c extends HMProSyncDataProfile {
    private static final byte p = 32;
    private int o;

    public c(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.o = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("HealthSummary Data: ");
        sb.append(GattUtils.bytesToHexString(bArr));
        sb.append(", Size: ");
        sb.append(bArr != null ? bArr.length : 0);
        Debug.fi(HMBaseProfile.TAG, sb.toString());
        int i = bArr[0] & 255;
        int i2 = this.o;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
                atomicBoolean.getAndSet(false);
            } catch (Exception e) {
                Debug.fi(HMBaseProfile.TAG, "exception:" + e.getMessage());
                atomicBoolean.getAndSet(true);
                waitingNotify();
            }
        } else {
            Debug.fi(HMBaseProfile.TAG, "missing package!!!");
            atomicBoolean.getAndSet(true);
            waitingNotify();
        }
        this.o = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(AtomicBoolean atomicBoolean, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, "HealthSummary Control: " + GattUtils.bytesToHexString(bArr));
        atomicBoolean.set(true);
        waitingNotify();
    }

    public BleHealthSummary P(int targetSize) {
        this.o = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: com.xiaomi.hm.health.bt.profile.smartwatch.health.b
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.Q(atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: com.xiaomi.hm.health.bt.profile.smartwatch.health.a
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.R(atomicBoolean, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        if (targetSize == byteArrayOutputStream.size()) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Log.d(HMBaseProfile.TAG, "Received Bytes: " + BytesUtil.log(byteArray), new Object[0]);
            return BleHealthSummary.parse(byteArray);
        }
        Debug.fi(HMBaseProfile.TAG, "get size is not match target size<" + targetSize + "," + byteArrayOutputStream.size() + SearchCriteria.GT);
        return null;
    }

    public DataHeader getSummaryHeader(Calendar startTime) {
        return getDataHeader(startTime, (byte) 32);
    }
}
