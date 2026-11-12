package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.running.RunningProfile;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes14.dex */
public class HMRunningSyncDataTask extends HMBaseTask implements IGattCallback.INotifyCallback {
    private static final String i = "RunningSyncDataTask";
    private static final int j = 2;
    private static final byte k = 1;
    private static final byte l = 2;
    private static final byte m = 3;
    private static final byte n = 4;
    private static final byte o = 5;
    private RunningProfile c;
    private IHMActivityDataCallback d;
    private final Object b = new Object();
    private byte[] e = null;
    private int f = 0;
    private int g = 0;
    private ByteArrayOutputStream h = null;

    public HMRunningSyncDataTask(RunningProfile profile, IHMActivityDataCallback cb) {
        this.c = null;
        this.d = null;
        this.c = profile;
        this.d = cb;
    }

    private int b(byte[] in) {
        if (in == null) {
            Debug.fi(i, "data head is null!!!");
            return -1;
        }
        Debug.fi(i, "in:" + GattUtils.bytesToHexString(in));
        if ((in[0] & 255) == 129) {
            Debug.fi(i, "data head indicate in syncing!!!");
            return -1;
        }
        if (in.length != 5) {
            Debug.fi(i, "data head lenght is wrong!!!");
            return -1;
        }
        return ((in[4] & 255) << 24) | (in[1] & 255) | ((in[2] & 255) << 8) | ((in[3] & 255) << 16);
    }

    private byte[] c(byte cmd) {
        Debug.fi(i, "in doCommand:" + ((int) cmd));
        synchronized (this.b) {
            this.e = null;
            if (!this.c.sendDataControlCommand(cmd)) {
                Debug.fi(i, "sendDataControlCommand:" + ((int) cmd) + " failed!!!");
                return null;
            }
            if (this.e == null) {
                try {
                    this.b.wait(5000L);
                } catch (InterruptedException unused) {
                }
            }
            Debug.fi(i, "out doCommand:" + ((int) cmd));
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(byte[] bArr) {
        try {
            this.g += bArr.length;
            Debug.fi(i, "total recv size:" + this.g + ",current recv size:" + bArr.length);
            ByteArrayOutputStream byteArrayOutputStream = this.h;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.write(bArr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x020b */
    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void doWork() throws Throwable {
        this.d.onSyncStart();
        byte b = 2;
        if (!this.c.registerDataControlNotification(RunningProfile.TYPE_SYNC_DATA, this)) {
            Debug.fi(i, "registerDataControlNotification failed!!!");
            this.d.onSyncFinish(new HMDeviceSyncDataError(2));
            return;
        }
        int i2 = 1;
        byte[] bArrC = c((byte) 1);
        ArrayList arrayList = new ArrayList();
        int iB = b(bArrC);
        this.f = iB;
        char c = 5;
        if (iB <= 0) {
            Debug.fi(i, "invalid total size:" + this.f);
            this.c.unRegisterDataControlNotification(RunningProfile.TYPE_SYNC_DATA);
            this.c.sendDataControlCommand((byte) 5);
            this.d.onSyncFinish(new HMDeviceSyncDataError(this.f == 0 ? (byte) 0 : (byte) 2));
            return;
        }
        if (!this.c.registerDataNotification(new IGattCallback.INotifyCallback() { // from class: he3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.d(bArr);
            }
        })) {
            Debug.fi(i, "registerDataNotification failed!!!");
            this.d.onSyncFinish(new HMDeviceSyncDataError(2));
            return;
        }
        int i3 = 0;
        loop0: while (true) {
            int i4 = 0;
            while (true) {
                byte[] bArrC2 = c(b);
                if (bArrC2 != null && (bArrC2.length != i2 || (bArrC2[0] & 255) != 130)) {
                    if (bArrC2.length != 12) {
                        Debug.fi(i, "Wrong data head,return now!!!");
                        break loop0;
                    }
                    byte b2 = bArrC2[0];
                    int i5 = (bArrC2[i2] & 255) | ((bArrC2[b] & 255) << 8);
                    int i6 = bArrC2[3] - 1;
                    byte b3 = bArrC2[4];
                    byte b4 = bArrC2[c];
                    byte b5 = bArrC2[6];
                    byte b6 = bArrC2[7];
                    byte b7 = bArrC2[8];
                    byte b8 = bArrC2[9];
                    byte b9 = bArrC2[10];
                    byte b10 = bArrC2[11];
                    GregorianCalendar gregorianCalendar = new GregorianCalendar(i5, i6, b3, b4, b5, b6);
                    int i7 = ((b8 & 255) << 8) | (b7 & 255) | ((b9 & 255) << 16) | ((b10 & 255) << 24);
                    Debug.fi(i, "type:" + ((int) b2) + ",len:" + i7 + ",date:" + new Date(gregorianCalendar.getTimeInMillis()).toString());
                    ActivityDataFragment activityDataFragment = new ActivityDataFragment(gregorianCalendar, i7);
                    this.e = null;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = this.h;
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                            this.h = null;
                        }
                        this.h = new ByteArrayOutputStream();
                    } catch (IOException unused) {
                    }
                    if (!this.c.sendDataControlCommand((byte) 3)) {
                        break loop0;
                    }
                    while (true) {
                        byte[] bArr = this.e;
                        if (bArr != null && (bArr[0] & 255) == 131) {
                            break;
                        }
                        Debug.fi(i, "mControlObj waiting data transfer~");
                        try {
                            synchronized (this.b) {
                                try {
                                    RunningProfile runningProfile = this.c;
                                    if (runningProfile != null && runningProfile.isConnected()) {
                                        this.b.wait(5000L);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            throw th;
                                        } catch (InterruptedException unused2) {
                                        }
                                    }
                                }
                            }
                            break;
                        } catch (InterruptedException unused3) {
                        }
                    }
                    byte[] byteArray = this.h.toByteArray();
                    int length = byteArray.length;
                    Debug.fi(i, "bytesOfData:" + length + ",dataLen:" + i7);
                    if (length == i7 && length % 3 == 0) {
                        for (int i8 = 0; i8 < i7; i8 += 3) {
                            activityDataFragment.addData(new ActivityRunningData(byteArray[i8], byteArray[i8 + 1], byteArray[i8 + 2]));
                            i3 += 3;
                            IHMActivityDataCallback iHMActivityDataCallback = this.d;
                            int i9 = this.f;
                            iHMActivityDataCallback.onSyncProgress(new Progress(i9, i3 > i9 ? i9 : i3));
                        }
                        arrayList.add(activityDataFragment);
                        break;
                    }
                    Debug.fi(i, "dataLen error,try count:" + i4);
                    if (i4 >= 2) {
                        break;
                    }
                    Debug.fi(i, "try sync again!!!");
                    c((byte) 4);
                    i4++;
                    b = 2;
                    i2 = 1;
                    c = 5;
                } else {
                    Debug.fi(i, "SYNC_DATA_CMD_HEAD stop!!!");
                    break loop0;
                }
            }
            b = 2;
            i2 = 1;
            c = 5;
        }
        RunningProfile runningProfile2 = this.c;
        if (runningProfile2 != null) {
            runningProfile2.unRegisterDataControlNotification(RunningProfile.TYPE_SYNC_DATA);
            this.c.sendDataControlCommand((byte) 5);
            this.c.unRegisterDataNotification();
        }
        this.d.onSyncStop(arrayList);
        this.d.onSyncFinish(new HMDeviceSyncDataError(0));
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
    public void notify(byte[] value) {
        synchronized (this.b) {
            Debug.fi(i, "sync data control notify:" + GattUtils.bytesToHexString(value));
            this.e = value;
            this.b.notify();
        }
    }
}
