package r1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lr1/l2;", "", "Lkotlin/Function1;", "Lg6/m;", "Lg6/k;", "slideOffset", "Ls1/f0;", "animationSpec", "<init>", "(Le23/l;Ls1/f0;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<g6.m, g6.k> f149143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1.f0<g6.k> f149144b;

    /* JADX WARN: Multi-variable type inference failed */
    public l2(e23.l<? super g6.m, g6.k> lVar, s1.f0<g6.k> f0Var) {
        this.f149143a = lVar;
        this.f149144b = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return p005kotlin.jvm.internal.s.g(this.f149143a, l2Var.f149143a) && p005kotlin.jvm.internal.s.g(this.f149144b, l2Var.f149144b);
    }

    public final int hashCode() {
        return this.f149144b.hashCode() + (this.f149143a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f149143a + ", animationSpec=" + this.f149144b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
