package androidx.camera.core.impl;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class l extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5590a;

    public l(Object obj) {
        if (obj != null) {
            this.f5590a = obj;
        } else {
            j20.x.l("Null value");
            throw null;
        }
    }

    @Override // androidx.camera.core.impl.j1
    public final Object a() {
        return this.f5590a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            return this.f5590a.equals(((j1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f5590a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return am.j.k(this.f5590a, StringSubstitutor.DEFAULT_VAR_END, new StringBuilder("Identifier{value="));
    }
}
