package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Build;
import com.huawei.hms.network.embedded.u3;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<ld> f2925a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f2926b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static WeakReference<lx> f2927c = null;
    private static WeakReference<lx> d = null;
    private static String[] e = new String[10];
    private static int f = 0;
    private static boolean g = false;
    private static int h;
    private static ix i;

    public interface a {
        void a(int i);
    }

    private static boolean a(ix ixVar) {
        return ixVar != null && ixVar.e();
    }

    private static void a(Context context, ix ixVar, int i2, String str, String str2) {
        String str3;
        String strA = lk.a();
        String strA2 = lk.a(context, ixVar);
        il.a(context);
        String strA3 = lk.a(strA2, strA, i2, str, str2);
        if (strA3 == null || "".equals(strA3)) {
            return;
        }
        String strC = it.c(str2);
        if (i2 == 1) {
            str3 = jt.f2915b;
        } else if (i2 == 2) {
            str3 = jt.d;
        } else if (i2 != 0) {
            return;
        } else {
            str3 = jt.f2916c;
        }
        String str4 = str3;
        ld ldVarA = lk.a(f2925a);
        lk.a(context, ldVarA, str4, 1000, 4096000, "1");
        if (ldVarA.e == null) {
            ldVarA.e = new kk(new kl(new kn(new ko())));
        }
        try {
            le.a(strC, iy.a(strA3.replaceAll("\n", "<br/>")), ldVarA);
        } catch (Throwable unused) {
        }
    }

    static void a(Context context) {
        String strA;
        ix ixVar;
        List<ix> listA = jt.a();
        if (listA == null || listA.size() == 0 || (strA = a(listA)) == null || "".equals(strA) || (ixVar = i) == null) {
            return;
        }
        a(context, ixVar, 2, "ANR", strA);
    }

    public static void a(Context context, ix ixVar, String str, int i2, String str2, String str3) {
        if (str2 == null || "".equals(str2)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append("class:");
            sb.append(str2);
        }
        if (str3 != null) {
            sb.append(" method:");
            sb.append(str3);
            sb.append("$<br/>");
        }
        sb.append(str);
        a(context, ixVar, i2, str2, sb.toString());
    }

    public static void a(Context context, Throwable th, int i2, String str, String str2) {
        String strA = iy.a(th);
        ix ixVarA = a(strA);
        if (a(ixVarA)) {
            String strReplaceAll = strA.replaceAll("\n", "<br/>");
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
            a(context, ixVarA, i2, string, sb.toString());
        }
    }

    static void a(ix ixVar, Context context, String str, String str2) {
        if (!a(ixVar) || str == null || "".equals(str)) {
            return;
        }
        a(context, ixVar, 1, str, str2);
    }

    public static void a(final Context context, final ix ixVar, final String str, final ld ldVar, final String str2) {
        try {
            ma.a().a(new mb() { // from class: com.amap.api.col.3sl.jw.1
                @Override // com.amap.api.col.p0003sl.mb
                public final void runTask() {
                    String strA = jw.a(context, ixVar, str, str2);
                    if (ldVar.e == null) {
                        ldVar.e = new kk(new kl(new kn(new ko())));
                    }
                    try {
                        le.a(it.c(strA), iy.a(strA), ldVar);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    static void b(Context context) {
        lv lvVar = new lv(f2926b);
        f2926b = false;
        a(context, lvVar, jt.f2916c);
    }

    static void c(Context context) {
        WeakReference<lx> weakReference = f2927c;
        if (weakReference == null || weakReference.get() == null) {
            f2927c = new WeakReference<>(new lw(context, 3600000, "hKey", new ly(context, false)));
        }
        a(context, f2927c.get(), jt.d);
    }

    static void d(Context context) {
        WeakReference<lx> weakReference = d;
        if (weakReference == null || weakReference.get() == null) {
            d = new WeakReference<>(new lw(context, 3600000, "gKey", new ly(context, false)));
        }
        a(context, d.get(), jt.f2915b);
    }

    private static void a(final Context context, final lx lxVar, final String str) {
        ma.a().a(new mb() { // from class: com.amap.api.col.3sl.jw.2
            @Override // com.amap.api.col.p0003sl.mb
            public final void runTask() {
                try {
                    synchronized (jw.class) {
                        ld ldVarA = lk.a(jw.f2925a);
                        lk.a(context, ldVarA, str, 1000, 4096000, "1");
                        ldVarA.f = lxVar;
                        if (ldVarA.g == null) {
                            ldVarA.g = new lo(new ln(context, new ls(), new kl(new kn(new ko())), "QImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJhZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMi", il.f(context), ip.k(), ip.p(context), il.c(context), Build.MODEL, il.b(context), il.d(context), Build.VERSION.RELEASE));
                        }
                        ldVarA.h = 3600000;
                        le.a(ldVarA);
                    }
                } catch (Throwable th) {
                    jv.c(th, "lg", "pul");
                }
            }
        });
    }

    public static void a(final Context context, final ld ldVar, final a aVar) {
        try {
            ma.a().a(new mb() { // from class: com.amap.api.col.3sl.jw.3
                @Override // com.amap.api.col.p0003sl.mb
                public final void runTask() {
                    try {
                        synchronized (jw.class) {
                            if (ldVar.g == null) {
                                ldVar.g = new lo(new ln(context, new ls(), new kl(new kn(new ko())), "QImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJhZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMi", il.f(context), ip.k(), ip.p(context), il.c(context), Build.MODEL, il.b(context), il.d(context), Build.VERSION.RELEASE));
                            }
                            int iA = le.a(ldVar);
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.a(iA);
                            }
                        }
                    } catch (Throwable th) {
                        jv.c(th, "lg", "pul");
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static ix a(String str) {
        List<ix> listA = jt.a();
        if (listA == null) {
            listA = new ArrayList();
        }
        if (str == null || "".equals(str)) {
            return null;
        }
        for (ix ixVar : listA) {
            if (jt.a(ixVar.f(), str)) {
                return ixVar;
            }
        }
        if (str.contains("com.amap.api.col")) {
            try {
                return iy.a();
            } catch (ik e2) {
                e2.printStackTrace();
            }
        }
        if (!str.contains("com.amap.co") && !str.contains("com.amap.opensdk.co") && !str.contains("com.amap.location")) {
            return null;
        }
        try {
            ix ixVarB = iy.b();
            ixVarB.a(true);
            return ixVarB;
        } catch (ik e3) {
            e3.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x00c4 A[EXC_TOP_SPLITTER, PHI: r4
      0x00c4: PHI (r4v4 java.io.FileInputStream) = 
      (r4v2 java.io.FileInputStream)
      (r4v3 java.io.FileInputStream)
      (r4v7 java.io.FileInputStream)
      (r4v7 java.io.FileInputStream)
     binds: [B:60:0x00c2, B:81:0x00ea, B:48:0x00a9, B:45:0x00a4] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private static String a(List<ix> list) {
        kr krVar;
        FileInputStream fileInputStream;
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
                krVar = new kr(fileInputStream, kq.f2963b);
                boolean z = false;
                while (true) {
                    try {
                        String strTrim = krVar.a().trim();
                        if (strTrim.contains(u3.m)) {
                            while (!strTrim.startsWith("\"main\"")) {
                                strTrim = krVar.a();
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
                                jv.c(th, "alg", "aDa");
                            }
                            int i3 = h;
                            if (i3 == 5) {
                                break;
                            }
                            if (!g) {
                                for (ix ixVar : list) {
                                    boolean zB = jt.b(ixVar.f(), strTrim);
                                    g = zB;
                                    if (zB) {
                                        i = ixVar;
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
                            jv.c(th, "alg", "getA");
                            if (krVar != null) {
                                try {
                                    krVar.close();
                                } catch (Throwable th3) {
                                    jv.c(th3, "alg", "getA");
                                }
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (g) {
                                return b();
                            }
                            return null;
                        } catch (Throwable th4) {
                            if (krVar != null) {
                                try {
                                    krVar.close();
                                } catch (Throwable th5) {
                                    jv.c(th5, "alg", "getA");
                                }
                            }
                            if (fileInputStream == null) {
                                throw th4;
                            }
                            try {
                                fileInputStream.close();
                                throw th4;
                            } catch (Throwable th6) {
                                jv.c(th6, "alg", "getA");
                                throw th4;
                            }
                        }
                    }
                }
                try {
                    krVar.close();
                } catch (Throwable th7) {
                    jv.c(th7, "alg", "getA");
                }
            } catch (FileNotFoundException unused3) {
                krVar = null;
            } catch (Throwable th8) {
                th = th8;
                krVar = null;
            }
            try {
                fileInputStream.close();
            } catch (Throwable th9) {
                jv.c(th9, "alg", "getA");
            }
            if (g) {
                return b();
            }
            return null;
        } catch (FileNotFoundException unused4) {
            krVar = null;
            fileInputStream = null;
        } catch (Throwable th10) {
            th = th10;
            krVar = null;
            fileInputStream = null;
        }
        if (krVar != null) {
            try {
                krVar.close();
            } catch (Throwable th11) {
                jv.c(th11, "alg", "getA");
            }
        }
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        if (g) {
            return b();
        }
        return null;
    }

    private static String b() {
        StringBuilder sb = new StringBuilder();
        try {
            for (int i2 = f; i2 < 10 && i2 <= 9; i2++) {
                sb.append(e[i2]);
            }
            for (int i3 = 0; i3 < f; i3++) {
                sb.append(e[i3]);
            }
        } catch (Throwable th) {
            jv.c(th, "alg", "gLI");
        }
        return sb.toString();
    }

    static /* synthetic */ String a(Context context, ix ixVar, String str, String str2) {
        String strA = lk.a();
        String strA2 = lk.a(context, ixVar);
        il.a(context);
        return lk.a(strA2, strA, str, str2);
    }
}
