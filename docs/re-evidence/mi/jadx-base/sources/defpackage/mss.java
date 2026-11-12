package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.push.Cif;
import com.xiaomi.push.fm;
import com.xiaomi.push.ib;
import com.xiaomi.push.ig;
import com.xiaomi.push.il;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class mss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f27168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map<String, il> f27169b;

    public interface a {
        void a(Context context, Cif cif);
    }

    public static int a(int i) {
        if (i > 0) {
            return i + 1000;
        }
        return -1;
    }

    public static int b(Enum r1) {
        if (r1 != null) {
            if (r1 instanceof ib) {
                return r1.ordinal() + 1001;
            }
            if (r1 instanceof il) {
                return r1.ordinal() + 2001;
            }
            if (r1 instanceof fm) {
                return r1.ordinal() + 3001;
            }
        }
        return -1;
    }

    public static lb4 c(Context context) {
        boolean zM = vas.d(context).m(ig.PerfUploadSwitch.a(), false);
        boolean zM2 = vas.d(context).m(ig.EventUploadNewSwitch.a(), false);
        return lb4.b().l(zM2).k(vas.d(context).a(ig.EventUploadFrequency.a(), RepositoryManager.GAP_A_DAY)).o(zM).n(vas.d(context).a(ig.PerfUploadFrequency.a(), RepositoryManager.GAP_A_DAY)).h(context);
    }

    public static od8 d(Context context, String str, String str2, int i, long j, String str3) {
        od8 od8VarE = e(str);
        od8VarE.h = str2;
        od8VarE.i = i;
        od8VarE.j = j;
        od8VarE.f29032k = str3;
        return od8VarE;
    }

    public static od8 e(String str) {
        od8 od8Var = new od8();
        od8Var.f18566a = 1000;
        od8Var.c = 1001;
        od8Var.f18567b = str;
        return od8Var;
    }

    public static rqh f() {
        rqh rqhVar = new rqh();
        rqhVar.f18566a = 1000;
        rqhVar.c = 1000;
        rqhVar.f18567b = "P100000";
        return rqhVar;
    }

    public static rqh g(Context context, int i, long j, long j2) {
        rqh rqhVarF = f();
        rqhVarF.h = i;
        rqhVarF.i = j;
        rqhVarF.j = j2;
        return rqhVarF;
    }

    public static Cif h(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Cif cif = new Cif();
        cif.d("category_client_report_data");
        cif.a("push_sdk_channel");
        cif.a(1L);
        cif.b(str);
        cif.a(true);
        cif.b(System.currentTimeMillis());
        cif.g(context.getPackageName());
        cif.e("com.xiaomi.xmsf");
        cif.f(jfs.b());
        cif.c("quality_support");
        return cif;
    }

    public static il i(String str) {
        if (f27169b == null) {
            synchronized (il.class) {
                try {
                    if (f27169b == null) {
                        f27169b = new HashMap();
                        for (il ilVar : il.values()) {
                            f27169b.put(ilVar.f125a.toLowerCase(), ilVar);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        il ilVar2 = f27169b.get(str.toLowerCase());
        return ilVar2 != null ? ilVar2 : il.Invalid;
    }

    public static String j(int i) {
        if (i == 1000) {
            return "E100000";
        }
        if (i == 3000) {
            return "E100002";
        }
        if (i == 2000) {
            return "E100001";
        }
        return i == 6000 ? "E100003" : "";
    }

    public static void k(Context context) {
        c14.d(context, c(context));
    }

    public static void l(Context context, lb4 lb4Var) {
        c14.a(context, lb4Var, new qqs(context), new kss(context));
    }

    public static void m(Context context, Cif cif) {
        if (p(context.getApplicationContext())) {
            nfs.a(context.getApplicationContext(), cif);
            return;
        }
        a aVar = f27168a;
        if (aVar != null) {
            aVar.a(context, cif);
        }
    }

    public static void n(Context context, List<String> list) {
        if (list == null) {
            return;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                Cif cifH = h(context, it.next());
                if (!jfs.e(cifH, false)) {
                    m(context, cifH);
                }
            }
        } catch (Throwable th) {
            x9s.D(th.getMessage());
        }
    }

    public static void o(a aVar) {
        f27168a = aVar;
    }

    public static boolean p(Context context) {
        return (context == null || TextUtils.isEmpty(context.getPackageName()) || !"com.xiaomi.xmsf".equals(context.getPackageName())) ? false : true;
    }
}
