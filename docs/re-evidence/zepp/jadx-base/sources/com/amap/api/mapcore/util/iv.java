package com.amap.api.mapcore.util;

import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class iv {
    public static void a(String str, byte[] bArr, iu iuVar) throws Throwable {
        ih ihVarA;
        OutputStream outputStreamA = null;
        try {
            if (a(iuVar.a, str)) {
                return;
            }
            File file = new File(iuVar.a);
            if (!file.exists()) {
                file.mkdirs();
            }
            ihVarA = ih.a(file, iuVar.b);
            try {
                ihVarA.a(iuVar.d);
                byte[] bArrB = iuVar.e.b(bArr);
                ih.a aVarB = ihVarA.b(str);
                outputStreamA = aVarB.a();
                outputStreamA.write(bArrB);
                aVarB.b();
                ihVarA.d();
                try {
                    outputStreamA.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    ihVarA.close();
                    return;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            ihVarA = null;
        }
        if (outputStreamA != null) {
            try {
                outputStreamA.close();
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
        }
        if (ihVarA == null) {
            throw th;
        }
        try {
            ihVarA.close();
            throw th;
        } catch (Throwable th6) {
            th6.printStackTrace();
            throw th;
        }
    }

    public static int a(iu iuVar) {
        ih ihVar = null;
        try {
            if (iuVar.f.d()) {
                iuVar.f.a_(true);
                ih ihVarA = ih.a(new File(iuVar.a), iuVar.b);
                try {
                    ArrayList arrayList = new ArrayList();
                    byte[] bArrA = a(ihVarA, iuVar, arrayList);
                    if (bArrA != null && bArrA.length != 0) {
                        hm hmVar = new hm(bArrA, iuVar.c);
                        ik.a();
                        JSONObject jSONObject = new JSONObject(new String(ik.b(hmVar).a));
                        if (jSONObject.has("code") && jSONObject.getInt("code") == 1) {
                            jo joVar = iuVar.f;
                            if (joVar != null) {
                                joVar.a_(bArrA.length);
                            }
                            if (iuVar.f.a() < Integer.MAX_VALUE) {
                                a(ihVarA, arrayList);
                            } else {
                                try {
                                    ihVarA.e();
                                } catch (Throwable th) {
                                    hn.c(th, "ofm", "dlo");
                                }
                            }
                            return bArrA.length;
                        }
                        ihVar = ihVarA;
                    }
                    if (ihVarA != null) {
                        try {
                            ihVarA.close();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    return -1;
                } catch (Throwable th3) {
                    th = th3;
                    ihVar = ihVarA;
                    try {
                        hn.c(th, "leg", "uts");
                        if (ihVar != null) {
                            ihVar.close();
                        }
                        return -1;
                    } catch (Throwable th4) {
                        if (ihVar != null) {
                            try {
                                ihVar.close();
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                            }
                        }
                        throw th4;
                    }
                }
            }
            if (ihVar != null) {
                ihVar.close();
            }
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        return -1;
    }

    private static byte[] a(ih ihVar, iu iuVar, List<String> list) {
        try {
            File fileB = ihVar.b();
            if (fileB != null && fileB.exists()) {
                int length = 0;
                for (String str : fileB.list()) {
                    if (str.contains(".0")) {
                        String str2 = str.split("\\.")[0];
                        byte[] bArrA = jb.a(ihVar, str2);
                        length += bArrA.length;
                        list.add(str2);
                        if (length > iuVar.f.a()) {
                            break;
                        }
                        iuVar.g.b(bArrA);
                    }
                }
                if (length <= 0) {
                    return null;
                }
                return iuVar.g.a();
            }
        } catch (Throwable th) {
            hn.c(th, "leg", "gCo");
        }
        return new byte[0];
    }

    private static void a(ih ihVar, List<String> list) {
        if (ihVar != null) {
            try {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    ihVar.c(it2.next());
                }
                ihVar.close();
            } catch (Throwable th) {
                hn.c(th, "ofm", "dlo");
            }
        }
    }

    private static boolean a(String str, String str2) {
        try {
            return new File(str, str2 + ".0").exists();
        } catch (Throwable th) {
            hn.c(th, "leg", "fet");
            return false;
        }
    }
}
