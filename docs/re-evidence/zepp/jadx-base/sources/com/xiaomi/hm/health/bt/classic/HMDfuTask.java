package com.xiaomi.hm.health.bt.classic;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes19.dex */
public class HMDfuTask extends HMBaseTask {
    private static final String h = "HMDfuTask";
    private static final int i = 5000;
    private static final int j = 600000;
    private static final int k = 20000;
    private static final int l = 10000;
    private static final long m = 20000;
    private IHMFirmwareUpgradeCallback b;
    private HMDfuProfile c;
    private HMFirmwareInfo d;
    private ClassicConnection e;
    private CountDownLatch f = new CountDownLatch(1);
    private ClassicConnection.IConnectionCallback g = new ClassicConnection.IConnectionCallback() { // from class: bu2
        @Override // com.xiaomi.hm.health.bt.classic.ClassicConnection.IConnectionCallback
        public final void onStateChanged(int i2) {
            this.a.d(i2);
        }
    };

    public HMDfuTask(ITransport transport, HMFirmwareInfo info, IHMFirmwareUpgradeCallback callback) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.c = new HMDfuProfile(transport);
        this.e = (ClassicConnection) transport;
        this.b = callback;
        this.d = info;
    }

    private long b(BufferedInputStream inputStream, int size) throws IOException {
        Debug.i(h, "size:" + size);
        byte[] bArr = new byte[size];
        inputStream.mark(size);
        Debug.i(h, "read size:" + inputStream.read(bArr));
        inputStream.reset();
        long jCrc16 = (long) GattUtils.crc16(65535, bArr, 0, size);
        Debug.i(h, "crc:" + jCrc16);
        return jCrc16;
    }

    private long c(BufferedInputStream inputStream, int size) throws IOException {
        Debug.i(h, "size:" + size);
        inputStream.mark(size);
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[4096];
        int i2 = 0;
        while (i2 + 4096 <= size) {
            int i3 = inputStream.read(bArr, 0, 4096);
            crc32.update(bArr, 0, i3);
            i2 += i3;
        }
        int i4 = inputStream.read(bArr, 0, size - i2);
        crc32.update(bArr, 0, i4);
        Debug.i(h, "read size:" + (i2 + i4));
        inputStream.reset();
        long value = crc32.getValue();
        Debug.i(h, "crc:" + value + "," + Long.toHexString(value));
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i2) {
        if (i2 == 2) {
            Debug.fi(h, "disconnect~");
            this.f.countDown();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x009c  */
    private boolean e(final String path, final HMFirmwareType type, int syncSize, final IHMFirmwareUpgradeCallback pcb) throws Throwable {
        byte b;
        int state;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(path));
                try {
                    int iAvailable = bufferedInputStream2.available();
                    long jC = c(bufferedInputStream2, bufferedInputStream2.available());
                    long[] fwInfo = this.c.getFwInfo(type.getValue(), iAvailable, jC, (short) 0);
                    if (fwInfo == null) {
                        Debug.fi(h, "get fw info failed!!!");
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused) {
                            Debug.fi(h, "Fail to operate on the firmware file");
                        }
                        return false;
                    }
                    int i2 = (int) fwInfo[0];
                    long j2 = fwInfo[1];
                    Debug.fi(h, "total size:" + iAvailable + ",total crc:" + jC + ",device size:" + i2 + ",device crc:" + j2);
                    if (i2 > 0) {
                        long jC2 = c(bufferedInputStream2, i2);
                        Debug.i(h, "local crc:" + jC2);
                        if (jC2 == j2) {
                            iAvailable -= i2;
                            bufferedInputStream2.skip(i2);
                            b = 0;
                        } else {
                            b = 1;
                        }
                    } else {
                        b = 1;
                    }
                    if (!this.c.start(b)) {
                        Debug.fi(h, "start failed!!!");
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused2) {
                            Debug.fi(h, "Fail to operate on the firmware file");
                        }
                        return false;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        byte[] bArr = new byte[512];
                        int i8 = i3 + i4;
                        if (syncSize - 1 < i8) {
                            if (!this.c.dummy()) {
                                Debug.fi(h, "write DFU_OPCODE_DUMMY failed!!!");
                                this.c.stop(10000);
                                try {
                                    bufferedInputStream2.close();
                                    return false;
                                } catch (IOException unused3) {
                                    Debug.fi(h, "Fail to operate on the firmware file");
                                    return false;
                                }
                            }
                            i8 = 0;
                        }
                        int i9 = i8;
                        int i10 = bufferedInputStream2.read(bArr, 0, 512);
                        if (i10 < 1) {
                            Debug.fi(h, "read firmware data size:" + i10);
                            Debug.fi(h, String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(((float) iAvailable) / ((float) (System.currentTimeMillis() - jCurrentTimeMillis)))));
                            int i11 = type == HMFirmwareType.FIRMWARE_NB ? 20000 : 10000;
                            if (iAvailable > 1048576) {
                                i11 *= ((iAvailable + 1048576) - 1) / 1048576;
                            }
                            Debug.fi(h, "stop timeout:" + i11);
                            if (!this.c.stop(i11)) {
                                Debug.fi(h, "stop failed!!!");
                                try {
                                    bufferedInputStream2.close();
                                    return false;
                                } catch (IOException unused4) {
                                    Debug.fi(h, "Fail to operate on the firmware file");
                                    return false;
                                }
                            }
                            if (type != HMFirmwareType.FIRMWARE_GPS && type != HMFirmwareType.FIRMWARE_GPS_ALM && type != HMFirmwareType.FIRMWARE_GPS_CEP && type != HMFirmwareType.RESOURCE_COMPRESS && type != HMFirmwareType.RESOURCE_BASE) {
                                if (type == HMFirmwareType.FIRMWARE) {
                                    if (!this.c.activate()) {
                                        Debug.fi(h, "activate failed!!!");
                                        try {
                                            bufferedInputStream2.close();
                                            return false;
                                        } catch (IOException unused5) {
                                            Debug.fi(h, "Fail to operate on the firmware file");
                                            return false;
                                        }
                                    }
                                    this.e.setConnectionCallback(this.g);
                                    Debug.fi(h, "start wait for disconnect");
                                    this.f.await(20000L, TimeUnit.MILLISECONDS);
                                    this.e.r(this.g);
                                }
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException unused6) {
                                    Debug.fi(h, "Fail to operate on the firmware file");
                                }
                                return true;
                            }
                            int i12 = 0;
                            do {
                                state = this.c.getState();
                                if (state != 9) {
                                    break;
                                }
                                Thread.sleep(5000L);
                                i12 += 5000;
                            } while (i12 < 600000);
                            boolean z = state == 1;
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException unused7) {
                                Debug.fi(h, "Fail to operate on the firmware file");
                            }
                            return z;
                        }
                        if (i10 < 512) {
                            byte[] bArr2 = new byte[i10];
                            System.arraycopy(bArr, 0, bArr2, 0, i10);
                            bArr = bArr2;
                        }
                        if (!this.c.sendData(bArr)) {
                            Debug.fi(h, "write firmware data failed!!!");
                            this.c.stop(10000);
                            try {
                                bufferedInputStream2.close();
                                return false;
                            } catch (IOException unused8) {
                                Debug.fi(h, "Fail to operate on the firmware file");
                                return false;
                            }
                        }
                        i5 += i10;
                        i7 += i10;
                        int i13 = i7 * 100;
                        if (i6 * iAvailable < i13) {
                            i6 = i13 / iAvailable;
                            if (pcb != null) {
                                pcb.onFwProgress(new Progress(iAvailable, i5));
                            }
                        }
                        if (this.c.getDfuState() != 1) {
                            Debug.fi(h, "notify error state:" + this.c.getDfuState());
                            this.c.stop(10000);
                            try {
                                bufferedInputStream2.close();
                                return false;
                            } catch (IOException unused9) {
                                Debug.fi(h, "Fail to operate on the firmware file");
                                return false;
                            }
                        }
                        i4 = i10;
                        i3 = i9;
                    }
                } catch (Exception e) {
                    e = e;
                    bufferedInputStream = bufferedInputStream2;
                    Debug.fi(h, "upgrade exception:" + e.getMessage());
                    if (bufferedInputStream == null) {
                        return false;
                    }
                    try {
                        bufferedInputStream.close();
                        return false;
                    } catch (IOException unused10) {
                        Debug.fi(h, "Fail to operate on the firmware file");
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused11) {
                            Debug.fi(h, "Fail to operate on the firmware file");
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() throws Throwable {
        this.b.onFwStart(0);
        Debug.fi(h, "HMFirmwareInfo:" + this.d);
        boolean zE = e(this.d.getFwPath(), this.d.getFwType(), this.d.getSyncSize(), this.b);
        Debug.fi(h, "upgrade ret : " + zE);
        this.b.onFwStop(zE);
    }
}
