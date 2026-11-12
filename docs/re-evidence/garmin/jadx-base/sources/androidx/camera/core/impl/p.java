package androidx.camera.core.impl;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f5679a;

    public p(Throwable th3) {
        if (th3 != null) {
            this.f5679a = th3;
        } else {
            j20.x.l("Null error");
            throw null;
        }
    }

    @Override // androidx.camera.core.impl.p2.a
    public final Throwable a() {
        return this.f5679a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p2.a) {
            return this.f5679a.equals(((p2.a) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f5679a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.f5679a + StringSubstitutor.DEFAULT_VAR_END;
    }
}
