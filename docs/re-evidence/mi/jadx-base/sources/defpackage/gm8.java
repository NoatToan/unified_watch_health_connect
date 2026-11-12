package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.mipush.sdk.d;

/* JADX INFO: loaded from: classes11.dex */
public class gm8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f19127a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f19128b = false;

    public static void a(Context context) {
        m10 m10VarC = pns.e(context).c(d.ASSEMBLE_PUSH_FTOS);
        if (m10VarC != null) {
            x9s.o("ASSEMBLE_PUSH :  register fun touch os when network change!");
            m10VarC.a();
        }
    }

    public static void b(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c()) {
            long j = f19127a;
            if (j <= 0 || j + 300000 <= jElapsedRealtime) {
                f19127a = jElapsedRealtime;
                a(context);
            }
        }
    }

    public static boolean c() {
        return f19128b;
    }
}
