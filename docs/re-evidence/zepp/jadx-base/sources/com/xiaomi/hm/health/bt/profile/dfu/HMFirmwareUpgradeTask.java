package com.xiaomi.hm.health.bt.profile.dfu;

import android.text.TextUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class HMFirmwareUpgradeTask extends HMBaseTask {
    private static final String g = "HMFirmwareUpgradeTask";
    private static final int h = 5000;
    private static final int i = 300000;
    private IHMFirmwareUpgradeCallback b = null;
    private HMFwUpgradeProfile c = null;
    private ArrayList<HMFirmwareInfo> d = new ArrayList<>();
    private int e = 0;
    private int f = 0;

    public HMFirmwareUpgradeTask(GattPeripheral gattPeripheral, HMFirmwareInfo firmwareInfo, IHMFirmwareUpgradeCallback callback) {
        ArrayList<HMFirmwareInfo> arrayList = new ArrayList<>();
        arrayList.add(firmwareInfo);
        b(gattPeripheral, arrayList, callback);
    }

    private long a(String path) {
        if (TextUtils.isEmpty(path)) {
            return 0L;
        }
        File file = new File(path);
        if (file.exists()) {
            return file.length();
        }
        return 0L;
    }

    private void b(GattPeripheral gattPeripheral, ArrayList<HMFirmwareInfo> infos, IHMFirmwareUpgradeCallback callback) {
        this.c = new HMFwUpgradeProfile(gattPeripheral);
        this.b = callback;
        if (infos == null || infos.size() <= 0) {
            return;
        }
        this.d.addAll(infos);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c7 A[Catch: all -> 0x0202, Exception -> 0x0205, TRY_ENTER, TryCatch #9 {Exception -> 0x0205, all -> 0x0202, blocks: (B:7:0x002d, B:14:0x0068, B:19:0x0076, B:20:0x0080, B:23:0x0088, B:28:0x0099, B:26:0x0091, B:35:0x00b2, B:37:0x00ba, B:39:0x00d0, B:43:0x00dc, B:47:0x00e8, B:49:0x010d, B:50:0x0110, B:54:0x0131, B:56:0x0137, B:58:0x013b, B:60:0x013f, B:63:0x0144, B:70:0x0155, B:74:0x0167, B:81:0x017f, B:83:0x0189, B:92:0x01a2, B:94:0x01a9, B:95:0x01b0, B:97:0x01b8, B:100:0x01c7, B:104:0x01e1), top: B:140:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01db  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e1 A[Catch: all -> 0x0202, Exception -> 0x0205, TRY_LEAVE, TryCatch #9 {Exception -> 0x0205, all -> 0x0202, blocks: (B:7:0x002d, B:14:0x0068, B:19:0x0076, B:20:0x0080, B:23:0x0088, B:28:0x0099, B:26:0x0091, B:35:0x00b2, B:37:0x00ba, B:39:0x00d0, B:43:0x00dc, B:47:0x00e8, B:49:0x010d, B:50:0x0110, B:54:0x0131, B:56:0x0137, B:58:0x013b, B:60:0x013f, B:63:0x0144, B:70:0x0155, B:74:0x0167, B:81:0x017f, B:83:0x0189, B:92:0x01a2, B:94:0x01a9, B:95:0x01b0, B:97:0x01b8, B:100:0x01c7, B:104:0x01e1), top: B:140:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:138:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0195 A[EDGE_INSN: B:148:0x0195->B:86:0x0195 BREAK  A[LOOP:1: B:81:0x017f->B:150:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0 A[Catch: all -> 0x0202, Exception -> 0x0205, TRY_LEAVE, TryCatch #9 {Exception -> 0x0205, all -> 0x0202, blocks: (B:7:0x002d, B:14:0x0068, B:19:0x0076, B:20:0x0080, B:23:0x0088, B:28:0x0099, B:26:0x0091, B:35:0x00b2, B:37:0x00ba, B:39:0x00d0, B:43:0x00dc, B:47:0x00e8, B:49:0x010d, B:50:0x0110, B:54:0x0131, B:56:0x0137, B:58:0x013b, B:60:0x013f, B:63:0x0144, B:70:0x0155, B:74:0x0167, B:81:0x017f, B:83:0x0189, B:92:0x01a2, B:94:0x01a9, B:95:0x01b0, B:97:0x01b8, B:100:0x01c7, B:104:0x01e1), top: B:140:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc A[Catch: all -> 0x0202, Exception -> 0x0205, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x0205, all -> 0x0202, blocks: (B:7:0x002d, B:14:0x0068, B:19:0x0076, B:20:0x0080, B:23:0x0088, B:28:0x0099, B:26:0x0091, B:35:0x00b2, B:37:0x00ba, B:39:0x00d0, B:43:0x00dc, B:47:0x00e8, B:49:0x010d, B:50:0x0110, B:54:0x0131, B:56:0x0137, B:58:0x013b, B:60:0x013f, B:63:0x0144, B:70:0x0155, B:74:0x0167, B:81:0x017f, B:83:0x0189, B:92:0x01a2, B:94:0x01a9, B:95:0x01b0, B:97:0x01b8, B:100:0x01c7, B:104:0x01e1), top: B:140:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x010d A[Catch: all -> 0x0202, Exception -> 0x0205, TryCatch #9 {Exception -> 0x0205, all -> 0x0202, blocks: (B:7:0x002d, B:14:0x0068, B:19:0x0076, B:20:0x0080, B:23:0x0088, B:28:0x0099, B:26:0x0091, B:35:0x00b2, B:37:0x00ba, B:39:0x00d0, B:43:0x00dc, B:47:0x00e8, B:49:0x010d, B:50:0x0110, B:54:0x0131, B:56:0x0137, B:58:0x013b, B:60:0x013f, B:63:0x0144, B:70:0x0155, B:74:0x0167, B:81:0x017f, B:83:0x0189, B:92:0x01a2, B:94:0x01a9, B:95:0x01b0, B:97:0x01b8, B:100:0x01c7, B:104:0x01e1), top: B:140:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x012c A[Catch: IOException -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x00a7, blocks: (B:29:0x00a3, B:41:0x00d8, B:45:0x00e4, B:52:0x012c, B:72:0x0162, B:98:0x01c2, B:118:0x0225), top: B:127:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0131 A[Catch: all -> 0x0202, Exception -> 0x0205, TRY_ENTER, TryCatch #9 {Exception -> 0x0205, all -> 0x0202, blocks: (B:7:0x002d, B:14:0x0068, B:19:0x0076, B:20:0x0080, B:23:0x0088, B:28:0x0099, B:26:0x0091, B:35:0x00b2, B:37:0x00ba, B:39:0x00d0, B:43:0x00dc, B:47:0x00e8, B:49:0x010d, B:50:0x0110, B:54:0x0131, B:56:0x0137, B:58:0x013b, B:60:0x013f, B:63:0x0144, B:70:0x0155, B:74:0x0167, B:81:0x017f, B:83:0x0189, B:92:0x01a2, B:94:0x01a9, B:95:0x01b0, B:97:0x01b8, B:100:0x01c7, B:104:0x01e1), top: B:140:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0137 A[Catch: all -> 0x0202, Exception -> 0x0205, TryCatch #9 {Exception -> 0x0205, all -> 0x0202, blocks: (B:7:0x002d, B:14:0x0068, B:19:0x0076, B:20:0x0080, B:23:0x0088, B:28:0x0099, B:26:0x0091, B:35:0x00b2, B:37:0x00ba, B:39:0x00d0, B:43:0x00dc, B:47:0x00e8, B:49:0x010d, B:50:0x0110, B:54:0x0131, B:56:0x0137, B:58:0x013b, B:60:0x013f, B:63:0x0144, B:70:0x0155, B:74:0x0167, B:81:0x017f, B:83:0x0189, B:92:0x01a2, B:94:0x01a9, B:95:0x01b0, B:97:0x01b8, B:100:0x01c7, B:104:0x01e1), top: B:140:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0155 A[Catch: all -> 0x0202, Exception -> 0x0205, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x0205, all -> 0x0202, blocks: (B:7:0x002d, B:14:0x0068, B:19:0x0076, B:20:0x0080, B:23:0x0088, B:28:0x0099, B:26:0x0091, B:35:0x00b2, B:37:0x00ba, B:39:0x00d0, B:43:0x00dc, B:47:0x00e8, B:49:0x010d, B:50:0x0110, B:54:0x0131, B:56:0x0137, B:58:0x013b, B:60:0x013f, B:63:0x0144, B:70:0x0155, B:74:0x0167, B:81:0x017f, B:83:0x0189, B:92:0x01a2, B:94:0x01a9, B:95:0x01b0, B:97:0x01b8, B:100:0x01c7, B:104:0x01e1), top: B:140:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0162 A[Catch: IOException -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x00a7, blocks: (B:29:0x00a3, B:41:0x00d8, B:45:0x00e4, B:52:0x012c, B:72:0x0162, B:98:0x01c2, B:118:0x0225), top: B:127:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0167 A[Catch: all -> 0x0202, Exception -> 0x0205, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x0205, all -> 0x0202, blocks: (B:7:0x002d, B:14:0x0068, B:19:0x0076, B:20:0x0080, B:23:0x0088, B:28:0x0099, B:26:0x0091, B:35:0x00b2, B:37:0x00ba, B:39:0x00d0, B:43:0x00dc, B:47:0x00e8, B:49:0x010d, B:50:0x0110, B:54:0x0131, B:56:0x0137, B:58:0x013b, B:60:0x013f, B:63:0x0144, B:70:0x0155, B:74:0x0167, B:81:0x017f, B:83:0x0189, B:92:0x01a2, B:94:0x01a9, B:95:0x01b0, B:97:0x01b8, B:100:0x01c7, B:104:0x01e1), top: B:140:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0189 A[Catch: all -> 0x0202, Exception -> 0x0205, TRY_LEAVE, TryCatch #9 {Exception -> 0x0205, all -> 0x0202, blocks: (B:7:0x002d, B:14:0x0068, B:19:0x0076, B:20:0x0080, B:23:0x0088, B:28:0x0099, B:26:0x0091, B:35:0x00b2, B:37:0x00ba, B:39:0x00d0, B:43:0x00dc, B:47:0x00e8, B:49:0x010d, B:50:0x0110, B:54:0x0131, B:56:0x0137, B:58:0x013b, B:60:0x013f, B:63:0x0144, B:70:0x0155, B:74:0x0167, B:81:0x017f, B:83:0x0189, B:92:0x01a2, B:94:0x01a9, B:95:0x01b0, B:97:0x01b8, B:100:0x01c7, B:104:0x01e1), top: B:140:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0197  */
    /* JADX WARN: Code duplicated, block: B:88:0x0199  */
    /* JADX WARN: Code duplicated, block: B:91:0x019f  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a9 A[Catch: all -> 0x0202, Exception -> 0x0205, TryCatch #9 {Exception -> 0x0205, all -> 0x0202, blocks: (B:7:0x002d, B:14:0x0068, B:19:0x0076, B:20:0x0080, B:23:0x0088, B:28:0x0099, B:26:0x0091, B:35:0x00b2, B:37:0x00ba, B:39:0x00d0, B:43:0x00dc, B:47:0x00e8, B:49:0x010d, B:50:0x0110, B:54:0x0131, B:56:0x0137, B:58:0x013b, B:60:0x013f, B:63:0x0144, B:70:0x0155, B:74:0x0167, B:81:0x017f, B:83:0x0189, B:92:0x01a2, B:94:0x01a9, B:95:0x01b0, B:97:0x01b8, B:100:0x01c7, B:104:0x01e1), top: B:140:0x002d }] */
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
    private boolean c(String str, HMFirmwareType hMFirmwareType, boolean z, int i2, IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback) throws Throwable {
        int i3;
        int i4;
        int i5;
        int state;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2 = z;
        boolean z3 = false;
        z3 = false;
        z3 = false;
        int i10 = 0;
        if (!this.c.init()) {
            return false;
        }
        BufferedInputStream bufferedInputStream = null;
        int iCrc16 = 65535;
        try {
            try {
                try {
                    File file = new File(str);
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                    try {
                        int length = (int) file.length();
                        Debug.fi(g, "Device firmware: " + str + ", " + length + " bytes");
                        try {
                            if (this.c.start(length, hMFirmwareType, z2, i2) && this.c.startTransfer()) {
                                byte[] bArr = new byte[20];
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                int i11 = 0;
                                int i12 = 0;
                                int i13 = 0;
                                while (true) {
                                    i12 += i13;
                                    if (i2 - 1 >= i12) {
                                        i3 = bufferedInputStream2.read(bArr, 0, bArr.length);
                                        if (i3 < 1) {
                                            Debug.fi(g, "read firmware data size:" + i3);
                                            if ((z2 || this.c.c(i10)) && this.c.e()) {
                                                Debug.fi(g, String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(length / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                                i4 = length > 1048576 ? (length / 1048576) * 15000 : 15000;
                                                Debug.fi(g, "validate timeout:" + i4);
                                                if (this.c.j(iCrc16, i4)) {
                                                    if (hMFirmwareType != HMFirmwareType.FIRMWARE_GPS && hMFirmwareType != HMFirmwareType.FIRMWARE_GPS_CEP && hMFirmwareType != HMFirmwareType.RESOURCE_COMPRESS && hMFirmwareType != HMFirmwareType.RESOURCE_BASE) {
                                                        if (hMFirmwareType != HMFirmwareType.FIRMWARE) {
                                                            try {
                                                                bufferedInputStream2.close();
                                                            } catch (IOException unused) {
                                                                Debug.fi(g, "Fail to operate on the firmware file");
                                                            }
                                                            this.c.deInit();
                                                            return true;
                                                        }
                                                        Debug.fi(g, "reboot..................");
                                                        if (this.c.g()) {
                                                            this.c.enableRefreshGatt(true);
                                                            Thread.sleep(2000L);
                                                            try {
                                                                bufferedInputStream2.close();
                                                            } catch (IOException unused2) {
                                                                Debug.fi(g, "Fail to operate on the firmware file");
                                                            }
                                                            this.c.deInit();
                                                            return true;
                                                        }
                                                        bufferedInputStream2.close();
                                                    }
                                                    i5 = 0;
                                                    do {
                                                        state = this.c.getState();
                                                        if (state != 9) {
                                                            break;
                                                        }
                                                        Thread.sleep(5000L);
                                                        i5 += 5000;
                                                    } while (i5 < 300000);
                                                    if (state == 1) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    bufferedInputStream2.close();
                                                } else {
                                                    bufferedInputStream2.close();
                                                }
                                            } else {
                                                bufferedInputStream2.close();
                                            }
                                        } else {
                                            iCrc16 = GattUtils.crc16(iCrc16, bArr, 0, i3);
                                            if (i3 < bArr.length) {
                                                byte[] bArr2 = new byte[i3];
                                                System.arraycopy(bArr, 0, bArr2, 0, i3);
                                                bArr = bArr2;
                                            }
                                            if (this.c.sendData(bArr)) {
                                                i6 = this.f + i3;
                                                this.f = i6;
                                                i10 += i3;
                                                byte[] bArr3 = bArr;
                                                i7 = (int) ((i10 * 100.0f) / length);
                                                i8 = i11;
                                                if (i8 < i7) {
                                                    i9 = i7;
                                                    if (iHMFirmwareUpgradeCallback != null) {
                                                        iHMFirmwareUpgradeCallback.onFwProgress(new Progress(this.e, i6));
                                                    }
                                                } else {
                                                    i9 = i8;
                                                }
                                                z2 = z;
                                                bArr = bArr3;
                                                i13 = i3;
                                                i11 = i9;
                                            } else {
                                                Debug.fi(g, "write firmware data failed!!!");
                                                this.c.stopTransfer(iCrc16);
                                                bufferedInputStream2.close();
                                            }
                                        }
                                    } else if (z2) {
                                        if (!this.c.c(i10)) {
                                            Debug.fi(g, "write DFU_OPCODE_DUMMY failed!!!");
                                            this.c.stopTransfer(iCrc16);
                                            bufferedInputStream2.close();
                                        }
                                        i12 = 0;
                                        i3 = bufferedInputStream2.read(bArr, 0, bArr.length);
                                        if (i3 < 1) {
                                            Debug.fi(g, "read firmware data size:" + i3);
                                            if (z2) {
                                                Debug.fi(g, String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(length / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                                if (length > 1048576) {
                                                }
                                                Debug.fi(g, "validate timeout:" + i4);
                                                if (this.c.j(iCrc16, i4)) {
                                                    bufferedInputStream2.close();
                                                } else {
                                                    if (hMFirmwareType != HMFirmwareType.FIRMWARE_GPS) {
                                                        if (hMFirmwareType != HMFirmwareType.FIRMWARE) {
                                                            bufferedInputStream2.close();
                                                            this.c.deInit();
                                                            return true;
                                                        }
                                                        Debug.fi(g, "reboot..................");
                                                        if (this.c.g()) {
                                                            this.c.enableRefreshGatt(true);
                                                            Thread.sleep(2000L);
                                                            bufferedInputStream2.close();
                                                            this.c.deInit();
                                                            return true;
                                                        }
                                                        bufferedInputStream2.close();
                                                    }
                                                    i5 = 0;
                                                    do {
                                                        state = this.c.getState();
                                                        if (state != 9) {
                                                            break;
                                                            break;
                                                        }
                                                        Thread.sleep(5000L);
                                                        i5 += 5000;
                                                    } while (i5 < 300000);
                                                    if (state == 1) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    bufferedInputStream2.close();
                                                }
                                            } else {
                                                Debug.fi(g, String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(length / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                                if (length > 1048576) {
                                                }
                                                Debug.fi(g, "validate timeout:" + i4);
                                                if (this.c.j(iCrc16, i4)) {
                                                    bufferedInputStream2.close();
                                                } else {
                                                    if (hMFirmwareType != HMFirmwareType.FIRMWARE_GPS) {
                                                        if (hMFirmwareType != HMFirmwareType.FIRMWARE) {
                                                            bufferedInputStream2.close();
                                                            this.c.deInit();
                                                            return true;
                                                        }
                                                        Debug.fi(g, "reboot..................");
                                                        if (this.c.g()) {
                                                            this.c.enableRefreshGatt(true);
                                                            Thread.sleep(2000L);
                                                            bufferedInputStream2.close();
                                                            this.c.deInit();
                                                            return true;
                                                        }
                                                        bufferedInputStream2.close();
                                                    }
                                                    i5 = 0;
                                                    do {
                                                        state = this.c.getState();
                                                        if (state != 9) {
                                                            break;
                                                            break;
                                                        }
                                                        Thread.sleep(5000L);
                                                        i5 += 5000;
                                                    } while (i5 < 300000);
                                                    if (state == 1) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    bufferedInputStream2.close();
                                                }
                                            }
                                        } else {
                                            iCrc16 = GattUtils.crc16(iCrc16, bArr, 0, i3);
                                            if (i3 < bArr.length) {
                                                byte[] bArr4 = new byte[i3];
                                                System.arraycopy(bArr, 0, bArr4, 0, i3);
                                                bArr = bArr4;
                                            }
                                            if (this.c.sendData(bArr)) {
                                                Debug.fi(g, "write firmware data failed!!!");
                                                this.c.stopTransfer(iCrc16);
                                                bufferedInputStream2.close();
                                            } else {
                                                i6 = this.f + i3;
                                                this.f = i6;
                                                i10 += i3;
                                                byte[] bArr5 = bArr;
                                                i7 = (int) ((i10 * 100.0f) / length);
                                                i8 = i11;
                                                if (i8 < i7) {
                                                    i9 = i7;
                                                    if (iHMFirmwareUpgradeCallback != null) {
                                                        iHMFirmwareUpgradeCallback.onFwProgress(new Progress(this.e, i6));
                                                    }
                                                } else {
                                                    i9 = i8;
                                                }
                                                z2 = z;
                                                bArr = bArr5;
                                                i13 = i3;
                                                i11 = i9;
                                            }
                                        }
                                    } else {
                                        if (!this.c.d()) {
                                            Debug.fi(g, "write DFU_OPCODE_DUMMY failed!!!");
                                            this.c.stopTransfer(iCrc16);
                                            bufferedInputStream2.close();
                                        }
                                        i12 = 0;
                                        i3 = bufferedInputStream2.read(bArr, 0, bArr.length);
                                        if (i3 < 1) {
                                            Debug.fi(g, "read firmware data size:" + i3);
                                            if (z2) {
                                                Debug.fi(g, String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(length / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                                if (length > 1048576) {
                                                }
                                                Debug.fi(g, "validate timeout:" + i4);
                                                if (this.c.j(iCrc16, i4)) {
                                                    bufferedInputStream2.close();
                                                } else {
                                                    if (hMFirmwareType != HMFirmwareType.FIRMWARE_GPS) {
                                                        if (hMFirmwareType != HMFirmwareType.FIRMWARE) {
                                                            bufferedInputStream2.close();
                                                            this.c.deInit();
                                                            return true;
                                                        }
                                                        Debug.fi(g, "reboot..................");
                                                        if (this.c.g()) {
                                                            this.c.enableRefreshGatt(true);
                                                            Thread.sleep(2000L);
                                                            bufferedInputStream2.close();
                                                            this.c.deInit();
                                                            return true;
                                                        }
                                                        bufferedInputStream2.close();
                                                    }
                                                    i5 = 0;
                                                    do {
                                                        state = this.c.getState();
                                                        if (state != 9) {
                                                            break;
                                                            break;
                                                        }
                                                        Thread.sleep(5000L);
                                                        i5 += 5000;
                                                    } while (i5 < 300000);
                                                    if (state == 1) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    bufferedInputStream2.close();
                                                }
                                            } else {
                                                Debug.fi(g, String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(length / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                                if (length > 1048576) {
                                                }
                                                Debug.fi(g, "validate timeout:" + i4);
                                                if (this.c.j(iCrc16, i4)) {
                                                    bufferedInputStream2.close();
                                                } else {
                                                    if (hMFirmwareType != HMFirmwareType.FIRMWARE_GPS) {
                                                        if (hMFirmwareType != HMFirmwareType.FIRMWARE) {
                                                            bufferedInputStream2.close();
                                                            this.c.deInit();
                                                            return true;
                                                        }
                                                        Debug.fi(g, "reboot..................");
                                                        if (this.c.g()) {
                                                            this.c.enableRefreshGatt(true);
                                                            Thread.sleep(2000L);
                                                            bufferedInputStream2.close();
                                                            this.c.deInit();
                                                            return true;
                                                        }
                                                        bufferedInputStream2.close();
                                                    }
                                                    i5 = 0;
                                                    do {
                                                        state = this.c.getState();
                                                        if (state != 9) {
                                                            break;
                                                            break;
                                                        }
                                                        Thread.sleep(5000L);
                                                        i5 += 5000;
                                                    } while (i5 < 300000);
                                                    if (state == 1) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    bufferedInputStream2.close();
                                                }
                                            }
                                        } else {
                                            iCrc16 = GattUtils.crc16(iCrc16, bArr, 0, i3);
                                            if (i3 < bArr.length) {
                                                byte[] bArr6 = new byte[i3];
                                                System.arraycopy(bArr, 0, bArr6, 0, i3);
                                                bArr = bArr6;
                                            }
                                            if (this.c.sendData(bArr)) {
                                                Debug.fi(g, "write firmware data failed!!!");
                                                this.c.stopTransfer(iCrc16);
                                                bufferedInputStream2.close();
                                            } else {
                                                i6 = this.f + i3;
                                                this.f = i6;
                                                i10 += i3;
                                                byte[] bArr7 = bArr;
                                                i7 = (int) ((i10 * 100.0f) / length);
                                                i8 = i11;
                                                if (i8 < i7) {
                                                    i9 = i7;
                                                    if (iHMFirmwareUpgradeCallback != null) {
                                                        iHMFirmwareUpgradeCallback.onFwProgress(new Progress(this.e, i6));
                                                    }
                                                } else {
                                                    i9 = i8;
                                                }
                                                z2 = z;
                                                bArr = bArr7;
                                                i13 = i3;
                                                i11 = i9;
                                            }
                                        }
                                    }
                                    this.c.deInit();
                                    return false;
                                }
                            }
                            bufferedInputStream2.close();
                        } catch (IOException unused3) {
                            Debug.fi(g, "Fail to operate on the firmware file");
                        }
                        this.c.deInit();
                        return z3;
                    } catch (Exception e) {
                        e = e;
                        bufferedInputStream = bufferedInputStream2;
                        Debug.fi(g, "exception happend!!:" + e.getMessage());
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        this.c.deInit();
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException unused4) {
                                Debug.fi(g, "Fail to operate on the firmware file");
                            }
                        }
                        this.c.deInit();
                        throw th;
                    }
                } catch (IOException unused5) {
                    Debug.fi(g, "Fail to operate on the firmware file");
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() {
        this.b.onFwStart(0);
        if (this.d.size() == 0) {
            this.b.onFwStop(false);
            return;
        }
        Iterator<HMFirmwareInfo> it2 = this.d.iterator();
        while (it2.hasNext()) {
            long jA = a(it2.next().getFwPath());
            if (jA <= 0) {
                Debug.fi(g, "invalid file size：" + jA);
            } else {
                this.e = (int) (((long) this.e) + jA);
            }
        }
        Debug.fi(g, "total size : " + this.e);
        boolean zC = true;
        for (HMFirmwareInfo hMFirmwareInfo : this.d) {
            if (a(hMFirmwareInfo.getFwPath()) > 0) {
                zC &= c(hMFirmwareInfo.getFwPath(), hMFirmwareInfo.getFwType(), hMFirmwareInfo.isSupportSyncSize(), hMFirmwareInfo.getSyncSize(), this.b);
            }
        }
        Debug.fi(g, "upgrade ret : " + zC);
        this.b.onFwStop(zC);
    }

    public HMFirmwareUpgradeTask(GattPeripheral gattPeripheral, ArrayList<HMFirmwareInfo> infos, IHMFirmwareUpgradeCallback callback) {
        b(gattPeripheral, infos, callback);
    }
}
