package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class dx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16022b;

    public int a() {
        return this.f16022b;
    }

    public int b() {
        return this.f16021a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof dx6) {
            dx6 dx6Var = (dx6) obj;
            if (this.f16021a == dx6Var.f16021a && this.f16022b == dx6Var.f16022b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f16021a * 32713) + this.f16022b;
    }

    public String toString() {
        return this.f16021a + "x" + this.f16022b;
    }
}
