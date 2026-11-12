package m4;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lm4/f;", "Lm4/k;", "Lh4/r$c;", "Lkotlin/Function1;", "Lm4/g0;", "", "onFocusChanged", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends h4.r.c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l<? super g0, Unit> f116463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0 f116464b;

    public f(e23.l<? super g0, Unit> lVar) {
        this.f116463a = lVar;
    }

    @Override // m4.k
    public final void u(g0 g0Var) {
        if (p005kotlin.jvm.internal.s.g(this.f116464b, g0Var)) {
            return;
        }
        this.f116464b = g0Var;
        this.f116463a.invoke(g0Var);
    }
}
