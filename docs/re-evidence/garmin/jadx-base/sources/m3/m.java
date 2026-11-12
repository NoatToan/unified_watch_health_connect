package m3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {384}, m = "animateToHidden")
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f116271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f116272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f116273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f116272b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f116271a = obj;
        this.f116273c |= Integer.MIN_VALUE;
        return this.f116272b.Y1(this);
    }
}
