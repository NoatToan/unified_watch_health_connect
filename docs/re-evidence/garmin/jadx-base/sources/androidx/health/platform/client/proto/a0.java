package androidx.health.platform.client.proto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a0 f7535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f7536c = new a0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, j0.e<?, ?>> f7537a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f7538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7539b;

        public a(Object obj, int i14) {
            this.f7538a = obj;
            this.f7539b = i14;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7538a == aVar.f7538a && this.f7539b == aVar.f7539b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f7538a) * 65535) + this.f7539b;
        }
    }

    public a0(a0 a0Var) {
        if (a0Var == f7536c) {
            this.f7537a = Collections.EMPTY_MAP;
        } else {
            this.f7537a = Collections.unmodifiableMap(a0Var.f7537a);
        }
    }

    public static a0 a() {
        a0 a0Var;
        r1 r1Var = r1.f7767c;
        a0 a0Var2 = f7535b;
        if (a0Var2 != null) {
            return a0Var2;
        }
        synchronized (a0.class) {
            try {
                a0Var = f7535b;
                if (a0Var == null) {
                    Class<?> cls = z.f7821a;
                    a0 a0Var3 = null;
                    if (cls != null) {
                        try {
                            a0Var3 = (a0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    a0Var = a0Var3 != null ? a0Var3 : f7536c;
                    f7535b = a0Var;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return a0Var;
    }

    public a0() {
        this.f7537a = new HashMap();
    }

    public a0(boolean z14) {
        this.f7537a = Collections.EMPTY_MAP;
    }
}
