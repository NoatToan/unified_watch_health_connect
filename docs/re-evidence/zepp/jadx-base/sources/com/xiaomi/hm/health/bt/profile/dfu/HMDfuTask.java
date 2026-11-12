package com.xiaomi.hm.health.bt.profile.dfu;

import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.base.LEParams;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.observe.LogObservable;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes12.dex */
public class HMDfuTask extends HMBaseTask {
    private static final String g = "dfu.HMDfuTask";
    private static final int h = 6;
    private static final int i = 6;
    private static final int j = 12;
    private static final int k = 0;
    private static final int l = 2000;
    private static final int m = 5000;
    private static final int n = 600000;
    private static final int o = 20000;
    private static final int p = 10000;
    private IHMFirmwareUpgradeCallback b;
    private IFirmwareUpgradeCallback c;
    private HMDfuProfile d;
    private LogObservable e;
    private HMFirmwareInfo f;

    public HMDfuTask(GattPeripheral gattPeripheral, HMFirmwareInfo info, IHMFirmwareUpgradeCallback callback) {
        this.d = new HMDfuProfile(gattPeripheral);
        this.b = callback;
        this.f = info;
        if (callback instanceof LogObservable) {
            this.e = (LogObservable) callback;
        }
        if (callback instanceof IFirmwareUpgradeCallback) {
            this.c = (IFirmwareUpgradeCallback) callback;
        }
    }

    private long a(BufferedInputStream inputStream, int size) throws IOException {
        Debug.i(g, "size:" + size);
        byte[] bArr = new byte[size];
        inputStream.mark(size);
        Debug.i(g, "read size:" + inputStream.read(bArr));
        inputStream.reset();
        long jCrc16 = (long) GattUtils.crc16(65535, bArr, 0, size);
        Debug.i(g, "crc:" + jCrc16);
        return jCrc16;
    }

    private long b(BufferedInputStream inputStream, int size) throws IOException {
        Debug.i(g, "size:" + size);
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
        Debug.i(g, "read size:" + (i2 + i4));
        inputStream.reset();
        long value = crc32.getValue();
        Debug.i(g, "crc:" + value + "," + Long.toHexString(value));
        return value;
    }

    private boolean c(HMFirmwareType type) {
        return type == HMFirmwareType.FIRMWARE;
    }

    private boolean d(HMFirmwareType type) {
        return type == HMFirmwareType.FIRMWARE_GPS || type == HMFirmwareType.FIRMWARE_GPS_ALM || type == HMFirmwareType.FIRMWARE_GPS_CEP || type == HMFirmwareType.RESOURCE_COMPRESS || type == HMFirmwareType.RESOURCE_BASE || type == HMFirmwareType.FIRMWARE_DIAL || type == HMFirmwareType.FIRMWARE_BATCH || type == HMFirmwareType.FIRMWARE_GNS_ALM;
    }

    private void e(String message) {
        LogObservable logObservable = this.e;
        if (logObservable != null) {
            if (message == null) {
                message = "";
            }
            logObservable.onLogMessage(message);
        }
    }

    private int f() throws Exception {
        while (true) {
            int state = this.d.getState();
            if (state != 9) {
                return state;
            }
            Thread.sleep(5000L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0237 A[Catch: all -> 0x02d4, Exception -> 0x02d7, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x02d7, all -> 0x02d4, blocks: (B:22:0x0060, B:24:0x006e, B:26:0x0075, B:28:0x008c, B:34:0x009e, B:36:0x00d4, B:38:0x00f0, B:40:0x0115, B:42:0x011d, B:48:0x0130, B:50:0x0136, B:52:0x0144, B:55:0x015f, B:60:0x0170, B:58:0x0168, B:65:0x0180, B:67:0x0187, B:69:0x019d, B:73:0x01a9, B:79:0x01d5, B:80:0x01db, B:82:0x01f7, B:85:0x0201, B:87:0x0207, B:91:0x0211, B:92:0x021c, B:96:0x0225, B:98:0x022d, B:101:0x0237, B:117:0x0265, B:118:0x026c, B:120:0x0274, B:126:0x0298, B:128:0x02a1, B:130:0x02aa), top: B:165:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0250  */
    /* JADX WARN: Code duplicated, block: B:109:0x0253  */
    /* JADX WARN: Code duplicated, block: B:110:0x0255  */
    /* JADX WARN: Code duplicated, block: B:116:0x0263 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0265 A[Catch: all -> 0x02d4, Exception -> 0x02d7, TRY_ENTER, TryCatch #9 {Exception -> 0x02d7, all -> 0x02d4, blocks: (B:22:0x0060, B:24:0x006e, B:26:0x0075, B:28:0x008c, B:34:0x009e, B:36:0x00d4, B:38:0x00f0, B:40:0x0115, B:42:0x011d, B:48:0x0130, B:50:0x0136, B:52:0x0144, B:55:0x015f, B:60:0x0170, B:58:0x0168, B:65:0x0180, B:67:0x0187, B:69:0x019d, B:73:0x01a9, B:79:0x01d5, B:80:0x01db, B:82:0x01f7, B:85:0x0201, B:87:0x0207, B:91:0x0211, B:92:0x021c, B:96:0x0225, B:98:0x022d, B:101:0x0237, B:117:0x0265, B:118:0x026c, B:120:0x0274, B:126:0x0298, B:128:0x02a1, B:130:0x02aa), top: B:165:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0285  */
    /* JADX WARN: Code duplicated, block: B:125:0x0296 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0298 A[Catch: all -> 0x02d4, Exception -> 0x02d7, TRY_ENTER, TryCatch #9 {Exception -> 0x02d7, all -> 0x02d4, blocks: (B:22:0x0060, B:24:0x006e, B:26:0x0075, B:28:0x008c, B:34:0x009e, B:36:0x00d4, B:38:0x00f0, B:40:0x0115, B:42:0x011d, B:48:0x0130, B:50:0x0136, B:52:0x0144, B:55:0x015f, B:60:0x0170, B:58:0x0168, B:65:0x0180, B:67:0x0187, B:69:0x019d, B:73:0x01a9, B:79:0x01d5, B:80:0x01db, B:82:0x01f7, B:85:0x0201, B:87:0x0207, B:91:0x0211, B:92:0x021c, B:96:0x0225, B:98:0x022d, B:101:0x0237, B:117:0x0265, B:118:0x026c, B:120:0x0274, B:126:0x0298, B:128:0x02a1, B:130:0x02aa), top: B:165:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d0 A[LOOP:0: B:52:0x0144->B:133:0x02d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    /* JADX WARN: Code duplicated, block: B:69:0x019d A[Catch: all -> 0x02d4, Exception -> 0x02d7, TRY_LEAVE, TryCatch #9 {Exception -> 0x02d7, all -> 0x02d4, blocks: (B:22:0x0060, B:24:0x006e, B:26:0x0075, B:28:0x008c, B:34:0x009e, B:36:0x00d4, B:38:0x00f0, B:40:0x0115, B:42:0x011d, B:48:0x0130, B:50:0x0136, B:52:0x0144, B:55:0x015f, B:60:0x0170, B:58:0x0168, B:65:0x0180, B:67:0x0187, B:69:0x019d, B:73:0x01a9, B:79:0x01d5, B:80:0x01db, B:82:0x01f7, B:85:0x0201, B:87:0x0207, B:91:0x0211, B:92:0x021c, B:96:0x0225, B:98:0x022d, B:101:0x0237, B:117:0x0265, B:118:0x026c, B:120:0x0274, B:126:0x0298, B:128:0x02a1, B:130:0x02aa), top: B:165:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a9 A[Catch: all -> 0x02d4, Exception -> 0x02d7, TRY_ENTER, TryCatch #9 {Exception -> 0x02d7, all -> 0x02d4, blocks: (B:22:0x0060, B:24:0x006e, B:26:0x0075, B:28:0x008c, B:34:0x009e, B:36:0x00d4, B:38:0x00f0, B:40:0x0115, B:42:0x011d, B:48:0x0130, B:50:0x0136, B:52:0x0144, B:55:0x015f, B:60:0x0170, B:58:0x0168, B:65:0x0180, B:67:0x0187, B:69:0x019d, B:73:0x01a9, B:79:0x01d5, B:80:0x01db, B:82:0x01f7, B:85:0x0201, B:87:0x0207, B:91:0x0211, B:92:0x021c, B:96:0x0225, B:98:0x022d, B:101:0x0237, B:117:0x0265, B:118:0x026c, B:120:0x0274, B:126:0x0298, B:128:0x02a1, B:130:0x02aa), top: B:165:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d5 A[Catch: all -> 0x02d4, Exception -> 0x02d7, TryCatch #9 {Exception -> 0x02d7, all -> 0x02d4, blocks: (B:22:0x0060, B:24:0x006e, B:26:0x0075, B:28:0x008c, B:34:0x009e, B:36:0x00d4, B:38:0x00f0, B:40:0x0115, B:42:0x011d, B:48:0x0130, B:50:0x0136, B:52:0x0144, B:55:0x015f, B:60:0x0170, B:58:0x0168, B:65:0x0180, B:67:0x0187, B:69:0x019d, B:73:0x01a9, B:79:0x01d5, B:80:0x01db, B:82:0x01f7, B:85:0x0201, B:87:0x0207, B:91:0x0211, B:92:0x021c, B:96:0x0225, B:98:0x022d, B:101:0x0237, B:117:0x0265, B:118:0x026c, B:120:0x0274, B:126:0x0298, B:128:0x02a1, B:130:0x02aa), top: B:165:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01f7 A[Catch: all -> 0x02d4, Exception -> 0x02d7, TRY_LEAVE, TryCatch #9 {Exception -> 0x02d7, all -> 0x02d4, blocks: (B:22:0x0060, B:24:0x006e, B:26:0x0075, B:28:0x008c, B:34:0x009e, B:36:0x00d4, B:38:0x00f0, B:40:0x0115, B:42:0x011d, B:48:0x0130, B:50:0x0136, B:52:0x0144, B:55:0x015f, B:60:0x0170, B:58:0x0168, B:65:0x0180, B:67:0x0187, B:69:0x019d, B:73:0x01a9, B:79:0x01d5, B:80:0x01db, B:82:0x01f7, B:85:0x0201, B:87:0x0207, B:91:0x0211, B:92:0x021c, B:96:0x0225, B:98:0x022d, B:101:0x0237, B:117:0x0265, B:118:0x026c, B:120:0x0274, B:126:0x0298, B:128:0x02a1, B:130:0x02aa), top: B:165:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0201 A[Catch: all -> 0x02d4, Exception -> 0x02d7, TRY_ENTER, TryCatch #9 {Exception -> 0x02d7, all -> 0x02d4, blocks: (B:22:0x0060, B:24:0x006e, B:26:0x0075, B:28:0x008c, B:34:0x009e, B:36:0x00d4, B:38:0x00f0, B:40:0x0115, B:42:0x011d, B:48:0x0130, B:50:0x0136, B:52:0x0144, B:55:0x015f, B:60:0x0170, B:58:0x0168, B:65:0x0180, B:67:0x0187, B:69:0x019d, B:73:0x01a9, B:79:0x01d5, B:80:0x01db, B:82:0x01f7, B:85:0x0201, B:87:0x0207, B:91:0x0211, B:92:0x021c, B:96:0x0225, B:98:0x022d, B:101:0x0237, B:117:0x0265, B:118:0x026c, B:120:0x0274, B:126:0x0298, B:128:0x02a1, B:130:0x02aa), top: B:165:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0207 A[Catch: all -> 0x02d4, Exception -> 0x02d7, TryCatch #9 {Exception -> 0x02d7, all -> 0x02d4, blocks: (B:22:0x0060, B:24:0x006e, B:26:0x0075, B:28:0x008c, B:34:0x009e, B:36:0x00d4, B:38:0x00f0, B:40:0x0115, B:42:0x011d, B:48:0x0130, B:50:0x0136, B:52:0x0144, B:55:0x015f, B:60:0x0170, B:58:0x0168, B:65:0x0180, B:67:0x0187, B:69:0x019d, B:73:0x01a9, B:79:0x01d5, B:80:0x01db, B:82:0x01f7, B:85:0x0201, B:87:0x0207, B:91:0x0211, B:92:0x021c, B:96:0x0225, B:98:0x022d, B:101:0x0237, B:117:0x0265, B:118:0x026c, B:120:0x0274, B:126:0x0298, B:128:0x02a1, B:130:0x02aa), top: B:165:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x020c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0211 A[Catch: all -> 0x02d4, Exception -> 0x02d7, TryCatch #9 {Exception -> 0x02d7, all -> 0x02d4, blocks: (B:22:0x0060, B:24:0x006e, B:26:0x0075, B:28:0x008c, B:34:0x009e, B:36:0x00d4, B:38:0x00f0, B:40:0x0115, B:42:0x011d, B:48:0x0130, B:50:0x0136, B:52:0x0144, B:55:0x015f, B:60:0x0170, B:58:0x0168, B:65:0x0180, B:67:0x0187, B:69:0x019d, B:73:0x01a9, B:79:0x01d5, B:80:0x01db, B:82:0x01f7, B:85:0x0201, B:87:0x0207, B:91:0x0211, B:92:0x021c, B:96:0x0225, B:98:0x022d, B:101:0x0237, B:117:0x0265, B:118:0x026c, B:120:0x0274, B:126:0x0298, B:128:0x02a1, B:130:0x02aa), top: B:165:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0222  */
    /* JADX WARN: Code duplicated, block: B:96:0x0225 A[Catch: all -> 0x02d4, Exception -> 0x02d7, TryCatch #9 {Exception -> 0x02d7, all -> 0x02d4, blocks: (B:22:0x0060, B:24:0x006e, B:26:0x0075, B:28:0x008c, B:34:0x009e, B:36:0x00d4, B:38:0x00f0, B:40:0x0115, B:42:0x011d, B:48:0x0130, B:50:0x0136, B:52:0x0144, B:55:0x015f, B:60:0x0170, B:58:0x0168, B:65:0x0180, B:67:0x0187, B:69:0x019d, B:73:0x01a9, B:79:0x01d5, B:80:0x01db, B:82:0x01f7, B:85:0x0201, B:87:0x0207, B:91:0x0211, B:92:0x021c, B:96:0x0225, B:98:0x022d, B:101:0x0237, B:117:0x0265, B:118:0x026c, B:120:0x0274, B:126:0x0298, B:128:0x02a1, B:130:0x02aa), top: B:165:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x022d A[Catch: all -> 0x02d4, Exception -> 0x02d7, TRY_LEAVE, TryCatch #9 {Exception -> 0x02d7, all -> 0x02d4, blocks: (B:22:0x0060, B:24:0x006e, B:26:0x0075, B:28:0x008c, B:34:0x009e, B:36:0x00d4, B:38:0x00f0, B:40:0x0115, B:42:0x011d, B:48:0x0130, B:50:0x0136, B:52:0x0144, B:55:0x015f, B:60:0x0170, B:58:0x0168, B:65:0x0180, B:67:0x0187, B:69:0x019d, B:73:0x01a9, B:79:0x01d5, B:80:0x01db, B:82:0x01f7, B:85:0x0201, B:87:0x0207, B:91:0x0211, B:92:0x021c, B:96:0x0225, B:98:0x022d, B:101:0x0237, B:117:0x0265, B:118:0x026c, B:120:0x0274, B:126:0x0298, B:128:0x02a1, B:130:0x02aa), top: B:165:0x0060 }] */
    private boolean g(final String path, final HMFirmwareType type, int syncSize, HMFirmwareInfo.ContinueUpgradeState continueUpgradeState, final boolean isSilent, int allSize, final IHMFirmwareUpgradeCallback pcb) throws Throwable {
        int flushSize;
        boolean z;
        byte b;
        int i2;
        int iF;
        int i3;
        boolean z2;
        int i4;
        if (!this.d.init()) {
            Debug.fi(g, "profile init failed!!!");
            return false;
        }
        if (HMBleConfig.SUPPORT_GET_DFU_CONFIG) {
            DfuConfig config = this.d.getConfig();
            Debug.fi(g, "DfuConfig:" + config);
            if (config != null) {
                flushSize = config.getFlushSize() > 0 ? config.getFlushSize() : syncSize;
                if (config.getFlushType() == 1) {
                    z = true;
                }
            } else {
                flushSize = syncSize;
            }
            z = false;
        } else {
            flushSize = syncSize;
            z = false;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(path));
                    try {
                        int iAvailable = bufferedInputStream2.available();
                        long jB = b(bufferedInputStream2, bufferedInputStream2.available());
                        long[] jArrK = this.d.k(type.getValue(), iAvailable, jB, z ? (short) flushSize : (short) -1, continueUpgradeState.getValue(), allSize);
                        if (jArrK == null) {
                            Debug.fi(g, "get fw info failed!!!");
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException unused) {
                                Debug.fi(g, "Fail to operate on the firmware file");
                            }
                            this.d.deInit();
                            return false;
                        }
                        int i5 = (int) jArrK[0];
                        long j2 = jArrK[1];
                        StringBuilder sb = new StringBuilder();
                        sb.append("total size:");
                        sb.append(iAvailable);
                        sb.append(",total crc:");
                        int i6 = flushSize;
                        sb.append(jB);
                        sb.append(",device size:");
                        sb.append(i5);
                        sb.append(",device crc:");
                        sb.append(j2);
                        Debug.fi(g, sb.toString());
                        if (i5 > 0) {
                            long jB2 = b(bufferedInputStream2, i5);
                            Debug.i(g, "local crc:" + jB2);
                            if (jB2 == j2) {
                                iAvailable -= i5;
                                Debug.fi(g, "skip:" + bufferedInputStream2.skip(i5) + ",size:" + i5);
                                b = 0;
                            } else {
                                b = 1;
                            }
                        } else {
                            b = 1;
                        }
                        if (this.d.start(b)) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (pcb != null) {
                                pcb.onFwProgress(new Progress(iAvailable, 0));
                            }
                            int i7 = 0;
                            int i8 = 0;
                            int i9 = 0;
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                int size = this.d.getMtu().size();
                                int i12 = i11;
                                byte[] bArr = new byte[size];
                                int i13 = i10;
                                i7 += i8;
                                if (i6 - 1 < i7) {
                                    if (z) {
                                        if (!this.d.f(i9)) {
                                            Debug.fi(g, "write DFU_OPCODE_DUMMY failed!!!");
                                            this.d.stop(10000);
                                            bufferedInputStream2.close();
                                        }
                                        i7 = 0;
                                        i8 = bufferedInputStream2.read(bArr, 0, size);
                                        if (i8 < 1) {
                                            Debug.fi(g, "read firmware data size:" + i8);
                                            if (z) {
                                                Debug.fi(g, String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(iAvailable / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                                if (type == HMFirmwareType.FIRMWARE_NB) {
                                                    i2 = 20000;
                                                } else {
                                                    i2 = 10000;
                                                }
                                                if (iAvailable > 1048576) {
                                                    i2 *= ((iAvailable + 1048576) - 1) / 1048576;
                                                }
                                                Debug.fi(g, "stop timeout:" + i2);
                                                if (this.d.stop(i2)) {
                                                    if (d(type)) {
                                                        iF = f();
                                                    } else {
                                                        iF = 1;
                                                    }
                                                    if (iF == 68) {
                                                        this.c.onError(MyDfuError.GPS_UPGRADE_FAILED.getCode());
                                                    }
                                                    if (c(type)) {
                                                        i3 = 1;
                                                        if (iF == 1) {
                                                            if (this.d.d()) {
                                                                this.d.enableRefreshGatt(true);
                                                                Thread.sleep(2000L);
                                                                bufferedInputStream2.close();
                                                                this.d.deInit();
                                                                return true;
                                                            }
                                                            Debug.fi(g, "activate failed!!!");
                                                            bufferedInputStream2.close();
                                                        }
                                                    } else {
                                                        i3 = 1;
                                                    }
                                                    if (iF == i3) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    bufferedInputStream2.close();
                                                    this.d.deInit();
                                                    return z2;
                                                }
                                                Debug.fi(g, "stop failed!!!");
                                                bufferedInputStream2.close();
                                            } else {
                                                Debug.fi(g, String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(iAvailable / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                                if (type == HMFirmwareType.FIRMWARE_NB) {
                                                    i2 = 20000;
                                                } else {
                                                    i2 = 10000;
                                                }
                                                if (iAvailable > 1048576) {
                                                    i2 *= ((iAvailable + 1048576) - 1) / 1048576;
                                                }
                                                Debug.fi(g, "stop timeout:" + i2);
                                                if (this.d.stop(i2)) {
                                                    if (d(type)) {
                                                        iF = f();
                                                    } else {
                                                        iF = 1;
                                                    }
                                                    if (iF == 68) {
                                                        this.c.onError(MyDfuError.GPS_UPGRADE_FAILED.getCode());
                                                    }
                                                    if (c(type)) {
                                                        i3 = 1;
                                                        if (iF == 1) {
                                                            if (this.d.d()) {
                                                                this.d.enableRefreshGatt(true);
                                                                Thread.sleep(2000L);
                                                                bufferedInputStream2.close();
                                                                this.d.deInit();
                                                                return true;
                                                            }
                                                            Debug.fi(g, "activate failed!!!");
                                                            bufferedInputStream2.close();
                                                        }
                                                    } else {
                                                        i3 = 1;
                                                    }
                                                    if (iF == i3) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    bufferedInputStream2.close();
                                                    this.d.deInit();
                                                    return z2;
                                                }
                                                Debug.fi(g, "stop failed!!!");
                                                bufferedInputStream2.close();
                                            }
                                        } else {
                                            if (i8 < size) {
                                                byte[] bArr2 = new byte[i8];
                                                System.arraycopy(bArr, 0, bArr2, 0, i8);
                                                bArr = bArr2;
                                            }
                                            if (this.d.sendData(bArr)) {
                                                i10 = i13 + i8;
                                                i9 += i8;
                                                i4 = (int) ((i9 * 100.0f) / iAvailable);
                                                i11 = i12;
                                                if (i11 < i4) {
                                                    if (pcb != null) {
                                                        pcb.onFwProgress(new Progress(iAvailable, i10));
                                                    }
                                                    i11 = i4;
                                                }
                                                if (this.d.h() != 1) {
                                                    Debug.fi(g, "notify error state:" + this.d.h());
                                                    this.d.stop(10000);
                                                    bufferedInputStream2.close();
                                                }
                                            } else {
                                                Debug.fi(g, "write firmware data failed!!!");
                                                this.d.stop(10000);
                                                bufferedInputStream2.close();
                                            }
                                        }
                                    } else {
                                        if (!this.d.g()) {
                                            Debug.fi(g, "write DFU_OPCODE_DUMMY failed!!!");
                                            this.d.stop(10000);
                                            bufferedInputStream2.close();
                                        }
                                        i7 = 0;
                                        i8 = bufferedInputStream2.read(bArr, 0, size);
                                        if (i8 < 1) {
                                            Debug.fi(g, "read firmware data size:" + i8);
                                            if (z) {
                                                Debug.fi(g, String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(iAvailable / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                                if (type == HMFirmwareType.FIRMWARE_NB) {
                                                    i2 = 20000;
                                                } else {
                                                    i2 = 10000;
                                                }
                                                if (iAvailable > 1048576) {
                                                    i2 *= ((iAvailable + 1048576) - 1) / 1048576;
                                                }
                                                Debug.fi(g, "stop timeout:" + i2);
                                                if (this.d.stop(i2)) {
                                                    if (d(type)) {
                                                        iF = f();
                                                    } else {
                                                        iF = 1;
                                                    }
                                                    if (iF == 68) {
                                                        this.c.onError(MyDfuError.GPS_UPGRADE_FAILED.getCode());
                                                    }
                                                    if (c(type)) {
                                                        i3 = 1;
                                                        if (iF == 1) {
                                                            if (this.d.d()) {
                                                                this.d.enableRefreshGatt(true);
                                                                Thread.sleep(2000L);
                                                                bufferedInputStream2.close();
                                                                this.d.deInit();
                                                                return true;
                                                            }
                                                            Debug.fi(g, "activate failed!!!");
                                                            bufferedInputStream2.close();
                                                        }
                                                    } else {
                                                        i3 = 1;
                                                    }
                                                    if (iF == i3) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    bufferedInputStream2.close();
                                                    this.d.deInit();
                                                    return z2;
                                                }
                                                Debug.fi(g, "stop failed!!!");
                                                bufferedInputStream2.close();
                                            } else {
                                                Debug.fi(g, String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(iAvailable / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                                if (type == HMFirmwareType.FIRMWARE_NB) {
                                                    i2 = 20000;
                                                } else {
                                                    i2 = 10000;
                                                }
                                                if (iAvailable > 1048576) {
                                                    i2 *= ((iAvailable + 1048576) - 1) / 1048576;
                                                }
                                                Debug.fi(g, "stop timeout:" + i2);
                                                if (this.d.stop(i2)) {
                                                    if (d(type)) {
                                                        iF = f();
                                                    } else {
                                                        iF = 1;
                                                    }
                                                    if (iF == 68) {
                                                        this.c.onError(MyDfuError.GPS_UPGRADE_FAILED.getCode());
                                                    }
                                                    if (c(type)) {
                                                        i3 = 1;
                                                        if (iF == 1) {
                                                            if (this.d.d()) {
                                                                this.d.enableRefreshGatt(true);
                                                                Thread.sleep(2000L);
                                                                bufferedInputStream2.close();
                                                                this.d.deInit();
                                                                return true;
                                                            }
                                                            Debug.fi(g, "activate failed!!!");
                                                            bufferedInputStream2.close();
                                                        }
                                                    } else {
                                                        i3 = 1;
                                                    }
                                                    if (iF == i3) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    bufferedInputStream2.close();
                                                    this.d.deInit();
                                                    return z2;
                                                }
                                                Debug.fi(g, "stop failed!!!");
                                                bufferedInputStream2.close();
                                            }
                                        } else {
                                            if (i8 < size) {
                                                byte[] bArr3 = new byte[i8];
                                                System.arraycopy(bArr, 0, bArr3, 0, i8);
                                                bArr = bArr3;
                                            }
                                            if (this.d.sendData(bArr)) {
                                                Debug.fi(g, "write firmware data failed!!!");
                                                this.d.stop(10000);
                                                bufferedInputStream2.close();
                                            } else {
                                                i10 = i13 + i8;
                                                i9 += i8;
                                                i4 = (int) ((i9 * 100.0f) / iAvailable);
                                                i11 = i12;
                                                if (i11 < i4) {
                                                    if (pcb != null) {
                                                        pcb.onFwProgress(new Progress(iAvailable, i10));
                                                    }
                                                    i11 = i4;
                                                }
                                                if (this.d.h() != 1) {
                                                    Debug.fi(g, "notify error state:" + this.d.h());
                                                    this.d.stop(10000);
                                                    bufferedInputStream2.close();
                                                }
                                            }
                                        }
                                    }
                                    this.d.deInit();
                                    return false;
                                }
                                i8 = bufferedInputStream2.read(bArr, 0, size);
                                if (i8 < 1) {
                                    Debug.fi(g, "read firmware data size:" + i8);
                                    if (z || this.d.f(i9)) {
                                        Debug.fi(g, String.format(Locale.getDefault(), "DFU transfer rate: %.1f KBps", Float.valueOf(iAvailable / (System.currentTimeMillis() - jCurrentTimeMillis))));
                                        if (type == HMFirmwareType.FIRMWARE_NB) {
                                            i2 = 20000;
                                        } else {
                                            i2 = 10000;
                                        }
                                        if (iAvailable > 1048576) {
                                            i2 *= ((iAvailable + 1048576) - 1) / 1048576;
                                        }
                                        Debug.fi(g, "stop timeout:" + i2);
                                        if (this.d.stop(i2)) {
                                            if (d(type)) {
                                                iF = f();
                                            } else {
                                                iF = 1;
                                            }
                                            if (iF == 68) {
                                                this.c.onError(MyDfuError.GPS_UPGRADE_FAILED.getCode());
                                            }
                                            if (c(type)) {
                                                i3 = 1;
                                                if (iF == 1) {
                                                    if (this.d.d()) {
                                                        this.d.enableRefreshGatt(true);
                                                        Thread.sleep(2000L);
                                                        try {
                                                            bufferedInputStream2.close();
                                                        } catch (IOException unused2) {
                                                            Debug.fi(g, "Fail to operate on the firmware file");
                                                        }
                                                        this.d.deInit();
                                                        return true;
                                                    }
                                                    Debug.fi(g, "activate failed!!!");
                                                    bufferedInputStream2.close();
                                                }
                                            } else {
                                                i3 = 1;
                                            }
                                            if (iF == i3) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            try {
                                                bufferedInputStream2.close();
                                            } catch (IOException unused3) {
                                                Debug.fi(g, "Fail to operate on the firmware file");
                                            }
                                            this.d.deInit();
                                            return z2;
                                        }
                                        Debug.fi(g, "stop failed!!!");
                                        bufferedInputStream2.close();
                                    } else {
                                        bufferedInputStream2.close();
                                    }
                                } else {
                                    if (i8 < size) {
                                        byte[] bArr4 = new byte[i8];
                                        System.arraycopy(bArr, 0, bArr4, 0, i8);
                                        bArr = bArr4;
                                    }
                                    if (this.d.sendData(bArr)) {
                                        Debug.fi(g, "write firmware data failed!!!");
                                        this.d.stop(10000);
                                        bufferedInputStream2.close();
                                    } else {
                                        i10 = i13 + i8;
                                        i9 += i8;
                                        i4 = (int) ((i9 * 100.0f) / iAvailable);
                                        i11 = i12;
                                        if (i11 < i4) {
                                            if (pcb != null) {
                                                pcb.onFwProgress(new Progress(iAvailable, i10));
                                            }
                                            i11 = i4;
                                        }
                                        if (this.d.h() != 1) {
                                            Debug.fi(g, "notify error state:" + this.d.h());
                                            this.d.stop(10000);
                                            bufferedInputStream2.close();
                                        }
                                    }
                                }
                            }
                        } else {
                            Debug.fi(g, "start failed!!!");
                            bufferedInputStream2.close();
                        }
                        this.d.deInit();
                        return false;
                    } catch (Exception e) {
                        e = e;
                        bufferedInputStream = bufferedInputStream2;
                        Debug.fi(g, "upgrade exception:" + e.getMessage());
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        this.d.deInit();
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
                        this.d.deInit();
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
            Debug.fi(g, "Fail to operate on the firmware file");
        }
    }

    private boolean h(final String path, final HMFirmwareType type, int syncSize, final IHMFirmwareUpgradeCallback pcb) {
        return g(path, type, syncSize, HMFirmwareInfo.ContinueUpgradeState.NONE, false, -1, pcb);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() throws Throwable {
        this.b.onFwStart(0);
        LEParams lEParams = this.d.getLEParams();
        Debug.fi(g, "leParams:" + lEParams);
        e("leParams:" + lEParams);
        if (lEParams != null && lEParams.getConnIntMax() > 12) {
            this.d.setLEParams(6, 12, 0, 2000);
            try {
                Thread.sleep((long) Math.ceil(lEParams.getConnIntMax() * 1.25f * 6.0f));
            } catch (Exception unused) {
            }
        }
        Debug.fi(g, "HMFirmwareInfo:" + this.f);
        boolean zG = g(this.f.getFwPath(), this.f.getFwType(), this.f.getSyncSize(), this.f.getContinueUpgradeState(), this.f.isSilent(), this.f.getAllSize(), this.b);
        e("HMFirmwareInfo:" + this.f);
        Debug.fi(g, "upgrade ret : " + zG);
        e("upgrade ret : " + zG);
        this.b.onFwStop(zG);
    }
}
