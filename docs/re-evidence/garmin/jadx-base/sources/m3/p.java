package m3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", l = {345}, m = "onRelease")
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f116292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f116293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f116294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f116294c = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f116293b = obj;
        this.f116295d |= Integer.MIN_VALUE;
        return this.f116294c.b2(0.0f, this);
    }
}
