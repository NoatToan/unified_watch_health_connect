package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tte<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f35021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f35022b;

    public tte(V v) {
        this.f35021a = v;
        this.f35022b = null;
    }

    public Throwable a() {
        return this.f35022b;
    }

    public V b() {
        return this.f35021a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tte)) {
            return false;
        }
        tte tteVar = (tte) obj;
        if (b() != null && b().equals(tteVar.b())) {
            return true;
        }
        if (a() == null || tteVar.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public tte(Throwable th) {
        this.f35022b = th;
        this.f35021a = null;
    }
}
