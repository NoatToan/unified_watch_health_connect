package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes2.dex */
public final class gm {

    public static class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;
        public String r;
        public String s;
        public String t;
        public String u;
        public String v;
        public String w;
        public String x;
        public String y;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static String a(Context context, String str, String str2) {
        try {
            return gr.b(gj.e(context) + ":" + str.substring(0, str.length() - 3) + ":" + str2);
        } catch (Throwable th) {
            hk.a(th, "CI", "Sco");
            return null;
        }
    }

    public static String b(Context context) {
        try {
            return go.b(a(b(context, false, false)));
        } catch (Throwable th) {
            hk.a(th, "CI", "gCXi");
            return null;
        }
    }

    public static String a() {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String str = gj.a() ? "1" : "0";
            int length = strValueOf.length();
            return strValueOf.substring(0, length - 2) + str + strValueOf.substring(length - 1);
        } catch (Throwable th) {
            hk.a(th, "CI", "TS");
            return null;
        }
    }

    private static a b(Context context, boolean z, boolean z2) {
        a aVar = new a((byte) 0);
        aVar.a = gn.u(context);
        aVar.b = gn.m(context);
        String strH = gn.h(context);
        if (strH == null) {
            strH = "";
        }
        aVar.c = strH;
        aVar.d = gj.c(context);
        aVar.e = Build.MODEL;
        aVar.f = Build.MANUFACTURER;
        aVar.g = Build.DEVICE;
        aVar.h = gj.b(context);
        aVar.i = gj.d(context);
        aVar.j = String.valueOf(Build.VERSION.SDK_INT);
        aVar.k = gn.x(context);
        aVar.l = gn.r(context);
        StringBuilder sb = new StringBuilder();
        sb.append(gn.p(context));
        aVar.m = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(gn.o(context));
        aVar.n = sb2.toString();
        aVar.o = gn.z(context);
        aVar.p = gn.n(context);
        if (z) {
            aVar.q = "";
        } else {
            aVar.q = gn.l(context);
        }
        if (z) {
            aVar.r = "";
        } else {
            aVar.r = gn.k(context);
        }
        if (z) {
            aVar.s = "";
            aVar.t = "";
        } else {
            String[] strArrD = gn.d();
            aVar.s = strArrD[0];
            aVar.t = strArrD[1];
        }
        aVar.w = gn.a();
        String strA = gn.a(context);
        if (!TextUtils.isEmpty(strA)) {
            aVar.x = strA;
        } else {
            aVar.x = "";
        }
        aVar.y = "aid=" + gn.j(context);
        if ((z2 && hj.d) || hj.e) {
            String strG = gn.g(context);
            if (!TextUtils.isEmpty(strG)) {
                aVar.y += "|oaid=" + strG;
            }
        }
        String strA2 = gn.a(context, ",");
        if (!TextUtils.isEmpty(strA2)) {
            aVar.y += "|multiImeis=" + strA2;
        }
        String strW = gn.w(context);
        if (!TextUtils.isEmpty(strW)) {
            aVar.y += "|meid=" + strW;
        }
        aVar.y += "|serial=" + gn.i(context);
        String strB = gn.b();
        if (!TextUtils.isEmpty(strB)) {
            aVar.y += "|adiuExtras=" + strB;
        }
        aVar.y += "|storage=" + gn.e() + "|ram=" + gn.y(context) + "|arch=" + gn.f();
        return aVar;
    }

    public static String a(Context context) {
        try {
            a aVar = new a((byte) 0);
            aVar.d = gj.c(context);
            aVar.i = gj.d(context);
            return go.b(a(aVar));
        } catch (Throwable th) {
            hk.a(th, "CI", "IX");
            return null;
        }
    }

    public static byte[] a(Context context, boolean z, boolean z2) {
        try {
            return a(b(context, z, z2));
        } catch (Throwable th) {
            hk.a(th, "CI", "gz");
            return null;
        }
    }

    private static byte[] a(a aVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArrA;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                a(byteArrayOutputStream, aVar.a);
                a(byteArrayOutputStream, aVar.b);
                a(byteArrayOutputStream, aVar.c);
                a(byteArrayOutputStream, aVar.d);
                a(byteArrayOutputStream, aVar.e);
                a(byteArrayOutputStream, aVar.f);
                a(byteArrayOutputStream, aVar.g);
                a(byteArrayOutputStream, aVar.h);
                a(byteArrayOutputStream, aVar.i);
                a(byteArrayOutputStream, aVar.j);
                a(byteArrayOutputStream, aVar.k);
                a(byteArrayOutputStream, aVar.l);
                a(byteArrayOutputStream, aVar.m);
                a(byteArrayOutputStream, aVar.n);
                a(byteArrayOutputStream, aVar.o);
                a(byteArrayOutputStream, aVar.p);
                a(byteArrayOutputStream, aVar.q);
                a(byteArrayOutputStream, aVar.r);
                a(byteArrayOutputStream, aVar.s);
                a(byteArrayOutputStream, aVar.t);
                a(byteArrayOutputStream, aVar.u);
                a(byteArrayOutputStream, aVar.v);
                a(byteArrayOutputStream, aVar.w);
                a(byteArrayOutputStream, aVar.x);
                a(byteArrayOutputStream, aVar.y);
                byte[] bArrB = gu.b(byteArrayOutputStream.toByteArray());
                PublicKey publicKeyD = gu.d();
                if (bArrB.length > 117) {
                    byte[] bArr = new byte[117];
                    System.arraycopy(bArrB, 0, bArr, 0, 117);
                    byte[] bArrA2 = go.a(bArr, publicKeyD);
                    bArrA = new byte[(bArrB.length + 128) - 117];
                    System.arraycopy(bArrA2, 0, bArrA, 0, 128);
                    System.arraycopy(bArrB, 117, bArrA, 128, bArrB.length - 117);
                } else {
                    bArrA = go.a(bArrB, publicKeyD);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return bArrA;
            } catch (Throwable th2) {
                th = th2;
                try {
                    hk.a(th, "CI", "gzx");
                    return null;
                } finally {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (!TextUtils.isEmpty(str)) {
            gu.a(byteArrayOutputStream, str.getBytes().length > 255 ? (byte) -1 : (byte) str.getBytes().length, gu.a(str));
        } else {
            gu.a(byteArrayOutputStream, (byte) 0, new byte[0]);
        }
    }
}
