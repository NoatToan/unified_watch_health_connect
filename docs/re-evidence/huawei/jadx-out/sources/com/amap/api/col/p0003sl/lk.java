package com.amap.api.col.p0003sl;

import android.content.Context;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class lk {
    public static void a(Context context, ld ldVar, String str, int i, int i2, String str2) {
        ldVar.f3040a = jt.c(context, str);
        ldVar.d = i;
        ldVar.f3041b = i2;
        ldVar.f3042c = str2;
    }

    public static ld a(WeakReference<ld> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new ld());
        }
        return weakReference.get();
    }

    static byte[] a(kq kqVar, String str) {
        InputStream inputStreamA;
        Throwable th;
        kq.b bVarA;
        byte[] bArr = new byte[0];
        try {
            bVarA = kqVar.a(str);
            try {
                if (bVarA != null) {
                    try {
                        inputStreamA = bVarA.a();
                        if (inputStreamA != null) {
                            try {
                                bArr = new byte[inputStreamA.available()];
                                inputStreamA.read(bArr);
                                if (inputStreamA != null) {
                                    try {
                                        inputStreamA.close();
                                    } catch (Throwable th2) {
                                        th2.printStackTrace();
                                    }
                                }
                                if (bVarA != null) {
                                    try {
                                        bVarA.close();
                                    } catch (Throwable th3) {
                                        th3.printStackTrace();
                                    }
                                }
                                return bArr;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    jv.c(th, "sui", "rdS");
                                    return bArr;
                                } finally {
                                    if (inputStreamA != null) {
                                        try {
                                            inputStreamA.close();
                                        } catch (Throwable th5) {
                                            th5.printStackTrace();
                                        }
                                    }
                                    if (bVarA != null) {
                                        try {
                                            bVarA.close();
                                        } catch (Throwable th6) {
                                            th6.printStackTrace();
                                        }
                                    }
                                }
                            }
                        }
                        if (inputStreamA != null) {
                            try {
                                inputStreamA.close();
                            } catch (Throwable th7) {
                                th7.printStackTrace();
                            }
                        }
                        if (bVarA != null) {
                            bVarA.close();
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        inputStreamA = null;
                    }
                } else if (bVarA != null) {
                    bVarA.close();
                    return bArr;
                }
            } catch (Throwable th9) {
                th9.printStackTrace();
            }
            return bArr;
        } catch (Throwable th10) {
            inputStreamA = null;
            th = th10;
            bVarA = null;
        }
    }

    public static String a() {
        return iy.a(System.currentTimeMillis());
    }

    public static String a(Context context, ix ixVar) {
        StringBuilder sb = new StringBuilder();
        try {
            String strE = ip.e();
            sb.append("\"sim\":\"");
            sb.append(strE);
            sb.append("\",\"sdkversion\":\"");
            sb.append(ixVar.c());
            sb.append("\",\"product\":\"");
            sb.append(ixVar.a());
            sb.append("\",\"ed\":\"");
            sb.append(ixVar.d());
            sb.append("\",\"nt\":\"");
            sb.append(ip.c(context));
            sb.append("\",\"np\":\"");
            sb.append(ip.b(context));
            sb.append("\",\"mnc\":\"");
            sb.append(ip.d());
            sb.append("\",\"ant\":\"");
            sb.append(ip.d(context));
            sb.append("\"");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    public static String a(String str, String str2, int i, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str).append(",\"timestamp\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(i);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",\"detail\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }

    public static String a(String str, String str2, String str3, String str4) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str).append(",\"timestamp\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\",\"et\":\"1\",\"classname\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",\"detail\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }
}
