package com.amap.api.mapcore.util;

import android.content.Context;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jb {
    public static void a(Context context, iu iuVar, String str, int i, int i2, String str2) {
        iuVar.a = hl.c(context, str);
        iuVar.d = i;
        iuVar.b = i2;
        iuVar.c = str2;
    }

    public static iu a(WeakReference<iu> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new iu());
        }
        return weakReference.get();
    }

    public static byte[] a(ih ihVar, String str) {
        ih.b bVarA;
        byte[] bArr = new byte[0];
        InputStream inputStream = null;
        try {
            bVarA = ihVar.a(str);
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
                    hn.c(th, "sui", "rdS");
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

    public static String a(Context context, gt gtVar) {
        StringBuilder sb = new StringBuilder();
        try {
            String strF = gn.f(context);
            sb.append("\"sim\":\"");
            sb.append(strF);
            sb.append("\",\"sdkversion\":\"");
            sb.append(gtVar.c());
            sb.append("\",\"product\":\"");
            sb.append(gtVar.a());
            sb.append("\",\"ed\":\"");
            sb.append(gtVar.e());
            sb.append("\",\"nt\":\"");
            sb.append(gn.d(context));
            sb.append("\",\"np\":\"");
            sb.append(gn.b(context));
            sb.append("\",\"mnc\":\"");
            sb.append(gn.c(context));
            sb.append("\",\"ant\":\"");
            sb.append(gn.e(context));
            sb.append("\"");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }
}
