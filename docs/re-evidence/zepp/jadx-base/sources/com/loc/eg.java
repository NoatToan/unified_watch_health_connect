package com.loc;

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

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"NewApi"})
public final class eg {
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
    public ArrayList<du> C = new ArrayList<>();
    public String D = null;
    public String E = null;
    public ArrayList<ScanResult> F = new ArrayList<>();
    public String G = null;
    public String H = null;
    public byte[] I = null;
    private byte[] O = null;
    private int P = 0;
    public String K = null;
    public String M = null;
    public String N = null;

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
            ei.a(th, "Req", "copyContentWithByteLen");
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
                ei.a(th, "Req", "getMacBa " + str);
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
        if (!this.A.contains(str + SearchCriteria.GT)) {
            return "0";
        }
        return this.A.substring(this.A.indexOf(str + SearchCriteria.GT) + str.length() + 1, this.A.indexOf("</" + str));
    }

    public final void a(Context context, boolean z, boolean z2, dv dvVar, dw dwVar, ConnectivityManager connectivityManager, String str) {
        String str2;
        String str3;
        int i;
        NetworkInfo activeNetworkInfo;
        String strB;
        String str4;
        String string;
        ArrayList<ScanResult> arrayList;
        int length;
        String strF = k.f(context);
        int iD = eo.d();
        this.K = str;
        if (z2) {
            str2 = "api_serverSDK_130905";
            str3 = "S128DF1572465B890OE3F7A13167KLEI";
        } else {
            str2 = "UC_nlp_20131029";
            str3 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U";
        }
        String str5 = str3;
        String str6 = str2;
        StringBuilder sb = new StringBuilder();
        int iE = dvVar.e();
        int iF = dvVar.f();
        TelephonyManager telephonyManagerG = dvVar.g();
        ArrayList<du> arrayListB = dvVar.b();
        ArrayList<du> arrayListC = dvVar.c();
        ArrayList<ScanResult> arrayListE = dwVar.e();
        String str7 = "1";
        String str8 = iF == 2 ? "1" : "0";
        if (telephonyManagerG != null) {
            if (TextUtils.isEmpty(ei.e)) {
                try {
                    ei.e = n.w(context);
                } catch (Throwable th) {
                    ei.a(th, "Aps", "getApsReq part4");
                }
            }
            i = iD;
            if (TextUtils.isEmpty(ei.e) && Build.VERSION.SDK_INT < 29) {
                ei.e = "888888888888888";
            }
            if (TextUtils.isEmpty(ei.f)) {
                try {
                    ei.f = n.z(context);
                } catch (SecurityException unused) {
                } catch (Throwable th2) {
                    ei.a(th2, "Aps", "getApsReq part2");
                }
            }
            if (TextUtils.isEmpty(ei.f) && Build.VERSION.SDK_INT < 29) {
                ei.f = "888888888888888";
            }
        } else {
            i = iD;
            str7 = "1";
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Throwable th3) {
            ei.a(th3, "Aps", "getApsReq part");
            activeNetworkInfo = null;
        }
        boolean zA = dwVar.a(connectivityManager);
        if (eo.a(activeNetworkInfo) != -1) {
            strB = eo.b(telephonyManagerG);
            str4 = zA ? "2" : str7;
        } else {
            strB = "";
            str4 = strB;
        }
        String str9 = str4;
        String str10 = strB;
        if (arrayListB.isEmpty()) {
            arrayListE = arrayListE;
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            if (iF == 1) {
                du duVar = arrayListB.get(0);
                sb2.delete(0, sb2.length());
                sb2.append("<mcc>");
                sb2.append(duVar.a);
                sb2.append("</mcc>");
                sb2.append("<mnc>");
                sb2.append(duVar.b);
                sb2.append("</mnc>");
                sb2.append("<lac>");
                sb2.append(duVar.c);
                sb2.append("</lac>");
                sb2.append("<cellid>");
                sb2.append(duVar.d);
                sb2.append("</cellid>");
                sb2.append("<signal>");
                sb2.append(duVar.j);
                sb2.append("</signal>");
                string = sb2.toString();
                for (int i2 = 1; i2 < arrayListB.size(); i2++) {
                    du duVar2 = arrayListB.get(i2);
                    sb.append(duVar2.c);
                    sb.append(",");
                    sb.append(duVar2.d);
                    sb.append(",");
                    sb.append(duVar2.j);
                    if (i2 < arrayListB.size() - 1) {
                        sb.append("*");
                    }
                }
            } else if (iF != 2) {
                string = "";
            } else {
                du duVar3 = arrayListB.get(0);
                sb2.delete(0, sb2.length());
                sb2.append("<mcc>");
                sb2.append(duVar3.a);
                sb2.append("</mcc>");
                sb2.append("<sid>");
                sb2.append(duVar3.g);
                sb2.append("</sid>");
                sb2.append("<nid>");
                sb2.append(duVar3.h);
                sb2.append("</nid>");
                sb2.append("<bid>");
                sb2.append(duVar3.i);
                sb2.append("</bid>");
                if (duVar3.f > 0 && duVar3.e > 0) {
                    sb2.append("<lon>");
                    sb2.append(duVar3.f);
                    sb2.append("</lon>");
                    sb2.append("<lat>");
                    sb2.append(duVar3.e);
                    sb2.append("</lat>");
                }
                sb2.append("<signal>");
                sb2.append(duVar3.j);
                sb2.append("</signal>");
                string = sb2.toString();
            }
            sb2.delete(0, sb2.length());
        }
        if ((iE & 4) != 4 || arrayListC.isEmpty()) {
            this.C.clear();
        } else {
            this.C.clear();
            this.C.addAll(arrayListC);
        }
        StringBuilder sb3 = new StringBuilder();
        if (dwVar.q) {
            if (zA) {
                WifiInfo wifiInfoK = dwVar.k();
                if (dw.a(wifiInfoK)) {
                    sb3.append(wifiInfoK.getBSSID());
                    sb3.append(",");
                    int rssi = wifiInfoK.getRssi();
                    if (rssi < -128 || rssi > 127) {
                        rssi = 0;
                    }
                    sb3.append(rssi);
                    sb3.append(",");
                    String ssid = wifiInfoK.getSSID();
                    try {
                        length = wifiInfoK.getSSID().getBytes("UTF-8").length;
                    } catch (Exception unused2) {
                        length = 32;
                    }
                    if (length >= 32) {
                        ssid = "unkwn";
                    }
                    sb3.append(ssid.replace("*", "."));
                }
            }
            if (arrayListE != null && (arrayList = this.F) != null) {
                arrayList.clear();
                this.F.addAll(arrayListE);
            }
        } else {
            dwVar.g();
            ArrayList<ScanResult> arrayList2 = this.F;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        this.b = (short) 0;
        if (!z) {
            this.b = (short) (2 | 0);
        }
        this.c = str6;
        this.d = str5;
        this.f = Build.MODEL;
        this.g = "android" + Build.VERSION.RELEASE;
        this.h = eo.b(context);
        this.i = str8;
        this.j = "0";
        this.k = "0";
        this.l = "0";
        this.m = "0";
        this.n = "0";
        this.o = strF;
        this.p = ei.e;
        this.q = ei.f;
        this.s = String.valueOf(i);
        this.t = eo.j(context);
        this.v = "5.0.0";
        this.w = null;
        this.u = "";
        this.x = str10;
        this.y = str9;
        this.z = iE;
        this.A = string;
        this.B = sb.toString();
        this.D = dvVar.l();
        this.G = dw.o();
        this.E = sb3.toString();
        try {
            if (TextUtils.isEmpty(J)) {
                J = n.h(context);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (TextUtils.isEmpty(L)) {
                L = n.a(context);
            }
        } catch (Throwable unused4) {
        }
        try {
            if (TextUtils.isEmpty(this.N)) {
                this.N = n.i(context);
            }
        } catch (Throwable unused5) {
        }
        sb.delete(0, sb.length());
        sb3.delete(0, sb3.length());
    }

    /* JADX WARN: Code duplicated, block: B:122:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:128:0x0427  */
    /* JADX WARN: Code duplicated, block: B:136:0x0437  */
    /* JADX WARN: Code duplicated, block: B:139:0x043c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0448 A[PHI: r0
      0x0448: PHI (r0v130 int) = (r0v129 int), (r0v138 int) binds: [B:102:0x0359, B:127:0x0425] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x029b  */
    /* JADX WARN: Code duplicated, block: B:71:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:73:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x0303 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0305  */
    public final byte[] a() {
        int length;
        int length2;
        int length3;
        int i;
        int length4;
        int i2;
        int i3;
        int i4;
        byte b;
        int length5;
        int i5;
        int i6;
        String str;
        int length6;
        int i7;
        int length7;
        int i8;
        int length8;
        int i9;
        int length9;
        int length10;
        int length11;
        int i10;
        int i11;
        int i12;
        String[] strArr = new String[28];
        strArr[0] = this.a;
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
        for (int i13 = 0; i13 < 28; i13++) {
            if (TextUtils.isEmpty(strArr[i13])) {
                strArr[i13] = "";
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
        if (!dv.a(this.z)) {
            this.z = 0;
        }
        if (this.I == null) {
            this.I = new byte[0];
        }
        byte[] bArr = new byte[2];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = this.I;
        int length12 = bArr3 != null ? 4096 + bArr3.length + 1 : 4096;
        byte[] bArr4 = this.O;
        if (bArr4 == null || length12 > this.P) {
            bArr4 = new byte[length12];
            this.O = bArr4;
            this.P = length12;
        }
        byte[] bArr5 = bArr4;
        bArr5[0] = eo.i(this.a);
        byte[] bArrA = eo.a(this.b, (byte[]) null);
        System.arraycopy(bArrA, 0, bArr5, 1, bArrA.length);
        int iA = a(this.q, bArr5, a(this.p, bArr5, a(this.h, bArr5, a(this.u, bArr5, a(this.g, bArr5, a(this.f, bArr5, a(this.e, bArr5, a(this.o, bArr5, a(this.d, bArr5, a(this.c, bArr5, bArrA.length + 1))))))))));
        try {
            if (TextUtils.isEmpty(this.t)) {
                bArr5[iA] = 0;
                length = iA + 1;
            } else {
                byte[] bArrA2 = a(this.t);
                bArr5[iA] = (byte) bArrA2.length;
                int i14 = iA + 1;
                System.arraycopy(bArrA2, 0, bArr5, i14, bArrA2.length);
                length = i14 + bArrA2.length;
            }
        } catch (Throwable th) {
            ei.a(th, "Req", "buildV4Dot219");
            bArr5[iA] = 0;
        }
        int iA2 = a(this.x, bArr5, a(L, bArr5, a(J, bArr5, a(this.w, bArr5, a(this.v, bArr5, length)))));
        bArr5[iA2] = Byte.parseByte(this.y);
        int i15 = iA2 + 1;
        bArr5[i15] = Byte.parseByte(this.j);
        int i16 = i15 + 1;
        int i17 = this.z;
        int i18 = i17 & 3;
        bArr5[i16] = (byte) i17;
        int i19 = i16 + 1;
        if (i18 == 1 || i18 == 2) {
            byte[] bArrB = eo.b(b("mcc"));
            System.arraycopy(bArrB, 0, bArr5, i19, bArrB.length);
            int length13 = i19 + bArrB.length;
            if (i18 == 1) {
                byte[] bArrB2 = eo.b(b("mnc"));
                System.arraycopy(bArrB2, 0, bArr5, length13, bArrB2.length);
                int length14 = length13 + bArrB2.length;
                byte[] bArrB3 = eo.b(b("lac"));
                System.arraycopy(bArrB3, 0, bArr5, length14, bArrB3.length);
                length2 = length14 + bArrB3.length;
                byte[] bArrC = eo.c(b("cellid"));
                System.arraycopy(bArrC, 0, bArr5, length2, bArrC.length);
                length3 = bArrC.length;
            } else if (i18 == 2) {
                byte[] bArrB4 = eo.b(b("sid"));
                System.arraycopy(bArrB4, 0, bArr5, length13, bArrB4.length);
                int length15 = length13 + bArrB4.length;
                byte[] bArrB5 = eo.b(b("nid"));
                System.arraycopy(bArrB5, 0, bArr5, length15, bArrB5.length);
                int length16 = length15 + bArrB5.length;
                byte[] bArrB6 = eo.b(b("bid"));
                System.arraycopy(bArrB6, 0, bArr5, length16, bArrB6.length);
                int length17 = length16 + bArrB6.length;
                byte[] bArrC2 = eo.c(b(GPXBasePoint.XML.ATTR_LON));
                System.arraycopy(bArrC2, 0, bArr5, length17, bArrC2.length);
                length2 = length17 + bArrC2.length;
                byte[] bArrC3 = eo.c(b(GPXBasePoint.XML.ATTR_LAT));
                System.arraycopy(bArrC3, 0, bArr5, length2, bArrC3.length);
                length3 = bArrC3.length;
            } else {
                i = Integer.parseInt(b("signal"));
                if (i <= 127 || i < -128) {
                    i = 0;
                }
                bArr5[length13] = (byte) i;
                int i20 = length13 + 1;
                byte[] bArrA3 = eo.a(0, bArr);
                System.arraycopy(bArrA3, 0, bArr5, i20, bArrA3.length);
                i19 = i20 + 2;
                if (i18 == 1) {
                    if (TextUtils.isEmpty(this.B)) {
                        bArr5[i19] = 0;
                        i19++;
                    } else {
                        length4 = this.B.split("\\*").length;
                        bArr5[i19] = (byte) length4;
                        i19++;
                        for (i2 = 0; i2 < length4; i2++) {
                            byte[] bArrB7 = eo.b(a("lac", i2));
                            System.arraycopy(bArrB7, 0, bArr5, i19, bArrB7.length);
                            int length18 = i19 + bArrB7.length;
                            byte[] bArrC4 = eo.c(a("cellid", i2));
                            System.arraycopy(bArrC4, 0, bArr5, length18, bArrC4.length);
                            int length19 = length18 + bArrC4.length;
                            i3 = Integer.parseInt(a("signal", i2));
                            if (i3 <= 127 || i3 < -128) {
                                i3 = 0;
                            }
                            bArr5[length19] = (byte) i3;
                            i19 = length19 + 1;
                        }
                    }
                } else if (i18 == 2) {
                    bArr5[i19] = 0;
                    i19++;
                }
            }
            length13 = length2 + length3;
            i = Integer.parseInt(b("signal"));
            if (i <= 127) {
                i = 0;
            } else {
                i = 0;
            }
            bArr5[length13] = (byte) i;
            int i21 = length13 + 1;
            byte[] bArrA4 = eo.a(0, bArr);
            System.arraycopy(bArrA4, 0, bArr5, i21, bArrA4.length);
            i19 = i21 + 2;
            if (i18 == 1) {
                if (TextUtils.isEmpty(this.B)) {
                    bArr5[i19] = 0;
                    i19++;
                } else {
                    length4 = this.B.split("\\*").length;
                    bArr5[i19] = (byte) length4;
                    i19++;
                    while (i2 < length4) {
                        byte[] bArrB8 = eo.b(a("lac", i2));
                        System.arraycopy(bArrB8, 0, bArr5, i19, bArrB8.length);
                        int length110 = i19 + bArrB8.length;
                        byte[] bArrC5 = eo.c(a("cellid", i2));
                        System.arraycopy(bArrC5, 0, bArr5, length110, bArrC5.length);
                        int length111 = length110 + bArrC5.length;
                        i3 = Integer.parseInt(a("signal", i2));
                        if (i3 <= 127) {
                            i3 = 0;
                        }
                        bArr5[length111] = (byte) i3;
                        i19 = length111 + 1;
                    }
                }
            } else if (i18 == 2) {
                bArr5[i19] = 0;
                i19++;
            }
        }
        String str2 = this.D;
        String str3 = "GBK";
        if (str2 == null || (this.z & 8) != 8) {
            bArr5[i19] = 0;
            i4 = i19 + 1;
        } else {
            try {
                byte[] bytes = str2.getBytes("GBK");
                int iMin = Math.min(bytes.length, 60);
                bArr5[i19] = (byte) iMin;
                i19++;
                System.arraycopy(bytes, 0, bArr5, i19, iMin);
                i4 = i19 + iMin;
            } catch (Exception unused) {
                bArr5[i19] = 0;
                i4 = i19 + 1;
            }
        }
        ArrayList<du> arrayList = this.C;
        int size = arrayList.size();
        if ((this.z & 4) != 4 || size <= 0) {
            bArr5[i4] = 0;
            b = 1;
            length5 = i4 + 1;
        } else {
            if (!arrayList.get(0).p) {
                size--;
            }
            bArr5[i4] = (byte) size;
            int i22 = 1;
            length5 = i4 + 1;
            int i23 = 0;
            while (i23 < size) {
                du duVar = arrayList.get(i23);
                if (duVar.p) {
                    int i24 = duVar.k;
                    if (i24 == i22 || i24 == 3 || i24 == 4) {
                        byte b2 = (byte) i24;
                        if (duVar.n) {
                            b2 = (byte) (b2 | 8);
                        }
                        bArr5[length5] = b2;
                        int i25 = length5 + 1;
                        byte[] bArrA5 = eo.a(duVar.a, bArr);
                        System.arraycopy(bArrA5, 0, bArr5, i25, bArrA5.length);
                        int length20 = i25 + bArrA5.length;
                        byte[] bArrA6 = eo.a(duVar.b, bArr);
                        System.arraycopy(bArrA6, 0, bArr5, length20, bArrA6.length);
                        int length21 = length20 + bArrA6.length;
                        byte[] bArrA7 = eo.a(duVar.c, bArr);
                        System.arraycopy(bArrA7, 0, bArr5, length21, bArrA7.length);
                        length10 = length21 + bArrA7.length;
                        byte[] bArrB9 = eo.b(duVar.d, bArr2);
                        System.arraycopy(bArrB9, 0, bArr5, length10, bArrB9.length);
                        length11 = bArrB9.length;
                    } else if (i24 == 2) {
                        byte b3 = (byte) i24;
                        if (duVar.n) {
                            b3 = (byte) (b3 | 8);
                        }
                        bArr5[length5] = b3;
                        int i26 = length5 + 1;
                        byte[] bArrA8 = eo.a(duVar.a, bArr);
                        System.arraycopy(bArrA8, 0, bArr5, i26, bArrA8.length);
                        int length22 = i26 + bArrA8.length;
                        byte[] bArrA9 = eo.a(duVar.g, bArr);
                        System.arraycopy(bArrA9, 0, bArr5, length22, bArrA9.length);
                        int length23 = length22 + bArrA9.length;
                        byte[] bArrA10 = eo.a(duVar.h, bArr);
                        System.arraycopy(bArrA10, 0, bArr5, length23, bArrA10.length);
                        int length24 = length23 + bArrA10.length;
                        byte[] bArrA11 = eo.a(duVar.i, bArr);
                        System.arraycopy(bArrA11, 0, bArr5, length24, bArrA11.length);
                        int length25 = length24 + bArrA11.length;
                        byte[] bArrB10 = eo.b(duVar.f, bArr2);
                        System.arraycopy(bArrB10, 0, bArr5, length25, bArrB10.length);
                        length10 = length25 + bArrB10.length;
                        byte[] bArrB11 = eo.b(duVar.e, bArr2);
                        System.arraycopy(bArrB11, 0, bArr5, length10, bArrB11.length);
                        length11 = bArrB11.length;
                    } else {
                        i10 = duVar.j;
                        if (i10 <= 127 || i10 < -128) {
                            i10 = 99;
                        }
                        bArr5[length5] = (byte) i10;
                        int i27 = length5 + 1;
                        byte[] bArrA12 = eo.a(duVar.l, bArr);
                        System.arraycopy(bArrA12, 0, bArr5, i27, bArrA12.length);
                        length5 = i27 + bArrA12.length;
                        if (Double.valueOf("5.1").doubleValue() >= 5.0d) {
                            i11 = duVar.k;
                            if (i11 != 3 || i11 == 4) {
                                i12 = duVar.o;
                                if (i12 > 32767) {
                                    i12 = 32767;
                                }
                                byte[] bArrA13 = eo.a(i12 >= 0 ? i12 : 32767, bArr);
                                System.arraycopy(bArrA13, 0, bArr5, length5, bArrA13.length);
                                length5 += bArrA13.length;
                            }
                        }
                    }
                    length5 = length10 + length11;
                    i10 = duVar.j;
                    if (i10 <= 127) {
                        i10 = 99;
                    } else {
                        i10 = 99;
                    }
                    bArr5[length5] = (byte) i10;
                    int i28 = length5 + 1;
                    byte[] bArrA14 = eo.a(duVar.l, bArr);
                    System.arraycopy(bArrA14, 0, bArr5, i28, bArrA14.length);
                    length5 = i28 + bArrA14.length;
                    if (Double.valueOf("5.1").doubleValue() >= 5.0d) {
                        i11 = duVar.k;
                        if (i11 != 3) {
                        }
                        i12 = duVar.o;
                        if (i12 > 32767) {
                            i12 = 32767;
                        }
                        byte[] bArrA15 = eo.a(i12 >= 0 ? i12 : 32767, bArr);
                        System.arraycopy(bArrA15, 0, bArr5, length5, bArrA15.length);
                        length5 += bArrA15.length;
                    }
                }
                i23++;
                i22 = 1;
            }
            b = 1;
        }
        if (this.E.length() == 0) {
            bArr5[length5] = 0;
            i6 = length5 + b;
            i5 = 1;
        } else {
            bArr5[length5] = b;
            int length26 = length5 + 1;
            try {
                String[] strArrSplit = this.E.split(",");
                byte[] bArrA16 = a(strArrSplit[0]);
                System.arraycopy(bArrA16, 0, bArr5, length26, bArrA16.length);
                length26 += bArrA16.length;
                try {
                    byte[] bytes2 = strArrSplit[2].getBytes("GBK");
                    int length27 = bytes2.length;
                    if (length27 > 127) {
                        length27 = 127;
                    }
                    bArr5[length26] = (byte) length27;
                    length26++;
                    System.arraycopy(bytes2, 0, bArr5, length26, length27);
                    length26 += length27;
                } catch (Throwable th2) {
                    ei.a(th2, "Req", "buildV4Dot214");
                    bArr5[length26] = 0;
                    length26++;
                }
                int i29 = Integer.parseInt(strArrSplit[1]);
                if (i29 > 127 || i29 < -128) {
                    i29 = 0;
                }
                bArr5[length26] = Byte.parseByte(String.valueOf(i29));
                i5 = 1;
            } catch (Throwable th3) {
                ei.a(th3, "Req", "buildV4Dot216");
                byte[] bArrA17 = a(com.alipay.sdk.m.u.c.b);
                System.arraycopy(bArrA17, 0, bArr5, length26, bArrA17.length);
                int length28 = length26 + bArrA17.length;
                bArr5[length28] = 0;
                i5 = 1;
                length26 = length28 + 1;
                bArr5[length26] = Byte.parseByte("0");
            }
            i6 = length26 + 1;
        }
        ArrayList<ScanResult> arrayList2 = this.F;
        int iMin2 = Math.min(arrayList2.size(), 25);
        if (iMin2 == 0) {
            bArr5[i6] = 0;
            length6 = i6 + i5;
            str = "GBK";
        } else {
            bArr5[i6] = (byte) iMin2;
            int length29 = i6 + i5;
            boolean z = eo.c() >= 17;
            long jB = z ? eo.b() / 1000 : 0L;
            int i30 = 0;
            while (i30 < iMin2) {
                ScanResult scanResult = arrayList2.get(i30);
                byte[] bArrA18 = a(scanResult.BSSID);
                System.arraycopy(bArrA18, 0, bArr5, length29, bArrA18.length);
                int length30 = length29 + bArrA18.length;
                try {
                    byte[] bytes3 = scanResult.SSID.getBytes(str3);
                    bArr5[length30] = (byte) bytes3.length;
                    length30++;
                    System.arraycopy(bytes3, 0, bArr5, length30, bytes3.length);
                    length7 = length30 + bytes3.length;
                    i7 = 1;
                } catch (Exception unused2) {
                    bArr5[length30] = 0;
                    i7 = 1;
                    length7 = length30 + 1;
                }
                int i31 = scanResult.level;
                if (i31 > 127 || i31 < -128) {
                    i31 = 0;
                }
                bArr5[length7] = Byte.parseByte(String.valueOf(i31));
                int i32 = length7 + i7;
                String str4 = str3;
                if (!z || (i8 = (int) (jB - ((scanResult.timestamp / 1000000) + 1))) < 0) {
                    i8 = 0;
                }
                if (i8 > 65535) {
                    i8 = 65535;
                }
                byte[] bArrA19 = eo.a(i8, bArr);
                System.arraycopy(bArrA19, 0, bArr5, i32, bArrA19.length);
                int length31 = i32 + bArrA19.length;
                byte[] bArrA20 = eo.a(scanResult.frequency, bArr);
                System.arraycopy(bArrA20, 0, bArr5, length31, bArrA20.length);
                length29 = length31 + bArrA20.length;
                i30++;
                str3 = str4;
            }
            str = str3;
            byte[] bArrA21 = eo.a(Integer.parseInt(this.G), bArr);
            System.arraycopy(bArrA21, 0, bArr5, length29, bArrA21.length);
            length6 = length29 + bArrA21.length;
        }
        bArr5[length6] = 0;
        int i33 = length6 + 1;
        try {
            byte[] bytes4 = this.H.getBytes(str);
            if (bytes4.length > 127) {
                bytes4 = null;
            }
            if (bytes4 == null) {
                bArr5[i33] = 0;
                length8 = i33 + 1;
            } else {
                bArr5[i33] = (byte) bytes4.length;
                int i34 = i33 + 1;
                System.arraycopy(bytes4, 0, bArr5, i34, bytes4.length);
                length8 = i34 + bytes4.length;
            }
        } catch (Throwable unused3) {
            bArr5[i33] = 0;
        }
        byte[] bArrA22 = {0, 0};
        try {
            boolean zIsEmpty = TextUtils.isEmpty(this.K);
            if (!zIsEmpty) {
                bArrA22 = eo.a(this.K.length(), bArr);
            }
            System.arraycopy(bArrA22, 0, bArr5, length8, 2);
            length9 = length8 + 2;
            if (!zIsEmpty) {
                try {
                    byte[] bytes5 = this.K.getBytes(str);
                    System.arraycopy(bytes5, 0, bArr5, length9, bytes5.length);
                    length9 += bytes5.length;
                } catch (Throwable unused4) {
                }
            }
            i9 = 2;
        } catch (Throwable unused5) {
            i9 = 2;
            length9 = length8 + 2;
        }
        try {
            System.arraycopy(eo.a(0, bArr), 0, bArr5, length9, i9);
        } catch (Throwable unused6) {
        }
        int i35 = length9 + i9;
        byte[] bArr6 = new byte[i9];
        // fill-array-data instruction
        bArr6[0] = 0;
        bArr6[1] = 0;
        try {
            System.arraycopy(bArr6, 0, bArr5, i35, i9);
        } catch (Throwable unused7) {
        }
        int i36 = i35 + i9;
        byte[] bArr7 = this.I;
        int length32 = bArr7 != null ? bArr7.length : 0;
        byte[] bArrA23 = eo.a(length32, (byte[]) null);
        System.arraycopy(bArrA23, 0, bArr5, i36, bArrA23.length);
        int length33 = i36 + bArrA23.length;
        if (length32 > 0) {
            byte[] bArr8 = this.I;
            System.arraycopy(bArr8, 0, bArr5, length33, bArr8.length);
            length33 += this.I.length;
        }
        if (Double.valueOf("5.1").doubleValue() >= 5.0d) {
            bArr5[length33] = 0;
            length33 = a(this.N, bArr5, length33 + 1);
        }
        byte[] bArr9 = new byte[length33];
        System.arraycopy(bArr5, 0, bArr9, 0, length33);
        CRC32 crc32 = new CRC32();
        crc32.update(bArr9);
        byte[] bArrA24 = eo.a(crc32.getValue());
        byte[] bArr10 = new byte[length33 + 8];
        System.arraycopy(bArr9, 0, bArr10, 0, length33);
        System.arraycopy(bArrA24, 0, bArr10, length33, 8);
        return bArr10;
    }
}
