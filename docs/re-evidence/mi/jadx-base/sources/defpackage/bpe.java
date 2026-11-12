package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class bpe {
    public static volatile bpe c;
    public static boolean d;
    public static String e;
    public static String f;
    public static Context g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoe f4453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<dpe> f4454b;

    public class a extends xoe {
        public final /* synthetic */ String c;

        public a(String str) {
            this.c = str;
        }

        @Override // defpackage.xoe
        public boolean a() {
            return bpe.d;
        }

        @Override // defpackage.xoe
        public String c() {
            if (TextUtils.isEmpty(this.c)) {
                return super.c();
            }
            return super.c() + this.c + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR;
        }

        @Override // defpackage.xoe
        public int f() {
            return 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f4456b;
        public boolean c = false;
        public boolean d = false;
        public String e = "";
        public String f = "/debug_log/";
        public long g = 172800000;

        public b(String str, Context context) {
            Objects.requireNonNull(str);
            this.f4455a = str;
            this.f4456b = context;
        }

        public bpe a() {
            bpe.j(this.f4455a, this.c, this.d, this.f4456b, this.e, this.f, this.g);
            return bpe.c;
        }

        public void b(boolean z) {
            this.d = z;
        }

        public void c(boolean z) {
            this.c = z;
        }

        public void d(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.e = str;
        }

        public void e(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f = str;
        }

        public void f(long j) {
            if (j > 0) {
                this.g = j;
            }
        }
    }

    public bpe(xoe xoeVar, List<dpe> list) {
        ArrayList arrayList = new ArrayList();
        this.f4454b = arrayList;
        this.f4453a = xoeVar;
        arrayList.addAll(list);
    }

    public static boolean d() {
        return ni4.a(g, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static String e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            upe.c("LogManager", "Fail to getApplicationCacheLogDir");
            return null;
        }
        return cacheDir.getPath() + f;
    }

    public static boolean g() {
        return d;
    }

    public static bpe h() {
        return c;
    }

    public static void j(String str, boolean z, boolean z2, Context context, String str2, String str3, long j) {
        if (c != null) {
            return;
        }
        upe.g("LogManager", "log init enableFileLog=" + z + ", debugMode=" + z2 + ",version=1.0.16");
        g = context;
        e = str2;
        f = str3;
        l(z2);
        a aVar = new a(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new if4());
        if (d || z) {
            String strE = e(g);
            if (!TextUtils.isEmpty(strE)) {
                arrayList.add(xl9.h(strE, j, e));
            }
        }
        c = new bpe(aVar, arrayList);
    }

    public static boolean k() {
        return c != null;
    }

    public static void l(boolean z) {
        if (!d()) {
            upe.g("LogManager", "Fail to get storage permission");
            d = z;
            return;
        }
        try {
            if (new File(g.getExternalCacheDir(), "circulate_debug.txt").exists()) {
                d = true;
                return;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        d = z;
    }

    public xoe f() {
        return this.f4453a;
    }

    public List<dpe> i() {
        return this.f4454b;
    }
}
