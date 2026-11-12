package m92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lm92/l0;", "", "Lm92/h0;", "chartPoint", "", "roundTop", "roundBottom", "<init>", "(Lm92/h0;ZZ)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f117398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f117399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f117400c;

    public /* synthetic */ l0(h0 h0Var, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(h0Var, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return p005kotlin.jvm.internal.s.g(this.f117398a, l0Var.f117398a) && this.f117399b == l0Var.f117399b && this.f117400c == l0Var.f117400c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f117400c) + q6.f.g(this.f117398a.hashCode() * 31, 31, this.f117399b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RoundBarConfig(chartPoint=");
        sb3.append(this.f117398a);
        sb3.append(", roundTop=");
        sb3.append(this.f117399b);
        sb3.append(", roundBottom=");
        return hb.a.k(sb3, this.f117400c, ")");
    }

    public l0(h0 h0Var, boolean z14, boolean z15) {
        h0Var.getClass();
        this.f117398a = h0Var;
        this.f117399b = z14;
        this.f117400c = z15;
    }
}
