package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.mipush.sdk.d;

/* JADX INFO: loaded from: classes11.dex */
public class y83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f39916a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f39917b;

    public static void a(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (b()) {
            long j = f39917b;
            if (j <= 0 || j + 300000 <= jElapsedRealtime) {
                f39917b = jElapsedRealtime;
                c(context);
            }
        }
    }

    public static boolean b() {
        return f39916a;
    }

    public static void c(Context context) {
        m10 m10VarC = pns.e(context).c(d.ASSEMBLE_PUSH_COS);
        if (m10VarC != null) {
            x9s.o("ASSEMBLE_PUSH :  register cos when network change!");
            m10VarC.a();
        }
    }
}
