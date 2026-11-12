package h2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {663, 670}, m = "animateScrollToPage", v = 1)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1.k f80962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f80963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f80964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80965e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var, t13.d<? super k0> dVar) {
        super(dVar);
        this.f80964d = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f80963c = obj;
        this.f80965e |= Integer.MIN_VALUE;
        return this.f80964d.f(0, null, this);
    }
}
