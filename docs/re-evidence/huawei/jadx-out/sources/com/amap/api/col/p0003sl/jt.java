package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.operation.utils.Constants;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class jt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2914a = "/a/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f2915b = "b";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f2916c = "c";
    static final String d = "d";
    public static String e = "s";
    public static final String f = "g";
    public static final String g = "h";
    public static final String h = "e";
    public static final String i = "f";
    public static final String j = "j";
    public static final String k = "k";
    private static long l;
    private static Vector<ix> m = new Vector<>();

    public static String a(Context context, String str) {
        return context.getSharedPreferences("AMSKLG_CFG", 0).getString(str, "");
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void b(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public static String c(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + f2914a + str;
    }

    public static void a(final Context context) {
        try {
            if (System.currentTimeMillis() - l < 60000) {
                return;
            }
            l = System.currentTimeMillis();
            ma.a().a(new mb() { // from class: com.amap.api.col.3sl.jt.1
                @Override // com.amap.api.col.p0003sl.mb
                public final void runTask() {
                    try {
                        jw.b(context);
                        jw.d(context);
                        jw.c(context);
                        lj.a(context);
                        lh.a(context);
                    } catch (RejectedExecutionException unused) {
                    } catch (Throwable th) {
                        jv.c(th, "Lg", "proL");
                    }
                }
            });
        } catch (Throwable th) {
            jv.c(th, "Lg", "proL");
        }
    }

    public static void a(ix ixVar) {
        try {
            synchronized (Looper.getMainLooper()) {
                try {
                    if (ixVar == null) {
                        return;
                    }
                    if (m.contains(ixVar)) {
                        return;
                    }
                    m.add(ixVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
    }

    static List<ix> a() {
        Vector<ix> vector;
        try {
            synchronized (Looper.getMainLooper()) {
                vector = m;
            }
            return vector;
        } catch (Throwable th) {
            th.printStackTrace();
            return m;
        }
    }

    static boolean a(String[] strArr, String str) {
        if (strArr != null && str != null) {
            try {
                String[] strArrSplit = str.split("\n");
                for (String str2 : strArrSplit) {
                    String strTrim = str2.trim();
                    if (!TextUtils.isEmpty(strTrim) && strTrim.startsWith("at ") && strTrim.contains("uncaughtException")) {
                        return false;
                    }
                }
                for (String str3 : strArrSplit) {
                    if (b(strArr, str3.trim())) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    static boolean b(String[] strArr, String str) {
        if (strArr != null && str != null) {
            try {
                for (String str2 : strArr) {
                    str = str.trim();
                    if (str.startsWith("at ")) {
                        if (str.contains(str2 + ".") && str.endsWith(Constants.RIGHT_BRACKET_ONLY) && !str.contains("uncaughtException")) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }
}
