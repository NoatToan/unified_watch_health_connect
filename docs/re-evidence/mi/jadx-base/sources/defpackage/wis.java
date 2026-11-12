package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class wis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static r2s f38016a;

    public static synchronized r2s a(Context context) {
        try {
            if (f38016a == null) {
                sfs sfsVar = new sfs(null);
                sfsVar.b(new act(i5s.a(context)));
                f38016a = sfsVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38016a;
    }
}
