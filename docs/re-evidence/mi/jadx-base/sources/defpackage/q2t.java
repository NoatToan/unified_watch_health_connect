package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class q2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0t f31031a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Map<String, q2t> f31032a = new HashMap();
    }

    public q2t(o0t o0tVar) {
        this.f31031a = o0tVar;
    }

    public static q2t a(o0t o0tVar) {
        if (a.f31032a.get(o0tVar.a()) == null) {
            a.f31032a.put(o0tVar.a(), new q2t(o0tVar));
        }
        return a.f31032a.get(o0tVar.a());
    }

    public final void b(Context context, boolean z, boolean z2) {
        l3t.b(context, this.f31031a, "sckey", String.valueOf(z));
        if (z) {
            l3t.b(context, this.f31031a, "scisf", String.valueOf(z2));
        }
    }

    public final boolean c(Context context) {
        try {
            return Boolean.parseBoolean(l3t.a(context, this.f31031a, "sckey"));
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean d(Context context) {
        try {
            return Boolean.parseBoolean(l3t.a(context, this.f31031a, "scisf"));
        } catch (Throwable unused) {
            return true;
        }
    }
}
