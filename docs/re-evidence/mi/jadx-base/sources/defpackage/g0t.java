package defpackage;

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
public final class g0t {

    public static class a {
        public String A;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18443b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f18444k;
        public String l;
        public String m;
        public String n;
        public String o;
        public String p;
        public String q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public String f18445r;
        public String s;
        public String t;
        public String u;
        public String v;
        public String w;
        public String x;
        public String y;
        public String z;

        public a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static String a() {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String str = e0t.d() ? "1" : "0";
            int length = strValueOf.length();
            return strValueOf.substring(0, length - 2) + str + strValueOf.substring(length - 1);
        } catch (Throwable th) {
            j2t.e(th, "CI", "TS");
            return null;
        }
    }

    public static String b(Context context) {
        try {
            a aVar = new a((byte) 0);
            aVar.d = e0t.g(context);
            aVar.i = e0t.i(context);
            return d(aVar);
        } catch (Throwable th) {
            j2t.e(th, "CI", "IX");
            return null;
        }
    }

    public static String c(Context context, String str, String str2) {
        try {
            return m0t.d(e0t.j(context) + ":" + str.substring(0, str.length() - 3) + ":" + str2);
        } catch (Throwable th) {
            j2t.e(th, "CI", "Sco");
            return null;
        }
    }

    public static String d(a aVar) {
        return j0t.f(j(aVar));
    }

    public static void e(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            p0t.j(byteArrayOutputStream, (byte) 0, new byte[0]);
        } else {
            p0t.j(byteArrayOutputStream, str.getBytes().length > 255 ? (byte) -1 : (byte) str.getBytes().length, p0t.n(str));
        }
    }

    public static byte[] f(Context context, boolean z, boolean z2) {
        try {
            return j(h(context, z, z2));
        } catch (Throwable th) {
            j2t.e(th, "CI", "gz");
            return null;
        }
    }

    public static byte[] g(byte[] bArr) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException, NullPointerException {
        return j0t.b(bArr);
    }

    public static a h(Context context, boolean z, boolean z2) {
        a aVar = new a((byte) 0);
        aVar.f18442a = h0t.N();
        aVar.f18443b = h0t.G();
        String strD = h0t.D(context);
        if (strD == null) {
            strD = "";
        }
        aVar.c = strD;
        aVar.d = e0t.g(context);
        aVar.e = Build.MODEL;
        aVar.f = Build.MANUFACTURER;
        aVar.g = Build.DEVICE;
        aVar.h = e0t.e(context);
        aVar.i = e0t.i(context);
        aVar.j = String.valueOf(Build.VERSION.SDK_INT);
        aVar.f18444k = h0t.R();
        aVar.l = h0t.Q(context);
        StringBuilder sb = new StringBuilder();
        sb.append(h0t.K(context));
        aVar.m = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h0t.I(context));
        aVar.n = sb2.toString();
        aVar.o = h0t.b0(context);
        aVar.p = h0t.H(context);
        aVar.q = "";
        aVar.f18445r = "";
        if (z) {
            aVar.s = "";
            aVar.t = "";
        } else {
            String[] strArrJ = h0t.J();
            aVar.s = strArrJ[0];
            aVar.t = strArrJ[1];
        }
        aVar.w = h0t.m();
        String strN = h0t.n(context);
        if (TextUtils.isEmpty(strN)) {
            aVar.x = "";
        } else {
            aVar.x = strN;
        }
        aVar.y = "aid=" + h0t.E();
        if ((z2 && t1t.e) || t1t.f) {
            String strB = h0t.B(context);
            if (!TextUtils.isEmpty(strB)) {
                aVar.y += "|oaid=" + strB;
            }
        }
        String strL = h0t.L();
        if (!TextUtils.isEmpty(strL)) {
            aVar.y += "|multiImeis=" + strL;
        }
        String strP = h0t.P();
        if (!TextUtils.isEmpty(strP)) {
            aVar.y += "|meid=" + strP;
        }
        aVar.y += "|serial=" + h0t.C();
        String strT = h0t.t();
        if (!TextUtils.isEmpty(strT)) {
            aVar.y += "|adiuExtras=" + strT;
        }
        aVar.y += "|storage=" + h0t.T() + "|ram=" + h0t.Z(context) + "|arch=" + h0t.V();
        String strB2 = i2t.a().b();
        if (TextUtils.isEmpty(strB2)) {
            aVar.z = "";
        } else {
            aVar.z = strB2;
        }
        if (z) {
            f1t.a(context);
            String strB3 = f1t.b();
            if (!TextUtils.isEmpty(strB3)) {
                aVar.A = strB3;
            }
        }
        return aVar;
    }

    public static String i(Context context) {
        return l(context);
    }

    public static byte[] j(a aVar) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                e(byteArrayOutputStream, aVar.f18442a);
                e(byteArrayOutputStream, aVar.f18443b);
                e(byteArrayOutputStream, aVar.c);
                e(byteArrayOutputStream, aVar.d);
                e(byteArrayOutputStream, aVar.e);
                e(byteArrayOutputStream, aVar.f);
                e(byteArrayOutputStream, aVar.g);
                e(byteArrayOutputStream, aVar.h);
                e(byteArrayOutputStream, aVar.i);
                e(byteArrayOutputStream, aVar.j);
                e(byteArrayOutputStream, aVar.f18444k);
                e(byteArrayOutputStream, aVar.l);
                e(byteArrayOutputStream, aVar.m);
                e(byteArrayOutputStream, aVar.n);
                e(byteArrayOutputStream, aVar.o);
                e(byteArrayOutputStream, aVar.p);
                e(byteArrayOutputStream, aVar.q);
                e(byteArrayOutputStream, aVar.f18445r);
                e(byteArrayOutputStream, aVar.s);
                e(byteArrayOutputStream, aVar.t);
                e(byteArrayOutputStream, aVar.u);
                e(byteArrayOutputStream, aVar.v);
                e(byteArrayOutputStream, aVar.w);
                e(byteArrayOutputStream, aVar.x);
                e(byteArrayOutputStream, aVar.y);
                e(byteArrayOutputStream, aVar.z);
                e(byteArrayOutputStream, aVar.A);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                new String(byteArray);
                byte[] bArrK = k(p0t.s(byteArray));
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return bArrK;
            } catch (Throwable th2) {
                th = th2;
                try {
                    j2t.e(th, "CI", "gzx");
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

    public static byte[] k(byte[] bArr) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException, NullPointerException {
        PublicKey publicKeyW = p0t.w();
        if (bArr.length <= 117) {
            return j0t.c(bArr, publicKeyW);
        }
        byte[] bArr2 = new byte[117];
        System.arraycopy(bArr, 0, bArr2, 0, 117);
        byte[] bArrC = j0t.c(bArr2, publicKeyW);
        byte[] bArr3 = new byte[bArr.length + 11];
        System.arraycopy(bArrC, 0, bArr3, 0, 128);
        System.arraycopy(bArr, 117, bArr3, 128, bArr.length - 117);
        return bArr3;
    }

    public static String l(Context context) {
        try {
            return d(h(context, false, false));
        } catch (Throwable th) {
            j2t.e(th, "CI", "gCXi");
            return null;
        }
    }
}
