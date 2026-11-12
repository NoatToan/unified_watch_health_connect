package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ib;
import com.xiaomi.push.il;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class qbt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile qbt f31352b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31353a;

    public qbt(Context context) {
        this.f31353a = context.getApplicationContext();
    }

    public static qbt a(Context context) {
        if (f31352b == null) {
            synchronized (qbt.class) {
                try {
                    if (f31352b == null) {
                        f31352b = new qbt(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f31352b;
    }

    public static void b(Context context, ix ixVar) {
        a(context).d(ixVar, 0, true);
    }

    public static void c(Context context, ix ixVar, boolean z) {
        a(context).d(ixVar, 1, z);
    }

    public static void e(Context context, ix ixVar, boolean z) {
        a(context).d(ixVar, 2, z);
    }

    public static void f(Context context, ix ixVar, boolean z) {
        a(context).d(ixVar, 3, z);
    }

    public static void g(Context context, ix ixVar, boolean z) {
        a(context).d(ixVar, 4, z);
    }

    public static void h(Context context, ix ixVar, boolean z) {
        bas basVarC = bas.c(context);
        if (TextUtils.isEmpty(basVarC.q()) || TextUtils.isEmpty(basVarC.t())) {
            a(context).d(ixVar, 6, z);
        } else if (basVarC.y()) {
            a(context).d(ixVar, 7, z);
        } else {
            a(context).d(ixVar, 5, z);
        }
    }

    public final void d(ix ixVar, int i, boolean z) {
        if (y0t.j(this.f31353a) || !y0t.i() || ixVar == null || ixVar.f245a != ib.SendMessage || ixVar.m747a() == null || !z) {
            return;
        }
        x9s.o("click to start activity result:" + String.valueOf(i));
        ja jaVar = new ja(ixVar.m747a().m713a(), false);
        jaVar.c(il.SDK_START_ACTIVITY.f125a);
        jaVar.b(ixVar.m748a());
        jaVar.d(ixVar.f252b);
        HashMap map = new HashMap();
        jaVar.f264a = map;
        map.put("result", String.valueOf(i));
        d6s.c(this.f31353a).D(jaVar, ib.Notification, false, false, null, true, ixVar.f252b, ixVar.f248a, true, false);
    }
}
