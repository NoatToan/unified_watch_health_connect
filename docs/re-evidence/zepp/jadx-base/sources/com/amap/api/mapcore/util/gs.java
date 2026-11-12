package com.amap.api.mapcore.util;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class gs {
    public static Proxy a(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 11 ? a(context, new URI("http://restsdk.amap.com")) : b(context);
        } catch (Throwable th) {
            hn.c(th, "pu", "gp");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0151 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x015a A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #9 {all -> 0x0156, blocks: (B:107:0x014b, B:114:0x015a), top: B:129:0x014b }] */
    /* JADX WARN: Code duplicated, block: B:126:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[PHI: r11
      0x0077: PHI (r11v29 java.lang.String) = (r11v24 java.lang.String), (r11v33 java.lang.String) binds: [B:49:0x00ac, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[PHI: r10 r11
      0x007a: PHI (r10v11 int) = (r10v10 int), (r10v13 int) binds: [B:49:0x00ac, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r11v28 java.lang.String) = (r11v24 java.lang.String), (r11v33 java.lang.String) binds: [B:49:0x00ac, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0 A[Catch: all -> 0x016f, TryCatch #3 {all -> 0x016f, blocks: (B:65:0x00cb, B:74:0x00e5, B:76:0x00f0, B:78:0x0104, B:80:0x010a, B:85:0x0116, B:88:0x011d, B:90:0x0123, B:92:0x0129, B:97:0x0135), top: B:128:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0104 A[Catch: all -> 0x016f, TryCatch #3 {all -> 0x016f, blocks: (B:65:0x00cb, B:74:0x00e5, B:76:0x00f0, B:78:0x0104, B:80:0x010a, B:85:0x0116, B:88:0x011d, B:90:0x0123, B:92:0x0129, B:97:0x0135), top: B:128:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x010a A[Catch: all -> 0x016f, TryCatch #3 {all -> 0x016f, blocks: (B:65:0x00cb, B:74:0x00e5, B:76:0x00f0, B:78:0x0104, B:80:0x010a, B:85:0x0116, B:88:0x011d, B:90:0x0123, B:92:0x0129, B:97:0x0135), top: B:128:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0113  */
    /* JADX WARN: Code duplicated, block: B:85:0x0116 A[Catch: all -> 0x016f, TryCatch #3 {all -> 0x016f, blocks: (B:65:0x00cb, B:74:0x00e5, B:76:0x00f0, B:78:0x0104, B:80:0x010a, B:85:0x0116, B:88:0x011d, B:90:0x0123, B:92:0x0129, B:97:0x0135), top: B:128:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x011c  */
    /* JADX WARN: Code duplicated, block: B:88:0x011d A[Catch: all -> 0x016f, TryCatch #3 {all -> 0x016f, blocks: (B:65:0x00cb, B:74:0x00e5, B:76:0x00f0, B:78:0x0104, B:80:0x010a, B:85:0x0116, B:88:0x011d, B:90:0x0123, B:92:0x0129, B:97:0x0135), top: B:128:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0123 A[Catch: all -> 0x016f, TryCatch #3 {all -> 0x016f, blocks: (B:65:0x00cb, B:74:0x00e5, B:76:0x00f0, B:78:0x0104, B:80:0x010a, B:85:0x0116, B:88:0x011d, B:90:0x0123, B:92:0x0129, B:97:0x0135), top: B:128:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0129 A[Catch: all -> 0x016f, TryCatch #3 {all -> 0x016f, blocks: (B:65:0x00cb, B:74:0x00e5, B:76:0x00f0, B:78:0x0104, B:80:0x010a, B:85:0x0116, B:88:0x011d, B:90:0x0123, B:92:0x0129, B:97:0x0135), top: B:128:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135 A[Catch: all -> 0x016f, TRY_LEAVE, TryCatch #3 {all -> 0x016f, blocks: (B:65:0x00cb, B:74:0x00e5, B:76:0x00f0, B:78:0x0104, B:80:0x010a, B:85:0x0116, B:88:0x011d, B:90:0x0123, B:92:0x0129, B:97:0x0135), top: B:128:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x013c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.ContentResolver, android.database.Cursor] */
    private static Proxy b(Context context) {
        Cursor cursorQuery;
        ?? r10;
        String strQ;
        ?? B;
        ?? r11;
        String lowerCase;
        String strA;
        boolean z;
        boolean z2;
        String lowerCase2;
        int iB;
        boolean z3;
        int i;
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
                                            iB = b();
                                            if (TextUtils.isEmpty(strA2) || strA2.equals("null")) {
                                                strC = null;
                                                z4 = false;
                                            } else {
                                                strC = strA2;
                                                z4 = true;
                                            }
                                            if (!z4) {
                                                strC = gu.c("QMTAuMC4wLjIwMA==");
                                            }
                                            if (iB == -1) {
                                                i = 80;
                                            } else {
                                                i = iB;
                                            }
                                        } else if (lowerCase2 == null || !lowerCase2.contains("wap")) {
                                            strC = null;
                                            i = -1;
                                        } else {
                                            String strA3 = a();
                                            iB = b();
                                            if (TextUtils.isEmpty(strA3) || strA3.equals("null")) {
                                                strC = null;
                                                z3 = false;
                                            } else {
                                                strC = strA3;
                                                z3 = true;
                                            }
                                            if (!z3) {
                                                strC = gu.c("QMTAuMC4wLjE3Mg==");
                                            }
                                            if (iB == -1) {
                                                i = 80;
                                            } else {
                                                i = iB;
                                            }
                                        }
                                    } catch (SecurityException e) {
                                        e = e;
                                        hn.c(e, "pu", "ghp");
                                        strQ = gn.q(context);
                                        if (strQ != null) {
                                            lowerCase = strQ.toLowerCase(Locale.US);
                                            strA = a();
                                            B = b();
                                            if (lowerCase.indexOf("ctwap") != -1) {
                                                if (!TextUtils.isEmpty(strA) || strA.equals("null")) {
                                                    z2 = false;
                                                } else {
                                                    strC = strA;
                                                    z2 = true;
                                                }
                                                if (!z2) {
                                                    strC = gu.c("QMTAuMC4wLjIwMA==");
                                                }
                                                if (B == -1) {
                                                    B = 80;
                                                }
                                            } else if (lowerCase.indexOf("wap") != -1) {
                                                if (!TextUtils.isEmpty(strA) || strA.equals("null")) {
                                                    z = false;
                                                } else {
                                                    strC = strA;
                                                    z = true;
                                                }
                                                if (!z) {
                                                    strC = gu.c("QMTAuMC4wLjE3Mg==");
                                                }
                                                B = 80;
                                            }
                                        } else {
                                            B = r10;
                                        }
                                        if (cursorQuery != null) {
                                            try {
                                                cursorQuery.close();
                                            } catch (Throwable th) {
                                                hn.c(th, "pu", "gPx2");
                                            }
                                        }
                                        r11 = B;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        hn.c(th, "pu", "gPx1");
                                        th.printStackTrace();
                                        r11 = r10;
                                        if (cursorQuery != null) {
                                            try {
                                                cursorQuery.close();
                                                r11 = r10;
                                            } catch (Throwable th3) {
                                                hn.c(th3, "pu", "gPx2");
                                                r11 = r10;
                                            }
                                        }
                                    }
                                } catch (SecurityException e2) {
                                    e = e2;
                                    strC = null;
                                    hn.c(e, "pu", "ghp");
                                    strQ = gn.q(context);
                                    if (strQ != null) {
                                        lowerCase = strQ.toLowerCase(Locale.US);
                                        strA = a();
                                        B = b();
                                        if (lowerCase.indexOf("ctwap") != -1) {
                                            if (TextUtils.isEmpty(strA)) {
                                                z2 = false;
                                            } else {
                                                z2 = false;
                                            }
                                            if (!z2) {
                                                strC = gu.c("QMTAuMC4wLjIwMA==");
                                            }
                                            if (B == -1) {
                                                B = 80;
                                            }
                                        } else if (lowerCase.indexOf("wap") != -1) {
                                            if (TextUtils.isEmpty(strA)) {
                                                z = false;
                                            } else {
                                                z = false;
                                            }
                                            if (!z) {
                                                strC = gu.c("QMTAuMC4wLjE3Mg==");
                                            }
                                            B = 80;
                                        }
                                    } else {
                                        B = r10;
                                    }
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    r11 = B;
                                } catch (Throwable th4) {
                                    th = th4;
                                    strC = null;
                                    hn.c(th, "pu", "gPx1");
                                    th.printStackTrace();
                                    r11 = r10;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                        r11 = r10;
                                    }
                                }
                            } else {
                                strC = null;
                                i = -1;
                            }
                        } catch (SecurityException e3) {
                            e = e3;
                            strC = null;
                            r10 = -1;
                            hn.c(e, "pu", "ghp");
                            strQ = gn.q(context);
                            if (strQ != null) {
                                lowerCase = strQ.toLowerCase(Locale.US);
                                strA = a();
                                B = b();
                                if (lowerCase.indexOf("ctwap") != -1) {
                                    if (TextUtils.isEmpty(strA)) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        strC = gu.c("QMTAuMC4wLjIwMA==");
                                    }
                                    if (B == -1) {
                                        B = 80;
                                    }
                                } else if (lowerCase.indexOf("wap") != -1) {
                                    if (TextUtils.isEmpty(strA)) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (!z) {
                                        strC = gu.c("QMTAuMC4wLjE3Mg==");
                                    }
                                    B = 80;
                                }
                            } else {
                                B = r10;
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            r11 = B;
                            if (strC != null) {
                                try {
                                    if (strC.length() > 0) {
                                        z5 = true;
                                    }
                                } catch (Throwable th5) {
                                    hk.a(th5, "pu", "gp2");
                                    th5.printStackTrace();
                                }
                            }
                            if (z5) {
                                return new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(strC, r11));
                            }
                            return null;
                        } catch (Throwable th6) {
                            th = th6;
                            strC = null;
                            r10 = -1;
                            hn.c(th, "pu", "gPx1");
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
                                return new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(strC, r11));
                            }
                            return null;
                        }
                    } else {
                        strC = null;
                        i = -1;
                    }
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th7) {
                            hn.c(th7, "pu", "gPx2");
                        }
                    }
                    r11 = i;
                } catch (Throwable th8) {
                    if (contentResolver == 0) {
                        throw th8;
                    }
                    try {
                        contentResolver.close();
                        throw th8;
                    } catch (Throwable th9) {
                        hn.c(th9, "pu", "gPx2");
                        throw th8;
                    }
                }
            } catch (SecurityException e4) {
                e = e4;
                cursorQuery = null;
                strC = null;
            } catch (Throwable th10) {
                th = th10;
                cursorQuery = null;
                strC = null;
            }
            if (strC != null) {
                if (strC.length() > 0 && r11 != -1) {
                    z5 = true;
                }
            }
            if (z5) {
                return new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(strC, r11));
            }
        }
        return null;
    }

    private static boolean c(Context context) {
        return gn.p(context) == 0;
    }

    private static String a() {
        String defaultHost;
        try {
            defaultHost = android.net.Proxy.getDefaultHost();
        } catch (Throwable th) {
            hn.c(th, "pu", "gdh");
            defaultHost = null;
        }
        return defaultHost == null ? "null" : defaultHost;
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
                hn.c(th, "pu", "gpsc");
            }
        }
        return null;
    }

    private static int b() {
        try {
            return android.net.Proxy.getDefaultPort();
        } catch (Throwable th) {
            hn.c(th, "pu", "gdp");
            return -1;
        }
    }
}
