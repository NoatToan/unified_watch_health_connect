package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xs1 extends g2d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39402a;

    public xs1(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f39402a = obj;
    }

    @Override // defpackage.g2d
    public Object b() {
        return this.f39402a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2d) {
            return this.f39402a.equals(((g2d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f39402a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f39402a + "}";
    }
}
