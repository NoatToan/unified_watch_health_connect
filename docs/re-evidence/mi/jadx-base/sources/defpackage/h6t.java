package defpackage;

import android.content.Context;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class h6t {
    public static String a() {
        return p0t.b(System.currentTimeMillis());
    }

    public static String b(Context context, o0t o0tVar) {
        StringBuilder sb = new StringBuilder();
        try {
            String strA = h0t.A();
            sb.append("\"sim\":\"");
            sb.append(strA);
            sb.append("\",\"sdkversion\":\"");
            sb.append(o0tVar.f());
            sb.append("\",\"product\":\"");
            sb.append(o0tVar.a());
            sb.append("\",\"ed\":\"");
            sb.append(o0tVar.g());
            sb.append("\",\"nt\":\"");
            sb.append(h0t.w(context));
            sb.append("\",\"np\":\"");
            sb.append(h0t.u(context));
            sb.append("\",\"mnc\":\"");
            sb.append(h0t.z());
            sb.append("\",\"ant\":\"");
            sb.append(h0t.y(context));
            sb.append("\"");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    public static String c(String str, String str2, int i, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(i);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    public static String d(String str, String str2, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(1);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    public static z5t e(WeakReference<z5t> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new z5t());
        }
        return weakReference.get();
    }

    public static void f(Context context, z5t z5tVar, String str, int i, int i2, String str2) {
        z5tVar.f40930a = k2t.i(context, str);
        z5tVar.d = i;
        z5tVar.f40931b = i2;
        z5tVar.c = str2;
    }

    public static byte[] g(q4t q4tVar, String str) {
        q4t.e eVarB;
        byte[] bArr = new byte[0];
        InputStream inputStream = null;
        try {
            eVarB = q4tVar.b(str);
            if (eVarB == null) {
                if (eVarB != null) {
                    try {
                        eVarB.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                return bArr;
            }
            try {
                InputStream inputStreamA = eVarB.a();
                if (inputStreamA == null) {
                    if (inputStreamA != null) {
                        try {
                            inputStreamA.close();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    try {
                        eVarB.close();
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                    return bArr;
                }
                bArr = new byte[inputStreamA.available()];
                inputStreamA.read(bArr);
                try {
                    inputStreamA.close();
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
                try {
                    eVarB.close();
                } catch (Throwable th5) {
                    th5.printStackTrace();
                }
                return bArr;
            } catch (Throwable th6) {
                th = th6;
                try {
                    m2t.r(th, "sui", "rdS");
                    return bArr;
                } finally {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Throwable th7) {
                            th7.printStackTrace();
                        }
                    }
                    if (eVarB != null) {
                        try {
                            eVarB.close();
                        } catch (Throwable th8) {
                            th8.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th9) {
            th = th9;
            eVarB = null;
        }
    }
}
