package defpackage;

import android.content.Context;
import android.os.Process;
import com.xiaomi.push.g;

/* JADX INFO: loaded from: classes7.dex */
public class c14 {
    public static void a(Context context, lb4 lb4Var, lsc lscVar, svc svcVar) {
        x9s.B("init in  pid :" + Process.myPid() + " threadId: " + Thread.currentThread().getId());
        h3s.e(context).h(lb4Var, lscVar, svcVar);
        if (g.k(context)) {
            x9s.B("init in process\u3000start scheduleJob");
            h3s.e(context).g();
        }
    }

    public static void b(Context context, od8 od8Var) {
        if (od8Var != null) {
            h3s.e(context).i(od8Var);
        }
    }

    public static void c(Context context, rqh rqhVar) {
        if (rqhVar != null) {
            h3s.e(context).j(rqhVar);
        }
    }

    public static void d(Context context, lb4 lb4Var) {
        if (lb4Var == null) {
            return;
        }
        h3s.e(context).p(lb4Var.g(), lb4Var.h(), lb4Var.c(), lb4Var.e());
    }
}
