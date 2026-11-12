package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public final class ee<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f32829a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V f32830c;

    public ee(V v) {
        this.f32830c = v;
        this.f32829a = null;
    }

    public ee(Throwable th) {
        this.f32829a = th;
        this.f32830c = null;
    }

    public V c() {
        return this.f32830c;
    }

    public Throwable d() {
        return this.f32829a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee)) {
            return false;
        }
        ee eeVar = (ee) obj;
        if (c() != null && c().equals(eeVar.c())) {
            return true;
        }
        if (d() == null || eeVar.d() == null) {
            return false;
        }
        return d().toString().equals(d().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{c(), d()});
    }
}
