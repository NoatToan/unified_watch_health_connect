package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public class yk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40262b;

    public yk5(int i, int i2) {
        this.f40261a = i;
        this.f40262b = i2;
    }

    public final int a() {
        return this.f40262b;
    }

    public final int b() {
        return this.f40261a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yk5)) {
            return false;
        }
        yk5 yk5Var = (yk5) obj;
        return this.f40261a == yk5Var.f40261a && this.f40262b == yk5Var.f40262b;
    }

    public final int hashCode() {
        return this.f40261a ^ this.f40262b;
    }

    public final String toString() {
        return this.f40261a + "(" + this.f40262b + ')';
    }
}
