package com.loc;

import android.content.Context;
import android.database.Cursor;
import android.net.Proxy;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public final class s {
    private static String a() {
        String defaultHost;
        try {
            defaultHost = Proxy.getDefaultHost();
        } catch (Throwable th) {
            ab.b(th, "pu", "gdh");
            defaultHost = null;
        }
        return defaultHost == null ? "null" : defaultHost;
    }

    public static java.net.Proxy a(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 11 ? a(context, new URI("http://restapi.amap.com")) : b(context);
        } catch (Throwable th) {
            ab.b(th, "pu", "gp");
            return null;
        }
    }

    private static java.net.Proxy a(Context context, URI uri) {
        java.net.Proxy proxy;
        if (c(context)) {
            try {
                List<java.net.Proxy> listSelect = ProxySelector.getDefault().select(uri);
                if (listSelect == null || listSelect.isEmpty() || (proxy = listSelect.get(0)) == null || proxy.type() == java.net.Proxy.Type.DIRECT) {
                    return null;
                }
                return proxy;
            } catch (Throwable th) {
                ab.b(th, "pu", "gpsc");
            }
        }
        return null;
    }

    private static int b() {
        try {
            return Proxy.getDefaultPort();
        } catch (Throwable th) {
            ab.b(th, "pu", "gdp");
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013c A[PHI: r11
      0x013c: PHI (r11v11 java.lang.String) = (r11v6 java.lang.String), (r11v14 java.lang.String) binds: [B:90:0x0123, B:87:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x015d A[Catch: all -> 0x0159, TRY_LEAVE, TryCatch #10 {all -> 0x0159, blocks: (B:108:0x014e, B:115:0x015d), top: B:130:0x014e }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9 A[PHI: r11
      0x00a9: PHI (r11v31 java.lang.String) = (r11v27 java.lang.String), (r11v36 java.lang.String) binds: [B:48:0x00a7, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac A[PHI: r10 r11
      0x00ac: PHI (r10v11 int) = (r10v10 int), (r10v13 int) binds: [B:48:0x00a7, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r11v32 java.lang.String) = (r11v27 java.lang.String), (r11v36 java.lang.String) binds: [B:48:0x00a7, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0 A[Catch: all -> 0x0172, TryCatch #8 {all -> 0x0172, blocks: (B:66:0x00cb, B:75:0x00e5, B:77:0x00f0, B:79:0x0104, B:81:0x010a, B:86:0x0116, B:89:0x011f, B:91:0x0125, B:93:0x012b, B:98:0x0137), top: B:129:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0104 A[Catch: all -> 0x0172, TryCatch #8 {all -> 0x0172, blocks: (B:66:0x00cb, B:75:0x00e5, B:77:0x00f0, B:79:0x0104, B:81:0x010a, B:86:0x0116, B:89:0x011f, B:91:0x0125, B:93:0x012b, B:98:0x0137), top: B:129:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x010a A[Catch: all -> 0x0172, TryCatch #8 {all -> 0x0172, blocks: (B:66:0x00cb, B:75:0x00e5, B:77:0x00f0, B:79:0x0104, B:81:0x010a, B:86:0x0116, B:89:0x011f, B:91:0x0125, B:93:0x012b, B:98:0x0137), top: B:129:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x0116 A[Catch: all -> 0x0172, TryCatch #8 {all -> 0x0172, blocks: (B:66:0x00cb, B:75:0x00e5, B:77:0x00f0, B:79:0x0104, B:81:0x010a, B:86:0x0116, B:89:0x011f, B:91:0x0125, B:93:0x012b, B:98:0x0137), top: B:129:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x011c A[PHI: r11
      0x011c: PHI (r11v12 java.lang.String) = (r11v8 java.lang.String), (r11v9 java.lang.String), (r11v14 java.lang.String) binds: [B:97:0x0135, B:98:0x0137, B:87:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x011f A[Catch: all -> 0x0172, TryCatch #8 {all -> 0x0172, blocks: (B:66:0x00cb, B:75:0x00e5, B:77:0x00f0, B:79:0x0104, B:81:0x010a, B:86:0x0116, B:89:0x011f, B:91:0x0125, B:93:0x012b, B:98:0x0137), top: B:129:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0125 A[Catch: all -> 0x0172, TryCatch #8 {all -> 0x0172, blocks: (B:66:0x00cb, B:75:0x00e5, B:77:0x00f0, B:79:0x0104, B:81:0x010a, B:86:0x0116, B:89:0x011f, B:91:0x0125, B:93:0x012b, B:98:0x0137), top: B:129:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x012b A[Catch: all -> 0x0172, TryCatch #8 {all -> 0x0172, blocks: (B:66:0x00cb, B:75:0x00e5, B:77:0x00f0, B:79:0x0104, B:81:0x010a, B:86:0x0116, B:89:0x011f, B:91:0x0125, B:93:0x012b, B:98:0x0137), top: B:129:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0134  */
    /* JADX WARN: Code duplicated, block: B:98:0x0137 A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #8 {all -> 0x0172, blocks: (B:66:0x00cb, B:75:0x00e5, B:77:0x00f0, B:79:0x0104, B:81:0x010a, B:86:0x0116, B:89:0x011f, B:91:0x0125, B:93:0x012b, B:98:0x0137), top: B:129:0x0029 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.ContentResolver, android.database.Cursor] */
    private static java.net.Proxy b(Context context) {
        Cursor cursorQuery;
        ?? r10;
        String strS;
        ?? r18;
        Throwable th;
        String lowerCase;
        String strA;
        int iB;
        boolean z;
        boolean z2;
        ?? r11;
        String lowerCase2;
        int iB2;
        boolean z3;
        boolean z4;
        if (c(context)) {
            Uri uri = Uri.parse("content://telephony/carriers/preferapn");
            ?? contentResolver = context.getContentResolver();
            String strC = null;
            boolean z5 = false;
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
                                            String strA2 = a();
                                            iB2 = b();
                                            if (TextUtils.isEmpty(strA2) || strA2.equals("null")) {
                                                strC = null;
                                                z4 = false;
                                            } else {
                                                strC = strA2;
                                                z4 = true;
                                            }
                                            if (!z4) {
                                                strC = u.c("QMTAuMC4wLjIwMA==");
                                            }
                                            if (iB2 == -1) {
                                                r18 = 80;
                                            } else {
                                                r18 = iB2;
                                            }
                                        } else if (lowerCase2 == null || !lowerCase2.contains("wap")) {
                                            strC = null;
                                            r18 = -1;
                                        } else {
                                            String strA3 = a();
                                            iB2 = b();
                                            if (TextUtils.isEmpty(strA3) || strA3.equals("null")) {
                                                strC = null;
                                                z3 = false;
                                            } else {
                                                strC = strA3;
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                strC = u.c("QMTAuMC4wLjE3Mg==");
                                            }
                                            if (iB2 == -1) {
                                                r18 = 80;
                                            } else {
                                                r18 = iB2;
                                            }
                                        }
                                    } catch (SecurityException e) {
                                        e = e;
                                        strC = null;
                                        ab.b(e, "pu", "ghp");
                                        strS = n.s(context);
                                        if (strS != null) {
                                            lowerCase = strS.toLowerCase(Locale.US);
                                            strA = a();
                                            iB = b();
                                            if (lowerCase.indexOf("ctwap") != -1) {
                                                if (!TextUtils.isEmpty(strA) || strA.equals("null")) {
                                                    z2 = false;
                                                } else {
                                                    strC = strA;
                                                    z2 = true;
                                                }
                                                if (!z2) {
                                                    strC = u.c("QMTAuMC4wLjIwMA==");
                                                }
                                                if (iB == -1) {
                                                    r18 = 80;
                                                } else {
                                                    r18 = iB;
                                                }
                                            } else if (lowerCase.indexOf("wap") != -1) {
                                                if (!TextUtils.isEmpty(strA) || strA.equals("null")) {
                                                    z = false;
                                                } else {
                                                    strC = strA;
                                                    z = true;
                                                }
                                                if (!z) {
                                                    strC = u.c("QMTAuMC4wLjE3Mg==");
                                                }
                                                r18 = 80;
                                            } else {
                                                r18 = iB;
                                            }
                                        } else {
                                            r18 = r10;
                                        }
                                        if (cursorQuery != null) {
                                            try {
                                                cursorQuery.close();
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r18 = r18;
                                                ab.b(th, "pu", "gPx2");
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        strC = null;
                                        ab.b(th, "pu", "gPx1");
                                        th.printStackTrace();
                                        r11 = r10;
                                        if (cursorQuery != null) {
                                            try {
                                                cursorQuery.close();
                                                r11 = r10;
                                            } catch (Throwable th4) {
                                                ab.b(th4, "pu", "gPx2");
                                                r11 = r10;
                                            }
                                        }
                                        if (strC != null) {
                                            try {
                                                if (strC.length() > 0) {
                                                    z5 = true;
                                                }
                                            } catch (Throwable th5) {
                                                y.a(th5, "pu", "gp2");
                                                th5.printStackTrace();
                                            }
                                        }
                                        if (z5) {
                                            return new java.net.Proxy(java.net.Proxy.Type.HTTP, InetSocketAddress.createUnresolved(strC, r11));
                                        }
                                        return null;
                                    }
                                } catch (SecurityException e2) {
                                    e = e2;
                                    ab.b(e, "pu", "ghp");
                                    strS = n.s(context);
                                    if (strS != null) {
                                        lowerCase = strS.toLowerCase(Locale.US);
                                        strA = a();
                                        iB = b();
                                        if (lowerCase.indexOf("ctwap") != -1) {
                                            if (TextUtils.isEmpty(strA)) {
                                                z2 = false;
                                            } else {
                                                z2 = false;
                                            }
                                            if (!z2) {
                                                strC = u.c("QMTAuMC4wLjIwMA==");
                                            }
                                            if (iB == -1) {
                                                r18 = 80;
                                            } else {
                                                r18 = iB;
                                            }
                                        } else if (lowerCase.indexOf("wap") != -1) {
                                            if (TextUtils.isEmpty(strA)) {
                                                z = false;
                                            } else {
                                                z = false;
                                            }
                                            if (!z) {
                                                strC = u.c("QMTAuMC4wLjE3Mg==");
                                            }
                                            r18 = 80;
                                        } else {
                                            r18 = iB;
                                        }
                                    } else {
                                        r18 = r10;
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    ab.b(th, "pu", "gPx1");
                                    th.printStackTrace();
                                    r11 = r10;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                        r11 = r10;
                                    }
                                    if (strC != null) {
                                        if (strC.length() > 0) {
                                            z5 = true;
                                        }
                                    }
                                    if (z5) {
                                        return new java.net.Proxy(java.net.Proxy.Type.HTTP, InetSocketAddress.createUnresolved(strC, r11));
                                    }
                                    return null;
                                }
                            } else {
                                strC = null;
                                r18 = -1;
                            }
                        } catch (SecurityException e3) {
                            e = e3;
                            strC = null;
                            r10 = -1;
                            ab.b(e, "pu", "ghp");
                            strS = n.s(context);
                            if (strS != null) {
                                lowerCase = strS.toLowerCase(Locale.US);
                                strA = a();
                                iB = b();
                                if (lowerCase.indexOf("ctwap") != -1) {
                                    if (TextUtils.isEmpty(strA)) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        strC = u.c("QMTAuMC4wLjIwMA==");
                                    }
                                    if (iB == -1) {
                                        r18 = 80;
                                    } else {
                                        r18 = iB;
                                    }
                                } else if (lowerCase.indexOf("wap") != -1) {
                                    if (TextUtils.isEmpty(strA)) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (!z) {
                                        strC = u.c("QMTAuMC4wLjE3Mg==");
                                    }
                                    r18 = 80;
                                } else {
                                    r18 = iB;
                                }
                            } else {
                                r18 = r10;
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            r11 = r18;
                            if (strC != null) {
                                if (strC.length() > 0) {
                                    z5 = true;
                                }
                            }
                            if (z5) {
                                return new java.net.Proxy(java.net.Proxy.Type.HTTP, InetSocketAddress.createUnresolved(strC, r11));
                            }
                            return null;
                        } catch (Throwable th7) {
                            th = th7;
                            strC = null;
                            r10 = -1;
                            ab.b(th, "pu", "gPx1");
                            th.printStackTrace();
                            r11 = r10;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                                r11 = r10;
                            }
                            if (strC != null) {
                                if (strC.length() > 0) {
                                    z5 = true;
                                }
                            }
                            if (z5) {
                                return new java.net.Proxy(java.net.Proxy.Type.HTTP, InetSocketAddress.createUnresolved(strC, r11));
                            }
                            return null;
                        }
                    } else {
                        strC = null;
                        r18 = -1;
                    }
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th8) {
                            th = th8;
                            r18 = r18;
                            ab.b(th, "pu", "gPx2");
                        }
                    }
                } catch (Throwable th9) {
                    if (contentResolver == 0) {
                        throw th9;
                    }
                    try {
                        contentResolver.close();
                        throw th9;
                    } catch (Throwable th10) {
                        ab.b(th10, "pu", "gPx2");
                        throw th9;
                    }
                }
            } catch (SecurityException e4) {
                e = e4;
                cursorQuery = null;
                strC = null;
            } catch (Throwable th11) {
                th = th11;
                cursorQuery = null;
                strC = null;
            }
            r11 = r18;
            if (strC != null) {
                if (strC.length() > 0 && r11 != -1) {
                    z5 = true;
                }
            }
            if (z5) {
                return new java.net.Proxy(java.net.Proxy.Type.HTTP, InetSocketAddress.createUnresolved(strC, r11));
            }
        }
        return null;
    }

    private static boolean c(Context context) {
        return n.q(context) == 0;
    }
}
