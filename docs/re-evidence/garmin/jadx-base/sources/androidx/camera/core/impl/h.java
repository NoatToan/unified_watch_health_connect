package androidx.camera.core.impl;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class h<T> extends x0.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<T> f5565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5566c;

    public h(String str, Class<T> cls, Object obj) {
        if (str == null) {
            j20.x.l("Null id");
            throw null;
        }
        this.f5564a = str;
        if (cls == null) {
            j20.x.l("Null valueClass");
            throw null;
        }
        this.f5565b = cls;
        this.f5566c = obj;
    }

    @Override // androidx.camera.core.impl.x0.a
    public final String b() {
        return this.f5564a;
    }

    @Override // androidx.camera.core.impl.x0.a
    public final Object c() {
        return this.f5566c;
    }

    @Override // androidx.camera.core.impl.x0.a
    public final Class<T> d() {
        return this.f5565b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0.a)) {
            return false;
        }
        x0.a aVar = (x0.a) obj;
        if (!this.f5564a.equals(aVar.b()) || !this.f5565b.equals(aVar.d())) {
            return false;
        }
        Object obj2 = this.f5566c;
        if (obj2 == null) {
            return aVar.c() == null;
        }
        return obj2.equals(aVar.c());
    }

    public final int hashCode() {
        int iHashCode = (((this.f5564a.hashCode() ^ 1000003) * 1000003) ^ this.f5565b.hashCode()) * 1000003;
        Object obj = this.f5566c;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Option{id=");
        sb3.append(this.f5564a);
        sb3.append(", valueClass=");
        sb3.append(this.f5565b);
        sb3.append(", token=");
        return am.j.k(this.f5566c, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
