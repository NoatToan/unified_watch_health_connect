package vy0;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvy0/x;", "", "Lvy0/g0;", "searchState", "", "isLoading", "isWheelchairModeEnabled", "Lvy0/q;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Lvy0/g0;ZZLvy0/q;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f180776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f180777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f180778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f180779d;

    public x(g0 g0Var, boolean z14, boolean z15, q qVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new g0(false, null, 3, null) : g0Var, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? new q.a(j0.f134944a) : qVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p005kotlin.jvm.internal.s.g(this.f180776a, xVar.f180776a) && this.f180777b == xVar.f180777b && this.f180778c == xVar.f180778c && p005kotlin.jvm.internal.s.g(this.f180779d, xVar.f180779d);
    }

    public final int hashCode() {
        return this.f180779d.hashCode() + q6.f.g(q6.f.g(this.f180776a.hashCode() * 31, 31, this.f180777b), 31, this.f180778c);
    }

    public final String toString() {
        return "MoreUiState(searchState=" + this.f180776a + ", isLoading=" + this.f180777b + ", isWheelchairModeEnabled=" + this.f180778c + ", items=" + this.f180779d + ")";
    }

    public x(g0 g0Var, boolean z14, boolean z15, q qVar) {
        g0Var.getClass();
        qVar.getClass();
        this.f180776a = g0Var;
        this.f180777b = z14;
        this.f180778c = z15;
        this.f180779d = qVar;
    }

    public x() {
        this(null, false, false, null, 15, null);
    }
}
