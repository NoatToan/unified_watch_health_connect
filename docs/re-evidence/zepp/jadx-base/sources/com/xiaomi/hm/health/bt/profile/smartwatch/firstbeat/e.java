package com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat;

import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.utils.BytesUtil;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
class e extends HMProSyncDataBaseProfile {
    private static final byte o = 35;
    private static final byte p = 36;
    private int n;

    public e(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.n = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(AtomicBoolean atomicBoolean, byte[] bArr) {
        Log.d(HMBaseProfile.TAG, "Firstbeat control:" + GattUtils.bytesToHexString(bArr), new Object[0]);
        atomicBoolean.set(true);
        waitingNotify();
    }

    private DataHeader w(Calendar startTime, byte type) {
        DataHeader dataHeader = getDataHeader(type, (short) startTime.get(1), (byte) (startTime.get(2) + 1), (byte) startTime.get(5), (byte) startTime.get(11), (byte) startTime.get(12), (byte) startTime.get(13), (byte) ProfileUtils.getTimezoneKey(startTime.getTimeZone().getOffset(startTime.getTimeInMillis())));
        if (dataHeader != null) {
            Calendar calendar = dataHeader.calendar;
            calendar.setTimeInMillis(calendar.getTimeInMillis() + ((long) ProfileUtils.getDstOffset(calendar)));
        }
        return dataHeader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        Log.v(HMBaseProfile.TAG, "Receive FirstbeatConfig Pack: " + GattUtils.bytesToHexString(bArr), new Object[0]);
        int i = bArr[0] & 255;
        int i2 = this.n;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
                atomicBoolean.getAndSet(false);
            } catch (Exception e) {
                Log.d(HMBaseProfile.TAG, "exception:" + e.getMessage(), new Object[0]);
                atomicBoolean.getAndSet(true);
                waitingNotify();
            }
        } else {
            Log.d(HMBaseProfile.TAG, "missing package!!!", new Object[0]);
            atomicBoolean.getAndSet(true);
            waitingNotify();
        }
        this.n = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(AtomicBoolean atomicBoolean, byte[] bArr) {
        Log.d(HMBaseProfile.TAG, "FirstbeatConfig control:" + GattUtils.bytesToHexString(bArr), new Object[0]);
        atomicBoolean.set(true);
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        Log.v(HMBaseProfile.TAG, "Receive Firstbeat Pack: " + GattUtils.bytesToHexString(bArr), new Object[0]);
        int i = bArr[0] & 255;
        int i2 = this.n;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
                atomicBoolean.getAndSet(false);
            } catch (Exception e) {
                Log.d(HMBaseProfile.TAG, "exception:" + e.getMessage(), new Object[0]);
                atomicBoolean.getAndSet(true);
                waitingNotify();
            }
        } else {
            Log.d(HMBaseProfile.TAG, "missing package!!!", new Object[0]);
            atomicBoolean.getAndSet(true);
            waitingNotify();
        }
        this.n = i;
    }

    public BleFirstbeat.Config s(int targetSize) {
        this.n = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.c
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.x(atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.b
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.y(atomicBoolean, bArr);
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
            Log.d(HMBaseProfile.TAG, "BleFirstbeatConfig, Bytes: " + BytesUtil.log(byteArray), new Object[0]);
            return BleFirstbeat.b(byteArray);
        }
        Log.d(HMBaseProfile.TAG, "get size is not match target size<" + targetSize + "," + byteArrayOutputStream.size() + SearchCriteria.GT, new Object[0]);
        return null;
    }

    public BleFirstbeat t(int targetSize) {
        this.n = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.d
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.z(atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.a
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.A(atomicBoolean, bArr);
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
            Log.d(HMBaseProfile.TAG, "BleFirstbeat, Bytes: " + BytesUtil.log(byteArray), new Object[0]);
            return BleFirstbeat.a(byteArray);
        }
        Log.d(HMBaseProfile.TAG, "get size is not match target size<" + targetSize + "," + byteArrayOutputStream.size() + SearchCriteria.GT, new Object[0]);
        return null;
    }

    public DataHeader u(Calendar startTime) {
        return w(startTime, (byte) 36);
    }

    public DataHeader v(Calendar startTime) {
        return w(startTime, (byte) 35);
    }
}
