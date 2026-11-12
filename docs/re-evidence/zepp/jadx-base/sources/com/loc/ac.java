package com.loc;

import android.content.Context;
import android.os.Build;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ac {
    private static WeakReference<aw> a = null;
    private static boolean b = true;
    private static WeakReference<bp> c = null;
    private static WeakReference<bp> d = null;
    private static String[] e = new String[10];
    private static int f = 0;
    private static boolean g = false;
    private static int h;
    private static t i;

    private static t a(String str) {
        List<t> listA = z.a();
        if (listA == null) {
            listA = new ArrayList();
        }
        if (str != null && !"".equals(str)) {
            for (t tVar : listA) {
                if (z.a(tVar.f(), str)) {
                    return tVar;
                }
            }
            if (str.contains("com.amap.api.col")) {
                try {
                    return u.a();
                } catch (j e2) {
                    e2.printStackTrace();
                }
            }
            if (str.contains("com.amap.co") || str.contains("com.amap.opensdk.co") || str.contains("com.amap.location")) {
                try {
                    t tVarB = u.b();
                    tVarB.a(true);
                    return tVarB;
                } catch (j e3) {
                    e3.printStackTrace();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff A[RETURN] */
    private static String a(List<t> list) {
        ap apVar;
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
                    apVar = new ap(fileInputStream, ao.b);
                    boolean z = false;
                    while (true) {
                        try {
                            String strTrim = apVar.a().trim();
                            if (strTrim.contains(DTransferConstants.PID)) {
                                while (!strTrim.startsWith("\"main\"")) {
                                    strTrim = apVar.a();
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
                                    ab.b(th, "alg", "aDa");
                                }
                                int i3 = h;
                                if (i3 == 5) {
                                    break;
                                }
                                if (!g) {
                                    for (t tVar : list) {
                                        boolean zB = z.b(tVar.f(), strTrim);
                                        g = zB;
                                        if (zB) {
                                            i = tVar;
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
                                ab.b(th, "alg", "getA");
                                if (apVar != null) {
                                    try {
                                        apVar.close();
                                    } catch (Throwable th3) {
                                        ab.b(th3, "alg", "getA");
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
                                if (apVar != null) {
                                    try {
                                        apVar.close();
                                    } catch (Throwable th5) {
                                        ab.b(th5, "alg", "getA");
                                    }
                                }
                                if (fileInputStream == null) {
                                    throw th4;
                                }
                                try {
                                    fileInputStream.close();
                                    throw th4;
                                } catch (Throwable th6) {
                                    ab.b(th6, "alg", "getA");
                                    throw th4;
                                }
                            }
                        }
                    }
                    try {
                        apVar.close();
                    } catch (Throwable th7) {
                        ab.b(th7, "alg", "getA");
                    }
                    fileInputStream.close();
                } catch (FileNotFoundException unused3) {
                    apVar = null;
                } catch (Throwable th8) {
                    th = th8;
                    apVar = null;
                }
                if (g) {
                    return b();
                }
                return null;
            } catch (Throwable th9) {
                ab.b(th9, "alg", "getA");
            }
        } catch (FileNotFoundException unused4) {
            apVar = null;
            fileInputStream = null;
        } catch (Throwable th10) {
            th = th10;
            apVar = null;
            fileInputStream = null;
        }
        if (apVar != null) {
            try {
                apVar.close();
            } catch (Throwable th11) {
                ab.b(th11, "alg", "getA");
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

    public static void a(Context context) {
        String strA;
        t tVar;
        List<t> listA = z.a();
        if (listA == null || listA.size() == 0 || (strA = a(listA)) == null || "".equals(strA) || (tVar = i) == null) {
            return;
        }
        a(context, tVar, 2, "ANR", strA);
    }

    private static void a(final Context context, final bp bpVar, final String str) {
        ab.d().submit(new Runnable() { // from class: com.loc.ac.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    synchronized (ac.class) {
                        aw awVarA = bc.a(ac.a);
                        bc.a(context, awVarA, str, 1000, 40960, "1");
                        awVarA.f = bpVar;
                        if (awVarA.g == null) {
                            awVarA.g = new bg(new bf(context, new bk(), new aj(new al(new an())), "EImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMiLA=", k.f(context), n.w(context), k.c(context), Build.MODEL, k.b(context), k.d(context), Build.VERSION.RELEASE));
                        }
                        awVarA.h = 3600000;
                        ax.a(awVarA);
                    }
                } catch (Throwable th) {
                    ab.b(th, "lg", "pul");
                }
            }
        });
    }

    private static void a(Context context, t tVar, int i2, String str, String str2) {
        String str3;
        String strA = u.a(System.currentTimeMillis());
        String strA2 = bc.a(context, tVar);
        k.a(context);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strA2);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(strA);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(i2);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\"");
        String string = stringBuffer.toString();
        if (string == null || "".equals(string)) {
            return;
        }
        String strB = r.b(str2);
        if (i2 == 1) {
            str3 = z.b;
        } else if (i2 == 2) {
            str3 = z.d;
        } else if (i2 != 0) {
            return;
        } else {
            str3 = z.c;
        }
        String str4 = str3;
        aw awVarA = bc.a(a);
        bc.a(context, awVarA, str4, 1000, 40960, "1");
        if (awVarA.e == null) {
            awVarA.e = new ai(new aj(new al(new an())));
        }
        try {
            ax.a(strB, u.a(string.replaceAll("\n", "<br/>")), awVarA);
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, Throwable th, int i2, String str, String str2) {
        String strA = u.a(th);
        t tVarA = a(strA);
        if (a(tVarA)) {
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
            a(context, tVarA, i2, string, sb.toString());
        }
    }

    public static void a(t tVar, Context context, String str, String str2) {
        if (!a(tVar) || str == null || "".equals(str)) {
            return;
        }
        a(context, tVar, 1, str, str2);
    }

    private static boolean a(t tVar) {
        return tVar != null && tVar.e();
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
            ab.b(th, "alg", "gLI");
        }
        return sb.toString();
    }

    public static void b(Context context) {
        bn bnVar = new bn(b);
        b = false;
        a(context, bnVar, z.c);
    }

    public static void c(Context context) {
        WeakReference<bp> weakReference = c;
        if (weakReference == null || weakReference.get() == null) {
            c = new WeakReference<>(new bo(context, 3600000, "hKey", new bq(context)));
        }
        a(context, c.get(), z.d);
    }

    public static void d(Context context) {
        WeakReference<bp> weakReference = d;
        if (weakReference == null || weakReference.get() == null) {
            d = new WeakReference<>(new bo(context, 3600000, "gKey", new bq(context)));
        }
        a(context, d.get(), z.b);
    }
}
