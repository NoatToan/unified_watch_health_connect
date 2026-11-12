package com.loc;

import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class ax {
    private static void a(ao aoVar, List<String> list) {
        if (aoVar != null) {
            try {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    aoVar.c(it2.next());
                }
                aoVar.close();
            } catch (Throwable th) {
                ab.b(th, "ofm", "dlo");
            }
        }
    }

    public static void a(aw awVar) {
        ao aoVar = null;
        try {
            if (awVar.f.c()) {
                awVar.f.a(true);
                ao aoVarA = ao.a(new File(awVar.a), awVar.b);
                try {
                    ArrayList arrayList = new ArrayList();
                    byte[] bArrA = a(aoVarA, awVar, arrayList);
                    if (bArrA != null && bArrA.length != 0) {
                        aa aaVar = new aa(bArrA, awVar.c);
                        aq.a();
                        JSONObject jSONObject = new JSONObject(new String(aq.b(aaVar)));
                        if (jSONObject.has("code") && jSONObject.getInt("code") == 1) {
                            bp bpVar = awVar.f;
                            if (bpVar != null) {
                                bpVar.a(bArrA.length);
                            }
                            if (awVar.f.b() < Integer.MAX_VALUE) {
                                a(aoVarA, arrayList);
                            } else {
                                try {
                                    aoVarA.d();
                                } catch (Throwable th) {
                                    ab.b(th, "ofm", "dlo");
                                }
                            }
                        } else {
                            aoVar = aoVarA;
                        }
                    }
                    if (aoVarA != null) {
                        try {
                            aoVarA.close();
                            return;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                            return;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    aoVar = aoVarA;
                    try {
                        ab.b(th, "leg", "uts");
                        if (aoVar != null) {
                            try {
                                return;
                            } catch (Throwable th4) {
                                return;
                            }
                        }
                        return;
                    } finally {
                        if (aoVar != null) {
                            try {
                                aoVar.close();
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                            }
                        }
                    }
                }
            }
            if (aoVar != null) {
                try {
                    aoVar.close();
                } catch (Throwable th6) {
                    th6.printStackTrace();
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public static void a(String str, byte[] bArr, aw awVar) throws Throwable {
        ao aoVarA;
        OutputStream outputStreamA = null;
        try {
            if (a(awVar.a, str)) {
                return;
            }
            File file = new File(awVar.a);
            if (!file.exists()) {
                file.mkdirs();
            }
            aoVarA = ao.a(file, awVar.b * ((long) awVar.d));
            try {
                aoVarA.a(awVar.d);
                byte[] bArrB = awVar.e.b(bArr);
                ao.a aVarB = aoVarA.b(str);
                outputStreamA = aVarB.a();
                outputStreamA.write(bArrB);
                aVarB.b();
                aoVarA.c();
                try {
                    outputStreamA.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    aoVarA.close();
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
            aoVarA = null;
        }
        if (outputStreamA != null) {
            try {
                outputStreamA.close();
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
        }
        if (aoVarA == null) {
            throw th;
        }
        try {
            aoVarA.close();
            throw th;
        } catch (Throwable th6) {
            th6.printStackTrace();
            throw th;
        }
    }

    private static boolean a(String str, String str2) {
        try {
            return new File(str, str2 + ".0").exists();
        } catch (Throwable th) {
            ab.b(th, "leg", "fet");
            return false;
        }
    }

    private static byte[] a(ao aoVar, aw awVar, List<String> list) {
        try {
            File fileB = aoVar.b();
            if (fileB != null && fileB.exists()) {
                int length = 0;
                for (String str : fileB.list()) {
                    if (str.contains(".0")) {
                        String str2 = str.split("\\.")[0];
                        byte[] bArrA = bc.a(aoVar, str2);
                        length += bArrA.length;
                        list.add(str2);
                        if (length > awVar.f.b()) {
                            break;
                        }
                        awVar.g.b(bArrA);
                    }
                }
                return awVar.g.a();
            }
        } catch (Throwable th) {
            ab.b(th, "leg", "gCo");
        }
        return new byte[0];
    }
}
