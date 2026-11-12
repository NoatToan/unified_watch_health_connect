package org.java_websocket.util;

import com.airoha.android.lib.RaceCommand.constant.RaceType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.nfc.applet.ISeCommandKt;
import com.xiaomi.hm.health.bt.model.HMDisplaySetting;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;
import org.threeten.bp.a;

/* JADX INFO: loaded from: classes23.dex */
public class Base64 {
    public static final int DO_BREAK_LINES = 8;
    public static final int ENCODE = 1;
    public static final int GZIP = 2;
    public static final int NO_OPTIONS = 0;
    public static final int ORDERED = 32;
    public static final int URL_SAFE = 16;
    private static final int a = 76;
    private static final byte c = 10;
    private static final String d = "US-ASCII";
    public static final /* synthetic */ boolean l = false;
    private static final byte[] f = {65, a.l, a.m, a.n, a.o, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, RaceType.CMD_NEED_RESP, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, ISeCommandKt.RPDU_NEED_JUDGE, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, HMDisplaySetting.TYPE_OSPREY_W, 50, HMDisplaySetting.TYPE_VENICE, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte e = -5;
    private static final byte b = 61;
    private static final byte[] g = {-9, -9, -9, -9, -9, -9, -9, -9, -9, e, e, -9, -9, e, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, e, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, -9, -9, -9, HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY, 52, 53, 54, 55, 56, 57, 58, MiLiProProfile.ECF_WRITE_PAI_DATA, MiLiProProfile.ECF_COMMAND_SET_BEEP, b, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, HMDisplaySetting.TYPE_HAWK_SWK, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, HMDisplaySetting.TYPE_OSPREY_W, 50, HMDisplaySetting.TYPE_VENICE, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] h = {65, a.l, a.m, a.n, a.o, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, RaceType.CMD_NEED_RESP, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, ISeCommandKt.RPDU_NEED_JUDGE, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, HMDisplaySetting.TYPE_OSPREY_W, 50, HMDisplaySetting.TYPE_VENICE, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] i = {-9, -9, -9, -9, -9, -9, -9, -9, -9, e, e, -9, -9, e, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, e, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, -9, -9, 52, 53, 54, 55, 56, 57, 58, MiLiProProfile.ECF_WRITE_PAI_DATA, MiLiProProfile.ECF_COMMAND_SET_BEEP, b, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY, -9, 26, 27, 28, 29, 30, 31, 32, 33, HMDisplaySetting.TYPE_HAWK_SWK, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, HMDisplaySetting.TYPE_OSPREY_W, 50, HMDisplaySetting.TYPE_VENICE, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] j = {45, 48, HMDisplaySetting.TYPE_OSPREY_W, 50, HMDisplaySetting.TYPE_VENICE, 52, 53, 54, 55, 56, 57, 65, a.l, a.m, a.n, a.o, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, RaceType.CMD_NEED_RESP, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, ISeCommandKt.RPDU_NEED_JUDGE, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] k = {-9, -9, -9, -9, -9, -9, -9, -9, -9, e, e, -9, -9, e, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, e, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, HMDisplaySetting.TYPE_HAWK_SWK, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, HMDisplaySetting.TYPE_OSPREY_W, 50, HMDisplaySetting.TYPE_VENICE, 52, 53, 54, 55, 56, 57, 58, MiLiProProfile.ECF_WRITE_PAI_DATA, MiLiProProfile.ECF_COMMAND_SET_BEEP, b, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_ACTIVITY_TODAY, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    public static class OutputStream extends FilterOutputStream {
        private boolean a;
        private int b;
        private byte[] c;
        private int d;
        private int e;
        private boolean f;
        private byte[] g;
        private boolean h;
        private int i;
        private byte[] j;

        public OutputStream(java.io.OutputStream outputStream) {
            this(outputStream, 1);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            flushBase64();
            super.close();
            this.c = null;
            ((FilterOutputStream) this).out = null;
        }

        public void flushBase64() throws IOException {
            int i = this.b;
            if (i > 0) {
                if (!this.a) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(Base64.f(this.g, this.c, i, this.i));
                this.b = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            if (this.h) {
                ((FilterOutputStream) this).out.write(i);
                return;
            }
            if (this.a) {
                byte[] bArr = this.c;
                int i2 = this.b;
                int i3 = i2 + 1;
                this.b = i3;
                bArr[i2] = (byte) i;
                int i4 = this.d;
                if (i3 >= i4) {
                    ((FilterOutputStream) this).out.write(Base64.f(this.g, bArr, i4, this.i));
                    int i5 = this.e + 4;
                    this.e = i5;
                    if (this.f && i5 >= 76) {
                        ((FilterOutputStream) this).out.write(10);
                        this.e = 0;
                    }
                    this.b = 0;
                    return;
                }
                return;
            }
            byte[] bArr2 = this.j;
            int i6 = i & 127;
            if (bArr2[i6] <= -5) {
                if (bArr2[i6] != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
                return;
            }
            byte[] bArr3 = this.c;
            int i7 = this.b;
            int i8 = i7 + 1;
            this.b = i8;
            bArr3[i7] = (byte) i;
            if (i8 >= this.d) {
                ((FilterOutputStream) this).out.write(this.g, 0, Base64.d(bArr3, 0, this.g, 0, this.i));
                this.b = 0;
            }
        }

        public OutputStream(java.io.OutputStream outputStream, int i) {
            super(outputStream);
            this.f = (i & 8) != 0;
            boolean z = (i & 1) != 0;
            this.a = z;
            int i2 = z ? 3 : 4;
            this.d = i2;
            this.c = new byte[i2];
            this.b = 0;
            this.e = 0;
            this.h = false;
            this.g = new byte[4];
            this.i = i;
            this.j = Base64.h(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.h) {
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }

    private Base64() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6;
        if (bArr == null) {
            throw new IllegalArgumentException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Destination array was null.");
        }
        if (i2 < 0 || (i5 = i2 + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i2)));
        }
        if (i3 < 0 || (i6 = i3 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i3)));
        }
        byte[] bArrH = h(i4);
        int i7 = i2 + 2;
        if (bArr[i7] == 61) {
            bArr2[i3] = (byte) ((((bArrH[bArr[i2 + 1]] & 255) << 12) | ((bArrH[bArr[i2]] & 255) << 18)) >>> 16);
            return 1;
        }
        if (bArr[i5] == 61) {
            int i8 = ((bArrH[bArr[i7]] & 255) << 6) | ((bArrH[bArr[i2 + 1]] & 255) << 12) | ((bArrH[bArr[i2]] & 255) << 18);
            bArr2[i3] = (byte) (i8 >>> 16);
            bArr2[i3 + 1] = (byte) (i8 >>> 8);
            return 2;
        }
        int i9 = (bArrH[bArr[i5]] & 255) | ((bArrH[bArr[i2 + 1]] & 255) << 12) | ((bArrH[bArr[i2]] & 255) << 18) | ((bArrH[bArr[i7]] & 255) << 6);
        bArr2[i3] = (byte) (i9 >> 16);
        bArr2[i3 + 1] = (byte) (i9 >> 8);
        bArr2[i6] = (byte) i9;
        return 3;
    }

    private static byte[] e(byte[] bArr, int i2, int i3, byte[] bArr2, int i4, int i5) {
        byte[] bArrG = g(i5);
        int i6 = (i3 > 0 ? (bArr[i2] << 24) >>> 8 : 0) | (i3 > 1 ? (bArr[i2 + 1] << 24) >>> 16 : 0) | (i3 > 2 ? (bArr[i2 + 2] << 24) >>> 24 : 0);
        if (i3 == 1) {
            bArr2[i4] = bArrG[i6 >>> 18];
            bArr2[i4 + 1] = bArrG[(i6 >>> 12) & 63];
            bArr2[i4 + 2] = b;
            bArr2[i4 + 3] = b;
            return bArr2;
        }
        if (i3 == 2) {
            bArr2[i4] = bArrG[i6 >>> 18];
            bArr2[i4 + 1] = bArrG[(i6 >>> 12) & 63];
            bArr2[i4 + 2] = bArrG[(i6 >>> 6) & 63];
            bArr2[i4 + 3] = b;
            return bArr2;
        }
        if (i3 != 3) {
            return bArr2;
        }
        bArr2[i4] = bArrG[i6 >>> 18];
        bArr2[i4 + 1] = bArrG[(i6 >>> 12) & 63];
        bArr2[i4 + 2] = bArrG[(i6 >>> 6) & 63];
        bArr2[i4 + 3] = bArrG[i6 & 63];
        return bArr2;
    }

    public static String encodeBytes(byte[] bArr) {
        try {
            return encodeBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] encodeBytesToBytes(byte[] bArr, int i2, int i3, int i4) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream outputStream;
        GZIPOutputStream gZIPOutputStream;
        if (bArr == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i2);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i3);
        }
        if (i2 + i3 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(bArr.length)));
        }
        if ((i4 & 2) == 0) {
            boolean z = (i4 & 8) != 0;
            int i5 = ((i3 / 3) * 4) + (i3 % 3 > 0 ? 4 : 0);
            if (z) {
                i5 += i5 / 76;
            }
            int i6 = i5;
            byte[] bArr2 = new byte[i6];
            int i7 = i3 - 2;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < i7) {
                int i11 = i8;
                e(bArr, i8 + i2, 3, bArr2, i9, i4);
                int i12 = i10 + 4;
                if (!z || i12 < 76) {
                    i10 = i12;
                } else {
                    bArr2[i9 + 4] = 10;
                    i9++;
                    i10 = 0;
                }
                i8 = i11 + 3;
                i9 += 4;
            }
            int i13 = i8;
            if (i13 < i3) {
                e(bArr, i13 + i2, i3 - i13, bArr2, i9, i4);
                i9 += 4;
            }
            int i14 = i9;
            if (i14 > i6 - 1) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i14];
            System.arraycopy(bArr2, 0, bArr3, 0, i14);
            return bArr3;
        }
        GZIPOutputStream gZIPOutputStream2 = null;
        gZIPOutputStream2 = null;
        gZIPOutputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                outputStream = new OutputStream(byteArrayOutputStream, i4 | 1);
                try {
                    gZIPOutputStream = new GZIPOutputStream(outputStream);
                    try {
                        gZIPOutputStream.write(bArr, i2, i3);
                        gZIPOutputStream.close();
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                        try {
                            outputStream.close();
                        } catch (Exception unused2) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused3) {
                        }
                        return byteArrayOutputStream.toByteArray();
                    } catch (IOException e2) {
                        e = e2;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            gZIPOutputStream2 = gZIPOutputStream;
                            if (gZIPOutputStream2 != null) {
                                try {
                                    gZIPOutputStream2.close();
                                } catch (Exception unused4) {
                                }
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (Exception unused5) {
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th;
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (Exception unused6) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPOutputStream2 = gZIPOutputStream;
                        if (gZIPOutputStream2 != null) {
                            gZIPOutputStream2.close();
                        }
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    gZIPOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (gZIPOutputStream2 != null) {
                        gZIPOutputStream2.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (byteArrayOutputStream == null) {
                        throw th;
                    }
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                outputStream = null;
                gZIPOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                outputStream = null;
            }
        } catch (IOException e5) {
            e = e5;
            outputStream = null;
            gZIPOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream = null;
            outputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] f(byte[] bArr, byte[] bArr2, int i2, int i3) {
        e(bArr2, 0, i2, bArr, 0, i3);
        return bArr;
    }

    private static final byte[] g(int i2) {
        if ((i2 & 16) == 16) {
            return h;
        }
        return (i2 & 32) == 32 ? j : f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] h(int i2) {
        if ((i2 & 16) == 16) {
            return i;
        }
        return (i2 & 32) == 32 ? k : g;
    }

    public static String encodeBytes(byte[] bArr, int i2, int i3, int i4) throws Throwable {
        byte[] bArrEncodeBytesToBytes = encodeBytesToBytes(bArr, i2, i3, i4);
        try {
            return new String(bArrEncodeBytesToBytes, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrEncodeBytesToBytes);
        }
    }
}
