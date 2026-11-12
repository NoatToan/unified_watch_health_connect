package com.amap.api.mapcore.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huami.mifit.sportlib.gpx.data.GPXBasePoint;
import java.util.ArrayList;
import java.util.zip.CRC32;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public final class kc {
    public static String J;
    public static String L;
    public String a = "1";
    public short b = 0;
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = null;
    public String g = null;
    public String h = null;
    public String i = null;
    public String j = null;
    public String k = null;
    public String l = null;
    public String m = null;
    public String n = null;
    public String o = null;
    public String p = null;
    public String q = null;
    public String r = null;
    public String s = null;
    public String t = null;
    public String u = null;
    public String v = null;
    public String w = null;
    public String x = null;
    public String y = null;
    public int z = 0;
    public String A = null;
    public String B = null;
    public ArrayList<lg> C = new ArrayList<>();
    public String D = null;
    public String E = null;
    public ArrayList<ScanResult> F = new ArrayList<>();
    public String G = null;
    public String H = null;
    public byte[] I = null;
    private byte[] P = null;
    private int Q = 0;
    public String K = null;
    public String M = null;
    public String N = null;
    public String O = null;

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
            ke.a(th, "Req", "copyContentWithByteLen");
            bArr[i] = 0;
        }
    }

    private String a(String str, int i) {
        String[] strArrSplit = this.B.split("\\*")[i].split(",");
        if ("lac".equals(str)) {
            return strArrSplit[0];
        }
        if ("cellid".equals(str)) {
            return strArrSplit[1];
        }
        if ("signal".equals(str)) {
            return strArrSplit[2];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000f A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:4:0x000c, B:10:0x001c, B:12:0x001f, B:14:0x0028, B:15:0x0030, B:6:0x000f, B:8:0x0014), top: B:20:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014 A[Catch: all -> 0x003e, LOOP:0: B:7:0x0012->B:8:0x0014, LOOP_END, TryCatch #0 {all -> 0x003e, blocks: (B:4:0x000c, B:10:0x001c, B:12:0x001f, B:14:0x0028, B:15:0x0030, B:6:0x000f, B:8:0x0014), top: B:20:0x000c }] */
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
                ke.a(th, "Req", "getMacBa ".concat(str));
                return a(com.alipay.sdk.m.u.c.b);
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

    private String b(String str) {
        if (TextUtils.isEmpty(this.A)) {
            return "0";
        }
        if (!this.A.contains(str + SearchCriteria.GT)) {
            return "0";
        }
        return this.A.substring(this.A.indexOf(str + SearchCriteria.GT) + str.length() + 1, this.A.indexOf("</".concat(String.valueOf(str))));
    }

    /* JADX WARN: Code duplicated, block: B:302:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:71:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x0300  */
    /* JADX WARN: Code duplicated, block: B:83:0x0317  */
    /* JADX WARN: Code duplicated, block: B:85:0x0325 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0327  */
    public final byte[] a() {
        int length;
        int length2;
        int length3;
        int i;
        int length4;
        int i2;
        int i3;
        int i4;
        int length5;
        int i5;
        int length6;
        int length7;
        int i6;
        int length8;
        int i7;
        int length9;
        int i8;
        int length10;
        int i9;
        int length11;
        int length12;
        String[] strArr = new String[29];
        strArr[0] = this.a;
        byte b = 1;
        strArr[1] = this.c;
        strArr[2] = this.d;
        strArr[3] = this.e;
        strArr[4] = this.f;
        strArr[5] = this.g;
        strArr[6] = this.h;
        strArr[7] = this.i;
        strArr[8] = this.l;
        strArr[9] = this.m;
        strArr[10] = this.n;
        strArr[11] = this.o;
        strArr[12] = this.p;
        strArr[13] = this.q;
        strArr[14] = this.r;
        strArr[15] = this.s;
        strArr[16] = this.t;
        strArr[17] = this.u;
        strArr[18] = this.v;
        strArr[19] = this.w;
        strArr[20] = this.x;
        strArr[21] = this.A;
        strArr[22] = this.B;
        strArr[23] = this.E;
        strArr[24] = this.G;
        strArr[25] = this.H;
        strArr[26] = J;
        strArr[27] = this.N;
        strArr[28] = this.O;
        for (int i10 = 0; i10 < 29; i10++) {
            if (TextUtils.isEmpty(strArr[i10])) {
                strArr[i10] = "";
            }
        }
        if (TextUtils.isEmpty(this.j) || (!"0".equals(this.j) && !"2".equals(this.j))) {
            this.j = "0";
        }
        if (TextUtils.isEmpty(this.k) || (!"0".equals(this.k) && !"1".equals(this.k))) {
            this.k = "0";
        }
        if (TextUtils.isEmpty(this.y) || (!"1".equals(this.y) && !"2".equals(this.y))) {
            this.y = "0";
        }
        if (!lh.a(this.z)) {
            this.z = 0;
        }
        if (this.I == null) {
            this.I = new byte[0];
        }
        byte[] bArr = new byte[2];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = this.I;
        int length13 = bArr3 != null ? 4096 + bArr3.length + 1 : 4096;
        byte[] bArr4 = this.P;
        if (bArr4 == null || length13 > this.Q) {
            bArr4 = new byte[length13];
            this.P = bArr4;
            this.Q = length13;
        }
        byte[] bArr5 = bArr4;
        bArr5[0] = ki.e(this.a);
        byte[] bArrA = ki.a(this.b, (byte[]) null);
        System.arraycopy(bArrA, 0, bArr5, 1, bArrA.length);
        int iA = a(this.q, bArr5, a(this.p, bArr5, a(this.h, bArr5, a(this.u, bArr5, a(this.g, bArr5, a(this.f, bArr5, a(this.e, bArr5, a(this.o, bArr5, a(this.d, bArr5, a(this.c, bArr5, bArrA.length + 1))))))))));
        try {
            if (TextUtils.isEmpty(this.t)) {
                bArr5[iA] = 0;
                length = iA + 1;
            } else {
                byte[] bArrA2 = a(this.t);
                bArr5[iA] = (byte) bArrA2.length;
                int i11 = iA + 1;
                System.arraycopy(bArrA2, 0, bArr5, i11, bArrA2.length);
                length = i11 + bArrA2.length;
            }
        } catch (Throwable th) {
            ke.a(th, "Req", "buildV4Dot219");
            bArr5[iA] = 0;
        }
        int iA2 = a(this.x, bArr5, a(L, bArr5, a(J, bArr5, a(this.w, bArr5, a(this.v, bArr5, length)))));
        bArr5[iA2] = Byte.parseByte(this.y);
        int i12 = iA2 + 1;
        bArr5[i12] = Byte.parseByte(this.j);
        int i13 = i12 + 1;
        int i14 = this.z;
        int i15 = i14 & 3;
        bArr5[i13] = (byte) i14;
        int length14 = i13 + 1;
        if (i15 == 1 || i15 == 2) {
            byte[] bArrB = ki.b(b("mcc"));
            System.arraycopy(bArrB, 0, bArr5, length14, bArrB.length);
            int length15 = length14 + bArrB.length;
            if (i15 == 1) {
                byte[] bArrB2 = ki.b(b("mnc"));
                System.arraycopy(bArrB2, 0, bArr5, length15, bArrB2.length);
                int length16 = length15 + bArrB2.length;
                byte[] bArrB3 = ki.b(b("lac"));
                System.arraycopy(bArrB3, 0, bArr5, length16, bArrB3.length);
                length2 = length16 + bArrB3.length;
                byte[] bArrC = ki.c(b("cellid"));
                System.arraycopy(bArrC, 0, bArr5, length2, bArrC.length);
                length3 = bArrC.length;
            } else if (i15 == 2) {
                byte[] bArrB4 = ki.b(b("sid"));
                System.arraycopy(bArrB4, 0, bArr5, length15, bArrB4.length);
                int length17 = length15 + bArrB4.length;
                byte[] bArrB5 = ki.b(b("nid"));
                System.arraycopy(bArrB5, 0, bArr5, length17, bArrB5.length);
                int length18 = length17 + bArrB5.length;
                byte[] bArrB6 = ki.b(b("bid"));
                System.arraycopy(bArrB6, 0, bArr5, length18, bArrB6.length);
                int length19 = length18 + bArrB6.length;
                byte[] bArrC2 = ki.c(b(GPXBasePoint.XML.ATTR_LON));
                System.arraycopy(bArrC2, 0, bArr5, length19, bArrC2.length);
                length2 = length19 + bArrC2.length;
                byte[] bArrC3 = ki.c(b(GPXBasePoint.XML.ATTR_LAT));
                System.arraycopy(bArrC3, 0, bArr5, length2, bArrC3.length);
                length3 = bArrC3.length;
            } else {
                i = Integer.parseInt(b("signal"));
                if (i <= 127 || i < -128) {
                    i = 0;
                }
                bArr5[length15] = (byte) i;
                int i16 = length15 + 1;
                byte[] bArrA3 = ki.a(0, bArr);
                System.arraycopy(bArrA3, 0, bArr5, i16, bArrA3.length);
                length14 = i16 + 2;
                if (i15 == 1) {
                    if (TextUtils.isEmpty(this.B)) {
                        bArr5[length14] = 0;
                        length14++;
                    } else {
                        length4 = this.B.split("\\*").length;
                        bArr5[length14] = (byte) length4;
                        length14++;
                        for (i2 = 0; i2 < length4; i2++) {
                            byte[] bArrB7 = ki.b(a("lac", i2));
                            System.arraycopy(bArrB7, 0, bArr5, length14, bArrB7.length);
                            int length20 = length14 + bArrB7.length;
                            byte[] bArrC4 = ki.c(a("cellid", i2));
                            System.arraycopy(bArrC4, 0, bArr5, length20, bArrC4.length);
                            int length21 = length20 + bArrC4.length;
                            i3 = Integer.parseInt(a("signal", i2));
                            if (i3 <= 127 || i3 < -128) {
                                i3 = 0;
                            }
                            bArr5[length21] = (byte) i3;
                            length14 = length21 + 1;
                            if (Double.valueOf(ke.a).doubleValue() >= 5.2d) {
                                byte[] bArrA4 = ki.a(0, bArr);
                                System.arraycopy(bArrA4, 0, bArr5, length14, bArrA4.length);
                                length14 += bArrA4.length;
                            }
                        }
                    }
                } else if (i15 == 2) {
                    bArr5[length14] = 0;
                    length14++;
                }
            }
            length15 = length2 + length3;
            i = Integer.parseInt(b("signal"));
            if (i <= 127) {
                i = 0;
            } else {
                i = 0;
            }
            bArr5[length15] = (byte) i;
            int i17 = length15 + 1;
            byte[] bArrA5 = ki.a(0, bArr);
            System.arraycopy(bArrA5, 0, bArr5, i17, bArrA5.length);
            length14 = i17 + 2;
            if (i15 == 1) {
                if (TextUtils.isEmpty(this.B)) {
                    bArr5[length14] = 0;
                    length14++;
                } else {
                    length4 = this.B.split("\\*").length;
                    bArr5[length14] = (byte) length4;
                    length14++;
                    while (i2 < length4) {
                        byte[] bArrB8 = ki.b(a("lac", i2));
                        System.arraycopy(bArrB8, 0, bArr5, length14, bArrB8.length);
                        int length22 = length14 + bArrB8.length;
                        byte[] bArrC5 = ki.c(a("cellid", i2));
                        System.arraycopy(bArrC5, 0, bArr5, length22, bArrC5.length);
                        int length23 = length22 + bArrC5.length;
                        i3 = Integer.parseInt(a("signal", i2));
                        if (i3 <= 127) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                        }
                        bArr5[length23] = (byte) i3;
                        length14 = length23 + 1;
                        if (Double.valueOf(ke.a).doubleValue() >= 5.2d) {
                            byte[] bArrA6 = ki.a(0, bArr);
                            System.arraycopy(bArrA6, 0, bArr5, length14, bArrA6.length);
                            length14 += bArrA6.length;
                        }
                    }
                }
            } else if (i15 == 2) {
                bArr5[length14] = 0;
                length14++;
            }
        }
        String str = this.D;
        if (str == null || (this.z & 8) != 8) {
            bArr5[length14] = 0;
            i4 = length14 + 1;
        } else {
            try {
                byte[] bytes = str.getBytes("GBK");
                int iMin = Math.min(bytes.length, 60);
                bArr5[length14] = (byte) iMin;
                length14++;
                System.arraycopy(bytes, 0, bArr5, length14, iMin);
                i4 = length14 + iMin;
            } catch (Exception unused) {
                bArr5[length14] = 0;
                i4 = length14 + 1;
            }
        }
        ArrayList<lg> arrayList = this.C;
        int size = arrayList.size();
        if ((this.z & 4) != 4 || size <= 0) {
            bArr5[i4] = 0;
            b = 1;
            length5 = i4 + 1;
        } else {
            arrayList.get(0);
            bArr5[i4] = (byte) size;
            length5 = i4 + 1;
            int i18 = 0;
            while (i18 < size) {
                lg lgVar = arrayList.get(i18);
                int i19 = lgVar.l;
                if (i19 == b || i19 == 3 || i19 == 4) {
                    byte b2 = (byte) i19;
                    if (lgVar.o) {
                        b2 = (byte) (b2 | 8);
                    }
                    bArr5[length5] = b2;
                    int i20 = length5 + 1;
                    byte[] bArrA7 = ki.a(lgVar.a, bArr);
                    System.arraycopy(bArrA7, 0, bArr5, i20, bArrA7.length);
                    int length24 = i20 + bArrA7.length;
                    byte[] bArrA8 = ki.a(lgVar.b, bArr);
                    System.arraycopy(bArrA8, 0, bArr5, length24, bArrA8.length);
                    int length25 = length24 + bArrA8.length;
                    byte[] bArrA9 = ki.a(lgVar.c, bArr);
                    System.arraycopy(bArrA9, 0, bArr5, length25, bArrA9.length);
                    int length26 = length25 + bArrA9.length;
                    byte[] bArrB9 = ki.b(lgVar.d, bArr2);
                    System.arraycopy(bArrB9, 0, bArr5, length26, bArrB9.length);
                    length5 = length26 + bArrB9.length;
                } else if (i19 == 2) {
                    byte b3 = (byte) i19;
                    if (lgVar.o) {
                        b3 = (byte) (b3 | 8);
                    }
                    bArr5[length5] = b3;
                    int i21 = length5 + 1;
                    byte[] bArrA10 = ki.a(lgVar.a, bArr);
                    System.arraycopy(bArrA10, 0, bArr5, i21, bArrA10.length);
                    int length27 = i21 + bArrA10.length;
                    byte[] bArrA11 = ki.a(lgVar.h, bArr);
                    System.arraycopy(bArrA11, 0, bArr5, length27, bArrA11.length);
                    int length28 = length27 + bArrA11.length;
                    byte[] bArrA12 = ki.a(lgVar.i, bArr);
                    System.arraycopy(bArrA12, 0, bArr5, length28, bArrA12.length);
                    int length29 = length28 + bArrA12.length;
                    byte[] bArrA13 = ki.a(lgVar.j, bArr);
                    System.arraycopy(bArrA13, 0, bArr5, length29, bArrA13.length);
                    int length30 = length29 + bArrA13.length;
                    byte[] bArrB10 = ki.b(lgVar.g, bArr2);
                    System.arraycopy(bArrB10, 0, bArr5, length30, bArrB10.length);
                    int length31 = length30 + bArrB10.length;
                    byte[] bArrB11 = ki.b(lgVar.f, bArr2);
                    System.arraycopy(bArrB11, 0, bArr5, length31, bArrB11.length);
                    length5 = length31 + bArrB11.length;
                } else if (i19 == 5) {
                    byte b4 = (byte) i19;
                    if (lgVar.o) {
                        b4 = (byte) (b4 | 8);
                    }
                    bArr5[length5] = b4;
                    int i22 = length5 + 1;
                    byte[] bArrA14 = ki.a(lgVar.a, bArr);
                    System.arraycopy(bArrA14, 0, bArr5, i22, bArrA14.length);
                    int length32 = i22 + bArrA14.length;
                    byte[] bArrA15 = ki.a(lgVar.b, bArr);
                    System.arraycopy(bArrA15, 0, bArr5, length32, bArrA15.length);
                    int length33 = length32 + bArrA15.length;
                    byte[] bArrA16 = ki.a(lgVar.c, bArr);
                    System.arraycopy(bArrA16, 0, bArr5, length33, bArrA16.length);
                    int length34 = length33 + bArrA16.length;
                    System.arraycopy(ki.a(lgVar.e), 0, bArr5, length34, 8);
                    length5 = length34 + 8;
                }
                int i23 = lgVar.k;
                if (i23 > 127 || i23 < -128) {
                    i23 = 99;
                }
                bArr5[length5] = (byte) i23;
                int i24 = length5 + 1;
                byte[] bArrA17 = ki.a(lgVar.m, bArr);
                System.arraycopy(bArrA17, 0, bArr5, i24, bArrA17.length);
                length5 = i24 + bArrA17.length;
                int i25 = lgVar.l;
                if (i25 == 3 || i25 == 4 || i25 == 5) {
                    if (Double.valueOf(ke.a).doubleValue() >= 5.0d) {
                        int i26 = lgVar.p;
                        if (i26 > 32767) {
                            i26 = 32767;
                        }
                        byte[] bArrA18 = ki.a(i26 >= 0 ? i26 : 32767, bArr);
                        System.arraycopy(bArrA18, 0, bArr5, length5, bArrA18.length);
                        length5 += bArrA18.length;
                        if (Double.valueOf(ke.a).doubleValue() >= 5.3d) {
                            byte[] bArrB12 = ki.b(lgVar.q, bArr2);
                            System.arraycopy(bArrB12, 0, bArr5, length5, bArrB12.length);
                            length11 = length5 + bArrB12.length;
                            byte[] bArrB13 = ki.b(lgVar.r, bArr2);
                            System.arraycopy(bArrB13, 0, bArr5, length11, bArrB13.length);
                            length12 = bArrB13.length;
                            length5 = length11 + length12;
                        }
                    }
                } else if (i25 == 1 && Double.valueOf(ke.a).doubleValue() >= 5.3d) {
                    int i27 = lgVar.p;
                    if (i27 > 32767) {
                        i27 = 32767;
                    }
                    byte[] bArrA19 = ki.a(i27 >= 0 ? i27 : 32767, bArr);
                    System.arraycopy(bArrA19, 0, bArr5, length5, bArrA19.length);
                    int length35 = length5 + bArrA19.length;
                    byte[] bArrB14 = ki.b(lgVar.q, bArr2);
                    System.arraycopy(bArrB14, 0, bArr5, length35, bArrB14.length);
                    length11 = length35 + bArrB14.length;
                    byte[] bArrB15 = ki.b(lgVar.r, bArr2);
                    System.arraycopy(bArrB15, 0, bArr5, length11, bArrB15.length);
                    length12 = bArrB15.length;
                    length5 = length11 + length12;
                }
                i18++;
                b = 1;
            }
        }
        if (TextUtils.isEmpty(this.E) || this.E.length() == 0) {
            i5 = 1;
            bArr5[length5] = 0;
            length6 = length5 + 1;
        } else {
            bArr5[length5] = b;
            length6 = length5 + 1;
            try {
                String[] strArrSplit = this.E.split(",");
                byte[] bArrA20 = a(strArrSplit[0]);
                System.arraycopy(bArrA20, 0, bArr5, length6, bArrA20.length);
                length6 += bArrA20.length;
                try {
                    byte[] bytes2 = strArrSplit[2].getBytes("GBK");
                    int length36 = bytes2.length;
                    if (length36 > 127) {
                        length36 = 127;
                    }
                    bArr5[length6] = (byte) length36;
                    length6++;
                    System.arraycopy(bytes2, 0, bArr5, length6, length36);
                    i9 = length6 + length36;
                } catch (Throwable th2) {
                    ke.a(th2, "Req", "buildV4Dot214");
                    bArr5[length6] = 0;
                    i9 = length6 + 1;
                }
                int i28 = Integer.parseInt(strArrSplit[1]);
                if (i28 > 127 || i28 < -128) {
                    i28 = 0;
                }
                bArr5[i9] = Byte.parseByte(String.valueOf(i28));
                length6 = i9 + 1;
                if (Double.valueOf(ke.a).doubleValue() >= 5.2d) {
                    byte[] bArrA21 = ki.a(0, bArr);
                    System.arraycopy(bArrA21, 0, bArr5, length6, bArrA21.length);
                    length6 += bArrA21.length;
                }
                i5 = 1;
            } catch (Throwable th3) {
                ke.a(th3, "Req", "buildV4Dot216");
                byte[] bArrA22 = a(com.alipay.sdk.m.u.c.b);
                System.arraycopy(bArrA22, 0, bArr5, length6, bArrA22.length);
                int length37 = length6 + bArrA22.length;
                bArr5[length37] = 0;
                i5 = 1;
                int i29 = length37 + 1;
                bArr5[i29] = Byte.parseByte("0");
                length6 = i29 + 1;
            }
        }
        ArrayList<ScanResult> arrayList2 = this.F;
        int iMin2 = Math.min(arrayList2.size(), 25);
        if (iMin2 == 0) {
            bArr5[length6] = 0;
            length7 = length6 + i5;
        } else {
            bArr5[length6] = (byte) iMin2;
            int length38 = length6 + i5;
            boolean z = ki.c() >= 17;
            long jB = z ? ki.b() / 1000 : 0L;
            for (int i30 = 0; i30 < iMin2; i30++) {
                ScanResult scanResult = arrayList2.get(i30);
                byte[] bArrA23 = a(scanResult.BSSID);
                System.arraycopy(bArrA23, 0, bArr5, length38, bArrA23.length);
                int length39 = length38 + bArrA23.length;
                try {
                    byte[] bytes3 = scanResult.SSID.getBytes("GBK");
                    bArr5[length39] = (byte) bytes3.length;
                    length39++;
                    System.arraycopy(bytes3, 0, bArr5, length39, bytes3.length);
                    length8 = length39 + bytes3.length;
                    i6 = 1;
                } catch (Exception unused2) {
                    bArr5[length39] = 0;
                    i6 = 1;
                    length8 = length39 + 1;
                }
                int i31 = scanResult.level;
                if (i31 > 127 || i31 < -128) {
                    i31 = 0;
                }
                bArr5[length8] = Byte.parseByte(String.valueOf(i31));
                int i32 = length8 + i6;
                if (!z || (i7 = (int) (jB - ((scanResult.timestamp / 1000000) + 1))) < 0) {
                    i7 = 0;
                }
                if (i7 > 65535) {
                    i7 = 65535;
                }
                byte[] bArrA24 = ki.a(i7, bArr);
                System.arraycopy(bArrA24, 0, bArr5, i32, bArrA24.length);
                int length40 = i32 + bArrA24.length;
                byte[] bArrA25 = ki.a(scanResult.frequency, bArr);
                System.arraycopy(bArrA25, 0, bArr5, length40, bArrA25.length);
                length38 = length40 + bArrA25.length;
            }
            byte[] bArrA26 = ki.a(Integer.parseInt(this.G), bArr);
            System.arraycopy(bArrA26, 0, bArr5, length38, bArrA26.length);
            length7 = length38 + bArrA26.length;
        }
        bArr5[length7] = 0;
        int i33 = length7 + 1;
        try {
            byte[] bytes4 = this.H.getBytes("GBK");
            if (bytes4.length > 127) {
                bytes4 = null;
            }
            if (bytes4 == null) {
                bArr5[i33] = 0;
                length9 = i33 + 1;
            } else {
                bArr5[i33] = (byte) bytes4.length;
                int i34 = i33 + 1;
                System.arraycopy(bytes4, 0, bArr5, i34, bytes4.length);
                length9 = i34 + bytes4.length;
            }
        } catch (Throwable unused3) {
            bArr5[i33] = 0;
        }
        byte[] bArrA27 = {0, 0};
        try {
            boolean zIsEmpty = TextUtils.isEmpty(this.K);
            if (!zIsEmpty) {
                bArrA27 = ki.a(this.K.length(), bArr);
            }
            System.arraycopy(bArrA27, 0, bArr5, length9, 2);
            length10 = length9 + 2;
            if (!zIsEmpty) {
                try {
                    byte[] bytes5 = this.K.getBytes("GBK");
                    System.arraycopy(bytes5, 0, bArr5, length10, bytes5.length);
                    length10 += bytes5.length;
                } catch (Throwable unused4) {
                }
            }
            i8 = 2;
        } catch (Throwable unused5) {
            i8 = 2;
            length10 = length9 + 2;
        }
        try {
            System.arraycopy(ki.a(0, bArr), 0, bArr5, length10, i8);
        } catch (Throwable unused6) {
        }
        int i35 = length10 + i8;
        byte[] bArr6 = new byte[i8];
        // fill-array-data instruction
        bArr6[0] = 0;
        bArr6[1] = 0;
        try {
            System.arraycopy(bArr6, 0, bArr5, i35, i8);
        } catch (Throwable unused7) {
        }
        int i36 = i35 + i8;
        byte[] bArr7 = this.I;
        int length41 = bArr7 != null ? bArr7.length : 0;
        byte[] bArrA28 = ki.a(length41, (byte[]) null);
        System.arraycopy(bArrA28, 0, bArr5, i36, bArrA28.length);
        int length42 = i36 + bArrA28.length;
        if (length41 > 0) {
            byte[] bArr8 = this.I;
            System.arraycopy(bArr8, 0, bArr5, length42, bArr8.length);
            length42 += this.I.length;
        }
        if (Double.valueOf(ke.a).doubleValue() >= 5.0d) {
            bArr5[length42] = 0;
            length42 = a(this.N, bArr5, length42 + 1);
        }
        if (Double.valueOf(ke.a).doubleValue() >= 5.1d) {
            bArr5[length42] = 0;
            length42++;
        }
        if (Double.valueOf(ke.a).doubleValue() >= 5.2d) {
            length42 = a(this.O, bArr5, length42);
        }
        byte[] bArr9 = new byte[length42];
        System.arraycopy(bArr5, 0, bArr9, 0, length42);
        CRC32 crc32 = new CRC32();
        crc32.update(bArr9);
        byte[] bArrA29 = ki.a(crc32.getValue());
        byte[] bArr10 = new byte[length42 + 8];
        System.arraycopy(bArr9, 0, bArr10, 0, length42);
        System.arraycopy(bArrA29, 0, bArr10, length42, 8);
        return bArr10;
    }

    public final void a(Context context, boolean z, boolean z2, lh lhVar, jy jyVar, ConnectivityManager connectivityManager, String str) {
        String str2;
        String str3;
        ArrayList arrayList;
        String str4;
        NetworkInfo activeNetworkInfo;
        String strB;
        String str5;
        String string;
        ArrayList<ScanResult> arrayList2;
        int length;
        String strF = gj.f(context);
        int iD = ki.d();
        this.K = str;
        if (z2) {
            str2 = "api_serverSDK_130905";
            str3 = "S128DF1572465B890OE3F7A13167KLEI";
        } else {
            str2 = "UC_nlp_20131029";
            str3 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U";
        }
        String str6 = str3;
        String str7 = str2;
        StringBuilder sb = new StringBuilder();
        int i = lhVar.a;
        int i2 = i & 3;
        TelephonyManager telephonyManager = lhVar.d;
        ArrayList<lg> arrayListB = lhVar.b();
        ArrayList<lg> arrayListC = lhVar.c();
        if (jyVar.b == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (!jyVar.b.isEmpty()) {
                arrayList3.addAll(jyVar.b);
            }
            arrayList = arrayList3;
        }
        String str8 = i2 == 2 ? "1" : "0";
        if (telephonyManager != null) {
            if (TextUtils.isEmpty(ke.g)) {
                try {
                    ke.g = gn.u(context);
                } catch (Throwable th) {
                    ke.a(th, "Aps", "getApsReq part4");
                }
            }
            str4 = strF;
            if (TextUtils.isEmpty(ke.g) && Build.VERSION.SDK_INT < 29) {
                ke.g = "888888888888888";
            }
            if (TextUtils.isEmpty(ke.h)) {
                try {
                    ke.h = gn.x(context);
                } catch (SecurityException unused) {
                } catch (Throwable th2) {
                    ke.a(th2, "Aps", "getApsReq part2");
                }
            }
            if (TextUtils.isEmpty(ke.h) && Build.VERSION.SDK_INT < 29) {
                ke.h = "888888888888888";
            }
        } else {
            str4 = strF;
            iD = iD;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th3) {
            ke.a(th3, "Aps", "getApsReq part");
            activeNetworkInfo = null;
        }
        boolean zA = jyVar.a(connectivityManager);
        if (ki.a(activeNetworkInfo) != -1) {
            strB = ki.b(telephonyManager);
            str5 = zA ? "2" : "1";
        } else {
            strB = "";
            str5 = strB;
        }
        String str9 = str5;
        String str10 = strB;
        if (arrayListB.isEmpty()) {
            zA = zA;
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            if (i2 == 1) {
                lg lgVar = arrayListB.get(0);
                sb2.delete(0, sb2.length());
                sb2.append("<mcc>");
                sb2.append(lgVar.a);
                sb2.append("</mcc>");
                sb2.append("<mnc>");
                sb2.append(lgVar.b);
                sb2.append("</mnc>");
                sb2.append("<lac>");
                sb2.append(lgVar.c);
                sb2.append("</lac>");
                sb2.append("<cellid>");
                sb2.append(lgVar.d);
                sb2.append("</cellid>");
                sb2.append("<signal>");
                sb2.append(lgVar.k);
                sb2.append("</signal>");
                string = sb2.toString();
                for (int i3 = 1; i3 < arrayListB.size(); i3++) {
                    lg lgVar2 = arrayListB.get(i3);
                    sb.append(lgVar2.c);
                    sb.append(",");
                    sb.append(lgVar2.d);
                    sb.append(",");
                    sb.append(lgVar2.k);
                    if (i3 < arrayListB.size() - 1) {
                        sb.append("*");
                    }
                }
            } else if (i2 != 2) {
                string = "";
            } else {
                lg lgVar3 = arrayListB.get(0);
                sb2.delete(0, sb2.length());
                sb2.append("<mcc>");
                sb2.append(lgVar3.a);
                sb2.append("</mcc>");
                sb2.append("<sid>");
                sb2.append(lgVar3.h);
                sb2.append("</sid>");
                sb2.append("<nid>");
                sb2.append(lgVar3.i);
                sb2.append("</nid>");
                sb2.append("<bid>");
                sb2.append(lgVar3.j);
                sb2.append("</bid>");
                if (lgVar3.g > 0 && lgVar3.f > 0) {
                    sb2.append("<lon>");
                    sb2.append(lgVar3.g);
                    sb2.append("</lon>");
                    sb2.append("<lat>");
                    sb2.append(lgVar3.f);
                    sb2.append("</lat>");
                }
                sb2.append("<signal>");
                sb2.append(lgVar3.k);
                sb2.append("</signal>");
                string = sb2.toString();
            }
            sb2.delete(0, sb2.length());
        }
        if ((i & 4) != 4 || arrayListC.isEmpty()) {
            this.C.clear();
        } else {
            this.C.clear();
            this.C.addAll(arrayListC);
        }
        StringBuilder sb3 = new StringBuilder();
        if (jyVar.q) {
            if (zA) {
                WifiInfo wifiInfoB = jyVar.b();
                if (jy.a(wifiInfoB)) {
                    sb3.append(wifiInfoB.getBSSID());
                    sb3.append(",");
                    int rssi = wifiInfoB.getRssi();
                    if (rssi < -128 || rssi > 127) {
                        rssi = 0;
                    }
                    sb3.append(rssi);
                    sb3.append(",");
                    String ssid = wifiInfoB.getSSID();
                    try {
                        length = wifiInfoB.getSSID().getBytes("UTF-8").length;
                    } catch (Exception unused2) {
                        length = 32;
                    }
                    if (length >= 32) {
                        ssid = "unkwn";
                    }
                    sb3.append(ssid.replace("*", "."));
                }
            }
            if (arrayList != 0 && (arrayList2 = this.F) != null) {
                arrayList2.clear();
                this.F.addAll(arrayList);
            }
        } else {
            jyVar.a();
            ArrayList<ScanResult> arrayList4 = this.F;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
        }
        this.b = (short) 0;
        if (!z) {
            this.b = (short) (2 | 0);
        }
        this.c = str7;
        this.d = str6;
        this.f = Build.MODEL;
        this.g = "android" + Build.VERSION.RELEASE;
        this.h = ki.b(context);
        this.i = str8;
        this.j = "0";
        this.k = "0";
        this.l = "0";
        this.m = "0";
        this.n = "0";
        this.o = str4;
        this.p = ke.g;
        this.q = ke.h;
        this.s = String.valueOf(iD);
        this.t = ki.d(context);
        this.v = "5.3.1";
        this.w = null;
        this.u = "";
        this.x = str10;
        this.y = str9;
        this.z = i;
        this.A = string;
        this.B = sb.toString();
        this.D = lhVar.f();
        this.G = jy.d();
        this.E = sb3.toString();
        try {
            if (TextUtils.isEmpty(J)) {
                J = gn.h(context);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (TextUtils.isEmpty(L)) {
                L = gn.a(context);
            }
        } catch (Throwable unused4) {
        }
        try {
            if (TextUtils.isEmpty(this.N)) {
                this.N = gn.i(context);
            }
        } catch (Throwable unused5) {
        }
        try {
            if (TextUtils.isEmpty(this.O)) {
                this.O = gn.g(context);
            }
        } catch (Throwable unused6) {
        }
        sb.delete(0, sb.length());
        sb3.delete(0, sb3.length());
    }
}
