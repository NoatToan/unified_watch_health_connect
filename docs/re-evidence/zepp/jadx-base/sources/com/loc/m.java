package com.loc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes18.dex */
public final class m {

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

    public static String a() {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String str = k.a() ? "1" : "0";
            int length = strValueOf.length();
            return strValueOf.substring(0, length - 2) + str + strValueOf.substring(length - 1);
        } catch (Throwable th) {
            y.a(th, "CI", "TS");
            return null;
        }
    }

    public static String a(Context context, String str, String str2) {
        try {
            return r.a(k.e(context) + ":" + str.substring(0, str.length() - 3) + ":" + str2);
        } catch (Throwable th) {
            y.a(th, "CI", "Sco");
            return null;
        }
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            u.a(byteArrayOutputStream, (byte) 0, new byte[0]);
        } else {
            u.a(byteArrayOutputStream, str.getBytes().length > 255 ? (byte) -1 : (byte) str.getBytes().length, u.a(str));
        }
    }

    public static byte[] a(Context context, boolean z, boolean z2) {
        try {
            a aVar = new a((byte) 0);
            aVar.a = n.w(context);
            aVar.b = n.m(context);
            String strH = n.h(context);
            if (strH == null) {
                strH = "";
            }
            aVar.c = strH;
            aVar.d = k.c(context);
            aVar.e = Build.MODEL;
            aVar.f = Build.MANUFACTURER;
            aVar.g = Build.DEVICE;
            aVar.h = k.b(context);
            aVar.i = k.d(context);
            aVar.j = String.valueOf(Build.VERSION.SDK_INT);
            aVar.k = n.z(context);
            aVar.l = n.t(context);
            StringBuilder sb = new StringBuilder();
            sb.append(n.q(context));
            aVar.m = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(n.p(context));
            aVar.n = sb2.toString();
            aVar.o = n.B(context);
            aVar.p = n.o(context);
            if (z) {
                aVar.q = "";
            } else {
                aVar.q = n.l(context);
            }
            if (z) {
                aVar.r = "";
            } else {
                aVar.r = n.k(context);
            }
            if (z) {
                aVar.s = "";
                aVar.t = "";
            } else {
                String[] strArrD = n.d();
                aVar.s = strArrD[0];
                aVar.t = strArrD[1];
            }
            aVar.w = n.a();
            String strA = n.a(context);
            if (TextUtils.isEmpty(strA)) {
                aVar.x = "";
            } else {
                aVar.x = strA;
            }
            aVar.y = "aid=" + n.j(context);
            if ((z2 && v.e) || v.f) {
                String strG = n.g(context);
                if (!TextUtils.isEmpty(strG)) {
                    aVar.y += "|oaid=" + strG;
                }
            }
            String strA2 = n.a(context, ",");
            if (!TextUtils.isEmpty(strA2)) {
                aVar.y += "|multiImeis=" + strA2;
            }
            String strY = n.y(context);
            if (!TextUtils.isEmpty(strY)) {
                aVar.y += "|meid=" + strY;
            }
            aVar.y += "|serial=" + n.i(context);
            String strB = n.b();
            if (!TextUtils.isEmpty(strB)) {
                aVar.y += "|adiuExtras=" + strB;
            }
            aVar.y += "|storage=" + n.e() + "|ram=" + n.A(context) + "|arch=" + n.f();
            return a(aVar);
        } catch (Throwable th) {
            y.a(th, "CI", "gz");
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
                byte[] bArrB = u.b(byteArrayOutputStream.toByteArray());
                PublicKey publicKeyD = u.d();
                if (bArrB.length > 117) {
                    byte[] bArr = new byte[117];
                    System.arraycopy(bArrB, 0, bArr, 0, 117);
                    byte[] bArrA2 = o.a(bArr, publicKeyD);
                    bArrA = new byte[(bArrB.length + 128) - 117];
                    System.arraycopy(bArrA2, 0, bArrA, 0, 128);
                    System.arraycopy(bArrB, 117, bArrA, 128, bArrB.length - 117);
                } else {
                    bArrA = o.a(bArrB, publicKeyD);
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
                    y.a(th, "CI", "gzx");
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
}
