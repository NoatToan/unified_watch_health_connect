package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes4.dex */
public final class io {
    public static String a(Context context, String str, String str2) {
        try {
            return it.b(il.e(context) + ":" + str.substring(0, str.length() - 3) + ":" + str2);
        } catch (Throwable th) {
            js.a(th, "CI", "Sco");
            return null;
        }
    }

    public static String a() {
        String str;
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis());
            if (il.a()) {
                str = "1";
            } else {
                str = "0";
            }
            int length = strValueOf.length();
            return strValueOf.substring(0, length - 2) + str + strValueOf.substring(length - 1);
        } catch (Throwable th) {
            js.a(th, "CI", "TS");
            return null;
        }
    }

    public static String a(Context context) {
        try {
            a aVar = new a((byte) 0);
            aVar.d = il.c(context);
            aVar.i = il.d(context);
            return a(aVar);
        } catch (Throwable th) {
            js.a(th, "CI", "IX");
            return null;
        }
    }

    public static byte[] a(byte[] bArr) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException, NullPointerException {
        return iq.a(bArr);
    }

    public static byte[] a(Context context, boolean z, boolean z2) {
        try {
            return b(b(context, z, z2));
        } catch (Throwable th) {
            js.a(th, "CI", "gz");
            return null;
        }
    }

    public static String b(Context context) {
        return c(context);
    }

    private static String c(Context context) {
        try {
            return a(b(context, false, false));
        } catch (Throwable th) {
            js.a(th, "CI", "gCXi");
            return null;
        }
    }

    private static byte[] b(byte[] bArr) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException, NullPointerException {
        PublicKey publicKeyD = iy.d();
        if (bArr.length > 117) {
            byte[] bArr2 = new byte[117];
            System.arraycopy(bArr, 0, bArr2, 0, 117);
            byte[] bArrA = iq.a(bArr2, publicKeyD);
            byte[] bArr3 = new byte[bArr.length + 11];
            System.arraycopy(bArrA, 0, bArr3, 0, 128);
            System.arraycopy(bArr, 117, bArr3, 128, bArr.length - 117);
            return bArr3;
        }
        return iq.a(bArr, publicKeyD);
    }

    private static String a(a aVar) {
        return iq.b(b(aVar));
    }

    private static byte[] b(a aVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                a(byteArrayOutputStream, aVar.f2795a);
                a(byteArrayOutputStream, aVar.f2796b);
                a(byteArrayOutputStream, aVar.f2797c);
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
                a(byteArrayOutputStream, aVar.z);
                a(byteArrayOutputStream, aVar.A);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                new String(byteArray);
                byte[] bArrB = b(iy.b(byteArray));
                try {
                    byteArrayOutputStream.close();
                    return bArrB;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return bArrB;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    js.a(th, "CI", "gzx");
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
            iy.a(byteArrayOutputStream, str.getBytes().length > 255 ? (byte) -1 : (byte) str.getBytes().length, iy.a(str));
        } else {
            iy.a(byteArrayOutputStream, (byte) 0, new byte[0]);
        }
    }

    private static a b(Context context, boolean z, boolean z2) {
        a aVar = new a((byte) 0);
        aVar.f2795a = ip.k();
        aVar.f2796b = ip.h();
        String strF = ip.f(context);
        if (strF == null) {
            strF = "";
        }
        aVar.f2797c = strF;
        aVar.d = il.c(context);
        aVar.e = Build.MODEL;
        aVar.f = Build.MANUFACTURER;
        aVar.g = Build.DEVICE;
        aVar.h = il.b(context);
        aVar.i = il.d(context);
        aVar.j = String.valueOf(Build.VERSION.SDK_INT);
        aVar.k = ip.n();
        aVar.l = ip.m(context);
        StringBuilder sb = new StringBuilder();
        sb.append(ip.j(context));
        aVar.m = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ip.i(context));
        aVar.n = sb2.toString();
        aVar.o = ip.s(context);
        aVar.p = ip.h(context);
        aVar.q = "";
        aVar.r = "";
        if (z) {
            aVar.s = "";
            aVar.t = "";
        } else {
            String[] strArrI = ip.i();
            aVar.s = strArrI[0];
            aVar.t = strArrI[1];
        }
        aVar.w = ip.a();
        String strA = ip.a(context);
        if (!TextUtils.isEmpty(strA)) {
            aVar.x = strA;
        } else {
            aVar.x = "";
        }
        aVar.y = "aid=" + ip.g();
        if ((z2 && jg.d) || jg.e) {
            String strE = ip.e(context);
            if (!TextUtils.isEmpty(strE)) {
                aVar.y += "|oaid=" + strE;
            }
        }
        String strJ = ip.j();
        if (!TextUtils.isEmpty(strJ)) {
            aVar.y += "|multiImeis=" + strJ;
        }
        String strM = ip.m();
        if (!TextUtils.isEmpty(strM)) {
            aVar.y += "|meid=" + strM;
        }
        aVar.y += "|serial=" + ip.f();
        String strB = ip.b();
        if (!TextUtils.isEmpty(strB)) {
            aVar.y += "|adiuExtras=" + strB;
        }
        aVar.y += "|storage=" + ip.o() + "|ram=" + ip.r(context) + "|arch=" + ip.p();
        String strB2 = jr.a().b();
        if (!TextUtils.isEmpty(strB2)) {
            aVar.z = strB2;
        } else {
            aVar.z = "";
        }
        if (z) {
            ja.a(context);
            String strA2 = ja.a();
            if (!TextUtils.isEmpty(strA2)) {
                aVar.A = strA2;
            }
        }
        return aVar;
    }

    static final class a {
        String A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f2795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f2796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f2797c;
        String d;
        String e;
        String f;
        String g;
        String h;
        String i;
        String j;
        String k;
        String l;
        String m;
        String n;
        String o;
        String p;
        String q;
        String r;
        String s;
        String t;
        String u;
        String v;
        String w;
        String x;
        String y;
        String z;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }
}
