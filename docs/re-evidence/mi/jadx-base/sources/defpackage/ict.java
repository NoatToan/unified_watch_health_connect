package defpackage;

import android.content.Context;
import com.xiaomi.hm.health.bt.ISBEListener;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class ict {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ISBEListener f21008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Set<qd> f21009b;

    public static synchronized ISBEListener a() {
        return f21008a;
    }

    public static void b(Context context, boolean z, String str, w0 w0Var) {
        o2.a(context.getApplicationContext());
        h3t.x(context);
        tl.b(z);
        t5t.k(z, true, str);
        op.a(w0Var);
    }

    public static synchronized void c(ISBEListener iSBEListener) {
        f21008a = iSBEListener;
    }

    public static void d(Set<qd> set) {
        f21009b = set;
    }

    public static void e(lh lhVar) {
        op.a(lhVar);
    }

    public static Set<qd> f() {
        return f21009b;
    }
}
