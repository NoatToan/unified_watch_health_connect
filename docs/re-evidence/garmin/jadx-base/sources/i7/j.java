package i7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p1.c0;
import p1.k1;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0<String, Typeface> f91929a = new c0<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f91930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f91931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k1<String, ArrayList<k7.b<a>>> f91932d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f91930b = threadPoolExecutor;
        f91931c = new Object();
        f91932d = new k1<>();
    }

    private j() {
    }

    public static String a(int i14, List list) {
        StringBuilder sb3 = new StringBuilder();
        for (int i15 = 0; i15 < list.size(); i15++) {
            sb3.append(((e) list.get(i15)).f91918h);
            sb3.append("-");
            sb3.append(i14);
            if (i15 < list.size() - 1) {
                sb3.append(";");
            }
        }
        return sb3.toString();
    }

    public static a b(String str, Context context, List<e> list, int i14) {
        int i15;
        Typeface typefaceB;
        c0<String, Typeface> c0Var = f91929a;
        Trace.beginSection(ce.a.d("getFontSync"));
        try {
            Typeface typeface = c0Var.get(str);
            if (typeface != null) {
                a aVar = new a(typeface);
                Trace.endSection();
                return aVar;
            }
            try {
                k kVarA = d.a(context, list);
                List<l[]> list2 = kVarA.f91936b;
                int i16 = kVarA.f91935a;
                if (i16 == 0) {
                    l[] lVarArr = list2.get(0);
                    if (lVarArr == null || lVarArr.length == 0) {
                        i15 = 1;
                    } else {
                        int length = lVarArr.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length) {
                                i15 = 0;
                                break;
                            }
                            int i18 = lVarArr[i17].f91942f;
                            if (i18 != 0) {
                                if (i18 >= 0) {
                                    i15 = i18;
                                    break;
                                }
                                i15 = -3;
                                break;
                            }
                            i17++;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        i15 = -3;
                        break;
                    }
                    i15 = -2;
                }
                if (i15 != 0) {
                    a aVar2 = new a(i15);
                    Trace.endSection();
                    return aVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    l[] lVarArr2 = list2.get(0);
                    c7.n nVar = c7.h.f25197a;
                    Trace.beginSection(ce.a.d("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceB = c7.h.f25197a.b(context, lVarArr2, i14);
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } else {
                    c7.n nVar2 = c7.h.f25197a;
                    Trace.beginSection(ce.a.d("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceB = c7.h.f25197a.c(context, list2, i14);
                        Trace.endSection();
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
                if (typefaceB == null) {
                    a aVar3 = new a(-3);
                    Trace.endSection();
                    return aVar3;
                }
                c0Var.put(str, typefaceB);
                a aVar4 = new a(typefaceB);
                Trace.endSection();
                return aVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                a aVar5 = new a(-1);
                Trace.endSection();
                return aVar5;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f91933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f91934b;

        public a(int i14) {
            this.f91933a = null;
            this.f91934b = i14;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f91933a = typeface;
            this.f91934b = 0;
        }
    }
}
