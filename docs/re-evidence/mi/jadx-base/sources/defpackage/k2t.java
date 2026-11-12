package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.j1;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public final class k2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f23369a = "/a/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f23370b = "b";
    public static final String c = "c";
    public static final String d = "d";
    public static final String e = "e";
    public static final String f = "f";
    public static final String g = "j";
    public static final String h = "k";
    public static long i;
    public static Vector<o0t> j = new Vector<>();

    public class a extends f7t {
        public final /* synthetic */ Context d;

        public a(Context context) {
            this.d = context;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            try {
                o2t.o(this.d);
                o2t.q(this.d);
                o2t.p(this.d);
                g6t.b(this.d);
                e6t.d(this.d);
            } catch (RejectedExecutionException unused) {
            } catch (Throwable th) {
                m2t.r(th, "Lg", "proL");
            }
        }
    }

    public static String a(Context context, String str) {
        return context.getSharedPreferences("AMSKLG_CFG", 0).getString(str, "");
    }

    public static List<o0t> b() {
        Vector<o0t> vector;
        try {
            synchronized (Looper.getMainLooper()) {
                vector = j;
            }
            return vector;
        } catch (Throwable th) {
            th.printStackTrace();
            return j;
        }
    }

    public static void c(Context context) {
        try {
            if (System.currentTimeMillis() - i < 60000) {
                return;
            }
            i = System.currentTimeMillis();
            j1.h().b(new a(context));
        } catch (Throwable th) {
            m2t.r(th, "Lg", "proL");
        }
    }

    @TargetApi(9)
    public static void d(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public static void e(o0t o0tVar) {
        try {
            synchronized (Looper.getMainLooper()) {
                try {
                    if (o0tVar == null) {
                        return;
                    }
                    if (j.contains(o0tVar)) {
                        return;
                    }
                    j.add(o0tVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean f(String[] strArr, String str) {
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
                    if (h(strArr, str3.trim())) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public static void g(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("AMSKLG_CFG", 0).edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public static boolean h(String[] strArr, String str) {
        if (strArr != null && str != null) {
            try {
                for (String str2 : strArr) {
                    str = str.trim();
                    if (str.startsWith("at ")) {
                        if (str.contains(str2 + ".") && str.endsWith(")") && !str.contains("uncaughtException")) {
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

    public static String i(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + f23369a + str;
    }
}
