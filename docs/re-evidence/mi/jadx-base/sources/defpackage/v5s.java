package defpackage;

import android.content.Context;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class v5s {
    public static Map<String, String> a(Context context, ix ixVar) {
        x9s.o("pepa listener or container is null");
        return null;
    }

    public static void b(Context context, ix ixVar) {
        x9s.o("handle msg wrong");
    }

    public static void c(Context context, ix ixVar, ja jaVar) {
        x9s.D("The Listener of EventProcessor must be set. Please check extension plugin initialization.");
    }

    public static void d(ix ixVar) {
        x9s.o("pepa clearMessage is null");
    }

    public static void e(String str) {
        x9s.o("pepa clearMessage is null");
    }

    public static boolean f(Context context, ix ixVar, boolean z) {
        x9s.o("pepa judement listener or container is null");
        return false;
    }

    public static boolean g(ix ixVar) {
        x9s.o("pepa handleReceiveMessage is null");
        return false;
    }
}
