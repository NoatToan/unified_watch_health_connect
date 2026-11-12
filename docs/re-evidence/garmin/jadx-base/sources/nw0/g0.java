package nw0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnw0/g0;", "", "Lnw0/f0;", "loadState", "Lnw0/i0;", "saveState", "<init>", "(Lnw0/f0;Lnw0/i0;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f128037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f128038b;

    public /* synthetic */ g0(f0 f0Var, i0 i0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? f0.c.f128024a : f0Var, (i14 & 2) != 0 ? null : i0Var);
    }

    public static g0 a(g0 g0Var, f0 f0Var, i0 i0Var, int i14) {
        if ((i14 & 1) != 0) {
            f0Var = g0Var.f128037a;
        }
        if ((i14 & 2) != 0) {
            i0Var = g0Var.f128038b;
        }
        g0Var.getClass();
        f0Var.getClass();
        return new g0(f0Var, i0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return p005kotlin.jvm.internal.s.g(this.f128037a, g0Var.f128037a) && p005kotlin.jvm.internal.s.g(this.f128038b, g0Var.f128038b);
    }

    public final int hashCode() {
        int iHashCode = this.f128037a.hashCode() * 31;
        i0 i0Var = this.f128038b;
        return iHashCode + (i0Var == null ? 0 : i0Var.hashCode());
    }

    public final String toString() {
        return "RemindersUiState(loadState=" + this.f128037a + ", saveState=" + this.f128038b + ")";
    }

    public g0(f0 f0Var, i0 i0Var) {
        f0Var.getClass();
        this.f128037a = f0Var;
        this.f128038b = i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
