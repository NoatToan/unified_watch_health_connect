package com.loc;

import android.content.Context;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public final class bc {
    public static aw a(WeakReference<aw> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new aw());
        }
        return weakReference.get();
    }

    public static String a(Context context, t tVar) {
        StringBuilder sb = new StringBuilder();
        try {
            String strF = n.f(context);
            sb.append("\"sim\":\"");
            sb.append(strF);
            sb.append("\",\"sdkversion\":\"");
            sb.append(tVar.c());
            sb.append("\",\"product\":\"");
            sb.append(tVar.a());
            sb.append("\",\"ed\":\"");
            sb.append(tVar.d());
            sb.append("\",\"nt\":\"");
            sb.append(n.d(context));
            sb.append("\",\"np\":\"");
            sb.append(n.b(context));
            sb.append("\",\"mnc\":\"");
            sb.append(n.c(context));
            sb.append("\",\"ant\":\"");
            sb.append(n.e(context));
            sb.append("\"");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    public static void a(Context context, aw awVar, String str, int i, int i2, String str2) {
        awVar.a = z.c(context, str);
        awVar.d = i;
        awVar.b = i2;
        awVar.c = str2;
    }

    public static byte[] a(ao aoVar, String str) {
        ao.b bVarA;
        byte[] bArr = new byte[0];
        InputStream inputStream = null;
        try {
            bVarA = aoVar.a(str);
            if (bVarA == null) {
                if (bVarA != null) {
                    try {
                        bVarA.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
                return bArr;
            }
            try {
                InputStream inputStreamA = bVarA.a();
                if (inputStreamA == null) {
                    if (inputStreamA != null) {
                        try {
                            inputStreamA.close();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    try {
                        bVarA.close();
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
                    bVarA.close();
                } catch (Throwable th5) {
                    th5.printStackTrace();
                }
                return bArr;
            } catch (Throwable th6) {
                th = th6;
                try {
                    ab.b(th, "sui", "rdS");
                    return bArr;
                } finally {
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Throwable th7) {
                            th7.printStackTrace();
                        }
                    }
                    if (bVarA != null) {
                        try {
                            bVarA.close();
                        } catch (Throwable th8) {
                            th8.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th9) {
            th = th9;
            bVarA = null;
        }
    }
}
