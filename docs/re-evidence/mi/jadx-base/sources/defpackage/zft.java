package defpackage;

import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes3.dex */
public class zft extends i7t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jys f41235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yh f41236b;
    public oft c;
    public zat d;
    public xd e;

    public zft(jet jetVar, xd xdVar, jys jysVar) {
        this.c = new oft(jetVar);
        this.f41235a = jysVar;
        this.e = xdVar;
        if (jysVar instanceof zat) {
            this.d = (zat) jysVar;
        }
        if (jysVar instanceof yh) {
            this.f41236b = (yh) jysVar;
        }
    }

    public final int a() throws InterruptedException {
        while (true) {
            int iQ = this.c.q();
            if (iQ != 9) {
                return iQ;
            }
            Thread.sleep(5000L);
        }
    }

    public final long b(BufferedInputStream bufferedInputStream, int i) throws IOException {
        t5t.m("dfu.HMDfuTask", "size:" + i);
        bufferedInputStream.mark(i);
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[4096];
        int i2 = 0;
        while (i2 + 4096 <= i) {
            int i3 = bufferedInputStream.read(bArr, 0, 4096);
            crc32.update(bArr, 0, i3);
            i2 += i3;
        }
        int i4 = bufferedInputStream.read(bArr, 0, i - i2);
        crc32.update(bArr, 0, i4);
        t5t.m("dfu.HMDfuTask", "read size:" + (i2 + i4));
        bufferedInputStream.reset();
        long value = crc32.getValue();
        t5t.m("dfu.HMDfuTask", "crc:" + value + "," + Long.toHexString(value));
        return value;
    }

    public final void c(String str) {
        zat zatVar = this.d;
        if (zatVar != null) {
            if (str == null) {
                str = "";
            }
            zatVar.a(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    public final boolean d(String str, yd ydVar, int i, xd.a aVar, boolean z, int i2, jys jysVar) throws Throwable {
        int iA;
        boolean z2;
        BufferedInputStream bufferedInputStream;
        byte b2;
        int i3;
        if (!this.c.init()) {
            t5t.d("dfu.HMDfuTask", "profile init failed!!!");
            return false;
        }
        if (wbt.f) {
            u5t u5tVarO = this.c.o();
            t5t.d("dfu.HMDfuTask", "DfuConfig:" + u5tVarO);
            if (u5tVarO != null) {
                iA = u5tVarO.a() > 0 ? u5tVarO.a() : i;
                if (u5tVarO.d() == 1) {
                    z2 = true;
                }
            } else {
                iA = i;
            }
            z2 = false;
        } else {
            iA = i;
            z2 = false;
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
                try {
                    int iAvailable = bufferedInputStream.available();
                    long jB = b(bufferedInputStream, bufferedInputStream.available());
                    long[] jArrD = this.c.d(ydVar.a(), iAvailable, jB, z2 ? (short) iA : (short) -1, aVar.a(), i2);
                    if (jArrD == null) {
                        t5t.d("dfu.HMDfuTask", "get fw info failed!!!");
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused) {
                            t5t.d("dfu.HMDfuTask", "Fail to operate on the firmware file");
                        }
                        this.c.deInit();
                        return false;
                    }
                    int i4 = (int) jArrD[0];
                    long j = jArrD[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("total size:");
                    sb.append(iAvailable);
                    sb.append(",total crc:");
                    int i5 = iA;
                    sb.append(jB);
                    sb.append(",device size:");
                    sb.append(i4);
                    sb.append(",device crc:");
                    sb.append(j);
                    t5t.d("dfu.HMDfuTask", sb.toString());
                    if (i4 > 0) {
                        long jB2 = b(bufferedInputStream, i4);
                        t5t.m("dfu.HMDfuTask", "local crc:" + jB2);
                        if (jB2 == j) {
                            iAvailable -= i4;
                            t5t.d("dfu.HMDfuTask", "skip:" + bufferedInputStream.skip(i4) + ",size:" + i4);
                            b2 = 0;
                        } else {
                            b2 = 1;
                        }
                    } else {
                        b2 = 1;
                    }
                    if (!this.c.f(b2)) {
                        t5t.d("dfu.HMDfuTask", "start failed!!!");
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused2) {
                            t5t.d("dfu.HMDfuTask", "Fail to operate on the firmware file");
                        }
                        this.c.deInit();
                        return false;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jysVar != null) {
                        jysVar.onFwProgress(new Progress(iAvailable, 0));
                    }
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        int iD = this.c.getMtu().d();
                        int i11 = i9;
                        byte[] bArr = new byte[iD];
                        int i12 = i10;
                        i6 += i7;
                        if (i5 - 1 < i6) {
                            if (z2) {
                                if (!this.c.g(i8)) {
                                    break;
                                }
                                i6 = 0;
                            } else {
                                if (!this.c.m()) {
                                    break;
                                }
                                i6 = 0;
                            }
                        }
                        i7 = bufferedInputStream.read(bArr, 0, iD);
                        if (i7 < 1) {
                            t5t.d("dfu.HMDfuTask", "read firmware data size:" + i7);
                            if (z2 && !this.c.g(i8)) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused3) {
                                    t5t.d("dfu.HMDfuTask", "Fail to operate on the firmware file");
                                }
                                this.c.deInit();
                                return false;
                            }
                            t5t.d("dfu.HMDfuTask", String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(iAvailable / (System.currentTimeMillis() - jCurrentTimeMillis))));
                            int i13 = ydVar == yd.FIRMWARE_NB ? ErrorCode.ERROR_CODE_INVALID_PARAM : 10000;
                            if (iAvailable > 1048576) {
                                i13 *= (iAvailable + 1048575) / EventRecurrence.TH;
                            }
                            t5t.d("dfu.HMDfuTask", "stop timeout:" + i13);
                            if (!this.c.h(i13)) {
                                t5t.d("dfu.HMDfuTask", "stop failed!!!");
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused4) {
                                    t5t.d("dfu.HMDfuTask", "Fail to operate on the firmware file");
                                }
                                this.c.deInit();
                                return false;
                            }
                            int iA2 = f(ydVar) ? a() : 1;
                            if (iA2 == 68) {
                                this.f41236b.onError(bm.GPS_UPGRADE_FAILED.getT());
                            }
                            if (e(ydVar)) {
                                i3 = 1;
                                if (iA2 == 1) {
                                    if (!this.c.n()) {
                                        t5t.d("dfu.HMDfuTask", "activate failed!!!");
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException unused5) {
                                            t5t.d("dfu.HMDfuTask", "Fail to operate on the firmware file");
                                        }
                                        this.c.deInit();
                                        return false;
                                    }
                                    this.c.enableRefreshGatt(true);
                                    Thread.sleep(VibrateModeProgressBar.sLongToLong);
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException unused6) {
                                        t5t.d("dfu.HMDfuTask", "Fail to operate on the firmware file");
                                    }
                                    this.c.deInit();
                                    return true;
                                }
                            } else {
                                i3 = 1;
                            }
                            boolean z3 = iA2 == i3;
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused7) {
                                t5t.d("dfu.HMDfuTask", "Fail to operate on the firmware file");
                            }
                            this.c.deInit();
                            return z3;
                        }
                        if (i7 < iD) {
                            byte[] bArr2 = new byte[i7];
                            System.arraycopy(bArr, 0, bArr2, 0, i7);
                            bArr = bArr2;
                        }
                        if (!this.c.j(bArr)) {
                            t5t.d("dfu.HMDfuTask", "write firmware data failed!!!");
                            this.c.h(10000);
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused8) {
                                t5t.d("dfu.HMDfuTask", "Fail to operate on the firmware file");
                            }
                            this.c.deInit();
                            return false;
                        }
                        i10 = i12 + i7;
                        i8 += i7;
                        int i14 = (int) ((i8 * 100.0f) / iAvailable);
                        i9 = i11;
                        if (i9 < i14) {
                            if (jysVar != null) {
                                jysVar.onFwProgress(new Progress(iAvailable, i10));
                            }
                            i9 = i14;
                        }
                        if (this.c.p() != 1) {
                            t5t.d("dfu.HMDfuTask", "notify error state:" + this.c.p());
                            this.c.h(10000);
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused9) {
                                t5t.d("dfu.HMDfuTask", "Fail to operate on the firmware file");
                            }
                            this.c.deInit();
                            return false;
                        }
                    }
                    t5t.d("dfu.HMDfuTask", "write DFU_OPCODE_DUMMY failed!!!");
                    this.c.h(10000);
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused10) {
                        t5t.d("dfu.HMDfuTask", "Fail to operate on the firmware file");
                    }
                    this.c.deInit();
                    return false;
                } catch (Exception e) {
                    e = e;
                    bufferedInputStream2 = bufferedInputStream;
                    t5t.d("dfu.HMDfuTask", "upgrade exception:" + e.getMessage());
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused11) {
                            t5t.d("dfu.HMDfuTask", "Fail to operate on the firmware file");
                        }
                    }
                    this.c.deInit();
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused12) {
                            t5t.d("dfu.HMDfuTask", "Fail to operate on the firmware file");
                        }
                    }
                    this.c.deInit();
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = bufferedInputStream2;
        }
    }

    @Override // defpackage.i7t
    public void doWork() throws Throwable {
        this.f41235a.a(0);
        yet lEParams = this.c.getLEParams();
        t5t.d("dfu.HMDfuTask", "leParams:" + lEParams);
        c("leParams:" + lEParams);
        if (lEParams != null && lEParams.a() > 12) {
            this.c.setLEParams(6, 12, 0, 2000);
            try {
                Thread.sleep((long) Math.ceil(lEParams.a() * 1.25f * 6.0f));
            } catch (Exception unused) {
            }
        }
        t5t.d("dfu.HMDfuTask", "HMFirmwareInfo:" + this.e);
        boolean zD = d(this.e.g(), this.e.h(), this.e.i(), this.e.f(), this.e.k(), this.e.a(), this.f41235a);
        c("HMFirmwareInfo:" + this.e);
        t5t.d("dfu.HMDfuTask", "upgrade ret : " + zD);
        c("upgrade ret : " + zD);
        this.f41235a.onFwStop(zD);
    }

    public final boolean e(yd ydVar) {
        return ydVar == yd.FIRMWARE;
    }

    public final boolean f(yd ydVar) {
        return ydVar == yd.FIRMWARE_GPS || ydVar == yd.FIRMWARE_GPS_ALM || ydVar == yd.FIRMWARE_GPS_CEP || ydVar == yd.RESOURCE_COMPRESS || ydVar == yd.RESOURCE_BASE || ydVar == yd.FIRMWARE_DIAL || ydVar == yd.FIRMWARE_BATCH || ydVar == yd.FIRMWARE_GNS_ALM;
    }
}
