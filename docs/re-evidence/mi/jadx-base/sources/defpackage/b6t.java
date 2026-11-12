package defpackage;

import com.amap.api.col.p0003sl.b1;
import com.amap.api.col.p0003sl.z0;
import com.xiaomi.onetrack.util.z;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class b6t {
    public static int a(z5t z5tVar) {
        q4t q4tVar = null;
        try {
            if (z5tVar.f.e()) {
                z5tVar.f.c(true);
                q4t q4tVarC = q4t.c(new File(z5tVar.f40930a), z5tVar.f40931b);
                try {
                    ArrayList arrayList = new ArrayList();
                    byte[] bArrE = e(q4tVarC, z5tVar, arrayList);
                    if (bArrE != null && bArrE.length != 0) {
                        z0 z0Var = new z0(bArrE, z5tVar.c);
                        b1.b();
                        JSONObject jSONObject = new JSONObject(new String(b1.d(z0Var).f36513a));
                        if (jSONObject.has("code") && jSONObject.getInt("code") == 1) {
                            v6t v6tVar = z5tVar.f;
                            if (v6tVar != null) {
                                v6tVar.b(bArrE.length);
                            }
                            if (z5tVar.f.a() < Integer.MAX_VALUE) {
                                c(q4tVarC, arrayList);
                            } else {
                                try {
                                    q4tVarC.P();
                                } catch (Throwable th) {
                                    m2t.r(th, "ofm", "dlo");
                                }
                            }
                            return bArrE.length;
                        }
                        q4tVar = q4tVarC;
                    }
                    try {
                        q4tVarC.close();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    return -1;
                } catch (Throwable th3) {
                    th = th3;
                    q4tVar = q4tVarC;
                    try {
                        m2t.r(th, "leg", "uts");
                        if (q4tVar != null) {
                            q4tVar.close();
                        }
                        return -1;
                    } catch (Throwable th4) {
                        if (q4tVar != null) {
                            try {
                                q4tVar.close();
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                            }
                        }
                        throw th4;
                    }
                }
            }
            if (q4tVar != null) {
                q4tVar.close();
            }
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        return -1;
    }

    public static void b(String str, byte[] bArr, z5t z5tVar) throws Throwable {
        q4t q4tVarC;
        OutputStream outputStreamA = null;
        try {
            if (d(z5tVar.f40930a, str)) {
                return;
            }
            File file = new File(z5tVar.f40930a);
            if (!file.exists()) {
                file.mkdirs();
            }
            q4tVarC = q4t.c(file, z5tVar.f40931b);
            try {
                q4tVarC.l(z5tVar.d);
                byte[] bArrB = z5tVar.e.b(bArr);
                q4t.d dVarD = q4tVarC.D(str);
                outputStreamA = dVarD.a();
                outputStreamA.write(bArrB);
                dVarD.c();
                q4tVarC.K();
                try {
                    outputStreamA.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    q4tVarC.close();
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
            q4tVarC = null;
        }
        if (outputStreamA != null) {
            try {
                outputStreamA.close();
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
        }
        if (q4tVarC == null) {
            throw th;
        }
        try {
            q4tVarC.close();
            throw th;
        } catch (Throwable th6) {
            th6.printStackTrace();
            throw th;
        }
    }

    public static void c(q4t q4tVar, List<String> list) {
        if (q4tVar != null) {
            try {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    q4tVar.M(it.next());
                }
                q4tVar.close();
            } catch (Throwable th) {
                m2t.r(th, "ofm", "dlo");
            }
        }
    }

    public static boolean d(String str, String str2) {
        try {
            return new File(str, str2 + ".0").exists();
        } catch (Throwable th) {
            m2t.r(th, "leg", "fet");
            return false;
        }
    }

    public static byte[] e(q4t q4tVar, z5t z5tVar, List<String> list) {
        try {
            File fileY = q4tVar.y();
            if (fileY != null && fileY.exists()) {
                int length = 0;
                for (String str : fileY.list()) {
                    if (str.contains(".0")) {
                        String str2 = str.split(z.f14007a)[0];
                        byte[] bArrG = h6t.g(q4tVar, str2);
                        length += bArrG.length;
                        list.add(str2);
                        if (length > z5tVar.f.a()) {
                            break;
                        }
                        z5tVar.g.c(bArrG);
                    }
                }
                if (length <= 0) {
                    return null;
                }
                return z5tVar.g.a();
            }
        } catch (Throwable th) {
            m2t.r(th, "leg", "gCo");
        }
        return new byte[0];
    }
}
