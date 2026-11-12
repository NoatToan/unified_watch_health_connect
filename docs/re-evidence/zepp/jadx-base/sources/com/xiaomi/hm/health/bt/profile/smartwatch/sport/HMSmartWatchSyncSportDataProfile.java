package com.xiaomi.hm.health.bt.profile.smartwatch.sport;

import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.utils.BytesUtil;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes18.dex */
public class HMSmartWatchSyncSportDataProfile extends HMProSyncDataBaseProfile {
    private static final byte o = 33;
    private static final byte p = 34;
    private static final byte q = 4;
    private static final int r = 15;
    private int n;

    public HMSmartWatchSyncSportDataProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.n = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(AtomicBoolean atomicBoolean, byte[] bArr) {
        Log.d(HMBaseProfile.TAG, "summary control:" + GattUtils.bytesToHexString(bArr), new Object[0]);
        atomicBoolean.set(true);
        waitingNotify();
    }

    private boolean B(short year, byte month, byte day, byte hours, byte minutes, byte seconds, byte tz) {
        Log.d(HMBaseProfile.TAG, "Send LastSyncTime, year:" + ((int) year) + ",month:" + ((int) month) + ",day:" + ((int) day) + ",hours:" + ((int) hours) + ",minutes:" + ((int) minutes) + ",seconds:" + ((int) seconds) + ",tz:" + ((int) tz), new Object[0]);
        byte[] bArr = {4, (byte) (year & 255), (byte) ((year >> 8) & 255), month, day, hours, minutes, seconds, tz};
        StringBuilder sb = new StringBuilder();
        sb.append("Send LastSyncTime, Cmd: ");
        sb.append(GattUtils.bytesToHexString(bArr));
        Log.d(HMBaseProfile.TAG, sb.toString(), new Object[0]);
        HMNotifyResponse hMNotifyResponseSendControlCommandResponse = sendControlCommandResponse(bArr);
        boolean z = hMNotifyResponseSendControlCommandResponse != null && hMNotifyResponseSendControlCommandResponse.isSuccess((byte) 4);
        Log.d(HMBaseProfile.TAG, "Send LastSyncTime, Response: " + hMNotifyResponseSendControlCommandResponse + ", Success: " + z, new Object[0]);
        return z;
    }

    private DataHeader u(Calendar startTime, byte type) {
        DataHeader dataHeader = getDataHeader(type, (short) startTime.get(1), (byte) (startTime.get(2) + 1), (byte) startTime.get(5), (byte) startTime.get(11), (byte) startTime.get(12), (byte) startTime.get(13), (byte) ProfileUtils.getTimezoneKey(startTime.getTimeZone().getOffset(startTime.getTimeInMillis())));
        if (dataHeader != null) {
            Calendar calendar = dataHeader.calendar;
            calendar.setTimeInMillis(calendar.getTimeInMillis() + ((long) ProfileUtils.getDstOffset(calendar)));
        }
        return dataHeader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(AtomicInteger atomicInteger, BleSportDetailGps bleSportDetailGps, AtomicBoolean atomicBoolean, byte[] bArr) {
        Log.d(HMBaseProfile.TAG, "Receive Detail Gps Pack: " + GattUtils.bytesToHexString(bArr), new Object[0]);
        int i = bArr[0] & 255;
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        atomicInteger.getAndSet(atomicInteger.get() + length);
        bleSportDetailGps.parse(bArr2);
        int i2 = this.n;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            atomicBoolean.getAndSet(false);
        } else {
            Log.d(HMBaseProfile.TAG, "missing package!!!", new Object[0]);
            atomicBoolean.getAndSet(true);
            waitingNotify();
        }
        this.n = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(AtomicBoolean atomicBoolean, byte[] bArr) {
        Log.d(HMBaseProfile.TAG, "detail control:" + GattUtils.bytesToHexString(bArr), new Object[0]);
        atomicBoolean.set(true);
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(AtomicInteger atomicInteger, BleSportDetailHR bleSportDetailHR, AtomicBoolean atomicBoolean, byte[] bArr) {
        Log.d(HMBaseProfile.TAG, "Receive HR Pack: " + GattUtils.bytesToHexString(bArr), new Object[0]);
        int i = bArr[0] & 255;
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        atomicInteger.getAndSet(atomicInteger.get() + length);
        bleSportDetailHR.parse(bArr2);
        int i2 = this.n;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            atomicBoolean.getAndSet(false);
        } else {
            Log.d(HMBaseProfile.TAG, "missing package!!!", new Object[0]);
            atomicBoolean.getAndSet(true);
            waitingNotify();
        }
        this.n = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(AtomicBoolean atomicBoolean, byte[] bArr) {
        Log.d(HMBaseProfile.TAG, "detail control:" + GattUtils.bytesToHexString(bArr), new Object[0]);
        atomicBoolean.set(true);
        waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        Log.v(HMBaseProfile.TAG, "Receive Summary Pack: " + GattUtils.bytesToHexString(bArr), new Object[0]);
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

    public BleSportDetailGps fetchDetailGpsData(BleSportSummary summary, int size) {
        this.n = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final BleSportDetailGps bleSportDetailGps = new BleSportDetailGps();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: th3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.v(atomicInteger, bleSportDetailGps, atomicBoolean, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: ph3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.w(atomicBoolean, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        if (atomicInteger.get() == size) {
            return bleSportDetailGps;
        }
        Log.d(HMBaseProfile.TAG, "rSize:" + atomicInteger.get() + ",hSize:" + size, new Object[0]);
        return null;
    }

    public BleSportDetailHR fetchDetailHRData(BleSportSummary summary, int size) {
        this.n = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final BleSportDetailHR bleSportDetailHR = new BleSportDetailHR();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: uh3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.x(atomicInteger, bleSportDetailHR, atomicBoolean, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: rh3
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
        if (atomicInteger.get() == size) {
            return bleSportDetailHR;
        }
        Log.d(HMBaseProfile.TAG, "rSize:" + atomicInteger.get() + ",hSize:" + size, new Object[0]);
        return null;
    }

    public BleSportSummary fetchSummaryData(int targetSize) {
        this.n = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: sh3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.z(atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: qh3
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
            Log.d(HMBaseProfile.TAG, "Ble Summary: " + BytesUtil.log(byteArray), new Object[0]);
            return BleSportSummary.parse(byteArray);
        }
        Log.d(HMBaseProfile.TAG, "get size is not match target size<" + targetSize + "," + byteArrayOutputStream.size() + SearchCriteria.GT, new Object[0]);
        return null;
    }

    public DataHeader getDetailGpsHeader(Calendar startTime) {
        return u(startTime, (byte) 33);
    }

    public DataHeader getDetailHRHeader(Calendar startTime) {
        return u(startTime, (byte) 34);
    }

    public DataHeader getSummaryHeader(Calendar startTime) {
        return u(startTime, (byte) 5);
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile
    public HMNotifyResponse sendControlCommandResponse(byte[] cmd) {
        return sendControlCommandResponse(cmd, 15);
    }

    public boolean sendLastSyncTime(Calendar startTime) {
        Log.d(HMBaseProfile.TAG, "Send LastSyncTime Start...", new Object[0]);
        return B((short) startTime.get(1), (byte) (startTime.get(2) + 1), (byte) startTime.get(5), (byte) startTime.get(11), (byte) startTime.get(12), (byte) startTime.get(13), (byte) ProfileUtils.getTimezoneKey(startTime.getTimeZone().getOffset(startTime.getTimeInMillis())));
    }
}
