package defpackage;

import android.content.Context;
import android.os.Build;
import com.amap.api.col.p0003sl.ik;
import com.amap.api.col.p0003sl.j1;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class o2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference<z5t> f28683a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f28684b = true;
    public static WeakReference<v6t> c = null;
    public static WeakReference<v6t> d = null;
    public static String[] e = new String[10];
    public static int f = 0;
    public static boolean g = false;
    public static int h;
    public static o0t i;

    public class a extends f7t {
        public final /* synthetic */ Context d;
        public final /* synthetic */ o0t e;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ z5t i;

        public a(Context context, o0t o0tVar, String str, String str2, z5t z5tVar) {
            this.d = context;
            this.e = o0tVar;
            this.g = str;
            this.h = str2;
            this.i = z5tVar;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            String strB = o2t.b(this.d, this.e, this.g, this.h);
            z5t z5tVar = this.i;
            if (z5tVar.e == null) {
                z5tVar.e = new k4t(new l4t(new n4t(new o4t())));
            }
            try {
                b6t.b(m0t.e(strB), p0t.n(strB), this.i);
            } catch (Throwable unused) {
            }
        }
    }

    public class b extends f7t {
        public final /* synthetic */ Context d;
        public final /* synthetic */ String e;
        public final /* synthetic */ v6t g;

        public b(Context context, String str, v6t v6tVar) {
            this.d = context;
            this.e = str;
            this.g = v6tVar;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            try {
                synchronized (o2t.class) {
                    try {
                        z5t z5tVarE = h6t.e(o2t.f28683a);
                        h6t.f(this.d, z5tVarE, this.e, 1000, 4096000, "1");
                        z5tVarE.f = this.g;
                        if (z5tVarE.g == null) {
                            z5tVarE.g = new l6t(new k6t(this.d, new p6t(), new l4t(new n4t(new o4t())), "QImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJhZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMi", e0t.k(this.d), h0t.N(), h0t.W(this.d), e0t.g(this.d), Build.MODEL, e0t.e(this.d), e0t.i(this.d), Build.VERSION.RELEASE));
                        }
                        z5tVarE.h = 3600000;
                        b6t.a(z5tVarE);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                m2t.r(th2, "lg", "pul");
            }
        }
    }

    public class c extends f7t {
        public final /* synthetic */ z5t d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ d g;

        public c(z5t z5tVar, Context context, d dVar) {
            this.d = z5tVar;
            this.e = context;
            this.g = dVar;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            try {
                synchronized (o2t.class) {
                    try {
                        z5t z5tVar = this.d;
                        if (z5tVar.g == null) {
                            z5tVar.g = new l6t(new k6t(this.e, new p6t(), new l4t(new n4t(new o4t())), "QImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJhZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMi", e0t.k(this.e), h0t.N(), h0t.W(this.e), e0t.g(this.e), Build.MODEL, e0t.e(this.e), e0t.i(this.e), Build.VERSION.RELEASE));
                        }
                        int iA = b6t.a(this.d);
                        d dVar = this.g;
                        if (dVar != null) {
                            dVar.a(iA);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                m2t.r(th2, "lg", "pul");
            }
        }
    }

    public interface d {
        void a(int i);
    }

    public static o0t a(String str) {
        List<o0t> listB = k2t.b();
        if (listB == null) {
            listB = new ArrayList();
        }
        if (str != null && !"".equals(str)) {
            for (o0t o0tVar : listB) {
                if (k2t.f(o0tVar.i(), str)) {
                    return o0tVar;
                }
            }
            if (str.contains("com.amap.api.col")) {
                try {
                    return p0t.a();
                } catch (ik e2) {
                    e2.printStackTrace();
                }
            }
            if (str.contains("com.amap.co") || str.contains("com.amap.opensdk.co") || str.contains("com.amap.location")) {
                try {
                    o0t o0tVarO = p0t.o();
                    o0tVarO.c(true);
                    return o0tVarO;
                } catch (ik e3) {
                    e3.printStackTrace();
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String b(Context context, o0t o0tVar, String str, String str2) {
        String strA = h6t.a();
        String strB = h6t.b(context, o0tVar);
        e0t.a(context);
        return h6t.d(strB, strA, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104 A[RETURN] */
    public static String c(List<o0t> list) {
        r4t r4tVar;
        FileInputStream fileInputStream;
        try {
            try {
                File file = new File("/data/anr/traces.txt");
                if (!file.exists()) {
                    return null;
                }
                fileInputStream = new FileInputStream(file);
                try {
                    int iAvailable = fileInputStream.available();
                    if (iAvailable > 1024000) {
                        fileInputStream.skip(iAvailable - 1024000);
                    }
                    r4tVar = new r4t(fileInputStream, q4t.p);
                    boolean z = false;
                    while (true) {
                        try {
                            String strTrim = r4tVar.a().trim();
                            if (strTrim.contains("pid")) {
                                while (!strTrim.startsWith("\"main\"")) {
                                    strTrim = r4tVar.a();
                                }
                                z = true;
                            }
                            if (strTrim.equals("") && z) {
                                break;
                            }
                            if (z) {
                                try {
                                    if (f > 9) {
                                        f = 0;
                                    }
                                    String[] strArr = e;
                                    int i2 = f;
                                    strArr[i2] = strTrim;
                                    f = i2 + 1;
                                } catch (Throwable th) {
                                    m2t.r(th, "alg", "aDa");
                                }
                                int i3 = h;
                                if (i3 == 5) {
                                    break;
                                }
                                if (!g) {
                                    for (o0t o0tVar : list) {
                                        boolean zH = k2t.h(o0tVar.i(), strTrim);
                                        g = zH;
                                        if (zH) {
                                            i = o0tVar;
                                            break;
                                        }
                                    }
                                } else {
                                    h = i3 + 1;
                                }
                            }
                        } catch (EOFException unused) {
                            break;
                        } catch (FileNotFoundException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                m2t.r(th, "alg", "getA");
                                if (r4tVar != null) {
                                    try {
                                        r4tVar.close();
                                    } catch (Throwable th3) {
                                        m2t.r(th3, "alg", "getA");
                                    }
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (g) {
                                    return n();
                                }
                                return null;
                            } catch (Throwable th4) {
                                if (r4tVar != null) {
                                    try {
                                        r4tVar.close();
                                    } catch (Throwable th5) {
                                        m2t.r(th5, "alg", "getA");
                                    }
                                }
                                if (fileInputStream == null) {
                                    throw th4;
                                }
                                try {
                                    fileInputStream.close();
                                    throw th4;
                                } catch (Throwable th6) {
                                    m2t.r(th6, "alg", "getA");
                                    throw th4;
                                }
                            }
                        }
                    }
                    try {
                        r4tVar.close();
                    } catch (Throwable th7) {
                        m2t.r(th7, "alg", "getA");
                    }
                    fileInputStream.close();
                } catch (FileNotFoundException unused3) {
                    r4tVar = null;
                } catch (Throwable th8) {
                    th = th8;
                    r4tVar = null;
                }
                if (g) {
                    return n();
                }
                return null;
            } catch (Throwable th9) {
                m2t.r(th9, "alg", "getA");
            }
        } catch (FileNotFoundException unused4) {
            r4tVar = null;
            fileInputStream = null;
        } catch (Throwable th10) {
            th = th10;
            r4tVar = null;
            fileInputStream = null;
        }
        if (r4tVar != null) {
            try {
                r4tVar.close();
            } catch (Throwable th11) {
                m2t.r(th11, "alg", "getA");
            }
        }
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        if (g) {
            return n();
        }
        return null;
    }

    public static void e(Context context) {
        String strC;
        o0t o0tVar;
        List<o0t> listB = k2t.b();
        if (listB == null || listB.size() == 0 || (strC = c(listB)) == null || "".equals(strC) || (o0tVar = i) == null) {
            return;
        }
        f(context, o0tVar, 2, "ANR", strC);
    }

    public static void f(Context context, o0t o0tVar, int i2, String str, String str2) {
        String str3;
        String strA = h6t.a();
        String strB = h6t.b(context, o0tVar);
        e0t.a(context);
        String strC = h6t.c(strB, strA, i2, str, str2);
        if (strC == null || "".equals(strC)) {
            return;
        }
        String strE = m0t.e(str2);
        if (i2 == 1) {
            str3 = k2t.f23370b;
        } else if (i2 == 2) {
            str3 = k2t.d;
        } else if (i2 != 0) {
            return;
        } else {
            str3 = k2t.c;
        }
        String str4 = str3;
        z5t z5tVarE = h6t.e(f28683a);
        h6t.f(context, z5tVarE, str4, 1000, 4096000, "1");
        if (z5tVarE.e == null) {
            z5tVarE.e = new k4t(new l4t(new n4t(new o4t())));
        }
        try {
            b6t.b(strE, p0t.n(strC.replaceAll("\n", "<br/>")), z5tVarE);
        } catch (Throwable unused) {
        }
    }

    public static void g(Context context, o0t o0tVar, String str, int i2, String str2, String str3) {
        if (str2 == null || "".equals(str2)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("class:");
        sb.append(str2);
        if (str3 != null) {
            sb.append(" method:");
            sb.append(str3);
            sb.append("$<br/>");
        }
        sb.append(str);
        f(context, o0tVar, i2, str2, sb.toString());
    }

    public static void h(Context context, o0t o0tVar, String str, z5t z5tVar, String str2) {
        try {
            j1.h().b(new a(context, o0tVar, str, str2, z5tVar));
        } catch (Throwable unused) {
        }
    }

    public static void i(Context context, Throwable th, int i2, String str, String str2) {
        String strE = p0t.e(th);
        o0t o0tVarA = a(strE);
        if (m(o0tVarA)) {
            String strReplaceAll = strE.replaceAll("\n", "<br/>");
            String string = th.toString();
            if (string == null || "".equals(string)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (str != null) {
                sb.append("class:");
                sb.append(str);
            }
            if (str2 != null) {
                sb.append(" method:");
                sb.append(str2);
                sb.append("$<br/>");
            }
            sb.append(strReplaceAll);
            f(context, o0tVarA, i2, string, sb.toString());
        }
    }

    public static void j(Context context, z5t z5tVar, d dVar) {
        try {
            j1.h().b(new c(z5tVar, context, dVar));
        } catch (Throwable unused) {
        }
    }

    public static void k(Context context, v6t v6tVar, String str) {
        j1.h().b(new b(context, str, v6tVar));
    }

    public static void l(o0t o0tVar, Context context, String str, String str2) {
        if (!m(o0tVar) || str == null || "".equals(str)) {
            return;
        }
        f(context, o0tVar, 1, str, str2);
    }

    public static boolean m(o0t o0tVar) {
        return o0tVar != null && o0tVar.h();
    }

    public static String n() {
        StringBuilder sb = new StringBuilder();
        try {
            for (int i2 = f; i2 < 10 && i2 <= 9; i2++) {
                sb.append(e[i2]);
            }
            for (int i3 = 0; i3 < f; i3++) {
                sb.append(e[i3]);
            }
        } catch (Throwable th) {
            m2t.r(th, "alg", "gLI");
        }
        return sb.toString();
    }

    public static void o(Context context) {
        t6t t6tVar = new t6t(f28684b);
        f28684b = false;
        k(context, t6tVar, k2t.c);
    }

    public static void p(Context context) {
        WeakReference<v6t> weakReference = c;
        if (weakReference == null || weakReference.get() == null) {
            c = new WeakReference<>(new u6t(context, 3600000, "hKey", new w6t(context, false)));
        }
        k(context, c.get(), k2t.d);
    }

    public static void q(Context context) {
        WeakReference<v6t> weakReference = d;
        if (weakReference == null || weakReference.get() == null) {
            d = new WeakReference<>(new u6t(context, 3600000, "gKey", new w6t(context, false)));
        }
        k(context, d.get(), k2t.f23370b);
    }
}
