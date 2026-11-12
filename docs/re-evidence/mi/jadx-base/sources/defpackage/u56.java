package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u56 {
    public static final u56 d = new u56(0, 0, 0);
    public static final j63<u56> e = new ph8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35394b;
    public final int c;

    public u56(int i, int i2, int i3) {
        this.f35393a = i;
        this.f35394b = i2;
        this.c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u56)) {
            return false;
        }
        u56 u56Var = (u56) obj;
        return this.f35393a == u56Var.f35393a && this.f35394b == u56Var.f35394b && this.c == u56Var.c;
    }

    public int hashCode() {
        return ((((527 + this.f35393a) * 31) + this.f35394b) * 31) + this.c;
    }
}
