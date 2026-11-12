package com.amap.api.col.p0003sl;

import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class le {
    public static void a(String str, byte[] bArr, ld ldVar) throws Throwable {
        kq kqVarA;
        OutputStream outputStream = null;
        try {
            if (a(ldVar.f3040a, str)) {
                return;
            }
            File file = new File(ldVar.f3040a);
            if (!file.exists()) {
                file.mkdirs();
            }
            kqVarA = kq.a(file, ldVar.f3041b);
            try {
                kqVarA.a(ldVar.d);
                byte[] bArrB = ldVar.e.b(bArr);
                kq.a aVarB = kqVarA.b(str);
                OutputStream outputStreamA = aVarB.a();
                try {
                    outputStreamA.write(bArrB);
                    aVarB.b();
                    kqVarA.c();
                    if (outputStreamA != null) {
                        try {
                            outputStreamA.close();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    try {
                        kqVarA.close();
                        return;
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = outputStreamA;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            kqVarA = null;
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        }
        if (kqVarA != null) {
            try {
                kqVarA.close();
                throw th;
            } catch (Throwable th7) {
                th7.printStackTrace();
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x008e A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r2
      0x008e: PHI (r2v1 com.amap.api.col.3sl.kq) = (r2v2 com.amap.api.col.3sl.kq), (r2v3 com.amap.api.col.3sl.kq) binds: [B:44:0x009e, B:37:0x008c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static int a(ld ldVar) {
        kq kqVar = null;
        if (ldVar.f.d()) {
            ldVar.f.a_(true);
            kq kqVarA = kq.a(new File(ldVar.f3040a), ldVar.f3041b);
            try {
                ArrayList arrayList = new ArrayList();
                byte[] bArrA = a(kqVarA, ldVar, arrayList);
                if (bArrA != null && bArrA.length != 0) {
                    ju juVar = new ju(bArrA, ldVar.f3042c);
                    kt.a();
                    JSONObject jSONObject = new JSONObject(new String(kt.a(juVar).f3037a));
                    if (jSONObject.has("code") && jSONObject.getInt("code") == 1) {
                        if (ldVar.f != null && bArrA != null) {
                            ldVar.f.a_(bArrA.length);
                        }
                        if (ldVar.f.a() < Integer.MAX_VALUE) {
                            a(kqVarA, arrayList);
                        } else {
                            try {
                                kqVarA.d();
                            } catch (Throwable th) {
                                jv.c(th, "ofm", "dlo");
                            }
                        }
                        return bArrA.length;
                    }
                    kqVar = kqVarA;
                }
                try {
                    kqVarA.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                return -1;
            } catch (Throwable th3) {
                th = th3;
                kqVar = kqVarA;
                try {
                    jv.c(th, "leg", "uts");
                    return -1;
                } finally {
                    if (kqVar != null) {
                        try {
                            kqVar.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                }
            }
        }
        if (kqVar != null) {
        }
        return -1;
    }

    private static byte[] a(kq kqVar, ld ldVar, List<String> list) {
        try {
            File fileB = kqVar.b();
            if (fileB != null && fileB.exists()) {
                int length = 0;
                for (String str : fileB.list()) {
                    if (str.contains(".0")) {
                        String str2 = str.split("\\.")[0];
                        byte[] bArrA = lk.a(kqVar, str2);
                        length += bArrA.length;
                        list.add(str2);
                        if (length > ldVar.f.a()) {
                            break;
                        }
                        ldVar.g.b(bArrA);
                    }
                }
                if (length <= 0) {
                    return null;
                }
                return ldVar.g.a();
            }
        } catch (Throwable th) {
            jv.c(th, "leg", "gCo");
        }
        return new byte[0];
    }

    private static void a(kq kqVar, List<String> list) {
        if (kqVar != null) {
            try {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    kqVar.c(it.next());
                }
                kqVar.close();
            } catch (Throwable th) {
                jv.c(th, "ofm", "dlo");
            }
        }
    }

    private static boolean a(String str, String str2) {
        try {
            return new File(str, str2 + ".0").exists();
        } catch (Throwable th) {
            jv.c(th, "leg", "fet");
            return false;
        }
    }
}
