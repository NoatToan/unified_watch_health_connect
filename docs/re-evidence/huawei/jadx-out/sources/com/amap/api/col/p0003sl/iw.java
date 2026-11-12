package com.amap.api.col.p0003sl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.operation.utils.Constants;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class iw {
    public static Proxy a(Context context) {
        try {
            return a(context, new URI("http://restsdk.amap.com"));
        } catch (Throwable th) {
            jv.c(th, "pu", "gp");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x014c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x00bb A[EXC_TOP_SPLITTER, PHI: r9 r11 r17
      0x00bb: PHI (r9v5 android.database.Cursor) = (r9v4 android.database.Cursor), (r9v6 android.database.Cursor) binds: [B:98:0x013b, B:58:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r11v14 java.lang.String) = (r11v5 java.lang.String), (r11v34 java.lang.String) binds: [B:98:0x013b, B:58:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00bb: PHI (r17v4 ??) = (r17v2 ??), (r17v7 ??) binds: [B:98:0x013b, B:58:0x00b9] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[PHI: r10 r11
      0x007b: PHI (r10v15 int) = (r10v14 int), (r10v17 int) binds: [B:49:0x00ab, B:29:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r11v26 java.lang.String) = (r11v22 java.lang.String), (r11v30 java.lang.String) binds: [B:49:0x00ab, B:29:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec A[Catch: all -> 0x0164, TryCatch #2 {all -> 0x0164, blocks: (B:65:0x00c7, B:73:0x00e1, B:75:0x00ec, B:77:0x0100, B:79:0x0106, B:83:0x0111, B:86:0x0119, B:88:0x011f, B:90:0x0125, B:94:0x0130), top: B:121:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0100 A[Catch: all -> 0x0164, TryCatch #2 {all -> 0x0164, blocks: (B:65:0x00c7, B:73:0x00e1, B:75:0x00ec, B:77:0x0100, B:79:0x0106, B:83:0x0111, B:86:0x0119, B:88:0x011f, B:90:0x0125, B:94:0x0130), top: B:121:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0111 A[Catch: all -> 0x0164, TryCatch #2 {all -> 0x0164, blocks: (B:65:0x00c7, B:73:0x00e1, B:75:0x00ec, B:77:0x0100, B:79:0x0106, B:83:0x0111, B:86:0x0119, B:88:0x011f, B:90:0x0125, B:94:0x0130), top: B:121:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x0119 A[Catch: all -> 0x0164, TryCatch #2 {all -> 0x0164, blocks: (B:65:0x00c7, B:73:0x00e1, B:75:0x00ec, B:77:0x0100, B:79:0x0106, B:83:0x0111, B:86:0x0119, B:88:0x011f, B:90:0x0125, B:94:0x0130), top: B:121:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:88:0x011f A[Catch: all -> 0x0164, TryCatch #2 {all -> 0x0164, blocks: (B:65:0x00c7, B:73:0x00e1, B:75:0x00ec, B:77:0x0100, B:79:0x0106, B:83:0x0111, B:86:0x0119, B:88:0x011f, B:90:0x0125, B:94:0x0130), top: B:121:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0130 A[Catch: all -> 0x0164, TRY_LEAVE, TryCatch #2 {all -> 0x0164, blocks: (B:65:0x00c7, B:73:0x00e1, B:75:0x00ec, B:77:0x0100, B:79:0x0106, B:83:0x0111, B:86:0x0119, B:88:0x011f, B:90:0x0125, B:94:0x0130), top: B:121:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0136 A[PHI: r11
      0x0136: PHI (r11v9 java.lang.String) = (r11v4 java.lang.String), (r11v11 java.lang.String) binds: [B:87:0x011d, B:84:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0139  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.ContentResolver, android.database.Cursor] */
    private static Proxy b(Context context) {
        Cursor cursorQuery;
        ?? r10;
        String strL;
        String lowerCase;
        String strA;
        int iB;
        ?? r11;
        String lowerCase2;
        int iB2;
        boolean z;
        boolean z2;
        if (c(context)) {
            Uri uri = Uri.parse("content://telephony/carriers/preferapn");
            ?? contentResolver = context.getContentResolver();
            String strA2 = null;
            boolean z3 = false;
            ?? r17 = 80;
            r17 = 80;
            r17 = 80;
            r17 = 80;
            r17 = 80;
            try {
                try {
                    cursorQuery = contentResolver.query(uri, null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("apn"));
                                if (string != null) {
                                    lowerCase2 = string;
                                    r10 = uri;
                                    Locale locale = Locale.US;
                                    lowerCase2 = string.toLowerCase(locale);
                                    r10 = locale;
                                }
                                try {
                                    try {
                                        lowerCase2 = string;
                                        r10 = uri;
                                        if (lowerCase2 != null && lowerCase2.contains("ctwap")) {
                                            String strA3 = a();
                                            iB2 = b();
                                            if (TextUtils.isEmpty(strA3) || strA3.equals(Constants.NULL)) {
                                                strA2 = null;
                                                z2 = false;
                                            } else {
                                                strA2 = strA3;
                                                z2 = true;
                                            }
                                            if (!z2) {
                                                strA2 = a("QMTAuMC4wLjIwMA==");
                                            }
                                            if (iB2 != -1) {
                                                r17 = iB2;
                                            }
                                        } else if (lowerCase2 == null || !lowerCase2.contains("wap")) {
                                            strA2 = null;
                                            r17 = -1;
                                        } else {
                                            String strA4 = a();
                                            iB2 = b();
                                            if (TextUtils.isEmpty(strA4) || strA4.equals(Constants.NULL)) {
                                                strA2 = null;
                                                z = false;
                                            } else {
                                                strA2 = strA4;
                                                z = true;
                                            }
                                            if (!z) {
                                                strA2 = a("QMTAuMC4wLjE3Mg==");
                                            }
                                            if (iB2 != -1) {
                                                r17 = iB2;
                                            }
                                        }
                                    } catch (SecurityException e) {
                                        e = e;
                                        strA2 = null;
                                        jv.c(e, "pu", "ghp");
                                        strL = ip.l(context);
                                        if (strL != null) {
                                            lowerCase = strL.toLowerCase(Locale.US);
                                            strA = a();
                                            iB = b();
                                            if (lowerCase.indexOf("ctwap") != -1) {
                                                if (!TextUtils.isEmpty(strA) && !strA.equals(Constants.NULL)) {
                                                    strA2 = strA;
                                                    z3 = true;
                                                }
                                                if (!z3) {
                                                    strA2 = a("QMTAuMC4wLjIwMA==");
                                                }
                                                if (iB == -1) {
                                                    r17 = iB;
                                                }
                                            } else if (lowerCase.indexOf("wap") != -1) {
                                                if (!TextUtils.isEmpty(strA) && !strA.equals(Constants.NULL)) {
                                                    strA2 = strA;
                                                    z3 = true;
                                                }
                                                if (!z3) {
                                                    strA2 = a("QMTAuMC4wLjE3Mg==");
                                                }
                                            } else {
                                                r17 = iB;
                                            }
                                        } else {
                                            r17 = r10;
                                        }
                                        if (cursorQuery != null) {
                                            try {
                                                cursorQuery.close();
                                            } catch (Throwable th) {
                                                jv.c(th, "pu", "gPx2");
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        strA2 = null;
                                        jv.c(th, "pu", "gPx1");
                                        th.printStackTrace();
                                        r11 = r10;
                                        if (cursorQuery != null) {
                                            try {
                                                cursorQuery.close();
                                                r11 = r10;
                                            } catch (Throwable th3) {
                                                jv.c(th3, "pu", "gPx2");
                                                r11 = r10;
                                            }
                                        }
                                        if (strA2 != null) {
                                            try {
                                                if (strA2.length() > 0) {
                                                    return new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(strA2, r11));
                                                }
                                            } catch (Throwable th4) {
                                                js.a(th4, "pu", "gp2");
                                                th4.printStackTrace();
                                            }
                                        }
                                        return null;
                                    }
                                } catch (SecurityException e2) {
                                    e = e2;
                                    jv.c(e, "pu", "ghp");
                                    strL = ip.l(context);
                                    if (strL != null) {
                                        lowerCase = strL.toLowerCase(Locale.US);
                                        strA = a();
                                        iB = b();
                                        if (lowerCase.indexOf("ctwap") != -1) {
                                            if (!TextUtils.isEmpty(strA)) {
                                                strA2 = strA;
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                strA2 = a("QMTAuMC4wLjIwMA==");
                                            }
                                            if (iB == -1) {
                                                r17 = iB;
                                            }
                                        } else if (lowerCase.indexOf("wap") != -1) {
                                            if (!TextUtils.isEmpty(strA)) {
                                                strA2 = strA;
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                strA2 = a("QMTAuMC4wLjE3Mg==");
                                            }
                                        } else {
                                            r17 = iB;
                                        }
                                    } else {
                                        r17 = r10;
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    jv.c(th, "pu", "gPx1");
                                    th.printStackTrace();
                                    r11 = r10;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                        r11 = r10;
                                    }
                                    if (strA2 != null) {
                                        if (strA2.length() > 0) {
                                            return new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(strA2, r11));
                                        }
                                    }
                                    return null;
                                }
                            } else {
                                strA2 = null;
                                r17 = -1;
                            }
                        } catch (SecurityException e3) {
                            e = e3;
                            r10 = -1;
                        } catch (Throwable th6) {
                            th = th6;
                            r10 = -1;
                        }
                    } else {
                        strA2 = null;
                        r17 = -1;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th7) {
                    if (contentResolver != 0) {
                        try {
                            contentResolver.close();
                            throw th7;
                        } catch (Throwable th8) {
                            jv.c(th8, "pu", "gPx2");
                            throw th7;
                        }
                    }
                    throw th7;
                }
            } catch (SecurityException e4) {
                e = e4;
                cursorQuery = null;
                strA2 = null;
                r10 = -1;
            } catch (Throwable th9) {
                th = th9;
                cursorQuery = null;
                strA2 = null;
                r10 = -1;
            }
            r11 = r17;
            if (strA2 != null) {
                if (strA2.length() > 0 && r11 != -1) {
                    return new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(strA2, r11));
                }
            }
        }
        return null;
    }

    private static String a(String str) {
        return iy.c(str);
    }

    private static String a() {
        String defaultHost;
        try {
            defaultHost = android.net.Proxy.getDefaultHost();
        } catch (Throwable th) {
            jv.c(th, "pu", "gdh");
            defaultHost = null;
        }
        return defaultHost == null ? Constants.NULL : defaultHost;
    }

    private static Proxy a(Context context, URI uri) {
        Proxy proxy;
        if (c(context)) {
            try {
                List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
                if (listSelect == null || listSelect.isEmpty() || (proxy = listSelect.get(0)) == null || proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                return proxy;
            } catch (Throwable th) {
                jv.c(th, "pu", "gpsc");
            }
        }
        return null;
    }

    private static boolean c(Context context) {
        return ip.j(context) == 0;
    }

    private static int b() {
        try {
            return android.net.Proxy.getDefaultPort();
        } catch (Throwable th) {
            jv.c(th, "pu", "gdp");
            return -1;
        }
    }
}
