package com.amap.api.mapcore.util;

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

/* JADX INFO: loaded from: classes2.dex */
public class ho {
    private static WeakReference<iu> a = null;
    private static boolean b = true;
    private static WeakReference<jo> c = null;
    private static WeakReference<jo> d = null;
    private static String[] e = new String[10];
    private static int f = 0;
    private static boolean g = false;
    private static int h;
    private static gt i;

    public interface a {
        void a(int i);
    }

    public static void b(Context context) {
        jm jmVar = new jm(b);
        b = false;
        a(context, jmVar, hl.c);
    }

    public static void c(Context context) {
        WeakReference<jo> weakReference = c;
        if (weakReference == null || weakReference.get() == null) {
            c = new WeakReference<>(new jn(context, 3600000, "hKey", new jp(context, false)));
        }
        a(context, c.get(), hl.d);
    }

    public static void d(Context context) {
        WeakReference<jo> weakReference = d;
        if (weakReference == null || weakReference.get() == null) {
            d = new WeakReference<>(new jn(context, 3600000, "gKey", new jp(context, false)));
        }
        a(context, d.get(), hl.b);
    }

    private static boolean a(gt gtVar) {
        return gtVar != null && gtVar.f();
    }

    public static void a(Context context) {
        String strA;
        gt gtVar;
        List<gt> listA = hl.a();
        if (listA == null || listA.size() == 0 || (strA = a(listA)) == null || "".equals(strA) || (gtVar = i) == null) {
            return;
        }
        a(context, gtVar, 2, "ANR", strA);
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
            hn.c(th, "alg", "gLI");
        }
        return sb.toString();
    }

    public static void a(Context context, gt gtVar, String str, int i2, String str2, String str3) {
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
        a(context, gtVar, i2, str2, sb.toString());
    }

    public static void a(Context context, Throwable th, int i2, String str, String str2) {
        String strA = gu.a(th);
        gt gtVarA = a(strA);
        if (a(gtVarA)) {
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
            a(context, gtVarA, i2, string, sb.toString());
        }
    }

    public static void a(gt gtVar, Context context, String str, String str2) {
        if (!a(gtVar) || str == null || "".equals(str)) {
            return;
        }
        a(context, gtVar, 1, str, str2);
    }

    public static void a(final Context context, final gt gtVar, final String str, final iu iuVar, final String str2) {
        try {
            hn.d().execute(new Runnable() { // from class: com.amap.api.mapcore.util.ho.1
                @Override // java.lang.Runnable
                public final void run() {
                    String strA = ho.a(context, gtVar, str, str2);
                    iu iuVar2 = iuVar;
                    if (iuVar2.e == null) {
                        iuVar2.e = new ic(new id(new Cif(new ig())));
                    }
                    try {
                        iv.a(gr.c(strA), gu.a(strA), iuVar);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static void a(final Context context, final jo joVar, final String str) {
        hn.d().submit(new Runnable() { // from class: com.amap.api.mapcore.util.ho.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    synchronized (ho.class) {
                        iu iuVarA = jb.a(ho.a);
                        jb.a(context, iuVarA, str, 1000, 4096000, "1");
                        iuVarA.f = joVar;
                        if (iuVarA.g == null) {
                            iuVarA.g = new jf(new je(context, new jj(), new id(new Cif(new ig())), "QImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJhZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMi", gj.f(context), gn.u(context), gn.t(context), gj.c(context), Build.MODEL, gj.b(context), gj.d(context), Build.VERSION.RELEASE));
                        }
                        iuVarA.h = 3600000;
                        iv.a(iuVarA);
                    }
                } catch (Throwable th) {
                    hn.c(th, "lg", "pul");
                }
            }
        });
    }

    public static void a(final Context context, final iu iuVar, final a aVar) {
        try {
            hn.d().submit(new Runnable() { // from class: com.amap.api.mapcore.util.ho.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        synchronized (ho.class) {
                            iu iuVar2 = iuVar;
                            if (iuVar2.g == null) {
                                iuVar2.g = new jf(new je(context, new jj(), new id(new Cif(new ig())), "QImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJhZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMi", gj.f(context), gn.u(context), gn.t(context), gj.c(context), Build.MODEL, gj.b(context), gj.d(context), Build.VERSION.RELEASE));
                            }
                            int iA = iv.a(iuVar);
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.a(iA);
                            }
                        }
                    } catch (Throwable th) {
                        hn.c(th, "lg", "pul");
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static gt a(String str) {
        List<gt> listA = hl.a();
        if (listA == null) {
            listA = new ArrayList();
        }
        if (str != null && !"".equals(str)) {
            for (gt gtVar : listA) {
                if (hl.a(gtVar.g(), str)) {
                    return gtVar;
                }
            }
            if (str.contains("com.amap.api.col")) {
                try {
                    return gu.a();
                } catch (gi e2) {
                    e2.printStackTrace();
                }
            }
            if (str.contains("com.amap.co") || str.contains("com.amap.opensdk.co") || str.contains("com.amap.location")) {
                try {
                    gt gtVarB = gu.b();
                    gtVarB.a(true);
                    return gtVarB;
                } catch (gi e3) {
                    e3.printStackTrace();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101 A[RETURN] */
    private static String a(List<gt> list) {
        ii iiVar;
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
                    iiVar = new ii(fileInputStream, ih.b);
                    boolean z = false;
                    while (true) {
                        try {
                            String strTrim = iiVar.a().trim();
                            if (strTrim.contains(DTransferConstants.PID)) {
                                while (!strTrim.startsWith("\"main\"")) {
                                    strTrim = iiVar.a();
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
                                    hn.c(th, "alg", "aDa");
                                }
                                int i3 = h;
                                if (i3 == 5) {
                                    break;
                                }
                                if (!g) {
                                    for (gt gtVar : list) {
                                        boolean zB = hl.b(gtVar.g(), strTrim);
                                        g = zB;
                                        if (zB) {
                                            i = gtVar;
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
                                hn.c(th, "alg", "getA");
                                if (iiVar != null) {
                                    try {
                                        iiVar.close();
                                    } catch (Throwable th3) {
                                        hn.c(th3, "alg", "getA");
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
                                if (iiVar != null) {
                                    try {
                                        iiVar.close();
                                    } catch (Throwable th5) {
                                        hn.c(th5, "alg", "getA");
                                    }
                                }
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                        throw th4;
                                    } catch (Throwable th6) {
                                        hn.c(th6, "alg", "getA");
                                        throw th4;
                                    }
                                }
                                throw th4;
                            }
                        }
                    }
                    try {
                        iiVar.close();
                    } catch (Throwable th7) {
                        hn.c(th7, "alg", "getA");
                    }
                    fileInputStream.close();
                } catch (FileNotFoundException unused3) {
                    iiVar = null;
                } catch (Throwable th8) {
                    th = th8;
                    iiVar = null;
                }
                if (g) {
                    return b();
                }
                return null;
            } catch (Throwable th9) {
                hn.c(th9, "alg", "getA");
            }
        } catch (FileNotFoundException unused4) {
            iiVar = null;
            fileInputStream = null;
        } catch (Throwable th10) {
            th = th10;
            iiVar = null;
            fileInputStream = null;
        }
        if (iiVar != null) {
            try {
                iiVar.close();
            } catch (Throwable th11) {
                hn.c(th11, "alg", "getA");
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

    private static void a(Context context, gt gtVar, int i2, String str, String str2) {
        String str3;
        String strA = gu.a(System.currentTimeMillis());
        String strA2 = jb.a(context, gtVar);
        gj.a(context);
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
        String strC = gr.c(str2);
        if (i2 == 1) {
            str3 = hl.b;
        } else if (i2 == 2) {
            str3 = hl.d;
        } else if (i2 != 0) {
            return;
        } else {
            str3 = hl.c;
        }
        String str4 = str3;
        iu iuVarA = jb.a(a);
        jb.a(context, iuVarA, str4, 1000, 4096000, "1");
        if (iuVarA.e == null) {
            iuVarA.e = new ic(new id(new Cif(new ig())));
        }
        try {
            iv.a(strC, gu.a(string.replaceAll("\n", "<br/>")), iuVarA);
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ String a(Context context, gt gtVar, String str, String str2) {
        String strA = gu.a(System.currentTimeMillis());
        String strA2 = jb.a(context, gtVar);
        gj.a(context);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strA2);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(strA);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(1);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }
}
