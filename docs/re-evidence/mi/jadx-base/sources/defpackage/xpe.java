package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class xpe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f39333a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static dqe f39334b;

    public static dqe a() {
        return f39334b;
    }

    public static void b(Context context, dqe dqeVar) {
        f39334b = dqeVar;
        c(context);
    }

    public static void c(Context context) {
        dqe dqeVar = f39334b;
        boolean z = dqeVar != null;
        boolean z2 = f39333a;
        boolean z3 = true ^ z2;
        if (!(z2 ? false : z)) {
            dqeVar = null;
        }
        x9s.l(new bps(dqeVar, z3 ? dps.a(context) : null));
    }
}
