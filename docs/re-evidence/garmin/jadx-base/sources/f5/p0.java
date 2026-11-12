package f5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf5/p0;", "Lh5/c0;", "Lh4/r$c;", "Lkotlin/Function3;", "Lf5/b1;", "Lf5/y0;", "Lg6/a;", "Lf5/a1;", "measureBlock", "<init>", "(Le23/q;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.q<? super b1, ? super y0, ? super g6.a, ? extends a1> f69016a;

    public p0(e23.q<? super b1, ? super y0, ? super g6.a, ? extends a1> qVar) {
        this.f69016a = qVar;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final a1 mo5measure3p2s80s(b1 b1Var, y0 y0Var, long j8) {
        return this.f69016a.invoke(b1Var, y0Var, g6.a.a(j8));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f69016a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
