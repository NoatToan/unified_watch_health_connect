package androidx.datastore.preferences.protobuf;

import defpackage.jk8;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f2224b = true;
    public static volatile l d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.e<?, ?>> f2225a;
    public static final Class<?> c = c();
    public static final l e = new l(true);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f2226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2227b;

        public a(Object obj, int i) {
            this.f2226a = obj;
            this.f2227b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2226a == aVar.f2226a && this.f2227b == aVar.f2227b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f2226a) * 65535) + this.f2227b;
        }
    }

    public l() {
        this.f2225a = new HashMap();
    }

    public static l b() {
        l lVarA = d;
        if (lVarA == null) {
            synchronized (l.class) {
                try {
                    lVarA = d;
                    if (lVarA == null) {
                        lVarA = f2224b ? jk8.a() : e;
                        d = lVarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lVarA;
    }

    public static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public <ContainingType extends b0> GeneratedMessageLite.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.e) this.f2225a.get(new a(containingtype, i));
    }

    public l(boolean z) {
        this.f2225a = Collections.emptyMap();
    }
}
