package com.autonavi.aps.amapapi.trans;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.restruct.g;
import com.autonavi.aps.amapapi.restruct.j;
import com.autonavi.aps.amapapi.utils.k;
import com.miui.tsmclient.service.DKFRequestService;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.cbt;
import defpackage.e0t;
import defpackage.h0t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.CRC32;
import okhttp3.internal.ws.WebSocketProtocol;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public final class f {
    protected static String I;
    protected static String K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6896a = "1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected short f6897b = 0;
    protected String c = null;
    protected String d = null;
    protected String e = null;
    protected String f = null;
    protected String g = null;
    public String h = null;
    public String i = null;
    protected String j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected String f6898k = null;
    protected String l = null;
    protected String m = null;
    protected String n = null;
    protected String o = null;
    protected String p = null;
    protected String q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected String f6899r = null;
    protected String s = null;
    protected String t = null;
    protected String u = null;
    protected String v = null;
    protected String w = null;
    protected String x = null;
    protected String y = null;
    protected int z = 0;
    protected ArrayList<com.autonavi.aps.amapapi.restruct.d> A = new ArrayList<>();
    protected ArrayList<com.autonavi.aps.amapapi.restruct.d> B = new ArrayList<>();
    protected String C = null;
    protected String D = null;
    protected ArrayList<cbt> E = new ArrayList<>();
    protected String F = null;
    protected String G = null;
    protected byte[] H = null;
    private byte[] Q = null;
    private int R = 0;
    protected String J = null;
    protected String L = null;
    protected String M = null;
    protected String N = null;
    protected int O = 0;
    private List<com.autonavi.aps.amapapi.restruct.f> S = null;
    private List<com.autonavi.aps.amapapi.restruct.d> T = Collections.synchronizedList(new ArrayList());
    final int P = 3;

    private void b() {
        String[] strArr = {this.f6896a, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.l, this.m, this.n, this.o, this.p, this.q, this.f6899r, this.s, this.t, this.u, this.v, this.w, this.x, this.D, this.F, this.G, I, this.M, this.N};
        for (int i = 0; i < 27; i++) {
            if (TextUtils.isEmpty(strArr[i])) {
                strArr[i] = "";
            }
        }
        if (TextUtils.isEmpty(this.j)) {
            this.j = "0";
        } else if (!"0".equals(this.j) && !"2".equals(this.j)) {
            this.j = "0";
        }
        if (TextUtils.isEmpty(this.f6898k)) {
            this.f6898k = "0";
        } else if (!"0".equals(this.f6898k) && !"1".equals(this.f6898k)) {
            this.f6898k = "0";
        }
        if (TextUtils.isEmpty(this.y)) {
            this.y = "0";
        } else if (!"1".equals(this.y) && !"2".equals(this.y)) {
            this.y = "0";
        }
        if (!com.autonavi.aps.amapapi.restruct.e.a(this.z)) {
            this.z = 0;
        }
        if (this.H == null) {
            this.H = new byte[0];
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:107:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:116:0x0305  */
    /* JADX WARN: Code duplicated, block: B:119:0x030e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0314  */
    /* JADX WARN: Code duplicated, block: B:123:0x0317  */
    /* JADX WARN: Code duplicated, block: B:125:0x0325  */
    /* JADX WARN: Code duplicated, block: B:127:0x032d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x032f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0333  */
    /* JADX WARN: Code duplicated, block: B:166:0x0464  */
    /* JADX WARN: Code duplicated, block: B:190:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:192:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:194:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:197:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:200:0x0501  */
    /* JADX WARN: Code duplicated, block: B:356:0x0849  */
    /* JADX WARN: Code duplicated, block: B:358:0x084d  */
    /* JADX WARN: Code duplicated, block: B:359:0x084f  */
    /* JADX WARN: Code duplicated, block: B:362:0x085a  */
    /* JADX WARN: Code duplicated, block: B:365:0x0866  */
    /* JADX WARN: Code duplicated, block: B:367:0x0878  */
    /* JADX WARN: Code duplicated, block: B:370:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:374:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:412:0x08b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0204  */
    /* JADX WARN: Code duplicated, block: B:69:0x020f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0212  */
    /* JADX WARN: Code duplicated, block: B:76:0x0224  */
    /* JADX WARN: Code duplicated, block: B:77:0x0237  */
    /* JADX WARN: Code duplicated, block: B:80:0x0240  */
    /* JADX WARN: Code duplicated, block: B:83:0x0246  */
    /* JADX WARN: Code duplicated, block: B:84:0x0249  */
    /* JADX WARN: Code duplicated, block: B:87:0x0258  */
    /* JADX WARN: Code duplicated, block: B:89:0x0260  */
    /* JADX WARN: Code duplicated, block: B:91:0x0266  */
    /* JADX WARN: Code duplicated, block: B:93:0x0274  */
    /* JADX WARN: Code duplicated, block: B:95:0x027c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0287  */
    /* JADX WARN: Code duplicated, block: B:99:0x029a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final byte[] a() {
        int length;
        int length2;
        int length3;
        int i;
        long jB;
        long j;
        int i2;
        int size;
        int i3;
        int i4;
        int i5;
        int i6;
        long jB2;
        long j2;
        int i7;
        byte b2;
        String str;
        int length4;
        int length5;
        byte[] bArr;
        int length6;
        int i8;
        int length7;
        int i9;
        int length8;
        int i10;
        int i11;
        int length9;
        byte[] bArr2;
        List<com.autonavi.aps.amapapi.restruct.f> list;
        int size2;
        int iCurrentTimeMillis;
        float f;
        char c;
        int i12;
        int length10;
        int length11;
        int i13;
        int i14;
        int i15;
        int length12;
        int length13;
        int i16 = 3;
        ?? r5 = 1;
        int i17 = 1;
        String str2 = "Req";
        b();
        int i18 = 2;
        byte[] bArr3 = new byte[2];
        byte[] bArr4 = new byte[4];
        byte[] bArr5 = this.H;
        int length14 = bArr5 != null ? bArr5.length + DKFRequestService.s0 : 4096;
        byte[] bArr6 = this.Q;
        if (bArr6 == null || length14 > this.R) {
            bArr6 = new byte[length14];
            this.Q = bArr6;
            this.R = length14;
        }
        bArr6[0] = k.g(this.f6896a);
        byte[] bArr7 = null;
        byte[] bArrA = k.a(this.f6897b, (byte[]) null);
        System.arraycopy(bArrA, 0, bArr6, 1, bArrA.length);
        int iA = a(this.q, bArr6, a(this.p, bArr6, a(this.h, bArr6, a(this.u, bArr6, a(this.g, bArr6, a(this.f, bArr6, a(this.e, bArr6, a(this.o, bArr6, a(this.d, bArr6, a(this.c, bArr6, bArrA.length + 1))))))))));
        try {
            if (TextUtils.isEmpty(this.t)) {
                bArr6[iA] = 0;
                length = iA + 1;
            } else {
                byte[] bArrA2 = a(this.t);
                bArr6[iA] = (byte) bArrA2.length;
                int i19 = iA + 1;
                System.arraycopy(bArrA2, 0, bArr6, i19, bArrA2.length);
                length = i19 + bArrA2.length;
            }
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "Req", "buildV4Dot219");
            bArr6[iA] = 0;
        }
        int iA2 = a(this.x, bArr6, a(K, bArr6, a(I, bArr6, a(this.w, bArr6, a(this.v, bArr6, length)))));
        bArr6[iA2] = Byte.parseByte(this.y);
        bArr6[iA2 + 1] = Byte.parseByte(this.j);
        int i20 = this.z;
        int i21 = i20 & 3;
        bArr6[iA2 + 2] = (byte) i20;
        int length15 = iA2 + 3;
        if (i21 == 1 || i21 == 2) {
            byte[] bArrA3 = k.a(this.A.size() > 0 ? this.A.get(0).f6854a : 0, (byte[]) null);
            System.arraycopy(bArrA3, 0, bArr6, length15, bArrA3.length);
            int length16 = length15 + bArrA3.length;
            if (i21 == 1) {
                byte[] bArrA4 = k.a(this.A.size() > 0 ? this.A.get(0).f6855b : 0, (byte[]) null);
                System.arraycopy(bArrA4, 0, bArr6, length16, bArrA4.length);
                int length17 = length16 + bArrA4.length;
                byte[] bArrA5 = k.a(this.A.size() > 0 ? this.A.get(0).c : 0, (byte[]) null);
                System.arraycopy(bArrA5, 0, bArr6, length17, bArrA5.length);
                length2 = length17 + bArrA5.length;
                byte[] bArrB = k.b(this.A.size() > 0 ? this.A.get(0).d : 0, (byte[]) null);
                System.arraycopy(bArrB, 0, bArr6, length2, bArrB.length);
                length3 = bArrB.length;
            } else if (i21 != 2) {
                if (this.A.size() > 0) {
                    i = this.A.get(0).f6856k;
                } else {
                    i = 0;
                }
                if (i <= 127 || i < -128) {
                    i = 0;
                }
                bArr6[length16] = (byte) i;
                int i22 = length16 + 1;
                if (this.A.size() > 0) {
                    jB = (k.b() - this.A.get(0).t) / 1000;
                } else {
                    jB = 0;
                }
                if (jB > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                    jB = 65535;
                }
                if (jB < 0) {
                    j = 0;
                } else {
                    j = jB;
                }
                byte[] bArrA6 = k.a((int) j, bArr3);
                System.arraycopy(bArrA6, 0, bArr6, i22, bArrA6.length);
                i2 = length16 + 3;
                if (i21 == 1) {
                    if (this.A.size() == 0) {
                        bArr6[i2] = 0;
                        length15 = length16 + 4;
                    } else {
                        size = this.A.size();
                        bArr6[i2] = (byte) size;
                        length15 = length16 + 4;
                        i3 = 0;
                        while (i3 < size) {
                            if (this.A.size() > 0) {
                                i4 = this.A.get(i3).c;
                            } else {
                                i4 = 0;
                            }
                            byte[] bArrA7 = k.a(i4, bArr7);
                            System.arraycopy(bArrA7, 0, bArr6, length15, bArrA7.length);
                            int length18 = length15 + bArrA7.length;
                            if (this.A.size() > 0) {
                                i5 = this.A.get(i3).d;
                            } else {
                                i5 = 0;
                            }
                            byte[] bArrB2 = k.b(i5, bArr7);
                            System.arraycopy(bArrB2, 0, bArr6, length18, bArrB2.length);
                            int length19 = length18 + bArrB2.length;
                            if (this.A.size() > 0) {
                                i6 = this.A.get(i3).f6856k;
                            } else {
                                i6 = 0;
                            }
                            if (i6 <= 127 || i6 < -128) {
                                i6 = 0;
                            }
                            bArr6[length19] = (byte) i6;
                            length15 = length19 + 1;
                            if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.2d) {
                                if (this.A.size() > 0) {
                                    jB2 = (k.b() - this.A.get(0).t) / 1000;
                                } else {
                                    jB2 = 0;
                                }
                                if (jB2 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                                    jB2 = 65535;
                                }
                                if (jB2 < 0) {
                                    j2 = 0;
                                } else {
                                    j2 = jB2;
                                }
                                byte[] bArrA8 = k.a((int) j2, bArr3);
                                System.arraycopy(bArrA8, 0, bArr6, length15, bArrA8.length);
                                length15 += bArrA8.length;
                            } else {
                                size = size;
                            }
                            i3++;
                            size = size;
                            bArr7 = null;
                        }
                    }
                } else if (i21 == 2) {
                    bArr6[i2] = 0;
                    length15 = length16 + 4;
                } else {
                    length15 = i2;
                }
            } else {
                byte[] bArrA9 = k.a(this.A.size() > 0 ? this.A.get(0).h : 0, (byte[]) null);
                System.arraycopy(bArrA9, 0, bArr6, length16, bArrA9.length);
                int length20 = length16 + bArrA9.length;
                byte[] bArrA10 = k.a(this.A.size() > 0 ? this.A.get(0).i : 0, (byte[]) null);
                System.arraycopy(bArrA10, 0, bArr6, length20, bArrA10.length);
                int length21 = length20 + bArrA10.length;
                byte[] bArrA11 = k.a(this.A.size() > 0 ? this.A.get(0).j : 0, (byte[]) null);
                System.arraycopy(bArrA11, 0, bArr6, length21, bArrA11.length);
                int length22 = length21 + bArrA11.length;
                byte[] bArrB3 = k.b(this.A.size() > 0 ? this.A.get(0).g : 0, (byte[]) null);
                System.arraycopy(bArrB3, 0, bArr6, length22, bArrB3.length);
                length2 = length22 + bArrB3.length;
                byte[] bArrB4 = k.b(this.A.size() > 0 ? this.A.get(0).f : 0, (byte[]) null);
                System.arraycopy(bArrB4, 0, bArr6, length2, bArrB4.length);
                length3 = bArrB4.length;
            }
            length16 = length2 + length3;
            if (this.A.size() > 0) {
                i = this.A.get(0).f6856k;
            } else {
                i = 0;
            }
            if (i <= 127) {
                i = 0;
            } else {
                i = 0;
            }
            bArr6[length16] = (byte) i;
            int i23 = length16 + 1;
            if (this.A.size() > 0) {
                jB = (k.b() - this.A.get(0).t) / 1000;
            } else {
                jB = 0;
            }
            if (jB > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                jB = 65535;
            }
            if (jB < 0) {
                j = 0;
            } else {
                j = jB;
            }
            byte[] bArrA12 = k.a((int) j, bArr3);
            System.arraycopy(bArrA12, 0, bArr6, i23, bArrA12.length);
            i2 = length16 + 3;
            if (i21 == 1) {
                if (this.A.size() == 0) {
                    bArr6[i2] = 0;
                    length15 = length16 + 4;
                } else {
                    size = this.A.size();
                    bArr6[i2] = (byte) size;
                    length15 = length16 + 4;
                    i3 = 0;
                    while (i3 < size) {
                        if (this.A.size() > 0) {
                            i4 = this.A.get(i3).c;
                        } else {
                            i4 = 0;
                        }
                        byte[] bArrA13 = k.a(i4, bArr7);
                        System.arraycopy(bArrA13, 0, bArr6, length15, bArrA13.length);
                        int length110 = length15 + bArrA13.length;
                        if (this.A.size() > 0) {
                            i5 = this.A.get(i3).d;
                        } else {
                            i5 = 0;
                        }
                        byte[] bArrB5 = k.b(i5, bArr7);
                        System.arraycopy(bArrB5, 0, bArr6, length110, bArrB5.length);
                        int length111 = length110 + bArrB5.length;
                        if (this.A.size() > 0) {
                            i6 = this.A.get(i3).f6856k;
                        } else {
                            i6 = 0;
                        }
                        if (i6 <= 127) {
                            i6 = 0;
                        } else {
                            i6 = 0;
                        }
                        bArr6[length111] = (byte) i6;
                        length15 = length111 + 1;
                        if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.2d) {
                            if (this.A.size() > 0) {
                                jB2 = (k.b() - this.A.get(0).t) / 1000;
                            } else {
                                jB2 = 0;
                            }
                            if (jB2 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                                jB2 = 65535;
                            }
                            if (jB2 < 0) {
                                j2 = 0;
                            } else {
                                j2 = jB2;
                            }
                            byte[] bArrA14 = k.a((int) j2, bArr3);
                            System.arraycopy(bArrA14, 0, bArr6, length15, bArrA14.length);
                            length15 += bArrA14.length;
                        } else {
                            size = size;
                        }
                        i3++;
                        size = size;
                        bArr7 = null;
                    }
                }
            } else if (i21 == 2) {
                bArr6[i2] = 0;
                length15 = length16 + 4;
            } else {
                length15 = i2;
            }
        }
        String str3 = this.C;
        if (str3 == null || (this.z & 8) != 8) {
            bArr6[length15] = 0;
            i7 = length15 + 1;
        } else {
            try {
                byte[] bytes = str3.getBytes("GBK");
                int iMin = Math.min(bytes.length, 60);
                bArr6[length15] = (byte) iMin;
                length15++;
                System.arraycopy(bytes, 0, bArr6, length15, iMin);
                i7 = length15 + iMin;
            } catch (Exception unused) {
                bArr6[length15] = 0;
                i7 = length15 + 1;
            }
        }
        ArrayList<com.autonavi.aps.amapapi.restruct.d> arrayList = this.B;
        int size3 = arrayList.size();
        if ((this.z & 4) != 4 || size3 <= 0) {
            b2 = 1;
            str = "Req";
            bArr6[i7] = 0;
            length4 = i7 + 1;
        } else {
            arrayList.get(0);
            bArr6[i7] = (byte) size3;
            length4 = i7 + 1;
            int i24 = 0;
            while (i24 < size3) {
                com.autonavi.aps.amapapi.restruct.d dVar = arrayList.get(i24);
                int i25 = dVar.l;
                if (i25 == i17 || i25 == i16 || i25 == 4) {
                    byte b3 = (byte) i25;
                    if (dVar.n) {
                        b3 = (byte) (b3 | 8);
                    }
                    bArr6[length4] = b3;
                    int i26 = length4 + (i17 == true ? 1 : 0);
                    byte[] bArrA15 = k.a(dVar.f6854a, bArr3);
                    System.arraycopy(bArrA15, 0, bArr6, i26, bArrA15.length);
                    int length23 = i26 + bArrA15.length;
                    byte[] bArrA16 = k.a(dVar.f6855b, bArr3);
                    System.arraycopy(bArrA16, 0, bArr6, length23, bArrA16.length);
                    int length24 = length23 + bArrA16.length;
                    byte[] bArrA17 = k.a(dVar.c, bArr3);
                    System.arraycopy(bArrA17, 0, bArr6, length24, bArrA17.length);
                    length10 = length24 + bArrA17.length;
                    byte[] bArrB6 = k.b(dVar.d, bArr4);
                    System.arraycopy(bArrB6, 0, bArr6, length10, bArrB6.length);
                    length11 = bArrB6.length;
                } else {
                    if (i25 == i18) {
                        byte b4 = (byte) i25;
                        if (dVar.n) {
                            b4 = (byte) (b4 | 8);
                        }
                        bArr6[length4] = b4;
                        int i27 = length4 + (i17 == true ? 1 : 0);
                        byte[] bArrA18 = k.a(dVar.f6854a, bArr3);
                        System.arraycopy(bArrA18, 0, bArr6, i27, bArrA18.length);
                        int length25 = i27 + bArrA18.length;
                        byte[] bArrA19 = k.a(dVar.h, bArr3);
                        System.arraycopy(bArrA19, 0, bArr6, length25, bArrA19.length);
                        int length26 = length25 + bArrA19.length;
                        byte[] bArrA20 = k.a(dVar.i, bArr3);
                        System.arraycopy(bArrA20, 0, bArr6, length26, bArrA20.length);
                        int length27 = length26 + bArrA20.length;
                        byte[] bArrA21 = k.a(dVar.j, bArr3);
                        System.arraycopy(bArrA21, 0, bArr6, length27, bArrA21.length);
                        int length28 = length27 + bArrA21.length;
                        byte[] bArrB7 = k.b(dVar.g, bArr4);
                        System.arraycopy(bArrB7, 0, bArr6, length28, bArrB7.length);
                        length10 = length28 + bArrB7.length;
                        byte[] bArrB8 = k.b(dVar.f, bArr4);
                        System.arraycopy(bArrB8, 0, bArr6, length10, bArrB8.length);
                        length11 = bArrB8.length;
                    } else if (i25 == 5) {
                        byte b5 = (byte) i25;
                        if (dVar.n) {
                            b5 = (byte) (b5 | 8);
                        }
                        bArr6[length4] = b5;
                        int i28 = length4 + (i17 == true ? 1 : 0);
                        byte[] bArrA22 = k.a(dVar.f6854a, bArr3);
                        System.arraycopy(bArrA22, 0, bArr6, i28, bArrA22.length);
                        int length29 = i28 + bArrA22.length;
                        byte[] bArrA23 = k.a(dVar.f6855b, bArr3);
                        System.arraycopy(bArrA23, 0, bArr6, length29, bArrA23.length);
                        int length30 = length29 + bArrA23.length;
                        byte[] bArrA24 = k.a(dVar.c, bArr3);
                        System.arraycopy(bArrA24, 0, bArr6, length30, bArrA24.length);
                        int length31 = length30 + bArrA24.length;
                        System.arraycopy(k.a(dVar.e), 0, bArr6, length31, 8);
                        length4 = length31 + 8;
                    }
                    i13 = dVar.f6856k;
                    if (i13 <= 127 || i13 < -128) {
                        i13 = 99;
                    }
                    bArr6[length4] = (byte) i13;
                    int i29 = length4 + (i17 == true ? 1 : 0);
                    String str4 = str2;
                    byte[] bArrA25 = k.a((short) ((k.b() - dVar.t) / 1000), bArr3);
                    System.arraycopy(bArrA25, 0, bArr6, i29, bArrA25.length);
                    length4 = i29 + bArrA25.length;
                    i14 = dVar.l;
                    if (i14 != 3 || i14 == 4 || i14 == 5) {
                        if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.0d) {
                            i15 = dVar.o;
                            if (i15 > 32767) {
                                i15 = 32767;
                            }
                            byte[] bArrA26 = k.a(i15 >= 0 ? i15 : 32767, bArr3);
                            System.arraycopy(bArrA26, 0, bArr6, length4, bArrA26.length);
                            length4 += bArrA26.length;
                            if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.3d) {
                                byte[] bArrB9 = k.b(dVar.p, bArr4);
                                System.arraycopy(bArrB9, 0, bArr6, length4, bArrB9.length);
                                length12 = length4 + bArrB9.length;
                                byte[] bArrB10 = k.b(dVar.q, bArr4);
                                System.arraycopy(bArrB10, 0, bArr6, length12, bArrB10.length);
                                length13 = bArrB10.length;
                                length4 = length12 + length13;
                            }
                        }
                    } else if (i14 == 1 && Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.3d) {
                        int i30 = dVar.o;
                        if (i30 > 32767) {
                            i30 = 32767;
                        }
                        byte[] bArrA27 = k.a(i30 >= 0 ? i30 : 32767, bArr3);
                        System.arraycopy(bArrA27, 0, bArr6, length4, bArrA27.length);
                        int length32 = length4 + bArrA27.length;
                        byte[] bArrB11 = k.b(dVar.p, bArr4);
                        System.arraycopy(bArrB11, 0, bArr6, length32, bArrB11.length);
                        length12 = length32 + bArrB11.length;
                        byte[] bArrB12 = k.b(dVar.q, bArr4);
                        System.arraycopy(bArrB12, 0, bArr6, length12, bArrB12.length);
                        length13 = bArrB12.length;
                        length4 = length12 + length13;
                    }
                    i24++;
                    i17 = 1;
                    str2 = str4;
                    i16 = 3;
                    i18 = 2;
                }
                length4 = length10 + length11;
                i13 = dVar.f6856k;
                if (i13 <= 127) {
                    i13 = 99;
                } else {
                    i13 = 99;
                }
                bArr6[length4] = (byte) i13;
                int i210 = length4 + (i17 == true ? 1 : 0);
                String str5 = str2;
                byte[] bArrA28 = k.a((short) ((k.b() - dVar.t) / 1000), bArr3);
                System.arraycopy(bArrA28, 0, bArr6, i210, bArrA28.length);
                length4 = i210 + bArrA28.length;
                i14 = dVar.l;
                if (i14 != 3) {
                    if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.0d) {
                        i15 = dVar.o;
                        if (i15 > 32767) {
                            i15 = 32767;
                        }
                        byte[] bArrA29 = k.a(i15 >= 0 ? i15 : 32767, bArr3);
                        System.arraycopy(bArrA29, 0, bArr6, length4, bArrA29.length);
                        length4 += bArrA29.length;
                        if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.3d) {
                            byte[] bArrB13 = k.b(dVar.p, bArr4);
                            System.arraycopy(bArrB13, 0, bArr6, length4, bArrB13.length);
                            length12 = length4 + bArrB13.length;
                            byte[] bArrB14 = k.b(dVar.q, bArr4);
                            System.arraycopy(bArrB14, 0, bArr6, length12, bArrB14.length);
                            length13 = bArrB14.length;
                            length4 = length12 + length13;
                        }
                    }
                } else if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.0d) {
                    i15 = dVar.o;
                    if (i15 > 32767) {
                        i15 = 32767;
                    }
                    byte[] bArrA210 = k.a(i15 >= 0 ? i15 : 32767, bArr3);
                    System.arraycopy(bArrA210, 0, bArr6, length4, bArrA210.length);
                    length4 += bArrA210.length;
                    if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.3d) {
                        byte[] bArrB15 = k.b(dVar.p, bArr4);
                        System.arraycopy(bArrB15, 0, bArr6, length4, bArrB15.length);
                        length12 = length4 + bArrB15.length;
                        byte[] bArrB16 = k.b(dVar.q, bArr4);
                        System.arraycopy(bArrB16, 0, bArr6, length12, bArrB16.length);
                        length13 = bArrB16.length;
                        length4 = length12 + length13;
                    }
                }
                i24++;
                i17 = 1;
                str2 = str5;
                i16 = 3;
                i18 = 2;
            }
            b2 = i17 == true ? 1 : 0;
            str = str2;
            r5 = i17;
        }
        if (TextUtils.isEmpty(this.D) || this.D.length() == 0) {
            bArr6[length4] = 0;
            length5 = length4 + 1;
        } else {
            bArr6[length4] = b2;
            length5 = length4 + 1;
            try {
                String[] strArrSplit = this.D.split(",");
                byte[] bArrA30 = a(strArrSplit[0]);
                System.arraycopy(bArrA30, 0, bArr6, length5, bArrA30.length);
                length5 += bArrA30.length;
                try {
                    try {
                        byte[] bytes2 = strArrSplit[2].getBytes("GBK");
                        int length33 = bytes2.length;
                        if (length33 > 127) {
                            length33 = 127;
                        }
                        bArr6[length5] = (byte) length33;
                        r5 = 1;
                        length5++;
                        System.arraycopy(bytes2, 0, bArr6, length5, length33);
                        i12 = length5 + length33;
                        r5 = str;
                        c = 1;
                    } catch (Throwable th2) {
                        String str6 = str;
                        com.autonavi.aps.amapapi.utils.c.a(th2, str6, "buildV4Dot214");
                        bArr6[length5] = 0;
                        c = 1;
                        i12 = length5 + 1;
                        r5 = str6;
                    }
                    int i31 = Integer.parseInt(strArrSplit[c]);
                    if (i31 > 127 || i31 < -128) {
                        i31 = 0;
                    }
                    bArr6[i12] = Byte.parseByte(String.valueOf(i31));
                    length5 = i12 + 1;
                    if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.2d) {
                        byte[] bArrA31 = k.a(this.O, bArr3);
                        System.arraycopy(bArrA31, 0, bArr6, length5, bArrA31.length);
                        length5 += bArrA31.length;
                    }
                    b2 = 1;
                } catch (Throwable th3) {
                    th = th3;
                    com.autonavi.aps.amapapi.utils.c.a(th, r5, "buildV4Dot216");
                    byte[] bArrA32 = a("00:00:00:00:00:00");
                    System.arraycopy(bArrA32, 0, bArr6, length5, bArrA32.length);
                    int length34 = length5 + bArrA32.length;
                    bArr6[length34] = 0;
                    b2 = 1;
                    bArr6[length34 + 1] = Byte.parseByte("0");
                    length5 = length34 + 2;
                }
            } catch (Throwable th4) {
                th = th4;
                r5 = str;
            }
        }
        ArrayList<cbt> arrayList2 = this.E;
        int iMin2 = Math.min(arrayList2.size(), 25);
        if (iMin2 == 0) {
            bArr6[length5] = 0;
            length6 = length5 + b2;
            bArr = bArr3;
        } else {
            bArr6[length5] = (byte) iMin2;
            int length35 = length5 + b2;
            boolean z = k.c() >= 17;
            long jB3 = z ? k.b() / 1000 : 0L;
            int i32 = 0;
            while (i32 < iMin2) {
                cbt cbtVar = arrayList2.get(i32);
                byte[] bArrA33 = a(cbt.c(cbtVar.f5174a));
                System.arraycopy(bArrA33, 0, bArr6, length35, bArrA33.length);
                int length36 = length35 + bArrA33.length;
                try {
                    byte[] bytes3 = cbtVar.f5175b.getBytes("GBK");
                    bArr6[length36] = (byte) bytes3.length;
                    length36++;
                    System.arraycopy(bytes3, 0, bArr6, length36, bytes3.length);
                    length7 = length36 + bytes3.length;
                    i8 = 1;
                } catch (Exception unused2) {
                    bArr6[length36] = 0;
                    i8 = 1;
                    length7 = length36 + 1;
                }
                int i33 = cbtVar.c;
                if (i33 > 127 || i33 < -128) {
                    i33 = 0;
                }
                bArr6[length7] = Byte.parseByte(String.valueOf(i33));
                int i34 = length7 + i8;
                byte[] bArr8 = bArr3;
                if (!z || (i9 = (int) (jB3 - (cbtVar.f / 1000))) < 0) {
                    i9 = 0;
                }
                if (i9 > 65535) {
                    i9 = 65535;
                }
                byte[] bArrA34 = k.a(i9, bArr8);
                System.arraycopy(bArrA34, 0, bArr6, i34, bArrA34.length);
                int length37 = i34 + bArrA34.length;
                byte[] bArrA35 = k.a(cbtVar.d, bArr8);
                System.arraycopy(bArrA35, 0, bArr6, length37, bArrA35.length);
                length35 = length37 + bArrA35.length;
                i32++;
                bArr3 = bArr8;
            }
            bArr = bArr3;
            byte[] bArrA36 = k.a(Integer.parseInt(this.F), bArr);
            System.arraycopy(bArrA36, 0, bArr6, length35, bArrA36.length);
            length6 = length35 + bArrA36.length;
        }
        bArr6[length6] = 0;
        int i35 = length6 + 1;
        try {
            String str7 = this.G;
            if (str7 == null) {
                bArr6[i35] = 0;
                i10 = 2;
                length8 = length6 + 2;
            } else {
                byte[] bytes4 = str7.getBytes("GBK");
                if (bytes4.length > 127) {
                    bytes4 = null;
                }
                if (bytes4 == null) {
                    bArr6[i35] = 0;
                    length8 = length6 + 2;
                    i10 = 2;
                } else {
                    bArr6[i35] = (byte) bytes4.length;
                    int i36 = length6 + 2;
                    System.arraycopy(bytes4, 0, bArr6, i36, bytes4.length);
                    length8 = bytes4.length + i36;
                    i10 = 2;
                }
            }
        } catch (Throwable unused3) {
            bArr6[i35] = 0;
            length8 = i35 + 1;
        }
        byte[] bArrA37 = new byte[i10];
        // fill-array-data instruction
        bArrA37[0] = 0;
        bArrA37[1] = 0;
        try {
            boolean zIsEmpty = TextUtils.isEmpty(this.J);
            if (!zIsEmpty) {
                bArrA37 = k.a(this.J.length(), bArr);
            }
            try {
                System.arraycopy(bArrA37, 0, bArr6, length8, 2);
                length9 = length8 + 2;
                if (!zIsEmpty) {
                    try {
                        byte[] bytes5 = this.J.getBytes("GBK");
                        System.arraycopy(bytes5, 0, bArr6, length9, bytes5.length);
                        length9 += bytes5.length;
                    } catch (Throwable unused4) {
                    }
                }
                i11 = 2;
            } catch (Throwable unused5) {
                i11 = 2;
                length9 = length8 + i11;
            }
        } catch (Throwable unused6) {
            i11 = 2;
        }
        try {
            System.arraycopy(k.a(0, bArr), 0, bArr6, length9, i11);
        } catch (Throwable unused7) {
        }
        int i37 = length9 + i11;
        byte[] bArr9 = new byte[i11];
        // fill-array-data instruction
        bArr9[0] = 0;
        bArr9[1] = 0;
        try {
            System.arraycopy(bArr9, 0, bArr6, i37, i11);
        } catch (Throwable unused8) {
        }
        int i38 = i37 + i11;
        byte[] bArr10 = this.H;
        int length38 = bArr10 != null ? bArr10.length : 0;
        byte[] bArrA38 = k.a(length38, (byte[]) null);
        System.arraycopy(bArrA38, 0, bArr6, i38, bArrA38.length);
        int length39 = i38 + bArrA38.length;
        if (length38 > 0) {
            byte[] bArr11 = this.H;
            System.arraycopy(bArr11, 0, bArr6, length39, bArr11.length);
            length39 += this.H.length;
        }
        if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.0d) {
            List<com.autonavi.aps.amapapi.restruct.d> list2 = this.T;
            int size4 = list2 != null ? list2.size() : 0;
            bArr6[length39] = (byte) size4;
            int i39 = length39 + 1;
            byte[] bArr12 = new byte[i39];
            System.arraycopy(bArr6, 0, bArr12, 0, i39);
            if (size4 > 0) {
                try {
                    int length40 = i39;
                    for (com.autonavi.aps.amapapi.restruct.d dVar2 : this.T) {
                        int i40 = dVar2.l;
                        if (i40 == 1 || i40 == 3 || i40 == 4) {
                            byte[] bArr13 = bArr;
                            byte b6 = (byte) i40;
                            if (dVar2.n) {
                                b6 = (byte) (b6 | 8);
                            }
                            bArr6[length40] = b6;
                            int i41 = length40 + 1;
                            bArr2 = bArr13;
                            byte[] bArrA39 = k.a(dVar2.c, bArr2);
                            System.arraycopy(bArrA39, 0, bArr6, i41, bArrA39.length);
                            int length41 = i41 + bArrA39.length;
                            byte[] bArrB17 = k.b(dVar2.d, bArr4);
                            System.arraycopy(bArrB17, 0, bArr6, length41, bArrB17.length);
                            length40 = length41 + bArrB17.length;
                        } else if (i40 == 2) {
                            byte b7 = (byte) i40;
                            if (dVar2.n) {
                                b7 = (byte) (b7 | 8);
                            }
                            bArr6[length40] = b7;
                            int i42 = length40 + 1;
                            byte[] bArrA40 = k.a(dVar2.h, bArr);
                            System.arraycopy(bArrA40, 0, bArr6, i42, bArrA40.length);
                            int length42 = i42 + bArrA40.length;
                            byte[] bArrA41 = k.a(dVar2.i, bArr);
                            System.arraycopy(bArrA41, 0, bArr6, length42, bArrA41.length);
                            int length43 = length42 + bArrA41.length;
                            byte[] bArrA42 = k.a(dVar2.j, bArr);
                            System.arraycopy(bArrA42, 0, bArr6, length43, bArrA42.length);
                            length40 = length43 + bArrA42.length;
                            bArr2 = bArr;
                        } else if (i40 == 5) {
                            byte b8 = (byte) i40;
                            if (dVar2.n) {
                                b8 = (byte) (b8 | 8);
                            }
                            bArr6[length40] = b8;
                            int i43 = length40 + 1;
                            byte[] bArrA43 = k.a(dVar2.c, bArr);
                            System.arraycopy(bArrA43, 0, bArr6, i43, bArrA43.length);
                            int length44 = i43 + bArrA43.length;
                            byte[] bArr14 = bArr;
                            try {
                                System.arraycopy(k.a(dVar2.e), 0, bArr6, length44, 8);
                                length40 = length44 + 8;
                                bArr2 = bArr14;
                            } catch (Throwable unused9) {
                                bArr2 = bArr14;
                                System.arraycopy(bArr12, 0, bArr6, 0, i39);
                                bArr6[length39] = 0;
                                length39 = a(this.M, bArr6, i39);
                                if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.2d) {
                                    list = this.S;
                                    if (list == null) {
                                        size2 = 0;
                                    } else {
                                        size2 = list.size();
                                    }
                                    bArr6[length39] = (byte) size2;
                                    length39++;
                                    if (size2 > 0) {
                                        for (com.autonavi.aps.amapapi.restruct.f fVar : this.S) {
                                            iCurrentTimeMillis = ((int) (System.currentTimeMillis() - fVar.d)) / 1000;
                                            if (iCurrentTimeMillis > 65535) {
                                                iCurrentTimeMillis = 65535;
                                            }
                                            System.arraycopy(k.a(iCurrentTimeMillis, bArr2), 0, bArr6, length39, 2);
                                            System.arraycopy(k.b((int) Math.round(fVar.c * 1.0E7d), bArr4), 0, bArr6, length39 + 2, 4);
                                            System.arraycopy(k.b((int) Math.round(fVar.f6865b * 1.0E7d), bArr4), 0, bArr6, length39 + 6, 4);
                                            int i44 = length39 + 10;
                                            f = fVar.e;
                                            if (f > 65535.0f) {
                                                f = 65535.0f;
                                            }
                                            System.arraycopy(k.a((int) f, bArr2), 0, bArr6, i44, 2);
                                            System.arraycopy(k.a((short) ((fVar.h | (fVar.f6864a << 13) | (fVar.g << 6)) & 65535), bArr2), 0, bArr6, length39 + 12, 2);
                                            length39 += 14;
                                        }
                                    }
                                }
                                if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.3d) {
                                    length39 = a(this.N, bArr6, length39);
                                }
                                byte[] bArr15 = new byte[length39];
                                System.arraycopy(bArr6, 0, bArr15, 0, length39);
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr15);
                                byte[] bArrA44 = k.a(crc32.getValue());
                                byte[] bArr16 = new byte[length39 + 8];
                                System.arraycopy(bArr15, 0, bArr16, 0, length39);
                                System.arraycopy(bArrA44, 0, bArr16, length39, 8);
                                return bArr16;
                            }
                        } else {
                            bArr2 = bArr;
                        }
                        try {
                            byte[] bArrA45 = k.a((short) ((k.b() - dVar2.t) / 1000), bArr2);
                            System.arraycopy(bArrA45, 0, bArr6, length40, bArrA45.length);
                            length40 += bArrA45.length;
                            bArr = bArr2;
                        } catch (Throwable unused10) {
                            System.arraycopy(bArr12, 0, bArr6, 0, i39);
                            bArr6[length39] = 0;
                            length39 = a(this.M, bArr6, i39);
                            if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.2d) {
                                list = this.S;
                                if (list == null) {
                                    size2 = 0;
                                } else {
                                    size2 = list.size();
                                }
                                bArr6[length39] = (byte) size2;
                                length39++;
                                if (size2 > 0) {
                                    while (r0.hasNext()) {
                                        iCurrentTimeMillis = ((int) (System.currentTimeMillis() - fVar.d)) / 1000;
                                        if (iCurrentTimeMillis > 65535) {
                                            iCurrentTimeMillis = 65535;
                                        }
                                        System.arraycopy(k.a(iCurrentTimeMillis, bArr2), 0, bArr6, length39, 2);
                                        System.arraycopy(k.b((int) Math.round(fVar.c * 1.0E7d), bArr4), 0, bArr6, length39 + 2, 4);
                                        System.arraycopy(k.b((int) Math.round(fVar.f6865b * 1.0E7d), bArr4), 0, bArr6, length39 + 6, 4);
                                        int i45 = length39 + 10;
                                        f = fVar.e;
                                        if (f > 65535.0f) {
                                            f = 65535.0f;
                                        }
                                        System.arraycopy(k.a((int) f, bArr2), 0, bArr6, i45, 2);
                                        System.arraycopy(k.a((short) ((fVar.h | (fVar.f6864a << 13) | (fVar.g << 6)) & 65535), bArr2), 0, bArr6, length39 + 12, 2);
                                        length39 += 14;
                                    }
                                }
                            }
                            if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.3d) {
                                length39 = a(this.N, bArr6, length39);
                            }
                            byte[] bArr17 = new byte[length39];
                            System.arraycopy(bArr6, 0, bArr17, 0, length39);
                            CRC32 crc33 = new CRC32();
                            crc33.update(bArr17);
                            byte[] bArrA46 = k.a(crc33.getValue());
                            byte[] bArr18 = new byte[length39 + 8];
                            System.arraycopy(bArr17, 0, bArr18, 0, length39);
                            System.arraycopy(bArrA46, 0, bArr18, length39, 8);
                            return bArr18;
                        }
                    }
                    bArr2 = bArr;
                    i39 = length40;
                } catch (Throwable unused11) {
                    bArr2 = bArr;
                }
            } else {
                bArr2 = bArr;
            }
            length39 = a(this.M, bArr6, i39);
        } else {
            bArr2 = bArr;
        }
        if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.2d) {
            list = this.S;
            if (list == null) {
                size2 = 0;
            } else {
                size2 = list.size();
            }
            bArr6[length39] = (byte) size2;
            length39++;
            if (size2 > 0) {
                while (r0.hasNext()) {
                    iCurrentTimeMillis = ((int) (System.currentTimeMillis() - fVar.d)) / 1000;
                    if (iCurrentTimeMillis > 65535) {
                        iCurrentTimeMillis = 65535;
                    }
                    System.arraycopy(k.a(iCurrentTimeMillis, bArr2), 0, bArr6, length39, 2);
                    System.arraycopy(k.b((int) Math.round(fVar.c * 1.0E7d), bArr4), 0, bArr6, length39 + 2, 4);
                    System.arraycopy(k.b((int) Math.round(fVar.f6865b * 1.0E7d), bArr4), 0, bArr6, length39 + 6, 4);
                    int i46 = length39 + 10;
                    f = fVar.e;
                    if (f > 65535.0f) {
                        f = 65535.0f;
                    }
                    System.arraycopy(k.a((int) f, bArr2), 0, bArr6, i46, 2);
                    System.arraycopy(k.a((short) ((fVar.h | (fVar.f6864a << 13) | (fVar.g << 6)) & 65535), bArr2), 0, bArr6, length39 + 12, 2);
                    length39 += 14;
                }
            }
        }
        if (Double.valueOf(com.autonavi.aps.amapapi.utils.c.f6905a).doubleValue() >= 5.3d) {
            length39 = a(this.N, bArr6, length39);
        }
        byte[] bArr19 = new byte[length39];
        System.arraycopy(bArr6, 0, bArr19, 0, length39);
        CRC32 crc34 = new CRC32();
        crc34.update(bArr19);
        byte[] bArrA47 = k.a(crc34.getValue());
        byte[] bArr110 = new byte[length39 + 8];
        System.arraycopy(bArr19, 0, bArr110, 0, length39);
        System.arraycopy(bArrA47, 0, bArr110, length39, 8);
        return bArr110;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017 A[Catch: all -> 0x0010, LOOP:0: B:10:0x0015->B:11:0x0017, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x000c, B:13:0x001f, B:15:0x0022, B:17:0x002b, B:18:0x0033, B:9:0x0012, B:11:0x0017), top: B:22:0x000c }] */
    private byte[] a(String str) {
        int i;
        String[] strArrSplit = str.split(":");
        byte[] bArr = new byte[6];
        if (strArrSplit != null) {
            try {
                if (strArrSplit.length != 6) {
                    strArrSplit = new String[6];
                    for (i = 0; i < 6; i++) {
                        strArrSplit[i] = "0";
                    }
                }
            } catch (Throwable th) {
                com.autonavi.aps.amapapi.utils.c.a(th, "Req", "getMacBa ".concat(str));
                return a("00:00:00:00:00:00");
            }
        } else {
            strArrSplit = new String[6];
            while (i < 6) {
                strArrSplit[i] = "0";
            }
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            if (strArrSplit[i2].length() > 2) {
                strArrSplit[i2] = strArrSplit[i2].substring(0, 2);
            }
            bArr[i2] = (byte) Integer.parseInt(strArrSplit[i2], 16);
        }
        return bArr;
    }

    public final void a(Context context, boolean z, boolean z2, com.autonavi.aps.amapapi.restruct.e eVar, com.autonavi.aps.amapapi.restruct.k kVar, ConnectivityManager connectivityManager, String str, g gVar) {
        String str2;
        String str3;
        String str4;
        NetworkInfo activeNetworkInfo;
        String strA;
        String str5;
        ArrayList<cbt> arrayList;
        String strK = e0t.k(context);
        int iD = k.d();
        this.J = str;
        this.S = null;
        if (!z2) {
            str2 = "UC_nlp_20131029";
            str3 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U";
        } else {
            str2 = "api_serverSDK_130905";
            str3 = "S128DF1572465B890OE3F7A13167KLEI";
        }
        String str6 = str3;
        String str7 = str2;
        StringBuilder sb = new StringBuilder();
        int iG = eVar.g();
        int iH = eVar.h();
        TelephonyManager telephonyManagerI = eVar.i();
        ArrayList<com.autonavi.aps.amapapi.restruct.d> arrayListC = eVar.c();
        ArrayList<com.autonavi.aps.amapapi.restruct.d> arrayListD = eVar.d();
        ArrayList<cbt> arrayListE = kVar.e();
        String str8 = iH == 2 ? "1" : "0";
        if (telephonyManagerI == null) {
            str4 = "1";
        } else {
            if (TextUtils.isEmpty(com.autonavi.aps.amapapi.utils.c.g)) {
                try {
                    com.autonavi.aps.amapapi.utils.c.g = h0t.N();
                } catch (Throwable th) {
                    com.autonavi.aps.amapapi.utils.c.a(th, "Aps", "getApsReq part4");
                }
            }
            str4 = "1";
            if (TextUtils.isEmpty(com.autonavi.aps.amapapi.utils.c.g) && Build.VERSION.SDK_INT < 29) {
                com.autonavi.aps.amapapi.utils.c.g = "888888888888888";
            }
            if (TextUtils.isEmpty(com.autonavi.aps.amapapi.utils.c.h)) {
                try {
                    com.autonavi.aps.amapapi.utils.c.h = h0t.R();
                } catch (SecurityException unused) {
                } catch (Throwable th2) {
                    com.autonavi.aps.amapapi.utils.c.a(th2, "Aps", "getApsReq part2");
                }
            }
            if (TextUtils.isEmpty(com.autonavi.aps.amapapi.utils.c.h) && Build.VERSION.SDK_INT < 29) {
                com.autonavi.aps.amapapi.utils.c.h = "888888888888888";
            }
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th3) {
            com.autonavi.aps.amapapi.utils.c.a(th3, "Aps", "getApsReq part");
            activeNetworkInfo = null;
        }
        boolean zA = kVar.a(connectivityManager);
        if (k.a(activeNetworkInfo) == -1) {
            strA = "";
            str5 = strA;
        } else {
            strA = k.a(connectivityManager);
            str5 = zA ? "2" : str4;
        }
        if ((iG & 4) == 4 && !arrayListD.isEmpty()) {
            this.B.clear();
            this.B.addAll(arrayListD);
        } else {
            this.B.clear();
        }
        this.A.clear();
        this.A.addAll(arrayListC);
        StringBuilder sb2 = new StringBuilder();
        if (kVar.l()) {
            if (zA) {
                j jVarN = kVar.n();
                if (com.autonavi.aps.amapapi.restruct.k.a(jVarN)) {
                    sb2.append(jVarN.a());
                    sb2.append(",");
                    int iC = jVarN.c();
                    if (iC < -128 || iC > 127) {
                        iC = 0;
                    }
                    sb2.append(iC);
                    sb2.append(",");
                    String strB = jVarN.b();
                    try {
                        if (strB.getBytes("UTF-8").length >= 32) {
                            strB = "unkwn";
                        }
                    } catch (Exception unused2) {
                    }
                    sb2.append(strB.replace(Marker.ANY_MARKER, "."));
                }
            }
            if (arrayListE != null && (arrayList = this.E) != null) {
                arrayList.clear();
                this.E.addAll(arrayListE);
            }
        } else {
            kVar.g();
            ArrayList<cbt> arrayList2 = this.E;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        this.f6897b = (short) 0;
        if (!z) {
            this.f6897b = (short) 2;
        }
        this.c = str7;
        this.d = str6;
        this.f = Build.MODEL;
        this.g = PluginPackageConstant.RN_DIR_A + Build.VERSION.RELEASE;
        this.h = k.b(context);
        this.i = str8;
        this.j = "0";
        this.f6898k = "0";
        this.l = "0";
        this.m = "0";
        this.n = "0";
        this.o = strK;
        this.p = com.autonavi.aps.amapapi.utils.c.g;
        this.q = com.autonavi.aps.amapapi.utils.c.h;
        this.s = String.valueOf(iD);
        this.t = k.i(context);
        this.v = "6.4.9";
        this.w = null;
        this.u = "";
        this.x = strA;
        this.y = str5;
        this.z = iG;
        this.C = eVar.l();
        this.F = com.autonavi.aps.amapapi.restruct.k.q();
        this.D = sb2.toString();
        this.O = (int) ((k.b() - kVar.r()) / 1000);
        try {
            if (TextUtils.isEmpty(I)) {
                I = h0t.D(context);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (TextUtils.isEmpty(K)) {
                K = h0t.n(context);
            }
        } catch (Throwable unused4) {
        }
        try {
            if (TextUtils.isEmpty(this.M)) {
                this.M = h0t.C();
            }
        } catch (Throwable unused5) {
        }
        try {
            if (TextUtils.isEmpty(this.N)) {
                this.N = h0t.B(context);
            }
        } catch (Throwable unused6) {
        }
        try {
            this.S = gVar.a(this.B, this.E);
            a(this.A, this.B);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        sb.delete(0, sb.length());
        sb2.delete(0, sb2.length());
    }

    private void a(ArrayList<com.autonavi.aps.amapapi.restruct.d> arrayList, ArrayList<com.autonavi.aps.amapapi.restruct.d> arrayList2) {
        if (arrayList2 != null && arrayList2.size() > 0) {
            for (com.autonavi.aps.amapapi.restruct.d dVar : arrayList2) {
                if (dVar.f6857r && dVar.n) {
                    a(dVar, this.T);
                    return;
                }
            }
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        a(arrayList.get(0), this.T);
    }

    private static void a(com.autonavi.aps.amapapi.restruct.d dVar, List<com.autonavi.aps.amapapi.restruct.d> list) {
        if (dVar == null || list == null) {
            return;
        }
        int size = list.size();
        if (size == 0) {
            list.add(dVar);
            return;
        }
        int i = -1;
        long jMin = Long.MAX_VALUE;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            com.autonavi.aps.amapapi.restruct.d dVar2 = list.get(i2);
            if (dVar.c() != null && dVar.c().equals(dVar2.c())) {
                int i4 = dVar.s;
                if (i4 == dVar2.s) {
                    break;
                }
                dVar2.t = dVar.t;
                dVar2.s = i4;
                break;
            }
            jMin = Math.min(jMin, dVar2.t);
            if (jMin == dVar2.t) {
                i3 = i2;
            }
            i2++;
        }
        if (i >= 0) {
            if (size < 3) {
                list.add(dVar);
            } else {
                if (dVar.t <= jMin || i >= size) {
                    return;
                }
                list.remove(i);
                list.add(dVar);
            }
        }
    }

    private static int a(String str, byte[] bArr, int i) {
        try {
            if (TextUtils.isEmpty(str)) {
                bArr[i] = 0;
                return i + 1;
            }
            byte[] bytes = str.getBytes("GBK");
            int length = bytes.length;
            if (length > 127) {
                length = 127;
            }
            bArr[i] = (byte) length;
            int i2 = i + 1;
            System.arraycopy(bytes, 0, bArr, i2, length);
            return i2 + length;
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "Req", "copyContentWithByteLen");
            bArr[i] = 0;
        }
    }
}
