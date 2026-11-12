package defpackage;

import android.text.TextUtils;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class jht extends i7t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jys f22820a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lbs f22821b = null;
    public ArrayList<xd> c = new ArrayList<>();
    public int d = 0;
    public int e = 0;

    public jht(jet jetVar, xd xdVar, jys jysVar) {
        ArrayList<xd> arrayList = new ArrayList<>();
        arrayList.add(xdVar);
        b(jetVar, arrayList, jysVar);
    }

    public final long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    public final void b(jet jetVar, ArrayList<xd> arrayList, jys jysVar) {
        this.f22821b = new lbs(jetVar);
        this.f22820a = jysVar;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        this.c.addAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:111:0x01db A[Catch: all -> 0x019a, Exception -> 0x019d, TRY_ENTER, TryCatch #10 {Exception -> 0x019d, blocks: (B:81:0x0183, B:83:0x018d, B:97:0x01ad, B:101:0x01b7, B:105:0x01c0, B:107:0x01c8, B:111:0x01db, B:115:0x01f5), top: B:160:0x01ad }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f5 A[Catch: all -> 0x019a, Exception -> 0x019d, TRY_LEAVE, TryCatch #10 {Exception -> 0x019d, blocks: (B:81:0x0183, B:83:0x018d, B:97:0x01ad, B:101:0x01b7, B:105:0x01c0, B:107:0x01c8, B:111:0x01db, B:115:0x01f5), top: B:160:0x01ad }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0202  */
    /* JADX WARN: Code duplicated, block: B:149:0x0239 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x024b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x01a0 A[EDGE_INSN: B:179:0x01a0->B:91:0x01a0 BREAK  A[LOOP:1: B:81:0x0183->B:181:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6 A[Catch: all -> 0x0090, Exception -> 0x0095, TRY_LEAVE, TryCatch #17 {Exception -> 0x0095, all -> 0x0090, blocks: (B:22:0x0087, B:31:0x00a2, B:29:0x009a, B:37:0x00b8, B:39:0x00c0, B:41:0x00d6, B:45:0x00e2, B:49:0x00ee, B:51:0x0112, B:52:0x0114, B:56:0x0135, B:58:0x0139, B:60:0x013d, B:62:0x0141, B:65:0x0148, B:70:0x0157, B:74:0x0169), top: B:170:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2 A[Catch: all -> 0x0090, Exception -> 0x0095, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0095, all -> 0x0090, blocks: (B:22:0x0087, B:31:0x00a2, B:29:0x009a, B:37:0x00b8, B:39:0x00c0, B:41:0x00d6, B:45:0x00e2, B:49:0x00ee, B:51:0x0112, B:52:0x0114, B:56:0x0135, B:58:0x0139, B:60:0x013d, B:62:0x0141, B:65:0x0148, B:70:0x0157, B:74:0x0169), top: B:170:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0112 A[Catch: all -> 0x0090, Exception -> 0x0095, TryCatch #17 {Exception -> 0x0095, all -> 0x0090, blocks: (B:22:0x0087, B:31:0x00a2, B:29:0x009a, B:37:0x00b8, B:39:0x00c0, B:41:0x00d6, B:45:0x00e2, B:49:0x00ee, B:51:0x0112, B:52:0x0114, B:56:0x0135, B:58:0x0139, B:60:0x013d, B:62:0x0141, B:65:0x0148, B:70:0x0157, B:74:0x0169), top: B:170:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0130 A[Catch: IOException -> 0x00b2, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x00b2, blocks: (B:32:0x00ac, B:43:0x00de, B:47:0x00ea, B:54:0x0130, B:72:0x0164), top: B:156:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0135 A[Catch: all -> 0x0090, Exception -> 0x0095, TRY_ENTER, TryCatch #17 {Exception -> 0x0095, all -> 0x0090, blocks: (B:22:0x0087, B:31:0x00a2, B:29:0x009a, B:37:0x00b8, B:39:0x00c0, B:41:0x00d6, B:45:0x00e2, B:49:0x00ee, B:51:0x0112, B:52:0x0114, B:56:0x0135, B:58:0x0139, B:60:0x013d, B:62:0x0141, B:65:0x0148, B:70:0x0157, B:74:0x0169), top: B:170:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0139 A[Catch: all -> 0x0090, Exception -> 0x0095, TryCatch #17 {Exception -> 0x0095, all -> 0x0090, blocks: (B:22:0x0087, B:31:0x00a2, B:29:0x009a, B:37:0x00b8, B:39:0x00c0, B:41:0x00d6, B:45:0x00e2, B:49:0x00ee, B:51:0x0112, B:52:0x0114, B:56:0x0135, B:58:0x0139, B:60:0x013d, B:62:0x0141, B:65:0x0148, B:70:0x0157, B:74:0x0169), top: B:170:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0145  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d A[Catch: all -> 0x019a, Exception -> 0x019d, TRY_LEAVE, TryCatch #10 {Exception -> 0x019d, blocks: (B:81:0x0183, B:83:0x018d, B:97:0x01ad, B:101:0x01b7, B:105:0x01c0, B:107:0x01c8, B:111:0x01db, B:115:0x01f5), top: B:160:0x01ad }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean c(String str, yd ydVar, boolean z, int i, jys jysVar) throws Throwable {
        String str2;
        BufferedInputStream bufferedInputStream;
        int i2;
        int i3;
        int i4;
        int iO;
        boolean z2;
        int i5;
        int i6;
        int i7;
        yd ydVar2 = ydVar;
        boolean z3 = z;
        String str3 = "Fail to operate on the firmware file";
        boolean z4 = false;
        z4 = false;
        int i8 = 0;
        if (!this.f22821b.init()) {
            return false;
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            File file = new File(str);
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                int length = (int) file.length();
                t5t.d("HMFirmwareUpgradeTask", "Device firmware: " + str + ", " + length + " bytes");
                try {
                    if (this.f22821b.c(length, ydVar2, z3, i) && this.f22821b.startTransfer()) {
                        byte[] bArr = new byte[20];
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int iA = 65535;
                        int i9 = 0;
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            String str4 = str3;
                            i10 += i11;
                            try {
                                if (i - 1 >= i10) {
                                    i2 = bufferedInputStream.read(bArr, 0, bArr.length);
                                    if (i2 < 1) {
                                        t5t.d("HMFirmwareUpgradeTask", "read firmware data size:" + i2);
                                        if ((z3 || this.f22821b.f(i8)) && this.f22821b.m()) {
                                            t5t.d("HMFirmwareUpgradeTask", String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(length / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                            i3 = length > 1048576 ? 15000 * (length / EventRecurrence.TH) : 15000;
                                            t5t.d("HMFirmwareUpgradeTask", "validate timeout:" + i3);
                                            if (!this.f22821b.b(iA, i3)) {
                                                bufferedInputStream.close();
                                            } else if (ydVar2 != yd.FIRMWARE_GPS || ydVar2 == yd.FIRMWARE_GPS_CEP || ydVar2 == yd.RESOURCE_COMPRESS || ydVar2 == yd.RESOURCE_BASE) {
                                                str2 = str4;
                                                i4 = 0;
                                                do {
                                                    iO = this.f22821b.o();
                                                    if (iO != 9) {
                                                        break;
                                                    }
                                                    Thread.sleep(5000L);
                                                    i4 += 5000;
                                                } while (i4 < 300000);
                                                if (iO == 1) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                try {
                                                    bufferedInputStream.close();
                                                } catch (IOException unused) {
                                                    t5t.d("HMFirmwareUpgradeTask", str2);
                                                }
                                            } else if (ydVar2 != yd.FIRMWARE) {
                                                try {
                                                    bufferedInputStream.close();
                                                    z4 = true;
                                                } catch (IOException unused2) {
                                                    z4 = true;
                                                    str2 = str4;
                                                    t5t.d("HMFirmwareUpgradeTask", str2);
                                                }
                                            } else {
                                                t5t.d("HMFirmwareUpgradeTask", "reboot..................");
                                                if (this.f22821b.p()) {
                                                    this.f22821b.enableRefreshGatt(true);
                                                    Thread.sleep(VibrateModeProgressBar.sLongToLong);
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (IOException unused3) {
                                                        t5t.d("HMFirmwareUpgradeTask", str4);
                                                    }
                                                    this.f22821b.deInit();
                                                    return true;
                                                }
                                                bufferedInputStream.close();
                                            }
                                        } else {
                                            bufferedInputStream.close();
                                        }
                                        z4 = false;
                                    } else {
                                        str2 = str4;
                                        try {
                                            try {
                                                iA = tet.a(iA, bArr, 0, i2);
                                                if (i2 < bArr.length) {
                                                    try {
                                                        byte[] bArr2 = new byte[i2];
                                                        z2 = false;
                                                        System.arraycopy(bArr, 0, bArr2, 0, i2);
                                                        bArr = bArr2;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        bufferedInputStream2 = bufferedInputStream;
                                                        try {
                                                            t5t.d("HMFirmwareUpgradeTask", "exception happend!!:" + e.getMessage());
                                                            if (bufferedInputStream2 != null) {
                                                                try {
                                                                    bufferedInputStream2.close();
                                                                } catch (IOException unused4) {
                                                                    z4 = false;
                                                                    t5t.d("HMFirmwareUpgradeTask", str2);
                                                                }
                                                            }
                                                            z4 = false;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            bufferedInputStream = bufferedInputStream2;
                                                            if (bufferedInputStream != null) {
                                                                try {
                                                                    bufferedInputStream.close();
                                                                } catch (IOException unused5) {
                                                                    t5t.d("HMFirmwareUpgradeTask", str2);
                                                                }
                                                            }
                                                            this.f22821b.deInit();
                                                            throw th;
                                                        }
                                                    }
                                                } else {
                                                    z2 = false;
                                                }
                                                if (this.f22821b.j(bArr)) {
                                                    i5 = this.e + i2;
                                                    this.e = i5;
                                                    i8 += i2;
                                                    byte[] bArr3 = bArr;
                                                    i6 = (int) ((i8 * 100.0f) / length);
                                                    i7 = i9;
                                                    if (i7 < i6) {
                                                        if (jysVar != null) {
                                                            jysVar.onFwProgress(new Progress(this.d, i5));
                                                        }
                                                        i7 = i6;
                                                    }
                                                    z3 = z;
                                                    i9 = i7;
                                                    bArr = bArr3;
                                                    ydVar2 = ydVar;
                                                    i11 = i2;
                                                    str3 = str2;
                                                } else {
                                                    t5t.d("HMFirmwareUpgradeTask", "write firmware data failed!!!");
                                                    this.f22821b.stopTransfer(iA);
                                                    try {
                                                        bufferedInputStream.close();
                                                        z4 = z2;
                                                    } catch (IOException unused6) {
                                                        z4 = z2;
                                                        t5t.d("HMFirmwareUpgradeTask", str2);
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (bufferedInputStream != null) {
                                                bufferedInputStream.close();
                                            }
                                            this.f22821b.deInit();
                                            throw th;
                                        }
                                    }
                                } else if (z3) {
                                    try {
                                        if (!this.f22821b.f(i8)) {
                                            t5t.d("HMFirmwareUpgradeTask", "write DFU_OPCODE_DUMMY failed!!!");
                                            this.f22821b.stopTransfer(iA);
                                            bufferedInputStream.close();
                                            z4 = false;
                                        }
                                        i10 = 0;
                                        i2 = bufferedInputStream.read(bArr, 0, bArr.length);
                                        if (i2 < 1) {
                                            t5t.d("HMFirmwareUpgradeTask", "read firmware data size:" + i2);
                                            if (z3) {
                                                t5t.d("HMFirmwareUpgradeTask", String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(length / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                                if (length > 1048576) {
                                                }
                                                t5t.d("HMFirmwareUpgradeTask", "validate timeout:" + i3);
                                                if (!this.f22821b.b(iA, i3)) {
                                                    bufferedInputStream.close();
                                                } else if (ydVar2 != yd.FIRMWARE_GPS) {
                                                    str2 = str4;
                                                    i4 = 0;
                                                    do {
                                                        iO = this.f22821b.o();
                                                        if (iO != 9) {
                                                            break;
                                                            break;
                                                        }
                                                        Thread.sleep(5000L);
                                                        i4 += 5000;
                                                    } while (i4 < 300000);
                                                    if (iO == 1) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    bufferedInputStream.close();
                                                } else {
                                                    str2 = str4;
                                                    i4 = 0;
                                                    do {
                                                        iO = this.f22821b.o();
                                                        if (iO != 9) {
                                                            break;
                                                            break;
                                                        }
                                                        Thread.sleep(5000L);
                                                        i4 += 5000;
                                                    } while (i4 < 300000);
                                                    if (iO == 1) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    bufferedInputStream.close();
                                                }
                                                z4 = false;
                                            } else {
                                                t5t.d("HMFirmwareUpgradeTask", String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(length / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                                if (length > 1048576) {
                                                }
                                                t5t.d("HMFirmwareUpgradeTask", "validate timeout:" + i3);
                                                if (!this.f22821b.b(iA, i3)) {
                                                    bufferedInputStream.close();
                                                } else if (ydVar2 != yd.FIRMWARE_GPS) {
                                                    str2 = str4;
                                                    i4 = 0;
                                                    do {
                                                        iO = this.f22821b.o();
                                                        if (iO != 9) {
                                                            break;
                                                            break;
                                                        }
                                                        Thread.sleep(5000L);
                                                        i4 += 5000;
                                                    } while (i4 < 300000);
                                                    if (iO == 1) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    bufferedInputStream.close();
                                                } else {
                                                    str2 = str4;
                                                    i4 = 0;
                                                    do {
                                                        iO = this.f22821b.o();
                                                        if (iO != 9) {
                                                            break;
                                                            break;
                                                        }
                                                        Thread.sleep(5000L);
                                                        i4 += 5000;
                                                    } while (i4 < 300000);
                                                    if (iO == 1) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    bufferedInputStream.close();
                                                }
                                                z4 = false;
                                            }
                                        } else {
                                            str2 = str4;
                                            iA = tet.a(iA, bArr, 0, i2);
                                            if (i2 < bArr.length) {
                                                byte[] bArr4 = new byte[i2];
                                                z2 = false;
                                                System.arraycopy(bArr, 0, bArr4, 0, i2);
                                                bArr = bArr4;
                                            } else {
                                                z2 = false;
                                            }
                                            if (this.f22821b.j(bArr)) {
                                                t5t.d("HMFirmwareUpgradeTask", "write firmware data failed!!!");
                                                this.f22821b.stopTransfer(iA);
                                                bufferedInputStream.close();
                                                z4 = z2;
                                            } else {
                                                i5 = this.e + i2;
                                                this.e = i5;
                                                i8 += i2;
                                                byte[] bArr5 = bArr;
                                                i6 = (int) ((i8 * 100.0f) / length);
                                                i7 = i9;
                                                if (i7 < i6) {
                                                    if (jysVar != null) {
                                                        jysVar.onFwProgress(new Progress(this.d, i5));
                                                    }
                                                    i7 = i6;
                                                }
                                                z3 = z;
                                                i9 = i7;
                                                bArr = bArr5;
                                                ydVar2 = ydVar;
                                                i11 = i2;
                                                str3 = str2;
                                            }
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        str2 = str4;
                                        bufferedInputStream2 = bufferedInputStream;
                                        t5t.d("HMFirmwareUpgradeTask", "exception happend!!:" + e.getMessage());
                                        if (bufferedInputStream2 != null) {
                                            bufferedInputStream2.close();
                                        }
                                        z4 = false;
                                        this.f22821b.deInit();
                                        return z4;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str2 = str4;
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                        }
                                        this.f22821b.deInit();
                                        throw th;
                                    }
                                } else {
                                    if (!this.f22821b.n()) {
                                        t5t.d("HMFirmwareUpgradeTask", "write DFU_OPCODE_DUMMY failed!!!");
                                        this.f22821b.stopTransfer(iA);
                                        bufferedInputStream.close();
                                        z4 = false;
                                    }
                                    i10 = 0;
                                    i2 = bufferedInputStream.read(bArr, 0, bArr.length);
                                    if (i2 < 1) {
                                        t5t.d("HMFirmwareUpgradeTask", "read firmware data size:" + i2);
                                        if (z3) {
                                            t5t.d("HMFirmwareUpgradeTask", String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(length / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                            if (length > 1048576) {
                                            }
                                            t5t.d("HMFirmwareUpgradeTask", "validate timeout:" + i3);
                                            if (!this.f22821b.b(iA, i3)) {
                                                bufferedInputStream.close();
                                            } else if (ydVar2 != yd.FIRMWARE_GPS) {
                                                str2 = str4;
                                                i4 = 0;
                                                do {
                                                    iO = this.f22821b.o();
                                                    if (iO != 9) {
                                                        break;
                                                        break;
                                                    }
                                                    Thread.sleep(5000L);
                                                    i4 += 5000;
                                                } while (i4 < 300000);
                                                if (iO == 1) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                bufferedInputStream.close();
                                            } else {
                                                str2 = str4;
                                                i4 = 0;
                                                do {
                                                    iO = this.f22821b.o();
                                                    if (iO != 9) {
                                                        break;
                                                        break;
                                                    }
                                                    Thread.sleep(5000L);
                                                    i4 += 5000;
                                                } while (i4 < 300000);
                                                if (iO == 1) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                bufferedInputStream.close();
                                            }
                                            z4 = false;
                                        } else {
                                            t5t.d("HMFirmwareUpgradeTask", String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(length / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                            if (length > 1048576) {
                                            }
                                            t5t.d("HMFirmwareUpgradeTask", "validate timeout:" + i3);
                                            if (!this.f22821b.b(iA, i3)) {
                                                bufferedInputStream.close();
                                            } else if (ydVar2 != yd.FIRMWARE_GPS) {
                                                str2 = str4;
                                                i4 = 0;
                                                do {
                                                    iO = this.f22821b.o();
                                                    if (iO != 9) {
                                                        break;
                                                        break;
                                                    }
                                                    Thread.sleep(5000L);
                                                    i4 += 5000;
                                                } while (i4 < 300000);
                                                if (iO == 1) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                bufferedInputStream.close();
                                            } else {
                                                str2 = str4;
                                                i4 = 0;
                                                do {
                                                    iO = this.f22821b.o();
                                                    if (iO != 9) {
                                                        break;
                                                        break;
                                                    }
                                                    Thread.sleep(5000L);
                                                    i4 += 5000;
                                                } while (i4 < 300000);
                                                if (iO == 1) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                bufferedInputStream.close();
                                            }
                                            z4 = false;
                                        }
                                    } else {
                                        str2 = str4;
                                        iA = tet.a(iA, bArr, 0, i2);
                                        if (i2 < bArr.length) {
                                            byte[] bArr6 = new byte[i2];
                                            z2 = false;
                                            System.arraycopy(bArr, 0, bArr6, 0, i2);
                                            bArr = bArr6;
                                        } else {
                                            z2 = false;
                                        }
                                        if (this.f22821b.j(bArr)) {
                                            t5t.d("HMFirmwareUpgradeTask", "write firmware data failed!!!");
                                            this.f22821b.stopTransfer(iA);
                                            bufferedInputStream.close();
                                            z4 = z2;
                                        } else {
                                            i5 = this.e + i2;
                                            this.e = i5;
                                            i8 += i2;
                                            byte[] bArr7 = bArr;
                                            i6 = (int) ((i8 * 100.0f) / length);
                                            i7 = i9;
                                            if (i7 < i6) {
                                                if (jysVar != null) {
                                                    jysVar.onFwProgress(new Progress(this.d, i5));
                                                }
                                                i7 = i6;
                                            }
                                            z3 = z;
                                            i9 = i7;
                                            bArr = bArr7;
                                            ydVar2 = ydVar;
                                            i11 = i2;
                                            str3 = str2;
                                        }
                                    }
                                }
                            } catch (IOException unused7) {
                                str2 = str4;
                                z4 = false;
                                t5t.d("HMFirmwareUpgradeTask", str2);
                                this.f22821b.deInit();
                                return z4;
                            }
                        }
                    } else {
                        bufferedInputStream.close();
                    }
                } catch (IOException unused8) {
                    str2 = "Fail to operate on the firmware file";
                }
            } catch (Exception e4) {
                e = e4;
                str2 = "Fail to operate on the firmware file";
            } catch (Throwable th4) {
                th = th4;
                str2 = "Fail to operate on the firmware file";
            }
        } catch (Exception e5) {
            e = e5;
            str2 = "Fail to operate on the firmware file";
        } catch (Throwable th5) {
            th = th5;
            str2 = "Fail to operate on the firmware file";
            bufferedInputStream = bufferedInputStream2;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            this.f22821b.deInit();
            throw th;
        }
        this.f22821b.deInit();
        return z4;
    }

    @Override // defpackage.i7t
    public void doWork() {
        this.f22820a.a(0);
        if (this.c.size() == 0) {
            this.f22820a.onFwStop(false);
            return;
        }
        Iterator<xd> it = this.c.iterator();
        while (it.hasNext()) {
            long jA = a(it.next().g());
            if (jA <= 0) {
                t5t.d("HMFirmwareUpgradeTask", "invalid file size：" + jA);
            } else {
                this.d = (int) (((long) this.d) + jA);
            }
        }
        t5t.d("HMFirmwareUpgradeTask", "total size : " + this.d);
        boolean zC = true;
        for (xd xdVar : this.c) {
            if (a(xdVar.g()) > 0) {
                zC &= c(xdVar.g(), xdVar.h(), xdVar.l(), xdVar.i(), this.f22820a);
            }
        }
        t5t.d("HMFirmwareUpgradeTask", "upgrade ret : " + zC);
        this.f22820a.onFwStop(zC);
    }
}
