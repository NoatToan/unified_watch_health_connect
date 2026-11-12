package k9;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f103417a;

    public f(Object obj) {
        this.f103417a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f103417a.equals((f) obj);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f103417a);
    }

    public final String toString() {
        return String.valueOf(this.f103417a);
    }
}
