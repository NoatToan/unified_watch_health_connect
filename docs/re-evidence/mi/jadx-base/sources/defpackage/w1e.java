package defpackage;

import android.content.Context;
import androidx.annotation.RestrictTo;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class w1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f37439a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f37440b = false;
    public static boolean c = true;
    public static boolean d = true;
    public static String[] e;
    public static long[] f;
    public static int g;
    public static int h;
    public static qte i;
    public static pte j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile fkg f37441k;
    public static volatile vjg l;

    public class a implements pte {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f37442a;

        public a(Context context) {
            this.f37442a = context;
        }

        @Override // defpackage.pte
        public File a() {
            return new File(this.f37442a.getCacheDir(), "lottie_network_cache");
        }
    }

    public static void a(String str) {
        if (f37440b) {
            int i2 = g;
            if (i2 == 20) {
                h++;
                return;
            }
            e[i2] = str;
            f[i2] = System.nanoTime();
            ekp.a(str);
            g++;
        }
    }

    public static float b(String str) {
        int i2 = h;
        if (i2 > 0) {
            h = i2 - 1;
            return 0.0f;
        }
        if (!f37440b) {
            return 0.0f;
        }
        int i3 = g - 1;
        g = i3;
        if (i3 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(e[i3])) {
            ekp.b();
            return (System.nanoTime() - f[g]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + e[g] + ".");
    }

    public static boolean c() {
        return d;
    }

    public static vjg d(Context context) {
        if (!c) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        vjg vjgVar = l;
        if (vjgVar == null) {
            synchronized (vjg.class) {
                try {
                    vjgVar = l;
                    if (vjgVar == null) {
                        pte aVar = j;
                        if (aVar == null) {
                            aVar = new a(applicationContext);
                        }
                        vjgVar = new vjg(aVar);
                        l = vjgVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return vjgVar;
    }

    public static fkg e(Context context) {
        fkg fkgVar = f37441k;
        if (fkgVar == null) {
            synchronized (fkg.class) {
                try {
                    fkgVar = f37441k;
                    if (fkgVar == null) {
                        vjg vjgVarD = d(context);
                        qte aw5Var = i;
                        if (aw5Var == null) {
                            aw5Var = new aw5();
                        }
                        fkgVar = new fkg(vjgVarD, aw5Var);
                        f37441k = fkgVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fkgVar;
    }
}
