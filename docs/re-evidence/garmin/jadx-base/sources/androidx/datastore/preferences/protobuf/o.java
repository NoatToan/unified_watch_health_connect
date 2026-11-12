package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile o f6794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f6795c = new o(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, x.e<?, ?>> f6796a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f6797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6798b;

        public a(Object obj, int i14) {
            this.f6797a = obj;
            this.f6798b = i14;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6797a == aVar.f6797a && this.f6798b == aVar.f6798b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f6797a) * 65535) + this.f6798b;
        }
    }

    public o(o oVar) {
        if (oVar == f6795c) {
            this.f6796a = Collections.EMPTY_MAP;
        } else {
            this.f6796a = Collections.unmodifiableMap(oVar.f6796a);
        }
    }

    public static o a() {
        o oVar;
        c1 c1Var = c1.f6688c;
        o oVar2 = f6794b;
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (o.class) {
            try {
                oVar = f6794b;
                if (oVar == null) {
                    Class<?> cls = n.f6785a;
                    o oVar3 = null;
                    if (cls != null) {
                        try {
                            oVar3 = (o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    oVar = oVar3 != null ? oVar3 : f6795c;
                    f6794b = oVar;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return oVar;
    }

    public o() {
        this.f6796a = new HashMap();
    }

    public o(boolean z14) {
        this.f6796a = Collections.EMPTY_MAP;
    }
}
